package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class rhl implements pjc {
    public final /* synthetic */ qm a;
    public final /* synthetic */ n7q b;
    public final /* synthetic */ kml c;
    public final /* synthetic */ thl d;
    public final /* synthetic */ g08 e;

    public rhl(qm qmVar, n7q n7qVar, kml kmlVar, thl thlVar, g08 g08Var) {
        this.a = qmVar;
        this.b = n7qVar;
        this.c = kmlVar;
        this.d = thlVar;
        this.e = g08Var;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        Object collect = this.a.collect(new s3(rjcVar, this.b, this.c, this.d, this.e), continuation);
        return collect == nm6.a ? collect : Unit.a;
    }
}
