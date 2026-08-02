package ru.CryptoPro.ssl;

import defpackage.ny61;
import defpackage.oyr;
import java.security.CryptoPrimitive;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class cl_84 implements Comparable {
    public static final cl_84 A;
    public static final cl_84 B;
    public static final cl_84 C;
    public static final cl_84 D;
    public static final Set E;
    public static final cl_84 b = new cl_84(-1, JCP.RAW_PREFIX);
    public static final cl_84 c = new cl_84(2, "SSLv2Hello");
    public static final cl_84 w = new cl_84(768, "SSLv3");
    public static final cl_84 x;
    public static final cl_84 y;
    public static final cl_84 z;
    public final String a;
    public final int n;
    public final byte o;
    public final byte p;

    static {
        cl_84 cl_84Var = new cl_84(769, "TLSv1");
        x = cl_84Var;
        cl_84 cl_84Var2 = new cl_84(770, "TLSv1.1");
        y = cl_84Var2;
        cl_84 cl_84Var3 = new cl_84(771, "TLSv1.2");
        z = cl_84Var3;
        synchronized (cl_39.class) {
        }
        A = cl_84Var;
        B = cl_84Var3;
        C = cl_84Var3;
        D = cl_84Var;
        HashSet hashSet = new HashSet(5);
        cl_84[] cl_84VarArr = {cl_84Var, cl_84Var2, cl_84Var3};
        for (int i = 0; i < 3; i++) {
            cl_84 cl_84Var4 = cl_84VarArr[i];
            if (cl_90.g.permits(EnumSet.of(CryptoPrimitive.KEY_AGREEMENT), cl_84Var4.a, null)) {
                hashSet.add(cl_84Var4);
            }
        }
        E = Collections.unmodifiableSet(hashSet);
    }

    public cl_84(int i, String str) {
        this.n = i;
        this.a = str;
        this.o = (byte) (i >>> 8);
        this.p = (byte) (i & 255);
    }

    public static cl_84 a(int i, int i2) {
        int i3 = ((i & 255) << 8) | (i2 & 255);
        cl_84 cl_84Var = w;
        if (i3 == cl_84Var.n) {
            return cl_84Var;
        }
        cl_84 cl_84Var2 = x;
        if (i3 == cl_84Var2.n) {
            return cl_84Var2;
        }
        cl_84 cl_84Var3 = y;
        if (i3 == cl_84Var3.n) {
            return cl_84Var3;
        }
        cl_84 cl_84Var4 = z;
        if (i3 == cl_84Var4.n) {
            return cl_84Var4;
        }
        cl_84 cl_84Var5 = c;
        return i3 == cl_84Var5.n ? cl_84Var5 : new cl_84(i3, oyr.h((i3 >>> 8) & 255, i3 & 255, "Unknown-", Extension.DOT_CHAR));
    }

    public static cl_84 b(String str) {
        if (str == null) {
            ny61.g("Protocol cannot be null");
            return null;
        }
        cl_84 cl_84Var = w;
        if (str.equals(cl_84Var.a)) {
            return cl_84Var;
        }
        cl_84 cl_84Var2 = x;
        if (!str.equals(cl_84Var2.a) && !str.equals("GostTLS")) {
            cl_84Var2 = y;
            if (!str.equals(cl_84Var2.a) && !str.equals("GostTLSv1.1")) {
                cl_84Var2 = z;
                if (!str.equals(cl_84Var2.a) && !str.equals("GostTLSv1.2")) {
                    cl_84 cl_84Var3 = c;
                    if (str.equals(cl_84Var3.a)) {
                        return cl_84Var3;
                    }
                    ny61.g(str);
                    return null;
                }
            }
        }
        return cl_84Var2;
    }

    public String toString() {
        return this.a;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(cl_84 cl_84Var) {
        return this.n - cl_84Var.n;
    }
}
