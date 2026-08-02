package com.anythink.core.common.n.b.a.e;

import com.google.android.gms.internal.ads.Wv;
import java.io.IOException;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    static final int f15949b = 16384;

    /* renamed from: c, reason: collision with root package name */
    static final byte f15950c = 0;

    /* renamed from: d, reason: collision with root package name */
    static final byte f15951d = 1;

    /* renamed from: e, reason: collision with root package name */
    static final byte f15952e = 2;

    /* renamed from: f, reason: collision with root package name */
    static final byte f15953f = 3;

    /* renamed from: g, reason: collision with root package name */
    static final byte f15954g = 4;

    /* renamed from: h, reason: collision with root package name */
    static final byte f15955h = 5;
    static final byte i = 6;

    /* renamed from: j, reason: collision with root package name */
    static final byte f15956j = 7;

    /* renamed from: k, reason: collision with root package name */
    static final byte f15957k = 8;

    /* renamed from: l, reason: collision with root package name */
    static final byte f15958l = 9;

    /* renamed from: m, reason: collision with root package name */
    static final byte f15959m = 0;

    /* renamed from: n, reason: collision with root package name */
    static final byte f15960n = 1;

    /* renamed from: o, reason: collision with root package name */
    static final byte f15961o = 1;

    /* renamed from: p, reason: collision with root package name */
    static final byte f15962p = 4;

    /* renamed from: q, reason: collision with root package name */
    static final byte f15963q = 4;

    /* renamed from: r, reason: collision with root package name */
    static final byte f15964r = 8;

    /* renamed from: s, reason: collision with root package name */
    static final byte f15965s = 32;

    /* renamed from: t, reason: collision with root package name */
    static final byte f15966t = 32;

    /* renamed from: a, reason: collision with root package name */
    static final com.anythink.core.common.n.c.f f15948a = com.anythink.core.common.n.c.f.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: w, reason: collision with root package name */
    private static final String[] f15969w = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: u, reason: collision with root package name */
    static final String[] f15967u = new String[64];

    /* renamed from: v, reason: collision with root package name */
    static final String[] f15968v = new String[256];

    static {
        int i4 = 0;
        int i6 = 0;
        while (true) {
            String[] strArr = f15968v;
            if (i6 >= strArr.length) {
                break;
            }
            strArr[i6] = com.anythink.core.common.n.b.a.c.a("%8s", Integer.toBinaryString(i6)).replace(' ', '0');
            i6++;
        }
        String[] strArr2 = f15967u;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i9 = 0; i9 <= 0; i9++) {
            int i10 = iArr[i9];
            String[] strArr3 = f15967u;
            strArr3[i10 | 8] = Wv.i(new StringBuilder(), strArr3[i10], "|PADDED");
        }
        String[] strArr4 = f15967u;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = iArr2[i11];
            for (int i13 = 0; i13 <= 0; i13++) {
                int i14 = iArr[i13];
                String[] strArr5 = f15967u;
                int i15 = i14 | i12;
                strArr5[i15] = strArr5[i14] + '|' + strArr5[i12];
                StringBuilder sb = new StringBuilder();
                sb.append(strArr5[i14]);
                sb.append('|');
                strArr5[i15 | 8] = Wv.i(sb, strArr5[i12], "|PADDED");
            }
        }
        while (true) {
            String[] strArr6 = f15967u;
            if (i4 >= strArr6.length) {
                return;
            }
            if (strArr6[i4] == null) {
                strArr6[i4] = f15968v[i4];
            }
            i4++;
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

    public static String a(boolean z6, int i4, int i6, byte b9, byte b10) {
        String str;
        String[] strArr = f15969w;
        String a9 = b9 < strArr.length ? strArr[b9] : com.anythink.core.common.n.b.a.c.a("0x%02x", Byte.valueOf(b9));
        if (b10 == 0) {
            str = "";
        } else {
            if (b9 != 2 && b9 != 3) {
                if (b9 == 4 || b9 == 6) {
                    str = b10 == 1 ? "ACK" : f15968v[b10];
                } else if (b9 != 7 && b9 != 8) {
                    String[] strArr2 = f15967u;
                    String str2 = b10 < strArr2.length ? strArr2[b10] : f15968v[b10];
                    str = (b9 != 5 || (b10 & 4) == 0) ? (b9 != 0 || (b10 & 32) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED") : str2.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            str = f15968v[b10];
        }
        return com.anythink.core.common.n.b.a.c.a("%s 0x%08x %5d %-13s %s", z6 ? "<<" : ">>", Integer.valueOf(i4), Integer.valueOf(i6), a9, str);
    }

    private static String a(byte b9, byte b10) {
        if (b10 == 0) {
            return "";
        }
        if (b9 != 2 && b9 != 3) {
            if (b9 == 4 || b9 == 6) {
                return b10 == 1 ? "ACK" : f15968v[b10];
            }
            if (b9 != 7 && b9 != 8) {
                String[] strArr = f15967u;
                String str = b10 < strArr.length ? strArr[b10] : f15968v[b10];
                if (b9 != 5 || (b10 & 4) == 0) {
                    return (b9 != 0 || (b10 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED");
                }
                return str.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return f15968v[b10];
    }
}
