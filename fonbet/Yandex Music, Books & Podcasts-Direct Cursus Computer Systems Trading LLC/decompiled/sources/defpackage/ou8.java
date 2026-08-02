package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ou8 implements u8s {
    public final t6f a;

    public ou8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final lu8 a(t7k t7kVar, ru8 ru8Var, JSONObject jSONObject) {
        boolean z = ru8Var instanceof qu8;
        t6f t6fVar = this.a;
        if (z) {
            ((e49) t6fVar.u4.getValue()).getClass();
            return new ku8(new b49());
        }
        if (!(ru8Var instanceof pu8)) {
            b6e.s();
            return null;
        }
        wy8 wy8Var = (wy8) t6fVar.y3.getValue();
        xy8 xy8Var = ((pu8) ru8Var).a;
        wy8Var.getClass();
        return new ju8(new ty8(h4a.H(t7kVar, xy8Var.a, jSONObject, Constants.KEY_VALUE, vct.b, kzj.F, lg3.r)));
    }
}
