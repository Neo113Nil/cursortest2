package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lvt50;", "", "Companion", "tt50", "ut50", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class vt50 {
    public static final ut50 Companion = new ut50();
    public final mu50 a;
    public final pt50 b;

    public /* synthetic */ vt50(int i, mu50 mu50Var, pt50 pt50Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = mu50Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = pt50Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt50)) {
            return false;
        }
        vt50 vt50Var = (vt50) obj;
        return jl40.l(this.a, vt50Var.a) && jl40.l(this.b, vt50Var.b);
    }

    public final int hashCode() {
        mu50 mu50Var = this.a;
        int hashCode = (mu50Var == null ? 0 : mu50Var.hashCode()) * 31;
        pt50 pt50Var = this.b;
        return hashCode + (pt50Var != null ? pt50Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkExperimentsResponseModel(error=" + this.a + ", data=" + this.b + ')';
    }

    public vt50() {
        this.a = null;
        this.b = null;
    }
}
