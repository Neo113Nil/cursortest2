package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class jy8 implements gip, py7 {
    public final t6f a;

    public jy8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        Object obj;
        Object obj2;
        String b0 = etn.b0(jSONObject);
        d7f d7fVar = t7kVar.b().get(b0);
        Object obj3 = null;
        sy8 sy8Var = d7fVar instanceof sy8 ? (sy8) d7fVar : null;
        if (sy8Var != null) {
            if (sy8Var instanceof qy8) {
                b0 = "blur";
            } else {
                if (!(sy8Var instanceof ry8)) {
                    b6e.s();
                    return null;
                }
                b0 = "rtl_mirror";
            }
        }
        boolean equals = b0.equals("blur");
        t6f t6fVar = this.a;
        if (equals) {
            lp8 lp8Var = (lp8) t6fVar.S1.getValue();
            if (sy8Var != null) {
                if (sy8Var instanceof qy8) {
                    obj2 = ((qy8) sy8Var).a;
                } else if (sy8Var instanceof ry8) {
                    obj2 = ((ry8) sy8Var).a;
                } else {
                    b6e.s();
                }
                obj3 = obj2;
            }
            lp8Var.getClass();
            return new qy8(lp8.c(t7kVar, (np8) obj3, jSONObject));
        }
        if (!b0.equals("rtl_mirror")) {
            throw a8k.l(jSONObject, "type", b0);
        }
        ny8 ny8Var = (ny8) t6fVar.r3.getValue();
        if (sy8Var != null) {
            if (sy8Var instanceof qy8) {
                obj = ((qy8) sy8Var).a;
            } else if (sy8Var instanceof ry8) {
                obj = ((ry8) sy8Var).a;
            } else {
                b6e.s();
            }
            obj3 = obj;
        }
        ny8Var.getClass();
        return new ry8(new py8());
        return null;
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, sy8 sy8Var) {
        boolean z = sy8Var instanceof qy8;
        t6f t6fVar = this.a;
        if (z) {
            lp8 lp8Var = (lp8) t6fVar.S1.getValue();
            np8 np8Var = ((qy8) sy8Var).a;
            lp8Var.getClass();
            return lp8.d(t7kVar, np8Var);
        }
        if (!(sy8Var instanceof ry8)) {
            b6e.s();
            return null;
        }
        ((ny8) t6fVar.r3.getValue()).getClass();
        JSONObject jSONObject = new JSONObject();
        etn.l0(t7kVar, jSONObject, "type", "rtl_mirror");
        return jSONObject;
    }
}
