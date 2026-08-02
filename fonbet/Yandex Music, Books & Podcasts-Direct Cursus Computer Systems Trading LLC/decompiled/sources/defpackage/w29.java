package defpackage;

import android.net.Uri;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class w29 implements gip, py7 {
    public final t6f a;

    public w29(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v22, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v25, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v27, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v40, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v55, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v57, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v64, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v68, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v83, types: [szb] */
    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final i29 a(t7k t7kVar, JSONObject jSONObject) {
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
            sm8Var = z29.a;
        }
        sm8 sm8Var2 = sm8Var;
        List Y = etn.Y(t7kVar, jSONObject, "actions", jyrVar5);
        tct tctVar = z29.n;
        va8 va8Var = va8.x0;
        ns9 ns9Var = bcx.h;
        szb e = e5f.e(t7kVar, jSONObject, "alignment_horizontal", tctVar, va8Var, ns9Var, null);
        tct tctVar2 = z29.o;
        va8 va8Var2 = va8.z0;
        szb e2 = e5f.e(t7kVar, jSONObject, "alignment_vertical", tctVar2, va8Var2, ns9Var, null);
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        l29 l29Var = z29.u;
        ozb ozbVar = z29.b;
        ?? e3 = e5f.e(t7kVar, jSONObject, "alpha", ox8Var, kzjVar, l29Var, ozbVar);
        ozb ozbVar2 = e3 == 0 ? ozbVar : e3;
        List Y2 = etn.Y(t7kVar, jSONObject, "animators", t6fVar.C1);
        zx8 zx8Var = (zx8) etn.U(t7kVar, jSONObject, "appearance_animation", t6fVar.n3);
        do8 do8Var = (do8) etn.U(t7kVar, jSONObject, "aspect", t6fVar.L1);
        List Y3 = etn.Y(t7kVar, jSONObject, C0479n3.g, t6fVar.O1);
        op8 op8Var = (op8) etn.U(t7kVar, jSONObject, "border", t6fVar.U1);
        ox8 ox8Var2 = vct.a;
        kzj kzjVar2 = kzj.B;
        ozb ozbVar3 = z29.c;
        ?? e4 = e5f.e(t7kVar, jSONObject, "capture_focus_on_action", ox8Var2, kzjVar2, ns9Var, ozbVar3);
        ozb ozbVar4 = e4 == 0 ? ozbVar3 : e4;
        ox8 ox8Var3 = vct.b;
        kzj kzjVar3 = kzj.F;
        szb e5 = e5f.e(t7kVar, jSONObject, "column_span", ox8Var3, kzjVar3, z29.v, null);
        tct tctVar3 = z29.p;
        ozb ozbVar5 = z29.d;
        ?? e6 = e5f.e(t7kVar, jSONObject, "content_alignment_horizontal", tctVar3, va8Var, ns9Var, ozbVar5);
        ozb ozbVar6 = e6 == 0 ? ozbVar5 : e6;
        tct tctVar4 = z29.q;
        ozb ozbVar7 = z29.e;
        ?? e7 = e5f.e(t7kVar, jSONObject, "content_alignment_vertical", tctVar4, va8Var2, ns9Var, ozbVar7);
        ozb ozbVar8 = e7 == 0 ? ozbVar7 : e7;
        List Y4 = etn.Y(t7kVar, jSONObject, "disappear_actions", t6fVar.Y2);
        List Y5 = etn.Y(t7kVar, jSONObject, "doubletap_actions", jyrVar5);
        List Y6 = etn.Y(t7kVar, jSONObject, "extensions", t6fVar.k3);
        List Y7 = etn.Y(t7kVar, jSONObject, "filters", t6fVar.t3);
        wz8 wz8Var = (wz8) etn.U(t7kVar, jSONObject, "focus", t6fVar.L3);
        List Y8 = etn.Y(t7kVar, jSONObject, "functions", t6fVar.U3);
        bk9 bk9Var = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.HEIGHT, jyrVar4);
        if (bk9Var == null) {
            bk9Var = z29.f;
        }
        bk9 bk9Var2 = bk9Var;
        ozb ozbVar9 = z29.g;
        ?? e8 = e5f.e(t7kVar, jSONObject, "high_priority_preview_show", ox8Var2, kzjVar2, ns9Var, ozbVar9);
        ozb ozbVar10 = e8 == 0 ? ozbVar9 : e8;
        List Y9 = etn.Y(t7kVar, jSONObject, "hover_end_actions", jyrVar5);
        List Y10 = etn.Y(t7kVar, jSONObject, "hover_start_actions", jyrVar5);
        Object opt = jSONObject.opt(ConnectableDevice.KEY_ID);
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        String str = (String) (opt != null ? opt : null);
        szb b = e5f.b(t7kVar, jSONObject, "image_url", vct.e, kzj.C, ns9Var);
        w79 w79Var = (w79) etn.U(t7kVar, jSONObject, "layout_provider", t6fVar.Y4);
        List Y11 = etn.Y(t7kVar, jSONObject, "longtap_actions", jyrVar5);
        ix8 ix8Var = (ix8) etn.U(t7kVar, jSONObject, "margins", jyrVar3);
        ix8 ix8Var2 = (ix8) etn.U(t7kVar, jSONObject, "paddings", jyrVar3);
        ox8 ox8Var4 = vct.f;
        kzj kzjVar4 = kzj.G;
        ozb ozbVar11 = z29.h;
        ?? e9 = e5f.e(t7kVar, jSONObject, "placeholder_color", ox8Var4, kzjVar4, ns9Var, ozbVar11);
        ozb ozbVar12 = e9 == 0 ? ozbVar11 : e9;
        ozb ozbVar13 = z29.i;
        ?? e10 = e5f.e(t7kVar, jSONObject, "preload_required", ox8Var2, kzjVar2, ns9Var, ozbVar13);
        ozb ozbVar14 = e10 == 0 ? ozbVar13 : e10;
        List Y12 = etn.Y(t7kVar, jSONObject, "press_end_actions", jyrVar5);
        List Y13 = etn.Y(t7kVar, jSONObject, "press_start_actions", jyrVar5);
        ox8 ox8Var5 = vct.c;
        s3f s3fVar = bcx.i;
        szb e11 = e5f.e(t7kVar, jSONObject, "preview", ox8Var5, s3fVar, ns9Var, null);
        szb e12 = e5f.e(t7kVar, jSONObject, "reuse_id", ox8Var5, s3fVar, ns9Var, null);
        szb e13 = e5f.e(t7kVar, jSONObject, "row_span", ox8Var3, kzjVar3, z29.w, null);
        tct tctVar5 = z29.r;
        p19 p19Var = p19.J;
        ozb ozbVar15 = z29.j;
        ?? e14 = e5f.e(t7kVar, jSONObject, "scale", tctVar5, p19Var, ns9Var, ozbVar15);
        ozb ozbVar16 = e14 == 0 ? ozbVar15 : e14;
        List Y14 = etn.Y(t7kVar, jSONObject, "selected_actions", jyrVar5);
        szb e15 = e5f.e(t7kVar, jSONObject, "tint_color", ox8Var4, kzjVar4, ns9Var, null);
        tct tctVar6 = z29.s;
        qm8 qm8Var = qm8.z;
        ozb ozbVar17 = z29.k;
        ?? e16 = e5f.e(t7kVar, jSONObject, "tint_mode", tctVar6, qm8Var, ns9Var, ozbVar17);
        ozb ozbVar18 = e16 == 0 ? ozbVar17 : e16;
        List Y15 = etn.Y(t7kVar, jSONObject, "tooltips", t6fVar.n9);
        qv9 qv9Var = (qv9) etn.U(t7kVar, jSONObject, "transform", t6fVar.q9);
        List Y16 = etn.Y(t7kVar, jSONObject, "transformations", t6fVar.t9);
        sq8 sq8Var = (sq8) etn.U(t7kVar, jSONObject, "transition_change", t6fVar.d2);
        un8 un8Var = (un8) etn.U(t7kVar, jSONObject, "transition_in", jyrVar2);
        un8 un8Var2 = (un8) etn.U(t7kVar, jSONObject, "transition_out", jyrVar2);
        List a0 = etn.a0(t7kVar, jSONObject, "transition_triggers", z29.x);
        List Y17 = etn.Y(t7kVar, jSONObject, "variable_triggers", t6fVar.C9);
        List Y18 = etn.Y(t7kVar, jSONObject, "variables", t6fVar.I9);
        tct tctVar7 = z29.t;
        jx9 jx9Var = jx9.z;
        ozb ozbVar19 = z29.l;
        ?? e17 = e5f.e(t7kVar, jSONObject, "visibility", tctVar7, jx9Var, ns9Var, ozbVar19);
        if (e17 != 0) {
            ozbVar19 = e17;
        }
        l1a l1aVar = (l1a) etn.U(t7kVar, jSONObject, "visibility_action", jyrVar);
        List Y19 = etn.Y(t7kVar, jSONObject, "visibility_actions", jyrVar);
        bk9 bk9Var3 = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.WIDTH, jyrVar4);
        if (bk9Var3 == null) {
            bk9Var3 = z29.m;
        }
        return new i29(tc8Var, bd8Var, sm8Var2, Y, e, e2, ozbVar2, Y2, zx8Var, do8Var, Y3, op8Var, ozbVar4, e5, ozbVar6, ozbVar8, Y4, Y5, Y6, Y7, wz8Var, Y8, bk9Var2, ozbVar10, Y9, Y10, str, b, w79Var, Y11, ix8Var, ix8Var2, ozbVar12, ozbVar14, Y12, Y13, e11, e12, e13, ozbVar16, Y14, e15, ozbVar18, Y15, qv9Var, Y16, sq8Var, un8Var, un8Var2, a0, Y17, Y18, ozbVar19, l1aVar, Y19, bk9Var3);
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, i29 i29Var) {
        JSONObject jSONObject = new JSONObject();
        tc8 tc8Var = i29Var.a;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.U9;
        jyr jyrVar2 = t6fVar.I1;
        jyr jyrVar3 = t6fVar.h3;
        etn.m0(t7kVar, jSONObject, "accessibility", tc8Var, t6fVar.H);
        bd8 bd8Var = i29Var.b;
        jyr jyrVar4 = t6fVar.t1;
        etn.m0(t7kVar, jSONObject, Constants.KEY_ACTION, bd8Var, jyrVar4);
        etn.m0(t7kVar, jSONObject, "action_animation", i29Var.c, t6fVar.z1);
        etn.n0(t7kVar, jSONObject, "actions", i29Var.d, jyrVar4);
        szb szbVar = i29Var.e;
        va8 va8Var = va8.y0;
        e5f.h(t7kVar, jSONObject, "alignment_horizontal", szbVar, va8Var);
        szb szbVar2 = i29Var.f;
        va8 va8Var2 = va8.A0;
        e5f.h(t7kVar, jSONObject, "alignment_vertical", szbVar2, va8Var2);
        e5f.g(t7kVar, jSONObject, "alpha", i29Var.g);
        etn.n0(t7kVar, jSONObject, "animators", i29Var.h, t6fVar.C1);
        etn.m0(t7kVar, jSONObject, "appearance_animation", i29Var.i, t6fVar.n3);
        etn.m0(t7kVar, jSONObject, "aspect", i29Var.j, t6fVar.L1);
        etn.n0(t7kVar, jSONObject, C0479n3.g, i29Var.k, t6fVar.O1);
        etn.m0(t7kVar, jSONObject, "border", i29Var.l, t6fVar.U1);
        e5f.g(t7kVar, jSONObject, "capture_focus_on_action", i29Var.m);
        e5f.g(t7kVar, jSONObject, "column_span", i29Var.n);
        e5f.h(t7kVar, jSONObject, "content_alignment_horizontal", i29Var.o, va8Var);
        e5f.h(t7kVar, jSONObject, "content_alignment_vertical", i29Var.p, va8Var2);
        etn.n0(t7kVar, jSONObject, "disappear_actions", i29Var.q, t6fVar.Y2);
        etn.n0(t7kVar, jSONObject, "doubletap_actions", i29Var.r, jyrVar4);
        etn.n0(t7kVar, jSONObject, "extensions", i29Var.s, t6fVar.k3);
        etn.n0(t7kVar, jSONObject, "filters", i29Var.t, t6fVar.t3);
        etn.m0(t7kVar, jSONObject, "focus", i29Var.u, t6fVar.L3);
        etn.n0(t7kVar, jSONObject, "functions", i29Var.v, t6fVar.U3);
        bk9 bk9Var = i29Var.w;
        jyr jyrVar5 = t6fVar.q7;
        etn.m0(t7kVar, jSONObject, CameraProperty.HEIGHT, bk9Var, jyrVar5);
        e5f.g(t7kVar, jSONObject, "high_priority_preview_show", i29Var.x);
        etn.n0(t7kVar, jSONObject, "hover_end_actions", i29Var.y, jyrVar4);
        etn.n0(t7kVar, jSONObject, "hover_start_actions", i29Var.z, jyrVar4);
        etn.l0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, i29Var.A);
        szb szbVar3 = i29Var.B;
        if (szbVar3 != null) {
            Object b = szbVar3.b();
            try {
                if (szbVar3 instanceof pzb) {
                    jSONObject.put("image_url", b);
                } else {
                    jSONObject.put("image_url", ((Uri) b).toString());
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        etn.m0(t7kVar, jSONObject, "layout_provider", i29Var.C, t6fVar.Y4);
        etn.n0(t7kVar, jSONObject, "longtap_actions", i29Var.D, jyrVar4);
        etn.m0(t7kVar, jSONObject, "margins", i29Var.E, jyrVar3);
        etn.m0(t7kVar, jSONObject, "paddings", i29Var.F, jyrVar3);
        szb szbVar4 = i29Var.G;
        kzj kzjVar = kzj.D;
        e5f.h(t7kVar, jSONObject, "placeholder_color", szbVar4, kzjVar);
        e5f.g(t7kVar, jSONObject, "preload_required", i29Var.H);
        etn.n0(t7kVar, jSONObject, "press_end_actions", i29Var.I, jyrVar4);
        etn.n0(t7kVar, jSONObject, "press_start_actions", i29Var.J, jyrVar4);
        e5f.g(t7kVar, jSONObject, "preview", i29Var.K);
        e5f.g(t7kVar, jSONObject, "reuse_id", i29Var.L);
        e5f.g(t7kVar, jSONObject, "row_span", i29Var.M);
        szb szbVar5 = i29Var.N;
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
        etn.n0(t7kVar, jSONObject, "selected_actions", i29Var.O, jyrVar4);
        e5f.h(t7kVar, jSONObject, "tint_color", i29Var.P, kzjVar);
        szb szbVar6 = i29Var.Q;
        if (szbVar6 != null) {
            Object b3 = szbVar6.b();
            try {
                if (szbVar6 instanceof pzb) {
                    jSONObject.put("tint_mode", b3);
                } else {
                    jSONObject.put("tint_mode", ((ip8) b3).a);
                }
            } catch (JSONException e3) {
                t7kVar.a().a(e3);
            }
        }
        etn.n0(t7kVar, jSONObject, "tooltips", i29Var.R, t6fVar.n9);
        etn.m0(t7kVar, jSONObject, "transform", i29Var.S, t6fVar.q9);
        etn.n0(t7kVar, jSONObject, "transformations", i29Var.T, t6fVar.t9);
        etn.m0(t7kVar, jSONObject, "transition_change", i29Var.U, t6fVar.d2);
        etn.m0(t7kVar, jSONObject, "transition_in", i29Var.V, jyrVar2);
        etn.m0(t7kVar, jSONObject, "transition_out", i29Var.W, jyrVar2);
        List list = i29Var.X;
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
        etn.l0(t7kVar, jSONObject, "type", "image");
        etn.n0(t7kVar, jSONObject, "variable_triggers", i29Var.Y, t6fVar.C9);
        etn.n0(t7kVar, jSONObject, "variables", i29Var.Z, t6fVar.I9);
        szb szbVar7 = i29Var.a0;
        if (szbVar7 != null) {
            Object b4 = szbVar7.b();
            try {
                if (szbVar7 instanceof pzb) {
                    jSONObject.put("visibility", b4);
                } else {
                    jSONObject.put("visibility", ((k1a) b4).a);
                }
            } catch (JSONException e5) {
                t7kVar.a().a(e5);
            }
        }
        etn.m0(t7kVar, jSONObject, "visibility_action", i29Var.b0, jyrVar);
        etn.n0(t7kVar, jSONObject, "visibility_actions", i29Var.c0, jyrVar);
        etn.m0(t7kVar, jSONObject, CameraProperty.WIDTH, i29Var.d0, jyrVar5);
        return jSONObject;
    }
}
