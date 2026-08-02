package ru.CryptoPro.AdES.certificate;

import defpackage.bvj0;
import defpackage.cr80;
import defpackage.d79;
import defpackage.gxs;
import defpackage.l2;
import defpackage.l79;
import defpackage.nc51;
import defpackage.r0x;
import defpackage.rza1;
import defpackage.unr0;
import defpackage.vc51;
import defpackage.wbs0;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import ru.CryptoPro.AdES.AbstractFinder;
import ru.CryptoPro.AdES.certificate.find.CertFindUtility;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.Platform;

/* loaded from: classes4.dex */
public class CertificateFinder extends AbstractFinder<X509Certificate> {
    private final Collection<X509Certificate> minPriorityCerts;
    private final Collection<X509Certificate> rootCertificates;

    public CertificateFinder(Collection<X509Certificate> collection, Collection<X509Certificate> collection2) {
        super(collection);
        this.minPriorityCerts = collection2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableCollection(collection2);
        this.rootCertificates = Collections.unmodifiableSet(AbstractCertificateChainBuilder.getCaCertsTrustCertificates());
    }

    public X509Certificate find(wbs0 wbs0Var) throws AdESException {
        nc51 nc51Var = wbs0Var.a;
        nc51 nc51Var2 = wbs0Var.a;
        BigInteger bigInteger = nc51Var.c;
        byte[] b = rza1.b(nc51Var.a);
        if (bigInteger == null && b == null) {
            throw new AdESException("Invalid signer id: no SerialNumber, no SubjectKeyIdentifier.", IAdESException.ecFinderCertificateIsNull);
        }
        String bigInteger2 = bigInteger == null ? null : nc51Var2.c.toString(16);
        if (bigInteger2 != null) {
            JCPLogger.finerFormat("Looking for certificate: signer id with sn {0} issued by {1}, max priority.", bigInteger2, nc51Var2.b);
        } else {
            JCPLogger.finerFormat("Looking for certificate: signer id with subjectKeyId " + Array.toHexString(b) + ", max priority.", new Object[0]);
        }
        X509Certificate findCert = CertFindUtility.findCert(wbs0Var, (Collection<X509Certificate>) this.collection);
        if (findCert != null) {
            return findCert;
        }
        if (bigInteger2 != null) {
            JCPLogger.finerFormat("Looking for certificate: signer id with sn {0} issued by {1}, min priority.", bigInteger2, nc51Var2.b);
        } else {
            JCPLogger.finerFormat("Looking for certificate: signer id with subjectKeyId " + Array.toHexString(b) + " min priority.", new Object[0]);
        }
        X509Certificate findCert2 = CertFindUtility.findCert(wbs0Var, this.minPriorityCerts);
        if (findCert2 != null) {
            return findCert2;
        }
        if (bigInteger2 != null) {
            JCPLogger.finerFormat("Looking for certificate: signer id with sn {0} issued by {1}, roots.", bigInteger2, nc51Var2.b);
        } else {
            JCPLogger.finerFormat("Looking for certificate: signer id with subjectKeyId " + Array.toHexString(b) + ", roots.", new Object[0]);
        }
        X509Certificate findCert3 = CertFindUtility.findCert(wbs0Var, this.rootCertificates);
        if (findCert3 != null) {
            return findCert3;
        }
        if (bigInteger2 != null) {
            StringBuilder x = unr0.x("Certificate: sn ", bigInteger2, ", issuer: ");
            x.append(nc51Var2.b);
            x.append(" not found.");
            throw new AdESException(x.toString(), IAdESException.ecFinderCertificateIsNull);
        }
        throw new AdESException("Certificate: subjectKeyId " + Array.toHexString(b) + " not found.", IAdESException.ecFinderCertificateIsNull);
    }

    public CertificateFinder(Collection<X509Certificate> collection) {
        super(collection);
        this.minPriorityCerts = Collections.EMPTY_LIST;
        this.rootCertificates = Collections.unmodifiableSet(AbstractCertificateChainBuilder.getCaCertsTrustCertificates());
    }

    public X509Certificate find(l79 l79Var) throws AdESException {
        try {
            d79 d79Var = l79Var.a;
            byte[] bArr = d79Var.c.a;
            byte[] bArr2 = d79Var.b.a;
            String str = d79Var.a.a.a;
            JCPLogger.finer("Looking for certificate by certificate identifier, max priority.");
            X509Certificate findCert = CertFindUtility.findCert(bArr, bArr2, str, this.collection, this.provider);
            if (findCert != null) {
                return findCert;
            }
            JCPLogger.finer("Looking for certificate by certificate identifier, min priority.");
            X509Certificate findCert2 = CertFindUtility.findCert(bArr, bArr2, str, this.minPriorityCerts, this.provider);
            if (findCert2 != null) {
                return findCert2;
            }
            JCPLogger.finer("Looking for certificate by certificate identifier, roots.");
            X509Certificate findCert3 = CertFindUtility.findCert(bArr, bArr2, str, this.rootCertificates, this.provider);
            if (findCert3 != null) {
                return findCert3;
            }
            throw new AdESException("Certificate not found.", IAdESException.ecFinderCertificateIsNull);
        } catch (Exception e) {
            throw new AdESException(e, IAdESException.ecFinderCertificateIsNull);
        }
    }

    public X509Certificate find(r0x r0xVar) throws AdESException {
        StringBuilder sb;
        StringBuilder sb2;
        String str;
        StringBuilder sb3;
        l2 l2Var = r0xVar.b;
        gxs gxsVar = r0xVar.a;
        BigInteger x = l2Var.x();
        try {
            boolean z = Platform.isIbm;
            if (z) {
                sb = new StringBuilder("Looking for certificate (IBM): sn ");
                sb.append(x.toString(16));
                sb.append(", max priority.");
            } else {
                sb = new StringBuilder("Looking for certificate: issuer ");
                sb.append(gxsVar);
                sb.append(", max priority.");
            }
            JCPLogger.finer(sb.toString());
            X509Certificate findCert = CertFindUtility.findCert(r0xVar, (Collection<X509Certificate>) this.collection);
            if (findCert != null) {
                return findCert;
            }
            if (z) {
                sb2 = new StringBuilder("Looking for certificate (IBM): sn ");
                sb2.append(x.toString(16));
                sb2.append(", min priority.");
            } else {
                sb2 = new StringBuilder("Looking for certificate: issuer ");
                sb2.append(gxsVar);
                sb2.append(", min priority.");
            }
            JCPLogger.finer(sb2.toString());
            X509Certificate findCert2 = CertFindUtility.findCert(r0xVar, this.minPriorityCerts);
            if (findCert2 != null) {
                return findCert2;
            }
            if (z) {
                str = "Looking for certificate (IBM): sn " + x.toString(16) + ", roots.";
            } else {
                str = "Looking for certificate: issuer " + gxsVar + ", roots.";
            }
            JCPLogger.finer(str);
            X509Certificate findCert3 = CertFindUtility.findCert(r0xVar, this.rootCertificates);
            if (findCert3 != null) {
                return findCert3;
            }
            if (z) {
                sb3 = new StringBuilder("Certificate (IBM): sn ");
                sb3.append(x.toString(16));
            } else {
                sb3 = new StringBuilder("Certificate: sn ");
                sb3.append(x.toString(16));
                sb3.append(" issued by ");
                sb3.append(gxsVar);
            }
            sb3.append(" not found.");
            throw new AdESException(sb3.toString(), IAdESException.ecFinderCertificateIsNull);
        } catch (IOException e) {
            throw new AdESException(e, IAdESException.ecFinderCertificateIsNull);
        } catch (CertificateEncodingException e2) {
            throw new AdESException(e2, IAdESException.ecFinderCertificateIsNull);
        }
    }

    public X509Certificate find(cr80 cr80Var) throws AdESException {
        try {
            String str = cr80Var.m().a.a;
            byte[] n = cr80Var.n();
            JCPLogger.finer("Looking for certificate by certificate reference, max priority.");
            X509Certificate findCert = CertFindUtility.findCert(n, (Collection<X509Certificate>) this.collection, str, this.provider);
            if (findCert != null) {
                return findCert;
            }
            JCPLogger.finer("Looking for certificate by certificate reference, min priority.");
            X509Certificate findCert2 = CertFindUtility.findCert(n, this.minPriorityCerts, str, this.provider);
            if (findCert2 != null) {
                return findCert2;
            }
            JCPLogger.finer("Looking for certificate by certificate reference, roots.");
            X509Certificate findCert3 = CertFindUtility.findCert(n, this.rootCertificates, str, this.provider);
            if (findCert3 != null) {
                return findCert3;
            }
            throw new AdESException("Certificate not found.", IAdESException.ecFinderCertificateIsNull);
        } catch (CertificateEncodingException e) {
            throw new AdESException(e, IAdESException.ecFinderCertificateIsNull);
        }
    }

    public X509Certificate find(d79 d79Var) throws AdESException {
        String str = d79Var.a.a.a;
        String bigInteger = d79Var.w.x().toString(16);
        JCPLogger.finerFormat("Looking for certificate: certificate id with sn {0}, hash OID {1}, max priority.", bigInteger, str);
        X509Certificate findCert = CertFindUtility.findCert(d79Var, (Collection<X509Certificate>) this.collection, str, this.provider);
        if (findCert != null) {
            return findCert;
        }
        JCPLogger.finerFormat("Looking for certificate: certificate id with sn {0}, hash OID {1}, min priority.", bigInteger, str);
        X509Certificate findCert2 = CertFindUtility.findCert(d79Var, this.minPriorityCerts, str, this.provider);
        if (findCert2 != null) {
            return findCert2;
        }
        JCPLogger.finerFormat("Looking for certificate: certificate id with sn {0}, hash OID {1}, roots.", bigInteger, str);
        X509Certificate findCert3 = CertFindUtility.findCert(d79Var, this.rootCertificates, str, this.provider);
        if (findCert3 != null) {
            return findCert3;
        }
        throw new AdESException(unr0.p("Certificate: sn ", bigInteger, ", hash OID ", str, " not found."), IAdESException.ecFinderCertificateIsNull);
    }

    public X509Certificate find(vc51 vc51Var, byte[] bArr) throws AdESException {
        try {
            JCPLogger.finerFormat("Looking for certificate: issuer name {0} and key identifier, max priority.", vc51Var);
            X509Certificate findCert = CertFindUtility.findCert(vc51Var, bArr, this.collection);
            if (findCert != null) {
                return findCert;
            }
            JCPLogger.finerFormat("Looking for certificate: issuer name {0} and key identifier, min priority.", vc51Var);
            X509Certificate findCert2 = CertFindUtility.findCert(vc51Var, bArr, this.minPriorityCerts);
            if (findCert2 != null) {
                return findCert2;
            }
            JCPLogger.finerFormat("Looking for certificate: issuer name {0} and key identifier, roots.", vc51Var);
            X509Certificate findCert3 = CertFindUtility.findCert(vc51Var, bArr, this.rootCertificates);
            if (findCert3 != null) {
                return findCert3;
            }
            throw new AdESException("Certificate issued by " + vc51Var + " not found.", IAdESException.ecFinderCertificateIsNull);
        } catch (IOException e) {
            throw new AdESException(e, IAdESException.ecFinderCertificateIsNull);
        } catch (CertificateEncodingException e2) {
            throw new AdESException(e2, IAdESException.ecFinderCertificateIsNull);
        }
    }

    public List<X509Certificate> find(bvj0 bvj0Var) throws AdESException {
        try {
            JCPLogger.finerFormat("Looking for certificate: responder id with name " + bvj0Var.getName() + ", max priority.", new Object[0]);
            List<X509Certificate> findCert = CertFindUtility.findCert(bvj0Var, (Collection<X509Certificate>) this.collection);
            if (!findCert.isEmpty()) {
                return findCert;
            }
            JCPLogger.finer("Looking for certificate: responder id with name " + bvj0Var.getName() + ", min priority.");
            List<X509Certificate> findCert2 = CertFindUtility.findCert(bvj0Var, this.minPriorityCerts);
            if (!findCert2.isEmpty()) {
                return findCert2;
            }
            JCPLogger.finer("Looking for certificate: responder id with name " + bvj0Var.getName() + ", roots.");
            List<X509Certificate> findCert3 = CertFindUtility.findCert(bvj0Var, this.rootCertificates);
            if (!findCert3.isEmpty()) {
                return findCert3;
            }
            throw new AdESException("Certificate: responder id " + bvj0Var.getName() + " not found.", IAdESException.ecFinderCertificateIsNull);
        } catch (IOException e) {
            throw new AdESException(e, IAdESException.ecFinderCertificateIsNull);
        } catch (CertificateEncodingException e2) {
            throw new AdESException(e2, IAdESException.ecFinderCertificateIsNull);
        }
    }
}
