package defpackage;

import androidx.compose.ui.draw.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lua6;", "Lj530;", "Lta6;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ua6 extends j530 {
    public final float a;
    public final ml6 b;
    public final ehr0 c;

    public ua6(float f, ml6 ml6Var, ehr0 ehr0Var) {
        this.a = f;
        this.b = ml6Var;
        this.c = ehr0Var;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new ta6(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua6)) {
            return false;
        }
        ua6 ua6Var = (ua6) obj;
        return y7m.b(this.a, ua6Var.a) && jl40.l(this.b, ua6Var.b) && jl40.l(this.c, ua6Var.c);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        ta6 ta6Var = (ta6) e530Var;
        float f = ta6Var.w;
        a aVar = ta6Var.z;
        float f2 = this.a;
        if (!y7m.b(f, f2)) {
            ta6Var.w = f2;
            aVar.E0();
        }
        ml6 ml6Var = ta6Var.x;
        ml6 ml6Var2 = this.b;
        if (!jl40.l(ml6Var, ml6Var2)) {
            ta6Var.x = ml6Var2;
            aVar.E0();
        }
        ehr0 ehr0Var = ta6Var.y;
        ehr0 ehr0Var2 = this.c;
        if (jl40.l(ehr0Var, ehr0Var2)) {
            return;
        }
        ta6Var.y = ehr0Var2;
        aVar.E0();
        qje.P(ta6Var).D();
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) y7m.c(this.a)) + ", brush=" + this.b + ", shape=" + this.c + ')';
    }
}
