package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class tf9 implements gip, py7 {
    public final t6f a;

    public tf9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        Object wf9Var;
        Object obj;
        Object obj2;
        String b0 = etn.b0(jSONObject);
        d7f d7fVar = t7kVar.b().get(b0);
        Object obj3 = null;
        xf9 xf9Var = d7fVar instanceof xf9 ? (xf9) d7fVar : null;
        if (xf9Var != null) {
            if (xf9Var instanceof vf9) {
                b0 = "fixed";
            } else {
                if (!(xf9Var instanceof wf9)) {
                    b6e.s();
                    return null;
                }
                b0 = "relative";
            }
        }
        boolean equals = b0.equals("fixed");
        t6f t6fVar = this.a;
        if (equals) {
            cg9 cg9Var = (cg9) t6fVar.s6.getValue();
            if (xf9Var != null) {
                if (xf9Var instanceof vf9) {
                    obj2 = ((vf9) xf9Var).a;
                } else {
                    if (!(xf9Var instanceof wf9)) {
                        b6e.s();
                        return null;
                    }
                    obj2 = ((wf9) xf9Var).a;
                }
                obj3 = obj2;
            }
            cg9Var.getClass();
            wf9Var = new vf9(cg9.c(t7kVar, (fg9) obj3, jSONObject));
            return wf9Var;
        }
        if (!b0.equals("relative")) {
            throw a8k.l(jSONObject, "type", b0);
        }
        vg9 vg9Var = (vg9) t6fVar.y6.getValue();
        if (xf9Var != null) {
            if (xf9Var instanceof vf9) {
                obj = ((vf9) xf9Var).a;
            } else {
                if (!(xf9Var instanceof wf9)) {
                    b6e.s();
                    return null;
                }
                obj = ((wf9) xf9Var).a;
            }
            obj3 = obj;
        }
        vg9Var.getClass();
        wf9Var = new wf9(vg9.c(t7kVar, (xg9) obj3, jSONObject));
        return wf9Var;
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, xf9 xf9Var) {
        boolean z = xf9Var instanceof vf9;
        t6f t6fVar = this.a;
        if (z) {
            cg9 cg9Var = (cg9) t6fVar.s6.getValue();
            fg9 fg9Var = ((vf9) xf9Var).a;
            cg9Var.getClass();
            return cg9.d(t7kVar, fg9Var);
        }
        if (!(xf9Var instanceof wf9)) {
            b6e.s();
            return null;
        }
        vg9 vg9Var = (vg9) t6fVar.y6.getValue();
        xg9 xg9Var = ((wf9) xf9Var).a;
        vg9Var.getClass();
        return vg9.d(t7kVar, xg9Var);
    }
}
