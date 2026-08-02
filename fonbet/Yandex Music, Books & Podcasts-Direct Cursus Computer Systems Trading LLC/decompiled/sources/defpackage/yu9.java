package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class yu9 implements gip, py7 {
    public final t6f a;

    public yu9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        String b0 = etn.b0(jSONObject);
        boolean equals = b0.equals("non_modal");
        t6f t6fVar = this.a;
        if (equals) {
            ((hv9) t6fVar.h9.getValue()).getClass();
            return new wu9(new gv9());
        }
        if (b0.equals("modal")) {
            ((cv9) t6fVar.e9.getValue()).getClass();
            return new vu9(new bv9());
        }
        d7f t = t7kVar.b().t(b0, jSONObject);
        nv9 nv9Var = t instanceof nv9 ? (nv9) t : null;
        if (nv9Var != null) {
            return ((av9) t6fVar.m9.getValue()).b(nv9Var);
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, xu9 xu9Var) {
        boolean z = xu9Var instanceof wu9;
        t6f t6fVar = this.a;
        if (z) {
            ((hv9) t6fVar.h9.getValue()).getClass();
            JSONObject jSONObject = new JSONObject();
            etn.l0(t7kVar, jSONObject, "type", "non_modal");
            return jSONObject;
        }
        if (!(xu9Var instanceof vu9)) {
            b6e.s();
            return null;
        }
        ((cv9) t6fVar.e9.getValue()).getClass();
        JSONObject jSONObject2 = new JSONObject();
        etn.l0(t7kVar, jSONObject2, "type", "modal");
        return jSONObject2;
    }
}
