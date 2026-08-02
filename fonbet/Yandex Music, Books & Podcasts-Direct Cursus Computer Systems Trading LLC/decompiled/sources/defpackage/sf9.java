package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class sf9 implements gip, py7 {
    public final t6f a;

    public sf9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        String b0 = etn.b0(jSONObject);
        boolean equals = b0.equals("fixed");
        t6f t6fVar = this.a;
        if (equals) {
            ((bg9) t6fVar.r6.getValue()).getClass();
            return new pf9(bg9.c(t7kVar, jSONObject));
        }
        if (b0.equals("relative")) {
            ((ug9) t6fVar.x6.getValue()).getClass();
            return new qf9(ug9.c(t7kVar, jSONObject));
        }
        d7f t = t7kVar.b().t(b0, jSONObject);
        xf9 xf9Var = t instanceof xf9 ? (xf9) t : null;
        if (xf9Var != null) {
            return ((uf9) t6fVar.q6.getValue()).a(t7kVar, xf9Var, jSONObject);
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, rf9 rf9Var) {
        boolean z = rf9Var instanceof pf9;
        t6f t6fVar = this.a;
        if (z) {
            bg9 bg9Var = (bg9) t6fVar.r6.getValue();
            ag9 ag9Var = ((pf9) rf9Var).b;
            bg9Var.getClass();
            return bg9.d(t7kVar, ag9Var);
        }
        if (!(rf9Var instanceof qf9)) {
            b6e.s();
            return null;
        }
        ug9 ug9Var = (ug9) t6fVar.x6.getValue();
        tg9 tg9Var = ((qf9) rf9Var).b;
        ug9Var.getClass();
        return ug9.d(t7kVar, tg9Var);
    }
}
