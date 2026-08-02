package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ze8 implements gip, py7 {
    public final t6f a;

    public ze8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        String b0 = etn.b0(jSONObject);
        boolean equals = b0.equals("text");
        t6f t6fVar = this.a;
        if (equals) {
            ((vd6) t6fVar.s.getValue()).getClass();
            return new we8(new ud6(e5f.a(t7kVar, jSONObject, Constants.KEY_VALUE, vct.c)));
        }
        if (b0.equals("url")) {
            ((he6) t6fVar.v.getValue()).getClass();
            return new xe8(he6.c(t7kVar, jSONObject));
        }
        d7f t = t7kVar.b().t(b0, jSONObject);
        ef8 ef8Var = t instanceof ef8 ? (ef8) t : null;
        if (ef8Var != null) {
            return ((bf8) t6fVar.e0.getValue()).a(t7kVar, ef8Var, jSONObject);
        }
        throw a8k.l(jSONObject, "type", b0);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, ye8 ye8Var) {
        boolean z = ye8Var instanceof we8;
        t6f t6fVar = this.a;
        if (z) {
            vd6 vd6Var = (vd6) t6fVar.s.getValue();
            ud6 ud6Var = ((we8) ye8Var).b;
            vd6Var.getClass();
            return vd6.c(t7kVar, ud6Var);
        }
        if (!(ye8Var instanceof xe8)) {
            b6e.s();
            return null;
        }
        he6 he6Var = (he6) t6fVar.v.getValue();
        ge6 ge6Var = ((xe8) ye8Var).b;
        he6Var.getClass();
        return he6.d(t7kVar, ge6Var);
    }
}
