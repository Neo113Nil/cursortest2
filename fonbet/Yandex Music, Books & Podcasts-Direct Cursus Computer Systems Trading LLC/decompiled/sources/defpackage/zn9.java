package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zn9 implements u8s {
    public final t6f a;

    public zn9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, d7f d7fVar, JSONObject jSONObject) {
        return b((ho9) d7fVar);
    }

    public final rn9 b(ho9 ho9Var) {
        boolean z = ho9Var instanceof go9;
        t6f t6fVar = this.a;
        if (z) {
            ((do9) t6fVar.W7.getValue()).getClass();
            return new qn9(new ao9());
        }
        if (ho9Var instanceof fo9) {
            ((vn9) t6fVar.T7.getValue()).getClass();
            return new pn9(new sn9());
        }
        b6e.s();
        return null;
    }
}
