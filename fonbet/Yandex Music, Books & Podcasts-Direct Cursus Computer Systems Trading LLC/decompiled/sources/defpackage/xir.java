package defpackage;

import com.connectsdk.service.airplay.PListParser;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class xir implements gip, py7 {
    public static wir c(t7k t7kVar, JSONObject jSONObject) {
        return new wir(e5f.b(t7kVar, jSONObject, Constants.KEY_VALUE, vct.c, bcx.i, bcx.h), (String) etn.P("name", jSONObject));
    }

    public static JSONObject d(t7k t7kVar, wir wirVar) {
        JSONObject jSONObject = new JSONObject();
        etn.l0(t7kVar, jSONObject, "name", wirVar.a);
        etn.l0(t7kVar, jSONObject, "type", PListParser.TAG_STRING);
        e5f.g(t7kVar, jSONObject, Constants.KEY_VALUE, wirVar.b);
        return jSONObject;
    }

    @Override // defpackage.py7
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (wir) obj);
    }
}
