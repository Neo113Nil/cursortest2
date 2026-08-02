package defpackage;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wv8 implements gip, py7 {
    public final t6f a;

    public wv8(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [szb] */
    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final rv8 a(t7k t7kVar, JSONObject jSONObject) {
        t7k cfbVar = t7kVar instanceof cfb ? t7kVar : new cfb(t7kVar);
        t6f t6fVar = this.a;
        List Y = etn.Y(cfbVar, jSONObject, "functions", t6fVar.U3);
        Object opt = jSONObject.opt("log_id");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        if (opt == null) {
            throw a8k.g("log_id", jSONObject);
        }
        String str = (String) opt;
        List S = etn.S(cfbVar, jSONObject, "states", t6fVar.P2, yv8.c);
        List Y2 = etn.Y(cfbVar, jSONObject, "timers", t6fVar.b9);
        tct tctVar = yv8.b;
        vq9 vq9Var = vq9.x0;
        ozb ozbVar = yv8.a;
        ?? e = e5f.e(cfbVar, jSONObject, "transition_animation_selector", tctVar, vq9Var, bcx.h, ozbVar);
        t7k t7kVar2 = cfbVar;
        if (e != 0) {
            ozbVar = e;
        }
        return new rv8(Y, str, S, Y2, ozbVar, etn.Y(t7kVar2, jSONObject, "variable_triggers", t6fVar.C9), etn.Y(t7kVar2, jSONObject, "variables", t6fVar.I9), y1g.K(t7kVar2));
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, rv8 rv8Var) {
        JSONObject jSONObject = new JSONObject();
        List list = rv8Var.a;
        t6f t6fVar = this.a;
        etn.n0(t7kVar, jSONObject, "functions", list, t6fVar.U3);
        etn.l0(t7kVar, jSONObject, "log_id", rv8Var.b);
        etn.n0(t7kVar, jSONObject, "states", rv8Var.c, t6fVar.P2);
        etn.n0(t7kVar, jSONObject, "timers", rv8Var.d, t6fVar.b9);
        szb szbVar = rv8Var.e;
        if (szbVar != null) {
            Object b = szbVar.b();
            try {
                if (szbVar instanceof pzb) {
                    jSONObject.put("transition_animation_selector", b);
                } else {
                    jSONObject.put("transition_animation_selector", ((mw9) b).a);
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        etn.n0(t7kVar, jSONObject, "variable_triggers", rv8Var.f, t6fVar.C9);
        etn.n0(t7kVar, jSONObject, "variables", rv8Var.g, t6fVar.I9);
        return jSONObject;
    }
}
