package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class vd6 implements gip, py7 {
    public static JSONObject c(t7k t7kVar, ud6 ud6Var) {
        JSONObject w = ouj.w(t7kVar, "type", "text");
        e5f.g(t7kVar, w, Constants.KEY_VALUE, ud6Var.a);
        return w;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        return new ud6(e5f.a(t7kVar, jSONObject, Constants.KEY_VALUE, vct.c));
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (ud6) obj);
    }
}
