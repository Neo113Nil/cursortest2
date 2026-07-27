package p;

import android.graphics.Insets;

/* renamed from: p.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0225c {

    /* renamed from: e, reason: collision with root package name */
    public static final C0225c f2800e = new C0225c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f2801a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2802b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2803c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2804d;

    public C0225c(int i2, int i3, int i4, int i5) {
        this.f2801a = i2;
        this.f2802b = i3;
        this.f2803c = i4;
        this.f2804d = i5;
    }

    public static C0225c a(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f2800e : new C0225c(i2, i3, i4, i5);
    }

    public static C0225c b(Insets insets) {
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
        return AbstractC0224b.a(this.f2801a, this.f2802b, this.f2803c, this.f2804d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0225c.class != obj.getClass()) {
            return false;
        }
        C0225c c0225c = (C0225c) obj;
        return this.f2804d == c0225c.f2804d && this.f2801a == c0225c.f2801a && this.f2803c == c0225c.f2803c && this.f2802b == c0225c.f2802b;
    }

    public final int hashCode() {
        return (((((this.f2801a * 31) + this.f2802b) * 31) + this.f2803c) * 31) + this.f2804d;
    }

    public final String toString() {
        return "Insets{left=" + this.f2801a + ", top=" + this.f2802b + ", right=" + this.f2803c + ", bottom=" + this.f2804d + '}';
    }
}
