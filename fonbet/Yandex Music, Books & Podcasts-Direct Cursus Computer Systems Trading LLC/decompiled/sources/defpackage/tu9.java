package defpackage;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class tu9 implements u8s {
    public final /* synthetic */ int a;
    public final t6f b;

    public /* synthetic */ tu9(t6f t6fVar, int i) {
        this.a = i;
        this.b = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [szb] */
    /* JADX WARN: Type inference failed for: r1v18, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v12, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v47, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v50, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v60, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v8, types: [szb] */
    @Override // defpackage.u8s
    public final Object a(t7k t7kVar, d7f d7fVar, JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                ov9 ov9Var = (ov9) d7fVar;
                c9c c9cVar = ov9Var.a;
                t6f t6fVar = this.b;
                jyr jyrVar = t6fVar.B1;
                jyr jyrVar2 = t6fVar.aa;
                jyr jyrVar3 = t6fVar.ca;
                jyr jyrVar4 = t6fVar.z1;
                sm8 sm8Var = (sm8) h4a.K(t7kVar, c9cVar, jSONObject, "animation_in", jyrVar, jyrVar4);
                sm8 sm8Var2 = (sm8) h4a.K(t7kVar, ov9Var.b, jSONObject, "animation_out", t6fVar.B1, jyrVar4);
                szb N = h4a.N(t7kVar, ov9Var.c, jSONObject, "background_accessibility_description", vct.c);
                c9c c9cVar2 = ov9Var.d;
                s3f s3fVar = bcx.i;
                String str = (String) h4a.L(c9cVar2, t7kVar, "bring_to_top_id", s3fVar, jSONObject);
                c9c c9cVar3 = ov9Var.e;
                ox8 ox8Var = vct.a;
                kzj kzjVar = kzj.B;
                ozb ozbVar = uu9.a;
                ?? P = h4a.P(t7kVar, c9cVar3, jSONObject, "close_by_tap_outside", ox8Var, kzjVar, ozbVar);
                ozb ozbVar2 = P == 0 ? ozbVar : P;
                jc8 jc8Var = (jc8) h4a.D(t7kVar, ov9Var.f, jSONObject, "div", jyrVar3, jyrVar2);
                c9c c9cVar4 = ov9Var.g;
                ox8 ox8Var2 = vct.b;
                kzj kzjVar2 = kzj.F;
                ns9 ns9Var = uu9.e;
                ozb ozbVar3 = uu9.b;
                ?? R = h4a.R(t7kVar, c9cVar4, jSONObject, "duration", ox8Var2, kzjVar2, ns9Var, ozbVar3);
                if (R != 0) {
                    ozbVar3 = R;
                }
                String str2 = (String) h4a.C(ov9Var.h, jSONObject, ConnectableDevice.KEY_ID, s3fVar, bcx.h);
                xu9 xu9Var = (xu9) h4a.K(t7kVar, ov9Var.i, jSONObject, "mode", t6fVar.m9, t6fVar.k9);
                if (xu9Var == null) {
                    xu9Var = uu9.c;
                }
                return new iu9(sm8Var, sm8Var2, N, str, ozbVar2, jc8Var, ozbVar3, str2, xu9Var, (bf9) h4a.K(t7kVar, ov9Var.j, jSONObject, "offset", t6fVar.n6, t6fVar.l6), h4a.G(t7kVar, ov9Var.k, jSONObject, "position", uu9.d, vq9.Y), (jc8) h4a.K(t7kVar, ov9Var.l, jSONObject, "substrate_div", jyrVar3, jyrVar2), h4a.V(t7kVar, ov9Var.m, jSONObject, "tap_outside_actions", t6fVar.v1, t6fVar.t1));
            case 1:
                uv9 uv9Var = (uv9) d7fVar;
                c9c c9cVar5 = uv9Var.a;
                t6f t6fVar2 = this.b;
                jyr jyrVar5 = t6fVar2.k6;
                jyr jyrVar6 = t6fVar2.i6;
                xd9 xd9Var = (xd9) h4a.K(t7kVar, c9cVar5, jSONObject, "pivot_x", jyrVar5, jyrVar6);
                if (xd9Var == null) {
                    xd9Var = tv9.a;
                }
                xd9 xd9Var2 = xd9Var;
                xd9 xd9Var3 = (xd9) h4a.K(t7kVar, uv9Var.b, jSONObject, "pivot_y", t6fVar2.k6, jyrVar6);
                if (xd9Var3 == null) {
                    xd9Var3 = tv9.b;
                }
                return new qv9(xd9Var2, xd9Var3, h4a.O(t7kVar, uv9Var.c, jSONObject, CameraProperty.ROTATION, vct.d, kzj.E));
            case 2:
                nx9 nx9Var = (nx9) d7fVar;
                c9c c9cVar6 = nx9Var.a;
                t6f t6fVar3 = this.b;
                List J = h4a.J(t7kVar, c9cVar6, jSONObject, "actions", t6fVar3.v1, t6fVar3.t1, mx9.c);
                szb G = h4a.G(t7kVar, nx9Var.b, jSONObject, "condition", vct.a, kzj.B);
                c9c c9cVar7 = nx9Var.c;
                tct tctVar = mx9.b;
                vq9 vq9Var = vq9.A0;
                ozb ozbVar4 = mx9.a;
                ?? P2 = h4a.P(t7kVar, c9cVar7, jSONObject, "mode", tctVar, vq9Var, ozbVar4);
                if (P2 != 0) {
                    ozbVar4 = P2;
                }
                return new ix9(J, G, ozbVar4);
            case 3:
                j0a j0aVar = (j0a) d7fVar;
                szb O = h4a.O(t7kVar, j0aVar.a, jSONObject, "bitrate", vct.b, kzj.F);
                szb F = h4a.F(t7kVar, j0aVar.b, jSONObject, "mime_type", vct.c);
                c9c c9cVar8 = j0aVar.c;
                t6f t6fVar4 = this.b;
                return new c0a(O, F, (b0a) h4a.K(t7kVar, c9cVar8, jSONObject, "resolution", t6fVar4.Q9, t6fVar4.O9), h4a.G(t7kVar, j0aVar.d, jSONObject, "url", vct.e, kzj.C));
            default:
                q1a q1aVar = (q1a) d7fVar;
                c9c c9cVar9 = q1aVar.a;
                t6f t6fVar5 = this.b;
                zw8 zw8Var = (zw8) h4a.K(t7kVar, c9cVar9, jSONObject, "download_callbacks", t6fVar5.d3, t6fVar5.b3);
                c9c c9cVar10 = q1aVar.b;
                ox8 ox8Var3 = vct.a;
                kzj kzjVar3 = kzj.B;
                ozb ozbVar5 = p1a.a;
                ?? P3 = h4a.P(t7kVar, c9cVar10, jSONObject, "is_enabled", ox8Var3, kzjVar3, ozbVar5);
                ozb ozbVar6 = P3 == 0 ? ozbVar5 : P3;
                szb F2 = h4a.F(t7kVar, q1aVar.c, jSONObject, "log_id", vct.c);
                c9c c9cVar11 = q1aVar.d;
                ox8 ox8Var4 = vct.b;
                kzj kzjVar4 = kzj.F;
                ns9 ns9Var2 = p1a.e;
                ozb ozbVar7 = p1a.b;
                ?? R2 = h4a.R(t7kVar, c9cVar11, jSONObject, "log_limit", ox8Var4, kzjVar4, ns9Var2, ozbVar7);
                ozb ozbVar8 = R2 == 0 ? ozbVar7 : R2;
                c9c c9cVar12 = q1aVar.e;
                s3f s3fVar2 = bcx.i;
                JSONObject jSONObject2 = (JSONObject) h4a.L(c9cVar12, t7kVar, "payload", s3fVar2, jSONObject);
                c9c c9cVar13 = q1aVar.f;
                px8 px8Var = vct.e;
                kzj kzjVar5 = kzj.C;
                szb O2 = h4a.O(t7kVar, c9cVar13, jSONObject, "referer", px8Var, kzjVar5);
                String str3 = (String) h4a.L(q1aVar.g, t7kVar, "scope_id", s3fVar2, jSONObject);
                uk8 uk8Var = (uk8) h4a.K(t7kVar, q1aVar.h, jSONObject, "typed", t6fVar5.m1, t6fVar5.k1);
                szb O3 = h4a.O(t7kVar, q1aVar.i, jSONObject, "url", px8Var, kzjVar5);
                c9c c9cVar14 = q1aVar.j;
                ns9 ns9Var3 = p1a.f;
                ozb ozbVar9 = p1a.c;
                ?? R3 = h4a.R(t7kVar, c9cVar14, jSONObject, "visibility_duration", ox8Var4, kzjVar4, ns9Var3, ozbVar9);
                ozb ozbVar10 = R3 == 0 ? ozbVar9 : R3;
                c9c c9cVar15 = q1aVar.k;
                ns9 ns9Var4 = p1a.g;
                ozb ozbVar11 = p1a.d;
                ?? R4 = h4a.R(t7kVar, c9cVar15, jSONObject, "visibility_percentage", ox8Var4, kzjVar4, ns9Var4, ozbVar11);
                return new l1a(uk8Var, zw8Var, ozbVar6, F2, ozbVar8, O2, O3, ozbVar10, R4 == 0 ? ozbVar11 : R4, str3, jSONObject2);
        }
    }
}
