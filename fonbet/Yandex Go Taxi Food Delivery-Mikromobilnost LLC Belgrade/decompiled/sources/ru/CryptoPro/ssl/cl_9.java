package ru.CryptoPro.ssl;

import defpackage.ny61;
import defpackage.oyr;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashMap;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes4.dex */
final class cl_9 {
    public static final HashMap l = new HashMap(8);
    public static final SecureRandom m;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final boolean j;
    public final cl_10 k;

    static {
        try {
            m = cl_73.h();
        } catch (KeyManagementException e) {
            ny61.j(e);
        }
    }

    public cl_9(String str, cl_10 cl_10Var, int i, int i2, int i3, boolean z) {
        this.b = str;
        String[] split = str.split("/");
        String str2 = split[0];
        this.c = str2;
        this.k = cl_10Var;
        this.d = split.length > 1 ? split[1] : null;
        if (split.length > 1) {
            String str3 = split[1];
        }
        StringBuilder v = oyr.v(str2, "/");
        v.append(i << 3);
        this.a = v.toString();
        this.f = i;
        this.h = i2;
        this.i = i3;
        this.e = z;
        this.g = i;
        this.j = false;
    }

    public final cl_7 a(SecretKey secretKey, IvParameterSpec ivParameterSpec, SecureRandom secureRandom, cl_5 cl_5Var, int i, boolean z) {
        cl_7 cl_7Var = cl_7.i;
        if (this.e) {
            return this == cl_8.H ? cl_7.i : new cl_7(this, secretKey, ivParameterSpec, secureRandom, cl_5Var, i, z);
        }
        throw new NoSuchAlgorithmException("Unsupported cipher " + this);
    }

    public String toString() {
        return this.a;
    }

    public cl_9(String str, cl_10 cl_10Var, int i, int i2, int i3, boolean z, int i4) {
        this.b = str;
        String[] split = str.split("/");
        String str2 = split[0];
        this.c = str2;
        this.k = cl_10Var;
        this.d = split.length > 1 ? split[1] : null;
        if (split.length > 1) {
            String str3 = split[1];
        }
        StringBuilder v = oyr.v(str2, "/");
        v.append(i << 3);
        this.a = v.toString();
        this.f = i;
        this.h = i3;
        this.i = 0;
        this.e = z;
        this.g = i2;
        this.j = true;
    }
}
