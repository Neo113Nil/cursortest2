package com.squareup.cash.bitcoin.presenters.applet;

import com.plaid.internal.EnumC0170g;
import com.squareup.cash.bitcoin.screens.BitcoinDependentWelcomeScreen;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.cdf.app.AppNavigateOpenSpace;
import com.squareup.cash.cdf.sponsoredaccount.DependentBalanceType;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountBalanceDetailStart;
import com.squareup.cash.family.familyhub.backend.real.RealDependentBalanceDetailLoggingManager;
import com.squareup.cash.integration.analytics.Analytics;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class BitcoinHomePresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BitcoinHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BitcoinHomePresenter$models$2$1(BitcoinHomePresenter bitcoinHomePresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = bitcoinHomePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        BitcoinHomePresenter bitcoinHomePresenter = this.this$0;
        switch (i) {
            case 0:
                return new BitcoinHomePresenter$models$2$1(bitcoinHomePresenter, continuation, 0);
            case 1:
                return new BitcoinHomePresenter$models$2$1(bitcoinHomePresenter, continuation, 1);
            default:
                return new BitcoinHomePresenter$models$2$1(bitcoinHomePresenter, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((BitcoinHomePresenter$models$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        BitcoinHomePresenter bitcoinHomePresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                bitcoinHomePresenter.navigator.goTo(new BitcoinDependentWelcomeScreen(false));
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealDependentBalanceDetailLoggingManager realDependentBalanceDetailLoggingManager = bitcoinHomePresenter.dependentBalanceDetailLogger;
                String customerToken = realDependentBalanceDetailLoggingManager.dependentCustomerTokenRepository.getCustomerToken();
                if (customerToken != null) {
                    realDependentBalanceDetailLoggingManager.analytics.track(new SponsoredAccountBalanceDetailStart(DependentBalanceType.Bitcoin, customerToken), null);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Analytics analytics = bitcoinHomePresenter.analytics;
                AppNavigateOpenSpace.Space space = AppNavigateOpenSpace.Space.BITCOIN;
                BitcoinHome bitcoinHome = bitcoinHomePresenter.args;
                analytics.track(new AppNavigateOpenSpace(bitcoinHome.source, bitcoinHome.sourceTab, space, null, EnumC0170g.SDK_ASSET_ICON_CANCEL_VALUE), null);
                break;
        }
        return Unit.INSTANCE;
    }
}
