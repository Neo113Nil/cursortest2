package ru.yandex.taxi.masstransit.ui.route.modal.collapsed;

import defpackage.ike;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oe30;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.masstransit.paymentcards.MtTransportCardSubscriber$TransportCardEventType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.ui.route.modal.collapsed.MtCollapsedRoutesPresenter$attachView$7", f = "MtCollapsedRoutesPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtCollapsedRoutesPresenter$attachView$7 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtCollapsedRoutesPresenter$attachView$7(Continuation continuation, d dVar) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtCollapsedRoutesPresenter$attachView$7(continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MtCollapsedRoutesPresenter$attachView$7 mtCollapsedRoutesPresenter$attachView$7 = (MtCollapsedRoutesPresenter$attachView$7) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mtCollapsedRoutesPresenter$attachView$7.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d dVar = this.this$0;
        ru.yandex.taxi.masstransit.paymentcards.c cVar = dVar.O;
        tse Jg = dVar.Jg();
        final d dVar2 = this.this$0;
        cVar.a((ike) Jg, new tls() { // from class: ru.yandex.taxi.masstransit.ui.route.modal.collapsed.a
            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                MtTransportCardSubscriber$TransportCardEventType mtTransportCardSubscriber$TransportCardEventType = (MtTransportCardSubscriber$TransportCardEventType) obj2;
                int i = oe30.a[mtTransportCardSubscriber$TransportCardEventType.ordinal()];
                boolean z = true;
                if (i != 1 && i != 2) {
                    if (i != 3) {
                        w511.b();
                        return null;
                    }
                    z = false;
                }
                d dVar3 = d.this;
                tje.N(dVar3.Jg(), null, null, new MtCollapsedRoutesPresenter$refreshPaymentData$1(dVar3, z, null), 3);
                tje.N(dVar3.Jg(), null, null, new MtCollapsedRoutesPresenter$showTransportCardNotification$1(dVar3, mtTransportCardSubscriber$TransportCardEventType, null), 3);
                return zy11.a;
            }
        });
        return zy11.a;
    }
}
