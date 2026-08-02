package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class jgd extends aur implements Function1 {
    public final /* synthetic */ ygd j;
    public final /* synthetic */ double k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgd(ygd ygdVar, double d, Continuation continuation) {
        super(1, continuation);
        this.j = ygdVar;
        this.k = d;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new jgd(this.j, this.k, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((jgd) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        return new mgd(this.j, new Double(this.k));
    }
}
