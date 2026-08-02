package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class rv9 implements gip, py7 {
    public final t6f a;

    public rv9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        jyr jyrVar = this.a.i6;
        xd9 xd9Var = (xd9) etn.U(t7kVar, jSONObject, "pivot_x", jyrVar);
        if (xd9Var == null) {
            xd9Var = tv9.a;
        }
        xd9 xd9Var2 = (xd9) etn.U(t7kVar, jSONObject, "pivot_y", jyrVar);
        if (xd9Var2 == null) {
            xd9Var2 = tv9.b;
        }
        return new qv9(xd9Var, xd9Var2, e5f.e(t7kVar, jSONObject, CameraProperty.ROTATION, vct.d, kzj.E, bcx.h, null));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, qv9 qv9Var) {
        JSONObject jSONObject = new JSONObject();
        xd9 xd9Var = qv9Var.a;
        jyr jyrVar = this.a.i6;
        etn.m0(t7kVar, jSONObject, "pivot_x", xd9Var, jyrVar);
        etn.m0(t7kVar, jSONObject, "pivot_y", qv9Var.b, jyrVar);
        e5f.g(t7kVar, jSONObject, CameraProperty.ROTATION, qv9Var.c);
        return jSONObject;
    }
}
