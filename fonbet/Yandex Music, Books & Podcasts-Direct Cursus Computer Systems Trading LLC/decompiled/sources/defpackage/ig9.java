package defpackage;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ig9 implements u8s {
    public final t6f a;

    public ig9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final of9 a(t7k t7kVar, gh9 gh9Var, JSONObject jSONObject) {
        c9c c9cVar = gh9Var.a;
        t6f t6fVar = this.a;
        rf9 rf9Var = (rf9) h4a.K(t7kVar, c9cVar, jSONObject, "center_x", t6fVar.q6, t6fVar.o6);
        if (rf9Var == null) {
            rf9Var = jg9.a;
        }
        rf9 rf9Var2 = (rf9) h4a.K(t7kVar, gh9Var.b, jSONObject, "center_y", t6fVar.q6, t6fVar.o6);
        if (rf9Var2 == null) {
            rf9Var2 = jg9.b;
        }
        List U = h4a.U(t7kVar, gh9Var.c, jSONObject, t6fVar.I6, t6fVar.G6, jg9.e);
        vzb S = h4a.S(t7kVar, gh9Var.d, jSONObject, vct.f, jg9.d);
        mg9 mg9Var = (mg9) h4a.K(t7kVar, gh9Var.e, jSONObject, "radius", t6fVar.w6, t6fVar.u6);
        if (mg9Var == null) {
            mg9Var = jg9.c;
        }
        return new of9(rf9Var, rf9Var2, U, S, mg9Var);
    }
}
