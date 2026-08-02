package defpackage;

import com.connectsdk.service.airplay.PListParser;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mz0 implements gip, r8s {
    public static oz0 c(t7k t7kVar, oz0 oz0Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new oz0(y2x.G(Y, jSONObject, "name", d, oz0Var != null ? oz0Var.a : null), y2x.J(Y, jSONObject, Constants.KEY_VALUE, vct.g, d, oz0Var != null ? oz0Var.b : null));
    }

    public static JSONObject d(t7k t7kVar, oz0 oz0Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.h0(t7kVar, jSONObject, "name", oz0Var.a);
        etn.l0(t7kVar, jSONObject, "type", PListParser.TAG_ARRAY);
        y2x.f0(t7kVar, jSONObject, Constants.KEY_VALUE, oz0Var.b);
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (oz0) obj);
    }
}
