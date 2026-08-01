package com.anythink.core.common.n.b.a.k;

import D.y;
import com.anythink.core.common.n.c.c;
import com.anythink.core.common.n.c.f;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    static final String f15416a = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";

    /* renamed from: b, reason: collision with root package name */
    static final int f15417b = 128;

    /* renamed from: c, reason: collision with root package name */
    static final int f15418c = 64;

    /* renamed from: d, reason: collision with root package name */
    static final int f15419d = 32;

    /* renamed from: e, reason: collision with root package name */
    static final int f15420e = 16;

    /* renamed from: f, reason: collision with root package name */
    static final int f15421f = 15;

    /* renamed from: g, reason: collision with root package name */
    static final int f15422g = 8;

    /* renamed from: h, reason: collision with root package name */
    static final int f15423h = 128;
    static final int i = 127;

    /* renamed from: j, reason: collision with root package name */
    static final int f15424j = 0;

    /* renamed from: k, reason: collision with root package name */
    static final int f15425k = 1;

    /* renamed from: l, reason: collision with root package name */
    static final int f15426l = 2;

    /* renamed from: m, reason: collision with root package name */
    static final int f15427m = 8;

    /* renamed from: n, reason: collision with root package name */
    static final int f15428n = 9;

    /* renamed from: o, reason: collision with root package name */
    static final int f15429o = 10;

    /* renamed from: p, reason: collision with root package name */
    static final long f15430p = 125;

    /* renamed from: q, reason: collision with root package name */
    static final long f15431q = 123;

    /* renamed from: r, reason: collision with root package name */
    static final int f15432r = 126;

    /* renamed from: s, reason: collision with root package name */
    static final long f15433s = 65535;

    /* renamed from: t, reason: collision with root package name */
    static final int f15434t = 127;

    /* renamed from: u, reason: collision with root package name */
    static final int f15435u = 1001;

    /* renamed from: v, reason: collision with root package name */
    static final int f15436v = 1005;

    private b() {
        throw new AssertionError("No instances.");
    }

    public static void a(c.a aVar, byte[] bArr) {
        int length = bArr.length;
        int i6 = 0;
        do {
            byte[] bArr2 = aVar.f15853d;
            int i9 = aVar.f15854e;
            int i10 = aVar.f15855f;
            while (i9 < i10) {
                int i11 = i6 % length;
                bArr2[i9] = (byte) (bArr2[i9] ^ bArr[i11]);
                i9++;
                i6 = i11 + 1;
            }
        } while (aVar.a() != -1);
    }

    public static void b(int i6) {
        String a9 = a(i6);
        if (a9 != null) {
            throw new IllegalArgumentException(a9);
        }
    }

    public static String a(int i6) {
        if (i6 < 1000 || i6 >= 5000) {
            return "Code must be in range [1000,5000): ".concat(String.valueOf(i6));
        }
        if ((i6 < 1004 || i6 > 1006) && (i6 < 1012 || i6 > 2999)) {
            return null;
        }
        return y.k(i6, "Code ", " is reserved and may not be used.");
    }

    private static String a(String str) {
        return f.a(str + f15416a).d().b();
    }
}
