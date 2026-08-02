package com.squareup.cash.card.onboarding;

import com.google.android.filament.View;
import com.squareup.cash.graphics.backend.math.Quat;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardModelView$colorGradient$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ CardModelView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardModelView$colorGradient$2(int i, CardModelView cardModelView, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = cardModelView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        CardModelView cardModelView = this.this$0;
        switch (i) {
            case 0:
                CardModelView$colorGradient$2 cardModelView$colorGradient$2 = new CardModelView$colorGradient$2(0, cardModelView, continuation);
                cardModelView$colorGradient$2.L$0 = obj;
                return cardModelView$colorGradient$2;
            case 1:
                CardModelView$colorGradient$2 cardModelView$colorGradient$22 = new CardModelView$colorGradient$2(1, cardModelView, continuation);
                cardModelView$colorGradient$22.L$0 = obj;
                return cardModelView$colorGradient$22;
            default:
                CardModelView$colorGradient$2 cardModelView$colorGradient$23 = new CardModelView$colorGradient$2(2, cardModelView, continuation);
                cardModelView$colorGradient$23.L$0 = obj;
                return cardModelView$colorGradient$23;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((CardModelView$colorGradient$2) create((Quat) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        View view;
        int i = this.$r8$classId;
        CardModelView cardModelView = this.this$0;
        Object obj2 = this.L$0;
        switch (i) {
            case 0:
                Triple triple = (Triple) obj2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                float floatValue = ((Number) triple.first).floatValue();
                float floatValue2 = ((Number) triple.second).floatValue();
                float floatValue3 = ((Number) triple.third).floatValue();
                cardModelView.vibrance = floatValue;
                cardModelView.contrast = floatValue2;
                cardModelView.saturation = floatValue3;
                if (cardModelView.engine != null && cardModelView.getEngine().isValid() && cardModelView.renderSessionTracker.prefetchDistance != 0 && (view = cardModelView.view) != null) {
                    if (view == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("view");
                        throw null;
                    }
                    cardModelView.updateColorGrading(view);
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                cardModelView.setCardRotation((Quat) obj2);
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                cardModelView.setCardRotation((Quat) obj2);
                return Unit.INSTANCE;
        }
    }
}
