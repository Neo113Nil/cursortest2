package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class hp9 implements gip, py7 {
    public final t6f a;

    public hp9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v19, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v35, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v40, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v42, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v48, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v5, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v71, types: [szb] */
    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final vo9 a(t7k t7kVar, JSONObject jSONObject) {
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.U9;
        jyr jyrVar2 = t6fVar.I1;
        jyr jyrVar3 = t6fVar.q7;
        jyr jyrVar4 = t6fVar.h3;
        tc8 tc8Var = (tc8) etn.U(t7kVar, jSONObject, "accessibility", t6fVar.H);
        tct tctVar = kp9.m;
        va8 va8Var = va8.x0;
        ns9 ns9Var = bcx.h;
        szb e = e5f.e(t7kVar, jSONObject, "alignment_horizontal", tctVar, va8Var, ns9Var, null);
        szb e2 = e5f.e(t7kVar, jSONObject, "alignment_vertical", kp9.n, va8.z0, ns9Var, null);
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        hm9 hm9Var = kp9.p;
        ozb ozbVar = kp9.a;
        ?? e3 = e5f.e(t7kVar, jSONObject, "alpha", ox8Var, kzjVar, hm9Var, ozbVar);
        ozb ozbVar2 = e3 == 0 ? ozbVar : e3;
        List Y = etn.Y(t7kVar, jSONObject, "animators", t6fVar.C1);
        List Y2 = etn.Y(t7kVar, jSONObject, C0479n3.g, t6fVar.O1);
        op8 op8Var = (op8) etn.U(t7kVar, jSONObject, "border", t6fVar.U1);
        ox8 ox8Var2 = vct.b;
        kzj kzjVar2 = kzj.F;
        szb e4 = e5f.e(t7kVar, jSONObject, "column_span", ox8Var2, kzjVar2, kp9.q, null);
        List Y3 = etn.Y(t7kVar, jSONObject, "disappear_actions", t6fVar.Y2);
        ox8 ox8Var3 = vct.a;
        kzj kzjVar3 = kzj.B;
        ozb ozbVar3 = kp9.b;
        ?? e5 = e5f.e(t7kVar, jSONObject, "dynamic_height", ox8Var3, kzjVar3, ns9Var, ozbVar3);
        ozb ozbVar4 = e5 == 0 ? ozbVar3 : e5;
        List Y4 = etn.Y(t7kVar, jSONObject, "extensions", t6fVar.k3);
        wz8 wz8Var = (wz8) etn.U(t7kVar, jSONObject, "focus", t6fVar.L3);
        List Y5 = etn.Y(t7kVar, jSONObject, "functions", t6fVar.U3);
        ozb ozbVar5 = kp9.c;
        ?? e6 = e5f.e(t7kVar, jSONObject, "has_separator", ox8Var3, kzjVar3, ns9Var, ozbVar5);
        ozb ozbVar6 = e6 == 0 ? ozbVar5 : e6;
        bk9 bk9Var = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.HEIGHT, jyrVar3);
        if (bk9Var == null) {
            bk9Var = kp9.d;
        }
        bk9 bk9Var2 = bk9Var;
        Object opt = jSONObject.opt(ConnectableDevice.KEY_ID);
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        String str = (String) (opt != null ? opt : null);
        List S = etn.S(t7kVar, jSONObject, "items", t6fVar.p8, kp9.r);
        w79 w79Var = (w79) etn.U(t7kVar, jSONObject, "layout_provider", t6fVar.Y4);
        ix8 ix8Var = (ix8) etn.U(t7kVar, jSONObject, "margins", jyrVar4);
        ix8 ix8Var2 = (ix8) etn.U(t7kVar, jSONObject, "paddings", jyrVar4);
        ozb ozbVar7 = kp9.e;
        ?? e7 = e5f.e(t7kVar, jSONObject, "restrict_parent_scroll", ox8Var3, kzjVar3, ns9Var, ozbVar7);
        ozb ozbVar8 = e7 == 0 ? ozbVar7 : e7;
        szb e8 = e5f.e(t7kVar, jSONObject, "reuse_id", vct.c, bcx.i, ns9Var, null);
        szb e9 = e5f.e(t7kVar, jSONObject, "row_span", ox8Var2, kzjVar2, kp9.s, null);
        List Y6 = etn.Y(t7kVar, jSONObject, "selected_actions", t6fVar.t1);
        hm9 hm9Var2 = kp9.t;
        ozb ozbVar9 = kp9.f;
        ?? e10 = e5f.e(t7kVar, jSONObject, "selected_tab", ox8Var2, kzjVar2, hm9Var2, ozbVar9);
        ozb ozbVar10 = e10 == 0 ? ozbVar9 : e10;
        ox8 ox8Var4 = vct.f;
        kzj kzjVar4 = kzj.G;
        ozb ozbVar11 = kp9.g;
        ?? e11 = e5f.e(t7kVar, jSONObject, "separator_color", ox8Var4, kzjVar4, ns9Var, ozbVar11);
        ozb ozbVar12 = e11 == 0 ? ozbVar11 : e11;
        ix8 ix8Var3 = (ix8) etn.U(t7kVar, jSONObject, "separator_paddings", jyrVar4);
        if (ix8Var3 == null) {
            ix8Var3 = kp9.h;
        }
        ix8 ix8Var4 = ix8Var3;
        ozb ozbVar13 = kp9.i;
        ?? e12 = e5f.e(t7kVar, jSONObject, "switch_tabs_by_content_swipe_enabled", ox8Var3, kzjVar3, ns9Var, ozbVar13);
        ozb ozbVar14 = e12 == 0 ? ozbVar13 : e12;
        so9 so9Var = (so9) etn.U(t7kVar, jSONObject, "tab_title_delimiter", t6fVar.m8);
        uo9 uo9Var = (uo9) etn.U(t7kVar, jSONObject, "tab_title_style", t6fVar.j8);
        ix8 ix8Var5 = (ix8) etn.U(t7kVar, jSONObject, "title_paddings", jyrVar4);
        if (ix8Var5 == null) {
            ix8Var5 = kp9.j;
        }
        ix8 ix8Var6 = ix8Var5;
        List Y7 = etn.Y(t7kVar, jSONObject, "tooltips", t6fVar.n9);
        qv9 qv9Var = (qv9) etn.U(t7kVar, jSONObject, "transform", t6fVar.q9);
        List Y8 = etn.Y(t7kVar, jSONObject, "transformations", t6fVar.t9);
        sq8 sq8Var = (sq8) etn.U(t7kVar, jSONObject, "transition_change", t6fVar.d2);
        un8 un8Var = (un8) etn.U(t7kVar, jSONObject, "transition_in", jyrVar2);
        un8 un8Var2 = (un8) etn.U(t7kVar, jSONObject, "transition_out", jyrVar2);
        List a0 = etn.a0(t7kVar, jSONObject, "transition_triggers", kp9.u);
        List Y9 = etn.Y(t7kVar, jSONObject, "variable_triggers", t6fVar.C9);
        List Y10 = etn.Y(t7kVar, jSONObject, "variables", t6fVar.I9);
        tct tctVar2 = kp9.o;
        jx9 jx9Var = jx9.z;
        ozb ozbVar15 = kp9.k;
        ?? e13 = e5f.e(t7kVar, jSONObject, "visibility", tctVar2, jx9Var, ns9Var, ozbVar15);
        if (e13 != 0) {
            ozbVar15 = e13;
        }
        l1a l1aVar = (l1a) etn.U(t7kVar, jSONObject, "visibility_action", jyrVar);
        List Y11 = etn.Y(t7kVar, jSONObject, "visibility_actions", jyrVar);
        bk9 bk9Var3 = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.WIDTH, jyrVar3);
        if (bk9Var3 == null) {
            bk9Var3 = kp9.l;
        }
        return new vo9(tc8Var, e, e2, ozbVar2, Y, Y2, op8Var, e4, Y3, ozbVar4, Y4, wz8Var, Y5, ozbVar6, bk9Var2, str, S, w79Var, ix8Var, ix8Var2, ozbVar8, e8, e9, Y6, ozbVar10, ozbVar12, ix8Var4, ozbVar14, so9Var, uo9Var, ix8Var6, Y7, qv9Var, Y8, sq8Var, un8Var, un8Var2, a0, Y9, Y10, ozbVar15, l1aVar, Y11, bk9Var3);
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, vo9 vo9Var) {
        JSONObject jSONObject = new JSONObject();
        tc8 tc8Var = vo9Var.a;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.U9;
        jyr jyrVar2 = t6fVar.I1;
        jyr jyrVar3 = t6fVar.q7;
        jyr jyrVar4 = t6fVar.h3;
        etn.m0(t7kVar, jSONObject, "accessibility", tc8Var, t6fVar.H);
        szb szbVar = vo9Var.b;
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
        szb szbVar2 = vo9Var.c;
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
        e5f.g(t7kVar, jSONObject, "alpha", vo9Var.d);
        etn.n0(t7kVar, jSONObject, "animators", vo9Var.e, t6fVar.C1);
        etn.n0(t7kVar, jSONObject, C0479n3.g, vo9Var.f, t6fVar.O1);
        etn.m0(t7kVar, jSONObject, "border", vo9Var.g, t6fVar.U1);
        e5f.g(t7kVar, jSONObject, "column_span", vo9Var.h);
        etn.n0(t7kVar, jSONObject, "disappear_actions", vo9Var.i, t6fVar.Y2);
        e5f.g(t7kVar, jSONObject, "dynamic_height", vo9Var.j);
        etn.n0(t7kVar, jSONObject, "extensions", vo9Var.k, t6fVar.k3);
        etn.m0(t7kVar, jSONObject, "focus", vo9Var.l, t6fVar.L3);
        etn.n0(t7kVar, jSONObject, "functions", vo9Var.m, t6fVar.U3);
        e5f.g(t7kVar, jSONObject, "has_separator", vo9Var.n);
        etn.m0(t7kVar, jSONObject, CameraProperty.HEIGHT, vo9Var.o, jyrVar3);
        etn.l0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, vo9Var.p);
        etn.n0(t7kVar, jSONObject, "items", vo9Var.q, t6fVar.p8);
        etn.m0(t7kVar, jSONObject, "layout_provider", vo9Var.r, t6fVar.Y4);
        etn.m0(t7kVar, jSONObject, "margins", vo9Var.s, jyrVar4);
        etn.m0(t7kVar, jSONObject, "paddings", vo9Var.t, jyrVar4);
        e5f.g(t7kVar, jSONObject, "restrict_parent_scroll", vo9Var.u);
        e5f.g(t7kVar, jSONObject, "reuse_id", vo9Var.v);
        e5f.g(t7kVar, jSONObject, "row_span", vo9Var.w);
        etn.n0(t7kVar, jSONObject, "selected_actions", vo9Var.x, t6fVar.t1);
        e5f.g(t7kVar, jSONObject, "selected_tab", vo9Var.y);
        szb szbVar3 = vo9Var.z;
        if (szbVar3 != null) {
            Object b3 = szbVar3.b();
            try {
                if (szbVar3 instanceof pzb) {
                    jSONObject.put("separator_color", b3);
                } else {
                    jSONObject.put("separator_color", c85.a(((Number) b3).intValue()));
                }
            } catch (JSONException e3) {
                t7kVar.a().a(e3);
            }
        }
        etn.m0(t7kVar, jSONObject, "separator_paddings", vo9Var.A, jyrVar4);
        e5f.g(t7kVar, jSONObject, "switch_tabs_by_content_swipe_enabled", vo9Var.B);
        etn.m0(t7kVar, jSONObject, "tab_title_delimiter", vo9Var.C, t6fVar.m8);
        etn.m0(t7kVar, jSONObject, "tab_title_style", vo9Var.D, t6fVar.j8);
        etn.m0(t7kVar, jSONObject, "title_paddings", vo9Var.E, jyrVar4);
        etn.n0(t7kVar, jSONObject, "tooltips", vo9Var.F, t6fVar.n9);
        etn.m0(t7kVar, jSONObject, "transform", vo9Var.G, t6fVar.q9);
        etn.n0(t7kVar, jSONObject, "transformations", vo9Var.H, t6fVar.t9);
        etn.m0(t7kVar, jSONObject, "transition_change", vo9Var.I, t6fVar.d2);
        etn.m0(t7kVar, jSONObject, "transition_in", vo9Var.J, jyrVar2);
        etn.m0(t7kVar, jSONObject, "transition_out", vo9Var.K, jyrVar2);
        List list = vo9Var.L;
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
        etn.l0(t7kVar, jSONObject, "type", "tabs");
        etn.n0(t7kVar, jSONObject, "variable_triggers", vo9Var.M, t6fVar.C9);
        etn.n0(t7kVar, jSONObject, "variables", vo9Var.N, t6fVar.I9);
        szb szbVar4 = vo9Var.O;
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
        etn.m0(t7kVar, jSONObject, "visibility_action", vo9Var.P, jyrVar);
        etn.n0(t7kVar, jSONObject, "visibility_actions", vo9Var.Q, jyrVar);
        etn.m0(t7kVar, jSONObject, CameraProperty.WIDTH, vo9Var.R, jyrVar3);
        return jSONObject;
    }
}
