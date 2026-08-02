package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class f59 implements u8s {
    public final t6f a;

    public f59(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final x49 a(t7k t7kVar, n59 n59Var, JSONObject jSONObject) {
        boolean z = n59Var instanceof m59;
        t6f t6fVar = this.a;
        if (z) {
            j59 j59Var = (j59) t6fVar.A4.getValue();
            k59 k59Var = ((m59) n59Var).a;
            j59Var.getClass();
            return new w49(new g59(h4a.F(t7kVar, k59Var.a, jSONObject, "pattern", vct.c)));
        }
        if (!(n59Var instanceof l59)) {
            b6e.s();
            return null;
        }
        b59 b59Var = (b59) t6fVar.x4.getValue();
        c59 c59Var = ((l59) n59Var).a;
        b59Var.getClass();
        return new v49(new y49(h4a.G(t7kVar, c59Var.a, jSONObject, "condition", vct.a, kzj.B)));
    }
}
