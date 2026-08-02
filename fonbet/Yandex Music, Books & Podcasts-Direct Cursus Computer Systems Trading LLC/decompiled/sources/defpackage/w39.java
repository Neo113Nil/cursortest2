package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class w39 implements gip, py7 {
    public final t6f a;

    public w39(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v13, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v3, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v33, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v45, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v5, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v76, types: [szb] */
    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final k39 a(t7k t7kVar, JSONObject jSONObject) {
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.U9;
        jyr jyrVar2 = t6fVar.I1;
        jyr jyrVar3 = t6fVar.h3;
        jyr jyrVar4 = t6fVar.q7;
        jyr jyrVar5 = t6fVar.M6;
        tc8 tc8Var = (tc8) etn.U(t7kVar, jSONObject, "accessibility", t6fVar.H);
        ox8 ox8Var = vct.f;
        kzj kzjVar = kzj.G;
        ozb ozbVar = z39.a;
        ns9 ns9Var = bcx.h;
        ?? e = e5f.e(t7kVar, jSONObject, "active_item_color", ox8Var, kzjVar, ns9Var, ozbVar);
        ozb ozbVar2 = e == 0 ? ozbVar : e;
        ox8 ox8Var2 = vct.d;
        kzj kzjVar2 = kzj.E;
        l29 l29Var = z39.p;
        ozb ozbVar3 = z39.b;
        ?? e2 = e5f.e(t7kVar, jSONObject, "active_item_size", ox8Var2, kzjVar2, l29Var, ozbVar3);
        ozb ozbVar4 = e2 == 0 ? ozbVar3 : e2;
        qh9 qh9Var = (qh9) etn.U(t7kVar, jSONObject, "active_shape", jyrVar5);
        szb e3 = e5f.e(t7kVar, jSONObject, "alignment_horizontal", z39.l, va8.x0, ns9Var, null);
        szb e4 = e5f.e(t7kVar, jSONObject, "alignment_vertical", z39.m, va8.z0, ns9Var, null);
        l29 l29Var2 = z39.q;
        ozb ozbVar5 = z39.c;
        ?? e5 = e5f.e(t7kVar, jSONObject, "alpha", ox8Var2, kzjVar2, l29Var2, ozbVar5);
        ozb ozbVar6 = e5 == 0 ? ozbVar5 : e5;
        tct tctVar = z39.n;
        p19 p19Var = p19.L;
        ozb ozbVar7 = z39.d;
        ?? e6 = e5f.e(t7kVar, jSONObject, "animation", tctVar, p19Var, ns9Var, ozbVar7);
        ozb ozbVar8 = e6 == 0 ? ozbVar7 : e6;
        List Y = etn.Y(t7kVar, jSONObject, "animators", t6fVar.C1);
        List Y2 = etn.Y(t7kVar, jSONObject, C0479n3.g, t6fVar.O1);
        op8 op8Var = (op8) etn.U(t7kVar, jSONObject, "border", t6fVar.U1);
        ox8 ox8Var3 = vct.b;
        kzj kzjVar3 = kzj.F;
        szb e7 = e5f.e(t7kVar, jSONObject, "column_span", ox8Var3, kzjVar3, z39.r, null);
        List Y3 = etn.Y(t7kVar, jSONObject, "disappear_actions", t6fVar.Y2);
        List Y4 = etn.Y(t7kVar, jSONObject, "extensions", t6fVar.k3);
        wz8 wz8Var = (wz8) etn.U(t7kVar, jSONObject, "focus", t6fVar.L3);
        List Y5 = etn.Y(t7kVar, jSONObject, "functions", t6fVar.U3);
        bk9 bk9Var = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.HEIGHT, jyrVar4);
        if (bk9Var == null) {
            bk9Var = z39.e;
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
        ozb ozbVar9 = z39.f;
        ?? e8 = e5f.e(t7kVar, jSONObject, "inactive_item_color", ox8Var, kzjVar, ns9Var, ozbVar9);
        ozb ozbVar10 = e8 == 0 ? ozbVar9 : e8;
        qh9 qh9Var2 = (qh9) etn.U(t7kVar, jSONObject, "inactive_minimum_shape", jyrVar5);
        qh9 qh9Var3 = (qh9) etn.U(t7kVar, jSONObject, "inactive_shape", jyrVar5);
        p39 p39Var = (p39) etn.U(t7kVar, jSONObject, "items_placement", t6fVar.m4);
        w79 w79Var = (w79) etn.U(t7kVar, jSONObject, "layout_provider", t6fVar.Y4);
        ix8 ix8Var = (ix8) etn.U(t7kVar, jSONObject, "margins", jyrVar3);
        l29 l29Var3 = z39.s;
        ozb ozbVar11 = z39.g;
        ?? e9 = e5f.e(t7kVar, jSONObject, "minimum_item_size", ox8Var2, kzjVar2, l29Var3, ozbVar11);
        ozb ozbVar12 = e9 == 0 ? ozbVar11 : e9;
        ix8 ix8Var2 = (ix8) etn.U(t7kVar, jSONObject, "paddings", jyrVar3);
        Object opt2 = jSONObject.opt("pager_id");
        if (opt2 == obj) {
            opt2 = null;
        }
        String str2 = (String) (opt2 != null ? opt2 : null);
        szb e10 = e5f.e(t7kVar, jSONObject, "reuse_id", vct.c, bcx.i, ns9Var, null);
        szb e11 = e5f.e(t7kVar, jSONObject, "row_span", ox8Var3, kzjVar3, z39.t, null);
        List Y6 = etn.Y(t7kVar, jSONObject, "selected_actions", t6fVar.t1);
        kj9 kj9Var = (kj9) etn.U(t7kVar, jSONObject, "shape", t6fVar.k7);
        if (kj9Var == null) {
            kj9Var = z39.h;
        }
        kj9 kj9Var2 = kj9Var;
        jz8 jz8Var = (jz8) etn.U(t7kVar, jSONObject, "space_between_centers", t6fVar.F3);
        if (jz8Var == null) {
            jz8Var = z39.i;
        }
        jz8 jz8Var2 = jz8Var;
        List Y7 = etn.Y(t7kVar, jSONObject, "tooltips", t6fVar.n9);
        qv9 qv9Var = (qv9) etn.U(t7kVar, jSONObject, "transform", t6fVar.q9);
        List Y8 = etn.Y(t7kVar, jSONObject, "transformations", t6fVar.t9);
        sq8 sq8Var = (sq8) etn.U(t7kVar, jSONObject, "transition_change", t6fVar.d2);
        un8 un8Var = (un8) etn.U(t7kVar, jSONObject, "transition_in", jyrVar2);
        un8 un8Var2 = (un8) etn.U(t7kVar, jSONObject, "transition_out", jyrVar2);
        List a0 = etn.a0(t7kVar, jSONObject, "transition_triggers", z39.u);
        List Y9 = etn.Y(t7kVar, jSONObject, "variable_triggers", t6fVar.C9);
        List Y10 = etn.Y(t7kVar, jSONObject, "variables", t6fVar.I9);
        tct tctVar2 = z39.o;
        jx9 jx9Var = jx9.z;
        ozb ozbVar13 = z39.j;
        ?? e12 = e5f.e(t7kVar, jSONObject, "visibility", tctVar2, jx9Var, ns9Var, ozbVar13);
        if (e12 != 0) {
            ozbVar13 = e12;
        }
        l1a l1aVar = (l1a) etn.U(t7kVar, jSONObject, "visibility_action", jyrVar);
        List Y11 = etn.Y(t7kVar, jSONObject, "visibility_actions", jyrVar);
        bk9 bk9Var3 = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.WIDTH, jyrVar4);
        if (bk9Var3 == null) {
            bk9Var3 = z39.k;
        }
        return new k39(tc8Var, ozbVar2, ozbVar4, qh9Var, e3, e4, ozbVar6, ozbVar8, Y, Y2, op8Var, e7, Y3, Y4, wz8Var, Y5, bk9Var2, str, ozbVar10, qh9Var2, qh9Var3, p39Var, w79Var, ix8Var, ozbVar12, ix8Var2, str2, e10, e11, Y6, kj9Var2, jz8Var2, Y7, qv9Var, Y8, sq8Var, un8Var, un8Var2, a0, Y9, Y10, ozbVar13, l1aVar, Y11, bk9Var3);
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, k39 k39Var) {
        JSONObject jSONObject = new JSONObject();
        tc8 tc8Var = k39Var.a;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.U9;
        jyr jyrVar2 = t6fVar.I1;
        jyr jyrVar3 = t6fVar.h3;
        jyr jyrVar4 = t6fVar.q7;
        etn.m0(t7kVar, jSONObject, "accessibility", tc8Var, t6fVar.H);
        szb szbVar = k39Var.b;
        kzj kzjVar = kzj.D;
        e5f.h(t7kVar, jSONObject, "active_item_color", szbVar, kzjVar);
        e5f.g(t7kVar, jSONObject, "active_item_size", k39Var.c);
        qh9 qh9Var = k39Var.d;
        jyr jyrVar5 = t6fVar.M6;
        etn.m0(t7kVar, jSONObject, "active_shape", qh9Var, jyrVar5);
        szb szbVar2 = k39Var.e;
        if (szbVar2 != null) {
            Object b = szbVar2.b();
            try {
                if (szbVar2 instanceof pzb) {
                    jSONObject.put("alignment_horizontal", b);
                } else {
                    jSONObject.put("alignment_horizontal", ((om8) b).a);
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        szb szbVar3 = k39Var.f;
        if (szbVar3 != null) {
            Object b2 = szbVar3.b();
            try {
                if (szbVar3 instanceof pzb) {
                    jSONObject.put("alignment_vertical", b2);
                } else {
                    jSONObject.put("alignment_vertical", ((pm8) b2).a);
                }
            } catch (JSONException e2) {
                t7kVar.a().a(e2);
            }
        }
        e5f.g(t7kVar, jSONObject, "alpha", k39Var.g);
        szb szbVar4 = k39Var.h;
        if (szbVar4 != null) {
            Object b3 = szbVar4.b();
            try {
                if (szbVar4 instanceof pzb) {
                    jSONObject.put("animation", b3);
                } else {
                    jSONObject.put("animation", ((j39) b3).a);
                }
            } catch (JSONException e3) {
                t7kVar.a().a(e3);
            }
        }
        etn.n0(t7kVar, jSONObject, "animators", k39Var.i, t6fVar.C1);
        etn.n0(t7kVar, jSONObject, C0479n3.g, k39Var.j, t6fVar.O1);
        etn.m0(t7kVar, jSONObject, "border", k39Var.k, t6fVar.U1);
        e5f.g(t7kVar, jSONObject, "column_span", k39Var.l);
        etn.n0(t7kVar, jSONObject, "disappear_actions", k39Var.m, t6fVar.Y2);
        etn.n0(t7kVar, jSONObject, "extensions", k39Var.n, t6fVar.k3);
        etn.m0(t7kVar, jSONObject, "focus", k39Var.o, t6fVar.L3);
        etn.n0(t7kVar, jSONObject, "functions", k39Var.p, t6fVar.U3);
        etn.m0(t7kVar, jSONObject, CameraProperty.HEIGHT, k39Var.q, jyrVar4);
        etn.l0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, k39Var.r);
        e5f.h(t7kVar, jSONObject, "inactive_item_color", k39Var.s, kzjVar);
        etn.m0(t7kVar, jSONObject, "inactive_minimum_shape", k39Var.t, jyrVar5);
        etn.m0(t7kVar, jSONObject, "inactive_shape", k39Var.u, jyrVar5);
        etn.m0(t7kVar, jSONObject, "items_placement", k39Var.v, t6fVar.m4);
        etn.m0(t7kVar, jSONObject, "layout_provider", k39Var.w, t6fVar.Y4);
        etn.m0(t7kVar, jSONObject, "margins", k39Var.x, jyrVar3);
        e5f.g(t7kVar, jSONObject, "minimum_item_size", k39Var.y);
        etn.m0(t7kVar, jSONObject, "paddings", k39Var.z, jyrVar3);
        etn.l0(t7kVar, jSONObject, "pager_id", k39Var.A);
        e5f.g(t7kVar, jSONObject, "reuse_id", k39Var.B);
        e5f.g(t7kVar, jSONObject, "row_span", k39Var.C);
        etn.n0(t7kVar, jSONObject, "selected_actions", k39Var.D, t6fVar.t1);
        etn.m0(t7kVar, jSONObject, "shape", k39Var.E, t6fVar.k7);
        etn.m0(t7kVar, jSONObject, "space_between_centers", k39Var.F, t6fVar.F3);
        etn.n0(t7kVar, jSONObject, "tooltips", k39Var.G, t6fVar.n9);
        etn.m0(t7kVar, jSONObject, "transform", k39Var.H, t6fVar.q9);
        etn.n0(t7kVar, jSONObject, "transformations", k39Var.I, t6fVar.t9);
        etn.m0(t7kVar, jSONObject, "transition_change", k39Var.J, t6fVar.d2);
        etn.m0(t7kVar, jSONObject, "transition_in", k39Var.K, jyrVar2);
        etn.m0(t7kVar, jSONObject, "transition_out", k39Var.L, jyrVar2);
        List list = k39Var.M;
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
        etn.l0(t7kVar, jSONObject, "type", "indicator");
        etn.n0(t7kVar, jSONObject, "variable_triggers", k39Var.N, t6fVar.C9);
        etn.n0(t7kVar, jSONObject, "variables", k39Var.O, t6fVar.I9);
        szb szbVar5 = k39Var.P;
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
        etn.m0(t7kVar, jSONObject, "visibility_action", k39Var.Q, jyrVar);
        etn.n0(t7kVar, jSONObject, "visibility_actions", k39Var.R, jyrVar);
        etn.m0(t7kVar, jSONObject, CameraProperty.WIDTH, k39Var.S, jyrVar4);
        return jSONObject;
    }
}
