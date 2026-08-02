package com.squareup.cash.afterpayapplet.presenters;

import androidx.paging.compose.LazyPagingItems$collectLoadState$2;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayMerchantRepo;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletHomeScreen;
import com.squareup.cash.cdf.prepurchasecard.Surface;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.prepurchasecashcard.backend.RealPrepurchaseToggleManager;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class AfterpayAppletHomePresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ AfterpayAppletHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AfterpayAppletHomePresenter$models$1$1(AfterpayAppletHomePresenter afterpayAppletHomePresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = afterpayAppletHomePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        AfterpayAppletHomePresenter afterpayAppletHomePresenter = this.this$0;
        switch (i) {
            case 0:
                return new AfterpayAppletHomePresenter$models$1$1(afterpayAppletHomePresenter, continuation, 0);
            case 1:
                return new AfterpayAppletHomePresenter$models$1$1(afterpayAppletHomePresenter, continuation, 1);
            case 2:
                return new AfterpayAppletHomePresenter$models$1$1(afterpayAppletHomePresenter, continuation, 2);
            default:
                return new AfterpayAppletHomePresenter$models$1$1(afterpayAppletHomePresenter, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((AfterpayAppletHomePresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        AfterpayAppletHomePresenter afterpayAppletHomePresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow home = afterpayAppletHomePresenter.afterpayAppletRepository.getHome();
                    LazyPagingItems$collectLoadState$2 lazyPagingItems$collectLoadState$2 = new LazyPagingItems$collectLoadState$2(afterpayAppletHomePresenter, 23);
                    this.label = 1;
                    if (home.collect(lazyPagingItems$collectLoadState$2, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealAfterpayMerchantRepo realAfterpayMerchantRepo = afterpayAppletHomePresenter.afterpayMerchantRepo;
                    this.label = 1;
                    Object internalUpdate = realAfterpayMerchantRepo.internalUpdate("", EmptyList.INSTANCE, this);
                    if (internalUpdate != coroutineSingletons2) {
                        internalUpdate = Unit.INSTANCE;
                    }
                    if (internalUpdate == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealAfterpayAppletRepository realAfterpayAppletRepository = afterpayAppletHomePresenter.afterpayAppletRepository;
                    this.label = 1;
                    obj = realAfterpayAppletRepository.refreshAfterpayApplet(this);
                    if (obj == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                if (((ApiResult) obj) instanceof ApiResult.Failure) {
                    Map map = AfterpayAppletHomePresenter.refreshAttributeHome;
                    afterpayAppletHomePresenter.setHomeState(afterpayAppletHomePresenter.toErrorState());
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealPrepurchaseToggleManager realPrepurchaseToggleManager = afterpayAppletHomePresenter.prepurchaseToggleManager;
                    AfterpayAppletScreen$AfterpayAppletHomeScreen afterpayAppletScreen$AfterpayAppletHomeScreen = afterpayAppletHomePresenter.args;
                    RealRouter realRouter = afterpayAppletHomePresenter.router;
                    BetterNavigator.ScreenNavigator screenNavigator = afterpayAppletHomePresenter.navigator;
                    Surface surface = Surface.AFTERPAY_APPLET;
                    this.label = 1;
                    if (realPrepurchaseToggleManager.toggle(afterpayAppletScreen$AfterpayAppletHomeScreen, realRouter, screenNavigator, surface, this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i5 != 1) {
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
