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
public final class im9 implements gip, py7 {
    public final t6f a;

    public im9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v18, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v20, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v64, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v75, types: [szb] */
    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final dm9 a(t7k t7kVar, JSONObject jSONObject) {
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
            sm8Var = lm9.a;
        }
        sm8 sm8Var2 = sm8Var;
        List Y = etn.Y(t7kVar, jSONObject, "actions", jyrVar5);
        tct tctVar = lm9.i;
        va8 va8Var = va8.x0;
        ns9 ns9Var = bcx.h;
        szb e = e5f.e(t7kVar, jSONObject, "alignment_horizontal", tctVar, va8Var, ns9Var, null);
        szb e2 = e5f.e(t7kVar, jSONObject, "alignment_vertical", lm9.j, va8.z0, ns9Var, null);
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        hm9 hm9Var = lm9.m;
        ozb ozbVar = lm9.b;
        ?? e3 = e5f.e(t7kVar, jSONObject, "alpha", ox8Var, kzjVar, hm9Var, ozbVar);
        ozb ozbVar2 = e3 == 0 ? ozbVar : e3;
        List Y2 = etn.Y(t7kVar, jSONObject, "animators", t6fVar.C1);
        List Y3 = etn.Y(t7kVar, jSONObject, C0479n3.g, t6fVar.O1);
        op8 op8Var = (op8) etn.U(t7kVar, jSONObject, "border", t6fVar.U1);
        ox8 ox8Var2 = vct.a;
        kzj kzjVar2 = kzj.B;
        ozb ozbVar3 = lm9.c;
        ?? e4 = e5f.e(t7kVar, jSONObject, "capture_focus_on_action", ox8Var2, kzjVar2, ns9Var, ozbVar3);
        ozb ozbVar4 = e4 == 0 ? ozbVar3 : e4;
        ozb ozbVar5 = lm9.d;
        ?? e5 = e5f.e(t7kVar, jSONObject, "clip_to_bounds", ox8Var2, kzjVar2, ns9Var, ozbVar5);
        ozb ozbVar6 = e5 == 0 ? ozbVar5 : e5;
        ox8 ox8Var3 = vct.b;
        kzj kzjVar3 = kzj.F;
        szb e6 = e5f.e(t7kVar, jSONObject, "column_span", ox8Var3, kzjVar3, lm9.n, null);
        ox8 ox8Var4 = vct.c;
        s3f s3fVar = bcx.i;
        szb e7 = e5f.e(t7kVar, jSONObject, "default_state_id", ox8Var4, s3fVar, ns9Var, null);
        List Y4 = etn.Y(t7kVar, jSONObject, "disappear_actions", t6fVar.Y2);
        Object opt = jSONObject.opt("div_id");
        Object obj = JSONObject.NULL;
        if (opt == obj) {
            opt = null;
        }
        if (opt == null) {
            opt = null;
        }
        String str = (String) opt;
        List Y5 = etn.Y(t7kVar, jSONObject, "doubletap_actions", jyrVar5);
        List Y6 = etn.Y(t7kVar, jSONObject, "extensions", t6fVar.k3);
        wz8 wz8Var = (wz8) etn.U(t7kVar, jSONObject, "focus", t6fVar.L3);
        List Y7 = etn.Y(t7kVar, jSONObject, "functions", t6fVar.U3);
        bk9 bk9Var = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.HEIGHT, jyrVar4);
        if (bk9Var == null) {
            bk9Var = lm9.e;
        }
        bk9 bk9Var2 = bk9Var;
        List Y8 = etn.Y(t7kVar, jSONObject, "hover_end_actions", jyrVar5);
        List Y9 = etn.Y(t7kVar, jSONObject, "hover_start_actions", jyrVar5);
        Object opt2 = jSONObject.opt(ConnectableDevice.KEY_ID);
        if (opt2 == obj) {
            opt2 = null;
        }
        if (opt2 == null) {
            opt2 = null;
        }
        String str2 = (String) opt2;
        w79 w79Var = (w79) etn.U(t7kVar, jSONObject, "layout_provider", t6fVar.Y4);
        List Y10 = etn.Y(t7kVar, jSONObject, "longtap_actions", jyrVar5);
        ix8 ix8Var = (ix8) etn.U(t7kVar, jSONObject, "margins", jyrVar3);
        ix8 ix8Var2 = (ix8) etn.U(t7kVar, jSONObject, "paddings", jyrVar3);
        List Y11 = etn.Y(t7kVar, jSONObject, "press_end_actions", jyrVar5);
        List Y12 = etn.Y(t7kVar, jSONObject, "press_start_actions", jyrVar5);
        szb e8 = e5f.e(t7kVar, jSONObject, "reuse_id", ox8Var4, s3fVar, ns9Var, null);
        szb e9 = e5f.e(t7kVar, jSONObject, "row_span", ox8Var3, kzjVar3, lm9.o, null);
        List Y13 = etn.Y(t7kVar, jSONObject, "selected_actions", jyrVar5);
        Object opt3 = jSONObject.opt("state_id_variable");
        if (opt3 == obj) {
            opt3 = null;
        }
        String str3 = (String) (opt3 != null ? opt3 : null);
        List S = etn.S(t7kVar, jSONObject, "states", t6fVar.L7, lm9.p);
        List Y14 = etn.Y(t7kVar, jSONObject, "tooltips", t6fVar.n9);
        qv9 qv9Var = (qv9) etn.U(t7kVar, jSONObject, "transform", t6fVar.q9);
        List Y15 = etn.Y(t7kVar, jSONObject, "transformations", t6fVar.t9);
        tct tctVar2 = lm9.k;
        vq9 vq9Var = vq9.x0;
        ozb ozbVar7 = lm9.f;
        ?? e10 = e5f.e(t7kVar, jSONObject, "transition_animation_selector", tctVar2, vq9Var, ns9Var, ozbVar7);
        ozb ozbVar8 = e10 == 0 ? ozbVar7 : e10;
        sq8 sq8Var = (sq8) etn.U(t7kVar, jSONObject, "transition_change", t6fVar.d2);
        un8 un8Var = (un8) etn.U(t7kVar, jSONObject, "transition_in", jyrVar2);
        un8 un8Var2 = (un8) etn.U(t7kVar, jSONObject, "transition_out", jyrVar2);
        List a0 = etn.a0(t7kVar, jSONObject, "transition_triggers", lm9.q);
        List Y16 = etn.Y(t7kVar, jSONObject, "variable_triggers", t6fVar.C9);
        List Y17 = etn.Y(t7kVar, jSONObject, "variables", t6fVar.I9);
        tct tctVar3 = lm9.l;
        jx9 jx9Var = jx9.z;
        ozb ozbVar9 = lm9.g;
        ?? e11 = e5f.e(t7kVar, jSONObject, "visibility", tctVar3, jx9Var, ns9Var, ozbVar9);
        if (e11 != 0) {
            ozbVar9 = e11;
        }
        l1a l1aVar = (l1a) etn.U(t7kVar, jSONObject, "visibility_action", jyrVar);
        List Y18 = etn.Y(t7kVar, jSONObject, "visibility_actions", jyrVar);
        bk9 bk9Var3 = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.WIDTH, jyrVar4);
        if (bk9Var3 == null) {
            bk9Var3 = lm9.h;
        }
        return new dm9(tc8Var, bd8Var, sm8Var2, Y, e, e2, ozbVar2, Y2, Y3, op8Var, ozbVar4, ozbVar6, e6, e7, Y4, str, Y5, Y6, wz8Var, Y7, bk9Var2, Y8, Y9, str2, w79Var, Y10, ix8Var, ix8Var2, Y11, Y12, e8, e9, Y13, str3, S, Y14, qv9Var, Y15, ozbVar8, sq8Var, un8Var, un8Var2, a0, Y16, Y17, ozbVar9, l1aVar, Y18, bk9Var3);
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, dm9 dm9Var) {
        JSONObject jSONObject = new JSONObject();
        tc8 tc8Var = dm9Var.a;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.U9;
        jyr jyrVar2 = t6fVar.I1;
        jyr jyrVar3 = t6fVar.h3;
        jyr jyrVar4 = t6fVar.q7;
        etn.m0(t7kVar, jSONObject, "accessibility", tc8Var, t6fVar.H);
        bd8 bd8Var = dm9Var.b;
        jyr jyrVar5 = t6fVar.t1;
        etn.m0(t7kVar, jSONObject, Constants.KEY_ACTION, bd8Var, jyrVar5);
        etn.m0(t7kVar, jSONObject, "action_animation", dm9Var.c, t6fVar.z1);
        etn.n0(t7kVar, jSONObject, "actions", dm9Var.d, jyrVar5);
        szb szbVar = dm9Var.e;
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
        szb szbVar2 = dm9Var.f;
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
        e5f.g(t7kVar, jSONObject, "alpha", dm9Var.g);
        etn.n0(t7kVar, jSONObject, "animators", dm9Var.h, t6fVar.C1);
        etn.n0(t7kVar, jSONObject, C0479n3.g, dm9Var.i, t6fVar.O1);
        etn.m0(t7kVar, jSONObject, "border", dm9Var.j, t6fVar.U1);
        e5f.g(t7kVar, jSONObject, "capture_focus_on_action", dm9Var.k);
        e5f.g(t7kVar, jSONObject, "clip_to_bounds", dm9Var.l);
        e5f.g(t7kVar, jSONObject, "column_span", dm9Var.m);
        e5f.g(t7kVar, jSONObject, "default_state_id", dm9Var.n);
        etn.n0(t7kVar, jSONObject, "disappear_actions", dm9Var.o, t6fVar.Y2);
        etn.l0(t7kVar, jSONObject, "div_id", dm9Var.p);
        etn.n0(t7kVar, jSONObject, "doubletap_actions", dm9Var.q, jyrVar5);
        etn.n0(t7kVar, jSONObject, "extensions", dm9Var.r, t6fVar.k3);
        etn.m0(t7kVar, jSONObject, "focus", dm9Var.s, t6fVar.L3);
        etn.n0(t7kVar, jSONObject, "functions", dm9Var.t, t6fVar.U3);
        etn.m0(t7kVar, jSONObject, CameraProperty.HEIGHT, dm9Var.u, jyrVar4);
        etn.n0(t7kVar, jSONObject, "hover_end_actions", dm9Var.v, jyrVar5);
        etn.n0(t7kVar, jSONObject, "hover_start_actions", dm9Var.w, jyrVar5);
        etn.l0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, dm9Var.x);
        etn.m0(t7kVar, jSONObject, "layout_provider", dm9Var.y, t6fVar.Y4);
        etn.n0(t7kVar, jSONObject, "longtap_actions", dm9Var.z, jyrVar5);
        etn.m0(t7kVar, jSONObject, "margins", dm9Var.A, jyrVar3);
        etn.m0(t7kVar, jSONObject, "paddings", dm9Var.B, jyrVar3);
        etn.n0(t7kVar, jSONObject, "press_end_actions", dm9Var.C, jyrVar5);
        etn.n0(t7kVar, jSONObject, "press_start_actions", dm9Var.D, jyrVar5);
        e5f.g(t7kVar, jSONObject, "reuse_id", dm9Var.E);
        e5f.g(t7kVar, jSONObject, "row_span", dm9Var.F);
        etn.n0(t7kVar, jSONObject, "selected_actions", dm9Var.G, jyrVar5);
        etn.l0(t7kVar, jSONObject, "state_id_variable", dm9Var.H);
        etn.n0(t7kVar, jSONObject, "states", dm9Var.I, t6fVar.L7);
        etn.n0(t7kVar, jSONObject, "tooltips", dm9Var.J, t6fVar.n9);
        etn.m0(t7kVar, jSONObject, "transform", dm9Var.K, t6fVar.q9);
        etn.n0(t7kVar, jSONObject, "transformations", dm9Var.L, t6fVar.t9);
        szb szbVar3 = dm9Var.M;
        if (szbVar3 != null) {
            Object b3 = szbVar3.b();
            try {
                if (szbVar3 instanceof pzb) {
                    jSONObject.put("transition_animation_selector", b3);
                } else {
                    jSONObject.put("transition_animation_selector", ((mw9) b3).a);
                }
            } catch (JSONException e3) {
                t7kVar.a().a(e3);
            }
        }
        etn.m0(t7kVar, jSONObject, "transition_change", dm9Var.N, t6fVar.d2);
        etn.m0(t7kVar, jSONObject, "transition_in", dm9Var.O, jyrVar2);
        etn.m0(t7kVar, jSONObject, "transition_out", dm9Var.P, jyrVar2);
        List list = dm9Var.Q;
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
        etn.l0(t7kVar, jSONObject, "type", "state");
        etn.n0(t7kVar, jSONObject, "variable_triggers", dm9Var.R, t6fVar.C9);
        etn.n0(t7kVar, jSONObject, "variables", dm9Var.S, t6fVar.I9);
        szb szbVar4 = dm9Var.T;
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
        etn.m0(t7kVar, jSONObject, "visibility_action", dm9Var.U, jyrVar);
        etn.n0(t7kVar, jSONObject, "visibility_actions", dm9Var.V, jyrVar);
        etn.m0(t7kVar, jSONObject, CameraProperty.WIDTH, dm9Var.W, jyrVar4);
        return jSONObject;
    }
}
