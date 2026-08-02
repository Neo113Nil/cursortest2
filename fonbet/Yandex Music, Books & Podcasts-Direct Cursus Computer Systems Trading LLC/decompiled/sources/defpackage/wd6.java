package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wd6 implements gip, r8s {
    public static JSONObject c(t7k t7kVar, yd6 yd6Var) {
        JSONObject w = ouj.w(t7kVar, "type", "text");
        y2x.f0(t7kVar, w, Constants.KEY_VALUE, yd6Var.a);
        return w;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        return new yd6(y2x.J(y1g.Y(t7kVar), jSONObject, Constants.KEY_VALUE, vct.c, t7kVar.d(), null));
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (yd6) obj);
    }
}
