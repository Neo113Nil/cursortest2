package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.discovery.provider.ssdp.Argument;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class r99 implements gip, py7 {
    public final t6f a;

    public r99(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v2, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v9, types: [szb] */
    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final q99 a(t7k t7kVar, JSONObject jSONObject) {
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.t1;
        List Y = etn.Y(t7kVar, jSONObject, "cancel_actions", jyrVar);
        tct tctVar = u99.e;
        qm8 qm8Var = qm8.t;
        ozb ozbVar = u99.a;
        ns9 ns9Var = bcx.h;
        ?? e = e5f.e(t7kVar, jSONObject, Argument.TAG_DIRECTION, tctVar, qm8Var, ns9Var, ozbVar);
        ozb ozbVar2 = e == 0 ? ozbVar : e;
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        szb b = e5f.b(t7kVar, jSONObject, "duration", ox8Var, kzjVar, u99.g);
        List Y2 = etn.Y(t7kVar, jSONObject, "end_actions", jyrVar);
        ox8 ox8Var2 = vct.d;
        kzj kzjVar2 = kzj.E;
        szb b2 = e5f.b(t7kVar, jSONObject, "end_value", ox8Var2, kzjVar2, ns9Var);
        Object opt = jSONObject.opt(ConnectableDevice.KEY_ID);
        Object obj = JSONObject.NULL;
        if (opt == obj) {
            opt = null;
        }
        if (opt == null) {
            throw a8k.g(ConnectableDevice.KEY_ID, jSONObject);
        }
        String str = (String) opt;
        tct tctVar2 = u99.f;
        qm8 qm8Var2 = qm8.v;
        ozb ozbVar3 = u99.b;
        ?? e2 = e5f.e(t7kVar, jSONObject, "interpolator", tctVar2, qm8Var2, ns9Var, ozbVar3);
        ozb ozbVar4 = e2 == 0 ? ozbVar3 : e2;
        lu8 lu8Var = (lu8) etn.U(t7kVar, jSONObject, "repeat_count", t6fVar.E2);
        if (lu8Var == null) {
            lu8Var = u99.c;
        }
        lu8 lu8Var2 = lu8Var;
        l29 l29Var = u99.h;
        ozb ozbVar5 = u99.d;
        ?? e3 = e5f.e(t7kVar, jSONObject, "start_delay", ox8Var, kzjVar, l29Var, ozbVar5);
        ozb ozbVar6 = e3 == 0 ? ozbVar5 : e3;
        szb e4 = e5f.e(t7kVar, jSONObject, "start_value", ox8Var2, kzjVar2, ns9Var, null);
        Object opt2 = jSONObject.opt("variable_name");
        Object obj2 = opt2 != obj ? opt2 : null;
        if (obj2 != null) {
            return new q99(Y, ozbVar2, b, Y2, b2, str, ozbVar4, lu8Var2, ozbVar6, e4, (String) obj2);
        }
        throw a8k.g("variable_name", jSONObject);
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, q99 q99Var) {
        JSONObject jSONObject = new JSONObject();
        List list = q99Var.a;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.t1;
        etn.n0(t7kVar, jSONObject, "cancel_actions", list, jyrVar);
        szb szbVar = q99Var.b;
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
        e5f.g(t7kVar, jSONObject, "duration", q99Var.c);
        etn.n0(t7kVar, jSONObject, "end_actions", q99Var.d, jyrVar);
        e5f.g(t7kVar, jSONObject, "end_value", q99Var.e);
        etn.l0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, q99Var.f);
        szb szbVar2 = q99Var.g;
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
        etn.m0(t7kVar, jSONObject, "repeat_count", q99Var.h, t6fVar.E2);
        e5f.g(t7kVar, jSONObject, "start_delay", q99Var.i);
        e5f.g(t7kVar, jSONObject, "start_value", q99Var.j);
        etn.l0(t7kVar, jSONObject, "type", "number_animator");
        etn.l0(t7kVar, jSONObject, "variable_name", q99Var.k);
        return jSONObject;
    }
}
