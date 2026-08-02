package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class uz9 implements gip, py7 {
    public final t6f a;

    public uz9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v39, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v45, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v48, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v5, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v53, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v70, types: [szb] */
    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final pz9 a(t7k t7kVar, JSONObject jSONObject) {
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.U9;
        jyr jyrVar2 = t6fVar.I1;
        jyr jyrVar3 = t6fVar.h3;
        jyr jyrVar4 = t6fVar.q7;
        jyr jyrVar5 = t6fVar.t1;
        tc8 tc8Var = (tc8) etn.U(t7kVar, jSONObject, "accessibility", t6fVar.H);
        tct tctVar = xz9.j;
        va8 va8Var = va8.x0;
        ns9 ns9Var = bcx.h;
        szb e = e5f.e(t7kVar, jSONObject, "alignment_horizontal", tctVar, va8Var, ns9Var, null);
        szb e2 = e5f.e(t7kVar, jSONObject, "alignment_vertical", xz9.k, va8.z0, ns9Var, null);
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        ns9 ns9Var2 = xz9.n;
        ozb ozbVar = xz9.a;
        ?? e3 = e5f.e(t7kVar, jSONObject, "alpha", ox8Var, kzjVar, ns9Var2, ozbVar);
        ozb ozbVar2 = e3 == 0 ? ozbVar : e3;
        List Y = etn.Y(t7kVar, jSONObject, "animators", t6fVar.C1);
        do8 do8Var = (do8) etn.U(t7kVar, jSONObject, "aspect", t6fVar.L1);
        ox8 ox8Var2 = vct.a;
        kzj kzjVar2 = kzj.B;
        ozb ozbVar3 = xz9.b;
        ?? e4 = e5f.e(t7kVar, jSONObject, "autostart", ox8Var2, kzjVar2, ns9Var, ozbVar3);
        ozb ozbVar4 = e4 == 0 ? ozbVar3 : e4;
        List Y2 = etn.Y(t7kVar, jSONObject, C0479n3.g, t6fVar.O1);
        op8 op8Var = (op8) etn.U(t7kVar, jSONObject, "border", t6fVar.U1);
        List Y3 = etn.Y(t7kVar, jSONObject, "buffering_actions", jyrVar5);
        ox8 ox8Var3 = vct.b;
        kzj kzjVar3 = kzj.F;
        szb e5 = e5f.e(t7kVar, jSONObject, "column_span", ox8Var3, kzjVar3, xz9.o, null);
        List Y4 = etn.Y(t7kVar, jSONObject, "disappear_actions", t6fVar.Y2);
        Object opt = jSONObject.opt("elapsed_time_variable");
        Object obj = JSONObject.NULL;
        if (opt == obj) {
            opt = null;
        }
        if (opt == null) {
            opt = null;
        }
        String str = (String) opt;
        List Y5 = etn.Y(t7kVar, jSONObject, "end_actions", jyrVar5);
        List Y6 = etn.Y(t7kVar, jSONObject, "extensions", t6fVar.k3);
        List Y7 = etn.Y(t7kVar, jSONObject, "fatal_actions", jyrVar5);
        wz8 wz8Var = (wz8) etn.U(t7kVar, jSONObject, "focus", t6fVar.L3);
        List Y8 = etn.Y(t7kVar, jSONObject, "functions", t6fVar.U3);
        bk9 bk9Var = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.HEIGHT, jyrVar4);
        if (bk9Var == null) {
            bk9Var = xz9.c;
        }
        bk9 bk9Var2 = bk9Var;
        Object opt2 = jSONObject.opt(ConnectableDevice.KEY_ID);
        if (opt2 == obj) {
            opt2 = null;
        }
        String str2 = (String) (opt2 != null ? opt2 : null);
        w79 w79Var = (w79) etn.U(t7kVar, jSONObject, "layout_provider", t6fVar.Y4);
        ix8 ix8Var = (ix8) etn.U(t7kVar, jSONObject, "margins", jyrVar3);
        ozb ozbVar5 = xz9.d;
        ?? e6 = e5f.e(t7kVar, jSONObject, "muted", ox8Var2, kzjVar2, ns9Var, ozbVar5);
        ozb ozbVar6 = e6 == 0 ? ozbVar5 : e6;
        ix8 ix8Var2 = (ix8) etn.U(t7kVar, jSONObject, "paddings", jyrVar3);
        List Y9 = etn.Y(t7kVar, jSONObject, "pause_actions", jyrVar5);
        px8 px8Var = vct.h;
        s3f s3fVar = bcx.i;
        szb e7 = e5f.e(t7kVar, jSONObject, "player_settings_payload", px8Var, s3fVar, ns9Var, null);
        ozb ozbVar7 = xz9.e;
        ?? e8 = e5f.e(t7kVar, jSONObject, "preload_required", ox8Var2, kzjVar2, ns9Var, ozbVar7);
        ozb ozbVar8 = e8 == 0 ? ozbVar7 : e8;
        ox8 ox8Var4 = vct.c;
        szb e9 = e5f.e(t7kVar, jSONObject, "preview", ox8Var4, s3fVar, ns9Var, null);
        ozb ozbVar9 = xz9.f;
        ?? e10 = e5f.e(t7kVar, jSONObject, "repeatable", ox8Var2, kzjVar2, ns9Var, ozbVar9);
        ozb ozbVar10 = e10 == 0 ? ozbVar9 : e10;
        List Y10 = etn.Y(t7kVar, jSONObject, "resume_actions", jyrVar5);
        szb e11 = e5f.e(t7kVar, jSONObject, "reuse_id", ox8Var4, s3fVar, ns9Var, null);
        szb e12 = e5f.e(t7kVar, jSONObject, "row_span", ox8Var3, kzjVar3, xz9.p, null);
        tct tctVar2 = xz9.l;
        jx9 jx9Var = jx9.x;
        ozb ozbVar11 = xz9.g;
        ?? e13 = e5f.e(t7kVar, jSONObject, "scale", tctVar2, jx9Var, ns9Var, ozbVar11);
        ozb ozbVar12 = e13 == 0 ? ozbVar11 : e13;
        List Y11 = etn.Y(t7kVar, jSONObject, "selected_actions", jyrVar5);
        List Y12 = etn.Y(t7kVar, jSONObject, "tooltips", t6fVar.n9);
        qv9 qv9Var = (qv9) etn.U(t7kVar, jSONObject, "transform", t6fVar.q9);
        List Y13 = etn.Y(t7kVar, jSONObject, "transformations", t6fVar.t9);
        sq8 sq8Var = (sq8) etn.U(t7kVar, jSONObject, "transition_change", t6fVar.d2);
        un8 un8Var = (un8) etn.U(t7kVar, jSONObject, "transition_in", jyrVar2);
        un8 un8Var2 = (un8) etn.U(t7kVar, jSONObject, "transition_out", jyrVar2);
        List a0 = etn.a0(t7kVar, jSONObject, "transition_triggers", xz9.q);
        List Y14 = etn.Y(t7kVar, jSONObject, "variable_triggers", t6fVar.C9);
        List Y15 = etn.Y(t7kVar, jSONObject, "variables", t6fVar.I9);
        List Y16 = etn.Y(t7kVar, jSONObject, "video_sources", t6fVar.L9);
        tct tctVar3 = xz9.m;
        jx9 jx9Var2 = jx9.z;
        ozb ozbVar13 = xz9.h;
        ?? e14 = e5f.e(t7kVar, jSONObject, "visibility", tctVar3, jx9Var2, ns9Var, ozbVar13);
        if (e14 != 0) {
            ozbVar13 = e14;
        }
        l1a l1aVar = (l1a) etn.U(t7kVar, jSONObject, "visibility_action", jyrVar);
        List Y17 = etn.Y(t7kVar, jSONObject, "visibility_actions", jyrVar);
        bk9 bk9Var3 = (bk9) etn.U(t7kVar, jSONObject, CameraProperty.WIDTH, jyrVar4);
        if (bk9Var3 == null) {
            bk9Var3 = xz9.i;
        }
        return new pz9(tc8Var, e, e2, ozbVar2, Y, do8Var, ozbVar4, Y2, op8Var, Y3, e5, Y4, str, Y5, Y6, Y7, wz8Var, Y8, bk9Var2, str2, w79Var, ix8Var, ozbVar6, ix8Var2, Y9, e7, ozbVar8, e9, ozbVar10, Y10, e11, e12, ozbVar12, Y11, Y12, qv9Var, Y13, sq8Var, un8Var, un8Var2, a0, Y14, Y15, Y16, ozbVar13, l1aVar, Y17, bk9Var3);
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, pz9 pz9Var) {
        JSONObject jSONObject = new JSONObject();
        tc8 tc8Var = pz9Var.a;
        t6f t6fVar = this.a;
        jyr jyrVar = t6fVar.U9;
        jyr jyrVar2 = t6fVar.I1;
        jyr jyrVar3 = t6fVar.h3;
        jyr jyrVar4 = t6fVar.q7;
        jyr jyrVar5 = t6fVar.t1;
        etn.m0(t7kVar, jSONObject, "accessibility", tc8Var, t6fVar.H);
        szb szbVar = pz9Var.b;
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
        szb szbVar2 = pz9Var.c;
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
        e5f.g(t7kVar, jSONObject, "alpha", pz9Var.d);
        etn.n0(t7kVar, jSONObject, "animators", pz9Var.e, t6fVar.C1);
        etn.m0(t7kVar, jSONObject, "aspect", pz9Var.f, t6fVar.L1);
        e5f.g(t7kVar, jSONObject, "autostart", pz9Var.g);
        etn.n0(t7kVar, jSONObject, C0479n3.g, pz9Var.h, t6fVar.O1);
        etn.m0(t7kVar, jSONObject, "border", pz9Var.i, t6fVar.U1);
        etn.n0(t7kVar, jSONObject, "buffering_actions", pz9Var.j, jyrVar5);
        e5f.g(t7kVar, jSONObject, "column_span", pz9Var.k);
        etn.n0(t7kVar, jSONObject, "disappear_actions", pz9Var.l, t6fVar.Y2);
        etn.l0(t7kVar, jSONObject, "elapsed_time_variable", pz9Var.m);
        etn.n0(t7kVar, jSONObject, "end_actions", pz9Var.n, jyrVar5);
        etn.n0(t7kVar, jSONObject, "extensions", pz9Var.o, t6fVar.k3);
        etn.n0(t7kVar, jSONObject, "fatal_actions", pz9Var.p, jyrVar5);
        etn.m0(t7kVar, jSONObject, "focus", pz9Var.q, t6fVar.L3);
        etn.n0(t7kVar, jSONObject, "functions", pz9Var.r, t6fVar.U3);
        etn.m0(t7kVar, jSONObject, CameraProperty.HEIGHT, pz9Var.s, jyrVar4);
        etn.l0(t7kVar, jSONObject, ConnectableDevice.KEY_ID, pz9Var.t);
        etn.m0(t7kVar, jSONObject, "layout_provider", pz9Var.u, t6fVar.Y4);
        etn.m0(t7kVar, jSONObject, "margins", pz9Var.v, jyrVar3);
        e5f.g(t7kVar, jSONObject, "muted", pz9Var.w);
        etn.m0(t7kVar, jSONObject, "paddings", pz9Var.x, jyrVar3);
        etn.n0(t7kVar, jSONObject, "pause_actions", pz9Var.y, jyrVar5);
        e5f.g(t7kVar, jSONObject, "player_settings_payload", pz9Var.z);
        e5f.g(t7kVar, jSONObject, "preload_required", pz9Var.A);
        e5f.g(t7kVar, jSONObject, "preview", pz9Var.B);
        e5f.g(t7kVar, jSONObject, "repeatable", pz9Var.C);
        etn.n0(t7kVar, jSONObject, "resume_actions", pz9Var.D, jyrVar5);
        e5f.g(t7kVar, jSONObject, "reuse_id", pz9Var.E);
        e5f.g(t7kVar, jSONObject, "row_span", pz9Var.F);
        szb szbVar3 = pz9Var.G;
        if (szbVar3 != null) {
            Object b3 = szbVar3.b();
            try {
                if (szbVar3 instanceof pzb) {
                    jSONObject.put("scale", b3);
                } else {
                    jSONObject.put("scale", ((a0a) b3).a);
                }
            } catch (JSONException e3) {
                t7kVar.a().a(e3);
            }
        }
        etn.n0(t7kVar, jSONObject, "selected_actions", pz9Var.H, jyrVar5);
        etn.n0(t7kVar, jSONObject, "tooltips", pz9Var.I, t6fVar.n9);
        etn.m0(t7kVar, jSONObject, "transform", pz9Var.J, t6fVar.q9);
        etn.n0(t7kVar, jSONObject, "transformations", pz9Var.K, t6fVar.t9);
        etn.m0(t7kVar, jSONObject, "transition_change", pz9Var.L, t6fVar.d2);
        etn.m0(t7kVar, jSONObject, "transition_in", pz9Var.M, jyrVar2);
        etn.m0(t7kVar, jSONObject, "transition_out", pz9Var.N, jyrVar2);
        List list = pz9Var.O;
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
        etn.l0(t7kVar, jSONObject, "type", "video");
        etn.n0(t7kVar, jSONObject, "variable_triggers", pz9Var.P, t6fVar.C9);
        etn.n0(t7kVar, jSONObject, "variables", pz9Var.Q, t6fVar.I9);
        etn.n0(t7kVar, jSONObject, "video_sources", pz9Var.R, t6fVar.L9);
        szb szbVar4 = pz9Var.S;
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
        etn.m0(t7kVar, jSONObject, "visibility_action", pz9Var.T, jyrVar);
        etn.n0(t7kVar, jSONObject, "visibility_actions", pz9Var.U, jyrVar);
        etn.m0(t7kVar, jSONObject, CameraProperty.WIDTH, pz9Var.V, jyrVar4);
        return jSONObject;
    }
}
