package com.squareup.cash.blockers.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.franklin.api.BlockerAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class GpsLocationConsentBlockerPresenter$models$1$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $isLoading$delegate;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ GpsLocationConsentBlockerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GpsLocationConsentBlockerPresenter$models$1$3$1(GpsLocationConsentBlockerPresenter gpsLocationConsentBlockerPresenter, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gpsLocationConsentBlockerPresenter;
        this.$isLoading$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GpsLocationConsentBlockerPresenter$models$1$3$1 gpsLocationConsentBlockerPresenter$models$1$3$1 = new GpsLocationConsentBlockerPresenter$models$1$3$1(this.this$0, this.$isLoading$delegate, continuation);
        gpsLocationConsentBlockerPresenter$models$1$3$1.L$0 = obj;
        return gpsLocationConsentBlockerPresenter$models$1$3$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GpsLocationConsentBlockerPresenter$models$1$3$1) create((BlockerAction.SubmitAction) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BlockerAction.SubmitAction submitAction = (BlockerAction.SubmitAction) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        MutableState mutableState = this.$isLoading$delegate;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            GpsLocationConsentBlockerPresenter gpsLocationConsentBlockerPresenter = this.this$0;
            JobKt.launch$default(gpsLocationConsentBlockerPresenter.scope, null, null, new GpsLocationConsentBlockerPresenter$models$1$1(gpsLocationConsentBlockerPresenter, null, 2), 3);
            mutableState.setValue(Boolean.TRUE);
            this.L$0 = null;
            this.label = 1;
            if (GpsLocationConsentBlockerPresenter.access$submitBlockerAction(gpsLocationConsentBlockerPresenter, submitAction, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        mutableState.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
