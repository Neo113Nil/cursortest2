package defpackage;

import android.content.Context;
import com.google.android.gms.common.b;
import com.google.android.gms.internal.mlkit_vision_face.n;

/* loaded from: classes.dex */
public final class zl91 extends t4y {
    public final qk20 b;

    public zl91(qk20 qk20Var) {
        this.b = qk20Var;
    }

    @Override // defpackage.t4y
    public final Object a(Object obj) {
        g891 sl41Var;
        r7p r7pVar = (r7p) obj;
        Context b = this.b.b();
        n e = y9b1.e(aga1.b());
        if (!sl41.b(b)) {
            b.b.getClass();
            if (b.a(b) < 204500000) {
                sl41Var = new mdl0(b, r7pVar, e);
                return new j3a1(y9b1.e(aga1.b()), r7pVar, sl41Var);
            }
        }
        sl41Var = new sl41(b, r7pVar, e);
        return new j3a1(y9b1.e(aga1.b()), r7pVar, sl41Var);
    }
}
