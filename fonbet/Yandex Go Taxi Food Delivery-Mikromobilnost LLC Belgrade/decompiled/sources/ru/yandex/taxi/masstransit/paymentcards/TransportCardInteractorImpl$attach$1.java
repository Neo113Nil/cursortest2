package ru.yandex.taxi.masstransit.paymentcards;

import defpackage.bax0;
import defpackage.g610;
import defpackage.jiz0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.paymentcards.TransportCardInteractorImpl$attach$1", f = "TransportCardInteractorImpl.kt", l = {64}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TransportCardInteractorImpl$attach$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $srcAddressFlow;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransportCardInteractorImpl$attach$1(d dVar, tpr tprVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$srcAddressFlow = tprVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransportCardInteractorImpl$attach$1(this.this$0, this.$srcAddressFlow, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransportCardInteractorImpl$attach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            tpr tprVar = this.$srcAddressFlow;
            this.label = 1;
            g610 g610Var = dVar.e;
            if (e.s(new m0(e.p(new mth(new ru.yandex.taxi.masstransit.paymentcards.experiment.d(new ru.yandex.taxi.masstransit.paymentcards.experiment.b(ru.yandex.taxi.experiments.d.a(g610Var.b), g610Var), g610Var), 4), 250L), tprVar, new TransportCardInteractorImpl$forceUpdatePaymentOptions$2(3, null)), new jiz0(14)).collect(new bax0(26, dVar), this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
