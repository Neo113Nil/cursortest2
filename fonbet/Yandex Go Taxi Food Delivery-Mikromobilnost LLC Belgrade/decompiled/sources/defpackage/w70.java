package defpackage;

import android.view.View;

/* loaded from: classes11.dex */
public final class w70 {
    public final View a;
    public final int b;
    public final long c;

    public w70(View view, int i, long j) {
        this.a = view;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w70)) {
            return false;
        }
        w70 w70Var = (w70) obj;
        return jl40.l(this.a, w70Var.a) && this.b == w70Var.b && this.c == w70Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdapterItem(view=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", id=");
        return b64.o(sb, this.c, ')');
    }
}
