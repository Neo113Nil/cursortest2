package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a19 implements gip, py7 {
    public final t6f a;

    public a19(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v16, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v32, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v39, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v43, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v47, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v49, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v5, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v65, types: [szb] */
    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final s09 a(t7k t7kVar, JSONObject jSONObject) {
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.U9;
        jyr jyrVar2 = t6fVar.I1;
        jyr jyrVar3 = t6fVar.h3;
        jyr jyrVar4 = t6fVar.q7;
        tc8 tc8Var = (tc8) etn.U(t7kVar, jSONObject, "accessibility", t6fVar.H);
        tct tctVar = d19.l;
        va8 va8Var = va8.x0;
        ns9 ns9Var = bcx.h;
        szb e = e5f.e(t7kVar, jSONObject, "alignment_horizontal", tctVar, va8Var, ns9Var, null);
        szb e2 = e5f.e(t7kVar, jSONObject, "alignment_vertical", d19.m, va8.z0, ns9Var, null);
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        uw8 uw8Var = d19.s;
        ozb ozbVar = d19.a;
        ?? e3 = e5f.e(t7kVar, jSONObject, "alpha", ox8Var, kzjVar, uw8Var, ozbVar);
        ozb ozbVar2 = e3 == 0 ? ozbVar : e3;
        List Y = etn.Y(t7kVar, jSONObject, "animators", t6fVar.C1);
        List Y2 = etn.Y(t7kVar, jSONObject, C0479n3.g, t6fVar.O1);
        op8 op8Var = (op8) etn.U(t7kVar, jSONObject, "border", t6fVar.U1);
        ox8 ox8Var2 = vct.b;
        kzj kzjVar2 = kzj.F;
        szb e4 = e5f.e(t7kVar, jSONObject, "column_count", ox8Var2, kzjVar2, d19.t, null);
        szb e5 = e5f.e(t7kVar, jSONObject, "column_span", ox8Var2, kzjVar2, d19.u, null);
        tct tctVar2 = d19.n;
        vv8 vv8Var = vv8.D;
        ozb ozbVar3 = d19.b;
        ?? e6 = e5f.e(t7kVar, jSONObject, "cross_content_alignment", tctVar2, vv8Var, ns9Var, ozbVar3);
        ozb ozbVar4 = e6 == 0 ? ozbVar3 : e6;
        szb e7 = e5f.e(t7kVar, jSONObject, "cross_spacing", ox8Var2, kzjVar2, d19.v, null);
        uw8 uw8Var2 = d19.w;
        ozb ozbVar5 = d19.c;
        ?? e8 = e5f.e(t7kVar, jSONObject, "default_item", ox8Var2, kzjVar2, uw8Var2, ozbVar5);
        ozb ozbVar6 = e8 == 0 ? ozbVar5 : e8;
        List Y3 = etn.Y(t7kVar, jSONObject, "disappear_actions", t6fVar.Y2);
        List Y4 = etn.Y(t7kVar, jSONObject, "extensions", t6fVar.k3);
        wz8 wz8Var = (wz8) etn.U(t7kVar, jSONObject, "focus", t6fVar.L3);
        List Y5 = etn.Y(t7kVar, jSONObject, "functions", t6fVar.U3);
        bk9 bk9Var = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.HEIGHT, jyrVar4);
        if (bk9Var == null) {
            bk9Var = d19.d;
        }
        bk9 bk9Var2 = bk9Var;
        Object opt = jSONObject.opt(ConnectableDevice.KEY_ID);
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        String str = (String) (opt != null ? opt : null);
        pr8 pr8Var = (pr8) etn.U(t7kVar, jSONObject, "item_builder", t6fVar.m2);
        uw8 uw8Var3 = d19.x;
        ozb ozbVar7 = d19.e;
        ?? e9 = e5f.e(t7kVar, jSONObject, "item_spacing", ox8Var2, kzjVar2, uw8Var3, ozbVar7);
        ozb ozbVar8 = e9 == 0 ? ozbVar7 : e9;
        List Y6 = etn.Y(t7kVar, jSONObject, "items", t6fVar.aa);
        w79 w79Var = (w79) etn.U(t7kVar, jSONObject, "layout_provider", t6fVar.Y4);
        ix8 ix8Var = (ix8) etn.U(t7kVar, jSONObject, "margins", jyrVar3);
        tct tctVar3 = d19.o;
        vv8 vv8Var2 = vv8.F;
        ozb ozbVar9 = d19.f;
        ?? e10 = e5f.e(t7kVar, jSONObject, "orientation", tctVar3, vv8Var2, ns9Var, ozbVar9);
        ozb ozbVar10 = e10 == 0 ? ozbVar9 : e10;
        ix8 ix8Var2 = (ix8) etn.U(t7kVar, jSONObject, "paddings", jyrVar3);
        ox8 ox8Var3 = vct.a;
        kzj kzjVar3 = kzj.B;
        ozb ozbVar11 = d19.g;
        ?? e11 = e5f.e(t7kVar, jSONObject, "restrict_parent_scroll", ox8Var3, kzjVar3, ns9Var, ozbVar11);
        ozb ozbVar12 = e11 == 0 ? ozbVar11 : e11;
        szb e12 = e5f.e(t7kVar, jSONObject, "reuse_id", vct.c, bcx.i, ns9Var, null);
        szb e13 = e5f.e(t7kVar, jSONObject, "row_span", ox8Var2, kzjVar2, d19.y, null);
        tct tctVar4 = d19.p;
        vv8 vv8Var3 = vv8.H;
        ozb ozbVar13 = d19.h;
        ?? e14 = e5f.e(t7kVar, jSONObject, "scroll_mode", tctVar4, vv8Var3, ns9Var, ozbVar13);
        ozb ozbVar14 = e14 == 0 ? ozbVar13 : e14;
        tct tctVar5 = d19.q;
        vv8 vv8Var4 = vv8.J;
        ozb ozbVar15 = d19.i;
        ?? e15 = e5f.e(t7kVar, jSONObject, "scrollbar", tctVar5, vv8Var4, ns9Var, ozbVar15);
        ozb ozbVar16 = e15 == 0 ? ozbVar15 : e15;
        List Y7 = etn.Y(t7kVar, jSONObject, "selected_actions", t6fVar.t1);
        List Y8 = etn.Y(t7kVar, jSONObject, "tooltips", t6fVar.n9);
        qv9 qv9Var = (qv9) etn.U(t7kVar, jSONObject, "transform", t6fVar.q9);
        List Y9 = etn.Y(t7kVar, jSONObject, "transformations", t6fVar.t9);
        sq8 sq8Var = (sq8) etn.U(t7kVar, jSONObject, "transition_change", t6fVar.d2);
        un8 un8Var = (un8) etn.U(t7kVar, jSONObject, "transition_in", jyrVar2);
        un8 un8Var2 = (un8) etn.U(t7kVar, jSONObject, "transition_out", jyrVar2);
        List a0 = etn.a0(t7kVar, jSONObject, "transition_triggers", d19.z);
        List Y10 = etn.Y(t7kVar, jSONObject, "variable_triggers", t6fVar.C9);
        List Y11 = etn.Y(t7kVar, jSONObject, "variables", t6fVar.I9);
        tct tctVar6 = d19.r;
        jx9 jx9Var = jx9.z;
        ozb ozbVar17 = d19.j;
        ?? e16 = e5f.e(t7kVar, jSONObject, "visibility", tctVar6, jx9Var, ns9Var, ozbVar17);
        if (e16 != 0) {
            ozbVar17 = e16;
        }
        l1a l1aVar = (l1a) etn.U(t7kVar, jSONObject, "visibility_action", jyrVar);
        List Y12 = etn.Y(t7kVar, jSONObject, "visibility_actions", jyrVar);
        bk9 bk9Var3 = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.WIDTH, jyrVar4);
        if (bk9Var3 == null) {
            bk9Var3 = d19.k;
        }
        return new s09(tc8Var, e, e2, ozbVar2, Y, Y2, op8Var, e4, e5, ozbVar4, e7, ozbVar6, Y3, Y4, wz8Var, Y5, bk9Var2, str, pr8Var, ozbVar8, Y6, w79Var, ix8Var, ozbVar10, ix8Var2, ozbVar12, e12, e13, ozbVar14, ozbVar16, Y7, Y8, qv9Var, Y9, sq8Var, un8Var, un8Var2, a0, Y10, Y11, ozbVar17, l1aVar, Y12, bk9Var3);
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, s09 s09Var) {
        JSONObject jSONObject = new JSONObject();
        tc8 tc8Var = s09Var.a;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.U9;
        jyr jyrVar2 = t6fVar.I1;
        jyr jyrVar3 = t6fVar.h3;
        jyr jyrVar4 = t6fVar.q7;
        etn.m0(t7kVar, jSONObject, "accessibility", tc8Var, t6fVar.H);
        szb szbVar = s09Var.b;
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
        szb szbVar2 = s09Var.c;
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
        e5f.g(t7kVar, jSONObject, "alpha", s09Var.d);
        etn.n0(t7kVar, jSONObject, "animators", s09Var.e, t6fVar.C1);
        etn.n0(t7kVar, jSONObject, C0479n3.g, s09Var.f, t6fVar.O1);
        etn.m0(t7kVar, jSONObject, "border", s09Var.g, t6fVar.U1);
        e5f.g(t7kVar, jSONObject, "column_count", s09Var.h);
        e5f.g(t7kVar, jSONObject, "column_span", s09Var.i);
        szb szbVar3 = s09Var.j;
        if (szbVar3 != null) {
            Object b3 = szbVar3.b();
            try {
                if (szbVar3 instanceof pzb) {
                    jSONObject.put("cross_content_alignment", b3);
                } else {
                    jSONObject.put("cross_content_alignment", ((o09) b3).a);
                }
            } catch (JSONException e3) {
                t7kVar.a().a(e3);
            }
        }
        e5f.g(t7kVar, jSONObject, "cross_spacing", s09Var.k);
        e5f.g(t7kVar, jSONObject, "default_item", s09Var.l);
        etn.n0(t7kVar, jSONObject, "disappear_actions", s09Var.m, t6fVar.Y2);
        etn.n0(t7kVar, jSONObject, "extensions", s09Var.n, t6fVar.k3);
        etn.m0(t7kVar, jSONObject, "focus", s09Var.o, t6fVar.L3);
        etn.n0(t7kVar, jSONObject, "functions", s09Var.p, t6fVar.U3);
        etn.m0(t7kVar, jSONObject, CameraProperty.HEIGHT, s09Var.q, jyrVar4);
        etn.l0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, s09Var.r);
        etn.m0(t7kVar, jSONObject, "item_builder", s09Var.s, t6fVar.m2);
        e5f.g(t7kVar, jSONObject, "item_spacing", s09Var.t);
        etn.n0(t7kVar, jSONObject, "items", s09Var.u, t6fVar.aa);
        etn.m0(t7kVar, jSONObject, "layout_provider", s09Var.v, t6fVar.Y4);
        etn.m0(t7kVar, jSONObject, "margins", s09Var.w, jyrVar3);
        szb szbVar4 = s09Var.x;
        if (szbVar4 != null) {
            Object b4 = szbVar4.b();
            try {
                if (szbVar4 instanceof pzb) {
                    jSONObject.put("orientation", b4);
                } else {
                    jSONObject.put("orientation", ((p09) b4).a);
                }
            } catch (JSONException e4) {
                t7kVar.a().a(e4);
            }
        }
        etn.m0(t7kVar, jSONObject, "paddings", s09Var.y, jyrVar3);
        e5f.g(t7kVar, jSONObject, "restrict_parent_scroll", s09Var.z);
        e5f.g(t7kVar, jSONObject, "reuse_id", s09Var.A);
        e5f.g(t7kVar, jSONObject, "row_span", s09Var.B);
        szb szbVar5 = s09Var.C;
        if (szbVar5 != null) {
            Object b5 = szbVar5.b();
            try {
                if (szbVar5 instanceof pzb) {
                    jSONObject.put("scroll_mode", b5);
                } else {
                    jSONObject.put("scroll_mode", ((q09) b5).a);
                }
            } catch (JSONException e5) {
                t7kVar.a().a(e5);
            }
        }
        szb szbVar6 = s09Var.D;
        if (szbVar6 != null) {
            Object b6 = szbVar6.b();
            try {
                if (szbVar6 instanceof pzb) {
                    jSONObject.put("scrollbar", b6);
                } else {
                    jSONObject.put("scrollbar", ((r09) b6).a);
                }
            } catch (JSONException e6) {
                t7kVar.a().a(e6);
            }
        }
        etn.n0(t7kVar, jSONObject, "selected_actions", s09Var.E, t6fVar.t1);
        etn.n0(t7kVar, jSONObject, "tooltips", s09Var.F, t6fVar.n9);
        etn.m0(t7kVar, jSONObject, "transform", s09Var.G, t6fVar.q9);
        etn.n0(t7kVar, jSONObject, "transformations", s09Var.H, t6fVar.t9);
        etn.m0(t7kVar, jSONObject, "transition_change", s09Var.I, t6fVar.d2);
        etn.m0(t7kVar, jSONObject, "transition_in", s09Var.J, jyrVar2);
        etn.m0(t7kVar, jSONObject, "transition_out", s09Var.K, jyrVar2);
        List list = s09Var.L;
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
        etn.l0(t7kVar, jSONObject, "type", "gallery");
        etn.n0(t7kVar, jSONObject, "variable_triggers", s09Var.M, t6fVar.C9);
        etn.n0(t7kVar, jSONObject, "variables", s09Var.N, t6fVar.I9);
        szb szbVar7 = s09Var.O;
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
        etn.m0(t7kVar, jSONObject, "visibility_action", s09Var.P, jyrVar);
        etn.n0(t7kVar, jSONObject, "visibility_actions", s09Var.Q, jyrVar);
        etn.m0(t7kVar, jSONObject, CameraProperty.WIDTH, s09Var.R, jyrVar4);
        return jSONObject;
    }
}
