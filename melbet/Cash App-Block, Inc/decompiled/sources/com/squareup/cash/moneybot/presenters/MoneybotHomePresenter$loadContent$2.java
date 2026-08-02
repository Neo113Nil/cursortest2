package com.squareup.cash.moneybot.presenters;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper;
import com.squareup.cash.moneybot.backend.real.managers.RealMoneybotPromptManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class MoneybotHomePresenter$loadContent$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ MoneybotHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoneybotHomePresenter$loadContent$2(MoneybotHomePresenter moneybotHomePresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = moneybotHomePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new MoneybotHomePresenter$loadContent$2(this.this$0, continuation, 0);
            default:
                return new MoneybotHomePresenter$loadContent$2(this.this$0, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((MoneybotHomePresenter$loadContent$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MoneybotHomePresenter moneybotHomePresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealMoneybotPromptManager realMoneybotPromptManager = (RealMoneybotPromptManager) moneybotHomePresenter.moneybotPromptManager;
                    this.label = 1;
                    if (realMoneybotPromptManager.refreshPrompts(this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    long loadingDelayMs = ((MoneybotFlagsHelper) moneybotHomePresenter.moneybotFlagsHelper).loadingDelayMs();
                    this.label = 1;
                    if (JobKt.delay(loadingDelayMs, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                if (moneybotHomePresenter.isContentLoading()) {
                    ((ParcelableSnapshotMutableState) moneybotHomePresenter.contentExceededLoadTime$delegate).setValue(Boolean.TRUE);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
