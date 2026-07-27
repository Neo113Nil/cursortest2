package R;

import android.graphics.Rect;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f923a;

    /* renamed from: b, reason: collision with root package name */
    public final int f924b;

    /* renamed from: c, reason: collision with root package name */
    public final int f925c;

    /* renamed from: d, reason: collision with root package name */
    public final int f926d;

    public b(Rect rect) {
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        this.f923a = i2;
        this.f924b = i3;
        this.f925c = i4;
        this.f926d = i5;
        if (i2 > i4) {
            throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i2 + ", right: " + i4).toString());
        }
        if (i3 <= i5) {
            return;
        }
        throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i3 + ", bottom: " + i5).toString());
    }

    public final int a() {
        return this.f926d - this.f924b;
    }

    public final int b() {
        return this.f925c - this.f923a;
    }

    public final Rect c() {
        return new Rect(this.f923a, this.f924b, this.f925c, this.f926d);
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
        return this.f923a == bVar.f923a && this.f924b == bVar.f924b && this.f925c == bVar.f925c && this.f926d == bVar.f926d;
    }

    public final int hashCode() {
        return (((((this.f923a * 31) + this.f924b) * 31) + this.f925c) * 31) + this.f926d;
    }

    public final String toString() {
        return b.class.getSimpleName() + " { [" + this.f923a + ',' + this.f924b + ',' + this.f925c + ',' + this.f926d + "] }";
    }
}
