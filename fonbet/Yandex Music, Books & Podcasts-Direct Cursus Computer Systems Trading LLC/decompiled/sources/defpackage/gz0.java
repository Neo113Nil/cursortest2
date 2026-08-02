package defpackage;

import com.connectsdk.service.airplay.PListParser;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class gz0 implements gip, r8s {
    public static JSONObject c(t7k t7kVar, iz0 iz0Var) {
        JSONObject w = ouj.w(t7kVar, "type", PListParser.TAG_ARRAY);
        y2x.f0(t7kVar, w, Constants.KEY_VALUE, iz0Var.a);
        return w;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        return new iz0(y2x.J(y1g.Y(t7kVar), jSONObject, Constants.KEY_VALUE, vct.g, t7kVar.d(), null));
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (iz0) obj);
    }
}
