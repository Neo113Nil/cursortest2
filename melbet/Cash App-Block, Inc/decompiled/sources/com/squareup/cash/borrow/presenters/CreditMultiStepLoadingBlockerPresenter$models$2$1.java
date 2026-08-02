package com.squareup.cash.borrow.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.franklin.api.CreditMultiStepLoadingBlocker;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class CreditMultiStepLoadingBlockerPresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $currentStep$delegate;
    public int I$0;
    public MutableState L$1;
    public Iterator L$2;
    public int label;
    public final /* synthetic */ CreditMultiStepLoadingBlockerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditMultiStepLoadingBlockerPresenter$models$2$1(CreditMultiStepLoadingBlockerPresenter creditMultiStepLoadingBlockerPresenter, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = creditMultiStepLoadingBlockerPresenter;
        this.$currentStep$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CreditMultiStepLoadingBlockerPresenter$models$2$1(this.this$0, this.$currentStep$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CreditMultiStepLoadingBlockerPresenter$models$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r8, r12) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        if (com.squareup.cash.borrow.presenters.CreditMultiStepLoadingBlockerPresenter.access$finish(r2, r12) == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006d -> B:12:0x0070). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        MutableState mutableState;
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        CreditMultiStepLoadingBlockerPresenter creditMultiStepLoadingBlockerPresenter = this.this$0;
        if (i2 == 0) {
            SafeTrace.throwOnFailure(obj);
            Iterator it2 = creditMultiStepLoadingBlockerPresenter.args.data.loading_steps.iterator();
            i = 0;
            mutableState = this.$currentStep$delegate;
            it = it2;
            if (it.hasNext()) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = this.I$0;
        it = this.L$2;
        mutableState = this.L$1;
        SafeTrace.throwOnFailure(obj);
        mutableState.setValue(Integer.valueOf(((Number) mutableState.getValue()).intValue() + 1));
        if (it.hasNext()) {
            CreditMultiStepLoadingBlocker.LoadingStep loadingStep = (CreditMultiStepLoadingBlocker.LoadingStep) it.next();
            Long l = loadingStep.waiting_time;
            long longValue = l != null ? l.longValue() : 0L;
            Timber.Forest.v("Loading step: %s, %dms", loadingStep.text, new Long(longValue));
            this.L$1 = mutableState;
            this.L$2 = it;
            this.I$0 = i;
            this.label = 1;
        } else {
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
        }
        return coroutineSingletons;
    }
}
