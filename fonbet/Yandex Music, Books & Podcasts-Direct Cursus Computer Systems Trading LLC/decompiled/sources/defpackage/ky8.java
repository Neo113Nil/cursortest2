package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ky8 implements u8s {
    public final t6f a;

    public ky8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final hy8 a(t7k t7kVar, sy8 sy8Var, JSONObject jSONObject) {
        boolean z = sy8Var instanceof qy8;
        t6f t6fVar = this.a;
        if (z) {
            mp8 mp8Var = (mp8) t6fVar.T1.getValue();
            np8 np8Var = ((qy8) sy8Var).a;
            mp8Var.getClass();
            return new fy8(new jp8(h4a.H(t7kVar, np8Var.a, jSONObject, "radius", vct.b, kzj.F, tt0.m)));
        }
        if (sy8Var instanceof ry8) {
            ((oy8) t6fVar.s3.getValue()).getClass();
            return new gy8(new ly8());
        }
        b6e.s();
        return null;
    }
}
