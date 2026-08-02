package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class op8 implements u1f {
    public final szb a;
    public final fu8 b;
    public final szb c;
    public final dj9 d;
    public final ln9 e;
    public Integer f;

    public op8(szb szbVar, fu8 fu8Var, szb szbVar2, dj9 dj9Var, ln9 ln9Var) {
        this.a = szbVar;
        this.b = fu8Var;
        this.c = szbVar2;
        this.d = dj9Var;
        this.e = ln9Var;
    }

    public final boolean a(op8 op8Var, xzb xzbVar, xzb xzbVar2) {
        if (op8Var != null) {
            szb szbVar = this.a;
            Long l = szbVar != null ? (Long) szbVar.a(xzbVar) : null;
            szb szbVar2 = op8Var.a;
            if (Intrinsics.d(l, szbVar2 != null ? (Long) szbVar2.a(xzbVar2) : null)) {
                fu8 fu8Var = op8Var.b;
                fu8 fu8Var2 = this.b;
                if ((fu8Var2 != null ? fu8Var2.a(fu8Var, xzbVar, xzbVar2) : fu8Var == null) && ((Boolean) this.c.a(xzbVar)).booleanValue() == ((Boolean) op8Var.c.a(xzbVar2)).booleanValue()) {
                    dj9 dj9Var = op8Var.d;
                    dj9 dj9Var2 = this.d;
                    if (dj9Var2 != null ? dj9Var2.a(dj9Var, xzbVar, xzbVar2) : dj9Var == null) {
                        ln9 ln9Var = op8Var.e;
                        ln9 ln9Var2 = this.e;
                        if (ln9Var2 != null ? ln9Var2.a(ln9Var, xzbVar, xzbVar2) : ln9Var == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        Integer num = this.f;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = ern.a(op8.class).hashCode();
        szb szbVar = this.a;
        int hashCode2 = hashCode + (szbVar != null ? szbVar.hashCode() : 0);
        fu8 fu8Var = this.b;
        int hashCode3 = this.c.hashCode() + hashCode2 + (fu8Var != null ? fu8Var.b() : 0);
        dj9 dj9Var = this.d;
        int b = hashCode3 + (dj9Var != null ? dj9Var.b() : 0);
        ln9 ln9Var = this.e;
        int b2 = b + (ln9Var != null ? ln9Var.b() : 0);
        this.f = Integer.valueOf(b2);
        return b2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((vp8) rj3.b.U1.getValue()).b(rj3.a, this);
    }
}
