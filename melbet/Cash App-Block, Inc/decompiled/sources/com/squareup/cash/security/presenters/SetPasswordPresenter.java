package com.squareup.cash.security.presenters;

import android.app.Activity;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.core.widget.PopupWindowCompat;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.cash.biometrics.Biometrics$AuthenticationStatus;
import com.squareup.cash.biometrics.BiometricsStore$Status;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda1;
import com.squareup.cash.security.backend.impl.RealPasswordManager;
import com.squareup.cash.security.service.SecurityService;
import com.squareup.cash.security.viewmodels.BiometricsCheckboxModel$Hidden;
import com.squareup.cash.security.viewmodels.BiometricsCheckboxModel$SaveBiometricsLogIn;
import com.squareup.cash.security.viewmodels.PasswordEntryViewEvent;
import com.squareup.cash.storage.SandboxJanitor;
import com.squareup.protos.cash.security.SetPasswordResponse;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.common.ResponseContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class SetPasswordPresenter extends BasePasswordPresenter {
    public final PasswordEntryArgumentsAdapter args;
    public final SecurityService securityService;

    public SetPasswordPresenter(Activity activity, AndroidBiometricsStore androidBiometricsStore, BetterNavigator.ScreenNavigator screenNavigator, BlockersDataNavigator blockersDataNavigator, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, Analytics analytics, IntentLauncher intentLauncher, AndroidStringManager androidStringManager, RealPasswordManager realPasswordManager, PasswordEntryArgumentsAdapter passwordEntryArgumentsAdapter, SecurityService securityService, AppService appService, CoroutineContext coroutineContext) {
        super(activity, androidBiometricsStore, androidStringManager, coroutineContext, analytics, blockersDataNavigator, appService, intentLauncher, realBlockersHelper$Factory$Impl, passwordEntryArgumentsAdapter, screenNavigator, realPasswordManager);
        this.securityService = securityService;
        this.args = passwordEntryArgumentsAdapter;
    }

    @Override // com.squareup.cash.security.presenters.BasePasswordPresenter
    public final Object handleUseBiometricToSignInViewEvent(MutableState mutableState, BasePasswordPresenter$models$1$1 basePasswordPresenter$models$1$1) {
        return Unit.INSTANCE;
    }

    @Override // com.squareup.cash.security.presenters.BasePasswordPresenter
    public final Object initialBiometricsFlow(MutableState mutableState, Continuation continuation) {
        PopupWindowCompat popupWindowCompat;
        BiometricsStore$Status status = this.biometricsStore.getStatus();
        if (status.hardwareSupported) {
            Biometrics$AuthenticationStatus biometrics$AuthenticationStatus = status.biometricsStatus;
            if ((biometrics$AuthenticationStatus instanceof Biometrics$AuthenticationStatus.BiometricsEnrolled) || (biometrics$AuthenticationStatus instanceof Biometrics$AuthenticationStatus.NoBiometricSignatures)) {
                popupWindowCompat = new BiometricsCheckboxModel$SaveBiometricsLogIn(true);
                mutableState.setValue(PasswordEntryState.copy$default((PasswordEntryState) mutableState.getValue(), false, popupWindowCompat, 3));
                return Unit.INSTANCE;
            }
        }
        popupWindowCompat = BiometricsCheckboxModel$Hidden.INSTANCE;
        mutableState.setValue(PasswordEntryState.copy$default((PasswordEntryState) mutableState.getValue(), false, popupWindowCompat, 3));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.squareup.cash.security.presenters.BasePasswordPresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setOrVerifyPasswordApi(boolean z, PasswordEntryViewEvent.ActionButtonClick.PasswordSubmitData passwordSubmitData, ContinuationImpl continuationImpl) {
        SetPasswordPresenter$setOrVerifyPasswordApi$1 setPasswordPresenter$setOrVerifyPasswordApi$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof SetPasswordPresenter$setOrVerifyPasswordApi$1) {
            setPasswordPresenter$setOrVerifyPasswordApi$1 = (SetPasswordPresenter$setOrVerifyPasswordApi$1) continuationImpl;
            int i2 = setPasswordPresenter$setOrVerifyPasswordApi$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                setPasswordPresenter$setOrVerifyPasswordApi$1.label = i2 - PKIFailureInfo.systemUnavail;
                SetPasswordPresenter$setOrVerifyPasswordApi$1 setPasswordPresenter$setOrVerifyPasswordApi$12 = setPasswordPresenter$setOrVerifyPasswordApi$1;
                Object obj = setPasswordPresenter$setOrVerifyPasswordApi$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = setPasswordPresenter$setOrVerifyPasswordApi$12.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    BlockersData blockersData = this.args.screen.getBlockersData();
                    CalloutKt$$ExternalSyntheticLambda1 calloutKt$$ExternalSyntheticLambda1 = new CalloutKt$$ExternalSyntheticLambda1(15);
                    RealMRIFactory$sign$2.AnonymousClass1 anonymousClass1 = new RealMRIFactory$sign$2.AnonymousClass1(this, passwordSubmitData, continuation, 18);
                    setPasswordPresenter$setOrVerifyPasswordApi$12.label = 1;
                    obj = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(16, blockersData, this.analytics, this.stringManager, setPasswordPresenter$setOrVerifyPasswordApi$12, calloutKt$$ExternalSyntheticLambda1, anonymousClass1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    if (apiResult instanceof ApiResult.Failure) {
                        return apiResult;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                SetPasswordResponse setPasswordResponse = (SetPasswordResponse) ((ApiResult.Success) apiResult).response;
                ResponseContext responseContext = setPasswordResponse.response_context;
                responseContext.getClass();
                return new ApiResult.Success(new PasswordResponseAdapter(responseContext, setPasswordResponse.password_token, setPasswordResponse.password_error_message, setPasswordResponse.password_version));
            }
        }
        setPasswordPresenter$setOrVerifyPasswordApi$1 = new SetPasswordPresenter$setOrVerifyPasswordApi$1(this, continuationImpl);
        SetPasswordPresenter$setOrVerifyPasswordApi$1 setPasswordPresenter$setOrVerifyPasswordApi$122 = setPasswordPresenter$setOrVerifyPasswordApi$1;
        Object obj2 = setPasswordPresenter$setOrVerifyPasswordApi$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = setPasswordPresenter$setOrVerifyPasswordApi$122.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final InstanceFactory activity;
        public final DoubleCheck analytics;
        public final DoubleCheck appService;
        public final Provider biometricsStore;
        public final Provider blockersDataNavigator;
        public final Provider blockersHelperFactory;
        public final LambdaProvider ioDispatcher;
        public final Provider launcher;
        public final Provider passwordManager;
        public final DoubleCheck securityService;
        public final LambdaProvider stringManager;

        public MetroFactory(InstanceFactory instanceFactory, LambdaProvider lambdaProvider, RealBrazeManager.MetroFactory metroFactory, TreehouseFlows.MetroFactory metroFactory2, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck, IntentLauncher.MetroFactory metroFactory3, DoubleCheck doubleCheck2, InstanceFactory instanceFactory2, SandboxJanitor.MetroFactory metroFactory4, DoubleCheck doubleCheck3) {
            this.activity = instanceFactory;
            this.stringManager = lambdaProvider;
            this.blockersDataNavigator = metroFactory;
            this.biometricsStore = metroFactory2;
            this.ioDispatcher = lambdaProvider2;
            this.appService = doubleCheck;
            this.launcher = metroFactory3;
            this.analytics = doubleCheck2;
            this.blockersHelperFactory = instanceFactory2;
            this.passwordManager = metroFactory4;
            this.securityService = doubleCheck3;
        }

        public MetroFactory(InstanceFactory instanceFactory, LambdaProvider lambdaProvider, RealBrazeManager.MetroFactory metroFactory, TreehouseFlows.MetroFactory metroFactory2, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck, IntentLauncher.MetroFactory metroFactory3, InstanceFactory instanceFactory2, DoubleCheck doubleCheck2, SandboxJanitor.MetroFactory metroFactory4, DoubleCheck doubleCheck3) {
            this.activity = instanceFactory;
            this.stringManager = lambdaProvider;
            this.blockersDataNavigator = metroFactory;
            this.biometricsStore = metroFactory2;
            this.ioDispatcher = lambdaProvider2;
            this.appService = doubleCheck;
            this.launcher = metroFactory3;
            this.blockersHelperFactory = instanceFactory2;
            this.analytics = doubleCheck2;
            this.passwordManager = metroFactory4;
            this.securityService = doubleCheck3;
        }
    }
}
