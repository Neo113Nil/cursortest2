package com.anythink.core.common.n.b.a.k;

import D.x;
import com.anythink.core.common.n.c.c;
import com.anythink.core.common.n.c.f;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    static final String f16203a = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";

    /* renamed from: b, reason: collision with root package name */
    static final int f16204b = 128;

    /* renamed from: c, reason: collision with root package name */
    static final int f16205c = 64;

    /* renamed from: d, reason: collision with root package name */
    static final int f16206d = 32;

    /* renamed from: e, reason: collision with root package name */
    static final int f16207e = 16;

    /* renamed from: f, reason: collision with root package name */
    static final int f16208f = 15;

    /* renamed from: g, reason: collision with root package name */
    static final int f16209g = 8;

    /* renamed from: h, reason: collision with root package name */
    static final int f16210h = 128;
    static final int i = 127;

    /* renamed from: j, reason: collision with root package name */
    static final int f16211j = 0;

    /* renamed from: k, reason: collision with root package name */
    static final int f16212k = 1;

    /* renamed from: l, reason: collision with root package name */
    static final int f16213l = 2;

    /* renamed from: m, reason: collision with root package name */
    static final int f16214m = 8;

    /* renamed from: n, reason: collision with root package name */
    static final int f16215n = 9;

    /* renamed from: o, reason: collision with root package name */
    static final int f16216o = 10;

    /* renamed from: p, reason: collision with root package name */
    static final long f16217p = 125;

    /* renamed from: q, reason: collision with root package name */
    static final long f16218q = 123;

    /* renamed from: r, reason: collision with root package name */
    static final int f16219r = 126;

    /* renamed from: s, reason: collision with root package name */
    static final long f16220s = 65535;

    /* renamed from: t, reason: collision with root package name */
    static final int f16221t = 127;

    /* renamed from: u, reason: collision with root package name */
    static final int f16222u = 1001;

    /* renamed from: v, reason: collision with root package name */
    static final int f16223v = 1005;

    private b() {
        throw new AssertionError("No instances.");
    }

    public static void a(c.a aVar, byte[] bArr) {
        int length = bArr.length;
        int i4 = 0;
        do {
            byte[] bArr2 = aVar.f16640d;
            int i6 = aVar.f16641e;
            int i9 = aVar.f16642f;
            while (i6 < i9) {
                int i10 = i4 % length;
                bArr2[i6] = (byte) (bArr2[i6] ^ bArr[i10]);
                i6++;
                i4 = i10 + 1;
            }
        } while (aVar.a() != -1);
    }

    public static void b(int i4) {
        String a9 = a(i4);
        if (a9 != null) {
            throw new IllegalArgumentException(a9);
        }
    }

    public static String a(int i4) {
        if (i4 < 1000 || i4 >= 5000) {
            return "Code must be in range [1000,5000): ".concat(String.valueOf(i4));
        }
        if ((i4 < 1004 || i4 > 1006) && (i4 < 1012 || i4 > 2999)) {
            return null;
        }
        return x.j(i4, "Code ", " is reserved and may not be used.");
    }

    private static String a(String str) {
        return f.a(str + f16203a).d().b();
    }
}
