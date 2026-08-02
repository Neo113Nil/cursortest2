package ru.yandex.taxi.communications.ticket.ui;

import defpackage.j3z0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.communications.ticket.ui.TicketScreenKt$TicketScreen$1$1", f = "TicketScreen.kt", l = {HProv.PP_HASHOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TicketScreenKt$TicketScreen$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $handleAction;
    final /* synthetic */ oz40 $isConfettiDelayCompleted$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TicketScreenKt$TicketScreen$1$1(tls tlsVar, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$handleAction = tlsVar;
        this.$isConfettiDelayCompleted$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TicketScreenKt$TicketScreen$1$1(this.$handleAction, this.$isConfettiDelayCompleted$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TicketScreenKt$TicketScreen$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            this.$handleAction.invoke(j3z0.b);
            this.label = 1;
            if (kotlinx.coroutines.a.i(900L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        this.$isConfettiDelayCompleted$delegate.setValue(Boolean.TRUE);
        return zy11.a;
    }
}
