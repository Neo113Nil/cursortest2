package defpackage;

import android.view.View;

/* loaded from: classes11.dex */
public final class v70 {
    public final View a;
    public final int b;
    public final long c;

    public v70(View view, int i, long j) {
        this.a = view;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v70)) {
            return false;
        }
        v70 v70Var = (v70) obj;
        return jl40.l(this.a, v70Var.a) && this.b == v70Var.b && this.c == v70Var.c;
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
