package defpackage;

import android.net.Uri;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mp9 implements gip, py7 {
    public final t6f a;

    public mp9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        jyr jyrVar = this.a.F3;
        jz8 jz8Var = (jz8) etn.U(t7kVar, jSONObject, CameraProperty.HEIGHT, jyrVar);
        if (jz8Var == null) {
            jz8Var = op9.a;
        }
        szb b = e5f.b(t7kVar, jSONObject, "image_url", vct.e, kzj.C, bcx.h);
        jz8 jz8Var2 = (jz8) etn.U(t7kVar, jSONObject, CameraProperty.WIDTH, jyrVar);
        if (jz8Var2 == null) {
            jz8Var2 = op9.b;
        }
        return new so9(jz8Var, b, jz8Var2);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, so9 so9Var) {
        JSONObject jSONObject = new JSONObject();
        jz8 jz8Var = so9Var.a;
        jyr jyrVar = this.a.F3;
        etn.m0(t7kVar, jSONObject, CameraProperty.HEIGHT, jz8Var, jyrVar);
        szb szbVar = so9Var.b;
        if (szbVar != null) {
            Object b = szbVar.b();
            try {
                if (szbVar instanceof pzb) {
                    jSONObject.put("image_url", b);
                } else {
                    jSONObject.put("image_url", ((Uri) b).toString());
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        etn.m0(t7kVar, jSONObject, CameraProperty.WIDTH, so9Var.c, jyrVar);
        return jSONObject;
    }
}
