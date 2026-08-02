package com.squareup.cash.profile.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.net.Uri;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.core.app.NotificationCompat;
import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.broadway.screen.Screen;
import app.cash.molecule.MoleculeKt$immediateClockFlow$1$1$1;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.zipline.loader.ZiplineLoader$load$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmh;
import com.squareup.cash.R;
import com.squareup.cash.account.types.PrincipalAccountToken;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.presenters.ActivityEmbeddedPresenter$Companion;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler$Factory$Impl;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewModel;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.treehouse.SearchBarBinding$Content$1$1;
import com.squareup.cash.banking.presenters.BalanceHomePresenter$models$lambda$14$$inlined$map$1;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$special$$inlined$filter$1;
import com.squareup.cash.bitcoin.presenters.BitcoinQrCodeScannerPresenter$State;
import com.squareup.cash.bitcoin.presenters.BitcoinQrCodeScannerPresenter$handleInvoice$1;
import com.squareup.cash.bitcoin.presenters.BitcoinQrCodeScannerPresenter$models$$inlined$CollectEffect$3;
import com.squareup.cash.bitcoin.presenters.BitcoinQrCodeScannerPresenter$processCode$1;
import com.squareup.cash.bitcoin.presenters.ProcessAddressResult;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.bitcoin.screens.BitcoinQrCodeScannerScreen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.businessaccount.kybrestriction.presenters.KybRestrictionBannerPresenter$AssistedInjectionFactory$Impl;
import com.squareup.cash.cdf.asset.Origin;
import com.squareup.cash.cdf.crypto.ContentType;
import com.squareup.cash.cdf.crypto.CryptoSendPasteAddress;
import com.squareup.cash.cdf.crypto.CryptoSendScanQr;
import com.squareup.cash.cdf.customerprofile.CustomerProfileViewOpen;
import com.squareup.cash.cdf.performance.PerformanceMeasureScrollPerformance;
import com.squareup.cash.cdf.recipient.RecipientSearchAddContact;
import com.squareup.cash.cdf.recipient.RecipientSearchViewBlocker;
import com.squareup.cash.cdf.stock.ScreenSource;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clipboard.RealClipboardObserver;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.address.RealCryptoInvoiceParser;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.crypto.navigation.CryptoPayment;
import com.squareup.cash.crypto.navigation.CryptoPaymentSource;
import com.squareup.cash.crypto.navigation.RealCryptoFlowStarter;
import com.squareup.cash.crypto.primitives.CryptoPaymentOrigin;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.contacts.RealContactSync$syncRequest$2;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.db.contacts.RecipientPaymentInfo;
import com.squareup.cash.db.contacts.RecipientType;
import com.squareup.cash.db.contacts.SendableUiCustomerFactory;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.family.familyhub.backend.api.FamilyParsingErrorFactory;
import com.squareup.cash.family.familyhub.backend.real.RealDependentAllowanceManager;
import com.squareup.cash.family.familyhub.backend.real.RealDependentBalanceDetailLoggingManager;
import com.squareup.cash.family.familyhub.backend.real.RealDependentCustomerTokenRepository;
import com.squareup.cash.family.familyhub.backend.real.RealDependentPortfolioStore;
import com.squareup.cash.family.familyhub.presenters.SponsorDetailPresenter$WhenMappings;
import com.squareup.cash.family.familyhub.screens.SponsorDetailScreen;
import com.squareup.cash.family.familyhub.viewmodels.AllowanceSectionViewModel;
import com.squareup.cash.family.familyhub.viewmodels.BadgeName;
import com.squareup.cash.family.familyhub.viewmodels.DependentGraduationViewModel;
import com.squareup.cash.family.familyhub.viewmodels.SponsorDetail;
import com.squareup.cash.family.familyhub.viewmodels.SponsorDetailViewModel;
import com.squareup.cash.favorites.data.RealFavoritesManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$BitcoinStablecoinMvp;
import com.squareup.cash.featureflags.AmplitudeExperiments$CoreP2pFlowRedesign;
import com.squareup.cash.featureflags.AmplitudeExperiments$P2pPools;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$AllowSlices;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$P2pCoreFlowPersonFirst;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$PoolsContributeControl;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$SponsorDrivenBlockingPhase_4;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1;
import com.squareup.cash.graphics.swampgl.components.Transform$special$$inlined$map$1;
import com.squareup.cash.history.backend.real.RealInvestmentActivity;
import com.squareup.cash.history.navigation.PaymentActionHandler;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.investing.backend.real.RealInvestingHistoricalData;
import com.squareup.cash.investing.backend.real.RealInvestingStateManager;
import com.squareup.cash.investing.backend.real.RealInvestingSyncer;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities;
import com.squareup.cash.investing.backend.real.analytics.RealInvestingAnalytics;
import com.squareup.cash.investing.backend.real.families.RealDependentInvestmentEntities;
import com.squareup.cash.investing.components.InvestingHomeView$onScrollFlow$1;
import com.squareup.cash.investing.presenters.InvestingDiscoveryPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.InvestingDiscoveryPresenter$MetroFactory;
import com.squareup.cash.investing.presenters.InvestingDiscoverySectionsPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.InvestingHomePresenter$ViewModelFilter;
import com.squareup.cash.investing.presenters.InvestingHomePresenter$openCategoryDetailsScreen$1;
import com.squareup.cash.investing.presenters.InvestingPortfolioPresenter;
import com.squareup.cash.investing.presenters.InvestingPortfolioPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.StockMetricFactory;
import com.squareup.cash.investing.presenters.families.InvestingDependentActivityPresenter$Factory$Impl;
import com.squareup.cash.investing.presenters.families.InvestingDependentAutoInvestPresenter$Factory$Impl;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.investing.primitives.InvestingState;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewEvent;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewModel;
import com.squareup.cash.investingcrypto.presenters.news.InvestingCryptoNewsPresenter$Factory$Impl;
import com.squareup.cash.invitations.InviteContactsPresenter$filterContacts$$inlined$map$1;
import com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.multiplatform.accentcolors.AccentColorsKt;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.offers.presenters.OffersHomePresenter$models$8$1;
import com.squareup.cash.p2pblocking.presenters.RealAllowlistRepository;
import com.squareup.cash.p2pblocking.presenters.SelectCustomerPresenter;
import com.squareup.cash.payments.common.PaymentRecipient;
import com.squareup.cash.payments.navigation.real.RealPaymentsInboundNavigator$Factory$Impl;
import com.squareup.cash.payments.screens.PaymentConfigurationFlow;
import com.squareup.cash.payments.screens.PaymentFlowData;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.payments.views.MainPaymentView$Content$2$1;
import com.squareup.cash.performance.ScrollPerformanceAnalyzer$Factory$Impl;
import com.squareup.cash.permissions.AndroidPermissionChecker$create$1$denied$$inlined$filter$1;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.permissions.AndroidPermissionManager$create$1;
import com.squareup.cash.permissions.ReadOnlyPermissions;
import com.squareup.cash.pools.backend.api.LoadPoolStatus;
import com.squareup.cash.pools.backend.real.RealPoolsRepository;
import com.squareup.cash.pools.presenters.PoolDetailsPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.presenters.PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1;
import com.squareup.cash.pools.screens.PoolDetailsScreen;
import com.squareup.cash.pools.viewmodels.ContributionAnimation;
import com.squareup.cash.pools.viewmodels.PoolDetailsViewModel;
import com.squareup.cash.portfolio.graphs.RealInvestingGraphCalculator;
import com.squareup.cash.presenters.AliasFormatter;
import com.squareup.cash.presenters.RecipientAvatars;
import com.squareup.cash.profile.repo.api.CustomerProfileData;
import com.squareup.cash.profile.repo.api.CustomerProfileDetails;
import com.squareup.cash.profile.repo.real.RealProfileRepo;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.GenericProfileElementViewModel;
import com.squareup.cash.profile.viewmodels.GenericProfileElementsViewModel$Success;
import com.squareup.cash.profile.viewmodels.NavigationIcon;
import com.squareup.cash.profile.viewmodels.ProfileHeaderViewModel;
import com.squareup.cash.profile.viewmodels.ProfileViewModel;
import com.squareup.cash.profile.viewmodels.ProfileViewModel$Loaded$ProfileBody$Loaded;
import com.squareup.cash.profile.viewmodels.ProfileViewModel$Loaded$ProfileBody$Loading;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter$special$$inlined$filter$1;
import com.squareup.cash.qrcodes.viewmodels.CameraState;
import com.squareup.cash.qrcodes.viewmodels.QrAddressScannerViewModel;
import com.squareup.cash.recipients.analytics.RecipientAnalyticsKt;
import com.squareup.cash.recipients.backend.api.SuggestionStrategy;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.cash.recipients.data.UtilsKt;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.screens.RedactedParcelable;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.scrubbing.DateScrubber$$ExternalSyntheticLambda0;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.upsell.presenters.NullStateSwipeConfigProvider;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.cash.util.cache.Cache;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.moshi.LinkedHashTreeMap;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import com.squareup.protos.cash.aegis.sync_values.GraduationCta;
import com.squareup.protos.cash.aegis.sync_values.LinkText;
import com.squareup.protos.cash.aegis.sync_values.Sponsor;
import com.squareup.protos.cash.aegis.sync_values.SponsorshipState;
import com.squareup.protos.cash.pools.MoneyPool;
import com.squareup.protos.cash.pools.MoneyPoolVisitOrigin;
import com.squareup.protos.cash.pools.PoolGoalState;
import com.squareup.protos.cash.pools.PoolOwner;
import com.squareup.protos.cash.pools.PoolParticipant;
import com.squareup.protos.cash.pools.PoolParticipantType;
import com.squareup.protos.cash.pools.PoolState;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.AppCreationActivity;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.squareup.scannerview.SizeMap;
import com.squareup.util.cash.Cashtags;
import com.squareup.util.cash.ColorsKt;
import com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1;
import com.squareup.wire.GrpcStatus;
import com.squareup.wire.MoshiJsonIntegration;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import designsystem.arcade.ArcadeColors;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import okhttp3.internal.Tags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.InputEventTrigger;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ProfilePresenter implements MoleculePresenter, HasObservability {
    public final /* synthetic */ int $r8$classId = 3;
    public final Object allowlistRepository;
    public final Analytics analytics;
    public final Object externalPaymentId;
    public final Object favoritesManager;
    public final Object featureFlagManager;
    public final Object genericProfileElementsPresenter;
    public final Object jurisdictionConfigManager;
    public final BetterNavigator.ScreenNavigator navigator;
    public final Object paymentsInboundNavigator;
    public final Object principalAccountToken;
    public final Object profileDetailsProvider;
    public final Object profileRepo;
    public final Object screen;
    public final Object stringManager;

    /* JADX WARN: Multi-variable type inference failed */
    public ProfilePresenter(LocalizedMoneyFormatter.Factory factory, RealPoolsRepository realPoolsRepository, AndroidStringManager androidStringManager, SessionManager sessionManager, IntentLauncher intentLauncher, FlowStarter flowStarter, AndroidDateFormatManager androidDateFormatManager, AndroidClock androidClock, Analytics analytics, FeatureFlagManager featureFlagManager, RealUuidGenerator realUuidGenerator, RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl, RealActivitiesCacheManager realActivitiesCacheManager, DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl, PoolDetailsScreen poolDetailsScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        poolDetailsScreen.getClass();
        String str = poolDetailsScreen.token;
        this.profileRepo = realPoolsRepository;
        this.stringManager = androidStringManager;
        this.jurisdictionConfigManager = sessionManager;
        this.favoritesManager = intentLauncher;
        this.principalAccountToken = flowStarter;
        this.allowlistRepository = androidDateFormatManager;
        this.screen = androidClock;
        this.analytics = analytics;
        this.featureFlagManager = featureFlagManager;
        this.paymentsInboundNavigator = poolDetailsScreen;
        this.navigator = screenNavigator;
        this.externalPaymentId = factory.create(MoneyFormatterConfig.COMPACT);
        String str2 = poolDetailsScreen.flowToken;
        this.profileDetailsProvider = str2 == null ? re$$ExternalSyntheticOutline0.m() : str2;
        int i = 12;
        this.genericProfileElementsPresenter = realActivityEmbeddedPresenter$Factory$Impl.create(screenNavigator, ActivityEmbeddedPresenter$Companion.FilteredFeedConfiguration$default(new ActivitiesManager.ActivityContext(new ActivityToken(ActivityTokenType.P2P_POOL_TOKEN, str, (String) null, i), ActivityScope.P2P_POOLS, (ActivitiesManager.ActivityPageHandler) (0 == true ? 1 : 0), i), RealActivitiesCacheManager.take$default(realActivitiesCacheManager, str), poolDetailsScreen, false, null, InputEventTrigger.Companion.decoratedWith(defaultActivityItemEventHandler$Factory$Impl, new SizeMap(new PoolDetailsPresenter$$ExternalSyntheticLambda0(this, 1), 25)), null, null, null, 7592));
    }

    public static final MoneyPoolVisitOrigin access$getOriginForLeavePool(ProfilePresenter profilePresenter, String str) {
        String str2;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            str2 = StringsKt.trim(lowerCase).toString();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return null;
        }
        switch (str2.hashCode()) {
            case -1833415331:
                if (str2.equals("enriched_receipt")) {
                    return MoneyPoolVisitOrigin.MONEY_POOL_VISIT_ORIGIN_ENRICHED_RECEIPT;
                }
                return null;
            case -1655966961:
                if (str2.equals("activity")) {
                    return MoneyPoolVisitOrigin.MONEY_POOL_VISIT_ORIGIN_ACTIVITY_FEED;
                }
                return null;
            case 114009:
                if (str2.equals("sms")) {
                    return MoneyPoolVisitOrigin.MONEY_POOL_VISIT_ORIGIN_SMS;
                }
                return null;
            case 3452698:
                if (str2.equals("push")) {
                    return MoneyPoolVisitOrigin.MONEY_POOL_VISIT_ORIGIN_PUSH;
                }
                return null;
            case 96619420:
                if (str2.equals("email")) {
                    return MoneyPoolVisitOrigin.MONEY_POOL_VISIT_ORIGIN_EMAIL;
                }
                return null;
            case 109400031:
                if (str2.equals("share")) {
                    return MoneyPoolVisitOrigin.MONEY_POOL_VISIT_ORIGIN_SHARE_LINK;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$openCategoryDetailsScreen(ProfilePresenter profilePresenter, InvestingHomeViewEvent.SelectCategory selectCategory, ContinuationImpl continuationImpl) {
        InvestingHomePresenter$openCategoryDetailsScreen$1 investingHomePresenter$openCategoryDetailsScreen$1;
        int i;
        if (continuationImpl instanceof InvestingHomePresenter$openCategoryDetailsScreen$1) {
            investingHomePresenter$openCategoryDetailsScreen$1 = (InvestingHomePresenter$openCategoryDetailsScreen$1) continuationImpl;
            int i2 = investingHomePresenter$openCategoryDetailsScreen$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                investingHomePresenter$openCategoryDetailsScreen$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = investingHomePresenter$openCategoryDetailsScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = investingHomePresenter$openCategoryDetailsScreen$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealInvestingAnalytics realInvestingAnalytics = (RealInvestingAnalytics) profilePresenter.allowlistRepository;
                    CategoryToken categoryToken = selectCategory.token;
                    ScreenSource screenSource = ScreenSource.PORTFOLIO;
                    investingHomePresenter$openCategoryDetailsScreen$1.L$0 = selectCategory;
                    investingHomePresenter$openCategoryDetailsScreen$1.label = 1;
                    if (realInvestingAnalytics.trackStockSelectCategory(categoryToken, screenSource, null, investingHomePresenter$openCategoryDetailsScreen$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    selectCategory = investingHomePresenter$openCategoryDetailsScreen$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                profilePresenter.navigator.goTo(new InvestingScreens.CategoryDetailScreen(selectCategory.token));
                return Unit.INSTANCE;
            }
        }
        investingHomePresenter$openCategoryDetailsScreen$1 = new InvestingHomePresenter$openCategoryDetailsScreen$1(profilePresenter, continuationImpl);
        Object obj2 = investingHomePresenter$openCategoryDetailsScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = investingHomePresenter$openCategoryDetailsScreen$1.label;
        if (i != 0) {
        }
        profilePresenter.navigator.goTo(new InvestingScreens.CategoryDetailScreen(selectCategory.token));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x005b, code lost:
    
        if (r10 == r2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0070, code lost:
    
        if (r10 == r2) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$processCode(ProfilePresenter profilePresenter, BitcoinQrCodeScannerPresenter$State.ProcessingCode processingCode, ContinuationImpl continuationImpl) {
        BitcoinQrCodeScannerPresenter$processCode$1 bitcoinQrCodeScannerPresenter$processCode$1;
        Enum r2;
        int i;
        BitcoinPayments bitcoinPayments;
        int ordinal;
        CryptoPaymentSource cryptoPaymentSource;
        int ordinal2;
        Analytics analytics = profilePresenter.analytics;
        if (continuationImpl instanceof BitcoinQrCodeScannerPresenter$processCode$1) {
            bitcoinQrCodeScannerPresenter$processCode$1 = (BitcoinQrCodeScannerPresenter$processCode$1) continuationImpl;
            int i2 = bitcoinQrCodeScannerPresenter$processCode$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                bitcoinQrCodeScannerPresenter$processCode$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = bitcoinQrCodeScannerPresenter$processCode$1.result;
                r2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bitcoinQrCodeScannerPresenter$processCode$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((BitcoinQrCodeScannerScreen) profilePresenter.allowlistRepository).supportStablecoin) {
                        RealCryptoInvoiceParser realCryptoInvoiceParser = (RealCryptoInvoiceParser) profilePresenter.jurisdictionConfigManager;
                        String str = processingCode.code;
                        bitcoinQrCodeScannerPresenter$processCode$1.L$0 = processingCode;
                        bitcoinQrCodeScannerPresenter$processCode$1.label = 1;
                        obj = realCryptoInvoiceParser.parse(str, true, bitcoinQrCodeScannerPresenter$processCode$1);
                    } else {
                        RealCryptoInvoiceParser realCryptoInvoiceParser2 = (RealCryptoInvoiceParser) profilePresenter.profileRepo;
                        String str2 = processingCode.code;
                        bitcoinQrCodeScannerPresenter$processCode$1.L$0 = processingCode;
                        bitcoinQrCodeScannerPresenter$processCode$1.label = 2;
                        obj = realCryptoInvoiceParser2.parse(str2, true, bitcoinQrCodeScannerPresenter$processCode$1);
                    }
                }
                if (i == 1) {
                    processingCode = bitcoinQrCodeScannerPresenter$processCode$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    bitcoinPayments = (BitcoinPayments) obj;
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    processingCode = bitcoinQrCodeScannerPresenter$processCode$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    bitcoinPayments = (BitcoinPayments) obj;
                }
                if ((bitcoinPayments instanceof BitcoinPayments.Bitcoin) && !(bitcoinPayments instanceof BitcoinPayments.Lightning)) {
                    if (bitcoinPayments instanceof BitcoinPayments.Ethereum) {
                        return profilePresenter.handleStablecoinPayment(((BitcoinPayments.Ethereum) bitcoinPayments).ethereumAddress.data);
                    }
                    if (bitcoinPayments instanceof BitcoinPayments.Stablecoin) {
                        return profilePresenter.handleStablecoinPayment(((BitcoinPayments.Stablecoin) bitcoinPayments).address.data);
                    }
                    int ordinal3 = processingCode.source.ordinal();
                    if (ordinal3 == 0) {
                        trackScanQr(analytics, null);
                    } else {
                        if (ordinal3 != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        trackPasteAddress(analytics, null);
                    }
                    return ProcessAddressResult.SHOW_ERROR_DIALOG;
                }
                bitcoinQrCodeScannerPresenter$processCode$1.L$0 = null;
                bitcoinQrCodeScannerPresenter$processCode$1.label = 3;
                ordinal = processingCode.source.ordinal();
                if (ordinal != 0) {
                    cryptoPaymentSource = CryptoPaymentSource.CRYPTO_SCANNER_QR_CODE;
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    cryptoPaymentSource = CryptoPaymentSource.CRYPTO_SCANNER_MANUAL_PASTE;
                }
                ordinal2 = processingCode.source.ordinal();
                if (ordinal2 != 0) {
                    trackScanQr(analytics, bitcoinPayments);
                } else {
                    if (ordinal2 != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    trackPasteAddress(analytics, bitcoinPayments);
                }
                Enum handleInvoice = profilePresenter.handleInvoice(bitcoinPayments, cryptoPaymentSource, bitcoinQrCodeScannerPresenter$processCode$1);
                return handleInvoice != r2 ? r2 : handleInvoice;
            }
        }
        bitcoinQrCodeScannerPresenter$processCode$1 = new BitcoinQrCodeScannerPresenter$processCode$1(profilePresenter, continuationImpl);
        Object obj2 = bitcoinQrCodeScannerPresenter$processCode$1.result;
        r2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bitcoinQrCodeScannerPresenter$processCode$1.label;
        if (i != 0) {
        }
        if (bitcoinPayments instanceof BitcoinPayments.Bitcoin) {
        }
        bitcoinQrCodeScannerPresenter$processCode$1.L$0 = null;
        bitcoinQrCodeScannerPresenter$processCode$1.label = 3;
        ordinal = processingCode.source.ordinal();
        if (ordinal != 0) {
        }
        ordinal2 = processingCode.source.ordinal();
        if (ordinal2 != 0) {
        }
        Enum handleInvoice2 = profilePresenter.handleInvoice(bitcoinPayments, cryptoPaymentSource, bitcoinQrCodeScannerPresenter$processCode$1);
        if (handleInvoice2 != r2) {
        }
    }

    public static final void access$showInvalidCryptoAddressDialog(ProfilePresenter profilePresenter, BitcoinQrCodeScannerPresenter$State.ProcessingCode.CodeSource codeSource, boolean z) {
        AndroidStringManager androidStringManager = (AndroidStringManager) profilePresenter.stringManager;
        BetterNavigator.ScreenNavigator screenNavigator = profilePresenter.navigator;
        int ordinal = codeSource.ordinal();
        int i = 10;
        String str = null;
        if (ordinal == 0) {
            screenNavigator.goTo(Back.INSTANCE);
            screenNavigator.goTo(new ProfileScreens.ErrorScreen(androidStringManager.get(z ? R.string.please_scan_valid_bitcoin_or_lightning_address : R.string.please_scan_valid_bitcoin_address), str, i));
        } else if (ordinal == 1) {
            screenNavigator.goTo(new ProfileScreens.ErrorScreen(androidStringManager.get(z ? R.string.please_paste_valid_bitcoin_or_lightning_address : R.string.please_paste_valid_bitcoin_address), str, i));
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    private final Object models$com$squareup$cash$family$familyhub$presenters$SponsorDetailPresenter(Flow flow, Composer composer, int i) {
        DependentGraduationViewModel dependentGraduationViewModel;
        SponsorDetail sponsorDetail;
        String str;
        String str2;
        DependentGraduationViewModel dependentGraduationViewModel2;
        String str3 = (String) this.genericProfileElementsPresenter;
        SponsorDetailScreen sponsorDetailScreen = (SponsorDetailScreen) this.screen;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1954998005);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = ((RealCustomerStore) this.profileRepo).getCustomerForId(str3);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
        Sponsor sponsor = sponsorDetailScreen.sponsor;
        SponsorshipState sponsorshipState = sponsor.status;
        boolean changed = gapComposer.changed(sponsorshipState == null ? -1 : sponsorshipState.ordinal());
        Object rememberedValue2 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changed || rememberedValue2 == neverEqualPolicy) {
            SponsorshipState sponsorshipState2 = sponsor.status;
            rememberedValue2 = (sponsorshipState2 == null ? -1 : SponsorDetailPresenter$WhenMappings.$EnumSwitchMapping$0[sponsorshipState2.ordinal()]) == 1 ? new AppLockMonitor$special$$inlined$map$2(continuation, 19) : FlowKt.flowOn(new Transform$special$$inlined$map$1(((RealDependentAllowanceManager) this.favoritesManager).getAllowance(str3, PlatformKt.activeAccountToken((SessionManager) this.jurisdictionConfigManager)), this, 6), (CoroutineContext) this.paymentsInboundNavigator);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue2, null, null, gapComposer, 48, 2);
        Updater.LaunchedEffect(gapComposer, flow, new RealFidesmoClient$observeDeviceState$1(flow, continuation, this, collectAsState2, 15));
        Recipient recipient = (Recipient) collectAsState.getValue();
        AllowanceSectionViewModel allowanceSectionViewModel = (AllowanceSectionViewModel) collectAsState2.getValue();
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        GraduationCta graduationCta = sponsor.graduation_cta;
        SponsorshipState sponsorshipState3 = sponsor.status;
        if (graduationCta != null) {
            FamilyParsingErrorFactory familyParsingErrorFactory = FamilyParsingErrorFactory.INSTANCE;
            try {
                ProtoValidationScope protoValidationScope = new ProtoValidationScope(sponsor, familyParsingErrorFactory, this);
                Image image = graduationCta.image;
                String str4 = (String) protoValidationScope.reportIfNullAndContinue("graduation_cta.title", (String) null, graduationCta.title);
                if (str4 != null && (str = (String) protoValidationScope.reportIfNullAndContinue("graduation_cta.subtext", (String) null, graduationCta.subtext)) != null && (str2 = (String) protoValidationScope.reportIfNullAndContinue("graduation_cta.button_text", (String) null, graduationCta.button_text)) != null) {
                    dependentGraduationViewModel2 = new DependentGraduationViewModel(image, str4, str, str2);
                    dependentGraduationViewModel = dependentGraduationViewModel2;
                }
                dependentGraduationViewModel2 = null;
                dependentGraduationViewModel = dependentGraduationViewModel2;
            } catch (Exception e) {
                throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(Sponsor.class), familyParsingErrorFactory, null);
            }
        } else {
            dependentGraduationViewModel = null;
        }
        if (recipient != null) {
            StackedAvatarViewModel.Single single = new StackedAvatarViewModel.Single(GrpcStatus.Companion.toStackedAvatar(RecipientAvatars.avatarViewModel(recipient)));
            String str5 = (sponsorshipState3 != null ? SponsorDetailPresenter$WhenMappings.$EnumSwitchMapping$0[sponsorshipState3.ordinal()] : -1) == 1 ? androidStringManager.get(R.string.family_account_sponsor_detail_view_sponsor_introduction_text_pending) : androidStringManager.get(R.string.family_account_sponsor_detail_view_sponsor_introduction_text_established);
            BadgeName badgeName = new BadgeName(recipient.getFirstName(), recipient.fullName, recipient.isBusiness, recipient.isVerified);
            LinkText linkText = sponsor.primary_cta;
            String str6 = linkText != null ? linkText.text : null;
            if (str6 == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return null;
            }
            sponsorDetail = new SponsorDetail(single, str5, badgeName, str6, (sponsorshipState3 == SponsorshipState.PENDING || recipient.cashtag == null) ? false : true);
        } else {
            sponsorDetail = null;
        }
        SponsorDetailViewModel sponsorDetailViewModel = new SponsorDetailViewModel(dependentGraduationViewModel, sponsorDetail, allowanceSectionViewModel, androidStringManager.get(R.string.family_account_sponsor_detail_view_invite_friends_section_title), new Image("https://cash-f.squarecdn.com/static/families/families-null-state-share-light-v3.png", "https://cash-f.squarecdn.com/static/families/families-null-state-share-dark-v3.png", 4), androidStringManager.get(R.string.family_account_sponsor_detail_view_invite_friends_promotion_title), androidStringManager.get(R.string.family_account_sponsor_detail_view_invite_friends_promotion_subtitle), androidStringManager.get(R.string.family_account_sponsor_detail_view_invite_friends_button_title));
        gapComposer.end(false);
        return sponsorDetailViewModel;
    }

    private final Object models$com$squareup$cash$investing$presenters$InvestingHomePresenter(Flow flow, Composer composer, int i) {
        BetterNavigator.ScreenNavigator screenNavigator;
        Cache cache;
        GapComposer gapComposer;
        MoleculePresenter moleculePresenter;
        NeverEqualPolicy neverEqualPolicy;
        InvestingScreens.InvestingHome investingHome;
        InvestingHomePresenter$ViewModelFilter investingHomePresenter$ViewModelFilter;
        Cache cache2;
        InvestingHomeViewModel investingHomeViewModel;
        Cache cache3 = (Cache) this.paymentsInboundNavigator;
        InvestingScreens.InvestingHome investingHome2 = (InvestingScreens.InvestingHome) this.profileDetailsProvider;
        flow.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startReplaceGroup(724305928);
        Object rememberedValue = gapComposer2.rememberedValue();
        int i2 = 1;
        NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy2) {
            BalanceHomePresenter$models$lambda$14$$inlined$map$1 balanceHomePresenter$models$lambda$14$$inlined$map$1 = new BalanceHomePresenter$models$lambda$14$$inlined$map$1(((RealFeatureFlagManager) ((FeatureFlagManager) this.featureFlagManager)).peekValues(LaunchDarklyFeatureFlags$AllowSlices.INSTANCE), i2);
            gapComposer2.updateRememberedValue(balanceHomePresenter$models$lambda$14$$inlined$map$1);
            rememberedValue = balanceHomePresenter$models$lambda$14$$inlined$map$1;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, Boolean.FALSE, null, gapComposer2, 48, 2);
        Object rememberedValue2 = gapComposer2.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy2) {
            InviteContactsPresenter$filterContacts$$inlined$map$1 inviteContactsPresenter$filterContacts$$inlined$map$1 = new InviteContactsPresenter$filterContacts$$inlined$map$1((Flow) this.principalAccountToken, 4);
            gapComposer2.updateRememberedValue(inviteContactsPresenter$filterContacts$$inlined$map$1);
            rememberedValue2 = inviteContactsPresenter$filterContacts$$inlined$map$1;
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue2, Boolean.TRUE, null, gapComposer2, 48, 2);
        Object rememberedValue3 = gapComposer2.rememberedValue();
        BetterNavigator.ScreenNavigator screenNavigator2 = this.navigator;
        if (rememberedValue3 == neverEqualPolicy2) {
            InvestingDiscoveryPresenter$MetroFactory investingDiscoveryPresenter$MetroFactory = ((InvestingDiscoveryPresenter$Factory$Impl) this.stringManager).delegateFactory;
            AndroidStringManager androidStringManager = (AndroidStringManager) investingDiscoveryPresenter$MetroFactory.stringManager.lambda.invoke();
            CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) investingDiscoveryPresenter$MetroFactory.database.getValue();
            InvestingCryptoNewsPresenter$Factory$Impl investingCryptoNewsPresenter$Factory$Impl = (InvestingCryptoNewsPresenter$Factory$Impl) investingDiscoveryPresenter$MetroFactory.newsPresenterFactory.invoke();
            CoroutineContext coroutineContext = (CoroutineContext) investingDiscoveryPresenter$MetroFactory.ioDispatcher.lambda.invoke();
            InvestingDiscoverySectionsPresenter$Factory$Impl investingDiscoverySectionsPresenter$Factory$Impl = (InvestingDiscoverySectionsPresenter$Factory$Impl) investingDiscoveryPresenter$MetroFactory.discoverySectionsPresenterFactory.invoke();
            RealInvestingStateManager realInvestingStateManager = (RealInvestingStateManager) investingDiscoveryPresenter$MetroFactory.investingStateManager.invoke();
            FeatureFlagManager featureFlagManager = (FeatureFlagManager) investingDiscoveryPresenter$MetroFactory.featureFlagManager.getValue();
            Cache cache4 = (Cache) investingDiscoveryPresenter$MetroFactory.rangeSelectionCache.getValue();
            RealInvestmentActivity realInvestmentActivity = (RealInvestmentActivity) investingDiscoveryPresenter$MetroFactory.investingActivity.invoke();
            KybRestrictionBannerPresenter$AssistedInjectionFactory$Impl kybRestrictionBannerPresenter$AssistedInjectionFactory$Impl = (KybRestrictionBannerPresenter$AssistedInjectionFactory$Impl) investingDiscoveryPresenter$MetroFactory.kybRestrictionBannerFactory.invoke();
            androidStringManager.getClass();
            cashAccountDatabaseImpl.getClass();
            investingCryptoNewsPresenter$Factory$Impl.getClass();
            coroutineContext.getClass();
            investingDiscoverySectionsPresenter$Factory$Impl.getClass();
            realInvestingStateManager.getClass();
            featureFlagManager.getClass();
            cache4.getClass();
            realInvestmentActivity.getClass();
            kybRestrictionBannerPresenter$AssistedInjectionFactory$Impl.getClass();
            SelectCustomerPresenter selectCustomerPresenter = new SelectCustomerPresenter(androidStringManager, cashAccountDatabaseImpl, investingCryptoNewsPresenter$Factory$Impl, coroutineContext, investingDiscoverySectionsPresenter$Factory$Impl, realInvestingStateManager, featureFlagManager, cache4, realInvestmentActivity, kybRestrictionBannerPresenter$AssistedInjectionFactory$Impl, screenNavigator2);
            screenNavigator = screenNavigator2;
            gapComposer2.updateRememberedValue(selectCustomerPresenter);
            rememberedValue3 = selectCustomerPresenter;
        } else {
            screenNavigator = screenNavigator2;
        }
        MoleculePresenter moleculePresenter2 = (MoleculePresenter) rememberedValue3;
        Object rememberedValue4 = gapComposer2.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy2) {
            InvestingPortfolioPresenter$Factory$Impl investingPortfolioPresenter$Factory$Impl = (InvestingPortfolioPresenter$Factory$Impl) this.profileRepo;
            investingHome2.getClass();
            PaymentActionHandler.MetroFactory metroFactory = investingPortfolioPresenter$Factory$Impl.delegateFactory;
            InvestingDiscoverySectionsPresenter$Factory$Impl investingDiscoverySectionsPresenter$Factory$Impl2 = (InvestingDiscoverySectionsPresenter$Factory$Impl) metroFactory.intentFactory.invoke();
            InvestingCryptoNewsPresenter$Factory$Impl investingCryptoNewsPresenter$Factory$Impl2 = (InvestingCryptoNewsPresenter$Factory$Impl) metroFactory.activityEntityManager.invoke();
            RealInvestmentEntities realInvestmentEntities = (RealInvestmentEntities) metroFactory.paymentManager.invoke();
            AndroidStringManager androidStringManager2 = (AndroidStringManager) metroFactory.flowStarter.invoke();
            KeyValue keyValue = (KeyValue) metroFactory.stringManager.invoke();
            KeyValue keyValue2 = (KeyValue) metroFactory.balanceSnapshotManager.invoke();
            RealInvestingGraphCalculator realInvestingGraphCalculator = (RealInvestingGraphCalculator) metroFactory.instrumentManager.invoke();
            CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) metroFactory.appConfig.invoke();
            Cache cache5 = (Cache) metroFactory.clientSyncer.invoke();
            RealInvestingHistoricalData realInvestingHistoricalData = (RealInvestingHistoricalData) metroFactory.profileSyncer.invoke();
            RealInvestmentActivity realInvestmentActivity2 = (RealInvestmentActivity) metroFactory.appService.invoke();
            Analytics analytics = (Analytics) metroFactory.cryptoService.invoke();
            KybRestrictionBannerPresenter$AssistedInjectionFactory$Impl kybRestrictionBannerPresenter$AssistedInjectionFactory$Impl2 = (KybRestrictionBannerPresenter$AssistedInjectionFactory$Impl) metroFactory.tradingService.invoke();
            CoroutineContext coroutineContext2 = (CoroutineContext) metroFactory.investingService.invoke();
            CoroutineContext coroutineContext3 = (CoroutineContext) metroFactory.lendingAppService.invoke();
            LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) metroFactory.cashDatabase.invoke();
            StockMetricFactory stockMetricFactory = (StockMetricFactory) metroFactory.clientRouteParser.invoke();
            RealInvestingStateManager realInvestingStateManager2 = (RealInvestingStateManager) metroFactory.ioDispatcher.invoke();
            FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) metroFactory.attributionEventEmitter.invoke();
            InvestingDependentActivityPresenter$Factory$Impl investingDependentActivityPresenter$Factory$Impl = (InvestingDependentActivityPresenter$Factory$Impl) ((InstanceFactory) metroFactory.scope).value;
            InvestingDependentAutoInvestPresenter$Factory$Impl investingDependentAutoInvestPresenter$Factory$Impl = (InvestingDependentAutoInvestPresenter$Factory$Impl) ((InstanceFactory) metroFactory.paymentActionCompletionDispatcher).value;
            RealDependentCustomerTokenRepository realDependentCustomerTokenRepository = (RealDependentCustomerTokenRepository) metroFactory.supportNavigator.invoke();
            RealDependentBalanceDetailLoggingManager realDependentBalanceDetailLoggingManager = (RealDependentBalanceDetailLoggingManager) metroFactory.customerStore.invoke();
            RealDependentPortfolioStore realDependentPortfolioStore = (RealDependentPortfolioStore) metroFactory.analytics.invoke();
            RealDependentInvestmentEntities realDependentInvestmentEntities = (RealDependentInvestmentEntities) metroFactory.uuidGenerator.invoke();
            investingDiscoverySectionsPresenter$Factory$Impl2.getClass();
            investingCryptoNewsPresenter$Factory$Impl2.getClass();
            realInvestmentEntities.getClass();
            androidStringManager2.getClass();
            keyValue.getClass();
            keyValue2.getClass();
            realInvestingGraphCalculator.getClass();
            cashAccountDatabaseImpl2.getClass();
            cache5.getClass();
            realInvestingHistoricalData.getClass();
            realInvestmentActivity2.getClass();
            analytics.getClass();
            kybRestrictionBannerPresenter$AssistedInjectionFactory$Impl2.getClass();
            coroutineContext2.getClass();
            coroutineContext3.getClass();
            factory.getClass();
            stockMetricFactory.getClass();
            realInvestingStateManager2.getClass();
            featureFlagManager2.getClass();
            investingDependentActivityPresenter$Factory$Impl.getClass();
            investingDependentAutoInvestPresenter$Factory$Impl.getClass();
            realDependentCustomerTokenRepository.getClass();
            realDependentBalanceDetailLoggingManager.getClass();
            realDependentPortfolioStore.getClass();
            realDependentInvestmentEntities.getClass();
            cache = cache3;
            moleculePresenter = moleculePresenter2;
            neverEqualPolicy = neverEqualPolicy2;
            gapComposer = gapComposer2;
            InvestingPortfolioPresenter investingPortfolioPresenter = new InvestingPortfolioPresenter(investingDiscoverySectionsPresenter$Factory$Impl2, investingCryptoNewsPresenter$Factory$Impl2, realInvestmentEntities, androidStringManager2, keyValue, keyValue2, realInvestingGraphCalculator, cashAccountDatabaseImpl2, cache5, realInvestingHistoricalData, realInvestmentActivity2, analytics, kybRestrictionBannerPresenter$AssistedInjectionFactory$Impl2, coroutineContext2, coroutineContext3, factory, stockMetricFactory, realInvestingStateManager2, featureFlagManager2, investingDependentActivityPresenter$Factory$Impl, investingDependentAutoInvestPresenter$Factory$Impl, realDependentCustomerTokenRepository, realDependentBalanceDetailLoggingManager, realDependentPortfolioStore, realDependentInvestmentEntities, screenNavigator, investingHome2);
            investingHome = investingHome2;
            gapComposer.updateRememberedValue(investingPortfolioPresenter);
            rememberedValue4 = investingPortfolioPresenter;
        } else {
            cache = cache3;
            gapComposer = gapComposer2;
            moleculePresenter = moleculePresenter2;
            neverEqualPolicy = neverEqualPolicy2;
            investingHome = investingHome2;
        }
        MoleculePresenter moleculePresenter3 = (MoleculePresenter) rememberedValue4;
        InvestingState investingStates = ((RealInvestingStateManager) this.screen).investingStates(gapComposer);
        Continuation continuation = null;
        if (investingStates.equals(InvestingState.Loading.INSTANCE)) {
            investingHomePresenter$ViewModelFilter = InvestingHomePresenter$ViewModelFilter.PORTFOLIO;
        } else {
            if (!(investingStates instanceof InvestingState.Content)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            investingHomePresenter$ViewModelFilter = ((InvestingState.Content) investingStates).portfolioState != InvestingState.Content.PortfolioState.ABSENT ? InvestingHomePresenter$ViewModelFilter.PORTFOLIO : InvestingHomePresenter$ViewModelFilter.DISCOVERY;
        }
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(investingHomePresenter$ViewModelFilter, gapComposer);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = new CheckStatusPresenter.AnonymousClass1(this, continuation, 19);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue5);
        Boolean bool = (Boolean) collectAsState2.getValue();
        bool.getClass();
        boolean changed = gapComposer.changed(collectAsState2) | gapComposer.changedInstance(this);
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (changed || rememberedValue6 == neverEqualPolicy) {
            rememberedValue6 = new CheckStatusPresenter.AnonymousClass1.C00611(this, collectAsState2, continuation, 27);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        Updater.LaunchedEffect(gapComposer, bool, (Function2) rememberedValue6);
        int i3 = i & 14;
        Updater.LaunchedEffect(gapComposer, flow, new InvestingHomeView$onScrollFlow$1(flow, continuation, this, 8));
        if (investingHome.dependentCustomerToken != null) {
            gapComposer.startReplaceGroup(-115097209);
            InvestingHomeViewModel investingHomeViewModel2 = (InvestingHomeViewModel) moleculePresenter3.models(flow, gapComposer, i3);
            gapComposer.end(false);
            investingHomeViewModel = investingHomeViewModel2;
            cache2 = cache;
        } else if (((Boolean) collectAsState.getValue()).booleanValue()) {
            cache2 = cache;
            gapComposer.startReplaceGroup(-114942426);
            int ordinal = ((InvestingHomePresenter$ViewModelFilter) rememberUpdatedState.getValue()).ordinal();
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(273391670);
                investingHomeViewModel = (InvestingHomeViewModel) moleculePresenter.models(flow, gapComposer, i3);
                gapComposer.end(false);
            } else {
                if (ordinal != 1) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 273386844, false);
                }
                gapComposer.startReplaceGroup(273389334);
                investingHomeViewModel = (InvestingHomeViewModel) moleculePresenter3.models(flow, gapComposer, i3);
                gapComposer.end(false);
            }
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-115008332);
            gapComposer.end(false);
            cache2 = cache;
            investingHomeViewModel = (InvestingHomeViewModel) cache2.cache;
            if (investingHomeViewModel == null) {
                investingHomeViewModel = InvestingHomeViewModel.InitialLoading.INSTANCE;
            }
        }
        cache2.set(investingHomeViewModel);
        gapComposer.end(false);
        return investingHomeViewModel;
    }

    public static Image photoImage(CustomerProfileData customerProfileData) {
        Image image;
        String uri;
        if ((customerProfileData.isCashCustomer || customerProfileData.isMerchantCustomer) && (image = customerProfileData.photo) != null) {
            return image;
        }
        Uri createContactAvatarRequestUri = UtilsKt.createContactAvatarRequestUri(customerProfileData.lookupKey, customerProfileData.email, customerProfileData.sms);
        if (createContactAvatarRequestUri == null || (uri = createContactAvatarRequestUri.toString()) == null) {
            return null;
        }
        return new Image(uri, uri, 4);
    }

    public static PaymentRecipient toPaymentRecipient(CustomerProfileData customerProfileData) {
        UiCustomer create = SendableUiCustomerFactory.create(customerProfileData.displayName, customerProfileData.region, customerProfileData.photo, customerProfileData.email, customerProfileData.sms, customerProfileData.cashtag, customerProfileData.customerId, null, null, Boolean.valueOf(customerProfileData.isCashCustomer), null, null);
        RedactedString redactedString = new RedactedString(customerProfileData.displayName);
        Long l = customerProfileData.creditCardFee;
        return new PaymentRecipient(create, redactedString, new RecipientPaymentInfo(l != null ? l.longValue() : 0L, customerProfileData.isBusiness), customerProfileData.customerId != null ? RecipientType.CUSTOMER : customerProfileData.sms != null ? RecipientType.PHONE : customerProfileData.email != null ? RecipientType.EMAIL : RecipientType.UNKNOWN, null);
    }

    public static void trackPasteAddress(Analytics analytics, BitcoinPayments bitcoinPayments) {
        ContentType contentType;
        if (bitcoinPayments instanceof BitcoinPayments.Bitcoin) {
            contentType = ContentType.BITCOIN;
        } else if (bitcoinPayments instanceof BitcoinPayments.Ethereum) {
            contentType = ContentType.UNKNOWN;
        } else if (bitcoinPayments instanceof BitcoinPayments.Lightning) {
            contentType = ContentType.LIGHTNING;
        } else if (bitcoinPayments instanceof BitcoinPayments.Stablecoin) {
            contentType = ContentType.UNKNOWN;
        } else {
            if (bitcoinPayments != null) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            contentType = ContentType.UNKNOWN;
        }
        analytics.track(new CryptoSendPasteAddress(contentType), null);
    }

    public static void trackScanQr(Analytics analytics, BitcoinPayments bitcoinPayments) {
        ContentType contentType;
        if (bitcoinPayments instanceof BitcoinPayments.Bitcoin) {
            contentType = ContentType.BITCOIN;
        } else if (bitcoinPayments instanceof BitcoinPayments.Ethereum) {
            contentType = ContentType.UNKNOWN;
        } else if (bitcoinPayments instanceof BitcoinPayments.Lightning) {
            contentType = ContentType.LIGHTNING;
        } else if (bitcoinPayments instanceof BitcoinPayments.Stablecoin) {
            contentType = ContentType.UNKNOWN;
        } else {
            if (bitcoinPayments != null) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            contentType = ContentType.UNKNOWN;
        }
        analytics.track(new CryptoSendScanQr(contentType), null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0109  */
    /* JADX WARN: Type inference failed for: r40v1, types: [com.squareup.cash.payments.screens.PaymentScreens$ConfirmRecipient$Analytics] */
    /* JADX WARN: Type inference failed for: r43v0, types: [androidx.compose.runtime.MutableState] */
    /* JADX WARN: Type inference failed for: r9v8, types: [com.squareup.cash.payments.screens.PaymentScreens$ConfirmRecipient$Analytics] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void executeAction(ProfileScreens.ProfileScreen.Action action, CurrencyCode currencyCode, CustomerProfileData customerProfileData, Orientation orientation, MutableState mutableState, Origin origin) {
        Origin origin2;
        Origin origin3;
        int ordinal;
        UUID uuid;
        String str;
        UUID uuid2;
        RecipientSearchAddContact.SearchType searchType;
        int i;
        FeatureFlagManager featureFlagManager;
        RecipientSearchAddContact.SuggestionStrategy suggestionStrategy;
        RecipientSearchAddContact.SuggestionStrategy suggestionStrategy2;
        Redacted redacted;
        RecipientSearchAddContact.SearchType searchType2;
        RealFeatureFlagManager realFeatureFlagManager;
        FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) this.featureFlagManager;
        ProfileScreens.ProfileScreen profileScreen = (ProfileScreens.ProfileScreen) this.screen;
        Parcelable parcelable = action.result;
        BetterNavigator.ScreenNavigator screenNavigator = this.navigator;
        if (parcelable != null) {
            screenNavigator.goTo(new Finish(parcelable));
            return;
        }
        ProfileScreens.ProfileScreen.ProfileAnalytics profileAnalytics = profileScreen.analytics;
        ProfileScreens.ProfileScreen.ProfileAnalytics profileAnalytics2 = profileScreen.analytics;
        if ((profileAnalytics != null ? profileAnalytics.searchToken : null) != null) {
            origin3 = Origin.CUSTOMER_PROFILE_PROFILE_DIRECTORY;
        } else if (CollectionsKt__CollectionsKt.listOf((Object[]) new CustomerProfileViewOpen.EntryPoint[]{CustomerProfileViewOpen.EntryPoint.SCAN_QR, CustomerProfileViewOpen.EntryPoint.SHARE_DEEP_LINK}).contains(profileScreen.entryPoint)) {
            origin3 = Origin.APP_LINK;
        } else {
            origin2 = origin;
            ordinal = action.actionType.ordinal();
            if (ordinal != 0 || ordinal == 1 || ordinal == 2) {
                if (profileAnalytics2 != null && (uuid = profileAnalytics2.searchToken) != null) {
                    Integer num = profileAnalytics2.absoluteIndex;
                    UUID uuid3 = profileAnalytics2.externalId;
                    String uuid4 = uuid3 == null ? uuid3.toString() : null;
                    Integer num2 = profileAnalytics2.matchedAliasLength;
                    String str2 = profileAnalytics2.matchedFields;
                    String str3 = profileAnalytics2.remoteSuggestionType;
                    Integer num3 = profileAnalytics2.searchTextLength;
                    str = profileAnalytics2.searchType;
                    if (str != null) {
                        switch (str.hashCode()) {
                            case 82233:
                                uuid2 = uuid;
                                if (str.equals("SMS")) {
                                    searchType2 = RecipientSearchAddContact.SearchType.SMS;
                                    searchType = searchType2;
                                    break;
                                }
                                break;
                            case 66081660:
                                uuid2 = uuid;
                                if (str.equals("EMAIL")) {
                                    searchType2 = RecipientSearchAddContact.SearchType.EMAIL;
                                    searchType = searchType2;
                                    break;
                                }
                                break;
                            case 1139154141:
                                uuid2 = uuid;
                                if (str.equals("FULL_TEXT")) {
                                    searchType2 = RecipientSearchAddContact.SearchType.FULL_TEXT;
                                    searchType = searchType2;
                                    break;
                                }
                                break;
                            case 1272979303:
                                uuid2 = uuid;
                                if (str.equals("CASHTAG")) {
                                    searchType2 = RecipientSearchAddContact.SearchType.CASH_TAG;
                                    searchType = searchType2;
                                    break;
                                }
                                break;
                        }
                        searchType = null;
                        String str4 = profileAnalytics2.section;
                        Integer num4 = profileAnalytics2.sectionIndex;
                        Integer num5 = profileAnalytics2.sectionTotal;
                        SuggestionStrategy suggestionStrategy3 = profileAnalytics2.suggestionStrategy;
                        i = suggestionStrategy3 == null ? -1 : ProfilePresenterAnalyticsKt$WhenMappings.$EnumSwitchMapping$1[suggestionStrategy3.ordinal()];
                        featureFlagManager = featureFlagManager2;
                        if (i == 1) {
                            suggestionStrategy = RecipientSearchAddContact.SuggestionStrategy.RECENTS;
                        } else if (i == 2) {
                            suggestionStrategy = RecipientSearchAddContact.SuggestionStrategy.CONTACTS_ON_CASH;
                        } else if (i == 3) {
                            suggestionStrategy = RecipientSearchAddContact.SuggestionStrategy.CONTACTS_OFF_CASH;
                        } else if (i == 4) {
                            suggestionStrategy = RecipientSearchAddContact.SuggestionStrategy.REMOTE;
                        } else {
                            if (i != 5) {
                                suggestionStrategy2 = null;
                                ProfileScreens.ProfileScreen.Customer customer = profileScreen.customer;
                                ProfileScreens.ProfileScreen.Customer.CashCustomer cashCustomer = !(customer instanceof ProfileScreens.ProfileScreen.Customer.CashCustomer) ? (ProfileScreens.ProfileScreen.Customer.CashCustomer) customer : null;
                                this.analytics.track(new RecipientSearchAddContact(num, uuid4, num2, str2, str3, num3, searchType, str4, num4, num5, suggestionStrategy2, "CUSTOMER_PROFILE_DISCOVER", (cashCustomer != null || (redacted = cashCustomer.customerId) == null) ? null : (String) redacted.getValue(), profileAnalytics2.contactStatus, String.valueOf(uuid2), profileAnalytics2.queryToken, null, null, null, null, null, null, 16662528), null);
                                realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
                                if (!((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$CoreP2pFlowRedesign.INSTANCE)).enabled() && ((FeatureFlag$EnabledDisabledFeatureFlag$Options) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$P2pCoreFlowPersonFirst.INSTANCE)).enabled()) {
                                    screenNavigator.goTo(new PaymentScreens.PaymentConfiguration((UUID) null, new Money((Long) 0L, currencyCode, 4), orientation, profileScreen.exitScreen, AppCreationActivity.ACTIVITY_CUSTOMER_PROFILE, (String) null, profileScreen.launchUrl, (String) null, new PaymentConfigurationFlow.PersonFirst(new PaymentFlowData.StandardFlowData(null, new RedactedParcelable(toPaymentRecipient(customerProfileData)), 1), true), (BlockersData.MoneybotContext) null, 1348));
                                    return;
                                }
                                PaymentScreens.QuickPay buildQuickPay$default = WorkCookieJar.buildQuickPay$default((WorkCookieJar) this.paymentsInboundNavigator, null, profileScreen.exitScreen, orientation, currencyCode, CollectionsKt__CollectionsJVMKt.listOf(toPaymentRecipient(customerProfileData)), AppCreationActivity.ACTIVITY_CUSTOMER_PROFILE, null, profileScreen.launchUrl, null, null, new PaymentScreens.QuickPay.QuickPayAnalytics((UUID) this.externalPaymentId, RecipientAnalyticsKt.toAnalyticsContactStatus(customerProfileData.isInContacts), origin2, profileAnalytics2 == null ? profileAnalytics2.suggestionStrategy : null, profileAnalytics2 == null ? profileAnalytics2.sectionId : null, profileAnalytics2 == null ? profileAnalytics2.section : null, profileAnalytics2 == null ? profileAnalytics2.sectionIndex : null, profileAnalytics2 == null ? profileAnalytics2.sectionTotal : null, profileAnalytics2 == null ? profileAnalytics2.searchTextLength : null, profileAnalytics2 == null ? profileAnalytics2.searchType : null, profileAnalytics2 == null ? profileAnalytics2.matchedAliasLength : null, profileAnalytics2 == null ? profileAnalytics2.remoteSuggestionType : null, profileAnalytics2 == null ? profileAnalytics2.absoluteIndex : null), null, 12097);
                                if (customerProfileData.requiresConfirmation) {
                                    screenNavigator.goTo(buildQuickPay$default);
                                    return;
                                }
                                mutableState.setValue(buildQuickPay$default);
                                Recipient recipient = customerProfileData.toRecipient();
                                if (profileAnalytics2 != null) {
                                    Integer num6 = profileAnalytics2.absoluteIndex;
                                    String str5 = profileAnalytics2.section;
                                    Integer num7 = profileAnalytics2.sectionIndex;
                                    Integer num8 = profileAnalytics2.sectionTotal;
                                    Integer num9 = profileAnalytics2.searchTextLength;
                                    Integer num10 = profileAnalytics2.matchedAliasLength;
                                    SuggestionStrategy suggestionStrategy4 = profileAnalytics2.suggestionStrategy;
                                    String str6 = profileAnalytics2.remoteSuggestionType;
                                    String str7 = profileAnalytics2.searchType;
                                    String str8 = profileAnalytics2.matchedFields;
                                    String str9 = profileAnalytics2.queryToken;
                                    UUID uuid5 = profileAnalytics2.externalId;
                                    r8 = new PaymentScreens.ConfirmRecipient.Analytics(null, null, num6, null, null, null, str5, num7, num8, num9, num10, suggestionStrategy4, str6, str7, customerProfileData.customerId, str8, str9, uuid5 != null ? uuid5.toString() : null, RecipientSearchViewBlocker.Origin.CUSTOMER_PROFILE_DISCOVER, RecipientSearchViewBlocker.BlockerReason.RECIPIENT_NOT_IN_CONTACTS_DOMESTIC, false);
                                }
                                screenNavigator.goTo(new PaymentScreens.ConfirmRecipient(recipient, r8, false, false, PaymentScreens.ConfirmRecipient.RecipientConfirmationType.DOMESTIC_PAYMENT_UNKNOWN_RECIPIENT, null));
                                return;
                            }
                            suggestionStrategy = RecipientSearchAddContact.SuggestionStrategy.FAVORITE;
                        }
                        suggestionStrategy2 = suggestionStrategy;
                        ProfileScreens.ProfileScreen.Customer customer2 = profileScreen.customer;
                        if (!(customer2 instanceof ProfileScreens.ProfileScreen.Customer.CashCustomer)) {
                        }
                        this.analytics.track(new RecipientSearchAddContact(num, uuid4, num2, str2, str3, num3, searchType, str4, num4, num5, suggestionStrategy2, "CUSTOMER_PROFILE_DISCOVER", (cashCustomer != null || (redacted = cashCustomer.customerId) == null) ? null : (String) redacted.getValue(), profileAnalytics2.contactStatus, String.valueOf(uuid2), profileAnalytics2.queryToken, null, null, null, null, null, null, 16662528), null);
                        realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
                        if (!((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$CoreP2pFlowRedesign.INSTANCE)).enabled()) {
                        }
                        PaymentScreens.QuickPay buildQuickPay$default2 = WorkCookieJar.buildQuickPay$default((WorkCookieJar) this.paymentsInboundNavigator, null, profileScreen.exitScreen, orientation, currencyCode, CollectionsKt__CollectionsJVMKt.listOf(toPaymentRecipient(customerProfileData)), AppCreationActivity.ACTIVITY_CUSTOMER_PROFILE, null, profileScreen.launchUrl, null, null, new PaymentScreens.QuickPay.QuickPayAnalytics((UUID) this.externalPaymentId, RecipientAnalyticsKt.toAnalyticsContactStatus(customerProfileData.isInContacts), origin2, profileAnalytics2 == null ? profileAnalytics2.suggestionStrategy : null, profileAnalytics2 == null ? profileAnalytics2.sectionId : null, profileAnalytics2 == null ? profileAnalytics2.section : null, profileAnalytics2 == null ? profileAnalytics2.sectionIndex : null, profileAnalytics2 == null ? profileAnalytics2.sectionTotal : null, profileAnalytics2 == null ? profileAnalytics2.searchTextLength : null, profileAnalytics2 == null ? profileAnalytics2.searchType : null, profileAnalytics2 == null ? profileAnalytics2.matchedAliasLength : null, profileAnalytics2 == null ? profileAnalytics2.remoteSuggestionType : null, profileAnalytics2 == null ? profileAnalytics2.absoluteIndex : null), null, 12097);
                        if (customerProfileData.requiresConfirmation) {
                        }
                    }
                    uuid2 = uuid;
                    searchType = null;
                    String str42 = profileAnalytics2.section;
                    Integer num42 = profileAnalytics2.sectionIndex;
                    Integer num52 = profileAnalytics2.sectionTotal;
                    SuggestionStrategy suggestionStrategy32 = profileAnalytics2.suggestionStrategy;
                    if (suggestionStrategy32 == null) {
                    }
                    featureFlagManager = featureFlagManager2;
                    if (i == 1) {
                    }
                    suggestionStrategy2 = suggestionStrategy;
                    ProfileScreens.ProfileScreen.Customer customer22 = profileScreen.customer;
                    if (!(customer22 instanceof ProfileScreens.ProfileScreen.Customer.CashCustomer)) {
                    }
                    this.analytics.track(new RecipientSearchAddContact(num, uuid4, num2, str2, str3, num3, searchType, str42, num42, num52, suggestionStrategy2, "CUSTOMER_PROFILE_DISCOVER", (cashCustomer != null || (redacted = cashCustomer.customerId) == null) ? null : (String) redacted.getValue(), profileAnalytics2.contactStatus, String.valueOf(uuid2), profileAnalytics2.queryToken, null, null, null, null, null, null, 16662528), null);
                    realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
                    if (!((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$CoreP2pFlowRedesign.INSTANCE)).enabled()) {
                    }
                    PaymentScreens.QuickPay buildQuickPay$default22 = WorkCookieJar.buildQuickPay$default((WorkCookieJar) this.paymentsInboundNavigator, null, profileScreen.exitScreen, orientation, currencyCode, CollectionsKt__CollectionsJVMKt.listOf(toPaymentRecipient(customerProfileData)), AppCreationActivity.ACTIVITY_CUSTOMER_PROFILE, null, profileScreen.launchUrl, null, null, new PaymentScreens.QuickPay.QuickPayAnalytics((UUID) this.externalPaymentId, RecipientAnalyticsKt.toAnalyticsContactStatus(customerProfileData.isInContacts), origin2, profileAnalytics2 == null ? profileAnalytics2.suggestionStrategy : null, profileAnalytics2 == null ? profileAnalytics2.sectionId : null, profileAnalytics2 == null ? profileAnalytics2.section : null, profileAnalytics2 == null ? profileAnalytics2.sectionIndex : null, profileAnalytics2 == null ? profileAnalytics2.sectionTotal : null, profileAnalytics2 == null ? profileAnalytics2.searchTextLength : null, profileAnalytics2 == null ? profileAnalytics2.searchType : null, profileAnalytics2 == null ? profileAnalytics2.matchedAliasLength : null, profileAnalytics2 == null ? profileAnalytics2.remoteSuggestionType : null, profileAnalytics2 == null ? profileAnalytics2.absoluteIndex : null), null, 12097);
                    if (customerProfileData.requiresConfirmation) {
                    }
                }
            } else if (ordinal != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            featureFlagManager = featureFlagManager2;
            realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
            if (!((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$CoreP2pFlowRedesign.INSTANCE)).enabled()) {
            }
            PaymentScreens.QuickPay buildQuickPay$default222 = WorkCookieJar.buildQuickPay$default((WorkCookieJar) this.paymentsInboundNavigator, null, profileScreen.exitScreen, orientation, currencyCode, CollectionsKt__CollectionsJVMKt.listOf(toPaymentRecipient(customerProfileData)), AppCreationActivity.ACTIVITY_CUSTOMER_PROFILE, null, profileScreen.launchUrl, null, null, new PaymentScreens.QuickPay.QuickPayAnalytics((UUID) this.externalPaymentId, RecipientAnalyticsKt.toAnalyticsContactStatus(customerProfileData.isInContacts), origin2, profileAnalytics2 == null ? profileAnalytics2.suggestionStrategy : null, profileAnalytics2 == null ? profileAnalytics2.sectionId : null, profileAnalytics2 == null ? profileAnalytics2.section : null, profileAnalytics2 == null ? profileAnalytics2.sectionIndex : null, profileAnalytics2 == null ? profileAnalytics2.sectionTotal : null, profileAnalytics2 == null ? profileAnalytics2.searchTextLength : null, profileAnalytics2 == null ? profileAnalytics2.searchType : null, profileAnalytics2 == null ? profileAnalytics2.matchedAliasLength : null, profileAnalytics2 == null ? profileAnalytics2.remoteSuggestionType : null, profileAnalytics2 == null ? profileAnalytics2.absoluteIndex : null), null, 12097);
            if (customerProfileData.requiresConfirmation) {
            }
        }
        origin2 = origin3;
        ordinal = action.actionType.ordinal();
        if (ordinal != 0) {
        }
        if (profileAnalytics2 != null) {
            Integer num11 = profileAnalytics2.absoluteIndex;
            UUID uuid32 = profileAnalytics2.externalId;
            if (uuid32 == null) {
            }
            Integer num22 = profileAnalytics2.matchedAliasLength;
            String str22 = profileAnalytics2.matchedFields;
            String str32 = profileAnalytics2.remoteSuggestionType;
            Integer num32 = profileAnalytics2.searchTextLength;
            str = profileAnalytics2.searchType;
            if (str != null) {
            }
            uuid2 = uuid;
            searchType = null;
            String str422 = profileAnalytics2.section;
            Integer num422 = profileAnalytics2.sectionIndex;
            Integer num522 = profileAnalytics2.sectionTotal;
            SuggestionStrategy suggestionStrategy322 = profileAnalytics2.suggestionStrategy;
            if (suggestionStrategy322 == null) {
            }
            featureFlagManager = featureFlagManager2;
            if (i == 1) {
            }
            suggestionStrategy2 = suggestionStrategy;
            ProfileScreens.ProfileScreen.Customer customer222 = profileScreen.customer;
            if (!(customer222 instanceof ProfileScreens.ProfileScreen.Customer.CashCustomer)) {
            }
            this.analytics.track(new RecipientSearchAddContact(num11, uuid4, num22, str22, str32, num32, searchType, str422, num422, num522, suggestionStrategy2, "CUSTOMER_PROFILE_DISCOVER", (cashCustomer != null || (redacted = cashCustomer.customerId) == null) ? null : (String) redacted.getValue(), profileAnalytics2.contactStatus, String.valueOf(uuid2), profileAnalytics2.queryToken, null, null, null, null, null, null, 16662528), null);
            realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
            if (!((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$CoreP2pFlowRedesign.INSTANCE)).enabled()) {
            }
            PaymentScreens.QuickPay buildQuickPay$default2222 = WorkCookieJar.buildQuickPay$default((WorkCookieJar) this.paymentsInboundNavigator, null, profileScreen.exitScreen, orientation, currencyCode, CollectionsKt__CollectionsJVMKt.listOf(toPaymentRecipient(customerProfileData)), AppCreationActivity.ACTIVITY_CUSTOMER_PROFILE, null, profileScreen.launchUrl, null, null, new PaymentScreens.QuickPay.QuickPayAnalytics((UUID) this.externalPaymentId, RecipientAnalyticsKt.toAnalyticsContactStatus(customerProfileData.isInContacts), origin2, profileAnalytics2 == null ? profileAnalytics2.suggestionStrategy : null, profileAnalytics2 == null ? profileAnalytics2.sectionId : null, profileAnalytics2 == null ? profileAnalytics2.section : null, profileAnalytics2 == null ? profileAnalytics2.sectionIndex : null, profileAnalytics2 == null ? profileAnalytics2.sectionTotal : null, profileAnalytics2 == null ? profileAnalytics2.searchTextLength : null, profileAnalytics2 == null ? profileAnalytics2.searchType : null, profileAnalytics2 == null ? profileAnalytics2.matchedAliasLength : null, profileAnalytics2 == null ? profileAnalytics2.remoteSuggestionType : null, profileAnalytics2 == null ? profileAnalytics2.absoluteIndex : null), null, 12097);
            if (customerProfileData.requiresConfirmation) {
            }
        }
        featureFlagManager = featureFlagManager2;
        realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
        if (!((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$CoreP2pFlowRedesign.INSTANCE)).enabled()) {
        }
        PaymentScreens.QuickPay buildQuickPay$default22222 = WorkCookieJar.buildQuickPay$default((WorkCookieJar) this.paymentsInboundNavigator, null, profileScreen.exitScreen, orientation, currencyCode, CollectionsKt__CollectionsJVMKt.listOf(toPaymentRecipient(customerProfileData)), AppCreationActivity.ACTIVITY_CUSTOMER_PROFILE, null, profileScreen.launchUrl, null, null, new PaymentScreens.QuickPay.QuickPayAnalytics((UUID) this.externalPaymentId, RecipientAnalyticsKt.toAnalyticsContactStatus(customerProfileData.isInContacts), origin2, profileAnalytics2 == null ? profileAnalytics2.suggestionStrategy : null, profileAnalytics2 == null ? profileAnalytics2.sectionId : null, profileAnalytics2 == null ? profileAnalytics2.section : null, profileAnalytics2 == null ? profileAnalytics2.sectionIndex : null, profileAnalytics2 == null ? profileAnalytics2.sectionTotal : null, profileAnalytics2 == null ? profileAnalytics2.searchTextLength : null, profileAnalytics2 == null ? profileAnalytics2.searchType : null, profileAnalytics2 == null ? profileAnalytics2.matchedAliasLength : null, profileAnalytics2 == null ? profileAnalytics2.remoteSuggestionType : null, profileAnalytics2 == null ? profileAnalytics2.absoluteIndex : null), null, 12097);
        if (customerProfileData.requiresConfirmation) {
        }
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public ErrorReporter getErrorReporter() {
        return (ErrorReporter) this.principalAccountToken;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public SampleStrategy getOneErrorPerAppSessionStrategy() {
        return (SampleStrategy) this.allowlistRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Enum handleInvoice(BitcoinPayments bitcoinPayments, CryptoPaymentSource cryptoPaymentSource, ContinuationImpl continuationImpl) {
        BitcoinQrCodeScannerPresenter$handleInvoice$1 bitcoinQrCodeScannerPresenter$handleInvoice$1;
        int i;
        BitcoinQrCodeScannerScreen bitcoinQrCodeScannerScreen = (BitcoinQrCodeScannerScreen) this.allowlistRepository;
        if (continuationImpl instanceof BitcoinQrCodeScannerPresenter$handleInvoice$1) {
            bitcoinQrCodeScannerPresenter$handleInvoice$1 = (BitcoinQrCodeScannerPresenter$handleInvoice$1) continuationImpl;
            int i2 = bitcoinQrCodeScannerPresenter$handleInvoice$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                bitcoinQrCodeScannerPresenter$handleInvoice$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = bitcoinQrCodeScannerPresenter$handleInvoice$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bitcoinQrCodeScannerPresenter$handleInvoice$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CryptoFlowStarter cryptoFlowStarter = (CryptoFlowStarter) this.favoritesManager;
                    CryptoPayment.InvoicePayment invoicePayment = new CryptoPayment.InvoicePayment(bitcoinPayments, cryptoPaymentSource, bitcoinQrCodeScannerScreen.amount, 8);
                    Screen bitcoinHome = bitcoinQrCodeScannerScreen.origin == CryptoPaymentOrigin.MAIN_QR_SCANNER ? PaymentScreens$HomeScreens$Home.INSTANCE : new BitcoinHome(null, null, null, null, 15);
                    bitcoinQrCodeScannerPresenter$handleInvoice$1.label = 1;
                    if (((RealCryptoFlowStarter) cryptoFlowStarter).initiateCryptoPayment(invoicePayment, bitcoinHome, this.navigator) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return ProcessAddressResult.SUCCESS;
            }
        }
        bitcoinQrCodeScannerPresenter$handleInvoice$1 = new BitcoinQrCodeScannerPresenter$handleInvoice$1(this, continuationImpl);
        Object obj2 = bitcoinQrCodeScannerPresenter$handleInvoice$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bitcoinQrCodeScannerPresenter$handleInvoice$1.label;
        if (i != 0) {
        }
        return ProcessAddressResult.SUCCESS;
    }

    public ProcessAddressResult handleStablecoinPayment(String str) {
        if (!((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) this.featureFlagManager)).peekCurrentValue(AmplitudeExperiments$BitcoinStablecoinMvp.INSTANCE)).enabled()) {
            return ProcessAddressResult.SHOW_ERROR_DIALOG;
        }
        Back back = Back.INSTANCE;
        BetterNavigator.ScreenNavigator screenNavigator = this.navigator;
        screenNavigator.goTo(back);
        BitcoinHome bitcoinHome = new BitcoinHome(null, null, null, null, 15);
        AppCreationActivity appCreationActivity = AppCreationActivity.IN_APP_SCANNER;
        screenNavigator.goTo(new PaymentScreens.PaymentConfiguration((UUID) null, new Money((Long) 0L, (CurrencyCode) null, 6), Orientation.CASH, bitcoinHome, appCreationActivity, (String) null, (String) null, (String) null, new PaymentConfigurationFlow.StablecoinQrScanFlow(new PaymentFlowData.StablecoinQrScanFlowData(str)), (BlockersData.MoneybotContext) null, 1476));
        return ProcessAddressResult.SUCCESS;
    }

    /* JADX WARN: Code restructure failed: missing block: B:392:0x0c36, code lost:
    
        if (r5 == null) goto L428;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0537 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0c7d  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0cf6  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0d12  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0d23  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0d2d  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0d1e  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0cf9  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0c80  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x036c  */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [com.squareup.util.android.PhoneNumbers$Format] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        String str;
        CustomerProfileData customerProfileData;
        CustomerProfileData customerProfileData2;
        String str2;
        CustomerProfileData customerProfileData3;
        CustomerProfileData customerProfileData4;
        GapComposer gapComposer;
        boolean z;
        Object loading;
        GenericProfileElementViewModel genericProfileElementViewModel;
        boolean z2;
        String str3;
        NotificationCompat notificationCompat;
        MutableState mutableState;
        FeatureFlagManager featureFlagManager;
        String str4;
        String str5;
        Icons icons;
        Icons icons2;
        ProfileViewModel.Loaded.ProfileHeader.ActionButton actionButton;
        ProfileViewModel.Loaded.ProfileHeader.ActionButton actionButton2;
        Boolean bool;
        int ordinal;
        NavigationIcon navigationIcon;
        ProfileScreens.ProfileScreen.Action.ActionType actionType;
        ProfileScreens.ProfileScreen.Action.ActionType actionType2;
        int i2;
        Color validate;
        ?? r15;
        List list;
        GenericProfileElementViewModel genericProfileElementViewModel2;
        ProfilePresenter profilePresenter;
        Continuation continuation;
        PoolDetailsScreen poolDetailsScreen;
        MutableState mutableState2;
        Object moleculeKt$immediateClockFlow$1$1$1;
        Unit unit;
        MutableState mutableState3;
        AndroidStringManager androidStringManager;
        MutableState mutableState4;
        String str6;
        GapComposer gapComposer2;
        PoolDetailsScreen poolDetailsScreen2;
        MutableState mutableState5;
        MutableState mutableState6;
        MutableState mutableState7;
        boolean z3;
        boolean z4;
        Object obj;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        ActivityEmbeddedViewModel activityEmbeddedViewModel;
        List<ActivityFeedEntry> list2;
        float f;
        boolean z10;
        boolean changed;
        Object rememberedValue;
        Money money;
        MutableState mutableState8;
        ContributionAnimation contributionAnimation;
        boolean z11;
        MoneyPool moneyPool;
        boolean z12;
        MoneyPool moneyPool2;
        boolean z13;
        MoneyPool moneyPool3;
        String str7;
        String format2;
        int i3;
        long longValue;
        long millis;
        Long l;
        PoolDetailsViewModel.LoadingError loadingError;
        ProfilePresenter profilePresenter2 = this;
        int i4 = profilePresenter2.$r8$classId;
        int i5 = 28;
        Object obj2 = profilePresenter2.jurisdictionConfigManager;
        Object obj3 = profilePresenter2.profileRepo;
        Object obj4 = profilePresenter2.paymentsInboundNavigator;
        Object obj5 = profilePresenter2.externalPaymentId;
        Object obj6 = profilePresenter2.screen;
        Object obj7 = profilePresenter2.featureFlagManager;
        Object obj8 = profilePresenter2.allowlistRepository;
        Object obj9 = profilePresenter2.genericProfileElementsPresenter;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj10 = profilePresenter2.stringManager;
        int i6 = 0;
        switch (i4) {
            case 0:
                ProfileScreens.ProfileScreen profileScreen = (ProfileScreens.ProfileScreen) obj6;
                flow.getClass();
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(-524833439);
                Object rememberedValue2 = gapComposer3.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new InviteContactsPresenter$special$$inlined$map$1(RealProfileRepo.customerDetails$default((RealProfileRepo) obj3, profileScreen.customer, profileScreen.confirmRecipient, profileScreen.originContext, profileScreen.loadInitialDetailsFromCache), profilePresenter2, i5);
                    gapComposer3.updateRememberedValue(rememberedValue2);
                }
                MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue2, null, null, gapComposer3, 48, 2);
                Object rememberedValue3 = gapComposer3.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    RealDrawerOpener$getDrawerScreen$$inlined$map$1 realDrawerOpener$getDrawerScreen$$inlined$map$1 = new RealDrawerOpener$getDrawerScreen$$inlined$map$1(((RealJurisdictionConfigManager) obj2).select(), 18);
                    gapComposer3.updateRememberedValue(realDrawerOpener$getDrawerScreen$$inlined$map$1);
                    rememberedValue3 = realDrawerOpener$getDrawerScreen$$inlined$map$1;
                }
                MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue3, null, null, gapComposer3, 48, 2);
                Object rememberedValue4 = gapComposer3.rememberedValue();
                if (rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = RealBitcoinCapabilityProvider.isBTCxFlow();
                    gapComposer3.updateRememberedValue(rememberedValue4);
                }
                MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue4, null, null, gapComposer3, 48, 2);
                Object rememberedValue5 = gapComposer3.rememberedValue();
                if (rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = ((KeyValue) profilePresenter2.principalAccountToken).observe();
                    gapComposer3.updateRememberedValue(rememberedValue5);
                }
                MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue5, null, null, gapComposer3, 48, 2);
                CustomerProfileDetails customerProfileDetails = (CustomerProfileDetails) collectAsState.getValue();
                boolean changed2 = gapComposer3.changed(customerProfileDetails != null ? customerProfileDetails.customerProfileData : null);
                Object rememberedValue6 = gapComposer3.rememberedValue();
                if (changed2 || rememberedValue6 == neverEqualPolicy) {
                    CustomerProfileDetails customerProfileDetails2 = (CustomerProfileDetails) collectAsState.getValue();
                    if (customerProfileDetails2 == null || (customerProfileData2 = customerProfileDetails2.customerProfileData) == null || (str = customerProfileData2.customerId) == null) {
                        CustomerProfileDetails customerProfileDetails3 = (CustomerProfileDetails) collectAsState.getValue();
                        str = (customerProfileDetails3 == null || (customerProfileData = customerProfileDetails3.customerProfileData) == null) ? null : customerProfileData.lookupKey;
                        if (str == null) {
                            str = "";
                        }
                    }
                    FlowExtensionsKt$combine$$inlined$combine$1 flowExtensionsKt$combine$$inlined$combine$1 = new FlowExtensionsKt$combine$$inlined$combine$1(1, ((RealFavoritesManager) profilePresenter2.favoritesManager).getFavorites(), str);
                    gapComposer3.updateRememberedValue(flowExtensionsKt$combine$$inlined$combine$1);
                    rememberedValue6 = flowExtensionsKt$combine$$inlined$combine$1;
                }
                Boolean bool2 = Boolean.FALSE;
                MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue6, bool2, null, gapComposer3, 48, 2);
                CustomerProfileDetails customerProfileDetails4 = (CustomerProfileDetails) collectAsState.getValue();
                boolean changed3 = gapComposer3.changed(customerProfileDetails4 != null ? customerProfileDetails4.customerProfileData : null);
                Object rememberedValue7 = gapComposer3.rememberedValue();
                if (changed3 || rememberedValue7 == neverEqualPolicy) {
                    CustomerProfileDetails customerProfileDetails5 = (CustomerProfileDetails) collectAsState.getValue();
                    if (customerProfileDetails5 == null || (customerProfileData4 = customerProfileDetails5.customerProfileData) == null || (str2 = customerProfileData4.customerId) == null) {
                        CustomerProfileDetails customerProfileDetails6 = (CustomerProfileDetails) collectAsState.getValue();
                        str2 = (customerProfileDetails6 == null || (customerProfileData3 = customerProfileDetails6.customerProfileData) == null) ? null : customerProfileData3.lookupKey;
                        if (str2 == null) {
                            str2 = "";
                        }
                    }
                    InviteContactsPresenter$special$$inlined$map$1 inviteContactsPresenter$special$$inlined$map$1 = new InviteContactsPresenter$special$$inlined$map$1(((RealAllowlistRepository) obj8).getAllowlistedTokensIfActive(), str2, 29);
                    gapComposer3.updateRememberedValue(inviteContactsPresenter$special$$inlined$map$1);
                    rememberedValue7 = inviteContactsPresenter$special$$inlined$map$1;
                }
                MutableState collectAsState6 = Updater.collectAsState((Flow) rememberedValue7, bool2, null, gapComposer3, 48, 2);
                Object rememberedValue8 = gapComposer3.rememberedValue();
                if (rememberedValue8 == neverEqualPolicy) {
                    rememberedValue8 = Updater.mutableStateOf$default(null);
                    gapComposer3.updateRememberedValue(rememberedValue8);
                }
                MutableState mutableState9 = (MutableState) rememberedValue8;
                Object rememberedValue9 = gapComposer3.rememberedValue();
                if (rememberedValue9 == neverEqualPolicy) {
                    NullStateSwipeConfigProvider nullStateSwipeConfigProvider = new NullStateSwipeConfigProvider(new CashQrScannerPresenter$special$$inlined$filter$1(flow, 6), 9);
                    gapComposer3.updateRememberedValue(nullStateSwipeConfigProvider);
                    rememberedValue9 = nullStateSwipeConfigProvider;
                }
                Debug debug = (Debug) ((RealGenericProfileElementsPresenter) obj9).models((Flow) rememberedValue9, gapComposer3, 0);
                Object rememberedValue10 = gapComposer3.rememberedValue();
                if (rememberedValue10 == neverEqualPolicy) {
                    rememberedValue10 = Updater.mutableStateOf$default(null);
                    gapComposer3.updateRememberedValue(rememberedValue10);
                }
                MutableState mutableState10 = (MutableState) rememberedValue10;
                Updater.LaunchedEffect(gapComposer3, flow, new ZiplineLoader$load$2(flow, (Continuation) null, this, mutableState9, collectAsState, collectAsState2, collectAsState5, mutableState10, 28));
                CustomerProfileDetails customerProfileDetails7 = (CustomerProfileDetails) collectAsState.getValue();
                NotificationCompat profileViewModel$Loaded$ProfileBody$Loaded = (customerProfileDetails7 != null ? customerProfileDetails7.customerProfileData : null) == null ? ProfileViewModel$Loaded$ProfileBody$Loading.INSTANCE : new ProfileViewModel$Loaded$ProfileBody$Loaded(debug);
                CustomerProfileDetails customerProfileDetails8 = (CustomerProfileDetails) collectAsState.getValue();
                if ((customerProfileDetails8 != null ? customerProfileDetails8.customerProfileData : null) == null || ((Boolean) collectAsState3.getValue()) == null) {
                    gapComposer = gapComposer3;
                    z = false;
                    loading = new ProfileViewModel.Loading(false);
                } else {
                    boolean z14 = Intrinsics.areEqual((Boolean) collectAsState3.getValue(), bool2) && !(debug instanceof GenericProfileElementsViewModel$Success ? ((GenericProfileElementsViewModel$Success) debug).blocked : false) && (((PrincipalAccountToken) collectAsState4.getValue()) instanceof PrincipalAccountToken.None);
                    ProfileViewModel$Loaded$ProfileBody$Loaded profileViewModel$Loaded$ProfileBody$Loaded2 = profileViewModel$Loaded$ProfileBody$Loaded instanceof ProfileViewModel$Loaded$ProfileBody$Loaded ? (ProfileViewModel$Loaded$ProfileBody$Loaded) profileViewModel$Loaded$ProfileBody$Loaded : null;
                    Debug debug2 = profileViewModel$Loaded$ProfileBody$Loaded2 != null ? profileViewModel$Loaded$ProfileBody$Loaded2.genericProfileElements : null;
                    GenericProfileElementsViewModel$Success genericProfileElementsViewModel$Success = debug2 instanceof GenericProfileElementsViewModel$Success ? (GenericProfileElementsViewModel$Success) debug2 : null;
                    if (genericProfileElementsViewModel$Success == null || (list = genericProfileElementsViewModel$Success.elements) == null) {
                        genericProfileElementViewModel = null;
                    } else {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                genericProfileElementViewModel2 = it.next();
                                if (((GenericProfileElementViewModel) genericProfileElementViewModel2) instanceof GenericProfileElementViewModel.AddOrRemoveAsFavoriteButtonWidget) {
                                }
                            } else {
                                genericProfileElementViewModel2 = 0;
                            }
                        }
                        genericProfileElementViewModel = genericProfileElementViewModel2;
                    }
                    GenericProfileElementViewModel.AddOrRemoveAsFavoriteButtonWidget addOrRemoveAsFavoriteButtonWidget = genericProfileElementViewModel instanceof GenericProfileElementViewModel.AddOrRemoveAsFavoriteButtonWidget ? (GenericProfileElementViewModel.AddOrRemoveAsFavoriteButtonWidget) genericProfileElementViewModel : null;
                    CustomerProfileDetails customerProfileDetails9 = (CustomerProfileDetails) collectAsState.getValue();
                    customerProfileDetails9.getClass();
                    CustomerProfileData customerProfileData5 = customerProfileDetails9.customerProfileData;
                    boolean booleanValue = ((Boolean) collectAsState5.getValue()).booleanValue();
                    boolean booleanValue2 = ((Boolean) collectAsState6.getValue()).booleanValue();
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) obj7;
                    AndroidStringManager androidStringManager2 = (AndroidStringManager) obj10;
                    String str8 = customerProfileData5.cashtag;
                    BlockState blockState = customerProfileData5.blockState;
                    String str9 = customerProfileData5.displayName;
                    String fromString = Cashtags.fromString(str8, customerProfileData5.region);
                    if (fromString == null) {
                        String str10 = customerProfileData5.sms;
                        if (str10 != null) {
                            r15 = 0;
                            fromString = AliasFormatter.getDisplayText(str10, UiAlias.Type.SMS, null);
                        } else {
                            r15 = 0;
                            fromString = null;
                        }
                        if (fromString == null) {
                            String str11 = customerProfileData5.email;
                            fromString = str11 != null ? AliasFormatter.getDisplayText(str11, UiAlias.Type.EMAIL, r15) : r15;
                            if (fromString == null) {
                                fromString = customerProfileData5.merchantCategory;
                            }
                        }
                    }
                    Image image = customerProfileData5.photo;
                    boolean z15 = z14;
                    ColorModel model$default = Intrinsics.areEqual(customerProfileData5.shouldColorizeAvatar, Boolean.TRUE) ? MoshiJsonIntegration.toModel$default(ArcadeColors.BackgroundApp) : null;
                    Color color = customerProfileData5.accentColor;
                    StackedAvatarViewModel.Avatar avatar = new StackedAvatarViewModel.Avatar((color == null || (validate = ColorsKt.validate(color)) == null) ? new ColorModel.Accented(ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(1, null, customerProfileData5.customerId, customerProfileData5.displayName, customerProfileData5.sms, customerProfileData5.email))) : new ColorModel.Accented(validate), str9 != null ? StringsKt___StringsKt.firstOrNull(str9) : null, null, image, null, null, model$default, null, false, booleanValue2, null, false, null, null, 126452);
                    String str12 = str9 == null ? fromString : str9;
                    BlockState blockState2 = BlockState.BLOCKED;
                    if (blockState == blockState2) {
                        z2 = booleanValue;
                        str3 = androidStringManager2.get(R.string.profile_avatar_blocked_cont_desc);
                    } else {
                        z2 = booleanValue;
                        str3 = null;
                    }
                    if (str12 != null) {
                        mutableState = mutableState10;
                        featureFlagManager = featureFlagManager2;
                        Resources resources = androidStringManager2.resources;
                        resources.getClass();
                        gapComposer = gapComposer3;
                        notificationCompat = profileViewModel$Loaded$ProfileBody$Loaded;
                        str4 = new MessageFormat(resources.getString(R.string.profile_avatar_cont_desc)).format(new Object[]{str12});
                        str4.getClass();
                    } else {
                        notificationCompat = profileViewModel$Loaded$ProfileBody$Loaded;
                        mutableState = mutableState10;
                        gapComposer = gapComposer3;
                        featureFlagManager = featureFlagManager2;
                        str4 = androidStringManager2.get(R.string.profile_avatar_without_name_cont_desc);
                    }
                    StackedAvatarViewModel.Single single = new StackedAvatarViewModel.Single(avatar);
                    LaunchDarklyFeatureFlags$SponsorDrivenBlockingPhase_4 launchDarklyFeatureFlags$SponsorDrivenBlockingPhase_4 = LaunchDarklyFeatureFlags$SponsorDrivenBlockingPhase_4.INSTANCE;
                    RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
                    boolean enabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) realFeatureFlagManager.peekCurrentValue(launchDarklyFeatureFlags$SponsorDrivenBlockingPhase_4)).enabled();
                    if (enabled) {
                        if (str3 != null) {
                            str5 = " ".concat(str3);
                            break;
                        } else {
                            str5 = null;
                            break;
                        }
                    } else if (enabled) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    str5 = "";
                    String m$1 = Recorder$$ExternalSyntheticOutline2.m$1(str4, str5);
                    ProfileHeaderViewModel.BadgeName badgeName = new ProfileHeaderViewModel.BadgeName(str12, customerProfileData5.isBusiness, customerProfileData5.isVerified);
                    String str13 = !Intrinsics.areEqual(fromString, str9) ? fromString : null;
                    if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) realFeatureFlagManager.currentExperimentValue(launchDarklyFeatureFlags$SponsorDrivenBlockingPhase_4, false)).enabled() && blockState == blockState2) {
                        icons2 = Icons.Block24;
                    } else if (booleanValue2) {
                        icons2 = Icons.SecurityCheckFill24;
                    } else if (z2) {
                        icons2 = Icons.FavoriteFill24;
                    } else {
                        icons = null;
                        ProfileHeaderViewModel profileHeaderViewModel = new ProfileHeaderViewModel(single, m$1, badgeName, icons, photoImage(customerProfileData5) == null, str13);
                        int i7 = R.string.profile_action_pay;
                        if (z15 || (actionType2 = profileScreen.primaryAction.actionType) == ProfileScreens.ProfileScreen.Action.ActionType.NONE) {
                            actionButton = null;
                        } else {
                            int ordinal2 = actionType2.ordinal();
                            if (ordinal2 == 0) {
                                i2 = R.string.profile_action_pay;
                            } else if (ordinal2 == 1 || ordinal2 == 2) {
                                i2 = R.string.profile_action_request;
                            } else {
                                if (ordinal2 != 3) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                i2 = R.string.profile_action_none;
                            }
                            actionButton = new ProfileViewModel.Loaded.ProfileHeader.ActionButton(androidStringManager2.get(i2));
                        }
                        if (z15 || (actionType = profileScreen.primaryAction.actionType) != ProfileScreens.ProfileScreen.Action.ActionType.PAY_OR_REQUEST) {
                            actionButton2 = null;
                        } else {
                            int ordinal3 = actionType.ordinal();
                            if (ordinal3 != 0) {
                                if (ordinal3 == 1) {
                                    i7 = R.string.profile_action_request;
                                } else if (ordinal3 != 2) {
                                    if (ordinal3 != 3) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    i7 = R.string.profile_action_none;
                                }
                            }
                            actionButton2 = new ProfileViewModel.Loaded.ProfileHeader.ActionButton(androidStringManager2.get(i7));
                        }
                        boolean booleanValue3 = z15 ? false : (profileScreen.previewMode || (bool = customerProfileData5.canAcceptPayments) == null) ? true : bool.booleanValue();
                        ordinal = profileScreen.backNavigationAction.ordinal();
                        if (ordinal != 0) {
                            navigationIcon = NavigationIcon.CLOSE;
                        } else {
                            if (ordinal != 1) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            navigationIcon = NavigationIcon.BACK;
                        }
                        loading = new ProfileViewModel.Loaded(new ProfileViewModel.Loaded.ProfileHeader(navigationIcon, addOrRemoveAsFavoriteButtonWidget == null ? new ProfileViewModel.Loaded.ProfileHeader.FavoriteAction(addOrRemoveAsFavoriteButtonWidget.viewModel) : null, profileHeaderViewModel, actionButton, actionButton2, booleanValue3), notificationCompat, (ProfileViewModel.Loaded.ProfilePhoto) mutableState.getValue());
                        z = false;
                    }
                    icons = icons2;
                    ProfileHeaderViewModel profileHeaderViewModel2 = new ProfileHeaderViewModel(single, m$1, badgeName, icons, photoImage(customerProfileData5) == null, str13);
                    int i72 = R.string.profile_action_pay;
                    if (z15) {
                    }
                    actionButton = null;
                    if (z15) {
                    }
                    actionButton2 = null;
                    if (z15) {
                    }
                    ordinal = profileScreen.backNavigationAction.ordinal();
                    if (ordinal != 0) {
                    }
                    loading = new ProfileViewModel.Loaded(new ProfileViewModel.Loaded.ProfileHeader(navigationIcon, addOrRemoveAsFavoriteButtonWidget == null ? new ProfileViewModel.Loaded.ProfileHeader.FavoriteAction(addOrRemoveAsFavoriteButtonWidget.viewModel) : null, profileHeaderViewModel2, actionButton, actionButton2, booleanValue3), notificationCompat, (ProfileViewModel.Loaded.ProfilePhoto) mutableState.getValue());
                    z = false;
                }
                gapComposer.end(z);
                return loading;
            case 1:
                flow.getClass();
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(2055432608);
                Object rememberedValue11 = gapComposer4.rememberedValue();
                if (rememberedValue11 == neverEqualPolicy) {
                    rememberedValue11 = Updater.mutableStateOf$default(new BitcoinQrCodeScannerPresenter$State(false, false, true, null, null, false, CameraState.RESUMED));
                    gapComposer4.updateRememberedValue(rememberedValue11);
                }
                MutableState mutableState11 = (MutableState) rememberedValue11;
                Continuation continuation2 = null;
                if (((BitcoinQrCodeScannerPresenter$State) mutableState11.getValue()).needToRequestPermission) {
                    gapComposer4.startReplaceGroup(44656165);
                    boolean changedInstance = gapComposer4.changedInstance(profilePresenter2);
                    Object rememberedValue12 = gapComposer4.rememberedValue();
                    if (changedInstance || rememberedValue12 == neverEqualPolicy) {
                        rememberedValue12 = new SearchBarBinding$Content$1$1(profilePresenter2, mutableState11, continuation2, i5);
                        gapComposer4.updateRememberedValue(rememberedValue12);
                    }
                    Updater.LaunchedEffect(gapComposer4, "need-to-request-camera-permission", (Function2) rememberedValue12);
                    gapComposer4.end(false);
                } else {
                    gapComposer4.startReplaceGroup(44837794);
                    gapComposer4.end(false);
                }
                BitcoinQrCodeScannerPresenter$State.ProcessingCode processingCode = ((BitcoinQrCodeScannerPresenter$State) mutableState11.getValue()).processingCode;
                ((BitcoinQrCodeScannerPresenter$State) mutableState11.getValue()).getClass();
                Boolean bool3 = Boolean.TRUE;
                if (processingCode != null) {
                    gapComposer4.startReplaceGroup(-1383927846);
                    RealContactSync$syncRequest$2 realContactSync$syncRequest$2 = new RealContactSync$syncRequest$2(processingCode, bool3, null, this, mutableState11);
                    mutableState11 = mutableState11;
                    Updater.LaunchedEffect(processingCode, bool3, realContactSync$syncRequest$2, gapComposer4);
                    gapComposer4.end(false);
                } else {
                    gapComposer4.startReplaceGroup(-1383879796);
                    gapComposer4.end(false);
                }
                if (((BitcoinQrCodeScannerPresenter$State) mutableState11.getValue()).handlingPastedAddress) {
                    gapComposer4.startReplaceGroup(45355060);
                    ((BitcoinQrCodeScannerPresenter$State) mutableState11.getValue()).getClass();
                    gapComposer4.startReplaceGroup(-1383927846);
                    profilePresenter = this;
                    continuation = null;
                    Updater.LaunchedEffect("handle-paste-address", bool3, new zzmh(bool3, continuation2, profilePresenter, mutableState11, 20), gapComposer4);
                    gapComposer4.end(false);
                    gapComposer4.end(false);
                } else {
                    profilePresenter = this;
                    continuation = null;
                    gapComposer4.startReplaceGroup(45983554);
                    gapComposer4.end(false);
                }
                ChannelFlowTransformLatest channelFlowTransformLatest = (ChannelFlowTransformLatest) obj4;
                Updater.LaunchedEffect(gapComposer4, channelFlowTransformLatest, new PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1(1, mutableState11, continuation, channelFlowTransformLatest));
                DataStoreImpl$data$1$invokeSuspend$$inlined$map$1 dataStoreImpl$data$1$invokeSuspend$$inlined$map$1 = (DataStoreImpl$data$1$invokeSuspend$$inlined$map$1) obj5;
                Updater.LaunchedEffect(gapComposer4, dataStoreImpl$data$1$invokeSuspend$$inlined$map$1, new PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1(2, mutableState11, continuation, dataStoreImpl$data$1$invokeSuspend$$inlined$map$1));
                Flow flow2 = (Flow) profilePresenter.profileDetailsProvider;
                Continuation continuation3 = continuation;
                Updater.LaunchedEffect(gapComposer4, flow2, new BitcoinQrCodeScannerPresenter$models$$inlined$CollectEffect$3(flow2, continuation3, profilePresenter, mutableState11, 0));
                Updater.LaunchedEffect(gapComposer4, flow, new BitcoinQrCodeScannerPresenter$models$$inlined$CollectEffect$3(flow, continuation3, this, mutableState11, 1));
                BitcoinDepositsPresenter$special$$inlined$filter$1 bitcoinDepositsPresenter$special$$inlined$filter$1 = (BitcoinDepositsPresenter$special$$inlined$filter$1) obj9;
                Updater.LaunchedEffect(gapComposer4, bitcoinDepositsPresenter$special$$inlined$filter$1, new PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1(3, mutableState11, continuation3, bitcoinDepositsPresenter$special$$inlined$filter$1));
                BitcoinQrCodeScannerPresenter$State bitcoinQrCodeScannerPresenter$State = (BitcoinQrCodeScannerPresenter$State) mutableState11.getValue();
                AndroidStringManager androidStringManager3 = (AndroidStringManager) obj10;
                QrAddressScannerViewModel qrAddressScannerViewModel = new QrAddressScannerViewModel(bitcoinQrCodeScannerPresenter$State.instrument == null, bitcoinQrCodeScannerPresenter$State.isCameraPermissionGranted, androidStringManager3.get(((BitcoinQrCodeScannerScreen) obj8).supportStablecoin ? R.string.stablecoin_qr_scanner_title : R.string.bitcoin_or_lightning_qr_scanner_title), androidStringManager3.get(R.string.crypto_paste_address), androidStringManager3.get(R.string.bitcoin_qr_scanner_hint), bitcoinQrCodeScannerPresenter$State.cameraState);
                gapComposer4.end(false);
                return qrAddressScannerViewModel;
            case 2:
                return models$com$squareup$cash$family$familyhub$presenters$SponsorDetailPresenter(flow, composer, i);
            case 3:
                return models$com$squareup$cash$investing$presenters$InvestingHomePresenter(flow, composer, i);
            default:
                FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) obj7;
                AndroidClock androidClock = (AndroidClock) obj6;
                AndroidStringManager androidStringManager4 = (AndroidStringManager) obj10;
                MoneyFormatter moneyFormatter = (MoneyFormatter) obj5;
                PoolDetailsScreen poolDetailsScreen3 = (PoolDetailsScreen) obj4;
                flow.getClass();
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startReplaceGroup(1846125004);
                Object rememberedValue13 = gapComposer5.rememberedValue();
                if (rememberedValue13 == neverEqualPolicy) {
                    rememberedValue13 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer5.updateRememberedValue(rememberedValue13);
                }
                MutableState mutableState12 = (MutableState) rememberedValue13;
                Object[] objArr = new Object[0];
                boolean changedInstance2 = gapComposer5.changedInstance(profilePresenter2);
                Object rememberedValue14 = gapComposer5.rememberedValue();
                if (changedInstance2 || rememberedValue14 == neverEqualPolicy) {
                    rememberedValue14 = new PoolDetailsPresenter$$ExternalSyntheticLambda0(profilePresenter2, i6);
                    gapComposer5.updateRememberedValue(rememberedValue14);
                }
                MutableState mutableState13 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue14, gapComposer5, 0);
                Object rememberedValue15 = gapComposer5.rememberedValue();
                if (rememberedValue15 == neverEqualPolicy) {
                    rememberedValue15 = Updater.mutableStateOf$default(EmptyList.INSTANCE);
                    gapComposer5.updateRememberedValue(rememberedValue15);
                }
                MutableState mutableState14 = (MutableState) rememberedValue15;
                Object rememberedValue16 = gapComposer5.rememberedValue();
                if (rememberedValue16 == neverEqualPolicy) {
                    rememberedValue16 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer5.updateRememberedValue(rememberedValue16);
                }
                MutableState mutableState15 = (MutableState) rememberedValue16;
                Object[] objArr2 = new Object[0];
                Object rememberedValue17 = gapComposer5.rememberedValue();
                int i8 = 4;
                if (rememberedValue17 == neverEqualPolicy) {
                    rememberedValue17 = new DateScrubber$$ExternalSyntheticLambda0(i8);
                    gapComposer5.updateRememberedValue(rememberedValue17);
                }
                MutableState mutableState16 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue17, gapComposer5, 48);
                UiCallbackModel models = ((RealActivityEmbeddedPresenter) obj9).models(gapComposer5, 0);
                Object obj11 = models.model;
                Object rememberedValue18 = gapComposer5.rememberedValue();
                if (rememberedValue18 == neverEqualPolicy) {
                    rememberedValue18 = Updater.mutableStateOf$default(null);
                    gapComposer5.updateRememberedValue(rememberedValue18);
                }
                MutableState mutableState17 = (MutableState) rememberedValue18;
                Object rememberedValue19 = gapComposer5.rememberedValue();
                if (rememberedValue19 == neverEqualPolicy) {
                    String str14 = poolDetailsScreen3.token;
                    str14.getClass();
                    poolDetailsScreen = poolDetailsScreen3;
                    mutableState2 = mutableState17;
                    AndroidPermissionChecker$create$1$denied$$inlined$filter$1 androidPermissionChecker$create$1$denied$$inlined$filter$1 = new AndroidPermissionChecker$create$1$denied$$inlined$filter$1(((RealPoolsRepository) obj3).goalMetAnimationSeen.observe(), str14, 2);
                    gapComposer5.updateRememberedValue(androidPermissionChecker$create$1$denied$$inlined$filter$1);
                    rememberedValue19 = androidPermissionChecker$create$1$denied$$inlined$filter$1;
                } else {
                    poolDetailsScreen = poolDetailsScreen3;
                    mutableState2 = mutableState17;
                }
                MutableState collectAsState7 = Updater.collectAsState((Flow) rememberedValue19, Boolean.FALSE, null, gapComposer5, 48, 2);
                Unit unit2 = Unit.INSTANCE;
                boolean changedInstance3 = gapComposer5.changedInstance(profilePresenter2) | gapComposer5.changed(mutableState13);
                Object rememberedValue20 = gapComposer5.rememberedValue();
                if (changedInstance3 || rememberedValue20 == neverEqualPolicy) {
                    unit = unit2;
                    mutableState3 = mutableState14;
                    androidStringManager = androidStringManager4;
                    mutableState4 = mutableState16;
                    str6 = "";
                    gapComposer2 = gapComposer5;
                    poolDetailsScreen2 = poolDetailsScreen;
                    moleculeKt$immediateClockFlow$1$1$1 = new MoleculeKt$immediateClockFlow$1$1$1(profilePresenter2, mutableState2, mutableState13, mutableState15, (Continuation) null, 24);
                    mutableState5 = mutableState15;
                    mutableState6 = mutableState13;
                    profilePresenter2 = profilePresenter2;
                    gapComposer2.updateRememberedValue(moleculeKt$immediateClockFlow$1$1$1);
                } else {
                    mutableState3 = mutableState14;
                    androidStringManager = androidStringManager4;
                    mutableState4 = mutableState16;
                    str6 = "";
                    poolDetailsScreen2 = poolDetailsScreen;
                    gapComposer2 = gapComposer5;
                    moleculeKt$immediateClockFlow$1$1$1 = rememberedValue20;
                    mutableState6 = mutableState13;
                    mutableState5 = mutableState15;
                    unit = unit2;
                }
                Updater.LaunchedEffect(gapComposer2, unit, (Function2) moleculeKt$immediateClockFlow$1$1$1);
                if (((MoneyPool) mutableState6.getValue()) != null) {
                    gapComposer2.startReplaceGroup(855052255);
                    boolean changedInstance4 = gapComposer2.changedInstance(profilePresenter2) | gapComposer2.changed(mutableState6);
                    Object rememberedValue21 = gapComposer2.rememberedValue();
                    if (changedInstance4 || rememberedValue21 == neverEqualPolicy) {
                        rememberedValue21 = new MainPaymentView$Content$2$1(profilePresenter2, mutableState6, null, 27);
                        gapComposer2.updateRememberedValue(rememberedValue21);
                    }
                    Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue21);
                    MoneyPool moneyPool4 = (MoneyPool) mutableState6.getValue();
                    moneyPool4.getClass();
                    List list3 = moneyPool4.participants;
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj12 : list3) {
                        if (hashSet.add(((PoolParticipant) obj12).customer_identifier)) {
                            arrayList.add(obj12);
                        }
                    }
                    mutableState7 = mutableState3;
                    mutableState7.setValue(arrayList);
                    z3 = false;
                    gapComposer2.end(false);
                } else {
                    mutableState7 = mutableState3;
                    z3 = false;
                    gapComposer2.startReplaceGroup(855443382);
                    gapComposer2.end(false);
                }
                GapComposer gapComposer6 = gapComposer2;
                MutableState mutableState18 = mutableState2;
                MutableState mutableState19 = mutableState4;
                Updater.LaunchedEffect(gapComposer6, flow, new OffersHomePresenter$models$8$1(flow, (Continuation) null, (MoleculePresenter) profilePresenter2, mutableState6, mutableState5, mutableState7, mutableState18, mutableState12, mutableState19, 10));
                if (((LoadPoolStatus) mutableState18.getValue()) != null && (((LoadPoolStatus) mutableState18.getValue()) instanceof LoadPoolStatus.ResponseFailure)) {
                    gapComposer6.startReplaceGroup(304839424);
                    gapComposer6.end(false);
                    loadingError = new PoolDetailsViewModel.LoadingError(PoolDetailsViewModel.LoadingErrorType.Forbidden.INSTANCE);
                } else {
                    if (((LoadPoolStatus) mutableState18.getValue()) == null) {
                        if (((MoneyPool) mutableState6.getValue()) != null) {
                            gapComposer6.startReplaceGroup(860426229);
                            String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull((SessionManager) obj2);
                            MoneyPool moneyPool5 = (MoneyPool) mutableState6.getValue();
                            moneyPool5.getClass();
                            Money money2 = moneyPool5.balance;
                            float longValue2 = (money2 == null || (l = money2.amount) == null) ? RecyclerView.DECELERATION_RATE : l.longValue();
                            MoneyPool moneyPool6 = (MoneyPool) mutableState6.getValue();
                            moneyPool6.getClass();
                            Money money3 = moneyPool6.target;
                            money3.getClass();
                            money3.amount.getClass();
                            float longValue3 = longValue2 / r5.longValue();
                            float f2 = 1.0f;
                            float f3 = longValue3 > 1.0f ? 1.0f : longValue3;
                            MoneyPool moneyPool7 = (MoneyPool) mutableState6.getValue();
                            moneyPool7.getClass();
                            PoolOwner poolOwner = moneyPool7.owner;
                            poolOwner.getClass();
                            boolean areEqual = Intrinsics.areEqual(poolOwner.customer_token, activeAccountTokenOrNull);
                            if (areEqual) {
                                MoneyPool moneyPool8 = (MoneyPool) mutableState6.getValue();
                                moneyPool8.getClass();
                                if (moneyPool8.status == PoolState.POOL_STATE_ACTIVE_IN_PROGRESS) {
                                    MoneyPool moneyPool9 = (MoneyPool) mutableState6.getValue();
                                    moneyPool9.getClass();
                                    if (moneyPool9.closed_at == null) {
                                        z5 = true;
                                        if (areEqual) {
                                            MoneyPool moneyPool10 = (MoneyPool) mutableState6.getValue();
                                            moneyPool10.getClass();
                                            if (moneyPool10.share_link != null) {
                                                z6 = true;
                                                MoneyPool moneyPool11 = (MoneyPool) mutableState6.getValue();
                                                moneyPool11.getClass();
                                                z7 = moneyPool11.goal_state == PoolGoalState.POOL_GOAL_STATE_TARGET_MET;
                                                if (z7 && !((Boolean) collectAsState7.getValue()).booleanValue()) {
                                                    MoneyPool moneyPool12 = (MoneyPool) mutableState6.getValue();
                                                    moneyPool12.getClass();
                                                    Long l2 = moneyPool12.goal_reached_at;
                                                    longValue = l2 == null ? l2.longValue() : 0L;
                                                    millis = androidClock.millis();
                                                    Duration.Companion companion = Duration.Companion;
                                                    if (longValue > millis - Duration.m4167getInWholeMillisecondsimpl(DurationKt.toDuration(30, DurationUnit.DAYS))) {
                                                        z8 = true;
                                                        if (!areEqual) {
                                                            MoneyPool moneyPool13 = (MoneyPool) mutableState6.getValue();
                                                            moneyPool13.getClass();
                                                            List list4 = moneyPool13.participants;
                                                            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                                                Iterator it2 = list4.iterator();
                                                                while (it2.hasNext()) {
                                                                    if (Intrinsics.areEqual(((PoolParticipant) it2.next()).customer_identifier, activeAccountTokenOrNull)) {
                                                                    }
                                                                }
                                                            }
                                                            z9 = false;
                                                            activityEmbeddedViewModel = (ActivityEmbeddedViewModel) obj11;
                                                            list2 = activityEmbeddedViewModel.feedEntries;
                                                            if ((list2 instanceof Collection) || !list2.isEmpty()) {
                                                                for (ActivityFeedEntry activityFeedEntry : list2) {
                                                                    f = f2;
                                                                    if ((activityFeedEntry instanceof ActivityFeedEntry.Item) || (activityFeedEntry instanceof ActivityFeedEntry.ErrorItem)) {
                                                                        z10 = true;
                                                                        boolean z16 = z9 ? !(activityEmbeddedViewModel.getHasLoadingError() || !z10) : activityEmbeddedViewModel.getHasLoadingError() || z10;
                                                                        changed = gapComposer6.changed(((Boolean) mutableState19.getValue()).booleanValue());
                                                                        rememberedValue = gapComposer6.rememberedValue();
                                                                        if (!changed || rememberedValue == neverEqualPolicy) {
                                                                            money = poolDetailsScreen2.lastBalance;
                                                                            if (money != null) {
                                                                                MoneyPool moneyPool14 = (MoneyPool) mutableState6.getValue();
                                                                                moneyPool14.getClass();
                                                                                if (!Intrinsics.areEqual(moneyPool14.balance, money)) {
                                                                                    MoneyPool moneyPool15 = (MoneyPool) mutableState6.getValue();
                                                                                    moneyPool15.getClass();
                                                                                    Money money4 = moneyPool15.balance;
                                                                                    money4.getClass();
                                                                                    money.getClass();
                                                                                    Money minus = Moneys.minus(money4, money);
                                                                                    MoneyPool moneyPool16 = (MoneyPool) mutableState6.getValue();
                                                                                    moneyPool16.getClass();
                                                                                    Money money5 = moneyPool16.target;
                                                                                    money5.getClass();
                                                                                    Long l3 = money5.amount;
                                                                                    l3.getClass();
                                                                                    mutableState8 = mutableState6;
                                                                                    float longValue4 = l3.longValue();
                                                                                    float amount = Moneys.amount(money) / longValue4;
                                                                                    MoneyPool moneyPool17 = (MoneyPool) mutableState8.getValue();
                                                                                    moneyPool17.getClass();
                                                                                    moneyPool17.balance.getClass();
                                                                                    contributionAnimation = new ContributionAnimation(minus, moneyFormatter.format(minus), money, moneyFormatter.format(money), amount >= f ? RecyclerView.DECELERATION_RATE : (Moneys.amount(r5) / longValue4) - amount, ((Boolean) mutableState19.getValue()).booleanValue());
                                                                                    gapComposer6.updateRememberedValue(contributionAnimation);
                                                                                    rememberedValue = contributionAnimation;
                                                                                }
                                                                            }
                                                                            mutableState8 = mutableState6;
                                                                            contributionAnimation = null;
                                                                            gapComposer6.updateRememberedValue(contributionAnimation);
                                                                            rememberedValue = contributionAnimation;
                                                                        } else {
                                                                            mutableState8 = mutableState6;
                                                                        }
                                                                        ContributionAnimation contributionAnimation2 = (ContributionAnimation) rememberedValue;
                                                                        MoneyPool moneyPool18 = (MoneyPool) mutableState8.getValue();
                                                                        moneyPool18.getClass();
                                                                        String str15 = moneyPool18.name;
                                                                        str15.getClass();
                                                                        MoneyPool moneyPool19 = (MoneyPool) mutableState8.getValue();
                                                                        moneyPool19.getClass();
                                                                        PoolOwner poolOwner2 = moneyPool19.owner;
                                                                        poolOwner2.getClass();
                                                                        String str16 = poolOwner2.full_name;
                                                                        ArrayMap m = SVG$Unit$EnumUnboxingLocalUtility.m(1, str16, "name", str16);
                                                                        AndroidStringManager androidStringManager5 = androidStringManager;
                                                                        Resources resources2 = androidStringManager5.resources;
                                                                        resources2.getClass();
                                                                        String format3 = new MessageFormat(resources2.getString(R.string.pools_details_subtitle)).format(m);
                                                                        format3.getClass();
                                                                        MoneyPool moneyPool20 = (MoneyPool) mutableState8.getValue();
                                                                        moneyPool20.getClass();
                                                                        Money money6 = moneyPool20.balance;
                                                                        money6.getClass();
                                                                        String format4 = moneyFormatter.format(money6);
                                                                        MoneyPool moneyPool21 = (MoneyPool) mutableState8.getValue();
                                                                        moneyPool21.getClass();
                                                                        Money money7 = moneyPool21.balance;
                                                                        money7.getClass();
                                                                        long amount2 = Moneys.amount(money7);
                                                                        MoneyPool moneyPool22 = (MoneyPool) mutableState8.getValue();
                                                                        moneyPool22.getClass();
                                                                        Money money8 = moneyPool22.target;
                                                                        money8.getClass();
                                                                        String format5 = moneyFormatter.format(money8);
                                                                        if (z5) {
                                                                            MoneyPool moneyPool23 = (MoneyPool) mutableState8.getValue();
                                                                            moneyPool23.getClass();
                                                                            List list5 = moneyPool23.participants;
                                                                            if ((list5 instanceof Collection) && list5.isEmpty()) {
                                                                                i3 = 0;
                                                                            } else {
                                                                                Iterator it3 = list5.iterator();
                                                                                i3 = 0;
                                                                                while (it3.hasNext()) {
                                                                                    if (((PoolParticipant) it3.next()).participant_type == PoolParticipantType.POOL_PARTICIPANT_TYPE_CASH_APP_USER && (i3 = i3 + 1) < 0) {
                                                                                        CollectionsKt__CollectionsKt.throwCountOverflow();
                                                                                        throw null;
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (i3 < 50) {
                                                                                if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager3).currentValue(AmplitudeExperiments$P2pPools.INSTANCE)).enabled()) {
                                                                                    z11 = true;
                                                                                    boolean z17 = !z5 && z7;
                                                                                    moneyPool = (MoneyPool) mutableState8.getValue();
                                                                                    moneyPool.getClass();
                                                                                    if (moneyPool.status == PoolState.POOL_STATE_ACTIVE_IN_PROGRESS) {
                                                                                        if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager3).peekCurrentValue(LaunchDarklyFeatureFlags$PoolsContributeControl.INSTANCE)).enabled()) {
                                                                                            z12 = true;
                                                                                            moneyPool2 = (MoneyPool) mutableState8.getValue();
                                                                                            moneyPool2.getClass();
                                                                                            if (moneyPool2.status != PoolState.POOL_STATE_MANUAL_CLOSED) {
                                                                                                MoneyPool moneyPool24 = (MoneyPool) mutableState8.getValue();
                                                                                                moneyPool24.getClass();
                                                                                                if (moneyPool24.status != PoolState.POOL_STATE_CLOSING) {
                                                                                                    z13 = false;
                                                                                                    moneyPool3 = (MoneyPool) mutableState8.getValue();
                                                                                                    moneyPool3.getClass();
                                                                                                    if (moneyPool3.status == PoolState.POOL_STATE_CLOSING) {
                                                                                                        format2 = androidStringManager5.get(R.string.pools_closing_label);
                                                                                                    } else {
                                                                                                        MoneyPool moneyPool25 = (MoneyPool) mutableState8.getValue();
                                                                                                        moneyPool25.getClass();
                                                                                                        if (moneyPool25.closed_at != null) {
                                                                                                            MoneyPool moneyPool26 = (MoneyPool) mutableState8.getValue();
                                                                                                            moneyPool26.getClass();
                                                                                                            Long l4 = moneyPool26.closed_at;
                                                                                                            l4.getClass();
                                                                                                            long longValue5 = l4.longValue();
                                                                                                            LocalDate nowLocalDate = DimensionKt.nowLocalDate(androidClock);
                                                                                                            LocalDate millisToLocalDate = DimensionKt.millisToLocalDate(longValue5, androidClock.timeZone());
                                                                                                            AndroidDateFormatManager androidDateFormatManager = (AndroidDateFormatManager) obj8;
                                                                                                            String format6 = androidDateFormatManager.getDateFormat(nowLocalDate.getYear() == millisToLocalDate.getYear() ? "MMM d" : "MMM d, yyyy", androidDateFormatManager.clock.timeZone()).formatter.format(millisToLocalDate);
                                                                                                            format6.getClass();
                                                                                                            format2 = new MessageFormat(resources2.getString(R.string.pools_closed_on_date_label)).format(new Object[]{format6});
                                                                                                            format2.getClass();
                                                                                                        } else {
                                                                                                            str7 = str6;
                                                                                                            String str17 = !areEqual ? androidStringManager5.get(R.string.pools_closed_sub_text_owner) : androidStringManager5.get(R.string.pools_closed_sub_text_contributor);
                                                                                                            ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                                                                                                            MoneyPool moneyPool27 = (MoneyPool) mutableState8.getValue();
                                                                                                            moneyPool27.getClass();
                                                                                                            PoolOwner poolOwner3 = moneyPool27.owner;
                                                                                                            poolOwner3.getClass();
                                                                                                            String str18 = poolOwner3.customer_token;
                                                                                                            str18.getClass();
                                                                                                            String str19 = poolOwner3.full_name;
                                                                                                            String str20 = poolOwner3.profile_photo_url;
                                                                                                            createListBuilder.add(new com.squareup.cash.pools.viewmodels.PoolParticipant(str19, str18, str20 == null ? new Image(str20, str20, 4) : null, ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(25, null, poolOwner3.customer_token, poolOwner3.full_name, null, null))));
                                                                                                            List list6 = (List) mutableState7.getValue();
                                                                                                            ArrayList arrayList2 = new ArrayList();
                                                                                                            for (Object obj13 : list6) {
                                                                                                                if (((PoolParticipant) obj13).participant_type == PoolParticipantType.POOL_PARTICIPANT_TYPE_CASH_APP_USER) {
                                                                                                                    arrayList2.add(obj13);
                                                                                                                }
                                                                                                            }
                                                                                                            List<PoolParticipant> sortedWith = CollectionsKt.sortedWith(arrayList2, new LinkedHashTreeMap.AnonymousClass1(4));
                                                                                                            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith, 10));
                                                                                                            for (PoolParticipant poolParticipant : sortedWith) {
                                                                                                                String str21 = poolParticipant.customer_identifier;
                                                                                                                str21.getClass();
                                                                                                                String str22 = poolParticipant.full_name;
                                                                                                                String str23 = poolParticipant.profile_photo_url;
                                                                                                                arrayList3.add(new com.squareup.cash.pools.viewmodels.PoolParticipant(str22, str21, str23 != null ? new Image(str23, str23, 4) : null, ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(25, null, poolParticipant.customer_identifier, poolParticipant.full_name, null, null))));
                                                                                                            }
                                                                                                            createListBuilder.addAll(Tags.toImmutableList(arrayList3));
                                                                                                            obj = new PoolDetailsViewModel.Loaded(str15, format3, format4, amount2, format5, f3, z6, z11, z17, z12, z13, str7, str17, Tags.toImmutableList(CollectionsKt__CollectionsJVMKt.build(createListBuilder)), z9, z16, models, contributionAnimation2, ((Boolean) mutableState12.getValue()).booleanValue(), z8);
                                                                                                            z4 = false;
                                                                                                            gapComposer6.end(false);
                                                                                                        }
                                                                                                    }
                                                                                                    str7 = format2;
                                                                                                    String str172 = !areEqual ? androidStringManager5.get(R.string.pools_closed_sub_text_owner) : androidStringManager5.get(R.string.pools_closed_sub_text_contributor);
                                                                                                    ListBuilder createListBuilder2 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                                                                                                    MoneyPool moneyPool272 = (MoneyPool) mutableState8.getValue();
                                                                                                    moneyPool272.getClass();
                                                                                                    PoolOwner poolOwner32 = moneyPool272.owner;
                                                                                                    poolOwner32.getClass();
                                                                                                    String str182 = poolOwner32.customer_token;
                                                                                                    str182.getClass();
                                                                                                    String str192 = poolOwner32.full_name;
                                                                                                    String str202 = poolOwner32.profile_photo_url;
                                                                                                    createListBuilder2.add(new com.squareup.cash.pools.viewmodels.PoolParticipant(str192, str182, str202 == null ? new Image(str202, str202, 4) : null, ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(25, null, poolOwner32.customer_token, poolOwner32.full_name, null, null))));
                                                                                                    List list62 = (List) mutableState7.getValue();
                                                                                                    ArrayList arrayList22 = new ArrayList();
                                                                                                    while (r2.hasNext()) {
                                                                                                    }
                                                                                                    List<PoolParticipant> sortedWith2 = CollectionsKt.sortedWith(arrayList22, new LinkedHashTreeMap.AnonymousClass1(4));
                                                                                                    ArrayList arrayList32 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith2, 10));
                                                                                                    while (r2.hasNext()) {
                                                                                                    }
                                                                                                    createListBuilder2.addAll(Tags.toImmutableList(arrayList32));
                                                                                                    obj = new PoolDetailsViewModel.Loaded(str15, format3, format4, amount2, format5, f3, z6, z11, z17, z12, z13, str7, str172, Tags.toImmutableList(CollectionsKt__CollectionsJVMKt.build(createListBuilder2)), z9, z16, models, contributionAnimation2, ((Boolean) mutableState12.getValue()).booleanValue(), z8);
                                                                                                    z4 = false;
                                                                                                    gapComposer6.end(false);
                                                                                                }
                                                                                            }
                                                                                            z13 = true;
                                                                                            moneyPool3 = (MoneyPool) mutableState8.getValue();
                                                                                            moneyPool3.getClass();
                                                                                            if (moneyPool3.status == PoolState.POOL_STATE_CLOSING) {
                                                                                            }
                                                                                            str7 = format2;
                                                                                            String str1722 = !areEqual ? androidStringManager5.get(R.string.pools_closed_sub_text_owner) : androidStringManager5.get(R.string.pools_closed_sub_text_contributor);
                                                                                            ListBuilder createListBuilder22 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                                                                                            MoneyPool moneyPool2722 = (MoneyPool) mutableState8.getValue();
                                                                                            moneyPool2722.getClass();
                                                                                            PoolOwner poolOwner322 = moneyPool2722.owner;
                                                                                            poolOwner322.getClass();
                                                                                            String str1822 = poolOwner322.customer_token;
                                                                                            str1822.getClass();
                                                                                            String str1922 = poolOwner322.full_name;
                                                                                            String str2022 = poolOwner322.profile_photo_url;
                                                                                            createListBuilder22.add(new com.squareup.cash.pools.viewmodels.PoolParticipant(str1922, str1822, str2022 == null ? new Image(str2022, str2022, 4) : null, ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(25, null, poolOwner322.customer_token, poolOwner322.full_name, null, null))));
                                                                                            List list622 = (List) mutableState7.getValue();
                                                                                            ArrayList arrayList222 = new ArrayList();
                                                                                            while (r2.hasNext()) {
                                                                                            }
                                                                                            List<PoolParticipant> sortedWith22 = CollectionsKt.sortedWith(arrayList222, new LinkedHashTreeMap.AnonymousClass1(4));
                                                                                            ArrayList arrayList322 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith22, 10));
                                                                                            while (r2.hasNext()) {
                                                                                            }
                                                                                            createListBuilder22.addAll(Tags.toImmutableList(arrayList322));
                                                                                            obj = new PoolDetailsViewModel.Loaded(str15, format3, format4, amount2, format5, f3, z6, z11, z17, z12, z13, str7, str1722, Tags.toImmutableList(CollectionsKt__CollectionsJVMKt.build(createListBuilder22)), z9, z16, models, contributionAnimation2, ((Boolean) mutableState12.getValue()).booleanValue(), z8);
                                                                                            z4 = false;
                                                                                            gapComposer6.end(false);
                                                                                        }
                                                                                    }
                                                                                    z12 = false;
                                                                                    moneyPool2 = (MoneyPool) mutableState8.getValue();
                                                                                    moneyPool2.getClass();
                                                                                    if (moneyPool2.status != PoolState.POOL_STATE_MANUAL_CLOSED) {
                                                                                    }
                                                                                    z13 = true;
                                                                                    moneyPool3 = (MoneyPool) mutableState8.getValue();
                                                                                    moneyPool3.getClass();
                                                                                    if (moneyPool3.status == PoolState.POOL_STATE_CLOSING) {
                                                                                    }
                                                                                    str7 = format2;
                                                                                    String str17222 = !areEqual ? androidStringManager5.get(R.string.pools_closed_sub_text_owner) : androidStringManager5.get(R.string.pools_closed_sub_text_contributor);
                                                                                    ListBuilder createListBuilder222 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                                                                                    MoneyPool moneyPool27222 = (MoneyPool) mutableState8.getValue();
                                                                                    moneyPool27222.getClass();
                                                                                    PoolOwner poolOwner3222 = moneyPool27222.owner;
                                                                                    poolOwner3222.getClass();
                                                                                    String str18222 = poolOwner3222.customer_token;
                                                                                    str18222.getClass();
                                                                                    String str19222 = poolOwner3222.full_name;
                                                                                    String str20222 = poolOwner3222.profile_photo_url;
                                                                                    createListBuilder222.add(new com.squareup.cash.pools.viewmodels.PoolParticipant(str19222, str18222, str20222 == null ? new Image(str20222, str20222, 4) : null, ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(25, null, poolOwner3222.customer_token, poolOwner3222.full_name, null, null))));
                                                                                    List list6222 = (List) mutableState7.getValue();
                                                                                    ArrayList arrayList2222 = new ArrayList();
                                                                                    while (r2.hasNext()) {
                                                                                    }
                                                                                    List<PoolParticipant> sortedWith222 = CollectionsKt.sortedWith(arrayList2222, new LinkedHashTreeMap.AnonymousClass1(4));
                                                                                    ArrayList arrayList3222 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith222, 10));
                                                                                    while (r2.hasNext()) {
                                                                                    }
                                                                                    createListBuilder222.addAll(Tags.toImmutableList(arrayList3222));
                                                                                    obj = new PoolDetailsViewModel.Loaded(str15, format3, format4, amount2, format5, f3, z6, z11, z17, z12, z13, str7, str17222, Tags.toImmutableList(CollectionsKt__CollectionsJVMKt.build(createListBuilder222)), z9, z16, models, contributionAnimation2, ((Boolean) mutableState12.getValue()).booleanValue(), z8);
                                                                                    z4 = false;
                                                                                    gapComposer6.end(false);
                                                                                }
                                                                            }
                                                                        }
                                                                        z11 = false;
                                                                        if (z5) {
                                                                        }
                                                                        moneyPool = (MoneyPool) mutableState8.getValue();
                                                                        moneyPool.getClass();
                                                                        if (moneyPool.status == PoolState.POOL_STATE_ACTIVE_IN_PROGRESS) {
                                                                        }
                                                                        z12 = false;
                                                                        moneyPool2 = (MoneyPool) mutableState8.getValue();
                                                                        moneyPool2.getClass();
                                                                        if (moneyPool2.status != PoolState.POOL_STATE_MANUAL_CLOSED) {
                                                                        }
                                                                        z13 = true;
                                                                        moneyPool3 = (MoneyPool) mutableState8.getValue();
                                                                        moneyPool3.getClass();
                                                                        if (moneyPool3.status == PoolState.POOL_STATE_CLOSING) {
                                                                        }
                                                                        str7 = format2;
                                                                        String str172222 = !areEqual ? androidStringManager5.get(R.string.pools_closed_sub_text_owner) : androidStringManager5.get(R.string.pools_closed_sub_text_contributor);
                                                                        ListBuilder createListBuilder2222 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                                                                        MoneyPool moneyPool272222 = (MoneyPool) mutableState8.getValue();
                                                                        moneyPool272222.getClass();
                                                                        PoolOwner poolOwner32222 = moneyPool272222.owner;
                                                                        poolOwner32222.getClass();
                                                                        String str182222 = poolOwner32222.customer_token;
                                                                        str182222.getClass();
                                                                        String str192222 = poolOwner32222.full_name;
                                                                        String str202222 = poolOwner32222.profile_photo_url;
                                                                        createListBuilder2222.add(new com.squareup.cash.pools.viewmodels.PoolParticipant(str192222, str182222, str202222 == null ? new Image(str202222, str202222, 4) : null, ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(25, null, poolOwner32222.customer_token, poolOwner32222.full_name, null, null))));
                                                                        List list62222 = (List) mutableState7.getValue();
                                                                        ArrayList arrayList22222 = new ArrayList();
                                                                        while (r2.hasNext()) {
                                                                        }
                                                                        List<PoolParticipant> sortedWith2222 = CollectionsKt.sortedWith(arrayList22222, new LinkedHashTreeMap.AnonymousClass1(4));
                                                                        ArrayList arrayList32222 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith2222, 10));
                                                                        while (r2.hasNext()) {
                                                                        }
                                                                        createListBuilder2222.addAll(Tags.toImmutableList(arrayList32222));
                                                                        obj = new PoolDetailsViewModel.Loaded(str15, format3, format4, amount2, format5, f3, z6, z11, z17, z12, z13, str7, str172222, Tags.toImmutableList(CollectionsKt__CollectionsJVMKt.build(createListBuilder2222)), z9, z16, models, contributionAnimation2, ((Boolean) mutableState12.getValue()).booleanValue(), z8);
                                                                        z4 = false;
                                                                        gapComposer6.end(false);
                                                                    } else {
                                                                        f2 = f;
                                                                    }
                                                                }
                                                            }
                                                            f = f2;
                                                            z10 = false;
                                                            if (z9) {
                                                            }
                                                            changed = gapComposer6.changed(((Boolean) mutableState19.getValue()).booleanValue());
                                                            rememberedValue = gapComposer6.rememberedValue();
                                                            if (changed) {
                                                            }
                                                            money = poolDetailsScreen2.lastBalance;
                                                            if (money != null) {
                                                            }
                                                            mutableState8 = mutableState6;
                                                            contributionAnimation = null;
                                                            gapComposer6.updateRememberedValue(contributionAnimation);
                                                            rememberedValue = contributionAnimation;
                                                            ContributionAnimation contributionAnimation22 = (ContributionAnimation) rememberedValue;
                                                            MoneyPool moneyPool182 = (MoneyPool) mutableState8.getValue();
                                                            moneyPool182.getClass();
                                                            String str152 = moneyPool182.name;
                                                            str152.getClass();
                                                            MoneyPool moneyPool192 = (MoneyPool) mutableState8.getValue();
                                                            moneyPool192.getClass();
                                                            PoolOwner poolOwner22 = moneyPool192.owner;
                                                            poolOwner22.getClass();
                                                            String str162 = poolOwner22.full_name;
                                                            ArrayMap m2 = SVG$Unit$EnumUnboxingLocalUtility.m(1, str162, "name", str162);
                                                            AndroidStringManager androidStringManager52 = androidStringManager;
                                                            Resources resources22 = androidStringManager52.resources;
                                                            resources22.getClass();
                                                            String format32 = new MessageFormat(resources22.getString(R.string.pools_details_subtitle)).format(m2);
                                                            format32.getClass();
                                                            MoneyPool moneyPool202 = (MoneyPool) mutableState8.getValue();
                                                            moneyPool202.getClass();
                                                            Money money62 = moneyPool202.balance;
                                                            money62.getClass();
                                                            String format42 = moneyFormatter.format(money62);
                                                            MoneyPool moneyPool212 = (MoneyPool) mutableState8.getValue();
                                                            moneyPool212.getClass();
                                                            Money money72 = moneyPool212.balance;
                                                            money72.getClass();
                                                            long amount22 = Moneys.amount(money72);
                                                            MoneyPool moneyPool222 = (MoneyPool) mutableState8.getValue();
                                                            moneyPool222.getClass();
                                                            Money money82 = moneyPool222.target;
                                                            money82.getClass();
                                                            String format52 = moneyFormatter.format(money82);
                                                            if (z5) {
                                                            }
                                                            z11 = false;
                                                            if (z5) {
                                                            }
                                                            moneyPool = (MoneyPool) mutableState8.getValue();
                                                            moneyPool.getClass();
                                                            if (moneyPool.status == PoolState.POOL_STATE_ACTIVE_IN_PROGRESS) {
                                                            }
                                                            z12 = false;
                                                            moneyPool2 = (MoneyPool) mutableState8.getValue();
                                                            moneyPool2.getClass();
                                                            if (moneyPool2.status != PoolState.POOL_STATE_MANUAL_CLOSED) {
                                                            }
                                                            z13 = true;
                                                            moneyPool3 = (MoneyPool) mutableState8.getValue();
                                                            moneyPool3.getClass();
                                                            if (moneyPool3.status == PoolState.POOL_STATE_CLOSING) {
                                                            }
                                                            str7 = format2;
                                                            String str1722222 = !areEqual ? androidStringManager52.get(R.string.pools_closed_sub_text_owner) : androidStringManager52.get(R.string.pools_closed_sub_text_contributor);
                                                            ListBuilder createListBuilder22222 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                                                            MoneyPool moneyPool2722222 = (MoneyPool) mutableState8.getValue();
                                                            moneyPool2722222.getClass();
                                                            PoolOwner poolOwner322222 = moneyPool2722222.owner;
                                                            poolOwner322222.getClass();
                                                            String str1822222 = poolOwner322222.customer_token;
                                                            str1822222.getClass();
                                                            String str1922222 = poolOwner322222.full_name;
                                                            String str2022222 = poolOwner322222.profile_photo_url;
                                                            createListBuilder22222.add(new com.squareup.cash.pools.viewmodels.PoolParticipant(str1922222, str1822222, str2022222 == null ? new Image(str2022222, str2022222, 4) : null, ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(25, null, poolOwner322222.customer_token, poolOwner322222.full_name, null, null))));
                                                            List list622222 = (List) mutableState7.getValue();
                                                            ArrayList arrayList222222 = new ArrayList();
                                                            while (r2.hasNext()) {
                                                            }
                                                            List<PoolParticipant> sortedWith22222 = CollectionsKt.sortedWith(arrayList222222, new LinkedHashTreeMap.AnonymousClass1(4));
                                                            ArrayList arrayList322222 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith22222, 10));
                                                            while (r2.hasNext()) {
                                                            }
                                                            createListBuilder22222.addAll(Tags.toImmutableList(arrayList322222));
                                                            obj = new PoolDetailsViewModel.Loaded(str152, format32, format42, amount22, format52, f3, z6, z11, z17, z12, z13, str7, str1722222, Tags.toImmutableList(CollectionsKt__CollectionsJVMKt.build(createListBuilder22222)), z9, z16, models, contributionAnimation22, ((Boolean) mutableState12.getValue()).booleanValue(), z8);
                                                            z4 = false;
                                                            gapComposer6.end(false);
                                                        }
                                                        z9 = true;
                                                        activityEmbeddedViewModel = (ActivityEmbeddedViewModel) obj11;
                                                        list2 = activityEmbeddedViewModel.feedEntries;
                                                        if (list2 instanceof Collection) {
                                                        }
                                                        while (r3.hasNext()) {
                                                        }
                                                        f = f2;
                                                        z10 = false;
                                                        if (z9) {
                                                        }
                                                        changed = gapComposer6.changed(((Boolean) mutableState19.getValue()).booleanValue());
                                                        rememberedValue = gapComposer6.rememberedValue();
                                                        if (changed) {
                                                        }
                                                        money = poolDetailsScreen2.lastBalance;
                                                        if (money != null) {
                                                        }
                                                        mutableState8 = mutableState6;
                                                        contributionAnimation = null;
                                                        gapComposer6.updateRememberedValue(contributionAnimation);
                                                        rememberedValue = contributionAnimation;
                                                        ContributionAnimation contributionAnimation222 = (ContributionAnimation) rememberedValue;
                                                        MoneyPool moneyPool1822 = (MoneyPool) mutableState8.getValue();
                                                        moneyPool1822.getClass();
                                                        String str1522 = moneyPool1822.name;
                                                        str1522.getClass();
                                                        MoneyPool moneyPool1922 = (MoneyPool) mutableState8.getValue();
                                                        moneyPool1922.getClass();
                                                        PoolOwner poolOwner222 = moneyPool1922.owner;
                                                        poolOwner222.getClass();
                                                        String str1622 = poolOwner222.full_name;
                                                        ArrayMap m22 = SVG$Unit$EnumUnboxingLocalUtility.m(1, str1622, "name", str1622);
                                                        AndroidStringManager androidStringManager522 = androidStringManager;
                                                        Resources resources222 = androidStringManager522.resources;
                                                        resources222.getClass();
                                                        String format322 = new MessageFormat(resources222.getString(R.string.pools_details_subtitle)).format(m22);
                                                        format322.getClass();
                                                        MoneyPool moneyPool2022 = (MoneyPool) mutableState8.getValue();
                                                        moneyPool2022.getClass();
                                                        Money money622 = moneyPool2022.balance;
                                                        money622.getClass();
                                                        String format422 = moneyFormatter.format(money622);
                                                        MoneyPool moneyPool2122 = (MoneyPool) mutableState8.getValue();
                                                        moneyPool2122.getClass();
                                                        Money money722 = moneyPool2122.balance;
                                                        money722.getClass();
                                                        long amount222 = Moneys.amount(money722);
                                                        MoneyPool moneyPool2222 = (MoneyPool) mutableState8.getValue();
                                                        moneyPool2222.getClass();
                                                        Money money822 = moneyPool2222.target;
                                                        money822.getClass();
                                                        String format522 = moneyFormatter.format(money822);
                                                        if (z5) {
                                                        }
                                                        z11 = false;
                                                        if (z5) {
                                                        }
                                                        moneyPool = (MoneyPool) mutableState8.getValue();
                                                        moneyPool.getClass();
                                                        if (moneyPool.status == PoolState.POOL_STATE_ACTIVE_IN_PROGRESS) {
                                                        }
                                                        z12 = false;
                                                        moneyPool2 = (MoneyPool) mutableState8.getValue();
                                                        moneyPool2.getClass();
                                                        if (moneyPool2.status != PoolState.POOL_STATE_MANUAL_CLOSED) {
                                                        }
                                                        z13 = true;
                                                        moneyPool3 = (MoneyPool) mutableState8.getValue();
                                                        moneyPool3.getClass();
                                                        if (moneyPool3.status == PoolState.POOL_STATE_CLOSING) {
                                                        }
                                                        str7 = format2;
                                                        String str17222222 = !areEqual ? androidStringManager522.get(R.string.pools_closed_sub_text_owner) : androidStringManager522.get(R.string.pools_closed_sub_text_contributor);
                                                        ListBuilder createListBuilder222222 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                                                        MoneyPool moneyPool27222222 = (MoneyPool) mutableState8.getValue();
                                                        moneyPool27222222.getClass();
                                                        PoolOwner poolOwner3222222 = moneyPool27222222.owner;
                                                        poolOwner3222222.getClass();
                                                        String str18222222 = poolOwner3222222.customer_token;
                                                        str18222222.getClass();
                                                        String str19222222 = poolOwner3222222.full_name;
                                                        String str20222222 = poolOwner3222222.profile_photo_url;
                                                        createListBuilder222222.add(new com.squareup.cash.pools.viewmodels.PoolParticipant(str19222222, str18222222, str20222222 == null ? new Image(str20222222, str20222222, 4) : null, ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(25, null, poolOwner3222222.customer_token, poolOwner3222222.full_name, null, null))));
                                                        List list6222222 = (List) mutableState7.getValue();
                                                        ArrayList arrayList2222222 = new ArrayList();
                                                        while (r2.hasNext()) {
                                                        }
                                                        List<PoolParticipant> sortedWith222222 = CollectionsKt.sortedWith(arrayList2222222, new LinkedHashTreeMap.AnonymousClass1(4));
                                                        ArrayList arrayList3222222 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith222222, 10));
                                                        while (r2.hasNext()) {
                                                        }
                                                        createListBuilder222222.addAll(Tags.toImmutableList(arrayList3222222));
                                                        obj = new PoolDetailsViewModel.Loaded(str1522, format322, format422, amount222, format522, f3, z6, z11, z17, z12, z13, str7, str17222222, Tags.toImmutableList(CollectionsKt__CollectionsJVMKt.build(createListBuilder222222)), z9, z16, models, contributionAnimation222, ((Boolean) mutableState12.getValue()).booleanValue(), z8);
                                                        z4 = false;
                                                        gapComposer6.end(false);
                                                    }
                                                }
                                                z8 = false;
                                                if (!areEqual) {
                                                }
                                                z9 = true;
                                                activityEmbeddedViewModel = (ActivityEmbeddedViewModel) obj11;
                                                list2 = activityEmbeddedViewModel.feedEntries;
                                                if (list2 instanceof Collection) {
                                                }
                                                while (r3.hasNext()) {
                                                }
                                                f = f2;
                                                z10 = false;
                                                if (z9) {
                                                }
                                                changed = gapComposer6.changed(((Boolean) mutableState19.getValue()).booleanValue());
                                                rememberedValue = gapComposer6.rememberedValue();
                                                if (changed) {
                                                }
                                                money = poolDetailsScreen2.lastBalance;
                                                if (money != null) {
                                                }
                                                mutableState8 = mutableState6;
                                                contributionAnimation = null;
                                                gapComposer6.updateRememberedValue(contributionAnimation);
                                                rememberedValue = contributionAnimation;
                                                ContributionAnimation contributionAnimation2222 = (ContributionAnimation) rememberedValue;
                                                MoneyPool moneyPool18222 = (MoneyPool) mutableState8.getValue();
                                                moneyPool18222.getClass();
                                                String str15222 = moneyPool18222.name;
                                                str15222.getClass();
                                                MoneyPool moneyPool19222 = (MoneyPool) mutableState8.getValue();
                                                moneyPool19222.getClass();
                                                PoolOwner poolOwner2222 = moneyPool19222.owner;
                                                poolOwner2222.getClass();
                                                String str16222 = poolOwner2222.full_name;
                                                ArrayMap m222 = SVG$Unit$EnumUnboxingLocalUtility.m(1, str16222, "name", str16222);
                                                AndroidStringManager androidStringManager5222 = androidStringManager;
                                                Resources resources2222 = androidStringManager5222.resources;
                                                resources2222.getClass();
                                                String format3222 = new MessageFormat(resources2222.getString(R.string.pools_details_subtitle)).format(m222);
                                                format3222.getClass();
                                                MoneyPool moneyPool20222 = (MoneyPool) mutableState8.getValue();
                                                moneyPool20222.getClass();
                                                Money money6222 = moneyPool20222.balance;
                                                money6222.getClass();
                                                String format4222 = moneyFormatter.format(money6222);
                                                MoneyPool moneyPool21222 = (MoneyPool) mutableState8.getValue();
                                                moneyPool21222.getClass();
                                                Money money7222 = moneyPool21222.balance;
                                                money7222.getClass();
                                                long amount2222 = Moneys.amount(money7222);
                                                MoneyPool moneyPool22222 = (MoneyPool) mutableState8.getValue();
                                                moneyPool22222.getClass();
                                                Money money8222 = moneyPool22222.target;
                                                money8222.getClass();
                                                String format5222 = moneyFormatter.format(money8222);
                                                if (z5) {
                                                }
                                                z11 = false;
                                                if (z5) {
                                                }
                                                moneyPool = (MoneyPool) mutableState8.getValue();
                                                moneyPool.getClass();
                                                if (moneyPool.status == PoolState.POOL_STATE_ACTIVE_IN_PROGRESS) {
                                                }
                                                z12 = false;
                                                moneyPool2 = (MoneyPool) mutableState8.getValue();
                                                moneyPool2.getClass();
                                                if (moneyPool2.status != PoolState.POOL_STATE_MANUAL_CLOSED) {
                                                }
                                                z13 = true;
                                                moneyPool3 = (MoneyPool) mutableState8.getValue();
                                                moneyPool3.getClass();
                                                if (moneyPool3.status == PoolState.POOL_STATE_CLOSING) {
                                                }
                                                str7 = format2;
                                                String str172222222 = !areEqual ? androidStringManager5222.get(R.string.pools_closed_sub_text_owner) : androidStringManager5222.get(R.string.pools_closed_sub_text_contributor);
                                                ListBuilder createListBuilder2222222 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                                                MoneyPool moneyPool272222222 = (MoneyPool) mutableState8.getValue();
                                                moneyPool272222222.getClass();
                                                PoolOwner poolOwner32222222 = moneyPool272222222.owner;
                                                poolOwner32222222.getClass();
                                                String str182222222 = poolOwner32222222.customer_token;
                                                str182222222.getClass();
                                                String str192222222 = poolOwner32222222.full_name;
                                                String str202222222 = poolOwner32222222.profile_photo_url;
                                                createListBuilder2222222.add(new com.squareup.cash.pools.viewmodels.PoolParticipant(str192222222, str182222222, str202222222 == null ? new Image(str202222222, str202222222, 4) : null, ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(25, null, poolOwner32222222.customer_token, poolOwner32222222.full_name, null, null))));
                                                List list62222222 = (List) mutableState7.getValue();
                                                ArrayList arrayList22222222 = new ArrayList();
                                                while (r2.hasNext()) {
                                                }
                                                List<PoolParticipant> sortedWith2222222 = CollectionsKt.sortedWith(arrayList22222222, new LinkedHashTreeMap.AnonymousClass1(4));
                                                ArrayList arrayList32222222 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith2222222, 10));
                                                while (r2.hasNext()) {
                                                }
                                                createListBuilder2222222.addAll(Tags.toImmutableList(arrayList32222222));
                                                obj = new PoolDetailsViewModel.Loaded(str15222, format3222, format4222, amount2222, format5222, f3, z6, z11, z17, z12, z13, str7, str172222222, Tags.toImmutableList(CollectionsKt__CollectionsJVMKt.build(createListBuilder2222222)), z9, z16, models, contributionAnimation2222, ((Boolean) mutableState12.getValue()).booleanValue(), z8);
                                                z4 = false;
                                                gapComposer6.end(false);
                                            }
                                        }
                                        z6 = false;
                                        MoneyPool moneyPool112 = (MoneyPool) mutableState6.getValue();
                                        moneyPool112.getClass();
                                        if (moneyPool112.goal_state == PoolGoalState.POOL_GOAL_STATE_TARGET_MET) {
                                        }
                                        if (z7) {
                                            MoneyPool moneyPool122 = (MoneyPool) mutableState6.getValue();
                                            moneyPool122.getClass();
                                            Long l22 = moneyPool122.goal_reached_at;
                                            if (l22 == null) {
                                            }
                                            millis = androidClock.millis();
                                            Duration.Companion companion2 = Duration.Companion;
                                            if (longValue > millis - Duration.m4167getInWholeMillisecondsimpl(DurationKt.toDuration(30, DurationUnit.DAYS))) {
                                            }
                                        }
                                        z8 = false;
                                        if (!areEqual) {
                                        }
                                        z9 = true;
                                        activityEmbeddedViewModel = (ActivityEmbeddedViewModel) obj11;
                                        list2 = activityEmbeddedViewModel.feedEntries;
                                        if (list2 instanceof Collection) {
                                        }
                                        while (r3.hasNext()) {
                                        }
                                        f = f2;
                                        z10 = false;
                                        if (z9) {
                                        }
                                        changed = gapComposer6.changed(((Boolean) mutableState19.getValue()).booleanValue());
                                        rememberedValue = gapComposer6.rememberedValue();
                                        if (changed) {
                                        }
                                        money = poolDetailsScreen2.lastBalance;
                                        if (money != null) {
                                        }
                                        mutableState8 = mutableState6;
                                        contributionAnimation = null;
                                        gapComposer6.updateRememberedValue(contributionAnimation);
                                        rememberedValue = contributionAnimation;
                                        ContributionAnimation contributionAnimation22222 = (ContributionAnimation) rememberedValue;
                                        MoneyPool moneyPool182222 = (MoneyPool) mutableState8.getValue();
                                        moneyPool182222.getClass();
                                        String str152222 = moneyPool182222.name;
                                        str152222.getClass();
                                        MoneyPool moneyPool192222 = (MoneyPool) mutableState8.getValue();
                                        moneyPool192222.getClass();
                                        PoolOwner poolOwner22222 = moneyPool192222.owner;
                                        poolOwner22222.getClass();
                                        String str162222 = poolOwner22222.full_name;
                                        ArrayMap m2222 = SVG$Unit$EnumUnboxingLocalUtility.m(1, str162222, "name", str162222);
                                        AndroidStringManager androidStringManager52222 = androidStringManager;
                                        Resources resources22222 = androidStringManager52222.resources;
                                        resources22222.getClass();
                                        String format32222 = new MessageFormat(resources22222.getString(R.string.pools_details_subtitle)).format(m2222);
                                        format32222.getClass();
                                        MoneyPool moneyPool202222 = (MoneyPool) mutableState8.getValue();
                                        moneyPool202222.getClass();
                                        Money money62222 = moneyPool202222.balance;
                                        money62222.getClass();
                                        String format42222 = moneyFormatter.format(money62222);
                                        MoneyPool moneyPool212222 = (MoneyPool) mutableState8.getValue();
                                        moneyPool212222.getClass();
                                        Money money72222 = moneyPool212222.balance;
                                        money72222.getClass();
                                        long amount22222 = Moneys.amount(money72222);
                                        MoneyPool moneyPool222222 = (MoneyPool) mutableState8.getValue();
                                        moneyPool222222.getClass();
                                        Money money82222 = moneyPool222222.target;
                                        money82222.getClass();
                                        String format52222 = moneyFormatter.format(money82222);
                                        if (z5) {
                                        }
                                        z11 = false;
                                        if (z5) {
                                        }
                                        moneyPool = (MoneyPool) mutableState8.getValue();
                                        moneyPool.getClass();
                                        if (moneyPool.status == PoolState.POOL_STATE_ACTIVE_IN_PROGRESS) {
                                        }
                                        z12 = false;
                                        moneyPool2 = (MoneyPool) mutableState8.getValue();
                                        moneyPool2.getClass();
                                        if (moneyPool2.status != PoolState.POOL_STATE_MANUAL_CLOSED) {
                                        }
                                        z13 = true;
                                        moneyPool3 = (MoneyPool) mutableState8.getValue();
                                        moneyPool3.getClass();
                                        if (moneyPool3.status == PoolState.POOL_STATE_CLOSING) {
                                        }
                                        str7 = format2;
                                        String str1722222222 = !areEqual ? androidStringManager52222.get(R.string.pools_closed_sub_text_owner) : androidStringManager52222.get(R.string.pools_closed_sub_text_contributor);
                                        ListBuilder createListBuilder22222222 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                                        MoneyPool moneyPool2722222222 = (MoneyPool) mutableState8.getValue();
                                        moneyPool2722222222.getClass();
                                        PoolOwner poolOwner322222222 = moneyPool2722222222.owner;
                                        poolOwner322222222.getClass();
                                        String str1822222222 = poolOwner322222222.customer_token;
                                        str1822222222.getClass();
                                        String str1922222222 = poolOwner322222222.full_name;
                                        String str2022222222 = poolOwner322222222.profile_photo_url;
                                        createListBuilder22222222.add(new com.squareup.cash.pools.viewmodels.PoolParticipant(str1922222222, str1822222222, str2022222222 == null ? new Image(str2022222222, str2022222222, 4) : null, ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(25, null, poolOwner322222222.customer_token, poolOwner322222222.full_name, null, null))));
                                        List list622222222 = (List) mutableState7.getValue();
                                        ArrayList arrayList222222222 = new ArrayList();
                                        while (r2.hasNext()) {
                                        }
                                        List<PoolParticipant> sortedWith22222222 = CollectionsKt.sortedWith(arrayList222222222, new LinkedHashTreeMap.AnonymousClass1(4));
                                        ArrayList arrayList322222222 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith22222222, 10));
                                        while (r2.hasNext()) {
                                        }
                                        createListBuilder22222222.addAll(Tags.toImmutableList(arrayList322222222));
                                        obj = new PoolDetailsViewModel.Loaded(str152222, format32222, format42222, amount22222, format52222, f3, z6, z11, z17, z12, z13, str7, str1722222222, Tags.toImmutableList(CollectionsKt__CollectionsJVMKt.build(createListBuilder22222222)), z9, z16, models, contributionAnimation22222, ((Boolean) mutableState12.getValue()).booleanValue(), z8);
                                        z4 = false;
                                        gapComposer6.end(false);
                                    }
                                }
                            }
                            z5 = false;
                            if (areEqual) {
                            }
                            z6 = false;
                            MoneyPool moneyPool1122 = (MoneyPool) mutableState6.getValue();
                            moneyPool1122.getClass();
                            if (moneyPool1122.goal_state == PoolGoalState.POOL_GOAL_STATE_TARGET_MET) {
                            }
                            if (z7) {
                            }
                            z8 = false;
                            if (!areEqual) {
                            }
                            z9 = true;
                            activityEmbeddedViewModel = (ActivityEmbeddedViewModel) obj11;
                            list2 = activityEmbeddedViewModel.feedEntries;
                            if (list2 instanceof Collection) {
                            }
                            while (r3.hasNext()) {
                            }
                            f = f2;
                            z10 = false;
                            if (z9) {
                            }
                            changed = gapComposer6.changed(((Boolean) mutableState19.getValue()).booleanValue());
                            rememberedValue = gapComposer6.rememberedValue();
                            if (changed) {
                            }
                            money = poolDetailsScreen2.lastBalance;
                            if (money != null) {
                            }
                            mutableState8 = mutableState6;
                            contributionAnimation = null;
                            gapComposer6.updateRememberedValue(contributionAnimation);
                            rememberedValue = contributionAnimation;
                            ContributionAnimation contributionAnimation222222 = (ContributionAnimation) rememberedValue;
                            MoneyPool moneyPool1822222 = (MoneyPool) mutableState8.getValue();
                            moneyPool1822222.getClass();
                            String str1522222 = moneyPool1822222.name;
                            str1522222.getClass();
                            MoneyPool moneyPool1922222 = (MoneyPool) mutableState8.getValue();
                            moneyPool1922222.getClass();
                            PoolOwner poolOwner222222 = moneyPool1922222.owner;
                            poolOwner222222.getClass();
                            String str1622222 = poolOwner222222.full_name;
                            ArrayMap m22222 = SVG$Unit$EnumUnboxingLocalUtility.m(1, str1622222, "name", str1622222);
                            AndroidStringManager androidStringManager522222 = androidStringManager;
                            Resources resources222222 = androidStringManager522222.resources;
                            resources222222.getClass();
                            String format322222 = new MessageFormat(resources222222.getString(R.string.pools_details_subtitle)).format(m22222);
                            format322222.getClass();
                            MoneyPool moneyPool2022222 = (MoneyPool) mutableState8.getValue();
                            moneyPool2022222.getClass();
                            Money money622222 = moneyPool2022222.balance;
                            money622222.getClass();
                            String format422222 = moneyFormatter.format(money622222);
                            MoneyPool moneyPool2122222 = (MoneyPool) mutableState8.getValue();
                            moneyPool2122222.getClass();
                            Money money722222 = moneyPool2122222.balance;
                            money722222.getClass();
                            long amount222222 = Moneys.amount(money722222);
                            MoneyPool moneyPool2222222 = (MoneyPool) mutableState8.getValue();
                            moneyPool2222222.getClass();
                            Money money822222 = moneyPool2222222.target;
                            money822222.getClass();
                            String format522222 = moneyFormatter.format(money822222);
                            if (z5) {
                            }
                            z11 = false;
                            if (z5) {
                            }
                            moneyPool = (MoneyPool) mutableState8.getValue();
                            moneyPool.getClass();
                            if (moneyPool.status == PoolState.POOL_STATE_ACTIVE_IN_PROGRESS) {
                            }
                            z12 = false;
                            moneyPool2 = (MoneyPool) mutableState8.getValue();
                            moneyPool2.getClass();
                            if (moneyPool2.status != PoolState.POOL_STATE_MANUAL_CLOSED) {
                            }
                            z13 = true;
                            moneyPool3 = (MoneyPool) mutableState8.getValue();
                            moneyPool3.getClass();
                            if (moneyPool3.status == PoolState.POOL_STATE_CLOSING) {
                            }
                            str7 = format2;
                            String str17222222222 = !areEqual ? androidStringManager522222.get(R.string.pools_closed_sub_text_owner) : androidStringManager522222.get(R.string.pools_closed_sub_text_contributor);
                            ListBuilder createListBuilder222222222 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                            MoneyPool moneyPool27222222222 = (MoneyPool) mutableState8.getValue();
                            moneyPool27222222222.getClass();
                            PoolOwner poolOwner3222222222 = moneyPool27222222222.owner;
                            poolOwner3222222222.getClass();
                            String str18222222222 = poolOwner3222222222.customer_token;
                            str18222222222.getClass();
                            String str19222222222 = poolOwner3222222222.full_name;
                            String str20222222222 = poolOwner3222222222.profile_photo_url;
                            createListBuilder222222222.add(new com.squareup.cash.pools.viewmodels.PoolParticipant(str19222222222, str18222222222, str20222222222 == null ? new Image(str20222222222, str20222222222, 4) : null, ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(25, null, poolOwner3222222222.customer_token, poolOwner3222222222.full_name, null, null))));
                            List list6222222222 = (List) mutableState7.getValue();
                            ArrayList arrayList2222222222 = new ArrayList();
                            while (r2.hasNext()) {
                            }
                            List<PoolParticipant> sortedWith222222222 = CollectionsKt.sortedWith(arrayList2222222222, new LinkedHashTreeMap.AnonymousClass1(4));
                            ArrayList arrayList3222222222 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith222222222, 10));
                            while (r2.hasNext()) {
                            }
                            createListBuilder222222222.addAll(Tags.toImmutableList(arrayList3222222222));
                            obj = new PoolDetailsViewModel.Loaded(str1522222, format322222, format422222, amount222222, format522222, f3, z6, z11, z17, z12, z13, str7, str17222222222, Tags.toImmutableList(CollectionsKt__CollectionsJVMKt.build(createListBuilder222222222)), z9, z16, models, contributionAnimation222222, ((Boolean) mutableState12.getValue()).booleanValue(), z8);
                            z4 = false;
                            gapComposer6.end(false);
                        } else {
                            z4 = false;
                            gapComposer6.startReplaceGroup(305002664);
                            gapComposer6.end(false);
                            obj = PoolDetailsViewModel.Loading.INSTANCE;
                        }
                        gapComposer6.end(z4);
                        return obj;
                    }
                    gapComposer6.startReplaceGroup(304842794);
                    gapComposer6.end(false);
                    loadingError = new PoolDetailsViewModel.LoadingError(PoolDetailsViewModel.LoadingErrorType.GenericLoadingError.INSTANCE);
                }
                obj = loadingError;
                z4 = false;
                gapComposer6.end(z4);
                return obj;
        }
    }

    public ProfilePresenter(AndroidStringManager androidStringManager, RealCryptoInvoiceParser realCryptoInvoiceParser, RealCryptoInvoiceParser realCryptoInvoiceParser2, FeatureFlagManager featureFlagManager, Analytics analytics, AndroidPermissionManager androidPermissionManager, CryptoFlowStarter cryptoFlowStarter, RealClipboardObserver realClipboardObserver, Flow flow, RealCryptoBalanceRepo realCryptoBalanceRepo, BetterNavigator.ScreenNavigator screenNavigator, BitcoinQrCodeScannerScreen bitcoinQrCodeScannerScreen) {
        bitcoinQrCodeScannerScreen.getClass();
        this.stringManager = androidStringManager;
        this.profileRepo = realCryptoInvoiceParser;
        this.jurisdictionConfigManager = realCryptoInvoiceParser2;
        this.featureFlagManager = featureFlagManager;
        this.analytics = analytics;
        this.favoritesManager = cryptoFlowStarter;
        this.principalAccountToken = realClipboardObserver;
        this.navigator = screenNavigator;
        this.allowlistRepository = bitcoinQrCodeScannerScreen;
        AndroidPermissionManager$create$1 create = androidPermissionManager.create("android.permission.CAMERA");
        this.screen = create;
        this.paymentsInboundNavigator = realCryptoBalanceRepo.getBitcoinBalance();
        ReadOnlyPermissions readOnlyPermissions = create.$readonly;
        int i = 16;
        this.externalPaymentId = new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(new BitcoinDepositsPresenter$special$$inlined$filter$1(readOnlyPermissions.granted(), i), i);
        this.profileDetailsProvider = readOnlyPermissions.denied();
        this.genericProfileElementsPresenter = new BitcoinDepositsPresenter$special$$inlined$filter$1(flow, 17);
    }

    public ProfilePresenter(InvestingDiscoveryPresenter$Factory$Impl investingDiscoveryPresenter$Factory$Impl, InvestingPortfolioPresenter$Factory$Impl investingPortfolioPresenter$Factory$Impl, RealInvestingSyncer realInvestingSyncer, IntentLauncher intentLauncher, FeatureFlagManager featureFlagManager, Flow flow, Analytics analytics, RealInvestingAnalytics realInvestingAnalytics, RealInvestingStateManager realInvestingStateManager, Cache cache, Flow flow2, ScrollPerformanceAnalyzer$Factory$Impl scrollPerformanceAnalyzer$Factory$Impl, BetterNavigator.ScreenNavigator screenNavigator, InvestingScreens.InvestingHome investingHome) {
        investingHome.getClass();
        this.stringManager = investingDiscoveryPresenter$Factory$Impl;
        this.profileRepo = investingPortfolioPresenter$Factory$Impl;
        this.jurisdictionConfigManager = realInvestingSyncer;
        this.favoritesManager = intentLauncher;
        this.featureFlagManager = featureFlagManager;
        this.principalAccountToken = flow;
        this.analytics = analytics;
        this.allowlistRepository = realInvestingAnalytics;
        this.screen = realInvestingStateManager;
        this.paymentsInboundNavigator = cache;
        this.externalPaymentId = flow2;
        this.navigator = screenNavigator;
        this.profileDetailsProvider = investingHome;
        this.genericProfileElementsPresenter = scrollPerformanceAnalyzer$Factory$Impl.create(PerformanceMeasureScrollPerformance.Element.INVESTING_EQUITY_MAIN);
        if (investingHome.resetScreen) {
            cache.cache = null;
        }
    }

    public ProfilePresenter(RealCustomerStore realCustomerStore, AndroidStringManager androidStringManager, RealRouter$Factory$Impl realRouter$Factory$Impl, Analytics analytics, SessionManager sessionManager, RealDependentAllowanceManager realDependentAllowanceManager, FlowStarter flowStarter, ErrorReporter errorReporter, SampleStrategy sampleStrategy, BetterNavigator.ScreenNavigator screenNavigator, SponsorDetailScreen sponsorDetailScreen, LocalizedMoneyFormatter.Factory factory, CoroutineContext coroutineContext) {
        sponsorDetailScreen.getClass();
        this.profileRepo = realCustomerStore;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.jurisdictionConfigManager = sessionManager;
        this.favoritesManager = realDependentAllowanceManager;
        this.featureFlagManager = flowStarter;
        this.principalAccountToken = errorReporter;
        this.allowlistRepository = sampleStrategy;
        this.navigator = screenNavigator;
        this.screen = sponsorDetailScreen;
        this.paymentsInboundNavigator = coroutineContext;
        this.externalPaymentId = realRouter$Factory$Impl.create$1(screenNavigator);
        this.profileDetailsProvider = factory.create(MoneyFormatterConfig.COMPACT);
        String str = sponsorDetailScreen.sponsor.customer_token;
        if (str != null) {
            this.genericProfileElementsPresenter = str;
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            throw null;
        }
    }

    public ProfilePresenter(AndroidStringManager androidStringManager, RealProfileRepo realProfileRepo, RealJurisdictionConfigManager realJurisdictionConfigManager, RealFavoritesManager realFavoritesManager, RealGenericProfileElementsPresenter$Factory$Impl realGenericProfileElementsPresenter$Factory$Impl, Analytics analytics, RealBitcoinCapabilityProvider realBitcoinCapabilityProvider, RealPaymentsInboundNavigator$Factory$Impl realPaymentsInboundNavigator$Factory$Impl, FeatureFlagManager featureFlagManager, KeyValue keyValue, RealAllowlistRepository realAllowlistRepository, ProfileScreens.ProfileScreen profileScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        profileScreen.getClass();
        this.stringManager = androidStringManager;
        this.profileRepo = realProfileRepo;
        this.jurisdictionConfigManager = realJurisdictionConfigManager;
        this.favoritesManager = realFavoritesManager;
        this.analytics = analytics;
        this.featureFlagManager = featureFlagManager;
        this.principalAccountToken = keyValue;
        this.allowlistRepository = realAllowlistRepository;
        this.screen = profileScreen;
        this.navigator = screenNavigator;
        this.paymentsInboundNavigator = new WorkCookieJar(screenNavigator);
        this.externalPaymentId = profileScreen.externalPaymentId;
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(null);
        this.profileDetailsProvider = MutableStateFlow;
        int i = 8;
        this.genericProfileElementsPresenter = realGenericProfileElementsPresenter$Factory$Impl.create$1(profileScreen, new ProfileScreens.GenericProfileElementsSection(profileScreen.customer, new ProfileScreens.GenericProfileElementsSection.ExtraPaymentInfo(profileScreen.externalPaymentId, profileScreen.originContext, profileScreen.entryPoint, profileScreen.exitScreen, profileScreen.confirmRecipient, profileScreen.analytics), profileScreen.loadInitialDetailsFromCache, i), new NullStateSwipeConfigProvider(MutableStateFlow, i), screenNavigator);
    }
}
