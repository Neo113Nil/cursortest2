package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class in9 implements u8s {
    public final t6f a;

    public in9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [szb] */
    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final fn9 a(t7k t7kVar, kn9 kn9Var, JSONObject jSONObject) {
        c9c c9cVar = kn9Var.a;
        t6f t6fVar = this.a;
        jz8 jz8Var = (jz8) h4a.K(t7kVar, c9cVar, jSONObject, "item_spacing", t6fVar.H3, t6fVar.F3);
        if (jz8Var == null) {
            jz8Var = jn9.a;
        }
        c9c c9cVar2 = kn9Var.b;
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        hm9 hm9Var = jn9.c;
        ozb ozbVar = jn9.b;
        ?? R = h4a.R(t7kVar, c9cVar2, jSONObject, "max_visible_items", ox8Var, kzjVar, hm9Var, ozbVar);
        if (R != 0) {
            ozbVar = R;
        }
        return new fn9(jz8Var, ozbVar);
    }
}
