package defpackage;

import com.connectsdk.service.airplay.PListParser;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class fz0 implements gip, py7 {
    public static JSONObject c(t7k t7kVar, ez0 ez0Var) {
        JSONObject w = ouj.w(t7kVar, "type", PListParser.TAG_ARRAY);
        e5f.g(t7kVar, w, Constants.KEY_VALUE, ez0Var.a);
        return w;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        return new ez0(e5f.a(t7kVar, jSONObject, Constants.KEY_VALUE, vct.g));
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (ez0) obj);
    }
}
