package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class bci {
    public final boolean a;
    public final ka0 b;

    public bci(cci cciVar, jx7 jx7Var, Function1 function1, tm0 tm0Var, boolean z) {
        this.a = z;
        int i = 0;
        this.b = new ka0(cciVar, new zbi(jx7Var, i), new aci(jx7Var, i), tm0Var, function1);
        if (z && cciVar == cci.c) {
            xq0.x("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.");
            throw null;
        }
    }

    public static Object a(bci bciVar, cci cciVar, aur aurVar) {
        Object p = xp3.p(bciVar.b, cciVar, bciVar.b.k.e(), aurVar);
        return p == nm6.a ? p : Unit.a;
    }

    public final cci b() {
        return (cci) this.b.g.getValue();
    }

    public final cci c() {
        return (cci) this.b.h.getValue();
    }

    public final Object d(aur aurVar) {
        Object a = a(this, cci.a, aurVar);
        return a == nm6.a ? a : Unit.a;
    }

    public final boolean e() {
        return this.b.g.getValue() != cci.a;
    }

    public final Object f(aur aurVar) {
        ka0 ka0Var = this.b;
        j9h e = ka0Var.e();
        cci cciVar = cci.b;
        boolean containsKey = e.a.containsKey(cciVar);
        if (ybi.a[b().ordinal()] == 1) {
            j9h e2 = ka0Var.e();
            cci cciVar2 = cci.c;
            if (e2.a.containsKey(cciVar2)) {
                cciVar = cciVar2;
            }
        } else if (!containsKey) {
            cciVar = cci.a;
        }
        Object a = a(this, cciVar, aurVar);
        return a == nm6.a ? a : Unit.a;
    }
}
