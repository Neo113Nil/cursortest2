package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zs9 implements gip, py7 {
    public final t6f a;

    public zs9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        String b0 = etn.b0(jSONObject);
        boolean equals = b0.equals("particles");
        t6f t6fVar = this.a;
        if (equals) {
            return new rs9(((dt9) t6fVar.D8.getValue()).a(t7kVar, jSONObject));
        }
        if (b0.equals("solid")) {
            ((jt9) t6fVar.G8.getValue()).getClass();
            return new ss9(jt9.c(t7kVar, jSONObject));
        }
        d7f t = t7kVar.b().t(b0, jSONObject);
        qt9 qt9Var = t instanceof qt9 ? (qt9) t : null;
        if (qt9Var != null) {
            return ((bt9) t6fVar.L8.getValue()).a(t7kVar, qt9Var, jSONObject);
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, ts9 ts9Var) {
        boolean z = ts9Var instanceof rs9;
        t6f t6fVar = this.a;
        if (z) {
            return ((dt9) t6fVar.D8.getValue()).b(t7kVar, ((rs9) ts9Var).b);
        }
        if (!(ts9Var instanceof ss9)) {
            b6e.s();
            return null;
        }
        jt9 jt9Var = (jt9) t6fVar.G8.getValue();
        it9 it9Var = ((ss9) ts9Var).b;
        jt9Var.getClass();
        return jt9.d(t7kVar, it9Var);
    }
}
