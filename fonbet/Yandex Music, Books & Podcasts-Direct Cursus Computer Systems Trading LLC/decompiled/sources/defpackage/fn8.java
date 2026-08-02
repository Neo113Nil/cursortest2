package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class fn8 implements gip, py7 {
    public final t6f a;

    public fn8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        String b0 = etn.b0(jSONObject);
        boolean equals = b0.equals("color_animator");
        t6f t6fVar = this.a;
        if (equals) {
            return new zm8(((zr8) t6fVar.s2.getValue()).a(t7kVar, jSONObject));
        }
        if (b0.equals("number_animator")) {
            return new an8(((r99) t6fVar.q5.getValue()).a(t7kVar, jSONObject));
        }
        d7f t = t7kVar.b().t(b0, jSONObject);
        kn8 kn8Var = t instanceof kn8 ? (kn8) t : null;
        if (kn8Var != null) {
            return ((hn8) t6fVar.E1.getValue()).a(t7kVar, kn8Var, jSONObject);
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, bn8 bn8Var) {
        boolean z = bn8Var instanceof zm8;
        t6f t6fVar = this.a;
        if (z) {
            return ((zr8) t6fVar.s2.getValue()).b(t7kVar, ((zm8) bn8Var).b);
        }
        if (bn8Var instanceof an8) {
            return ((r99) t6fVar.q5.getValue()).b(t7kVar, ((an8) bn8Var).b);
        }
        b6e.s();
        return null;
    }
}
