package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class uf9 implements u8s {
    public final t6f a;

    public uf9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final rf9 a(t7k t7kVar, xf9 xf9Var, JSONObject jSONObject) {
        boolean z = xf9Var instanceof vf9;
        t6f t6fVar = this.a;
        if (z) {
            dg9 dg9Var = (dg9) t6fVar.t6.getValue();
            fg9 fg9Var = ((vf9) xf9Var).a;
            dg9Var.getClass();
            return new pf9(dg9.b(t7kVar, fg9Var, jSONObject));
        }
        if (!(xf9Var instanceof wf9)) {
            b6e.s();
            return null;
        }
        wg9 wg9Var = (wg9) t6fVar.z6.getValue();
        xg9 xg9Var = ((wf9) xf9Var).a;
        wg9Var.getClass();
        return new qf9(new tg9(h4a.G(t7kVar, xg9Var.a, jSONObject, Constants.KEY_VALUE, vct.d, kzj.E)));
    }
}
