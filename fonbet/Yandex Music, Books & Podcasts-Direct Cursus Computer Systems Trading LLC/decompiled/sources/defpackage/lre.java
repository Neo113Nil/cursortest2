package defpackage;

import com.connectsdk.service.airplay.PListParser;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class lre implements gip, r8s {
    public static nre c(t7k t7kVar, nre nreVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new nre(y2x.G(Y, jSONObject, "name", d, nreVar != null ? nreVar.a : null), y2x.K(Y, jSONObject, Constants.KEY_VALUE, vct.b, d, nreVar != null ? nreVar.b : null, kzj.F, bcx.h));
    }

    public static JSONObject d(t7k t7kVar, nre nreVar) {
        JSONObject jSONObject = new JSONObject();
        y2x.h0(t7kVar, jSONObject, "name", nreVar.a);
        etn.l0(t7kVar, jSONObject, "type", PListParser.TAG_INTEGER);
        y2x.f0(t7kVar, jSONObject, Constants.KEY_VALUE, nreVar.b);
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (nre) obj);
    }
}
