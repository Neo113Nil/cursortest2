package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class fs9 implements u8s {
    public final t6f a;

    public fs9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final cs9 a(t7k t7kVar, is9 is9Var, JSONObject jSONObject) {
        boolean z = is9Var instanceof hs9;
        t6f t6fVar = this.a;
        if (z) {
            am9 am9Var = (am9) t6fVar.H7.getValue();
            bm9 bm9Var = ((hs9) is9Var).a;
            am9Var.getClass();
            return new bs9(am9.b(t7kVar, bm9Var, jSONObject));
        }
        if (is9Var instanceof gs9) {
            return new as9(((ir8) t6fVar.l2.getValue()).a(t7kVar, ((gs9) is9Var).a, jSONObject));
        }
        b6e.s();
        return null;
    }
}
