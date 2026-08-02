package defpackage;

import androidx.compose.material3.internal.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class zcq {
    public final boolean a;
    public final ia0 b;

    public zcq(boolean z, jx7 jx7Var, gdq gdqVar, Function1 function1) {
        this.a = z;
        if (z && gdqVar == gdq.c) {
            xq0.x("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
            throw null;
        }
        int i = 1;
        this.b = new ia0(gdqVar, new zbi(jx7Var, i), new aci(jx7Var, i), bcq.a, function1);
    }

    public static Object a(zcq zcqVar, gdq gdqVar, aur aurVar) {
        ia0 ia0Var = zcqVar.b;
        Object b = a.b(ia0Var, gdqVar, ((t6k) ia0Var.m).e(), aurVar);
        return b == nm6.a ? b : Unit.a;
    }

    public final Object b(aur aurVar) {
        Object a = a(this, gdq.a, aurVar);
        return a == nm6.a ? a : Unit.a;
    }

    public final boolean c() {
        return ((x6k) this.b.g).getValue() != gdq.a;
    }

    public final Object d(aur aurVar) {
        if (this.a) {
            xq0.q("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
            return null;
        }
        Object a = a(this, gdq.c, aurVar);
        return a == nm6.a ? a : Unit.a;
    }
}
