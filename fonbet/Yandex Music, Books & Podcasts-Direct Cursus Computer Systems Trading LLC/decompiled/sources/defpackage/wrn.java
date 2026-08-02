package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class wrn extends aur implements Function2 {
    public final /* synthetic */ bsn j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wrn(bsn bsnVar, Continuation continuation) {
        super(2, continuation);
        this.j = bsnVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new wrn(this.j, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((wrn) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        this.j.c.e.a(null);
        return Unit.a;
    }
}
