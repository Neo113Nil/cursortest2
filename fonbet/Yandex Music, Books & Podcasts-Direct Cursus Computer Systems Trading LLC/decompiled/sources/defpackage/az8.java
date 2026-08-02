package defpackage;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class az8 implements gip, py7 {
    public final t6f a;

    public az8(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [szb] */
    @Override // defpackage.py7
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final zy8 a(t7k t7kVar, JSONObject jSONObject) {
        ox8 ox8Var = vct.a;
        kzj kzjVar = kzj.B;
        ozb ozbVar = dz8.a;
        ns9 ns9Var = bcx.h;
        ?? e = e5f.e(t7kVar, jSONObject, "always_visible", ox8Var, kzjVar, ns9Var, ozbVar);
        if (e != 0) {
            ozbVar = e;
        }
        szb b = e5f.b(t7kVar, jSONObject, "pattern", vct.c, bcx.i, ns9Var);
        List S = etn.S(t7kVar, jSONObject, "pattern_elements", this.a.C3, dz8.b);
        Object opt = jSONObject.opt("raw_text_variable");
        if (opt == JSONObject.NULL) {
            opt = null;
        }
        if (opt != null) {
            return new zy8(ozbVar, b, S, (String) opt);
        }
        throw a8k.g("raw_text_variable", jSONObject);
    }

    @Override // defpackage.gip
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, zy8 zy8Var) {
        JSONObject jSONObject = new JSONObject();
        e5f.g(t7kVar, jSONObject, "always_visible", zy8Var.a);
        e5f.g(t7kVar, jSONObject, "pattern", zy8Var.b);
        etn.n0(t7kVar, jSONObject, "pattern_elements", zy8Var.c, this.a.C3);
        etn.l0(t7kVar, jSONObject, "raw_text_variable", zy8Var.d);
        etn.l0(t7kVar, jSONObject, "type", "fixed_length");
        return jSONObject;
    }
}
