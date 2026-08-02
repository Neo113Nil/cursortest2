package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class oo8 implements gip, py7 {
    public final t6f a;

    public oo8(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        Object zo8Var;
        String b0 = etn.b0(jSONObject);
        d7f d7fVar = t7kVar.b().get(b0);
        cp8 cp8Var = d7fVar instanceof cp8 ? (cp8) d7fVar : null;
        if (cp8Var != null) {
            if (cp8Var instanceof yo8) {
                b0 = "gradient";
            } else if (cp8Var instanceof ap8) {
                b0 = "radial_gradient";
            } else if (cp8Var instanceof xo8) {
                b0 = "image";
            } else if (cp8Var instanceof bp8) {
                b0 = "solid";
            } else {
                if (!(cp8Var instanceof zo8)) {
                    b6e.s();
                    return null;
                }
                b0 = "nine_patch_image";
            }
        }
        int hashCode = b0.hashCode();
        t6f t6fVar = this.a;
        switch (hashCode) {
            case -30518633:
                if (b0.equals("nine_patch_image")) {
                    zo8Var = new zo8(((n99) t6fVar.o5.getValue()).c(t7kVar, (p99) (cp8Var != null ? cp8Var.a() : null), jSONObject));
                    return zo8Var;
                }
                throw a8k.l(jSONObject, "type", b0);
            case 89650992:
                if (b0.equals("gradient")) {
                    zo8Var = new yo8(((k89) t6fVar.c5.getValue()).c(t7kVar, (o89) (cp8Var != null ? cp8Var.a() : null), jSONObject));
                    return zo8Var;
                }
                throw a8k.l(jSONObject, "type", b0);
            case 100313435:
                if (b0.equals("image")) {
                    zo8Var = new xo8(((n29) t6fVar.h4.getValue()).c(t7kVar, (q29) (cp8Var != null ? cp8Var.a() : null), jSONObject));
                    return zo8Var;
                }
                throw a8k.l(jSONObject, "type", b0);
            case 109618859:
                if (b0.equals("solid")) {
                    zl9 zl9Var = (zl9) t6fVar.G7.getValue();
                    Object a = cp8Var != null ? cp8Var.a() : null;
                    zl9Var.getClass();
                    zo8Var = new bp8(zl9.c(t7kVar, (bm9) a, jSONObject));
                    return zo8Var;
                }
                throw a8k.l(jSONObject, "type", b0);
            case 1881846096:
                if (b0.equals("radial_gradient")) {
                    zo8Var = new ap8(((hg9) t6fVar.E6.getValue()).c(t7kVar, (gh9) (cp8Var != null ? cp8Var.a() : null), jSONObject));
                    return zo8Var;
                }
                throw a8k.l(jSONObject, "type", b0);
            default:
                throw a8k.l(jSONObject, "type", b0);
        }
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, cp8 cp8Var) {
        boolean z = cp8Var instanceof yo8;
        t6f t6fVar = this.a;
        if (z) {
            return ((k89) t6fVar.c5.getValue()).b(t7kVar, ((yo8) cp8Var).a);
        }
        if (cp8Var instanceof ap8) {
            return ((hg9) t6fVar.E6.getValue()).b(t7kVar, ((ap8) cp8Var).a);
        }
        if (cp8Var instanceof xo8) {
            return ((n29) t6fVar.h4.getValue()).b(t7kVar, ((xo8) cp8Var).a);
        }
        if (cp8Var instanceof bp8) {
            zl9 zl9Var = (zl9) t6fVar.G7.getValue();
            bm9 bm9Var = ((bp8) cp8Var).a;
            zl9Var.getClass();
            return zl9.d(t7kVar, bm9Var);
        }
        if (cp8Var instanceof zo8) {
            return ((n99) t6fVar.o5.getValue()).b(t7kVar, ((zo8) cp8Var).a);
        }
        b6e.s();
        return null;
    }
}
