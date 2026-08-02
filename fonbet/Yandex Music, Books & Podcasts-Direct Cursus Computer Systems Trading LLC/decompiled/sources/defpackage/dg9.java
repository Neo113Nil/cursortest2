package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class dg9 implements u8s {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [szb] */
    public static ag9 b(t7k t7kVar, fg9 fg9Var, JSONObject jSONObject) {
        c9c c9cVar = fg9Var.a;
        tct tctVar = eg9.b;
        gd9 gd9Var = gd9.w0;
        ozb ozbVar = eg9.a;
        ?? P = h4a.P(t7kVar, c9cVar, jSONObject, "unit", tctVar, gd9Var, ozbVar);
        if (P != 0) {
            ozbVar = P;
        }
        return new ag9(ozbVar, h4a.G(t7kVar, fg9Var.b, jSONObject, Constants.KEY_VALUE, vct.b, kzj.F));
    }

    @Override // defpackage.u8s
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, d7f d7fVar, JSONObject jSONObject) {
        return b(t7kVar, (fg9) d7fVar, jSONObject);
    }
}
