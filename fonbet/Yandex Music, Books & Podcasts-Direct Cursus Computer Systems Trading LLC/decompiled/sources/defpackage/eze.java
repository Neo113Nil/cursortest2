package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class eze implements gip, r8s {
    public static JSONObject c(t7k t7kVar, gze gzeVar) {
        JSONObject w = ouj.w(t7kVar, "type", "item_id");
        y2x.f0(t7kVar, w, Constants.KEY_VALUE, gzeVar.a);
        return w;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final d7f a(t7k t7kVar, JSONObject jSONObject) {
        return new gze(y2x.J(y1g.Y(t7kVar), jSONObject, Constants.KEY_VALUE, vct.c, t7kVar.d(), null));
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (gze) obj);
    }
}
