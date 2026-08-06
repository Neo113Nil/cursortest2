package W;

import android.graphics.Rect;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1833a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1834b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1835c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1836d;

    public b(Rect rect) {
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        this.f1833a = i2;
        this.f1834b = i3;
        this.f1835c = i4;
        this.f1836d = i5;
        if (i2 > i4) {
            throw new IllegalArgumentException(C1.a.h("Left must be less than or equal to right, left: ", i2, i4, ", right: ").toString());
        }
        if (i3 > i5) {
            throw new IllegalArgumentException(C1.a.h("top must be less than or equal to bottom, top: ", i3, i5, ", bottom: ").toString());
        }
    }

    public final int a() {
        return this.f1836d - this.f1834b;
    }

    public final int b() {
        return this.f1835c - this.f1833a;
    }

    public final Rect c() {
        return new Rect(this.f1833a, this.f1834b, this.f1835c, this.f1836d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        return this.f1833a == bVar.f1833a && this.f1834b == bVar.f1834b && this.f1835c == bVar.f1835c && this.f1836d == bVar.f1836d;
    }

    public final int hashCode() {
        return (((((this.f1833a * 31) + this.f1834b) * 31) + this.f1835c) * 31) + this.f1836d;
    }

    public final String toString() {
        return b.class.getSimpleName() + " { [" + this.f1833a + ',' + this.f1834b + ',' + this.f1835c + ',' + this.f1836d + "] }";
    }
}
