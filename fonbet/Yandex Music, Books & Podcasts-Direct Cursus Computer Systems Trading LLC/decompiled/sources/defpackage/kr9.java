package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class kr9 implements gip, py7 {
    public final t6f a;

    public kr9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        String b0 = etn.b0(jSONObject);
        boolean equals = b0.equals("gradient");
        t6f t6fVar = this.a;
        if (equals) {
            return new hr9(((j89) t6fVar.b5.getValue()).a(t7kVar, jSONObject));
        }
        if (b0.equals("radial_gradient")) {
            return new ir9(((gg9) t6fVar.D6.getValue()).a(t7kVar, jSONObject));
        }
        d7f t = t7kVar.b().t(b0, jSONObject);
        pr9 pr9Var = t instanceof pr9 ? (pr9) t : null;
        if (pr9Var != null) {
            return ((mr9) t6fVar.u8.getValue()).a(t7kVar, pr9Var, jSONObject);
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, jr9 jr9Var) {
        boolean z = jr9Var instanceof hr9;
        t6f t6fVar = this.a;
        if (z) {
            return ((j89) t6fVar.b5.getValue()).b(t7kVar, ((hr9) jr9Var).b);
        }
        if (jr9Var instanceof ir9) {
            return ((gg9) t6fVar.D6.getValue()).b(t7kVar, ((ir9) jr9Var).b);
        }
        b6e.s();
        return null;
    }
}
