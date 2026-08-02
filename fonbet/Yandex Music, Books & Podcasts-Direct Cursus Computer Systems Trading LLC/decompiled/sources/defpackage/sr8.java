package defpackage;

import com.connectsdk.device.ConnectableDevice;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class sr8 implements gip, py7 {
    public final t6f a;

    public sr8(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [szb] */
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        jc8 jc8Var = (jc8) etn.O(t7kVar, jSONObject, "div", this.a.aa);
        ox8 ox8Var = vct.c;
        s3f s3fVar = bcx.i;
        ns9 ns9Var = bcx.h;
        szb e = e5f.e(t7kVar, jSONObject, ConnectableDevice.KEY_ID, ox8Var, s3fVar, ns9Var, null);
        ox8 ox8Var2 = vct.a;
        kzj kzjVar = kzj.B;
        ozb ozbVar = ur8.a;
        ?? e2 = e5f.e(t7kVar, jSONObject, "selector", ox8Var2, kzjVar, ns9Var, ozbVar);
        if (e2 != 0) {
            ozbVar = e2;
        }
        return new or8(jc8Var, e, ozbVar);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, or8 or8Var) {
        JSONObject jSONObject = new JSONObject();
        etn.m0(t7kVar, jSONObject, "div", or8Var.a, this.a.aa);
        e5f.g(t7kVar, jSONObject, ConnectableDevice.KEY_ID, or8Var.b);
        e5f.g(t7kVar, jSONObject, "selector", or8Var.c);
        return jSONObject;
    }
}
