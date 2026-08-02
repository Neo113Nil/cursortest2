package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class tq8 implements gip, py7 {
    public final t6f a;

    public tq8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        String b0 = etn.b0(jSONObject);
        boolean equals = b0.equals("set");
        t6f t6fVar = this.a;
        if (equals) {
            return new rq8(((mq8) t6fVar.a2.getValue()).a(t7kVar, jSONObject));
        }
        if (b0.equals("change_bounds")) {
            ((gq8) t6fVar.X1.getValue()).getClass();
            return new qq8(gq8.c(t7kVar, jSONObject));
        }
        d7f t = t7kVar.b().t(b0, jSONObject);
        yq8 yq8Var = t instanceof yq8 ? (yq8) t : null;
        if (yq8Var != null) {
            return ((vq8) t6fVar.f2.getValue()).a(t7kVar, yq8Var, jSONObject);
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, sq8 sq8Var) {
        boolean z = sq8Var instanceof rq8;
        t6f t6fVar = this.a;
        if (z) {
            return ((mq8) t6fVar.a2.getValue()).b(t7kVar, ((rq8) sq8Var).b);
        }
        if (!(sq8Var instanceof qq8)) {
            b6e.s();
            return null;
        }
        gq8 gq8Var = (gq8) t6fVar.X1.getValue();
        fq8 fq8Var = ((qq8) sq8Var).b;
        gq8Var.getClass();
        return gq8.d(t7kVar, fq8Var);
    }
}
