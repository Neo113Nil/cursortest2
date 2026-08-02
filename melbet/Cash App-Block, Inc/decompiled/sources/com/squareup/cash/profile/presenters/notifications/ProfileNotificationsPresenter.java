package com.squareup.cash.profile.presenters.notifications;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.navigation.compose.NavHostKt$NavHost$33$1;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.molecule.MoleculeKt$immediateClockFlow$1$1$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.account.backend.AccountholderAccountRepository$LoadAccountsResult;
import com.squareup.cash.account.backend.RealAccountholderAccountRepository;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.RealProfileNotificationsRepository;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$NotificationSettings;
import com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobileMessagingNotificationSettingsSam;
import com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.notifications.NotificationSettingsChecker;
import com.squareup.cash.notifications.NotificationToggleState;
import com.squareup.cash.notifications.RealAndroidNotificationSettingsChecker;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.ProfileNotificationsViewModel;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.profile.views.RingtoneView;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter$special$$inlined$filter$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.presenters.SelectPaymentPlanBlockerPresenter$models$1$2;
import com.squareup.cash.scrubbing.DateScrubber$$ExternalSyntheticLambda0;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.notificationsettings.clientsync.v1.UiNotificationSettings;
import com.squareup.util.coroutines.BufferCountKt$bufferSkip$1;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ProfileNotificationsPresenter implements MoleculePresenter {
    public final RealAccountholderAccountRepository accountholderAccountRepository;
    public final Analytics analytics;
    public final ProfileScreens.NotificationsScreen args;
    public final boolean canRequestNotificationPermission;
    public final ErrorReporter errorReporter;
    public final FeatureFlagManager featureFlagManager;
    public final KeyValue hasSeenNotificationScreen;
    public final IntentLauncher launcher;
    public final BetterNavigator.ScreenNavigator navigator;
    public final NotificationSectionPresenter$Factory$Impl notificationSectionPresenterFactory;
    public final AndroidPermissionManager permissionManager;
    public final RealProfileNotificationsRepository repository;
    public final CoroutineScope scope;
    public final SessionManager sessionManager;
    public final NotificationSettingsChecker settingsChecker;
    public final RealSettingsEligibilityManager settingsManager;
    public final AndroidStringManager stringManager;
    public final ParcelableSnapshotMutableState viewModel$delegate;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/profile/presenters/notifications/ProfileNotificationsPresenter$AccountSelectorLoadError", "Lcom/squareup/cash/observability/types/ReportedError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
    final class AccountSelectorLoadError extends ReportedError {
        public final Map metadata;
        public final String message = "Unable to locate account metadata for an account token";
        public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.NotificationsSettings.INSTANCE);

        public AccountSelectorLoadError(Map map) {
            this.metadata = BalanceFeedKt$$ExternalSyntheticOutline0.m("error_context", MapsKt__MapsKt.mapOf(new Pair("account_tokens_returned", map.get("account_tokens_returned")), new Pair("current_account_token", map.get("current_account_token")), new Pair("expected_account_tokens", map.get("expected_account_tokens"))));
        }

        @Override // com.squareup.cash.observability.types.FeatureError
        public final Set getFeatures() {
            return this.features;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }

        @Override // com.squareup.cash.observability.types.ReportedError
        public final Map getMetadata() {
            return this.metadata;
        }
    }

    public ProfileNotificationsPresenter(RealProfileNotificationsRepository realProfileNotificationsRepository, AndroidStringManager androidStringManager, Analytics analytics, AndroidPermissionManager androidPermissionManager, SessionManager sessionManager, RealSettingsEligibilityManager realSettingsEligibilityManager, NotificationSettingsChecker notificationSettingsChecker, FeatureFlagManager featureFlagManager, IntentLauncher intentLauncher, ErrorReporter errorReporter, KeyValue keyValue, NotificationSectionPresenter$Factory$Impl notificationSectionPresenter$Factory$Impl, RealAccountholderAccountRepository realAccountholderAccountRepository, CoroutineScope coroutineScope, ProfileScreens.NotificationsScreen notificationsScreen, BetterNavigator.ScreenNavigator screenNavigator, boolean z) {
        notificationsScreen.getClass();
        this.repository = realProfileNotificationsRepository;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.permissionManager = androidPermissionManager;
        this.sessionManager = sessionManager;
        this.settingsManager = realSettingsEligibilityManager;
        this.settingsChecker = notificationSettingsChecker;
        this.featureFlagManager = featureFlagManager;
        this.launcher = intentLauncher;
        this.errorReporter = errorReporter;
        this.hasSeenNotificationScreen = keyValue;
        this.notificationSectionPresenterFactory = notificationSectionPresenter$Factory$Impl;
        this.accountholderAccountRepository = realAccountholderAccountRepository;
        this.scope = coroutineScope;
        this.args = notificationsScreen;
        this.navigator = screenNavigator;
        this.canRequestNotificationPermission = z;
        this.viewModel$delegate = Updater.mutableStateOf$default(ProfileNotificationsViewModel.Loading.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$loadAccountSelectorAccounts(ProfileNotificationsPresenter profileNotificationsPresenter, ContinuationImpl continuationImpl) {
        ProfileNotificationsPresenter$loadAccountSelectorAccounts$1 profileNotificationsPresenter$loadAccountSelectorAccounts$1;
        int i;
        AccountholderAccountRepository$LoadAccountsResult accountholderAccountRepository$LoadAccountsResult;
        if (continuationImpl instanceof ProfileNotificationsPresenter$loadAccountSelectorAccounts$1) {
            profileNotificationsPresenter$loadAccountSelectorAccounts$1 = (ProfileNotificationsPresenter$loadAccountSelectorAccounts$1) continuationImpl;
            int i2 = profileNotificationsPresenter$loadAccountSelectorAccounts$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                profileNotificationsPresenter$loadAccountSelectorAccounts$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = profileNotificationsPresenter$loadAccountSelectorAccounts$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = profileNotificationsPresenter$loadAccountSelectorAccounts$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!((FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) ((RealFeatureFlagManager) profileNotificationsPresenter.featureFlagManager).peekCurrentValue(AmplitudeExperiments$MobileMessagingNotificationSettingsSam.INSTANCE)).enabled()) {
                        return EmptyList.INSTANCE;
                    }
                    RealAccountholderAccountRepository realAccountholderAccountRepository = profileNotificationsPresenter.accountholderAccountRepository;
                    profileNotificationsPresenter$loadAccountSelectorAccounts$1.label = 1;
                    obj = realAccountholderAccountRepository.loadAccounts(profileNotificationsPresenter$loadAccountSelectorAccounts$1);
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
                accountholderAccountRepository$LoadAccountsResult = (AccountholderAccountRepository$LoadAccountsResult) obj;
                if (!(accountholderAccountRepository$LoadAccountsResult instanceof AccountholderAccountRepository$LoadAccountsResult.Successful)) {
                    return ((AccountholderAccountRepository$LoadAccountsResult.Successful) accountholderAccountRepository$LoadAccountsResult).accounts;
                }
                JobKt.launch$default(profileNotificationsPresenter.scope, null, null, new ProfileNotificationsPresenter$loadAccountSelectorAccounts$2(profileNotificationsPresenter, null), 3);
                return EmptyList.INSTANCE;
            }
        }
        profileNotificationsPresenter$loadAccountSelectorAccounts$1 = new ProfileNotificationsPresenter$loadAccountSelectorAccounts$1(profileNotificationsPresenter, continuationImpl);
        Object obj2 = profileNotificationsPresenter$loadAccountSelectorAccounts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = profileNotificationsPresenter$loadAccountSelectorAccounts$1.label;
        if (i != 0) {
        }
        accountholderAccountRepository$LoadAccountsResult = (AccountholderAccountRepository$LoadAccountsResult) obj2;
        if (!(accountholderAccountRepository$LoadAccountsResult instanceof AccountholderAccountRepository$LoadAccountsResult.Successful)) {
        }
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        MutableState mutableState;
        Continuation continuation;
        ProfileNotificationsPresenter profileNotificationsPresenter = this;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(2022326941);
        Object[] objArr = new Object[0];
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = new DateScrubber$$ExternalSyntheticLambda0(16);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Object obj2 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer, 48);
        Object[] objArr2 = new Object[0];
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj) {
            rememberedValue2 = new DateScrubber$$ExternalSyntheticLambda0(17);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState2 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue2, gapComposer, 48);
        Unit unit = Unit.INSTANCE;
        boolean changed = gapComposer.changed(obj2) | gapComposer.changedInstance(profileNotificationsPresenter);
        Object rememberedValue3 = gapComposer.rememberedValue();
        Continuation continuation2 = null;
        if (changed || rememberedValue3 == obj) {
            rememberedValue3 = new RingtoneView.AnonymousClass1(profileNotificationsPresenter, obj2, continuation2, 18);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == obj) {
            rememberedValue4 = ((RealAndroidNotificationSettingsChecker) profileNotificationsPresenter.settingsChecker).notificationState;
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue4, null, null, gapComposer, 48, 2);
        Object rememberedValue5 = gapComposer.rememberedValue();
        RealProfileNotificationsRepository realProfileNotificationsRepository = profileNotificationsPresenter.repository;
        if (rememberedValue5 == obj) {
            rememberedValue5 = realProfileNotificationsRepository.getNotificationSettings();
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue5, null, null, gapComposer, 48, 2);
        boolean changedInstance = gapComposer.changedInstance(profileNotificationsPresenter);
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue6 == obj) {
            rememberedValue6 = new RingtoneView.AnonymousClass1(profileNotificationsPresenter, continuation2, 19);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        MutableState produceState = Updater.produceState(gapComposer, null, (Function2) rememberedValue6);
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == obj) {
            rememberedValue7 = new CashQrScannerPresenter$special$$inlined$filter$1(realProfileNotificationsRepository.getAliasNotificationPreferences(), 26);
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue7, null, null, gapComposer, 48, 2);
        EmptyList emptyList = EmptyList.INSTANCE;
        boolean changedInstance2 = gapComposer.changedInstance(profileNotificationsPresenter);
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue8 == obj) {
            rememberedValue8 = new SelectPaymentPlanBlockerPresenter$models$1$2(profileNotificationsPresenter, continuation2, 10);
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        MutableState produceState2 = Updater.produceState(gapComposer, emptyList, (Function2) rememberedValue8);
        UiNotificationSettings uiNotificationSettings = (UiNotificationSettings) collectAsState2.getValue();
        List list = (List) collectAsState3.getValue();
        List list2 = (List) produceState2.getValue();
        AccountSettingType$NotificationSettings accountSettingType$NotificationSettings = (AccountSettingType$NotificationSettings) produceState.getValue();
        if (uiNotificationSettings == null || list == null || list2 == null || accountSettingType$NotificationSettings == null) {
            mutableState = collectAsState;
            continuation = null;
            gapComposer.startReplaceGroup(-1331751381);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1331814807);
            Object[] objArr3 = {uiNotificationSettings, list, list2, accountSettingType$NotificationSettings};
            continuation = null;
            mutableState = collectAsState;
            NavHostKt$NavHost$33$1 navHostKt$NavHost$33$1 = new NavHostKt$NavHost$33$1(uiNotificationSettings, list, list2, accountSettingType$NotificationSettings, (Continuation) null, profileNotificationsPresenter);
            profileNotificationsPresenter = profileNotificationsPresenter;
            Updater.LaunchedEffect(objArr3, navHostKt$NavHost$33$1, gapComposer);
            gapComposer.end(false);
        }
        NotificationToggleState notificationToggleState = (NotificationToggleState) mutableState.getValue();
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = profileNotificationsPresenter.viewModel$delegate;
        ProfileNotificationsViewModel profileNotificationsViewModel = (ProfileNotificationsViewModel) parcelableSnapshotMutableState.getValue();
        boolean changedInstance3 = gapComposer.changedInstance(profileNotificationsPresenter) | gapComposer.changed(mutableState);
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (changedInstance3 || rememberedValue9 == obj) {
            rememberedValue9 = new ProfileCropView.AnonymousClass3(profileNotificationsPresenter, mutableState, continuation, 4);
            gapComposer.updateRememberedValue(rememberedValue9);
        }
        Updater.LaunchedEffect(notificationToggleState, profileNotificationsViewModel, (Function2) rememberedValue9, gapComposer);
        List list3 = (List) collectAsState3.getValue();
        if (list3 != null) {
            gapComposer.startReplaceGroup(-1106477359);
            Updater.LaunchedEffect(gapComposer, list3, new BufferCountKt$bufferSkip$1(list3, continuation, profileNotificationsPresenter));
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1106436997);
            gapComposer.end(false);
        }
        NotificationToggleState notificationToggleState2 = (NotificationToggleState) mutableState.getValue();
        if (notificationToggleState2 != null) {
            gapComposer.startReplaceGroup(-1106477359);
            Updater.LaunchedEffect(gapComposer, notificationToggleState2, new MoleculeKt$immediateClockFlow$1$1$1(notificationToggleState2, (Continuation) null, profileNotificationsPresenter, mutableState, mutableState2, 27));
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1106436997);
            gapComposer.end(false);
        }
        Updater.LaunchedEffect(gapComposer, flow, new SelectPaymentPlanBlockerPresenter$models$1$2(flow, continuation, profileNotificationsPresenter, 9));
        ProfileNotificationsViewModel profileNotificationsViewModel2 = (ProfileNotificationsViewModel) parcelableSnapshotMutableState.getValue();
        gapComposer.end(false);
        return profileNotificationsViewModel2;
    }
}
