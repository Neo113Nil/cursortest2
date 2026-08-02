package defpackage;

import com.connectsdk.device.ConnectableDevice;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ph8 implements gip, r8s {
    public final t6f a;

    public ph8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final sh8 c(t7k t7kVar, sh8 sh8Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new sh8(y2x.P(Y, jSONObject, "animated", vct.a, d, sh8Var != null ? sh8Var.a : null, kzj.B, bcx.h), y2x.H(Y, jSONObject, "destination", d, sh8Var != null ? sh8Var.b : null, this.a.B0), y2x.J(Y, jSONObject, ConnectableDevice.KEY_ID, vct.c, d, sh8Var != null ? sh8Var.c : null));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, sh8 sh8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, "animated", sh8Var.a);
        y2x.i0(t7kVar, jSONObject, "destination", sh8Var.b, this.a.B0);
        y2x.f0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, sh8Var.c);
        etn.l0(t7kVar, jSONObject, "type", "scroll_to");
        return jSONObject;
    }
}
