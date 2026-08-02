package defpackage;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class o29 implements u8s {
    public final t6f a;

    public o29(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [szb] */
    /* JADX WARN: Type inference failed for: r14v1, types: [szb] */
    /* JADX WARN: Type inference failed for: r2v6, types: [szb] */
    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final k29 a(t7k t7kVar, q29 q29Var, JSONObject jSONObject) {
        c9c c9cVar = q29Var.a;
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        l29 l29Var = p29.i;
        ozb ozbVar = p29.a;
        ?? R = h4a.R(t7kVar, c9cVar, jSONObject, "alpha", ox8Var, kzjVar, l29Var, ozbVar);
        if (R != 0) {
            ozbVar = R;
        }
        c9c c9cVar2 = q29Var.b;
        tct tctVar = p29.f;
        va8 va8Var = va8.x0;
        ozb ozbVar2 = p29.b;
        szb P = h4a.P(t7kVar, c9cVar2, jSONObject, "content_alignment_horizontal", tctVar, va8Var, ozbVar2);
        if (P == null) {
            P = ozbVar2;
        }
        c9c c9cVar3 = q29Var.c;
        tct tctVar2 = p29.g;
        va8 va8Var2 = va8.z0;
        ozb ozbVar3 = p29.c;
        szb P2 = h4a.P(t7kVar, c9cVar3, jSONObject, "content_alignment_vertical", tctVar2, va8Var2, ozbVar3);
        if (P2 == null) {
            P2 = ozbVar3;
        }
        c9c c9cVar4 = q29Var.d;
        t6f t6fVar = this.a;
        List V = h4a.V(t7kVar, c9cVar4, jSONObject, "filters", t6fVar.v3, t6fVar.t3);
        szb G = h4a.G(t7kVar, q29Var.e, jSONObject, "image_url", vct.e, kzj.C);
        c9c c9cVar5 = q29Var.f;
        ox8 ox8Var2 = vct.a;
        kzj kzjVar2 = kzj.B;
        ozb ozbVar4 = p29.d;
        ?? P3 = h4a.P(t7kVar, c9cVar5, jSONObject, "preload_required", ox8Var2, kzjVar2, ozbVar4);
        ozb ozbVar5 = P3 == 0 ? ozbVar4 : P3;
        c9c c9cVar6 = q29Var.g;
        tct tctVar3 = p29.h;
        p19 p19Var = p19.J;
        ozb ozbVar6 = p29.e;
        ?? P4 = h4a.P(t7kVar, c9cVar6, jSONObject, "scale", tctVar3, p19Var, ozbVar6);
        if (P4 != 0) {
            ozbVar6 = P4;
        }
        return new k29(ozbVar, P, P2, V, G, ozbVar5, ozbVar6);
    }
}
