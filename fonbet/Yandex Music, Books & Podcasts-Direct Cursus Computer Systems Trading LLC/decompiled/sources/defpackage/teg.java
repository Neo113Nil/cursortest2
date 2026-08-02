package defpackage;

import com.yandex.passport.internal.ui.bouncer.roundabout.k;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.a;

/* loaded from: classes5.dex */
public final class teg implements df {
    public final t4a a;
    public final k b;
    public final a c;
    public final a d;
    public final tf6 e;

    public teg(t4a t4aVar, k kVar, a aVar, a aVar2, tf6 tf6Var) {
        t4aVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.a = t4aVar;
        this.b = kVar;
        this.c = aVar;
        this.d = aVar2;
        this.e = tf6Var;
    }

    @Override // defpackage.df
    public final void b(md mdVar, dn9 dn9Var) {
        reg regVar = (reg) mdVar;
        regVar.getClass();
        boolean z = regVar.b;
        Continuation continuation = null;
        tf6 tf6Var = this.e;
        if (z) {
            x97.y(tf6Var, this.d, null, new akc(this, regVar, dn9Var, continuation, 26), 2);
        } else {
            x97.y(tf6Var, this.c, null, new seg(dn9Var, regVar, continuation, 0), 2);
        }
    }
}
