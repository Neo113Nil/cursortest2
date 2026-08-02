package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class dcs {
    public final ges a;
    public final jx7 b;
    public final int c;

    public dcs(ges gesVar, jx7 jx7Var, int i) {
        gesVar.getClass();
        this.a = gesVar;
        this.b = jx7Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dcs)) {
            return false;
        }
        dcs dcsVar = (dcs) obj;
        return Intrinsics.d(this.a, dcsVar.a) && this.b.equals(dcsVar.b) && this.c == dcsVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParamsText(textStyle=");
        sb.append(this.a);
        sb.append(", density=");
        sb.append(this.b);
        sb.append(", lines=");
        return f1d.i(sb, this.c, ")");
    }
}
