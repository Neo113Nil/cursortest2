package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class tw9 implements u8s {
    public final t6f a;

    public tw9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final qw9 a(t7k t7kVar, ww9 ww9Var, JSONObject jSONObject) {
        boolean z = ww9Var instanceof uw9;
        t6f t6fVar = this.a;
        if (z) {
            sz8 sz8Var = (sz8) t6fVar.K3.getValue();
            uz8 uz8Var = ((uw9) ww9Var).a;
            sz8Var.getClass();
            return new ow9(sz8.b(t7kVar, uz8Var, jSONObject));
        }
        if (!(ww9Var instanceof vw9)) {
            b6e.s();
            return null;
        }
        od9 od9Var = (od9) t6fVar.Y5.getValue();
        pd9 pd9Var = ((vw9) ww9Var).a;
        od9Var.getClass();
        return new pw9(new ld9(h4a.G(t7kVar, pd9Var.a, jSONObject, Constants.KEY_VALUE, vct.d, kzj.E)));
    }
}
