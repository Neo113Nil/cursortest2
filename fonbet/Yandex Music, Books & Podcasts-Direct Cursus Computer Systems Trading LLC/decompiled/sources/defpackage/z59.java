package defpackage;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class z59 implements u8s {
    public final t6f a;

    public z59(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final v59 a(t7k t7kVar, d69 d69Var, JSONObject jSONObject) {
        ns9 ns9Var = bcx.h;
        s3f s3fVar = bcx.i;
        boolean z = d69Var instanceof b69;
        t6f t6fVar = this.a;
        if (z) {
            return new t59(((cz8) t6fVar.B3.getValue()).a(t7kVar, ((b69) d69Var).a, jSONObject));
        }
        if (d69Var instanceof a69) {
            wu8 wu8Var = (wu8) t6fVar.J2.getValue();
            xu8 xu8Var = ((a69) d69Var).a;
            wu8Var.getClass();
            return new s59(new tu8(h4a.N(t7kVar, xu8Var.a, jSONObject, CommonUrlParts.LOCALE, vct.c), (String) h4a.C(xu8Var.b, jSONObject, "raw_text_variable", s3fVar, ns9Var)));
        }
        if (!(d69Var instanceof c69)) {
            b6e.s();
            return null;
        }
        td9 td9Var = (td9) t6fVar.b6.getValue();
        ud9 ud9Var = ((c69) d69Var).a;
        td9Var.getClass();
        return new u59(new qd9((String) h4a.C(ud9Var.a, jSONObject, "raw_text_variable", s3fVar, ns9Var)));
    }
}
