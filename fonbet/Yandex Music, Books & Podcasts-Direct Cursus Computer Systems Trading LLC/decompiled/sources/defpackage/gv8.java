package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class gv8 implements u8s {
    public final t6f a;

    public gv8(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v50, types: [szb] */
    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final yu8 a(t7k t7kVar, jv8 jv8Var, JSONObject jSONObject) {
        c9c c9cVar = jv8Var.a;
        t6f t6fVar = this.a;
        tc8 tc8Var = (tc8) h4a.K(t7kVar, c9cVar, jSONObject, "accessibility", t6fVar.J, t6fVar.H);
        szb O = h4a.O(t7kVar, jv8Var.b, jSONObject, "alignment_horizontal", hv8.e, va8.x0);
        szb O2 = h4a.O(t7kVar, jv8Var.c, jSONObject, "alignment_vertical", hv8.f, va8.z0);
        c9c c9cVar2 = jv8Var.d;
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        lc8 lc8Var = hv8.h;
        ozb ozbVar = hv8.a;
        ?? R = h4a.R(t7kVar, c9cVar2, jSONObject, "alpha", ox8Var, kzjVar, lc8Var, ozbVar);
        if (R != 0) {
            ozbVar = R;
        }
        List V = h4a.V(t7kVar, jv8Var.e, jSONObject, "animators", t6fVar.E1, t6fVar.C1);
        List V2 = h4a.V(t7kVar, jv8Var.f, jSONObject, C0479n3.g, t6fVar.Q1, t6fVar.O1);
        op8 op8Var = (op8) h4a.K(t7kVar, jv8Var.g, jSONObject, "border", t6fVar.W1, t6fVar.U1);
        c9c c9cVar3 = jv8Var.h;
        ox8 ox8Var2 = vct.b;
        kzj kzjVar2 = kzj.F;
        szb Q = h4a.Q(t7kVar, c9cVar3, jSONObject, "column_span", ox8Var2, kzjVar2, hv8.i);
        c9c c9cVar4 = jv8Var.i;
        s3f s3fVar = bcx.i;
        JSONObject jSONObject2 = (JSONObject) h4a.L(c9cVar4, t7kVar, "custom_props", s3fVar, jSONObject);
        String str = (String) h4a.C(jv8Var.j, jSONObject, "custom_type", s3fVar, bcx.h);
        List V3 = h4a.V(t7kVar, jv8Var.k, jSONObject, "disappear_actions", t6fVar.a3, t6fVar.Y2);
        List V4 = h4a.V(t7kVar, jv8Var.l, jSONObject, "extensions", t6fVar.m3, t6fVar.k3);
        wz8 wz8Var = (wz8) h4a.K(t7kVar, jv8Var.m, jSONObject, "focus", t6fVar.N3, t6fVar.L3);
        List V5 = h4a.V(t7kVar, jv8Var.n, jSONObject, "functions", t6fVar.W3, t6fVar.U3);
        bk9 bk9Var = (bk9) h4a.K(t7kVar, jv8Var.o, jSONObject, CameraProperty.HEIGHT, t6fVar.s7, t6fVar.q7);
        if (bk9Var == null) {
            bk9Var = hv8.b;
        }
        bk9 bk9Var2 = bk9Var;
        String str2 = (String) h4a.L(jv8Var.p, t7kVar, ConnectableDevice.KEY_ID, s3fVar, jSONObject);
        List V6 = h4a.V(t7kVar, jv8Var.q, jSONObject, "items", t6fVar.ca, t6fVar.aa);
        w79 w79Var = (w79) h4a.K(t7kVar, jv8Var.r, jSONObject, "layout_provider", t6fVar.a5, t6fVar.Y4);
        ix8 ix8Var = (ix8) h4a.K(t7kVar, jv8Var.s, jSONObject, "margins", t6fVar.j3, t6fVar.h3);
        ix8 ix8Var2 = (ix8) h4a.K(t7kVar, jv8Var.t, jSONObject, "paddings", t6fVar.j3, t6fVar.h3);
        szb N = h4a.N(t7kVar, jv8Var.u, jSONObject, "reuse_id", vct.c);
        szb Q2 = h4a.Q(t7kVar, jv8Var.v, jSONObject, "row_span", ox8Var2, kzjVar2, hv8.j);
        List V7 = h4a.V(t7kVar, jv8Var.w, jSONObject, "selected_actions", t6fVar.v1, t6fVar.t1);
        List V8 = h4a.V(t7kVar, jv8Var.x, jSONObject, "tooltips", t6fVar.p9, t6fVar.n9);
        qv9 qv9Var = (qv9) h4a.K(t7kVar, jv8Var.y, jSONObject, "transform", t6fVar.s9, t6fVar.q9);
        List V9 = h4a.V(t7kVar, jv8Var.z, jSONObject, "transformations", t6fVar.v9, t6fVar.t9);
        sq8 sq8Var = (sq8) h4a.K(t7kVar, jv8Var.A, jSONObject, "transition_change", t6fVar.f2, t6fVar.d2);
        un8 un8Var = (un8) h4a.K(t7kVar, jv8Var.B, jSONObject, "transition_in", t6fVar.K1, t6fVar.I1);
        un8 un8Var2 = (un8) h4a.K(t7kVar, jv8Var.C, jSONObject, "transition_out", t6fVar.K1, t6fVar.I1);
        List T = h4a.T(t7kVar, jv8Var.D, jSONObject, hv8.k);
        List V10 = h4a.V(t7kVar, jv8Var.E, jSONObject, "variable_triggers", t6fVar.E9, t6fVar.C9);
        List V11 = h4a.V(t7kVar, jv8Var.F, jSONObject, "variables", t6fVar.K9, t6fVar.I9);
        c9c c9cVar5 = jv8Var.G;
        tct tctVar = hv8.g;
        jx9 jx9Var = jx9.z;
        ozb ozbVar2 = hv8.c;
        ?? P = h4a.P(t7kVar, c9cVar5, jSONObject, "visibility", tctVar, jx9Var, ozbVar2);
        if (P != 0) {
            ozbVar2 = P;
        }
        l1a l1aVar = (l1a) h4a.K(t7kVar, jv8Var.H, jSONObject, "visibility_action", t6fVar.W9, t6fVar.U9);
        List V12 = h4a.V(t7kVar, jv8Var.I, jSONObject, "visibility_actions", t6fVar.W9, t6fVar.U9);
        bk9 bk9Var3 = (bk9) h4a.K(t7kVar, jv8Var.J, jSONObject, CameraProperty.WIDTH, t6fVar.s7, t6fVar.q7);
        if (bk9Var3 == null) {
            bk9Var3 = hv8.d;
        }
        return new yu8(tc8Var, O, O2, ozbVar, V, V2, op8Var, Q, jSONObject2, str, V3, V4, wz8Var, V5, bk9Var2, str2, V6, w79Var, ix8Var, ix8Var2, N, Q2, V7, V8, qv9Var, V9, sq8Var, un8Var, un8Var2, T, V10, V11, ozbVar2, l1aVar, V12, bk9Var3);
    }
}
