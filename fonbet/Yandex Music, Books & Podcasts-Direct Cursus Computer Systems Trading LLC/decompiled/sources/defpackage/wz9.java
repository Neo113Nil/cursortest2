package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wz9 implements u8s {
    public final t6f a;

    public wz9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v36, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v42, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v45, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v5, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v50, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v67, types: [szb] */
    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final pz9 a(t7k t7kVar, k0a k0aVar, JSONObject jSONObject) {
        c9c c9cVar = k0aVar.a;
        t6f t6fVar = this.a;
        tc8 tc8Var = (tc8) h4a.K(t7kVar, c9cVar, jSONObject, "accessibility", t6fVar.J, t6fVar.H);
        szb O = h4a.O(t7kVar, k0aVar.b, jSONObject, "alignment_horizontal", xz9.j, va8.x0);
        szb O2 = h4a.O(t7kVar, k0aVar.c, jSONObject, "alignment_vertical", xz9.k, va8.z0);
        c9c c9cVar2 = k0aVar.d;
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        ns9 ns9Var = xz9.n;
        ozb ozbVar = xz9.a;
        ?? R = h4a.R(t7kVar, c9cVar2, jSONObject, "alpha", ox8Var, kzjVar, ns9Var, ozbVar);
        if (R != 0) {
            ozbVar = R;
        }
        List V = h4a.V(t7kVar, k0aVar.e, jSONObject, "animators", t6fVar.E1, t6fVar.C1);
        do8 do8Var = (do8) h4a.K(t7kVar, k0aVar.f, jSONObject, "aspect", t6fVar.N1, t6fVar.L1);
        c9c c9cVar3 = k0aVar.g;
        ox8 ox8Var2 = vct.a;
        kzj kzjVar2 = kzj.B;
        ozb ozbVar2 = xz9.b;
        ?? P = h4a.P(t7kVar, c9cVar3, jSONObject, "autostart", ox8Var2, kzjVar2, ozbVar2);
        ozb ozbVar3 = P == 0 ? ozbVar2 : P;
        List V2 = h4a.V(t7kVar, k0aVar.h, jSONObject, C0479n3.g, t6fVar.Q1, t6fVar.O1);
        op8 op8Var = (op8) h4a.K(t7kVar, k0aVar.i, jSONObject, "border", t6fVar.W1, t6fVar.U1);
        List V3 = h4a.V(t7kVar, k0aVar.j, jSONObject, "buffering_actions", t6fVar.v1, t6fVar.t1);
        c9c c9cVar4 = k0aVar.k;
        ox8 ox8Var3 = vct.b;
        kzj kzjVar3 = kzj.F;
        szb Q = h4a.Q(t7kVar, c9cVar4, jSONObject, "column_span", ox8Var3, kzjVar3, xz9.o);
        List V4 = h4a.V(t7kVar, k0aVar.l, jSONObject, "disappear_actions", t6fVar.a3, t6fVar.Y2);
        c9c c9cVar5 = k0aVar.m;
        s3f s3fVar = bcx.i;
        String str = (String) h4a.L(c9cVar5, t7kVar, "elapsed_time_variable", s3fVar, jSONObject);
        List V5 = h4a.V(t7kVar, k0aVar.n, jSONObject, "end_actions", t6fVar.v1, t6fVar.t1);
        List V6 = h4a.V(t7kVar, k0aVar.o, jSONObject, "extensions", t6fVar.m3, t6fVar.k3);
        List V7 = h4a.V(t7kVar, k0aVar.p, jSONObject, "fatal_actions", t6fVar.v1, t6fVar.t1);
        wz8 wz8Var = (wz8) h4a.K(t7kVar, k0aVar.q, jSONObject, "focus", t6fVar.N3, t6fVar.L3);
        List V8 = h4a.V(t7kVar, k0aVar.r, jSONObject, "functions", t6fVar.W3, t6fVar.U3);
        bk9 bk9Var = (bk9) h4a.K(t7kVar, k0aVar.s, jSONObject, CameraProperty.HEIGHT, t6fVar.s7, t6fVar.q7);
        if (bk9Var == null) {
            bk9Var = xz9.c;
        }
        bk9 bk9Var2 = bk9Var;
        String str2 = (String) h4a.L(k0aVar.t, t7kVar, ConnectableDevice.KEY_ID, s3fVar, jSONObject);
        w79 w79Var = (w79) h4a.K(t7kVar, k0aVar.u, jSONObject, "layout_provider", t6fVar.a5, t6fVar.Y4);
        ix8 ix8Var = (ix8) h4a.K(t7kVar, k0aVar.v, jSONObject, "margins", t6fVar.j3, t6fVar.h3);
        c9c c9cVar6 = k0aVar.w;
        ozb ozbVar4 = xz9.d;
        ?? P2 = h4a.P(t7kVar, c9cVar6, jSONObject, "muted", ox8Var2, kzjVar2, ozbVar4);
        ozb ozbVar5 = P2 == 0 ? ozbVar4 : P2;
        ix8 ix8Var2 = (ix8) h4a.K(t7kVar, k0aVar.x, jSONObject, "paddings", t6fVar.j3, t6fVar.h3);
        List V9 = h4a.V(t7kVar, k0aVar.y, jSONObject, "pause_actions", t6fVar.v1, t6fVar.t1);
        szb N = h4a.N(t7kVar, k0aVar.z, jSONObject, "player_settings_payload", vct.h);
        c9c c9cVar7 = k0aVar.A;
        ozb ozbVar6 = xz9.e;
        ?? P3 = h4a.P(t7kVar, c9cVar7, jSONObject, "preload_required", ox8Var2, kzjVar2, ozbVar6);
        ozb ozbVar7 = P3 == 0 ? ozbVar6 : P3;
        c9c c9cVar8 = k0aVar.B;
        ox8 ox8Var4 = vct.c;
        szb N2 = h4a.N(t7kVar, c9cVar8, jSONObject, "preview", ox8Var4);
        c9c c9cVar9 = k0aVar.C;
        ozb ozbVar8 = xz9.f;
        ozb ozbVar9 = ozbVar;
        ?? P4 = h4a.P(t7kVar, c9cVar9, jSONObject, "repeatable", ox8Var2, kzjVar2, ozbVar8);
        ozb ozbVar10 = P4 == 0 ? ozbVar8 : P4;
        List V10 = h4a.V(t7kVar, k0aVar.D, jSONObject, "resume_actions", t6fVar.v1, t6fVar.t1);
        szb N3 = h4a.N(t7kVar, k0aVar.E, jSONObject, "reuse_id", ox8Var4);
        szb Q2 = h4a.Q(t7kVar, k0aVar.F, jSONObject, "row_span", ox8Var3, kzjVar3, xz9.p);
        c9c c9cVar10 = k0aVar.G;
        tct tctVar = xz9.l;
        jx9 jx9Var = jx9.x;
        ozb ozbVar11 = xz9.g;
        ?? P5 = h4a.P(t7kVar, c9cVar10, jSONObject, "scale", tctVar, jx9Var, ozbVar11);
        ozb ozbVar12 = P5 == 0 ? ozbVar11 : P5;
        List V11 = h4a.V(t7kVar, k0aVar.H, jSONObject, "selected_actions", t6fVar.v1, t6fVar.t1);
        List V12 = h4a.V(t7kVar, k0aVar.I, jSONObject, "tooltips", t6fVar.p9, t6fVar.n9);
        qv9 qv9Var = (qv9) h4a.K(t7kVar, k0aVar.J, jSONObject, "transform", t6fVar.s9, t6fVar.q9);
        List V13 = h4a.V(t7kVar, k0aVar.K, jSONObject, "transformations", t6fVar.v9, t6fVar.t9);
        sq8 sq8Var = (sq8) h4a.K(t7kVar, k0aVar.L, jSONObject, "transition_change", t6fVar.f2, t6fVar.d2);
        un8 un8Var = (un8) h4a.K(t7kVar, k0aVar.M, jSONObject, "transition_in", t6fVar.K1, t6fVar.I1);
        un8 un8Var2 = (un8) h4a.K(t7kVar, k0aVar.N, jSONObject, "transition_out", t6fVar.K1, t6fVar.I1);
        List T = h4a.T(t7kVar, k0aVar.O, jSONObject, xz9.q);
        List V14 = h4a.V(t7kVar, k0aVar.P, jSONObject, "variable_triggers", t6fVar.E9, t6fVar.C9);
        List V15 = h4a.V(t7kVar, k0aVar.Q, jSONObject, "variables", t6fVar.K9, t6fVar.I9);
        List V16 = h4a.V(t7kVar, k0aVar.R, jSONObject, "video_sources", t6fVar.N9, t6fVar.L9);
        c9c c9cVar11 = k0aVar.S;
        tct tctVar2 = xz9.m;
        jx9 jx9Var2 = jx9.z;
        ozb ozbVar13 = xz9.h;
        ?? P6 = h4a.P(t7kVar, c9cVar11, jSONObject, "visibility", tctVar2, jx9Var2, ozbVar13);
        if (P6 != 0) {
            ozbVar13 = P6;
        }
        l1a l1aVar = (l1a) h4a.K(t7kVar, k0aVar.T, jSONObject, "visibility_action", t6fVar.W9, t6fVar.U9);
        List V17 = h4a.V(t7kVar, k0aVar.U, jSONObject, "visibility_actions", t6fVar.W9, t6fVar.U9);
        bk9 bk9Var3 = (bk9) h4a.K(t7kVar, k0aVar.V, jSONObject, CameraProperty.WIDTH, t6fVar.s7, t6fVar.q7);
        if (bk9Var3 == null) {
            bk9Var3 = xz9.i;
        }
        return new pz9(tc8Var, O, O2, ozbVar9, V, do8Var, ozbVar3, V2, op8Var, V3, Q, V4, str, V5, V6, V7, wz8Var, V8, bk9Var2, str2, w79Var, ix8Var, ozbVar5, ix8Var2, V9, N, ozbVar7, N2, ozbVar10, V10, N3, Q2, ozbVar12, V11, V12, qv9Var, V13, sq8Var, un8Var, un8Var2, T, V14, V15, V16, ozbVar13, l1aVar, V17, bk9Var3);
    }
}
