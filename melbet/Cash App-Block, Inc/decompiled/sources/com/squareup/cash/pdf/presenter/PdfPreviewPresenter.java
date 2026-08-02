package com.squareup.cash.pdf.presenter;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.AliasesSectionViewModel;
import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.cash.biometrics.BiometricsStore$Status;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.customersupport.CustomerSupportCaptureComplete;
import com.squareup.cash.cdf.trusteddevice.TrustedDeviceRemoveConfirmation;
import com.squareup.cash.cdf.trusteddevice.TrustedDeviceRemoveSelect;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.profile.PasscodeSettings;
import com.squareup.cash.data.profile.RealContactAliasFetcher;
import com.squareup.cash.data.profile.RealProfileAliasRepository;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.datetimeformatter.api.TodayDateTimeFormatter$FormatOptions;
import com.squareup.cash.datetimeformatter.real.RealTodayDateTimeFormatter;
import com.squareup.cash.devicegrip.service.RemoveDevicesResponse;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$DeviceRemovalHalfSheet;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.keystore.RealKeyStoreProvider$setEntry$2;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.music.presenters.MusicPresenter$models$1$1;
import com.squareup.cash.nearby.views.DotGridKt$DotGrid$3$1;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsHelper;
import com.squareup.cash.offers.presenters.OffersHomePresenter$models$2$1;
import com.squareup.cash.passkeys.backend.PasskeyRepository$PasskeyRegistrationResult;
import com.squareup.cash.passkeys.backend.RealPasskeyRepository;
import com.squareup.cash.passkeys.presenters.PasskeyUpsellPresenter$handleRegistration$1;
import com.squareup.cash.passkeys.presenters.PasskeyUpsellPresenter$submitFormAndAdvance$1;
import com.squareup.cash.passkeys.screens.PasskeyUpsellScreen;
import com.squareup.cash.passkeys.viewmodels.PasskeyUpsellViewModel;
import com.squareup.cash.pdf.backend.real.PdfBitmapRender;
import com.squareup.cash.pdf.screen.PdfScreen;
import com.squareup.cash.pdf.view.PdfPreviewViewModel;
import com.squareup.cash.phoneplans.PhonePlansHomePresenter$models$1$1;
import com.squareup.cash.pools.presenters.PoolsListPresenter$models$2$2;
import com.squareup.cash.profile.devicemanager.backend.DeviceManagerRepo$DeleteDeviceResult;
import com.squareup.cash.profile.devicemanager.backend.LoggedInDevice;
import com.squareup.cash.profile.devicemanager.backend.RealDeviceManagerAnalytics;
import com.squareup.cash.profile.devicemanager.backend.RealDeviceManagerRepo;
import com.squareup.cash.profile.devicemanager.presenters.DataLoadingState;
import com.squareup.cash.profile.devicemanager.presenters.DeviceManagerDeviceDetailsPresenter$DeleteState;
import com.squareup.cash.profile.devicemanager.presenters.DeviceManagerDeviceDetailsPresenter$WhenMappings;
import com.squareup.cash.profile.devicemanager.presenters.DeviceManagerDeviceDetailsPresenter$deleteDevice$1;
import com.squareup.cash.profile.devicemanager.presenters.DeviceManagerListPresenter$WhenMappings;
import com.squareup.cash.profile.devicemanager.presenters.DeviceManagerListPresenter$removeAllDevices$1;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceDetailsScreen;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceRemovalFailedBottomSheetScreen;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceRemovalFailedFullScreen;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceRemovalFailedScreen;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceRemovalSuccessBottomSheetScreen;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceRemovalSuccessFullScreen;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceRemovalSuccessScreen;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerListScreen;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerDeviceDetailViewModel;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerListViewModel;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerRemovedSuccessViewModel;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceType;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceViewModel;
import com.squareup.cash.profile.presenters.personal.AliasesSectionPresenter$Result;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.Alias;
import com.squareup.cash.profile.viewmodels.EnableAliasSheetViewModel;
import com.squareup.cash.profile.views.RingtoneView;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter$models$1$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.presenters.SelectPaymentPlanBlockerPresenter$models$1$2;
import com.squareup.cash.savings.presenters.SavingsRouteInterstitialPresenter$models$1$1;
import com.squareup.cash.savings.screens.SavingsRouteInterstitialScreen;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.session.backend.AuthenticatedState;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda2;
import com.squareup.cash.shopping.sup.backend.SingleWebSessionInMemoryManager;
import com.squareup.cash.shopping.sup.screens.SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen;
import com.squareup.cash.shopping.sup.viewmodels.SingleUsePaymentCheckoutViewModel;
import com.squareup.cash.shopping.web.ShoppingWebBridge$loadUrl$1;
import com.squareup.cash.storage.AndroidFileProvider;
import com.squareup.cash.storage.AndroidFileSaver;
import com.squareup.cash.storage.AndroidFileSaver$save$2;
import com.squareup.cash.support.backend.api.ScreenshotService$ServiceState;
import com.squareup.cash.support.chat.backend.real.RealChatSurveyService;
import com.squareup.cash.support.chat.screens.SupportChatScreens;
import com.squareup.cash.support.chat.viewmodels.ChatSurveyViewModel;
import com.squareup.cash.support.chat.views.ChatInputView$Content$1$1$1;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.screenshot.AnalyticsUitlKt;
import com.squareup.cash.support.screenshot.RealScreenshotManager;
import com.squareup.cash.support.screenshot.ScreenshotManager$ScreenshotState;
import com.squareup.cash.support.viewmodels.ScreenshotReviewViewModel;
import com.squareup.cash.tax.presenters.TaxWebAppPresenter$models$1$1;
import com.squareup.cash.transfers.views.WithdrawViewKt$WithdrawAmountView$1$1;
import com.squareup.cash.ui.gcm.NotificationActionService$onHandleIntent$1;
import com.squareup.cash.webview.android.WebViewProvider;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import com.squareup.cash.work.data.real.RealShiftTimeFormatter;
import com.squareup.cash.work.presenters.shift.RealClockInRepository;
import com.squareup.cash.work.screens.ShiftNoteScreen;
import com.squareup.cash.work.screens.TakeBreakBottomSheetScreen;
import com.squareup.cash.work.session.RealSelectedMerchantProvider;
import com.squareup.cash.work.viewmodels.ShiftNoteViewModel;
import com.squareup.cash.work.viewmodels.TakeBreakBottomSheetViewModel;
import com.squareup.cash.work.viewmodels.ToastState;
import com.squareup.cropview.Edge;
import com.squareup.protos.cash.notifications.NotificationPreferenceUpdatedEvent$ClientExperienceVersion;
import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.protos.cash.piggybank.appapi.PiggybankAppService;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.NotificationPreference;
import com.squareup.protos.franklin.api.PasskeyUpsellBlocker;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SubmitFormResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.workflow1.internal.WorkflowNode$tick$1$1;
import com.stripe.hcaptcha.HCaptcha;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PdfPreviewPresenter implements MoleculePresenter {
    public final /* synthetic */ int $r8$classId;
    public final Object args;
    public final Object fileProvider;
    public final Object fileSaver;
    public final Object launcher;
    public final BetterNavigator.ScreenNavigator navigator;
    public final Object pdfFile$delegate;
    public final Object stringManager;

    public PdfPreviewPresenter(RealChatSurveyService realChatSurveyService, AndroidStringManager androidStringManager, Analytics analytics, FeatureFlagManager featureFlagManager, SupportChatScreens.FlowScreen.ChatSurveyScreen chatSurveyScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 9;
        chatSurveyScreen.getClass();
        this.args = realChatSurveyService;
        this.stringManager = androidStringManager;
        this.launcher = analytics;
        this.fileProvider = featureFlagManager;
        this.fileSaver = chatSurveyScreen;
        this.navigator = screenNavigator;
        this.pdfFile$delegate = LazyKt.lazy(new BottomSheet$$ExternalSyntheticLambda2(this, 24));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$deleteDevice(PdfPreviewPresenter pdfPreviewPresenter, LoggedInDevice loggedInDevice, ContinuationImpl continuationImpl) {
        DeviceManagerDeviceDetailsPresenter$deleteDevice$1 deviceManagerDeviceDetailsPresenter$deleteDevice$1;
        int i;
        boolean z;
        DeviceManagerRepo$DeleteDeviceResult deviceManagerRepo$DeleteDeviceResult;
        LoggedInDevice loggedInDevice2 = loggedInDevice;
        Analytics analytics = ((RealDeviceManagerAnalytics) pdfPreviewPresenter.fileProvider).analytics;
        DeviceManagerDeviceDetailsScreen deviceManagerDeviceDetailsScreen = (DeviceManagerDeviceDetailsScreen) pdfPreviewPresenter.pdfFile$delegate;
        if (continuationImpl instanceof DeviceManagerDeviceDetailsPresenter$deleteDevice$1) {
            deviceManagerDeviceDetailsPresenter$deleteDevice$1 = (DeviceManagerDeviceDetailsPresenter$deleteDevice$1) continuationImpl;
            int i2 = deviceManagerDeviceDetailsPresenter$deleteDevice$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                deviceManagerDeviceDetailsPresenter$deleteDevice$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = deviceManagerDeviceDetailsPresenter$deleteDevice$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deviceManagerDeviceDetailsPresenter$deleteDevice$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    analytics.track(new TrustedDeviceRemoveSelect(), null);
                    boolean enabled = ((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) pdfPreviewPresenter.fileSaver)).peekCurrentValue(LaunchDarklyFeatureFlags$DeviceRemovalHalfSheet.INSTANCE)).enabled();
                    RealDeviceManagerRepo realDeviceManagerRepo = (RealDeviceManagerRepo) pdfPreviewPresenter.args;
                    String str = loggedInDevice2.appToken;
                    deviceManagerDeviceDetailsPresenter$deleteDevice$1.L$0 = loggedInDevice2;
                    deviceManagerDeviceDetailsPresenter$deleteDevice$1.Z$0 = enabled;
                    deviceManagerDeviceDetailsPresenter$deleteDevice$1.label = 1;
                    Object deleteDevice = realDeviceManagerRepo.deleteDevice(str, deviceManagerDeviceDetailsPresenter$deleteDevice$1);
                    if (deleteDevice == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = deleteDevice;
                    z = enabled;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = deviceManagerDeviceDetailsPresenter$deleteDevice$1.Z$0;
                    loggedInDevice2 = deviceManagerDeviceDetailsPresenter$deleteDevice$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                deviceManagerRepo$DeleteDeviceResult = (DeviceManagerRepo$DeleteDeviceResult) obj;
                if (!(deviceManagerRepo$DeleteDeviceResult instanceof DeviceManagerRepo$DeleteDeviceResult.Successful)) {
                    return z ? new DeviceManagerDeviceRemovalSuccessBottomSheetScreen(new RedactedString(loggedInDevice2.name)) : new DeviceManagerDeviceRemovalSuccessFullScreen(new RedactedString(loggedInDevice2.name));
                }
                if (deviceManagerRepo$DeleteDeviceResult instanceof DeviceManagerRepo$DeleteDeviceResult.NetworkFailure) {
                    if (z) {
                        return new DeviceManagerDeviceRemovalFailedBottomSheetScreen(((DeviceManagerRepo$DeleteDeviceResult.NetworkFailure) deviceManagerRepo$DeleteDeviceResult).failedTokens, deviceManagerDeviceDetailsScreen.removeAttemptCount, (DeviceManagerDeviceRemovalFailedScreen.ErrorReason) null, 0, 28);
                    }
                    return new DeviceManagerDeviceRemovalFailedFullScreen(((DeviceManagerRepo$DeleteDeviceResult.NetworkFailure) deviceManagerRepo$DeleteDeviceResult).failedTokens, deviceManagerDeviceDetailsScreen.removeAttemptCount, (DeviceManagerDeviceRemovalFailedScreen.ErrorReason) null, 0, 28);
                }
                if (!(deviceManagerRepo$DeleteDeviceResult instanceof DeviceManagerRepo$DeleteDeviceResult.NotSuccessful)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                DeviceManagerRepo$DeleteDeviceResult.NotSuccessful notSuccessful = (DeviceManagerRepo$DeleteDeviceResult.NotSuccessful) deviceManagerRepo$DeleteDeviceResult;
                RemoveDevicesResponse.ErrorReason errorReason = notSuccessful.errorReason;
                RemoveDevicesResponse.ErrorReason errorReason2 = RemoveDevicesResponse.ErrorReason.CALLER_DEVICE_NOT_FOUND;
                List list = notSuccessful.failedTokens;
                if (errorReason == errorReason2) {
                    analytics.track(new TrustedDeviceRemoveConfirmation(Integer.valueOf(notSuccessful.successfulTokens.size()), Integer.valueOf(list.size())), null);
                    return z ? new DeviceManagerDeviceRemovalSuccessBottomSheetScreen(new RedactedString(loggedInDevice2.name)) : new DeviceManagerDeviceRemovalSuccessFullScreen(new RedactedString(loggedInDevice2.name));
                }
                if (z) {
                    return new DeviceManagerDeviceRemovalFailedBottomSheetScreen(list, deviceManagerDeviceDetailsScreen.removeAttemptCount, (errorReason != null ? DeviceManagerDeviceDetailsPresenter$WhenMappings.$EnumSwitchMapping$0[errorReason.ordinal()] : -1) == 1 ? DeviceManagerDeviceRemovalFailedScreen.ErrorReason.CALLER_DEVICE_NOT_LOGGED_IN_LONG_ENOUGH : null, notSuccessful.devicesAttemptedToRemove, 8);
                }
                return new DeviceManagerDeviceRemovalFailedFullScreen(list, deviceManagerDeviceDetailsScreen.removeAttemptCount, (errorReason != null ? DeviceManagerDeviceDetailsPresenter$WhenMappings.$EnumSwitchMapping$0[errorReason.ordinal()] : -1) == 1 ? DeviceManagerDeviceRemovalFailedScreen.ErrorReason.CALLER_DEVICE_NOT_LOGGED_IN_LONG_ENOUGH : null, notSuccessful.devicesAttemptedToRemove, 8);
            }
        }
        deviceManagerDeviceDetailsPresenter$deleteDevice$1 = new DeviceManagerDeviceDetailsPresenter$deleteDevice$1(pdfPreviewPresenter, continuationImpl);
        Object obj2 = deviceManagerDeviceDetailsPresenter$deleteDevice$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deviceManagerDeviceDetailsPresenter$deleteDevice$1.label;
        if (i != 0) {
        }
        deviceManagerRepo$DeleteDeviceResult = (DeviceManagerRepo$DeleteDeviceResult) obj2;
        if (!(deviceManagerRepo$DeleteDeviceResult instanceof DeviceManagerRepo$DeleteDeviceResult.Successful)) {
        }
    }

    public static final String access$getSessionToken(PdfPreviewPresenter pdfPreviewPresenter) {
        SessionState currentSessionState = PlatformKt.getCurrentSessionState((SessionManager) pdfPreviewPresenter.fileProvider);
        if (currentSessionState instanceof SessionState.Authenticated) {
            return ((AuthenticatedState) ((SessionState.Authenticated) currentSessionState)).sessionToken;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        if (r10.submitFormAndAdvance$1(r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0092, code lost:
    
        if (r10.submitFormAndAdvance$1(r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a6, code lost:
    
        if (r10.submitFormAndAdvance$1(r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ba, code lost:
    
        if (r10.submitFormAndAdvance$1(r0) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0063, code lost:
    
        if (r11 == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleRegistration(PdfPreviewPresenter pdfPreviewPresenter, ContinuationImpl continuationImpl) {
        PasskeyUpsellPresenter$handleRegistration$1 passkeyUpsellPresenter$handleRegistration$1;
        int i;
        PasskeyRepository$PasskeyRegistrationResult passkeyRepository$PasskeyRegistrationResult;
        if (continuationImpl instanceof PasskeyUpsellPresenter$handleRegistration$1) {
            passkeyUpsellPresenter$handleRegistration$1 = (PasskeyUpsellPresenter$handleRegistration$1) continuationImpl;
            int i2 = passkeyUpsellPresenter$handleRegistration$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                passkeyUpsellPresenter$handleRegistration$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = passkeyUpsellPresenter$handleRegistration$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passkeyUpsellPresenter$handleRegistration$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealPasskeyRepository realPasskeyRepository = (RealPasskeyRepository) pdfPreviewPresenter.launcher;
                    BlockersData blockersData = ((PasskeyUpsellScreen) pdfPreviewPresenter.pdfFile$delegate).blockersData;
                    ClientScenario clientScenario = blockersData.clientScenario;
                    String str = blockersData.flowToken;
                    passkeyUpsellPresenter$handleRegistration$1.label = 1;
                    obj = realPasskeyRepository.registerPasskey(clientScenario, str, passkeyUpsellPresenter$handleRegistration$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        if (i == 4) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        if (i == 5) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                passkeyRepository$PasskeyRegistrationResult = (PasskeyRepository$PasskeyRegistrationResult) obj;
                if (!Intrinsics.areEqual(passkeyRepository$PasskeyRegistrationResult, PasskeyRepository$PasskeyRegistrationResult.Success.INSTANCE)) {
                    passkeyUpsellPresenter$handleRegistration$1.label = 2;
                } else {
                    if (Intrinsics.areEqual(passkeyRepository$PasskeyRegistrationResult, PasskeyRepository$PasskeyRegistrationResult.Cancelled.INSTANCE)) {
                        return Unit.INSTANCE;
                    }
                    if (Intrinsics.areEqual(passkeyRepository$PasskeyRegistrationResult, PasskeyRepository$PasskeyRegistrationResult.DuplicateCredentialOnDevice.INSTANCE)) {
                        passkeyUpsellPresenter$handleRegistration$1.label = 3;
                    } else if (Intrinsics.areEqual(passkeyRepository$PasskeyRegistrationResult, PasskeyRepository$PasskeyRegistrationResult.DeviceNotSupported.INSTANCE)) {
                        passkeyUpsellPresenter$handleRegistration$1.label = 4;
                    } else {
                        if (!Intrinsics.areEqual(passkeyRepository$PasskeyRegistrationResult, PasskeyRepository$PasskeyRegistrationResult.Error.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        passkeyUpsellPresenter$handleRegistration$1.label = 5;
                    }
                }
                return obj2;
            }
        }
        passkeyUpsellPresenter$handleRegistration$1 = new PasskeyUpsellPresenter$handleRegistration$1(pdfPreviewPresenter, continuationImpl);
        Object obj3 = passkeyUpsellPresenter$handleRegistration$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passkeyUpsellPresenter$handleRegistration$1.label;
        if (i != 0) {
        }
        passkeyRepository$PasskeyRegistrationResult = (PasskeyRepository$PasskeyRegistrationResult) obj3;
        if (!Intrinsics.areEqual(passkeyRepository$PasskeyRegistrationResult, PasskeyRepository$PasskeyRegistrationResult.Success.INSTANCE)) {
        }
        return obj22;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$removeAllDevices(PdfPreviewPresenter pdfPreviewPresenter, int i, ContinuationImpl continuationImpl) {
        DeviceManagerListPresenter$removeAllDevices$1 deviceManagerListPresenter$removeAllDevices$1;
        int i2;
        int i3;
        boolean z;
        DeviceManagerRepo$DeleteDeviceResult deviceManagerRepo$DeleteDeviceResult;
        Screen deviceManagerDeviceRemovalSuccessBottomSheetScreen;
        Screen screen;
        Analytics analytics = ((RealDeviceManagerAnalytics) pdfPreviewPresenter.fileProvider).analytics;
        if (continuationImpl instanceof DeviceManagerListPresenter$removeAllDevices$1) {
            deviceManagerListPresenter$removeAllDevices$1 = (DeviceManagerListPresenter$removeAllDevices$1) continuationImpl;
            int i4 = deviceManagerListPresenter$removeAllDevices$1.label;
            if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                deviceManagerListPresenter$removeAllDevices$1.label = i4 - PKIFailureInfo.systemUnavail;
                Object obj = deviceManagerListPresenter$removeAllDevices$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = deviceManagerListPresenter$removeAllDevices$1.label;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    analytics.track(new TrustedDeviceRemoveSelect(), null);
                    boolean enabled = ((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) pdfPreviewPresenter.fileSaver)).peekCurrentValue(LaunchDarklyFeatureFlags$DeviceRemovalHalfSheet.INSTANCE)).enabled();
                    RealDeviceManagerRepo realDeviceManagerRepo = (RealDeviceManagerRepo) pdfPreviewPresenter.args;
                    deviceManagerListPresenter$removeAllDevices$1.I$0 = i;
                    deviceManagerListPresenter$removeAllDevices$1.Z$0 = enabled;
                    deviceManagerListPresenter$removeAllDevices$1.label = 1;
                    Object deleteOtherDevices = realDeviceManagerRepo.deleteOtherDevices(deviceManagerListPresenter$removeAllDevices$1);
                    if (deleteOtherDevices == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    i3 = i;
                    z = enabled;
                    obj = deleteOtherDevices;
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = deviceManagerListPresenter$removeAllDevices$1.Z$0;
                    int i5 = deviceManagerListPresenter$removeAllDevices$1.I$0;
                    SafeTrace.throwOnFailure(obj);
                    i3 = i5;
                }
                deviceManagerRepo$DeleteDeviceResult = (DeviceManagerRepo$DeleteDeviceResult) obj;
                if (deviceManagerRepo$DeleteDeviceResult instanceof DeviceManagerRepo$DeleteDeviceResult.NetworkFailure) {
                    if (deviceManagerRepo$DeleteDeviceResult instanceof DeviceManagerRepo$DeleteDeviceResult.NotSuccessful) {
                        DeviceManagerRepo$DeleteDeviceResult.NotSuccessful notSuccessful = (DeviceManagerRepo$DeleteDeviceResult.NotSuccessful) deviceManagerRepo$DeleteDeviceResult;
                        RemoveDevicesResponse.ErrorReason errorReason = notSuccessful.errorReason;
                        RemoveDevicesResponse.ErrorReason errorReason2 = RemoveDevicesResponse.ErrorReason.CALLER_DEVICE_NOT_FOUND;
                        List list = notSuccessful.failedTokens;
                        if (errorReason == errorReason2) {
                            analytics.track(new TrustedDeviceRemoveConfirmation(Integer.valueOf(notSuccessful.successfulTokens.size()), Integer.valueOf(list.size())), null);
                            deviceManagerDeviceRemovalSuccessBottomSheetScreen = z ? new DeviceManagerDeviceRemovalSuccessBottomSheetScreen(null) : new DeviceManagerDeviceRemovalSuccessFullScreen(null);
                        } else {
                            if (z) {
                                screen = new DeviceManagerDeviceRemovalFailedBottomSheetScreen(list, i3, (errorReason != null ? DeviceManagerListPresenter$WhenMappings.$EnumSwitchMapping$0[errorReason.ordinal()] : -1) == 1 ? DeviceManagerDeviceRemovalFailedScreen.ErrorReason.CALLER_DEVICE_NOT_LOGGED_IN_LONG_ENOUGH : null, true, notSuccessful.devicesAttemptedToRemove);
                            } else {
                                screen = new DeviceManagerDeviceRemovalFailedFullScreen(list, i3, (errorReason != null ? DeviceManagerListPresenter$WhenMappings.$EnumSwitchMapping$0[errorReason.ordinal()] : -1) == 1 ? DeviceManagerDeviceRemovalFailedScreen.ErrorReason.CALLER_DEVICE_NOT_LOGGED_IN_LONG_ENOUGH : null, true, notSuccessful.devicesAttemptedToRemove);
                            }
                        }
                    } else {
                        if (!(deviceManagerRepo$DeleteDeviceResult instanceof DeviceManagerRepo$DeleteDeviceResult.Successful)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        deviceManagerDeviceRemovalSuccessBottomSheetScreen = z ? new DeviceManagerDeviceRemovalSuccessBottomSheetScreen(null) : new DeviceManagerDeviceRemovalSuccessFullScreen(null);
                    }
                    screen = deviceManagerDeviceRemovalSuccessBottomSheetScreen;
                } else {
                    screen = z ? new DeviceManagerDeviceRemovalFailedBottomSheetScreen(((DeviceManagerRepo$DeleteDeviceResult.NetworkFailure) deviceManagerRepo$DeleteDeviceResult).failedTokens, i3, (DeviceManagerDeviceRemovalFailedScreen.ErrorReason) null, 0, 20) : new DeviceManagerDeviceRemovalFailedFullScreen(((DeviceManagerRepo$DeleteDeviceResult.NetworkFailure) deviceManagerRepo$DeleteDeviceResult).failedTokens, i3, (DeviceManagerDeviceRemovalFailedScreen.ErrorReason) null, 0, 20);
                }
                pdfPreviewPresenter.navigator.goTo(screen);
                return Unit.INSTANCE;
            }
        }
        deviceManagerListPresenter$removeAllDevices$1 = new DeviceManagerListPresenter$removeAllDevices$1(pdfPreviewPresenter, continuationImpl);
        Object obj2 = deviceManagerListPresenter$removeAllDevices$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = deviceManagerListPresenter$removeAllDevices$1.label;
        if (i2 != 0) {
        }
        deviceManagerRepo$DeleteDeviceResult = (DeviceManagerRepo$DeleteDeviceResult) obj2;
        if (deviceManagerRepo$DeleteDeviceResult instanceof DeviceManagerRepo$DeleteDeviceResult.NetworkFailure) {
        }
        pdfPreviewPresenter.navigator.goTo(screen);
        return Unit.INSTANCE;
    }

    public static final ArrayList access$toNotificationPreferenceList(PdfPreviewPresenter pdfPreviewPresenter, List list, UiAlias.Type type2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Alias) obj).isChecked) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UiAlias uiAlias = new UiAlias(type2, ((Alias) it.next()).value);
            Boolean bool = Boolean.TRUE;
            FeeType.Companion companion = NotificationPreferenceUpdatedEvent$ClientExperienceVersion.Companion;
            arrayList2.add(new NotificationPreference(uiAlias, bool));
        }
        return arrayList2;
    }

    public static final void access$trackComplete(PdfPreviewPresenter pdfPreviewPresenter) {
        Analytics analytics = (Analytics) pdfPreviewPresenter.pdfFile$delegate;
        SupportScreens.ScreenshotScreen.ScreenshotArgs screenshotArgs = ((SupportScreens.ScreenshotScreen.ScreenshotReviewScreen) pdfPreviewPresenter.args).screenshotArgs;
        analytics.track(new CustomerSupportCaptureComplete(screenshotArgs.flowToken, screenshotArgs.screenshotRequestId, AnalyticsUitlKt.toAnalyticsTrigger(screenshotArgs.trigger)), null);
    }

    public static final ArrayList access$updateCheckboxValue(PdfPreviewPresenter pdfPreviewPresenter, List list, Alias alias) {
        List<Alias> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (Alias alias2 : list2) {
            if (Intrinsics.areEqual(alias2.value, alias.value)) {
                alias2 = Alias.copy$default(alias2, !alias2.isChecked);
            }
            arrayList.add(alias2);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0966  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0997  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x09cf  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0987  */
    /* JADX WARN: Type inference failed for: r0v39, types: [com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerDeviceDetailViewModel$NotFound] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v8, types: [com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerDeviceDetailViewModel$Loaded] */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerDeviceDetailViewModel$Loading] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        Object ready;
        MutableState mutableState;
        Continuation continuation;
        MutableState mutableState2;
        DeviceType deviceType;
        String str;
        String str2;
        String str3;
        Long l;
        ?? r23;
        PdfPreviewPresenter pdfPreviewPresenter;
        MutableState mutableState3;
        MutableState mutableState4;
        DeviceManagerListViewModel.DeviceAction deviceAction;
        DataLoadingState dataLoadingState;
        MutableState mutableState5;
        EmptyList emptyList;
        ShiftNoteViewModel.ShiftNoteSection shiftNoteSection;
        int i2 = this.$r8$classId;
        DataLoadingState.DataLoading dataLoading = DataLoadingState.DataLoading.INSTANCE;
        int i3 = 2;
        Object obj = this.launcher;
        Object obj2 = this.fileSaver;
        Object obj3 = this.fileProvider;
        int i4 = 10;
        Object obj4 = this.args;
        Object obj5 = this.pdfFile$delegate;
        Object obj6 = this.stringManager;
        int i5 = 1;
        Continuation continuation2 = null;
        ShiftNoteViewModel.InputSection inputSection = null;
        continuation2 = null;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i6 = 0;
        switch (i2) {
            case 0:
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(-53334142);
                Object rememberedValue = gapComposer.rememberedValue();
                Continuation continuation3 = null;
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = Updater.mutableStateOf$default(null);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                MutableState mutableState6 = (MutableState) rememberedValue;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = Updater.mutableStateOf$default(null);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                MutableState mutableState7 = (MutableState) rememberedValue2;
                Unit unit = Unit.INSTANCE;
                boolean changedInstance = gapComposer.changedInstance(this);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new PdfPreviewPresenter$models$1$1(this, mutableState6, continuation3, i6);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
                Updater.LaunchedEffect(gapComposer, flow, new PhonePlansHomePresenter$models$1$1(13, mutableState7, (MoleculePresenter) this, (Object) flow, continuation3));
                if (((PdfBitmapRender) mutableState6.getValue()) == null) {
                    ready = PdfPreviewViewModel.Loading.INSTANCE;
                } else {
                    String str4 = ((PdfScreen) obj4).displayTitle;
                    if (str4 == null) {
                        str4 = ((File) ((Lazy) obj5).getValue()).getName();
                    }
                    str4.getClass();
                    PdfBitmapRender pdfBitmapRender = (PdfBitmapRender) mutableState6.getValue();
                    pdfBitmapRender.getClass();
                    ready = new PdfPreviewViewModel.Ready(str4, pdfBitmapRender, (String) mutableState7.getValue());
                }
                gapComposer.end(false);
                return ready;
            case 1:
                PasskeyUpsellScreen passkeyUpsellScreen = (PasskeyUpsellScreen) obj5;
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(-1818338887);
                Object rememberedValue4 = gapComposer2.rememberedValue();
                if (rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer2.updateRememberedValue(rememberedValue4);
                }
                MutableState mutableState8 = (MutableState) rememberedValue4;
                Continuation continuation4 = null;
                if (Intrinsics.areEqual(passkeyUpsellScreen.blocker.is_retry, Boolean.TRUE)) {
                    gapComposer2.startReplaceGroup(-2005875602);
                    Unit unit2 = Unit.INSTANCE;
                    boolean changedInstance2 = gapComposer2.changedInstance(this);
                    Object rememberedValue5 = gapComposer2.rememberedValue();
                    if (changedInstance2 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new RealKeyStoreProvider$setEntry$2(mutableState8, this, continuation4, 22);
                        gapComposer2.updateRememberedValue(rememberedValue5);
                    }
                    Updater.LaunchedEffect(gapComposer2, unit2, (Function2) rememberedValue5);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(-2005818903);
                    gapComposer2.end(false);
                }
                Updater.LaunchedEffect(gapComposer2, flow, new MusicPresenter$models$1$1(flow, continuation4, (MoleculePresenter) this, mutableState8, 27));
                PasskeyUpsellBlocker passkeyUpsellBlocker = passkeyUpsellScreen.blocker;
                String str5 = passkeyUpsellBlocker.header_text;
                String str6 = str5 == null ? "" : str5;
                String str7 = passkeyUpsellBlocker.detail_text;
                PasskeyUpsellViewModel passkeyUpsellViewModel = new PasskeyUpsellViewModel(str6, str7 == null ? "" : str7, ((Boolean) mutableState8.getValue()).booleanValue(), passkeyUpsellScreen.skippable, passkeyUpsellBlocker.icon);
                gapComposer2.end(false);
                return passkeyUpsellViewModel;
            case 2:
                flow.getClass();
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(1804045231);
                boolean changedInstance3 = gapComposer3.changedInstance(this);
                Object rememberedValue6 = gapComposer3.rememberedValue();
                Continuation continuation5 = null;
                Object obj7 = rememberedValue6;
                if (changedInstance3 || rememberedValue6 == neverEqualPolicy) {
                    PdfPreviewPresenter$models$1$1 pdfPreviewPresenter$models$1$1 = new PdfPreviewPresenter$models$1$1(this, null);
                    gapComposer3.updateRememberedValue(pdfPreviewPresenter$models$1$1);
                    obj7 = pdfPreviewPresenter$models$1$1;
                }
                MutableState produceState = Updater.produceState(gapComposer3, dataLoading, (Function2) obj7);
                Object rememberedValue7 = gapComposer3.rememberedValue();
                Object obj8 = rememberedValue7;
                if (rememberedValue7 == neverEqualPolicy) {
                    DeviceManagerDeviceDetailsScreen deviceManagerDeviceDetailsScreen = (DeviceManagerDeviceDetailsScreen) obj5;
                    ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(new DeviceManagerDeviceDetailsPresenter$DeleteState(deviceManagerDeviceDetailsScreen.removeAttemptCount > 1 ? deviceManagerDeviceDetailsScreen.deviceAppToken : null, false));
                    gapComposer3.updateRememberedValue(mutableStateOf$default);
                    obj8 = mutableStateOf$default;
                }
                MutableState mutableState9 = (MutableState) obj8;
                Unit unit3 = Unit.INSTANCE;
                boolean changed = gapComposer3.changed(produceState) | gapComposer3.changedInstance(this);
                Object rememberedValue8 = gapComposer3.rememberedValue();
                Object obj9 = rememberedValue8;
                if (changed || rememberedValue8 == neverEqualPolicy) {
                    RingtoneView.AnonymousClass1 anonymousClass1 = new RingtoneView.AnonymousClass1(produceState, this, continuation5, i4);
                    gapComposer3.updateRememberedValue(anonymousClass1);
                    obj9 = anonymousClass1;
                }
                Updater.LaunchedEffect(gapComposer3, unit3, (Function2) obj9);
                String str8 = ((DeviceManagerDeviceDetailsPresenter$DeleteState) mutableState9.getValue()).deviceId;
                DataLoadingState dataLoadingState2 = (DataLoadingState) produceState.getValue();
                if (str8 == null || dataLoadingState2 == null) {
                    mutableState = produceState;
                    continuation = null;
                    mutableState2 = mutableState9;
                    gapComposer3.startReplaceGroup(-1383879796);
                    gapComposer3.end(false);
                } else {
                    gapComposer3.startReplaceGroup(-1383927846);
                    mutableState = produceState;
                    continuation = null;
                    mutableState2 = mutableState9;
                    Updater.LaunchedEffect(str8, dataLoadingState2, new PoolsListPresenter$models$2$2(str8, dataLoadingState2, (Continuation) null, this, mutableState9), gapComposer3);
                    gapComposer3.end(false);
                }
                Updater.LaunchedEffect(gapComposer3, flow, new PhonePlansHomePresenter$models$1$1(19, mutableState2, (MoleculePresenter) this, (Object) flow, continuation));
                DataLoadingState dataLoadingState3 = (DataLoadingState) mutableState.getValue();
                RealTodayDateTimeFormatter realTodayDateTimeFormatter = (RealTodayDateTimeFormatter) obj;
                AndroidStringManager androidStringManager = (AndroidStringManager) obj6;
                boolean z = ((DeviceManagerDeviceDetailsPresenter$DeleteState) mutableState2.getValue()).isInProgress;
                ?? r2 = DeviceManagerDeviceDetailViewModel.Loading.INSTANCE;
                if (!z && !Intrinsics.areEqual(dataLoadingState3, dataLoading)) {
                    if (dataLoadingState3 instanceof DataLoadingState.DataLoaded) {
                        LoggedInDevice loggedInDevice = (LoggedInDevice) ((DataLoadingState.DataLoaded) dataLoadingState3).data;
                        if (loggedInDevice != null) {
                            LoggedInDevice.LastLogin lastLogin = loggedInDevice.lastLogin;
                            LoggedInDevice.DeviceType deviceType2 = loggedInDevice.deviceType;
                            String str9 = loggedInDevice.name;
                            int ordinal = deviceType2.ordinal();
                            if (ordinal != 0) {
                                switch (ordinal) {
                                    case 2:
                                        deviceType = DeviceType.MAC;
                                        break;
                                    case 3:
                                        deviceType = DeviceType.WINDOWS;
                                        break;
                                    case 4:
                                        deviceType = DeviceType.IPAD;
                                        break;
                                    case 5:
                                        deviceType = DeviceType.IPHONE;
                                        break;
                                    case 6:
                                        deviceType = DeviceType.IPOD_TOUCH;
                                        break;
                                    case 7:
                                        deviceType = DeviceType.OTHER;
                                        break;
                                    default:
                                        deviceType = DeviceType.BROWSER;
                                        break;
                                }
                            } else {
                                deviceType = DeviceType.ANDROID;
                            }
                            DeviceType deviceType3 = deviceType;
                            switch (deviceType2.ordinal()) {
                                case 0:
                                    str = androidStringManager.get(R.string.device_manager_device_name_android);
                                    String str10 = str;
                                    boolean z2 = loggedInDevice.isThisDevice;
                                    Instant ofEpochMilli = Instant.ofEpochMilli(lastLogin.timestampMillis);
                                    ofEpochMilli.getClass();
                                    String str11 = androidStringManager.get(R.string.device_manager_date_today);
                                    Locale locale = Locale.ROOT;
                                    String lowerCase = str11.toLowerCase(locale);
                                    lowerCase.getClass();
                                    String formatDate = realTodayDateTimeFormatter.formatDate(ofEpochMilli, new TodayDateTimeFormatter$FormatOptions(100, lowerCase, androidStringManager.get(R.string.device_manager_details_last_active_today), androidStringManager.get(R.string.device_manager_details_last_login_at), true, false));
                                    str2 = lastLogin.locationName;
                                    if (str2 != null) {
                                        Resources resources = androidStringManager.resources;
                                        resources.getClass();
                                        str3 = new MessageFormat(resources.getString(R.string.device_manager_device_location)).format(new Object[]{str2});
                                        str3.getClass();
                                    } else {
                                        str3 = androidStringManager.get(R.string.device_manager_location_unknown);
                                    }
                                    String str12 = str3;
                                    String str13 = lastLogin.locationUrl;
                                    l = loggedInDevice.lastVerifiedTimeMillis;
                                    if (l != null) {
                                        Instant ofEpochMilli2 = Instant.ofEpochMilli(l.longValue());
                                        ofEpochMilli2.getClass();
                                        String lowerCase2 = androidStringManager.get(R.string.device_manager_date_today).toLowerCase(locale);
                                        lowerCase2.getClass();
                                        r23 = realTodayDateTimeFormatter.formatDate(ofEpochMilli2, new TodayDateTimeFormatter$FormatOptions(100, lowerCase2, androidStringManager.get(R.string.device_manager_details_last_verified_today), androidStringManager.get(R.string.device_manager_details_last_verified_on), true, false));
                                    } else {
                                        r23 = continuation;
                                    }
                                    continuation2 = new DeviceManagerDeviceDetailViewModel.Loaded(str9, deviceType3, str10, z2, formatDate, str12, str13, r23, !loggedInDevice.isThisDevice);
                                    break;
                                case 1:
                                case 7:
                                    str = androidStringManager.get(R.string.device_manager_device_name_other);
                                    String str102 = str;
                                    boolean z22 = loggedInDevice.isThisDevice;
                                    Instant ofEpochMilli3 = Instant.ofEpochMilli(lastLogin.timestampMillis);
                                    ofEpochMilli3.getClass();
                                    String str112 = androidStringManager.get(R.string.device_manager_date_today);
                                    Locale locale2 = Locale.ROOT;
                                    String lowerCase3 = str112.toLowerCase(locale2);
                                    lowerCase3.getClass();
                                    String formatDate2 = realTodayDateTimeFormatter.formatDate(ofEpochMilli3, new TodayDateTimeFormatter$FormatOptions(100, lowerCase3, androidStringManager.get(R.string.device_manager_details_last_active_today), androidStringManager.get(R.string.device_manager_details_last_login_at), true, false));
                                    str2 = lastLogin.locationName;
                                    if (str2 != null) {
                                    }
                                    String str122 = str3;
                                    String str132 = lastLogin.locationUrl;
                                    l = loggedInDevice.lastVerifiedTimeMillis;
                                    if (l != null) {
                                    }
                                    continuation2 = new DeviceManagerDeviceDetailViewModel.Loaded(str9, deviceType3, str102, z22, formatDate2, str122, str132, r23, !loggedInDevice.isThisDevice);
                                    break;
                                case 2:
                                    str = androidStringManager.get(R.string.device_manager_device_name_mac);
                                    String str1022 = str;
                                    boolean z222 = loggedInDevice.isThisDevice;
                                    Instant ofEpochMilli32 = Instant.ofEpochMilli(lastLogin.timestampMillis);
                                    ofEpochMilli32.getClass();
                                    String str1122 = androidStringManager.get(R.string.device_manager_date_today);
                                    Locale locale22 = Locale.ROOT;
                                    String lowerCase32 = str1122.toLowerCase(locale22);
                                    lowerCase32.getClass();
                                    String formatDate22 = realTodayDateTimeFormatter.formatDate(ofEpochMilli32, new TodayDateTimeFormatter$FormatOptions(100, lowerCase32, androidStringManager.get(R.string.device_manager_details_last_active_today), androidStringManager.get(R.string.device_manager_details_last_login_at), true, false));
                                    str2 = lastLogin.locationName;
                                    if (str2 != null) {
                                    }
                                    String str1222 = str3;
                                    String str1322 = lastLogin.locationUrl;
                                    l = loggedInDevice.lastVerifiedTimeMillis;
                                    if (l != null) {
                                    }
                                    continuation2 = new DeviceManagerDeviceDetailViewModel.Loaded(str9, deviceType3, str1022, z222, formatDate22, str1222, str1322, r23, !loggedInDevice.isThisDevice);
                                    break;
                                case 3:
                                    str = androidStringManager.get(R.string.device_manager_device_name_windows);
                                    String str10222 = str;
                                    boolean z2222 = loggedInDevice.isThisDevice;
                                    Instant ofEpochMilli322 = Instant.ofEpochMilli(lastLogin.timestampMillis);
                                    ofEpochMilli322.getClass();
                                    String str11222 = androidStringManager.get(R.string.device_manager_date_today);
                                    Locale locale222 = Locale.ROOT;
                                    String lowerCase322 = str11222.toLowerCase(locale222);
                                    lowerCase322.getClass();
                                    String formatDate222 = realTodayDateTimeFormatter.formatDate(ofEpochMilli322, new TodayDateTimeFormatter$FormatOptions(100, lowerCase322, androidStringManager.get(R.string.device_manager_details_last_active_today), androidStringManager.get(R.string.device_manager_details_last_login_at), true, false));
                                    str2 = lastLogin.locationName;
                                    if (str2 != null) {
                                    }
                                    String str12222 = str3;
                                    String str13222 = lastLogin.locationUrl;
                                    l = loggedInDevice.lastVerifiedTimeMillis;
                                    if (l != null) {
                                    }
                                    continuation2 = new DeviceManagerDeviceDetailViewModel.Loaded(str9, deviceType3, str10222, z2222, formatDate222, str12222, str13222, r23, !loggedInDevice.isThisDevice);
                                    break;
                                case 4:
                                    str = androidStringManager.get(R.string.device_manager_device_name_ipad);
                                    String str102222 = str;
                                    boolean z22222 = loggedInDevice.isThisDevice;
                                    Instant ofEpochMilli3222 = Instant.ofEpochMilli(lastLogin.timestampMillis);
                                    ofEpochMilli3222.getClass();
                                    String str112222 = androidStringManager.get(R.string.device_manager_date_today);
                                    Locale locale2222 = Locale.ROOT;
                                    String lowerCase3222 = str112222.toLowerCase(locale2222);
                                    lowerCase3222.getClass();
                                    String formatDate2222 = realTodayDateTimeFormatter.formatDate(ofEpochMilli3222, new TodayDateTimeFormatter$FormatOptions(100, lowerCase3222, androidStringManager.get(R.string.device_manager_details_last_active_today), androidStringManager.get(R.string.device_manager_details_last_login_at), true, false));
                                    str2 = lastLogin.locationName;
                                    if (str2 != null) {
                                    }
                                    String str122222 = str3;
                                    String str132222 = lastLogin.locationUrl;
                                    l = loggedInDevice.lastVerifiedTimeMillis;
                                    if (l != null) {
                                    }
                                    continuation2 = new DeviceManagerDeviceDetailViewModel.Loaded(str9, deviceType3, str102222, z22222, formatDate2222, str122222, str132222, r23, !loggedInDevice.isThisDevice);
                                    break;
                                case 5:
                                    str = androidStringManager.get(R.string.device_manager_device_name_iphone);
                                    String str1022222 = str;
                                    boolean z222222 = loggedInDevice.isThisDevice;
                                    Instant ofEpochMilli32222 = Instant.ofEpochMilli(lastLogin.timestampMillis);
                                    ofEpochMilli32222.getClass();
                                    String str1122222 = androidStringManager.get(R.string.device_manager_date_today);
                                    Locale locale22222 = Locale.ROOT;
                                    String lowerCase32222 = str1122222.toLowerCase(locale22222);
                                    lowerCase32222.getClass();
                                    String formatDate22222 = realTodayDateTimeFormatter.formatDate(ofEpochMilli32222, new TodayDateTimeFormatter$FormatOptions(100, lowerCase32222, androidStringManager.get(R.string.device_manager_details_last_active_today), androidStringManager.get(R.string.device_manager_details_last_login_at), true, false));
                                    str2 = lastLogin.locationName;
                                    if (str2 != null) {
                                    }
                                    String str1222222 = str3;
                                    String str1322222 = lastLogin.locationUrl;
                                    l = loggedInDevice.lastVerifiedTimeMillis;
                                    if (l != null) {
                                    }
                                    continuation2 = new DeviceManagerDeviceDetailViewModel.Loaded(str9, deviceType3, str1022222, z222222, formatDate22222, str1222222, str1322222, r23, !loggedInDevice.isThisDevice);
                                    break;
                                case 6:
                                    str = androidStringManager.get(R.string.device_manager_device_name_ipod_touch);
                                    String str10222222 = str;
                                    boolean z2222222 = loggedInDevice.isThisDevice;
                                    Instant ofEpochMilli322222 = Instant.ofEpochMilli(lastLogin.timestampMillis);
                                    ofEpochMilli322222.getClass();
                                    String str11222222 = androidStringManager.get(R.string.device_manager_date_today);
                                    Locale locale222222 = Locale.ROOT;
                                    String lowerCase322222 = str11222222.toLowerCase(locale222222);
                                    lowerCase322222.getClass();
                                    String formatDate222222 = realTodayDateTimeFormatter.formatDate(ofEpochMilli322222, new TodayDateTimeFormatter$FormatOptions(100, lowerCase322222, androidStringManager.get(R.string.device_manager_details_last_active_today), androidStringManager.get(R.string.device_manager_details_last_login_at), true, false));
                                    str2 = lastLogin.locationName;
                                    if (str2 != null) {
                                    }
                                    String str12222222 = str3;
                                    String str13222222 = lastLogin.locationUrl;
                                    l = loggedInDevice.lastVerifiedTimeMillis;
                                    if (l != null) {
                                    }
                                    continuation2 = new DeviceManagerDeviceDetailViewModel.Loaded(str9, deviceType3, str10222222, z2222222, formatDate222222, str12222222, str13222222, r23, !loggedInDevice.isThisDevice);
                                    break;
                                default:
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                            }
                        } else {
                            continuation2 = DeviceManagerDeviceDetailViewModel.NotFound.INSTANCE;
                        }
                    } else {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                    }
                    return continuation2;
                }
                continuation2 = r2;
                gapComposer3.end(false);
                return continuation2;
            case 3:
                flow.getClass();
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(-598838442);
                Object rememberedValue9 = gapComposer4.rememberedValue();
                Object obj10 = rememberedValue9;
                if (rememberedValue9 == neverEqualPolicy) {
                    obj10 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer4);
                }
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj10;
                Object rememberedValue10 = gapComposer4.rememberedValue();
                Object obj11 = rememberedValue10;
                if (rememberedValue10 == neverEqualPolicy) {
                    ParcelableSnapshotMutableState mutableStateOf$default2 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer4.updateRememberedValue(mutableStateOf$default2);
                    obj11 = mutableStateOf$default2;
                }
                MutableState mutableState10 = (MutableState) obj11;
                Integer valueOf = Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue());
                boolean changedInstance4 = gapComposer4.changedInstance(this);
                Object rememberedValue11 = gapComposer4.rememberedValue();
                Continuation continuation6 = null;
                Object obj12 = rememberedValue11;
                if (changedInstance4 || rememberedValue11 == neverEqualPolicy) {
                    PdfPreviewPresenter$models$1$1 pdfPreviewPresenter$models$1$12 = new PdfPreviewPresenter$models$1$1(this, parcelableSnapshotMutableIntState, null);
                    gapComposer4.updateRememberedValue(pdfPreviewPresenter$models$1$12);
                    obj12 = pdfPreviewPresenter$models$1$12;
                }
                MutableState produceState2 = Updater.produceState(dataLoading, valueOf, (Function2) obj12, gapComposer4, 6);
                Object rememberedValue12 = gapComposer4.rememberedValue();
                Object obj13 = rememberedValue12;
                if (rememberedValue12 == neverEqualPolicy) {
                    int i7 = ((DeviceManagerListScreen) obj5).removeAttemptCount;
                    ParcelableSnapshotMutableState mutableStateOf$default3 = Updater.mutableStateOf$default(i7 > 1 ? Integer.valueOf(i7) : null);
                    gapComposer4.updateRememberedValue(mutableStateOf$default3);
                    obj13 = mutableStateOf$default3;
                }
                MutableState mutableState11 = (MutableState) obj13;
                Updater.LaunchedEffect(gapComposer4, flow, new NotificationActionService$onHandleIntent$1(flow, (Continuation) null, this, produceState2, mutableState11, parcelableSnapshotMutableIntState, 2));
                Integer num = (Integer) mutableState11.getValue();
                if (num != null) {
                    gapComposer4.startReplaceGroup(-1106477359);
                    mutableState4 = produceState2;
                    pdfPreviewPresenter = this;
                    mutableState3 = mutableState11;
                    Updater.LaunchedEffect(gapComposer4, num, new PhonePlansHomePresenter$models$1$1(20, mutableState11, (MoleculePresenter) pdfPreviewPresenter, (Object) num, continuation6));
                    gapComposer4.end(false);
                } else {
                    pdfPreviewPresenter = this;
                    mutableState3 = mutableState11;
                    mutableState4 = produceState2;
                    gapComposer4.startReplaceGroup(-1106436997);
                    gapComposer4.end(false);
                }
                DataLoadingState dataLoadingState4 = (DataLoadingState) mutableState4.getValue();
                boolean changed2 = gapComposer4.changed(mutableState4) | gapComposer4.changedInstance(pdfPreviewPresenter);
                Object rememberedValue13 = gapComposer4.rememberedValue();
                if (changed2 || rememberedValue13 == neverEqualPolicy) {
                    MutableState mutableState12 = mutableState4;
                    deviceAction = null;
                    dataLoadingState = dataLoadingState4;
                    PdfPreviewPresenter pdfPreviewPresenter2 = pdfPreviewPresenter;
                    DotGridKt$DotGrid$3$1 dotGridKt$DotGrid$3$1 = new DotGridKt$DotGrid$3$1((Object) pdfPreviewPresenter2, (Object) mutableState12, (Object) mutableState10, (Object) parcelableSnapshotMutableIntState, (Continuation) null, 27);
                    pdfPreviewPresenter = pdfPreviewPresenter2;
                    mutableState5 = mutableState12;
                    gapComposer4.updateRememberedValue(dotGridKt$DotGrid$3$1);
                    rememberedValue13 = dotGridKt$DotGrid$3$1;
                } else {
                    mutableState5 = mutableState4;
                    deviceAction = null;
                    dataLoadingState = dataLoadingState4;
                }
                Updater.LaunchedEffect(gapComposer4, dataLoadingState, (Function2) rememberedValue13);
                DataLoadingState dataLoadingState5 = (DataLoadingState) mutableState5.getValue();
                boolean z3 = ((Integer) mutableState3.getValue()) != null;
                AndroidStringManager androidStringManager2 = (AndroidStringManager) obj6;
                if (Intrinsics.areEqual(dataLoadingState5, dataLoading)) {
                    emptyList = EmptyList.INSTANCE;
                } else {
                    if (!(dataLoadingState5 instanceof DataLoadingState.DataLoaded)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    List list = (List) ((DataLoadingState.DataLoaded) dataLoadingState5).data;
                    if (list != null) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj14 : list) {
                            if (((LoggedInDevice) obj14).isThisDevice) {
                                arrayList.add(obj14);
                            } else {
                                arrayList2.add(obj14);
                            }
                        }
                        String str14 = androidStringManager2.get(R.string.device_manager_list_section_header_this_device);
                        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(pdfPreviewPresenter.toViewModel((LoggedInDevice) it.next()));
                        }
                        ?? mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new DeviceManagerListViewModel.DeviceListSection(str14, arrayList3, deviceAction));
                        emptyList = mutableListOf;
                        if (!arrayList2.isEmpty()) {
                            String str15 = androidStringManager2.get(R.string.device_manager_list_section_header_other_devices);
                            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                arrayList4.add(pdfPreviewPresenter.toViewModel((LoggedInDevice) it2.next()));
                            }
                            mutableListOf.add(new DeviceManagerListViewModel.DeviceListSection(str15, arrayList4, !arrayList2.isEmpty() ? new DeviceManagerListViewModel.DeviceAction(androidStringManager2.get(R.string.device_manager_list_remove_all_devices)) : deviceAction));
                            emptyList = mutableListOf;
                        }
                    } else {
                        emptyList = EmptyList.INSTANCE;
                    }
                }
                DeviceManagerListViewModel deviceManagerListViewModel = new DeviceManagerListViewModel(androidStringManager2.get(R.string.device_manager_list_title), androidStringManager2.get(R.string.manage_devices), emptyList, z3);
                gapComposer4.end(false);
                return deviceManagerListViewModel;
            case 4:
                flow.getClass();
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startReplaceGroup(-1325296165);
                Object rememberedValue14 = gapComposer5.rememberedValue();
                if (rememberedValue14 == neverEqualPolicy) {
                    rememberedValue14 = (StateFlow) obj3;
                    gapComposer5.updateRememberedValue(rememberedValue14);
                }
                MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue14, null, gapComposer5, 1);
                Updater.LaunchedEffect(gapComposer5, flow, new PhonePlansHomePresenter$models$1$1(flow, (Continuation) null, this, collectAsState, 21));
                PasscodeSettings passcodeSettings = (PasscodeSettings) collectAsState.getValue();
                BiometricsStore$Status status = ((AndroidBiometricsStore) obj2).getStatus();
                AndroidStringManager androidStringManager3 = (AndroidStringManager) obj6;
                Redacted deviceName = ((DeviceManagerDeviceRemovalSuccessScreen) obj4).getDeviceName();
                String m = deviceName != null ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m("[", "] ", deviceName.getValue()) : "";
                Resources resources2 = androidStringManager3.resources;
                resources2.getClass();
                String format2 = new MessageFormat(resources2.getString(R.string.device_manager_remove_success_message)).format(new Object[]{m});
                format2.getClass();
                DeviceManagerRemovedSuccessViewModel deviceManagerRemovedSuccessViewModel = new DeviceManagerRemovedSuccessViewModel(format2, passcodeSettings.getRequirePasscodeConfirmation() ? new DeviceManagerRemovedSuccessViewModel.SecurityOption(androidStringManager3.get(R.string.device_manager_change_pin_title), androidStringManager3.get(R.string.device_manager_change_pin_description), androidStringManager3.get(R.string.device_manager_change_pin_button)) : new DeviceManagerRemovedSuccessViewModel.SecurityOption(androidStringManager3.get(R.string.device_manager_security_lock_title), status.ready ? androidStringManager3.get(R.string.device_manager_security_lock_biometrics_description) : androidStringManager3.get(R.string.device_manager_security_lock_description), androidStringManager3.get(R.string.device_manager_security_lock_button)));
                gapComposer5.end(false);
                return deviceManagerRemovedSuccessViewModel;
            case 5:
                AndroidStringManager androidStringManager4 = (AndroidStringManager) obj6;
                ProfileScreens.EnableAliasSheetScreen enableAliasSheetScreen = (ProfileScreens.EnableAliasSheetScreen) obj2;
                flow.getClass();
                GapComposer gapComposer6 = (GapComposer) composer;
                gapComposer6.startReplaceGroup(-1560911402);
                Unit unit4 = Unit.INSTANCE;
                boolean changedInstance5 = gapComposer6.changedInstance(this);
                Object rememberedValue15 = gapComposer6.rememberedValue();
                if (changedInstance5 || rememberedValue15 == neverEqualPolicy) {
                    rememberedValue15 = new ChatInputView$Content$1$1$1(this, continuation2, i3);
                    gapComposer6.updateRememberedValue(rememberedValue15);
                }
                Updater.LaunchedEffect(gapComposer6, unit4, (Function2) rememberedValue15);
                Object rememberedValue16 = gapComposer6.rememberedValue();
                if (rememberedValue16 == neverEqualPolicy) {
                    Iterable<Alias> iterable = (Iterable) enableAliasSheetScreen.phoneAliases.getValue();
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                    for (Alias alias : iterable) {
                        Alias copy$default = Alias.copy$default(alias, true);
                        if (((List) enableAliasSheetScreen.phoneAliases.getValue()).size() != 1) {
                            copy$default = null;
                        }
                        if (copy$default != null) {
                            alias = copy$default;
                        }
                        arrayList5.add(alias);
                    }
                    rememberedValue16 = Updater.mutableStateOf$default(arrayList5);
                    gapComposer6.updateRememberedValue(rememberedValue16);
                }
                MutableState mutableState13 = (MutableState) rememberedValue16;
                Object rememberedValue17 = gapComposer6.rememberedValue();
                if (rememberedValue17 == neverEqualPolicy) {
                    Iterable<Alias> iterable2 = (Iterable) enableAliasSheetScreen.emailAliases.getValue();
                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
                    for (Alias alias2 : iterable2) {
                        Alias copy$default2 = Alias.copy$default(alias2, true);
                        if (((List) enableAliasSheetScreen.emailAliases.getValue()).size() != 1) {
                            copy$default2 = null;
                        }
                        if (copy$default2 != null) {
                            alias2 = copy$default2;
                        }
                        arrayList6.add(alias2);
                    }
                    rememberedValue17 = Updater.mutableStateOf$default(arrayList6);
                    gapComposer6.updateRememberedValue(rememberedValue17);
                }
                MutableState mutableState14 = (MutableState) rememberedValue17;
                Object rememberedValue18 = gapComposer6.rememberedValue();
                if (rememberedValue18 == neverEqualPolicy) {
                    rememberedValue18 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer6.updateRememberedValue(rememberedValue18);
                }
                MutableState mutableState15 = (MutableState) rememberedValue18;
                Updater.LaunchedEffect(gapComposer6, flow, new NotificationActionService$onHandleIntent$1(flow, (Continuation) null, this, mutableState13, mutableState14, mutableState15, 6));
                List list2 = (List) mutableState13.getValue();
                List list3 = (List) mutableState14.getValue();
                String str16 = enableAliasSheetScreen.title;
                if (str16 == null) {
                    List list4 = (List) mutableState13.getValue();
                    List list5 = (List) mutableState14.getValue();
                    str16 = androidStringManager4.get((list4.isEmpty() || !list5.isEmpty()) ? (!list4.isEmpty() || list5.isEmpty()) ? R.string.enable_alias_sheet_title_phone_and_email : R.string.enable_alias_sheet_title_email_only : R.string.enable_alias_sheet_title_phone_only);
                }
                String str17 = str16;
                String str18 = enableAliasSheetScreen.body;
                if (str18 == null) {
                    str18 = androidStringManager4.get(R.string.enable_alias_sheet_body);
                }
                EnableAliasSheetViewModel enableAliasSheetViewModel = new EnableAliasSheetViewModel(str17, str18, list2, list3, ((Boolean) mutableState15.getValue()).booleanValue());
                gapComposer6.end(false);
                return enableAliasSheetViewModel;
            case 6:
                flow.getClass();
                GapComposer gapComposer7 = (GapComposer) composer;
                gapComposer7.startReplaceGroup(-211007549);
                Object rememberedValue19 = gapComposer7.rememberedValue();
                if (rememberedValue19 == neverEqualPolicy) {
                    rememberedValue19 = Updater.mutableStateOf$default(new AliasesSectionViewModel(new LinkedHashMap()));
                    gapComposer7.updateRememberedValue(rememberedValue19);
                }
                MutableState mutableState16 = (MutableState) rememberedValue19;
                Object rememberedValue20 = gapComposer7.rememberedValue();
                Continuation continuation7 = null;
                if (rememberedValue20 == neverEqualPolicy) {
                    rememberedValue20 = Updater.mutableStateOf$default(null);
                    gapComposer7.updateRememberedValue(rememberedValue20);
                }
                MutableState mutableState17 = (MutableState) rememberedValue20;
                Unit unit5 = Unit.INSTANCE;
                boolean changedInstance6 = gapComposer7.changedInstance(this);
                Object rememberedValue21 = gapComposer7.rememberedValue();
                if (changedInstance6 || rememberedValue21 == neverEqualPolicy) {
                    rememberedValue21 = new SelectPaymentPlanBlockerPresenter$models$1$2(this, mutableState17, (Continuation) null);
                    gapComposer7.updateRememberedValue(rememberedValue21);
                }
                Updater.LaunchedEffect(gapComposer7, unit5, (Function2) rememberedValue21);
                AliasesSectionPresenter$Result aliasesSectionPresenter$Result = (AliasesSectionPresenter$Result) mutableState17.getValue();
                if (aliasesSectionPresenter$Result != null) {
                    gapComposer7.startReplaceGroup(-1106477359);
                    Updater.LaunchedEffect(gapComposer7, aliasesSectionPresenter$Result, new AndroidFileSaver$save$2(aliasesSectionPresenter$Result, continuation7, mutableState16, 15));
                    gapComposer7.end(false);
                } else {
                    gapComposer7.startReplaceGroup(-1106436997);
                    gapComposer7.end(false);
                }
                Updater.LaunchedEffect(gapComposer7, flow, new RealQrCodesPresenter$models$1$1(flow, continuation7, this, mutableState17, 4));
                AliasesSectionViewModel aliasesSectionViewModel = (AliasesSectionViewModel) mutableState16.getValue();
                gapComposer7.end(false);
                return aliasesSectionViewModel;
            case 7:
                flow.getClass();
                GapComposer gapComposer8 = (GapComposer) composer;
                gapComposer8.startReplaceGroup(-907810426);
                Unit unit6 = Unit.INSTANCE;
                boolean changedInstance7 = gapComposer8.changedInstance(this);
                Object rememberedValue22 = gapComposer8.rememberedValue();
                if (changedInstance7 || rememberedValue22 == neverEqualPolicy) {
                    rememberedValue22 = new SavingsRouteInterstitialPresenter$models$1$1(this, continuation2, i6);
                    gapComposer8.updateRememberedValue(rememberedValue22);
                }
                Updater.LaunchedEffect(gapComposer8, unit6, (Function2) rememberedValue22);
                boolean changedInstance8 = gapComposer8.changedInstance(this);
                Object rememberedValue23 = gapComposer8.rememberedValue();
                if (changedInstance8 || rememberedValue23 == neverEqualPolicy) {
                    rememberedValue23 = new SavingsRouteInterstitialPresenter$models$1$1(this, continuation2, i5);
                    gapComposer8.updateRememberedValue(rememberedValue23);
                }
                Updater.LaunchedEffect(gapComposer8, unit6, (Function2) rememberedValue23);
                gapComposer8.end(false);
                return unit6;
            case 8:
                flow.getClass();
                GapComposer gapComposer9 = (GapComposer) composer;
                gapComposer9.startReplaceGroup(-1075131088);
                Object rememberedValue24 = gapComposer9.rememberedValue();
                if (rememberedValue24 == neverEqualPolicy) {
                    SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen singleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen = (SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen) obj4;
                    rememberedValue24 = Updater.mutableStateOf$default(new SingleUsePaymentCheckoutViewModel(singleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen.screenType, singleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen.cartDetails, singleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen.exitScreen));
                    gapComposer9.updateRememberedValue(rememberedValue24);
                }
                MutableState mutableState18 = (MutableState) rememberedValue24;
                Updater.LaunchedEffect(gapComposer9, flow, new TaxWebAppPresenter$models$1$1(flow, (Continuation) null, (MoleculePresenter) this, mutableState18, 4));
                SingleUsePaymentCheckoutViewModel singleUsePaymentCheckoutViewModel = (SingleUsePaymentCheckoutViewModel) mutableState18.getValue();
                gapComposer9.end(false);
                return singleUsePaymentCheckoutViewModel;
            case 9:
                flow.getClass();
                GapComposer gapComposer10 = (GapComposer) composer;
                gapComposer10.startReplaceGroup(-527554116);
                Object rememberedValue25 = gapComposer10.rememberedValue();
                if (rememberedValue25 == neverEqualPolicy) {
                    rememberedValue25 = Updater.mutableStateOf$default(ChatSurveyViewModel.Loading.INSTANCE);
                    gapComposer10.updateRememberedValue(rememberedValue25);
                }
                MutableState mutableState19 = (MutableState) rememberedValue25;
                Unit unit7 = Unit.INSTANCE;
                boolean changedInstance9 = gapComposer10.changedInstance(this);
                Object rememberedValue26 = gapComposer10.rememberedValue();
                Continuation continuation8 = null;
                if (changedInstance9 || rememberedValue26 == neverEqualPolicy) {
                    rememberedValue26 = new ShoppingWebBridge$loadUrl$1(this, mutableState19, null, 19);
                    gapComposer10.updateRememberedValue(rememberedValue26);
                }
                Updater.LaunchedEffect(gapComposer10, unit7, (Function2) rememberedValue26);
                Updater.LaunchedEffect(gapComposer10, flow, new TaxWebAppPresenter$models$1$1(flow, continuation8, (MoleculePresenter) this, mutableState19, 11));
                ChatSurveyViewModel chatSurveyViewModel = (ChatSurveyViewModel) mutableState19.getValue();
                gapComposer10.end(false);
                return chatSurveyViewModel;
            case 10:
                flow.getClass();
                GapComposer gapComposer11 = (GapComposer) composer;
                gapComposer11.startReplaceGroup(820289242);
                Object rememberedValue27 = gapComposer11.rememberedValue();
                Object obj15 = rememberedValue27;
                if (rememberedValue27 == neverEqualPolicy) {
                    StateFlowImpl stateFlowImpl = ((RealScreenshotManager) obj).screenshotState;
                    gapComposer11.updateRememberedValue(stateFlowImpl);
                    obj15 = stateFlowImpl;
                }
                MutableState collectAsState2 = Updater.collectAsState((StateFlow) obj15, null, gapComposer11, 1);
                Object rememberedValue28 = gapComposer11.rememberedValue();
                Object obj16 = rememberedValue28;
                if (rememberedValue28 == neverEqualPolicy) {
                    ReadonlyStateFlow asStateFlow = FlowKt.asStateFlow((StateFlowImpl) ((HCaptcha) obj3).captchaVerifier);
                    gapComposer11.updateRememberedValue(asStateFlow);
                    obj16 = asStateFlow;
                }
                MutableState collectAsState3 = Updater.collectAsState((StateFlow) obj16, null, gapComposer11, 1);
                Object rememberedValue29 = gapComposer11.rememberedValue();
                Object obj17 = rememberedValue29;
                if (rememberedValue29 == neverEqualPolicy) {
                    ParcelableSnapshotMutableState mutableStateOf$default4 = Updater.mutableStateOf$default(null);
                    gapComposer11.updateRememberedValue(mutableStateOf$default4);
                    obj17 = mutableStateOf$default4;
                }
                MutableState mutableState20 = (MutableState) obj17;
                Object rememberedValue30 = gapComposer11.rememberedValue();
                Object obj18 = rememberedValue30;
                if (rememberedValue30 == neverEqualPolicy) {
                    ParcelableSnapshotMutableState mutableStateOf$default5 = Updater.mutableStateOf$default(EmptyList.INSTANCE);
                    gapComposer11.updateRememberedValue(mutableStateOf$default5);
                    obj18 = mutableStateOf$default5;
                }
                MutableState mutableState21 = (MutableState) obj18;
                Object rememberedValue31 = gapComposer11.rememberedValue();
                Object obj19 = rememberedValue31;
                if (rememberedValue31 == neverEqualPolicy) {
                    ParcelableSnapshotMutableState mutableStateOf$default6 = Updater.mutableStateOf$default(new ScreenshotReviewViewModel.Loaded(EmptyList.INSTANCE, false));
                    gapComposer11.updateRememberedValue(mutableStateOf$default6);
                    obj19 = mutableStateOf$default6;
                }
                MutableState mutableState22 = (MutableState) obj19;
                Unit unit8 = Unit.INSTANCE;
                boolean changedInstance10 = gapComposer11.changedInstance(this) | gapComposer11.changed(collectAsState2);
                Object rememberedValue32 = gapComposer11.rememberedValue();
                Object obj20 = rememberedValue32;
                if (changedInstance10 || rememberedValue32 == neverEqualPolicy) {
                    WorkflowNode$tick$1$1 workflowNode$tick$1$1 = new WorkflowNode$tick$1$1(this, collectAsState2, continuation2, i3);
                    gapComposer11.updateRememberedValue(workflowNode$tick$1$1);
                    obj20 = workflowNode$tick$1$1;
                }
                Updater.LaunchedEffect(gapComposer11, unit8, (Function2) obj20);
                Updater.LaunchedEffect(gapComposer11, flow, new NotificationActionService$onHandleIntent$1(flow, (Continuation) null, this, collectAsState2, mutableState22, mutableState20, 12));
                String str19 = (String) mutableState20.getValue();
                Object rememberedValue33 = gapComposer11.rememberedValue();
                Object obj21 = rememberedValue33;
                if (rememberedValue33 == neverEqualPolicy) {
                    OffersHomePresenter$models$2$1 offersHomePresenter$models$2$1 = new OffersHomePresenter$models$2$1(mutableState20, mutableState22, continuation2, 15);
                    gapComposer11.updateRememberedValue(offersHomePresenter$models$2$1);
                    obj21 = offersHomePresenter$models$2$1;
                }
                Updater.LaunchedEffect(gapComposer11, str19, (Function2) obj21);
                ScreenshotManager$ScreenshotState screenshotManager$ScreenshotState = (ScreenshotManager$ScreenshotState) collectAsState2.getValue();
                ScreenshotService$ServiceState screenshotService$ServiceState = (ScreenshotService$ServiceState) collectAsState3.getValue();
                boolean changedInstance11 = gapComposer11.changedInstance(this) | gapComposer11.changed(collectAsState2) | gapComposer11.changed(collectAsState3);
                Object rememberedValue34 = gapComposer11.rememberedValue();
                if (changedInstance11 || rememberedValue34 == neverEqualPolicy) {
                    WithdrawViewKt$WithdrawAmountView$1$1 withdrawViewKt$WithdrawAmountView$1$1 = new WithdrawViewKt$WithdrawAmountView$1$1(this, collectAsState2, collectAsState3, mutableState21, mutableState22, null, 1);
                    gapComposer11.updateRememberedValue(withdrawViewKt$WithdrawAmountView$1$1);
                    rememberedValue34 = withdrawViewKt$WithdrawAmountView$1$1;
                }
                Updater.LaunchedEffect(screenshotManager$ScreenshotState, screenshotService$ServiceState, (Function2) rememberedValue34, gapComposer11);
                ScreenshotReviewViewModel screenshotReviewViewModel = (ScreenshotReviewViewModel) mutableState22.getValue();
                gapComposer11.end(false);
                return screenshotReviewViewModel;
            case 11:
                flow.getClass();
                GapComposer gapComposer12 = (GapComposer) composer;
                gapComposer12.startReplaceGroup(-1570142230);
                Object rememberedValue35 = gapComposer12.rememberedValue();
                if (rememberedValue35 == neverEqualPolicy) {
                    rememberedValue35 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer12);
                    gapComposer12.updateRememberedValue(rememberedValue35);
                }
                CoroutineScope coroutineScope = (CoroutineScope) rememberedValue35;
                MutableState collectAsState4 = Updater.collectAsState(((RealSelectedMerchantProvider) obj2).getMerchantIdentifierFlow(), null, null, gapComposer12, 48, 2);
                Object rememberedValue36 = gapComposer12.rememberedValue();
                if (rememberedValue36 == neverEqualPolicy) {
                    rememberedValue36 = Updater.mutableStateOf$default(null);
                    gapComposer12.updateRememberedValue(rememberedValue36);
                }
                MutableState mutableState23 = (MutableState) rememberedValue36;
                Updater.LaunchedEffect(gapComposer12, flow, new NotificationActionService$onHandleIntent$1(flow, (Continuation) null, this, coroutineScope, collectAsState4, mutableState23, 24));
                ToastState toastState = (ToastState) mutableState23.getValue();
                ShiftNoteScreen shiftNoteScreen = (ShiftNoteScreen) obj4;
                String str20 = shiftNoteScreen.shiftNote;
                if (str20 != null) {
                    OffsetDateTime offsetDateTime = shiftNoteScreen.shiftNoteDate;
                    String formatDayDate = offsetDateTime != null ? ((RealShiftTimeFormatter) obj5).formatDayDate(offsetDateTime) : null;
                    if (formatDayDate == null) {
                        formatDayDate = "";
                    }
                    shiftNoteSection = new ShiftNoteViewModel.ShiftNoteSection(str20, formatDayDate);
                } else {
                    shiftNoteSection = null;
                }
                if (shiftNoteScreen.timecardToken != null) {
                    String str21 = shiftNoteScreen.existingTimecardNote;
                    inputSection = new ShiftNoteViewModel.InputSection(str21 != null ? str21 : "", !StringsKt.isBlank(r12));
                }
                ShiftNoteViewModel shiftNoteViewModel = new ShiftNoteViewModel(((AndroidStringManager) obj6).get(R.string.work_shift_note_title), shiftNoteSection, inputSection, toastState);
                gapComposer12.end(false);
                return shiftNoteViewModel;
            default:
                TakeBreakBottomSheetScreen takeBreakBottomSheetScreen = (TakeBreakBottomSheetScreen) obj4;
                flow.getClass();
                GapComposer gapComposer13 = (GapComposer) composer;
                gapComposer13.startReplaceGroup(-1557695924);
                Object rememberedValue37 = gapComposer13.rememberedValue();
                if (rememberedValue37 == neverEqualPolicy) {
                    rememberedValue37 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer13);
                    gapComposer13.updateRememberedValue(rememberedValue37);
                }
                Updater.LaunchedEffect(gapComposer13, flow, new NotificationActionService$onHandleIntent$1(flow, (Continuation) null, this, takeBreakBottomSheetScreen.askedQuestion, (CoroutineScope) rememberedValue37, Updater.collectAsState(((RealSelectedMerchantProvider) obj3).getMerchantIdentifierFlow(), null, null, gapComposer13, 48, 2), 25));
                boolean changed3 = gapComposer13.changed(takeBreakBottomSheetScreen);
                Object rememberedValue38 = gapComposer13.rememberedValue();
                if (changed3 || rememberedValue38 == neverEqualPolicy) {
                    String str22 = ((AndroidStringManager) obj6).get(R.string.work_shift_choose_break_type);
                    ArrayList<TakeBreakBottomSheetScreen.BreakInfo> arrayList7 = takeBreakBottomSheetScreen.breaks;
                    ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
                    for (TakeBreakBottomSheetScreen.BreakInfo breakInfo : arrayList7) {
                        arrayList8.add(new TakeBreakBottomSheetViewModel.BreakItem(breakInfo.token, breakInfo.versionNumber, breakInfo.name, ((RealShiftTimeFormatter) obj5).formatDuration(breakInfo.expectedDurationSeconds)));
                    }
                    rememberedValue38 = new TakeBreakBottomSheetViewModel(str22, arrayList8);
                    gapComposer13.updateRememberedValue(rememberedValue38);
                }
                TakeBreakBottomSheetViewModel takeBreakBottomSheetViewModel = (TakeBreakBottomSheetViewModel) rememberedValue38;
                gapComposer13.end(false);
                return takeBreakBottomSheetViewModel;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object submitFormAndAdvance$1(ContinuationImpl continuationImpl) {
        PasskeyUpsellPresenter$submitFormAndAdvance$1 passkeyUpsellPresenter$submitFormAndAdvance$1;
        int i;
        BlockersData blockersData;
        boolean z;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) this.fileSaver;
        PasskeyUpsellScreen passkeyUpsellScreen = (PasskeyUpsellScreen) this.pdfFile$delegate;
        if (continuationImpl instanceof PasskeyUpsellPresenter$submitFormAndAdvance$1) {
            passkeyUpsellPresenter$submitFormAndAdvance$1 = (PasskeyUpsellPresenter$submitFormAndAdvance$1) continuationImpl;
            int i2 = passkeyUpsellPresenter$submitFormAndAdvance$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                passkeyUpsellPresenter$submitFormAndAdvance$1.label = i2 - PKIFailureInfo.systemUnavail;
                PasskeyUpsellPresenter$submitFormAndAdvance$1 passkeyUpsellPresenter$submitFormAndAdvance$12 = passkeyUpsellPresenter$submitFormAndAdvance$1;
                Object obj = passkeyUpsellPresenter$submitFormAndAdvance$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passkeyUpsellPresenter$submitFormAndAdvance$12.label;
                String str = null;
                Object[] objArr = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    BlockersData blockersData2 = passkeyUpsellScreen.blockersData;
                    Analytics analytics = (Analytics) this.args;
                    RealMRIFactory$sign$2.AnonymousClass1 anonymousClass1 = new RealMRIFactory$sign$2.AnonymousClass1(this, blockersData2, objArr == true ? 1 : 0, 16);
                    passkeyUpsellPresenter$submitFormAndAdvance$12.L$0 = blockersData2;
                    passkeyUpsellPresenter$submitFormAndAdvance$12.label = 1;
                    obj = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, blockersData2, analytics, androidStringManager, passkeyUpsellPresenter$submitFormAndAdvance$12, null, anonymousClass1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    blockersData = blockersData2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    blockersData = passkeyUpsellPresenter$submitFormAndAdvance$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                z = apiResult instanceof ApiResult.Success;
                BetterNavigator.ScreenNavigator screenNavigator = this.navigator;
                if (!z) {
                    ResponseContext responseContext = ((SubmitFormResponse) ((ApiResult.Success) apiResult).response).response_context;
                    if (responseContext != null) {
                        Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                        screenNavigator.goTo(blockersDataNavigator.getNext(passkeyUpsellScreen, blockersData.updateFromResponseContext(responseContext, false)));
                    } else {
                        screenNavigator.goTo(blockersDataNavigator.getNext(passkeyUpsellScreen, blockersData));
                    }
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator.goTo(new FailureMessageBlockerScreen(blockersData, androidStringManager.get(R.string.generic_network_error), str, 4));
                }
                return Unit.INSTANCE;
            }
        }
        passkeyUpsellPresenter$submitFormAndAdvance$1 = new PasskeyUpsellPresenter$submitFormAndAdvance$1(this, continuationImpl);
        PasskeyUpsellPresenter$submitFormAndAdvance$1 passkeyUpsellPresenter$submitFormAndAdvance$122 = passkeyUpsellPresenter$submitFormAndAdvance$1;
        Object obj2 = passkeyUpsellPresenter$submitFormAndAdvance$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passkeyUpsellPresenter$submitFormAndAdvance$122.label;
        String str2 = null;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj2;
        z = apiResult2 instanceof ApiResult.Success;
        BetterNavigator.ScreenNavigator screenNavigator2 = this.navigator;
        if (!z) {
        }
        return Unit.INSTANCE;
    }

    public DeviceViewModel toViewModel(LoggedInDevice loggedInDevice) {
        DeviceType deviceType;
        RealTodayDateTimeFormatter realTodayDateTimeFormatter = (RealTodayDateTimeFormatter) this.launcher;
        LoggedInDevice.LastLogin lastLogin = loggedInDevice.lastLogin;
        LoggedInDevice.DeviceType deviceType2 = loggedInDevice.deviceType;
        Instant instant = new Date(lastLogin.timestampMillis).toInstant();
        instant.getClass();
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        String formatDate = realTodayDateTimeFormatter.formatDate(instant, new TodayDateTimeFormatter$FormatOptions(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, androidStringManager.get(R.string.device_manager_date_today), null, null, false, false));
        String str = loggedInDevice.appToken;
        String str2 = loggedInDevice.name;
        String str3 = loggedInDevice.lastLogin.locationName;
        if (str3 == null) {
            str3 = androidStringManager.get(R.string.device_manager_location_unknown);
        }
        String str4 = str3 + " • ";
        int ordinal = deviceType2.ordinal();
        if (ordinal != 0) {
            switch (ordinal) {
                case 2:
                    deviceType = DeviceType.MAC;
                    break;
                case 3:
                    deviceType = DeviceType.WINDOWS;
                    break;
                case 4:
                    deviceType = DeviceType.IPAD;
                    break;
                case 5:
                    deviceType = DeviceType.IPHONE;
                    break;
                case 6:
                    deviceType = DeviceType.IPOD_TOUCH;
                    break;
                case 7:
                    deviceType = DeviceType.OTHER;
                    break;
                default:
                    deviceType = DeviceType.BROWSER;
                    break;
            }
        } else {
            deviceType = DeviceType.ANDROID;
        }
        DeviceType deviceType3 = deviceType;
        boolean z = loggedInDevice.isThisDevice;
        if (z) {
            formatDate = androidStringManager.get(R.string.device_manager_device_item_status);
        }
        return new DeviceViewModel(str, str2, str4, deviceType3, z, new DeviceViewModel.LastActive(formatDate, loggedInDevice.isThisDevice));
    }

    public PdfPreviewPresenter(BetterNavigator.ScreenNavigator screenNavigator, DeviceManagerDeviceRemovalSuccessScreen deviceManagerDeviceRemovalSuccessScreen, RealDeviceManagerAnalytics realDeviceManagerAnalytics, AndroidStringManager androidStringManager, StateFlow stateFlow, AndroidBiometricsStore androidBiometricsStore, RealPasscodeFlowStarter realPasscodeFlowStarter) {
        this.$r8$classId = 4;
        deviceManagerDeviceRemovalSuccessScreen.getClass();
        this.navigator = screenNavigator;
        this.args = deviceManagerDeviceRemovalSuccessScreen;
        this.launcher = realDeviceManagerAnalytics;
        this.stringManager = androidStringManager;
        this.fileProvider = stateFlow;
        this.fileSaver = androidBiometricsStore;
        this.pdfFile$delegate = realPasscodeFlowStarter;
    }

    public PdfPreviewPresenter(TakeBreakBottomSheetScreen takeBreakBottomSheetScreen, BetterNavigator.ScreenNavigator screenNavigator, RealClockInRepository realClockInRepository, RealSelectedMerchantProvider realSelectedMerchantProvider, ShiftsAnalytics shiftsAnalytics, RealShiftTimeFormatter realShiftTimeFormatter, AndroidStringManager androidStringManager) {
        this.$r8$classId = 12;
        takeBreakBottomSheetScreen.getClass();
        this.args = takeBreakBottomSheetScreen;
        this.navigator = screenNavigator;
        this.launcher = realClockInRepository;
        this.fileProvider = realSelectedMerchantProvider;
        this.fileSaver = shiftsAnalytics;
        this.pdfFile$delegate = realShiftTimeFormatter;
        this.stringManager = androidStringManager;
    }

    public PdfPreviewPresenter(PdfScreen pdfScreen, BetterNavigator.ScreenNavigator screenNavigator, IntentLauncher intentLauncher, AndroidFileProvider androidFileProvider, AndroidFileSaver androidFileSaver, Edge.Companion companion, AndroidStringManager androidStringManager) {
        this.$r8$classId = 0;
        pdfScreen.getClass();
        this.args = pdfScreen;
        this.navigator = screenNavigator;
        this.launcher = intentLauncher;
        this.fileProvider = androidFileProvider;
        this.fileSaver = androidFileSaver;
        this.stringManager = androidStringManager;
        this.pdfFile$delegate = LazyKt.lazy(new BottomSheet$$ExternalSyntheticLambda2(this, 1));
    }

    public PdfPreviewPresenter(Analytics analytics, RealPasskeyRepository realPasskeyRepository, AppService appService, BlockersDataNavigator blockersDataNavigator, AndroidStringManager androidStringManager, PasskeyUpsellScreen passkeyUpsellScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 1;
        passkeyUpsellScreen.getClass();
        this.args = analytics;
        this.launcher = realPasskeyRepository;
        this.fileProvider = appService;
        this.fileSaver = blockersDataNavigator;
        this.stringManager = androidStringManager;
        this.pdfFile$delegate = passkeyUpsellScreen;
        this.navigator = screenNavigator;
    }

    public PdfPreviewPresenter(ShiftNoteScreen shiftNoteScreen, BetterNavigator.ScreenNavigator screenNavigator, RealClockInRepository realClockInRepository, ShiftsAnalytics shiftsAnalytics, RealSelectedMerchantProvider realSelectedMerchantProvider, AndroidStringManager androidStringManager, RealShiftTimeFormatter realShiftTimeFormatter) {
        this.$r8$classId = 11;
        shiftNoteScreen.getClass();
        this.args = shiftNoteScreen;
        this.navigator = screenNavigator;
        this.launcher = realClockInRepository;
        this.fileProvider = shiftsAnalytics;
        this.fileSaver = realSelectedMerchantProvider;
        this.stringManager = androidStringManager;
        this.pdfFile$delegate = realShiftTimeFormatter;
    }

    public PdfPreviewPresenter(PiggybankAppService piggybankAppService, RealRouter$Factory$Impl realRouter$Factory$Impl, AndroidStringManager androidStringManager, SyncValueReader syncValueReader, SavingsRouteInterstitialScreen savingsRouteInterstitialScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 7;
        this.args = piggybankAppService;
        this.launcher = realRouter$Factory$Impl;
        this.stringManager = androidStringManager;
        this.fileProvider = syncValueReader;
        this.fileSaver = savingsRouteInterstitialScreen;
        this.navigator = screenNavigator;
        this.pdfFile$delegate = LazyKt.lazy(new BottomSheet$$ExternalSyntheticLambda2(this, 17));
    }

    public PdfPreviewPresenter(BetterNavigator.ScreenNavigator screenNavigator, SupportScreens.ScreenshotScreen.ScreenshotReviewScreen screenshotReviewScreen, RealScreenshotManager realScreenshotManager, HCaptcha hCaptcha, RealSupportNavigator realSupportNavigator, AndroidStringManager androidStringManager, Analytics analytics) {
        this.$r8$classId = 10;
        screenshotReviewScreen.getClass();
        this.navigator = screenNavigator;
        this.args = screenshotReviewScreen;
        this.launcher = realScreenshotManager;
        this.fileProvider = hCaptcha;
        this.fileSaver = realSupportNavigator;
        this.stringManager = androidStringManager;
        this.pdfFile$delegate = analytics;
    }

    public PdfPreviewPresenter(SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen singleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen, BetterNavigator.ScreenNavigator screenNavigator, FlowStarter flowStarter, SingleWebSessionInMemoryManager singleWebSessionInMemoryManager, WebViewProvider webViewProvider, RealOffersAnalyticsHelper realOffersAnalyticsHelper, Analytics analytics) {
        this.$r8$classId = 8;
        singleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen.getClass();
        this.args = singleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen;
        this.navigator = screenNavigator;
        this.launcher = flowStarter;
        this.fileProvider = singleWebSessionInMemoryManager;
        this.fileSaver = webViewProvider;
        this.stringManager = realOffersAnalyticsHelper;
        this.pdfFile$delegate = analytics;
    }

    public PdfPreviewPresenter(AndroidStringManager androidStringManager, RealProfileManager realProfileManager, Analytics analytics, SessionManager sessionManager, ProfileScreens.EnableAliasSheetScreen enableAliasSheetScreen, BetterNavigator.ScreenNavigator screenNavigator, CoroutineScope coroutineScope) {
        this.$r8$classId = 5;
        enableAliasSheetScreen.getClass();
        this.stringManager = androidStringManager;
        this.args = realProfileManager;
        this.launcher = analytics;
        this.fileProvider = sessionManager;
        this.fileSaver = enableAliasSheetScreen;
        this.navigator = screenNavigator;
        this.pdfFile$delegate = coroutineScope;
    }

    public PdfPreviewPresenter(AndroidStringManager androidStringManager, RealProfileAliasRepository realProfileAliasRepository, FlowStarter flowStarter, RealProfileManager realProfileManager, RealContactAliasFetcher realContactAliasFetcher, ProfileScreens.AccountInfoScreen accountInfoScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 6;
        accountInfoScreen.getClass();
        this.stringManager = androidStringManager;
        this.args = realProfileAliasRepository;
        this.launcher = flowStarter;
        this.fileProvider = realProfileManager;
        this.fileSaver = realContactAliasFetcher;
        this.pdfFile$delegate = accountInfoScreen;
        this.navigator = screenNavigator;
    }

    public PdfPreviewPresenter(RealDeviceManagerRepo realDeviceManagerRepo, AndroidStringManager androidStringManager, RealTodayDateTimeFormatter realTodayDateTimeFormatter, RealDeviceManagerAnalytics realDeviceManagerAnalytics, FeatureFlagManager featureFlagManager, DeviceManagerDeviceDetailsScreen deviceManagerDeviceDetailsScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 2;
        deviceManagerDeviceDetailsScreen.getClass();
        this.args = realDeviceManagerRepo;
        this.stringManager = androidStringManager;
        this.launcher = realTodayDateTimeFormatter;
        this.fileProvider = realDeviceManagerAnalytics;
        this.fileSaver = featureFlagManager;
        this.pdfFile$delegate = deviceManagerDeviceDetailsScreen;
        this.navigator = screenNavigator;
    }

    public PdfPreviewPresenter(RealDeviceManagerRepo realDeviceManagerRepo, RealTodayDateTimeFormatter realTodayDateTimeFormatter, AndroidStringManager androidStringManager, RealDeviceManagerAnalytics realDeviceManagerAnalytics, FeatureFlagManager featureFlagManager, BetterNavigator.ScreenNavigator screenNavigator, DeviceManagerListScreen deviceManagerListScreen) {
        this.$r8$classId = 3;
        deviceManagerListScreen.getClass();
        this.args = realDeviceManagerRepo;
        this.launcher = realTodayDateTimeFormatter;
        this.stringManager = androidStringManager;
        this.fileProvider = realDeviceManagerAnalytics;
        this.fileSaver = featureFlagManager;
        this.navigator = screenNavigator;
        this.pdfFile$delegate = deviceManagerListScreen;
    }
}
