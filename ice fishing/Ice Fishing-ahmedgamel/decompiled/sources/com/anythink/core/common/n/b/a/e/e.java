package com.anythink.core.common.n.b.a.e;

import java.io.IOException;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    static final int f15162b = 16384;

    /* renamed from: c, reason: collision with root package name */
    static final byte f15163c = 0;

    /* renamed from: d, reason: collision with root package name */
    static final byte f15164d = 1;

    /* renamed from: e, reason: collision with root package name */
    static final byte f15165e = 2;

    /* renamed from: f, reason: collision with root package name */
    static final byte f15166f = 3;

    /* renamed from: g, reason: collision with root package name */
    static final byte f15167g = 4;

    /* renamed from: h, reason: collision with root package name */
    static final byte f15168h = 5;
    static final byte i = 6;

    /* renamed from: j, reason: collision with root package name */
    static final byte f15169j = 7;

    /* renamed from: k, reason: collision with root package name */
    static final byte f15170k = 8;

    /* renamed from: l, reason: collision with root package name */
    static final byte f15171l = 9;

    /* renamed from: m, reason: collision with root package name */
    static final byte f15172m = 0;

    /* renamed from: n, reason: collision with root package name */
    static final byte f15173n = 1;

    /* renamed from: o, reason: collision with root package name */
    static final byte f15174o = 1;

    /* renamed from: p, reason: collision with root package name */
    static final byte f15175p = 4;

    /* renamed from: q, reason: collision with root package name */
    static final byte f15176q = 4;

    /* renamed from: r, reason: collision with root package name */
    static final byte f15177r = 8;

    /* renamed from: s, reason: collision with root package name */
    static final byte f15178s = 32;

    /* renamed from: t, reason: collision with root package name */
    static final byte f15179t = 32;

    /* renamed from: a, reason: collision with root package name */
    static final com.anythink.core.common.n.c.f f15161a = com.anythink.core.common.n.c.f.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: w, reason: collision with root package name */
    private static final String[] f15182w = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: u, reason: collision with root package name */
    static final String[] f15180u = new String[64];

    /* renamed from: v, reason: collision with root package name */
    static final String[] f15181v = new String[256];

    static {
        int i6 = 0;
        int i9 = 0;
        while (true) {
            String[] strArr = f15181v;
            if (i9 >= strArr.length) {
                break;
            }
            strArr[i9] = com.anythink.core.common.n.b.a.c.a("%8s", Integer.toBinaryString(i9)).replace(' ', '0');
            i9++;
        }
        String[] strArr2 = f15180u;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i10 = 0; i10 <= 0; i10++) {
            int i11 = iArr[i10];
            String[] strArr3 = f15180u;
            strArr3[i11 | 8] = u1.h.g(new StringBuilder(), strArr3[i11], "|PADDED");
        }
        String[] strArr4 = f15180u;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr2[i12];
            for (int i14 = 0; i14 <= 0; i14++) {
                int i15 = iArr[i14];
                String[] strArr5 = f15180u;
                int i16 = i15 | i13;
                strArr5[i16] = strArr5[i15] + '|' + strArr5[i13];
                StringBuilder sb = new StringBuilder();
                sb.append(strArr5[i15]);
                sb.append('|');
                strArr5[i16 | 8] = u1.h.g(sb, strArr5[i13], "|PADDED");
            }
        }
        while (true) {
            String[] strArr6 = f15180u;
            if (i6 >= strArr6.length) {
                return;
            }
            if (strArr6[i6] == null) {
                strArr6[i6] = f15181v[i6];
            }
            i6++;
        }
    }

    private e() {
    }

    public static IllegalArgumentException a(String str, Object... objArr) {
        throw new IllegalArgumentException(com.anythink.core.common.n.b.a.c.a(str, objArr));
    }

    public static IOException b(String str, Object... objArr) {
        throw new IOException(com.anythink.core.common.n.b.a.c.a(str, objArr));
    }

    public static String a(boolean z3, int i6, int i9, byte b9, byte b10) {
        String str;
        String[] strArr = f15182w;
        String a9 = b9 < strArr.length ? strArr[b9] : com.anythink.core.common.n.b.a.c.a("0x%02x", Byte.valueOf(b9));
        if (b10 == 0) {
            str = "";
        } else {
            if (b9 != 2 && b9 != 3) {
                if (b9 == 4 || b9 == 6) {
                    str = b10 == 1 ? "ACK" : f15181v[b10];
                } else if (b9 != 7 && b9 != 8) {
                    String[] strArr2 = f15180u;
                    String str2 = b10 < strArr2.length ? strArr2[b10] : f15181v[b10];
                    str = (b9 != 5 || (b10 & 4) == 0) ? (b9 != 0 || (b10 & 32) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED") : str2.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            str = f15181v[b10];
        }
        return com.anythink.core.common.n.b.a.c.a("%s 0x%08x %5d %-13s %s", z3 ? "<<" : ">>", Integer.valueOf(i6), Integer.valueOf(i9), a9, str);
    }

    private static String a(byte b9, byte b10) {
        if (b10 == 0) {
            return "";
        }
        if (b9 != 2 && b9 != 3) {
            if (b9 == 4 || b9 == 6) {
                return b10 == 1 ? "ACK" : f15181v[b10];
            }
            if (b9 != 7 && b9 != 8) {
                String[] strArr = f15180u;
                String str = b10 < strArr.length ? strArr[b10] : f15181v[b10];
                if (b9 != 5 || (b10 & 4) == 0) {
                    return (b9 != 0 || (b10 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED");
                }
                return str.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return f15181v[b10];
    }
}
