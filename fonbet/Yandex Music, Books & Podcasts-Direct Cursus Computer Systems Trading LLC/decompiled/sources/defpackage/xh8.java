package defpackage;

import com.connectsdk.device.ConnectableDevice;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class xh8 implements u8s {
    public final t6f a;

    public xh8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final uh8 a(t7k t7kVar, bi8 bi8Var, JSONObject jSONObject) {
        szb F = h4a.F(t7kVar, bi8Var.a, jSONObject, ConnectableDevice.KEY_ID, vct.c);
        c9c c9cVar = bi8Var.b;
        t6f t6fVar = this.a;
        return new uh8(F, (th8) h4a.D(t7kVar, c9cVar, jSONObject, "position", t6fVar.L0, t6fVar.J0));
    }
}
