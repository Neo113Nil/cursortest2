package defpackage;

import com.connectsdk.service.airplay.PListParser;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class i28 implements gip, py7 {
    public static JSONObject c(t7k t7kVar, h28 h28Var) {
        JSONObject w = ouj.w(t7kVar, "type", PListParser.TAG_DICT);
        e5f.g(t7kVar, w, Constants.KEY_VALUE, h28Var.a);
        return w;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        return new h28(e5f.a(t7kVar, jSONObject, Constants.KEY_VALUE, vct.h));
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (h28) obj);
    }
}
