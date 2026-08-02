package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bh9 implements gip, r8s {
    public static eh9 c(t7k t7kVar, eh9 eh9Var, JSONObject jSONObject) {
        return new eh9(y2x.K(y1g.Y(t7kVar), jSONObject, Constants.KEY_VALUE, dh9.a, t7kVar.d(), eh9Var != null ? eh9Var.a : null, gd9.y, bcx.h));
    }

    public static JSONObject d(t7k t7kVar, eh9 eh9Var) {
        JSONObject w = ouj.w(t7kVar, "type", "relative");
        y2x.e0(eh9Var.a, t7kVar, Constants.KEY_VALUE, gd9.z, w);
        return w;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (eh9) obj);
    }
}
