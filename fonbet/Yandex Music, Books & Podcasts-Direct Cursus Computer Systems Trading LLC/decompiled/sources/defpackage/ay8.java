package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ay8 implements gip, py7 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [szb] */
    /* JADX WARN: Type inference failed for: r3v1, types: [szb] */
    public static zx8 c(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        uw8 uw8Var = dy8.f;
        ozb ozbVar = dy8.a;
        ?? e = e5f.e(t7kVar, jSONObject, "alpha", ox8Var, kzjVar, uw8Var, ozbVar);
        if (e != 0) {
            ozbVar = e;
        }
        ox8 ox8Var2 = vct.b;
        kzj kzjVar2 = kzj.F;
        uw8 uw8Var2 = dy8.g;
        ozb ozbVar2 = dy8.b;
        szb e2 = e5f.e(t7kVar, jSONObject, "duration", ox8Var2, kzjVar2, uw8Var2, ozbVar2);
        if (e2 == null) {
            e2 = ozbVar2;
        }
        tct tctVar = dy8.e;
        qm8 qm8Var = qm8.v;
        ozb ozbVar3 = dy8.c;
        szb e3 = e5f.e(t7kVar, jSONObject, "interpolator", tctVar, qm8Var, bcx.h, ozbVar3);
        if (e3 == null) {
            e3 = ozbVar3;
        }
        uw8 uw8Var3 = dy8.h;
        ozb ozbVar4 = dy8.d;
        ?? e4 = e5f.e(t7kVar, jSONObject, "start_delay", ox8Var2, kzjVar2, uw8Var3, ozbVar4);
        if (e4 != 0) {
            ozbVar4 = e4;
        }
        return new zx8(ozbVar, e2, e3, ozbVar4);
    }

    public static JSONObject d(t7k t7kVar, zx8 zx8Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "alpha", zx8Var.a);
        e5f.g(t7kVar, jSONObject, "duration", zx8Var.b);
        szb szbVar = zx8Var.c;
        if (szbVar != null) {
            Object b = szbVar.b();
            try {
                if (szbVar instanceof pzb) {
                    jSONObject.put("interpolator", b);
                } else {
                    jSONObject.put("interpolator", ((um8) b).a);
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        e5f.g(t7kVar, jSONObject, "start_delay", zx8Var.d);
        etn.l0(t7kVar, jSONObject, "type", "fade");
        return jSONObject;
    }

    @Override // defpackage.py7
    public final /* bridge */ /* synthetic */ Object a(t7k t7kVar, JSONObject jSONObject) {
        return c(t7kVar, jSONObject);
    }

    @Override // defpackage.gip
    public final /* bridge */ /* synthetic */ JSONObject b(t7k t7kVar, Object obj) {
        return d(t7kVar, (zx8) obj);
    }
}
