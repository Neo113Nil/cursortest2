package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mn9 implements gip, py7 {
    public final t6f a;

    public mn9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [szb] */
    /* JADX WARN: Type inference failed for: r4v4, types: [szb] */
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.f;
        kzj kzjVar = kzj.G;
        ns9 ns9Var = bcx.h;
        szb b = e5f.b(t7kVar, jSONObject, "color", ox8Var, kzjVar, ns9Var);
        rn9 rn9Var = (rn9) etn.U(t7kVar, jSONObject, "style", this.a.X7);
        if (rn9Var == null) {
            rn9Var = on9.a;
        }
        tct tctVar = on9.d;
        gd9 gd9Var = gd9.w0;
        ozb ozbVar = on9.b;
        ?? e = e5f.e(t7kVar, jSONObject, "unit", tctVar, gd9Var, ns9Var, ozbVar);
        if (e != 0) {
            ozbVar = e;
        }
        ox8 ox8Var2 = vct.d;
        kzj kzjVar2 = kzj.E;
        hm9 hm9Var = on9.e;
        ozb ozbVar2 = on9.c;
        ?? e2 = e5f.e(t7kVar, jSONObject, CameraProperty.WIDTH, ox8Var2, kzjVar2, hm9Var, ozbVar2);
        if (e2 != 0) {
            ozbVar2 = e2;
        }
        return new ln9(b, rn9Var, ozbVar, ozbVar2);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, ln9 ln9Var) {
        JSONObject jSONObject = new JSONObject();
        szb szbVar = ln9Var.a;
        if (szbVar != null) {
            Object b = szbVar.b();
            try {
                if (szbVar instanceof pzb) {
                    jSONObject.put("color", b);
                } else {
                    jSONObject.put("color", c85.a(((Number) b).intValue()));
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        etn.m0(t7kVar, jSONObject, "style", ln9Var.b, this.a.X7);
        szb szbVar2 = ln9Var.c;
        if (szbVar2 != null) {
            Object b2 = szbVar2.b();
            try {
                if (szbVar2 instanceof pzb) {
                    jSONObject.put("unit", b2);
                } else {
                    jSONObject.put("unit", ((jk9) b2).a);
                }
            } catch (JSONException e2) {
                t7kVar.a().a(e2);
            }
        }
        e5f.g(t7kVar, jSONObject, CameraProperty.WIDTH, ln9Var.d);
        return jSONObject;
    }
}
