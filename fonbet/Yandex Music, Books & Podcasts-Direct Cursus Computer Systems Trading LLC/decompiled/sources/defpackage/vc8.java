package defpackage;

import com.connectsdk.service.DeviceService;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class vc8 implements gip, py7 {
    public static JSONObject c(t7k t7kVar, tc8 tc8Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, DeviceService.KEY_DESC, tc8Var.a);
        e5f.g(t7kVar, jSONObject, "hint", tc8Var.b);
        e5f.g(t7kVar, jSONObject, "is_checked", tc8Var.c);
        szb szbVar = tc8Var.d;
        if (szbVar != null) {
            Object b = szbVar.b();
            try {
                if (szbVar instanceof pzb) {
                    jSONObject.put("mode", b);
                } else {
                    jSONObject.put("mode", ((rc8) b).a);
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        e5f.g(t7kVar, jSONObject, "mute_after_action", tc8Var.e);
        e5f.g(t7kVar, jSONObject, "state_description", tc8Var.f);
        sc8 sc8Var = tc8Var.g;
        if (sc8Var != null) {
            try {
                jSONObject.put("type", sc8Var.a);
            } catch (JSONException e2) {
                t7kVar.a().a(e2);
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v6, types: [szb] */
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.c;
        szb c = e5f.c(t7kVar, jSONObject, DeviceService.KEY_DESC);
        s3f s3fVar = bcx.i;
        ns9 ns9Var = bcx.h;
        szb e = e5f.e(t7kVar, jSONObject, "hint", ox8Var, s3fVar, ns9Var, null);
        ox8 ox8Var2 = vct.a;
        kzj kzjVar = kzj.B;
        szb e2 = e5f.e(t7kVar, jSONObject, "is_checked", ox8Var2, kzjVar, ns9Var, null);
        tct tctVar = xc8.d;
        va8 va8Var = va8.t;
        ozb ozbVar = xc8.a;
        ?? e3 = e5f.e(t7kVar, jSONObject, "mode", tctVar, va8Var, ns9Var, ozbVar);
        ozb ozbVar2 = e3 == 0 ? ozbVar : e3;
        ozb ozbVar3 = xc8.b;
        ?? e4 = e5f.e(t7kVar, jSONObject, "mute_after_action", ox8Var2, kzjVar, ns9Var, ozbVar3);
        ozb ozbVar4 = e4 == 0 ? ozbVar3 : e4;
        szb e5 = e5f.e(t7kVar, jSONObject, "state_description", ox8Var, s3fVar, ns9Var, null);
        sc8 sc8Var = (sc8) etn.X(t7kVar, jSONObject, va8.v);
        if (sc8Var == null) {
            sc8Var = xc8.c;
        }
        return new tc8(c, e, e2, ozbVar2, ozbVar4, e5, sc8Var);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return c(t7kVar, (tc8) obj);
    }
}
