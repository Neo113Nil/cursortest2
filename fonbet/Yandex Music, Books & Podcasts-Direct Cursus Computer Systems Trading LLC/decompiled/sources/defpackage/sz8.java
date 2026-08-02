package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class sz8 implements u8s {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [szb] */
    public static pz8 b(t7k t7kVar, uz8 uz8Var, JSONObject jSONObject) {
        c9c c9cVar = uz8Var.a;
        tct tctVar = tz8.b;
        gd9 gd9Var = gd9.w0;
        ozb ozbVar = tz8.a;
        ?? P = h4a.P(t7kVar, c9cVar, jSONObject, "unit", tctVar, gd9Var, ozbVar);
        if (P != 0) {
            ozbVar = P;
        }
        return new pz8(ozbVar, h4a.G(t7kVar, uz8Var.b, jSONObject, Constants.KEY_VALUE, vct.b, kzj.F));
    }

    @Override // defpackage.u8s
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, d7f d7fVar, JSONObject jSONObject) {
        return b(t7kVar, (uz8) d7fVar, jSONObject);
    }
}
