package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class lhj implements gip, r8s {
    public static nhj c(t7k t7kVar, nhj nhjVar, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new nhj(y2x.G(Y, jSONObject, "name", d, nhjVar != null ? nhjVar.a : null), y2x.K(Y, jSONObject, Constants.KEY_VALUE, vct.d, d, nhjVar != null ? nhjVar.b : null, kzj.E, bcx.h));
    }

    public static JSONObject d(t7k t7kVar, nhj nhjVar) {
        JSONObject jSONObject = new JSONObject();
        y2x.h0(t7kVar, jSONObject, "name", nhjVar.a);
        etn.l0(t7kVar, jSONObject, "type", "number");
        y2x.f0(t7kVar, jSONObject, Constants.KEY_VALUE, nhjVar.b);
        return jSONObject;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (nhj) obj);
    }
}
