package ru.CryptoPro.ssl;

import defpackage.kbs;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import ru.CryptoPro.JCP.Key.SecretKeyInterface;
import ru.CryptoPro.JCP.Key.SpecKey;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes4.dex */
final class cl_7 {
    public static final cl_7 i = new cl_7();
    public final Cipher a;
    public boolean b;
    public final SecureRandom c;
    public final boolean[] d;
    public final cl_5 e;
    public final SecretKey f;
    public final int g;
    public final int h;

    public cl_7(cl_9 cl_9Var, SecretKey secretKey, IvParameterSpec ivParameterSpec, SecureRandom secureRandom, cl_5 cl_5Var, int i2, boolean z) {
        this.b = false;
        boolean[] zArr = new boolean[2];
        this.d = zArr;
        try {
            String str = cl_9Var.b;
            Cipher c = cl_73.c(str);
            this.a = c;
            this.e = cl_5Var;
            this.f = secretKey;
            this.g = i2;
            int i3 = z ? 1 : 2;
            this.h = i3;
            zArr[0] = str.equals("GOST3412_2015_K/CTR_ACPKM/NoPadding");
            zArr[1] = str.equals("GOST3412_2015_M/CTR_ACPKM/NoPadding");
            secureRandom = secureRandom == null ? cl_73.h() : secureRandom;
            this.c = secureRandom;
            cl_5Var.a(ivParameterSpec.getIV());
            SSLLogger.finer("Fixed IV = " + HexString.toHex(ivParameterSpec.getIV()));
            if (zArr[0] || zArr[1]) {
                return;
            }
            c.init(i3, secretKey, ivParameterSpec, secureRandom);
            this.b = true;
        } catch (ExceptionInInitializerError e) {
            throw new NoSuchAlgorithmException("Could not create cipher " + cl_9Var, e);
        } catch (NoSuchAlgorithmException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new NoSuchAlgorithmException("Could not create cipher " + cl_9Var, e3);
        }
    }

    public final int a(int i2, byte[] bArr) {
        Cipher cipher = this.a;
        if (cipher == null) {
            return i2;
        }
        try {
            boolean[] zArr = this.d;
            if (zArr[0] || zArr[1]) {
                b();
            }
            SSLLogger.fine("Begin decrypt... ");
            int update = this.a.update(bArr, 5, i2, bArr, 5);
            SSLLogger.fine("Decrypted... ");
            if (SSLLogger.isAllEnabled()) {
                SSLLogger.dump("Plaintext after DECRYPTION: len = ", Integer.valueOf(update), ByteBuffer.wrap(bArr, 5, update));
            }
            if (update == i2) {
                return update;
            }
            throw new RuntimeException("Cipher buffering error in JCE provider " + cipher.getProvider().getName());
        } catch (ShortBufferException e) {
            throw new ArrayIndexOutOfBoundsException(e.toString());
        }
    }

    public final void b() {
        cl_5 cl_5Var = this.e;
        try {
            SSLLogger.finer("Updating cipher keys...");
            long b = cl_5Var.b();
            SSLLogger.finer("seq_num = " + b);
            SecretKeyInterface secretKeyInterface = (SecretKeyInterface) ((SpecKey) this.f).getSpec();
            secretKeyInterface.updateTLSKey(b, this.g);
            SecretKey a = cl_73.a(secretKeyInterface.getWorkKey());
            byte[] c = cl_5Var.c();
            SSLLogger.finer("New IV = " + HexString.toHex(c));
            d();
            this.a.init(this.h, a, new IvParameterSpec(c), this.c);
            this.b = true;
        } catch (InvalidAlgorithmParameterException e) {
            kbs.r(e);
        } catch (InvalidKeyException e2) {
            kbs.r(e2);
        }
    }

    public final void c(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        Cipher cipher = this.a;
        if (cipher == null) {
            byteBuffer.position(byteBuffer.limit());
            return;
        }
        try {
            int position = byteBuffer.position();
            ByteBuffer duplicate = byteBuffer.duplicate();
            boolean[] zArr = this.d;
            if (zArr[0] || zArr[1]) {
                b();
            }
            SSLLogger.fine("Begin decrypt... ");
            int update = cipher.update(duplicate, byteBuffer);
            if (update != remaining) {
                throw new RuntimeException("Cipher buffering error in JCE provider " + cipher.getProvider().getName());
            }
            int position2 = byteBuffer.position();
            byteBuffer.position(position);
            SSLLogger.fine("Decrypted...");
            if (SSLLogger.isAllEnabled()) {
                SSLLogger.dump("Plaintext after DECRYPTION:  len = ", Integer.valueOf(update), byteBuffer);
            }
            byteBuffer.position(position2);
        } catch (ShortBufferException e) {
            RuntimeException runtimeException = new RuntimeException(e.toString());
            runtimeException.initCause(e);
            throw runtimeException;
        }
    }

    public final void d() {
        try {
            Cipher cipher = this.a;
            if (cipher == null || !this.b) {
                return;
            }
            this.b = false;
            cipher.doFinal();
        } catch (GeneralSecurityException unused) {
        }
    }

    public cl_7() {
        this.b = false;
        this.d = new boolean[2];
        cl_84 cl_84Var = cl_84.b;
        this.a = null;
        this.h = 1;
        this.c = null;
        this.e = null;
        this.f = null;
        this.g = 0;
    }
}
