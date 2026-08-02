package unicorn.actors;

import defpackage.dez;
import defpackage.hwn;
import defpackage.ike;
import defpackage.oju0;
import defpackage.peo;
import defpackage.tje;
import defpackage.tww0;
import defpackage.yg20;
import defpackage.ygz;
import defpackage.zjr;
import java.util.Iterator;
import kotlin.collections.EmptyList;

/* loaded from: classes10.dex */
public final class a implements yg20, dez {
    public final Iterable a;
    public final ike b;
    public final zjr c = new zjr(new hwn(), EmptyList.a);

    public a(Iterable iterable, ike ikeVar) {
        this.a = iterable;
        this.b = ikeVar;
    }

    @Override // defpackage.dez
    public final zjr a() {
        return this.c;
    }

    @Override // defpackage.yg20
    public final void b(oju0 oju0Var, ygz ygzVar, peo peoVar) {
        ygzVar.a.invoke(peoVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            a aVar = this;
            oju0 oju0Var2 = oju0Var;
            peo peoVar2 = peoVar;
            tje.N(aVar.b, null, null, new SuspendActorMiddleware$apply$1(aVar, (tww0) it.next(), oju0Var2, peoVar2, null), 3);
            this = aVar;
            oju0Var = oju0Var2;
            peoVar = peoVar2;
        }
    }
}
