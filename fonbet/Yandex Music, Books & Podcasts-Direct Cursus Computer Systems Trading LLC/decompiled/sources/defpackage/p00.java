package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class p00 implements r00 {
    public final iab a;
    public final mt b;
    public final ArrayList c;

    public p00(iab iabVar, mt mtVar, ArrayList arrayList) {
        this.a = iabVar;
        this.b = mtVar;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p00)) {
            return false;
        }
        p00 p00Var = (p00) obj;
        return this.a.equals(p00Var.a) && this.b.equals(p00Var.b) && this.c.equals(p00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessOffline(header=");
        sb.append(this.a);
        sb.append(", albumFull=");
        sb.append(this.b);
        sb.append(", listItems=");
        return vz1.t(sb, this.c, ")");
    }
}
