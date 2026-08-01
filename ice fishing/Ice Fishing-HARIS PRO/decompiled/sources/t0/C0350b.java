package t0;

import android.graphics.Rect;

/* renamed from: t0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0350b {

    /* renamed from: a, reason: collision with root package name */
    public final int f4360a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4361b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4362c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4363d;

    public C0350b(Rect rect) {
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        this.f4360a = i;
        this.f4361b = i2;
        this.f4362c = i3;
        this.f4363d = i4;
    }

    public final int a() {
        return this.f4363d - this.f4361b;
    }

    public final int b() {
        return this.f4362c - this.f4360a;
    }

    public final Rect c() {
        return new Rect(this.f4360a, this.f4361b, this.f4362c, this.f4363d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0350b.class.equals(obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
        }
        C0350b c0350b = (C0350b) obj;
        return this.f4360a == c0350b.f4360a && this.f4361b == c0350b.f4361b && this.f4362c == c0350b.f4362c && this.f4363d == c0350b.f4363d;
    }

    public final int hashCode() {
        return (((((this.f4360a * 31) + this.f4361b) * 31) + this.f4362c) * 31) + this.f4363d;
    }

    public final String toString() {
        return ((Object) C0350b.class.getSimpleName()) + " { [" + this.f4360a + ',' + this.f4361b + ',' + this.f4362c + ',' + this.f4363d + "] }";
    }
}
