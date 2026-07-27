package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3082dN {

    /* renamed from: j, reason: collision with root package name */
    public static final C3082dN f29748j = new C3082dN(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: k, reason: collision with root package name */
    public static final C3082dN f29749k = new C3082dN(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: l, reason: collision with root package name */
    public static final C3082dN f29750l = new C3082dN(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: m, reason: collision with root package name */
    public static final C3082dN f29751m = new C3082dN(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a, reason: collision with root package name */
    public final double f29752a;

    /* renamed from: b, reason: collision with root package name */
    public final double f29753b;

    /* renamed from: c, reason: collision with root package name */
    public final double f29754c;

    /* renamed from: d, reason: collision with root package name */
    public final double f29755d;

    /* renamed from: e, reason: collision with root package name */
    public final double f29756e;

    /* renamed from: f, reason: collision with root package name */
    public final double f29757f;

    /* renamed from: g, reason: collision with root package name */
    public final double f29758g;

    /* renamed from: h, reason: collision with root package name */
    public final double f29759h;
    public final double i;

    public C3082dN(double d2, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f29752a = d12;
        this.f29753b = d13;
        this.f29754c = d14;
        this.f29755d = d2;
        this.f29756e = d9;
        this.f29757f = d10;
        this.f29758g = d11;
        this.f29759h = d15;
        this.i = d16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3082dN.class != obj.getClass()) {
            return false;
        }
        C3082dN c3082dN = (C3082dN) obj;
        return Double.compare(c3082dN.f29755d, this.f29755d) == 0 && Double.compare(c3082dN.f29756e, this.f29756e) == 0 && Double.compare(c3082dN.f29757f, this.f29757f) == 0 && Double.compare(c3082dN.f29758g, this.f29758g) == 0 && Double.compare(c3082dN.f29759h, this.f29759h) == 0 && Double.compare(c3082dN.i, this.i) == 0 && Double.compare(c3082dN.f29752a, this.f29752a) == 0 && Double.compare(c3082dN.f29753b, this.f29753b) == 0 && Double.compare(c3082dN.f29754c, this.f29754c) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f29752a);
        long j6 = doubleToLongBits ^ (doubleToLongBits >>> 32);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f29753b);
        long j9 = doubleToLongBits2 ^ (doubleToLongBits2 >>> 32);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f29754c);
        long j10 = doubleToLongBits3 ^ (doubleToLongBits3 >>> 32);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f29755d);
        long j11 = doubleToLongBits4 ^ (doubleToLongBits4 >>> 32);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f29756e);
        long j12 = doubleToLongBits5 ^ (doubleToLongBits5 >>> 32);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f29757f);
        long j13 = doubleToLongBits6 ^ (doubleToLongBits6 >>> 32);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f29758g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.f29759h);
        long j14 = doubleToLongBits8 ^ (doubleToLongBits8 >>> 32);
        long doubleToLongBits9 = Double.doubleToLongBits(this.i);
        return (((((((((((((((((int) j6) * 31) + ((int) j9)) * 31) + ((int) j10)) * 31) + ((int) j11)) * 31) + ((int) j12)) * 31) + ((int) j13)) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) j14)) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f29748j)) {
            return "Rotate 0°";
        }
        if (equals(f29749k)) {
            return "Rotate 90°";
        }
        if (equals(f29750l)) {
            return "Rotate 180°";
        }
        if (equals(f29751m)) {
            return "Rotate 270°";
        }
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(this.f29752a);
        sb.append(", v=");
        sb.append(this.f29753b);
        sb.append(", w=");
        sb.append(this.f29754c);
        sb.append(", a=");
        sb.append(this.f29755d);
        sb.append(", b=");
        sb.append(this.f29756e);
        sb.append(", c=");
        sb.append(this.f29757f);
        sb.append(", d=");
        sb.append(this.f29758g);
        sb.append(", tx=");
        sb.append(this.f29759h);
        sb.append(", ty=");
        sb.append(this.i);
        sb.append("}");
        return sb.toString();
    }
}
