package defpackage;

import com.connectsdk.discovery.provider.ssdp.Argument;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class dd8 implements gip, py7 {
    public final t6f a;

    public dd8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final cd8 a(t7k t7kVar, JSONObject jSONObject) {
        String str = (String) etn.P("animator_id", jSONObject);
        tct tctVar = gd8.a;
        qm8 qm8Var = qm8.t;
        ns9 ns9Var = bcx.h;
        szb e = e5f.e(t7kVar, jSONObject, Argument.TAG_DIRECTION, tctVar, qm8Var, ns9Var, null);
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        szb e2 = e5f.e(t7kVar, jSONObject, "duration", ox8Var, kzjVar, gd8.c, null);
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.F9;
        return new cd8(str, e, e2, (wx9) etn.U(t7kVar, jSONObject, "end_value", jyrVar), e5f.e(t7kVar, jSONObject, "interpolator", gd8.b, qm8.v, ns9Var, null), (lu8) etn.U(t7kVar, jSONObject, "repeat_count", t6fVar.E2), e5f.e(t7kVar, jSONObject, "start_delay", ox8Var, kzjVar, gd8.d, null), (wx9) etn.U(t7kVar, jSONObject, "start_value", jyrVar));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, cd8 cd8Var) {
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.F9;
        JSONObject jSONObject = new JSONObject();
        etn.l0(t7kVar, jSONObject, "animator_id", cd8Var.a);
        szb szbVar = cd8Var.b;
        if (szbVar != null) {
            Object b = szbVar.b();
            try {
                if (szbVar instanceof pzb) {
                    jSONObject.put(Argument.TAG_DIRECTION, b);
                } else {
                    jSONObject.put(Argument.TAG_DIRECTION, ((tm8) b).a);
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        e5f.g(t7kVar, jSONObject, "duration", cd8Var.c);
        etn.m0(t7kVar, jSONObject, "end_value", cd8Var.d, jyrVar);
        szb szbVar2 = cd8Var.e;
        if (szbVar2 != null) {
            Object b2 = szbVar2.b();
            try {
                if (szbVar2 instanceof pzb) {
                    jSONObject.put("interpolator", b2);
                } else {
                    jSONObject.put("interpolator", ((um8) b2).a);
                }
            } catch (JSONException e2) {
                t7kVar.a().a(e2);
            }
        }
        etn.m0(t7kVar, jSONObject, "repeat_count", cd8Var.f, t6fVar.E2);
        e5f.g(t7kVar, jSONObject, "start_delay", cd8Var.g);
        etn.m0(t7kVar, jSONObject, "start_value", cd8Var.h, jyrVar);
        etn.l0(t7kVar, jSONObject, "type", "animator_start");
        return jSONObject;
    }
}
