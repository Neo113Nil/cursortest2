package defpackage;

import com.connectsdk.device.ConnectableDevice;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wh8 implements gip, r8s {
    public final t6f a;

    public wh8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.r8s, defpackage.py7
    public final /* bridge */ /* synthetic */ d7f a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, null, jSONObject);
    }

    public final bi8 c(t7k t7kVar, bi8 bi8Var, JSONObject jSONObject) {
        boolean d = t7kVar.d();
        hzj Y = y1g.Y(t7kVar);
        return new bi8(y2x.J(Y, jSONObject, ConnectableDevice.KEY_ID, vct.c, d, bi8Var != null ? bi8Var.a : null), y2x.H(Y, jSONObject, "position", d, bi8Var != null ? bi8Var.b : null, this.a.K0));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, bi8 bi8Var) {
        JSONObject jSONObject = new JSONObject();
        y2x.f0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, bi8Var.a);
        y2x.i0(t7kVar, jSONObject, "position", bi8Var.b, this.a.K0);
        etn.l0(t7kVar, jSONObject, "type", "set_cursor_position");
        return jSONObject;
    }
}
