package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class hn8 implements u8s {
    public final t6f a;

    public hn8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final bn8 a(t7k t7kVar, kn8 kn8Var, JSONObject jSONObject) {
        boolean z = kn8Var instanceof in8;
        t6f t6fVar = this.a;
        if (z) {
            return new zm8(((bs8) t6fVar.u2.getValue()).a(t7kVar, ((in8) kn8Var).a, jSONObject));
        }
        if (kn8Var instanceof jn8) {
            return new an8(((t99) t6fVar.s5.getValue()).a(t7kVar, ((jn8) kn8Var).a, jSONObject));
        }
        b6e.s();
        return null;
    }
}
