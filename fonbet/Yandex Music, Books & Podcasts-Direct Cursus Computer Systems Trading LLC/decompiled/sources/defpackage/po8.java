package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class po8 implements u8s {
    public final t6f a;

    public po8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final mo8 a(t7k t7kVar, cp8 cp8Var, JSONObject jSONObject) {
        boolean z = cp8Var instanceof yo8;
        t6f t6fVar = this.a;
        if (z) {
            return new io8(((l89) t6fVar.d5.getValue()).a(t7kVar, ((yo8) cp8Var).a, jSONObject));
        }
        if (cp8Var instanceof ap8) {
            return new ko8(((ig9) t6fVar.F6.getValue()).a(t7kVar, ((ap8) cp8Var).a, jSONObject));
        }
        if (cp8Var instanceof xo8) {
            return new ho8(((o29) t6fVar.i4.getValue()).a(t7kVar, ((xo8) cp8Var).a, jSONObject));
        }
        if (cp8Var instanceof bp8) {
            am9 am9Var = (am9) t6fVar.H7.getValue();
            bm9 bm9Var = ((bp8) cp8Var).a;
            am9Var.getClass();
            return new lo8(am9.b(t7kVar, bm9Var, jSONObject));
        }
        if (cp8Var instanceof zo8) {
            return new jo8(((o99) t6fVar.p5.getValue()).a(t7kVar, ((zo8) cp8Var).a, jSONObject));
        }
        b6e.s();
        return null;
    }
}
