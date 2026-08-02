package defpackage;

import com.connectsdk.device.ConnectableDevice;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class vh8 implements gip, py7 {
    public final t6f a;

    public vh8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final uh8 a(t7k t7kVar, JSONObject jSONObject) {
        return new uh8(e5f.a(t7kVar, jSONObject, ConnectableDevice.KEY_ID, vct.c), (th8) etn.O(t7kVar, jSONObject, "position", this.a.J0));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, uh8 uh8Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, ConnectableDevice.KEY_ID, uh8Var.a);
        etn.m0(t7kVar, jSONObject, "position", uh8Var.b, this.a.J0);
        etn.l0(t7kVar, jSONObject, "type", "set_cursor_position");
        return jSONObject;
    }
}
