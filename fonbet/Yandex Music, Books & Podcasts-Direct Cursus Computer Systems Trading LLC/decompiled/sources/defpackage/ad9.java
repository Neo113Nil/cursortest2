package defpackage;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ad9 implements gip, py7 {
    public final t6f a;

    public ad9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [szb] */
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.t1;
        List S = etn.S(t7kVar, jSONObject, "changes", t6fVar.Q5, cd9.c);
        tct tctVar = cd9.b;
        i49 i49Var = i49.z0;
        ozb ozbVar = cd9.a;
        ?? e = e5f.e(t7kVar, jSONObject, "mode", tctVar, i49Var, bcx.h, ozbVar);
        if (e != 0) {
            ozbVar = e;
        }
        return new wc9(ozbVar, S, etn.Y(t7kVar, jSONObject, "on_applied_actions", jyrVar), etn.Y(t7kVar, jSONObject, "on_failed_actions", jyrVar));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, wc9 wc9Var) {
        JSONObject jSONObject = new JSONObject();
        List list = wc9Var.a;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.t1;
        etn.n0(t7kVar, jSONObject, "changes", list, t6fVar.Q5);
        szb szbVar = wc9Var.b;
        if (szbVar != null) {
            Object b = szbVar.b();
            try {
                if (szbVar instanceof pzb) {
                    jSONObject.put("mode", b);
                } else {
                    jSONObject.put("mode", ((vc9) b).a);
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        etn.n0(t7kVar, jSONObject, "on_applied_actions", wc9Var.c, jyrVar);
        etn.n0(t7kVar, jSONObject, "on_failed_actions", wc9Var.d, jyrVar);
        return jSONObject;
    }
}
