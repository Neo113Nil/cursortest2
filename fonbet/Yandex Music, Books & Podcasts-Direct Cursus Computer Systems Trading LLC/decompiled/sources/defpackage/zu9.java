package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zu9 implements gip, py7 {
    public final t6f a;

    public zu9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        Object lv9Var;
        Object obj;
        Object obj2;
        String b0 = etn.b0(jSONObject);
        d7f d7fVar = t7kVar.b().get(b0);
        Object obj3 = null;
        nv9 nv9Var = d7fVar instanceof nv9 ? (nv9) d7fVar : null;
        if (nv9Var != null) {
            if (nv9Var instanceof mv9) {
                b0 = "non_modal";
            } else {
                if (!(nv9Var instanceof lv9)) {
                    b6e.s();
                    return null;
                }
                b0 = "modal";
            }
        }
        boolean equals = b0.equals("non_modal");
        t6f t6fVar = this.a;
        if (equals) {
            iv9 iv9Var = (iv9) t6fVar.i9.getValue();
            if (nv9Var != null) {
                if (nv9Var instanceof mv9) {
                    obj2 = ((mv9) nv9Var).a;
                } else {
                    if (!(nv9Var instanceof lv9)) {
                        b6e.s();
                        return null;
                    }
                    obj2 = ((lv9) nv9Var).a;
                }
                obj3 = obj2;
            }
            iv9Var.getClass();
            lv9Var = new mv9(new kv9());
            return lv9Var;
        }
        if (!b0.equals("modal")) {
            throw a8k.l(jSONObject, "type", b0);
        }
        dv9 dv9Var = (dv9) t6fVar.f9.getValue();
        if (nv9Var != null) {
            if (nv9Var instanceof mv9) {
                obj = ((mv9) nv9Var).a;
            } else {
                if (!(nv9Var instanceof lv9)) {
                    b6e.s();
                    return null;
                }
                obj = ((lv9) nv9Var).a;
            }
            obj3 = obj;
        }
        dv9Var.getClass();
        lv9Var = new lv9(new fv9());
        return lv9Var;
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, nv9 nv9Var) {
        boolean z = nv9Var instanceof mv9;
        t6f t6fVar = this.a;
        if (z) {
            ((iv9) t6fVar.i9.getValue()).getClass();
            JSONObject jSONObject = new JSONObject();
            etn.l0(t7kVar, jSONObject, "type", "non_modal");
            return jSONObject;
        }
        if (!(nv9Var instanceof lv9)) {
            b6e.s();
            return null;
        }
        ((dv9) t6fVar.f9.getValue()).getClass();
        JSONObject jSONObject2 = new JSONObject();
        etn.l0(t7kVar, jSONObject2, "type", "modal");
        return jSONObject2;
    }
}
