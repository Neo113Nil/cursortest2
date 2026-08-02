package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class d59 implements gip, py7 {
    public final t6f a;

    public d59(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        String b0 = etn.b0(jSONObject);
        boolean equals = b0.equals("regex");
        t6f t6fVar = this.a;
        if (equals) {
            ((h59) t6fVar.y4.getValue()).getClass();
            return new w49(new g59(e5f.a(t7kVar, jSONObject, "pattern", vct.c)));
        }
        if (b0.equals("expression")) {
            ((z49) t6fVar.v4.getValue()).getClass();
            return new v49(z49.c(t7kVar, jSONObject));
        }
        d7f t = t7kVar.b().t(b0, jSONObject);
        n59 n59Var = t instanceof n59 ? (n59) t : null;
        if (n59Var != null) {
            return ((f59) t6fVar.D4.getValue()).a(t7kVar, n59Var, jSONObject);
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, x49 x49Var) {
        boolean z = x49Var instanceof w49;
        t6f t6fVar = this.a;
        if (z) {
            h59 h59Var = (h59) t6fVar.y4.getValue();
            g59 g59Var = ((w49) x49Var).b;
            h59Var.getClass();
            return h59.c(t7kVar, g59Var);
        }
        if (!(x49Var instanceof v49)) {
            b6e.s();
            return null;
        }
        z49 z49Var = (z49) t6fVar.v4.getValue();
        y49 y49Var = ((v49) x49Var).b;
        z49Var.getClass();
        return z49.d(t7kVar, y49Var);
    }
}
