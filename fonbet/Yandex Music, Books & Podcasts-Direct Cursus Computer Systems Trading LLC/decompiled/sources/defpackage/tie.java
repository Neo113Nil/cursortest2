package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class tie implements gip, r8s {
    public static vie c(t7k t7kVar, vie vieVar, JSONObject jSONObject) {
        return new vie(y2x.K(y1g.Y(t7kVar), jSONObject, Constants.KEY_VALUE, vct.b, t7kVar.d(), vieVar != null ? vieVar.a : null, kzj.F, n7w.g));
    }

    public static JSONObject d(t7k t7kVar, vie vieVar) {
        JSONObject w = ouj.w(t7kVar, "type", "index");
        y2x.f0(t7kVar, w, Constants.KEY_VALUE, vieVar.a);
        return w;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (vie) obj);
    }
}
