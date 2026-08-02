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
public final class z19 implements gip, py7 {
    public final t6f a;

    public z19(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v18, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v22, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v24, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v67, types: [szb] */
    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final w19 a(t7k t7kVar, JSONObject jSONObject) {
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
            sm8Var = c29.a;
        }
        sm8 sm8Var2 = sm8Var;
        List Y = etn.Y(t7kVar, jSONObject, "actions", jyrVar5);
        tct tctVar = c29.i;
        va8 va8Var = va8.x0;
        ns9 ns9Var = bcx.h;
        szb e = e5f.e(t7kVar, jSONObject, "alignment_horizontal", tctVar, va8Var, ns9Var, null);
        tct tctVar2 = c29.j;
        va8 va8Var2 = va8.z0;
        szb e2 = e5f.e(t7kVar, jSONObject, "alignment_vertical", tctVar2, va8Var2, ns9Var, null);
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        uw8 uw8Var = c29.n;
        ozb ozbVar = c29.b;
        ?? e3 = e5f.e(t7kVar, jSONObject, "alpha", ox8Var, kzjVar, uw8Var, ozbVar);
        ozb ozbVar2 = e3 == 0 ? ozbVar : e3;
        List Y2 = etn.Y(t7kVar, jSONObject, "animators", t6fVar.C1);
        List Y3 = etn.Y(t7kVar, jSONObject, C0479n3.g, t6fVar.O1);
        op8 op8Var = (op8) etn.U(t7kVar, jSONObject, "border", t6fVar.U1);
        ox8 ox8Var2 = vct.a;
        kzj kzjVar2 = kzj.B;
        ozb ozbVar3 = c29.c;
        ?? e4 = e5f.e(t7kVar, jSONObject, "capture_focus_on_action", ox8Var2, kzjVar2, ns9Var, ozbVar3);
        ozb ozbVar4 = e4 == 0 ? ozbVar3 : e4;
        ox8 ox8Var3 = vct.b;
        kzj kzjVar3 = kzj.F;
        szb b = e5f.b(t7kVar, jSONObject, "column_count", ox8Var3, kzjVar3, c29.o);
        szb e5 = e5f.e(t7kVar, jSONObject, "column_span", ox8Var3, kzjVar3, c29.p, null);
        tct tctVar3 = c29.k;
        ozb ozbVar5 = c29.d;
        ?? e6 = e5f.e(t7kVar, jSONObject, "content_alignment_horizontal", tctVar3, va8Var, ns9Var, ozbVar5);
        ozb ozbVar6 = e6 == 0 ? ozbVar5 : e6;
        tct tctVar4 = c29.l;
        ozb ozbVar7 = c29.e;
        ?? e7 = e5f.e(t7kVar, jSONObject, "content_alignment_vertical", tctVar4, va8Var2, ns9Var, ozbVar7);
        ozb ozbVar8 = e7 == 0 ? ozbVar7 : e7;
        List Y4 = etn.Y(t7kVar, jSONObject, "disappear_actions", t6fVar.Y2);
        List Y5 = etn.Y(t7kVar, jSONObject, "doubletap_actions", jyrVar5);
        List Y6 = etn.Y(t7kVar, jSONObject, "extensions", t6fVar.k3);
        wz8 wz8Var = (wz8) etn.U(t7kVar, jSONObject, "focus", t6fVar.L3);
        List Y7 = etn.Y(t7kVar, jSONObject, "functions", t6fVar.U3);
        bk9 bk9Var = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.HEIGHT, jyrVar4);
        if (bk9Var == null) {
            bk9Var = c29.f;
        }
        bk9 bk9Var2 = bk9Var;
        List Y8 = etn.Y(t7kVar, jSONObject, "hover_end_actions", jyrVar5);
        List Y9 = etn.Y(t7kVar, jSONObject, "hover_start_actions", jyrVar5);
        Object opt = jSONObject.opt(ConnectableDevice.KEY_ID);
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        String str = (String) (opt != null ? opt : null);
        List Y10 = etn.Y(t7kVar, jSONObject, "items", t6fVar.aa);
        w79 w79Var = (w79) etn.U(t7kVar, jSONObject, "layout_provider", t6fVar.Y4);
        List Y11 = etn.Y(t7kVar, jSONObject, "longtap_actions", jyrVar5);
        ix8 ix8Var = (ix8) etn.U(t7kVar, jSONObject, "margins", jyrVar3);
        ix8 ix8Var2 = (ix8) etn.U(t7kVar, jSONObject, "paddings", jyrVar3);
        List Y12 = etn.Y(t7kVar, jSONObject, "press_end_actions", jyrVar5);
        List Y13 = etn.Y(t7kVar, jSONObject, "press_start_actions", jyrVar5);
        szb e8 = e5f.e(t7kVar, jSONObject, "reuse_id", vct.c, bcx.i, ns9Var, null);
        szb e9 = e5f.e(t7kVar, jSONObject, "row_span", ox8Var3, kzjVar3, c29.q, null);
        List Y14 = etn.Y(t7kVar, jSONObject, "selected_actions", jyrVar5);
        List Y15 = etn.Y(t7kVar, jSONObject, "tooltips", t6fVar.n9);
        qv9 qv9Var = (qv9) etn.U(t7kVar, jSONObject, "transform", t6fVar.q9);
        List Y16 = etn.Y(t7kVar, jSONObject, "transformations", t6fVar.t9);
        sq8 sq8Var = (sq8) etn.U(t7kVar, jSONObject, "transition_change", t6fVar.d2);
        un8 un8Var = (un8) etn.U(t7kVar, jSONObject, "transition_in", jyrVar2);
        un8 un8Var2 = (un8) etn.U(t7kVar, jSONObject, "transition_out", jyrVar2);
        List a0 = etn.a0(t7kVar, jSONObject, "transition_triggers", c29.r);
        List Y17 = etn.Y(t7kVar, jSONObject, "variable_triggers", t6fVar.C9);
        List Y18 = etn.Y(t7kVar, jSONObject, "variables", t6fVar.I9);
        tct tctVar5 = c29.m;
        jx9 jx9Var = jx9.z;
        ozb ozbVar9 = c29.g;
        ?? e10 = e5f.e(t7kVar, jSONObject, "visibility", tctVar5, jx9Var, ns9Var, ozbVar9);
        if (e10 != 0) {
            ozbVar9 = e10;
        }
        l1a l1aVar = (l1a) etn.U(t7kVar, jSONObject, "visibility_action", jyrVar);
        List Y19 = etn.Y(t7kVar, jSONObject, "visibility_actions", jyrVar);
        bk9 bk9Var3 = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.WIDTH, jyrVar4);
        if (bk9Var3 == null) {
            bk9Var3 = c29.h;
        }
        return new w19(tc8Var, bd8Var, sm8Var2, Y, e, e2, ozbVar2, Y2, Y3, op8Var, ozbVar4, b, e5, ozbVar6, ozbVar8, Y4, Y5, Y6, wz8Var, Y7, bk9Var2, Y8, Y9, str, Y10, w79Var, Y11, ix8Var, ix8Var2, Y12, Y13, e8, e9, Y14, Y15, qv9Var, Y16, sq8Var, un8Var, un8Var2, a0, Y17, Y18, ozbVar9, l1aVar, Y19, bk9Var3);
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, w19 w19Var) {
        JSONObject jSONObject = new JSONObject();
        tc8 tc8Var = w19Var.a;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.U9;
        etn.m0(t7kVar, jSONObject, "accessibility", tc8Var, t6fVar.H);
        bd8 bd8Var = w19Var.b;
        jyr jyrVar2 = t6fVar.t1;
        etn.m0(t7kVar, jSONObject, Constants.KEY_ACTION, bd8Var, jyrVar2);
        etn.m0(t7kVar, jSONObject, "action_animation", w19Var.c, t6fVar.z1);
        etn.n0(t7kVar, jSONObject, "actions", w19Var.d, jyrVar2);
        szb szbVar = w19Var.e;
        va8 va8Var = va8.y0;
        e5f.h(t7kVar, jSONObject, "alignment_horizontal", szbVar, va8Var);
        szb szbVar2 = w19Var.f;
        va8 va8Var2 = va8.A0;
        e5f.h(t7kVar, jSONObject, "alignment_vertical", szbVar2, va8Var2);
        e5f.g(t7kVar, jSONObject, "alpha", w19Var.g);
        etn.n0(t7kVar, jSONObject, "animators", w19Var.h, t6fVar.C1);
        etn.n0(t7kVar, jSONObject, C0479n3.g, w19Var.i, t6fVar.O1);
        etn.m0(t7kVar, jSONObject, "border", w19Var.j, t6fVar.U1);
        e5f.g(t7kVar, jSONObject, "capture_focus_on_action", w19Var.k);
        e5f.g(t7kVar, jSONObject, "column_count", w19Var.l);
        e5f.g(t7kVar, jSONObject, "column_span", w19Var.m);
        e5f.h(t7kVar, jSONObject, "content_alignment_horizontal", w19Var.n, va8Var);
        e5f.h(t7kVar, jSONObject, "content_alignment_vertical", w19Var.o, va8Var2);
        etn.n0(t7kVar, jSONObject, "disappear_actions", w19Var.p, t6fVar.Y2);
        etn.n0(t7kVar, jSONObject, "doubletap_actions", w19Var.q, jyrVar2);
        etn.n0(t7kVar, jSONObject, "extensions", w19Var.r, t6fVar.k3);
        etn.m0(t7kVar, jSONObject, "focus", w19Var.s, t6fVar.L3);
        etn.n0(t7kVar, jSONObject, "functions", w19Var.t, t6fVar.U3);
        bk9 bk9Var = w19Var.u;
        jyr jyrVar3 = t6fVar.q7;
        etn.m0(t7kVar, jSONObject, CameraProperty.HEIGHT, bk9Var, jyrVar3);
        etn.n0(t7kVar, jSONObject, "hover_end_actions", w19Var.v, jyrVar2);
        etn.n0(t7kVar, jSONObject, "hover_start_actions", w19Var.w, jyrVar2);
        etn.l0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, w19Var.x);
        etn.n0(t7kVar, jSONObject, "items", w19Var.y, t6fVar.aa);
        etn.m0(t7kVar, jSONObject, "layout_provider", w19Var.z, t6fVar.Y4);
        etn.n0(t7kVar, jSONObject, "longtap_actions", w19Var.A, jyrVar2);
        ix8 ix8Var = w19Var.B;
        jyr jyrVar4 = t6fVar.h3;
        etn.m0(t7kVar, jSONObject, "margins", ix8Var, jyrVar4);
        etn.m0(t7kVar, jSONObject, "paddings", w19Var.C, jyrVar4);
        etn.n0(t7kVar, jSONObject, "press_end_actions", w19Var.D, jyrVar2);
        etn.n0(t7kVar, jSONObject, "press_start_actions", w19Var.E, jyrVar2);
        e5f.g(t7kVar, jSONObject, "reuse_id", w19Var.F);
        e5f.g(t7kVar, jSONObject, "row_span", w19Var.G);
        etn.n0(t7kVar, jSONObject, "selected_actions", w19Var.H, jyrVar2);
        etn.n0(t7kVar, jSONObject, "tooltips", w19Var.I, t6fVar.n9);
        etn.m0(t7kVar, jSONObject, "transform", w19Var.J, t6fVar.q9);
        etn.n0(t7kVar, jSONObject, "transformations", w19Var.K, t6fVar.t9);
        etn.m0(t7kVar, jSONObject, "transition_change", w19Var.L, t6fVar.d2);
        un8 un8Var = w19Var.M;
        jyr jyrVar5 = t6fVar.I1;
        etn.m0(t7kVar, jSONObject, "transition_in", un8Var, jyrVar5);
        etn.m0(t7kVar, jSONObject, "transition_out", w19Var.N, jyrVar5);
        List list = w19Var.O;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < size; i++) {
                jSONArray.put(((nw9) list.get(i)).a);
            }
            try {
                jSONObject.put("transition_triggers", jSONArray);
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        etn.l0(t7kVar, jSONObject, "type", "grid");
        etn.n0(t7kVar, jSONObject, "variable_triggers", w19Var.P, t6fVar.C9);
        etn.n0(t7kVar, jSONObject, "variables", w19Var.Q, t6fVar.I9);
        szb szbVar3 = w19Var.R;
        if (szbVar3 != null) {
            Object b = szbVar3.b();
            try {
                if (szbVar3 instanceof pzb) {
                    jSONObject.put("visibility", b);
                } else {
                    jSONObject.put("visibility", ((k1a) b).a);
                }
            } catch (JSONException e2) {
                t7kVar.a().a(e2);
            }
        }
        etn.m0(t7kVar, jSONObject, "visibility_action", w19Var.S, jyrVar);
        etn.n0(t7kVar, jSONObject, "visibility_actions", w19Var.T, jyrVar);
        etn.m0(t7kVar, jSONObject, CameraProperty.WIDTH, w19Var.U, jyrVar3);
        return jSONObject;
    }
}
