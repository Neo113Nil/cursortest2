package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class ctw extends aur implements Function1 {
    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new ctw(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((ctw) create((Continuation) obj)).invokeSuspend(Unit.a);
        return h5b.a;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        return h5b.a;
    }
}
