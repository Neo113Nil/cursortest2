package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class iyq {
    public final jyr a;
    public final jyr b = btf.b(new eyq(2, this));

    public iyq(o oVar) {
        this.a = btf.b(new eyq(1, oVar));
    }

    public final void a(boolean z, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1529894113);
        int i2 = (oq5Var.g(z) ? 4 : 2) | i | (oq5Var.h(this) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Boolean valueOf = Boolean.valueOf(z);
            int i3 = i2 & 14;
            boolean h = oq5Var.h(this) | (i3 == 4);
            Object K = oq5Var.K();
            Continuation continuation = null;
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                K = new ze1(this, z, continuation, 12);
                oq5Var.k0(K);
            }
            gld.w(oq5Var, valueOf, (Function2) K);
            kyf kyfVar = kyf.ON_START;
            boolean h2 = oq5Var.h(this) | (i3 == 4);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                K2 = new ps(this, z, 8);
                oq5Var.k0(K2);
            }
            tyf.b(kyfVar, null, (Function0) K2, oq5Var, 6);
            Unit unit = Unit.a;
            boolean h3 = oq5Var.h(this);
            Object K3 = oq5Var.K();
            if (h3 || K3 == kjnVar) {
                K3 = new kzp(16, this);
                oq5Var.k0(K3);
            }
            gld.k(unit, (Function1) K3, oq5Var);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wl3(this, z, i, 5);
        }
    }

    public final dyq b() {
        return (dyq) this.b.getValue();
    }
}
