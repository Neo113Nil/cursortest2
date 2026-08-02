package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class t14 implements c24 {
    public final rab a;
    public final lt b;
    public final ArrayList c;

    public t14(rab rabVar, lt ltVar, ArrayList arrayList) {
        this.a = rabVar;
        this.b = ltVar;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t14)) {
            return false;
        }
        t14 t14Var = (t14) obj;
        return this.a.equals(t14Var.a) && this.b.equals(t14Var.b) && this.c.equals(t14Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Album(uiData=");
        sb.append(this.a);
        sb.append(", album=");
        sb.append(this.b);
        sb.append(", artists=");
        return vz1.t(sb, this.c, ")");
    }
}
