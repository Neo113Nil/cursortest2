package defpackage;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class kx9 implements gip, py7 {
    public final t6f a;

    public kx9(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [szb] */
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        List S = etn.S(t7kVar, jSONObject, "actions", this.a.t1, mx9.c);
        ox8 ox8Var = vct.a;
        kzj kzjVar = kzj.B;
        ns9 ns9Var = bcx.h;
        szb b = e5f.b(t7kVar, jSONObject, "condition", ox8Var, kzjVar, ns9Var);
        tct tctVar = mx9.b;
        vq9 vq9Var = vq9.A0;
        ozb ozbVar = mx9.a;
        ?? e = e5f.e(t7kVar, jSONObject, "mode", tctVar, vq9Var, ns9Var, ozbVar);
        if (e != 0) {
            ozbVar = e;
        }
        return new ix9(S, b, ozbVar);
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, ix9 ix9Var) {
        JSONObject jSONObject = new JSONObject();
        etn.n0(t7kVar, jSONObject, "actions", ix9Var.a, this.a.t1);
        e5f.g(t7kVar, jSONObject, "condition", ix9Var.b);
        szb szbVar = ix9Var.c;
        if (szbVar == null) {
            return jSONObject;
        }
        Object b = szbVar.b();
        try {
            if (szbVar instanceof pzb) {
                jSONObject.put("mode", b);
                return jSONObject;
            }
            jSONObject.put("mode", ((hx9) b).a);
            return jSONObject;
        } catch (JSONException e) {
            t7kVar.a().a(e);
            return jSONObject;
        }
    }
}
