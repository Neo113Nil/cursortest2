package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class sqt implements gip, r8s {
    public static uqt c(t7k t7kVar, uqt uqtVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new uqt(y2x.G(Y, jSONObject, "name", d, uqtVar != null ? uqtVar.a : null), y2x.K(Y, jSONObject, Constants.KEY_VALUE, vct.e, d, uqtVar != null ? uqtVar.b : null, kzj.C, bcx.h));
    }

    public static JSONObject d(t7k t7kVar, uqt uqtVar) {
        JSONObject jSONObject = new JSONObject();
        y2x.h0(t7kVar, jSONObject, "name", uqtVar.a);
        etn.l0(t7kVar, jSONObject, "type", "url");
        y2x.e0(uqtVar.b, t7kVar, Constants.KEY_VALUE, kzj.H, jSONObject);
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (uqt) obj);
    }
}
