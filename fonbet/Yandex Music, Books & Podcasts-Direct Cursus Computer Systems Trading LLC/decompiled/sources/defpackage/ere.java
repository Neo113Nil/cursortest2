package defpackage;

import com.connectsdk.service.airplay.PListParser;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ere implements gip, py7 {
    public static dre c(t7k t7kVar, JSONObject jSONObject) {
        return new dre(e5f.b(t7kVar, jSONObject, Constants.KEY_VALUE, vct.b, kzj.F, bcx.h));
    }

    public static JSONObject d(t7k t7kVar, dre dreVar) {
        JSONObject w = ouj.w(t7kVar, "type", PListParser.TAG_INTEGER);
        e5f.g(t7kVar, w, Constants.KEY_VALUE, dreVar.a);
        return w;
    }

    @Override // defpackage.py7
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (dre) obj);
    }
}
