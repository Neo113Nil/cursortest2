package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class vb9 implements gip, py7 {
    public final t6f a;

    public vb9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    @Override // defpackage.py7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        Object tb9Var;
        bc9 bc9Var;
        String b0 = etn.b0(jSONObject);
        int hashCode = b0.hashCode();
        t6f t6fVar = this.a;
        if (hashCode != -921832806) {
            if (hashCode != 97445748) {
                if (hashCode == 343327108 && b0.equals("wrap_content")) {
                    ((y99) t6fVar.t5.getValue()).getClass();
                    return new sb9(new x99());
                }
            } else if (b0.equals("fixed")) {
                tb9Var = new rb9(((h99) t6fVar.k5.getValue()).a(t7kVar, jSONObject));
                return tb9Var;
            }
            d7f t = t7kVar.b().t(b0, jSONObject);
            bc9Var = !(t instanceof bc9) ? (bc9) t : null;
            if (bc9Var == null) {
                return ((xb9) t6fVar.K5.getValue()).a(t7kVar, bc9Var, jSONObject);
            }
            throw a8k.l(jSONObject, "type", b0);
        }
        if (b0.equals("percentage")) {
            tb9Var = new tb9(((da9) t6fVar.w5.getValue()).a(t7kVar, jSONObject));
            return tb9Var;
        }
        d7f t2 = t7kVar.b().t(b0, jSONObject);
        if (!(t2 instanceof bc9)) {
        }
        if (bc9Var == null) {
        }
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, ub9 ub9Var) {
        boolean z = ub9Var instanceof tb9;
        t6f t6fVar = this.a;
        if (z) {
            return ((da9) t6fVar.w5.getValue()).b(t7kVar, ((tb9) ub9Var).b);
        }
        if (ub9Var instanceof rb9) {
            return ((h99) t6fVar.k5.getValue()).b(t7kVar, ((rb9) ub9Var).b);
        }
        if (!(ub9Var instanceof sb9)) {
            b6e.s();
            return null;
        }
        ((y99) t6fVar.t5.getValue()).getClass();
        JSONObject jSONObject = new JSONObject();
        etn.l0(t7kVar, jSONObject, "type", "wrap_content");
        return jSONObject;
    }
}
