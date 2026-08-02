package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class x9n extends aur implements Function1 {
    public final /* synthetic */ u4d j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9n(u4d u4dVar, Continuation continuation) {
        super(1, continuation);
        this.j = u4dVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new x9n(this.j, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((x9n) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        return this.j;
    }
}
