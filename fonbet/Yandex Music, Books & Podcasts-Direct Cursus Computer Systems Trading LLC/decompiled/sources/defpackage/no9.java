package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class no9 implements u8s {
    public final t6f a;

    public no9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v49, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v5, types: [szb] */
    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final jo9 a(t7k t7kVar, po9 po9Var, JSONObject jSONObject) {
        c9c c9cVar = po9Var.a;
        t6f t6fVar = this.a;
        tc8 tc8Var = (tc8) h4a.K(t7kVar, c9cVar, jSONObject, "accessibility", t6fVar.J, t6fVar.H);
        szb O = h4a.O(t7kVar, po9Var.b, jSONObject, "alignment_horizontal", oo9.f, va8.x0);
        szb O2 = h4a.O(t7kVar, po9Var.c, jSONObject, "alignment_vertical", oo9.g, va8.z0);
        c9c c9cVar2 = po9Var.d;
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        hm9 hm9Var = oo9.i;
        ozb ozbVar = oo9.a;
        ?? R = h4a.R(t7kVar, c9cVar2, jSONObject, "alpha", ox8Var, kzjVar, hm9Var, ozbVar);
        if (R != 0) {
            ozbVar = R;
        }
        List V = h4a.V(t7kVar, po9Var.e, jSONObject, "animators", t6fVar.E1, t6fVar.C1);
        List V2 = h4a.V(t7kVar, po9Var.f, jSONObject, C0479n3.g, t6fVar.Q1, t6fVar.O1);
        op8 op8Var = (op8) h4a.K(t7kVar, po9Var.g, jSONObject, "border", t6fVar.W1, t6fVar.U1);
        c9c c9cVar3 = po9Var.h;
        ox8 ox8Var2 = vct.b;
        kzj kzjVar2 = kzj.F;
        szb Q = h4a.Q(t7kVar, c9cVar3, jSONObject, "column_span", ox8Var2, kzjVar2, oo9.j);
        List V3 = h4a.V(t7kVar, po9Var.i, jSONObject, "disappear_actions", t6fVar.a3, t6fVar.Y2);
        List V4 = h4a.V(t7kVar, po9Var.j, jSONObject, "extensions", t6fVar.m3, t6fVar.k3);
        wz8 wz8Var = (wz8) h4a.K(t7kVar, po9Var.k, jSONObject, "focus", t6fVar.N3, t6fVar.L3);
        List V5 = h4a.V(t7kVar, po9Var.l, jSONObject, "functions", t6fVar.W3, t6fVar.U3);
        bk9 bk9Var = (bk9) h4a.K(t7kVar, po9Var.m, jSONObject, CameraProperty.HEIGHT, t6fVar.s7, t6fVar.q7);
        if (bk9Var == null) {
            bk9Var = oo9.b;
        }
        bk9 bk9Var2 = bk9Var;
        c9c c9cVar4 = po9Var.n;
        s3f s3fVar = bcx.i;
        String str = (String) h4a.L(c9cVar4, t7kVar, ConnectableDevice.KEY_ID, s3fVar, jSONObject);
        c9c c9cVar5 = po9Var.o;
        ox8 ox8Var3 = vct.a;
        kzj kzjVar3 = kzj.B;
        ozb ozbVar2 = oo9.c;
        ozb ozbVar3 = ozbVar;
        ?? P = h4a.P(t7kVar, c9cVar5, jSONObject, "is_enabled", ox8Var3, kzjVar3, ozbVar2);
        ozb ozbVar4 = P == 0 ? ozbVar2 : P;
        String str2 = (String) h4a.C(po9Var.p, jSONObject, "is_on_variable", s3fVar, bcx.h);
        w79 w79Var = (w79) h4a.K(t7kVar, po9Var.q, jSONObject, "layout_provider", t6fVar.a5, t6fVar.Y4);
        ix8 ix8Var = (ix8) h4a.K(t7kVar, po9Var.r, jSONObject, "margins", t6fVar.j3, t6fVar.h3);
        szb O3 = h4a.O(t7kVar, po9Var.s, jSONObject, "on_color", vct.f, kzj.G);
        ix8 ix8Var2 = (ix8) h4a.K(t7kVar, po9Var.t, jSONObject, "paddings", t6fVar.j3, t6fVar.h3);
        szb N = h4a.N(t7kVar, po9Var.u, jSONObject, "reuse_id", vct.c);
        szb Q2 = h4a.Q(t7kVar, po9Var.v, jSONObject, "row_span", ox8Var2, kzjVar2, oo9.k);
        List V6 = h4a.V(t7kVar, po9Var.w, jSONObject, "selected_actions", t6fVar.v1, t6fVar.t1);
        List V7 = h4a.V(t7kVar, po9Var.x, jSONObject, "tooltips", t6fVar.p9, t6fVar.n9);
        qv9 qv9Var = (qv9) h4a.K(t7kVar, po9Var.y, jSONObject, "transform", t6fVar.s9, t6fVar.q9);
        List V8 = h4a.V(t7kVar, po9Var.z, jSONObject, "transformations", t6fVar.v9, t6fVar.t9);
        sq8 sq8Var = (sq8) h4a.K(t7kVar, po9Var.A, jSONObject, "transition_change", t6fVar.f2, t6fVar.d2);
        un8 un8Var = (un8) h4a.K(t7kVar, po9Var.B, jSONObject, "transition_in", t6fVar.K1, t6fVar.I1);
        un8 un8Var2 = (un8) h4a.K(t7kVar, po9Var.C, jSONObject, "transition_out", t6fVar.K1, t6fVar.I1);
        List T = h4a.T(t7kVar, po9Var.D, jSONObject, oo9.l);
        List V9 = h4a.V(t7kVar, po9Var.E, jSONObject, "variable_triggers", t6fVar.E9, t6fVar.C9);
        List V10 = h4a.V(t7kVar, po9Var.F, jSONObject, "variables", t6fVar.K9, t6fVar.I9);
        c9c c9cVar6 = po9Var.G;
        tct tctVar = oo9.h;
        jx9 jx9Var = jx9.z;
        ozb ozbVar5 = oo9.d;
        ?? P2 = h4a.P(t7kVar, c9cVar6, jSONObject, "visibility", tctVar, jx9Var, ozbVar5);
        if (P2 != 0) {
            ozbVar5 = P2;
        }
        l1a l1aVar = (l1a) h4a.K(t7kVar, po9Var.H, jSONObject, "visibility_action", t6fVar.W9, t6fVar.U9);
        List V11 = h4a.V(t7kVar, po9Var.I, jSONObject, "visibility_actions", t6fVar.W9, t6fVar.U9);
        bk9 bk9Var3 = (bk9) h4a.K(t7kVar, po9Var.J, jSONObject, CameraProperty.WIDTH, t6fVar.s7, t6fVar.q7);
        if (bk9Var3 == null) {
            bk9Var3 = oo9.e;
        }
        return new jo9(tc8Var, O, O2, ozbVar3, V, V2, op8Var, Q, V3, V4, wz8Var, V5, bk9Var2, str, ozbVar4, str2, w79Var, ix8Var, O3, ix8Var2, N, Q2, V6, V7, qv9Var, V8, sq8Var, un8Var, un8Var2, T, V9, V10, ozbVar5, l1aVar, V11, bk9Var3);
    }
}
