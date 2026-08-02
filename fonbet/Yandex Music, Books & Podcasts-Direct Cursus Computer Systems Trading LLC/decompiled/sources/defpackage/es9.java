package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class es9 implements gip, py7 {
    public final t6f a;

    public es9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        Object gs9Var;
        Object obj;
        Object obj2;
        String b0 = etn.b0(jSONObject);
        d7f d7fVar = t7kVar.b().get(b0);
        Object obj3 = null;
        is9 is9Var = d7fVar instanceof is9 ? (is9) d7fVar : null;
        if (is9Var != null) {
            if (is9Var instanceof hs9) {
                b0 = "solid";
            } else {
                if (!(is9Var instanceof gs9)) {
                    b6e.s();
                    return null;
                }
                b0 = "cloud";
            }
        }
        boolean equals = b0.equals("solid");
        t6f t6fVar = this.a;
        if (equals) {
            zl9 zl9Var = (zl9) t6fVar.G7.getValue();
            if (is9Var != null) {
                if (is9Var instanceof hs9) {
                    obj2 = ((hs9) is9Var).a;
                } else {
                    if (!(is9Var instanceof gs9)) {
                        b6e.s();
                        return null;
                    }
                    obj2 = ((gs9) is9Var).a;
                }
                obj3 = obj2;
            }
            zl9Var.getClass();
            gs9Var = new hs9(zl9.c(t7kVar, (bm9) obj3, jSONObject));
            return gs9Var;
        }
        if (!b0.equals("cloud")) {
            throw a8k.l(jSONObject, "type", b0);
        }
        hr8 hr8Var = (hr8) t6fVar.k2.getValue();
        if (is9Var != null) {
            if (is9Var instanceof hs9) {
                obj = ((hs9) is9Var).a;
            } else {
                if (!(is9Var instanceof gs9)) {
                    b6e.s();
                    return null;
                }
                obj = ((gs9) is9Var).a;
            }
            obj3 = obj;
        }
        gs9Var = new gs9(hr8Var.c(t7kVar, (jr8) obj3, jSONObject));
        return gs9Var;
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, is9 is9Var) {
        boolean z = is9Var instanceof hs9;
        t6f t6fVar = this.a;
        if (z) {
            zl9 zl9Var = (zl9) t6fVar.G7.getValue();
            bm9 bm9Var = ((hs9) is9Var).a;
            zl9Var.getClass();
            return zl9.d(t7kVar, bm9Var);
        }
        if (is9Var instanceof gs9) {
            return ((hr8) t6fVar.k2.getValue()).b(t7kVar, ((gs9) is9Var).a);
        }
        b6e.s();
        return null;
    }
}
