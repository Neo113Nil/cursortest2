package defpackage;

import com.connectsdk.service.airplay.PListParser;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class sir implements gip, py7 {
    public static JSONObject c(t7k t7kVar, rir rirVar) {
        JSONObject w = ouj.w(t7kVar, "type", PListParser.TAG_STRING);
        e5f.g(t7kVar, w, Constants.KEY_VALUE, rirVar.a);
        return w;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        return new rir(e5f.a(t7kVar, jSONObject, Constants.KEY_VALUE, vct.c));
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (rir) obj);
    }
}
