package com.squareup.cash.account.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.net.Uri;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.text.android.CanvasCompatO;
import app.cash.badging.api.BadgingState;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$scheduleBadgeClearingWork$$inlined$map$1;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.store.real.RealLocalInstalledStore$hideBrands$$inlined$map$1;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import app.cash.redwood.treehouse.EventBridge$sendEvent$1;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.cash.zipline.loader.ZiplineLoader$load$2;
import com.fillr.browsersdk.model.FillrWidget;
import com.google.mlkit.common.internal.zzd;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.R;
import com.squareup.cash.account.navigation.RealAccountOutboundNavigator;
import com.squareup.cash.account.navigation.RealAccountOutboundNavigator$Factory$Impl;
import com.squareup.cash.account.presenters.ProfileUpsellPresenter;
import com.squareup.cash.account.presenters.settings.AccountSettingsCapability;
import com.squareup.cash.account.presenters.settings.AccountSettingsCapabilityProvider;
import com.squareup.cash.account.screens.Account;
import com.squareup.cash.account.settings.backend.AccountSettingsFeatureManager$SettingsDesignMode;
import com.squareup.cash.account.settings.backend.RealProfilePhotoManager;
import com.squareup.cash.account.settings.backend.RealProfilePhotoManager$Factory$Impl;
import com.squareup.cash.account.settings.viewmodels.AccountAvatarViewModel;
import com.squareup.cash.account.settings.viewmodels.AccountCardViewModel;
import com.squareup.cash.account.settings.viewmodels.AccountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel;
import com.squareup.cash.account.settings.viewmodels.AccountFooterViewModel;
import com.squareup.cash.account.settings.viewmodels.AccountInviteButton;
import com.squareup.cash.account.settings.viewmodels.AccountSettingsRow;
import com.squareup.cash.account.settings.viewmodels.AccountSettingsViewModel;
import com.squareup.cash.account.settings.viewmodels.AccountViewModel;
import com.squareup.cash.account.settings.viewmodels.GlobalSettings;
import com.squareup.cash.account.settings.viewmodels.SecurityHubRow;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.banking.Disclosure;
import com.squareup.cash.banking.DisclosureForScreen;
import com.squareup.cash.banking.real.RealDisclosureProvider;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.businessaccount.backend.real.RealBusinessProfileManager;
import com.squareup.cash.cdf.personalprofile.PersonalProfileViewOpenScreen;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.InvitationConfig;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.data.profile.Badge;
import com.squareup.cash.data.profile.ProfilesKt;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.RealProfileSyncer;
import com.squareup.cash.data.profile.RealReferralManager;
import com.squareup.cash.data.profile.ReferralManager$RewardStatus;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$AccountCreationSettings;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$PromotionsAndReferralsSettings;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$SecurityHubSettings;
import com.squareup.cash.eligibility.backend.api.SettingVisibility;
import com.squareup.cash.eligibility.backend.real.InMemoryAccountSettingsCache;
import com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientAccessTrustHub;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobileSurfacesKeypadQrToProfile;
import com.squareup.cash.featureflags.AmplitudeExperiments$QrCodeWidgetTile;
import com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneybot.backend.real.managers.RealChatManager;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.multiplatform.accentcolors.AccentColorsKt;
import com.squareup.cash.paymentpad.viewmodels.PaymentPadTheme;
import com.squareup.cash.payments.backend.api.P2pSettingsManager$P2pSettings;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.qrcodes.QrShortcutInstaller;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter;
import com.squareup.cash.qrcodes.viewmodels.QrCodeArgs;
import com.squareup.cash.qrcodes.viewmodels.QrCodeModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.ui.qrcodes.RealQrShortcutInstaller;
import com.squareup.preferences.BooleanPreference;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.janus.api.GetAccountSettingsResponse;
import com.squareup.protos.cash.janus.syncvalues.FullAccount;
import com.squareup.protos.franklin.common.ProfileRow;
import com.squareup.protos.franklin.ui.FullCashtag;
import com.squareup.util.cash.Cashtags;
import com.squareup.util.cash.ColorsKt;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;

/* loaded from: classes5.dex */
public final class AccountPresenter implements MoleculePresenter {
    public final RealAccountOutboundNavigator accountOutboundNavigator;
    public final AccountSettingsCapabilityProvider accountSettingsCapabilityProvider;
    public final Analytics analytics;
    public final AppConfigManager appConfig;
    public final Account args;
    public final Flow badges;
    public final RealBusinessProfileManager businessProfileManager;
    public final RealDisclosureProvider disclosureProvider;
    public final RealFamilyProfileManager familyProfileManager;
    public final FeatureFlagManager featureFlagManager;
    public final boolean isQrToProfileEnabled;
    public final BooleanPreference linkedBanksViewedPreference;
    public final MoneyFormatter moneyFormatter;
    public final RealP2pSettingsManager p2pSettingsManager;
    public final KeyValue paymentPadThemeSelection;
    public final ParcelableSnapshotMutableState photoUrl;
    public final RealProfileManager profileManager;
    public final RealProfilePhotoManager profilePhotoManager;
    public final RealProfileSyncer profileSyncer;
    public final ProfileUpsellPresenter profileUpsellPresenter;
    public final RealQrCodesPresenter qrCodesPresenter;
    public final QrShortcutInstaller qrShortcutInstaller;
    public final RealReferralManager referralManager;
    public final RealRouter router;
    public final JCAContext settingsFeatureManager;
    public final RealSettingsEligibilityManager settingsManager;
    public final boolean showAddQrToHomeScreenButton;
    public final AndroidStringManager stringManager;
    public final int versionCode;
    public final String versionName;

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final Provider accountOutboundNavigatorFactory;
        public final RealChatManager.MetroFactory accountSettingsCapabilityProvider;
        public final Provider analytics;
        public final Provider appConfig;
        public final Provider badges;
        public final Provider bitcoinCapabilityProvider;
        public final Provider businessProfileManager;
        public final Provider disclosureProvider;
        public final Provider familyProfileManager;
        public final Provider featureFlagManager;
        public final Provider linkedBanksViewedPreference;
        public final Provider moneyFormatterFactory;
        public final Provider p2pSettingsManager;
        public final Provider paymentPadThemeSelection;
        public final Provider profileManager;
        public final Provider profilePhotoManagerFactory;
        public final Provider profileSyncer;
        public final InstanceFactory profileUpsellPresenterFactory;
        public final Provider qrCodesPresenter;
        public final Provider qrShortcutInstaller;
        public final Provider referralManager;
        public final Provider routerFactory;
        public final RealPasscodeFlowStarter.MetroFactory settingsFeatureManager;
        public final Provider settingsManager;
        public final Provider stringManager;
        public final Provider versionCode;
        public final Provider versionName;

        public MetroFactory(Provider provider, Provider provider2, Provider provider3, RealPasscodeFlowStarter.MetroFactory metroFactory, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, InstanceFactory instanceFactory, Provider provider15, Provider provider16, RealChatManager.MetroFactory metroFactory2, Provider provider17, Provider provider18, Provider provider19, Provider provider20, Provider provider21, Provider provider22, Provider provider23, Provider provider24) {
            this.badges = provider;
            this.analytics = provider2;
            this.featureFlagManager = provider3;
            this.settingsFeatureManager = metroFactory;
            this.linkedBanksViewedPreference = provider4;
            this.accountOutboundNavigatorFactory = provider5;
            this.appConfig = provider6;
            this.businessProfileManager = provider7;
            this.profileManager = provider8;
            this.p2pSettingsManager = provider9;
            this.settingsManager = provider10;
            this.stringManager = provider11;
            this.referralManager = provider12;
            this.profileSyncer = provider13;
            this.profilePhotoManagerFactory = provider14;
            this.profileUpsellPresenterFactory = instanceFactory;
            this.versionName = provider15;
            this.versionCode = provider16;
            this.accountSettingsCapabilityProvider = metroFactory2;
            this.bitcoinCapabilityProvider = provider17;
            this.qrCodesPresenter = provider18;
            this.qrShortcutInstaller = provider19;
            this.paymentPadThemeSelection = provider20;
            this.familyProfileManager = provider21;
            this.moneyFormatterFactory = provider22;
            this.disclosureProvider = provider23;
            this.routerFactory = provider24;
        }
    }

    public AccountPresenter(Flow flow, Analytics analytics, FeatureFlagManager featureFlagManager, JCAContext jCAContext, BooleanPreference booleanPreference, RealAccountOutboundNavigator$Factory$Impl realAccountOutboundNavigator$Factory$Impl, AppConfigManager appConfigManager, RealBusinessProfileManager realBusinessProfileManager, RealProfileManager realProfileManager, RealP2pSettingsManager realP2pSettingsManager, RealSettingsEligibilityManager realSettingsEligibilityManager, AndroidStringManager androidStringManager, RealReferralManager realReferralManager, RealProfileSyncer realProfileSyncer, RealProfilePhotoManager$Factory$Impl realProfilePhotoManager$Factory$Impl, ProfileUpsellPresenter$Factory$Impl profileUpsellPresenter$Factory$Impl, String str, int i, AccountSettingsCapabilityProvider accountSettingsCapabilityProvider, RealBitcoinCapabilityProvider realBitcoinCapabilityProvider, RealQrCodesPresenter realQrCodesPresenter, QrShortcutInstaller qrShortcutInstaller, KeyValue keyValue, RealFamilyProfileManager realFamilyProfileManager, Account account, BetterNavigator.ScreenNavigator screenNavigator, LocalizedMoneyFormatter.Factory factory, RealDisclosureProvider realDisclosureProvider, RealRouter$Factory$Impl realRouter$Factory$Impl) {
        account.getClass();
        this.badges = flow;
        this.analytics = analytics;
        this.featureFlagManager = featureFlagManager;
        this.settingsFeatureManager = jCAContext;
        this.linkedBanksViewedPreference = booleanPreference;
        this.appConfig = appConfigManager;
        this.businessProfileManager = realBusinessProfileManager;
        this.profileManager = realProfileManager;
        this.p2pSettingsManager = realP2pSettingsManager;
        this.settingsManager = realSettingsEligibilityManager;
        this.stringManager = androidStringManager;
        this.referralManager = realReferralManager;
        this.profileSyncer = realProfileSyncer;
        this.versionName = str;
        this.versionCode = i;
        this.accountSettingsCapabilityProvider = accountSettingsCapabilityProvider;
        this.qrCodesPresenter = realQrCodesPresenter;
        this.qrShortcutInstaller = qrShortcutInstaller;
        this.paymentPadThemeSelection = keyValue;
        this.familyProfileManager = realFamilyProfileManager;
        this.args = account;
        this.disclosureProvider = realDisclosureProvider;
        this.photoUrl = Updater.mutableStateOf$default(null);
        this.moneyFormatter = factory.createRounded();
        ProfileUpsellPresenter.MetroFactory metroFactory = profileUpsellPresenter$Factory$Impl.delegateFactory;
        Analytics analytics2 = (Analytics) metroFactory.analytics.getValue();
        RealRouter$Factory$Impl realRouter$Factory$Impl2 = (RealRouter$Factory$Impl) metroFactory.routerFactory.invoke();
        SyncValueReader syncValueReader = (SyncValueReader) metroFactory.syncValueReader.getValue();
        analytics2.getClass();
        realRouter$Factory$Impl2.getClass();
        syncValueReader.getClass();
        this.profileUpsellPresenter = new ProfileUpsellPresenter(analytics2, realRouter$Factory$Impl2, syncValueReader, screenNavigator, account);
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        this.accountOutboundNavigator = realAccountOutboundNavigator$Factory$Impl.create$1(screenNavigator);
        this.profilePhotoManager = realProfilePhotoManager$Factory$Impl.create$1(screenNavigator);
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
        this.isQrToProfileEnabled = ((FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$MobileSurfacesKeypadQrToProfile.INSTANCE)).enabled();
        this.showAddQrToHomeScreenButton = ((RealQrShortcutInstaller) qrShortcutInstaller).isWidgetPinSupported() && ((FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$QrCodeWidgetTile.INSTANCE)).enabled();
    }

    public static final void access$maybeLogQrCodeOpen(AccountPresenter accountPresenter, PublicProfile publicProfile) {
        FullCashtag fullCashtag;
        String str = (publicProfile == null || (fullCashtag = publicProfile.fullCashtag) == null) ? null : fullCashtag.cashtag_display_name;
        if (str == null || str.length() == 0) {
            return;
        }
        accountPresenter.logPersonalProfileViewOpenScreen(PersonalProfileViewOpenScreen.PersonalProfileSubScreen.QR_CODE);
    }

    public final void logPersonalProfileViewOpenScreen(PersonalProfileViewOpenScreen.PersonalProfileSubScreen personalProfileSubScreen) {
        this.analytics.track(new PersonalProfileViewOpenScreen(personalProfileSubScreen, null), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x049c, code lost:
    
        if (r6 == null) goto L186;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0351  */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        String str;
        boolean z;
        boolean changed;
        Object rememberedValue;
        AccountInviteButton accountInviteButton;
        Object rememberedValue2;
        boolean changed2;
        Object rememberedValue3;
        boolean changedInstance;
        Object rememberedValue4;
        QrCodeModel qrCodeModel;
        Object rememberedValue5;
        Object rememberedValue6;
        boolean changed3;
        boolean changedInstance2;
        boolean changedInstance3;
        MutableState produceState;
        ProfileRow profileRow;
        boolean z2;
        AccountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel accountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel;
        List list;
        Pair pair;
        GlobalSettings globalSettings;
        String str2;
        AccountSettingsViewModel accountSettingsViewModel;
        InMemoryAccountSettingsCache inMemoryAccountSettingsCache;
        SettingVisibility settingVisibility;
        SettingVisibility settingVisibility2;
        boolean z3;
        AccountSettingType$SecurityHubSettings accountSettingType$SecurityHubSettings;
        CharSequence charSequence;
        boolean z4;
        String str3;
        AccountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel accountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel2;
        Icons icons;
        String str4;
        FullCashtag fullCashtag;
        FullCashtag fullCashtag2;
        String cashtagWithCurrencySymbol;
        AndroidStringManager androidStringManager = this.stringManager;
        Resources resources = androidStringManager.resources;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(116538089);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance4 = gapComposer.changedInstance(this);
        Object rememberedValue7 = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i2 = 0;
        Object obj = rememberedValue7;
        if (changedInstance4 || rememberedValue7 == neverEqualPolicy) {
            AccountPresenter$models$1$1 accountPresenter$models$1$1 = new AccountPresenter$models$1$1(this, false ? 1 : 0, i2);
            gapComposer.updateRememberedValue(accountPresenter$models$1$1);
            obj = accountPresenter$models$1$1;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) obj);
        Object rememberedValue8 = gapComposer.rememberedValue();
        RealProfileManager realProfileManager = this.profileManager;
        Object obj2 = rememberedValue8;
        if (rememberedValue8 == neverEqualPolicy) {
            FlowQuery$mapToList$$inlined$map$1 profile = realProfileManager.profile();
            gapComposer.updateRememberedValue(profile);
            obj2 = profile;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) obj2, null, null, gapComposer, 48, 2);
        Object rememberedValue9 = gapComposer.rememberedValue();
        int i3 = 3;
        if (rememberedValue9 == neverEqualPolicy) {
            FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(realProfileManager.publicProfile(), new EventBridge$sendEvent$1(this, false ? 1 : 0, 29), 3);
            gapComposer.updateRememberedValue(flowKt__MergeKt$flatMapConcat$$inlined$map$1);
            rememberedValue9 = flowKt__MergeKt$flatMapConcat$$inlined$map$1;
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue9, null, null, gapComposer, 48, 2);
        Object rememberedValue10 = gapComposer.rememberedValue();
        Object obj3 = rememberedValue10;
        if (rememberedValue10 == neverEqualPolicy) {
            Flow select = this.p2pSettingsManager.select();
            gapComposer.updateRememberedValue(select);
            obj3 = select;
        }
        MutableState collectAsState3 = Updater.collectAsState((Flow) obj3, null, null, gapComposer, 48, 2);
        Object rememberedValue11 = gapComposer.rememberedValue();
        Object obj4 = rememberedValue11;
        if (rememberedValue11 == neverEqualPolicy) {
            Flow flow2 = this.badges;
            gapComposer.updateRememberedValue(flow2);
            obj4 = flow2;
        }
        MutableState collectAsState4 = Updater.collectAsState((Flow) obj4, new BadgingState(), null, gapComposer, 0, 2);
        PublicProfile publicProfile = (PublicProfile) collectAsState2.getValue();
        if (publicProfile == null || (fullCashtag2 = publicProfile.fullCashtag) == null) {
            str = "";
        } else {
            if (fullCashtag2.cashtag_display_name == null) {
                Object[] objArr = {Cashtags.symbol(fullCashtag2.currency)};
                resources.getClass();
                cashtagWithCurrencySymbol = new MessageFormat(resources.getString(R.string.profile_cashtag_get)).format(objArr);
                cashtagWithCurrencySymbol.getClass();
            } else {
                cashtagWithCurrencySymbol = FillrWidget.WidgetType.AnonymousClass1.cashtagWithCurrencySymbol(fullCashtag2);
                cashtagWithCurrencySymbol.getClass();
            }
            str = cashtagWithCurrencySymbol;
        }
        boolean changedInstance5 = gapComposer.changedInstance(this);
        Object rememberedValue12 = gapComposer.rememberedValue();
        int i4 = 1;
        Object obj5 = rememberedValue12;
        if (changedInstance5 || rememberedValue12 == neverEqualPolicy) {
            AccountPresenter$models$designMode$2$1 accountPresenter$models$designMode$2$1 = new AccountPresenter$models$designMode$2$1(this, false ? 1 : 0, i4);
            gapComposer.updateRememberedValue(accountPresenter$models$designMode$2$1);
            obj5 = accountPresenter$models$designMode$2$1;
        }
        MutableState produceState2 = Updater.produceState(gapComposer, null, (Function2) obj5);
        InMemoryAccountSettingsCache inMemoryAccountSettingsCache2 = (InMemoryAccountSettingsCache) produceState2.getValue();
        AccountSettingType$AccountCreationSettings accountSettingType$AccountCreationSettings = inMemoryAccountSettingsCache2 != null ? inMemoryAccountSettingsCache2.accountCreation : null;
        InMemoryAccountSettingsCache inMemoryAccountSettingsCache3 = (InMemoryAccountSettingsCache) produceState2.getValue();
        AccountSettingType$PromotionsAndReferralsSettings accountSettingType$PromotionsAndReferralsSettings = inMemoryAccountSettingsCache3 != null ? inMemoryAccountSettingsCache3.promotionsAndReferrals : null;
        boolean changedInstance6 = gapComposer.changedInstance(this);
        Object rememberedValue13 = gapComposer.rememberedValue();
        Object obj6 = rememberedValue13;
        if (changedInstance6 || rememberedValue13 == neverEqualPolicy) {
            AccountPresenter$models$1$1 accountPresenter$models$1$12 = new AccountPresenter$models$1$1(this, false ? 1 : 0, i4);
            gapComposer.updateRememberedValue(accountPresenter$models$1$12);
            obj6 = accountPresenter$models$1$12;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) obj6);
        Object rememberedValue14 = gapComposer.rememberedValue();
        Object obj7 = rememberedValue14;
        if (rememberedValue14 == neverEqualPolicy) {
            FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 rewardStatus = this.referralManager.rewardStatus();
            gapComposer.updateRememberedValue(rewardStatus);
            obj7 = rewardStatus;
        }
        AccountSettingType$PromotionsAndReferralsSettings accountSettingType$PromotionsAndReferralsSettings2 = accountSettingType$PromotionsAndReferralsSettings;
        AccountSettingType$AccountCreationSettings accountSettingType$AccountCreationSettings2 = accountSettingType$AccountCreationSettings;
        MutableState collectAsState5 = Updater.collectAsState((Flow) obj7, null, null, gapComposer, 48, 2);
        ReferralManager$RewardStatus referralManager$RewardStatus = (ReferralManager$RewardStatus) collectAsState5.getValue();
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(referralManager$RewardStatus != null ? referralManager$RewardStatus.referral_status_screen : null, gapComposer);
        P2pSettingsManager$P2pSettings p2pSettingsManager$P2pSettings = (P2pSettingsManager$P2pSettings) collectAsState3.getValue();
        boolean isRatePlanBusiness = p2pSettingsManager$P2pSettings != null ? CanvasCompatO.isRatePlanBusiness(p2pSettingsManager$P2pSettings) : false;
        Object rememberedValue15 = gapComposer.rememberedValue();
        if (rememberedValue15 == neverEqualPolicy) {
            RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(this.businessProfileManager.syncValueReader.getSingleValue(AndroidSyncValueSpecs.C4bProfile), 24);
            gapComposer.updateRememberedValue(realBadger2$setup$lambda$0$$inlined$mapNotNull$1);
            rememberedValue15 = realBadger2$setup$lambda$0$$inlined$mapNotNull$1;
        }
        boolean z5 = isRatePlanBusiness;
        Updater.collectAsState((Flow) rememberedValue15, null, null, gapComposer, 48, 2);
        Object rememberedValue16 = gapComposer.rememberedValue();
        Object obj8 = rememberedValue16;
        if (rememberedValue16 == neverEqualPolicy) {
            FinishSetupTileBadgeCounter invitationConfig = ((RealAppConfigManager) this.appConfig).invitationConfig();
            gapComposer.updateRememberedValue(invitationConfig);
            obj8 = invitationConfig;
        }
        MutableState collectAsState6 = Updater.collectAsState((Flow) obj8, null, null, gapComposer, 48, 2);
        if (accountSettingType$PromotionsAndReferralsSettings2 != null) {
            if (accountSettingType$PromotionsAndReferralsSettings2.cache.get(AccountSettingType$PromotionsAndReferralsSettings.PromotionsAndReferralsSubSetting.INVITE_FRIENDS) != null) {
                z = true;
                changed = gapComposer.changed((InvitationConfig) collectAsState6.getValue()) | gapComposer.changed(z5) | gapComposer.changed(z);
                rememberedValue = gapComposer.rememberedValue();
                if (!changed || rememberedValue == neverEqualPolicy) {
                    if (z) {
                        accountInviteButton = AccountInviteButton.Hidden;
                    } else {
                        InvitationConfig invitationConfig2 = (InvitationConfig) collectAsState6.getValue();
                        if (invitationConfig2 != null) {
                            String str5 = invitationConfig2.profile_row_title;
                            if (str5 == null) {
                                str5 = z5 ? androidStringManager.get(R.string.invite_customers_title) : androidStringManager.get(R.string.invite_friends_title);
                            }
                            String str6 = invitationConfig2.profile_row_subtitle;
                            if (str6 == null) {
                                String format2 = this.moneyFormatter.format(invitationConfig2.bounty_amount);
                                format2.getClass();
                                resources.getClass();
                                str6 = new MessageFormat(resources.getString(R.string.invite_subtitle)).format(new Object[]{format2});
                                str6.getClass();
                            }
                            rememberedValue = new AccountInviteButton(str5, str6, invitationConfig2.enabled);
                            gapComposer.updateRememberedValue(rememberedValue);
                        } else {
                            accountInviteButton = AccountInviteButton.Hidden;
                        }
                    }
                    rememberedValue = accountInviteButton;
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                AccountInviteButton accountInviteButton2 = (AccountInviteButton) rememberedValue;
                rememberedValue2 = gapComposer.rememberedValue();
                Object obj9 = rememberedValue2;
                if (rememberedValue2 == neverEqualPolicy) {
                    ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(0);
                    gapComposer.updateRememberedValue(mutableStateOf$default);
                    obj9 = mutableStateOf$default;
                }
                MutableState mutableState = (MutableState) obj9;
                changed2 = gapComposer.changed(((Number) mutableState.getValue()).intValue());
                rememberedValue3 = gapComposer.rememberedValue();
                if (!changed2 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = (((Number) mutableState.getValue()).intValue() >= 3 || ((Number) mutableState.getValue()).intValue() % 3 != 0) ? this.versionName : String.valueOf(this.versionCode);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                String str7 = (String) rememberedValue3;
                PaymentPadTheme valueOf = PaymentPadTheme.valueOf((String) this.paymentPadThemeSelection.blockingGet());
                changedInstance = gapComposer.changedInstance(this);
                Object rememberedValue17 = gapComposer.rememberedValue();
                Object obj10 = rememberedValue17;
                if (!changedInstance || rememberedValue17 == neverEqualPolicy) {
                    AccountPresenter$models$designMode$2$1 accountPresenter$models$designMode$2$12 = new AccountPresenter$models$designMode$2$1(this, false ? 1 : 0, i3);
                    gapComposer.updateRememberedValue(accountPresenter$models$designMode$2$12);
                    obj10 = accountPresenter$models$designMode$2$12;
                }
                MutableState produceState3 = Updater.produceState(gapComposer, valueOf, (Function2) obj10);
                rememberedValue4 = gapComposer.rememberedValue();
                Object obj11 = rememberedValue4;
                if (rememberedValue4 == neverEqualPolicy) {
                    ParcelableSnapshotMutableState mutableStateOf$default2 = Updater.mutableStateOf$default(null);
                    gapComposer.updateRememberedValue(mutableStateOf$default2);
                    obj11 = mutableStateOf$default2;
                }
                MutableState mutableState2 = (MutableState) obj11;
                QrCodeArgs qrCodeArgs = (QrCodeArgs) mutableState2.getValue();
                if (this.isQrToProfileEnabled || qrCodeArgs == null || ((PublicProfile) collectAsState2.getValue()) == null) {
                    gapComposer.startReplaceGroup(1455975971);
                    gapComposer.end(false);
                    qrCodeModel = null;
                } else {
                    gapComposer.startReplaceGroup(1455815577);
                    PublicProfile publicProfile2 = (PublicProfile) collectAsState2.getValue();
                    qrCodeModel = this.qrCodesPresenter.models(qrCodeArgs, (publicProfile2 == null || (fullCashtag = publicProfile2.fullCashtag) == null) ? null : fullCashtag.cashtag_qr_image_url, gapComposer, 0);
                    gapComposer.end(false);
                }
                rememberedValue5 = gapComposer.rememberedValue();
                if (rememberedValue5 == neverEqualPolicy) {
                    RealProfilePhotoManager realProfilePhotoManager = this.profilePhotoManager;
                    RealBadger2$scheduleBadgeClearingWork$$inlined$map$1 realBadger2$scheduleBadgeClearingWork$$inlined$map$1 = new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(new RealLocalInstalledStore$hideBrands$$inlined$map$1(realProfilePhotoManager.activityResults, 27), realProfilePhotoManager, 11);
                    gapComposer.updateRememberedValue(realBadger2$scheduleBadgeClearingWork$$inlined$map$1);
                    rememberedValue5 = realBadger2$scheduleBadgeClearingWork$$inlined$map$1;
                }
                QrCodeModel qrCodeModel2 = qrCodeModel;
                MutableState collectAsState7 = Updater.collectAsState((Flow) rememberedValue5, null, null, gapComposer, 48, 2);
                rememberedValue6 = gapComposer.rememberedValue();
                Object obj12 = rememberedValue6;
                if (rememberedValue6 == neverEqualPolicy) {
                    Flow disclosure = this.disclosureProvider.disclosure(DisclosureForScreen.ACCOUNT_PROFILE, null);
                    gapComposer.updateRememberedValue(disclosure);
                    obj12 = disclosure;
                }
                MutableState collectAsState8 = Updater.collectAsState((Flow) obj12, null, null, gapComposer, 48, 2);
                Uri uri = (Uri) collectAsState7.getValue();
                changed3 = gapComposer.changed(collectAsState7) | gapComposer.changedInstance(this);
                Object rememberedValue18 = gapComposer.rememberedValue();
                Object obj13 = rememberedValue18;
                if (!changed3 || rememberedValue18 == neverEqualPolicy) {
                    EventBridge$sendEvent$1 eventBridge$sendEvent$1 = new EventBridge$sendEvent$1(collectAsState7, this, false ? 1 : 0, 28);
                    gapComposer.updateRememberedValue(eventBridge$sendEvent$1);
                    obj13 = eventBridge$sendEvent$1;
                }
                Updater.LaunchedEffect(gapComposer, uri, (Function2) obj13);
                Updater.LaunchedEffect(gapComposer, flow, new ZiplineLoader$load$2(flow, (Continuation) null, this, mutableState, collectAsState2, rememberUpdatedState, produceState3, mutableState2, 9));
                EmptyList emptyList = EmptyList.INSTANCE;
                changedInstance2 = gapComposer.changedInstance(this);
                Object rememberedValue19 = gapComposer.rememberedValue();
                Object obj14 = rememberedValue19;
                if (!changedInstance2 || rememberedValue19 == neverEqualPolicy) {
                    AccountPresenter$models$designMode$2$1 accountPresenter$models$designMode$2$13 = new AccountPresenter$models$designMode$2$1(this, false ? 1 : 0, 2);
                    gapComposer.updateRememberedValue(accountPresenter$models$designMode$2$13);
                    obj14 = accountPresenter$models$designMode$2$13;
                }
                MutableState produceState4 = Updater.produceState(gapComposer, emptyList, (Function2) obj14);
                changedInstance3 = gapComposer.changedInstance(this);
                Object rememberedValue20 = gapComposer.rememberedValue();
                Object obj15 = rememberedValue20;
                if (!changedInstance3 || rememberedValue20 == neverEqualPolicy) {
                    AccountPresenter$models$designMode$2$1 accountPresenter$models$designMode$2$14 = new AccountPresenter$models$designMode$2$1(this, false ? 1 : 0, 0);
                    gapComposer.updateRememberedValue(accountPresenter$models$designMode$2$14);
                    obj15 = accountPresenter$models$designMode$2$14;
                }
                produceState = Updater.produceState(gapComposer, AccountSettingsFeatureManager$SettingsDesignMode.SingleAccount.INSTANCE, (Function2) obj15);
                PublicProfile publicProfile3 = (PublicProfile) collectAsState2.getValue();
                String str8 = (publicProfile3 != null || (str4 = publicProfile3.fullName) == null) ? "" : str4;
                PublicProfile publicProfile4 = (PublicProfile) collectAsState2.getValue();
                Badge profileBadge = publicProfile4 == null ? ProfilesKt.profileBadge(publicProfile4, z5) : null;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.photoUrl;
                String str9 = (String) parcelableSnapshotMutableState.getValue();
                PublicProfile publicProfile5 = (PublicProfile) collectAsState2.getValue();
                Character monogram = publicProfile5 == null ? FillrWidget.WidgetType.AnonymousClass1.getMonogram(publicProfile5) : null;
                Profile profile2 = (Profile) collectAsState.getValue();
                AccountAvatarViewModel accountAvatarViewModel = new AccountAvatarViewModel(str9, monogram, new ColorModel.Accented(ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(29, null, profile2 == null ? profile2.profile_id : null, null, null, null))), null);
                profileRow = (ProfileRow) rememberUpdatedState.getValue();
                if (profileRow == null) {
                    ReferralManager$RewardStatus referralManager$RewardStatus2 = (ReferralManager$RewardStatus) collectAsState5.getValue();
                    if (referralManager$RewardStatus2 != null) {
                        z2 = true;
                        if (referralManager$RewardStatus2.reward_screen_enabled) {
                            z4 = true;
                            ReferralManager$RewardStatus referralManager$RewardStatus3 = (ReferralManager$RewardStatus) collectAsState5.getValue();
                            boolean z6 = (referralManager$RewardStatus3 == null && referralManager$RewardStatus3.showReferralStatusBadge == z2) ? z2 : false;
                            str3 = profileRow.title;
                            if (str3 == null && z4) {
                                String str10 = profileRow.subtitle;
                                String str11 = str10 == null ? "" : str10;
                                String str12 = profileRow.icon_id;
                                if (str12 != null) {
                                    Icons.Companion.getClass();
                                    icons = zzd.get(str12);
                                }
                                icons = Icons.Gift24;
                                Icons icons2 = icons;
                                String str13 = profileRow.call_to_action;
                                accountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel2 = new AccountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel(str3, str11, icons2, str13 == null ? "" : str13, z6);
                            } else {
                                accountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel2 = null;
                            }
                            accountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel = accountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel2;
                        }
                    } else {
                        z2 = true;
                    }
                    z4 = false;
                    ReferralManager$RewardStatus referralManager$RewardStatus32 = (ReferralManager$RewardStatus) collectAsState5.getValue();
                    if (referralManager$RewardStatus32 == null) {
                    }
                    str3 = profileRow.title;
                    if (str3 == null) {
                    }
                    accountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel2 = null;
                    accountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel = accountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel2;
                } else {
                    z2 = true;
                    accountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel = null;
                }
                AccountCardViewModel accountCardViewModel = new AccountCardViewModel(str8, str, profileBadge, accountAvatarViewModel, (((Profile) collectAsState.getValue()) == null && ((charSequence = (CharSequence) parcelableSnapshotMutableState.getValue()) == null || charSequence.length() == 0)) ? z2 : false, this.profileUpsellPresenter.models(gapComposer), accountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel, this.showAddQrToHomeScreenButton);
                list = (List) produceState4.getValue();
                if (!(((AccountSettingsFeatureManager$SettingsDesignMode) produceState.getValue()) instanceof AccountSettingsFeatureManager$SettingsDesignMode.MultiAccount)) {
                    str = null;
                }
                BadgingState badgingState = (BadgingState) collectAsState4.getValue();
                AccountSettingsFeatureManager$SettingsDesignMode accountSettingsFeatureManager$SettingsDesignMode = (AccountSettingsFeatureManager$SettingsDesignMode) produceState.getValue();
                if (list.isEmpty()) {
                    gapComposer.startReplaceGroup(-576831055);
                    boolean z7 = accountSettingsFeatureManager$SettingsDesignMode instanceof AccountSettingsFeatureManager$SettingsDesignMode.MultiAccount;
                    if (z7) {
                        gapComposer.startReplaceGroup(-576767598);
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((AccountSettingsCapability) it.next()).getRow(badgingState, gapComposer));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            if (((AccountSettingsRow) next) instanceof AccountSettingsRow.GlobalSetting) {
                                arrayList3.add(next);
                            } else {
                                arrayList2.add(next);
                            }
                        }
                        pair = new Pair(arrayList2, arrayList3);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-576656711);
                        List list3 = list;
                        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                        Iterator it3 = list3.iterator();
                        while (it3.hasNext()) {
                            arrayList4.add(((AccountSettingsCapability) it3.next()).getRow(badgingState, gapComposer));
                        }
                        Pair pair2 = new Pair(arrayList4, EmptyList.INSTANCE);
                        gapComposer.end(false);
                        pair = pair2;
                    }
                    List list4 = (List) pair.first;
                    List list5 = (List) pair.second;
                    if (!z7 || list5.isEmpty()) {
                        globalSettings = null;
                    } else {
                        String str14 = androidStringManager.get(R.string.account_global_settings_title);
                        List list6 = ((AccountSettingsFeatureManager$SettingsDesignMode.MultiAccount) accountSettingsFeatureManager$SettingsDesignMode).accounts;
                        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                        Iterator it4 = list6.iterator();
                        while (it4.hasNext()) {
                            arrayList5.add(((FullAccount) it4.next()).cash_tag);
                        }
                        Object[] objArr2 = {CollectionsKt.joinToString$default(arrayList5, ", ", null, null, 0, null, null, 62)};
                        resources.getClass();
                        String format3 = new MessageFormat(resources.getString(R.string.account_global_settings_subtitle)).format(objArr2);
                        format3.getClass();
                        globalSettings = new GlobalSettings(str14, format3, list5);
                    }
                    if (str != null) {
                        resources.getClass();
                        str2 = new MessageFormat(resources.getString(R.string.account_settings_title_multi_account_arcade)).format(new Object[]{str});
                        str2.getClass();
                    } else {
                        str2 = androidStringManager.get(R.string.account_settings_title_arcade);
                    }
                    AccountSettingsViewModel content = new AccountSettingsViewModel.Content(str2, list4, globalSettings);
                    gapComposer.end(false);
                    accountSettingsViewModel = content;
                } else {
                    gapComposer.startReplaceGroup(-576919281);
                    gapComposer.end(false);
                    accountSettingsViewModel = AccountSettingsViewModel.Loading.INSTANCE;
                }
                inMemoryAccountSettingsCache = (InMemoryAccountSettingsCache) produceState2.getValue();
                if (inMemoryAccountSettingsCache != null || (accountSettingType$SecurityHubSettings = inMemoryAccountSettingsCache.securityHub) == null) {
                    settingVisibility = SettingVisibility.HIDDEN;
                } else {
                    GetAccountSettingsResponse.SettingCollection.Setting setting = (GetAccountSettingsResponse.SettingCollection.Setting) accountSettingType$SecurityHubSettings.cache.get(AccountSettingType$SecurityHubSettings.SecurityHubSubSetting.VIEW_SECURITY_HUB);
                    Boolean bool = setting != null ? setting.editable : null;
                    settingVisibility = Intrinsics.areEqual(bool, Boolean.FALSE) ? SettingVisibility.DISABLED : Intrinsics.areEqual(bool, Boolean.TRUE) ? SettingVisibility.VISIBLE : SettingVisibility.HIDDEN;
                }
                settingVisibility2 = SettingVisibility.HIDDEN;
                if (settingVisibility != settingVisibility2) {
                    if (((FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) ((RealFeatureFlagManager) this.featureFlagManager).currentValue(AmplitudeExperiments$ClientAccessTrustHub.INSTANCE)).enabled()) {
                        z3 = z2;
                        SecurityHubRow securityHubRow = new SecurityHubRow(z3);
                        SettingVisibility settingsState = accountSettingType$AccountCreationSettings2 != null ? accountSettingType$AccountCreationSettings2.getSettingsState(AccountSettingType$AccountCreationSettings.AccountCreationSubSetting.CREATE_BUSINESS_ACCOUNT) : settingVisibility2;
                        if (accountSettingType$AccountCreationSettings2 != null) {
                            settingVisibility2 = accountSettingType$AccountCreationSettings2.getSettingsState(AccountSettingType$AccountCreationSettings.AccountCreationSubSetting.CREATE_PERSONAL_ACCOUNT);
                        }
                        SettingVisibility settingVisibility3 = settingVisibility2;
                        Disclosure disclosure2 = (Disclosure) collectAsState8.getValue();
                        String str15 = disclosure2 != null ? disclosure2.text : null;
                        Disclosure disclosure3 = (Disclosure) collectAsState8.getValue();
                        AccountViewModel accountViewModel = new AccountViewModel(accountCardViewModel, accountSettingsViewModel, accountInviteButton2, securityHubRow, new AccountFooterViewModel(str7, settingsState, settingVisibility3, str15, disclosure3 != null ? disclosure3.showIcon : false), qrCodeModel2 != null ? qrCodeModel2.qrImage : null, this.isQrToProfileEnabled, (qrCodeModel2 != null ? qrCodeModel2.errorMessage : null) != null ? z2 : false);
                        gapComposer.end(false);
                        return accountViewModel;
                    }
                }
                z3 = false;
                SecurityHubRow securityHubRow2 = new SecurityHubRow(z3);
                if (accountSettingType$AccountCreationSettings2 != null) {
                }
                if (accountSettingType$AccountCreationSettings2 != null) {
                }
                SettingVisibility settingVisibility32 = settingVisibility2;
                Disclosure disclosure22 = (Disclosure) collectAsState8.getValue();
                if (disclosure22 != null) {
                }
                Disclosure disclosure32 = (Disclosure) collectAsState8.getValue();
                AccountViewModel accountViewModel2 = new AccountViewModel(accountCardViewModel, accountSettingsViewModel, accountInviteButton2, securityHubRow2, new AccountFooterViewModel(str7, settingsState, settingVisibility32, str15, disclosure32 != null ? disclosure32.showIcon : false), qrCodeModel2 != null ? qrCodeModel2.qrImage : null, this.isQrToProfileEnabled, (qrCodeModel2 != null ? qrCodeModel2.errorMessage : null) != null ? z2 : false);
                gapComposer.end(false);
                return accountViewModel2;
            }
        }
        z = false;
        changed = gapComposer.changed((InvitationConfig) collectAsState6.getValue()) | gapComposer.changed(z5) | gapComposer.changed(z);
        rememberedValue = gapComposer.rememberedValue();
        if (!changed) {
        }
        if (z) {
        }
        rememberedValue = accountInviteButton;
        gapComposer.updateRememberedValue(rememberedValue);
        AccountInviteButton accountInviteButton22 = (AccountInviteButton) rememberedValue;
        rememberedValue2 = gapComposer.rememberedValue();
        Object obj92 = rememberedValue2;
        if (rememberedValue2 == neverEqualPolicy) {
        }
        MutableState mutableState3 = (MutableState) obj92;
        changed2 = gapComposer.changed(((Number) mutableState3.getValue()).intValue());
        rememberedValue3 = gapComposer.rememberedValue();
        if (!changed2) {
        }
        rememberedValue3 = (((Number) mutableState3.getValue()).intValue() >= 3 || ((Number) mutableState3.getValue()).intValue() % 3 != 0) ? this.versionName : String.valueOf(this.versionCode);
        gapComposer.updateRememberedValue(rememberedValue3);
        String str72 = (String) rememberedValue3;
        PaymentPadTheme valueOf2 = PaymentPadTheme.valueOf((String) this.paymentPadThemeSelection.blockingGet());
        changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue172 = gapComposer.rememberedValue();
        Object obj102 = rememberedValue172;
        if (!changedInstance) {
        }
        AccountPresenter$models$designMode$2$1 accountPresenter$models$designMode$2$122 = new AccountPresenter$models$designMode$2$1(this, false ? 1 : 0, i3);
        gapComposer.updateRememberedValue(accountPresenter$models$designMode$2$122);
        obj102 = accountPresenter$models$designMode$2$122;
        MutableState produceState32 = Updater.produceState(gapComposer, valueOf2, (Function2) obj102);
        rememberedValue4 = gapComposer.rememberedValue();
        Object obj112 = rememberedValue4;
        if (rememberedValue4 == neverEqualPolicy) {
        }
        MutableState mutableState22 = (MutableState) obj112;
        QrCodeArgs qrCodeArgs2 = (QrCodeArgs) mutableState22.getValue();
        if (this.isQrToProfileEnabled) {
        }
        gapComposer.startReplaceGroup(1455975971);
        gapComposer.end(false);
        qrCodeModel = null;
        rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
        }
        QrCodeModel qrCodeModel22 = qrCodeModel;
        MutableState collectAsState72 = Updater.collectAsState((Flow) rememberedValue5, null, null, gapComposer, 48, 2);
        rememberedValue6 = gapComposer.rememberedValue();
        Object obj122 = rememberedValue6;
        if (rememberedValue6 == neverEqualPolicy) {
        }
        MutableState collectAsState82 = Updater.collectAsState((Flow) obj122, null, null, gapComposer, 48, 2);
        Uri uri2 = (Uri) collectAsState72.getValue();
        changed3 = gapComposer.changed(collectAsState72) | gapComposer.changedInstance(this);
        Object rememberedValue182 = gapComposer.rememberedValue();
        Object obj132 = rememberedValue182;
        if (!changed3) {
        }
        EventBridge$sendEvent$1 eventBridge$sendEvent$12 = new EventBridge$sendEvent$1(collectAsState72, this, false ? 1 : 0, 28);
        gapComposer.updateRememberedValue(eventBridge$sendEvent$12);
        obj132 = eventBridge$sendEvent$12;
        Updater.LaunchedEffect(gapComposer, uri2, (Function2) obj132);
        Updater.LaunchedEffect(gapComposer, flow, new ZiplineLoader$load$2(flow, (Continuation) null, this, mutableState3, collectAsState2, rememberUpdatedState, produceState32, mutableState22, 9));
        EmptyList emptyList2 = EmptyList.INSTANCE;
        changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue192 = gapComposer.rememberedValue();
        Object obj142 = rememberedValue192;
        if (!changedInstance2) {
        }
        AccountPresenter$models$designMode$2$1 accountPresenter$models$designMode$2$132 = new AccountPresenter$models$designMode$2$1(this, false ? 1 : 0, 2);
        gapComposer.updateRememberedValue(accountPresenter$models$designMode$2$132);
        obj142 = accountPresenter$models$designMode$2$132;
        MutableState produceState42 = Updater.produceState(gapComposer, emptyList2, (Function2) obj142);
        changedInstance3 = gapComposer.changedInstance(this);
        Object rememberedValue202 = gapComposer.rememberedValue();
        Object obj152 = rememberedValue202;
        if (!changedInstance3) {
        }
        AccountPresenter$models$designMode$2$1 accountPresenter$models$designMode$2$142 = new AccountPresenter$models$designMode$2$1(this, false ? 1 : 0, 0);
        gapComposer.updateRememberedValue(accountPresenter$models$designMode$2$142);
        obj152 = accountPresenter$models$designMode$2$142;
        produceState = Updater.produceState(gapComposer, AccountSettingsFeatureManager$SettingsDesignMode.SingleAccount.INSTANCE, (Function2) obj152);
        PublicProfile publicProfile32 = (PublicProfile) collectAsState2.getValue();
        if (publicProfile32 != null) {
        }
        PublicProfile publicProfile42 = (PublicProfile) collectAsState2.getValue();
        if (publicProfile42 == null) {
        }
        ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = this.photoUrl;
        String str92 = (String) parcelableSnapshotMutableState2.getValue();
        PublicProfile publicProfile52 = (PublicProfile) collectAsState2.getValue();
        if (publicProfile52 == null) {
        }
        Profile profile22 = (Profile) collectAsState.getValue();
        AccountAvatarViewModel accountAvatarViewModel2 = new AccountAvatarViewModel(str92, monogram, new ColorModel.Accented(ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(29, null, profile22 == null ? profile22.profile_id : null, null, null, null))), null);
        profileRow = (ProfileRow) rememberUpdatedState.getValue();
        if (profileRow == null) {
        }
        AccountCardViewModel accountCardViewModel2 = new AccountCardViewModel(str8, str, profileBadge, accountAvatarViewModel2, (((Profile) collectAsState.getValue()) == null && ((charSequence = (CharSequence) parcelableSnapshotMutableState2.getValue()) == null || charSequence.length() == 0)) ? z2 : false, this.profileUpsellPresenter.models(gapComposer), accountCardViewModel$AccountCardBusinessModel$ProfileRowViewModel, this.showAddQrToHomeScreenButton);
        list = (List) produceState42.getValue();
        if (!(((AccountSettingsFeatureManager$SettingsDesignMode) produceState.getValue()) instanceof AccountSettingsFeatureManager$SettingsDesignMode.MultiAccount)) {
        }
        BadgingState badgingState2 = (BadgingState) collectAsState4.getValue();
        AccountSettingsFeatureManager$SettingsDesignMode accountSettingsFeatureManager$SettingsDesignMode2 = (AccountSettingsFeatureManager$SettingsDesignMode) produceState.getValue();
        if (list.isEmpty()) {
        }
        inMemoryAccountSettingsCache = (InMemoryAccountSettingsCache) produceState2.getValue();
        if (inMemoryAccountSettingsCache != null) {
        }
        settingVisibility = SettingVisibility.HIDDEN;
        settingVisibility2 = SettingVisibility.HIDDEN;
        if (settingVisibility != settingVisibility2) {
        }
        z3 = false;
        SecurityHubRow securityHubRow22 = new SecurityHubRow(z3);
        if (accountSettingType$AccountCreationSettings2 != null) {
        }
        if (accountSettingType$AccountCreationSettings2 != null) {
        }
        SettingVisibility settingVisibility322 = settingVisibility2;
        Disclosure disclosure222 = (Disclosure) collectAsState82.getValue();
        if (disclosure222 != null) {
        }
        Disclosure disclosure322 = (Disclosure) collectAsState82.getValue();
        AccountViewModel accountViewModel22 = new AccountViewModel(accountCardViewModel2, accountSettingsViewModel, accountInviteButton22, securityHubRow22, new AccountFooterViewModel(str72, settingsState, settingVisibility322, str15, disclosure322 != null ? disclosure322.showIcon : false), qrCodeModel22 != null ? qrCodeModel22.qrImage : null, this.isQrToProfileEnabled, (qrCodeModel22 != null ? qrCodeModel22.errorMessage : null) != null ? z2 : false);
        gapComposer.end(false);
        return accountViewModel22;
    }
}
