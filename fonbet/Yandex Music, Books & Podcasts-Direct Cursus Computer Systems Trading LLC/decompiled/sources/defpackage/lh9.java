package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class lh9 implements gip, py7 {
    public final t6f a;

    public lh9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final kh9 a(t7k t7kVar, JSONObject jSONObject) {
        szb b = e5f.b(t7kVar, jSONObject, "angle", vct.d, kzj.E, bcx.h);
        jyr jyrVar = this.a.i6;
        xd9 xd9Var = (xd9) etn.U(t7kVar, jSONObject, "pivot_x", jyrVar);
        if (xd9Var == null) {
            xd9Var = oh9.a;
        }
        xd9 xd9Var2 = (xd9) etn.U(t7kVar, jSONObject, "pivot_y", jyrVar);
        if (xd9Var2 == null) {
            xd9Var2 = oh9.b;
        }
        return new kh9(xd9Var, xd9Var2, b);
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, kh9 kh9Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "angle", kh9Var.a);
        xd9 xd9Var = kh9Var.b;
        jyr jyrVar = this.a.i6;
        etn.m0(t7kVar, jSONObject, "pivot_x", xd9Var, jyrVar);
        etn.m0(t7kVar, jSONObject, "pivot_y", kh9Var.c, jyrVar);
        etn.l0(t7kVar, jSONObject, "type", CameraProperty.ROTATION);
        return jSONObject;
    }
}
