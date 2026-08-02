package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class sw9 implements gip, py7 {
    public final t6f a;

    public sw9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        Object vw9Var;
        Object obj;
        Object obj2;
        String b0 = etn.b0(jSONObject);
        d7f d7fVar = t7kVar.b().get(b0);
        Object obj3 = null;
        ww9 ww9Var = d7fVar instanceof ww9 ? (ww9) d7fVar : null;
        if (ww9Var != null) {
            if (ww9Var instanceof uw9) {
                b0 = "translation-fixed";
            } else {
                if (!(ww9Var instanceof vw9)) {
                    b6e.s();
                    return null;
                }
                b0 = "translation-percentage";
            }
        }
        boolean equals = b0.equals("translation-fixed");
        t6f t6fVar = this.a;
        if (equals) {
            rz8 rz8Var = (rz8) t6fVar.J3.getValue();
            if (ww9Var != null) {
                if (ww9Var instanceof uw9) {
                    obj2 = ((uw9) ww9Var).a;
                } else {
                    if (!(ww9Var instanceof vw9)) {
                        b6e.s();
                        return null;
                    }
                    obj2 = ((vw9) ww9Var).a;
                }
                obj3 = obj2;
            }
            rz8Var.getClass();
            vw9Var = new uw9(rz8.c(t7kVar, (uz8) obj3, jSONObject));
            return vw9Var;
        }
        if (!b0.equals("translation-percentage")) {
            throw a8k.l(jSONObject, "type", b0);
        }
        nd9 nd9Var = (nd9) t6fVar.X5.getValue();
        if (ww9Var != null) {
            if (ww9Var instanceof uw9) {
                obj = ((uw9) ww9Var).a;
            } else {
                if (!(ww9Var instanceof vw9)) {
                    b6e.s();
                    return null;
                }
                obj = ((vw9) ww9Var).a;
            }
            obj3 = obj;
        }
        nd9Var.getClass();
        vw9Var = new vw9(nd9.c(t7kVar, (pd9) obj3, jSONObject));
        return vw9Var;
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, ww9 ww9Var) {
        boolean z = ww9Var instanceof uw9;
        t6f t6fVar = this.a;
        if (z) {
            rz8 rz8Var = (rz8) t6fVar.J3.getValue();
            uz8 uz8Var = ((uw9) ww9Var).a;
            rz8Var.getClass();
            return rz8.d(t7kVar, uz8Var);
        }
        if (!(ww9Var instanceof vw9)) {
            b6e.s();
            return null;
        }
        nd9 nd9Var = (nd9) t6fVar.X5.getValue();
        pd9 pd9Var = ((vw9) ww9Var).a;
        nd9Var.getClass();
        return nd9.d(t7kVar, pd9Var);
    }
}
