package ru.CryptoPro.ssl;

import defpackage.kbs;
import defpackage.w511;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.Key.SecretKeyInterface;
import ru.CryptoPro.JCP.Key.SpecKey;
import ru.CryptoPro.JCP.params.MacSizeSpec;
import ru.CryptoPro.ssl.util.cpSSLConfig;

/* loaded from: classes4.dex */
final class cl_80 {
    public static final cl_80 h = new cl_80();
    public static final byte[] i = new byte[0];
    public final int a;
    public Mac b;
    public final cl_5 c;
    public final boolean[] d;
    public final SecretKey e;
    public final String f;
    public final int g;

    public cl_80(cl_12 cl_12Var, cl_84 cl_84Var, SecretKey secretKey, cl_5 cl_5Var, int i2) {
        boolean[] zArr = new boolean[2];
        this.d = zArr;
        this.a = cl_12Var.b;
        this.c = cl_5Var;
        this.g = i2;
        cl_12 cl_12Var2 = cl_8.V;
        if (cl_12Var == cl_12Var2) {
            this.f = cl_12Var2.a;
        } else {
            cl_12 cl_12Var3 = cl_8.W;
            if (cl_12Var == cl_12Var3) {
                this.f = cl_12Var3.a;
                zArr[0] = true;
            } else {
                cl_12 cl_12Var4 = cl_8.Z;
                if (cl_12Var != cl_12Var4) {
                    w511.v(cl_12Var, "Unknown Mac ");
                    throw null;
                }
                this.f = cl_12Var4.a;
                zArr[1] = true;
            }
        }
        cl_5Var.a(cl_84Var);
        String str = this.f;
        boolean z = cl_73.a;
        Mac mac = Mac.getInstance(str, cpSSLConfig.getDefaultEncryptionSSLProvider());
        this.b = mac;
        this.e = secretKey;
        if (zArr[0] || zArr[1]) {
            return;
        }
        mac.init(secretKey);
    }

    public final byte[] a(byte b, ByteBuffer byteBuffer, byte[] bArr, int i2, int i3) {
        if (this.a == 0) {
            return i;
        }
        boolean[] zArr = this.d;
        boolean z = zArr[0];
        cl_5 cl_5Var = this.c;
        if (!z && !zArr[1]) {
            try {
                Mac mac = (Mac) this.b.clone();
                mac.update(cl_5Var.a(b, i3));
                if (bArr != null) {
                    mac.update(bArr, i2, i3);
                } else {
                    mac.update(byteBuffer);
                }
                try {
                    this.b.reset();
                    this.b = (Mac) mac.clone();
                    return mac.doFinal();
                } catch (CloneNotSupportedException e) {
                    SSLLogger.warning(e);
                    RuntimeException runtimeException = new RuntimeException();
                    runtimeException.initCause(e);
                    throw runtimeException;
                }
            } catch (CloneNotSupportedException e2) {
                SSLLogger.warning(e2);
                RuntimeException runtimeException2 = new RuntimeException();
                runtimeException2.initCause(e2);
                throw runtimeException2;
            }
        }
        try {
            SSLLogger.finer("Update MAC keys...");
            long b2 = cl_5Var.b();
            SSLLogger.finer("seq_num = " + b2);
            SecretKeyInterface secretKeyInterface = (SecretKeyInterface) ((SpecKey) this.e).getSpec();
            secretKeyInterface.updateTLSKey(b2, this.g);
            SecretKey a = cl_73.a(secretKeyInterface.getWorkKey());
            if (cpSSLConfig.isJCP()) {
                this.b.init(a, new MacSizeSpec(zArr[0] ? 16 : 8));
            } else {
                this.b.init(a);
            }
            Mac mac2 = this.b;
            mac2.update(cl_5Var.a(b, i3));
            if (bArr != null) {
                mac2.update(bArr, i2, i3);
            } else {
                mac2.update(byteBuffer);
            }
            return this.b.doFinal();
        } catch (InvalidAlgorithmParameterException e3) {
            kbs.r(e3);
            return null;
        } catch (InvalidKeyException e4) {
            kbs.r(e4);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0033 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        boolean[] zArr = this.d;
        boolean z = zArr[0];
        cl_5 cl_5Var = this.c;
        if (z) {
            return cl_5Var.b() > 35184372088831L;
        }
        boolean z2 = zArr[1];
        long b = cl_5Var.b();
        if (!z2 ? b < 72057594037927935L : b <= _Gost_CryptoPro_PrivateKeyValues.maxDWORD) {
        }
    }

    public cl_80() {
        this.d = new boolean[2];
        this.a = 0;
        boolean z = cl_8.E;
        this.b = null;
        this.e = null;
        this.c = null;
        this.f = null;
    }
}
