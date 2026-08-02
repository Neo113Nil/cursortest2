package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ng9 implements gip, py7 {
    public final t6f a;

    public ng9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        String b0 = etn.b0(jSONObject);
        boolean equals = b0.equals("fixed");
        t6f t6fVar = this.a;
        if (equals) {
            ((kz8) t6fVar.F3.getValue()).getClass();
            return new kg9(kz8.c(t7kVar, jSONObject));
        }
        if (b0.equals("relative")) {
            ((ah9) t6fVar.A6.getValue()).getClass();
            return new lg9(ah9.c(t7kVar, jSONObject));
        }
        d7f t = t7kVar.b().t(b0, jSONObject);
        sg9 sg9Var = t instanceof sg9 ? (sg9) t : null;
        if (sg9Var != null) {
            return ((pg9) t6fVar.w6.getValue()).a(t7kVar, sg9Var, jSONObject);
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, mg9 mg9Var) {
        boolean z = mg9Var instanceof kg9;
        t6f t6fVar = this.a;
        if (z) {
            kz8 kz8Var = (kz8) t6fVar.F3.getValue();
            jz8 jz8Var = ((kg9) mg9Var).b;
            kz8Var.getClass();
            return kz8.d(t7kVar, jz8Var);
        }
        if (!(mg9Var instanceof lg9)) {
            b6e.s();
            return null;
        }
        ah9 ah9Var = (ah9) t6fVar.A6.getValue();
        zg9 zg9Var = ((lg9) mg9Var).b;
        ah9Var.getClass();
        return ah9.d(t7kVar, zg9Var);
    }
}
