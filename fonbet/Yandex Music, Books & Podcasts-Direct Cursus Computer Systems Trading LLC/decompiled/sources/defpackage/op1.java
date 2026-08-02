package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class op1 {
    public final np1 a;
    public final u51 b;
    public final ArrayList c;

    public op1(np1 np1Var, u51 u51Var, ArrayList arrayList) {
        this.a = np1Var;
        this.b = u51Var;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op1)) {
            return false;
        }
        op1 op1Var = (op1) obj;
        return this.a.equals(op1Var.a) && this.b.equals(op1Var.b) && this.c.equals(op1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArtistWithConcerts(artistUiData=");
        sb.append(this.a);
        sb.append(", artistDomainItem=");
        sb.append(this.b);
        sb.append(", concerts=");
        return vz1.t(sb, this.c, ")");
    }
}
