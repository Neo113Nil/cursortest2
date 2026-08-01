package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class KJ {

    /* renamed from: h, reason: collision with root package name */
    public static final KJ f25896h;

    /* renamed from: a, reason: collision with root package name */
    public final int f25897a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25898b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25899c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f25900d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25901e;

    /* renamed from: f, reason: collision with root package name */
    public final int f25902f;

    /* renamed from: g, reason: collision with root package name */
    public int f25903g;

    static {
        int i = -1;
        f25896h = new KJ(1, 2, 3, null, i, i);
        String str = AbstractC3159eu.f29993a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ KJ(int i, int i6, int i9, byte[] bArr, int i10, int i11) {
        this.f25897a = i;
        this.f25898b = i6;
        this.f25899c = i9;
        this.f25900d = bArr;
        this.f25901e = i10;
        this.f25902f = i11;
    }

    public static boolean a(KJ kj) {
        if (kj == null) {
            return true;
        }
        int i = kj.f25897a;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i6 = kj.f25898b;
        if (i6 != -1 && i6 != 2) {
            return false;
        }
        int i9 = kj.f25899c;
        if ((i9 != -1 && i9 != 3) || kj.f25900d != null) {
            return false;
        }
        int i10 = kj.f25902f;
        if (i10 != -1 && i10 != 8) {
            return false;
        }
        int i11 = kj.f25901e;
        return i11 == -1 || i11 == 8;
    }

    public static int b(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int c(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public static String e(int i) {
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? D.y.m(i, "Undefined color space ", new StringBuilder(String.valueOf(i).length() + 22)) : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String f(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? D.y.m(i, "Undefined color transfer ", new StringBuilder(String.valueOf(i).length() + 25)) : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static String g(int i) {
        return i != -1 ? i != 1 ? i != 2 ? D.y.m(i, "Undefined color range ", new StringBuilder(String.valueOf(i).length() + 22)) : "Limited range" : "Full range" : "Unset color range";
    }

    public final boolean d() {
        return (this.f25897a == -1 || this.f25898b == -1 || this.f25899c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && KJ.class == obj.getClass()) {
            KJ kj = (KJ) obj;
            if (this.f25897a == kj.f25897a && this.f25898b == kj.f25898b && this.f25899c == kj.f25899c && Arrays.equals(this.f25900d, kj.f25900d) && this.f25901e == kj.f25901e && this.f25902f == kj.f25902f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f25903g;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((Arrays.hashCode(this.f25900d) + ((((((this.f25897a + 527) * 31) + this.f25898b) * 31) + this.f25899c) * 31)) * 31) + this.f25901e) * 31) + this.f25902f;
        this.f25903g = hashCode;
        return hashCode;
    }

    public final String toString() {
        String e9 = e(this.f25897a);
        String g4 = g(this.f25898b);
        String f3 = f(this.f25899c);
        int i = this.f25901e;
        String e10 = i != -1 ? u1.h.e(i, "bit Luma", new StringBuilder(String.valueOf(i).length() + 8)) : "NA";
        int i6 = this.f25902f;
        String e11 = i6 != -1 ? u1.h.e(i6, "bit Chroma", new StringBuilder(String.valueOf(i6).length() + 10)) : "NA";
        boolean z3 = this.f25900d != null;
        StringBuilder sb = new StringBuilder(u1.h.a(u1.h.a(u1.h.a(u1.h.a(e9.length() + 12, 2, g4) + f3.length() + 2, 2, String.valueOf(z3)), 2, e10), 1, e11));
        sb.append("ColorInfo(");
        sb.append(e9);
        sb.append(", ");
        sb.append(g4);
        sb.append(", ");
        sb.append(f3);
        sb.append(", ");
        sb.append(z3);
        u1.h.i(sb, ", ", e10, ", ", e11);
        sb.append(")");
        return sb.toString();
    }
}
