package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class r39 implements gip, py7 {
    public final t6f a;

    public r39(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        Object u39Var;
        d7f d7fVar;
        d7f d7fVar2;
        String b0 = etn.b0(jSONObject);
        d7f d7fVar3 = t7kVar.b().get(b0);
        d7f d7fVar4 = null;
        v39 v39Var = d7fVar3 instanceof v39 ? (v39) d7fVar3 : null;
        if (v39Var != null) {
            if (v39Var instanceof t39) {
                b0 = "default";
            } else {
                if (!(v39Var instanceof u39)) {
                    b6e.s();
                    return null;
                }
                b0 = "stretch";
            }
        }
        boolean equals = b0.equals("default");
        t6f t6fVar = this.a;
        if (!equals) {
            if (!b0.equals("stretch")) {
                throw a8k.l(jSONObject, "type", b0);
            }
            hn9 hn9Var = (hn9) t6fVar.P7.getValue();
            if (v39Var != null) {
                if (v39Var instanceof t39) {
                    d7fVar = ((t39) v39Var).a;
                } else {
                    if (!(v39Var instanceof u39)) {
                        b6e.s();
                        return null;
                    }
                    d7fVar = ((u39) v39Var).a;
                }
                d7fVar4 = d7fVar;
            }
            u39Var = new u39(hn9Var.c(t7kVar, (kn9) d7fVar4, jSONObject));
            return u39Var;
        }
        kw8 kw8Var = (kw8) t6fVar.T2.getValue();
        if (v39Var == null) {
            d7fVar2 = null;
        } else if (v39Var instanceof t39) {
            d7fVar2 = ((t39) v39Var).a;
        } else {
            if (!(v39Var instanceof u39)) {
                b6e.s();
                return null;
            }
            d7fVar2 = ((u39) v39Var).a;
        }
        nw8 nw8Var = (nw8) d7fVar2;
        kw8Var.getClass();
        u39Var = new t39(new nw8(y2x.N(y1g.Y(t7kVar), jSONObject, "space_between_centers", t7kVar.d(), nw8Var != null ? nw8Var.a : null, kw8Var.a.G3)));
        return u39Var;
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, v39 v39Var) {
        boolean z = v39Var instanceof t39;
        t6f t6fVar = this.a;
        if (z) {
            return ((kw8) t6fVar.T2.getValue()).b(t7kVar, ((t39) v39Var).a);
        }
        if (v39Var instanceof u39) {
            return ((hn9) t6fVar.P7.getValue()).b(t7kVar, ((u39) v39Var).a);
        }
        b6e.s();
        return null;
    }
}
