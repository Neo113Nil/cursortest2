package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class at9 implements gip, py7 {
    public final t6f a;

    public at9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        Object pt9Var;
        Object obj;
        Object obj2;
        String b0 = etn.b0(jSONObject);
        d7f d7fVar = t7kVar.b().get(b0);
        Object obj3 = null;
        qt9 qt9Var = d7fVar instanceof qt9 ? (qt9) d7fVar : null;
        if (qt9Var != null) {
            if (qt9Var instanceof ot9) {
                b0 = "particles";
            } else {
                if (!(qt9Var instanceof pt9)) {
                    b6e.s();
                    return null;
                }
                b0 = "solid";
            }
        }
        boolean equals = b0.equals("particles");
        t6f t6fVar = this.a;
        if (equals) {
            et9 et9Var = (et9) t6fVar.E8.getValue();
            if (qt9Var != null) {
                if (qt9Var instanceof ot9) {
                    obj2 = ((ot9) qt9Var).a;
                } else {
                    if (!(qt9Var instanceof pt9)) {
                        b6e.s();
                        return null;
                    }
                    obj2 = ((pt9) qt9Var).a;
                }
                obj3 = obj2;
            }
            pt9Var = new ot9(et9Var.c(t7kVar, (ht9) obj3, jSONObject));
            return pt9Var;
        }
        if (!b0.equals("solid")) {
            throw a8k.l(jSONObject, "type", b0);
        }
        kt9 kt9Var = (kt9) t6fVar.H8.getValue();
        if (qt9Var != null) {
            if (qt9Var instanceof ot9) {
                obj = ((ot9) qt9Var).a;
            } else {
                if (!(qt9Var instanceof pt9)) {
                    b6e.s();
                    return null;
                }
                obj = ((pt9) qt9Var).a;
            }
            obj3 = obj;
        }
        kt9Var.getClass();
        pt9Var = new pt9(kt9.c(t7kVar, (nt9) obj3, jSONObject));
        return pt9Var;
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, qt9 qt9Var) {
        boolean z = qt9Var instanceof ot9;
        t6f t6fVar = this.a;
        if (z) {
            return ((et9) t6fVar.E8.getValue()).b(t7kVar, ((ot9) qt9Var).a);
        }
        if (!(qt9Var instanceof pt9)) {
            b6e.s();
            return null;
        }
        kt9 kt9Var = (kt9) t6fVar.H8.getValue();
        nt9 nt9Var = ((pt9) qt9Var).a;
        kt9Var.getClass();
        return kt9.d(t7kVar, nt9Var);
    }
}
