package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class inj implements gip, r8s {
    public static knj c(t7k t7kVar, knj knjVar, JSONObject jSONObject) {
        return new knj(y2x.K(y1g.Y(t7kVar), jSONObject, Constants.KEY_VALUE, vct.b, t7kVar.d(), knjVar != null ? knjVar.a : null, kzj.F, x97.k));
    }

    public static JSONObject d(t7k t7kVar, knj knjVar) {
        JSONObject w = ouj.w(t7kVar, "type", "offset");
        y2x.f0(t7kVar, w, Constants.KEY_VALUE, knjVar.a);
        return w;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (knj) obj);
    }
}
