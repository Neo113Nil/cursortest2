package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class uq8 implements gip, py7 {
    public final t6f a;

    public uq8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        Object wq8Var;
        Object obj;
        Object obj2;
        String b0 = etn.b0(jSONObject);
        d7f d7fVar = t7kVar.b().get(b0);
        Object obj3 = null;
        yq8 yq8Var = d7fVar instanceof yq8 ? (yq8) d7fVar : null;
        if (yq8Var != null) {
            if (yq8Var instanceof xq8) {
                b0 = "set";
            } else {
                if (!(yq8Var instanceof wq8)) {
                    b6e.s();
                    return null;
                }
                b0 = "change_bounds";
            }
        }
        boolean equals = b0.equals("set");
        t6f t6fVar = this.a;
        if (equals) {
            nq8 nq8Var = (nq8) t6fVar.b2.getValue();
            if (yq8Var != null) {
                if (yq8Var instanceof xq8) {
                    obj2 = ((xq8) yq8Var).a;
                } else {
                    if (!(yq8Var instanceof wq8)) {
                        b6e.s();
                        return null;
                    }
                    obj2 = ((wq8) yq8Var).a;
                }
                obj3 = obj2;
            }
            wq8Var = new xq8(nq8Var.c(t7kVar, (pq8) obj3, jSONObject));
            return wq8Var;
        }
        if (!b0.equals("change_bounds")) {
            throw a8k.l(jSONObject, "type", b0);
        }
        hq8 hq8Var = (hq8) t6fVar.Y1.getValue();
        if (yq8Var != null) {
            if (yq8Var instanceof xq8) {
                obj = ((xq8) yq8Var).a;
            } else {
                if (!(yq8Var instanceof wq8)) {
                    b6e.s();
                    return null;
                }
                obj = ((wq8) yq8Var).a;
            }
            obj3 = obj;
        }
        hq8Var.getClass();
        wq8Var = new wq8(hq8.c(t7kVar, (kq8) obj3, jSONObject));
        return wq8Var;
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, yq8 yq8Var) {
        boolean z = yq8Var instanceof xq8;
        t6f t6fVar = this.a;
        if (z) {
            return ((nq8) t6fVar.b2.getValue()).b(t7kVar, ((xq8) yq8Var).a);
        }
        if (!(yq8Var instanceof wq8)) {
            b6e.s();
            return null;
        }
        hq8 hq8Var = (hq8) t6fVar.Y1.getValue();
        kq8 kq8Var = ((wq8) yq8Var).a;
        hq8Var.getClass();
        return hq8.d(t7kVar, kq8Var);
    }
}
