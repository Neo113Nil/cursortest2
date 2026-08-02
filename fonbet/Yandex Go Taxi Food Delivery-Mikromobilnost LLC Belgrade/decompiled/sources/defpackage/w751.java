package defpackage;

import android.graphics.Rect;

/* loaded from: classes10.dex */
public final class w751 {
    public final hi6 a;
    public final float b;

    public w751(Rect rect, float f) {
        this(new hi6(rect), f);
    }

    public final Rect a() {
        return this.a.c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!w751.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        w751 w751Var = (w751) obj;
        return jl40.l(this.a, w751Var.a) && this.b == w751Var.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowMetrics(_bounds=");
        sb.append(this.a);
        sb.append(", density=");
        return n.n(sb, this.b, ')');
    }

    public w751(hi6 hi6Var, float f) {
        this.a = hi6Var;
        this.b = f;
    }
}
