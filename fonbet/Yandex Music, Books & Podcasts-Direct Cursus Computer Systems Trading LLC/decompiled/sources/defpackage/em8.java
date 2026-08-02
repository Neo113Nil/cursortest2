package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class em8 implements u8s {
    public final t6f a;

    public em8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final bm8 a(t7k t7kVar, fm8 fm8Var, JSONObject jSONObject) {
        c9c c9cVar = fm8Var.a;
        ox8 ox8Var = vct.c;
        szb I = h4a.I(t7kVar, c9cVar, jSONObject, "path", jf0.n);
        c9c c9cVar2 = fm8Var.b;
        t6f t6fVar = this.a;
        return new bm8(I, (wx9) h4a.D(t7kVar, c9cVar2, jSONObject, Constants.KEY_VALUE, t6fVar.H9, t6fVar.F9), h4a.F(t7kVar, fm8Var.c, jSONObject, "variable_name", ox8Var));
    }
}
