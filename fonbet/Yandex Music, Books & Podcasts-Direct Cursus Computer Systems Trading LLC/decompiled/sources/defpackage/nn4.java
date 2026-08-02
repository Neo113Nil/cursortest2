package defpackage;

import android.view.KeyEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public class nn4 extends s5 {
    @Override // defpackage.s5
    public final Object W0(pfm pfmVar, Continuation continuation) {
        mn4 mn4Var = new mn4(this, null, 0);
        m40 m40Var = new m40(21, this);
        kr3 kr3Var = g6s.a;
        Object Q = gld.Q(new inr(pfmVar, mn4Var, m40Var, new pqm(pfmVar), (Continuation) null), continuation);
        nm6 nm6Var = nm6.a;
        if (Q != nm6Var) {
            Q = Unit.a;
        }
        return Q == nm6Var ? Q : Unit.a;
    }

    @Override // defpackage.s5
    public final boolean a1(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.s5
    public final void b1(KeyEvent keyEvent) {
        this.v.invoke();
    }
}
