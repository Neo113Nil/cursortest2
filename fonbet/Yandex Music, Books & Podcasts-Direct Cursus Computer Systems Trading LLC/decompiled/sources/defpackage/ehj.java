package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ehj implements gip, py7 {
    public static dhj c(t7k t7kVar, JSONObject jSONObject) {
        return new dhj(e5f.b(t7kVar, jSONObject, Constants.KEY_VALUE, vct.d, kzj.E, bcx.h));
    }

    public static JSONObject d(t7k t7kVar, dhj dhjVar) {
        JSONObject w = ouj.w(t7kVar, "type", "number");
        e5f.g(t7kVar, w, Constants.KEY_VALUE, dhjVar.a);
        return w;
    }

    @Override // defpackage.py7
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (dhj) obj);
    }
}
