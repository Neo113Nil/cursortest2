package app.cash.local.views.internal;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.CardStyleItemViewKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class LocalBrandBannerKt$LocalBrandBanner$3$1$1$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ MutableState $isPressed$delegate;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ PressGestureScope L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LocalBrandBannerKt$LocalBrandBanner$3$1$1$1(MutableState mutableState, Continuation continuation, int i) {
        super(3, continuation);
        this.$r8$classId = i;
        this.$isPressed$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$isPressed$delegate;
        PressGestureScope pressGestureScope = (PressGestureScope) obj;
        Offset offset = (Offset) obj2;
        switch (i) {
            case 0:
                long j = offset.packedValue;
                LocalBrandBannerKt$LocalBrandBanner$3$1$1$1 localBrandBannerKt$LocalBrandBanner$3$1$1$1 = new LocalBrandBannerKt$LocalBrandBanner$3$1$1$1(mutableState, (Continuation) obj3, 0);
                localBrandBannerKt$LocalBrandBanner$3$1$1$1.L$0 = pressGestureScope;
                return localBrandBannerKt$LocalBrandBanner$3$1$1$1.invokeSuspend(Unit.INSTANCE);
            default:
                long j2 = offset.packedValue;
                LocalBrandBannerKt$LocalBrandBanner$3$1$1$1 localBrandBannerKt$LocalBrandBanner$3$1$1$12 = new LocalBrandBannerKt$LocalBrandBanner$3$1$1$1(mutableState, (Continuation) obj3, 1);
                localBrandBannerKt$LocalBrandBanner$3$1$1$12.L$0 = pressGestureScope;
                return localBrandBannerKt$LocalBrandBanner$3$1$1$12.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$isPressed$delegate;
        switch (i) {
            case 0:
                PressGestureScope pressGestureScope = this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState.setValue(Boolean.TRUE);
                    this.L$0 = null;
                    this.label = 1;
                    if (pressGestureScope.tryAwaitRelease(this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState.setValue(Boolean.FALSE);
                break;
            default:
                PressGestureScope pressGestureScope2 = this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    int i4 = CardStyleItemViewKt.$r8$clinit;
                    mutableState.setValue(Boolean.TRUE);
                    this.L$0 = null;
                    this.label = 1;
                    if (pressGestureScope2.tryAwaitRelease(this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                int i5 = CardStyleItemViewKt.$r8$clinit;
                mutableState.setValue(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }
}
