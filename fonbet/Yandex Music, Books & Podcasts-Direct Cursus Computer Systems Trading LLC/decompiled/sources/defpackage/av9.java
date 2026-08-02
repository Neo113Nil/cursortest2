package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class av9 implements u8s {
    public final t6f a;

    public av9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, d7f d7fVar, JSONObject jSONObject) {
        return b((nv9) d7fVar);
    }

    public final xu9 b(nv9 nv9Var) {
        boolean z = nv9Var instanceof mv9;
        t6f t6fVar = this.a;
        if (z) {
            ((jv9) t6fVar.j9.getValue()).getClass();
            return new wu9(new gv9());
        }
        if (nv9Var instanceof lv9) {
            ((ev9) t6fVar.g9.getValue()).getClass();
            return new vu9(new bv9());
        }
        b6e.s();
        return null;
    }
}
