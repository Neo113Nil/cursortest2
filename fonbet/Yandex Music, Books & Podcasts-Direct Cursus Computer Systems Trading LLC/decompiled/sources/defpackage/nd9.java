package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class nd9 implements gip, r8s {
    public static pd9 c(t7k t7kVar, pd9 pd9Var, JSONObject jSONObject) {
        return new pd9(y2x.K(y1g.Y(t7kVar), jSONObject, Constants.KEY_VALUE, vct.d, t7kVar.d(), pd9Var != null ? pd9Var.a : null, kzj.E, bcx.h));
    }

    public static JSONObject d(t7k t7kVar, pd9 pd9Var) {
        JSONObject w = ouj.w(t7kVar, "type", "translation-percentage");
        y2x.f0(t7kVar, w, Constants.KEY_VALUE, pd9Var.a);
        return w;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (pd9) obj);
    }
}
