package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ki9 implements gip, py7 {
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        return new di9(e5f.c(t7kVar, jSONObject, "text"), e5f.b(t7kVar, jSONObject, Constants.KEY_VALUE, vct.c, bcx.i, bcx.h));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        di9 di9Var = (di9) obj;
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "text", di9Var.a);
        e5f.g(t7kVar, jSONObject, Constants.KEY_VALUE, di9Var.b);
        return jSONObject;
    }
}
