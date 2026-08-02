package com.squareup.cash;

import com.squareup.cash.VariantAppComponent;
import com.squareup.cash.VariantSandboxedComponent;
import com.squareup.cash.attribution.DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0;
import com.squareup.cash.cashapplite.CashAppLiteReleaseModule$$ExternalSyntheticLambda0;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.clipboard.RealClipboardService;
import com.squareup.cash.gps.backend.real.RealNetworkEnvironmentCollector;
import com.squareup.cash.initialscreenloader.backend.OpenTheAppUserJourney;
import com.squareup.cash.initialscreenloader.backend.RealSquareStaffSwitchAccountContextStore;
import com.squareup.cash.integration.api.Endpoints;
import com.squareup.cash.localization.RealLanguageManager;
import com.squareup.cash.notification.photo.NotificationPhotoLookupKeyRegistry;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.permissions.PermissionChecker;
import com.squareup.cash.profile.views.ProfilePhotoUrlRegistry;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.DoubleWriteExperimentForwarder;
import com.squareup.cash.storage.Storage;
import com.squareup.cash.treehouse.buildconfig.RawBuildConfigService;
import com.squareup.cash.userjourneys.tracker.RealUserJourneyTracker;
import com.squareup.cash.userjourneys.tracker.UserJourneySignalProcessor;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import com.squareup.cash.util.network.impl.AndroidConnectivityManager;
import com.squareup.preferences.KeyValue;
import com.squareup.util.android.AndroidAccountManager;
import com.squareup.util.android.AndroidAudioManager;
import com.squareup.util.android.AndroidColorManager;
import com.squareup.util.android.AndroidDeviceInfo;
import com.squareup.util.android.AndroidToaster;
import com.squareup.util.workmanager.AndroidWorkManager;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import retrofit2.OkHttpCall;

/* loaded from: classes.dex */
public final /* synthetic */ class VariantSandboxedComponent$Impl$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ VariantSandboxedComponent.Impl f$0;

    public /* synthetic */ VariantSandboxedComponent$Impl$$ExternalSyntheticLambda0(VariantSandboxedComponent.Impl impl, int i) {
        this.$r8$classId = i;
        this.f$0 = impl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        VariantSandboxedComponent.Impl impl = this.f$0;
        switch (i) {
            case 0:
                VariantAppComponent.Impl impl2 = (VariantAppComponent.Impl) impl.variantAppComponentInstance$1;
                return new RealNetworkEnvironmentCollector(impl2.applicationInstance, (PermissionChecker) impl2.androidPermissionCheckerProvider.getValue(), (ErrorReporter) impl2.realErrorReporterProvider.invoke());
            case 1:
                VariantAppComponent.Impl impl3 = (VariantAppComponent.Impl) impl.variantAppComponentInstance$1;
                return new AndroidStringManager(impl3.applicationInstance, (RealLanguageManager) impl3.realLanguageManagerProvider.getValue());
            case 2:
                return (Endpoints) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).provideEndpointProvider.getValue();
            case 3:
                return (KeyValue) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).provideForcedLogoutProvider.getValue();
            case 4:
                return (AndroidToaster) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).androidToasterProvider.invoke();
            case 5:
                return new AndroidAccountManager(((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).applicationInstance);
            case 6:
                VariantAppComponent.Impl impl4 = (VariantAppComponent.Impl) impl.variantAppComponentInstance$1;
                return new AndroidDeviceInfo((OkHttpCall.AnonymousClass1) impl4.androidTelephonyManagerProvider.invoke(), (AndroidConnectivityManager) impl4.androidConnectivityManagerProvider.invoke(), impl4.applicationInstance.getResources().getConfiguration().smallestScreenWidthDp);
            case 7:
                return (Storage) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).provideAppStorageProvider.getValue();
            case 8:
                return (List) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).provideFirstPartyHostsProvider.invoke();
            case 9:
                return (UserJourneySignalProcessor) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).realUserJourneySignalProcessorProvider.getValue();
            case 10:
                return (OpenTheAppUserJourney) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).realOpenTheAppUserJourneyProvider.getValue();
            case 11:
                PermissionChecker permissionChecker = (PermissionChecker) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).androidPermissionCheckerProvider.getValue();
                permissionChecker.getClass();
                return permissionChecker.create("android.permission.READ_CONTACTS");
            case 12:
                return (NotificationPhotoLookupKeyRegistry) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).notificationPhotoLookupKeyRegistryProvider.getValue();
            case 13:
                return (ProfilePhotoUrlRegistry) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).profilePhotoUrlRegistryProvider.getValue();
            case 14:
                return (DoubleWriteExperimentForwarder) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).doubleWriteExperimentForwarderProvider.getValue();
            case 15:
                return ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).applicationInstance;
            case 16:
                MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).deferredDeepLinkStateProvider.getValue();
                mutableSharedFlow.getClass();
                return new DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0(mutableSharedFlow);
            case 17:
                return (AndroidConnectivityManager) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).androidConnectivityManagerProvider.invoke();
            case 18:
                return new AndroidWorkManager(((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).applicationInstance);
            case 19:
                return (RealUserJourneyTracker) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).realUserJourneyTrackerProvider.getValue();
            case 20:
                return (RealSquareStaffSwitchAccountContextStore) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).provideSquareStaffSwitchAccountContextStoreProvider.getValue();
            case 21:
                return (UserJourneyTracker) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).realUserJourneyTrackerProvider.getValue();
            case 22:
                return (KeyValue) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).provideLastUpdatedCountryProvider.getValue();
            case 23:
                return (AndroidAudioManager) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).androidAudioManagerProvider.invoke();
            case 24:
                return new AndroidColorManager(((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).applicationInstance);
            case 25:
                return (SharedFlow) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).deferredDeepLinkStateProvider.getValue();
            case 26:
                return (RawBuildConfigService) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).androidBuildConfigServiceProvider.getValue();
            case 27:
                return new RealClipboardService((RealClipboardManager) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).realClipboardManagerProvider.getValue());
            case 28:
                return (CashAppLiteReleaseModule$$ExternalSyntheticLambda0) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).provideCashAppLiteGateProvider.getValue();
            default:
                return (RealClipboardManager) ((VariantAppComponent.Impl) impl.variantAppComponentInstance$1).realClipboardManagerProvider.getValue();
        }
    }
}
