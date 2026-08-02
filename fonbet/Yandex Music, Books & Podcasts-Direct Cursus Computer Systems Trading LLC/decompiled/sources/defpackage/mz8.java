package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mz8 implements u8s {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [szb] */
    public static jz8 b(t7k t7kVar, oz8 oz8Var, JSONObject jSONObject) {
        c9c c9cVar = oz8Var.a;
        tct tctVar = nz8.b;
        gd9 gd9Var = gd9.w0;
        ozb ozbVar = nz8.a;
        ?? P = h4a.P(t7kVar, c9cVar, jSONObject, "unit", tctVar, gd9Var, ozbVar);
        if (P != 0) {
            ozbVar = P;
        }
        return new jz8(ozbVar, h4a.H(t7kVar, oz8Var.b, jSONObject, Constants.KEY_VALUE, vct.b, kzj.F, nz8.c));
    }

    @Override // defpackage.u8s
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, d7f d7fVar, JSONObject jSONObject) {
        return b(t7kVar, (oz8) d7fVar, jSONObject);
    }
}
