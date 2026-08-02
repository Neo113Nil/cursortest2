package app.cash.local.presenters;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class RealOrderBuilder$models$onEvent$1$1$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ State $cart$delegate;
    public final /* synthetic */ MutableState $discountCodesError$delegate;
    public final /* synthetic */ State $fulfillment$delegate;
    public final /* synthetic */ MutableState $giftCardError$delegate;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $selectedRewardToken$delegate;
    public final /* synthetic */ MutableState $updatingCart$delegate;
    public int label;
    public final /* synthetic */ RealOrderBuilder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealOrderBuilder$models$onEvent$1$1$2(RealOrderBuilder realOrderBuilder, MutableState mutableState, State state, MutableState mutableState2, State state2, MutableState mutableState3, MutableState mutableState4, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realOrderBuilder;
        this.$updatingCart$delegate = mutableState;
        this.$fulfillment$delegate = state;
        this.$selectedRewardToken$delegate = mutableState2;
        this.$cart$delegate = state2;
        this.$giftCardError$delegate = mutableState3;
        this.$discountCodesError$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new RealOrderBuilder$models$onEvent$1$1$2(this.this$0, this.$updatingCart$delegate, this.$fulfillment$delegate, this.$selectedRewardToken$delegate, this.$cart$delegate, this.$giftCardError$delegate, this.$discountCodesError$delegate, continuation, 0);
            default:
                return new RealOrderBuilder$models$onEvent$1$1$2(this.this$0, this.$updatingCart$delegate, this.$fulfillment$delegate, this.$selectedRewardToken$delegate, this.$cart$delegate, this.$giftCardError$delegate, this.$discountCodesError$delegate, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealOrderBuilder$models$onEvent$1$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (RealOrderBuilder.access$models$updateCart(this.this$0, this.$updatingCart$delegate, this.$fulfillment$delegate, this.$selectedRewardToken$delegate, this.$cart$delegate, this.$giftCardError$delegate, this.$discountCodesError$delegate, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (RealOrderBuilder.access$models$updateCart(this.this$0, this.$updatingCart$delegate, this.$fulfillment$delegate, this.$selectedRewardToken$delegate, this.$cart$delegate, this.$giftCardError$delegate, this.$discountCodesError$delegate, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
