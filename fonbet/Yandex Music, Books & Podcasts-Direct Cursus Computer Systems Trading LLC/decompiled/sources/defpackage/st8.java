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
public final class st8 implements gip, py7 {
    public final t6f a;

    public st8(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v16, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v19, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v21, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v40, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v43, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v49, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v54, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v6, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v78, types: [szb] */
    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final jt8 a(t7k t7kVar, JSONObject jSONObject) {
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.U9;
        jyr jyrVar2 = t6fVar.I1;
        jyr jyrVar3 = t6fVar.h3;
        jyr jyrVar4 = t6fVar.y2;
        jyr jyrVar5 = t6fVar.q7;
        tc8 tc8Var = (tc8) etn.U(t7kVar, jSONObject, "accessibility", t6fVar.H);
        jyr jyrVar6 = t6fVar.t1;
        bd8 bd8Var = (bd8) etn.U(t7kVar, jSONObject, Constants.KEY_ACTION, jyrVar6);
        sm8 sm8Var = (sm8) etn.U(t7kVar, jSONObject, "action_animation", t6fVar.z1);
        if (sm8Var == null) {
            sm8Var = vt8.a;
        }
        sm8 sm8Var2 = sm8Var;
        List Y = etn.Y(t7kVar, jSONObject, "actions", jyrVar6);
        tct tctVar = vt8.n;
        va8 va8Var = va8.x0;
        ns9 ns9Var = bcx.h;
        szb e = e5f.e(t7kVar, jSONObject, "alignment_horizontal", tctVar, va8Var, ns9Var, null);
        szb e2 = e5f.e(t7kVar, jSONObject, "alignment_vertical", vt8.o, va8.z0, ns9Var, null);
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        lc8 lc8Var = vt8.u;
        ozb ozbVar = vt8.b;
        ?? e3 = e5f.e(t7kVar, jSONObject, "alpha", ox8Var, kzjVar, lc8Var, ozbVar);
        ozb ozbVar2 = e3 == 0 ? ozbVar : e3;
        List Y2 = etn.Y(t7kVar, jSONObject, "animators", t6fVar.C1);
        do8 do8Var = (do8) etn.U(t7kVar, jSONObject, "aspect", t6fVar.L1);
        List Y3 = etn.Y(t7kVar, jSONObject, C0479n3.g, t6fVar.O1);
        op8 op8Var = (op8) etn.U(t7kVar, jSONObject, "border", t6fVar.U1);
        ox8 ox8Var2 = vct.a;
        kzj kzjVar2 = kzj.B;
        ozb ozbVar3 = vt8.c;
        ?? e4 = e5f.e(t7kVar, jSONObject, "capture_focus_on_action", ox8Var2, kzjVar2, ns9Var, ozbVar3);
        ozb ozbVar4 = e4 == 0 ? ozbVar3 : e4;
        ozb ozbVar5 = vt8.d;
        ?? e5 = e5f.e(t7kVar, jSONObject, "clip_to_bounds", ox8Var2, kzjVar2, ns9Var, ozbVar5);
        ozb ozbVar6 = e5 == 0 ? ozbVar5 : e5;
        ox8 ox8Var3 = vct.b;
        kzj kzjVar3 = kzj.F;
        szb e6 = e5f.e(t7kVar, jSONObject, "column_span", ox8Var3, kzjVar3, vt8.v, null);
        tct tctVar2 = vt8.p;
        qm8 qm8Var = qm8.v0;
        ozb ozbVar7 = vt8.e;
        ?? e7 = e5f.e(t7kVar, jSONObject, "content_alignment_horizontal", tctVar2, qm8Var, ns9Var, ozbVar7);
        ozb ozbVar8 = e7 == 0 ? ozbVar7 : e7;
        tct tctVar3 = vt8.q;
        qm8 qm8Var2 = qm8.x0;
        ozb ozbVar9 = vt8.f;
        ?? e8 = e5f.e(t7kVar, jSONObject, "content_alignment_vertical", tctVar3, qm8Var2, ns9Var, ozbVar9);
        ozb ozbVar10 = e8 == 0 ? ozbVar9 : e8;
        List Y4 = etn.Y(t7kVar, jSONObject, "disappear_actions", t6fVar.Y2);
        List Y5 = etn.Y(t7kVar, jSONObject, "doubletap_actions", jyrVar6);
        List Y6 = etn.Y(t7kVar, jSONObject, "extensions", t6fVar.k3);
        wz8 wz8Var = (wz8) etn.U(t7kVar, jSONObject, "focus", t6fVar.L3);
        List Y7 = etn.Y(t7kVar, jSONObject, "functions", t6fVar.U3);
        bk9 bk9Var = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.HEIGHT, jyrVar5);
        if (bk9Var == null) {
            bk9Var = vt8.g;
        }
        bk9 bk9Var2 = bk9Var;
        List Y8 = etn.Y(t7kVar, jSONObject, "hover_end_actions", jyrVar6);
        List Y9 = etn.Y(t7kVar, jSONObject, "hover_start_actions", jyrVar6);
        Object opt = jSONObject.opt(ConnectableDevice.KEY_ID);
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        String str = (String) (opt != null ? opt : null);
        pr8 pr8Var = (pr8) etn.U(t7kVar, jSONObject, "item_builder", t6fVar.m2);
        lc8 lc8Var2 = vt8.w;
        ozb ozbVar11 = vt8.h;
        ?? e9 = e5f.e(t7kVar, jSONObject, "item_spacing", ox8Var3, kzjVar3, lc8Var2, ozbVar11);
        ozb ozbVar12 = e9 == 0 ? ozbVar11 : e9;
        List Y10 = etn.Y(t7kVar, jSONObject, "items", t6fVar.aa);
        tct tctVar4 = vt8.r;
        qm8 qm8Var3 = qm8.E;
        ozb ozbVar13 = vt8.i;
        ?? e10 = e5f.e(t7kVar, jSONObject, "layout_mode", tctVar4, qm8Var3, ns9Var, ozbVar13);
        ozb ozbVar14 = e10 == 0 ? ozbVar13 : e10;
        w79 w79Var = (w79) etn.U(t7kVar, jSONObject, "layout_provider", t6fVar.Y4);
        ht8 ht8Var = (ht8) etn.U(t7kVar, jSONObject, "line_separator", jyrVar4);
        lc8 lc8Var3 = vt8.x;
        ozb ozbVar15 = vt8.j;
        ?? e11 = e5f.e(t7kVar, jSONObject, "line_spacing", ox8Var3, kzjVar3, lc8Var3, ozbVar15);
        ozb ozbVar16 = e11 == 0 ? ozbVar15 : e11;
        List Y11 = etn.Y(t7kVar, jSONObject, "longtap_actions", jyrVar6);
        ix8 ix8Var = (ix8) etn.U(t7kVar, jSONObject, "margins", jyrVar3);
        tct tctVar5 = vt8.s;
        qm8 qm8Var4 = qm8.G;
        ozb ozbVar17 = vt8.k;
        ?? e12 = e5f.e(t7kVar, jSONObject, "orientation", tctVar5, qm8Var4, ns9Var, ozbVar17);
        ozb ozbVar18 = e12 == 0 ? ozbVar17 : e12;
        ix8 ix8Var2 = (ix8) etn.U(t7kVar, jSONObject, "paddings", jyrVar3);
        List Y12 = etn.Y(t7kVar, jSONObject, "press_end_actions", jyrVar6);
        List Y13 = etn.Y(t7kVar, jSONObject, "press_start_actions", jyrVar6);
        szb e13 = e5f.e(t7kVar, jSONObject, "reuse_id", vct.c, bcx.i, ns9Var, null);
        szb e14 = e5f.e(t7kVar, jSONObject, "row_span", ox8Var3, kzjVar3, vt8.y, null);
        List Y14 = etn.Y(t7kVar, jSONObject, "selected_actions", jyrVar6);
        ht8 ht8Var2 = (ht8) etn.U(t7kVar, jSONObject, "separator", jyrVar4);
        List Y15 = etn.Y(t7kVar, jSONObject, "tooltips", t6fVar.n9);
        qv9 qv9Var = (qv9) etn.U(t7kVar, jSONObject, "transform", t6fVar.q9);
        List Y16 = etn.Y(t7kVar, jSONObject, "transformations", t6fVar.t9);
        sq8 sq8Var = (sq8) etn.U(t7kVar, jSONObject, "transition_change", t6fVar.d2);
        un8 un8Var = (un8) etn.U(t7kVar, jSONObject, "transition_in", jyrVar2);
        un8 un8Var2 = (un8) etn.U(t7kVar, jSONObject, "transition_out", jyrVar2);
        List a0 = etn.a0(t7kVar, jSONObject, "transition_triggers", vt8.z);
        List Y17 = etn.Y(t7kVar, jSONObject, "variable_triggers", t6fVar.C9);
        List Y18 = etn.Y(t7kVar, jSONObject, "variables", t6fVar.I9);
        tct tctVar6 = vt8.t;
        jx9 jx9Var = jx9.z;
        ozb ozbVar19 = vt8.l;
        ?? e15 = e5f.e(t7kVar, jSONObject, "visibility", tctVar6, jx9Var, ns9Var, ozbVar19);
        if (e15 != 0) {
            ozbVar19 = e15;
        }
        l1a l1aVar = (l1a) etn.U(t7kVar, jSONObject, "visibility_action", jyrVar);
        List Y19 = etn.Y(t7kVar, jSONObject, "visibility_actions", jyrVar);
        bk9 bk9Var3 = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.WIDTH, jyrVar5);
        if (bk9Var3 == null) {
            bk9Var3 = vt8.m;
        }
        return new jt8(tc8Var, bd8Var, sm8Var2, Y, e, e2, ozbVar2, Y2, do8Var, Y3, op8Var, ozbVar4, ozbVar6, e6, ozbVar8, ozbVar10, Y4, Y5, Y6, wz8Var, Y7, bk9Var2, Y8, Y9, str, pr8Var, ozbVar12, Y10, ozbVar14, w79Var, ht8Var, ozbVar16, Y11, ix8Var, ozbVar18, ix8Var2, Y12, Y13, e13, e14, Y14, ht8Var2, Y15, qv9Var, Y16, sq8Var, un8Var, un8Var2, a0, Y17, Y18, ozbVar19, l1aVar, Y19, bk9Var3);
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, jt8 jt8Var) {
        JSONObject jSONObject = new JSONObject();
        tc8 tc8Var = jt8Var.a;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.U9;
        jyr jyrVar2 = t6fVar.I1;
        jyr jyrVar3 = t6fVar.h3;
        jyr jyrVar4 = t6fVar.y2;
        jyr jyrVar5 = t6fVar.q7;
        etn.m0(t7kVar, jSONObject, "accessibility", tc8Var, t6fVar.H);
        bd8 bd8Var = jt8Var.b;
        jyr jyrVar6 = t6fVar.t1;
        etn.m0(t7kVar, jSONObject, Constants.KEY_ACTION, bd8Var, jyrVar6);
        etn.m0(t7kVar, jSONObject, "action_animation", jt8Var.c, t6fVar.z1);
        etn.n0(t7kVar, jSONObject, "actions", jt8Var.d, jyrVar6);
        szb szbVar = jt8Var.e;
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
        szb szbVar2 = jt8Var.f;
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
        e5f.g(t7kVar, jSONObject, "alpha", jt8Var.g);
        etn.n0(t7kVar, jSONObject, "animators", jt8Var.h, t6fVar.C1);
        etn.m0(t7kVar, jSONObject, "aspect", jt8Var.i, t6fVar.L1);
        etn.n0(t7kVar, jSONObject, C0479n3.g, jt8Var.j, t6fVar.O1);
        etn.m0(t7kVar, jSONObject, "border", jt8Var.k, t6fVar.U1);
        e5f.g(t7kVar, jSONObject, "capture_focus_on_action", jt8Var.l);
        e5f.g(t7kVar, jSONObject, "clip_to_bounds", jt8Var.m);
        e5f.g(t7kVar, jSONObject, "column_span", jt8Var.n);
        szb szbVar3 = jt8Var.o;
        if (szbVar3 != null) {
            Object b3 = szbVar3.b();
            try {
                if (szbVar3 instanceof pzb) {
                    jSONObject.put("content_alignment_horizontal", b3);
                } else {
                    jSONObject.put("content_alignment_horizontal", ((du8) b3).a);
                }
            } catch (JSONException e3) {
                t7kVar.a().a(e3);
            }
        }
        szb szbVar4 = jt8Var.p;
        if (szbVar4 != null) {
            Object b4 = szbVar4.b();
            try {
                if (szbVar4 instanceof pzb) {
                    jSONObject.put("content_alignment_vertical", b4);
                } else {
                    jSONObject.put("content_alignment_vertical", ((eu8) b4).a);
                }
            } catch (JSONException e4) {
                t7kVar.a().a(e4);
            }
        }
        etn.n0(t7kVar, jSONObject, "disappear_actions", jt8Var.q, t6fVar.Y2);
        etn.n0(t7kVar, jSONObject, "doubletap_actions", jt8Var.r, jyrVar6);
        etn.n0(t7kVar, jSONObject, "extensions", jt8Var.s, t6fVar.k3);
        etn.m0(t7kVar, jSONObject, "focus", jt8Var.t, t6fVar.L3);
        etn.n0(t7kVar, jSONObject, "functions", jt8Var.u, t6fVar.U3);
        etn.m0(t7kVar, jSONObject, CameraProperty.HEIGHT, jt8Var.v, jyrVar5);
        etn.n0(t7kVar, jSONObject, "hover_end_actions", jt8Var.w, jyrVar6);
        etn.n0(t7kVar, jSONObject, "hover_start_actions", jt8Var.x, jyrVar6);
        etn.l0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, jt8Var.y);
        etn.m0(t7kVar, jSONObject, "item_builder", jt8Var.z, t6fVar.m2);
        e5f.g(t7kVar, jSONObject, "item_spacing", jt8Var.A);
        etn.n0(t7kVar, jSONObject, "items", jt8Var.B, t6fVar.aa);
        szb szbVar5 = jt8Var.C;
        if (szbVar5 != null) {
            Object b5 = szbVar5.b();
            try {
                if (szbVar5 instanceof pzb) {
                    jSONObject.put("layout_mode", b5);
                } else {
                    jSONObject.put("layout_mode", ((ft8) b5).a);
                }
            } catch (JSONException e5) {
                t7kVar.a().a(e5);
            }
        }
        etn.m0(t7kVar, jSONObject, "layout_provider", jt8Var.D, t6fVar.Y4);
        etn.m0(t7kVar, jSONObject, "line_separator", jt8Var.E, jyrVar4);
        e5f.g(t7kVar, jSONObject, "line_spacing", jt8Var.F);
        etn.n0(t7kVar, jSONObject, "longtap_actions", jt8Var.G, jyrVar6);
        etn.m0(t7kVar, jSONObject, "margins", jt8Var.H, jyrVar3);
        szb szbVar6 = jt8Var.I;
        if (szbVar6 != null) {
            Object b6 = szbVar6.b();
            try {
                if (szbVar6 instanceof pzb) {
                    jSONObject.put("orientation", b6);
                } else {
                    jSONObject.put("orientation", ((gt8) b6).a);
                }
            } catch (JSONException e6) {
                t7kVar.a().a(e6);
            }
        }
        etn.m0(t7kVar, jSONObject, "paddings", jt8Var.J, jyrVar3);
        etn.n0(t7kVar, jSONObject, "press_end_actions", jt8Var.K, jyrVar6);
        etn.n0(t7kVar, jSONObject, "press_start_actions", jt8Var.L, jyrVar6);
        e5f.g(t7kVar, jSONObject, "reuse_id", jt8Var.M);
        e5f.g(t7kVar, jSONObject, "row_span", jt8Var.N);
        etn.n0(t7kVar, jSONObject, "selected_actions", jt8Var.O, jyrVar6);
        etn.m0(t7kVar, jSONObject, "separator", jt8Var.P, jyrVar4);
        etn.n0(t7kVar, jSONObject, "tooltips", jt8Var.Q, t6fVar.n9);
        etn.m0(t7kVar, jSONObject, "transform", jt8Var.R, t6fVar.q9);
        etn.n0(t7kVar, jSONObject, "transformations", jt8Var.S, t6fVar.t9);
        etn.m0(t7kVar, jSONObject, "transition_change", jt8Var.T, t6fVar.d2);
        etn.m0(t7kVar, jSONObject, "transition_in", jt8Var.U, jyrVar2);
        etn.m0(t7kVar, jSONObject, "transition_out", jt8Var.V, jyrVar2);
        List list = jt8Var.W;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < size; i++) {
                jSONArray.put(((nw9) list.get(i)).a);
            }
            try {
                jSONObject.put("transition_triggers", jSONArray);
            } catch (JSONException e7) {
                t7kVar.a().a(e7);
            }
        }
        etn.l0(t7kVar, jSONObject, "type", "container");
        etn.n0(t7kVar, jSONObject, "variable_triggers", jt8Var.X, t6fVar.C9);
        etn.n0(t7kVar, jSONObject, "variables", jt8Var.Y, t6fVar.I9);
        szb szbVar7 = jt8Var.Z;
        if (szbVar7 != null) {
            Object b7 = szbVar7.b();
            try {
                if (szbVar7 instanceof pzb) {
                    jSONObject.put("visibility", b7);
                } else {
                    jSONObject.put("visibility", ((k1a) b7).a);
                }
            } catch (JSONException e8) {
                t7kVar.a().a(e8);
            }
        }
        etn.m0(t7kVar, jSONObject, "visibility_action", jt8Var.a0, jyrVar);
        etn.n0(t7kVar, jSONObject, "visibility_actions", jt8Var.b0, jyrVar);
        etn.m0(t7kVar, jSONObject, CameraProperty.WIDTH, jt8Var.c0, jyrVar5);
        return jSONObject;
    }
}
