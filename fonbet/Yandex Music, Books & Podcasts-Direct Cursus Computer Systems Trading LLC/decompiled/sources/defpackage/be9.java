package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class be9 implements u8s {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [szb] */
    public static yd9 b(t7k t7kVar, de9 de9Var, JSONObject jSONObject) {
        c9c c9cVar = de9Var.a;
        tct tctVar = ce9.b;
        gd9 gd9Var = gd9.w0;
        ozb ozbVar = ce9.a;
        ?? P = h4a.P(t7kVar, c9cVar, jSONObject, "unit", tctVar, gd9Var, ozbVar);
        if (P != 0) {
            ozbVar = P;
        }
        return new yd9(ozbVar, h4a.G(t7kVar, de9Var.b, jSONObject, Constants.KEY_VALUE, vct.b, kzj.F));
    }

    @Override // defpackage.u8s
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, d7f d7fVar, JSONObject jSONObject) {
        return b(t7kVar, (de9) d7fVar, jSONObject);
    }
}
