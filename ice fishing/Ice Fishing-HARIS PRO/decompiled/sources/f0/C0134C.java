package f0;

/* renamed from: f0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0134C {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2860a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2861b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2862c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2863d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2864f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2865g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2866h;
    public final int i;

    public C0134C(boolean z2, boolean z3, int i, boolean z4, boolean z5, int i2, int i3, int i4, int i5) {
        this.f2860a = z2;
        this.f2861b = z3;
        this.f2862c = i;
        this.f2863d = z4;
        this.e = z5;
        this.f2864f = i2;
        this.f2865g = i3;
        this.f2866h = i4;
        this.i = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0134C)) {
            return false;
        }
        C0134C c0134c = (C0134C) obj;
        return this.f2860a == c0134c.f2860a && this.f2861b == c0134c.f2861b && this.f2862c == c0134c.f2862c && D1.i.a(null, null) && D1.i.a(null, null) && D1.i.a(null, null) && this.f2863d == c0134c.f2863d && this.e == c0134c.e && this.f2864f == c0134c.f2864f && this.f2865g == c0134c.f2865g && this.f2866h == c0134c.f2866h && this.i == c0134c.i;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f2860a ? 1 : 0) * 31) + (this.f2861b ? 1 : 0)) * 31) + this.f2862c) * 923521) + (this.f2863d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f2864f) * 31) + this.f2865g) * 31) + this.f2866h) * 31) + this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0134C.class.getSimpleName());
        sb.append("(");
        if (this.f2860a) {
            sb.append("launchSingleTop ");
        }
        if (this.f2861b) {
            sb.append("restoreState ");
        }
        int i = this.i;
        int i2 = this.f2866h;
        int i3 = this.f2865g;
        int i4 = this.f2864f;
        if (i4 != -1 || i3 != -1 || i2 != -1 || i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i4));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i3));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(i2));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(i));
            sb.append(")");
        }
        String sb2 = sb.toString();
        D1.i.d(sb2, "sb.toString()");
        return sb2;
    }
}
