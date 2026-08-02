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
public final class q19 implements gip, py7 {
    public final t6f a;

    public q19(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v20, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v23, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v25, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v50, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v52, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v60, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v76, types: [szb] */
    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final i19 a(t7k t7kVar, JSONObject jSONObject) {
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
            sm8Var = t19.a;
        }
        sm8 sm8Var2 = sm8Var;
        List Y = etn.Y(t7kVar, jSONObject, "actions", jyrVar5);
        tct tctVar = t19.l;
        va8 va8Var = va8.x0;
        ns9 ns9Var = bcx.h;
        szb e = e5f.e(t7kVar, jSONObject, "alignment_horizontal", tctVar, va8Var, ns9Var, null);
        tct tctVar2 = t19.m;
        va8 va8Var2 = va8.z0;
        szb e2 = e5f.e(t7kVar, jSONObject, "alignment_vertical", tctVar2, va8Var2, ns9Var, null);
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        uw8 uw8Var = t19.r;
        ozb ozbVar = t19.b;
        ?? e3 = e5f.e(t7kVar, jSONObject, "alpha", ox8Var, kzjVar, uw8Var, ozbVar);
        ozb ozbVar2 = e3 == 0 ? ozbVar : e3;
        List Y2 = etn.Y(t7kVar, jSONObject, "animators", t6fVar.C1);
        do8 do8Var = (do8) etn.U(t7kVar, jSONObject, "aspect", t6fVar.L1);
        List Y3 = etn.Y(t7kVar, jSONObject, C0479n3.g, t6fVar.O1);
        op8 op8Var = (op8) etn.U(t7kVar, jSONObject, "border", t6fVar.U1);
        ox8 ox8Var2 = vct.a;
        kzj kzjVar2 = kzj.B;
        ozb ozbVar3 = t19.c;
        ?? e4 = e5f.e(t7kVar, jSONObject, "capture_focus_on_action", ox8Var2, kzjVar2, ns9Var, ozbVar3);
        ozb ozbVar4 = e4 == 0 ? ozbVar3 : e4;
        ox8 ox8Var3 = vct.b;
        kzj kzjVar3 = kzj.F;
        szb e5 = e5f.e(t7kVar, jSONObject, "column_span", ox8Var3, kzjVar3, t19.s, null);
        tct tctVar3 = t19.n;
        ozb ozbVar5 = t19.d;
        ?? e6 = e5f.e(t7kVar, jSONObject, "content_alignment_horizontal", tctVar3, va8Var, ns9Var, ozbVar5);
        ozb ozbVar6 = e6 == 0 ? ozbVar5 : e6;
        tct tctVar4 = t19.o;
        ozb ozbVar7 = t19.e;
        ?? e7 = e5f.e(t7kVar, jSONObject, "content_alignment_vertical", tctVar4, va8Var2, ns9Var, ozbVar7);
        ozb ozbVar8 = e7 == 0 ? ozbVar7 : e7;
        List Y4 = etn.Y(t7kVar, jSONObject, "disappear_actions", t6fVar.Y2);
        List Y5 = etn.Y(t7kVar, jSONObject, "doubletap_actions", jyrVar5);
        List Y6 = etn.Y(t7kVar, jSONObject, "extensions", t6fVar.k3);
        wz8 wz8Var = (wz8) etn.U(t7kVar, jSONObject, "focus", t6fVar.L3);
        List Y7 = etn.Y(t7kVar, jSONObject, "functions", t6fVar.U3);
        px8 px8Var = vct.e;
        kzj kzjVar4 = kzj.C;
        szb b = e5f.b(t7kVar, jSONObject, "gif_url", px8Var, kzjVar4, ns9Var);
        bk9 bk9Var = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.HEIGHT, jyrVar4);
        if (bk9Var == null) {
            bk9Var = t19.f;
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
        ox8 ox8Var4 = vct.f;
        kzj kzjVar5 = kzj.G;
        ozb ozbVar9 = t19.g;
        ?? e8 = e5f.e(t7kVar, jSONObject, "placeholder_color", ox8Var4, kzjVar5, ns9Var, ozbVar9);
        ozb ozbVar10 = e8 == 0 ? ozbVar9 : e8;
        ozb ozbVar11 = t19.h;
        ?? e9 = e5f.e(t7kVar, jSONObject, "preload_required", ox8Var2, kzjVar2, ns9Var, ozbVar11);
        ozb ozbVar12 = e9 == 0 ? ozbVar11 : e9;
        List Y11 = etn.Y(t7kVar, jSONObject, "press_end_actions", jyrVar5);
        List Y12 = etn.Y(t7kVar, jSONObject, "press_start_actions", jyrVar5);
        ox8 ox8Var5 = vct.c;
        s3f s3fVar = bcx.i;
        szb e10 = e5f.e(t7kVar, jSONObject, "preview", ox8Var5, s3fVar, ns9Var, null);
        szb e11 = e5f.e(t7kVar, jSONObject, "preview_url", px8Var, kzjVar4, ns9Var, null);
        szb e12 = e5f.e(t7kVar, jSONObject, "reuse_id", ox8Var5, s3fVar, ns9Var, null);
        szb e13 = e5f.e(t7kVar, jSONObject, "row_span", ox8Var3, kzjVar3, t19.t, null);
        tct tctVar5 = t19.p;
        p19 p19Var = p19.J;
        ozb ozbVar13 = t19.i;
        ?? e14 = e5f.e(t7kVar, jSONObject, "scale", tctVar5, p19Var, ns9Var, ozbVar13);
        ozb ozbVar14 = e14 == 0 ? ozbVar13 : e14;
        List Y13 = etn.Y(t7kVar, jSONObject, "selected_actions", jyrVar5);
        List Y14 = etn.Y(t7kVar, jSONObject, "tooltips", t6fVar.n9);
        qv9 qv9Var = (qv9) etn.U(t7kVar, jSONObject, "transform", t6fVar.q9);
        List Y15 = etn.Y(t7kVar, jSONObject, "transformations", t6fVar.t9);
        sq8 sq8Var = (sq8) etn.U(t7kVar, jSONObject, "transition_change", t6fVar.d2);
        un8 un8Var = (un8) etn.U(t7kVar, jSONObject, "transition_in", jyrVar2);
        un8 un8Var2 = (un8) etn.U(t7kVar, jSONObject, "transition_out", jyrVar2);
        List a0 = etn.a0(t7kVar, jSONObject, "transition_triggers", t19.u);
        List Y16 = etn.Y(t7kVar, jSONObject, "variable_triggers", t6fVar.C9);
        List Y17 = etn.Y(t7kVar, jSONObject, "variables", t6fVar.I9);
        tct tctVar6 = t19.q;
        jx9 jx9Var = jx9.z;
        ozb ozbVar15 = t19.j;
        ?? e15 = e5f.e(t7kVar, jSONObject, "visibility", tctVar6, jx9Var, ns9Var, ozbVar15);
        if (e15 != 0) {
            ozbVar15 = e15;
        }
        l1a l1aVar = (l1a) etn.U(t7kVar, jSONObject, "visibility_action", jyrVar);
        List Y18 = etn.Y(t7kVar, jSONObject, "visibility_actions", jyrVar);
        bk9 bk9Var3 = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.WIDTH, jyrVar4);
        if (bk9Var3 == null) {
            bk9Var3 = t19.k;
        }
        return new i19(tc8Var, bd8Var, sm8Var2, Y, e, e2, ozbVar2, Y2, do8Var, Y3, op8Var, ozbVar4, e5, ozbVar6, ozbVar8, Y4, Y5, Y6, wz8Var, Y7, b, bk9Var2, Y8, Y9, str, w79Var, Y10, ix8Var, ix8Var2, ozbVar10, ozbVar12, Y11, Y12, e10, e11, e12, e13, ozbVar14, Y13, Y14, qv9Var, Y15, sq8Var, un8Var, un8Var2, a0, Y16, Y17, ozbVar15, l1aVar, Y18, bk9Var3);
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, i19 i19Var) {
        JSONObject jSONObject = new JSONObject();
        tc8 tc8Var = i19Var.a;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.U9;
        jyr jyrVar2 = t6fVar.I1;
        etn.m0(t7kVar, jSONObject, "accessibility", tc8Var, t6fVar.H);
        bd8 bd8Var = i19Var.b;
        jyr jyrVar3 = t6fVar.t1;
        etn.m0(t7kVar, jSONObject, Constants.KEY_ACTION, bd8Var, jyrVar3);
        etn.m0(t7kVar, jSONObject, "action_animation", i19Var.c, t6fVar.z1);
        etn.n0(t7kVar, jSONObject, "actions", i19Var.d, jyrVar3);
        szb szbVar = i19Var.e;
        va8 va8Var = va8.y0;
        e5f.h(t7kVar, jSONObject, "alignment_horizontal", szbVar, va8Var);
        szb szbVar2 = i19Var.f;
        va8 va8Var2 = va8.A0;
        e5f.h(t7kVar, jSONObject, "alignment_vertical", szbVar2, va8Var2);
        e5f.g(t7kVar, jSONObject, "alpha", i19Var.g);
        etn.n0(t7kVar, jSONObject, "animators", i19Var.h, t6fVar.C1);
        etn.m0(t7kVar, jSONObject, "aspect", i19Var.i, t6fVar.L1);
        etn.n0(t7kVar, jSONObject, C0479n3.g, i19Var.j, t6fVar.O1);
        etn.m0(t7kVar, jSONObject, "border", i19Var.k, t6fVar.U1);
        e5f.g(t7kVar, jSONObject, "capture_focus_on_action", i19Var.l);
        e5f.g(t7kVar, jSONObject, "column_span", i19Var.m);
        e5f.h(t7kVar, jSONObject, "content_alignment_horizontal", i19Var.n, va8Var);
        e5f.h(t7kVar, jSONObject, "content_alignment_vertical", i19Var.o, va8Var2);
        etn.n0(t7kVar, jSONObject, "disappear_actions", i19Var.p, t6fVar.Y2);
        etn.n0(t7kVar, jSONObject, "doubletap_actions", i19Var.q, jyrVar3);
        etn.n0(t7kVar, jSONObject, "extensions", i19Var.r, t6fVar.k3);
        etn.m0(t7kVar, jSONObject, "focus", i19Var.s, t6fVar.L3);
        etn.n0(t7kVar, jSONObject, "functions", i19Var.t, t6fVar.U3);
        szb szbVar3 = i19Var.u;
        kzj kzjVar = kzj.H;
        e5f.h(t7kVar, jSONObject, "gif_url", szbVar3, kzjVar);
        bk9 bk9Var = i19Var.v;
        jyr jyrVar4 = t6fVar.q7;
        etn.m0(t7kVar, jSONObject, CameraProperty.HEIGHT, bk9Var, jyrVar4);
        etn.n0(t7kVar, jSONObject, "hover_end_actions", i19Var.w, jyrVar3);
        etn.n0(t7kVar, jSONObject, "hover_start_actions", i19Var.x, jyrVar3);
        etn.l0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, i19Var.y);
        etn.m0(t7kVar, jSONObject, "layout_provider", i19Var.z, t6fVar.Y4);
        etn.n0(t7kVar, jSONObject, "longtap_actions", i19Var.A, jyrVar3);
        ix8 ix8Var = i19Var.B;
        jyr jyrVar5 = t6fVar.h3;
        etn.m0(t7kVar, jSONObject, "margins", ix8Var, jyrVar5);
        etn.m0(t7kVar, jSONObject, "paddings", i19Var.C, jyrVar5);
        szb szbVar4 = i19Var.D;
        if (szbVar4 != null) {
            Object b = szbVar4.b();
            try {
                if (szbVar4 instanceof pzb) {
                    jSONObject.put("placeholder_color", b);
                } else {
                    jSONObject.put("placeholder_color", c85.a(((Number) b).intValue()));
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        e5f.g(t7kVar, jSONObject, "preload_required", i19Var.E);
        etn.n0(t7kVar, jSONObject, "press_end_actions", i19Var.F, jyrVar3);
        etn.n0(t7kVar, jSONObject, "press_start_actions", i19Var.G, jyrVar3);
        e5f.g(t7kVar, jSONObject, "preview", i19Var.H);
        e5f.h(t7kVar, jSONObject, "preview_url", i19Var.I, kzjVar);
        e5f.g(t7kVar, jSONObject, "reuse_id", i19Var.J);
        e5f.g(t7kVar, jSONObject, "row_span", i19Var.K);
        szb szbVar5 = i19Var.L;
        if (szbVar5 != null) {
            Object b2 = szbVar5.b();
            try {
                if (szbVar5 instanceof pzb) {
                    jSONObject.put("scale", b2);
                } else {
                    jSONObject.put("scale", ((g39) b2).a);
                }
            } catch (JSONException e2) {
                t7kVar.a().a(e2);
            }
        }
        etn.n0(t7kVar, jSONObject, "selected_actions", i19Var.M, jyrVar3);
        etn.n0(t7kVar, jSONObject, "tooltips", i19Var.N, t6fVar.n9);
        etn.m0(t7kVar, jSONObject, "transform", i19Var.O, t6fVar.q9);
        etn.n0(t7kVar, jSONObject, "transformations", i19Var.P, t6fVar.t9);
        etn.m0(t7kVar, jSONObject, "transition_change", i19Var.Q, t6fVar.d2);
        etn.m0(t7kVar, jSONObject, "transition_in", i19Var.R, jyrVar2);
        etn.m0(t7kVar, jSONObject, "transition_out", i19Var.S, jyrVar2);
        List list = i19Var.T;
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
        etn.l0(t7kVar, jSONObject, "type", "gif");
        etn.n0(t7kVar, jSONObject, "variable_triggers", i19Var.U, t6fVar.C9);
        etn.n0(t7kVar, jSONObject, "variables", i19Var.V, t6fVar.I9);
        szb szbVar6 = i19Var.W;
        if (szbVar6 != null) {
            Object b3 = szbVar6.b();
            try {
                if (szbVar6 instanceof pzb) {
                    jSONObject.put("visibility", b3);
                } else {
                    jSONObject.put("visibility", ((k1a) b3).a);
                }
            } catch (JSONException e4) {
                t7kVar.a().a(e4);
            }
        }
        etn.m0(t7kVar, jSONObject, "visibility_action", i19Var.X, jyrVar);
        etn.n0(t7kVar, jSONObject, "visibility_actions", i19Var.Y, jyrVar);
        etn.m0(t7kVar, jSONObject, CameraProperty.WIDTH, i19Var.Z, jyrVar4);
        return jSONObject;
    }
}
