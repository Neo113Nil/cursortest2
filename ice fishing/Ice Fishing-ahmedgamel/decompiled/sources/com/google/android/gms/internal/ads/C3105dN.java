package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3105dN {

    /* renamed from: j, reason: collision with root package name */
    public static final C3105dN f30520j = new C3105dN(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: k, reason: collision with root package name */
    public static final C3105dN f30521k = new C3105dN(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: l, reason: collision with root package name */
    public static final C3105dN f30522l = new C3105dN(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: m, reason: collision with root package name */
    public static final C3105dN f30523m = new C3105dN(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a, reason: collision with root package name */
    public final double f30524a;

    /* renamed from: b, reason: collision with root package name */
    public final double f30525b;

    /* renamed from: c, reason: collision with root package name */
    public final double f30526c;

    /* renamed from: d, reason: collision with root package name */
    public final double f30527d;

    /* renamed from: e, reason: collision with root package name */
    public final double f30528e;

    /* renamed from: f, reason: collision with root package name */
    public final double f30529f;

    /* renamed from: g, reason: collision with root package name */
    public final double f30530g;

    /* renamed from: h, reason: collision with root package name */
    public final double f30531h;
    public final double i;

    public C3105dN(double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f30524a = d13;
        this.f30525b = d14;
        this.f30526c = d15;
        this.f30527d = d9;
        this.f30528e = d10;
        this.f30529f = d11;
        this.f30530g = d12;
        this.f30531h = d16;
        this.i = d17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3105dN.class != obj.getClass()) {
            return false;
        }
        C3105dN c3105dN = (C3105dN) obj;
        return Double.compare(c3105dN.f30527d, this.f30527d) == 0 && Double.compare(c3105dN.f30528e, this.f30528e) == 0 && Double.compare(c3105dN.f30529f, this.f30529f) == 0 && Double.compare(c3105dN.f30530g, this.f30530g) == 0 && Double.compare(c3105dN.f30531h, this.f30531h) == 0 && Double.compare(c3105dN.i, this.i) == 0 && Double.compare(c3105dN.f30524a, this.f30524a) == 0 && Double.compare(c3105dN.f30525b, this.f30525b) == 0 && Double.compare(c3105dN.f30526c, this.f30526c) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f30524a);
        long j6 = doubleToLongBits ^ (doubleToLongBits >>> 32);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f30525b);
        long j9 = doubleToLongBits2 ^ (doubleToLongBits2 >>> 32);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f30526c);
        long j10 = doubleToLongBits3 ^ (doubleToLongBits3 >>> 32);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f30527d);
        long j11 = doubleToLongBits4 ^ (doubleToLongBits4 >>> 32);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f30528e);
        long j12 = doubleToLongBits5 ^ (doubleToLongBits5 >>> 32);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f30529f);
        long j13 = doubleToLongBits6 ^ (doubleToLongBits6 >>> 32);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f30530g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.f30531h);
        long j14 = doubleToLongBits8 ^ (doubleToLongBits8 >>> 32);
        long doubleToLongBits9 = Double.doubleToLongBits(this.i);
        return (((((((((((((((((int) j6) * 31) + ((int) j9)) * 31) + ((int) j10)) * 31) + ((int) j11)) * 31) + ((int) j12)) * 31) + ((int) j13)) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) j14)) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f30520j)) {
            return "Rotate 0°";
        }
        if (equals(f30521k)) {
            return "Rotate 90°";
        }
        if (equals(f30522l)) {
            return "Rotate 180°";
        }
        if (equals(f30523m)) {
            return "Rotate 270°";
        }
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(this.f30524a);
        sb.append(", v=");
        sb.append(this.f30525b);
        sb.append(", w=");
        sb.append(this.f30526c);
        sb.append(", a=");
        sb.append(this.f30527d);
        sb.append(", b=");
        sb.append(this.f30528e);
        sb.append(", c=");
        sb.append(this.f30529f);
        sb.append(", d=");
        sb.append(this.f30530g);
        sb.append(", tx=");
        sb.append(this.f30531h);
        sb.append(", ty=");
        sb.append(this.i);
        sb.append("}");
        return sb.toString();
    }
}
