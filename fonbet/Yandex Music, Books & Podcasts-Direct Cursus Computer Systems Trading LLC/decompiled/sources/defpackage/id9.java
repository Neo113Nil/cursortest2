package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class id9 implements gip, py7 {
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        return new hd9(e5f.b(t7kVar, jSONObject, Constants.KEY_VALUE, vct.d, kzj.E, yd5.e));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        JSONObject w = ouj.w(t7kVar, "type", "percentage");
        e5f.g(t7kVar, w, Constants.KEY_VALUE, ((hd9) obj).a);
        return w;
    }
}
