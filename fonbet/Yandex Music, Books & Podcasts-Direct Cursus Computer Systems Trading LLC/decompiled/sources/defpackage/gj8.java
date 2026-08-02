package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class gj8 implements gip, py7 {
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.c;
        return new zi8(e5f.a(t7kVar, jSONObject, "name", ox8Var), e5f.b(t7kVar, jSONObject, Constants.KEY_VALUE, ox8Var, bcx.i, bcx.h));
    }

    @Override // defpackage.gip
    public final JSONObject b(t7k t7kVar, Object obj) {
        zi8 zi8Var = (zi8) obj;
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "name", zi8Var.a);
        e5f.g(t7kVar, jSONObject, Constants.KEY_VALUE, zi8Var.b);
        return jSONObject;
    }
}
