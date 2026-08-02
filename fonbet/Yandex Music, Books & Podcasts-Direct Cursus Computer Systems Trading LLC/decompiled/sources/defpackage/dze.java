package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class dze implements gip, py7 {
    public static JSONObject c(t7k t7kVar, cze czeVar) {
        JSONObject w = ouj.w(t7kVar, "type", "item_id");
        e5f.g(t7kVar, w, Constants.KEY_VALUE, czeVar.a);
        return w;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        return new cze(e5f.a(t7kVar, jSONObject, Constants.KEY_VALUE, vct.c));
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (cze) obj);
    }
}
