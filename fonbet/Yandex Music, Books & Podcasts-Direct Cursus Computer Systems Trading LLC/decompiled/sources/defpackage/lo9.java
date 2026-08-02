package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class lo9 implements gip, py7 {
    public final t6f a;

    public lo9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v26, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v5, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v52, types: [szb] */
    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final jo9 a(t7k t7kVar, JSONObject jSONObject) {
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.U9;
        jyr jyrVar2 = t6fVar.I1;
        jyr jyrVar3 = t6fVar.h3;
        jyr jyrVar4 = t6fVar.q7;
        tc8 tc8Var = (tc8) etn.U(t7kVar, jSONObject, "accessibility", t6fVar.H);
        tct tctVar = oo9.f;
        va8 va8Var = va8.x0;
        ns9 ns9Var = bcx.h;
        szb e = e5f.e(t7kVar, jSONObject, "alignment_horizontal", tctVar, va8Var, ns9Var, null);
        szb e2 = e5f.e(t7kVar, jSONObject, "alignment_vertical", oo9.g, va8.z0, ns9Var, null);
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        hm9 hm9Var = oo9.i;
        ozb ozbVar = oo9.a;
        ?? e3 = e5f.e(t7kVar, jSONObject, "alpha", ox8Var, kzjVar, hm9Var, ozbVar);
        ozb ozbVar2 = e3 == 0 ? ozbVar : e3;
        List Y = etn.Y(t7kVar, jSONObject, "animators", t6fVar.C1);
        List Y2 = etn.Y(t7kVar, jSONObject, C0479n3.g, t6fVar.O1);
        op8 op8Var = (op8) etn.U(t7kVar, jSONObject, "border", t6fVar.U1);
        ox8 ox8Var2 = vct.b;
        kzj kzjVar2 = kzj.F;
        szb e4 = e5f.e(t7kVar, jSONObject, "column_span", ox8Var2, kzjVar2, oo9.j, null);
        List Y3 = etn.Y(t7kVar, jSONObject, "disappear_actions", t6fVar.Y2);
        List Y4 = etn.Y(t7kVar, jSONObject, "extensions", t6fVar.k3);
        wz8 wz8Var = (wz8) etn.U(t7kVar, jSONObject, "focus", t6fVar.L3);
        List Y5 = etn.Y(t7kVar, jSONObject, "functions", t6fVar.U3);
        bk9 bk9Var = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.HEIGHT, jyrVar4);
        if (bk9Var == null) {
            bk9Var = oo9.b;
        }
        bk9 bk9Var2 = bk9Var;
        Object opt = jSONObject.opt(ConnectableDevice.KEY_ID);
        Object obj = JSONObject.NULL;
        if (opt == obj) {
            opt = null;
        }
        if (opt == null) {
            opt = null;
        }
        String str = (String) opt;
        ox8 ox8Var3 = vct.a;
        kzj kzjVar3 = kzj.B;
        ozb ozbVar3 = oo9.c;
        ?? e5 = e5f.e(t7kVar, jSONObject, "is_enabled", ox8Var3, kzjVar3, ns9Var, ozbVar3);
        ozb ozbVar4 = e5 == 0 ? ozbVar3 : e5;
        Object opt2 = jSONObject.opt("is_on_variable");
        Object obj2 = opt2 != obj ? opt2 : null;
        if (obj2 == null) {
            throw a8k.g("is_on_variable", jSONObject);
        }
        String str2 = (String) obj2;
        w79 w79Var = (w79) etn.U(t7kVar, jSONObject, "layout_provider", t6fVar.Y4);
        ix8 ix8Var = (ix8) etn.U(t7kVar, jSONObject, "margins", jyrVar3);
        szb e6 = e5f.e(t7kVar, jSONObject, "on_color", vct.f, kzj.G, ns9Var, null);
        ix8 ix8Var2 = (ix8) etn.U(t7kVar, jSONObject, "paddings", jyrVar3);
        szb e7 = e5f.e(t7kVar, jSONObject, "reuse_id", vct.c, bcx.i, ns9Var, null);
        szb e8 = e5f.e(t7kVar, jSONObject, "row_span", ox8Var2, kzjVar2, oo9.k, null);
        List Y6 = etn.Y(t7kVar, jSONObject, "selected_actions", t6fVar.t1);
        List Y7 = etn.Y(t7kVar, jSONObject, "tooltips", t6fVar.n9);
        qv9 qv9Var = (qv9) etn.U(t7kVar, jSONObject, "transform", t6fVar.q9);
        List Y8 = etn.Y(t7kVar, jSONObject, "transformations", t6fVar.t9);
        sq8 sq8Var = (sq8) etn.U(t7kVar, jSONObject, "transition_change", t6fVar.d2);
        un8 un8Var = (un8) etn.U(t7kVar, jSONObject, "transition_in", jyrVar2);
        un8 un8Var2 = (un8) etn.U(t7kVar, jSONObject, "transition_out", jyrVar2);
        List a0 = etn.a0(t7kVar, jSONObject, "transition_triggers", oo9.l);
        List Y9 = etn.Y(t7kVar, jSONObject, "variable_triggers", t6fVar.C9);
        List Y10 = etn.Y(t7kVar, jSONObject, "variables", t6fVar.I9);
        tct tctVar2 = oo9.h;
        jx9 jx9Var = jx9.z;
        ozb ozbVar5 = oo9.d;
        ?? e9 = e5f.e(t7kVar, jSONObject, "visibility", tctVar2, jx9Var, ns9Var, ozbVar5);
        if (e9 != 0) {
            ozbVar5 = e9;
        }
        l1a l1aVar = (l1a) etn.U(t7kVar, jSONObject, "visibility_action", jyrVar);
        List Y11 = etn.Y(t7kVar, jSONObject, "visibility_actions", jyrVar);
        bk9 bk9Var3 = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.WIDTH, jyrVar4);
        if (bk9Var3 == null) {
            bk9Var3 = oo9.e;
        }
        return new jo9(tc8Var, e, e2, ozbVar2, Y, Y2, op8Var, e4, Y3, Y4, wz8Var, Y5, bk9Var2, str, ozbVar4, str2, w79Var, ix8Var, e6, ix8Var2, e7, e8, Y6, Y7, qv9Var, Y8, sq8Var, un8Var, un8Var2, a0, Y9, Y10, ozbVar5, l1aVar, Y11, bk9Var3);
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, jo9 jo9Var) {
        JSONObject jSONObject = new JSONObject();
        tc8 tc8Var = jo9Var.a;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.U9;
        jyr jyrVar2 = t6fVar.I1;
        jyr jyrVar3 = t6fVar.h3;
        jyr jyrVar4 = t6fVar.q7;
        etn.m0(t7kVar, jSONObject, "accessibility", tc8Var, t6fVar.H);
        szb szbVar = jo9Var.b;
        if (szbVar != null) {
            Object b = szbVar.b();
            try {
                if (szbVar instanceof pzb) {
                    jSONObject.put("alignment_horizontal", b);
                } else {
                    jSONObject.put("alignment_horizontal", ((om8) b).a);
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        szb szbVar2 = jo9Var.c;
        if (szbVar2 != null) {
            Object b2 = szbVar2.b();
            try {
                if (szbVar2 instanceof pzb) {
                    jSONObject.put("alignment_vertical", b2);
                } else {
                    jSONObject.put("alignment_vertical", ((pm8) b2).a);
                }
            } catch (JSONException e2) {
                t7kVar.a().a(e2);
            }
        }
        e5f.g(t7kVar, jSONObject, "alpha", jo9Var.d);
        etn.n0(t7kVar, jSONObject, "animators", jo9Var.e, t6fVar.C1);
        etn.n0(t7kVar, jSONObject, C0479n3.g, jo9Var.f, t6fVar.O1);
        etn.m0(t7kVar, jSONObject, "border", jo9Var.g, t6fVar.U1);
        e5f.g(t7kVar, jSONObject, "column_span", jo9Var.h);
        etn.n0(t7kVar, jSONObject, "disappear_actions", jo9Var.i, t6fVar.Y2);
        etn.n0(t7kVar, jSONObject, "extensions", jo9Var.j, t6fVar.k3);
        etn.m0(t7kVar, jSONObject, "focus", jo9Var.k, t6fVar.L3);
        etn.n0(t7kVar, jSONObject, "functions", jo9Var.l, t6fVar.U3);
        etn.m0(t7kVar, jSONObject, CameraProperty.HEIGHT, jo9Var.m, jyrVar4);
        etn.l0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, jo9Var.n);
        e5f.g(t7kVar, jSONObject, "is_enabled", jo9Var.o);
        etn.l0(t7kVar, jSONObject, "is_on_variable", jo9Var.p);
        etn.m0(t7kVar, jSONObject, "layout_provider", jo9Var.q, t6fVar.Y4);
        etn.m0(t7kVar, jSONObject, "margins", jo9Var.r, jyrVar3);
        szb szbVar3 = jo9Var.s;
        if (szbVar3 != null) {
            Object b3 = szbVar3.b();
            try {
                if (szbVar3 instanceof pzb) {
                    jSONObject.put("on_color", b3);
                } else {
                    jSONObject.put("on_color", c85.a(((Number) b3).intValue()));
                }
            } catch (JSONException e3) {
                t7kVar.a().a(e3);
            }
        }
        etn.m0(t7kVar, jSONObject, "paddings", jo9Var.t, jyrVar3);
        e5f.g(t7kVar, jSONObject, "reuse_id", jo9Var.u);
        e5f.g(t7kVar, jSONObject, "row_span", jo9Var.v);
        etn.n0(t7kVar, jSONObject, "selected_actions", jo9Var.w, t6fVar.t1);
        etn.n0(t7kVar, jSONObject, "tooltips", jo9Var.x, t6fVar.n9);
        etn.m0(t7kVar, jSONObject, "transform", jo9Var.y, t6fVar.q9);
        etn.n0(t7kVar, jSONObject, "transformations", jo9Var.z, t6fVar.t9);
        etn.m0(t7kVar, jSONObject, "transition_change", jo9Var.A, t6fVar.d2);
        etn.m0(t7kVar, jSONObject, "transition_in", jo9Var.B, jyrVar2);
        etn.m0(t7kVar, jSONObject, "transition_out", jo9Var.C, jyrVar2);
        List list = jo9Var.D;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < size; i++) {
                jSONArray.put(((nw9) list.get(i)).a);
            }
            try {
                jSONObject.put("transition_triggers", jSONArray);
            } catch (JSONException e4) {
                t7kVar.a().a(e4);
            }
        }
        etn.l0(t7kVar, jSONObject, "type", "switch");
        etn.n0(t7kVar, jSONObject, "variable_triggers", jo9Var.E, t6fVar.C9);
        etn.n0(t7kVar, jSONObject, "variables", jo9Var.F, t6fVar.I9);
        szb szbVar4 = jo9Var.G;
        if (szbVar4 != null) {
            Object b4 = szbVar4.b();
            try {
                if (szbVar4 instanceof pzb) {
                    jSONObject.put("visibility", b4);
                } else {
                    jSONObject.put("visibility", ((k1a) b4).a);
                }
            } catch (JSONException e5) {
                t7kVar.a().a(e5);
            }
        }
        etn.m0(t7kVar, jSONObject, "visibility_action", jo9Var.H, jyrVar);
        etn.n0(t7kVar, jSONObject, "visibility_actions", jo9Var.I, jyrVar);
        etn.m0(t7kVar, jSONObject, CameraProperty.WIDTH, jo9Var.J, jyrVar4);
        return jSONObject;
    }
}
