package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class rw9 implements gip, py7 {
    public final t6f a;

    public rw9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        String b0 = etn.b0(jSONObject);
        boolean equals = b0.equals("translation-fixed");
        t6f t6fVar = this.a;
        if (equals) {
            ((qz8) t6fVar.I3.getValue()).getClass();
            return new ow9(qz8.c(t7kVar, jSONObject));
        }
        if (b0.equals("translation-percentage")) {
            ((md9) t6fVar.W5.getValue()).getClass();
            return new pw9(md9.c(t7kVar, jSONObject));
        }
        d7f t = t7kVar.b().t(b0, jSONObject);
        ww9 ww9Var = t instanceof ww9 ? (ww9) t : null;
        if (ww9Var != null) {
            return ((tw9) t6fVar.B9.getValue()).a(t7kVar, ww9Var, jSONObject);
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, qw9 qw9Var) {
        boolean z = qw9Var instanceof ow9;
        t6f t6fVar = this.a;
        if (z) {
            qz8 qz8Var = (qz8) t6fVar.I3.getValue();
            pz8 pz8Var = ((ow9) qw9Var).b;
            qz8Var.getClass();
            return qz8.d(t7kVar, pz8Var);
        }
        if (!(qw9Var instanceof pw9)) {
            b6e.s();
            return null;
        }
        md9 md9Var = (md9) t6fVar.W5.getValue();
        ld9 ld9Var = ((pw9) qw9Var).b;
        md9Var.getClass();
        return md9.d(t7kVar, ld9Var);
    }
}
