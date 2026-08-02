package ru.CryptoPro.JCP.Sign;

import java.security.SignatureException;
import ru.CryptoPro.JCP.Digest.AbstractGostDigest;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.params.OID;

/* loaded from: classes4.dex */
public class PrimitiveGostDigest extends AbstractGostDigest {
    protected static final int a = 32;
    protected static final int b = 64;
    private int c;
    private final byte[] d;

    public PrimitiveGostDigest() {
        super(JCP.CRYPTOPRO_SIGN_NAME);
        this.d = new byte[a()];
        this.c = 0;
    }

    public int a() {
        return 32;
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public byte[] digestValue() {
        return this.d;
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest, java.security.MessageDigestSpi
    public byte[] engineDigest() {
        return digestValue();
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public byte[] engineDigestWithCheck() throws SignatureException {
        if (this.c == a()) {
            this.c = 0;
            return engineDigest();
        }
        throw new SignatureException("Data for RawGOST must be exactly " + a() + " bytes long");
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest, java.security.MessageDigestSpi
    public void engineReset() {
        this.c = 0;
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest, java.security.MessageDigestSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        int i3;
        if (this.c + i2 > a()) {
            i3 = a() + 1;
        } else {
            System.arraycopy(bArr, i, this.d, this.c, i2);
            i3 = this.c + i2;
        }
        this.c = i3;
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public int getAlgorithmIdentifier() {
        return 0;
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public void reset(OID oid) {
        engineReset();
    }

    public PrimitiveGostDigest(String str) {
        super(str);
        this.d = new byte[a()];
        this.c = 0;
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest, java.security.MessageDigestSpi
    public void engineUpdate(byte b2) {
        if (this.c == a()) {
            this.c = a() + 1;
            return;
        }
        byte[] bArr = this.d;
        int i = this.c;
        this.c = i + 1;
        bArr[i] = b2;
    }
}
