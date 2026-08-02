package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class xn9 implements gip, py7 {
    public final t6f a;

    public xn9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        String b0 = etn.b0(jSONObject);
        boolean equals = b0.equals("solid");
        t6f t6fVar = this.a;
        if (equals) {
            ((bo9) t6fVar.U7.getValue()).getClass();
            return new qn9(new ao9());
        }
        if (b0.equals("dashed")) {
            ((tn9) t6fVar.R7.getValue()).getClass();
            return new pn9(new sn9());
        }
        d7f t = t7kVar.b().t(b0, jSONObject);
        ho9 ho9Var = t instanceof ho9 ? (ho9) t : null;
        if (ho9Var != null) {
            return ((zn9) t6fVar.Z7.getValue()).b(ho9Var);
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, rn9 rn9Var) {
        boolean z = rn9Var instanceof qn9;
        t6f t6fVar = this.a;
        if (z) {
            ((bo9) t6fVar.U7.getValue()).getClass();
            JSONObject jSONObject = new JSONObject();
            etn.l0(t7kVar, jSONObject, "type", "solid");
            return jSONObject;
        }
        if (!(rn9Var instanceof pn9)) {
            b6e.s();
            return null;
        }
        ((tn9) t6fVar.R7.getValue()).getClass();
        JSONObject jSONObject2 = new JSONObject();
        etn.l0(t7kVar, jSONObject2, "type", "dashed");
        return jSONObject2;
    }
}
