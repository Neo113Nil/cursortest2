package ru.CryptoPro.reprov;

import com.objsys.asn1j.runtime.Asn1DerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1OctetString;
import defpackage.dy31;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.CertificatePoliciesSyntax;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.PolicyInformation;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class TSPCertPolicyChecker extends PKIXCertPathChecker {
    public static Set a;

    @Override // java.security.cert.PKIXCertPathChecker
    public void check(Certificate certificate, Collection collection) throws CertPathValidatorException {
        List<String> list;
        String str;
        JCPLogger.subEnter();
        X509Certificate x509Certificate = (X509Certificate) certificate;
        if (collection != null && !collection.isEmpty()) {
            try {
                list = x509Certificate.getExtendedKeyUsage();
            } catch (CertificateParsingException unused) {
                list = null;
            }
            if (list != null && list.contains("1.3.6.1.5.5.7.3.8")) {
                JCPLogger.subEnter();
                try {
                    OID oid = new OID("1.3.6.1.5.5.7.3.8");
                    byte[] extensionValue = x509Certificate.getExtensionValue("1.3.6.1.4.1.311.21.10");
                    if (extensionValue != null) {
                        Asn1DerDecodeBuffer asn1DerDecodeBuffer = new Asn1DerDecodeBuffer(extensionValue);
                        Asn1OctetString asn1OctetString = new Asn1OctetString();
                        asn1OctetString.decode(asn1DerDecodeBuffer);
                        CertificatePoliciesSyntax certificatePoliciesSyntax = new CertificatePoliciesSyntax();
                        certificatePoliciesSyntax.decode(new Asn1DerDecodeBuffer(asn1OctetString.value));
                        PolicyInformation[] policyInformationArr = certificatePoliciesSyntax.elements;
                        if (policyInformationArr != null && policyInformationArr.length != 0) {
                            int i = 0;
                            while (true) {
                                PolicyInformation[] policyInformationArr2 = certificatePoliciesSyntax.elements;
                                if (i >= policyInformationArr2.length) {
                                    JCPLogger.fine("ApplicationCertPolicies extension does not contain the policy: " + oid);
                                    JCPLogger.subExit();
                                    break;
                                }
                                if (oid.equals(new OID(policyInformationArr2[i].policyIdentifier.value))) {
                                    str = "Certificate policies have been found.";
                                    break;
                                }
                                i++;
                            }
                        }
                        str = "Certificate policies are null.";
                    } else {
                        str = "Value of the ApplicationCertPolicies extension is null.";
                    }
                    JCPLogger.fine(str);
                    JCPLogger.subExit();
                    collection.remove("1.3.6.1.4.1.311.21.10");
                } catch (Exception e) {
                    throw new CertPathValidatorException(e);
                }
            }
        }
        JCPLogger.subExit();
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public Set getSupportedExtensions() {
        if (a == null) {
            HashSet hashSet = new HashSet();
            a = hashSet;
            hashSet.add("1.3.6.1.4.1.311.21.10");
            a = Collections.unmodifiableSet(a);
        }
        return a;
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public void init(boolean z) throws CertPathValidatorException {
        if (z) {
            dy31.r("forward checking not supported");
        }
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public boolean isForwardCheckingSupported() {
        return false;
    }
}
