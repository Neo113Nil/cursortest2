package ru.CryptoPro.JCPRequest.cert;

import com.objsys.asn1j.runtime.Asn18BitCharString;
import com.objsys.asn1j.runtime.Asn1BMPString;
import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1CharString;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1IA5String;
import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1OpenType;
import com.objsys.asn1j.runtime.Asn1PrintableString;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1UTF8String;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Vector;
import javax.security.auth.x500.X500Principal;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.EDIPartyName;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.EDIPartyName_partyName;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.GeneralName;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.GeneralName_otherName;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.GeneralNames;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.BuiltInStandardAttributes;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Name;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.ORAddress;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.PersonalName;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.params.OIDName;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.CertReader.ExtensionProcessor;
import ru.CryptoPro.JCP.tools.CertReader.SplitDirectName;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class GeneralNamesProcessor {
    public static final String[] c = {"Other Name", "RFC822 Name", "DNS Name", "X.400 Address", "Directory Name", "EDI Party Name", "Uniform Resource Identifier", "IP Address", "Registered ID"};
    public static final String d = ExtensionProcessor.getErrorParamMessage();
    public static final ResourceBundle e = ResourceBundle.getBundle("ru.CryptoPro.JCPRequest.resources.cert", Locale.getDefault());
    public final GeneralName[] a;
    public final String b;

    public GeneralNamesProcessor(GeneralNames generalNames, String str) {
        this.a = generalNames.elements;
        this.b = str;
    }

    public static Extension b(EDIPartyName eDIPartyName) {
        Vector vector = new Vector(0);
        EDIPartyName_partyName eDIPartyName_partyName = eDIPartyName.partyName;
        if (eDIPartyName_partyName != null) {
            vector.add(new Extension(eDIPartyName_partyName.getElement().toString()));
        }
        if (eDIPartyName.nameAssigner != null) {
            vector.add(new Extension(e.getString("GeneralNamesProcessor.nameAssigner"), new Extension(eDIPartyName.nameAssigner.getElement().toString()), 22));
        }
        return new Extension(c[5], vector);
    }

    public static Extension c(GeneralName generalName) {
        try {
            if ("otherName".equals(generalName.getElemName())) {
                return d((GeneralName_otherName) generalName.getElement());
            }
            boolean equals = "rfc822Name".equals(generalName.getElemName());
            String[] strArr = c;
            if (equals) {
                return new Extension(strArr[1], new Extension(((Asn1IA5String) generalName.getElement()).value), 22);
            }
            if ("dNSName".equals(generalName.getElemName())) {
                return new Extension(strArr[2], new Extension(((Asn1IA5String) generalName.getElement()).value), 22);
            }
            if ("x400Address".equals(generalName.getElemName())) {
                return f((ORAddress) generalName.getElement());
            }
            if ("directoryName".equals(generalName.getElemName())) {
                return e((Name) generalName.getElement());
            }
            if ("ediPartyName".equals(generalName.getElemName())) {
                return b((EDIPartyName) generalName.getElement());
            }
            if ("uniformResourceIdentifier".equals(generalName.getElemName())) {
                return new Extension(strArr[6], new Extension(((Asn1IA5String) generalName.getElement()).value), 22);
            }
            if ("iPAddress".equals(generalName.getElemName())) {
                return new Extension(strArr[7], new Extension(((Asn1OctetString) generalName.getElement()).toString()), 22);
            }
            if (!"registeredID".equals(generalName.getElemName())) {
                return null;
            }
            return new Extension(strArr[8], new Extension(OIDName.getName(new OID(((Asn1ObjectIdentifier) generalName.getElement()).value))), 22);
        } catch (Exception unused) {
            return new Extension(e.getString("GeneralNamesProcessor.name"), new Extension(d), 22);
        }
    }

    public static Extension d(GeneralName_otherName generalName_otherName) {
        int decodeTagAndLength;
        Asn1CharString asn1BMPString;
        String str;
        OID oid = new OID(generalName_otherName.type_id.value);
        String name = OIDName.getName(oid);
        Asn1OpenType asn1OpenType = generalName_otherName.value;
        if (oid.toString().equals("1.3.6.1.4.1.311.20.2.3") || oid.toString().equals("2.5.4.4") || oid.toString().equals("2.5.4.10") || oid.toString().equals("2.5.4.13")) {
            Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(asn1OpenType.value);
            Asn1Tag asn1Tag = new Asn1Tag();
            do {
                decodeTagAndLength = asn1BerDecodeBuffer.decodeTagAndLength(asn1Tag);
            } while (asn1Tag.equals((short) 128, (short) 32, 0));
            if (asn1Tag.equals((short) 0, (short) 0, 12)) {
                asn1BMPString = new Asn1UTF8String();
                asn1BMPString.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
            } else if (asn1Tag.equals((short) 0, (short) 0, 22)) {
                asn1BMPString = new Asn1IA5String();
                asn1BMPString.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
            } else {
                if (asn1Tag.equals((short) 0, (short) 0, 30)) {
                    asn1BMPString = new Asn1BMPString();
                    asn1BMPString.decode(asn1BerDecodeBuffer, false, decodeTagAndLength);
                }
                str = name;
            }
            name = name.concat("=").concat(asn1BMPString.value);
            str = name;
        } else {
            str = name.concat("=").concat(Array.toHexLowString(asn1OpenType.value));
        }
        return new Extension(str);
    }

    public static Extension e(Name name) {
        String str;
        Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
        asn1BerEncodeBuffer.reset();
        try {
            name.encode(asn1BerEncodeBuffer);
            str = new X500Principal(asn1BerEncodeBuffer.getInputStream()).toString();
        } catch (Asn1Exception e2) {
            JCPLogger.ignoredException(e2);
            str = "";
        }
        return new Extension(c[4], SplitDirectName.getExtensionsOfNames(SplitDirectName.splitName(str)), 22);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Extension f(ORAddress oRAddress) {
        Asn1PrintableString asn1PrintableString;
        Vector vector = new Vector(0);
        BuiltInStandardAttributes builtInStandardAttributes = oRAddress.built_in_standard_attributes;
        ResourceBundle resourceBundle = e;
        if (builtInStandardAttributes != null) {
            if (builtInStandardAttributes.country_name != null) {
                vector.add(new Extension(resourceBundle.getString("GeneralNamesProcessor.country"), new Extension(((Asn18BitCharString) oRAddress.built_in_standard_attributes.country_name.getElement()).value), 22));
            }
            if (oRAddress.built_in_standard_attributes.administration_domain_name != null) {
                vector.add(new Extension(resourceBundle.getString("GeneralNamesProcessor.administrationDomainName"), new Extension(((Asn18BitCharString) oRAddress.built_in_standard_attributes.administration_domain_name.getElement()).value), 22));
            }
            if (oRAddress.built_in_standard_attributes.private_domain_name != null) {
                vector.add(new Extension(resourceBundle.getString("GeneralNamesProcessor.privateDomainName"), new Extension(((Asn18BitCharString) oRAddress.built_in_standard_attributes.private_domain_name.getElement()).value), 22));
            }
            if (oRAddress.built_in_standard_attributes.organization_name != null) {
                vector.add(new Extension(resourceBundle.getString("CertificatePoliciesProcessor.organization"), new Extension(oRAddress.built_in_standard_attributes.organization_name.value), 22));
            }
            if (oRAddress.built_in_standard_attributes.organizational_unit_names != null) {
                Vector vector2 = new Vector(0);
                for (int i = 0; i < oRAddress.built_in_standard_attributes.organizational_unit_names.elements.length; i++) {
                    vector2.add(new Extension(resourceBundle.getString("GeneralNamesProcessor.orgunit"), new Extension(oRAddress.built_in_standard_attributes.organizational_unit_names.elements[i].value), 22));
                }
                vector.add(new Extension(resourceBundle.getString("GeneralNamesProcessor.organizationUnits"), vector2, 22));
            }
            PersonalName personalName = oRAddress.built_in_standard_attributes.personal_name;
            if (personalName != null) {
                Asn1PrintableString asn1PrintableString2 = personalName.surname;
                String str = asn1PrintableString2 != null ? asn1PrintableString2.value : "";
                if (personalName.given_name != null) {
                    if (str.length() != 0) {
                        str = str.concat(",");
                    }
                    asn1PrintableString = personalName.given_name;
                } else {
                    if (personalName.initials != null) {
                        if (str.length() != 0) {
                            str = str.concat(",");
                        }
                        asn1PrintableString = personalName.initials;
                    }
                    if (personalName.generation_qualifier != null) {
                        if (str.length() != 0) {
                            str = str.concat(",");
                        }
                        str = str.concat(personalName.generation_qualifier.value);
                    }
                    vector.add(new Extension(resourceBundle.getString("personalName"), new Extension(str), 22));
                }
                str = str.concat(asn1PrintableString.value);
                if (personalName.generation_qualifier != null) {
                }
                vector.add(new Extension(resourceBundle.getString("personalName"), new Extension(str), 22));
            }
            if (oRAddress.built_in_standard_attributes.numeric_user_identifier != null) {
                vector.add(new Extension(resourceBundle.getString("GeneralNamesProcessor.userID"), new Extension(oRAddress.built_in_standard_attributes.numeric_user_identifier.value), 22));
            }
            if (oRAddress.built_in_standard_attributes.network_address != null) {
                vector.add(new Extension(resourceBundle.getString("GeneralNamesProcessor.NetworkAddress"), new Extension(oRAddress.built_in_standard_attributes.network_address.value), 22));
            }
        }
        if (oRAddress.extension_attributes != null) {
            vector.add(new Extension(resourceBundle.getString("GeneralNamesProcessor.extensionAttributes")));
        }
        if (oRAddress.built_in_domain_defined_attributes != null) {
            vector.add(new Extension(resourceBundle.getString("GeneralNamesProcessor.domainDefinedAttributes")));
        }
        return new Extension(c[3], vector, 22);
    }

    public final Extension a() {
        Vector vector = new Vector(0);
        GeneralName[] generalNameArr = this.a;
        if (generalNameArr != null && generalNameArr.length != 0) {
            for (GeneralName generalName : generalNameArr) {
                vector.add(c(generalName));
            }
        }
        return new Extension(this.b, vector, 22);
    }
}
