package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bf8 implements u8s {
    public final t6f a;

    public bf8(t6f t6fVar) {
        this.a = t6fVar;
    }

    @Override // defpackage.u8s
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ye8 a(t7k t7kVar, ef8 ef8Var, JSONObject jSONObject) {
        boolean z = ef8Var instanceof cf8;
        t6f t6fVar = this.a;
        if (z) {
            xd6 xd6Var = (xd6) t6fVar.u.getValue();
            yd6 yd6Var = ((cf8) ef8Var).a;
            xd6Var.getClass();
            return new we8(new ud6(h4a.F(t7kVar, yd6Var.a, jSONObject, Constants.KEY_VALUE, vct.c)));
        }
        if (!(ef8Var instanceof df8)) {
            b6e.s();
            return null;
        }
        je6 je6Var = (je6) t6fVar.x.getValue();
        ke6 ke6Var = ((df8) ef8Var).a;
        je6Var.getClass();
        return new xe8(new ge6(h4a.G(t7kVar, ke6Var.a, jSONObject, Constants.KEY_VALUE, vct.e, kzj.C)));
    }
}
