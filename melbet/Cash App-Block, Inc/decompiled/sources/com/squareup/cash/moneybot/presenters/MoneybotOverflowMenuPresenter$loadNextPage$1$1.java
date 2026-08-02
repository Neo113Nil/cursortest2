package com.squareup.cash.moneybot.presenters;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
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

/* loaded from: classes6.dex */
public final class MoneybotOverflowMenuPresenter$loadNextPage$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ CardLockPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoneybotOverflowMenuPresenter$loadNextPage$1$1(CardLockPresenter cardLockPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = cardLockPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        CardLockPresenter cardLockPresenter = this.this$0;
        switch (i) {
            case 0:
                return new MoneybotOverflowMenuPresenter$loadNextPage$1$1(cardLockPresenter, continuation, 0);
            default:
                return new MoneybotOverflowMenuPresenter$loadNextPage$1$1(cardLockPresenter, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((MoneybotOverflowMenuPresenter$loadNextPage$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        CardLockPresenter cardLockPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Duration.Companion companion = Duration.Companion;
                    long duration = DurationKt.toDuration(3, DurationUnit.SECONDS);
                    this.label = 1;
                    if (JobKt.m4182delayVtjQ1oo(duration, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                ((ParcelableSnapshotMutableState) cardLockPresenter.stringManager).setValue(null);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Duration.Companion companion2 = Duration.Companion;
                    long duration2 = DurationKt.toDuration(3, DurationUnit.SECONDS);
                    this.label = 1;
                    if (JobKt.m4182delayVtjQ1oo(duration2, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                ((ParcelableSnapshotMutableState) cardLockPresenter.stringManager).setValue(null);
                break;
        }
        return Unit.INSTANCE;
    }
}
