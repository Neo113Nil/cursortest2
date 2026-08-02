package com.google.android.gms.internal.ads;

import java.util.Arrays;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class KJ {

    /* renamed from: h, reason: collision with root package name */
    public static final KJ f26648h;

    /* renamed from: a, reason: collision with root package name */
    public final int f26649a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26650b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26651c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f26652d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26653e;

    /* renamed from: f, reason: collision with root package name */
    public final int f26654f;

    /* renamed from: g, reason: collision with root package name */
    public int f26655g;

    static {
        int i = -1;
        f26648h = new KJ(1, 2, 3, null, i, i);
        String str = AbstractC3182eu.f30782a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ KJ(int i, int i4, int i6, byte[] bArr, int i9, int i10) {
        this.f26649a = i;
        this.f26650b = i4;
        this.f26651c = i6;
        this.f26652d = bArr;
        this.f26653e = i9;
        this.f26654f = i10;
    }

    public static boolean a(KJ kj) {
        if (kj == null) {
            return true;
        }
        int i = kj.f26649a;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i4 = kj.f26650b;
        if (i4 != -1 && i4 != 2) {
            return false;
        }
        int i6 = kj.f26651c;
        if ((i6 != -1 && i6 != 3) || kj.f26652d != null) {
            return false;
        }
        int i9 = kj.f26654f;
        if (i9 != -1 && i9 != 8) {
            return false;
        }
        int i10 = kj.f26653e;
        return i10 == -1 || i10 == 8;
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
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? D.x.k(i, "Undefined color space ", new StringBuilder(String.valueOf(i).length() + 22)) : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String f(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? D.x.k(i, "Undefined color transfer ", new StringBuilder(String.valueOf(i).length() + 25)) : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public static String g(int i) {
        return i != -1 ? i != 1 ? i != 2 ? D.x.k(i, "Undefined color range ", new StringBuilder(String.valueOf(i).length() + 22)) : "Limited range" : "Full range" : "Unset color range";
    }

    public final boolean d() {
        return (this.f26649a == -1 || this.f26650b == -1 || this.f26651c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && KJ.class == obj.getClass()) {
            KJ kj = (KJ) obj;
            if (this.f26649a == kj.f26649a && this.f26650b == kj.f26650b && this.f26651c == kj.f26651c && Arrays.equals(this.f26652d, kj.f26652d) && this.f26653e == kj.f26653e && this.f26654f == kj.f26654f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f26655g;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((Arrays.hashCode(this.f26652d) + ((((((this.f26649a + 527) * 31) + this.f26650b) * 31) + this.f26651c) * 31)) * 31) + this.f26653e) * 31) + this.f26654f;
        this.f26655g = hashCode;
        return hashCode;
    }

    public final String toString() {
        String e9 = e(this.f26649a);
        String g9 = g(this.f26650b);
        String f2 = f(this.f26651c);
        int i = this.f26653e;
        String e10 = i != -1 ? AbstractC5128c.e(i, "bit Luma", new StringBuilder(String.valueOf(i).length() + 8)) : "NA";
        int i4 = this.f26654f;
        String e11 = i4 != -1 ? AbstractC5128c.e(i4, "bit Chroma", new StringBuilder(String.valueOf(i4).length() + 10)) : "NA";
        boolean z6 = this.f26652d != null;
        StringBuilder sb = new StringBuilder(AbstractC5128c.j(AbstractC5128c.j(AbstractC5128c.j(AbstractC5128c.j(e9.length() + 12, 2, g9) + f2.length() + 2, 2, String.valueOf(z6)), 2, e10), 1, e11));
        sb.append("ColorInfo(");
        sb.append(e9);
        sb.append(", ");
        sb.append(g9);
        sb.append(", ");
        sb.append(f2);
        sb.append(", ");
        sb.append(z6);
        AbstractC5128c.h(sb, ", ", e10, ", ", e11);
        sb.append(")");
        return sb.toString();
    }
}
