package ru.CryptoPro.ssl;

import defpackage.b64;
import defpackage.kbs;
import defpackage.ny61;
import defpackage.oyr;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.ssl.util.cpSSLConfig;

/* loaded from: classes4.dex */
final class cl_8 implements Comparable {
    public static final boolean E = GetProperty.getBooleanProperty("com.sun.net.ssl.enableECC", true);
    public static final HashMap F;
    public static final HashMap G;
    public static final cl_9 H;
    public static final cl_9 I;
    public static final cl_9 J;
    public static final cl_9 K;
    public static final cl_9 L;
    public static final cl_9 M;
    public static final cl_9 N;
    public static final cl_9 O;
    public static final cl_9 P;
    public static final cl_12 Q;
    public static final cl_12 R;
    public static final cl_12 S;
    public static final cl_12 T;
    public static final cl_12 U;
    public static final cl_12 V;
    public static final cl_12 W;
    public static final cl_12 Z;
    public static final cl_8 a0;
    public static final cl_8 b0;
    public final boolean A;
    public final boolean B;
    public final int C;
    public final int D;
    public final String a;
    public final int b;
    public final int c;
    public final cl_11 w;
    public final cl_9 x;
    public final cl_12 y;
    public final cl_13 z;

    static {
        int i;
        cl_10 cl_10Var = cl_10.a;
        cl_9 cl_9Var = new cl_9("NULL", cl_10Var, 0, 0, 0, true, 0);
        H = cl_9Var;
        I = new cl_9("RC4", cl_10Var, 5, 16, 0, true, 0);
        cl_10 cl_10Var2 = cl_10.b;
        J = new cl_9("RC2", cl_10Var2, 5, 16, 8, false, 0);
        K = new cl_9("DES/CBC/NoPadding", cl_10Var2, 5, 8, 8, true, 0);
        L = new cl_9("RC4", cl_10Var, 16, 0, 0, true);
        M = new cl_9("DES/CBC/NoPadding", cl_10Var2, 8, 8, 0, true);
        N = new cl_9("DESede/CBC/NoPadding", cl_10Var2, 24, 8, 0, true);
        new cl_9("IDEA", cl_10Var2, 16, 8, 0, false);
        O = new cl_9("AES/CBC/NoPadding", cl_10Var2, 16, 16, 0, true);
        P = new cl_9("AES/CBC/NoPadding", cl_10Var2, 32, 16, 0, true);
        cl_9 cl_9Var2 = new cl_9("GOST28147/CNT/NoPadding", cl_10Var2, 32, 8, 8, true);
        cl_9 cl_9Var3 = new cl_9("GOST3412_2015_K/CTR_ACPKM/NoPadding", cl_10Var2, 32, 8, 8, true);
        cl_9 cl_9Var4 = new cl_9("GOST3412_2015_M/CTR_ACPKM/NoPadding", cl_10Var2, 32, 4, 4, true);
        Q = new cl_12("NULL", 0, 0, 0);
        R = new cl_12("MD5", 16, 64, 9);
        S = new cl_12("SHA", 20, 64, 9);
        T = new cl_12(JCP.DIGEST_SHA256, 32, 64, 9);
        U = new cl_12(JCP.DIGEST_SHA384, 48, 128, 17);
        V = new cl_12("GOST28147", 4, 32, 0);
        W = new cl_12(JCP.GOST_K_IMIT_NAME, 16, 32, 0);
        Z = new cl_12(JCP.GOST_M_IMIT_NAME, 8, 32, 0);
        F = new HashMap();
        G = new HashMap();
        synchronized (cl_39.class) {
        }
        d("SSL_NULL_WITH_NULL_NULL", 0, 1, cl_11.a, cl_9Var, false);
        int i2 = cl_84.y.n;
        cl_84 cl_84Var = cl_84.z;
        int i3 = cl_84Var.n;
        if (cpSSLConfig.isUseNewTLS()) {
            cl_11 cl_11Var = cl_11.t;
            cl_13 cl_13Var = cl_13.P_SHA256;
            e("TLS_GOSTR341112_256_WITH_KUZNYECHIK_CTR_OMAC", 49408, 599, cl_11Var, cl_9Var3, true, i3, 65535 < cl_84Var.n ? cl_13.P_NONE : cl_13Var);
            e("TLS_GOSTR341112_256_WITH_MAGMA_CTR_OMAC", 49409, 598, cl_11.u, cl_9Var4, true, i3, 65535 < cl_84Var.n ? cl_13.P_NONE : cl_13Var);
            cl_11 cl_11Var2 = cl_11.s;
            if (65535 < cl_84Var.n) {
                cl_13Var = cl_13.P_NONE;
            }
            i = 597;
            e("TLS_CIPHER_2012_IANA", 49410, 597, cl_11Var2, cl_9Var2, true, i3, cl_13Var);
        } else {
            i = 600;
        }
        d("TLS_CIPHER_2012", 65413, i - 1, cl_11.r, cl_9Var2, true);
        d("TLS_CIPHER_2001", HProv.PP_SECURITY_LEVEL, i - 2, cl_11.q, cl_9Var2, true);
        d("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255, i - 3, cl_11.p, cl_9Var, true);
        a0 = b(0, 0);
        b0 = b(0, 255);
    }

    public cl_8(String str, int i, int i2, cl_11 cl_11Var, cl_9 cl_9Var, boolean z, int i3, cl_13 cl_13Var) {
        cl_12 cl_12Var;
        this.a = str;
        this.b = i;
        this.c = i2;
        this.w = cl_11Var;
        this.x = cl_9Var;
        this.A = cl_9Var.j;
        if (str.endsWith("_MD5")) {
            cl_12Var = R;
        } else if (str.endsWith("_SHA")) {
            cl_12Var = S;
        } else if (str.endsWith("_SHA256")) {
            cl_12Var = T;
        } else if (str.endsWith("_SHA384")) {
            cl_12Var = U;
        } else {
            boolean endsWith = str.endsWith("_NULL");
            cl_12 cl_12Var2 = Q;
            if (endsWith || str.endsWith("_SCSV")) {
                this.y = cl_12Var2;
                this.B = cl_11Var.w & z & cl_9Var.e;
                this.C = 65535;
                this.D = i3;
                this.z = cl_13Var;
            }
            if (str.startsWith("TLS_CIPHER_")) {
                cl_12Var = V;
            } else if (str.startsWith("TLS_GOSTR341112_256_WITH_K")) {
                cl_12Var = W;
            } else {
                if (!str.startsWith("TLS_GOSTR341112_256_WITH_M")) {
                    ny61.g("Unknown MAC algorithm for ciphersuite ".concat(str));
                    throw null;
                }
                cl_12Var = Z;
            }
        }
        this.y = cl_12Var;
        this.B = cl_11Var.w & z & cl_9Var.e;
        this.C = 65535;
        this.D = i3;
        this.z = cl_13Var;
    }

    public static cl_8 b(int i, int i2) {
        int i3 = i & 255;
        int i4 = i2 & 255;
        int i5 = (i3 << 8) | i4;
        cl_8 cl_8Var = (cl_8) F.get(Integer.valueOf(i5));
        return cl_8Var == null ? new cl_8(b64.l("Unknown 0x", Integer.toString(i3, 16), ":0x", Integer.toString(i4, 16)), i5) : cl_8Var;
    }

    public static cl_8 c(String str) {
        String str2;
        if (str != null) {
            cl_8 cl_8Var = (cl_8) G.get(str);
            if (cl_8Var != null && cl_8Var.B) {
                return cl_8Var;
            }
            str2 = "Unsupported ciphersuite ".concat(str);
        } else {
            str2 = "Name must not be null";
        }
        ny61.g(str2);
        return null;
    }

    public static void e(String str, int i, int i2, cl_11 cl_11Var, cl_9 cl_9Var, boolean z, int i3, cl_13 cl_13Var) {
        boolean z2;
        boolean z3;
        cl_8 cl_8Var = new cl_8(str, i, i2, cl_11Var, cl_9Var, z, i3, cl_13Var);
        z2 = cl_11Var.H;
        if (z2) {
            z3 = cl_11Var.I;
            if (!z3) {
                try {
                    AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(JCP.GOST_PARAM_VALIDATOR_NAME, cpSSLConfig.getDefaultDigestSignatureSSLProvider());
                    algorithmParameters.init(Array.toByteArray(cl_11Var.j()));
                    if (algorithmParameters.getEncoded() == null) {
                        return;
                    }
                } catch (IOException e) {
                    ny61.j(e);
                    return;
                } catch (NoSuchAlgorithmException e2) {
                    ny61.j(e2);
                    return;
                } catch (NoSuchProviderException e3) {
                    ny61.j(e3);
                    return;
                }
            }
        }
        if (F.put(Integer.valueOf(i), cl_8Var) != null || (cl_8Var.B && G.put(str, cl_8Var) != null)) {
            kbs.g(oyr.k(i, "Duplicate ciphersuite definition: ", Extension.FIX_SPACE, str));
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(cl_8 cl_8Var) {
        return cl_8Var.c - this.c;
    }

    public boolean d() {
        String str = this.a;
        return str.equalsIgnoreCase("TLS_GOSTR341112_256_WITH_KUZNYECHIK_CTR_OMAC") || str.equalsIgnoreCase("TLS_GOSTR341112_256_WITH_MAGMA_CTR_OMAC") || str.equalsIgnoreCase("TLS_CIPHER_2012_IANA");
    }

    public final boolean f() {
        boolean booleanValue;
        if (!this.B || !this.w.c()) {
            return false;
        }
        cl_9 cl_9Var = this.x;
        if (!cl_9Var.e) {
            booleanValue = false;
        } else if (cl_9Var == P || cl_9Var.k == cl_10.c) {
            synchronized (cl_9.class) {
                Boolean bool = (Boolean) cl_9.l.get(cl_9Var);
                if (bool == null) {
                    int i = cl_9Var.f * 8;
                    if (i > 128) {
                        try {
                            if (Cipher.getMaxAllowedKeyLength(cl_9Var.b) < i) {
                                bool = Boolean.FALSE;
                            }
                        } catch (Exception unused) {
                            bool = Boolean.FALSE;
                        }
                    }
                    if (bool == null) {
                        Boolean bool2 = Boolean.FALSE;
                        cl_7 cl_7Var = null;
                        try {
                            try {
                                SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[cl_9Var.g], cl_9Var.c);
                                IvParameterSpec ivParameterSpec = cl_9Var.k == cl_10.c ? new IvParameterSpec(new byte[cl_9Var.i]) : new IvParameterSpec(new byte[cl_9Var.h]);
                                cl_84 cl_84Var = cl_84.b;
                                cl_7Var = cl_9Var.a(secretKeySpec, ivParameterSpec, cl_9.m, null, 0, true);
                                bool = Boolean.TRUE;
                                cl_7Var.d();
                            } catch (Throwable th) {
                                if (cl_7Var != null) {
                                    cl_7Var.d();
                                }
                                throw th;
                            }
                        } catch (NoSuchAlgorithmException unused2) {
                            if (cl_7Var != null) {
                                cl_7Var.d();
                            }
                            bool = bool2;
                        }
                    }
                    cl_9.l.put(cl_9Var, bool);
                }
                booleanValue = bool.booleanValue();
            }
        } else {
            booleanValue = true;
        }
        return booleanValue;
    }

    public String toString() {
        return this.a;
    }

    public static void d(String str, int i, int i2, cl_11 cl_11Var, cl_9 cl_9Var, boolean z) {
        cl_13 cl_13Var = cl_13.P_SHA256;
        if (65535 < cl_84.z.n) {
            cl_13Var = cl_13.P_NONE;
        }
        e(str, i, i2, cl_11Var, cl_9Var, z, 0, cl_13Var);
    }

    public cl_8(String str, int i) {
        this.a = str;
        this.b = i;
        this.B = false;
        this.c = 0;
        this.w = null;
        this.x = null;
        this.y = null;
        this.A = false;
        this.C = 65535;
        this.D = 0;
        this.z = cl_13.P_NONE;
    }
}
