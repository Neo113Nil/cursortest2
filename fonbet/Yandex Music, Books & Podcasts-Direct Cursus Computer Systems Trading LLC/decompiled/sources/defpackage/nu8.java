package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class nu8 implements gip, py7 {
    public final t6f a;

    public nu8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        Object obj;
        Object obj2;
        String b0 = etn.b0(jSONObject);
        d7f d7fVar = t7kVar.b().get(b0);
        Object obj3 = null;
        ru8 ru8Var = d7fVar instanceof ru8 ? (ru8) d7fVar : null;
        if (ru8Var != null) {
            if (ru8Var instanceof qu8) {
                b0 = "infinity";
            } else {
                if (!(ru8Var instanceof pu8)) {
                    b6e.s();
                    return null;
                }
                b0 = "fixed";
            }
        }
        boolean equals = b0.equals("infinity");
        t6f t6fVar = this.a;
        if (equals) {
            d49 d49Var = (d49) t6fVar.t4.getValue();
            if (ru8Var != null) {
                if (ru8Var instanceof qu8) {
                    obj2 = ((qu8) ru8Var).a;
                } else if (ru8Var instanceof pu8) {
                    obj2 = ((pu8) ru8Var).a;
                } else {
                    b6e.s();
                }
                obj3 = obj2;
            }
            d49Var.getClass();
            return new qu8(new f49());
        }
        if (!b0.equals("fixed")) {
            throw a8k.l(jSONObject, "type", b0);
        }
        vy8 vy8Var = (vy8) t6fVar.x3.getValue();
        if (ru8Var != null) {
            if (ru8Var instanceof qu8) {
                obj = ((qu8) ru8Var).a;
            } else if (ru8Var instanceof pu8) {
                obj = ((pu8) ru8Var).a;
            } else {
                b6e.s();
            }
            obj3 = obj;
        }
        vy8Var.getClass();
        return new pu8(vy8.c(t7kVar, (xy8) obj3, jSONObject));
        return null;
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, ru8 ru8Var) {
        boolean z = ru8Var instanceof qu8;
        t6f t6fVar = this.a;
        if (z) {
            ((d49) t6fVar.t4.getValue()).getClass();
            JSONObject jSONObject = new JSONObject();
            etn.l0(t7kVar, jSONObject, "type", "infinity");
            return jSONObject;
        }
        if (!(ru8Var instanceof pu8)) {
            b6e.s();
            return null;
        }
        vy8 vy8Var = (vy8) t6fVar.x3.getValue();
        xy8 xy8Var = ((pu8) ru8Var).a;
        vy8Var.getClass();
        return vy8.d(t7kVar, xy8Var);
    }
}
