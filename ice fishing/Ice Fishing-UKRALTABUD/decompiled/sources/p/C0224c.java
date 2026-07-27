package p;

import android.graphics.Insets;

/* renamed from: p.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0224c {

    /* renamed from: e, reason: collision with root package name */
    public static final C0224c f2792e = new C0224c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f2793a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2794b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2795c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2796d;

    public C0224c(int i2, int i3, int i4, int i5) {
        this.f2793a = i2;
        this.f2794b = i3;
        this.f2795c = i4;
        this.f2796d = i5;
    }

    public static C0224c a(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f2792e : new C0224c(i2, i3, i4, i5);
    }

    public static C0224c b(Insets insets) {
        int i2;
        int i3;
        int i4;
        int i5;
        i2 = insets.left;
        i3 = insets.top;
        i4 = insets.right;
        i5 = insets.bottom;
        return a(i2, i3, i4, i5);
    }

    public final Insets c() {
        return AbstractC0223b.a(this.f2793a, this.f2794b, this.f2795c, this.f2796d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0224c.class != obj.getClass()) {
            return false;
        }
        C0224c c0224c = (C0224c) obj;
        return this.f2796d == c0224c.f2796d && this.f2793a == c0224c.f2793a && this.f2795c == c0224c.f2795c && this.f2794b == c0224c.f2794b;
    }

    public final int hashCode() {
        return (((((this.f2793a * 31) + this.f2794b) * 31) + this.f2795c) * 31) + this.f2796d;
    }

    public final String toString() {
        return "Insets{left=" + this.f2793a + ", top=" + this.f2794b + ", right=" + this.f2795c + ", bottom=" + this.f2796d + '}';
    }
}
