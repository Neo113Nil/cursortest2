package ru.yandex.taxi.search.address.view;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.search.address.view.FullscreenDestinationSearchPresenter$selectShowingAnimation$1$minDelayJob$1", f = "FullscreenDestinationSearchPresenter.kt", l = {36}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class FullscreenDestinationSearchPresenter$selectShowingAnimation$1$minDelayJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $expandableAnimationMinDelay;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullscreenDestinationSearchPresenter$selectShowingAnimation$1$minDelayJob$1(long j, Continuation continuation) {
        super(2, continuation);
        this.$expandableAnimationMinDelay = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FullscreenDestinationSearchPresenter$selectShowingAnimation$1$minDelayJob$1(this.$expandableAnimationMinDelay, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FullscreenDestinationSearchPresenter$selectShowingAnimation$1$minDelayJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            long j = this.$expandableAnimationMinDelay;
            this.label = 1;
            if (kotlinx.coroutines.a.i(j, this) == coroutineSingletons) {
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
