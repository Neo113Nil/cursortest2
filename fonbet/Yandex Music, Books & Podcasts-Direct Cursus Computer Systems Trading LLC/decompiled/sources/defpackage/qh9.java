package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class qh9 implements u1f {
    public static final jz8 g = new jz8(e3s.L(5L));
    public static final jz8 h = new jz8(e3s.L(10L));
    public static final jz8 i = new jz8(e3s.L(10L));
    public final szb a;
    public final jz8 b;
    public final jz8 c;
    public final jz8 d;
    public final ln9 e;
    public Integer f;

    public qh9(szb szbVar, jz8 jz8Var, jz8 jz8Var2, jz8 jz8Var3, ln9 ln9Var) {
        this.a = szbVar;
        this.b = jz8Var;
        this.c = jz8Var2;
        this.d = jz8Var3;
        this.e = ln9Var;
    }

    public final boolean a(qh9 qh9Var, xzb xzbVar, xzb xzbVar2) {
        if (qh9Var != null) {
            szb szbVar = this.a;
            Integer num = szbVar != null ? (Integer) szbVar.a(xzbVar) : null;
            szb szbVar2 = qh9Var.a;
            if (Intrinsics.d(num, szbVar2 != null ? (Integer) szbVar2.a(xzbVar2) : null) && this.b.a(qh9Var.b, xzbVar, xzbVar2) && this.c.a(qh9Var.c, xzbVar, xzbVar2) && this.d.a(qh9Var.d, xzbVar, xzbVar2)) {
                ln9 ln9Var = qh9Var.e;
                ln9 ln9Var2 = this.e;
                if (ln9Var2 != null ? ln9Var2.a(ln9Var, xzbVar, xzbVar2) : ln9Var == null) {
                    return true;
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
        int hashCode = ern.a(qh9.class).hashCode();
        szb szbVar = this.a;
        int b = this.d.b() + this.c.b() + this.b.b() + hashCode + (szbVar != null ? szbVar.hashCode() : 0);
        ln9 ln9Var = this.e;
        int b2 = b + (ln9Var != null ? ln9Var.b() : 0);
        this.f = Integer.valueOf(b2);
        return b2;
    }

    @Override // defpackage.u1f
    public final JSONObject r() {
        return ((rh9) rj3.b.M6.getValue()).b(rj3.a, this);
    }
}
