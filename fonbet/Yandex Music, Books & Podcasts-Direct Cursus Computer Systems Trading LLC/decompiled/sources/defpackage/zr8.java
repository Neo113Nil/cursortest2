package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.discovery.provider.ssdp.Argument;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zr8 implements gip, py7 {
    public final t6f a;

    public zr8(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v2, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v9, types: [szb] */
    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final yr8 a(t7k t7kVar, JSONObject jSONObject) {
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.t1;
        List Y = etn.Y(t7kVar, jSONObject, "cancel_actions", jyrVar);
        tct tctVar = cs8.e;
        qm8 qm8Var = qm8.t;
        ozb ozbVar = cs8.a;
        ns9 ns9Var = bcx.h;
        ?? e = e5f.e(t7kVar, jSONObject, Argument.TAG_DIRECTION, tctVar, qm8Var, ns9Var, ozbVar);
        ozb ozbVar2 = e == 0 ? ozbVar : e;
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        szb b = e5f.b(t7kVar, jSONObject, "duration", ox8Var, kzjVar, cs8.g);
        List Y2 = etn.Y(t7kVar, jSONObject, "end_actions", jyrVar);
        ox8 ox8Var2 = vct.f;
        kzj kzjVar2 = kzj.G;
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
        tct tctVar2 = cs8.f;
        qm8 qm8Var2 = qm8.v;
        ozb ozbVar3 = cs8.b;
        ?? e2 = e5f.e(t7kVar, jSONObject, "interpolator", tctVar2, qm8Var2, ns9Var, ozbVar3);
        ozb ozbVar4 = e2 == 0 ? ozbVar3 : e2;
        lu8 lu8Var = (lu8) etn.U(t7kVar, jSONObject, "repeat_count", t6fVar.E2);
        if (lu8Var == null) {
            lu8Var = cs8.c;
        }
        lu8 lu8Var2 = lu8Var;
        lc8 lc8Var = cs8.h;
        ozb ozbVar5 = cs8.d;
        ?? e3 = e5f.e(t7kVar, jSONObject, "start_delay", ox8Var, kzjVar, lc8Var, ozbVar5);
        ozb ozbVar6 = e3 == 0 ? ozbVar5 : e3;
        szb e4 = e5f.e(t7kVar, jSONObject, "start_value", ox8Var2, kzjVar2, ns9Var, null);
        Object opt2 = jSONObject.opt("variable_name");
        Object obj2 = opt2 != obj ? opt2 : null;
        if (obj2 != null) {
            return new yr8(Y, ozbVar2, b, Y2, b2, str, ozbVar4, lu8Var2, ozbVar6, e4, (String) obj2);
        }
        throw a8k.g("variable_name", jSONObject);
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, yr8 yr8Var) {
        JSONObject jSONObject = new JSONObject();
        List list = yr8Var.a;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.t1;
        etn.n0(t7kVar, jSONObject, "cancel_actions", list, jyrVar);
        szb szbVar = yr8Var.b;
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
        e5f.g(t7kVar, jSONObject, "duration", yr8Var.c);
        etn.n0(t7kVar, jSONObject, "end_actions", yr8Var.d, jyrVar);
        szb szbVar2 = yr8Var.e;
        kzj kzjVar = kzj.D;
        e5f.h(t7kVar, jSONObject, "end_value", szbVar2, kzjVar);
        etn.l0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, yr8Var.f);
        szb szbVar3 = yr8Var.g;
        if (szbVar3 != null) {
            Object b2 = szbVar3.b();
            try {
                if (szbVar3 instanceof pzb) {
                    jSONObject.put("interpolator", b2);
                } else {
                    jSONObject.put("interpolator", ((um8) b2).a);
                }
            } catch (JSONException e2) {
                t7kVar.a().a(e2);
            }
        }
        etn.m0(t7kVar, jSONObject, "repeat_count", yr8Var.h, t6fVar.E2);
        e5f.g(t7kVar, jSONObject, "start_delay", yr8Var.i);
        e5f.h(t7kVar, jSONObject, "start_value", yr8Var.j, kzjVar);
        etn.l0(t7kVar, jSONObject, "type", "color_animator");
        etn.l0(t7kVar, jSONObject, "variable_name", yr8Var.k);
        return jSONObject;
    }
}
