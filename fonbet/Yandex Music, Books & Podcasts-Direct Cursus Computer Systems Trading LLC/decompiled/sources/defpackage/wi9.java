package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wi9 implements gip, py7 {
    public final t6f a;

    public wi9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v18, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v63, types: [szb] */
    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ri9 a(t7k t7kVar, JSONObject jSONObject) {
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.U9;
        jyr jyrVar2 = t6fVar.I1;
        jyr jyrVar3 = t6fVar.h3;
        jyr jyrVar4 = t6fVar.q7;
        tc8 tc8Var = (tc8) etn.U(t7kVar, jSONObject, "accessibility", t6fVar.H);
        jyr jyrVar5 = t6fVar.t1;
        bd8 bd8Var = (bd8) etn.U(t7kVar, jSONObject, Constants.KEY_ACTION, jyrVar5);
        sm8 sm8Var = (sm8) etn.U(t7kVar, jSONObject, "action_animation", t6fVar.z1);
        if (sm8Var == null) {
            sm8Var = zi9.a;
        }
        sm8 sm8Var2 = sm8Var;
        List Y = etn.Y(t7kVar, jSONObject, "actions", jyrVar5);
        tct tctVar = zi9.g;
        va8 va8Var = va8.x0;
        ns9 ns9Var = bcx.h;
        szb e = e5f.e(t7kVar, jSONObject, "alignment_horizontal", tctVar, va8Var, ns9Var, null);
        szb e2 = e5f.e(t7kVar, jSONObject, "alignment_vertical", zi9.h, va8.z0, ns9Var, null);
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        mb9 mb9Var = zi9.j;
        ozb ozbVar = zi9.b;
        ?? e3 = e5f.e(t7kVar, jSONObject, "alpha", ox8Var, kzjVar, mb9Var, ozbVar);
        ozb ozbVar2 = e3 == 0 ? ozbVar : e3;
        List Y2 = etn.Y(t7kVar, jSONObject, "animators", t6fVar.C1);
        List Y3 = etn.Y(t7kVar, jSONObject, C0479n3.g, t6fVar.O1);
        op8 op8Var = (op8) etn.U(t7kVar, jSONObject, "border", t6fVar.U1);
        ox8 ox8Var2 = vct.a;
        kzj kzjVar2 = kzj.B;
        ozb ozbVar3 = zi9.c;
        ?? e4 = e5f.e(t7kVar, jSONObject, "capture_focus_on_action", ox8Var2, kzjVar2, ns9Var, ozbVar3);
        ozb ozbVar4 = e4 == 0 ? ozbVar3 : e4;
        ox8 ox8Var3 = vct.b;
        kzj kzjVar3 = kzj.F;
        szb e5 = e5f.e(t7kVar, jSONObject, "column_span", ox8Var3, kzjVar3, zi9.k, null);
        qi9 qi9Var = (qi9) etn.U(t7kVar, jSONObject, "delimiter_style", t6fVar.b7);
        List Y4 = etn.Y(t7kVar, jSONObject, "disappear_actions", t6fVar.Y2);
        List Y5 = etn.Y(t7kVar, jSONObject, "doubletap_actions", jyrVar5);
        List Y6 = etn.Y(t7kVar, jSONObject, "extensions", t6fVar.k3);
        wz8 wz8Var = (wz8) etn.U(t7kVar, jSONObject, "focus", t6fVar.L3);
        List Y7 = etn.Y(t7kVar, jSONObject, "functions", t6fVar.U3);
        bk9 bk9Var = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.HEIGHT, jyrVar4);
        if (bk9Var == null) {
            bk9Var = zi9.d;
        }
        bk9 bk9Var2 = bk9Var;
        List Y8 = etn.Y(t7kVar, jSONObject, "hover_end_actions", jyrVar5);
        List Y9 = etn.Y(t7kVar, jSONObject, "hover_start_actions", jyrVar5);
        Object opt = jSONObject.opt(ConnectableDevice.KEY_ID);
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        String str = (String) (opt != null ? opt : null);
        w79 w79Var = (w79) etn.U(t7kVar, jSONObject, "layout_provider", t6fVar.Y4);
        List Y10 = etn.Y(t7kVar, jSONObject, "longtap_actions", jyrVar5);
        ix8 ix8Var = (ix8) etn.U(t7kVar, jSONObject, "margins", jyrVar3);
        ix8 ix8Var2 = (ix8) etn.U(t7kVar, jSONObject, "paddings", jyrVar3);
        List Y11 = etn.Y(t7kVar, jSONObject, "press_end_actions", jyrVar5);
        List Y12 = etn.Y(t7kVar, jSONObject, "press_start_actions", jyrVar5);
        szb e6 = e5f.e(t7kVar, jSONObject, "reuse_id", vct.c, bcx.i, ns9Var, null);
        szb e7 = e5f.e(t7kVar, jSONObject, "row_span", ox8Var3, kzjVar3, zi9.l, null);
        List Y13 = etn.Y(t7kVar, jSONObject, "selected_actions", jyrVar5);
        List Y14 = etn.Y(t7kVar, jSONObject, "tooltips", t6fVar.n9);
        qv9 qv9Var = (qv9) etn.U(t7kVar, jSONObject, "transform", t6fVar.q9);
        List Y15 = etn.Y(t7kVar, jSONObject, "transformations", t6fVar.t9);
        sq8 sq8Var = (sq8) etn.U(t7kVar, jSONObject, "transition_change", t6fVar.d2);
        un8 un8Var = (un8) etn.U(t7kVar, jSONObject, "transition_in", jyrVar2);
        un8 un8Var2 = (un8) etn.U(t7kVar, jSONObject, "transition_out", jyrVar2);
        List a0 = etn.a0(t7kVar, jSONObject, "transition_triggers", zi9.m);
        List Y16 = etn.Y(t7kVar, jSONObject, "variable_triggers", t6fVar.C9);
        List Y17 = etn.Y(t7kVar, jSONObject, "variables", t6fVar.I9);
        tct tctVar2 = zi9.i;
        jx9 jx9Var = jx9.z;
        ozb ozbVar5 = zi9.e;
        ?? e8 = e5f.e(t7kVar, jSONObject, "visibility", tctVar2, jx9Var, ns9Var, ozbVar5);
        if (e8 != 0) {
            ozbVar5 = e8;
        }
        l1a l1aVar = (l1a) etn.U(t7kVar, jSONObject, "visibility_action", jyrVar);
        List Y18 = etn.Y(t7kVar, jSONObject, "visibility_actions", jyrVar);
        bk9 bk9Var3 = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.WIDTH, jyrVar4);
        if (bk9Var3 == null) {
            bk9Var3 = zi9.f;
        }
        return new ri9(tc8Var, bd8Var, sm8Var2, Y, e, e2, ozbVar2, Y2, Y3, op8Var, ozbVar4, e5, qi9Var, Y4, Y5, Y6, wz8Var, Y7, bk9Var2, Y8, Y9, str, w79Var, Y10, ix8Var, ix8Var2, Y11, Y12, e6, e7, Y13, Y14, qv9Var, Y15, sq8Var, un8Var, un8Var2, a0, Y16, Y17, ozbVar5, l1aVar, Y18, bk9Var3);
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, ri9 ri9Var) {
        JSONObject jSONObject = new JSONObject();
        tc8 tc8Var = ri9Var.a;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.U9;
        jyr jyrVar2 = t6fVar.I1;
        jyr jyrVar3 = t6fVar.h3;
        jyr jyrVar4 = t6fVar.q7;
        etn.m0(t7kVar, jSONObject, "accessibility", tc8Var, t6fVar.H);
        bd8 bd8Var = ri9Var.b;
        jyr jyrVar5 = t6fVar.t1;
        etn.m0(t7kVar, jSONObject, Constants.KEY_ACTION, bd8Var, jyrVar5);
        etn.m0(t7kVar, jSONObject, "action_animation", ri9Var.c, t6fVar.z1);
        etn.n0(t7kVar, jSONObject, "actions", ri9Var.d, jyrVar5);
        szb szbVar = ri9Var.e;
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
        szb szbVar2 = ri9Var.f;
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
        e5f.g(t7kVar, jSONObject, "alpha", ri9Var.g);
        etn.n0(t7kVar, jSONObject, "animators", ri9Var.h, t6fVar.C1);
        etn.n0(t7kVar, jSONObject, C0479n3.g, ri9Var.i, t6fVar.O1);
        etn.m0(t7kVar, jSONObject, "border", ri9Var.j, t6fVar.U1);
        e5f.g(t7kVar, jSONObject, "capture_focus_on_action", ri9Var.k);
        e5f.g(t7kVar, jSONObject, "column_span", ri9Var.l);
        etn.m0(t7kVar, jSONObject, "delimiter_style", ri9Var.m, t6fVar.b7);
        etn.n0(t7kVar, jSONObject, "disappear_actions", ri9Var.n, t6fVar.Y2);
        etn.n0(t7kVar, jSONObject, "doubletap_actions", ri9Var.o, jyrVar5);
        etn.n0(t7kVar, jSONObject, "extensions", ri9Var.p, t6fVar.k3);
        etn.m0(t7kVar, jSONObject, "focus", ri9Var.q, t6fVar.L3);
        etn.n0(t7kVar, jSONObject, "functions", ri9Var.r, t6fVar.U3);
        etn.m0(t7kVar, jSONObject, CameraProperty.HEIGHT, ri9Var.s, jyrVar4);
        etn.n0(t7kVar, jSONObject, "hover_end_actions", ri9Var.t, jyrVar5);
        etn.n0(t7kVar, jSONObject, "hover_start_actions", ri9Var.u, jyrVar5);
        etn.l0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, ri9Var.v);
        etn.m0(t7kVar, jSONObject, "layout_provider", ri9Var.w, t6fVar.Y4);
        etn.n0(t7kVar, jSONObject, "longtap_actions", ri9Var.x, jyrVar5);
        etn.m0(t7kVar, jSONObject, "margins", ri9Var.y, jyrVar3);
        etn.m0(t7kVar, jSONObject, "paddings", ri9Var.z, jyrVar3);
        etn.n0(t7kVar, jSONObject, "press_end_actions", ri9Var.A, jyrVar5);
        etn.n0(t7kVar, jSONObject, "press_start_actions", ri9Var.B, jyrVar5);
        e5f.g(t7kVar, jSONObject, "reuse_id", ri9Var.C);
        e5f.g(t7kVar, jSONObject, "row_span", ri9Var.D);
        etn.n0(t7kVar, jSONObject, "selected_actions", ri9Var.E, jyrVar5);
        etn.n0(t7kVar, jSONObject, "tooltips", ri9Var.F, t6fVar.n9);
        etn.m0(t7kVar, jSONObject, "transform", ri9Var.G, t6fVar.q9);
        etn.n0(t7kVar, jSONObject, "transformations", ri9Var.H, t6fVar.t9);
        etn.m0(t7kVar, jSONObject, "transition_change", ri9Var.I, t6fVar.d2);
        etn.m0(t7kVar, jSONObject, "transition_in", ri9Var.J, jyrVar2);
        etn.m0(t7kVar, jSONObject, "transition_out", ri9Var.K, jyrVar2);
        List list = ri9Var.L;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < size; i++) {
                jSONArray.put(((nw9) list.get(i)).a);
            }
            try {
                jSONObject.put("transition_triggers", jSONArray);
            } catch (JSONException e3) {
                t7kVar.a().a(e3);
            }
        }
        etn.l0(t7kVar, jSONObject, "type", "separator");
        etn.n0(t7kVar, jSONObject, "variable_triggers", ri9Var.M, t6fVar.C9);
        etn.n0(t7kVar, jSONObject, "variables", ri9Var.N, t6fVar.I9);
        szb szbVar3 = ri9Var.O;
        if (szbVar3 != null) {
            Object b3 = szbVar3.b();
            try {
                if (szbVar3 instanceof pzb) {
                    jSONObject.put("visibility", b3);
                } else {
                    jSONObject.put("visibility", ((k1a) b3).a);
                }
            } catch (JSONException e4) {
                t7kVar.a().a(e4);
            }
        }
        etn.m0(t7kVar, jSONObject, "visibility_action", ri9Var.P, jyrVar);
        etn.n0(t7kVar, jSONObject, "visibility_actions", ri9Var.Q, jyrVar);
        etn.m0(t7kVar, jSONObject, CameraProperty.WIDTH, ri9Var.R, jyrVar4);
        return jSONObject;
    }
}
