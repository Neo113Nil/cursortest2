package ru.CryptoPro.JCP.Cipher;

import defpackage.dy31;
import defpackage.w511;
import java.io.NotSerializableException;
import java.io.ObjectStreamException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyManagementException;
import java.security.MessageDigest;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.MacSpi;
import ru.CryptoPro.JCP.Digest.GostDigest;
import ru.CryptoPro.JCP.Digest.GostDigest2012_256;
import ru.CryptoPro.JCP.Digest.GostDigest2012_512;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCP.Key.SecretKeyInterface;
import ru.CryptoPro.JCP.Key.SecretKeySpec;
import ru.CryptoPro.JCP.Key.SpecKey;
import ru.CryptoPro.JCP.Key.Symmetric512KeySpec;
import ru.CryptoPro.JCP.params.DigestParamsInterface;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.Starter;

/* loaded from: classes4.dex */
public class InGostHMAC extends MacSpi implements Cloneable {
    public static final int HMAC_SIZE = 32;
    public static final byte[] IPAD = {54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54};
    public static final byte[] OPAD = {92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92};
    public static final String STR_NAME = "HMAC_GOSTR3411";
    public static final String STR_OID = "1.2.643.2.2.10";
    protected SecretKeySpec a;
    protected long b;
    protected MessageDigest c;
    protected boolean d;
    public boolean w;

    public InGostHMAC(String str) {
        MessageDigest gostDigest2012_512;
        this.a = null;
        this.b = 0L;
        this.c = null;
        this.d = false;
        this.w = false;
        Starter.check(InGostHMAC.class);
        if (str.equalsIgnoreCase(JCP.GOST_DIGEST_NAME)) {
            gostDigest2012_512 = new GostDigest();
        } else if (str.equalsIgnoreCase(JCP.GOST_DIGEST_2012_256_NAME)) {
            gostDigest2012_512 = new GostDigest2012_256();
        } else {
            if (!str.equalsIgnoreCase(JCP.GOST_DIGEST_2012_512_NAME)) {
                w511.q();
                throw null;
            }
            gostDigest2012_512 = new GostDigest2012_512();
        }
        this.c = gostDigest2012_512;
    }

    public static void a(InGostHMAC inGostHMAC, InGostHMAC inGostHMAC2) throws CloneNotSupportedException {
        inGostHMAC2.engineReset();
        inGostHMAC2.b = inGostHMAC.b;
        inGostHMAC2.a = (SecretKeySpec) inGostHMAC.a.clone();
        inGostHMAC2.c = (MessageDigest) inGostHMAC.c.clone();
    }

    public byte[] b() {
        return OPAD;
    }

    public byte[] c() throws InvalidKeyException {
        byte[] digest = this.c.digest();
        this.c.reset();
        boolean z = this.w;
        SecretKeySpec secretKeySpec = this.a;
        MessageDigest messageDigest = this.c;
        if (z) {
            secretKeySpec.digest(messageDigest);
            byte[] digest2 = this.c.digest();
            this.c.reset();
            this.c.update(Array.xor(digest2, b()));
        } else {
            secretKeySpec.digest(messageDigest, b());
        }
        this.c.update(digest);
        return this.c.digest();
    }

    @Override // javax.crypto.MacSpi
    public Object clone() throws CloneNotSupportedException {
        InGostHMAC inGostHMAC = new InGostHMAC();
        inGostHMAC.a = null;
        inGostHMAC.b = 0L;
        inGostHMAC.c = null;
        inGostHMAC.d = false;
        inGostHMAC.w = false;
        Starter.check(InGostHMAC.class);
        a(this, inGostHMAC);
        return inGostHMAC;
    }

    public void d() throws InvalidKeyException {
        boolean z = this.w;
        SecretKeySpec secretKeySpec = this.a;
        MessageDigest messageDigest = this.c;
        if (!z) {
            secretKeySpec.digest(messageDigest, a());
            return;
        }
        secretKeySpec.digest(messageDigest);
        this.c.update(Array.xor(this.c.digest(), a()));
    }

    public void e() {
        SecretKeySpec secretKeySpec = this.a;
        if (secretKeySpec != null) {
            secretKeySpec.clear();
            this.a = null;
        }
    }

    @Override // javax.crypto.MacSpi
    public byte[] engineDoFinal() {
        try {
            JCPLogger.enter();
            byte[] bArr = new byte[0];
            try {
                bArr = c();
            } catch (InvalidKeyException unused) {
            }
            engineReset();
            this.d = true;
            JCPLogger.exit();
            return bArr;
        } catch (Error e) {
            e();
            engineReset();
            throw e;
        } catch (RuntimeException e2) {
            e();
            engineReset();
            throw e2;
        }
    }

    @Override // javax.crypto.MacSpi
    public int engineGetMacLength() {
        return 32;
    }

    @Override // javax.crypto.MacSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        JCPLogger.enter();
        this.d = false;
        if (!(key instanceof SpecKey)) {
            dy31.v("Invalid key type");
        } else {
            init(((SpecKey) key).getSpec(), algorithmParameterSpec);
            JCPLogger.exit();
        }
    }

    @Override // javax.crypto.MacSpi
    public void engineReset() {
        this.b = 0L;
        this.d = false;
        this.c.reset();
        try {
            d();
        } catch (InvalidKeyException e) {
            this.d = true;
            e();
            throw new Error(e.getMessage());
        }
    }

    @Override // javax.crypto.MacSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        try {
            if (this.d) {
                throw new Error("Update locked");
            }
            this.c.update(bArr, i, i2);
        } catch (Error e) {
            e();
            engineReset();
            throw e;
        } catch (RuntimeException e2) {
            e();
            engineReset();
            throw e2;
        }
    }

    public Object f() throws ObjectStreamException {
        throw new NotSerializableException();
    }

    public Object g() throws ObjectStreamException {
        throw new NotSerializableException();
    }

    public void init(KeyInterface keyInterface, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            if (!(keyInterface instanceof SecretKeyInterface)) {
                throw new InvalidKeyException("Invalid key type");
            }
            if ((keyInterface instanceof Symmetric512KeySpec) && !(this instanceof InGostHMAC2012_256)) {
                this.w = true;
            }
            SecretKeySpec secretKeySpec = (SecretKeySpec) keyInterface.clone();
            this.a = secretKeySpec;
            MessageDigest messageDigest = this.c;
            if ((messageDigest instanceof GostDigest2012_256) || (messageDigest instanceof GostDigest2012_512)) {
                try {
                    this.a = SecretKeySpec.expand(secretKeySpec);
                } catch (KeyManagementException unused) {
                    InvalidAlgorithmParameterException invalidAlgorithmParameterException = new InvalidAlgorithmParameterException("Invalid expanded key");
                    JCPLogger.warning(invalidAlgorithmParameterException);
                    throw invalidAlgorithmParameterException;
                }
            }
            if (algorithmParameterSpec != null) {
                if (!(algorithmParameterSpec instanceof DigestParamsInterface)) {
                    InvalidAlgorithmParameterException invalidAlgorithmParameterException2 = new InvalidAlgorithmParameterException("Invalid parameter");
                    JCPLogger.warning(invalidAlgorithmParameterException2);
                    throw invalidAlgorithmParameterException2;
                }
                MessageDigest messageDigest2 = this.c;
                if (messageDigest2 instanceof GostDigest) {
                    ((GostDigest) messageDigest2).reset(((DigestParamsInterface) algorithmParameterSpec).getOID());
                }
            }
            engineReset();
        } catch (CloneNotSupportedException e) {
            e();
            engineReset();
            dy31.s(e);
        } catch (Error e2) {
            e();
            engineReset();
            throw e2;
        } catch (RuntimeException e3) {
            e();
            engineReset();
            throw e3;
        }
    }

    public byte[] a() {
        return IPAD;
    }

    @Override // javax.crypto.MacSpi
    public void engineUpdate(byte b) {
        this.c.update(b);
    }

    public InGostHMAC() {
        this(JCP.GOST_DIGEST_NAME);
    }
}
