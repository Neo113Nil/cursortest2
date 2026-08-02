package defpackage;

import com.connectsdk.device.ConnectableDevice;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ru9 implements gip, py7 {
    public final t6f a;

    public ru9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v8, types: [szb] */
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.aa;
        jyr jyrVar2 = t6fVar.z1;
        sm8 sm8Var = (sm8) etn.U(t7kVar, jSONObject, "animation_in", jyrVar2);
        sm8 sm8Var2 = (sm8) etn.U(t7kVar, jSONObject, "animation_out", jyrVar2);
        ox8 ox8Var = vct.c;
        s3f s3fVar = bcx.i;
        ns9 ns9Var = bcx.h;
        szb e = e5f.e(t7kVar, jSONObject, "background_accessibility_description", ox8Var, s3fVar, ns9Var, null);
        Object opt = jSONObject.opt("bring_to_top_id");
        Object obj = JSONObject.NULL;
        if (opt == obj) {
            opt = null;
        }
        if (opt == null) {
            opt = null;
        }
        String str = (String) opt;
        ox8 ox8Var2 = vct.a;
        kzj kzjVar = kzj.B;
        ozb ozbVar = uu9.a;
        ?? e2 = e5f.e(t7kVar, jSONObject, "close_by_tap_outside", ox8Var2, kzjVar, ns9Var, ozbVar);
        ozb ozbVar2 = e2 == 0 ? ozbVar : e2;
        jc8 jc8Var = (jc8) etn.O(t7kVar, jSONObject, "div", jyrVar);
        ox8 ox8Var3 = vct.b;
        kzj kzjVar2 = kzj.F;
        ns9 ns9Var2 = uu9.e;
        ozb ozbVar3 = uu9.b;
        ?? e3 = e5f.e(t7kVar, jSONObject, "duration", ox8Var3, kzjVar2, ns9Var2, ozbVar3);
        if (e3 != 0) {
            ozbVar3 = e3;
        }
        Object opt2 = jSONObject.opt(ConnectableDevice.KEY_ID);
        Object obj2 = opt2 != obj ? opt2 : null;
        if (obj2 == null) {
            throw a8k.g(ConnectableDevice.KEY_ID, jSONObject);
        }
        String str2 = (String) obj2;
        xu9 xu9Var = (xu9) etn.U(t7kVar, jSONObject, "mode", t6fVar.k9);
        if (xu9Var == null) {
            xu9Var = uu9.c;
        }
        return new iu9(sm8Var, sm8Var2, e, str, ozbVar2, jc8Var, ozbVar3, str2, xu9Var, (bf9) etn.U(t7kVar, jSONObject, "offset", t6fVar.l6), e5f.b(t7kVar, jSONObject, "position", uu9.d, vq9.Y, ns9Var), (jc8) etn.U(t7kVar, jSONObject, "substrate_div", jyrVar), etn.Y(t7kVar, jSONObject, "tap_outside_actions", t6fVar.t1));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, iu9 iu9Var) {
        JSONObject jSONObject = new JSONObject();
        sm8 sm8Var = iu9Var.a;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.z1;
        etn.m0(t7kVar, jSONObject, "animation_in", sm8Var, jyrVar);
        etn.m0(t7kVar, jSONObject, "animation_out", iu9Var.b, jyrVar);
        e5f.g(t7kVar, jSONObject, "background_accessibility_description", iu9Var.c);
        etn.l0(t7kVar, jSONObject, "bring_to_top_id", iu9Var.d);
        e5f.g(t7kVar, jSONObject, "close_by_tap_outside", iu9Var.e);
        jc8 jc8Var = iu9Var.f;
        jyr jyrVar2 = t6fVar.aa;
        etn.m0(t7kVar, jSONObject, "div", jc8Var, jyrVar2);
        e5f.g(t7kVar, jSONObject, "duration", iu9Var.g);
        etn.l0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, iu9Var.h);
        etn.m0(t7kVar, jSONObject, "mode", iu9Var.i, t6fVar.k9);
        etn.m0(t7kVar, jSONObject, "offset", iu9Var.j, t6fVar.l6);
        szb szbVar = iu9Var.k;
        if (szbVar != null) {
            Object b = szbVar.b();
            try {
                if (szbVar instanceof pzb) {
                    jSONObject.put("position", b);
                } else {
                    jSONObject.put("position", ((hu9) b).a);
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        etn.m0(t7kVar, jSONObject, "substrate_div", iu9Var.l, jyrVar2);
        etn.n0(t7kVar, jSONObject, "tap_outside_actions", iu9Var.m, t6fVar.t1);
        return jSONObject;
    }
}
