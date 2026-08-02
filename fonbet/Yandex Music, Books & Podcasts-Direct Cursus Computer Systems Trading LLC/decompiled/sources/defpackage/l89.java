package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class l89 implements u8s {
    public final t6f a;

    public l89(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [szb] */
    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final g89 a(t7k t7kVar, o89 o89Var, JSONObject jSONObject) {
        c9c c9cVar = o89Var.a;
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        l29 l29Var = m89.b;
        ozb ozbVar = m89.a;
        ?? R = h4a.R(t7kVar, c9cVar, jSONObject, "angle", ox8Var, kzjVar, l29Var, ozbVar);
        if (R != 0) {
            ozbVar = R;
        }
        c9c c9cVar2 = o89Var.b;
        t6f t6fVar = this.a;
        return new g89(ozbVar, h4a.U(t7kVar, c9cVar2, jSONObject, t6fVar.g5, t6fVar.e5, m89.d), h4a.S(t7kVar, o89Var.c, jSONObject, vct.f, m89.c));
    }
}
