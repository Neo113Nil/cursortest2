package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class pg9 implements u8s {
    public final t6f a;

    public pg9(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final mg9 a(t7k t7kVar, sg9 sg9Var, JSONObject jSONObject) {
        boolean z = sg9Var instanceof qg9;
        t6f t6fVar = this.a;
        if (z) {
            mz8 mz8Var = (mz8) t6fVar.H3.getValue();
            oz8 oz8Var = ((qg9) sg9Var).a;
            mz8Var.getClass();
            return new kg9(mz8.b(t7kVar, oz8Var, jSONObject));
        }
        if (!(sg9Var instanceof rg9)) {
            b6e.s();
            return null;
        }
        ch9 ch9Var = (ch9) t6fVar.C6.getValue();
        eh9 eh9Var = ((rg9) sg9Var).a;
        ch9Var.getClass();
        return new lg9(new zg9(h4a.G(t7kVar, eh9Var.a, jSONObject, Constants.KEY_VALUE, dh9.a, gd9.y)));
    }
}
