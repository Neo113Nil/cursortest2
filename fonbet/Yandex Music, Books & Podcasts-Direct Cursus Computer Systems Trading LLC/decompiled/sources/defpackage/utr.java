package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class utr implements h5i, tqg {
    public final Iterable a;
    public final tf6 b;
    public final g06 c = new g06(new d5b(), c5b.a);

    public utr(Iterable iterable, tf6 tf6Var) {
        this.a = iterable;
        this.b = tf6Var;
    }

    @Override // defpackage.tqg
    public final g06 a() {
        return this.c;
    }

    @Override // defpackage.h5i
    public final void b(cir cirVar, usg usgVar, ohb ohbVar) {
        usgVar.a.invoke(ohbVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            cir cirVar2 = cirVar;
            ohb ohbVar2 = ohbVar;
            x97.y(this.b, null, null, new lco(this, (ttr) it.next(), cirVar2, ohbVar2, (Continuation) null, 15), 3);
            cirVar = cirVar2;
            ohbVar = ohbVar2;
        }
    }
}
