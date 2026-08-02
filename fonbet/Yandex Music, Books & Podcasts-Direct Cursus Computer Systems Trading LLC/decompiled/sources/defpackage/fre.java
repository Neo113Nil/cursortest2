package defpackage;

import com.connectsdk.service.airplay.PListParser;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class fre implements gip, r8s {
    public static ire c(t7k t7kVar, ire ireVar, JSONObject jSONObject) {
        return new ire(y2x.K(y1g.Y(t7kVar), jSONObject, Constants.KEY_VALUE, vct.b, t7kVar.d(), ireVar != null ? ireVar.a : null, kzj.F, bcx.h));
    }

    public static JSONObject d(t7k t7kVar, ire ireVar) {
        JSONObject w = ouj.w(t7kVar, "type", PListParser.TAG_INTEGER);
        y2x.f0(t7kVar, w, Constants.KEY_VALUE, ireVar.a);
        return w;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (ire) obj);
    }
}
