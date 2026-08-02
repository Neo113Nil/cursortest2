package ru.CryptoPro.JCSP.Digest;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCP.params.OID;

/* loaded from: classes4.dex */
public final class cl_3 extends GostDigest {
    public static final int e = 0;
    public static final int f = 32852;

    public cl_3() {
        super(JCP.DIGEST_NOHASH, 32);
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() throws CloneNotSupportedException {
        return new cl_3(this);
    }

    @Override // ru.CryptoPro.JCSP.Digest.BaseGostDigest, ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public byte[] digestValue(boolean z) {
        try {
            prepare();
            int i = this.c;
            if (i != 0) {
                a(i);
            }
            this.a = false;
            if (z) {
                a((OID) null);
            }
            return null;
        } catch (Error e2) {
            a();
            throw e2;
        } catch (RuntimeException e3) {
            a();
            throw e3;
        }
    }

    @Override // ru.CryptoPro.JCSP.Digest.BaseGostDigest, java.security.MessageDigestSpi
    public int engineGetDigestLength() {
        return 0;
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public int getAlgorithmIdentifier() {
        return 32852;
    }

    public cl_3(KeyInterface keyInterface) {
        super(32, keyInterface, JCP.DIGEST_NOHASH);
    }

    public cl_3(cl_3 cl_3Var) {
        super(cl_3Var, JCP.DIGEST_NOHASH);
    }
}
