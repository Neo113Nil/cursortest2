package com.squareup.cash.afterpayapplet.presenters;

import androidx.compose.runtime.MutableState;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.views.ActivityTabViewKt$ActivityTab$5$1$3;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletRetroOrderSelectionViewModel;
import com.squareup.cash.amountslider.AmountPickerCondensedView$events$$inlined$map$1$2;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class AfterpayAppletRetroOrderSelectionPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $viewModel$delegate;
    public int label;
    public final /* synthetic */ PoolsListPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AfterpayAppletRetroOrderSelectionPresenter$models$1$1(PoolsListPresenter poolsListPresenter, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = poolsListPresenter;
        this.$viewModel$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$viewModel$delegate;
        PoolsListPresenter poolsListPresenter = this.this$0;
        switch (i) {
            case 0:
                return new AfterpayAppletRetroOrderSelectionPresenter$models$1$1(poolsListPresenter, mutableState, continuation, 0);
            default:
                return new AfterpayAppletRetroOrderSelectionPresenter$models$1$1(poolsListPresenter, mutableState, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((AfterpayAppletRetroOrderSelectionPresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$viewModel$delegate;
        PoolsListPresenter poolsListPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow home = ((RealAfterpayAppletRepository) poolsListPresenter.dateFormatManager).getHome();
                    ActivityTabViewKt$ActivityTab$5$1$3 activityTabViewKt$ActivityTab$5$1$3 = new ActivityTabViewKt$ActivityTab$5$1$3(9, poolsListPresenter, mutableState);
                    this.label = 1;
                    Object collect = home.collect(new AmountPickerCondensedView$events$$inlined$map$1$2(activityTabViewKt$ActivityTab$5$1$3, 11), this);
                    if (collect != coroutineSingletons) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons) {
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
                    RealAfterpayAppletRepository realAfterpayAppletRepository = (RealAfterpayAppletRepository) poolsListPresenter.dateFormatManager;
                    this.label = 1;
                    obj = realAfterpayAppletRepository.refreshAfterpayApplet(this);
                    if (obj == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                if (((ApiResult) obj) instanceof ApiResult.Failure) {
                    mutableState.setValue((AfterpayAppletRetroOrderSelectionViewModel.Error) poolsListPresenter.flowToken);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
