package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ka9 implements gip, py7 {
    public final t6f a;

    public ka9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        String b0 = etn.b0(jSONObject);
        boolean equals = b0.equals("slide");
        t6f t6fVar = this.a;
        if (equals) {
            ((ua9) t6fVar.C5.getValue()).getClass();
            return new ia9(ua9.c(t7kVar, jSONObject));
        }
        if (b0.equals("overlap")) {
            ((oa9) t6fVar.z5.getValue()).getClass();
            return new ha9(oa9.c(t7kVar, jSONObject));
        }
        d7f t = t7kVar.b().t(b0, jSONObject);
        bb9 bb9Var = t instanceof bb9 ? (bb9) t : null;
        if (bb9Var != null) {
            return ((ma9) t6fVar.H5.getValue()).a(t7kVar, bb9Var, jSONObject);
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, ja9 ja9Var) {
        boolean z = ja9Var instanceof ia9;
        t6f t6fVar = this.a;
        if (z) {
            ua9 ua9Var = (ua9) t6fVar.C5.getValue();
            ta9 ta9Var = ((ia9) ja9Var).b;
            ua9Var.getClass();
            return ua9.d(t7kVar, ta9Var);
        }
        if (!(ja9Var instanceof ha9)) {
            b6e.s();
            return null;
        }
        oa9 oa9Var = (oa9) t6fVar.z5.getValue();
        na9 na9Var = ((ha9) ja9Var).b;
        oa9Var.getClass();
        return oa9.d(t7kVar, na9Var);
    }
}
