package defpackage;

import com.yandex.plus.plaquesdk.plaque.api.models.PlaqueModel$Source;
import com.yandex.plus.plaquesdk.plaque.api.models.PlaqueModel$Type;

/* loaded from: classes8.dex */
public final class roc0 {
    public final String a;
    public final eg20 b;
    public final loc0 c;
    public final PlaqueModel$Type d;
    public final PlaqueModel$Source e;
    public final boolean f;

    public roc0(String str, eg20 eg20Var, loc0 loc0Var, PlaqueModel$Type plaqueModel$Type, PlaqueModel$Source plaqueModel$Source, boolean z) {
        this.a = str;
        this.b = eg20Var;
        this.c = loc0Var;
        this.d = plaqueModel$Type;
        this.e = plaqueModel$Source;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof roc0)) {
            return false;
        }
        roc0 roc0Var = (roc0) obj;
        return jl40.l(this.a, roc0Var.a) && jl40.l(this.b, roc0Var.b) && jl40.l(this.c, roc0Var.c) && this.d == roc0Var.d && this.e == roc0Var.e && this.f == roc0Var.f;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        loc0 loc0Var = this.c;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (loc0Var == null ? 0 : loc0Var.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaqueModel(id=");
        sb.append(this.a);
        sb.append(", rootWidget=");
        sb.append(this.b);
        sb.append(", notification=");
        sb.append(this.c);
        sb.append(", type=");
        sb.append(this.d);
        sb.append(", source=");
        sb.append(this.e);
        sb.append(", canBeSwiped=");
        return unr0.u(sb, this.f, ')');
    }
}
