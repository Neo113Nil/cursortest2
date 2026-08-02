package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class kl9 implements gip, py7 {
    public final t6f a;

    public kl9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v25, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v31, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v33, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v4, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v79, types: [szb] */
    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final zk9 a(t7k t7kVar, JSONObject jSONObject) {
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.U9;
        jyr jyrVar2 = t6fVar.I1;
        jyr jyrVar3 = t6fVar.z7;
        jyr jyrVar4 = t6fVar.h3;
        jyr jyrVar5 = t6fVar.q7;
        jyr jyrVar6 = t6fVar.e3;
        jyr jyrVar7 = t6fVar.H;
        tc8 tc8Var = (tc8) etn.U(t7kVar, jSONObject, "accessibility", jyrVar7);
        tct tctVar = nl9.h;
        va8 va8Var = va8.x0;
        ns9 ns9Var = bcx.h;
        szb e = e5f.e(t7kVar, jSONObject, "alignment_horizontal", tctVar, va8Var, ns9Var, null);
        szb e2 = e5f.e(t7kVar, jSONObject, "alignment_vertical", nl9.i, va8.z0, ns9Var, null);
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        mb9 mb9Var = nl9.k;
        ozb ozbVar = nl9.a;
        ?? e3 = e5f.e(t7kVar, jSONObject, "alpha", ox8Var, kzjVar, mb9Var, ozbVar);
        ozb ozbVar2 = e3 == 0 ? ozbVar : e3;
        List Y = etn.Y(t7kVar, jSONObject, "animators", t6fVar.C1);
        List Y2 = etn.Y(t7kVar, jSONObject, C0479n3.g, t6fVar.O1);
        op8 op8Var = (op8) etn.U(t7kVar, jSONObject, "border", t6fVar.U1);
        ox8 ox8Var2 = vct.b;
        kzj kzjVar2 = kzj.F;
        szb e4 = e5f.e(t7kVar, jSONObject, "column_span", ox8Var2, kzjVar2, nl9.l, null);
        List Y3 = etn.Y(t7kVar, jSONObject, "disappear_actions", t6fVar.Y2);
        List Y4 = etn.Y(t7kVar, jSONObject, "extensions", t6fVar.k3);
        wz8 wz8Var = (wz8) etn.U(t7kVar, jSONObject, "focus", t6fVar.L3);
        List Y5 = etn.Y(t7kVar, jSONObject, "functions", t6fVar.U3);
        bk9 bk9Var = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.HEIGHT, jyrVar5);
        if (bk9Var == null) {
            bk9Var = nl9.b;
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
        ox8 ox8Var3 = vct.a;
        kzj kzjVar3 = kzj.B;
        ozb ozbVar3 = nl9.c;
        ?? e5 = e5f.e(t7kVar, jSONObject, "is_enabled", ox8Var3, kzjVar3, ns9Var, ozbVar3);
        ozb ozbVar4 = e5 == 0 ? ozbVar3 : e5;
        w79 w79Var = (w79) etn.U(t7kVar, jSONObject, "layout_provider", t6fVar.Y4);
        ix8 ix8Var = (ix8) etn.U(t7kVar, jSONObject, "margins", jyrVar4);
        ozb ozbVar5 = nl9.d;
        ?? e6 = e5f.e(t7kVar, jSONObject, "max_value", ox8Var2, kzjVar2, ns9Var, ozbVar5);
        ozb ozbVar6 = e6 == 0 ? ozbVar5 : e6;
        ozb ozbVar7 = nl9.e;
        ?? e7 = e5f.e(t7kVar, jSONObject, "min_value", ox8Var2, kzjVar2, ns9Var, ozbVar7);
        ozb ozbVar8 = e7 == 0 ? ozbVar7 : e7;
        ix8 ix8Var2 = (ix8) etn.U(t7kVar, jSONObject, "paddings", jyrVar4);
        List Y6 = etn.Y(t7kVar, jSONObject, "ranges", t6fVar.C7);
        szb e8 = e5f.e(t7kVar, jSONObject, "reuse_id", vct.c, bcx.i, ns9Var, null);
        szb e9 = e5f.e(t7kVar, jSONObject, "row_span", ox8Var2, kzjVar2, nl9.m, null);
        tc8 tc8Var2 = (tc8) etn.U(t7kVar, jSONObject, "secondary_value_accessibility", jyrVar7);
        List Y7 = etn.Y(t7kVar, jSONObject, "selected_actions", t6fVar.t1);
        dx8 dx8Var = (dx8) etn.U(t7kVar, jSONObject, "thumb_secondary_style", jyrVar6);
        yk9 yk9Var = (yk9) etn.U(t7kVar, jSONObject, "thumb_secondary_text_style", jyrVar3);
        Object opt2 = jSONObject.opt("thumb_secondary_value_variable");
        if (opt2 == obj) {
            opt2 = null;
        }
        if (opt2 == null) {
            opt2 = null;
        }
        String str2 = (String) opt2;
        dx8 dx8Var2 = (dx8) etn.O(t7kVar, jSONObject, "thumb_style", jyrVar6);
        yk9 yk9Var2 = (yk9) etn.U(t7kVar, jSONObject, "thumb_text_style", jyrVar3);
        Object opt3 = jSONObject.opt("thumb_value_variable");
        if (opt3 == obj) {
            opt3 = null;
        }
        String str3 = (String) (opt3 != null ? opt3 : null);
        dx8 dx8Var3 = (dx8) etn.U(t7kVar, jSONObject, "tick_mark_active_style", jyrVar6);
        dx8 dx8Var4 = (dx8) etn.U(t7kVar, jSONObject, "tick_mark_inactive_style", jyrVar6);
        List Y8 = etn.Y(t7kVar, jSONObject, "tooltips", t6fVar.n9);
        dx8 dx8Var5 = (dx8) etn.O(t7kVar, jSONObject, "track_active_style", jyrVar6);
        dx8 dx8Var6 = (dx8) etn.O(t7kVar, jSONObject, "track_inactive_style", jyrVar6);
        qv9 qv9Var = (qv9) etn.U(t7kVar, jSONObject, "transform", t6fVar.q9);
        List Y9 = etn.Y(t7kVar, jSONObject, "transformations", t6fVar.t9);
        sq8 sq8Var = (sq8) etn.U(t7kVar, jSONObject, "transition_change", t6fVar.d2);
        un8 un8Var = (un8) etn.U(t7kVar, jSONObject, "transition_in", jyrVar2);
        un8 un8Var2 = (un8) etn.U(t7kVar, jSONObject, "transition_out", jyrVar2);
        List a0 = etn.a0(t7kVar, jSONObject, "transition_triggers", nl9.n);
        List Y10 = etn.Y(t7kVar, jSONObject, "variable_triggers", t6fVar.C9);
        List Y11 = etn.Y(t7kVar, jSONObject, "variables", t6fVar.I9);
        tct tctVar2 = nl9.j;
        jx9 jx9Var = jx9.z;
        ozb ozbVar9 = nl9.f;
        ?? e10 = e5f.e(t7kVar, jSONObject, "visibility", tctVar2, jx9Var, ns9Var, ozbVar9);
        if (e10 != 0) {
            ozbVar9 = e10;
        }
        l1a l1aVar = (l1a) etn.U(t7kVar, jSONObject, "visibility_action", jyrVar);
        List Y12 = etn.Y(t7kVar, jSONObject, "visibility_actions", jyrVar);
        bk9 bk9Var3 = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.WIDTH, jyrVar5);
        if (bk9Var3 == null) {
            bk9Var3 = nl9.g;
        }
        return new zk9(tc8Var, e, e2, ozbVar2, Y, Y2, op8Var, e4, Y3, Y4, wz8Var, Y5, bk9Var2, str, ozbVar4, w79Var, ix8Var, ozbVar6, ozbVar8, ix8Var2, Y6, e8, e9, tc8Var2, Y7, dx8Var, yk9Var, str2, dx8Var2, yk9Var2, str3, dx8Var3, dx8Var4, Y8, dx8Var5, dx8Var6, qv9Var, Y9, sq8Var, un8Var, un8Var2, a0, Y10, Y11, ozbVar9, l1aVar, Y12, bk9Var3);
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, zk9 zk9Var) {
        JSONObject jSONObject = new JSONObject();
        tc8 tc8Var = zk9Var.a;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.U9;
        jyr jyrVar2 = t6fVar.I1;
        jyr jyrVar3 = t6fVar.z7;
        jyr jyrVar4 = t6fVar.h3;
        jyr jyrVar5 = t6fVar.q7;
        jyr jyrVar6 = t6fVar.e3;
        jyr jyrVar7 = t6fVar.H;
        etn.m0(t7kVar, jSONObject, "accessibility", tc8Var, jyrVar7);
        szb szbVar = zk9Var.b;
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
        szb szbVar2 = zk9Var.c;
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
        e5f.g(t7kVar, jSONObject, "alpha", zk9Var.d);
        etn.n0(t7kVar, jSONObject, "animators", zk9Var.e, t6fVar.C1);
        etn.n0(t7kVar, jSONObject, C0479n3.g, zk9Var.f, t6fVar.O1);
        etn.m0(t7kVar, jSONObject, "border", zk9Var.g, t6fVar.U1);
        e5f.g(t7kVar, jSONObject, "column_span", zk9Var.h);
        etn.n0(t7kVar, jSONObject, "disappear_actions", zk9Var.i, t6fVar.Y2);
        etn.n0(t7kVar, jSONObject, "extensions", zk9Var.j, t6fVar.k3);
        etn.m0(t7kVar, jSONObject, "focus", zk9Var.k, t6fVar.L3);
        etn.n0(t7kVar, jSONObject, "functions", zk9Var.l, t6fVar.U3);
        etn.m0(t7kVar, jSONObject, CameraProperty.HEIGHT, zk9Var.m, jyrVar5);
        etn.l0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, zk9Var.n);
        e5f.g(t7kVar, jSONObject, "is_enabled", zk9Var.o);
        etn.m0(t7kVar, jSONObject, "layout_provider", zk9Var.p, t6fVar.Y4);
        etn.m0(t7kVar, jSONObject, "margins", zk9Var.q, jyrVar4);
        e5f.g(t7kVar, jSONObject, "max_value", zk9Var.r);
        e5f.g(t7kVar, jSONObject, "min_value", zk9Var.s);
        etn.m0(t7kVar, jSONObject, "paddings", zk9Var.t, jyrVar4);
        etn.n0(t7kVar, jSONObject, "ranges", zk9Var.u, t6fVar.C7);
        e5f.g(t7kVar, jSONObject, "reuse_id", zk9Var.v);
        e5f.g(t7kVar, jSONObject, "row_span", zk9Var.w);
        etn.m0(t7kVar, jSONObject, "secondary_value_accessibility", zk9Var.x, jyrVar7);
        etn.n0(t7kVar, jSONObject, "selected_actions", zk9Var.y, t6fVar.t1);
        etn.m0(t7kVar, jSONObject, "thumb_secondary_style", zk9Var.z, jyrVar6);
        etn.m0(t7kVar, jSONObject, "thumb_secondary_text_style", zk9Var.A, jyrVar3);
        etn.l0(t7kVar, jSONObject, "thumb_secondary_value_variable", zk9Var.B);
        etn.m0(t7kVar, jSONObject, "thumb_style", zk9Var.C, jyrVar6);
        etn.m0(t7kVar, jSONObject, "thumb_text_style", zk9Var.D, jyrVar3);
        etn.l0(t7kVar, jSONObject, "thumb_value_variable", zk9Var.E);
        etn.m0(t7kVar, jSONObject, "tick_mark_active_style", zk9Var.F, jyrVar6);
        etn.m0(t7kVar, jSONObject, "tick_mark_inactive_style", zk9Var.G, jyrVar6);
        etn.n0(t7kVar, jSONObject, "tooltips", zk9Var.H, t6fVar.n9);
        etn.m0(t7kVar, jSONObject, "track_active_style", zk9Var.I, jyrVar6);
        etn.m0(t7kVar, jSONObject, "track_inactive_style", zk9Var.J, jyrVar6);
        etn.m0(t7kVar, jSONObject, "transform", zk9Var.K, t6fVar.q9);
        etn.n0(t7kVar, jSONObject, "transformations", zk9Var.L, t6fVar.t9);
        etn.m0(t7kVar, jSONObject, "transition_change", zk9Var.M, t6fVar.d2);
        etn.m0(t7kVar, jSONObject, "transition_in", zk9Var.N, jyrVar2);
        etn.m0(t7kVar, jSONObject, "transition_out", zk9Var.O, jyrVar2);
        List list = zk9Var.P;
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
        etn.l0(t7kVar, jSONObject, "type", "slider");
        etn.n0(t7kVar, jSONObject, "variable_triggers", zk9Var.Q, t6fVar.C9);
        etn.n0(t7kVar, jSONObject, "variables", zk9Var.R, t6fVar.I9);
        szb szbVar3 = zk9Var.S;
        if (szbVar3 != null) {
            Object b3 = szbVar3.b();
            try {
                if (szbVar3 instanceof pzb) {
                    jSONObject.put("visibility", b3);
                } else {
                    jSONObject.put("visibility", ((k1a) b3).a);
                }
            } catch (JSONException e4) {
                t7kVar.a().a(e4);
            }
        }
        etn.m0(t7kVar, jSONObject, "visibility_action", zk9Var.T, jyrVar);
        etn.n0(t7kVar, jSONObject, "visibility_actions", zk9Var.U, jyrVar);
        etn.m0(t7kVar, jSONObject, CameraProperty.WIDTH, zk9Var.V, jyrVar5);
        return jSONObject;
    }
}
