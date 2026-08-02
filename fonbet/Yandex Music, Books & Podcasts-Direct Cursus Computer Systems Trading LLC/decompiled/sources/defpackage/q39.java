package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class q39 implements gip, py7 {
    public final t6f a;

    public q39(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        String b0 = etn.b0(jSONObject);
        boolean equals = b0.equals("default");
        t6f t6fVar = this.a;
        if (equals) {
            return new n39(((jw8) t6fVar.S2.getValue()).a(t7kVar, jSONObject));
        }
        if (b0.equals("stretch")) {
            return new o39(((gn9) t6fVar.O7.getValue()).a(t7kVar, jSONObject));
        }
        d7f t = t7kVar.b().t(b0, jSONObject);
        v39 v39Var = t instanceof v39 ? (v39) t : null;
        if (v39Var != null) {
            return ((s39) t6fVar.o4.getValue()).a(t7kVar, v39Var, jSONObject);
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, p39 p39Var) {
        boolean z = p39Var instanceof n39;
        t6f t6fVar = this.a;
        if (z) {
            return ((jw8) t6fVar.S2.getValue()).b(t7kVar, ((n39) p39Var).b);
        }
        if (p39Var instanceof o39) {
            return ((gn9) t6fVar.O7.getValue()).b(t7kVar, ((o39) p39Var).b);
        }
        b6e.s();
        return null;
    }
}
