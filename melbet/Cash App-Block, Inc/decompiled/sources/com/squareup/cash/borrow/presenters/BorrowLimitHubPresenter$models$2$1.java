package com.squareup.cash.borrow.presenters;

import androidx.compose.runtime.MutableState;
import app.cash.local.presenters.LocalEditorialPresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.borrow.backend.BorrowError;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.protos.lending.sync_values.BorrowLimitHubData;
import java.util.List;
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

/* loaded from: classes5.dex */
public final class BorrowLimitHubPresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $limitHubData$delegate;
    public int label;
    public final /* synthetic */ LocalEditorialPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorrowLimitHubPresenter$models$2$1(LocalEditorialPresenter localEditorialPresenter, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = localEditorialPresenter;
        this.$limitHubData$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BorrowLimitHubPresenter$models$2$1(this.this$0, this.$limitHubData$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BorrowLimitHubPresenter$models$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Duration.Companion companion = Duration.Companion;
            long duration = DurationKt.toDuration(2, DurationUnit.SECONDS);
            this.label = 1;
            if (JobKt.m4182delayVtjQ1oo(duration, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        MutableState mutableState = this.$limitHubData$delegate;
        BorrowLimitHubData borrowLimitHubData = (BorrowLimitHubData) mutableState.getValue();
        List list = borrowLimitHubData != null ? borrowLimitHubData.sections : null;
        if (list == null || list.isEmpty()) {
            ((ErrorReporter) this.this$0.clock).report(new BorrowError.NoLimitHubSections(((BorrowLimitHubData) mutableState.getValue()) != null), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
