package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class sie implements gip, py7 {
    public static rie c(t7k t7kVar, JSONObject jSONObject) {
        return new rie(e5f.b(t7kVar, jSONObject, Constants.KEY_VALUE, vct.b, kzj.F, n7w.g));
    }

    public static JSONObject d(t7k t7kVar, rie rieVar) {
        JSONObject w = ouj.w(t7kVar, "type", "index");
        e5f.g(t7kVar, w, Constants.KEY_VALUE, rieVar.a);
        return w;
    }

    @Override // defpackage.py7
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (rie) obj);
    }
}
