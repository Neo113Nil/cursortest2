package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class gi9 implements gip, py7 {
    public final t6f a;

    public gi9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v19, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v29, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v38, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v49, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v5, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v65, types: [szb] */
    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ei9 a(t7k t7kVar, JSONObject jSONObject) {
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.U9;
        jyr jyrVar2 = t6fVar.I1;
        jyr jyrVar3 = t6fVar.h3;
        jyr jyrVar4 = t6fVar.q7;
        tc8 tc8Var = (tc8) etn.U(t7kVar, jSONObject, "accessibility", t6fVar.H);
        tct tctVar = ji9.j;
        va8 va8Var = va8.x0;
        ns9 ns9Var = bcx.h;
        szb e = e5f.e(t7kVar, jSONObject, "alignment_horizontal", tctVar, va8Var, ns9Var, null);
        szb e2 = e5f.e(t7kVar, jSONObject, "alignment_vertical", ji9.k, va8.z0, ns9Var, null);
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        mb9 mb9Var = ji9.o;
        ozb ozbVar = ji9.a;
        ?? e3 = e5f.e(t7kVar, jSONObject, "alpha", ox8Var, kzjVar, mb9Var, ozbVar);
        ozb ozbVar2 = e3 == 0 ? ozbVar : e3;
        List Y = etn.Y(t7kVar, jSONObject, "animators", t6fVar.C1);
        List Y2 = etn.Y(t7kVar, jSONObject, C0479n3.g, t6fVar.O1);
        op8 op8Var = (op8) etn.U(t7kVar, jSONObject, "border", t6fVar.U1);
        ox8 ox8Var2 = vct.b;
        kzj kzjVar2 = kzj.F;
        szb e4 = e5f.e(t7kVar, jSONObject, "column_span", ox8Var2, kzjVar2, ji9.p, null);
        List Y3 = etn.Y(t7kVar, jSONObject, "disappear_actions", t6fVar.Y2);
        List Y4 = etn.Y(t7kVar, jSONObject, "extensions", t6fVar.k3);
        wz8 wz8Var = (wz8) etn.U(t7kVar, jSONObject, "focus", t6fVar.L3);
        ox8 ox8Var3 = vct.c;
        s3f s3fVar = bcx.i;
        szb e5 = e5f.e(t7kVar, jSONObject, "font_family", ox8Var3, s3fVar, ns9Var, null);
        mb9 mb9Var2 = ji9.q;
        ozb ozbVar3 = ji9.b;
        ?? e6 = e5f.e(t7kVar, jSONObject, "font_size", ox8Var2, kzjVar2, mb9Var2, ozbVar3);
        ozb ozbVar4 = e6 == 0 ? ozbVar3 : e6;
        tct tctVar2 = ji9.l;
        gd9 gd9Var = gd9.w0;
        ozb ozbVar5 = ji9.c;
        ?? e7 = e5f.e(t7kVar, jSONObject, "font_size_unit", tctVar2, gd9Var, ns9Var, ozbVar5);
        ozb ozbVar6 = e7 == 0 ? ozbVar5 : e7;
        szb e8 = e5f.e(t7kVar, jSONObject, "font_variation_settings", vct.h, s3fVar, ns9Var, null);
        szb e9 = e5f.e(t7kVar, jSONObject, "font_weight", ji9.m, vv8.B, ns9Var, null);
        szb e10 = e5f.e(t7kVar, jSONObject, "font_weight_value", ox8Var2, kzjVar2, ji9.r, null);
        List Y5 = etn.Y(t7kVar, jSONObject, "functions", t6fVar.U3);
        bk9 bk9Var = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.HEIGHT, jyrVar4);
        if (bk9Var == null) {
            bk9Var = ji9.d;
        }
        bk9 bk9Var2 = bk9Var;
        ox8 ox8Var4 = vct.f;
        kzj kzjVar3 = kzj.G;
        ozb ozbVar7 = ji9.e;
        ?? e11 = e5f.e(t7kVar, jSONObject, "hint_color", ox8Var4, kzjVar3, ns9Var, ozbVar7);
        ozb ozbVar8 = e11 == 0 ? ozbVar7 : e11;
        szb e12 = e5f.e(t7kVar, jSONObject, "hint_text", ox8Var3, s3fVar, ns9Var, null);
        Object opt = jSONObject.opt(ConnectableDevice.KEY_ID);
        Object obj = JSONObject.NULL;
        if (opt == obj) {
            opt = null;
        }
        if (opt == null) {
            opt = null;
        }
        String str = (String) opt;
        w79 w79Var = (w79) etn.U(t7kVar, jSONObject, "layout_provider", t6fVar.Y4);
        ozb ozbVar9 = ji9.f;
        ?? e13 = e5f.e(t7kVar, jSONObject, "letter_spacing", ox8Var, kzjVar, ns9Var, ozbVar9);
        ozb ozbVar10 = e13 == 0 ? ozbVar9 : e13;
        szb e14 = e5f.e(t7kVar, jSONObject, "line_height", ox8Var2, kzjVar2, ji9.s, null);
        ix8 ix8Var = (ix8) etn.U(t7kVar, jSONObject, "margins", jyrVar3);
        List S = etn.S(t7kVar, jSONObject, "options", t6fVar.V6, ji9.t);
        ix8 ix8Var2 = (ix8) etn.U(t7kVar, jSONObject, "paddings", jyrVar3);
        szb e15 = e5f.e(t7kVar, jSONObject, "reuse_id", ox8Var3, s3fVar, ns9Var, null);
        szb e16 = e5f.e(t7kVar, jSONObject, "row_span", ox8Var2, kzjVar2, ji9.u, null);
        List Y6 = etn.Y(t7kVar, jSONObject, "selected_actions", t6fVar.t1);
        ozb ozbVar11 = ji9.g;
        ?? e17 = e5f.e(t7kVar, jSONObject, "text_color", ox8Var4, kzjVar3, ns9Var, ozbVar11);
        ozb ozbVar12 = e17 == 0 ? ozbVar11 : e17;
        List Y7 = etn.Y(t7kVar, jSONObject, "tooltips", t6fVar.n9);
        qv9 qv9Var = (qv9) etn.U(t7kVar, jSONObject, "transform", t6fVar.q9);
        List Y8 = etn.Y(t7kVar, jSONObject, "transformations", t6fVar.t9);
        sq8 sq8Var = (sq8) etn.U(t7kVar, jSONObject, "transition_change", t6fVar.d2);
        un8 un8Var = (un8) etn.U(t7kVar, jSONObject, "transition_in", jyrVar2);
        un8 un8Var2 = (un8) etn.U(t7kVar, jSONObject, "transition_out", jyrVar2);
        List a0 = etn.a0(t7kVar, jSONObject, "transition_triggers", ji9.v);
        Object opt2 = jSONObject.opt("value_variable");
        Object obj2 = opt2 != obj ? opt2 : null;
        if (obj2 == null) {
            throw a8k.g("value_variable", jSONObject);
        }
        String str2 = (String) obj2;
        List Y9 = etn.Y(t7kVar, jSONObject, "variable_triggers", t6fVar.C9);
        List Y10 = etn.Y(t7kVar, jSONObject, "variables", t6fVar.I9);
        tct tctVar3 = ji9.n;
        jx9 jx9Var = jx9.z;
        ozb ozbVar13 = ji9.h;
        ?? e18 = e5f.e(t7kVar, jSONObject, "visibility", tctVar3, jx9Var, ns9Var, ozbVar13);
        if (e18 != 0) {
            ozbVar13 = e18;
        }
        l1a l1aVar = (l1a) etn.U(t7kVar, jSONObject, "visibility_action", jyrVar);
        List Y11 = etn.Y(t7kVar, jSONObject, "visibility_actions", jyrVar);
        bk9 bk9Var3 = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.WIDTH, jyrVar4);
        if (bk9Var3 == null) {
            bk9Var3 = ji9.i;
        }
        return new ei9(tc8Var, e, e2, ozbVar2, Y, Y2, op8Var, e4, Y3, Y4, wz8Var, e5, ozbVar4, ozbVar6, e8, e9, e10, Y5, bk9Var2, ozbVar8, e12, str, w79Var, ozbVar10, e14, ix8Var, S, ix8Var2, e15, e16, Y6, ozbVar12, Y7, qv9Var, Y8, sq8Var, un8Var, un8Var2, a0, str2, Y9, Y10, ozbVar13, l1aVar, Y11, bk9Var3);
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, ei9 ei9Var) {
        JSONObject jSONObject = new JSONObject();
        tc8 tc8Var = ei9Var.a;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.U9;
        jyr jyrVar2 = t6fVar.I1;
        jyr jyrVar3 = t6fVar.h3;
        jyr jyrVar4 = t6fVar.q7;
        etn.m0(t7kVar, jSONObject, "accessibility", tc8Var, t6fVar.H);
        szb szbVar = ei9Var.b;
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
        szb szbVar2 = ei9Var.c;
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
        e5f.g(t7kVar, jSONObject, "alpha", ei9Var.d);
        etn.n0(t7kVar, jSONObject, "animators", ei9Var.e, t6fVar.C1);
        etn.n0(t7kVar, jSONObject, C0479n3.g, ei9Var.f, t6fVar.O1);
        etn.m0(t7kVar, jSONObject, "border", ei9Var.g, t6fVar.U1);
        e5f.g(t7kVar, jSONObject, "column_span", ei9Var.h);
        etn.n0(t7kVar, jSONObject, "disappear_actions", ei9Var.i, t6fVar.Y2);
        etn.n0(t7kVar, jSONObject, "extensions", ei9Var.j, t6fVar.k3);
        etn.m0(t7kVar, jSONObject, "focus", ei9Var.k, t6fVar.L3);
        e5f.g(t7kVar, jSONObject, "font_family", ei9Var.l);
        e5f.g(t7kVar, jSONObject, "font_size", ei9Var.m);
        szb szbVar3 = ei9Var.n;
        if (szbVar3 != null) {
            Object b3 = szbVar3.b();
            try {
                if (szbVar3 instanceof pzb) {
                    jSONObject.put("font_size_unit", b3);
                } else {
                    jSONObject.put("font_size_unit", ((jk9) b3).a);
                }
            } catch (JSONException e3) {
                t7kVar.a().a(e3);
            }
        }
        e5f.g(t7kVar, jSONObject, "font_variation_settings", ei9Var.o);
        szb szbVar4 = ei9Var.p;
        if (szbVar4 != null) {
            Object b4 = szbVar4.b();
            try {
                if (szbVar4 instanceof pzb) {
                    jSONObject.put("font_weight", b4);
                } else {
                    jSONObject.put("font_weight", ((e09) b4).a);
                }
            } catch (JSONException e4) {
                t7kVar.a().a(e4);
            }
        }
        e5f.g(t7kVar, jSONObject, "font_weight_value", ei9Var.q);
        etn.n0(t7kVar, jSONObject, "functions", ei9Var.r, t6fVar.U3);
        etn.m0(t7kVar, jSONObject, CameraProperty.HEIGHT, ei9Var.s, jyrVar4);
        szb szbVar5 = ei9Var.t;
        kzj kzjVar = kzj.D;
        e5f.h(t7kVar, jSONObject, "hint_color", szbVar5, kzjVar);
        e5f.g(t7kVar, jSONObject, "hint_text", ei9Var.u);
        etn.l0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, ei9Var.v);
        etn.m0(t7kVar, jSONObject, "layout_provider", ei9Var.w, t6fVar.Y4);
        e5f.g(t7kVar, jSONObject, "letter_spacing", ei9Var.x);
        e5f.g(t7kVar, jSONObject, "line_height", ei9Var.y);
        etn.m0(t7kVar, jSONObject, "margins", ei9Var.z, jyrVar3);
        etn.n0(t7kVar, jSONObject, "options", ei9Var.A, t6fVar.V6);
        etn.m0(t7kVar, jSONObject, "paddings", ei9Var.B, jyrVar3);
        e5f.g(t7kVar, jSONObject, "reuse_id", ei9Var.C);
        e5f.g(t7kVar, jSONObject, "row_span", ei9Var.D);
        etn.n0(t7kVar, jSONObject, "selected_actions", ei9Var.E, t6fVar.t1);
        e5f.h(t7kVar, jSONObject, "text_color", ei9Var.F, kzjVar);
        etn.n0(t7kVar, jSONObject, "tooltips", ei9Var.G, t6fVar.n9);
        etn.m0(t7kVar, jSONObject, "transform", ei9Var.H, t6fVar.q9);
        etn.n0(t7kVar, jSONObject, "transformations", ei9Var.I, t6fVar.t9);
        etn.m0(t7kVar, jSONObject, "transition_change", ei9Var.J, t6fVar.d2);
        etn.m0(t7kVar, jSONObject, "transition_in", ei9Var.K, jyrVar2);
        etn.m0(t7kVar, jSONObject, "transition_out", ei9Var.L, jyrVar2);
        List list = ei9Var.M;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < size; i++) {
                jSONArray.put(((nw9) list.get(i)).a);
            }
            try {
                jSONObject.put("transition_triggers", jSONArray);
            } catch (JSONException e5) {
                t7kVar.a().a(e5);
            }
        }
        etn.l0(t7kVar, jSONObject, "type", "select");
        etn.l0(t7kVar, jSONObject, "value_variable", ei9Var.N);
        etn.n0(t7kVar, jSONObject, "variable_triggers", ei9Var.O, t6fVar.C9);
        etn.n0(t7kVar, jSONObject, "variables", ei9Var.P, t6fVar.I9);
        szb szbVar6 = ei9Var.Q;
        if (szbVar6 != null) {
            Object b5 = szbVar6.b();
            try {
                if (szbVar6 instanceof pzb) {
                    jSONObject.put("visibility", b5);
                } else {
                    jSONObject.put("visibility", ((k1a) b5).a);
                }
            } catch (JSONException e6) {
                t7kVar.a().a(e6);
            }
        }
        etn.m0(t7kVar, jSONObject, "visibility_action", ei9Var.R, jyrVar);
        etn.n0(t7kVar, jSONObject, "visibility_actions", ei9Var.S, jyrVar);
        etn.m0(t7kVar, jSONObject, CameraProperty.WIDTH, ei9Var.T, jyrVar4);
        return jSONObject;
    }
}
