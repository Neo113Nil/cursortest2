package app.cash.local.views.internal;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.shopping.views.ShoppingWebContainerViewKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class CartItemCounterViewKt$CartItemCounterView$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $expanded$delegate;
    public final /* synthetic */ ParcelableSnapshotMutableIntState $interactionTrigger$delegate;
    public final /* synthetic */ int $r8$classId = 2;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartItemCounterViewKt$CartItemCounterView$1$1(int i, MutableState mutableState, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, Continuation continuation) {
        super(2, continuation);
        this.label = i;
        this.$interactionTrigger$delegate = parcelableSnapshotMutableIntState;
        this.$expanded$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new CartItemCounterViewKt$CartItemCounterView$1$1(this.$interactionTrigger$delegate, this.$expanded$delegate, continuation);
            case 1:
                return new CartItemCounterViewKt$CartItemCounterView$1$1(this.$expanded$delegate, this.$interactionTrigger$delegate, continuation);
            default:
                return new CartItemCounterViewKt$CartItemCounterView$1$1(this.label, this.$expanded$delegate, this.$interactionTrigger$delegate, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CartItemCounterViewKt$CartItemCounterView$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$expanded$delegate;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.$interactionTrigger$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (parcelableSnapshotMutableIntState.getIntValue() != 0) {
                        mutableState.setValue(Boolean.TRUE);
                        Duration.Companion companion = Duration.Companion;
                        long duration = DurationKt.toDuration(3, DurationUnit.SECONDS);
                        this.label = 1;
                        if (JobKt.m4182delayVtjQ1oo(duration, this) == coroutineSingletons) {
                            break;
                        }
                    } else {
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
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (JobKt.delay(500L, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                int i4 = ShoppingWebContainerViewKt.$r8$clinit;
                mutableState.setValue(Boolean.FALSE);
                parcelableSnapshotMutableIntState.setIntValue(0);
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                int i5 = this.label;
                if (i5 != parcelableSnapshotMutableIntState.getIntValue()) {
                    parcelableSnapshotMutableIntState.setIntValue(i5);
                    mutableState.setValue(Boolean.TRUE);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartItemCounterViewKt$CartItemCounterView$1$1(MutableState mutableState, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, Continuation continuation) {
        super(2, continuation);
        this.$expanded$delegate = mutableState;
        this.$interactionTrigger$delegate = parcelableSnapshotMutableIntState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartItemCounterViewKt$CartItemCounterView$1$1(ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$interactionTrigger$delegate = parcelableSnapshotMutableIntState;
        this.$expanded$delegate = mutableState;
    }
}
