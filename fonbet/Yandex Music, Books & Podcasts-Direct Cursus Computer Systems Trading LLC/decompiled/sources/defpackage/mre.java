package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mre implements u8s {
    @Override // defpackage.u8s
    public final Object a(t7k t7kVar, d7f d7fVar, JSONObject jSONObject) {
        nre nreVar = (nre) d7fVar;
        return new jre(h4a.G(t7kVar, nreVar.b, jSONObject, Constants.KEY_VALUE, vct.b, kzj.F), (String) h4a.C(nreVar.a, jSONObject, "name", bcx.i, bcx.h));
    }
}
