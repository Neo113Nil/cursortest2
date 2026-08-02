package ru.CryptoPro.JCPRequest.cert;

import com.objsys.asn1j.runtime.Asn1BMPString;
import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1CharString;
import com.objsys.asn1j.runtime.Asn1DerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1OpenType;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.Asn1UTF8String;
import com.objsys.asn1j.runtime.Asn1VisibleString;
import java.io.IOException;
import java.security.cert.X509Certificate;
import java.util.ResourceBundle;
import java.util.Vector;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.CertificatePoliciesSyntax;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.PolicyInformation;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.PolicyInformation_policyQualifiers;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.PolicyQualifierInfo;
import ru.CryptoPro.JCP.ASN.ETS_ElectronicSignatureFormats_97Syntax.DisplayText;
import ru.CryptoPro.JCP.ASN.ETS_ElectronicSignatureFormats_97Syntax.SPUserNotice;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.params.OIDName;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.CertReader.ExtensionProcessor;

/* loaded from: classes4.dex */
public class CertificatePoliciesProcessor extends JCPRequestExtensionProcessor {
    public static String a(DisplayText displayText) {
        Asn1CharString asn1CharString;
        if ("utf8String".equals(displayText.getElemName())) {
            asn1CharString = (Asn1UTF8String) displayText.getElement();
        } else if ("visibleString".equals(displayText.getElemName())) {
            asn1CharString = (Asn1VisibleString) displayText.getElement();
        } else {
            if (!"bmpString".equals(displayText.getElemName())) {
                return "UNDEFINED";
            }
            asn1CharString = (Asn1BMPString) displayText.getElement();
        }
        return asn1CharString.value;
    }

    public static Vector b(PolicyQualifierInfo policyQualifierInfo) {
        Extension extension;
        int i = 0;
        Vector vector = new Vector(0);
        Asn1ObjectIdentifier asn1ObjectIdentifier = policyQualifierInfo.policyQualifierId;
        if (asn1ObjectIdentifier != null) {
            OID oid = new OID(asn1ObjectIdentifier.value);
            ResourceBundle resourceBundle = JCPRequestExtensionProcessor.b;
            vector.add(new Extension(resourceBundle.getString("CertificatePoliciesProcessor.qualifierID"), new Extension(OIDName.getName(oid)), 54));
            if (oid.toString().equals("1.3.6.1.5.5.7.2.1")) {
                Asn1Type asn1Type = policyQualifierInfo.qualifier;
                if (asn1Type != null) {
                    vector.add(new Extension(resourceBundle.getString("CertificatePoliciesProcessor.qualifier"), new Extension(new String(((Asn1OpenType) asn1Type).value)), 54));
                    return vector;
                }
                if (oid.toString().equals("1.3.6.1.5.5.7.2.2")) {
                    Asn1Type asn1Type2 = policyQualifierInfo.qualifier;
                    if (asn1Type2 != null) {
                        try {
                            Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(((Asn1OpenType) asn1Type2).value);
                            SPUserNotice sPUserNotice = new SPUserNotice();
                            sPUserNotice.decode(asn1BerDecodeBuffer);
                            Vector vector2 = new Vector(0);
                            if (sPUserNotice.explicitText != null) {
                                vector2.add(new Extension(resourceBundle.getString("CertificatePoliciesProcessor.text"), new Extension(a(sPUserNotice.explicitText)), 54));
                            }
                            if (sPUserNotice.noticeRef != null) {
                                Vector vector3 = new Vector(0);
                                if (sPUserNotice.noticeRef.organization != null) {
                                    vector3.add(new Extension(resourceBundle.getString("CertificatePoliciesProcessor.organization"), new Extension(sPUserNotice.noticeRef.organization.toString()), 54));
                                }
                                if (sPUserNotice.noticeRef.noticeNumbers != null) {
                                    String str = "";
                                    while (true) {
                                        Asn1Integer[] asn1IntegerArr = sPUserNotice.noticeRef.noticeNumbers.elements;
                                        if (i >= asn1IntegerArr.length) {
                                            break;
                                        }
                                        str = Extension.addSpacePost(str.concat(asn1IntegerArr[i].toString()));
                                        i++;
                                    }
                                    vector3.add(new Extension(resourceBundle.getString("CertificatePoliciesProcessor.noticeNumbers"), new Extension(str), 54));
                                }
                                vector2.add(new Extension(resourceBundle.getString("CertificatePoliciesProcessor.parameters"), vector3, 22));
                            }
                            vector.add(new Extension(resourceBundle.getString("CertificatePoliciesProcessor.qualifier"), vector2, 22));
                            return vector;
                        } catch (Asn1Exception unused) {
                            extension = new Extension(ExtensionProcessor.getErrorParamMessage());
                            vector.add(extension);
                            return vector;
                        } catch (IOException unused2) {
                            extension = new Extension(ExtensionProcessor.getErrorParamMessage());
                            vector.add(extension);
                            return vector;
                        }
                    }
                    if (asn1Type2 != null) {
                        vector.add(new Extension(resourceBundle.getString("CertificatePoliciesProcessor.qualifier"), new Extension(Array.toHexLowString(((Asn1OpenType) policyQualifierInfo.qualifier).value)), 22));
                    }
                }
            }
        }
        return vector;
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.ExtensionProcessor
    public final Extension getExtension(X509Certificate x509Certificate) {
        ResourceBundle resourceBundle = JCPRequestExtensionProcessor.b;
        Asn1DerDecodeBuffer asn1DerDecodeBuffer = new Asn1DerDecodeBuffer(x509Certificate.getExtensionValue("2.5.29.32"));
        Asn1OctetString asn1OctetString = new Asn1OctetString();
        CertificatePoliciesSyntax certificatePoliciesSyntax = new CertificatePoliciesSyntax();
        try {
            Vector vector = new Vector(0);
            asn1OctetString.decode(asn1DerDecodeBuffer);
            certificatePoliciesSyntax.decode(new Asn1DerDecodeBuffer(asn1OctetString.value));
            for (int i = 0; i < certificatePoliciesSyntax.elements.length; i++) {
                Vector vector2 = new Vector(0);
                PolicyInformation policyInformation = certificatePoliciesSyntax.elements[i];
                vector2.add(new Extension(resourceBundle.getString("CertificatePoliciesProcessor.policyIdentifier"), new Extension(new OID(policyInformation.policyIdentifier.value).toString()), 54));
                PolicyInformation_policyQualifiers policyInformation_policyQualifiers = policyInformation.policyQualifiers;
                PolicyQualifierInfo[] policyQualifierInfoArr = policyInformation_policyQualifiers != null ? policyInformation_policyQualifiers.elements : null;
                if (policyQualifierInfoArr != null) {
                    Vector vector3 = new Vector(0);
                    for (int i2 = 0; i2 < policyQualifierInfoArr.length; i2++) {
                        vector3.add(new Extension("[".concat(Integer.toString(i)).concat(",").concat(Integer.toString(i2)).concat("] ").concat(resourceBundle.getString("CertificatePoliciesProcessor.qualifierName")), b(policyQualifierInfoArr[i2]), 22));
                    }
                    vector2.add(new Extension(resourceBundle.getString("CertificatePoliciesProcessor.qualifiers"), vector3, 22));
                }
                vector.add(new Extension("[".concat(Integer.toString(i)).concat("] ").concat(resourceBundle.getString("CertificatePoliciesProcessor.policy")), vector2, 22));
            }
            return new Extension(getName(), vector);
        } catch (Asn1Exception unused) {
            return new Extension(getName(), new Extension(ExtensionProcessor.getErrorParamMessage()));
        } catch (IOException unused2) {
            return new Extension(getName(), new Extension(ExtensionProcessor.getErrorParamMessage()));
        } catch (ClassCastException unused3) {
            return new Extension(getName(), new Extension(ExtensionProcessor.getErrorParamMessage()));
        }
    }

    @Override // ru.CryptoPro.JCP.tools.CertReader.ExtensionProcessor
    public final String getOID() {
        return "2.5.29.32";
    }
}
