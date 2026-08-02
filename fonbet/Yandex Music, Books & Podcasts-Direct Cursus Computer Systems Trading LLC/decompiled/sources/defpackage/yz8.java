package defpackage;

import io.appmetrica.analytics.impl.C0479n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class yz8 implements gip, py7 {
    public final t6f a;

    public yz8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        t6f t6fVar = this.a;
        List Y = etn.Y(t7kVar, jSONObject, C0479n3.g, t6fVar.O1);
        op8 op8Var = (op8) etn.U(t7kVar, jSONObject, "border", t6fVar.U1);
        vz8 vz8Var = (vz8) etn.U(t7kVar, jSONObject, "next_focus_ids", t6fVar.O3);
        jyr jyrVar = t6fVar.t1;
        return new wz8(Y, op8Var, vz8Var, etn.Y(t7kVar, jSONObject, "on_blur", jyrVar), etn.Y(t7kVar, jSONObject, "on_focus", jyrVar));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, wz8 wz8Var) {
        JSONObject jSONObject = new JSONObject();
        List list = wz8Var.a;
        t6f t6fVar = this.a;
        etn.n0(t7kVar, jSONObject, C0479n3.g, list, t6fVar.O1);
        etn.m0(t7kVar, jSONObject, "border", wz8Var.b, t6fVar.U1);
        etn.m0(t7kVar, jSONObject, "next_focus_ids", wz8Var.c, t6fVar.O3);
        List list2 = wz8Var.d;
        jyr jyrVar = t6fVar.t1;
        etn.n0(t7kVar, jSONObject, "on_blur", list2, jyrVar);
        etn.n0(t7kVar, jSONObject, "on_focus", wz8Var.e, jyrVar);
        return jSONObject;
    }
}
