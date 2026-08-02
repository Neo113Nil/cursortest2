package defpackage;

import com.connectsdk.service.airplay.PListParser;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class yir implements gip, r8s {
    public static ajr c(t7k t7kVar, ajr ajrVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new ajr(y2x.G(Y, jSONObject, "name", d, ajrVar != null ? ajrVar.a : null), y2x.J(Y, jSONObject, Constants.KEY_VALUE, vct.c, d, ajrVar != null ? ajrVar.b : null));
    }

    public static JSONObject d(t7k t7kVar, ajr ajrVar) {
        JSONObject jSONObject = new JSONObject();
        y2x.h0(t7kVar, jSONObject, "name", ajrVar.a);
        etn.l0(t7kVar, jSONObject, "type", PListParser.TAG_STRING);
        y2x.f0(t7kVar, jSONObject, Constants.KEY_VALUE, ajrVar.b);
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (ajr) obj);
    }
}
