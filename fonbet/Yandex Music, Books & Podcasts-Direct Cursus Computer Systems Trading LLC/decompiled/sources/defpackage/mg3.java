package defpackage;

import android.graphics.Rect;

/* loaded from: classes.dex */
public final class mg3 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public mg3(Rect rect) {
        rect.getClass();
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (i > i3) {
            xq0.o(f1d.e(i, i3, "Left must be less than or equal to right, left: ", ", right: "));
            throw null;
        }
        if (i2 <= i4) {
            return;
        }
        xq0.o(f1d.e(i2, i4, "top must be less than or equal to bottom, top: ", ", bottom: "));
        throw null;
    }

    public final Rect a() {
        return new Rect(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!mg3.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        mg3 mg3Var = (mg3) obj;
        return this.a == mg3Var.a && this.b == mg3Var.b && this.c == mg3Var.c && this.d == mg3Var.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mg3.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.a);
        sb.append(',');
        sb.append(this.b);
        sb.append(',');
        sb.append(this.c);
        sb.append(',');
        return f1d.i(sb, this.d, "] }");
    }
}
