package ru.yandex.taxi.masstransit.ui.route.modal.collapsed;

import android.content.Context;
import defpackage.avj0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qn5;
import defpackage.tj60;
import defpackage.tse;
import defpackage.wls;
import defpackage.ypb1;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.masstransit.paymentcards.MtTransportCardNotification;
import ru.yandex.taxi.masstransit.paymentcards.MtTransportCardSubscriber$TransportCardEventType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.ui.route.modal.collapsed.MtCollapsedRoutesPresenter$showTransportCardNotification$1", f = "MtCollapsedRoutesPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtCollapsedRoutesPresenter$showTransportCardNotification$1 extends SuspendLambda implements wls {
    final /* synthetic */ MtTransportCardSubscriber$TransportCardEventType $eventType;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtCollapsedRoutesPresenter$showTransportCardNotification$1(d dVar, MtTransportCardSubscriber$TransportCardEventType mtTransportCardSubscriber$TransportCardEventType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$eventType = mtTransportCardSubscriber$TransportCardEventType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtCollapsedRoutesPresenter$showTransportCardNotification$1(this.this$0, this.$eventType, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MtCollapsedRoutesPresenter$showTransportCardNotification$1 mtCollapsedRoutesPresenter$showTransportCardNotification$1 = (MtCollapsedRoutesPresenter$showTransportCardNotification$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mtCollapsedRoutesPresenter$showTransportCardNotification$1.invokeSuspend(zy11Var);
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
        tj60 tj60Var = dVar.R;
        Context context = dVar.U;
        zuj0 zuj0Var = dVar.S;
        Integer c = ypb1.c(this.$eventType);
        if (c != null) {
            String h = ((avj0) zuj0Var).h(c.intValue());
            MtTransportCardNotification mtTransportCardNotification = new MtTransportCardNotification(context, null, 0, 6, null);
            mtTransportCardNotification.setTitle(h);
            mtTransportCardNotification.setExpiresListener(new qn5(9, tj60Var, mtTransportCardNotification));
            tj60Var.d(mtTransportCardNotification);
        }
        return zy11.a;
    }
}
