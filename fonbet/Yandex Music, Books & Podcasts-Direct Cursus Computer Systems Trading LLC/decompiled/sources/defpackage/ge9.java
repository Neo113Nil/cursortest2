package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ge9 implements u8s {
    public final t6f a;

    public ge9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final xd9 a(t7k t7kVar, oe9 oe9Var, JSONObject jSONObject) {
        boolean z = oe9Var instanceof me9;
        t6f t6fVar = this.a;
        if (z) {
            be9 be9Var = (be9) t6fVar.e6.getValue();
            de9 de9Var = ((me9) oe9Var).a;
            be9Var.getClass();
            return new vd9(be9.b(t7kVar, de9Var, jSONObject));
        }
        if (!(oe9Var instanceof ne9)) {
            b6e.s();
            return null;
        }
        ke9 ke9Var = (ke9) t6fVar.h6.getValue();
        le9 le9Var = ((ne9) oe9Var).a;
        ke9Var.getClass();
        return new wd9(new he9(h4a.G(t7kVar, le9Var.a, jSONObject, Constants.KEY_VALUE, vct.d, kzj.E)));
    }
}
