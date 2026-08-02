package ru.yandex.taxi.combo.ui;

import defpackage.bax0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.combo.ui.TravelCompanionStatusView$startTimer$1", f = "TravelCompanionStatusView.kt", l = {265}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class TravelCompanionStatusView$startTimer$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $endTime;
    int label;
    final /* synthetic */ TravelCompanionStatusView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelCompanionStatusView$startTimer$1(long j, TravelCompanionStatusView travelCompanionStatusView, Continuation continuation) {
        super(2, continuation);
        this.$endTime = j;
        this.this$0 = travelCompanionStatusView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TravelCompanionStatusView$startTimer$1(this.$endTime, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TravelCompanionStatusView$startTimer$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            rol0 a = ru.yandex.taxi.clock.a.a(this.$endTime);
            bax0 bax0Var = new bax0(29, this.this$0);
            this.label = 1;
            if (a.collect(bax0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
