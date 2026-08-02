package com.squareup.cash.money.presenters;

import androidx.camera.camera2.impl.FlashControl$applyScreenFlash$3;
import androidx.camera.camera2.pipe.AeMode;
import androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.RoomDatabase$performClear$1;
import androidx.tracing.Trace;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.RenavigationKt;
import app.cash.broadway.presenter.molecule.SwipeKt;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.zipline.loader.ZiplineLoader$load$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.fillr.e0;
import com.google.mlkit.vision.text.internal.zzr;
import com.google.mlkit.vision.text.zzb;
import com.squareup.cash.appmessages.overlay.RealOverlayAppMessageReader;
import com.squareup.cash.banking.sections.RealMoreWaysToAddMoneySectionPresenter$Factory$Impl;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.card.onboarding.CardModelView$textures$$inlined$combine$1;
import com.squareup.cash.card.onboarding.PdpNotifiedPreference$$ExternalSyntheticLambda0;
import com.squareup.cash.cdf.account.AccountConfigureGrantContactPermissions;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.common.viewmodels.NextAvailableCashTag;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.family.navigation.RealFamilyNavigator$Factory$Impl;
import com.squareup.cash.family.navigation.RealFamilyNavigator$MetroFactory;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$InstalledAppletRedesign;
import com.squareup.cash.featureflags.AmplitudeExperiments$ProjectMintHypeAnimations;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlag$StringAmplitudeExperiment;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.InternalArcadeFlagsManager$MetroFactory;
import com.squareup.cash.featureflags.JsonFeatureFlags$MintHypeDrop;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$ScrollPerfLogging;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.gcl.RealGlobalConfigManager;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1;
import com.squareup.cash.invitations.InviteErrorPresenter$models$1$1;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.localization.RealLocaleAssetProvider$MetroFactory;
import com.squareup.cash.marketing.components.TooltipBoxKt$$ExternalSyntheticLambda2;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.analytics.RealMoneyAnalyticsContext;
import com.squareup.cash.money.analytics.RealMoneyAnalyticsService;
import com.squareup.cash.money.applets.sections.AppletTileSectionProvider;
import com.squareup.cash.money.applets.sections.AppletTileUninstalledRowVariantProvider;
import com.squareup.cash.money.applets.sections.RealAppletTileServerRecommendationProvider;
import com.squareup.cash.money.applets.sections.RealMoneyContentSpanTrackingService;
import com.squareup.cash.money.banners.presenters.BannerSectionProvider;
import com.squareup.cash.money.banners.presenters.KybBannerPresenter$Factory$Impl;
import com.squareup.cash.money.core.ids.ItemId;
import com.squareup.cash.money.core.ids.SectionId;
import com.squareup.cash.money.disclosure.DisclosureRepository;
import com.squareup.cash.money.disclosure.DisclosureSectionProvider;
import com.squareup.cash.money.disclosure.DisclosureSectionProvider$Factory$Impl;
import com.squareup.cash.money.privacy.RealBalancePrivacy;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.money.viewmodels.MoneyTabModel;
import com.squareup.cash.money.viewmodels.api.Item;
import com.squareup.cash.money.viewmodels.api.MoneySectionSorter;
import com.squareup.cash.money.viewmodels.api.Section;
import com.squareup.cash.money.viewmodels.api.SectionAvailabilityState;
import com.squareup.cash.money.viewmodels.api.SectionProvider;
import com.squareup.cash.money.viewmodels.api.ViewModel;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda13;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda6;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda9;
import com.squareup.cash.moneybot.genie.GenieViewKt$GenieView$1$1;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.observability.backend.api.SpanTracking;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.profile.presenters.ProfilePrivacyPresenter;
import com.squareup.cash.profile.presenters.ProfilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$2$2$1;
import com.squareup.cash.profile.presenters.ProfileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$2$2$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.views.RetroUiFactory;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter$Factory$Impl;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.ui.overlays.presenter.RealAlertBannerPresenter;
import com.squareup.cash.ui.overlays.presenter.RealAlertBannerPresenter$Factory$Impl;
import com.squareup.cash.ui.overlays.viewmodels.AlertBannerScreen;
import com.squareup.cash.ui.overlays.viewmodels.AlertBannerViewModel;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.wallet.data.RealIssuedCardManager;
import com.squareup.cash.wallet.presenters.CardAppletTileRepository;
import com.squareup.cash.wallet.presenters.RealCardAppletTileRepository;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$8$1;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda21;
import com.squareup.cash.work.presenters.WorkReviewTermsBanner$Config;
import com.squareup.cash.work.presenters.WorkReviewTermsBanner$configFlow$$inlined$map$1;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.unicorn.service.UnicornService;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.util.compose.LifecycleKt;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.StateFlowKt$stateFlowOf$1;
import com.squareup.wire.internal.GrpcDecoderKt;
import com.stripe.android.stripe3ds2.utils.ObjectUtils;
import dev.zacsweers.metro.Provider;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlin.time.Instant;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.EmptyFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class MoneyTabPresenter implements MoleculePresenter {
    public final RealAlertBannerPresenter alertBannerPresenter;
    public final Analytics analytics;
    public final UnicornService appService;
    public final MoneyTabScreen args;
    public final CardAppletTileRepository cardAppletTileRepository;
    public final AndroidClock clock;
    public final CoroutineContext computationDispatcher;
    public final RealFamilyProfileManager familyProfileManager;
    public final FeatureFlagManager featureFlagManager;
    public final FlowStarter flowStarter;
    public final HypeDismissedPreference hypeDismissedPreference;
    public final HypeEligibilityProvider hypeEligibilityProvider;
    public final Lazy isCardAnimationEnabled$delegate;
    public final IssuedCardManager issuedCardManager;
    public final StateFlowImpl missingSectionProviderIds;
    public final RealMoneyAnalyticsContext moneyAnalyticsContentCache;
    public final MoneyAnalyticsService moneyAnalyticsService;
    public final RealMoneyContentSpanTrackingService moneyContentSpanTrackingService;
    public final e0 moneyProfileManager;
    public final MoneyTabLoadedStateHolder moneyTabLoadedStateHolder;
    public final MoneyTabToolbarConfig moneyTabToolbarConfig;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealObservabilityManager observabilityManager;
    public final RealOverlayAppMessageReader overlayAppMessageReader;
    public final SessionManager sessionManager;
    public final AndroidStringManager stringManager;
    public final SyncValueReader syncValueReader;
    public final TabToolbarPresenter tabToolbarPresenter;
    public final SharedFlowImpl toolbarEvents;

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final Provider alertBannerPresenterFactory;
        public final Provider analytics;
        public final Provider appService;
        public final Provider cardAppletTileRepository;
        public final Provider clock;
        public final Provider computationDispatcher;
        public final Provider familyProfileManager;
        public final Provider featureFlagManager;
        public final Provider flowStarter;
        public final Provider hypeDismissedPreference;
        public final Provider hypeEligibilityProvider;
        public final Provider issuedCardManager;
        public final Provider moneyAnalyticsContentCache;
        public final Provider moneyAnalyticsService;
        public final Provider moneyContentSpanTrackingService;
        public final RealBrazeManager.MetroFactory moneyProfileManager;
        public final Provider moneyTabLoadedStateHolder;
        public final RealLocaleAssetProvider$MetroFactory moneyTabToolbarConfig;
        public final Provider observabilityManager;
        public final Provider overlayAppMessageReader;
        public final Provider sessionManager;
        public final Provider stringManager;
        public final Provider syncValueReader;
        public final Provider tabToolbarPresenterFactory;

        public MetroFactory(Provider provider, RealBrazeManager.MetroFactory metroFactory, RealLocaleAssetProvider$MetroFactory realLocaleAssetProvider$MetroFactory, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, Provider provider21, Provider provider22) {
            this.tabToolbarPresenterFactory = provider;
            this.moneyProfileManager = metroFactory;
            this.moneyTabToolbarConfig = realLocaleAssetProvider$MetroFactory;
            this.appService = provider2;
            this.issuedCardManager = provider3;
            this.moneyAnalyticsService = provider4;
            this.moneyAnalyticsContentCache = provider5;
            this.moneyContentSpanTrackingService = provider6;
            this.observabilityManager = provider7;
            this.clock = provider8;
            this.overlayAppMessageReader = provider9;
            this.featureFlagManager = provider10;
            this.familyProfileManager = provider11;
            this.moneyTabLoadedStateHolder = provider12;
            this.alertBannerPresenterFactory = provider13;
            this.cardAppletTileRepository = provider14;
            this.hypeDismissedPreference = provider15;
            this.hypeEligibilityProvider = provider16;
            this.flowStarter = provider17;
            this.stringManager = provider18;
            this.syncValueReader = provider19;
            this.analytics = provider20;
            this.sessionManager = provider21;
            this.computationDispatcher = provider22;
        }
    }

    public MoneyTabPresenter(TabToolbarPresenter$Factory$Impl tabToolbarPresenter$Factory$Impl, e0 e0Var, MoneyTabToolbarConfig moneyTabToolbarConfig, UnicornService unicornService, IssuedCardManager issuedCardManager, MoneyAnalyticsService moneyAnalyticsService, RealMoneyAnalyticsContext realMoneyAnalyticsContext, RealMoneyContentSpanTrackingService realMoneyContentSpanTrackingService, RealObservabilityManager realObservabilityManager, AndroidClock androidClock, RealOverlayAppMessageReader realOverlayAppMessageReader, FeatureFlagManager featureFlagManager, RealFamilyProfileManager realFamilyProfileManager, MoneyTabLoadedStateHolder moneyTabLoadedStateHolder, RealAlertBannerPresenter$Factory$Impl realAlertBannerPresenter$Factory$Impl, CardAppletTileRepository cardAppletTileRepository, HypeDismissedPreference hypeDismissedPreference, HypeEligibilityProvider hypeEligibilityProvider, FlowStarter flowStarter, AndroidStringManager androidStringManager, SyncValueReader syncValueReader, Analytics analytics, SessionManager sessionManager, CoroutineContext coroutineContext, MoneyTabScreen moneyTabScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        moneyTabScreen.getClass();
        this.moneyProfileManager = e0Var;
        this.moneyTabToolbarConfig = moneyTabToolbarConfig;
        this.appService = unicornService;
        this.issuedCardManager = issuedCardManager;
        this.moneyAnalyticsService = moneyAnalyticsService;
        this.moneyAnalyticsContentCache = realMoneyAnalyticsContext;
        this.moneyContentSpanTrackingService = realMoneyContentSpanTrackingService;
        this.observabilityManager = realObservabilityManager;
        this.clock = androidClock;
        this.overlayAppMessageReader = realOverlayAppMessageReader;
        this.featureFlagManager = featureFlagManager;
        this.familyProfileManager = realFamilyProfileManager;
        this.moneyTabLoadedStateHolder = moneyTabLoadedStateHolder;
        this.cardAppletTileRepository = cardAppletTileRepository;
        this.hypeDismissedPreference = hypeDismissedPreference;
        this.hypeEligibilityProvider = hypeEligibilityProvider;
        this.flowStarter = flowStarter;
        this.stringManager = androidStringManager;
        this.syncValueReader = syncValueReader;
        this.analytics = analytics;
        this.sessionManager = sessionManager;
        this.computationDispatcher = coroutineContext;
        this.args = moneyTabScreen;
        this.navigator = screenNavigator;
        this.tabToolbarPresenter = tabToolbarPresenter$Factory$Impl.create(screenNavigator, moneyTabScreen);
        this.alertBannerPresenter = realAlertBannerPresenter$Factory$Impl.create$1(screenNavigator, AlertBannerScreen.MONEY_TAB);
        this.toolbarEvents = FlowKt.MutableSharedFlow$default(0, 0, null, 7);
        this.missingSectionProviderIds = FlowKt.MutableStateFlow(CollectionsKt.toMutableSet((LinkedHashSet) e0Var.h));
        this.isCardAnimationEnabled$delegate = LazyKt.lazy(new MoneyTabUIKt$$ExternalSyntheticLambda5(this, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0740 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0794 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x083a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0871 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x08ee  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0964  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x09a0  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x09c4  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x09f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0a03 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0aa5  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0acc  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0aef  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0af6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0aff  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0b09  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0b2f  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0b32  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0af2  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0aea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0886 A[LOOP:9: B:298:0x0884->B:299:0x0886, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x084c A[LOOP:10: B:303:0x084a->B:304:0x084c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0557  */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        BetterNavigator.ScreenNavigator screenNavigator;
        TabToolbarInternalViewModel tabToolbarInternalViewModel;
        int i2;
        boolean z;
        Object rememberedValue;
        boolean z2;
        Object rememberedValue2;
        boolean changedInstance;
        Object rememberedValue3;
        Object rememberedValue4;
        MutableState mutableState;
        Object rememberedValue5;
        boolean changedInstance2;
        Object rememberedValue6;
        Boolean bool;
        boolean changed;
        Object rememberedValue7;
        Boolean bool2;
        GapComposer gapComposer;
        boolean z3;
        MoneyTabPresenter moneyTabPresenter;
        ArrayList arrayList;
        Object rememberedValue8;
        boolean changedInstance3;
        Object rememberedValue9;
        Object rememberedValue10;
        ArrayList arrayList2;
        AlertBannerViewModel alertBannerViewModel;
        AlertBannerViewModel alertBannerViewModel2;
        Object rememberedValue11;
        Object rememberedValue12;
        GapComposer gapComposer2;
        MutableState collectAsState;
        String str;
        Object obj;
        boolean changed2;
        Object rememberedValue13;
        NextAvailableCashTag nextAvailableCashTag;
        Object rememberedValue14;
        Object rememberedValue15;
        Object rememberedValue16;
        boolean changed3;
        Object rememberedValue17;
        int size;
        int i3;
        List list;
        boolean changed4;
        int size2;
        int i4;
        MutableState collectAsState2;
        Object rememberedValue18;
        MoneyTabLoadedStateHolder moneyTabLoadedStateHolder;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState;
        List list2;
        int i5;
        MutableState collectAsState3;
        int i6;
        Object rememberedValue19;
        boolean z4;
        Object rememberedValue20;
        Iterator it;
        Object obj2;
        List list3;
        boolean z5;
        Object obj3;
        TabToolbarInternalViewModel tabToolbarInternalViewModel2;
        Object obj4;
        ViewModel.ItemList itemList;
        List list4;
        Object obj5;
        boolean z6;
        String str2;
        ArrayList arrayList3;
        StateFlowImpl stateFlowImpl;
        int i7;
        long j;
        int i8;
        AndroidClock androidClock;
        int i9;
        SectionProvider.Content content;
        MoneyTabPresenter moneyTabPresenter2;
        BetterNavigator.ScreenNavigator screenNavigator2;
        SectionProvider disclosureSectionProvider;
        MoneyTabPresenter moneyTabPresenter3 = this;
        PdpNotifiedPreference$$ExternalSyntheticLambda0 pdpNotifiedPreference$$ExternalSyntheticLambda0 = moneyTabPresenter3.hypeDismissedPreference.keyValueFactory;
        MoneyTabToolbarConfig moneyTabToolbarConfig = moneyTabPresenter3.moneyTabToolbarConfig;
        boolean z7 = moneyTabToolbarConfig.isEmpty;
        flow.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startReplaceGroup(-910122039);
        Object rememberedValue21 = gapComposer3.rememberedValue();
        AndroidClock androidClock2 = moneyTabPresenter3.clock;
        Object obj6 = Composer.Companion.Empty;
        if (rememberedValue21 == obj6) {
            rememberedValue21 = Long.valueOf(androidClock2.millis());
            gapComposer3.updateRememberedValue(rememberedValue21);
        }
        long longValue = ((Number) rememberedValue21).longValue();
        TabToolbarInternalViewModel models = moneyTabPresenter3.tabToolbarPresenter.models(moneyTabPresenter3.toolbarEvents, (Composer) gapComposer3, 64);
        boolean changed5 = gapComposer3.changed(moneyTabToolbarConfig) | gapComposer3.changed(models);
        Object rememberedValue22 = gapComposer3.rememberedValue();
        if (changed5 || rememberedValue22 == obj6) {
            ZoneId zoneId = MoneyTabPresenterKt.HYPE_PDP_LAUNCH_ZONE;
            rememberedValue22 = z7 ? TabToolbarInternalViewModel.copy$default(models, EmptyList.INSTANCE, TabToolbarInternalViewModel.StartButtonType.NONE, null, 1) : models;
            gapComposer3.updateRememberedValue(rememberedValue22);
        }
        TabToolbarInternalViewModel tabToolbarInternalViewModel3 = (TabToolbarInternalViewModel) rememberedValue22;
        Object rememberedValue23 = gapComposer3.rememberedValue();
        int i10 = 29;
        e0 e0Var = moneyTabPresenter3.moneyProfileManager;
        if (rememberedValue23 == obj6) {
            rememberedValue23 = StateFlowKt.mapState(((RealFamilyProfileManager) e0Var.a).familyProfile, new TooltipBoxKt$$ExternalSyntheticLambda2(e0Var, i10));
            gapComposer3.updateRememberedValue(rememberedValue23);
        }
        String str3 = !z7 ? (String) Updater.collectAsState((StateFlow) rememberedValue23, null, gapComposer3, 1).getValue() : null;
        Object rememberedValue24 = gapComposer3.rememberedValue();
        long j2 = longValue;
        BetterNavigator.ScreenNavigator screenNavigator3 = moneyTabPresenter3.navigator;
        if (rememberedValue24 == obj6) {
            Set<DisclosureSectionProvider$Factory$Impl> set = (Set) e0Var.i;
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
            for (DisclosureSectionProvider$Factory$Impl disclosureSectionProvider$Factory$Impl : set) {
                switch (disclosureSectionProvider$Factory$Impl.$r8$classId) {
                    case 0:
                        screenNavigator2 = screenNavigator3;
                        Instrument$Adapter instrument$Adapter = (Instrument$Adapter) disclosureSectionProvider$Factory$Impl.delegateFactory;
                        RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) ((Provider) instrument$Adapter.cash_instrument_typeAdapter).invoke();
                        DisclosureRepository disclosureRepository = (DisclosureRepository) ((RetroUiFactory.MetroFactory) instrument$Adapter.card_brandAdapter).invoke();
                        MoneyAnalyticsService moneyAnalyticsService = (MoneyAnalyticsService) ((Provider) instrument$Adapter.balance_currencyAdapter).invoke();
                        realRouter$Factory$Impl.getClass();
                        moneyAnalyticsService.getClass();
                        disclosureSectionProvider = new DisclosureSectionProvider(realRouter$Factory$Impl, disclosureRepository, moneyAnalyticsService, screenNavigator2);
                        break;
                    case 1:
                        screenNavigator2 = screenNavigator3;
                        RealRouter.MetroFactory metroFactory = (RealRouter.MetroFactory) disclosureSectionProvider$Factory$Impl.delegateFactory;
                        RealMoreWaysToAddMoneySectionPresenter$Factory$Impl realMoreWaysToAddMoneySectionPresenter$Factory$Impl = (RealMoreWaysToAddMoneySectionPresenter$Factory$Impl) metroFactory.urlRouterFactory.value;
                        RealFamilyProfileManager realFamilyProfileManager = (RealFamilyProfileManager) metroFactory.clientRouteRouterFactory.invoke();
                        realMoreWaysToAddMoneySectionPresenter$Factory$Impl.getClass();
                        realFamilyProfileManager.getClass();
                        disclosureSectionProvider = new DisclosureSectionProvider(realMoreWaysToAddMoneySectionPresenter$Factory$Impl, realFamilyProfileManager, screenNavigator2);
                        break;
                    case 2:
                        BetterNavigator.ScreenNavigator screenNavigator4 = screenNavigator3;
                        RealFamilyNavigator$MetroFactory realFamilyNavigator$MetroFactory = (RealFamilyNavigator$MetroFactory) disclosureSectionProvider$Factory$Impl.delegateFactory;
                        RealFamilyProfileManager realFamilyProfileManager2 = (RealFamilyProfileManager) realFamilyNavigator$MetroFactory.analytics.invoke();
                        RealFamilyNavigator$Factory$Impl realFamilyNavigator$Factory$Impl = (RealFamilyNavigator$Factory$Impl) realFamilyNavigator$MetroFactory.sessionManager.invoke();
                        AndroidStringManager androidStringManager = (AndroidStringManager) realFamilyNavigator$MetroFactory.supportNavigator.invoke();
                        SessionManager sessionManager = (SessionManager) realFamilyNavigator$MetroFactory.stringManager.invoke();
                        realFamilyProfileManager2.getClass();
                        realFamilyNavigator$Factory$Impl.getClass();
                        androidStringManager.getClass();
                        sessionManager.getClass();
                        screenNavigator2 = screenNavigator4;
                        disclosureSectionProvider = new DisclosureSectionProvider(realFamilyProfileManager2, realFamilyNavigator$Factory$Impl, androidStringManager, sessionManager, screenNavigator4);
                        break;
                    case 3:
                        Profile.Adapter adapter = (Profile.Adapter) disclosureSectionProvider$Factory$Impl.delegateFactory;
                        Set set2 = (Set) ((RealGlobalConfigManager.MetroFactory) adapter.nearby_visibilityAdapter).invoke();
                        RealMoneyContentSpanTrackingService realMoneyContentSpanTrackingService = (RealMoneyContentSpanTrackingService) ((Provider) adapter.rate_planAdapter).invoke();
                        zzr zzrVar = (zzr) ((RealMessageSigner.MetroFactory) adapter.deposit_preferenceAdapter).invoke();
                        RealAppletTileServerRecommendationProvider realAppletTileServerRecommendationProvider = (RealAppletTileServerRecommendationProvider) ((Provider) adapter.country_codeAdapter).invoke();
                        zzb zzbVar = new zzb(i10);
                        AppletTileUninstalledRowVariantProvider appletTileUninstalledRowVariantProvider = (AppletTileUninstalledRowVariantProvider) ((RealMessageSigner.MetroFactory) adapter.default_currencyAdapter).invoke();
                        RealMoneyContentSpanTrackingService realMoneyContentSpanTrackingService2 = (RealMoneyContentSpanTrackingService) ((Provider) adapter.incoming_request_policyAdapter).invoke();
                        RealFamilyProfileManager realFamilyProfileManager3 = (RealFamilyProfileManager) ((Provider) adapter.regionAdapter).invoke();
                        RealBalancePrivacy realBalancePrivacy = (RealBalancePrivacy) ((Provider) adapter.bitcoin_display_unitsAdapter).invoke();
                        AndroidStringManager androidStringManager2 = (AndroidStringManager) ((Provider) adapter.bitcoin_amount_entry_currency_preferenceAdapter).invoke();
                        FeatureFlagManager featureFlagManager = (FeatureFlagManager) ((Provider) adapter.addressAdapter).invoke();
                        ErrorReporter errorReporter = (ErrorReporter) ((Provider) adapter.deposit_preference_dataAdapter).invoke();
                        CoroutineContext coroutineContext = (CoroutineContext) ((Provider) adapter.available_p2p_target_regionsAdapter).invoke();
                        set2.getClass();
                        realMoneyContentSpanTrackingService.getClass();
                        realAppletTileServerRecommendationProvider.getClass();
                        realMoneyContentSpanTrackingService2.getClass();
                        realFamilyProfileManager3.getClass();
                        realBalancePrivacy.getClass();
                        androidStringManager2.getClass();
                        featureFlagManager.getClass();
                        errorReporter.getClass();
                        coroutineContext.getClass();
                        BetterNavigator.ScreenNavigator screenNavigator5 = screenNavigator3;
                        disclosureSectionProvider = new AppletTileSectionProvider(set2, realMoneyContentSpanTrackingService, zzrVar, realAppletTileServerRecommendationProvider, zzbVar, appletTileUninstalledRowVariantProvider, realMoneyContentSpanTrackingService2, realFamilyProfileManager3, realBalancePrivacy, androidStringManager2, featureFlagManager, errorReporter, coroutineContext, screenNavigator5);
                        screenNavigator2 = screenNavigator5;
                        break;
                    default:
                        KybBannerPresenter$Factory$Impl kybBannerPresenter$Factory$Impl = (KybBannerPresenter$Factory$Impl) ((InternalArcadeFlagsManager$MetroFactory) disclosureSectionProvider$Factory$Impl.delegateFactory).scope.value;
                        kybBannerPresenter$Factory$Impl.getClass();
                        disclosureSectionProvider = new BannerSectionProvider(kybBannerPresenter$Factory$Impl, screenNavigator3);
                        screenNavigator2 = screenNavigator3;
                        break;
                }
                arrayList4.add(disclosureSectionProvider);
                screenNavigator3 = screenNavigator2;
                i10 = 29;
            }
            BetterNavigator.ScreenNavigator screenNavigator6 = screenNavigator3;
            ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                SectionProvider sectionProvider = (SectionProvider) it2.next();
                arrayList5.add(new Pair(sectionProvider, sectionProvider.getAvailabilityState().getValue()));
            }
            ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                SectionProvider sectionProvider2 = (SectionProvider) it3.next();
                arrayList6.add(new InviteContactsPresenter$special$$inlined$map$1(sectionProvider2.getAvailabilityState(), sectionProvider2, 19));
                screenNavigator6 = screenNavigator6;
            }
            screenNavigator = screenNavigator6;
            i2 = 6;
            tabToolbarInternalViewModel = models;
            rememberedValue24 = FlowKt.stateIn(new CardModelView$textures$$inlined$combine$1((Flow[]) CollectionsKt.toList(arrayList6).toArray(new Flow[0]), i2), (CoroutineScope) e0Var.f, new StartedWhileSubscribed(0L, Long.MAX_VALUE), arrayList5);
            gapComposer3.updateRememberedValue(rememberedValue24);
        } else {
            screenNavigator = screenNavigator3;
            tabToolbarInternalViewModel = models;
            i2 = 6;
        }
        MutableState collectAsState4 = Updater.collectAsState((StateFlow) rememberedValue24, null, gapComposer3, 1);
        boolean changed6 = gapComposer3.changed((List) collectAsState4.getValue());
        Object rememberedValue25 = gapComposer3.rememberedValue();
        if (changed6 || rememberedValue25 == obj6) {
            List list5 = (List) collectAsState4.getValue();
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            for (Object obj7 : list5) {
                if (((SectionAvailabilityState) ((Pair) obj7).second) == SectionAvailabilityState.AVAILABLE) {
                    arrayList7.add(obj7);
                } else {
                    arrayList8.add(obj7);
                }
            }
            ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
            Iterator it4 = arrayList7.iterator();
            while (it4.hasNext()) {
                arrayList9.add((SectionProvider) ((Pair) it4.next()).first);
            }
            ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList8, 10));
            Iterator it5 = arrayList8.iterator();
            while (it5.hasNext()) {
                arrayList10.add((SectionProvider) ((Pair) it5.next()).first);
            }
            rememberedValue25 = new Pair(arrayList9, arrayList10);
            gapComposer3.updateRememberedValue(rememberedValue25);
        }
        Pair pair = (Pair) rememberedValue25;
        List list6 = (List) pair.first;
        List list7 = (List) pair.second;
        Object rememberedValue26 = gapComposer3.rememberedValue();
        if (rememberedValue26 == obj6) {
            rememberedValue26 = moneyTabPresenter3.familyProfileManager.familyProfile;
            gapComposer3.updateRememberedValue(rememberedValue26);
        }
        boolean z8 = ((FamilyProfile) Updater.collectAsState((StateFlow) rememberedValue26, null, gapComposer3, 1).getValue()) instanceof FamilyProfile.ManagedAccount;
        StateFlowImpl stateFlowImpl2 = moneyTabPresenter3.missingSectionProviderIds;
        Set set3 = (Set) Updater.collectAsState(stateFlowImpl2, null, gapComposer3, 1).getValue();
        Iterator it6 = list7.iterator();
        while (it6.hasNext()) {
            set3.remove(((SectionProvider) it6.next()).getId());
        }
        Unit unit = Unit.INSTANCE;
        boolean changedInstance4 = gapComposer3.changedInstance(moneyTabPresenter3) | gapComposer3.changedInstance(set3);
        Object rememberedValue27 = gapComposer3.rememberedValue();
        int i11 = 12;
        if (changedInstance4 || rememberedValue27 == obj6) {
            rememberedValue27 = new MusicPresenter$models$2$1(moneyTabPresenter3, set3, null, i11);
            gapComposer3.updateRememberedValue(rememberedValue27);
        }
        Updater.LaunchedEffect(gapComposer3, unit, (Function2) rememberedValue27);
        gapComposer3.startReplaceGroup(-635031561);
        ArrayList arrayList11 = new ArrayList(list6.size());
        int size3 = list6.size();
        int i12 = 0;
        while (i12 < size3) {
            SectionProvider sectionProvider3 = (SectionProvider) list6.get(i12);
            gapComposer3.startMovableGroup(1963245592, sectionProvider3);
            SectionProvider.Content content2 = (SectionProvider.Content) sectionProvider3.models(EmptyFlow.INSTANCE, gapComposer3, 0);
            gapComposer3.end(false);
            boolean changedInstance5 = gapComposer3.changedInstance(moneyTabPresenter3) | gapComposer3.changedInstance(sectionProvider3) | gapComposer3.changedInstance(content2);
            ArrayList arrayList12 = arrayList11;
            Object rememberedValue28 = gapComposer3.rememberedValue();
            if (changedInstance5 || rememberedValue28 == obj6) {
                z6 = z7;
                str2 = str3;
                arrayList3 = arrayList12;
                stateFlowImpl = stateFlowImpl2;
                i7 = size3;
                MoneyTabPresenter moneyTabPresenter4 = moneyTabPresenter3;
                j = j2;
                i8 = i12;
                androidClock = androidClock2;
                i9 = 6;
                content = content2;
                rememberedValue28 = new ContentInViewNode$launchAnimation$2(3, j, moneyTabPresenter4, sectionProvider3, content, (Continuation) null);
                moneyTabPresenter2 = moneyTabPresenter4;
                gapComposer3.updateRememberedValue(rememberedValue28);
            } else {
                stateFlowImpl = stateFlowImpl2;
                moneyTabPresenter2 = moneyTabPresenter3;
                z6 = z7;
                str2 = str3;
                arrayList3 = arrayList12;
                i7 = size3;
                j = j2;
                i8 = i12;
                androidClock = androidClock2;
                i9 = 6;
                content = content2;
            }
            Updater.LaunchedEffect(gapComposer3, content, (Function2) rememberedValue28);
            arrayList3.add(content);
            i12 = i8 + 1;
            arrayList11 = arrayList3;
            i2 = i9;
            androidClock2 = androidClock;
            z7 = z6;
            stateFlowImpl2 = stateFlowImpl;
            j2 = j;
            moneyTabPresenter3 = moneyTabPresenter2;
            size3 = i7;
            str3 = str2;
        }
        StateFlowImpl stateFlowImpl3 = stateFlowImpl2;
        MoneyTabPresenter moneyTabPresenter5 = moneyTabPresenter3;
        boolean z9 = z7;
        String str4 = str3;
        final long j3 = j2;
        ArrayList arrayList13 = arrayList11;
        AndroidClock androidClock3 = androidClock2;
        gapComposer3.end(false);
        Object rememberedValue29 = gapComposer3.rememberedValue();
        if (rememberedValue29 == obj6) {
            rememberedValue29 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer3.updateRememberedValue(rememberedValue29);
        }
        MutableState mutableState2 = (MutableState) rememberedValue29;
        Object rememberedValue30 = gapComposer3.rememberedValue();
        if (rememberedValue30 == obj6) {
            rememberedValue30 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer3.updateRememberedValue(rememberedValue30);
        }
        MutableState mutableState3 = (MutableState) rememberedValue30;
        if (!arrayList13.isEmpty()) {
            Iterator it7 = arrayList13.iterator();
            while (it7.hasNext()) {
                SectionProvider.Content content3 = (SectionProvider.Content) it7.next();
                if (content3.loading || content3.sections.isEmpty()) {
                    if (!((Boolean) mutableState2.getValue()).booleanValue()) {
                        z = false;
                        rememberedValue = gapComposer3.rememberedValue();
                        if (rememberedValue == obj6) {
                            Object moneyTabPresenter$models$lambda$17$$inlined$map$1 = new MoneyTabPresenter$models$lambda$17$$inlined$map$1(((RealIssuedCardManager) moneyTabPresenter5.issuedCardManager).getIssuedCardOrNull(), 0);
                            gapComposer3.updateRememberedValue(moneyTabPresenter$models$lambda$17$$inlined$map$1);
                            rememberedValue = moneyTabPresenter$models$lambda$17$$inlined$map$1;
                        }
                        z2 = z;
                        MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer3, 48, 2);
                        rememberedValue2 = gapComposer3.rememberedValue();
                        int i13 = 7;
                        if (rememberedValue2 == obj6) {
                            rememberedValue2 = new HeroCardViewKt$Render$1$8$1.AnonymousClass3(mutableState2, null, i13);
                            gapComposer3.updateRememberedValue(rememberedValue2);
                        }
                        int i14 = 14;
                        int i15 = (i >> 3) & 14;
                        Updater.LaunchedEffect(gapComposer3, moneyTabPresenter5, (Function2) rememberedValue2);
                        changedInstance = gapComposer3.changedInstance(moneyTabPresenter5);
                        rememberedValue3 = gapComposer3.rememberedValue();
                        if (!changedInstance || rememberedValue3 == obj6) {
                            rememberedValue3 = new GenieViewKt$GenieView$1$1(moneyTabPresenter5, (Continuation) null, 13);
                            gapComposer3.updateRememberedValue(rememberedValue3);
                        }
                        Updater.LaunchedEffect(gapComposer3, moneyTabPresenter5, (Function2) rememberedValue3);
                        rememberedValue4 = gapComposer3.rememberedValue();
                        if (rememberedValue4 == obj6) {
                            rememberedValue4 = Updater.mutableStateOf$default(Boolean.FALSE);
                            gapComposer3.updateRememberedValue(rememberedValue4);
                        }
                        mutableState = (MutableState) rememberedValue4;
                        rememberedValue5 = gapComposer3.rememberedValue();
                        int i16 = 5;
                        if (rememberedValue5 == obj6) {
                            rememberedValue5 = new MoneyTabUIKt$$ExternalSyntheticLambda9(i16, mutableState);
                            gapComposer3.updateRememberedValue(rememberedValue5);
                        }
                        int i17 = i15 | 48;
                        SwipeKt.SwipeHandler(moneyTabPresenter5, (Function1) rememberedValue5, gapComposer3, i17);
                        Unit unit2 = Unit.INSTANCE;
                        Object[] objArr = {unit2};
                        changedInstance2 = gapComposer3.changedInstance(moneyTabPresenter5);
                        rememberedValue6 = gapComposer3.rememberedValue();
                        if (!changedInstance2 || rememberedValue6 == obj6) {
                            rememberedValue6 = new GenieViewKt$GenieView$1$1(moneyTabPresenter5, mutableState, null, i14);
                            gapComposer3.updateRememberedValue(rememberedValue6);
                        }
                        LifecycleKt.LifecycleLaunchedEffect(objArr, null, null, (Function2) rememberedValue6, gapComposer3, 0);
                        bool = (Boolean) mutableState2.getValue();
                        bool.getClass();
                        changed = gapComposer3.changed(z2) | gapComposer3.changedInstance(moneyTabPresenter5) | gapComposer3.changedInstance(arrayList13);
                        rememberedValue7 = gapComposer3.rememberedValue();
                        if (!changed || rememberedValue7 == obj6) {
                            bool2 = bool;
                            gapComposer = gapComposer3;
                            Object anonymousClass1 = new RoomDatabase$performClear$1.AnonymousClass1(z2, moneyTabPresenter5, mutableState3, arrayList13, (Continuation) null, 13);
                            z3 = z2;
                            moneyTabPresenter = moneyTabPresenter5;
                            arrayList = arrayList13;
                            gapComposer.updateRememberedValue(anonymousClass1);
                            rememberedValue7 = anonymousClass1;
                        } else {
                            z3 = z2;
                            moneyTabPresenter = moneyTabPresenter5;
                            gapComposer = gapComposer3;
                            arrayList = arrayList13;
                            bool2 = bool;
                        }
                        Updater.LaunchedEffect(arrayList, bool2, (Function2) rememberedValue7, gapComposer);
                        DragAndDrop_androidKt.AddViewAttributes(moneyTabPresenter.observabilityManager, MapsKt__MapsJVMKt.mapOf(new Pair("home_version", moneyTabPresenter.moneyContentSpanTrackingService.version)), gapComposer, 0);
                        Object[] objArr2 = new Object[0];
                        rememberedValue8 = gapComposer.rememberedValue();
                        if (rememberedValue8 == obj6) {
                            rememberedValue8 = new MoneyTabUIKt$$ExternalSyntheticLambda6(7);
                            gapComposer.updateRememberedValue(rememberedValue8);
                        }
                        MutableState mutableState4 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue8, gapComposer, 48);
                        changedInstance3 = gapComposer.changedInstance(moneyTabPresenter);
                        rememberedValue9 = gapComposer.rememberedValue();
                        if (!changedInstance3 || rememberedValue9 == obj6) {
                            rememberedValue9 = new MoneyTabPresenter$models$7$1(moneyTabPresenter, null, 0);
                            gapComposer.updateRememberedValue(rememberedValue9);
                        }
                        Updater.LaunchedEffect(gapComposer, unit2, (Function2) rememberedValue9);
                        UiCallbackModel models2 = moneyTabPresenter.alertBannerPresenter.models(gapComposer);
                        rememberedValue10 = gapComposer.rememberedValue();
                        if (rememberedValue10 == obj6) {
                            MoneyTabPresenter$models$lambda$31$$inlined$map$1 moneyTabPresenter$models$lambda$31$$inlined$map$1 = new MoneyTabPresenter$models$lambda$31$$inlined$map$1(moneyTabPresenter.syncValueReader.getSingleValue(AndroidSyncValueSpecs.CashForWorkApplet), 0);
                            MoneyTabScreen moneyTabScreen = moneyTabPresenter.args;
                            moneyTabScreen.getClass();
                            rememberedValue10 = new WorkReviewTermsBanner$configFlow$$inlined$map$1(moneyTabPresenter$models$lambda$31$$inlined$map$1, moneyTabPresenter.stringManager, screenNavigator, moneyTabPresenter.flowStarter, moneyTabScreen, 0);
                            gapComposer.updateRememberedValue(rememberedValue10);
                        }
                        arrayList2 = arrayList;
                        MutableState collectAsState6 = Updater.collectAsState((Flow) rememberedValue10, null, null, gapComposer, 48, 2);
                        alertBannerViewModel = (AlertBannerViewModel) models2.model;
                        if (alertBannerViewModel == null) {
                            WorkReviewTermsBanner$Config workReviewTermsBanner$Config = (WorkReviewTermsBanner$Config) collectAsState6.getValue();
                            if (workReviewTermsBanner$Config == null) {
                                alertBannerViewModel2 = null;
                                MutableState rememberUpdatedState = Updater.rememberUpdatedState(models2, gapComposer);
                                MutableState rememberUpdatedState2 = Updater.rememberUpdatedState((WorkReviewTermsBanner$Config) collectAsState6.getValue(), gapComposer);
                                MoneyTabPresenter$models$lambda$31$$inlined$map$1 moneyTabPresenter$models$lambda$31$$inlined$map$12 = new MoneyTabPresenter$models$lambda$31$$inlined$map$1(flow, 6);
                                Updater.LaunchedEffect(gapComposer, moneyTabPresenter$models$lambda$31$$inlined$map$12, new AnimationsKt$takeUntil$1$1(moneyTabPresenter$models$lambda$31$$inlined$map$12, (Continuation) null, moneyTabPresenter, rememberUpdatedState, rememberUpdatedState2, 21));
                                AmplitudeExperiments$ProjectMintHypeAnimations amplitudeExperiments$ProjectMintHypeAnimations = AmplitudeExperiments$ProjectMintHypeAnimations.INSTANCE;
                                FeatureFlagManager featureFlagManager2 = moneyTabPresenter.featureFlagManager;
                                MutableState collectExperimentAsState = ObjectUtils.collectExperimentAsState(featureFlagManager2, amplitudeExperiments$ProjectMintHypeAnimations, gapComposer);
                                boolean z10 = !Intrinsics.areEqual(((FeatureFlag$StringAmplitudeExperiment.Value) collectExperimentAsState.getValue()).value, "all") || Intrinsics.areEqual(((FeatureFlag$StringAmplitudeExperiment.Value) collectExperimentAsState.getValue()).value, "moneytab");
                                rememberedValue11 = gapComposer.rememberedValue();
                                if (rememberedValue11 == obj6) {
                                    rememberedValue11 = Trace.valuesState(featureFlagManager2, JsonFeatureFlags$MintHypeDrop.INSTANCE);
                                    gapComposer.updateRememberedValue(rememberedValue11);
                                }
                                MutableState collectAsState7 = Updater.collectAsState((StateFlow) rememberedValue11, null, gapComposer, 1);
                                rememberedValue12 = gapComposer.rememberedValue();
                                if (rememberedValue12 == obj6) {
                                    rememberedValue12 = moneyTabPresenter.hypeEligibilityProvider.isEligible();
                                    gapComposer.updateRememberedValue(rememberedValue12);
                                }
                                Flow flow2 = (Flow) rememberedValue12;
                                Boolean bool3 = Boolean.FALSE;
                                gapComposer2 = gapComposer;
                                collectAsState = Updater.collectAsState(flow2, bool3, null, gapComposer2, 48, 2);
                                str = ((JsonFeatureFlags$MintHypeDrop.HypeDropData) ((FeatureFlag$JsonFeatureFlag.Options) collectAsState7.getValue()).value).symbol;
                                if (str == null) {
                                    str = "";
                                }
                                obj = ((JsonFeatureFlags$MintHypeDrop.HypeDropData) ((FeatureFlag$JsonFeatureFlag.Options) collectAsState7.getValue()).value).token;
                                changed2 = gapComposer2.changed(obj);
                                rememberedValue13 = gapComposer2.rememberedValue();
                                if (!changed2 || rememberedValue13 == obj6) {
                                    if (obj != null || (r5 = ((KeyValue) pdpNotifiedPreference$$ExternalSyntheticLambda0.invoke(obj)).observe()) == null) {
                                        Object appLockMonitor$special$$inlined$map$2 = new AppLockMonitor$special$$inlined$map$2(bool3, 19);
                                    }
                                    rememberedValue13 = appLockMonitor$special$$inlined$map$2;
                                    gapComposer2.updateRememberedValue(rememberedValue13);
                                }
                                Flow flow3 = (Flow) rememberedValue13;
                                boolean booleanValue = obj != null ? ((Boolean) ((KeyValue) pdpNotifiedPreference$$ExternalSyntheticLambda0.invoke(obj)).blockingGet()).booleanValue() : false;
                                String str5 = str;
                                boolean z11 = z10;
                                MutableState collectAsState8 = Updater.collectAsState(flow3, Boolean.valueOf(booleanValue), null, gapComposer2, 0, 2);
                                if (((Boolean) collectAsState.getValue()).booleanValue() || !z11 || ((Boolean) collectAsState8.getValue()).booleanValue() || obj == null) {
                                    nextAvailableCashTag = null;
                                } else {
                                    String str6 = ((JsonFeatureFlags$MintHypeDrop.HypeDropData) ((FeatureFlag$JsonFeatureFlag.Options) collectAsState7.getValue()).value).launchDate;
                                    if (str6 == null) {
                                        str6 = "";
                                    }
                                    String str7 = ((JsonFeatureFlags$MintHypeDrop.HypeDropData) ((FeatureFlag$JsonFeatureFlag.Options) collectAsState7.getValue()).value).startDate;
                                    if (str7 == null) {
                                        str7 = "";
                                    }
                                    nextAvailableCashTag = GrpcDecoderKt.computeNextAvailableCashTag(str5, str6, str7, DimensionKt.nowLocalDate(androidClock3));
                                }
                                MutableState rememberUpdatedState3 = Updater.rememberUpdatedState(nextAvailableCashTag, gapComposer2);
                                MutableState rememberUpdatedState4 = Updater.rememberUpdatedState(((JsonFeatureFlags$MintHypeDrop.HypeDropData) ((FeatureFlag$JsonFeatureFlag.Options) collectAsState7.getValue()).value).launchAtMillis, gapComposer2);
                                MutableState rememberUpdatedState5 = Updater.rememberUpdatedState(obj, gapComposer2);
                                rememberedValue14 = gapComposer2.rememberedValue();
                                if (rememberedValue14 == obj6) {
                                    rememberedValue14 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
                                    gapComposer2.updateRememberedValue(rememberedValue14);
                                }
                                CoroutineScope coroutineScope = (CoroutineScope) rememberedValue14;
                                NextAvailableCashTag nextAvailableCashTag2 = nextAvailableCashTag;
                                final MoneyTabPresenter moneyTabPresenter6 = moneyTabPresenter;
                                Updater.LaunchedEffect(gapComposer2, flow, new ZiplineLoader$load$2(flow, (Continuation) null, moneyTabPresenter6, coroutineScope, mutableState4, rememberUpdatedState3, rememberUpdatedState5, rememberUpdatedState4, 21));
                                rememberedValue15 = gapComposer2.rememberedValue();
                                if (rememberedValue15 == obj6) {
                                    rememberedValue15 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer2);
                                }
                                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) rememberedValue15;
                                rememberedValue16 = gapComposer2.rememberedValue();
                                if (rememberedValue16 == obj6) {
                                    rememberedValue16 = new WalletHomeViewKt$$ExternalSyntheticLambda21(4, parcelableSnapshotMutableIntState2);
                                    gapComposer2.updateRememberedValue(rememberedValue16);
                                }
                                RenavigationKt.RenavigationHandler(moneyTabPresenter6, (Function0) rememberedValue16, gapComposer2, i17);
                                changed3 = gapComposer2.changed(arrayList2);
                                rememberedValue17 = gapComposer2.rememberedValue();
                                if (!changed3 || rememberedValue17 == obj6) {
                                    ArrayList arrayList14 = new ArrayList(arrayList2.size());
                                    size = arrayList2.size();
                                    for (i3 = 0; i3 < size; i3++) {
                                        CollectionsKt__MutableCollectionsKt.addAll(((SectionProvider.Content) arrayList2.get(i3)).sections, arrayList14);
                                    }
                                    rememberedValue17 = CollectionsKt.sortedWith(arrayList14, MoneySectionSorter.INSTANCE);
                                    gapComposer2.updateRememberedValue(rememberedValue17);
                                }
                                list = (List) rememberedValue17;
                                changed4 = gapComposer2.changed(list);
                                Object rememberedValue31 = gapComposer2.rememberedValue();
                                Object obj8 = rememberedValue31;
                                if (!changed4 || rememberedValue31 == obj6) {
                                    ArrayList arrayList15 = new ArrayList(list.size());
                                    size2 = list.size();
                                    for (i4 = 0; i4 < size2; i4++) {
                                        CollectionsKt__MutableCollectionsKt.addAll(AeMode.Companion.viewModels((Section) list.get(i4)), arrayList15);
                                    }
                                    gapComposer2.updateRememberedValue(arrayList15);
                                    obj8 = arrayList15;
                                }
                                List list8 = (List) obj8;
                                RealCardAppletTileRepository realCardAppletTileRepository = (RealCardAppletTileRepository) moneyTabPresenter6.cardAppletTileRepository;
                                collectAsState2 = Updater.collectAsState(realCardAppletTileRepository.isCardReadyToAnimate, null, gapComposer2, 1);
                                if (arrayList2.isEmpty()) {
                                    gapComposer2.startReplaceGroup(693017017);
                                    gapComposer2.end(false);
                                } else {
                                    gapComposer2.startReplaceGroup(692894970);
                                    boolean changedInstance6 = gapComposer2.changedInstance(moneyTabPresenter6) | gapComposer2.changedInstance(list);
                                    Object rememberedValue32 = gapComposer2.rememberedValue();
                                    if (changedInstance6 || rememberedValue32 == obj6) {
                                        rememberedValue32 = new GenieViewKt$GenieView$1$1(moneyTabPresenter6, list, null, 12);
                                        gapComposer2.updateRememberedValue(rememberedValue32);
                                    }
                                    Updater.LaunchedEffect(gapComposer2, arrayList2, (Function2) rememberedValue32);
                                    gapComposer2.end(false);
                                }
                                rememberedValue18 = gapComposer2.rememberedValue();
                                moneyTabLoadedStateHolder = moneyTabPresenter6.moneyTabLoadedStateHolder;
                                if (rememberedValue18 == obj6) {
                                    if (moneyTabLoadedStateHolder._isLoaded) {
                                        parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState2;
                                        list2 = list8;
                                        rememberedValue18 = new StateFlowKt$stateFlowOf$1(Boolean.FALSE);
                                        i5 = 1;
                                    } else {
                                        Duration.Companion companion = Duration.Companion;
                                        parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState2;
                                        list2 = list8;
                                        final FinishSetupTileBadgeCounter combine = FlowKt.combine(new SafeFlow(new FlashControl$applyScreenFlash$3(DurationKt.toDuration(750, DurationUnit.MILLISECONDS), (Continuation) null)), new SafeFlow(new FlashControl$applyScreenFlash$3(DurationKt.toDuration(3, DurationUnit.SECONDS), (Continuation) null)), stateFlowImpl3, MoneyTabPresenter$loadingStateWithTimeouts$3.INSTANCE);
                                        i5 = 1;
                                        rememberedValue18 = FlowKt.stateIn(new Flow() { // from class: com.squareup.cash.money.presenters.MoneyTabPresenter$loadingStateWithTimeouts$$inlined$map$1

                                            /* renamed from: com.squareup.cash.money.presenters.MoneyTabPresenter$loadingStateWithTimeouts$$inlined$map$1$2, reason: invalid class name */
                                            public final class AnonymousClass2 implements FlowCollector {
                                                public final /* synthetic */ int $r8$classId;
                                                public final /* synthetic */ long $startTimeMillis$inlined;
                                                public final /* synthetic */ FlowCollector $this_unsafeFlow;
                                                public final /* synthetic */ MoleculePresenter this$0;

                                                /* renamed from: com.squareup.cash.money.presenters.MoneyTabPresenter$loadingStateWithTimeouts$$inlined$map$1$2$1, reason: invalid class name */
                                                public final class AnonymousClass1 extends ContinuationImpl {
                                                    public int label;
                                                    public /* synthetic */ Object result;

                                                    public AnonymousClass1(Continuation continuation) {
                                                        super(continuation);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) {
                                                        this.result = obj;
                                                        this.label |= PKIFailureInfo.systemUnavail;
                                                        return AnonymousClass2.this.emit(null, this);
                                                    }
                                                }

                                                public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, MoleculePresenter moleculePresenter, long j, int i) {
                                                    this.$r8$classId = i;
                                                    this.$this_unsafeFlow = flowCollector;
                                                    this.this$0 = moleculePresenter;
                                                    this.$startTimeMillis$inlined = j;
                                                }

                                                /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
                                                /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
                                                /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
                                                /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
                                                /* JADX WARN: Removed duplicated region for block: B:53:0x00e5  */
                                                /* JADX WARN: Removed duplicated region for block: B:59:0x00f1  */
                                                @Override // kotlinx.coroutines.flow.FlowCollector
                                                /*
                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                */
                                                public final Object emit(Object obj, Continuation continuation) {
                                                    AnonymousClass1 anonymousClass1;
                                                    int i;
                                                    ProfilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$2$2$1 profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$2$2$1;
                                                    int i2;
                                                    ProfileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$2$2$1 profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$2$2$1;
                                                    int i3;
                                                    int i4 = this.$r8$classId;
                                                    long j = this.$startTimeMillis$inlined;
                                                    MoleculePresenter moleculePresenter = this.this$0;
                                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                                    switch (i4) {
                                                        case 0:
                                                            MoneyTabPresenter moneyTabPresenter = (MoneyTabPresenter) moleculePresenter;
                                                            RealMoneyContentSpanTrackingService realMoneyContentSpanTrackingService = moneyTabPresenter.moneyContentSpanTrackingService;
                                                            if (continuation instanceof AnonymousClass1) {
                                                                anonymousClass1 = (AnonymousClass1) continuation;
                                                                int i5 = anonymousClass1.label;
                                                                if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                                                                    anonymousClass1.label = i5 - PKIFailureInfo.systemUnavail;
                                                                    Object obj2 = anonymousClass1.result;
                                                                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                    i = anonymousClass1.label;
                                                                    if (i != 0) {
                                                                        SafeTrace.throwOnFailure(obj2);
                                                                        Triple triple = (Triple) obj;
                                                                        boolean booleanValue = ((Boolean) triple.first).booleanValue();
                                                                        boolean booleanValue2 = ((Boolean) triple.second).booleanValue();
                                                                        boolean isEmpty = ((Set) triple.third).isEmpty();
                                                                        boolean z = false;
                                                                        if (booleanValue && isEmpty) {
                                                                            realMoneyContentSpanTrackingService.endInitialLoadingStateSpan();
                                                                        } else if (booleanValue2) {
                                                                            RealMoneyContentSpanTrackingService.FullSyncState fullSyncState = realMoneyContentSpanTrackingService.initialSyncState;
                                                                            RealMoneyContentSpanTrackingService.FullSyncState fullSyncState2 = RealMoneyContentSpanTrackingService.FullSyncState.COMPLETED_ON_START;
                                                                            if (fullSyncState != fullSyncState2) {
                                                                                fullSyncState2 = ((Instant) realMoneyContentSpanTrackingService.clientSyncCompletionTracker.completedSyncTimes.get(SyncTopic.CLIENTSYNC_PRIMARY)) != null ? RealMoneyContentSpanTrackingService.FullSyncState.COMPLETED_AFTER_START : RealMoneyContentSpanTrackingService.FullSyncState.PENDING;
                                                                            }
                                                                            SpanTracking spanTracking = (SpanTracking) realMoneyContentSpanTrackingService.openSpans.get(realMoneyContentSpanTrackingService.initialLoadingStateSpanId);
                                                                            if (spanTracking != null) {
                                                                                SpanTracking.spanEnded$default(spanTracking, MapsKt__MapsKt.mapOf(new Pair("terminator", "timeout"), new Pair("full_sync_state", fullSyncState2.analyticsKey)), 1);
                                                                            }
                                                                            realMoneyContentSpanTrackingService.initialLoadingStateSpanId = null;
                                                                            realMoneyContentSpanTrackingService.initialSyncState = null;
                                                                            ((RealMoneyAnalyticsService) moneyTabPresenter.moneyAnalyticsService).submitViewLoadEvent(moneyTabPresenter.args.source, moneyTabPresenter.clock.millis() - j, Boolean.TRUE);
                                                                        } else {
                                                                            z = true;
                                                                        }
                                                                        Boolean valueOf = Boolean.valueOf(z);
                                                                        anonymousClass1.label = 1;
                                                                        if (flowCollector.emit(valueOf, anonymousClass1) == coroutineSingletons) {
                                                                            break;
                                                                        }
                                                                    } else if (i != 1) {
                                                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                                                        break;
                                                                    } else {
                                                                        SafeTrace.throwOnFailure(obj2);
                                                                    }
                                                                    break;
                                                                }
                                                            }
                                                            anonymousClass1 = new AnonymousClass1(continuation);
                                                            Object obj22 = anonymousClass1.result;
                                                            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                            i = anonymousClass1.label;
                                                            if (i != 0) {
                                                            }
                                                        case 1:
                                                            if (continuation instanceof ProfilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$2$2$1) {
                                                                profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$2$2$1 = (ProfilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$2$2$1) continuation;
                                                                int i6 = profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$2$2$1.label;
                                                                if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                                                                    profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$2$2$1.label = i6 - PKIFailureInfo.systemUnavail;
                                                                    Object obj3 = profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$2$2$1.result;
                                                                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                    i2 = profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$2$2$1.label;
                                                                    if (i2 != 0) {
                                                                        SafeTrace.throwOnFailure(obj3);
                                                                        Boolean bool = (Boolean) obj;
                                                                        bool.getClass();
                                                                        ProfilePrivacyPresenter profilePrivacyPresenter = (ProfilePrivacyPresenter) moleculePresenter;
                                                                        if (profilePrivacyPresenter.clock.millis() - j > 200) {
                                                                            profilePrivacyPresenter.analytics.track(new AccountConfigureGrantContactPermissions(bool), null);
                                                                        }
                                                                        Unit unit = Unit.INSTANCE;
                                                                        profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$2$2$1.label = 1;
                                                                        if (flowCollector.emit(unit, profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$2$2$1) == coroutineSingletons3) {
                                                                            break;
                                                                        }
                                                                    } else if (i2 != 1) {
                                                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                                                        break;
                                                                    } else {
                                                                        SafeTrace.throwOnFailure(obj3);
                                                                    }
                                                                    break;
                                                                }
                                                            }
                                                            profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$2$2$1 = new ProfilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$2$2$1(this, continuation);
                                                            Object obj32 = profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$2$2$1.result;
                                                            CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                            i2 = profilePrivacyPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$2$2$1.label;
                                                            if (i2 != 0) {
                                                            }
                                                        default:
                                                            if (continuation instanceof ProfileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$2$2$1) {
                                                                profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$2$2$1 = (ProfileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$2$2$1) continuation;
                                                                int i7 = profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$2$2$1.label;
                                                                if ((i7 & PKIFailureInfo.systemUnavail) != 0) {
                                                                    profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$2$2$1.label = i7 - PKIFailureInfo.systemUnavail;
                                                                    Object obj4 = profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$2$2$1.result;
                                                                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                                    i3 = profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$2$2$1.label;
                                                                    if (i3 != 0) {
                                                                        SafeTrace.throwOnFailure(obj4);
                                                                        Boolean bool2 = (Boolean) obj;
                                                                        bool2.getClass();
                                                                        TabToolbarPresenter tabToolbarPresenter = (TabToolbarPresenter) moleculePresenter;
                                                                        if (((AndroidClock) tabToolbarPresenter.sessionFlags).millis() - j > 200) {
                                                                            ((Analytics) tabToolbarPresenter.moneybotAnalyticsService).track(new AccountConfigureGrantContactPermissions(bool2), null);
                                                                        }
                                                                        Unit unit2 = Unit.INSTANCE;
                                                                        profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$2$2$1.label = 1;
                                                                        if (flowCollector.emit(unit2, profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$2$2$1) == coroutineSingletons4) {
                                                                            break;
                                                                        }
                                                                    } else if (i3 != 1) {
                                                                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                                                        break;
                                                                    } else {
                                                                        SafeTrace.throwOnFailure(obj4);
                                                                    }
                                                                    break;
                                                                }
                                                            }
                                                            profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$2$2$1 = new ProfileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$2$2$1(this, continuation);
                                                            Object obj42 = profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$2$2$1.result;
                                                            CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                            i3 = profileSecurityPresenter$emitAnalyticsEvents$lambda$0$$inlined$map$2$2$1.label;
                                                            if (i3 != 0) {
                                                            }
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }

                                            @Override // kotlinx.coroutines.flow.Flow
                                            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                                                Object collect = FinishSetupTileBadgeCounter.this.collect(new AnonymousClass2(flowCollector, moneyTabPresenter6, j3, 0), continuation);
                                                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
                                            }
                                        }, coroutineScope, SharingStarted.Companion.Lazily, Boolean.valueOf(!((Collection) stateFlowImpl3.getValue()).isEmpty()));
                                    }
                                    gapComposer2.updateRememberedValue(rememberedValue18);
                                } else {
                                    parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState2;
                                    list2 = list8;
                                    i5 = 1;
                                }
                                collectAsState3 = Updater.collectAsState((StateFlow) rememberedValue18, null, gapComposer2, i5);
                                if (moneyTabLoadedStateHolder._isLoaded) {
                                    gapComposer2.startReplaceGroup(693167026);
                                    Unit unit3 = Unit.INSTANCE;
                                    boolean changedInstance7 = gapComposer2.changedInstance(moneyTabPresenter6);
                                    Object rememberedValue33 = gapComposer2.rememberedValue();
                                    if (changedInstance7 || rememberedValue33 == obj6) {
                                        i6 = 5;
                                        rememberedValue33 = new InviteErrorPresenter$models$1$1(moneyTabPresenter6, null, i6);
                                        gapComposer2.updateRememberedValue(rememberedValue33);
                                    } else {
                                        i6 = 5;
                                    }
                                    Updater.LaunchedEffect(gapComposer2, unit3, (Function2) rememberedValue33);
                                    gapComposer2.end(false);
                                } else {
                                    i6 = 5;
                                    gapComposer2.startReplaceGroup(693327513);
                                    gapComposer2.end(false);
                                }
                                rememberedValue19 = gapComposer2.rememberedValue();
                                if (rememberedValue19 == obj6) {
                                    rememberedValue19 = StateFlowKt.mapState(realCardAppletTileRepository.nullStateCardDetails, new MoneyTabUIKt$$ExternalSyntheticLambda13(i6));
                                    gapComposer2.updateRememberedValue(rememberedValue19);
                                }
                                z4 = !((Boolean) moneyTabPresenter6.isCardAnimationEnabled$delegate.getValue()).booleanValue() && ((Boolean) collectAsState2.getValue()).booleanValue() && ((Boolean) Updater.collectAsState((StateFlow) rememberedValue19, null, gapComposer2, 1).getValue()).booleanValue();
                                RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager2;
                                boolean z12 = !((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.peekCurrentValue(AmplitudeExperiments$InstalledAppletRedesign.INSTANCE)).enabled() || z8;
                                if (((Boolean) collectAsState3.getValue()).booleanValue() || z4) {
                                    gapComposer2.startReplaceGroup(694591972);
                                    rememberedValue20 = gapComposer2.rememberedValue();
                                    if (rememberedValue20 == obj6) {
                                        rememberedValue20 = Boolean.valueOf(((FeatureFlag$EnabledDisabledFeatureFlag$Options) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$ScrollPerfLogging.INSTANCE)).enabled());
                                        gapComposer2.updateRememberedValue(rememberedValue20);
                                    }
                                    boolean booleanValue2 = ((Boolean) rememberedValue20).booleanValue();
                                    it = list2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj2 = it.next();
                                            if (CollectionsKt__CollectionsKt.listOf((Object[]) new SectionId[]{SectionId.CARD_INSTALLED, SectionId.CARD_UNINSTALLED}).contains(((ViewModel) obj2).getId())) {
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    boolean z13 = ((ViewModel) obj2) != null;
                                    list3 = (z4 || z13) ? list2 : null;
                                    if (list3 == null) {
                                        list3 = EmptyList.INSTANCE;
                                    }
                                    MoneyTabModel.Loaded loaded = new MoneyTabModel.Loaded(tabToolbarInternalViewModel3, str4, alertBannerViewModel2, list3, parcelableSnapshotMutableIntState.getIntValue(), z3, z4 && ((Boolean) collectAsState2.getValue()).booleanValue() && !((Boolean) mutableState4.getValue()).booleanValue(), z13 ? (CardTheme.Identifier) collectAsState5.getValue() : null, z13, booleanValue2, nextAvailableCashTag2);
                                    z5 = false;
                                    gapComposer2.end(false);
                                    obj3 = loaded;
                                } else {
                                    gapComposer2.startReplaceGroup(694102606);
                                    gapComposer2.end(false);
                                    if (z9) {
                                        tabToolbarInternalViewModel2 = tabToolbarInternalViewModel3;
                                    } else {
                                        TabToolbarInternalViewModel tabToolbarInternalViewModel4 = tabToolbarInternalViewModel;
                                        tabToolbarInternalViewModel2 = tabToolbarInternalViewModel4.moneybotSpacesButton != null ? tabToolbarInternalViewModel4 : TabToolbarInternalViewModel.EMPTY_NO_PROFILE;
                                    }
                                    Iterator it8 = list2.iterator();
                                    while (true) {
                                        if (it8.hasNext()) {
                                            obj4 = it8.next();
                                            ViewModel viewModel = (ViewModel) obj4;
                                            if (!(viewModel instanceof ViewModel.ItemList) || ((ViewModel.ItemList) viewModel).id != SectionId.APPLET_INSTALLED_BANKING_GROUPED) {
                                            }
                                        } else {
                                            obj4 = null;
                                        }
                                    }
                                    ViewModel.ItemList itemList2 = obj4 instanceof ViewModel.ItemList ? (ViewModel.ItemList) obj4 : null;
                                    if (itemList2 != null && (list4 = itemList2.items) != null) {
                                        Iterator it9 = list4.iterator();
                                        while (true) {
                                            if (it9.hasNext()) {
                                                obj5 = it9.next();
                                                if (Intrinsics.areEqual(((Item) obj5).getId(), ItemId.BALANCE.INSTANCE)) {
                                                }
                                            } else {
                                                obj5 = null;
                                            }
                                        }
                                        Item item = (Item) obj5;
                                        if (item != null) {
                                            List listOf = CollectionsKt__CollectionsJVMKt.listOf(item);
                                            Section.Layout layout = itemList2.layout;
                                            SectionId sectionId = itemList2.id;
                                            listOf.getClass();
                                            layout.getClass();
                                            sectionId.getClass();
                                            itemList = new ViewModel.ItemList(listOf, layout, sectionId);
                                            obj3 = new MoneyTabModel.Loading(tabToolbarInternalViewModel2, str4, itemList, z12);
                                            z5 = false;
                                        }
                                    }
                                    itemList = null;
                                    obj3 = new MoneyTabModel.Loading(tabToolbarInternalViewModel2, str4, itemList, z12);
                                    z5 = false;
                                }
                                gapComposer2.end(z5);
                                return obj3;
                            }
                            alertBannerViewModel = workReviewTermsBanner$Config.viewModel;
                        }
                        alertBannerViewModel2 = alertBannerViewModel;
                        MutableState rememberUpdatedState6 = Updater.rememberUpdatedState(models2, gapComposer);
                        MutableState rememberUpdatedState22 = Updater.rememberUpdatedState((WorkReviewTermsBanner$Config) collectAsState6.getValue(), gapComposer);
                        MoneyTabPresenter$models$lambda$31$$inlined$map$1 moneyTabPresenter$models$lambda$31$$inlined$map$122 = new MoneyTabPresenter$models$lambda$31$$inlined$map$1(flow, 6);
                        Updater.LaunchedEffect(gapComposer, moneyTabPresenter$models$lambda$31$$inlined$map$122, new AnimationsKt$takeUntil$1$1(moneyTabPresenter$models$lambda$31$$inlined$map$122, (Continuation) null, moneyTabPresenter, rememberUpdatedState6, rememberUpdatedState22, 21));
                        AmplitudeExperiments$ProjectMintHypeAnimations amplitudeExperiments$ProjectMintHypeAnimations2 = AmplitudeExperiments$ProjectMintHypeAnimations.INSTANCE;
                        FeatureFlagManager featureFlagManager22 = moneyTabPresenter.featureFlagManager;
                        MutableState collectExperimentAsState2 = ObjectUtils.collectExperimentAsState(featureFlagManager22, amplitudeExperiments$ProjectMintHypeAnimations2, gapComposer);
                        if (Intrinsics.areEqual(((FeatureFlag$StringAmplitudeExperiment.Value) collectExperimentAsState2.getValue()).value, "all")) {
                        }
                        rememberedValue11 = gapComposer.rememberedValue();
                        if (rememberedValue11 == obj6) {
                        }
                        MutableState collectAsState72 = Updater.collectAsState((StateFlow) rememberedValue11, null, gapComposer, 1);
                        rememberedValue12 = gapComposer.rememberedValue();
                        if (rememberedValue12 == obj6) {
                        }
                        Flow flow22 = (Flow) rememberedValue12;
                        Boolean bool32 = Boolean.FALSE;
                        gapComposer2 = gapComposer;
                        collectAsState = Updater.collectAsState(flow22, bool32, null, gapComposer2, 48, 2);
                        str = ((JsonFeatureFlags$MintHypeDrop.HypeDropData) ((FeatureFlag$JsonFeatureFlag.Options) collectAsState72.getValue()).value).symbol;
                        if (str == null) {
                        }
                        obj = ((JsonFeatureFlags$MintHypeDrop.HypeDropData) ((FeatureFlag$JsonFeatureFlag.Options) collectAsState72.getValue()).value).token;
                        changed2 = gapComposer2.changed(obj);
                        rememberedValue13 = gapComposer2.rememberedValue();
                        if (!changed2) {
                        }
                        if (obj != null) {
                        }
                        Object appLockMonitor$special$$inlined$map$22 = new AppLockMonitor$special$$inlined$map$2(bool32, 19);
                        rememberedValue13 = appLockMonitor$special$$inlined$map$22;
                        gapComposer2.updateRememberedValue(rememberedValue13);
                        Flow flow32 = (Flow) rememberedValue13;
                        if (obj != null) {
                        }
                        String str52 = str;
                        boolean z112 = z10;
                        MutableState collectAsState82 = Updater.collectAsState(flow32, Boolean.valueOf(booleanValue), null, gapComposer2, 0, 2);
                        if (((Boolean) collectAsState.getValue()).booleanValue()) {
                        }
                        nextAvailableCashTag = null;
                        MutableState rememberUpdatedState32 = Updater.rememberUpdatedState(nextAvailableCashTag, gapComposer2);
                        MutableState rememberUpdatedState42 = Updater.rememberUpdatedState(((JsonFeatureFlags$MintHypeDrop.HypeDropData) ((FeatureFlag$JsonFeatureFlag.Options) collectAsState72.getValue()).value).launchAtMillis, gapComposer2);
                        MutableState rememberUpdatedState52 = Updater.rememberUpdatedState(obj, gapComposer2);
                        rememberedValue14 = gapComposer2.rememberedValue();
                        if (rememberedValue14 == obj6) {
                        }
                        CoroutineScope coroutineScope2 = (CoroutineScope) rememberedValue14;
                        NextAvailableCashTag nextAvailableCashTag22 = nextAvailableCashTag;
                        final MoneyTabPresenter moneyTabPresenter62 = moneyTabPresenter;
                        Updater.LaunchedEffect(gapComposer2, flow, new ZiplineLoader$load$2(flow, (Continuation) null, moneyTabPresenter62, coroutineScope2, mutableState4, rememberUpdatedState32, rememberUpdatedState52, rememberUpdatedState42, 21));
                        rememberedValue15 = gapComposer2.rememberedValue();
                        if (rememberedValue15 == obj6) {
                        }
                        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState22 = (ParcelableSnapshotMutableIntState) rememberedValue15;
                        rememberedValue16 = gapComposer2.rememberedValue();
                        if (rememberedValue16 == obj6) {
                        }
                        RenavigationKt.RenavigationHandler(moneyTabPresenter62, (Function0) rememberedValue16, gapComposer2, i17);
                        changed3 = gapComposer2.changed(arrayList2);
                        rememberedValue17 = gapComposer2.rememberedValue();
                        if (!changed3) {
                        }
                        ArrayList arrayList142 = new ArrayList(arrayList2.size());
                        size = arrayList2.size();
                        while (i3 < size) {
                        }
                        rememberedValue17 = CollectionsKt.sortedWith(arrayList142, MoneySectionSorter.INSTANCE);
                        gapComposer2.updateRememberedValue(rememberedValue17);
                        list = (List) rememberedValue17;
                        changed4 = gapComposer2.changed(list);
                        Object rememberedValue312 = gapComposer2.rememberedValue();
                        Object obj82 = rememberedValue312;
                        if (!changed4) {
                        }
                        ArrayList arrayList152 = new ArrayList(list.size());
                        size2 = list.size();
                        while (i4 < size2) {
                        }
                        gapComposer2.updateRememberedValue(arrayList152);
                        obj82 = arrayList152;
                        List list82 = (List) obj82;
                        RealCardAppletTileRepository realCardAppletTileRepository2 = (RealCardAppletTileRepository) moneyTabPresenter62.cardAppletTileRepository;
                        collectAsState2 = Updater.collectAsState(realCardAppletTileRepository2.isCardReadyToAnimate, null, gapComposer2, 1);
                        if (arrayList2.isEmpty()) {
                        }
                        rememberedValue18 = gapComposer2.rememberedValue();
                        moneyTabLoadedStateHolder = moneyTabPresenter62.moneyTabLoadedStateHolder;
                        if (rememberedValue18 == obj6) {
                        }
                        collectAsState3 = Updater.collectAsState((StateFlow) rememberedValue18, null, gapComposer2, i5);
                        if (moneyTabLoadedStateHolder._isLoaded) {
                        }
                        rememberedValue19 = gapComposer2.rememberedValue();
                        if (rememberedValue19 == obj6) {
                        }
                        if (((Boolean) moneyTabPresenter62.isCardAnimationEnabled$delegate.getValue()).booleanValue()) {
                        }
                        RealFeatureFlagManager realFeatureFlagManager2 = (RealFeatureFlagManager) featureFlagManager22;
                        if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager2.peekCurrentValue(AmplitudeExperiments$InstalledAppletRedesign.INSTANCE)).enabled()) {
                        }
                        if (((Boolean) collectAsState3.getValue()).booleanValue()) {
                        }
                        gapComposer2.startReplaceGroup(694591972);
                        rememberedValue20 = gapComposer2.rememberedValue();
                        if (rememberedValue20 == obj6) {
                        }
                        boolean booleanValue22 = ((Boolean) rememberedValue20).booleanValue();
                        it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                            }
                        }
                        if (((ViewModel) obj2) != null) {
                        }
                        if (z4) {
                        }
                        if (list3 == null) {
                        }
                        MoneyTabModel.Loaded loaded2 = new MoneyTabModel.Loaded(tabToolbarInternalViewModel3, str4, alertBannerViewModel2, list3, parcelableSnapshotMutableIntState.getIntValue(), z3, z4 && ((Boolean) collectAsState2.getValue()).booleanValue() && !((Boolean) mutableState4.getValue()).booleanValue(), z13 ? (CardTheme.Identifier) collectAsState5.getValue() : null, z13, booleanValue22, nextAvailableCashTag22);
                        z5 = false;
                        gapComposer2.end(false);
                        obj3 = loaded2;
                        gapComposer2.end(z5);
                        return obj3;
                    }
                }
            }
        }
        z = true;
        rememberedValue = gapComposer3.rememberedValue();
        if (rememberedValue == obj6) {
        }
        z2 = z;
        MutableState collectAsState52 = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer3, 48, 2);
        rememberedValue2 = gapComposer3.rememberedValue();
        int i132 = 7;
        if (rememberedValue2 == obj6) {
        }
        int i142 = 14;
        int i152 = (i >> 3) & 14;
        Updater.LaunchedEffect(gapComposer3, moneyTabPresenter5, (Function2) rememberedValue2);
        changedInstance = gapComposer3.changedInstance(moneyTabPresenter5);
        rememberedValue3 = gapComposer3.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue3 = new GenieViewKt$GenieView$1$1(moneyTabPresenter5, (Continuation) null, 13);
        gapComposer3.updateRememberedValue(rememberedValue3);
        Updater.LaunchedEffect(gapComposer3, moneyTabPresenter5, (Function2) rememberedValue3);
        rememberedValue4 = gapComposer3.rememberedValue();
        if (rememberedValue4 == obj6) {
        }
        mutableState = (MutableState) rememberedValue4;
        rememberedValue5 = gapComposer3.rememberedValue();
        int i162 = 5;
        if (rememberedValue5 == obj6) {
        }
        int i172 = i152 | 48;
        SwipeKt.SwipeHandler(moneyTabPresenter5, (Function1) rememberedValue5, gapComposer3, i172);
        Unit unit22 = Unit.INSTANCE;
        Object[] objArr3 = {unit22};
        changedInstance2 = gapComposer3.changedInstance(moneyTabPresenter5);
        rememberedValue6 = gapComposer3.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue6 = new GenieViewKt$GenieView$1$1(moneyTabPresenter5, mutableState, null, i142);
        gapComposer3.updateRememberedValue(rememberedValue6);
        LifecycleKt.LifecycleLaunchedEffect(objArr3, null, null, (Function2) rememberedValue6, gapComposer3, 0);
        bool = (Boolean) mutableState2.getValue();
        bool.getClass();
        changed = gapComposer3.changed(z2) | gapComposer3.changedInstance(moneyTabPresenter5) | gapComposer3.changedInstance(arrayList13);
        rememberedValue7 = gapComposer3.rememberedValue();
        if (changed) {
        }
        bool2 = bool;
        gapComposer = gapComposer3;
        Object anonymousClass12 = new RoomDatabase$performClear$1.AnonymousClass1(z2, moneyTabPresenter5, mutableState3, arrayList13, (Continuation) null, 13);
        z3 = z2;
        moneyTabPresenter = moneyTabPresenter5;
        arrayList = arrayList13;
        gapComposer.updateRememberedValue(anonymousClass12);
        rememberedValue7 = anonymousClass12;
        Updater.LaunchedEffect(arrayList, bool2, (Function2) rememberedValue7, gapComposer);
        DragAndDrop_androidKt.AddViewAttributes(moneyTabPresenter.observabilityManager, MapsKt__MapsJVMKt.mapOf(new Pair("home_version", moneyTabPresenter.moneyContentSpanTrackingService.version)), gapComposer, 0);
        Object[] objArr22 = new Object[0];
        rememberedValue8 = gapComposer.rememberedValue();
        if (rememberedValue8 == obj6) {
        }
        MutableState mutableState42 = (MutableState) SaverKt.rememberSaveable(objArr22, (Function0) rememberedValue8, gapComposer, 48);
        changedInstance3 = gapComposer.changedInstance(moneyTabPresenter);
        rememberedValue9 = gapComposer.rememberedValue();
        if (!changedInstance3) {
        }
        rememberedValue9 = new MoneyTabPresenter$models$7$1(moneyTabPresenter, null, 0);
        gapComposer.updateRememberedValue(rememberedValue9);
        Updater.LaunchedEffect(gapComposer, unit22, (Function2) rememberedValue9);
        UiCallbackModel models22 = moneyTabPresenter.alertBannerPresenter.models(gapComposer);
        rememberedValue10 = gapComposer.rememberedValue();
        if (rememberedValue10 == obj6) {
        }
        arrayList2 = arrayList;
        MutableState collectAsState62 = Updater.collectAsState((Flow) rememberedValue10, null, null, gapComposer, 48, 2);
        alertBannerViewModel = (AlertBannerViewModel) models22.model;
        if (alertBannerViewModel == null) {
        }
        alertBannerViewModel2 = alertBannerViewModel;
        MutableState rememberUpdatedState62 = Updater.rememberUpdatedState(models22, gapComposer);
        MutableState rememberUpdatedState222 = Updater.rememberUpdatedState((WorkReviewTermsBanner$Config) collectAsState62.getValue(), gapComposer);
        MoneyTabPresenter$models$lambda$31$$inlined$map$1 moneyTabPresenter$models$lambda$31$$inlined$map$1222 = new MoneyTabPresenter$models$lambda$31$$inlined$map$1(flow, 6);
        Updater.LaunchedEffect(gapComposer, moneyTabPresenter$models$lambda$31$$inlined$map$1222, new AnimationsKt$takeUntil$1$1(moneyTabPresenter$models$lambda$31$$inlined$map$1222, (Continuation) null, moneyTabPresenter, rememberUpdatedState62, rememberUpdatedState222, 21));
        AmplitudeExperiments$ProjectMintHypeAnimations amplitudeExperiments$ProjectMintHypeAnimations22 = AmplitudeExperiments$ProjectMintHypeAnimations.INSTANCE;
        FeatureFlagManager featureFlagManager222 = moneyTabPresenter.featureFlagManager;
        MutableState collectExperimentAsState22 = ObjectUtils.collectExperimentAsState(featureFlagManager222, amplitudeExperiments$ProjectMintHypeAnimations22, gapComposer);
        if (Intrinsics.areEqual(((FeatureFlag$StringAmplitudeExperiment.Value) collectExperimentAsState22.getValue()).value, "all")) {
        }
        rememberedValue11 = gapComposer.rememberedValue();
        if (rememberedValue11 == obj6) {
        }
        MutableState collectAsState722 = Updater.collectAsState((StateFlow) rememberedValue11, null, gapComposer, 1);
        rememberedValue12 = gapComposer.rememberedValue();
        if (rememberedValue12 == obj6) {
        }
        Flow flow222 = (Flow) rememberedValue12;
        Boolean bool322 = Boolean.FALSE;
        gapComposer2 = gapComposer;
        collectAsState = Updater.collectAsState(flow222, bool322, null, gapComposer2, 48, 2);
        str = ((JsonFeatureFlags$MintHypeDrop.HypeDropData) ((FeatureFlag$JsonFeatureFlag.Options) collectAsState722.getValue()).value).symbol;
        if (str == null) {
        }
        obj = ((JsonFeatureFlags$MintHypeDrop.HypeDropData) ((FeatureFlag$JsonFeatureFlag.Options) collectAsState722.getValue()).value).token;
        changed2 = gapComposer2.changed(obj);
        rememberedValue13 = gapComposer2.rememberedValue();
        if (!changed2) {
        }
        if (obj != null) {
        }
        Object appLockMonitor$special$$inlined$map$222 = new AppLockMonitor$special$$inlined$map$2(bool322, 19);
        rememberedValue13 = appLockMonitor$special$$inlined$map$222;
        gapComposer2.updateRememberedValue(rememberedValue13);
        Flow flow322 = (Flow) rememberedValue13;
        if (obj != null) {
        }
        String str522 = str;
        boolean z1122 = z10;
        MutableState collectAsState822 = Updater.collectAsState(flow322, Boolean.valueOf(booleanValue), null, gapComposer2, 0, 2);
        if (((Boolean) collectAsState.getValue()).booleanValue()) {
        }
        nextAvailableCashTag = null;
        MutableState rememberUpdatedState322 = Updater.rememberUpdatedState(nextAvailableCashTag, gapComposer2);
        MutableState rememberUpdatedState422 = Updater.rememberUpdatedState(((JsonFeatureFlags$MintHypeDrop.HypeDropData) ((FeatureFlag$JsonFeatureFlag.Options) collectAsState722.getValue()).value).launchAtMillis, gapComposer2);
        MutableState rememberUpdatedState522 = Updater.rememberUpdatedState(obj, gapComposer2);
        rememberedValue14 = gapComposer2.rememberedValue();
        if (rememberedValue14 == obj6) {
        }
        CoroutineScope coroutineScope22 = (CoroutineScope) rememberedValue14;
        NextAvailableCashTag nextAvailableCashTag222 = nextAvailableCashTag;
        final MoneyTabPresenter moneyTabPresenter622 = moneyTabPresenter;
        Updater.LaunchedEffect(gapComposer2, flow, new ZiplineLoader$load$2(flow, (Continuation) null, moneyTabPresenter622, coroutineScope22, mutableState42, rememberUpdatedState322, rememberUpdatedState522, rememberUpdatedState422, 21));
        rememberedValue15 = gapComposer2.rememberedValue();
        if (rememberedValue15 == obj6) {
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState222 = (ParcelableSnapshotMutableIntState) rememberedValue15;
        rememberedValue16 = gapComposer2.rememberedValue();
        if (rememberedValue16 == obj6) {
        }
        RenavigationKt.RenavigationHandler(moneyTabPresenter622, (Function0) rememberedValue16, gapComposer2, i172);
        changed3 = gapComposer2.changed(arrayList2);
        rememberedValue17 = gapComposer2.rememberedValue();
        if (!changed3) {
        }
        ArrayList arrayList1422 = new ArrayList(arrayList2.size());
        size = arrayList2.size();
        while (i3 < size) {
        }
        rememberedValue17 = CollectionsKt.sortedWith(arrayList1422, MoneySectionSorter.INSTANCE);
        gapComposer2.updateRememberedValue(rememberedValue17);
        list = (List) rememberedValue17;
        changed4 = gapComposer2.changed(list);
        Object rememberedValue3122 = gapComposer2.rememberedValue();
        Object obj822 = rememberedValue3122;
        if (!changed4) {
        }
        ArrayList arrayList1522 = new ArrayList(list.size());
        size2 = list.size();
        while (i4 < size2) {
        }
        gapComposer2.updateRememberedValue(arrayList1522);
        obj822 = arrayList1522;
        List list822 = (List) obj822;
        RealCardAppletTileRepository realCardAppletTileRepository22 = (RealCardAppletTileRepository) moneyTabPresenter622.cardAppletTileRepository;
        collectAsState2 = Updater.collectAsState(realCardAppletTileRepository22.isCardReadyToAnimate, null, gapComposer2, 1);
        if (arrayList2.isEmpty()) {
        }
        rememberedValue18 = gapComposer2.rememberedValue();
        moneyTabLoadedStateHolder = moneyTabPresenter622.moneyTabLoadedStateHolder;
        if (rememberedValue18 == obj6) {
        }
        collectAsState3 = Updater.collectAsState((StateFlow) rememberedValue18, null, gapComposer2, i5);
        if (moneyTabLoadedStateHolder._isLoaded) {
        }
        rememberedValue19 = gapComposer2.rememberedValue();
        if (rememberedValue19 == obj6) {
        }
        if (((Boolean) moneyTabPresenter622.isCardAnimationEnabled$delegate.getValue()).booleanValue()) {
        }
        RealFeatureFlagManager realFeatureFlagManager22 = (RealFeatureFlagManager) featureFlagManager222;
        if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager22.peekCurrentValue(AmplitudeExperiments$InstalledAppletRedesign.INSTANCE)).enabled()) {
        }
        if (((Boolean) collectAsState3.getValue()).booleanValue()) {
        }
        gapComposer2.startReplaceGroup(694591972);
        rememberedValue20 = gapComposer2.rememberedValue();
        if (rememberedValue20 == obj6) {
        }
        boolean booleanValue222 = ((Boolean) rememberedValue20).booleanValue();
        it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        if (((ViewModel) obj2) != null) {
        }
        if (z4) {
        }
        if (list3 == null) {
        }
        MoneyTabModel.Loaded loaded22 = new MoneyTabModel.Loaded(tabToolbarInternalViewModel3, str4, alertBannerViewModel2, list3, parcelableSnapshotMutableIntState.getIntValue(), z3, z4 && ((Boolean) collectAsState2.getValue()).booleanValue() && !((Boolean) mutableState42.getValue()).booleanValue(), z13 ? (CardTheme.Identifier) collectAsState52.getValue() : null, z13, booleanValue222, nextAvailableCashTag222);
        z5 = false;
        gapComposer2.end(false);
        obj3 = loaded22;
        gapComposer2.end(z5);
        return obj3;
    }
}
