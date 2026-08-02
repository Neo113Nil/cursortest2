package defpackage;

import android.net.Uri;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class tr9 implements gip, py7 {
    public final t6f a;

    public tr9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v12, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v16, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v4, types: [szb] */
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.F3;
        rq9 rq9Var = (rq9) etn.U(t7kVar, jSONObject, "accessibility", t6fVar.V8);
        tct tctVar = vr9.g;
        vq9 vq9Var = vq9.t;
        ozb ozbVar = vr9.a;
        ns9 ns9Var = bcx.h;
        ?? e = e5f.e(t7kVar, jSONObject, "alignment_vertical", tctVar, vq9Var, ns9Var, ozbVar);
        ozb ozbVar2 = e == 0 ? ozbVar : e;
        jz8 jz8Var = (jz8) etn.U(t7kVar, jSONObject, CameraProperty.HEIGHT, jyrVar);
        if (jz8Var == null) {
            jz8Var = vr9.b;
        }
        jz8 jz8Var2 = jz8Var;
        tct tctVar2 = vr9.h;
        rk9 rk9Var = rk9.z0;
        ozb ozbVar3 = vr9.c;
        ?? e2 = e5f.e(t7kVar, jSONObject, "indexing_direction", tctVar2, rk9Var, ns9Var, ozbVar3);
        ozb ozbVar4 = e2 == 0 ? ozbVar3 : e2;
        ox8 ox8Var = vct.a;
        kzj kzjVar = kzj.B;
        ozb ozbVar5 = vr9.d;
        ?? e3 = e5f.e(t7kVar, jSONObject, "preload_required", ox8Var, kzjVar, ns9Var, ozbVar5);
        ozb ozbVar6 = e3 == 0 ? ozbVar5 : e3;
        szb b = e5f.b(t7kVar, jSONObject, "start", vct.b, kzj.F, vr9.j);
        szb e4 = e5f.e(t7kVar, jSONObject, "tint_color", vct.f, kzj.G, ns9Var, null);
        tct tctVar3 = vr9.i;
        qm8 qm8Var = qm8.z;
        ozb ozbVar7 = vr9.e;
        ?? e5 = e5f.e(t7kVar, jSONObject, "tint_mode", tctVar3, qm8Var, ns9Var, ozbVar7);
        if (e5 != 0) {
            ozbVar7 = e5;
        }
        szb b2 = e5f.b(t7kVar, jSONObject, "url", vct.e, kzj.C, ns9Var);
        jz8 jz8Var3 = (jz8) etn.U(t7kVar, jSONObject, CameraProperty.WIDTH, jyrVar);
        if (jz8Var3 == null) {
            jz8Var3 = vr9.f;
        }
        return new tq9(rq9Var, ozbVar2, jz8Var2, ozbVar4, ozbVar6, b, e4, ozbVar7, b2, jz8Var3);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, tq9 tq9Var) {
        JSONObject jSONObject = new JSONObject();
        rq9 rq9Var = tq9Var.a;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.F3;
        etn.m0(t7kVar, jSONObject, "accessibility", rq9Var, t6fVar.V8);
        szb szbVar = tq9Var.b;
        if (szbVar != null) {
            Object b = szbVar.b();
            try {
                if (szbVar instanceof pzb) {
                    jSONObject.put("alignment_vertical", b);
                } else {
                    jSONObject.put("alignment_vertical", ((yq9) b).a);
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        etn.m0(t7kVar, jSONObject, CameraProperty.HEIGHT, tq9Var.c, jyrVar);
        szb szbVar2 = tq9Var.d;
        if (szbVar2 != null) {
            Object b2 = szbVar2.b();
            try {
                if (szbVar2 instanceof pzb) {
                    jSONObject.put("indexing_direction", b2);
                } else {
                    jSONObject.put("indexing_direction", ((sq9) b2).a);
                }
            } catch (JSONException e2) {
                t7kVar.a().a(e2);
            }
        }
        e5f.g(t7kVar, jSONObject, "preload_required", tq9Var.e);
        e5f.g(t7kVar, jSONObject, "start", tq9Var.f);
        szb szbVar3 = tq9Var.g;
        if (szbVar3 != null) {
            Object b3 = szbVar3.b();
            try {
                if (szbVar3 instanceof pzb) {
                    jSONObject.put("tint_color", b3);
                } else {
                    jSONObject.put("tint_color", c85.a(((Number) b3).intValue()));
                }
            } catch (JSONException e3) {
                t7kVar.a().a(e3);
            }
        }
        szb szbVar4 = tq9Var.h;
        if (szbVar4 != null) {
            Object b4 = szbVar4.b();
            try {
                if (szbVar4 instanceof pzb) {
                    jSONObject.put("tint_mode", b4);
                } else {
                    jSONObject.put("tint_mode", ((ip8) b4).a);
                }
            } catch (JSONException e4) {
                t7kVar.a().a(e4);
            }
        }
        szb szbVar5 = tq9Var.i;
        if (szbVar5 != null) {
            Object b5 = szbVar5.b();
            try {
                if (szbVar5 instanceof pzb) {
                    jSONObject.put("url", b5);
                } else {
                    jSONObject.put("url", ((Uri) b5).toString());
                }
            } catch (JSONException e5) {
                t7kVar.a().a(e5);
            }
        }
        etn.m0(t7kVar, jSONObject, CameraProperty.WIDTH, tq9Var.j, jyrVar);
        return jSONObject;
    }
}
