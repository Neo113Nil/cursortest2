package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ej9 implements gip, py7 {
    public final t6f a;

    public ej9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [szb] */
    /* JADX WARN: Type inference failed for: r3v1, types: [szb] */
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.d;
        kzj kzjVar = kzj.E;
        mb9 mb9Var = gj9.d;
        ozb ozbVar = gj9.a;
        ?? e = e5f.e(t7kVar, jSONObject, "alpha", ox8Var, kzjVar, mb9Var, ozbVar);
        if (e != 0) {
            ozbVar = e;
        }
        ox8 ox8Var2 = vct.b;
        kzj kzjVar2 = kzj.F;
        mb9 mb9Var2 = gj9.e;
        ozb ozbVar2 = gj9.b;
        szb e2 = e5f.e(t7kVar, jSONObject, "blur", ox8Var2, kzjVar2, mb9Var2, ozbVar2);
        if (e2 == null) {
            e2 = ozbVar2;
        }
        ox8 ox8Var3 = vct.f;
        kzj kzjVar3 = kzj.G;
        ozb ozbVar3 = gj9.c;
        ?? e3 = e5f.e(t7kVar, jSONObject, "color", ox8Var3, kzjVar3, bcx.h, ozbVar3);
        if (e3 != 0) {
            ozbVar3 = e3;
        }
        return new dj9(ozbVar, e2, ozbVar3, (bf9) etn.O(t7kVar, jSONObject, "offset", this.a.l6));
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, dj9 dj9Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "alpha", dj9Var.a);
        e5f.g(t7kVar, jSONObject, "blur", dj9Var.b);
        szb szbVar = dj9Var.c;
        if (szbVar != null) {
            Object b = szbVar.b();
            try {
                if (szbVar instanceof pzb) {
                    jSONObject.put("color", b);
                } else {
                    jSONObject.put("color", c85.a(((Number) b).intValue()));
                }
            } catch (JSONException e) {
                t7kVar.a().a(e);
            }
        }
        etn.m0(t7kVar, jSONObject, "offset", dj9Var.d, this.a.l6);
        return jSONObject;
    }
}
