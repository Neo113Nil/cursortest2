package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ev8 implements gip, py7 {
    public final t6f a;

    public ev8(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v52, types: [szb] */
    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final yu8 a(t7k t7kVar, JSONObject jSONObject) {
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.U9;
        jyr jyrVar2 = t6fVar.I1;
        jyr jyrVar3 = t6fVar.h3;
        jyr jyrVar4 = t6fVar.q7;
        tc8 tc8Var = (tc8) etn.U(t7kVar, jSONObject, "accessibility", t6fVar.H);
        tct tctVar = hv8.e;
        va8 va8Var = va8.x0;
        ns9 ns9Var = bcx.h;
        szb e = e5f.e(t7kVar, jSONObject, "alignment_horizontal", tctVar, va8Var, ns9Var, null);
        szb e2 = e5f.e(t7kVar, jSONObject, "alignment_vertical", hv8.f, va8.z0, ns9Var, null);
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        lc8 lc8Var = hv8.h;
        ozb ozbVar = hv8.a;
        ?? e3 = e5f.e(t7kVar, jSONObject, "alpha", ox8Var, kzjVar, lc8Var, ozbVar);
        ozb ozbVar2 = e3 == 0 ? ozbVar : e3;
        List Y = etn.Y(t7kVar, jSONObject, "animators", t6fVar.C1);
        List Y2 = etn.Y(t7kVar, jSONObject, C0479n3.g, t6fVar.O1);
        op8 op8Var = (op8) etn.U(t7kVar, jSONObject, "border", t6fVar.U1);
        ox8 ox8Var2 = vct.b;
        kzj kzjVar2 = kzj.F;
        szb e4 = e5f.e(t7kVar, jSONObject, "column_span", ox8Var2, kzjVar2, hv8.i, null);
        Object opt = jSONObject.opt("custom_props");
        Object obj = JSONObject.NULL;
        if (opt == obj) {
            opt = null;
        }
        if (opt == null) {
            opt = null;
        }
        JSONObject jSONObject2 = (JSONObject) opt;
        Object opt2 = jSONObject.opt("custom_type");
        if (opt2 == obj) {
            opt2 = null;
        }
        if (opt2 == null) {
            throw a8k.g("custom_type", jSONObject);
        }
        String str = (String) opt2;
        List Y3 = etn.Y(t7kVar, jSONObject, "disappear_actions", t6fVar.Y2);
        List Y4 = etn.Y(t7kVar, jSONObject, "extensions", t6fVar.k3);
        wz8 wz8Var = (wz8) etn.U(t7kVar, jSONObject, "focus", t6fVar.L3);
        List Y5 = etn.Y(t7kVar, jSONObject, "functions", t6fVar.U3);
        bk9 bk9Var = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.HEIGHT, jyrVar4);
        if (bk9Var == null) {
            bk9Var = hv8.b;
        }
        bk9 bk9Var2 = bk9Var;
        Object opt3 = jSONObject.opt(ConnectableDevice.KEY_ID);
        if (opt3 == obj) {
            opt3 = null;
        }
        String str2 = (String) (opt3 != null ? opt3 : null);
        List Y6 = etn.Y(t7kVar, jSONObject, "items", t6fVar.aa);
        w79 w79Var = (w79) etn.U(t7kVar, jSONObject, "layout_provider", t6fVar.Y4);
        ix8 ix8Var = (ix8) etn.U(t7kVar, jSONObject, "margins", jyrVar3);
        ix8 ix8Var2 = (ix8) etn.U(t7kVar, jSONObject, "paddings", jyrVar3);
        szb e5 = e5f.e(t7kVar, jSONObject, "reuse_id", vct.c, bcx.i, ns9Var, null);
        szb e6 = e5f.e(t7kVar, jSONObject, "row_span", ox8Var2, kzjVar2, hv8.j, null);
        List Y7 = etn.Y(t7kVar, jSONObject, "selected_actions", t6fVar.t1);
        List Y8 = etn.Y(t7kVar, jSONObject, "tooltips", t6fVar.n9);
        qv9 qv9Var = (qv9) etn.U(t7kVar, jSONObject, "transform", t6fVar.q9);
        List Y9 = etn.Y(t7kVar, jSONObject, "transformations", t6fVar.t9);
        sq8 sq8Var = (sq8) etn.U(t7kVar, jSONObject, "transition_change", t6fVar.d2);
        un8 un8Var = (un8) etn.U(t7kVar, jSONObject, "transition_in", jyrVar2);
        un8 un8Var2 = (un8) etn.U(t7kVar, jSONObject, "transition_out", jyrVar2);
        List a0 = etn.a0(t7kVar, jSONObject, "transition_triggers", hv8.k);
        List Y10 = etn.Y(t7kVar, jSONObject, "variable_triggers", t6fVar.C9);
        List Y11 = etn.Y(t7kVar, jSONObject, "variables", t6fVar.I9);
        tct tctVar2 = hv8.g;
        jx9 jx9Var = jx9.z;
        ozb ozbVar3 = hv8.c;
        ?? e7 = e5f.e(t7kVar, jSONObject, "visibility", tctVar2, jx9Var, ns9Var, ozbVar3);
        if (e7 != 0) {
            ozbVar3 = e7;
        }
        l1a l1aVar = (l1a) etn.U(t7kVar, jSONObject, "visibility_action", jyrVar);
        List Y12 = etn.Y(t7kVar, jSONObject, "visibility_actions", jyrVar);
        bk9 bk9Var3 = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.WIDTH, jyrVar4);
        if (bk9Var3 == null) {
            bk9Var3 = hv8.d;
        }
        return new yu8(tc8Var, e, e2, ozbVar2, Y, Y2, op8Var, e4, jSONObject2, str, Y3, Y4, wz8Var, Y5, bk9Var2, str2, Y6, w79Var, ix8Var, ix8Var2, e5, e6, Y7, Y8, qv9Var, Y9, sq8Var, un8Var, un8Var2, a0, Y10, Y11, ozbVar3, l1aVar, Y12, bk9Var3);
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, yu8 yu8Var) {
        JSONObject jSONObject = new JSONObject();
        tc8 tc8Var = yu8Var.a;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.U9;
        jyr jyrVar2 = t6fVar.I1;
        jyr jyrVar3 = t6fVar.h3;
        jyr jyrVar4 = t6fVar.q7;
        etn.m0(t7kVar, jSONObject, "accessibility", tc8Var, t6fVar.H);
        szb szbVar = yu8Var.b;
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
        szb szbVar2 = yu8Var.c;
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
        e5f.g(t7kVar, jSONObject, "alpha", yu8Var.d);
        etn.n0(t7kVar, jSONObject, "animators", yu8Var.e, t6fVar.C1);
        etn.n0(t7kVar, jSONObject, C0479n3.g, yu8Var.f, t6fVar.O1);
        etn.m0(t7kVar, jSONObject, "border", yu8Var.g, t6fVar.U1);
        e5f.g(t7kVar, jSONObject, "column_span", yu8Var.h);
        etn.l0(t7kVar, jSONObject, "custom_props", yu8Var.i);
        etn.l0(t7kVar, jSONObject, "custom_type", yu8Var.j);
        etn.n0(t7kVar, jSONObject, "disappear_actions", yu8Var.k, t6fVar.Y2);
        etn.n0(t7kVar, jSONObject, "extensions", yu8Var.l, t6fVar.k3);
        etn.m0(t7kVar, jSONObject, "focus", yu8Var.m, t6fVar.L3);
        etn.n0(t7kVar, jSONObject, "functions", yu8Var.n, t6fVar.U3);
        etn.m0(t7kVar, jSONObject, CameraProperty.HEIGHT, yu8Var.o, jyrVar4);
        etn.l0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, yu8Var.p);
        etn.n0(t7kVar, jSONObject, "items", yu8Var.q, t6fVar.aa);
        etn.m0(t7kVar, jSONObject, "layout_provider", yu8Var.r, t6fVar.Y4);
        etn.m0(t7kVar, jSONObject, "margins", yu8Var.s, jyrVar3);
        etn.m0(t7kVar, jSONObject, "paddings", yu8Var.t, jyrVar3);
        e5f.g(t7kVar, jSONObject, "reuse_id", yu8Var.u);
        e5f.g(t7kVar, jSONObject, "row_span", yu8Var.v);
        etn.n0(t7kVar, jSONObject, "selected_actions", yu8Var.w, t6fVar.t1);
        etn.n0(t7kVar, jSONObject, "tooltips", yu8Var.x, t6fVar.n9);
        etn.m0(t7kVar, jSONObject, "transform", yu8Var.y, t6fVar.q9);
        etn.n0(t7kVar, jSONObject, "transformations", yu8Var.z, t6fVar.t9);
        etn.m0(t7kVar, jSONObject, "transition_change", yu8Var.A, t6fVar.d2);
        etn.m0(t7kVar, jSONObject, "transition_in", yu8Var.B, jyrVar2);
        etn.m0(t7kVar, jSONObject, "transition_out", yu8Var.C, jyrVar2);
        List list = yu8Var.D;
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
        etn.l0(t7kVar, jSONObject, "type", "custom");
        etn.n0(t7kVar, jSONObject, "variable_triggers", yu8Var.E, t6fVar.C9);
        etn.n0(t7kVar, jSONObject, "variables", yu8Var.F, t6fVar.I9);
        szb szbVar3 = yu8Var.G;
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
        etn.m0(t7kVar, jSONObject, "visibility_action", yu8Var.H, jyrVar);
        etn.n0(t7kVar, jSONObject, "visibility_actions", yu8Var.I, jyrVar);
        etn.m0(t7kVar, jSONObject, CameraProperty.WIDTH, yu8Var.J, jyrVar4);
        return jSONObject;
    }
}
