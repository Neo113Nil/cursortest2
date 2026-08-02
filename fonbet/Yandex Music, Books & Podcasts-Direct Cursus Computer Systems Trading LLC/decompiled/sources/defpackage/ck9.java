package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ck9 implements gip, py7 {
    public final t6f a;

    public ck9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        String b0 = etn.b0(jSONObject);
        int hashCode = b0.hashCode();
        t6f t6fVar = this.a;
        if (hashCode != 97445748) {
            if (hashCode != 343327108) {
                if (hashCode == 1386124388 && b0.equals("match_parent")) {
                    return new zj9(((b99) t6fVar.h5.getValue()).a(t7kVar, jSONObject));
                }
            } else if (b0.equals("wrap_content")) {
                return new ak9(((y1a) t6fVar.X9.getValue()).a(t7kVar, jSONObject));
            }
        } else if (b0.equals("fixed")) {
            ((kz8) t6fVar.F3.getValue()).getClass();
            return new yj9(kz8.c(t7kVar, jSONObject));
        }
        d7f t = t7kVar.b().t(b0, jSONObject);
        ik9 ik9Var = t instanceof ik9 ? (ik9) t : null;
        if (ik9Var != null) {
            return ((ek9) t6fVar.s7.getValue()).a(t7kVar, ik9Var, jSONObject);
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, bk9 bk9Var) {
        boolean z = bk9Var instanceof yj9;
        t6f t6fVar = this.a;
        if (z) {
            kz8 kz8Var = (kz8) t6fVar.F3.getValue();
            jz8 jz8Var = ((yj9) bk9Var).b;
            kz8Var.getClass();
            return kz8.d(t7kVar, jz8Var);
        }
        if (bk9Var instanceof zj9) {
            return ((b99) t6fVar.h5.getValue()).b(t7kVar, ((zj9) bk9Var).b);
        }
        if (bk9Var instanceof ak9) {
            return ((y1a) t6fVar.X9.getValue()).b(t7kVar, ((ak9) bk9Var).b);
        }
        b6e.s();
        return null;
    }
}
