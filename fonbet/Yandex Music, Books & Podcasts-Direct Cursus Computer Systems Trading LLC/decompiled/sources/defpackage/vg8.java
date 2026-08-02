package defpackage;

import com.connectsdk.device.ConnectableDevice;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class vg8 implements u8s {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [szb] */
    /* JADX WARN: Type inference failed for: r3v1, types: [szb] */
    public static sg8 b(t7k t7kVar, xg8 xg8Var, JSONObject jSONObject) {
        c9c c9cVar = xg8Var.a;
        ox8 ox8Var = vct.a;
        kzj kzjVar = kzj.B;
        ozb ozbVar = wg8.a;
        ?? P = h4a.P(t7kVar, c9cVar, jSONObject, "animated", ox8Var, kzjVar, ozbVar);
        if (P != 0) {
            ozbVar = P;
        }
        szb F = h4a.F(t7kVar, xg8Var.b, jSONObject, ConnectableDevice.KEY_ID, vct.c);
        c9c c9cVar2 = xg8Var.c;
        ox8 ox8Var2 = vct.b;
        kzj kzjVar2 = kzj.F;
        ozb ozbVar2 = wg8.b;
        szb P2 = h4a.P(t7kVar, c9cVar2, jSONObject, "item_count", ox8Var2, kzjVar2, ozbVar2);
        if (P2 == null) {
            P2 = ozbVar2;
        }
        c9c c9cVar3 = xg8Var.d;
        ozb ozbVar3 = wg8.c;
        szb P3 = h4a.P(t7kVar, c9cVar3, jSONObject, "offset", ox8Var2, kzjVar2, ozbVar3);
        if (P3 == null) {
            P3 = ozbVar3;
        }
        c9c c9cVar4 = xg8Var.e;
        tct tctVar = wg8.e;
        va8 va8Var = va8.C;
        ozb ozbVar4 = wg8.d;
        ?? P4 = h4a.P(t7kVar, c9cVar4, jSONObject, "overflow", tctVar, va8Var, ozbVar4);
        return new sg8(ozbVar, F, P2, P3, P4 == 0 ? ozbVar4 : P4);
    }

    @Override // defpackage.u8s
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, d7f d7fVar, JSONObject jSONObject) {
        return b(t7kVar, (xg8) d7fVar, jSONObject);
    }
}
