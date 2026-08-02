package defpackage;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wt8 implements gip, py7 {
    public final t6f a;

    public wt8(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [szb] */
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        t6f t6fVar = this.a;
        ix8 ix8Var = (ix8) etn.U(t7kVar, jSONObject, "margins", t6fVar.h3);
        ox8 ox8Var = vct.a;
        kzj kzjVar = kzj.B;
        ozb ozbVar = yt8.a;
        ns9 ns9Var = bcx.h;
        szb e = e5f.e(t7kVar, jSONObject, "show_at_end", ox8Var, kzjVar, ns9Var, ozbVar);
        if (e == null) {
            e = ozbVar;
        }
        ozb ozbVar2 = yt8.b;
        szb e2 = e5f.e(t7kVar, jSONObject, "show_at_start", ox8Var, kzjVar, ns9Var, ozbVar2);
        if (e2 == null) {
            e2 = ozbVar2;
        }
        ozb ozbVar3 = yt8.c;
        ?? e3 = e5f.e(t7kVar, jSONObject, "show_between", ox8Var, kzjVar, ns9Var, ozbVar3);
        if (e3 != 0) {
            ozbVar3 = e3;
        }
        return new ht8(ix8Var, e, e2, ozbVar3, (dx8) etn.O(t7kVar, jSONObject, "style", t6fVar.e3));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, ht8 ht8Var) {
        JSONObject jSONObject = new JSONObject();
        ix8 ix8Var = ht8Var.a;
        t6f t6fVar = this.a;
        etn.m0(t7kVar, jSONObject, "margins", ix8Var, t6fVar.h3);
        e5f.g(t7kVar, jSONObject, "show_at_end", ht8Var.b);
        e5f.g(t7kVar, jSONObject, "show_at_start", ht8Var.c);
        e5f.g(t7kVar, jSONObject, "show_between", ht8Var.d);
        etn.m0(t7kVar, jSONObject, "style", ht8Var.e, t6fVar.e3);
        return jSONObject;
    }
}
