package defpackage;

import com.connectsdk.device.ConnectableDevice;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class qh8 implements u8s {
    public final t6f a;

    public qh8(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [szb] */
    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final nh8 a(t7k t7kVar, sh8 sh8Var, JSONObject jSONObject) {
        c9c c9cVar = sh8Var.a;
        ox8 ox8Var = vct.a;
        kzj kzjVar = kzj.B;
        ozb ozbVar = rh8.a;
        ?? P = h4a.P(t7kVar, c9cVar, jSONObject, "animated", ox8Var, kzjVar, ozbVar);
        if (P != 0) {
            ozbVar = P;
        }
        c9c c9cVar2 = sh8Var.b;
        t6f t6fVar = this.a;
        return new nh8(ozbVar, (dh8) h4a.D(t7kVar, c9cVar2, jSONObject, "destination", t6fVar.C0, t6fVar.A0), h4a.F(t7kVar, sh8Var.c, jSONObject, ConnectableDevice.KEY_ID, vct.c));
    }
}
