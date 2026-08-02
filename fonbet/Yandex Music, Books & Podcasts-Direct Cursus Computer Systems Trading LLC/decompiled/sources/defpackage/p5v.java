package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class p5v extends aur implements Function2 {
    public /* synthetic */ Object j;

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        p5v p5vVar = new p5v(2, continuation);
        p5vVar.j = obj;
        return p5vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p5v) create((lpi) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        lpi lpiVar = (lpi) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        lpiVar.g(r5v.b, Boolean.TRUE);
        return Unit.a;
    }
}
