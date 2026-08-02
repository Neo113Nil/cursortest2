package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mr9 implements u8s {
    public final t6f a;

    public mr9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final jr9 a(t7k t7kVar, pr9 pr9Var, JSONObject jSONObject) {
        boolean z = pr9Var instanceof nr9;
        t6f t6fVar = this.a;
        if (z) {
            return new hr9(((l89) t6fVar.d5.getValue()).a(t7kVar, ((nr9) pr9Var).a, jSONObject));
        }
        if (pr9Var instanceof or9) {
            return new ir9(((ig9) t6fVar.F6.getValue()).a(t7kVar, ((or9) pr9Var).a, jSONObject));
        }
        b6e.s();
        return null;
    }
}
