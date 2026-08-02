package defpackage;

import java.io.IOException;
import java.security.AlgorithmConstraints;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertificateException;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.reprov.array.DerInputStream;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.reprov.array.ObjectIdentifier;
import ru.CryptoPro.reprov.x509.NetscapeCertTypeExtension;
import ru.CryptoPro.reprov.x509.X509CertImpl;
import ru.CryptoPro.sspiSSL.pc_3.cl_7;

/* loaded from: classes4.dex */
public final class xv61 extends qw61 {
    public static final ObjectIdentifier i = NetscapeCertTypeExtension.NetscapeCertType_Id;
    public final HashMap f;
    public final HashSet g;
    public final HashSet h;

    public xv61(String str, Collection collection) {
        super("Simple", str);
        this.h = new HashSet();
        this.g = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            X509Certificate x509Certificate = (X509Certificate) it.next();
            if (nu61.e(null, x509Certificate)) {
                this.g.add(x509Certificate);
            }
            this.h.add(x509Certificate);
        }
        this.f = new HashMap();
        Iterator it2 = this.g.iterator();
        while (it2.hasNext()) {
            X509Certificate x509Certificate2 = (X509Certificate) it2.next();
            X500Principal subjectX500Principal = x509Certificate2.getSubjectX500Principal();
            List list = (List) this.f.get(subjectX500Principal);
            if (list == null) {
                list = new ArrayList(2);
                this.f.put(subjectX500Principal, list);
            }
            list.add(x509Certificate2);
        }
    }

    public static boolean e(String str, X509Certificate x509Certificate) {
        NetscapeCertTypeExtension netscapeCertTypeExtension;
        try {
            if (x509Certificate instanceof X509CertImpl) {
                netscapeCertTypeExtension = (NetscapeCertTypeExtension) ((X509CertImpl) x509Certificate).getExtension(i);
                if (netscapeCertTypeExtension == null) {
                    return true;
                }
            } else {
                byte[] extensionValue = x509Certificate.getExtensionValue("2.16.840.1.113730.1.1");
                if (extensionValue == null) {
                    return true;
                }
                netscapeCertTypeExtension = new NetscapeCertTypeExtension(new DerValue(new DerInputStream(extensionValue).getOctetString()).getUnalignedBitString().toByteArray());
            }
            return ((Boolean) netscapeCertTypeExtension.get(str)).booleanValue();
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // defpackage.qw61
    public final Collection b() {
        return this.g;
    }

    @Override // defpackage.qw61
    public final X509Certificate[] c(X509Certificate[] x509CertificateArr, AlgorithmConstraints algorithmConstraints, Object obj) {
        X509Certificate[] x509CertificateArr2;
        if (x509CertificateArr == null || x509CertificateArr.length == 0) {
            w511.y("null or zero-length certificate chain");
            return null;
        }
        ArrayList arrayList = new ArrayList(x509CertificateArr.length);
        int i2 = 0;
        while (true) {
            int length = x509CertificateArr.length;
            x509CertificateArr2 = qw61.d;
            HashMap hashMap = this.f;
            if (i2 < length) {
                X509Certificate x509Certificate = x509CertificateArr[i2];
                List<X509Certificate> list = (List) hashMap.get(x509Certificate.getSubjectX500Principal());
                if (list != null) {
                    X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
                    PublicKey publicKey = x509Certificate.getPublicKey();
                    for (X509Certificate x509Certificate2 : list) {
                        if (x509Certificate2.equals(x509Certificate)) {
                            x509Certificate2 = x509Certificate;
                            break;
                        }
                        if (x509Certificate2.getIssuerX500Principal().equals(issuerX500Principal) && x509Certificate2.getPublicKey().equals(publicKey)) {
                            break;
                        }
                    }
                }
                x509Certificate2 = null;
                if (x509Certificate2 != null) {
                    arrayList.add(x509Certificate2);
                    break;
                }
                arrayList.add(x509Certificate);
                i2++;
            } else {
                X509Certificate x509Certificate3 = x509CertificateArr[x509CertificateArr.length - 1];
                x509Certificate3.getSubjectX500Principal();
                List list2 = (List) hashMap.get(x509Certificate3.getIssuerX500Principal());
                if (list2 == null) {
                    throw new cl_7("No trusted certificate found", (X509Certificate) null);
                }
                arrayList.add((X509Certificate) list2.iterator().next());
            }
        }
        X509Certificate[] x509CertificateArr3 = (X509Certificate[]) arrayList.toArray(x509CertificateArr2);
        Date date = new Date();
        TrustAnchor trustAnchor = new TrustAnchor(x509CertificateArr3[x509CertificateArr3.length - 1], null);
        uq61 uq61Var = new uq61(trustAnchor, uq61.x);
        uq61 uq61Var2 = algorithmConstraints != null ? new uq61(trustAnchor, algorithmConstraints) : null;
        int length2 = x509CertificateArr3.length - 1;
        for (int length3 = x509CertificateArr3.length - 2; length3 >= 0; length3--) {
            X509Certificate x509Certificate4 = x509CertificateArr3[length3 + 1];
            X509Certificate x509Certificate5 = x509CertificateArr3[length3];
            try {
                Set<String> set = Collections.EMPTY_SET;
                uq61Var.check(x509Certificate5, set);
                if (uq61Var2 != null) {
                    uq61Var2.check(x509Certificate5, set);
                }
                String str = this.c;
                if (!str.equals("code signing") && !str.equals("jce signing")) {
                    x509Certificate5.checkValidity(date);
                }
                if (!x509Certificate5.getIssuerX500Principal().equals(x509Certificate4.getSubjectX500Principal())) {
                    throw new cl_7("Certificate chaining error", x509Certificate5);
                }
                try {
                    x509Certificate5.verify(x509Certificate4.getPublicKey());
                    if (length3 != 0) {
                        Set<String> criticalExtensionOIDs = x509Certificate5.getCriticalExtensionOIDs();
                        if (criticalExtensionOIDs != null) {
                            set = criticalExtensionOIDs;
                        }
                        set.remove("2.5.29.19");
                        int basicConstraints = x509Certificate5.getBasicConstraints();
                        if (basicConstraints < 0) {
                            throw new cl_7("End user tried to act as a CA", "CA certificate extension check failed", x509Certificate5);
                        }
                        boolean z = nu61.l;
                        if (!x509Certificate5.getSubjectX500Principal().equals(x509Certificate5.getIssuerX500Principal())) {
                            if (length2 <= 0) {
                                throw new cl_7("Violated path length constraints", "CA certificate extension check failed", x509Certificate5);
                            }
                            length2--;
                        }
                        if (length2 <= basicConstraints) {
                            basicConstraints = length2;
                        }
                        set.remove(AdESUtility.KEY_USAGE);
                        set.remove(AdESUtility.EXTENDED_KEY_USAGE);
                        boolean[] keyUsage = x509Certificate5.getKeyUsage();
                        if (keyUsage != null && (keyUsage.length < 6 || !keyUsage[5])) {
                            throw new cl_7("Wrong key usage: expected keyCertSign", "CA certificate extension check failed", x509Certificate5);
                        }
                        if (!str.equals("generic")) {
                            if (!str.equals("tls client") && !str.equals("tls server")) {
                                if (!str.equals("code signing") && !str.equals("jce signing")) {
                                    throw new CertificateException("Unknown variant ".concat(str));
                                }
                                if (!e(NetscapeCertTypeExtension.OBJECT_SIGNING_CA, x509Certificate5)) {
                                    throw new cl_7("Invalid Netscape CertType extension for code signing CA certificate", "CA certificate extension check failed", x509Certificate5);
                                }
                            } else if (!e(NetscapeCertTypeExtension.SSL_CA, x509Certificate5)) {
                                throw new cl_7("Invalid Netscape CertType extension for SSL CA certificate", "CA certificate extension check failed", x509Certificate5);
                            }
                            set.remove("2.16.840.1.113730.1.1");
                        }
                        if (!set.isEmpty()) {
                            throw new cl_7("Certificate contains unknown critical extensions: " + set, "CA certificate extension check failed", x509Certificate5);
                        }
                        length2 = basicConstraints;
                    }
                } catch (GeneralSecurityException e) {
                    throw new cl_7("Certificate signature validation failed", x509Certificate5, e);
                }
            } catch (CertPathValidatorException e2) {
                throw new cl_7("Certificate signature algorithm disabled", x509Certificate5, e2);
            }
        }
        return x509CertificateArr3;
    }
}
