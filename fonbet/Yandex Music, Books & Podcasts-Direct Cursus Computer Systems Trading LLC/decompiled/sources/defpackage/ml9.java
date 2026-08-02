package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ml9 implements u8s {
    public final t6f a;

    public ml9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v29, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v31, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v5, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v74, types: [szb] */
    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final zk9 a(t7k t7kVar, sl9 sl9Var, JSONObject jSONObject) {
        c9c c9cVar = sl9Var.a;
        t6f t6fVar = this.a;
        tc8 tc8Var = (tc8) h4a.K(t7kVar, c9cVar, jSONObject, "accessibility", t6fVar.J, t6fVar.H);
        szb O = h4a.O(t7kVar, sl9Var.b, jSONObject, "alignment_horizontal", nl9.h, va8.x0);
        szb O2 = h4a.O(t7kVar, sl9Var.c, jSONObject, "alignment_vertical", nl9.i, va8.z0);
        c9c c9cVar2 = sl9Var.d;
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        mb9 mb9Var = nl9.k;
        ozb ozbVar = nl9.a;
        ?? R = h4a.R(t7kVar, c9cVar2, jSONObject, "alpha", ox8Var, kzjVar, mb9Var, ozbVar);
        if (R != 0) {
            ozbVar = R;
        }
        List V = h4a.V(t7kVar, sl9Var.e, jSONObject, "animators", t6fVar.E1, t6fVar.C1);
        List V2 = h4a.V(t7kVar, sl9Var.f, jSONObject, C0479n3.g, t6fVar.Q1, t6fVar.O1);
        op8 op8Var = (op8) h4a.K(t7kVar, sl9Var.g, jSONObject, "border", t6fVar.W1, t6fVar.U1);
        c9c c9cVar3 = sl9Var.h;
        ox8 ox8Var2 = vct.b;
        kzj kzjVar2 = kzj.F;
        szb Q = h4a.Q(t7kVar, c9cVar3, jSONObject, "column_span", ox8Var2, kzjVar2, nl9.l);
        List V3 = h4a.V(t7kVar, sl9Var.i, jSONObject, "disappear_actions", t6fVar.a3, t6fVar.Y2);
        List V4 = h4a.V(t7kVar, sl9Var.j, jSONObject, "extensions", t6fVar.m3, t6fVar.k3);
        wz8 wz8Var = (wz8) h4a.K(t7kVar, sl9Var.k, jSONObject, "focus", t6fVar.N3, t6fVar.L3);
        List V5 = h4a.V(t7kVar, sl9Var.l, jSONObject, "functions", t6fVar.W3, t6fVar.U3);
        bk9 bk9Var = (bk9) h4a.K(t7kVar, sl9Var.m, jSONObject, CameraProperty.HEIGHT, t6fVar.s7, t6fVar.q7);
        if (bk9Var == null) {
            bk9Var = nl9.b;
        }
        bk9 bk9Var2 = bk9Var;
        c9c c9cVar4 = sl9Var.n;
        s3f s3fVar = bcx.i;
        String str = (String) h4a.L(c9cVar4, t7kVar, ConnectableDevice.KEY_ID, s3fVar, jSONObject);
        c9c c9cVar5 = sl9Var.o;
        ox8 ox8Var3 = vct.a;
        kzj kzjVar3 = kzj.B;
        ozb ozbVar2 = nl9.c;
        ozb ozbVar3 = ozbVar;
        ?? P = h4a.P(t7kVar, c9cVar5, jSONObject, "is_enabled", ox8Var3, kzjVar3, ozbVar2);
        ozb ozbVar4 = P == 0 ? ozbVar2 : P;
        w79 w79Var = (w79) h4a.K(t7kVar, sl9Var.p, jSONObject, "layout_provider", t6fVar.a5, t6fVar.Y4);
        ix8 ix8Var = (ix8) h4a.K(t7kVar, sl9Var.q, jSONObject, "margins", t6fVar.j3, t6fVar.h3);
        c9c c9cVar6 = sl9Var.r;
        ozb ozbVar5 = nl9.d;
        ?? P2 = h4a.P(t7kVar, c9cVar6, jSONObject, "max_value", ox8Var2, kzjVar2, ozbVar5);
        ozb ozbVar6 = P2 == 0 ? ozbVar5 : P2;
        c9c c9cVar7 = sl9Var.s;
        ozb ozbVar7 = nl9.e;
        ?? P3 = h4a.P(t7kVar, c9cVar7, jSONObject, "min_value", ox8Var2, kzjVar2, ozbVar7);
        ozb ozbVar8 = P3 == 0 ? ozbVar7 : P3;
        ix8 ix8Var2 = (ix8) h4a.K(t7kVar, sl9Var.t, jSONObject, "paddings", t6fVar.j3, t6fVar.h3);
        List V6 = h4a.V(t7kVar, sl9Var.u, jSONObject, "ranges", t6fVar.E7, t6fVar.C7);
        szb N = h4a.N(t7kVar, sl9Var.v, jSONObject, "reuse_id", vct.c);
        szb Q2 = h4a.Q(t7kVar, sl9Var.w, jSONObject, "row_span", ox8Var2, kzjVar2, nl9.m);
        tc8 tc8Var2 = (tc8) h4a.K(t7kVar, sl9Var.x, jSONObject, "secondary_value_accessibility", t6fVar.J, t6fVar.H);
        List V7 = h4a.V(t7kVar, sl9Var.y, jSONObject, "selected_actions", t6fVar.v1, t6fVar.t1);
        dx8 dx8Var = (dx8) h4a.K(t7kVar, sl9Var.z, jSONObject, "thumb_secondary_style", t6fVar.g3, t6fVar.e3);
        yk9 yk9Var = (yk9) h4a.K(t7kVar, sl9Var.A, jSONObject, "thumb_secondary_text_style", t6fVar.B7, t6fVar.z7);
        String str2 = (String) h4a.L(sl9Var.B, t7kVar, "thumb_secondary_value_variable", s3fVar, jSONObject);
        dx8 dx8Var2 = (dx8) h4a.D(t7kVar, sl9Var.C, jSONObject, "thumb_style", t6fVar.g3, t6fVar.e3);
        yk9 yk9Var2 = (yk9) h4a.K(t7kVar, sl9Var.D, jSONObject, "thumb_text_style", t6fVar.B7, t6fVar.z7);
        String str3 = (String) h4a.L(sl9Var.E, t7kVar, "thumb_value_variable", s3fVar, jSONObject);
        dx8 dx8Var3 = (dx8) h4a.K(t7kVar, sl9Var.F, jSONObject, "tick_mark_active_style", t6fVar.g3, t6fVar.e3);
        dx8 dx8Var4 = (dx8) h4a.K(t7kVar, sl9Var.G, jSONObject, "tick_mark_inactive_style", t6fVar.g3, t6fVar.e3);
        List V8 = h4a.V(t7kVar, sl9Var.H, jSONObject, "tooltips", t6fVar.p9, t6fVar.n9);
        dx8 dx8Var5 = (dx8) h4a.D(t7kVar, sl9Var.I, jSONObject, "track_active_style", t6fVar.g3, t6fVar.e3);
        dx8 dx8Var6 = (dx8) h4a.D(t7kVar, sl9Var.J, jSONObject, "track_inactive_style", t6fVar.g3, t6fVar.e3);
        qv9 qv9Var = (qv9) h4a.K(t7kVar, sl9Var.K, jSONObject, "transform", t6fVar.s9, t6fVar.q9);
        List V9 = h4a.V(t7kVar, sl9Var.L, jSONObject, "transformations", t6fVar.v9, t6fVar.t9);
        sq8 sq8Var = (sq8) h4a.K(t7kVar, sl9Var.M, jSONObject, "transition_change", t6fVar.f2, t6fVar.d2);
        un8 un8Var = (un8) h4a.K(t7kVar, sl9Var.N, jSONObject, "transition_in", t6fVar.K1, t6fVar.I1);
        un8 un8Var2 = (un8) h4a.K(t7kVar, sl9Var.O, jSONObject, "transition_out", t6fVar.K1, t6fVar.I1);
        List T = h4a.T(t7kVar, sl9Var.P, jSONObject, nl9.n);
        List V10 = h4a.V(t7kVar, sl9Var.Q, jSONObject, "variable_triggers", t6fVar.E9, t6fVar.C9);
        List V11 = h4a.V(t7kVar, sl9Var.R, jSONObject, "variables", t6fVar.K9, t6fVar.I9);
        c9c c9cVar8 = sl9Var.S;
        tct tctVar = nl9.j;
        jx9 jx9Var = jx9.z;
        ozb ozbVar9 = nl9.f;
        ?? P4 = h4a.P(t7kVar, c9cVar8, jSONObject, "visibility", tctVar, jx9Var, ozbVar9);
        if (P4 != 0) {
            ozbVar9 = P4;
        }
        l1a l1aVar = (l1a) h4a.K(t7kVar, sl9Var.T, jSONObject, "visibility_action", t6fVar.W9, t6fVar.U9);
        List V12 = h4a.V(t7kVar, sl9Var.U, jSONObject, "visibility_actions", t6fVar.W9, t6fVar.U9);
        bk9 bk9Var3 = (bk9) h4a.K(t7kVar, sl9Var.V, jSONObject, CameraProperty.WIDTH, t6fVar.s7, t6fVar.q7);
        if (bk9Var3 == null) {
            bk9Var3 = nl9.g;
        }
        return new zk9(tc8Var, O, O2, ozbVar3, V, V2, op8Var, Q, V3, V4, wz8Var, V5, bk9Var2, str, ozbVar4, w79Var, ix8Var, ozbVar6, ozbVar8, ix8Var2, V6, N, Q2, tc8Var2, V7, dx8Var, yk9Var, str2, dx8Var2, yk9Var2, str3, dx8Var3, dx8Var4, V8, dx8Var5, dx8Var6, qv9Var, V9, sq8Var, un8Var, un8Var2, T, V10, V11, ozbVar9, l1aVar, V12, bk9Var3);
    }
}
