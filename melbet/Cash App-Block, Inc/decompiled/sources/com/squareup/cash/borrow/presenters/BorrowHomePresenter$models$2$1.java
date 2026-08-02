package com.squareup.cash.borrow.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.borrow.backend.BorrowError;
import com.squareup.cash.card.onboarding.CardModelView$iconTexture$$inlined$map$1;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.observability.types.ErrorReporter;
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
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class BorrowHomePresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $tiles$delegate;
    public ErrorReporter L$0;
    public int label;
    public final /* synthetic */ BorrowHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorrowHomePresenter$models$2$1(BorrowHomePresenter borrowHomePresenter, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = borrowHomePresenter;
        this.$tiles$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BorrowHomePresenter$models$2$1(this.this$0, this.$tiles$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BorrowHomePresenter$models$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r4, r6) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ErrorReporter errorReporter;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Duration.Companion companion = Duration.Companion;
            long duration = DurationKt.toDuration(2, DurationUnit.SECONDS);
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                errorReporter = this.L$0;
                SafeTrace.throwOnFailure(obj);
                errorReporter.report(new BorrowError.NoTiles(((Boolean) obj).booleanValue()), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                return Unit.INSTANCE;
            }
            SafeTrace.throwOnFailure(obj);
        }
        if (((List) this.$tiles$delegate.getValue()).isEmpty()) {
            BorrowHomePresenter borrowHomePresenter = this.this$0;
            ErrorReporter errorReporter2 = borrowHomePresenter.errorReporter;
            CardModelView$iconTexture$$inlined$map$1 cardModelView$iconTexture$$inlined$map$1 = new CardModelView$iconTexture$$inlined$map$1(borrowHomePresenter.borrowDataManager.syncValueReader.getSingleValue(AndroidSyncValueSpecs.BorrowData), 17);
            this.L$0 = errorReporter2;
            this.label = 2;
            obj = FlowKt.first(cardModelView$iconTexture$$inlined$map$1, this);
            if (obj != coroutineSingletons) {
                errorReporter = errorReporter2;
                errorReporter.report(new BorrowError.NoTiles(((Boolean) obj).booleanValue()), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
            }
            return coroutineSingletons;
        }
        return Unit.INSTANCE;
    }
}
