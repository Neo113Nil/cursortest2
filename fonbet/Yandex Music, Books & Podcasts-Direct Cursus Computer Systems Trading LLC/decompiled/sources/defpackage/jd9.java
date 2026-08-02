package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class jd9 implements gip, r8s {
    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        return new kd9(y2x.K(y1g.Y(t7kVar), jSONObject, Constants.KEY_VALUE, vct.d, t7kVar.d(), null, kzj.E, yd5.e));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        JSONObject w = ouj.w(t7kVar, "type", "percentage");
        y2x.f0(t7kVar, w, Constants.KEY_VALUE, ((kd9) obj).a);
        return w;
    }
}
