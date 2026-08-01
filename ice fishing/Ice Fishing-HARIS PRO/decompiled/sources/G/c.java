package G;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class c {
    public static final c e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f261a;

    /* renamed from: b, reason: collision with root package name */
    public final int f262b;

    /* renamed from: c, reason: collision with root package name */
    public final int f263c;

    /* renamed from: d, reason: collision with root package name */
    public final int f264d;

    public c(int i, int i2, int i3, int i4) {
        this.f261a = i;
        this.f262b = i2;
        this.f263c = i3;
        this.f264d = i4;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f261a, cVar2.f261a), Math.max(cVar.f262b, cVar2.f262b), Math.max(cVar.f263c, cVar2.f263c), Math.max(cVar.f264d, cVar2.f264d));
    }

    public static c b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new c(i, i2, i3, i4);
    }

    public static c c(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return b(i, i2, i3, i4);
    }

    public final Insets d() {
        return b.a(this.f261a, this.f262b, this.f263c, this.f264d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f264d == cVar.f264d && this.f261a == cVar.f261a && this.f263c == cVar.f263c && this.f262b == cVar.f262b;
    }

    public final int hashCode() {
        return (((((this.f261a * 31) + this.f262b) * 31) + this.f263c) * 31) + this.f264d;
    }

    public final String toString() {
        return "Insets{left=" + this.f261a + ", top=" + this.f262b + ", right=" + this.f263c + ", bottom=" + this.f264d + '}';
    }
}
