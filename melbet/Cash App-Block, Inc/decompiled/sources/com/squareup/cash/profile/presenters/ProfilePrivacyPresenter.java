package com.squareup.cash.profile.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ImageLoader$Builder;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$AllowedAccountsSectionViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$BlockedAccountsSectionViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$CashMeSettingViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$ProfileSecurityPolicy;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyViewEvent;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyViewModel;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.blockers.presenters.SignaturePresenter$MetroFactory;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.cashplato.service.CashPlatoAppService;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$SecuritySettings;
import com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$PersonalizedAdsConsent;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$SponsorDrivenBlockingPhase_3;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.p2pblocking.presenters.RealAllowlistRepository;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter$models$1$1;
import com.squareup.cash.permissions.ModifiablePermissions;
import com.squareup.cash.phoneplans.PhonePlansHomePresenter$models$1$1;
import com.squareup.cash.profile.presenters.allowedaccounts.RealAllowedAccountsSectionPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.blockedaccounts.RealBlockedAccountsSectionPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.personalizedads.RealPersonalizedAdsSettingsPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.searchprivacy.RealSearchPrivacySettingsPresenter$Factory$Impl;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.profile.views.RingtoneView;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter$special$$inlined$filter$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.sharesheet.RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1;
import com.squareup.cash.sheet.RealSheetState$peek$3;
import com.squareup.cash.transfers.presenters.SetDefaultInstrumentPresenter;
import com.squareup.cash.upsell.presenters.NullStateSwipeConfigProvider;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.preferences.EnumPreference;
import com.squareup.protos.cash.blockly.api.BlocklyService;
import com.squareup.protos.franklin.ui.FullCashtag;
import com.squareup.util.cash.Cashtags;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ProfilePrivacyPresenter implements MoleculePresenter {
    public static final /* synthetic */ int $r8$clinit = 0;
    public static final long EVENT_DEBOUNCE_MS;
    public final CoroutineScope activityScope;
    public final SetDefaultInstrumentPresenter allowedAccountsSectionPresenter;
    public final Analytics analytics;
    public final WorkHomePresenter blockedAccountsSectionPresenter;
    public final AndroidClock clock;
    public final EnumPreference contactsSyncPreference;
    public final FeatureFlagManager featureFlagManager;
    public final CoroutineContext ioDispatcher;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealP2pSettingsManager p2pSettingsManager;
    public final LocalHomePresenter personalizedAdsSettingsPresenter;
    public final RealProfileManager profileManager;
    public final ModifiablePermissions readContactsPermissions;
    public final SharedFlowImpl requestedPermissionFlow;
    public final LocalEditorialPresenter searchPrivacySettingsPresenter;
    public DeferredCoroutine setCashtagUrlEnabledJob;
    public final RealSettingsEligibilityManager settingsManager;
    public final AndroidStringManager stringManager;

    public final class CashMeSettingActiveState {
        public final boolean isActivated;
        public final boolean isChecked;

        public CashMeSettingActiveState(boolean z, boolean z2) {
            this.isChecked = z;
            this.isActivated = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CashMeSettingActiveState)) {
                return false;
            }
            CashMeSettingActiveState cashMeSettingActiveState = (CashMeSettingActiveState) obj;
            return this.isChecked == cashMeSettingActiveState.isChecked && this.isActivated == cashMeSettingActiveState.isActivated;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isActivated) + (Boolean.hashCode(this.isChecked) * 31);
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("CashMeSettingActiveState(isChecked=", ", isActivated=", ")", this.isChecked, this.isActivated);
        }
    }

    static {
        Duration.Companion companion = Duration.Companion;
        EVENT_DEBOUNCE_MS = DurationKt.toDuration(500, DurationUnit.MILLISECONDS);
    }

    public ProfilePrivacyPresenter(RealP2pSettingsManager realP2pSettingsManager, AndroidStringManager androidStringManager, FeatureFlagManager featureFlagManager, EnumPreference enumPreference, ModifiablePermissions modifiablePermissions, CoroutineContext coroutineContext, CoroutineScope coroutineScope, ProfileScreens.PrivacyScreen privacyScreen, BetterNavigator.ScreenNavigator screenNavigator, Analytics analytics, AndroidClock androidClock, RealProfileManager realProfileManager, RealSettingsEligibilityManager realSettingsEligibilityManager, RealBlockedAccountsSectionPresenter$Factory$Impl realBlockedAccountsSectionPresenter$Factory$Impl, RealAllowedAccountsSectionPresenter$Factory$Impl realAllowedAccountsSectionPresenter$Factory$Impl, RealSearchPrivacySettingsPresenter$Factory$Impl realSearchPrivacySettingsPresenter$Factory$Impl, RealPersonalizedAdsSettingsPresenter$Factory$Impl realPersonalizedAdsSettingsPresenter$Factory$Impl, RealBitcoinCapabilityProvider realBitcoinCapabilityProvider) {
        privacyScreen.getClass();
        this.p2pSettingsManager = realP2pSettingsManager;
        this.stringManager = androidStringManager;
        this.featureFlagManager = featureFlagManager;
        this.contactsSyncPreference = enumPreference;
        this.readContactsPermissions = modifiablePermissions;
        this.ioDispatcher = coroutineContext;
        this.activityScope = coroutineScope;
        this.navigator = screenNavigator;
        this.analytics = analytics;
        this.clock = androidClock;
        this.profileManager = realProfileManager;
        this.settingsManager = realSettingsEligibilityManager;
        OpenSourcePresenter$MetroFactory openSourcePresenter$MetroFactory = realBlockedAccountsSectionPresenter$Factory$Impl.delegateFactory;
        BlocklyService blocklyService = (BlocklyService) openSourcePresenter$MetroFactory.context.getValue();
        SessionManager sessionManager = (SessionManager) openSourcePresenter$MetroFactory.moshi.lambda.invoke();
        AndroidStringManager androidStringManager2 = (AndroidStringManager) openSourcePresenter$MetroFactory.ioDispatcher.lambda.invoke();
        Analytics analytics2 = (Analytics) openSourcePresenter$MetroFactory.intentFactory.getValue();
        blocklyService.getClass();
        sessionManager.getClass();
        androidStringManager2.getClass();
        analytics2.getClass();
        this.blockedAccountsSectionPresenter = new WorkHomePresenter(blocklyService, sessionManager, androidStringManager2, analytics2, screenNavigator);
        SignaturePresenter$MetroFactory signaturePresenter$MetroFactory = realAllowedAccountsSectionPresenter$Factory$Impl.delegateFactory;
        BlocklyService blocklyService2 = (BlocklyService) signaturePresenter$MetroFactory.analytics.getValue();
        SessionManager sessionManager2 = (SessionManager) signaturePresenter$MetroFactory.ioDispatcher.lambda.invoke();
        RealFamilyAccountsManager realFamilyAccountsManager = (RealFamilyAccountsManager) signaturePresenter$MetroFactory.blockersNavigator.invoke();
        FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) signaturePresenter$MetroFactory.appService.getValue();
        AndroidStringManager androidStringManager3 = (AndroidStringManager) signaturePresenter$MetroFactory.stringManager.lambda.invoke();
        RealAllowlistRepository realAllowlistRepository = (RealAllowlistRepository) signaturePresenter$MetroFactory.blockersHelperFactory.invoke();
        blocklyService2.getClass();
        sessionManager2.getClass();
        realFamilyAccountsManager.getClass();
        featureFlagManager2.getClass();
        androidStringManager3.getClass();
        realAllowlistRepository.getClass();
        this.allowedAccountsSectionPresenter = new SetDefaultInstrumentPresenter(blocklyService2, sessionManager2, realFamilyAccountsManager, featureFlagManager2, androidStringManager3, realAllowlistRepository, screenNavigator);
        this.searchPrivacySettingsPresenter = realSearchPrivacySettingsPresenter$Factory$Impl.create$1(screenNavigator);
        ImageLoader$Builder imageLoader$Builder = realPersonalizedAdsSettingsPresenter$Factory$Impl.delegateFactory;
        CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) ((DoubleCheck) imageLoader$Builder.application).getValue();
        SessionManager sessionManager3 = (SessionManager) ((LambdaProvider) imageLoader$Builder.defaults).lambda.invoke();
        CashPlatoAppService cashPlatoAppService = (CashPlatoAppService) ((DoubleCheck) imageLoader$Builder.mainCoroutineContextLazy).getValue();
        AndroidStringManager androidStringManager4 = (AndroidStringManager) ((LambdaProvider) imageLoader$Builder.memoryCacheLazy).lambda.invoke();
        RealLocaleManager realLocaleManager = (RealLocaleManager) ((LambdaProvider) imageLoader$Builder.diskCacheLazy).lambda.invoke();
        String str = (String) ((LambdaProvider) imageLoader$Builder.eventListenerFactory).lambda.invoke();
        RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) ((Provider) imageLoader$Builder.componentRegistry).invoke();
        CoroutineContext coroutineContext2 = (CoroutineContext) ((LambdaProvider) imageLoader$Builder.extras).lambda.invoke();
        cashAccountDatabaseImpl.getClass();
        sessionManager3.getClass();
        cashPlatoAppService.getClass();
        androidStringManager4.getClass();
        realLocaleManager.getClass();
        str.getClass();
        realRouter$Factory$Impl.getClass();
        coroutineContext2.getClass();
        this.personalizedAdsSettingsPresenter = new LocalHomePresenter(cashAccountDatabaseImpl, sessionManager3, cashPlatoAppService, androidStringManager4, realLocaleManager, str, realRouter$Factory$Impl, coroutineContext2, screenNavigator);
        this.requestedPermissionFlow = FlowKt.MutableSharedFlow$default(0, 0, null, 7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r8.emit(r0, r1) == r2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        if (r8 == r2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        if (r8 == r2) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$requestContactsPermissions(ProfilePrivacyPresenter profilePrivacyPresenter, ContinuationImpl continuationImpl) {
        ProfilePrivacyPresenter$requestContactsPermissions$1 profilePrivacyPresenter$requestContactsPermissions$1;
        Object obj;
        int i;
        boolean z;
        ModifiablePermissions modifiablePermissions = profilePrivacyPresenter.readContactsPermissions;
        if (continuationImpl instanceof ProfilePrivacyPresenter$requestContactsPermissions$1) {
            profilePrivacyPresenter$requestContactsPermissions$1 = (ProfilePrivacyPresenter$requestContactsPermissions$1) continuationImpl;
            int i2 = profilePrivacyPresenter$requestContactsPermissions$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                profilePrivacyPresenter$requestContactsPermissions$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = profilePrivacyPresenter$requestContactsPermissions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = profilePrivacyPresenter$requestContactsPermissions$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    profilePrivacyPresenter$requestContactsPermissions$1.label = 1;
                    obj = modifiablePermissions.shouldShowRequestPermissionRationale(profilePrivacyPresenter$requestContactsPermissions$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            z = false;
                            if (z) {
                            }
                            return Unit.INSTANCE;
                        }
                        if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        z = ((Boolean) obj).booleanValue();
                        if (z) {
                            profilePrivacyPresenter.navigator.goTo(new BlockersScreens.ReadContactsPermissionScreen());
                        }
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    profilePrivacyPresenter$requestContactsPermissions$1.label = 3;
                    obj = modifiablePermissions.shouldShowOverridePrompt(profilePrivacyPresenter$requestContactsPermissions$1);
                } else {
                    SharedFlowImpl sharedFlowImpl = profilePrivacyPresenter.requestedPermissionFlow;
                    Unit unit = Unit.INSTANCE;
                    profilePrivacyPresenter$requestContactsPermissions$1.label = 2;
                }
                return coroutineSingletons;
            }
        }
        profilePrivacyPresenter$requestContactsPermissions$1 = new ProfilePrivacyPresenter$requestContactsPermissions$1(profilePrivacyPresenter, continuationImpl);
        obj = profilePrivacyPresenter$requestContactsPermissions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = profilePrivacyPresenter$requestContactsPermissions$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return coroutineSingletons2;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x032d  */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        MutableState mutableState;
        boolean z;
        ProfilePrivacyReadyViewModel$BlockedAccountsSectionViewModel profilePrivacyReadyViewModel$BlockedAccountsSectionViewModel;
        String str;
        ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel profilePrivacyReadyViewModel$SearchPrivacySectionViewModel;
        String str2;
        String str3;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1004357379);
        Object rememberedValue = gapComposer.rememberedValue();
        Continuation continuation = null;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState2 = (MutableState) rememberedValue;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new PdfPreviewPresenter$models$1$1(this, mutableState2, continuation, 28);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        int i2 = 11;
        CoroutineContext coroutineContext = this.ioDispatcher;
        if (rememberedValue3 == neverEqualPolicy) {
            CashQrScannerPresenter$special$$inlined$filter$1 cashQrScannerPresenter$special$$inlined$filter$1 = new CashQrScannerPresenter$special$$inlined$filter$1(FlowKt.flowOn(this.profileManager.publicProfile(), coroutineContext), i2);
            gapComposer.updateRememberedValue(cashQrScannerPresenter$special$$inlined$filter$1);
            rememberedValue3 = cashQrScannerPresenter$special$$inlined$filter$1;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue3, null, null, gapComposer, 48, 2);
        Object rememberedValue4 = gapComposer.rememberedValue();
        int i3 = 10;
        int i4 = 12;
        if (rememberedValue4 == neverEqualPolicy) {
            NullStateSwipeConfigProvider nullStateSwipeConfigProvider = new NullStateSwipeConfigProvider(new CashQrScannerPresenter$special$$inlined$filter$1(flow, i4), i3);
            gapComposer.updateRememberedValue(nullStateSwipeConfigProvider);
            rememberedValue4 = nullStateSwipeConfigProvider;
        }
        int i5 = 0;
        ProfilePrivacyReadyViewModel$BlockedAccountsSectionViewModel profilePrivacyReadyViewModel$BlockedAccountsSectionViewModel2 = (ProfilePrivacyReadyViewModel$BlockedAccountsSectionViewModel) this.blockedAccountsSectionPresenter.models((Flow) rememberedValue4, gapComposer, 0);
        Object rememberedValue5 = gapComposer.rememberedValue();
        int i6 = 13;
        if (rememberedValue5 == neverEqualPolicy) {
            NullStateSwipeConfigProvider nullStateSwipeConfigProvider2 = new NullStateSwipeConfigProvider(new CashQrScannerPresenter$special$$inlined$filter$1(flow, i6), i2);
            gapComposer.updateRememberedValue(nullStateSwipeConfigProvider2);
            rememberedValue5 = nullStateSwipeConfigProvider2;
        }
        ProfilePrivacyReadyViewModel$AllowedAccountsSectionViewModel profilePrivacyReadyViewModel$AllowedAccountsSectionViewModel = (ProfilePrivacyReadyViewModel$AllowedAccountsSectionViewModel) this.allowedAccountsSectionPresenter.models((Flow) rememberedValue5, (Composer) gapComposer, 0);
        Object rememberedValue6 = gapComposer.rememberedValue();
        int i7 = 14;
        if (rememberedValue6 == neverEqualPolicy) {
            NullStateSwipeConfigProvider nullStateSwipeConfigProvider3 = new NullStateSwipeConfigProvider(new CashQrScannerPresenter$special$$inlined$filter$1(flow, i7), i4);
            gapComposer.updateRememberedValue(nullStateSwipeConfigProvider3);
            rememberedValue6 = nullStateSwipeConfigProvider3;
        }
        ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel profilePrivacyReadyViewModel$SearchPrivacySectionViewModel2 = (ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel) this.searchPrivacySettingsPresenter.models((Flow) rememberedValue6, (Composer) gapComposer, 0);
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == neverEqualPolicy) {
            NullStateSwipeConfigProvider nullStateSwipeConfigProvider4 = new NullStateSwipeConfigProvider(new CashQrScannerPresenter$special$$inlined$filter$1(flow, 15), i6);
            gapComposer.updateRememberedValue(nullStateSwipeConfigProvider4);
            rememberedValue7 = nullStateSwipeConfigProvider4;
        }
        ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel profilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel = (ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel) this.personalizedAdsSettingsPresenter.models((Flow) rememberedValue7, (Composer) gapComposer, 0);
        Object rememberedValue8 = gapComposer.rememberedValue();
        int i8 = 23;
        long j = EVENT_DEBOUNCE_MS;
        if (rememberedValue8 == neverEqualPolicy) {
            rememberedValue8 = FlowKt.m4195debounceHG0u8IE(new FinishSetupTileBadgeCounter(i8, flow, Reflection.factory.getOrCreateKotlinClass(ProfilePrivacyViewEvent.ToggleContactsSync.class)), j);
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        Flow flow2 = (Flow) rememberedValue8;
        Updater.LaunchedEffect(gapComposer, flow2, new ProfilePrivacyPresenter$models$$inlined$CollectEffect$1(flow2, continuation, this, i5));
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (rememberedValue9 == neverEqualPolicy) {
            rememberedValue9 = FlowKt.m4195debounceHG0u8IE(new FinishSetupTileBadgeCounter(i8, flow, Reflection.factory.getOrCreateKotlinClass(ProfilePrivacyViewEvent.NewPolicy.class)), j);
            gapComposer.updateRememberedValue(rememberedValue9);
        }
        Flow flow3 = (Flow) rememberedValue9;
        Updater.LaunchedEffect(gapComposer, flow3, new PhonePlansHomePresenter$models$1$1(25, mutableState2, (MoleculePresenter) this, (Object) flow3, continuation));
        int i9 = 1;
        Updater.LaunchedEffect(gapComposer, flow, new ProfilePrivacyPresenter$models$$inlined$CollectEffect$1(flow, continuation, this, i9));
        Object rememberedValue10 = gapComposer.rememberedValue();
        int i10 = 2;
        if (rememberedValue10 == neverEqualPolicy) {
            rememberedValue10 = FlowKt.flowOn(FlowKt.mapLatest(new RealSheetState$peek$3.AnonymousClass2(i10, continuation, i9), FlowKt.transformLatest(new CashQrScannerPresenter$special$$inlined$filter$1(flow, 10), new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1(continuation, this, collectAsState, 19))), coroutineContext);
            gapComposer.updateRememberedValue(rememberedValue10);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue10, null, null, gapComposer, 48, 2);
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue11 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue11 == neverEqualPolicy) {
            rememberedValue11 = new ProfileCropView.AnonymousClass3(this, continuation, i10);
            gapComposer.updateRememberedValue(rememberedValue11);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue11);
        boolean changedInstance3 = gapComposer.changedInstance(this);
        Object rememberedValue12 = gapComposer.rememberedValue();
        if (changedInstance3 || rememberedValue12 == neverEqualPolicy) {
            rememberedValue12 = new RingtoneView.AnonymousClass1(this, continuation, 14);
            gapComposer.updateRememberedValue(rememberedValue12);
        }
        MutableState produceState = Updater.produceState(gapComposer, null, (Function2) rememberedValue12);
        Object rememberedValue13 = gapComposer.rememberedValue();
        if (rememberedValue13 == neverEqualPolicy) {
            rememberedValue13 = FlowKt.flowOn(this.readContactsPermissions.granted(), coroutineContext);
            gapComposer.updateRememberedValue(rememberedValue13);
        }
        MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue13, null, null, gapComposer, 48, 2);
        if (((AccountSettingType$SecuritySettings) produceState.getValue()) == null || ((PublicProfile) collectAsState.getValue()) == null || ((ProfilePrivacyReadyViewModel$ProfileSecurityPolicy) mutableState2.getValue()) == null) {
            gapComposer.end(false);
            return ProfilePrivacyViewModel.Loading.INSTANCE;
        }
        AccountSettingType$SecuritySettings accountSettingType$SecuritySettings = (AccountSettingType$SecuritySettings) produceState.getValue();
        if (accountSettingType$SecuritySettings == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return null;
        }
        Map map = accountSettingType$SecuritySettings.cache;
        PublicProfile publicProfile = (PublicProfile) collectAsState.getValue();
        if (publicProfile == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return null;
        }
        FullCashtag fullCashtag = publicProfile.fullCashtag;
        ProfilePrivacyReadyViewModel$ProfileSecurityPolicy profilePrivacyReadyViewModel$ProfileSecurityPolicy = (ProfilePrivacyReadyViewModel$ProfileSecurityPolicy) mutableState2.getValue();
        if (profilePrivacyReadyViewModel$ProfileSecurityPolicy == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return null;
        }
        if (map.get(AccountSettingType$SecuritySettings.SecuritySubSetting.REQUESTS_INCOMING_REQUESTS) != null) {
            mutableState = collectAsState2;
            z = true;
        } else {
            mutableState = collectAsState2;
            z = false;
        }
        boolean areEqual = Intrinsics.areEqual((Boolean) collectAsState3.getValue(), Boolean.TRUE);
        LaunchDarklyFeatureFlags$SponsorDrivenBlockingPhase_3 launchDarklyFeatureFlags$SponsorDrivenBlockingPhase_3 = LaunchDarklyFeatureFlags$SponsorDrivenBlockingPhase_3.INSTANCE;
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) this.featureFlagManager;
        boolean enabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) realFeatureFlagManager.peekCurrentValue(launchDarklyFeatureFlags$SponsorDrivenBlockingPhase_3)).enabled();
        if (enabled) {
            profilePrivacyReadyViewModel$BlockedAccountsSectionViewModel = profilePrivacyReadyViewModel$BlockedAccountsSectionViewModel2;
        } else {
            if (enabled) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            profilePrivacyReadyViewModel$BlockedAccountsSectionViewModel = null;
        }
        boolean z2 = map.get(AccountSettingType$SecuritySettings.SecuritySubSetting.CASHTAG) != null;
        Object[] objArr = {Cashtags.symbol(fullCashtag != null ? fullCashtag.currency : null)};
        AndroidStringManager androidStringManager = this.stringManager;
        Resources resources = androidStringManager.resources;
        resources.getClass();
        String format2 = new MessageFormat(resources.getString(R.string.profile_section_cashtag)).format(objArr);
        format2.getClass();
        if ((fullCashtag != null ? fullCashtag.cashtag_display_name : null) != null) {
            if ((fullCashtag != null ? fullCashtag.cashtag_url_display_text : null) != null) {
                if (fullCashtag == null || (str3 = fullCashtag.cashtag_url_display_text) == null) {
                    str2 = "";
                } else {
                    StringBuilder sb = new StringBuilder();
                    int length = str3.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        if (i11 > 0) {
                            sb.append("\ufeff");
                        }
                        sb.append(str3.charAt(i11));
                    }
                    str2 = sb.toString();
                }
                str = new MessageFormat(resources.getString(R.string.profile_cash_app_description)).format(new Object[]{str2});
                str.getClass();
                String str4 = str;
                CashMeSettingActiveState cashMeSettingActiveState = (CashMeSettingActiveState) mutableState.getValue();
                boolean z3 = cashMeSettingActiveState == null && cashMeSettingActiveState.isActivated;
                CashMeSettingActiveState cashMeSettingActiveState2 = (CashMeSettingActiveState) mutableState.getValue();
                ProfilePrivacyReadyViewModel$CashMeSettingViewModel profilePrivacyReadyViewModel$CashMeSettingViewModel = new ProfilePrivacyReadyViewModel$CashMeSettingViewModel(format2, str4, cashMeSettingActiveState2 == null ? cashMeSettingActiveState2.isChecked : Intrinsics.areEqual(publicProfile.cashtagUrlEnabled, Boolean.TRUE), z3, z2);
                if (!((FeatureFlag$EnabledDisabledFeatureFlag$Options) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$PersonalizedAdsConsent.INSTANCE)).enabled()) {
                    profilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel = ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel.None.INSTANCE;
                }
                ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel profilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel2 = profilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel;
                profilePrivacyReadyViewModel$SearchPrivacySectionViewModel = map.get(AccountSettingType$SecuritySettings.SecuritySubSetting.SEARCH_PRIVACY) == null ? profilePrivacyReadyViewModel$SearchPrivacySectionViewModel2 : null;
                if (profilePrivacyReadyViewModel$SearchPrivacySectionViewModel == null) {
                    profilePrivacyReadyViewModel$SearchPrivacySectionViewModel = ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel.None.INSTANCE;
                }
                ProfilePrivacyViewModel.Ready ready = new ProfilePrivacyViewModel.Ready(areEqual, profilePrivacyReadyViewModel$BlockedAccountsSectionViewModel, profilePrivacyReadyViewModel$AllowedAccountsSectionViewModel, z, profilePrivacyReadyViewModel$SearchPrivacySectionViewModel, profilePrivacyReadyViewModel$CashMeSettingViewModel, profilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel2, profilePrivacyReadyViewModel$ProfileSecurityPolicy);
                gapComposer.end(false);
                return ready;
            }
        }
        str = androidStringManager.get(R.string.profile_cash_app_description_no_cashtag);
        String str42 = str;
        CashMeSettingActiveState cashMeSettingActiveState3 = (CashMeSettingActiveState) mutableState.getValue();
        if (cashMeSettingActiveState3 == null) {
        }
        CashMeSettingActiveState cashMeSettingActiveState22 = (CashMeSettingActiveState) mutableState.getValue();
        ProfilePrivacyReadyViewModel$CashMeSettingViewModel profilePrivacyReadyViewModel$CashMeSettingViewModel2 = new ProfilePrivacyReadyViewModel$CashMeSettingViewModel(format2, str42, cashMeSettingActiveState22 == null ? cashMeSettingActiveState22.isChecked : Intrinsics.areEqual(publicProfile.cashtagUrlEnabled, Boolean.TRUE), z3, z2);
        if (!((FeatureFlag$EnabledDisabledFeatureFlag$Options) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$PersonalizedAdsConsent.INSTANCE)).enabled()) {
        }
        ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel profilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel22 = profilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel;
        if (map.get(AccountSettingType$SecuritySettings.SecuritySubSetting.SEARCH_PRIVACY) == null) {
        }
        if (profilePrivacyReadyViewModel$SearchPrivacySectionViewModel == null) {
        }
        ProfilePrivacyViewModel.Ready ready2 = new ProfilePrivacyViewModel.Ready(areEqual, profilePrivacyReadyViewModel$BlockedAccountsSectionViewModel, profilePrivacyReadyViewModel$AllowedAccountsSectionViewModel, z, profilePrivacyReadyViewModel$SearchPrivacySectionViewModel, profilePrivacyReadyViewModel$CashMeSettingViewModel2, profilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel22, profilePrivacyReadyViewModel$ProfileSecurityPolicy);
        gapComposer.end(false);
        return ready2;
    }
}
