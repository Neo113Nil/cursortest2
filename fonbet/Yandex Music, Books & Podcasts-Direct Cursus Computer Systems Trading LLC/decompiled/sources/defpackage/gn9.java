package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class gn9 implements gip, py7 {
    public final t6f a;

    public gn9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [szb] */
    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final fn9 a(t7k t7kVar, JSONObject jSONObject) {
        jz8 jz8Var = (jz8) etn.U(t7kVar, jSONObject, "item_spacing", this.a.F3);
        if (jz8Var == null) {
            jz8Var = jn9.a;
        }
        ox8 ox8Var = vct.b;
        kzj kzjVar = kzj.F;
        hm9 hm9Var = jn9.c;
        ozb ozbVar = jn9.b;
        ?? e = e5f.e(t7kVar, jSONObject, "max_visible_items", ox8Var, kzjVar, hm9Var, ozbVar);
        if (e != 0) {
            ozbVar = e;
        }
        return new fn9(jz8Var, ozbVar);
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, fn9 fn9Var) {
        JSONObject jSONObject = new JSONObject();
        etn.m0(t7kVar, jSONObject, "item_spacing", fn9Var.a, this.a.F3);
        e5f.g(t7kVar, jSONObject, "max_visible_items", fn9Var.b);
        etn.l0(t7kVar, jSONObject, "type", "stretch");
        return jSONObject;
    }
}
