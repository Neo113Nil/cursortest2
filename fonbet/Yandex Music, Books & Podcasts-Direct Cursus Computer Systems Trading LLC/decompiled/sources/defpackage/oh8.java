package defpackage;

import com.connectsdk.device.ConnectableDevice;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class oh8 implements gip, py7 {
    public final t6f a;

    public oh8(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [szb] */
    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final nh8 a(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.a;
        kzj kzjVar = kzj.B;
        ozb ozbVar = rh8.a;
        ns9 ns9Var = bcx.h;
        ?? e = e5f.e(t7kVar, jSONObject, "animated", ox8Var, kzjVar, ns9Var, ozbVar);
        if (e != 0) {
            ozbVar = e;
        }
        return new nh8(ozbVar, (dh8) etn.O(t7kVar, jSONObject, "destination", this.a.A0), e5f.b(t7kVar, jSONObject, ConnectableDevice.KEY_ID, vct.c, bcx.i, ns9Var));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, nh8 nh8Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "animated", nh8Var.a);
        etn.m0(t7kVar, jSONObject, "destination", nh8Var.b, this.a.A0);
        e5f.g(t7kVar, jSONObject, ConnectableDevice.KEY_ID, nh8Var.c);
        etn.l0(t7kVar, jSONObject, "type", "scroll_to");
        return jSONObject;
    }
}
