package com.squareup.cash.security.presenters;

import android.app.Activity;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.core.widget.PopupWindowCompat;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.cash.biometrics.Biometrics$AuthenticationStatus;
import com.squareup.cash.biometrics.Biometrics$Info;
import com.squareup.cash.biometrics.Biometrics$Result;
import com.squareup.cash.biometrics.BiometricsStore$AnalyticsPayload;
import com.squareup.cash.biometrics.BiometricsStore$BiometricsResult;
import com.squareup.cash.biometrics.BiometricsStore$Status;
import com.squareup.cash.blockers.data.BlockersData;
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
import com.squareup.cash.security.viewmodels.BiometricsCheckboxModel$UseBiometricsLogIn;
import com.squareup.cash.security.viewmodels.PasswordEntryViewEvent;
import com.squareup.protos.cash.security.VerifyPasswordRequest;
import com.squareup.protos.cash.security.VerifyPasswordRequest$Input$Password;
import com.squareup.protos.cash.security.VerifyPasswordRequest$Input$PasswordToken;
import com.squareup.protos.cash.security.VerifyPasswordResponse;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class VerifyPasswordPresenter extends BasePasswordPresenter {
    public final PasswordEntryArgumentsAdapter args;
    public final BetterNavigator.ScreenNavigator navigator;
    public final SecurityService securityService;

    public VerifyPasswordPresenter(Activity activity, AndroidBiometricsStore androidBiometricsStore, BetterNavigator.ScreenNavigator screenNavigator, BlockersDataNavigator blockersDataNavigator, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, Analytics analytics, IntentLauncher intentLauncher, AndroidStringManager androidStringManager, RealPasswordManager realPasswordManager, PasswordEntryArgumentsAdapter passwordEntryArgumentsAdapter, SecurityService securityService, AppService appService, CoroutineContext coroutineContext) {
        super(activity, androidBiometricsStore, androidStringManager, coroutineContext, analytics, blockersDataNavigator, appService, intentLauncher, realBlockersHelper$Factory$Impl, passwordEntryArgumentsAdapter, screenNavigator, realPasswordManager);
        this.securityService = securityService;
        this.args = passwordEntryArgumentsAdapter;
        this.navigator = screenNavigator;
    }

    @Override // com.squareup.cash.security.presenters.BasePasswordPresenter
    public final Object handleUseBiometricToSignInViewEvent(MutableState mutableState, BasePasswordPresenter$models$1$1 basePasswordPresenter$models$1$1) {
        Object triggerBiometricVerification = triggerBiometricVerification(mutableState, basePasswordPresenter$models$1$1);
        return triggerBiometricVerification == CoroutineSingletons.COROUTINE_SUSPENDED ? triggerBiometricVerification : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cd, code lost:
    
        if (triggerBiometricVerification(r11, r0) == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cf, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0049, code lost:
    
        if (r12 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.squareup.cash.security.presenters.BasePasswordPresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initialBiometricsFlow(MutableState mutableState, Continuation continuation) {
        VerifyPasswordPresenter$initialBiometricsFlow$1 verifyPasswordPresenter$initialBiometricsFlow$1;
        int i;
        boolean booleanValue;
        boolean z;
        if (continuation instanceof VerifyPasswordPresenter$initialBiometricsFlow$1) {
            verifyPasswordPresenter$initialBiometricsFlow$1 = (VerifyPasswordPresenter$initialBiometricsFlow$1) continuation;
            int i2 = verifyPasswordPresenter$initialBiometricsFlow$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                verifyPasswordPresenter$initialBiometricsFlow$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = verifyPasswordPresenter$initialBiometricsFlow$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verifyPasswordPresenter$initialBiometricsFlow$1.label;
                AndroidBiometricsStore androidBiometricsStore = this.biometricsStore;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    verifyPasswordPresenter$initialBiometricsFlow$1.L$0 = mutableState;
                    verifyPasswordPresenter$initialBiometricsFlow$1.label = 1;
                    obj = androidBiometricsStore.hasStoredValue("biometric_enclave_key", verifyPasswordPresenter$initialBiometricsFlow$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState = verifyPasswordPresenter$initialBiometricsFlow$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                BiometricsStore$Status status = androidBiometricsStore.getStatus();
                boolean z2 = status.ready;
                z = status.secureStoreSupported;
                PopupWindowCompat popupWindowCompat = BiometricsCheckboxModel$Hidden.INSTANCE;
                if (z) {
                    if (booleanValue && z2) {
                        popupWindowCompat = BiometricsCheckboxModel$UseBiometricsLogIn.INSTANCE;
                    } else if (!Intrinsics.areEqual(this.args.passwordScreenData.hidePasswordCheckbox, Boolean.TRUE)) {
                        Biometrics$AuthenticationStatus biometrics$AuthenticationStatus = status.biometricsStatus;
                        if (biometrics$AuthenticationStatus.equals(Biometrics$AuthenticationStatus.BiometricsEnrolled.INSTANCE) || biometrics$AuthenticationStatus.equals(Biometrics$AuthenticationStatus.NoBiometricSignatures.INSTANCE)) {
                            popupWindowCompat = new BiometricsCheckboxModel$SaveBiometricsLogIn(true);
                        } else if (!biometrics$AuthenticationStatus.equals(Biometrics$AuthenticationStatus.HardwareNotSupported.INSTANCE) && !biometrics$AuthenticationStatus.equals(Biometrics$AuthenticationStatus.OsUpdateRequired.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                    }
                }
                mutableState.setValue(PasswordEntryState.copy$default((PasswordEntryState) mutableState.getValue(), false, popupWindowCompat, 3));
                if (booleanValue || !z2) {
                    return Unit.INSTANCE;
                }
                mutableState.setValue(PasswordEntryState.copy$default((PasswordEntryState) mutableState.getValue(), true, null, 6));
                verifyPasswordPresenter$initialBiometricsFlow$1.L$0 = null;
                verifyPasswordPresenter$initialBiometricsFlow$1.label = 2;
            }
        }
        verifyPasswordPresenter$initialBiometricsFlow$1 = new VerifyPasswordPresenter$initialBiometricsFlow$1(this, (ContinuationImpl) continuation);
        Object obj3 = verifyPasswordPresenter$initialBiometricsFlow$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verifyPasswordPresenter$initialBiometricsFlow$1.label;
        AndroidBiometricsStore androidBiometricsStore2 = this.biometricsStore;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj3).booleanValue();
        BiometricsStore$Status status2 = androidBiometricsStore2.getStatus();
        boolean z22 = status2.ready;
        z = status2.secureStoreSupported;
        PopupWindowCompat popupWindowCompat2 = BiometricsCheckboxModel$Hidden.INSTANCE;
        if (z) {
        }
        mutableState.setValue(PasswordEntryState.copy$default((PasswordEntryState) mutableState.getValue(), false, popupWindowCompat2, 3));
        if (booleanValue) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // com.squareup.cash.security.presenters.BasePasswordPresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setOrVerifyPasswordApi(boolean z, PasswordEntryViewEvent.ActionButtonClick.PasswordSubmitData passwordSubmitData, ContinuationImpl continuationImpl) {
        VerifyPasswordPresenter$setOrVerifyPasswordApi$1 verifyPasswordPresenter$setOrVerifyPasswordApi$1;
        int i;
        VerifyPasswordRequest verifyPasswordRequest;
        ApiResult apiResult;
        if (continuationImpl instanceof VerifyPasswordPresenter$setOrVerifyPasswordApi$1) {
            verifyPasswordPresenter$setOrVerifyPasswordApi$1 = (VerifyPasswordPresenter$setOrVerifyPasswordApi$1) continuationImpl;
            int i2 = verifyPasswordPresenter$setOrVerifyPasswordApi$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                verifyPasswordPresenter$setOrVerifyPasswordApi$1.label = i2 - PKIFailureInfo.systemUnavail;
                VerifyPasswordPresenter$setOrVerifyPasswordApi$1 verifyPasswordPresenter$setOrVerifyPasswordApi$12 = verifyPasswordPresenter$setOrVerifyPasswordApi$1;
                Object obj = verifyPasswordPresenter$setOrVerifyPasswordApi$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verifyPasswordPresenter$setOrVerifyPasswordApi$12.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    PasswordEntryArgumentsAdapter passwordEntryArgumentsAdapter = this.args;
                    if (z) {
                        RequestContext requestContext = passwordEntryArgumentsAdapter.screen.getBlockersData().requestContext;
                        String str = passwordSubmitData.passwordToken;
                        str.getClass();
                        verifyPasswordRequest = new VerifyPasswordRequest(requestContext, new VerifyPasswordRequest$Input$PasswordToken(str));
                    } else {
                        RequestContext requestContext2 = passwordEntryArgumentsAdapter.screen.getBlockersData().requestContext;
                        String str2 = passwordSubmitData.password;
                        str2.getClass();
                        verifyPasswordRequest = new VerifyPasswordRequest(requestContext2, new VerifyPasswordRequest$Input$Password(str2));
                    }
                    BlockersData blockersData = passwordEntryArgumentsAdapter.screen.getBlockersData();
                    CalloutKt$$ExternalSyntheticLambda1 calloutKt$$ExternalSyntheticLambda1 = new CalloutKt$$ExternalSyntheticLambda1(16);
                    RealMRIFactory$sign$2.AnonymousClass1 anonymousClass1 = new RealMRIFactory$sign$2.AnonymousClass1(this, verifyPasswordRequest, continuation, 19);
                    verifyPasswordPresenter$setOrVerifyPasswordApi$12.label = 1;
                    obj = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(16, blockersData, this.analytics, this.stringManager, verifyPasswordPresenter$setOrVerifyPasswordApi$12, calloutKt$$ExternalSyntheticLambda1, anonymousClass1);
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
                VerifyPasswordResponse verifyPasswordResponse = (VerifyPasswordResponse) ((ApiResult.Success) apiResult).response;
                if (Intrinsics.areEqual(verifyPasswordResponse.invalidate_password_token, Boolean.TRUE)) {
                    return new ApiResult.Failure.HttpFailure(-1, null, null);
                }
                ResponseContext responseContext = verifyPasswordResponse.response_context;
                responseContext.getClass();
                return new ApiResult.Success(new PasswordResponseAdapter(responseContext, verifyPasswordResponse.password_token, null, verifyPasswordResponse.password_version));
            }
        }
        verifyPasswordPresenter$setOrVerifyPasswordApi$1 = new VerifyPasswordPresenter$setOrVerifyPasswordApi$1(this, continuationImpl);
        VerifyPasswordPresenter$setOrVerifyPasswordApi$1 verifyPasswordPresenter$setOrVerifyPasswordApi$122 = verifyPasswordPresenter$setOrVerifyPasswordApi$1;
        Object obj2 = verifyPasswordPresenter$setOrVerifyPasswordApi$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verifyPasswordPresenter$setOrVerifyPasswordApi$122.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0132, code lost:
    
        if (setOrVerifyPassword(true, r4, r3, null, r5) == r9) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0073, code lost:
    
        if (r8 == r9) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [androidx.compose.runtime.MutableState, androidx.core.widget.PopupWindowCompat, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object triggerBiometricVerification(MutableState mutableState, ContinuationImpl continuationImpl) {
        VerifyPasswordPresenter$triggerBiometricVerification$1 verifyPasswordPresenter$triggerBiometricVerification$1;
        int i;
        MutableState mutableState2;
        String str;
        Object hasStoredValue;
        boolean booleanValue;
        boolean z;
        ?? r13;
        AndroidStringManager androidStringManager;
        boolean z2;
        MutableState mutableState3;
        BiometricsStore$BiometricsResult biometricsStore$BiometricsResult;
        if (continuationImpl instanceof VerifyPasswordPresenter$triggerBiometricVerification$1) {
            verifyPasswordPresenter$triggerBiometricVerification$1 = (VerifyPasswordPresenter$triggerBiometricVerification$1) continuationImpl;
            int i2 = verifyPasswordPresenter$triggerBiometricVerification$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                verifyPasswordPresenter$triggerBiometricVerification$1.label = i2 - PKIFailureInfo.systemUnavail;
                VerifyPasswordPresenter$triggerBiometricVerification$1 verifyPasswordPresenter$triggerBiometricVerification$12 = verifyPasswordPresenter$triggerBiometricVerification$1;
                Object obj = verifyPasswordPresenter$triggerBiometricVerification$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verifyPasswordPresenter$triggerBiometricVerification$12.label;
                AndroidBiometricsStore androidBiometricsStore = this.biometricsStore;
                BetterNavigator.ScreenNavigator screenNavigator = this.navigator;
                AndroidStringManager androidStringManager2 = this.stringManager;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState2 = mutableState;
                    verifyPasswordPresenter$triggerBiometricVerification$12.L$0 = mutableState2;
                    str = "biometric_enclave_key";
                    verifyPasswordPresenter$triggerBiometricVerification$12.L$1 = "biometric_enclave_key";
                    verifyPasswordPresenter$triggerBiometricVerification$12.label = 1;
                    hasStoredValue = androidBiometricsStore.hasStoredValue("biometric_enclave_key", verifyPasswordPresenter$triggerBiometricVerification$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = verifyPasswordPresenter$triggerBiometricVerification$12.Z$0;
                        mutableState3 = verifyPasswordPresenter$triggerBiometricVerification$12.L$0;
                        SafeTrace.throwOnFailure(obj);
                        z2 = true;
                        r13 = 0;
                        androidStringManager = androidStringManager2;
                        biometricsStore$BiometricsResult = (BiometricsStore$BiometricsResult) obj;
                        if (biometricsStore$BiometricsResult != null) {
                            mutableState3.setValue(PasswordEntryState.copy$default((PasswordEntryState) mutableState3.getValue(), false, new BiometricsCheckboxModel$SaveBiometricsLogIn(z2), 2));
                        } else if (biometricsStore$BiometricsResult instanceof BiometricsStore$BiometricsResult.Success) {
                            PasswordEntryViewEvent.ActionButtonClick.PasswordSubmitData passwordSubmitData = new PasswordEntryViewEvent.ActionButtonClick.PasswordSubmitData(((BiometricsStore$BiometricsResult.Success) biometricsStore$BiometricsResult).value, r13, 2);
                            verifyPasswordPresenter$triggerBiometricVerification$12.L$0 = r13;
                            verifyPasswordPresenter$triggerBiometricVerification$12.L$1 = r13;
                            verifyPasswordPresenter$triggerBiometricVerification$12.Z$0 = z;
                            verifyPasswordPresenter$triggerBiometricVerification$12.label = 3;
                        } else if (biometricsStore$BiometricsResult instanceof BiometricsStore$BiometricsResult.DecryptionFailure) {
                            mutableState3.setValue(PasswordEntryState.copy$default((PasswordEntryState) mutableState3.getValue(), false, new BiometricsCheckboxModel$SaveBiometricsLogIn(z2), 2));
                            AndroidStringManager androidStringManager3 = androidStringManager;
                            screenNavigator.goTo(getCloseErrorDialog(androidStringManager3.get(R.string.security_presenters_biometrics_generic_error_title), androidStringManager3.get(R.string.security_presenters_biometrics_generic_error_message)));
                        } else {
                            AndroidStringManager androidStringManager4 = androidStringManager;
                            if (biometricsStore$BiometricsResult instanceof BiometricsStore$BiometricsResult.Error) {
                                mutableState3.setValue(PasswordEntryState.copy$default((PasswordEntryState) mutableState3.getValue(), false, r13, 6));
                                Biometrics$Result.Error error = ((BiometricsStore$BiometricsResult.Error) biometricsStore$BiometricsResult).error;
                                if (!(error instanceof Biometrics$Result.Error.NegativeButton)) {
                                    if (error instanceof Biometrics$Result.Error.Lockout) {
                                        screenNavigator.goTo(getCloseErrorDialog(androidStringManager4.get(R.string.security_presenters_biometrics_lockout_error_title), androidStringManager4.get(R.string.security_presenters_biometrics_lockout_error_message)));
                                    } else {
                                        handleBiometricsErrors(error, mutableState3);
                                    }
                                }
                            } else {
                                if (!(biometricsStore$BiometricsResult instanceof BiometricsStore$BiometricsResult.PlatformException)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return r13;
                                }
                                mutableState3.setValue(PasswordEntryState.copy$default((PasswordEntryState) mutableState3.getValue(), false, r13, 6));
                                screenNavigator.goTo(getCloseErrorDialog(androidStringManager4.get(R.string.security_presenters_biometrics_generic_error_title), androidStringManager4.get(R.string.security_presenters_biometrics_generic_error_message)));
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    str = verifyPasswordPresenter$triggerBiometricVerification$12.L$1;
                    MutableState mutableState4 = verifyPasswordPresenter$triggerBiometricVerification$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                    hasStoredValue = obj;
                    mutableState2 = mutableState4;
                }
                booleanValue = ((Boolean) hasStoredValue).booleanValue();
                if (booleanValue) {
                    mutableState2.setValue(PasswordEntryState.copy$default((PasswordEntryState) mutableState2.getValue(), false, new BiometricsCheckboxModel$SaveBiometricsLogIn(true), 3));
                    screenNavigator.goTo(getCloseErrorDialog(androidStringManager2.get(R.string.security_presenters_biometrics_generic_error_title), androidStringManager2.get(R.string.security_presenters_biometrics_generic_error_message)));
                    return Unit.INSTANCE;
                }
                Biometrics$Info biometrics$Info = new Biometrics$Info(androidStringManager2.get(R.string.security_presenters_biometrics_login_title), 6, null, null, androidStringManager2.get(R.string.security_presenters_biometrics_use_password));
                PasswordEntryArgumentsAdapter passwordEntryArgumentsAdapter = this.args;
                String str2 = passwordEntryArgumentsAdapter.screen.getBlockersData().flowToken;
                ClientScenario clientScenario = passwordEntryArgumentsAdapter.screen.getBlockersData().clientScenario;
                BiometricsStore$AnalyticsPayload biometricsStore$AnalyticsPayload = new BiometricsStore$AnalyticsPayload(str2, clientScenario != null ? clientScenario.toString() : null);
                verifyPasswordPresenter$triggerBiometricVerification$12.L$0 = mutableState2;
                verifyPasswordPresenter$triggerBiometricVerification$12.L$1 = null;
                verifyPasswordPresenter$triggerBiometricVerification$12.Z$0 = booleanValue;
                verifyPasswordPresenter$triggerBiometricVerification$12.label = 2;
                String str3 = str;
                z = booleanValue;
                r13 = 0;
                androidStringManager = androidStringManager2;
                z2 = true;
                Object read$default = AndroidBiometricsStore.read$default(androidBiometricsStore, this.activity, str3, biometrics$Info, biometricsStore$AnalyticsPayload, verifyPasswordPresenter$triggerBiometricVerification$12);
                verifyPasswordPresenter$triggerBiometricVerification$12 = verifyPasswordPresenter$triggerBiometricVerification$12;
                if (read$default != obj2) {
                    mutableState3 = mutableState2;
                    obj = read$default;
                    biometricsStore$BiometricsResult = (BiometricsStore$BiometricsResult) obj;
                    if (biometricsStore$BiometricsResult != null) {
                    }
                    return Unit.INSTANCE;
                }
                return obj2;
            }
        }
        verifyPasswordPresenter$triggerBiometricVerification$1 = new VerifyPasswordPresenter$triggerBiometricVerification$1(this, continuationImpl);
        VerifyPasswordPresenter$triggerBiometricVerification$1 verifyPasswordPresenter$triggerBiometricVerification$122 = verifyPasswordPresenter$triggerBiometricVerification$1;
        Object obj3 = verifyPasswordPresenter$triggerBiometricVerification$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verifyPasswordPresenter$triggerBiometricVerification$122.label;
        AndroidBiometricsStore androidBiometricsStore2 = this.biometricsStore;
        BetterNavigator.ScreenNavigator screenNavigator2 = this.navigator;
        AndroidStringManager androidStringManager22 = this.stringManager;
        if (i != 0) {
        }
        booleanValue = ((Boolean) hasStoredValue).booleanValue();
        if (booleanValue) {
        }
    }
}
