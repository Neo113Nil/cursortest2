package ru.CryptoPro.AdES.certificate.find;

import defpackage.bvj0;
import defpackage.d79;
import defpackage.jc51;
import defpackage.pc51;
import defpackage.r0x;
import defpackage.t2f0;
import defpackage.vc51;
import defpackage.wbs0;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.bouncycastle.cert.X509CertificateHolder;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class CertFindUtility {
    public static X509Certificate findCert(byte[] bArr, byte[] bArr2, String str, Collection<X509Certificate> collection, String str2) throws CertificateEncodingException, IOException, AdESException {
        boolean z;
        if (bArr == null && bArr2 == null) {
            throw new AdESException("Invalid certificateID, not issuer key hash and no issuer name hash found.", IAdESException.ecInternal);
        }
        for (X509Certificate x509Certificate : collection) {
            X509CertificateHolder x509CertificateHolder = new X509CertificateHolder(x509Certificate.getEncoded());
            boolean z2 = true;
            if (bArr != null) {
                z = Arrays.equals(bArr, AdESUtility.calculateDigest(str2, str, x509CertificateHolder.a.b.B.b.x()));
                if (!z) {
                    z = Arrays.equals(bArr, AdESUtility.calculateDigest(null, "SHA-1", x509CertificateHolder.a.b.B.b.x()));
                }
            } else {
                z = true;
            }
            if (!z) {
                z2 = false;
            } else if (bArr2 != null) {
                z2 = Arrays.equals(bArr2, AdESUtility.calculateDigest(str2, str, t2f0.c(x509Certificate).getEncoded()));
            }
            if (z && z2) {
                return x509Certificate;
            }
        }
        return null;
    }

    public static X509Certificate findCert(r0x r0xVar, Collection<X509Certificate> collection) throws CertificateEncodingException, IOException {
        BigInteger x = r0xVar.b.x();
        for (X509Certificate x509Certificate : collection) {
            vc51 b = t2f0.b(x509Certificate);
            BigInteger serialNumber = x509Certificate.getSerialNumber();
            if (AdESUtility.match(b, r0xVar) && serialNumber.equals(x)) {
                return x509Certificate;
            }
        }
        return null;
    }

    public static X509Certificate findCert(wbs0 wbs0Var, Collection<X509Certificate> collection) {
        for (X509Certificate x509Certificate : collection) {
            try {
            } catch (IOException | CertificateEncodingException e) {
                JCPLogger.subThrown(e);
            }
            if (wbs0Var.Q0(new X509CertificateHolder(x509Certificate.getEncoded()))) {
                return x509Certificate;
            }
        }
        return null;
    }

    public static X509Certificate findCert(vc51 vc51Var, byte[] bArr, Collection<X509Certificate> collection) throws IOException, CertificateEncodingException {
        for (X509Certificate x509Certificate : collection) {
            byte[] subjectKeyIdentifier = AdESUtility.getSubjectKeyIdentifier(x509Certificate.getExtensionValue(pc51.c.a));
            if (vc51Var.equals(t2f0.c(x509Certificate)) && ((bArr == null && subjectKeyIdentifier == null) || Arrays.equals(bArr, subjectKeyIdentifier))) {
                return x509Certificate;
            }
        }
        return null;
    }

    public static X509Certificate findCert(byte[] bArr, Collection<X509Certificate> collection, String str, String str2) throws CertificateEncodingException, AdESException {
        for (X509Certificate x509Certificate : collection) {
            if (Array.compare(bArr, AdESUtility.calculateDigest(str2, str, x509Certificate.getEncoded()))) {
                return x509Certificate;
            }
        }
        return null;
    }

    public static X509Certificate findCert(d79 d79Var, Collection<X509Certificate> collection, String str, String str2) throws AdESException {
        for (X509Certificate x509Certificate : collection) {
            try {
                if (Arrays.equals(d79Var.b.a, AdESUtility.calculateDigest(str2, str, jc51.m(new X509CertificateHolder(x509Certificate.getEncoded()).a.b.x).getEncoded())) && d79Var.w.x().equals(x509Certificate.getSerialNumber())) {
                    return x509Certificate;
                }
            } catch (IOException | CertificateEncodingException e) {
                JCPLogger.subThrown(e);
            }
        }
        return null;
    }

    public static List<X509Certificate> findCert(bvj0 bvj0Var, Collection<X509Certificate> collection) throws CertificateEncodingException, IOException, AdESException {
        boolean equals;
        jc51 name = bvj0Var.getName();
        byte[] keyHash = bvj0Var.getKeyHash();
        ArrayList arrayList = new ArrayList(2);
        for (X509Certificate x509Certificate : collection) {
            X509CertificateHolder x509CertificateHolder = new X509CertificateHolder(x509Certificate.getEncoded());
            if (keyHash != null) {
                equals = Arrays.equals(keyHash, AdESUtility.calculateDigest(null, "SHA-1", x509CertificateHolder.a.b.B.b.x()));
            } else {
                equals = name != null ? name.equals(jc51.m(x509CertificateHolder.a.b.A)) : false;
            }
            if (equals) {
                arrayList.add(x509Certificate);
            }
        }
        return arrayList;
    }
}
