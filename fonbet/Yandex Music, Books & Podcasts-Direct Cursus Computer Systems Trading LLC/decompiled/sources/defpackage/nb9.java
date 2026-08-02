package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class nb9 implements gip, py7 {
    public final t6f a;

    public nb9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v14, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v28, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v43, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v49, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v5, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v53, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v69, types: [szb] */
    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final eb9 a(t7k t7kVar, JSONObject jSONObject) {
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.U9;
        jyr jyrVar2 = t6fVar.I1;
        jyr jyrVar3 = t6fVar.h3;
        jyr jyrVar4 = t6fVar.q7;
        tc8 tc8Var = (tc8) etn.U(t7kVar, jSONObject, "accessibility", t6fVar.H);
        tct tctVar = qb9.l;
        va8 va8Var = va8.x0;
        ns9 ns9Var = bcx.h;
        szb e = e5f.e(t7kVar, jSONObject, "alignment_horizontal", tctVar, va8Var, ns9Var, null);
        szb e2 = e5f.e(t7kVar, jSONObject, "alignment_vertical", qb9.m, va8.z0, ns9Var, null);
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        mb9 mb9Var = qb9.r;
        ozb ozbVar = qb9.a;
        ?? e3 = e5f.e(t7kVar, jSONObject, "alpha", ox8Var, kzjVar, mb9Var, ozbVar);
        ozb ozbVar2 = e3 == 0 ? ozbVar : e3;
        List Y = etn.Y(t7kVar, jSONObject, "animators", t6fVar.C1);
        List Y2 = etn.Y(t7kVar, jSONObject, C0479n3.g, t6fVar.O1);
        op8 op8Var = (op8) etn.U(t7kVar, jSONObject, "border", t6fVar.U1);
        ox8 ox8Var2 = vct.b;
        kzj kzjVar2 = kzj.F;
        szb e4 = e5f.e(t7kVar, jSONObject, "column_span", ox8Var2, kzjVar2, qb9.s, null);
        tct tctVar2 = qb9.n;
        i49 i49Var = i49.J;
        ozb ozbVar3 = qb9.b;
        ?? e5 = e5f.e(t7kVar, jSONObject, "cross_axis_alignment", tctVar2, i49Var, ns9Var, ozbVar3);
        ozb ozbVar4 = e5 == 0 ? ozbVar3 : e5;
        mb9 mb9Var2 = qb9.t;
        ozb ozbVar5 = qb9.c;
        ?? e6 = e5f.e(t7kVar, jSONObject, "default_item", ox8Var2, kzjVar2, mb9Var2, ozbVar5);
        ozb ozbVar6 = e6 == 0 ? ozbVar5 : e6;
        List Y3 = etn.Y(t7kVar, jSONObject, "disappear_actions", t6fVar.Y2);
        List Y4 = etn.Y(t7kVar, jSONObject, "extensions", t6fVar.k3);
        wz8 wz8Var = (wz8) etn.U(t7kVar, jSONObject, "focus", t6fVar.L3);
        List Y5 = etn.Y(t7kVar, jSONObject, "functions", t6fVar.U3);
        bk9 bk9Var = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.HEIGHT, jyrVar4);
        if (bk9Var == null) {
            bk9Var = qb9.d;
        }
        bk9 bk9Var2 = bk9Var;
        Object opt = jSONObject.opt(ConnectableDevice.KEY_ID);
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        String str = (String) (opt != null ? opt : null);
        ox8 ox8Var3 = vct.a;
        kzj kzjVar3 = kzj.B;
        ozb ozbVar7 = qb9.e;
        ?? e7 = e5f.e(t7kVar, jSONObject, "infinite_scroll", ox8Var3, kzjVar3, ns9Var, ozbVar7);
        ozb ozbVar8 = e7 == 0 ? ozbVar7 : e7;
        pr8 pr8Var = (pr8) etn.U(t7kVar, jSONObject, "item_builder", t6fVar.m2);
        jz8 jz8Var = (jz8) etn.U(t7kVar, jSONObject, "item_spacing", t6fVar.F3);
        if (jz8Var == null) {
            jz8Var = qb9.f;
        }
        jz8 jz8Var2 = jz8Var;
        List Y6 = etn.Y(t7kVar, jSONObject, "items", t6fVar.aa);
        ub9 ub9Var = (ub9) etn.O(t7kVar, jSONObject, "layout_mode", t6fVar.I5);
        w79 w79Var = (w79) etn.U(t7kVar, jSONObject, "layout_provider", t6fVar.Y4);
        ix8 ix8Var = (ix8) etn.U(t7kVar, jSONObject, "margins", jyrVar3);
        tct tctVar3 = qb9.o;
        i49 i49Var2 = i49.L;
        ozb ozbVar9 = qb9.g;
        ?? e8 = e5f.e(t7kVar, jSONObject, "orientation", tctVar3, i49Var2, ns9Var, ozbVar9);
        ozb ozbVar10 = e8 == 0 ? ozbVar9 : e8;
        ix8 ix8Var2 = (ix8) etn.U(t7kVar, jSONObject, "paddings", jyrVar3);
        ja9 ja9Var = (ja9) etn.U(t7kVar, jSONObject, "page_transformation", t6fVar.F5);
        ozb ozbVar11 = qb9.h;
        ?? e9 = e5f.e(t7kVar, jSONObject, "restrict_parent_scroll", ox8Var3, kzjVar3, ns9Var, ozbVar11);
        ozb ozbVar12 = e9 == 0 ? ozbVar11 : e9;
        szb e10 = e5f.e(t7kVar, jSONObject, "reuse_id", vct.c, bcx.i, ns9Var, null);
        szb e11 = e5f.e(t7kVar, jSONObject, "row_span", ox8Var2, kzjVar2, qb9.u, null);
        tct tctVar4 = qb9.p;
        ozb ozbVar13 = qb9.i;
        ?? e12 = e5f.e(t7kVar, jSONObject, "scroll_axis_alignment", tctVar4, i49Var, ns9Var, ozbVar13);
        ozb ozbVar14 = e12 == 0 ? ozbVar13 : e12;
        List Y7 = etn.Y(t7kVar, jSONObject, "selected_actions", t6fVar.t1);
        List Y8 = etn.Y(t7kVar, jSONObject, "tooltips", t6fVar.n9);
        qv9 qv9Var = (qv9) etn.U(t7kVar, jSONObject, "transform", t6fVar.q9);
        List Y9 = etn.Y(t7kVar, jSONObject, "transformations", t6fVar.t9);
        sq8 sq8Var = (sq8) etn.U(t7kVar, jSONObject, "transition_change", t6fVar.d2);
        un8 un8Var = (un8) etn.U(t7kVar, jSONObject, "transition_in", jyrVar2);
        un8 un8Var2 = (un8) etn.U(t7kVar, jSONObject, "transition_out", jyrVar2);
        List a0 = etn.a0(t7kVar, jSONObject, "transition_triggers", qb9.v);
        List Y10 = etn.Y(t7kVar, jSONObject, "variable_triggers", t6fVar.C9);
        List Y11 = etn.Y(t7kVar, jSONObject, "variables", t6fVar.I9);
        tct tctVar5 = qb9.q;
        jx9 jx9Var = jx9.z;
        ozb ozbVar15 = qb9.j;
        ?? e13 = e5f.e(t7kVar, jSONObject, "visibility", tctVar5, jx9Var, ns9Var, ozbVar15);
        if (e13 != 0) {
            ozbVar15 = e13;
        }
        l1a l1aVar = (l1a) etn.U(t7kVar, jSONObject, "visibility_action", jyrVar);
        List Y12 = etn.Y(t7kVar, jSONObject, "visibility_actions", jyrVar);
        bk9 bk9Var3 = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.WIDTH, jyrVar4);
        if (bk9Var3 == null) {
            bk9Var3 = qb9.k;
        }
        return new eb9(tc8Var, e, e2, ozbVar2, Y, Y2, op8Var, e4, ozbVar4, ozbVar6, Y3, Y4, wz8Var, Y5, bk9Var2, str, ozbVar8, pr8Var, jz8Var2, Y6, ub9Var, w79Var, ix8Var, ozbVar10, ix8Var2, ja9Var, ozbVar12, e10, e11, ozbVar14, Y7, Y8, qv9Var, Y9, sq8Var, un8Var, un8Var2, a0, Y10, Y11, ozbVar15, l1aVar, Y12, bk9Var3);
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, eb9 eb9Var) {
        JSONObject jSONObject = new JSONObject();
        tc8 tc8Var = eb9Var.a;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.U9;
        jyr jyrVar2 = t6fVar.I1;
        jyr jyrVar3 = t6fVar.h3;
        jyr jyrVar4 = t6fVar.q7;
        etn.m0(t7kVar, jSONObject, "accessibility", tc8Var, t6fVar.H);
        szb szbVar = eb9Var.b;
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
        szb szbVar2 = eb9Var.c;
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
        e5f.g(t7kVar, jSONObject, "alpha", eb9Var.d);
        etn.n0(t7kVar, jSONObject, "animators", eb9Var.e, t6fVar.C1);
        etn.n0(t7kVar, jSONObject, C0479n3.g, eb9Var.f, t6fVar.O1);
        etn.m0(t7kVar, jSONObject, "border", eb9Var.g, t6fVar.U1);
        e5f.g(t7kVar, jSONObject, "column_span", eb9Var.h);
        szb szbVar3 = eb9Var.i;
        i49 i49Var = i49.K;
        e5f.h(t7kVar, jSONObject, "cross_axis_alignment", szbVar3, i49Var);
        e5f.g(t7kVar, jSONObject, "default_item", eb9Var.j);
        etn.n0(t7kVar, jSONObject, "disappear_actions", eb9Var.k, t6fVar.Y2);
        etn.n0(t7kVar, jSONObject, "extensions", eb9Var.l, t6fVar.k3);
        etn.m0(t7kVar, jSONObject, "focus", eb9Var.m, t6fVar.L3);
        etn.n0(t7kVar, jSONObject, "functions", eb9Var.n, t6fVar.U3);
        etn.m0(t7kVar, jSONObject, CameraProperty.HEIGHT, eb9Var.o, jyrVar4);
        etn.l0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, eb9Var.p);
        e5f.g(t7kVar, jSONObject, "infinite_scroll", eb9Var.q);
        etn.m0(t7kVar, jSONObject, "item_builder", eb9Var.r, t6fVar.m2);
        etn.m0(t7kVar, jSONObject, "item_spacing", eb9Var.s, t6fVar.F3);
        etn.n0(t7kVar, jSONObject, "items", eb9Var.t, t6fVar.aa);
        etn.m0(t7kVar, jSONObject, "layout_mode", eb9Var.u, t6fVar.I5);
        etn.m0(t7kVar, jSONObject, "layout_provider", eb9Var.v, t6fVar.Y4);
        etn.m0(t7kVar, jSONObject, "margins", eb9Var.w, jyrVar3);
        szb szbVar4 = eb9Var.x;
        if (szbVar4 != null) {
            Object b3 = szbVar4.b();
            try {
                if (szbVar4 instanceof pzb) {
                    jSONObject.put("orientation", b3);
                } else {
                    jSONObject.put("orientation", ((db9) b3).a);
                }
            } catch (JSONException e3) {
                t7kVar.a().a(e3);
            }
        }
        etn.m0(t7kVar, jSONObject, "paddings", eb9Var.y, jyrVar3);
        etn.m0(t7kVar, jSONObject, "page_transformation", eb9Var.z, t6fVar.F5);
        e5f.g(t7kVar, jSONObject, "restrict_parent_scroll", eb9Var.A);
        e5f.g(t7kVar, jSONObject, "reuse_id", eb9Var.B);
        e5f.g(t7kVar, jSONObject, "row_span", eb9Var.C);
        e5f.h(t7kVar, jSONObject, "scroll_axis_alignment", eb9Var.D, i49Var);
        etn.n0(t7kVar, jSONObject, "selected_actions", eb9Var.E, t6fVar.t1);
        etn.n0(t7kVar, jSONObject, "tooltips", eb9Var.F, t6fVar.n9);
        etn.m0(t7kVar, jSONObject, "transform", eb9Var.G, t6fVar.q9);
        etn.n0(t7kVar, jSONObject, "transformations", eb9Var.H, t6fVar.t9);
        etn.m0(t7kVar, jSONObject, "transition_change", eb9Var.I, t6fVar.d2);
        etn.m0(t7kVar, jSONObject, "transition_in", eb9Var.J, jyrVar2);
        etn.m0(t7kVar, jSONObject, "transition_out", eb9Var.K, jyrVar2);
        List list = eb9Var.L;
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
        etn.l0(t7kVar, jSONObject, "type", "pager");
        etn.n0(t7kVar, jSONObject, "variable_triggers", eb9Var.M, t6fVar.C9);
        etn.n0(t7kVar, jSONObject, "variables", eb9Var.N, t6fVar.I9);
        szb szbVar5 = eb9Var.O;
        if (szbVar5 != null) {
            Object b4 = szbVar5.b();
            try {
                if (szbVar5 instanceof pzb) {
                    jSONObject.put("visibility", b4);
                } else {
                    jSONObject.put("visibility", ((k1a) b4).a);
                }
            } catch (JSONException e5) {
                t7kVar.a().a(e5);
            }
        }
        etn.m0(t7kVar, jSONObject, "visibility_action", eb9Var.P, jyrVar);
        etn.n0(t7kVar, jSONObject, "visibility_actions", eb9Var.Q, jyrVar);
        etn.m0(t7kVar, jSONObject, CameraProperty.WIDTH, eb9Var.R, jyrVar4);
        return jSONObject;
    }
}
