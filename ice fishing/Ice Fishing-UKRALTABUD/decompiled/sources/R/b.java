package R;

import android.graphics.Rect;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f915a;

    /* renamed from: b, reason: collision with root package name */
    public final int f916b;

    /* renamed from: c, reason: collision with root package name */
    public final int f917c;

    /* renamed from: d, reason: collision with root package name */
    public final int f918d;

    public b(Rect rect) {
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        this.f915a = i2;
        this.f916b = i3;
        this.f917c = i4;
        this.f918d = i5;
        if (i2 > i4) {
            throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i2 + ", right: " + i4).toString());
        }
        if (i3 <= i5) {
            return;
        }
        throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i3 + ", bottom: " + i5).toString());
    }

    public final int a() {
        return this.f918d - this.f916b;
    }

    public final int b() {
        return this.f917c - this.f915a;
    }

    public final Rect c() {
        return new Rect(this.f915a, this.f916b, this.f917c, this.f918d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        E0.i.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        return this.f915a == bVar.f915a && this.f916b == bVar.f916b && this.f917c == bVar.f917c && this.f918d == bVar.f918d;
    }

    public final int hashCode() {
        return (((((this.f915a * 31) + this.f916b) * 31) + this.f917c) * 31) + this.f918d;
    }

    public final String toString() {
        return b.class.getSimpleName() + " { [" + this.f915a + ',' + this.f916b + ',' + this.f917c + ',' + this.f918d + "] }";
    }
}
