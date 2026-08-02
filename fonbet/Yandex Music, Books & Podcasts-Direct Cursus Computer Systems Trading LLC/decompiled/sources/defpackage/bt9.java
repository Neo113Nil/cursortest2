package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bt9 implements u8s {
    public final t6f a;

    public bt9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ts9 a(t7k t7kVar, qt9 qt9Var, JSONObject jSONObject) {
        boolean z = qt9Var instanceof ot9;
        t6f t6fVar = this.a;
        if (z) {
            return new rs9(((ft9) t6fVar.F8.getValue()).a(t7kVar, ((ot9) qt9Var).a, jSONObject));
        }
        if (!(qt9Var instanceof pt9)) {
            b6e.s();
            return null;
        }
        lt9 lt9Var = (lt9) t6fVar.I8.getValue();
        nt9 nt9Var = ((pt9) qt9Var).a;
        lt9Var.getClass();
        return new ss9(lt9.b(t7kVar, nt9Var, jSONObject));
    }
}
