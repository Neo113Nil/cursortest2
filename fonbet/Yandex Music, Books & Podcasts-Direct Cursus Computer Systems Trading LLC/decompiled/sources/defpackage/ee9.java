package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ee9 implements gip, py7 {
    public final t6f a;

    public ee9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        String b0 = etn.b0(jSONObject);
        boolean equals = b0.equals("pivot-fixed");
        t6f t6fVar = this.a;
        if (equals) {
            ((zd9) t6fVar.c6.getValue()).getClass();
            return new vd9(zd9.c(t7kVar, jSONObject));
        }
        if (b0.equals("pivot-percentage")) {
            ((ie9) t6fVar.f6.getValue()).getClass();
            return new wd9(ie9.c(t7kVar, jSONObject));
        }
        d7f t = t7kVar.b().t(b0, jSONObject);
        oe9 oe9Var = t instanceof oe9 ? (oe9) t : null;
        if (oe9Var != null) {
            return ((ge9) t6fVar.k6.getValue()).a(t7kVar, oe9Var, jSONObject);
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, xd9 xd9Var) {
        boolean z = xd9Var instanceof vd9;
        t6f t6fVar = this.a;
        if (z) {
            zd9 zd9Var = (zd9) t6fVar.c6.getValue();
            yd9 yd9Var = ((vd9) xd9Var).b;
            zd9Var.getClass();
            return zd9.d(t7kVar, yd9Var);
        }
        if (!(xd9Var instanceof wd9)) {
            b6e.s();
            return null;
        }
        ie9 ie9Var = (ie9) t6fVar.f6.getValue();
        he9 he9Var = ((wd9) xd9Var).b;
        ie9Var.getClass();
        return ie9.d(t7kVar, he9Var);
    }
}
