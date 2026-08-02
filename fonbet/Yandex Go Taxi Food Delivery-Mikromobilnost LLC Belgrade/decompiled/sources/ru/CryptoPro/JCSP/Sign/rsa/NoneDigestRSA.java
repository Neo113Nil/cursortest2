package ru.CryptoPro.JCSP.Sign.rsa;

import com.objsys.asn1j.runtime.Asn1DerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import defpackage.ny61;
import defpackage.yci0;
import java.io.ByteArrayOutputStream;
import java.security.SignatureException;
import ru.CryptoPro.JCP.ASN.PKIXDVCS.DigestInfo;
import ru.CryptoPro.JCP.Digest.AbstractGostDigest;
import ru.CryptoPro.JCP.params.OID;

/* loaded from: classes4.dex */
public class NoneDigestRSA extends AbstractGostDigest {
    private static final Asn1ObjectIdentifier a = new Asn1ObjectIdentifier(new int[]{1, 3, 14, 3, 2, 26});
    private static final Asn1ObjectIdentifier b = new Asn1ObjectIdentifier(new int[]{2, 16, 840, 1, 101, 3, 4, 2, 4});
    private static final Asn1ObjectIdentifier c = new Asn1ObjectIdentifier(new int[]{2, 16, 840, 1, 101, 3, 4, 2, 1});
    private static final Asn1ObjectIdentifier d = new Asn1ObjectIdentifier(new int[]{2, 16, 840, 1, 101, 3, 4, 2, 2});
    private static final Asn1ObjectIdentifier e = new Asn1ObjectIdentifier(new int[]{2, 16, 840, 1, 101, 3, 4, 2, 3});
    private ByteArrayOutputStream f;
    private int g;

    public NoneDigestRSA() {
        super("None");
        this.f = new ByteArrayOutputStream();
    }

    private int a(Asn1ObjectIdentifier asn1ObjectIdentifier) {
        int i;
        if (asn1ObjectIdentifier.equals(a)) {
            i = 32772;
        } else if (asn1ObjectIdentifier.equals(b)) {
            i = 33053;
        } else if (asn1ObjectIdentifier.equals(c)) {
            i = 32780;
        } else if (asn1ObjectIdentifier.equals(d)) {
            i = 32781;
        } else {
            if (!asn1ObjectIdentifier.equals(e)) {
                yci0.k(asn1ObjectIdentifier, "DigestInfo contains unknown algorithm identifier ");
                return 0;
            }
            i = 32782;
        }
        this.g = i;
        return this.g;
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public byte[] digestValue() {
        Asn1DerDecodeBuffer asn1DerDecodeBuffer = new Asn1DerDecodeBuffer(this.f.toByteArray());
        DigestInfo digestInfo = new DigestInfo();
        try {
            digestInfo.decode(asn1DerDecodeBuffer);
            this.g = a(digestInfo.digestAlgorithm.algorithm);
            return digestInfo.digest.value;
        } catch (Exception unused) {
            ny61.r("Decoding DigestInfo failed.");
            return null;
        }
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest, java.security.MessageDigestSpi
    public byte[] engineDigest() {
        return digestValue();
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public byte[] engineDigestWithCheck() throws SignatureException {
        try {
            return digestValue();
        } catch (Exception e2) {
            throw new SignatureException(e2);
        }
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest, java.security.MessageDigestSpi
    public void engineReset() {
        reset(null);
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest, java.security.MessageDigestSpi
    public void engineUpdate(byte b2) {
        this.f.write(b2);
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public int getAlgorithmIdentifier() {
        return this.g;
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public void reset(OID oid) {
        this.f = new ByteArrayOutputStream();
        this.g = 0;
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest, java.security.MessageDigestSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.f.write(bArr, i, i2);
    }
}
