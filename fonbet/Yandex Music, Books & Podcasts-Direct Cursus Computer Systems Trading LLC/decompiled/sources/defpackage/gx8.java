package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class gx8 implements u8s {
    public final t6f a;

    public gx8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final dx8 a(t7k t7kVar, hx8 hx8Var, JSONObject jSONObject) {
        if (hx8Var != null) {
            return new dx8(((oj9) this.a.j7.getValue()).a(t7kVar, hx8Var.a, jSONObject));
        }
        b6e.s();
        return null;
    }
}
