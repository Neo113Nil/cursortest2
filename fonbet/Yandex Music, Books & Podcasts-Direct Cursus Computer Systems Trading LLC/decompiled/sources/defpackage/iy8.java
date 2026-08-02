package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class iy8 implements gip, py7 {
    public final t6f a;

    public iy8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        String b0 = etn.b0(jSONObject);
        boolean equals = b0.equals("blur");
        t6f t6fVar = this.a;
        if (equals) {
            ((kp8) t6fVar.R1.getValue()).getClass();
            return new fy8(kp8.c(t7kVar, jSONObject));
        }
        if (b0.equals("rtl_mirror")) {
            ((my8) t6fVar.q3.getValue()).getClass();
            return new gy8(new ly8());
        }
        d7f t = t7kVar.b().t(b0, jSONObject);
        sy8 sy8Var = t instanceof sy8 ? (sy8) t : null;
        if (sy8Var != null) {
            return ((ky8) t6fVar.v3.getValue()).a(t7kVar, sy8Var, jSONObject);
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, hy8 hy8Var) {
        boolean z = hy8Var instanceof fy8;
        t6f t6fVar = this.a;
        if (z) {
            kp8 kp8Var = (kp8) t6fVar.R1.getValue();
            jp8 jp8Var = ((fy8) hy8Var).b;
            kp8Var.getClass();
            return kp8.d(t7kVar, jp8Var);
        }
        if (!(hy8Var instanceof gy8)) {
            b6e.s();
            return null;
        }
        ((my8) t6fVar.q3.getValue()).getClass();
        JSONObject jSONObject = new JSONObject();
        etn.l0(t7kVar, jSONObject, "type", "rtl_mirror");
        return jSONObject;
    }
}
