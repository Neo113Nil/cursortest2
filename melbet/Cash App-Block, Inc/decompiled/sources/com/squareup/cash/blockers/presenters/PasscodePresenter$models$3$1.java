package com.squareup.cash.blockers.presenters;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.blockers.viewmodels.PasscodeViewModel;
import com.squareup.cash.cdf.app.AppNavigateOpenSpace;
import com.squareup.cash.charting.components.EarningsBarChartKt$ChartBars$1$1$1$1;
import com.squareup.cash.offers.backend.api.OffersAnalyticsState;
import com.squareup.cash.offers.presenters.OffersHomePresenter;
import com.squareup.cash.offers.presenters.RealOffersAnalytics;
import com.squareup.cash.offers.presenters.RealOffersSearchPresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$11$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import okio.Okio;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class PasscodePresenter$models$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $attempt$delegate;
    public /* synthetic */ Object $biometricsCopy;
    public final /* synthetic */ Object $defaultTitle$delegate;
    public final /* synthetic */ boolean $isBalanceBrand;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $title$delegate;
    public final /* synthetic */ MutableState $verifyPasscodeModel$delegate;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PasscodePresenter$models$3$1(Object obj, boolean z, Object obj2, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, State state, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$biometricsCopy = obj;
        this.$isBalanceBrand = z;
        this.this$0 = obj2;
        this.$verifyPasscodeModel$delegate = mutableState;
        this.$title$delegate = mutableState2;
        this.$attempt$delegate = mutableState3;
        this.$defaultTitle$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$defaultTitle$delegate;
        Object obj3 = this.$attempt$delegate;
        Object obj4 = this.$title$delegate;
        Object obj5 = this.this$0;
        switch (i) {
            case 0:
                return new PasscodePresenter$models$3$1((CompletableDeferred) this.$biometricsCopy, this.$isBalanceBrand, (PasscodePresenter) obj5, this.$verifyPasscodeModel$delegate, (MutableState) obj4, (ParcelableSnapshotMutableIntState) obj3, (State) obj2, continuation, 0);
            case 1:
                PasscodePresenter$models$3$1 passcodePresenter$models$3$1 = new PasscodePresenter$models$3$1(this.$isBalanceBrand, (Animatable) obj5, (Animatable) obj4, (Animatable) obj3, this.$verifyPasscodeModel$delegate, (Animatable) obj2, continuation);
                passcodePresenter$models$3$1.$biometricsCopy = obj;
                return passcodePresenter$models$3$1;
            default:
                return new PasscodePresenter$models$3$1((OffersHomePresenter) this.$biometricsCopy, this.$isBalanceBrand, (String) obj5, this.$verifyPasscodeModel$delegate, (MutableState) obj4, (MutableState) obj3, (MutableState) obj2, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((PasscodePresenter$models$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.$defaultTitle$delegate;
        Object obj3 = this.$attempt$delegate;
        Object obj4 = this.this$0;
        boolean z = this.$isBalanceBrand;
        MutableState mutableState = this.$verifyPasscodeModel$delegate;
        Object obj5 = this.$title$delegate;
        Continuation continuation = null;
        switch (i) {
            case 0:
                MutableState mutableState2 = (MutableState) obj5;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj3;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                PasscodeViewModel.VerifyPasscodeModel verifyPasscodeModel = (PasscodeViewModel.VerifyPasscodeModel) mutableState.getValue();
                if (!(verifyPasscodeModel instanceof PasscodeViewModel.VerifyPasscodeModel.BiometricsPrompt)) {
                    if (!(verifyPasscodeModel instanceof PasscodeViewModel.VerifyPasscodeModel.InvalidPasscode)) {
                        if (!(verifyPasscodeModel instanceof PasscodeViewModel.VerifyPasscodeModel.PasscodeVerificationFailed)) {
                            if (verifyPasscodeModel != null && !verifyPasscodeModel.equals(PasscodeViewModel.VerifyPasscodeModel.VerifyingPasscode.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            }
                        } else {
                            mutableState2.setValue((String) ((State) obj2).getValue());
                            int intValue = parcelableSnapshotMutableIntState.getIntValue();
                            parcelableSnapshotMutableIntState.setIntValue(intValue + 1);
                            Okio.boxInt(intValue);
                        }
                    } else {
                        AndroidStringManager androidStringManager = ((PasscodePresenter) obj4).stringManager;
                        mutableState2.setValue(z ? androidStringManager.get(R.string.blockers_passcode_error_invalid_passcode) : androidStringManager.get(R.string.blockers_passcode_error_invalid_cvv));
                        int intValue2 = parcelableSnapshotMutableIntState.getIntValue();
                        parcelableSnapshotMutableIntState.setIntValue(intValue2 + 1);
                        Okio.boxInt(intValue2);
                    }
                } else {
                    ((CompletableDeferred) this.$biometricsCopy).complete(((PasscodeViewModel.VerifyPasscodeModel.BiometricsPrompt) verifyPasscodeModel).info);
                }
                break;
            case 1:
                CoroutineScope coroutineScope = (CoroutineScope) this.$biometricsCopy;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (z) {
                    JobKt.launch$default(coroutineScope, null, null, new EarningsBarChartKt$ChartBars$1$1$1$1((Animatable) obj4, continuation, 16), 3);
                    JobKt.launch$default(coroutineScope, null, null, new EarningsBarChartKt$ChartBars$1$1$1$1((Animatable) obj5, continuation, 17), 3);
                    JobKt.launch$default(coroutineScope, null, null, new Hero3DCardViewKt$InteractiveCard$11$1((Animatable) obj3, mutableState, continuation, 3), 3);
                    JobKt.launch$default(coroutineScope, null, null, new EarningsBarChartKt$ChartBars$1$1$1$1((Animatable) obj2, continuation, 18), 3);
                }
                break;
            default:
                MutableState mutableState3 = (MutableState) obj5;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                OffersHomePresenter offersHomePresenter = (OffersHomePresenter) this.$biometricsCopy;
                RealOffersAnalytics realOffersAnalytics = offersHomePresenter.analytics;
                realOffersAnalytics.track(new AppNavigateOpenSpace(null, null, AppNavigateOpenSpace.Space.OFFERS, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE), null);
                if (z) {
                    RealOffersSearchPresenter realOffersSearchPresenter = offersHomePresenter.offersSearchPresenter;
                    String str = (String) obj4;
                    realOffersSearchPresenter.getClass();
                    str.getClass();
                    if (!realOffersSearchPresenter.isSearchMode()) {
                        realOffersSearchPresenter.isSearchMode$delegate.setValue(Boolean.TRUE);
                        realOffersSearchPresenter.isRestoringFromSearchMode$delegate.setValue(true);
                        realOffersSearchPresenter.searchFilterTokens$delegate.setValue(str);
                    }
                }
                if (!offersHomePresenter.isNewSession && Intrinsics.areEqual((String) mutableState.getValue(), (String) mutableState3.getValue())) {
                    Set set = ((OffersAnalyticsState) ((MutableState) obj3).getValue()).cachedImpressionAnalyticsEvents;
                    realOffersAnalytics.getClass();
                    set.getClass();
                    realOffersAnalytics.clearCache();
                    realOffersAnalytics.loggedImpressionEventHashes.addAll(set);
                }
                mutableState3.setValue((String) mutableState.getValue());
                ((MutableState) obj2).setValue(Boolean.TRUE);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasscodePresenter$models$3$1(boolean z, Animatable animatable, Animatable animatable2, Animatable animatable3, MutableState mutableState, Animatable animatable4, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 1;
        this.$isBalanceBrand = z;
        this.this$0 = animatable;
        this.$title$delegate = animatable2;
        this.$attempt$delegate = animatable3;
        this.$verifyPasscodeModel$delegate = mutableState;
        this.$defaultTitle$delegate = animatable4;
    }
}
