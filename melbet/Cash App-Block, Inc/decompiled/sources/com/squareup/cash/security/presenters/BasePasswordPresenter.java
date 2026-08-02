package com.squareup.cash.security.presenters;

import android.app.Activity;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.core.widget.PopupWindowCompat;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.cash.biometrics.Biometrics$AuthenticationStatus;
import com.squareup.cash.biometrics.Biometrics$Info;
import com.squareup.cash.biometrics.Biometrics$Result;
import com.squareup.cash.biometrics.BiometricsStore$AnalyticsPayload;
import com.squareup.cash.biometrics.BiometricsStore$BiometricsResult;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter$models$1$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.security.backend.impl.RealPasswordManager;
import com.squareup.cash.security.screens.PasswordDialogScreen;
import com.squareup.cash.security.viewmodels.BiometricsCheckboxModel$Hidden;
import com.squareup.cash.security.viewmodels.BiometricsCheckboxModel$SaveBiometricsLogIn;
import com.squareup.cash.security.viewmodels.PasswordEntryViewEvent;
import com.squareup.cash.security.viewmodels.PasswordEntryViewModel;
import com.squareup.cash.sheet.BasicShieetKt$BasicShieet$4$1;
import com.squareup.cash.shopping.web.ShoppingWebBridge$loadUrl$1;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SubmitFormResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public abstract class BasePasswordPresenter implements MoleculePresenter {
    public final Activity activity;
    public final Analytics analytics;
    public final AppService appService;
    public final PasswordEntryArgumentsAdapter args;
    public final AndroidBiometricsStore biometricsStore;
    public final BlockersDataNavigator blockersDataNavigator;
    public final RealBlockersHelper blockersHelper;
    public final CoroutineContext ioDispatcher;
    public final IntentLauncher launcher;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealPasswordManager passwordManager;
    public final AndroidStringManager stringManager;

    public BasePasswordPresenter(Activity activity, AndroidBiometricsStore androidBiometricsStore, AndroidStringManager androidStringManager, CoroutineContext coroutineContext, Analytics analytics, BlockersDataNavigator blockersDataNavigator, AppService appService, IntentLauncher intentLauncher, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, PasswordEntryArgumentsAdapter passwordEntryArgumentsAdapter, BetterNavigator.ScreenNavigator screenNavigator, RealPasswordManager realPasswordManager) {
        this.activity = activity;
        this.biometricsStore = androidBiometricsStore;
        this.stringManager = androidStringManager;
        this.ioDispatcher = coroutineContext;
        this.analytics = analytics;
        this.blockersDataNavigator = blockersDataNavigator;
        this.appService = appService;
        this.launcher = intentLauncher;
        this.args = passwordEntryArgumentsAdapter;
        this.navigator = screenNavigator;
        this.passwordManager = realPasswordManager;
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x016d, code lost:
    
        if (r23.setOrVerifyPassword(false, r2, r3, r4, r5) == r11) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00cf, code lost:
    
        if (r9 == r11) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$startSavePasswordWithBiometricsFlow(BasePasswordPresenter basePasswordPresenter, PasswordEntryViewEvent.ActionButtonClick.PasswordSubmitData passwordSubmitData, MutableState mutableState, ContinuationImpl continuationImpl) {
        BasePasswordPresenter$startSavePasswordWithBiometricsFlow$1 basePasswordPresenter$startSavePasswordWithBiometricsFlow$1;
        int i;
        PasswordEntryViewEvent.ActionButtonClick.PasswordSubmitData passwordSubmitData2;
        MutableState mutableState2;
        Object hasStoredValue;
        PasswordEntryViewEvent.ActionButtonClick.PasswordSubmitData passwordSubmitData3;
        MutableState mutableState3;
        PasswordEntryViewEvent.ActionButtonClick.PasswordSubmitData passwordSubmitData4;
        Object read$default;
        MutableState mutableState4;
        PasswordEntryViewEvent.ActionButtonClick.PasswordSubmitData passwordSubmitData5;
        BiometricsStore$BiometricsResult biometricsStore$BiometricsResult;
        BlockersScreens blockersScreens = basePasswordPresenter.args.screen;
        BetterNavigator.ScreenNavigator screenNavigator = basePasswordPresenter.navigator;
        AndroidBiometricsStore androidBiometricsStore = basePasswordPresenter.biometricsStore;
        AndroidStringManager androidStringManager = basePasswordPresenter.stringManager;
        if (continuationImpl instanceof BasePasswordPresenter$startSavePasswordWithBiometricsFlow$1) {
            basePasswordPresenter$startSavePasswordWithBiometricsFlow$1 = (BasePasswordPresenter$startSavePasswordWithBiometricsFlow$1) continuationImpl;
            int i2 = basePasswordPresenter$startSavePasswordWithBiometricsFlow$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                basePasswordPresenter$startSavePasswordWithBiometricsFlow$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = basePasswordPresenter$startSavePasswordWithBiometricsFlow$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = basePasswordPresenter$startSavePasswordWithBiometricsFlow$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Biometrics$AuthenticationStatus biometrics$AuthenticationStatus = androidBiometricsStore.getStatus().biometricsStatus;
                    if (biometrics$AuthenticationStatus instanceof Biometrics$AuthenticationStatus.AuthenticationStatusError) {
                        Biometrics$AuthenticationStatus.AuthenticationStatusError authenticationStatusError = (Biometrics$AuthenticationStatus.AuthenticationStatusError) biometrics$AuthenticationStatus;
                        if (authenticationStatusError.equals(Biometrics$AuthenticationStatus.HardwareNotSupported.INSTANCE) || authenticationStatusError.equals(Biometrics$AuthenticationStatus.OsUpdateRequired.INSTANCE)) {
                            screenNavigator.goTo(basePasswordPresenter.getCloseErrorDialog(androidStringManager.get(R.string.security_presenters_biometrics_generic_error_title), androidStringManager.get(R.string.security_presenters_biometrics_generic_error_message)));
                        } else {
                            if (!authenticationStatusError.equals(Biometrics$AuthenticationStatus.NoBiometricSignatures.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            screenNavigator.goTo(basePasswordPresenter.getBiometricEnrollmentErrorDialog(androidStringManager.get(R.string.security_presenters_biometrics_no_biometrics_error_title), androidStringManager.get(R.string.security_presenters_biometrics_no_biometrics_error_message)));
                        }
                        return Unit.INSTANCE;
                    }
                    passwordSubmitData2 = passwordSubmitData;
                    basePasswordPresenter$startSavePasswordWithBiometricsFlow$1.L$0 = passwordSubmitData2;
                    mutableState2 = mutableState;
                    basePasswordPresenter$startSavePasswordWithBiometricsFlow$1.L$1 = mutableState2;
                    basePasswordPresenter$startSavePasswordWithBiometricsFlow$1.label = 1;
                    hasStoredValue = androidBiometricsStore.hasStoredValue("vanity_key", basePasswordPresenter$startSavePasswordWithBiometricsFlow$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            mutableState2 = basePasswordPresenter$startSavePasswordWithBiometricsFlow$1.L$1;
                            passwordSubmitData4 = basePasswordPresenter$startSavePasswordWithBiometricsFlow$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            mutableState3 = mutableState2;
                            passwordSubmitData3 = passwordSubmitData4;
                            Activity activity = basePasswordPresenter.activity;
                            Biometrics$Info biometrics$Info = new Biometrics$Info(androidStringManager.get(R.string.security_presenters_biometrics_save_password_title), 2, null, androidStringManager.get(R.string.security_presenters_biometrics_save_password_description), androidStringManager.get(R.string.security_presenters_biometrics_use_password));
                            String str = blockersScreens.getBlockersData().flowToken;
                            ClientScenario clientScenario = blockersScreens.getBlockersData().clientScenario;
                            BiometricsStore$AnalyticsPayload biometricsStore$AnalyticsPayload = new BiometricsStore$AnalyticsPayload(str, clientScenario != null ? clientScenario.toString() : null);
                            basePasswordPresenter$startSavePasswordWithBiometricsFlow$1.L$0 = passwordSubmitData3;
                            basePasswordPresenter$startSavePasswordWithBiometricsFlow$1.L$1 = mutableState3;
                            basePasswordPresenter$startSavePasswordWithBiometricsFlow$1.label = 3;
                            PasswordEntryViewEvent.ActionButtonClick.PasswordSubmitData passwordSubmitData6 = passwordSubmitData3;
                            BasePasswordPresenter$startSavePasswordWithBiometricsFlow$1 basePasswordPresenter$startSavePasswordWithBiometricsFlow$12 = basePasswordPresenter$startSavePasswordWithBiometricsFlow$1;
                            read$default = AndroidBiometricsStore.read$default(androidBiometricsStore, activity, "vanity_key", biometrics$Info, biometricsStore$AnalyticsPayload, basePasswordPresenter$startSavePasswordWithBiometricsFlow$12);
                            basePasswordPresenter$startSavePasswordWithBiometricsFlow$1 = basePasswordPresenter$startSavePasswordWithBiometricsFlow$12;
                            if (read$default != obj2) {
                                mutableState4 = mutableState3;
                                obj = read$default;
                                passwordSubmitData5 = passwordSubmitData6;
                                biometricsStore$BiometricsResult = (BiometricsStore$BiometricsResult) obj;
                                if (!(biometricsStore$BiometricsResult instanceof BiometricsStore$BiometricsResult.Error)) {
                                }
                                return Unit.INSTANCE;
                            }
                            return obj2;
                        }
                        if (i != 3) {
                            if (i == 4) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        mutableState4 = basePasswordPresenter$startSavePasswordWithBiometricsFlow$1.L$1;
                        passwordSubmitData5 = basePasswordPresenter$startSavePasswordWithBiometricsFlow$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        biometricsStore$BiometricsResult = (BiometricsStore$BiometricsResult) obj;
                        if (!(biometricsStore$BiometricsResult instanceof BiometricsStore$BiometricsResult.Error)) {
                            basePasswordPresenter.handleBiometricsErrors(((BiometricsStore$BiometricsResult.Error) biometricsStore$BiometricsResult).error, mutableState4);
                        } else if (biometricsStore$BiometricsResult instanceof BiometricsStore$BiometricsResult.Success) {
                            MutableState mutableState5 = mutableState4;
                            PasswordEntryViewEvent.ActionButtonClick.PasswordSubmitData passwordSubmitData7 = passwordSubmitData5;
                            ShoppingWebBridge$loadUrl$1 shoppingWebBridge$loadUrl$1 = new ShoppingWebBridge$loadUrl$1(basePasswordPresenter, (Continuation) null, 2);
                            basePasswordPresenter$startSavePasswordWithBiometricsFlow$1.L$0 = null;
                            basePasswordPresenter$startSavePasswordWithBiometricsFlow$1.L$1 = null;
                            basePasswordPresenter$startSavePasswordWithBiometricsFlow$1.label = 4;
                        } else {
                            if (biometricsStore$BiometricsResult != null && !(biometricsStore$BiometricsResult instanceof BiometricsStore$BiometricsResult.PlatformException) && !(biometricsStore$BiometricsResult instanceof BiometricsStore$BiometricsResult.DecryptionFailure)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            screenNavigator.goTo(basePasswordPresenter.getCloseErrorDialog(androidStringManager.get(R.string.security_presenters_biometrics_generic_error_title), androidStringManager.get(R.string.security_presenters_biometrics_generic_error_message)));
                        }
                        return Unit.INSTANCE;
                    }
                    mutableState2 = basePasswordPresenter$startSavePasswordWithBiometricsFlow$1.L$1;
                    PasswordEntryViewEvent.ActionButtonClick.PasswordSubmitData passwordSubmitData8 = basePasswordPresenter$startSavePasswordWithBiometricsFlow$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    hasStoredValue = obj;
                    passwordSubmitData2 = passwordSubmitData8;
                }
                if (!((Boolean) hasStoredValue).booleanValue()) {
                    MutableState mutableState6 = mutableState2;
                    passwordSubmitData3 = passwordSubmitData2;
                    mutableState3 = mutableState6;
                    Activity activity2 = basePasswordPresenter.activity;
                    Biometrics$Info biometrics$Info2 = new Biometrics$Info(androidStringManager.get(R.string.security_presenters_biometrics_save_password_title), 2, null, androidStringManager.get(R.string.security_presenters_biometrics_save_password_description), androidStringManager.get(R.string.security_presenters_biometrics_use_password));
                    String str2 = blockersScreens.getBlockersData().flowToken;
                    ClientScenario clientScenario2 = blockersScreens.getBlockersData().clientScenario;
                    BiometricsStore$AnalyticsPayload biometricsStore$AnalyticsPayload2 = new BiometricsStore$AnalyticsPayload(str2, clientScenario2 != null ? clientScenario2.toString() : null);
                    basePasswordPresenter$startSavePasswordWithBiometricsFlow$1.L$0 = passwordSubmitData3;
                    basePasswordPresenter$startSavePasswordWithBiometricsFlow$1.L$1 = mutableState3;
                    basePasswordPresenter$startSavePasswordWithBiometricsFlow$1.label = 3;
                    PasswordEntryViewEvent.ActionButtonClick.PasswordSubmitData passwordSubmitData62 = passwordSubmitData3;
                    BasePasswordPresenter$startSavePasswordWithBiometricsFlow$1 basePasswordPresenter$startSavePasswordWithBiometricsFlow$122 = basePasswordPresenter$startSavePasswordWithBiometricsFlow$1;
                    read$default = AndroidBiometricsStore.read$default(androidBiometricsStore, activity2, "vanity_key", biometrics$Info2, biometricsStore$AnalyticsPayload2, basePasswordPresenter$startSavePasswordWithBiometricsFlow$122);
                    basePasswordPresenter$startSavePasswordWithBiometricsFlow$1 = basePasswordPresenter$startSavePasswordWithBiometricsFlow$122;
                    if (read$default != obj2) {
                    }
                    return obj2;
                }
                basePasswordPresenter$startSavePasswordWithBiometricsFlow$1.L$0 = passwordSubmitData2;
                basePasswordPresenter$startSavePasswordWithBiometricsFlow$1.L$1 = mutableState2;
                basePasswordPresenter$startSavePasswordWithBiometricsFlow$1.label = 2;
                if (androidBiometricsStore.write("vanity_key", "vanity_arbitrary_value", basePasswordPresenter$startSavePasswordWithBiometricsFlow$1) != obj2) {
                    passwordSubmitData4 = passwordSubmitData2;
                    mutableState3 = mutableState2;
                    passwordSubmitData3 = passwordSubmitData4;
                    Activity activity22 = basePasswordPresenter.activity;
                    Biometrics$Info biometrics$Info22 = new Biometrics$Info(androidStringManager.get(R.string.security_presenters_biometrics_save_password_title), 2, null, androidStringManager.get(R.string.security_presenters_biometrics_save_password_description), androidStringManager.get(R.string.security_presenters_biometrics_use_password));
                    String str22 = blockersScreens.getBlockersData().flowToken;
                    ClientScenario clientScenario22 = blockersScreens.getBlockersData().clientScenario;
                    BiometricsStore$AnalyticsPayload biometricsStore$AnalyticsPayload22 = new BiometricsStore$AnalyticsPayload(str22, clientScenario22 != null ? clientScenario22.toString() : null);
                    basePasswordPresenter$startSavePasswordWithBiometricsFlow$1.L$0 = passwordSubmitData3;
                    basePasswordPresenter$startSavePasswordWithBiometricsFlow$1.L$1 = mutableState3;
                    basePasswordPresenter$startSavePasswordWithBiometricsFlow$1.label = 3;
                    PasswordEntryViewEvent.ActionButtonClick.PasswordSubmitData passwordSubmitData622 = passwordSubmitData3;
                    BasePasswordPresenter$startSavePasswordWithBiometricsFlow$1 basePasswordPresenter$startSavePasswordWithBiometricsFlow$1222 = basePasswordPresenter$startSavePasswordWithBiometricsFlow$1;
                    read$default = AndroidBiometricsStore.read$default(androidBiometricsStore, activity22, "vanity_key", biometrics$Info22, biometricsStore$AnalyticsPayload22, basePasswordPresenter$startSavePasswordWithBiometricsFlow$1222);
                    basePasswordPresenter$startSavePasswordWithBiometricsFlow$1 = basePasswordPresenter$startSavePasswordWithBiometricsFlow$1222;
                    if (read$default != obj2) {
                    }
                }
                return obj2;
            }
        }
        basePasswordPresenter$startSavePasswordWithBiometricsFlow$1 = new BasePasswordPresenter$startSavePasswordWithBiometricsFlow$1(basePasswordPresenter, continuationImpl);
        Object obj3 = basePasswordPresenter$startSavePasswordWithBiometricsFlow$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = basePasswordPresenter$startSavePasswordWithBiometricsFlow$1.label;
        if (i != 0) {
        }
        if (!((Boolean) hasStoredValue).booleanValue()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$submitForm(BasePasswordPresenter basePasswordPresenter, String str, MutableState mutableState, ContinuationImpl continuationImpl) {
        BasePasswordPresenter$submitForm$1 basePasswordPresenter$submitForm$1;
        int i;
        ApiResult apiResult;
        AndroidStringManager androidStringManager = basePasswordPresenter.stringManager;
        BetterNavigator.ScreenNavigator screenNavigator = basePasswordPresenter.navigator;
        BlockersScreens blockersScreens = basePasswordPresenter.args.screen;
        if (continuationImpl instanceof BasePasswordPresenter$submitForm$1) {
            basePasswordPresenter$submitForm$1 = (BasePasswordPresenter$submitForm$1) continuationImpl;
            int i2 = basePasswordPresenter$submitForm$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                basePasswordPresenter$submitForm$1.label = i2 - PKIFailureInfo.systemUnavail;
                BasePasswordPresenter$submitForm$1 basePasswordPresenter$submitForm$12 = basePasswordPresenter$submitForm$1;
                Object obj = basePasswordPresenter$submitForm$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = basePasswordPresenter$submitForm$12.label;
                String str2 = null;
                Object[] objArr = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState.setValue(PasswordEntryState.copy$default((PasswordEntryState) mutableState.getValue(), true, null, 6));
                    Analytics analytics = basePasswordPresenter.analytics;
                    BlockersData blockersData = blockersScreens.getBlockersData();
                    RealMRIFactory$sign$2.AnonymousClass1 anonymousClass1 = new RealMRIFactory$sign$2.AnonymousClass1(basePasswordPresenter, str, objArr == true ? 1 : 0, 17);
                    basePasswordPresenter$submitForm$12.L$1 = mutableState;
                    basePasswordPresenter$submitForm$12.label = 1;
                    obj = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, blockersData, analytics, androidStringManager, basePasswordPresenter$submitForm$12, null, anonymousClass1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState = basePasswordPresenter$submitForm$12.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    SubmitFormResponse submitFormResponse = (SubmitFormResponse) ((ApiResult.Success) apiResult).response;
                    BlockersData blockersData2 = blockersScreens.getBlockersData();
                    ResponseContext responseContext = submitFormResponse.response_context;
                    responseContext.getClass();
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    BlockersData updateFromResponseContext = blockersData2.updateFromResponseContext(responseContext, false);
                    String str3 = responseContext.dialog_message;
                    if (str3 != null) {
                        screenNavigator.goTo(new BlockersScreens.SuccessMessageScreen(updateFromResponseContext, null, str3, responseContext.dialog_title, 2));
                    } else {
                        screenNavigator.goTo(basePasswordPresenter.blockersDataNavigator.getNext(blockersScreens, updateFromResponseContext));
                    }
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    mutableState.setValue(PasswordEntryState.copy$default((PasswordEntryState) mutableState.getValue(), false, null, 6));
                    screenNavigator.goTo(new FailureMessageBlockerScreen(blockersScreens.getBlockersData(), androidStringManager.get(R.string.generic_network_error), str2, 4));
                }
                return Unit.INSTANCE;
            }
        }
        basePasswordPresenter$submitForm$1 = new BasePasswordPresenter$submitForm$1(basePasswordPresenter, continuationImpl);
        BasePasswordPresenter$submitForm$1 basePasswordPresenter$submitForm$122 = basePasswordPresenter$submitForm$1;
        Object obj2 = basePasswordPresenter$submitForm$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = basePasswordPresenter$submitForm$122.label;
        String str22 = null;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    public final PasswordDialogScreen getBiometricEnrollmentErrorDialog(String str, String str2) {
        AndroidStringManager androidStringManager = this.stringManager;
        String str3 = androidStringManager.get(R.string.security_presenters_settings);
        PasswordDialogScreen.PasswordDialog.Style style = PasswordDialogScreen.PasswordDialog.Style.Default;
        return new PasswordDialogScreen(new PasswordDialogScreen.PasswordDialog(str, str2, new PasswordDialogScreen.PasswordDialog.Button("open_biometric_enrollment", str3, style, PasswordDialogScreen.PasswordDialog.Action.OpenBiometricEnrollment), new PasswordDialogScreen.PasswordDialog.Button("close", androidStringManager.get(R.string.security_presenters_cancel), style, PasswordDialogScreen.PasswordDialog.Action.Close)));
    }

    public final PasswordDialogScreen getCloseErrorDialog(String str, String str2) {
        str.getClass();
        str2.getClass();
        return new PasswordDialogScreen(new PasswordDialogScreen.PasswordDialog(str, str2, new PasswordDialogScreen.PasswordDialog.Button("close", this.stringManager.get(R.string.security_presenters_cancel), PasswordDialogScreen.PasswordDialog.Style.Default, PasswordDialogScreen.PasswordDialog.Action.Close), null));
    }

    public final PasswordDialogScreen getPasswordEntryErrorDialog(String str) {
        return new PasswordDialogScreen(new PasswordDialogScreen.PasswordDialog(null, str, new PasswordDialogScreen.PasswordDialog.Button("ok", this.stringManager.get(R.string.security_presenters_ok), PasswordDialogScreen.PasswordDialog.Style.Default, PasswordDialogScreen.PasswordDialog.Action.Close), null));
    }

    public final void handleBiometricsErrors(Biometrics$Result.Error error, MutableState mutableState) {
        mutableState.getClass();
        boolean z = error instanceof Biometrics$Result.Error.Generic;
        BetterNavigator.ScreenNavigator screenNavigator = this.navigator;
        AndroidStringManager androidStringManager = this.stringManager;
        if (z || (error instanceof Biometrics$Result.Error.HardwareUnavailable) || (error instanceof Biometrics$Result.Error.UnableToProcess)) {
            screenNavigator.goTo(getCloseErrorDialog(androidStringManager.get(R.string.security_presenters_biometrics_generic_error_title), androidStringManager.get(R.string.security_presenters_biometrics_generic_error_message)));
            return;
        }
        if (error instanceof Biometrics$Result.Error.Lockout) {
            mutableState.setValue(PasswordEntryState.copy$default((PasswordEntryState) mutableState.getValue(), false, new BiometricsCheckboxModel$SaveBiometricsLogIn(false), 3));
            screenNavigator.goTo(getCloseErrorDialog(androidStringManager.get(R.string.security_presenters_biometrics_lockout_error_title), androidStringManager.get(R.string.security_presenters_biometrics_lockout_error_message)));
            return;
        }
        if (error instanceof Biometrics$Result.Error.NegativeButton) {
            mutableState.setValue(PasswordEntryState.copy$default((PasswordEntryState) mutableState.getValue(), false, new BiometricsCheckboxModel$SaveBiometricsLogIn(false), 3));
            return;
        }
        if (error instanceof Biometrics$Result.Error.NoSpace) {
            screenNavigator.goTo(getCloseErrorDialog(androidStringManager.get(R.string.security_presenters_biometrics_no_space_error_title), androidStringManager.get(R.string.security_presenters_biometrics_no_space_error_message)));
            return;
        }
        if (error instanceof Biometrics$Result.Error.Timeout) {
            screenNavigator.goTo(getCloseErrorDialog(androidStringManager.get(R.string.security_presenters_biometrics_timeout_error_title), androidStringManager.get(R.string.security_presenters_biometrics_timeout_error_message)));
            return;
        }
        if (error instanceof Biometrics$Result.Error.NoBiometricSignaturesFound) {
            screenNavigator.goTo(getBiometricEnrollmentErrorDialog(androidStringManager.get(R.string.security_presenters_biometrics_no_biometrics_error_title), androidStringManager.get(R.string.security_presenters_biometrics_no_biometrics_error_message)));
            return;
        }
        if (error instanceof Biometrics$Result.Error.NoDeviceCredentials) {
            screenNavigator.goTo(getBiometricEnrollmentErrorDialog(androidStringManager.get(R.string.security_presenters_biometrics_no_device_credentials_error_title), androidStringManager.get(R.string.security_presenters_biometrics_no_device_credentials_error_message)));
        } else {
            if ((error instanceof Biometrics$Result.Error.SystemCanceled) || (error instanceof Biometrics$Result.Error.UserCanceled)) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    public abstract Object handleUseBiometricToSignInViewEvent(MutableState mutableState, BasePasswordPresenter$models$1$1 basePasswordPresenter$models$1$1);

    public abstract Object initialBiometricsFlow(MutableState mutableState, Continuation continuation);

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1444348412);
        Object rememberedValue = gapComposer.rememberedValue();
        int i2 = 0;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(new PasswordEntryState(false, this.args.passwordScreenData, BiometricsCheckboxModel$Hidden.INSTANCE));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new BasePasswordPresenter$models$1$1(this, mutableState, continuation, i2);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
        Updater.LaunchedEffect(gapComposer, flow, new RealQrCodesPresenter$models$1$1(flow, continuation, this, mutableState, 19));
        PasswordEntryState passwordEntryState = (PasswordEntryState) mutableState.getValue();
        Object content = passwordEntryState.loading ? PasswordEntryViewModel.Loading.INSTANCE : new PasswordEntryViewModel.Content(passwordEntryState.passwordScreenData, passwordEntryState.checkboxModel);
        gapComposer.end(false);
        return content;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0084, code lost:
    
        if (r4 == r8) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.squareup.cash.security.presenters.BasePasswordPresenter, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [androidx.core.widget.PopupWindowCompat] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setOrVerifyPassword(boolean z, PasswordEntryViewEvent.ActionButtonClick.PasswordSubmitData passwordSubmitData, MutableState mutableState, ShoppingWebBridge$loadUrl$1 shoppingWebBridge$loadUrl$1, ContinuationImpl continuationImpl) {
        BasePasswordPresenter$setOrVerifyPassword$1 basePasswordPresenter$setOrVerifyPassword$1;
        int i;
        ShoppingWebBridge$loadUrl$1 shoppingWebBridge$loadUrl$12;
        Object orVerifyPasswordApi;
        ApiResult apiResult;
        PopupWindowCompat popupWindowCompat;
        MutableState mutableState2;
        MutableState mutableState3;
        ApiResult apiResult2;
        MutableState mutableState4;
        ?? r4;
        String str;
        boolean z2 = z;
        MutableState mutableState5 = mutableState;
        BlockersScreens blockersScreens = this.args.screen;
        if (continuationImpl instanceof BasePasswordPresenter$setOrVerifyPassword$1) {
            basePasswordPresenter$setOrVerifyPassword$1 = (BasePasswordPresenter$setOrVerifyPassword$1) continuationImpl;
            int i2 = basePasswordPresenter$setOrVerifyPassword$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                basePasswordPresenter$setOrVerifyPassword$1.label = i2 - PKIFailureInfo.systemUnavail;
                BasePasswordPresenter$setOrVerifyPassword$1 basePasswordPresenter$setOrVerifyPassword$12 = basePasswordPresenter$setOrVerifyPassword$1;
                Object obj = basePasswordPresenter$setOrVerifyPassword$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = basePasswordPresenter$setOrVerifyPassword$12.label;
                BetterNavigator.ScreenNavigator screenNavigator = this.navigator;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState5.setValue(PasswordEntryState.copy$default((PasswordEntryState) mutableState5.getValue(), true, null, 6));
                    basePasswordPresenter$setOrVerifyPassword$12.L$1 = mutableState5;
                    shoppingWebBridge$loadUrl$12 = shoppingWebBridge$loadUrl$1;
                    basePasswordPresenter$setOrVerifyPassword$12.L$2 = shoppingWebBridge$loadUrl$12;
                    basePasswordPresenter$setOrVerifyPassword$12.Z$0 = z2;
                    basePasswordPresenter$setOrVerifyPassword$12.label = 1;
                    orVerifyPasswordApi = setOrVerifyPasswordApi(z2, passwordSubmitData, basePasswordPresenter$setOrVerifyPassword$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mutableState3 = basePasswordPresenter$setOrVerifyPassword$12.L$1;
                            SafeTrace.throwOnFailure(obj);
                            popupWindowCompat = null;
                            mutableState2 = mutableState3;
                            mutableState2.setValue(PasswordEntryState.copy$default((PasswordEntryState) mutableState2.getValue(), false, popupWindowCompat, 6));
                            screenNavigator.goTo(getPasswordEntryErrorDialog(this.stringManager.get(R.string.generic_network_error)));
                            return Unit.INSTANCE;
                        }
                        apiResult2 = basePasswordPresenter$setOrVerifyPassword$12.L$3;
                        mutableState4 = basePasswordPresenter$setOrVerifyPassword$12.L$1;
                        SafeTrace.throwOnFailure(obj);
                        r4 = 0;
                        ResponseContext responseContext = ((PasswordResponseAdapter) ((ApiResult.Success) apiResult2).response).responseContext;
                        BlockersData blockersData = blockersScreens.getBlockersData();
                        Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                        BlockersData updateFromResponseContext = blockersData.updateFromResponseContext(responseContext, false);
                        str = responseContext.dialog_message;
                        if (str != null || StringsKt.isBlank(str)) {
                            screenNavigator.goTo(this.blockersDataNavigator.getNext(blockersScreens, updateFromResponseContext));
                        } else {
                            mutableState4.setValue(PasswordEntryState.copy$default((PasswordEntryState) mutableState4.getValue(), false, r4, 6));
                            screenNavigator.goTo(getPasswordEntryErrorDialog(str));
                        }
                        return Unit.INSTANCE;
                    }
                    z2 = basePasswordPresenter$setOrVerifyPassword$12.Z$0;
                    ShoppingWebBridge$loadUrl$1 shoppingWebBridge$loadUrl$13 = basePasswordPresenter$setOrVerifyPassword$12.L$2;
                    MutableState mutableState6 = basePasswordPresenter$setOrVerifyPassword$12.L$1;
                    SafeTrace.throwOnFailure(obj);
                    shoppingWebBridge$loadUrl$12 = shoppingWebBridge$loadUrl$13;
                    mutableState5 = mutableState6;
                    orVerifyPasswordApi = obj;
                }
                boolean z3 = z2;
                apiResult = (ApiResult) orVerifyPasswordApi;
                if (apiResult instanceof ApiResult.Success) {
                    popupWindowCompat = null;
                    MutableState mutableState7 = mutableState5;
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (!(apiResult instanceof ApiResult.Failure.HttpFailure) || ((ApiResult.Failure.HttpFailure) apiResult).code != -1) {
                        mutableState2 = mutableState7;
                        mutableState2.setValue(PasswordEntryState.copy$default((PasswordEntryState) mutableState2.getValue(), false, popupWindowCompat, 6));
                        screenNavigator.goTo(getPasswordEntryErrorDialog(this.stringManager.get(R.string.generic_network_error)));
                        return Unit.INSTANCE;
                    }
                    basePasswordPresenter$setOrVerifyPassword$12.L$1 = mutableState7;
                    basePasswordPresenter$setOrVerifyPassword$12.L$2 = null;
                    basePasswordPresenter$setOrVerifyPassword$12.L$3 = null;
                    basePasswordPresenter$setOrVerifyPassword$12.Z$0 = z3;
                    basePasswordPresenter$setOrVerifyPassword$12.label = 3;
                    if (this.biometricsStore.write("biometric_enclave_key", null, basePasswordPresenter$setOrVerifyPassword$12) != coroutineSingletons) {
                        mutableState3 = mutableState7;
                        mutableState2 = mutableState3;
                        mutableState2.setValue(PasswordEntryState.copy$default((PasswordEntryState) mutableState2.getValue(), false, popupWindowCompat, 6));
                        screenNavigator.goTo(getPasswordEntryErrorDialog(this.stringManager.get(R.string.generic_network_error)));
                        return Unit.INSTANCE;
                    }
                } else {
                    MutableState mutableState8 = mutableState5;
                    ApiResult.Success success = (ApiResult.Success) apiResult;
                    Continuation continuation = null;
                    BasicShieetKt$BasicShieet$4$1 basicShieetKt$BasicShieet$4$1 = new BasicShieetKt$BasicShieet$4$1(success, shoppingWebBridge$loadUrl$12, this, continuation, 4);
                    basePasswordPresenter$setOrVerifyPassword$12.L$1 = mutableState8;
                    basePasswordPresenter$setOrVerifyPassword$12.L$2 = null;
                    basePasswordPresenter$setOrVerifyPassword$12.L$3 = success;
                    basePasswordPresenter$setOrVerifyPassword$12.Z$0 = z3;
                    basePasswordPresenter$setOrVerifyPassword$12.label = 2;
                    if (JobKt.withContext(this.ioDispatcher, basicShieetKt$BasicShieet$4$1, basePasswordPresenter$setOrVerifyPassword$12) != coroutineSingletons) {
                        apiResult2 = apiResult;
                        mutableState4 = mutableState8;
                        r4 = continuation;
                        ResponseContext responseContext2 = ((PasswordResponseAdapter) ((ApiResult.Success) apiResult2).response).responseContext;
                        BlockersData blockersData2 = blockersScreens.getBlockersData();
                        Parcelable.Creator<BlockersData> creator2 = BlockersData.CREATOR;
                        BlockersData updateFromResponseContext2 = blockersData2.updateFromResponseContext(responseContext2, false);
                        str = responseContext2.dialog_message;
                        if (str != null) {
                        }
                        screenNavigator.goTo(this.blockersDataNavigator.getNext(blockersScreens, updateFromResponseContext2));
                        return Unit.INSTANCE;
                    }
                }
                return coroutineSingletons;
            }
        }
        basePasswordPresenter$setOrVerifyPassword$1 = new BasePasswordPresenter$setOrVerifyPassword$1(this, continuationImpl);
        BasePasswordPresenter$setOrVerifyPassword$1 basePasswordPresenter$setOrVerifyPassword$122 = basePasswordPresenter$setOrVerifyPassword$1;
        Object obj2 = basePasswordPresenter$setOrVerifyPassword$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = basePasswordPresenter$setOrVerifyPassword$122.label;
        BetterNavigator.ScreenNavigator screenNavigator2 = this.navigator;
        if (i != 0) {
        }
        boolean z32 = z2;
        apiResult = (ApiResult) orVerifyPasswordApi;
        if (apiResult instanceof ApiResult.Success) {
        }
        return coroutineSingletons2;
    }

    public abstract Object setOrVerifyPasswordApi(boolean z, PasswordEntryViewEvent.ActionButtonClick.PasswordSubmitData passwordSubmitData, ContinuationImpl continuationImpl);
}
