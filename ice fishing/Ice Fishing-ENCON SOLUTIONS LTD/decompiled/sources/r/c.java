package r;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f8447e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f8448a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8449b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8450c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8451d;

    public c(int i2, int i3, int i4, int i5) {
        this.f8448a = i2;
        this.f8449b = i3;
        this.f8450c = i4;
        this.f8451d = i5;
    }

    public static c a(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f8447e : new c(i2, i3, i4, i5);
    }

    public static c b(Insets insets) {
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
        return AbstractC1038b.a(this.f8448a, this.f8449b, this.f8450c, this.f8451d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f8451d == cVar.f8451d && this.f8448a == cVar.f8448a && this.f8450c == cVar.f8450c && this.f8449b == cVar.f8449b;
    }

    public final int hashCode() {
        return (((((this.f8448a * 31) + this.f8449b) * 31) + this.f8450c) * 31) + this.f8451d;
    }

    public final String toString() {
        return "Insets{left=" + this.f8448a + ", top=" + this.f8449b + ", right=" + this.f8450c + ", bottom=" + this.f8451d + '}';
    }
}
