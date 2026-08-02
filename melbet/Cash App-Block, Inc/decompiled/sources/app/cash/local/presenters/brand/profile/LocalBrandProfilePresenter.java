package app.cash.local.presenters.brand.profile;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda5;
import androidx.compose.material3.SliderState$drag$2;
import androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.navigation.compose.NavHostKt$NavHost$33$1;
import androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda1;
import app.cash.arcade.viewmodels.AvatarViewModel$$ExternalSyntheticLambda0;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.backend.BuyerIntentManager;
import app.cash.local.backend.BuyerIntentState;
import app.cash.local.backend.CartBuilder;
import app.cash.local.backend.CartBuilderManager;
import app.cash.local.backend.real.RealCartBuilder;
import app.cash.local.backend.real.RealLocalBrandProfileBannerDismissalTracker;
import app.cash.local.backend.real.RealLocalBrandProfileCheckedInSheetTracker;
import app.cash.local.backend.real.RealLocalBrandRepository;
import app.cash.local.backend.real.RealLocalBrandSyncer;
import app.cash.local.backend.real.RealMarketingMessageRepository;
import app.cash.local.navigation.LocalInstalledStore;
import app.cash.local.navigation.LocalInstalledStoreKt;
import app.cash.local.navigation.launcher.RealLocalLauncher;
import app.cash.local.presenters.BrandFollowPresenter;
import app.cash.local.presenters.BuyerIntentCartScopesKt;
import app.cash.local.presenters.RealBrandFollowPresenter;
import app.cash.local.presenters.RealBrandFollowPresenter$Factory$Impl;
import app.cash.local.presenters.brand.LocalOpenTabFooterModelFactoryKt;
import app.cash.local.presenters.brand.profile.LocalBrandProfileContentFactory;
import app.cash.local.presenters.brand.profile.ProfileBottomModalAction;
import app.cash.local.presenters.internal.DateTimesKt;
import app.cash.local.presenters.internal.FulfillmentTimeUtils;
import app.cash.local.presenters.internal.LocalMenuItemsKt;
import app.cash.local.presenters.internal.LocalsKt;
import app.cash.local.presenters.internal.LocationsKt;
import app.cash.local.presenters.internal.LoyaltyKt;
import app.cash.local.presenters.internal.OpenTabStateKt;
import app.cash.local.primitives.Actions;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.Brand;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.BrandToken;
import app.cash.local.primitives.CartEntryWithQuantity;
import app.cash.local.primitives.Category;
import app.cash.local.primitives.DiscountCodeKt;
import app.cash.local.primitives.Fulfillment;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.FulfillmentConfigurationKt;
import app.cash.local.primitives.FulfillmentKt;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.LocalMoneyKt;
import app.cash.local.primitives.Location;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.LocationMenu$$ExternalSyntheticLambda3;
import app.cash.local.primitives.LocationToken;
import app.cash.local.primitives.MarketingMessageData;
import app.cash.local.primitives.MarketingMessageOfferDetails;
import app.cash.local.primitives.MenuCategoryToken;
import app.cash.local.primitives.MenuHours;
import app.cash.local.primitives.MenuHoursKt;
import app.cash.local.primitives.MenuItem;
import app.cash.local.primitives.MenuItemVariation;
import app.cash.local.primitives.MessageToken;
import app.cash.local.primitives.OfferToken;
import app.cash.local.primitives.OrderStatus;
import app.cash.local.primitives.OrderStatusKt;
import app.cash.local.primitives.Selection;
import app.cash.local.primitives.SelectionKt;
import app.cash.local.screens.app.LocalBrandLocationMenuScreen;
import app.cash.local.screens.app.LocalBrandProfileScreen;
import app.cash.local.screens.app.LocalFulfillmentPickerScreen;
import app.cash.local.service.LocalService;
import app.cash.local.store.real.RealLocalInstalledStore;
import app.cash.local.store.real.RealLocalInstalledStore$hideBrands$$inlined$map$1;
import app.cash.local.viewmodels.BrandFollowViewModel;
import app.cash.local.viewmodels.LocalBottomModalViewModel;
import app.cash.local.viewmodels.LocalBrandBannerModel;
import app.cash.local.viewmodels.LocalBrandDescriptionViewModel;
import app.cash.local.viewmodels.LocalBrandLocationAddressContentModel;
import app.cash.local.viewmodels.LocalBrandLocationFooterContentModel;
import app.cash.local.viewmodels.LocalBrandLocationHoursContentModel;
import app.cash.local.viewmodels.LocalBrandLocationMarketingMessagesContentModel;
import app.cash.local.viewmodels.LocalBrandLocationMenuCarouselContentModel;
import app.cash.local.viewmodels.LocalBrandLocationMenuContentModel;
import app.cash.local.viewmodels.LocalBrandLocationPhoneContentModel;
import app.cash.local.viewmodels.LocalBrandProfileSectionViewModel;
import app.cash.local.viewmodels.LocalBrandProfileViewModel;
import app.cash.local.viewmodels.LocationStatus;
import app.cash.local.viewmodels.MenuItemAvailability;
import app.cash.local.viewmodels.marketingmessages.MarketingMessageBadge;
import app.cash.local.viewmodels.sheet.MapDecisionSheetModel;
import app.cash.local.viewmodels.toasts.ToastData;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda3;
import app.cash.molecule.MoleculeKt$immediateClockFlow$1$1$1;
import app.cash.paraphrase.FormattedResource;
import app.cash.zipline.loader.ZiplineLoader$ModuleJob$run$3;
import app.cash.zipline.loader.ZiplineLoader$load$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.n$$ExternalSyntheticLambda1;
import coil3.RealImageLoader$execute$2;
import coil3.gif.AnimatedImageDecoder$wrapDrawable$2;
import coil3.network.NetworkFetcher$doFetch$fetchResult$1;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmh;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmo;
import com.squareup.cash.R;
import com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.offers.presenters.OffersHomePresenter$models$8$1;
import com.squareup.cash.permissions.AndroidPermissionChecker$create$1$denied$$inlined$filter$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.work.views.menu.ExpandableContentKt;
import com.squareup.protos.cash.local.client.app.v1.card.LocalCard;
import com.squareup.protos.cash.local.client.v1.GetBuyerInfoResponse;
import com.squareup.protos.cash.local.client.v1.LocalAddress;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalLocationSummary;
import com.squareup.protos.cash.local.client.v1.LocalLoyaltyAccount;
import com.squareup.protos.cash.local.client.v1.LocalLoyaltyProgram;
import com.squareup.protos.cash.local.client.v1.LocalLoyaltyReward;
import com.squareup.protos.cash.local.client.v1.LocalMenuAvailability;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemDeal;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemDeal$Deal$AdjustedPrice;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemDealAdjustedPrice;
import com.squareup.protos.cash.local.client.v1.LocalOpenHours;
import com.squareup.protos.cash.local.client.v1.LocalOrder;
import com.squareup.protos.cash.local.client.v1.LocalPhone;
import com.squareup.protos.cash.local.client.v1.LocalText;
import com.squareup.protos.cash.local.client.v1.Offer;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.compose.SharedViewEventsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StartedLazily$command$$inlined$unsafeFlow$1;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public final class LocalBrandProfilePresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final RealLocalBrandProfileBannerDismissalTracker bannerDismissalTracker;
    public final RealBrandFollowPresenter$Factory$Impl brandFollowPresenterFactory;
    public final String brandIdentifier;
    public final BuyerIntentManager buyerIntentManager;
    public final CartBuilderManager cartManager;
    public final RealLocalBrandProfileCheckedInSheetTracker checkedInSheetTracker;
    public final RealClipboardManager clipboardManager;
    public final LocalBrandProfileContentFactory contentFactory;
    public final String initialSelectedLocationToken;
    public final RealLocalLauncher launcher;
    public final RealMarketingMessageRepository marketingMessageRepository;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealProfileManager profileManager;
    public final RealLocalBrandRepository repository;
    public final RealRouter$Factory$Impl routerFactory;
    public final LocalBrandProfileScreen screen;
    public final LocalService service;
    public final SessionManager sessionManager;
    public final LocalInstalledStore store;
    public final AndroidStringManager stringManager;
    public final RealLocalBrandSyncer syncer;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LocalFulfillmentType.values().length];
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_PICKUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_IN_STORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DINE_IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_SHIPPING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DELIVERY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LocalBrandProfilePresenter(AndroidStringManager androidStringManager, RealLocalBrandSyncer realLocalBrandSyncer, RealLocalBrandRepository realLocalBrandRepository, RealMarketingMessageRepository realMarketingMessageRepository, RealClipboardManager realClipboardManager, RealLocalLauncher realLocalLauncher, RealRouter$Factory$Impl realRouter$Factory$Impl, CartBuilderManager cartBuilderManager, BuyerIntentManager buyerIntentManager, LocalService localService, RealProfileManager realProfileManager, SessionManager sessionManager, Analytics analytics, LocalInstalledStore localInstalledStore, LocalBrandProfileContentFactory localBrandProfileContentFactory, RealBrandFollowPresenter$Factory$Impl realBrandFollowPresenter$Factory$Impl, RealLocalBrandProfileBannerDismissalTracker realLocalBrandProfileBannerDismissalTracker, RealLocalBrandProfileCheckedInSheetTracker realLocalBrandProfileCheckedInSheetTracker, LocalBrandProfileScreen localBrandProfileScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        localBrandProfileScreen.getClass();
        this.stringManager = androidStringManager;
        this.syncer = realLocalBrandSyncer;
        this.repository = realLocalBrandRepository;
        this.marketingMessageRepository = realMarketingMessageRepository;
        this.clipboardManager = realClipboardManager;
        this.launcher = realLocalLauncher;
        this.routerFactory = realRouter$Factory$Impl;
        this.cartManager = cartBuilderManager;
        this.buyerIntentManager = buyerIntentManager;
        this.service = localService;
        this.profileManager = realProfileManager;
        this.sessionManager = sessionManager;
        this.analytics = analytics;
        this.store = localInstalledStore;
        this.contentFactory = localBrandProfileContentFactory;
        this.brandFollowPresenterFactory = realBrandFollowPresenter$Factory$Impl;
        this.bannerDismissalTracker = realLocalBrandProfileBannerDismissalTracker;
        this.checkedInSheetTracker = realLocalBrandProfileCheckedInSheetTracker;
        this.screen = localBrandProfileScreen;
        this.navigator = screenNavigator;
        BrandSpot brandSpot = localBrandProfileScreen.brandSpot;
        this.initialSelectedLocationToken = brandSpot.locationToken;
        this.brandIdentifier = brandSpot.brandToken;
    }

    /* renamed from: access$navigateToMenu-WEME8JM, reason: not valid java name */
    public static final void m1216access$navigateToMenuWEME8JM(LocalBrandProfilePresenter localBrandProfilePresenter, BrandSpot brandSpot, String str, String str2, BrandSpotSyncTokens brandSpotSyncTokens, boolean z, String str3, FulfillmentConfiguration fulfillmentConfiguration) {
        LocalBrandProfileScreen localBrandProfileScreen = localBrandProfilePresenter.screen;
        AttributionKey attributionKey = localBrandProfileScreen.attributionKey;
        boolean z2 = localBrandProfileScreen.isEmbeddedInSheet;
        LocalBrandLocationMenuScreen localBrandLocationMenuScreen = new LocalBrandLocationMenuScreen(brandSpot, str, str2, z2, attributionKey, !z2, brandSpotSyncTokens);
        BetterNavigator.ScreenNavigator screenNavigator = localBrandProfilePresenter.navigator;
        if (!z) {
            screenNavigator.goTo(localBrandLocationMenuScreen);
            return;
        }
        BrandToken brandToken = str3 != null ? new BrandToken(str3) : null;
        if (brandToken != null) {
            screenNavigator.goTo(new LocalFulfillmentPickerScreen(brandToken.value, FulfillmentConfigurationKt.getType(fulfillmentConfiguration), fulfillmentConfiguration, localBrandLocationMenuScreen));
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
        }
    }

    public static final String models$lambda$100(MutableState mutableState) {
        return (String) mutableState.getValue();
    }

    public static final LocalFulfillmentType models$lambda$107(MutableState mutableState) {
        return (LocalFulfillmentType) mutableState.getValue();
    }

    public static final BrandSpot models$lambda$12(State state) {
        return (BrandSpot) state.getValue();
    }

    public static final List models$lambda$16(MutableState mutableState) {
        return (List) mutableState.getValue();
    }

    public static final FulfillmentConfiguration models$lambda$28(MutableState mutableState) {
        return (FulfillmentConfiguration) mutableState.getValue();
    }

    public static final BrandSpotSyncTokens models$lambda$34(State state) {
        return (BrandSpotSyncTokens) state.getValue();
    }

    public static final String models$lambda$4(MutableState mutableState) {
        LocationToken locationToken = (LocationToken) mutableState.getValue();
        if (locationToken != null) {
            return locationToken.value;
        }
        return null;
    }

    public static final BrandSpot models$lambda$7(State state) {
        return (BrandSpot) state.getValue();
    }

    public static final Location.LocationDetail models$lambda$70(State state) {
        return (Location.LocationDetail) state.getValue();
    }

    public static final String models$lambda$9(MutableState mutableState) {
        BrandToken brandToken = (BrandToken) mutableState.getValue();
        if (brandToken != null) {
            return brandToken.value;
        }
        return null;
    }

    public final void HandleCouponCode(final CartBuilder cartBuilder, final Location.LocationDetail locationDetail, final BrandSpot brandSpot, final Function0 function0, final Function1 function1, Composer composer, final int i) {
        int i2;
        final Function0 function02;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        String str;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1801166204);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(cartBuilder) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(locationDetail) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(brandSpot) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function02 = function0;
            i2 |= gapComposer.changedInstance(function02) ? 2048 : 1024;
        } else {
            function02 = function0;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changedInstance(this) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            String str2 = this.screen.couponCode;
            if (str2 == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                final int i3 = 0;
                function2 = new Function2(this) { // from class: app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter$$ExternalSyntheticLambda30
                    public final /* synthetic */ LocalBrandProfilePresenter f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i4 = i3;
                        int i5 = i;
                        switch (i4) {
                            case 0:
                                ((Integer) obj2).getClass();
                                this.f$0.HandleCouponCode(cartBuilder, locationDetail, brandSpot, function02, function1, (Composer) obj, Updater.updateChangedFlags(i5 | 1));
                                break;
                            case 1:
                                ((Integer) obj2).getClass();
                                this.f$0.HandleCouponCode(cartBuilder, locationDetail, brandSpot, function02, function1, (Composer) obj, Updater.updateChangedFlags(i5 | 1));
                                break;
                            case 2:
                                ((Integer) obj2).getClass();
                                this.f$0.HandleCouponCode(cartBuilder, locationDetail, brandSpot, function02, function1, (Composer) obj, Updater.updateChangedFlags(i5 | 1));
                                break;
                            case 3:
                                ((Integer) obj2).getClass();
                                this.f$0.HandleCouponCode(cartBuilder, locationDetail, brandSpot, function02, function1, (Composer) obj, Updater.updateChangedFlags(i5 | 1));
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                this.f$0.HandleCouponCode(cartBuilder, locationDetail, brandSpot, function02, function1, (Composer) obj, Updater.updateChangedFlags(i5 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else if (locationDetail != null) {
                String str3 = locationDetail.summary.token;
                LocationMenu locationMenu = locationDetail.menu;
                if (locationMenu == null) {
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    final int i4 = 2;
                    function2 = new Function2(this) { // from class: app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter$$ExternalSyntheticLambda30
                        public final /* synthetic */ LocalBrandProfilePresenter f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i42 = i4;
                            int i5 = i;
                            switch (i42) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    this.f$0.HandleCouponCode(cartBuilder, locationDetail, brandSpot, function0, function1, (Composer) obj, Updater.updateChangedFlags(i5 | 1));
                                    break;
                                case 1:
                                    ((Integer) obj2).getClass();
                                    this.f$0.HandleCouponCode(cartBuilder, locationDetail, brandSpot, function0, function1, (Composer) obj, Updater.updateChangedFlags(i5 | 1));
                                    break;
                                case 2:
                                    ((Integer) obj2).getClass();
                                    this.f$0.HandleCouponCode(cartBuilder, locationDetail, brandSpot, function0, function1, (Composer) obj, Updater.updateChangedFlags(i5 | 1));
                                    break;
                                case 3:
                                    ((Integer) obj2).getClass();
                                    this.f$0.HandleCouponCode(cartBuilder, locationDetail, brandSpot, function0, function1, (Composer) obj, Updater.updateChangedFlags(i5 | 1));
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    this.f$0.HandleCouponCode(cartBuilder, locationDetail, brandSpot, function0, function1, (Composer) obj, Updater.updateChangedFlags(i5 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    Object[] objArr = new Object[0];
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new AvatarViewModel$$ExternalSyntheticLambda0(26);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer, 48);
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        final int i5 = 3;
                        function2 = new Function2(this) { // from class: app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter$$ExternalSyntheticLambda30
                            public final /* synthetic */ LocalBrandProfilePresenter f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i42 = i5;
                                int i52 = i;
                                switch (i42) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        this.f$0.HandleCouponCode(cartBuilder, locationDetail, brandSpot, function0, function1, (Composer) obj, Updater.updateChangedFlags(i52 | 1));
                                        break;
                                    case 1:
                                        ((Integer) obj2).getClass();
                                        this.f$0.HandleCouponCode(cartBuilder, locationDetail, brandSpot, function0, function1, (Composer) obj, Updater.updateChangedFlags(i52 | 1));
                                        break;
                                    case 2:
                                        ((Integer) obj2).getClass();
                                        this.f$0.HandleCouponCode(cartBuilder, locationDetail, brandSpot, function0, function1, (Composer) obj, Updater.updateChangedFlags(i52 | 1));
                                        break;
                                    case 3:
                                        ((Integer) obj2).getClass();
                                        this.f$0.HandleCouponCode(cartBuilder, locationDetail, brandSpot, function0, function1, (Composer) obj, Updater.updateChangedFlags(i52 | 1));
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        this.f$0.HandleCouponCode(cartBuilder, locationDetail, brandSpot, function0, function1, (Composer) obj, Updater.updateChangedFlags(i52 | 1));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        LocationToken locationToken = new LocationToken(str3);
                        boolean changedInstance = ((i2 & 7168) == 2048) | gapComposer.changedInstance(cartBuilder) | gapComposer.changed(mutableState) | gapComposer.changedInstance(this) | gapComposer.changedInstance(brandSpot) | gapComposer.changed(str3) | gapComposer.changed(str2) | ((i2 & 57344) == 16384);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                            str = str2;
                            ZiplineLoader$load$2 ziplineLoader$load$2 = new ZiplineLoader$load$2(cartBuilder, this, brandSpot, str3, str, function0, function1, mutableState, null, 6);
                            gapComposer.updateRememberedValue(ziplineLoader$load$2);
                            rememberedValue2 = ziplineLoader$load$2;
                        } else {
                            str = str2;
                        }
                        Updater.LaunchedEffect(str, locationMenu, locationToken, (Function2) rememberedValue2, gapComposer);
                    }
                }
            } else {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                final int i6 = 1;
                function2 = new Function2(this) { // from class: app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter$$ExternalSyntheticLambda30
                    public final /* synthetic */ LocalBrandProfilePresenter f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i42 = i6;
                        int i52 = i;
                        switch (i42) {
                            case 0:
                                ((Integer) obj2).getClass();
                                this.f$0.HandleCouponCode(cartBuilder, locationDetail, brandSpot, function0, function1, (Composer) obj, Updater.updateChangedFlags(i52 | 1));
                                break;
                            case 1:
                                ((Integer) obj2).getClass();
                                this.f$0.HandleCouponCode(cartBuilder, locationDetail, brandSpot, function0, function1, (Composer) obj, Updater.updateChangedFlags(i52 | 1));
                                break;
                            case 2:
                                ((Integer) obj2).getClass();
                                this.f$0.HandleCouponCode(cartBuilder, locationDetail, brandSpot, function0, function1, (Composer) obj, Updater.updateChangedFlags(i52 | 1));
                                break;
                            case 3:
                                ((Integer) obj2).getClass();
                                this.f$0.HandleCouponCode(cartBuilder, locationDetail, brandSpot, function0, function1, (Composer) obj, Updater.updateChangedFlags(i52 | 1));
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                this.f$0.HandleCouponCode(cartBuilder, locationDetail, brandSpot, function0, function1, (Composer) obj, Updater.updateChangedFlags(i52 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            }
            endRestartGroup.block = function2;
        }
        gapComposer.skipToGroupEnd();
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i7 = 4;
            function2 = new Function2(this) { // from class: app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter$$ExternalSyntheticLambda30
                public final /* synthetic */ LocalBrandProfilePresenter f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i7;
                    int i52 = i;
                    switch (i42) {
                        case 0:
                            ((Integer) obj2).getClass();
                            this.f$0.HandleCouponCode(cartBuilder, locationDetail, brandSpot, function0, function1, (Composer) obj, Updater.updateChangedFlags(i52 | 1));
                            break;
                        case 1:
                            ((Integer) obj2).getClass();
                            this.f$0.HandleCouponCode(cartBuilder, locationDetail, brandSpot, function0, function1, (Composer) obj, Updater.updateChangedFlags(i52 | 1));
                            break;
                        case 2:
                            ((Integer) obj2).getClass();
                            this.f$0.HandleCouponCode(cartBuilder, locationDetail, brandSpot, function0, function1, (Composer) obj, Updater.updateChangedFlags(i52 | 1));
                            break;
                        case 3:
                            ((Integer) obj2).getClass();
                            this.f$0.HandleCouponCode(cartBuilder, locationDetail, brandSpot, function0, function1, (Composer) obj, Updater.updateChangedFlags(i52 | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            this.f$0.HandleCouponCode(cartBuilder, locationDetail, brandSpot, function0, function1, (Composer) obj, Updater.updateChangedFlags(i52 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    /* renamed from: HandleMarketingMessageOffer-gc3wzeA, reason: not valid java name */
    public final void m1217HandleMarketingMessageOffergc3wzeA(final CartBuilder cartBuilder, final Location.LocationDetail locationDetail, final String str, final Function0 function0, Composer composer, final int i) {
        int i2;
        final Function0 function02;
        Location.LocationDetail locationDetail2;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        MarketingMessageOfferDetails marketingMessageOfferDetails;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-193558102);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(cartBuilder) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(locationDetail) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(str != null ? new LocationToken(str) : null) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function02 = function0;
            i2 |= gapComposer.changedInstance(function02) ? 2048 : 1024;
        } else {
            function02 = function0;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            MarketingMessageOfferDetails marketingMessageOfferDetails2 = this.screen.offer;
            if (marketingMessageOfferDetails2 == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                final int i3 = 0;
                function2 = new Function2(this) { // from class: app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter$$ExternalSyntheticLambda36
                    public final /* synthetic */ LocalBrandProfilePresenter f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i4 = i3;
                        int i5 = i;
                        switch (i4) {
                            case 0:
                                ((Integer) obj2).getClass();
                                this.f$0.m1217HandleMarketingMessageOffergc3wzeA(cartBuilder, locationDetail, str, function02, (Composer) obj, Updater.updateChangedFlags(i5 | 1));
                                break;
                            case 1:
                                ((Integer) obj2).getClass();
                                this.f$0.m1217HandleMarketingMessageOffergc3wzeA(cartBuilder, locationDetail, str, function02, (Composer) obj, Updater.updateChangedFlags(i5 | 1));
                                break;
                            case 2:
                                ((Integer) obj2).getClass();
                                this.f$0.m1217HandleMarketingMessageOffergc3wzeA(cartBuilder, locationDetail, str, function02, (Composer) obj, Updater.updateChangedFlags(i5 | 1));
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                this.f$0.m1217HandleMarketingMessageOffergc3wzeA(cartBuilder, locationDetail, str, function02, (Composer) obj, Updater.updateChangedFlags(i5 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else if (str == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                final int i4 = 1;
                function2 = new Function2(this) { // from class: app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter$$ExternalSyntheticLambda36
                    public final /* synthetic */ LocalBrandProfilePresenter f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i42 = i4;
                        int i5 = i;
                        switch (i42) {
                            case 0:
                                ((Integer) obj2).getClass();
                                this.f$0.m1217HandleMarketingMessageOffergc3wzeA(cartBuilder, locationDetail, str, function0, (Composer) obj, Updater.updateChangedFlags(i5 | 1));
                                break;
                            case 1:
                                ((Integer) obj2).getClass();
                                this.f$0.m1217HandleMarketingMessageOffergc3wzeA(cartBuilder, locationDetail, str, function0, (Composer) obj, Updater.updateChangedFlags(i5 | 1));
                                break;
                            case 2:
                                ((Integer) obj2).getClass();
                                this.f$0.m1217HandleMarketingMessageOffergc3wzeA(cartBuilder, locationDetail, str, function0, (Composer) obj, Updater.updateChangedFlags(i5 | 1));
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                this.f$0.m1217HandleMarketingMessageOffergc3wzeA(cartBuilder, locationDetail, str, function0, (Composer) obj, Updater.updateChangedFlags(i5 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                Object[] objArr = new Object[0];
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = new AvatarViewModel$$ExternalSyntheticLambda0(27);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer, 48);
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    final int i5 = 2;
                    function2 = new Function2(this) { // from class: app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter$$ExternalSyntheticLambda36
                        public final /* synthetic */ LocalBrandProfilePresenter f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i42 = i5;
                            int i52 = i;
                            switch (i42) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    this.f$0.m1217HandleMarketingMessageOffergc3wzeA(cartBuilder, locationDetail, str, function0, (Composer) obj, Updater.updateChangedFlags(i52 | 1));
                                    break;
                                case 1:
                                    ((Integer) obj2).getClass();
                                    this.f$0.m1217HandleMarketingMessageOffergc3wzeA(cartBuilder, locationDetail, str, function0, (Composer) obj, Updater.updateChangedFlags(i52 | 1));
                                    break;
                                case 2:
                                    ((Integer) obj2).getClass();
                                    this.f$0.m1217HandleMarketingMessageOffergc3wzeA(cartBuilder, locationDetail, str, function0, (Composer) obj, Updater.updateChangedFlags(i52 | 1));
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    this.f$0.m1217HandleMarketingMessageOffergc3wzeA(cartBuilder, locationDetail, str, function0, (Composer) obj, Updater.updateChangedFlags(i52 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    locationDetail2 = locationDetail;
                    LocationMenu locationMenu = locationDetail2 != null ? locationDetail2.menu : null;
                    boolean changedInstance = gapComposer.changedInstance(locationMenu) | gapComposer.changedInstance(cartBuilder) | gapComposer.changedInstance(marketingMessageOfferDetails2) | gapComposer.changed(mutableState) | ((i2 & 7168) == 2048);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                        marketingMessageOfferDetails = marketingMessageOfferDetails2;
                        LocalBrandProfilePresenter$HandleMarketingMessageOffer$3$1 localBrandProfilePresenter$HandleMarketingMessageOffer$3$1 = new LocalBrandProfilePresenter$HandleMarketingMessageOffer$3$1(locationMenu, cartBuilder, marketingMessageOfferDetails, function0, mutableState, null);
                        gapComposer.updateRememberedValue(localBrandProfilePresenter$HandleMarketingMessageOffer$3$1);
                        rememberedValue2 = localBrandProfilePresenter$HandleMarketingMessageOffer$3$1;
                    } else {
                        marketingMessageOfferDetails = marketingMessageOfferDetails2;
                    }
                    Updater.LaunchedEffect(marketingMessageOfferDetails, cartBuilder, locationMenu, (Function2) rememberedValue2, gapComposer);
                }
            }
            endRestartGroup.block = function2;
        }
        locationDetail2 = locationDetail;
        gapComposer.skipToGroupEnd();
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i6 = 3;
            final Location.LocationDetail locationDetail3 = locationDetail2;
            function2 = new Function2(this) { // from class: app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter$$ExternalSyntheticLambda36
                public final /* synthetic */ LocalBrandProfilePresenter f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i6;
                    int i52 = i;
                    switch (i42) {
                        case 0:
                            ((Integer) obj2).getClass();
                            this.f$0.m1217HandleMarketingMessageOffergc3wzeA(cartBuilder, locationDetail3, str, function0, (Composer) obj, Updater.updateChangedFlags(i52 | 1));
                            break;
                        case 1:
                            ((Integer) obj2).getClass();
                            this.f$0.m1217HandleMarketingMessageOffergc3wzeA(cartBuilder, locationDetail3, str, function0, (Composer) obj, Updater.updateChangedFlags(i52 | 1));
                            break;
                        case 2:
                            ((Integer) obj2).getClass();
                            this.f$0.m1217HandleMarketingMessageOffergc3wzeA(cartBuilder, locationDetail3, str, function0, (Composer) obj, Updater.updateChangedFlags(i52 | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            this.f$0.m1217HandleMarketingMessageOffergc3wzeA(cartBuilder, locationDetail3, str, function0, (Composer) obj, Updater.updateChangedFlags(i52 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public final void HandlePendingMarketingMessage(final Function0 function0, Composer composer, final int i) {
        int i2;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        Object zzmoVar;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(486139414);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 32 : 16;
        }
        final int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String str = this.screen.pendingMessageToken;
            if (str == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new Function2(this) { // from class: app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter$$ExternalSyntheticLambda28
                        public final /* synthetic */ LocalBrandProfilePresenter f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = r4;
                            int i5 = i;
                            Function0 function02 = function0;
                            LocalBrandProfilePresenter localBrandProfilePresenter = this.f$0;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    localBrandProfilePresenter.HandlePendingMarketingMessage(function02, composer2, Updater.updateChangedFlags(i5 | 1));
                                    break;
                                default:
                                    localBrandProfilePresenter.HandlePendingMarketingMessage(function02, composer2, Updater.updateChangedFlags(i5 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            Object rememberedValue = gapComposer.rememberedValue();
            Continuation continuation = null;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            Object obj = rememberedValue;
            if (rememberedValue == neverEqualPolicy) {
                ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(null);
                gapComposer.updateRememberedValue(mutableStateOf$default);
                obj = mutableStateOf$default;
            }
            MutableState mutableState = (MutableState) obj;
            MessageToken messageToken = new MessageToken(str);
            boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changed(str);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                zzmoVar = new zzmo(this, str, mutableState, continuation, 2);
                gapComposer.updateRememberedValue(zzmoVar);
            } else {
                zzmoVar = rememberedValue2;
            }
            Updater.LaunchedEffect(gapComposer, messageToken, (Function2) zzmoVar);
            MarketingMessageData marketingMessageData = (MarketingMessageData) mutableState.getValue();
            int i4 = (gapComposer.changedInstance(this) ? 1 : 0) | ((i2 & 14) == 4 ? 1 : 0);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (i4 != 0 || rememberedValue3 == neverEqualPolicy) {
                AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$2 = new AnimatedImageDecoder$wrapDrawable$2(mutableState, function0, this, continuation, 14);
                gapComposer.updateRememberedValue(animatedImageDecoder$wrapDrawable$2);
                rememberedValue3 = animatedImageDecoder$wrapDrawable$2;
            }
            Updater.LaunchedEffect(gapComposer, marketingMessageData, (Function2) rememberedValue3);
        } else {
            gapComposer.skipToGroupEnd();
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new Function2(this) { // from class: app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter$$ExternalSyntheticLambda28
                public final /* synthetic */ LocalBrandProfilePresenter f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj22) {
                    int i42 = i3;
                    int i5 = i;
                    Function0 function02 = function0;
                    LocalBrandProfilePresenter localBrandProfilePresenter = this.f$0;
                    Composer composer2 = (Composer) obj2;
                    ((Integer) obj22).getClass();
                    switch (i42) {
                        case 0:
                            localBrandProfilePresenter.HandlePendingMarketingMessage(function02, composer2, Updater.updateChangedFlags(i5 | 1));
                            break;
                        default:
                            localBrandProfilePresenter.HandlePendingMarketingMessage(function02, composer2, Updater.updateChangedFlags(i5 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:280:0x0f11, code lost:
    
        if (r6 == r5) goto L468;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x09b4, code lost:
    
        if (r14 != null) goto L307;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:338:0x099e  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x09ce  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0a0a  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0a10  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0a0d  */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v104, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v129 */
    /* JADX WARN: Type inference failed for: r0v16, types: [app.cash.local.presenters.RealBrandFollowPresenter] */
    /* JADX WARN: Type inference failed for: r2v165, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v114, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r72v0, types: [app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter, java.lang.Object] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LocalBrandProfileViewModel models(Flow flow, Composer composer, int i) {
        Object realImageLoader$execute$2;
        MutableSharedFlow mutableSharedFlow;
        LocalBrandProfilePresenter localBrandProfilePresenter;
        BrandFollowViewModel brandFollowViewModel;
        MutableState mutableState;
        MutableState mutableState2;
        BrandToken brandToken;
        Object m1209selectFulfillmentConfigurationNmdeRlM$default;
        State state;
        MutableState mutableState3;
        State state2;
        BrandFollowViewModel brandFollowViewModel2;
        LocalBrandProfileScreen localBrandProfileScreen;
        MutableState mutableState4;
        LocalFulfillmentType localFulfillmentType;
        MutableState mutableState5;
        GapComposer gapComposer;
        BrandSpot brandSpot;
        BrandSpotSyncTokens brandSpotSyncTokens;
        MutableState mutableState6;
        State state3;
        State state4;
        MutableState mutableState7;
        MutableState mutableState8;
        State state5;
        BrandFollowViewModel brandFollowViewModel3;
        MutableState mutableState9;
        LocalBrandProfilePresenter localBrandProfilePresenter2;
        MutableState mutableState10;
        MutableState mutableState11;
        MutableState mutableState12;
        MutableState mutableState13;
        Object navHostKt$NavHost$33$1;
        BrandToken brandToken2;
        MutableState mutableState14;
        MutableState mutableState15;
        State state6;
        LocationToken locationToken;
        LocationMenu locationMenu;
        MutableState mutableState16;
        LocalBrandProfilePresenter localBrandProfilePresenter3;
        boolean z;
        LocalMoney localMoney;
        LocalMoney calculateCost;
        State state7;
        boolean z2;
        Continuation continuation;
        MutableState mutableState17;
        Object obj;
        LocationMenu locationMenu2;
        State state8;
        boolean z3;
        String str;
        boolean z4;
        boolean z5;
        String string2;
        boolean z6;
        Iterator it;
        String str2;
        String str3;
        List statuses;
        State state9;
        BrandFollowViewModel brandFollowViewModel4;
        boolean z7;
        List list;
        MutableState mutableState18;
        ?? r0;
        State state10;
        int i2;
        GapComposer gapComposer2;
        int i3;
        List list2;
        Object obj2;
        final MutableState mutableState19;
        final State state11;
        LocalBrandProfilePresenter localBrandProfilePresenter4;
        MutableState mutableState20;
        State state12;
        GapComposer gapComposer3;
        Object obj3;
        Object obj4;
        LocalImage localImage;
        flow.getClass();
        ?? r6 = (GapComposer) composer;
        r6.startReplaceGroup(160253373);
        Object rememberedValue = r6.rememberedValue();
        final int i4 = 0;
        Object obj5 = Composer.Companion.Empty;
        if (rememberedValue == obj5) {
            RealLocalBrandProfileBannerDismissalTracker realLocalBrandProfileBannerDismissalTracker = this.bannerDismissalTracker;
            Instant instant = (Instant) realLocalBrandProfileBannerDismissalTracker.dismissedAt.get();
            rememberedValue = Recorder$$ExternalSyntheticOutline1.m(instant != null && instant.compareTo(DimensionKt.now(realLocalBrandProfileBannerDismissalTracker.clock).minus(30L, (TemporalUnit) ChronoUnit.MINUTES)) >= 0, (GapComposer) r6);
        }
        MutableState mutableState21 = (MutableState) rememberedValue;
        Object[] objArr = new Object[0];
        boolean changedInstance = r6.changedInstance(this);
        Object rememberedValue2 = r6.rememberedValue();
        if (changedInstance || rememberedValue2 == obj5) {
            rememberedValue2 = new Function0(this) { // from class: app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter$$ExternalSyntheticLambda0
                public final /* synthetic */ LocalBrandProfilePresenter f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i5 = i4;
                    LocalBrandProfilePresenter localBrandProfilePresenter5 = this.f$0;
                    switch (i5) {
                        case 0:
                            String str4 = localBrandProfilePresenter5.initialSelectedLocationToken;
                            return Updater.mutableStateOf$default(str4 != null ? new LocationToken(str4) : null);
                        case 1:
                            return Updater.mutableStateOf$default(Boolean.valueOf(localBrandProfilePresenter5.screen.pendingMessageToken == null));
                        default:
                            return Updater.mutableStateOf$default(localBrandProfilePresenter5.screen.userIntentLinkContext);
                    }
                }
            };
            r6.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState22 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue2, r6, 0);
        Object rememberedValue3 = r6.rememberedValue();
        if (rememberedValue3 == obj5) {
            rememberedValue3 = Updater.derivedStateOf(new StatusRunnable$$ExternalSyntheticLambda1(11, this, mutableState22));
            r6.updateRememberedValue(rememberedValue3);
        }
        State state13 = (State) rememberedValue3;
        Object[] objArr2 = new Object[0];
        Object rememberedValue4 = r6.rememberedValue();
        if (rememberedValue4 == obj5) {
            rememberedValue4 = new AvatarViewModel$$ExternalSyntheticLambda0(23);
            r6.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState23 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue4, r6, 48);
        Object rememberedValue5 = r6.rememberedValue();
        if (rememberedValue5 == obj5) {
            rememberedValue5 = Updater.derivedStateOf(new LocalBrandProfilePresenter$$ExternalSyntheticLambda21(mutableState23, mutableState22, state13, i4));
            r6.updateRememberedValue(rememberedValue5);
        }
        State state14 = (State) rememberedValue5;
        Object rememberedValue6 = r6.rememberedValue();
        int i5 = 12;
        if (rememberedValue6 == obj5) {
            rememberedValue6 = Updater.derivedStateOf(new StatusRunnable$$ExternalSyntheticLambda1(i5, this, state14));
            r6.updateRememberedValue(rememberedValue6);
        }
        State state15 = (State) rememberedValue6;
        MutableSharedFlow rememberSharedViewEvents = SharedViewEventsKt.rememberSharedViewEvents(r6);
        r6.startMovableGroup(-615298711, (BrandFollowPresenter) state15.getValue());
        BrandFollowViewModel brandFollowViewModel5 = (BrandFollowViewModel) ((RealBrandFollowPresenter) ((BrandFollowPresenter) state15.getValue())).models(rememberSharedViewEvents, r6, 0);
        r6.end(false);
        String models$lambda$9 = models$lambda$9(mutableState23);
        Object[] objArr3 = {models$lambda$9 != null ? new BrandToken(models$lambda$9) : null};
        Object rememberedValue7 = r6.rememberedValue();
        if (rememberedValue7 == obj5) {
            rememberedValue7 = new AvatarViewModel$$ExternalSyntheticLambda0(24);
            r6.updateRememberedValue(rememberedValue7);
        }
        MutableState mutableState24 = (MutableState) SaverKt.rememberSaveable(objArr3, (Function0) rememberedValue7, r6, 48);
        String models$lambda$92 = models$lambda$9(mutableState23);
        BrandToken brandToken3 = models$lambda$92 != null ? new BrandToken(models$lambda$92) : null;
        boolean changed = r6.changed(mutableState23) | r6.changedInstance(this) | r6.changed(mutableState24);
        Object rememberedValue8 = r6.rememberedValue();
        if (changed || rememberedValue8 == obj5) {
            mutableSharedFlow = rememberSharedViewEvents;
            localBrandProfilePresenter = this;
            brandFollowViewModel = brandFollowViewModel5;
            realImageLoader$execute$2 = new RealImageLoader$execute$2(localBrandProfilePresenter, mutableState23, mutableState24, null, 1);
            mutableState = mutableState23;
            mutableState2 = mutableState24;
            brandToken = null;
            r6.updateRememberedValue(realImageLoader$execute$2);
        } else {
            mutableState2 = mutableState24;
            mutableSharedFlow = rememberSharedViewEvents;
            mutableState = mutableState23;
            localBrandProfilePresenter = this;
            realImageLoader$execute$2 = rememberedValue8;
            brandToken = null;
            brandFollowViewModel = brandFollowViewModel5;
        }
        Updater.LaunchedEffect((Composer) r6, brandToken3, (Function2) realImageLoader$execute$2);
        Object rememberedValue9 = r6.rememberedValue();
        LocalInstalledStore localInstalledStore = localBrandProfilePresenter.store;
        if (rememberedValue9 == obj5) {
            rememberedValue9 = ((RealLocalInstalledStore) localInstalledStore).syncValueReader.getAllValues(AndroidSyncValueSpecs.LocalCard);
            r6.updateRememberedValue(rememberedValue9);
        }
        BrandToken brandToken4 = brandToken;
        MutableState mutableState25 = mutableState;
        final LocalBrandProfilePresenter localBrandProfilePresenter5 = this;
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue9, null, null, r6, 48, 2);
        Object rememberedValue10 = r6.rememberedValue();
        int i6 = 8;
        if (rememberedValue10 == obj5) {
            RealLocalInstalledStore$hideBrands$$inlined$map$1 realLocalInstalledStore$hideBrands$$inlined$map$1 = new RealLocalInstalledStore$hideBrands$$inlined$map$1(LocalInstalledStoreKt.localCashBalanceOrNothing(localInstalledStore), i6);
            r6.updateRememberedValue(realLocalInstalledStore$hideBrands$$inlined$map$1);
            rememberedValue10 = realLocalInstalledStore$hideBrands$$inlined$map$1;
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue10, null, null, r6, 48, 2);
        Object rememberedValue11 = r6.rememberedValue();
        int i7 = 2;
        if (rememberedValue11 == obj5) {
            CardModelView$cardHeat$$inlined$map$1 cardModelView$cardHeat$$inlined$map$1 = new CardModelView$cardHeat$$inlined$map$1(localBrandProfilePresenter5.profileManager.publicProfile(), i7);
            r6.updateRememberedValue(cardModelView$cardHeat$$inlined$map$1);
            rememberedValue11 = cardModelView$cardHeat$$inlined$map$1;
        }
        final MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue11, null, null, r6, 48, 2);
        Object rememberedValue12 = r6.rememberedValue();
        if (rememberedValue12 == obj5) {
            rememberedValue12 = Updater.derivedStateOf(new n$$ExternalSyntheticLambda1(14, collectAsState, localBrandProfilePresenter5, mutableState25));
            r6.updateRememberedValue(rememberedValue12);
        }
        State state16 = (State) rememberedValue12;
        String models$lambda$93 = models$lambda$9(mutableState25);
        boolean changed2 = r6.changed(models$lambda$93 != null ? new BrandToken(models$lambda$93) : brandToken4);
        Object rememberedValue13 = r6.rememberedValue();
        int i8 = 4;
        if (changed2 || rememberedValue13 == obj5) {
            if (models$lambda$9(mutableState25) == null) {
                m1209selectFulfillmentConfigurationNmdeRlM$default = new StartedLazily$command$$inlined$unsafeFlow$1(new FulfillmentConfiguration[0], i8);
            } else {
                String models$lambda$94 = models$lambda$9(mutableState25);
                models$lambda$94.getClass();
                m1209selectFulfillmentConfigurationNmdeRlM$default = LocalInstalledStore.m1209selectFulfillmentConfigurationNmdeRlM$default(localInstalledStore, models$lambda$94);
            }
            rememberedValue13 = m1209selectFulfillmentConfigurationNmdeRlM$default;
            r6.updateRememberedValue(rememberedValue13);
        }
        MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue13, null, null, r6, 48, 2);
        Object rememberedValue14 = r6.rememberedValue();
        if (rememberedValue14 == obj5) {
            rememberedValue14 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, r6);
            r6.updateRememberedValue(rememberedValue14);
        }
        CoroutineScope coroutineScope = (CoroutineScope) rememberedValue14;
        boolean changedInstance2 = r6.changedInstance(coroutineScope) | r6.changedInstance(localBrandProfilePresenter5);
        Object rememberedValue15 = r6.rememberedValue();
        if (changedInstance2 || rememberedValue15 == obj5) {
            rememberedValue15 = new MenuKt$$ExternalSyntheticLambda1(12, coroutineScope, localBrandProfilePresenter5, state13);
            r6.updateRememberedValue(rememberedValue15);
        }
        Function2 function2 = (Function2) rememberedValue15;
        AnswerDispatcher answerDispatcher = (AnswerDispatcher) r6.consume(AnswersKt.LocalAnswerDispatcher);
        boolean changed3 = r6.changed(function2) | r6.changedInstance(answerDispatcher);
        Object rememberedValue16 = r6.rememberedValue();
        if (changed3 || rememberedValue16 == obj5) {
            rememberedValue16 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, i6);
            r6.updateRememberedValue(rememberedValue16);
        }
        Updater.DisposableEffect(answerDispatcher, (Function1) rememberedValue16, (Composer) r6);
        Object[] objArr4 = new Object[0];
        Object rememberedValue17 = r6.rememberedValue();
        if (rememberedValue17 == obj5) {
            rememberedValue17 = new AvatarViewModel$$ExternalSyntheticLambda0(25);
            r6.updateRememberedValue(rememberedValue17);
        }
        MutableState mutableState26 = (MutableState) SaverKt.rememberSaveable(objArr4, (Function0) rememberedValue17, r6, 48);
        boolean changed4 = r6.changed((FulfillmentConfiguration) collectAsState4.getValue()) | r6.changed(((Boolean) mutableState26.getValue()).booleanValue());
        Object rememberedValue18 = r6.rememberedValue();
        if (changed4 || rememberedValue18 == obj5) {
            rememberedValue18 = Updater.derivedStateOf(new n$$ExternalSyntheticLambda1(15, localBrandProfilePresenter5, mutableState26, collectAsState4));
            r6.updateRememberedValue(rememberedValue18);
        }
        State state17 = (State) rememberedValue18;
        boolean changed5 = r6.changed(((BrandSpotSyncTokens) state17.getValue()).inStoreOrderingToken);
        Object rememberedValue19 = r6.rememberedValue();
        if (changed5 || rememberedValue19 == obj5) {
            rememberedValue19 = Recorder$$ExternalSyntheticOutline1.m(models$lambda$34(state17).inStoreOrderingToken != null, (GapComposer) r6);
        }
        MutableState mutableState27 = (MutableState) rememberedValue19;
        Object[] objArr5 = new Object[0];
        boolean changedInstance3 = r6.changedInstance(localBrandProfilePresenter5);
        Object rememberedValue20 = r6.rememberedValue();
        if (changedInstance3 || rememberedValue20 == obj5) {
            final int i9 = 1;
            rememberedValue20 = new Function0(localBrandProfilePresenter5) { // from class: app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter$$ExternalSyntheticLambda0
                public final /* synthetic */ LocalBrandProfilePresenter f$0;

                {
                    this.f$0 = localBrandProfilePresenter5;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i52 = i9;
                    LocalBrandProfilePresenter localBrandProfilePresenter52 = this.f$0;
                    switch (i52) {
                        case 0:
                            String str4 = localBrandProfilePresenter52.initialSelectedLocationToken;
                            return Updater.mutableStateOf$default(str4 != null ? new LocationToken(str4) : null);
                        case 1:
                            return Updater.mutableStateOf$default(Boolean.valueOf(localBrandProfilePresenter52.screen.pendingMessageToken == null));
                        default:
                            return Updater.mutableStateOf$default(localBrandProfilePresenter52.screen.userIntentLinkContext);
                    }
                }
            };
            r6.updateRememberedValue(rememberedValue20);
        }
        MutableState mutableState28 = (MutableState) SaverKt.rememberSaveable(objArr5, (Function0) rememberedValue20, r6, 0);
        LocalBrandProfileScreen localBrandProfileScreen2 = localBrandProfilePresenter5.screen;
        Object[] objArr6 = {localBrandProfileScreen2.userIntentLinkContext};
        boolean changedInstance4 = r6.changedInstance(localBrandProfilePresenter5);
        Object rememberedValue21 = r6.rememberedValue();
        if (changedInstance4 || rememberedValue21 == obj5) {
            state = state13;
            final int i10 = 2;
            rememberedValue21 = new Function0(localBrandProfilePresenter5) { // from class: app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter$$ExternalSyntheticLambda0
                public final /* synthetic */ LocalBrandProfilePresenter f$0;

                {
                    this.f$0 = localBrandProfilePresenter5;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i52 = i10;
                    LocalBrandProfilePresenter localBrandProfilePresenter52 = this.f$0;
                    switch (i52) {
                        case 0:
                            String str4 = localBrandProfilePresenter52.initialSelectedLocationToken;
                            return Updater.mutableStateOf$default(str4 != null ? new LocationToken(str4) : null);
                        case 1:
                            return Updater.mutableStateOf$default(Boolean.valueOf(localBrandProfilePresenter52.screen.pendingMessageToken == null));
                        default:
                            return Updater.mutableStateOf$default(localBrandProfilePresenter52.screen.userIntentLinkContext);
                    }
                }
            };
            r6.updateRememberedValue(rememberedValue21);
        } else {
            state = state13;
        }
        MutableState mutableState29 = (MutableState) SaverKt.rememberSaveable(objArr6, (Function0) rememberedValue21, r6, 0);
        BrandSpot models$lambda$7 = models$lambda$7(state);
        BrandSpotSyncTokens models$lambda$34 = models$lambda$34(state17);
        LocalFulfillmentType type2 = FulfillmentConfigurationKt.getType(models$lambda$28(collectAsState4));
        boolean changedInstance5 = r6.changedInstance(localBrandProfilePresenter5) | r6.changed(state17) | r6.changed(collectAsState4) | r6.changed(mutableState29) | r6.changed(mutableState27);
        Object rememberedValue22 = r6.rememberedValue();
        if (changedInstance5 || rememberedValue22 == obj5) {
            mutableState3 = mutableState22;
            state2 = state16;
            brandFollowViewModel2 = brandFollowViewModel;
            localBrandProfileScreen = localBrandProfileScreen2;
            mutableState4 = mutableState26;
            localFulfillmentType = type2;
            mutableState5 = mutableState25;
            gapComposer = r6;
            brandSpot = models$lambda$7;
            brandSpotSyncTokens = models$lambda$34;
            mutableState6 = mutableState27;
            State state18 = state;
            rememberedValue22 = new NetworkFetcher$doFetch$fetchResult$1(10, mutableState29, localBrandProfilePresenter5, state18, state17, collectAsState4, mutableState6, (Continuation) null);
            state3 = state18;
            state4 = state17;
            mutableState7 = collectAsState4;
            localBrandProfilePresenter5 = localBrandProfilePresenter5;
            gapComposer.updateRememberedValue(rememberedValue22);
        } else {
            localFulfillmentType = type2;
            mutableState3 = mutableState22;
            state2 = state16;
            brandFollowViewModel2 = brandFollowViewModel;
            localBrandProfileScreen = localBrandProfileScreen2;
            state3 = state;
            mutableState4 = mutableState26;
            mutableState7 = collectAsState4;
            mutableState5 = mutableState25;
            gapComposer = r6;
            brandSpot = models$lambda$7;
            state4 = state17;
            brandSpotSyncTokens = models$lambda$34;
            mutableState6 = mutableState27;
        }
        Updater.LaunchedEffect(brandSpot, brandSpotSyncTokens, localFulfillmentType, (Function2) rememberedValue22, gapComposer);
        if (((Boolean) mutableState28.getValue()).booleanValue()) {
            gapComposer.startReplaceGroup(-1889413371);
            gapComposer.endReplaceGroup();
        } else {
            gapComposer.startReplaceGroup(-1889495056);
            boolean changed6 = gapComposer.changed(mutableState28);
            Object rememberedValue23 = gapComposer.rememberedValue();
            if (changed6 || rememberedValue23 == obj5) {
                rememberedValue23 = new TooltipKt$$ExternalSyntheticLambda1(20, mutableState28);
                gapComposer.updateRememberedValue(rememberedValue23);
            }
            localBrandProfilePresenter5.HandlePendingMarketingMessage((Function0) rememberedValue23, gapComposer, i & 112);
            gapComposer.endReplaceGroup();
        }
        Object rememberedValue24 = gapComposer.rememberedValue();
        if (rememberedValue24 == obj5) {
            rememberedValue24 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue24);
        }
        MutableState mutableState30 = (MutableState) rememberedValue24;
        boolean changed7 = gapComposer.changed(models$lambda$7(state3));
        Object rememberedValue25 = gapComposer.rememberedValue();
        RealLocalBrandRepository realLocalBrandRepository = localBrandProfilePresenter5.repository;
        if (changed7 || rememberedValue25 == obj5) {
            rememberedValue25 = realLocalBrandRepository.brand(models$lambda$7(state3));
            gapComposer.updateRememberedValue(rememberedValue25);
        }
        GapComposer gapComposer4 = gapComposer;
        MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue25, null, null, gapComposer4, 48, 2);
        boolean changed8 = gapComposer4.changed(models$lambda$7(state3));
        Object rememberedValue26 = gapComposer4.rememberedValue();
        if (changed8 || rememberedValue26 == obj5) {
            rememberedValue26 = Updater.mutableStateOf$default(brandToken4);
            gapComposer4.updateRememberedValue(rememberedValue26);
        }
        MutableState mutableState31 = (MutableState) rememberedValue26;
        BrandSpot models$lambda$72 = models$lambda$7(state3);
        LocalBrand localBrand = (LocalBrand) collectAsState5.getValue();
        Boolean bool = (Boolean) mutableState6.getValue();
        bool.getClass();
        Object[] objArr7 = {models$lambda$72, localBrand, bool, models$lambda$34(state4).getInStoreOrderingToken()};
        boolean changed9 = gapComposer4.changed(state4) | gapComposer4.changed(mutableState6) | gapComposer4.changed(collectAsState5) | gapComposer4.changed(mutableState5) | gapComposer4.changed(mutableState31);
        Object rememberedValue27 = gapComposer4.rememberedValue();
        if (changed9 || rememberedValue27 == obj5) {
            State state19 = state4;
            mutableState8 = mutableState5;
            rememberedValue27 = new MoleculeKt$immediateClockFlow$1$1$1(state19, mutableState6, collectAsState5, mutableState8, mutableState31, null, 4);
            state5 = state19;
            gapComposer4.updateRememberedValue(rememberedValue27);
        } else {
            mutableState8 = mutableState5;
            state5 = state4;
        }
        Updater.LaunchedEffect(objArr7, (Function2) rememberedValue27, gapComposer4);
        Object rememberedValue28 = gapComposer4.rememberedValue();
        if (rememberedValue28 == obj5) {
            rememberedValue28 = Updater.mutableStateOf$default(CollectionsKt__CollectionsKt.emptyList());
            gapComposer4.updateRememberedValue(rememberedValue28);
        }
        MutableState mutableState32 = (MutableState) rememberedValue28;
        int i11 = 29;
        if (((LocalBrand) mutableState31.getValue()) == null) {
            gapComposer4.startReplaceGroup(-1887741696);
            ?? r3 = brandToken4;
            Updater.LaunchedEffect(gapComposer4, flow, new SliderState$drag$2(flow, (Continuation) r3, localBrandProfilePresenter5, i11));
            if (((LocalCard) state2.getValue()) == null) {
                gapComposer4.endReplaceGroup();
                gapComposer4.endReplaceGroup();
                return LocalBrandProfileViewModel.Loading.INSTANCE;
            }
            String str4 = models$lambda$7(state3).brandToken;
            LocalCard localCard = (LocalCard) state2.getValue();
            localCard.getClass();
            String str5 = localCard.title;
            str5.getClass();
            LocalCard localCard2 = (LocalCard) state2.getValue();
            localCard2.getClass();
            Image image = localCard2.artwork_image;
            if (image != null) {
                String str6 = image.light_url;
                str6.getClass();
                String str7 = image.dark_url;
                str7.getClass();
                localImage = new LocalImage(str6, str7, (Long) null, (Long) null, (LocalColor) null, 60);
            } else {
                localImage = r3;
            }
            LocationStatus.Unknown unknown = new LocationStatus.Unknown("");
            EmptyList emptyList = CollectionsKt__CollectionsKt.emptyList();
            LocalCard localCard3 = (LocalCard) state2.getValue();
            localCard3.getClass();
            LocalCard.ColorPalette colorPalette = localCard3.color_palette;
            LocalColor localColor = r3;
            if (colorPalette != null) {
                Color color = colorPalette.background_color;
                localColor = r3;
                if (color != null) {
                    Color.ModeVariant modeVariant = color.light;
                    modeVariant.getClass();
                    String str8 = modeVariant.srgb;
                    Color.ModeVariant modeVariant2 = color.dark;
                    modeVariant2.getClass();
                    localColor = new LocalColor(str8, modeVariant2.srgb);
                }
            }
            LocalBrandProfileViewModel.Content content = new LocalBrandProfileViewModel.Content(str4, localImage, str5, null, "", null, null, unknown, emptyList, localColor, null, null, new LocalBrandProfileViewModel.MoreOptionsMenuModel(brandFollowViewModel2, false), new LocalBrandProfileViewModel.FulfillmentOptionsMenuModel("", true, false, false, false, false, ""), null, false, null, false, 1035264);
            gapComposer4.endReplaceGroup();
            gapComposer4.endReplaceGroup();
            return content;
        }
        BrandFollowViewModel brandFollowViewModel6 = brandFollowViewModel2;
        gapComposer4.startReplaceGroup(-1886230043);
        gapComposer4.endReplaceGroup();
        Object rememberedValue29 = gapComposer4.rememberedValue();
        int i12 = 21;
        if (rememberedValue29 == obj5) {
            rememberedValue29 = Updater.derivedStateOf(new TooltipKt$$ExternalSyntheticLambda1(i12, mutableState31));
            gapComposer4.updateRememberedValue(rememberedValue29);
        }
        final State state20 = (State) rememberedValue29;
        Object[] objArr8 = new Object[0];
        Object rememberedValue30 = gapComposer4.rememberedValue();
        if (rememberedValue30 == obj5) {
            rememberedValue30 = new AvatarViewModel$$ExternalSyntheticLambda0(28);
            gapComposer4.updateRememberedValue(rememberedValue30);
        }
        MutableState mutableState33 = (MutableState) SaverKt.rememberSaveable(objArr8, (Function0) rememberedValue30, gapComposer4, 48);
        Object[] objArr9 = new Object[0];
        Object rememberedValue31 = gapComposer4.rememberedValue();
        if (rememberedValue31 == obj5) {
            rememberedValue31 = new AvatarViewModel$$ExternalSyntheticLambda0(i11);
            gapComposer4.updateRememberedValue(rememberedValue31);
        }
        MutableState mutableState34 = (MutableState) SaverKt.rememberSaveable(objArr9, (Function0) rememberedValue31, gapComposer4, 48);
        FulfillmentConfiguration models$lambda$28 = models$lambda$28(mutableState7);
        if (models$lambda$28 != null) {
            gapComposer4.startReplaceGroup(-1106477359);
            brandFollowViewModel3 = brandFollowViewModel6;
            localBrandProfilePresenter2 = localBrandProfilePresenter5;
            mutableState10 = mutableState30;
            MutableState mutableState35 = mutableState8;
            mutableState11 = mutableState3;
            mutableState13 = mutableState32;
            mutableState12 = mutableState35;
            mutableState9 = mutableState31;
            Updater.LaunchedEffect(gapComposer4, models$lambda$28, new OffersHomePresenter$models$8$1(models$lambda$28, (Continuation) null, localBrandProfilePresenter2, mutableState33, mutableState31, mutableState11, mutableState35, state20, mutableState34));
            gapComposer4.endReplaceGroup();
        } else {
            brandFollowViewModel3 = brandFollowViewModel6;
            mutableState9 = mutableState31;
            localBrandProfilePresenter2 = localBrandProfilePresenter5;
            mutableState10 = mutableState30;
            mutableState11 = mutableState3;
            mutableState12 = mutableState8;
            mutableState13 = mutableState32;
            gapComposer4.startReplaceGroup(-1106436997);
            gapComposer4.endReplaceGroup();
        }
        Object rememberedValue32 = gapComposer4.rememberedValue();
        int i13 = 22;
        if (rememberedValue32 == obj5) {
            rememberedValue32 = Updater.derivedStateOf(new TooltipKt$$ExternalSyntheticLambda1(i13, mutableState9));
            gapComposer4.updateRememberedValue(rememberedValue32);
        }
        State state21 = (State) rememberedValue32;
        Object rememberedValue33 = gapComposer4.rememberedValue();
        if (rememberedValue33 == obj5) {
            rememberedValue33 = Updater.derivedStateOf(new HeroCardViewKt$$ExternalSyntheticLambda2(mutableState34, state21, 1));
            gapComposer4.updateRememberedValue(rememberedValue33);
        }
        final State state22 = (State) rememberedValue33;
        Location.LocationDetail models$lambda$70 = models$lambda$70(state21);
        LocationMenu locationMenu3 = models$lambda$70 != null ? models$lambda$70.menu : null;
        BuyerIntentState rememberBuyerIntentCartState = BuyerIntentCartScopesKt.rememberBuyerIntentCartState(localBrandProfilePresenter2.buyerIntentManager, models$lambda$12(state14), models$lambda$34(state5).getInStoreOrderingToken(), gapComposer4);
        CartBuilderManager cartBuilderManager = localBrandProfilePresenter2.cartManager;
        BuyerIntentCartScopesKt.SeedBuyerIntentCartEffect(cartBuilderManager, rememberBuyerIntentCartState, locationMenu3, gapComposer4, 64);
        CartBuilder rememberBuyerIntentCartBuilder = BuyerIntentCartScopesKt.rememberBuyerIntentCartBuilder(cartBuilderManager, rememberBuyerIntentCartState, models$lambda$12(state14).locationToken == null ? LocalBrandProfilePresenterKt.EMPTY_BRAND_SPOT : models$lambda$12(state14), gapComposer4);
        String models$lambda$95 = models$lambda$9(mutableState12);
        BrandToken m1226boximpl = models$lambda$95 != null ? BrandToken.m1226boximpl(models$lambda$95) : null;
        String models$lambda$4 = models$lambda$4(mutableState11);
        LocationToken m1249boximpl = models$lambda$4 != null ? LocationToken.m1249boximpl(models$lambda$4) : null;
        boolean changed10 = gapComposer4.changed(mutableState12) | gapComposer4.changed(mutableState11) | gapComposer4.changedInstance(locationMenu3) | gapComposer4.changedInstance(localBrandProfilePresenter2) | gapComposer4.changedInstance(rememberBuyerIntentCartBuilder);
        Object rememberedValue34 = gapComposer4.rememberedValue();
        if (changed10 || rememberedValue34 == obj5) {
            MutableState mutableState36 = mutableState9;
            brandToken2 = m1226boximpl;
            LocationMenu locationMenu4 = locationMenu3;
            LocalBrandProfilePresenter localBrandProfilePresenter6 = localBrandProfilePresenter2;
            mutableState14 = mutableState36;
            mutableState15 = mutableState34;
            state6 = state21;
            locationToken = m1249boximpl;
            navHostKt$NavHost$33$1 = new NavHostKt$NavHost$33$1(locationMenu4, mutableState12, mutableState11, localBrandProfilePresenter6, rememberBuyerIntentCartBuilder, (Continuation) null, 1);
            locationMenu = locationMenu4;
            mutableState16 = mutableState12;
            localBrandProfilePresenter3 = localBrandProfilePresenter6;
            gapComposer4.updateRememberedValue(navHostKt$NavHost$33$1);
        } else {
            state6 = state21;
            mutableState16 = mutableState12;
            localBrandProfilePresenter3 = localBrandProfilePresenter2;
            mutableState14 = mutableState9;
            mutableState15 = mutableState34;
            navHostKt$NavHost$33$1 = rememberedValue34;
            brandToken2 = m1226boximpl;
            locationToken = m1249boximpl;
            locationMenu = locationMenu3;
        }
        Updater.LaunchedEffect(brandToken2, locationToken, locationMenu, (Function2) navHostKt$NavHost$33$1, gapComposer4);
        RealCartBuilder realCartBuilder = (RealCartBuilder) rememberBuyerIntentCartBuilder;
        Iterator it2 = realCartBuilder.entries(gapComposer4).iterator();
        int i14 = 0;
        while (it2.hasNext()) {
            i14 += ((CartEntryWithQuantity) it2.next()).getQuantity();
        }
        Location.LocationDetail models$lambda$702 = models$lambda$70(state6);
        LocationMenu locationMenu5 = models$lambda$702 != null ? models$lambda$702.menu : null;
        if (locationMenu5 == null) {
            gapComposer4.startReplaceGroup(-1877627730);
            gapComposer4.endReplaceGroup();
            localMoney = null;
            z = false;
        } else {
            gapComposer4.startReplaceGroup(-1877627729);
            z = false;
            LocalMoney calculateCost2 = realCartBuilder.calculateCost(locationMenu5, false, gapComposer4);
            gapComposer4.endReplaceGroup();
            localMoney = calculateCost2;
        }
        gapComposer4.startReplaceGroup(-740661927);
        boolean booleanValue = ((Boolean) realCartBuilder.includesPreorderItemsState.getValue()).booleanValue();
        gapComposer4.end(z);
        Location.LocationDetail models$lambda$703 = models$lambda$70(state6);
        LocationMenu locationMenu6 = models$lambda$703 != null ? models$lambda$703.menu : null;
        if (locationMenu6 == null) {
            gapComposer4.startReplaceGroup(-1877440273);
            gapComposer4.endReplaceGroup();
            calculateCost = null;
        } else {
            gapComposer4.startReplaceGroup(-1877440272);
            calculateCost = realCartBuilder.calculateCost(locationMenu6, true, gapComposer4);
            gapComposer4.endReplaceGroup();
        }
        if (calculateCost == null || Intrinsics.areEqual(calculateCost, localMoney)) {
            calculateCost = null;
        }
        BrandSpot models$lambda$12 = models$lambda$12(state14);
        boolean changedInstance6 = gapComposer4.changedInstance(localBrandProfilePresenter3);
        Object rememberedValue35 = gapComposer4.rememberedValue();
        if (changedInstance6 || rememberedValue35 == obj5) {
            state7 = state14;
            z2 = booleanValue;
            continuation = null;
            rememberedValue35 = new ZiplineLoader$ModuleJob$run$3(localBrandProfilePresenter3, state7, continuation, 8);
            gapComposer4.updateRememberedValue(rememberedValue35);
        } else {
            state7 = state14;
            z2 = booleanValue;
            continuation = null;
        }
        Updater.LaunchedEffect(gapComposer4, models$lambda$12, (Function2) rememberedValue35);
        boolean changed11 = gapComposer4.changed(models$lambda$12(state7));
        Object rememberedValue36 = gapComposer4.rememberedValue();
        if (changed11 || rememberedValue36 == obj5) {
            rememberedValue36 = realLocalBrandRepository.buyerInfo(models$lambda$12(state7));
            gapComposer4.updateRememberedValue(rememberedValue36);
        }
        LocalMoney localMoney2 = calculateCost;
        LocalMoney localMoney3 = localMoney;
        boolean z8 = z2;
        State state23 = state7;
        MutableState collectAsState6 = Updater.collectAsState((Flow) rememberedValue36, null, null, gapComposer4, 48, 2);
        LocalCart rememberActiveOpenTabCart = OpenTabStateKt.rememberActiveOpenTabCart(realCartBuilder, (GetBuyerInfoResponse.BuyerInfo) collectAsState6.getValue(), gapComposer4);
        boolean changed12 = gapComposer4.changed((LocalBrand) mutableState14.getValue()) | gapComposer4.changed(models$lambda$28(mutableState7)) | gapComposer4.changed(models$lambda$34(state5).getInStoreOrderingToken());
        Object rememberedValue37 = gapComposer4.rememberedValue();
        if (changed12 || rememberedValue37 == obj5) {
            LocalBrand localBrand2 = (LocalBrand) mutableState14.getValue();
            rememberedValue37 = models$lambda$28(mutableState7);
            String inStoreOrderingToken = models$lambda$34(state5).getInStoreOrderingToken();
            if (rememberedValue37 != null) {
                Object obj6 = rememberedValue37 instanceof FulfillmentConfiguration.InStore ? rememberedValue37 : null;
                if (obj6 != null) {
                    rememberedValue37 = obj6;
                    gapComposer4.updateRememberedValue(rememberedValue37);
                }
            }
            FulfillmentConfiguration inStoreFulfillmentConfiguration = FulfillmentConfigurationKt.inStoreFulfillmentConfiguration(localBrand2, inStoreOrderingToken);
            if (inStoreFulfillmentConfiguration != null) {
                rememberedValue37 = inStoreFulfillmentConfiguration;
            }
            gapComposer4.updateRememberedValue(rememberedValue37);
        }
        FulfillmentConfiguration fulfillmentConfiguration = (FulfillmentConfiguration) rememberedValue37;
        boolean changed13 = gapComposer4.changed(rememberActiveOpenTabCart) | gapComposer4.changed(fulfillmentConfiguration);
        Object rememberedValue38 = gapComposer4.rememberedValue();
        AndroidStringManager androidStringManager = localBrandProfilePresenter3.stringManager;
        if (changed13 || rememberedValue38 == obj5) {
            rememberedValue38 = LocalOpenTabFooterModelFactoryKt.openTabFooterModal(rememberActiveOpenTabCart, fulfillmentConfiguration, androidStringManager);
            gapComposer4.updateRememberedValue(rememberedValue38);
        }
        LocalBottomModalViewModel localBottomModalViewModel = (LocalBottomModalViewModel) rememberedValue38;
        boolean changed14 = gapComposer4.changed(fulfillmentConfiguration) | gapComposer4.changed(localBottomModalViewModel);
        Object rememberedValue39 = gapComposer4.rememberedValue();
        if (changed14 || rememberedValue39 == obj5) {
            LocalBottomModalViewModel checkedInFooterModal = ((fulfillmentConfiguration instanceof FulfillmentConfiguration.InStore) && localBottomModalViewModel == null) ? LocalOpenTabFooterModelFactoryKt.checkedInFooterModal((FulfillmentConfiguration.InStore) fulfillmentConfiguration, androidStringManager) : null;
            gapComposer4.updateRememberedValue(checkedInFooterModal);
            rememberedValue39 = checkedInFooterModal;
        }
        LocalBottomModalViewModel localBottomModalViewModel2 = (LocalBottomModalViewModel) rememberedValue39;
        boolean changed15 = gapComposer4.changed((List) mutableState13.getValue());
        Object rememberedValue40 = gapComposer4.rememberedValue();
        if (changed15 || rememberedValue40 == obj5) {
            List list3 = (List) mutableState13.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj7 : list3) {
                MutableState mutableState37 = collectAsState6;
                if (!LocalBrandProfilePresenterKt.access$isInStoreOpenTabOrder((LocalOrder) obj7)) {
                    arrayList.add(obj7);
                }
                collectAsState6 = mutableState37;
            }
            mutableState17 = collectAsState6;
            gapComposer4.updateRememberedValue(arrayList);
            obj = arrayList;
        } else {
            mutableState17 = collectAsState6;
            obj = rememberedValue40;
        }
        List list4 = (List) obj;
        boolean changed16 = gapComposer4.changed(list4) | gapComposer4.changed(i14) | gapComposer4.changed(localMoney3) | gapComposer4.changed(localBottomModalViewModel) | gapComposer4.changed(localBottomModalViewModel2);
        Object rememberedValue41 = gapComposer4.rememberedValue();
        int i15 = i14;
        if (changed16 || rememberedValue41 == obj5) {
            ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
            if (list4.isEmpty()) {
                locationMenu2 = locationMenu;
                state8 = state5;
                z3 = z8;
            } else {
                List take = CollectionsKt.take(list4, 3);
                state8 = state5;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(take, 10));
                Iterator it3 = take.iterator();
                while (it3.hasNext()) {
                    LocalOrder localOrder = (LocalOrder) it3.next();
                    LocalOrder.OrderStatus orderStatus = localOrder.order_status;
                    OrderStatus orderStatus2 = orderStatus != null ? OrderStatusKt.toOrderStatus(orderStatus) : null;
                    Iterator it4 = it3;
                    LocalFulfillment localFulfillment = localOrder.fulfillment;
                    Fulfillment fulfillment = localFulfillment != null ? FulfillmentKt.toFulfillment(localFulfillment) : null;
                    OrderStatus orderStatus3 = orderStatus2;
                    if (fulfillment != null) {
                        z4 = z8;
                        if (DateTimesKt.hasFriendlyEstimatedTimeText(fulfillment)) {
                            z5 = true;
                            if (fulfillment != null) {
                                LocalLocationSummary localLocationSummary = localOrder.location_summary;
                                localLocationSummary.getClass();
                                String str9 = localLocationSummary.time_zone;
                                str9.getClass();
                                LocalText estimatedTime = DateTimesKt.estimatedTime(fulfillment, androidStringManager, ZoneId.of(str9));
                                if (estimatedTime != null) {
                                    string2 = estimatedTime.text;
                                }
                            }
                            string2 = androidStringManager.getString();
                            z6 = z5;
                            it = localOrder.order_summary.iterator();
                            int i16 = 0;
                            while (it.hasNext()) {
                                Iterator it5 = it;
                                Integer num = ((LocalOrder.OrderSummaryLine) it.next()).quantity;
                                i16 += num != null ? num.intValue() : 0;
                                it = it5;
                            }
                            Integer valueOf = Integer.valueOf(i16);
                            str2 = string2;
                            LocationMenu locationMenu7 = locationMenu;
                            String string3 = androidStringManager.getString(new FormattedResource(R.string.local_presenters_items_count, NavAction$$ExternalSyntheticOutline0.m(1, valueOf, "count")));
                            if (orderStatus3 != null || (str3 = orderStatus3.getCurrentStatusFulfillmentLabel()) == null) {
                                str3 = !z6 ? str2 : null;
                                if (str3 == null) {
                                    LocalFulfillmentType localFulfillmentType2 = fulfillment != null ? fulfillment.f911type : null;
                                    switch (localFulfillmentType2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[localFulfillmentType2.ordinal()]) {
                                        case -1:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                            str2.getClass();
                                            str3 = androidStringManager.getString(new FormattedResource(R.string.local_presenters_ready_by, new Object[]{str2}));
                                            break;
                                        case 0:
                                        default:
                                            throw new NoWhenBranchMatchedException();
                                        case 6:
                                            str2.getClass();
                                            str3 = androidStringManager.getString(new FormattedResource(R.string.local_presenters_delivered_by, new Object[]{str2}));
                                            break;
                                    }
                                }
                            }
                            String joinToString$default = CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{string3, str3}), " · ", null, null, 0, null, null, 62);
                            if (orderStatus3 != null || (statuses = orderStatus3.getStatuses()) == null || (r7 = (String) statuses.get(orderStatus3.getCurrentStatusIndex())) == null) {
                                String str10 = androidStringManager.get(R.string.local_presenters_estimated_pickup);
                            }
                            arrayList2.add(new ProfileBottomModal(new LocalBottomModalViewModel(true, null, new LocalBottomModalViewModel.Payload.ItemInfo(null, joinToString$default, str10), androidStringManager.get(R.string.local_presenters_view_order), false, 18), new ProfileBottomModalAction.ViewOrder(localOrder)));
                            it3 = it4;
                            z8 = z4;
                            locationMenu = locationMenu7;
                        }
                    } else {
                        z4 = z8;
                    }
                    z5 = false;
                    if (fulfillment != null) {
                    }
                    string2 = androidStringManager.getString();
                    z6 = z5;
                    it = localOrder.order_summary.iterator();
                    int i162 = 0;
                    while (it.hasNext()) {
                    }
                    Integer valueOf2 = Integer.valueOf(i162);
                    str2 = string2;
                    LocationMenu locationMenu72 = locationMenu;
                    String string32 = androidStringManager.getString(new FormattedResource(R.string.local_presenters_items_count, NavAction$$ExternalSyntheticOutline0.m(1, valueOf2, "count")));
                    if (orderStatus3 != null) {
                    }
                    if (!z6) {
                    }
                    if (str3 == null) {
                    }
                    String joinToString$default2 = CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{string32, str3}), " · ", null, null, 0, null, null, 62);
                    if (orderStatus3 != null) {
                    }
                    String str102 = androidStringManager.get(R.string.local_presenters_estimated_pickup);
                    arrayList2.add(new ProfileBottomModal(new LocalBottomModalViewModel(true, null, new LocalBottomModalViewModel.Payload.ItemInfo(null, joinToString$default2, str102), androidStringManager.get(R.string.local_presenters_view_order), false, 18), new ProfileBottomModalAction.ViewOrder(localOrder)));
                    it3 = it4;
                    z8 = z4;
                    locationMenu = locationMenu72;
                }
                locationMenu2 = locationMenu;
                z3 = z8;
                createListBuilder.addAll(arrayList2);
            }
            ProfileBottomModalAction.ViewCart viewCart = ProfileBottomModalAction.ViewCart.INSTANCE;
            if (i15 <= 0 || localMoney3 == null) {
                str = null;
                if (localBottomModalViewModel != null) {
                    createListBuilder.add(new ProfileBottomModal(localBottomModalViewModel, viewCart));
                } else if (localBottomModalViewModel2 != null) {
                    createListBuilder.add(new ProfileBottomModal(localBottomModalViewModel2, ProfileBottomModalAction.StartOrder.INSTANCE));
                }
            } else {
                str = null;
                createListBuilder.add(new ProfileBottomModal(new LocalBottomModalViewModel(true, null, new LocalBottomModalViewModel.Payload.ItemInfo(androidStringManager.getString(new FormattedResource(R.string.local_presenters_items, NavAction$$ExternalSyntheticOutline0.m(1, Integer.valueOf(i15), "count"))), LocalsKt.prettyPrint$default(localMoney3, false, null, 7), localMoney2 != null ? LocalsKt.prettyPrint$default(localMoney2, false, null, 7) : null, Long.valueOf(localMoney3.getAmount())), androidStringManager.get(R.string.local_presenters_view_cart), false, 16), viewCart));
            }
            rememberedValue41 = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
            gapComposer4.updateRememberedValue(rememberedValue41);
        } else {
            locationMenu2 = locationMenu;
            state8 = state5;
            z3 = z8;
            str = null;
        }
        List list5 = (List) rememberedValue41;
        boolean changed17 = gapComposer4.changed(list5);
        Object rememberedValue42 = gapComposer4.rememberedValue();
        Object obj8 = rememberedValue42;
        if (changed17 || rememberedValue42 == obj5) {
            List list6 = list5;
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
            Iterator it6 = list6.iterator();
            while (it6.hasNext()) {
                arrayList3.add(((ProfileBottomModal) it6.next()).getModel());
            }
            gapComposer4.updateRememberedValue(arrayList3);
            obj8 = arrayList3;
        }
        List list7 = (List) obj8;
        MarketingMessageOfferDetails offer = localBrandProfileScreen.getOffer();
        String m1255getOfferTokenjCLHVJg = offer != null ? offer.m1255getOfferTokenjCLHVJg() : str;
        Object[] objArr10 = {m1255getOfferTokenjCLHVJg != null ? OfferToken.m1278boximpl(m1255getOfferTokenjCLHVJg) : str};
        Object rememberedValue43 = gapComposer4.rememberedValue();
        if (rememberedValue43 == obj5) {
            rememberedValue43 = new LocalMapKt$$ExternalSyntheticLambda3(1);
            gapComposer4.updateRememberedValue(rememberedValue43);
        }
        final MutableState mutableState38 = (MutableState) SaverKt.rememberSaveable(objArr10, (Function0) rememberedValue43, gapComposer4, 48);
        GetBuyerInfoResponse.BuyerInfo buyerInfo = (GetBuyerInfoResponse.BuyerInfo) mutableState17.getValue();
        String offerToken = DiscountCodeKt.getOfferToken(realCartBuilder.discountCodes);
        boolean changed18 = gapComposer4.changed(buyerInfo) | gapComposer4.changed(offerToken != null ? OfferToken.m1278boximpl(offerToken) : str) | gapComposer4.changed(list7);
        Object rememberedValue44 = gapComposer4.rememberedValue();
        if (changed18 || rememberedValue44 == obj5) {
            state9 = state23;
            brandFollowViewModel4 = brandFollowViewModel3;
            z7 = z3;
            list = list7;
            mutableState18 = mutableState21;
            rememberedValue44 = Updater.derivedStateOf(new HeroCardViewKt$$ExternalSyntheticLambda4(offer, list7, mutableState28, mutableState21, mutableState17, state20, collectAsState2, 1));
            gapComposer4.updateRememberedValue(rememberedValue44);
        } else {
            list = list7;
            state9 = state23;
            mutableState18 = mutableState21;
            brandFollowViewModel4 = brandFollowViewModel3;
            z7 = z3;
        }
        final State state24 = (State) rememberedValue44;
        LocalBrandBannerModel localBrandBannerModel = (LocalBrandBannerModel) state24.getValue();
        if (localBrandBannerModel != null) {
            gapComposer4.startReplaceGroup(-1106477359);
            i2 = -1106477359;
            ?? r2 = str;
            state10 = state3;
            gapComposer2 = gapComposer4;
            zzmh zzmhVar = new zzmh(localBrandBannerModel, (Continuation) r2, (Object) this, state10, 6);
            r0 = r2;
            Updater.LaunchedEffect(gapComposer2, localBrandBannerModel, zzmhVar);
            gapComposer2.endReplaceGroup();
        } else {
            r0 = str;
            state10 = state3;
            i2 = -1106477359;
            gapComposer2 = gapComposer4;
            gapComposer2.startReplaceGroup(-1106436997);
            gapComposer2.endReplaceGroup();
        }
        Object[] objArr11 = new Object[0];
        LocationMenu locationMenu8 = locationMenu2;
        boolean changedInstance7 = gapComposer2.changedInstance(locationMenu8);
        Object rememberedValue45 = gapComposer2.rememberedValue();
        if (changedInstance7 || rememberedValue45 == obj5) {
            rememberedValue45 = new LocationMenu$$ExternalSyntheticLambda3(locationMenu8, 1);
            gapComposer2.updateRememberedValue(rememberedValue45);
        }
        MutableState mutableState39 = (MutableState) SaverKt.rememberSaveable(objArr11, (Function0) rememberedValue45, gapComposer2, 0);
        if (((LocationMenu.Menu) mutableState39.getValue()) == null) {
            gapComposer2.startReplaceGroup(-1868520797);
            List menus = locationMenu8 != null ? locationMenu8.getMenus() : r0;
            if (menus != null) {
                gapComposer2.startReplaceGroup(i2);
                Updater.LaunchedEffect(gapComposer2, menus, new AnimatedImageDecoder$wrapDrawable$2(menus, r0, mutableState39));
                gapComposer2.endReplaceGroup();
            } else {
                gapComposer2.startReplaceGroup(-1106436997);
                gapComposer2.endReplaceGroup();
            }
            gapComposer2.endReplaceGroup();
        } else {
            gapComposer2.startReplaceGroup(-1868395867);
            gapComposer2.endReplaceGroup();
        }
        boolean changed19 = gapComposer2.changed(mutableState39);
        Object rememberedValue46 = gapComposer2.rememberedValue();
        if (changed19 || rememberedValue46 == obj5) {
            rememberedValue46 = new HeroTagViewKt$$ExternalSyntheticLambda12(4, mutableState39);
            gapComposer2.updateRememberedValue(rememberedValue46);
        }
        Function2 function22 = (Function2) rememberedValue46;
        AnswerDispatcher answerDispatcher2 = (AnswerDispatcher) gapComposer2.consume(AnswersKt.getLocalAnswerDispatcher());
        boolean changed20 = gapComposer2.changed(function22) | gapComposer2.changedInstance(answerDispatcher2);
        Object rememberedValue47 = gapComposer2.rememberedValue();
        int i17 = 9;
        if (changed20 || rememberedValue47 == obj5) {
            rememberedValue47 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function22, answerDispatcher2, i17);
            gapComposer2.updateRememberedValue(rememberedValue47);
        }
        Updater.DisposableEffect(answerDispatcher2, (Function1) rememberedValue47, gapComposer2);
        Location.LocationDetail models$lambda$704 = models$lambda$70(state6);
        String str11 = models$lambda$7(state10).locationToken;
        boolean changed21 = gapComposer2.changed(mutableState38);
        Object rememberedValue48 = gapComposer2.rememberedValue();
        if (changed21 || rememberedValue48 == obj5) {
            rememberedValue48 = new TooltipKt$$ExternalSyntheticLambda1(18, mutableState38);
            gapComposer2.updateRememberedValue(rememberedValue48);
        }
        final MutableState mutableState40 = mutableState39;
        GapComposer gapComposer5 = gapComposer2;
        m1217HandleMarketingMessageOffergc3wzeA(realCartBuilder, models$lambda$704, str11, (Function0) rememberedValue48, gapComposer5, 57344 & (i << 9));
        Object[] objArr12 = new Object[0];
        Object rememberedValue49 = gapComposer5.rememberedValue();
        if (rememberedValue49 == obj5) {
            rememberedValue49 = new AvatarViewModel$$ExternalSyntheticLambda0(21);
            gapComposer5.updateRememberedValue(rememberedValue49);
        }
        final MutableState mutableState41 = (MutableState) SaverKt.rememberSaveable(objArr12, (Function0) rememberedValue49, gapComposer5, 48);
        String inStoreOrderingSessionId = models$lambda$34(state8).getInStoreOrderingSessionId();
        if (inStoreOrderingSessionId == null) {
            inStoreOrderingSessionId = models$lambda$34(state8).getInStoreOrderingToken();
        }
        RealLocalBrandProfileCheckedInSheetTracker realLocalBrandProfileCheckedInSheetTracker = this.checkedInSheetTracker;
        boolean z9 = inStoreOrderingSessionId != null && realLocalBrandProfileCheckedInSheetTracker.wasHandled(inStoreOrderingSessionId);
        boolean changed22 = gapComposer5.changed(inStoreOrderingSessionId);
        Object rememberedValue50 = gapComposer5.rememberedValue();
        if (changed22 || rememberedValue50 == obj5) {
            rememberedValue50 = new AndroidPermissionChecker$create$1$denied$$inlined$filter$1(realLocalBrandProfileCheckedInSheetTracker.getHandledSessionIds(), inStoreOrderingSessionId, 1);
            gapComposer5.updateRememberedValue(rememberedValue50);
        }
        Boolean valueOf3 = Boolean.valueOf(z9);
        String str12 = inStoreOrderingSessionId;
        final MutableState collectAsState7 = Updater.collectAsState((Flow) rememberedValue50, valueOf3, null, gapComposer5, 0, 2);
        Location.LocationDetail models$lambda$705 = models$lambda$70(state6);
        BrandSpot models$lambda$122 = models$lambda$12(state9);
        boolean changed23 = gapComposer5.changed(mutableState38);
        Object rememberedValue51 = gapComposer5.rememberedValue();
        if (changed23 || rememberedValue51 == obj5) {
            rememberedValue51 = new TooltipKt$$ExternalSyntheticLambda1(19, mutableState38);
            gapComposer5.updateRememberedValue(rememberedValue51);
        }
        Function0 function0 = (Function0) rememberedValue51;
        boolean changed24 = gapComposer5.changed(mutableState41);
        Object rememberedValue52 = gapComposer5.rememberedValue();
        if (changed24 || rememberedValue52 == obj5) {
            i3 = 10;
            rememberedValue52 = new DateInputKt$$ExternalSyntheticLambda5(i3, mutableState41);
            gapComposer5.updateRememberedValue(rememberedValue52);
        } else {
            i3 = 10;
        }
        HandleCouponCode(realCartBuilder, models$lambda$705, models$lambda$122, function0, (Function1) rememberedValue52, gapComposer5, (i << 12) & 458752);
        Object[] objArr13 = new Object[0];
        Object rememberedValue53 = gapComposer5.rememberedValue();
        if (rememberedValue53 == obj5) {
            rememberedValue53 = new AvatarViewModel$$ExternalSyntheticLambda0(22);
            gapComposer5.updateRememberedValue(rememberedValue53);
        }
        final MutableState mutableState42 = (MutableState) SaverKt.rememberSaveable(objArr13, (Function0) rememberedValue53, gapComposer5, 48);
        boolean changed25 = gapComposer5.changed(models$lambda$70(state6)) | gapComposer5.changed(list) | gapComposer5.changed((LocalBrandBannerModel) state24.getValue()) | gapComposer5.changed((LocationMenu.Menu) mutableState40.getValue()) | gapComposer5.changed(models$lambda$16(mutableState2)) | gapComposer5.changed(((Boolean) mutableState38.getValue()).booleanValue()) | gapComposer5.changed(models$lambda$100(mutableState41)) | gapComposer5.changed(models$lambda$107(mutableState42).ordinal()) | gapComposer5.changed(brandFollowViewModel4) | gapComposer5.changed(z7) | gapComposer5.changed(models$lambda$34(state8));
        Object rememberedValue54 = gapComposer5.rememberedValue();
        if (changed25 || rememberedValue54 == obj5) {
            list2 = list5;
            final BrandFollowViewModel brandFollowViewModel7 = brandFollowViewModel4;
            final boolean z10 = z7;
            obj2 = obj5;
            final List list8 = list;
            final MutableState mutableState43 = mutableState10;
            final MutableState mutableState44 = mutableState2;
            mutableState19 = mutableState7;
            final State state25 = state6;
            state11 = state8;
            final State state26 = state2;
            Function0 function02 = new Function0() { // from class: app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter$$ExternalSyntheticLambda19
                /* JADX WARN: Code restructure failed: missing block: B:210:0x093d, code lost:
                
                    if (r4.summary.deliveryFulfillmentSchedulingEnabled == true) goto L442;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:211:0x093f, code lost:
                
                    r40 = r13;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:216:0x094d, code lost:
                
                    if (r4.summary.pickupFulfillmentSchedulingEnabled == true) goto L442;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:103:0x0776  */
                /* JADX WARN: Removed duplicated region for block: B:108:0x07ce  */
                /* JADX WARN: Removed duplicated region for block: B:114:0x07f0  */
                /* JADX WARN: Removed duplicated region for block: B:118:0x07fc A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:131:0x08e0  */
                /* JADX WARN: Removed duplicated region for block: B:135:0x08f1  */
                /* JADX WARN: Removed duplicated region for block: B:138:0x0900  */
                /* JADX WARN: Removed duplicated region for block: B:151:0x097c  */
                /* JADX WARN: Removed duplicated region for block: B:155:0x09c0  */
                /* JADX WARN: Removed duplicated region for block: B:158:0x09cb  */
                /* JADX WARN: Removed duplicated region for block: B:163:0x09ec  */
                /* JADX WARN: Removed duplicated region for block: B:169:0x09fc  */
                /* JADX WARN: Removed duplicated region for block: B:182:0x0a5b A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:192:0x09e7  */
                /* JADX WARN: Removed duplicated region for block: B:193:0x09c3  */
                /* JADX WARN: Removed duplicated region for block: B:194:0x0987  */
                /* JADX WARN: Removed duplicated region for block: B:201:0x0968  */
                /* JADX WARN: Removed duplicated region for block: B:206:0x0932  */
                /* JADX WARN: Removed duplicated region for block: B:224:0x0910  */
                /* JADX WARN: Removed duplicated region for block: B:235:0x08f5  */
                /* JADX WARN: Removed duplicated region for block: B:236:0x08e4  */
                /* JADX WARN: Removed duplicated region for block: B:242:0x0826  */
                /* JADX WARN: Removed duplicated region for block: B:257:0x0893  */
                /* JADX WARN: Removed duplicated region for block: B:275:0x0860  */
                /* JADX WARN: Removed duplicated region for block: B:295:0x07e0  */
                /* JADX WARN: Removed duplicated region for block: B:305:0x06a7  */
                /* JADX WARN: Removed duplicated region for block: B:373:0x0617 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:375:? A[LOOP:7: B:363:0x05ef->B:375:?, LOOP_END, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:62:0x062b  */
                /* JADX WARN: Removed duplicated region for block: B:93:0x06a3  */
                /* JADX WARN: Removed duplicated region for block: B:95:0x072c  */
                /* JADX WARN: Removed duplicated region for block: B:99:0x0751  */
                /* JADX WARN: Type inference failed for: r14v26, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r40v0 */
                /* JADX WARN: Type inference failed for: r40v1 */
                /* JADX WARN: Type inference failed for: r40v2, types: [app.cash.local.viewmodels.LocalBrandLocationMenuCarouselContentModel$Entry] */
                /* JADX WARN: Type inference failed for: r40v3, types: [app.cash.local.viewmodels.LocalBrandProfileSectionViewModel] */
                /* JADX WARN: Type inference failed for: r40v7 */
                /* JADX WARN: Type inference failed for: r6v5, types: [app.cash.local.primitives.LocationMenu] */
                /* JADX WARN: Type inference failed for: r6v7 */
                /* JADX WARN: Type inference failed for: r6v90 */
                @Override // kotlin.jvm.functions.Function0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke() {
                    LocalImage localImage2;
                    boolean z11;
                    FulfillmentConfiguration fulfillmentConfiguration2;
                    ZoneId zoneId;
                    ResolvedCustomerProfile resolvedCustomerProfile;
                    Resources resources;
                    Location.LocationDetail locationDetail;
                    LocationStatus status;
                    LocalBrandProfileContentFactory localBrandProfileContentFactory;
                    Brand brand;
                    String str13;
                    LocalBrand.FulfillmentSelection fulfillmentSelection;
                    boolean z12;
                    List list9;
                    EmptyList emptyList2;
                    ?? r40;
                    LocationMenu locationMenu9;
                    Object obj9;
                    Iterator it7;
                    LocalMenuAvailability localMenuAvailability;
                    String priceRangeAsString;
                    LocalMenuItemDeal localMenuItemDeal;
                    LocalMenuAvailability localMenuAvailability2;
                    String str14;
                    MenuItemAvailability available;
                    ZoneId entry;
                    LocalMenuItemDeal$Deal$AdjustedPrice localMenuItemDeal$Deal$AdjustedPrice;
                    LocalMenuItemDealAdjustedPrice localMenuItemDealAdjustedPrice;
                    com.squareup.protos.cash.local.client.v1.LocalMoney localMoney4;
                    LocalBrandProfileSectionViewModel localBrandProfileSectionViewModel;
                    MarketingMessageBadge marketingMessageBadge;
                    MarketingMessageBadge marketingMessageBadge2;
                    LocalBrandProfileSectionViewModel localBrandProfileSectionViewModel2;
                    LocalBrandProfileSectionViewModel localBrandProfileSectionViewModel3;
                    Object obj10;
                    LocalBrandProfileSectionViewModel localBrandProfileSectionViewModel4;
                    int i18;
                    LocalBrandProfileSectionViewModel localBrandProfileSectionViewModel5;
                    String str15;
                    LocalBrandProfileSectionViewModel localBrandProfileSectionViewModel6;
                    FulfillmentConfiguration fulfillmentConfiguration3;
                    String str16;
                    FulfillmentConfiguration.InStore asInStore;
                    LocalFulfillment.InStoreDetails inStoreDetails;
                    LocalBrandProfileViewModel.Fulfillment fulfillment2;
                    LocalAddress localAddress;
                    LocalBrand.FulfillmentSelection fulfillmentSelection2;
                    Brand brand2;
                    String str17;
                    String str18;
                    String str19;
                    LocalAddress localAddress2;
                    boolean z13;
                    boolean z14;
                    List list10;
                    boolean z15;
                    String str20;
                    MapDecisionSheetModel mapDecisionSheetModel;
                    ToastData toastData;
                    MenuHours menuHours;
                    String str21;
                    int i19;
                    LocalFulfillment.InStoreDetails inStoreDetails2;
                    LocalAddress localAddress3;
                    LocalPhone localPhone;
                    Integer num2;
                    LocalBrandProfileViewModel.LoyaltyModel.Tier tier;
                    Integer num3;
                    Integer num4;
                    Object obj11;
                    LocalBrandProfileSectionViewModel localBrandProfileSectionViewModel7;
                    boolean equals;
                    LocalOpenHours.HoursForDay.Day day;
                    String str22;
                    Image image2;
                    LocalBrandProfileContentFactory localBrandProfileContentFactory2 = LocalBrandProfilePresenter.this.contentFactory;
                    Brand brand3 = (Brand) state20.getValue();
                    Location.LocationDetail locationDetail2 = (Location.LocationDetail) state25.getValue();
                    LocationMenu.Menu menu = (LocationMenu.Menu) mutableState40.getValue();
                    boolean z16 = ((BrandSpotSyncTokens) state11.getValue()).inStoreOrderingToken != null;
                    boolean booleanValue2 = ((Boolean) mutableState43.getValue()).booleanValue();
                    List list11 = (List) state22.getValue();
                    LocalCard localCard4 = (LocalCard) state26.getValue();
                    if (localCard4 == null || (image2 = localCard4.artwork_image) == null) {
                        localImage2 = null;
                    } else {
                        String str23 = image2.light_url;
                        str23.getClass();
                        String str24 = image2.dark_url;
                        str24.getClass();
                        localImage2 = new LocalImage(str23, str24, (Long) null, (Long) null, (LocalColor) null, 60);
                    }
                    LocalBrandBannerModel localBrandBannerModel2 = (LocalBrandBannerModel) state24.getValue();
                    FulfillmentConfiguration fulfillmentConfiguration4 = (FulfillmentConfiguration) mutableState19.getValue();
                    State state27 = collectAsState3;
                    boolean z17 = (((ResolvedCustomerProfile) state27.getValue()) == null || ((Boolean) collectAsState7.getValue()).booleanValue()) ? false : true;
                    ResolvedCustomerProfile resolvedCustomerProfile2 = (ResolvedCustomerProfile) state27.getValue();
                    List list12 = (List) mutableState44.getValue();
                    boolean booleanValue3 = ((Boolean) mutableState38.getValue()).booleanValue();
                    String str25 = (String) mutableState41.getValue();
                    LocalFulfillmentType localFulfillmentType3 = (LocalFulfillmentType) mutableState42.getValue();
                    brand3.getClass();
                    list11.getClass();
                    List list13 = list8;
                    list13.getClass();
                    list12.getClass();
                    localFulfillmentType3.getClass();
                    AndroidClock androidClock = localBrandProfileContentFactory2.clock;
                    AndroidStringManager androidStringManager2 = localBrandProfileContentFactory2.stringManager;
                    LocalBrand.FulfillmentSelection fulfillmentSelection3 = brand3.fulfillmentSelection;
                    String str26 = brand3.description;
                    Resources resources2 = androidStringManager2.resources;
                    String str27 = brand3.category;
                    if (locationDetail2 == null) {
                        status = new LocationStatus.Unknown(str27);
                        resolvedCustomerProfile = resolvedCustomerProfile2;
                        z11 = z16;
                        fulfillmentConfiguration2 = fulfillmentConfiguration4;
                        zoneId = null;
                        locationDetail = locationDetail2;
                        resources = resources2;
                    } else {
                        z11 = z16;
                        fulfillmentConfiguration2 = fulfillmentConfiguration4;
                        zoneId = null;
                        resolvedCustomerProfile = resolvedCustomerProfile2;
                        resources = resources2;
                        locationDetail = locationDetail2;
                        status = LocationsKt.status(locationDetail, null, str27, brand3.estimatedPickupWaitTime, androidClock, androidStringManager2, localFulfillmentType3);
                    }
                    ZoneId zoneId2 = locationDetail != null ? locationDetail.summary.zoneId : zoneId;
                    Object openState = locationDetail != null ? locationDetail.summary.openState(localFulfillmentType3) : zoneId;
                    ZoneId zoneId3 = zoneId;
                    String str28 = "";
                    if ((openState instanceof Location.OpenState.Unspecified) || openState == null || (openState instanceof Location.OpenState.Open24Hours) || (openState instanceof Location.OpenState.Closed)) {
                        localBrandProfileContentFactory = localBrandProfileContentFactory2;
                        brand = brand3;
                        str13 = str26;
                        fulfillmentSelection = fulfillmentSelection3;
                        z12 = booleanValue2;
                        list9 = list11;
                        emptyList2 = EmptyList.INSTANCE;
                    } else {
                        if (!(openState instanceof Location.OpenState.Hours)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return zoneId3;
                        }
                        if (zoneId2 == null) {
                            emptyList2 = EmptyList.INSTANCE;
                            localBrandProfileContentFactory = localBrandProfileContentFactory2;
                            brand = brand3;
                            str13 = str26;
                            fulfillmentSelection = fulfillmentSelection3;
                            z12 = booleanValue2;
                            list9 = list11;
                        } else {
                            DayOfWeek dayOfWeek = DimensionKt.now(androidClock).atZone(zoneId2).getDayOfWeek();
                            switch (dayOfWeek == null ? -1 : LocalBrandProfileContentFactory.WhenMappings.$EnumSwitchMapping$0[dayOfWeek.ordinal()]) {
                                case 1:
                                    day = LocalOpenHours.HoursForDay.Day.DAY_MONDAY;
                                    break;
                                case 2:
                                    day = LocalOpenHours.HoursForDay.Day.DAY_TUESDAY;
                                    break;
                                case 3:
                                    day = LocalOpenHours.HoursForDay.Day.DAY_WEDNESDAY;
                                    break;
                                case 4:
                                    day = LocalOpenHours.HoursForDay.Day.DAY_THURSDAY;
                                    break;
                                case 5:
                                    day = LocalOpenHours.HoursForDay.Day.DAY_FRIDAY;
                                    break;
                                case 6:
                                    day = LocalOpenHours.HoursForDay.Day.DAY_SATURDAY;
                                    break;
                                case 7:
                                    day = LocalOpenHours.HoursForDay.Day.DAY_SUNDAY;
                                    break;
                                default:
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return zoneId3;
                            }
                            List<LocalOpenHours.HoursForDay> list14 = ((Location.OpenState.Hours) openState).openHours.hours_for_days;
                            z12 = booleanValue2;
                            list9 = list11;
                            ?? arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list14, 10));
                            Iterator it8 = list14.iterator();
                            while (it8.hasNext()) {
                                LocalOpenHours.HoursForDay hoursForDay = (LocalOpenHours.HoursForDay) it8.next();
                                LocalOpenHours.HoursForDay.Day day2 = hoursForDay.day;
                                switch (day2 == null ? -1 : LocalBrandProfileContentFactory.WhenMappings.$EnumSwitchMapping$1[day2.ordinal()]) {
                                    case -1:
                                    case 1:
                                        a$$ExternalSyntheticBUOutline0.m$1("DAY_UNSPECIFIED");
                                        return zoneId3;
                                    case 0:
                                    default:
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return zoneId3;
                                    case 2:
                                        str22 = androidStringManager2.get(R.string.local_presenters_monday);
                                        break;
                                    case 3:
                                        str22 = androidStringManager2.get(R.string.local_presenters_tuesday);
                                        break;
                                    case 4:
                                        str22 = androidStringManager2.get(R.string.local_presenters_wednesday);
                                        break;
                                    case 5:
                                        str22 = androidStringManager2.get(R.string.local_presenters_thursday);
                                        break;
                                    case 6:
                                        str22 = androidStringManager2.get(R.string.local_presenters_friday);
                                        break;
                                    case 7:
                                        str22 = androidStringManager2.get(R.string.local_presenters_saturday);
                                        break;
                                    case 8:
                                        str22 = androidStringManager2.get(R.string.local_presenters_sunday);
                                        break;
                                }
                                Iterator it9 = it8;
                                String str29 = hoursForDay.exceptional_hours_title;
                                Brand brand4 = brand3;
                                List<LocalOpenHours.HoursForDay.Range> list15 = hoursForDay.ranges;
                                LocalBrand.FulfillmentSelection fulfillmentSelection4 = fulfillmentSelection3;
                                LocalBrandProfileContentFactory localBrandProfileContentFactory3 = localBrandProfileContentFactory2;
                                String str30 = str26;
                                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list15, 10));
                                Iterator it10 = list15.iterator();
                                while (it10.hasNext()) {
                                    LocalOpenHours.HoursForDay.Range range = (LocalOpenHours.HoursForDay.Range) it10.next();
                                    DateTimeFormatter dateTimeFormatter = DateTimesKt.hourOnlyPatternNoAmPm;
                                    range.getClass();
                                    Long l = range.opening_time;
                                    l.getClass();
                                    Instant ofEpochMilli = Instant.ofEpochMilli(l.longValue());
                                    ofEpochMilli.getClass();
                                    LocalTime localTime = ZonedDateTime.ofInstant(ofEpochMilli, zoneId2).toLocalTime();
                                    localTime.getClass();
                                    Long l2 = range.closing_time;
                                    l2.getClass();
                                    Instant ofEpochMilli2 = Instant.ofEpochMilli(l2.longValue());
                                    ofEpochMilli2.getClass();
                                    LocalTime localTime2 = ZonedDateTime.ofInstant(ofEpochMilli2, zoneId2).toLocalTime();
                                    localTime2.getClass();
                                    Iterator it11 = it10;
                                    DateTimeFormatter dateTimeFormatter2 = DateTimesKt.hourOnlyPattern;
                                    String format2 = localTime.format(dateTimeFormatter2);
                                    format2.getClass();
                                    String replace$default = StringsKt__StringsJVMKt.replace$default(format2, ":00", "");
                                    String format3 = localTime2.format(dateTimeFormatter2);
                                    format3.getClass();
                                    arrayList5.add(replace$default + " – " + StringsKt__StringsJVMKt.replace$default(format3, ":00", ""));
                                    it10 = it11;
                                    zoneId2 = zoneId2;
                                }
                                ZoneId zoneId4 = zoneId2;
                                boolean isEmpty = arrayList5.isEmpty();
                                Collection collection = arrayList5;
                                if (isEmpty) {
                                    collection = CollectionsKt__CollectionsJVMKt.listOf(androidStringManager2.get(R.string.local_presenters_status_closed));
                                }
                                arrayList4.add(new LocalBrandLocationHoursContentModel.Entry(str22, str29, (List) collection, hoursForDay.day == day));
                                it8 = it9;
                                brand3 = brand4;
                                fulfillmentSelection3 = fulfillmentSelection4;
                                localBrandProfileContentFactory2 = localBrandProfileContentFactory3;
                                str26 = str30;
                                zoneId2 = zoneId4;
                            }
                            localBrandProfileContentFactory = localBrandProfileContentFactory2;
                            brand = brand3;
                            str13 = str26;
                            fulfillmentSelection = fulfillmentSelection3;
                            emptyList2 = arrayList4;
                        }
                    }
                    if (list9.isEmpty()) {
                        r40 = zoneId3;
                    } else {
                        if (locationDetail != null && (locationMenu9 = locationDetail.menu) != null) {
                            boolean isEmpty2 = locationMenu9.menuItems.isEmpty();
                            ?? r62 = locationMenu9;
                            if (isEmpty2) {
                                r62 = zoneId3;
                            }
                            if (r62 != 0) {
                                Actions actions = locationDetail.actions;
                                actions.getClass();
                                List list16 = actions.reorderablePastSelections;
                                ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list16, 10));
                                Iterator it12 = list16.iterator();
                                while (it12.hasNext()) {
                                    arrayList6.add(SelectionKt.toSelection((LocalCart.Line.Selection) it12.next()));
                                }
                                ArrayList arrayList7 = new ArrayList();
                                Iterator it13 = arrayList6.iterator();
                                while (it13.hasNext()) {
                                    Selection selection = (Selection) it13.next();
                                    String str31 = selection.menuItemToken;
                                    String str32 = selection.menuItemVariationToken;
                                    MenuItem m1244menuItemOrNullGvMOdU0 = r62.m1244menuItemOrNullGvMOdU0(str31);
                                    if (m1244menuItemOrNullGvMOdU0 != null && MenuHoursKt.isNullOrAvailableNow(m1244menuItemOrNullGvMOdU0.menuHours)) {
                                        Iterator it14 = m1244menuItemOrNullGvMOdU0.variations.iterator();
                                        while (true) {
                                            if (it14.hasNext()) {
                                                obj9 = it14.next();
                                                if (str32 == null ? false : Intrinsics.areEqual(((MenuItemVariation) obj9).token, str32)) {
                                                }
                                            } else {
                                                obj9 = zoneId3;
                                            }
                                        }
                                        MenuItemVariation menuItemVariation = (MenuItemVariation) obj9;
                                        if (menuItemVariation != null) {
                                            LocalMenuAvailability localMenuAvailability3 = menuItemVariation.availability;
                                            it7 = it13;
                                            priceRangeAsString = LocalsKt.prettyPrint$default(menuItemVariation.price, false, zoneId3, 7);
                                            localMenuItemDeal = menuItemVariation.deal;
                                            localMenuAvailability = localMenuAvailability3;
                                        } else {
                                            it7 = it13;
                                            localMenuAvailability = m1244menuItemOrNullGvMOdU0.availability;
                                            priceRangeAsString = LocalMenuItemsKt.priceRangeAsString(m1244menuItemOrNullGvMOdU0, r62.m1248modifierListsForMenuItemGvMOdU0(m1244menuItemOrNullGvMOdU0.token));
                                            localMenuItemDeal = m1244menuItemOrNullGvMOdU0.deal;
                                        }
                                        if (localMenuItemDeal == null || (localMenuItemDeal$Deal$AdjustedPrice = localMenuItemDeal.deal) == null || (localMenuItemDealAdjustedPrice = localMenuItemDeal$Deal$AdjustedPrice.value) == null || (localMoney4 = localMenuItemDealAdjustedPrice.original_price) == null) {
                                            localMenuAvailability2 = localMenuAvailability;
                                            str14 = null;
                                        } else {
                                            localMenuAvailability2 = localMenuAvailability;
                                            str14 = LocalsKt.prettyPrint$default(LocalMoneyKt.toMoney(localMoney4), false, null, 7);
                                        }
                                        int ordinal = localMenuAvailability2.ordinal();
                                        if (ordinal == 0 || ordinal == 1) {
                                            available = new MenuItemAvailability.Available(priceRangeAsString, str14);
                                        } else {
                                            if (ordinal != 2) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                            available = MenuItemAvailability.SoldOut.INSTANCE;
                                        }
                                        entry = new LocalBrandLocationMenuCarouselContentModel.Entry(str31, m1244menuItemOrNullGvMOdU0.image, m1244menuItemOrNullGvMOdU0.name, available, LocalMenuItemsKt.discountText(m1244menuItemOrNullGvMOdU0, r62.discountSummaries), m1244menuItemOrNullGvMOdU0.preorderingSummary != null);
                                    } else {
                                        it7 = it13;
                                        entry = zoneId3;
                                    }
                                    if (entry != null) {
                                        arrayList7.add(entry);
                                    }
                                    it13 = it7;
                                    zoneId3 = null;
                                }
                                if (!arrayList7.isEmpty()) {
                                    r40 = new LocalBrandProfileSectionViewModel(androidStringManager2.get(R.string.local_presenters_order_again), new LocalBrandLocationMenuCarouselContentModel(arrayList7));
                                }
                            }
                        }
                        r40 = 0;
                    }
                    if (list12.isEmpty()) {
                        localBrandProfileSectionViewModel = null;
                    } else {
                        List<MarketingMessageData> take2 = CollectionsKt.take(list12, 2);
                        ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(take2, 10));
                        for (MarketingMessageData marketingMessageData : take2) {
                            String str33 = marketingMessageData.messageToken;
                            LocalImage localImage3 = marketingMessageData.image;
                            String str34 = marketingMessageData.message;
                            MarketingMessageOfferDetails marketingMessageOfferDetails = marketingMessageData.offerDetails;
                            MarketingMessageData.Badge badge = marketingMessageData.badge;
                            if ((marketingMessageOfferDetails != null ? marketingMessageOfferDetails.status : null) == Offer.OfferStatus.OFFER_STATUS_REDEEMED) {
                                marketingMessageBadge = new MarketingMessageBadge(androidStringManager2.get(R.string.local_presenters_marketing_message_redeemed), badge != null ? badge.isViewed : true);
                            } else if (badge == null) {
                                marketingMessageBadge2 = null;
                                arrayList8.add(new LocalBrandLocationMarketingMessagesContentModel.Entry(str33, localImage3, str34, marketingMessageBadge2, marketingMessageData.backgroundColor));
                            } else {
                                marketingMessageBadge = new MarketingMessageBadge(badge.text, badge.isViewed);
                            }
                            marketingMessageBadge2 = marketingMessageBadge;
                            arrayList8.add(new LocalBrandLocationMarketingMessagesContentModel.Entry(str33, localImage3, str34, marketingMessageBadge2, marketingMessageData.backgroundColor));
                        }
                        localBrandProfileSectionViewModel = new LocalBrandProfileSectionViewModel(null, new LocalBrandLocationMarketingMessagesContentModel(arrayList8, list12.size() > 2));
                    }
                    LocationMenu locationMenu10 = locationDetail != null ? locationDetail.menu : null;
                    if (locationMenu10 != null) {
                        List list17 = locationMenu10.categories;
                        List list18 = locationMenu10.menus;
                        if (!locationMenu10.menuItems.isEmpty()) {
                            if (list18.isEmpty()) {
                                String str35 = locationMenu10.title;
                                if (str35 == null) {
                                    str35 = androidStringManager2.get(R.string.local_presenters_section_title_menu);
                                }
                                ArrayList arrayList9 = new ArrayList();
                                Iterator it15 = list17.iterator();
                                while (it15.hasNext()) {
                                    LocalBrandLocationMenuContentModel.Entry viewModelCategory = ExpandableContentKt.toViewModelCategory((Category) it15.next(), locationMenu10);
                                    if (viewModelCategory != null) {
                                        arrayList9.add(viewModelCategory);
                                    }
                                }
                                localBrandProfileSectionViewModel7 = new LocalBrandProfileSectionViewModel(str35, new LocalBrandLocationMenuContentModel(CollectionsKt__CollectionsJVMKt.listOf(new LocalBrandLocationMenuContentModel.Menu(null, null, str35, arrayList9))));
                            } else {
                                if (list18.size() == 1) {
                                    LocationMenu.Menu menu2 = (LocationMenu.Menu) CollectionsKt.single(list18);
                                    localBrandProfileSectionViewModel2 = new LocalBrandProfileSectionViewModel(menu2.name, new LocalBrandLocationMenuContentModel(CollectionsKt__CollectionsJVMKt.listOf(ExpandableContentKt.toViewModelMenu(menu2, locationMenu10, list17))));
                                    if (locationDetail != null) {
                                        LocalLoyaltyAccount localLoyaltyAccount = locationDetail.loyaltyAccount;
                                        LocalLoyaltyProgram localLoyaltyProgram = locationDetail.loyaltyProgram;
                                        if (localLoyaltyProgram != null) {
                                            String str36 = androidStringManager2.get(R.string.local_presenters_loyalty_section_title);
                                            if (localLoyaltyAccount != null && (num4 = localLoyaltyAccount.balance) != null) {
                                                str28 = LoyaltyKt.pointsText(localLoyaltyProgram, num4.intValue());
                                            }
                                            List<LocalLoyaltyReward> list19 = localLoyaltyProgram.reward_tiers;
                                            ArrayList arrayList10 = new ArrayList();
                                            for (LocalLoyaltyReward localLoyaltyReward : list19) {
                                                String str37 = localLoyaltyReward.name;
                                                if (str37 == null || (num2 = localLoyaltyReward.points) == null) {
                                                    tier = null;
                                                } else {
                                                    int intValue = num2.intValue();
                                                    tier = new LocalBrandProfileViewModel.LoyaltyModel.Tier(str37, LoyaltyKt.pointsText(localLoyaltyProgram, intValue), (localLoyaltyAccount == null || (num3 = localLoyaltyAccount.balance) == null) ? null : Float.valueOf(num3.intValue() / intValue));
                                                }
                                                if (tier != null) {
                                                    arrayList10.add(tier);
                                                }
                                            }
                                            localBrandProfileSectionViewModel3 = new LocalBrandProfileSectionViewModel(null, new LocalBrandProfileViewModel.LoyaltyModel(str36, str28, arrayList10));
                                            if (locationDetail != null) {
                                                localBrandProfileSectionViewModel4 = null;
                                            } else {
                                                Map map = locationDetail.summary.openStates;
                                                ArrayList arrayList11 = new ArrayList(map.size());
                                                Iterator it16 = map.entrySet().iterator();
                                                while (it16.hasNext()) {
                                                    LocalFulfillmentType localFulfillmentType4 = (LocalFulfillmentType) ((Map.Entry) it16.next()).getKey();
                                                    switch (LocalBrandProfileContentFactory.WhenMappings.$EnumSwitchMapping$2[localFulfillmentType4.ordinal()]) {
                                                        case 1:
                                                            i18 = R.string.local_presenters_section_title_hours_pickup;
                                                            break;
                                                        case 2:
                                                            i18 = R.string.local_presenters_section_title_hours_delivery;
                                                            break;
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                            i18 = R.string.local_presenters_section_title_hours;
                                                            break;
                                                        default:
                                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                                            return null;
                                                    }
                                                    arrayList11.add(new LocalBrandLocationHoursContentModel.DropdownOption(androidStringManager2.get(i18), localFulfillmentType4));
                                                }
                                                Iterator it17 = arrayList11.iterator();
                                                while (true) {
                                                    if (it17.hasNext()) {
                                                        obj10 = it17.next();
                                                        if (((LocalBrandLocationHoursContentModel.DropdownOption) obj10).fulfillmentType == localFulfillmentType3) {
                                                        }
                                                    } else {
                                                        obj10 = null;
                                                    }
                                                }
                                                LocalBrandLocationHoursContentModel.DropdownOption dropdownOption = (LocalBrandLocationHoursContentModel.DropdownOption) obj10;
                                                if (dropdownOption == null) {
                                                    dropdownOption = (LocalBrandLocationHoursContentModel.DropdownOption) CollectionsKt.first((List) arrayList11);
                                                }
                                                localBrandProfileSectionViewModel4 = new LocalBrandProfileSectionViewModel(null, new LocalBrandLocationHoursContentModel(arrayList11, dropdownOption, ExpandableContentKt.currentStatusForLocationRow(locationDetail, androidStringManager2, androidClock, localFulfillmentType3), emptyList2));
                                            }
                                            if (locationDetail != null || (localPhone = locationDetail.summary.phone) == null) {
                                                localBrandProfileSectionViewModel5 = null;
                                            } else {
                                                String str38 = androidStringManager2.get(R.string.local_presenters_label_phone);
                                                String str39 = localPhone.formatted;
                                                str39.getClass();
                                                localBrandProfileSectionViewModel5 = new LocalBrandProfileSectionViewModel(null, new LocalBrandLocationPhoneContentModel(str38, str39));
                                            }
                                            if (locationDetail != null || (localAddress3 = locationDetail.summary.address) == null) {
                                                str15 = null;
                                                localBrandProfileSectionViewModel6 = null;
                                            } else {
                                                str15 = null;
                                                localBrandProfileSectionViewModel6 = new LocalBrandProfileSectionViewModel(null, new LocalBrandLocationAddressContentModel(androidStringManager2.get(R.string.local_presenters_label_address), LocalsKt.formattedFull(localAddress3)));
                                            }
                                            LocalBrandProfileSectionViewModel localBrandProfileSectionViewModel8 = (str13 != null || StringsKt.isBlank(str13)) ? null : new LocalBrandProfileSectionViewModel(str15, new LocalBrandDescriptionViewModel(str13));
                                            String str40 = androidStringManager2.get(R.string.local_presenters_cash_app_footer);
                                            LocalBrandProfileContentFactory localBrandProfileContentFactory4 = localBrandProfileContentFactory;
                                            Object[] objArr14 = {localBrandProfileContentFactory4.versionName};
                                            resources.getClass();
                                            Resources resources3 = resources;
                                            String format4 = new MessageFormat(resources3.getString(R.string.local_presenters_version_name)).format(objArr14);
                                            format4.getClass();
                                            List filterNotNull = ArraysKt___ArraysKt.filterNotNull(new LocalBrandProfileSectionViewModel[]{r40, localBrandProfileSectionViewModel, localBrandProfileSectionViewModel2, localBrandProfileSectionViewModel3, localBrandProfileSectionViewModel4, localBrandProfileSectionViewModel5, localBrandProfileSectionViewModel6, localBrandProfileSectionViewModel8, new LocalBrandProfileSectionViewModel(null, new LocalBrandLocationFooterContentModel(str40, format4))});
                                            FulfillmentTimeUtils fulfillmentTimeUtils = localBrandProfileContentFactory4.fulfillmentTimeUtils;
                                            if (locationDetail != null || (inStoreDetails2 = locationDetail.summary.inStoreDetails) == null || (str16 = inStoreDetails2.ordering_station_label) == null) {
                                                fulfillmentConfiguration3 = fulfillmentConfiguration2;
                                                str16 = (fulfillmentConfiguration3 != null || (asInStore = FulfillmentConfigurationKt.getAsInStore(fulfillmentConfiguration3)) == null || (inStoreDetails = asInStore.inStoreDetails) == null) ? null : inStoreDetails.ordering_station_label;
                                            } else {
                                                fulfillmentConfiguration3 = fulfillmentConfiguration2;
                                            }
                                            if (str16 != null || StringsKt.isBlank(str16)) {
                                                str16 = null;
                                            }
                                            FulfillmentConfiguration.Unspecified unspecified = FulfillmentConfiguration.Unspecified.INSTANCE;
                                            if (str16 == null && (z11 || (fulfillmentConfiguration3 instanceof FulfillmentConfiguration.InStore))) {
                                                ResolvedCustomerProfile resolvedCustomerProfile3 = resolvedCustomerProfile;
                                                fulfillment2 = new LocalBrandProfileViewModel.Fulfillment.InStore(str16, resolvedCustomerProfile3 != null ? resolvedCustomerProfile3.photoUrl : null, resolvedCustomerProfile3 != null ? resolvedCustomerProfile3.monogram : null, resolvedCustomerProfile3 != null ? resolvedCustomerProfile3.backgroundColor : null);
                                                brand2 = brand;
                                                fulfillmentSelection2 = fulfillmentSelection;
                                            } else {
                                                if (fulfillmentConfiguration3 instanceof FulfillmentConfiguration.Delivery) {
                                                    if (fulfillmentConfiguration3 instanceof FulfillmentConfiguration.Pickup) {
                                                        if (locationDetail != null && (localAddress = locationDetail.summary.address) != null) {
                                                            String str41 = localAddress.address_single_line;
                                                            if (str41 == null) {
                                                                str41 = localAddress.locality;
                                                                str41.getClass();
                                                            }
                                                            fulfillment2 = new LocalBrandProfileViewModel.Fulfillment.Pickup(str41, fulfillmentTimeUtils.getEstimatedCompletionTime(fulfillmentConfiguration3));
                                                        }
                                                    } else if (!(fulfillmentConfiguration3 instanceof FulfillmentConfiguration.InStore) && !Intrinsics.areEqual(fulfillmentConfiguration3, unspecified) && fulfillmentConfiguration3 != null) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        return null;
                                                    }
                                                    fulfillment2 = null;
                                                } else {
                                                    LocalFulfillment.DeliveryDetails deliveryDetails = ((FulfillmentConfiguration.Delivery) fulfillmentConfiguration3).deliveryDetails;
                                                    if (deliveryDetails == null || (localAddress2 = deliveryDetails.delivery_address) == null || (str18 = localAddress2.address_single_line) == null) {
                                                        str18 = androidStringManager2.get(R.string.local_presenters_confirm_delivery_address);
                                                    }
                                                    LocalText estimatedCompletionTime = fulfillmentTimeUtils.getEstimatedCompletionTime(fulfillmentConfiguration3);
                                                    if (locationDetail == null || (str19 = (String) locationDetail.summary.freeFulfillmentLabels.get(LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DELIVERY)) == null || FulfillmentConfigurationKt.getSchedulingMode(fulfillmentConfiguration3) == LocalFulfillment.SchedulingDetails.SchedulingMode.SCHEDULING_MODE_SCHEDULED) {
                                                        str19 = null;
                                                    }
                                                    fulfillment2 = new LocalBrandProfileViewModel.Fulfillment.Delivery(estimatedCompletionTime, str18, str19);
                                                }
                                                fulfillmentSelection2 = fulfillmentSelection;
                                                if (fulfillment2 == null) {
                                                    List list20 = fulfillmentSelection != null ? fulfillmentSelection2.available_fulfillment_types : null;
                                                    if (list20 == null) {
                                                        list20 = EmptyList.INSTANCE;
                                                    }
                                                    if (list20.size() == 1) {
                                                        switch (LocalBrandProfileContentFactory.WhenMappings.$EnumSwitchMapping$2[((LocalFulfillmentType) CollectionsKt.single(list20)).ordinal()]) {
                                                            case 1:
                                                            case 3:
                                                            case 4:
                                                            case 5:
                                                            case 6:
                                                                str17 = androidStringManager2.get(R.string.local_presenters_choose_location);
                                                                break;
                                                            case 2:
                                                                str17 = androidStringManager2.get(R.string.local_presenters_choose_delivery_address);
                                                                break;
                                                            default:
                                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                return null;
                                                        }
                                                    } else {
                                                        str17 = androidStringManager2.get(R.string.local_presenters_choose_fulfillment);
                                                    }
                                                    fulfillment2 = new LocalBrandProfileViewModel.Fulfillment.Unspecified(str17);
                                                }
                                                brand2 = brand;
                                            }
                                            LocalBrandProfileViewModel.MoreOptionsMenuModel moreOptionsMenuModel = new LocalBrandProfileViewModel.MoreOptionsMenuModel(brandFollowViewModel7, brand2.shareLinkUrl == null);
                                            String str42 = androidStringManager2.get(!(fulfillment2 instanceof LocalBrandProfileViewModel.Fulfillment.Delivery) ? R.string.local_presenters_more_options_change_delivery_address : R.string.local_presenters_more_options_change_location);
                                            boolean z18 = brand2.selectedLocation == null && !(fulfillment2 instanceof LocalBrandProfileViewModel.Fulfillment.InStore);
                                            z13 = fulfillment2 instanceof LocalBrandProfileViewModel.Fulfillment.InStore;
                                            if (!z13) {
                                                if (((fulfillmentSelection2 == null || (list10 = fulfillmentSelection2.available_fulfillment_types) == null) ? 0 : list10.size()) >= 2 || !brand2.nearbyLocations.isEmpty()) {
                                                    z14 = true;
                                                    if (!z13) {
                                                        if (!(fulfillmentConfiguration3 instanceof FulfillmentConfiguration.Delivery)) {
                                                            z15 = true;
                                                            if (fulfillmentConfiguration3 instanceof FulfillmentConfiguration.Pickup) {
                                                                if (locationDetail != null) {
                                                                }
                                                            } else if (!(fulfillmentConfiguration3 instanceof FulfillmentConfiguration.InStore) && !Intrinsics.areEqual(fulfillmentConfiguration3, unspecified) && fulfillmentConfiguration3 != null) {
                                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                return null;
                                                            }
                                                            boolean z19 = false;
                                                        } else if (locationDetail != null) {
                                                            z15 = true;
                                                        }
                                                        boolean z20 = (!z13 && (FulfillmentConfigurationKt.getSchedulingMode(fulfillmentConfiguration3) != LocalFulfillment.SchedulingDetails.SchedulingMode.SCHEDULING_MODE_SCHEDULED || z10)) ? false : z15;
                                                        if (z13) {
                                                            str20 = androidStringManager2.get(R.string.local_presenters_switch_to_takeout);
                                                        } else {
                                                            switch (LocalBrandProfileContentFactory.WhenMappings.$EnumSwitchMapping$2[FulfillmentConfigurationKt.getType(fulfillmentConfiguration3).ordinal()]) {
                                                                case 1:
                                                                case 3:
                                                                    str20 = androidStringManager2.get(R.string.local_presenters_pickup_asap);
                                                                    break;
                                                                case 2:
                                                                    str20 = androidStringManager2.get(R.string.local_presenters_deliver_asap);
                                                                    break;
                                                                case 4:
                                                                case 5:
                                                                case 6:
                                                                    str20 = androidStringManager2.get(R.string.local_presenters_switch_to_takeout);
                                                                    break;
                                                                default:
                                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                    return null;
                                                            }
                                                        }
                                                        LocalBrandProfileViewModel.FulfillmentOptionsMenuModel fulfillmentOptionsMenuModel = new LocalBrandProfileViewModel.FulfillmentOptionsMenuModel(str42, z18, z14, z13, z19, z20, str20);
                                                        String str43 = brand2.token;
                                                        String str44 = brand2.name;
                                                        String str45 = brand2.cashtag;
                                                        LocalImage localImage4 = brand2.artworkImage;
                                                        LocalImage localImage5 = localImage4 == null ? localImage2 : localImage4;
                                                        String str46 = brand2.description;
                                                        LocalColor localColor2 = brand2.backgroundColor;
                                                        if (z12) {
                                                            locationDetail.getClass();
                                                            LocalAddress localAddress4 = locationDetail.summary.address;
                                                            localAddress4.getClass();
                                                            String str47 = localAddress4.address_single_line;
                                                            if (str47 == null) {
                                                                str47 = localAddress4.locality;
                                                                str47.getClass();
                                                            }
                                                            mapDecisionSheetModel = new MapDecisionSheetModel(str44, str47, false);
                                                        } else {
                                                            mapDecisionSheetModel = null;
                                                        }
                                                        if (menu != null && (menuHours = menu.hours) != null) {
                                                            if (menuHours.state == MenuHours.State.AvailableLater || z13) {
                                                                menuHours = null;
                                                            }
                                                            if (menuHours != null) {
                                                                String str48 = menuHours.nextAvailableFormatted;
                                                                String str49 = menu.name;
                                                                LocalFulfillmentType type3 = FulfillmentConfigurationKt.getType(fulfillmentConfiguration3);
                                                                str49.getClass();
                                                                type3.getClass();
                                                                if (str48 != null) {
                                                                    str21 = new MessageFormat(resources3.getString(R.string.local_presenters_menu_unavailable_toast_title)).format(new Object[]{str49, str48});
                                                                    str21.getClass();
                                                                } else {
                                                                    str21 = androidStringManager2.get(R.string.local_presenters_menu_unavailable_toast_title_fallback);
                                                                }
                                                                switch (LocalBrandProfileContentFactory.WhenMappings.$EnumSwitchMapping$2[type3.ordinal()]) {
                                                                    case 1:
                                                                    case 3:
                                                                        i19 = R.string.local_presenters_menu_unavailable_toast_body_pickup;
                                                                        break;
                                                                    case 2:
                                                                        i19 = R.string.local_presenters_menu_unavailable_toast_body_delivery;
                                                                        break;
                                                                    case 4:
                                                                    case 5:
                                                                    case 6:
                                                                        Path$$ExternalSyntheticBUOutline0.m$1(type3, "createToastData should not be reached for ");
                                                                        return null;
                                                                    default:
                                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                        return null;
                                                                }
                                                                toastData = new ToastData(str21, androidStringManager2.get(i19));
                                                                return new LocalBrandProfileViewModel.Content(str43, localImage5, str44, str45, str46, fulfillment2, localBrandBannerModel2, status, filterNotNull, localColor2, mapDecisionSheetModel, list13, moreOptionsMenuModel, fulfillmentOptionsMenuModel, toastData, booleanValue3, str25, (!z17 && z11 && z13) ? z15 : false, 786432);
                                                            }
                                                        }
                                                        toastData = null;
                                                        return new LocalBrandProfileViewModel.Content(str43, localImage5, str44, str45, str46, fulfillment2, localBrandBannerModel2, status, filterNotNull, localColor2, mapDecisionSheetModel, list13, moreOptionsMenuModel, fulfillmentOptionsMenuModel, toastData, booleanValue3, str25, (!z17 && z11 && z13) ? z15 : false, 786432);
                                                    }
                                                    z15 = true;
                                                    boolean z192 = false;
                                                    if (z13) {
                                                        if (z13) {
                                                        }
                                                        LocalBrandProfileViewModel.FulfillmentOptionsMenuModel fulfillmentOptionsMenuModel2 = new LocalBrandProfileViewModel.FulfillmentOptionsMenuModel(str42, z18, z14, z13, z192, z20, str20);
                                                        String str432 = brand2.token;
                                                        String str442 = brand2.name;
                                                        String str452 = brand2.cashtag;
                                                        LocalImage localImage42 = brand2.artworkImage;
                                                        if (localImage42 == null) {
                                                        }
                                                        String str462 = brand2.description;
                                                        LocalColor localColor22 = brand2.backgroundColor;
                                                        if (z12) {
                                                        }
                                                        if (menu != null) {
                                                            if (menuHours.state == MenuHours.State.AvailableLater) {
                                                            }
                                                            menuHours = null;
                                                            if (menuHours != null) {
                                                            }
                                                        }
                                                        toastData = null;
                                                        return new LocalBrandProfileViewModel.Content(str432, localImage5, str442, str452, str462, fulfillment2, localBrandBannerModel2, status, filterNotNull, localColor22, mapDecisionSheetModel, list13, moreOptionsMenuModel, fulfillmentOptionsMenuModel2, toastData, booleanValue3, str25, (!z17 && z11 && z13) ? z15 : false, 786432);
                                                    }
                                                    if (z13) {
                                                    }
                                                    LocalBrandProfileViewModel.FulfillmentOptionsMenuModel fulfillmentOptionsMenuModel22 = new LocalBrandProfileViewModel.FulfillmentOptionsMenuModel(str42, z18, z14, z13, z192, z20, str20);
                                                    String str4322 = brand2.token;
                                                    String str4422 = brand2.name;
                                                    String str4522 = brand2.cashtag;
                                                    LocalImage localImage422 = brand2.artworkImage;
                                                    if (localImage422 == null) {
                                                    }
                                                    String str4622 = brand2.description;
                                                    LocalColor localColor222 = brand2.backgroundColor;
                                                    if (z12) {
                                                    }
                                                    if (menu != null) {
                                                    }
                                                    toastData = null;
                                                    return new LocalBrandProfileViewModel.Content(str4322, localImage5, str4422, str4522, str4622, fulfillment2, localBrandBannerModel2, status, filterNotNull, localColor222, mapDecisionSheetModel, list13, moreOptionsMenuModel, fulfillmentOptionsMenuModel22, toastData, booleanValue3, str25, (!z17 && z11 && z13) ? z15 : false, 786432);
                                                }
                                            }
                                            z14 = false;
                                            if (!z13) {
                                            }
                                            z15 = true;
                                            boolean z1922 = false;
                                            if (z13) {
                                            }
                                            if (z13) {
                                            }
                                            LocalBrandProfileViewModel.FulfillmentOptionsMenuModel fulfillmentOptionsMenuModel222 = new LocalBrandProfileViewModel.FulfillmentOptionsMenuModel(str42, z18, z14, z13, z1922, z20, str20);
                                            String str43222 = brand2.token;
                                            String str44222 = brand2.name;
                                            String str45222 = brand2.cashtag;
                                            LocalImage localImage4222 = brand2.artworkImage;
                                            if (localImage4222 == null) {
                                            }
                                            String str46222 = brand2.description;
                                            LocalColor localColor2222 = brand2.backgroundColor;
                                            if (z12) {
                                            }
                                            if (menu != null) {
                                            }
                                            toastData = null;
                                            return new LocalBrandProfileViewModel.Content(str43222, localImage5, str44222, str45222, str46222, fulfillment2, localBrandBannerModel2, status, filterNotNull, localColor2222, mapDecisionSheetModel, list13, moreOptionsMenuModel, fulfillmentOptionsMenuModel222, toastData, booleanValue3, str25, (!z17 && z11 && z13) ? z15 : false, 786432);
                                        }
                                    }
                                    localBrandProfileSectionViewModel3 = null;
                                    if (locationDetail != null) {
                                    }
                                    if (locationDetail != null) {
                                    }
                                    localBrandProfileSectionViewModel5 = null;
                                    if (locationDetail != null) {
                                    }
                                    str15 = null;
                                    localBrandProfileSectionViewModel6 = null;
                                    if (str13 != null) {
                                    }
                                    String str402 = androidStringManager2.get(R.string.local_presenters_cash_app_footer);
                                    LocalBrandProfileContentFactory localBrandProfileContentFactory42 = localBrandProfileContentFactory;
                                    Object[] objArr142 = {localBrandProfileContentFactory42.versionName};
                                    resources.getClass();
                                    Resources resources32 = resources;
                                    String format42 = new MessageFormat(resources32.getString(R.string.local_presenters_version_name)).format(objArr142);
                                    format42.getClass();
                                    List filterNotNull2 = ArraysKt___ArraysKt.filterNotNull(new LocalBrandProfileSectionViewModel[]{r40, localBrandProfileSectionViewModel, localBrandProfileSectionViewModel2, localBrandProfileSectionViewModel3, localBrandProfileSectionViewModel4, localBrandProfileSectionViewModel5, localBrandProfileSectionViewModel6, localBrandProfileSectionViewModel8, new LocalBrandProfileSectionViewModel(null, new LocalBrandLocationFooterContentModel(str402, format42))});
                                    FulfillmentTimeUtils fulfillmentTimeUtils2 = localBrandProfileContentFactory42.fulfillmentTimeUtils;
                                    if (locationDetail != null) {
                                    }
                                    fulfillmentConfiguration3 = fulfillmentConfiguration2;
                                    if (fulfillmentConfiguration3 != null) {
                                    }
                                    if (str16 != null) {
                                    }
                                    str16 = null;
                                    FulfillmentConfiguration.Unspecified unspecified2 = FulfillmentConfiguration.Unspecified.INSTANCE;
                                    if (str16 == null) {
                                    }
                                    if (fulfillmentConfiguration3 instanceof FulfillmentConfiguration.Delivery) {
                                    }
                                    fulfillmentSelection2 = fulfillmentSelection;
                                    if (fulfillment2 == null) {
                                    }
                                    brand2 = brand;
                                    LocalBrandProfileViewModel.MoreOptionsMenuModel moreOptionsMenuModel2 = new LocalBrandProfileViewModel.MoreOptionsMenuModel(brandFollowViewModel7, brand2.shareLinkUrl == null);
                                    String str422 = androidStringManager2.get(!(fulfillment2 instanceof LocalBrandProfileViewModel.Fulfillment.Delivery) ? R.string.local_presenters_more_options_change_delivery_address : R.string.local_presenters_more_options_change_location);
                                    if (brand2.selectedLocation == null) {
                                    }
                                    z13 = fulfillment2 instanceof LocalBrandProfileViewModel.Fulfillment.InStore;
                                    if (!z13) {
                                    }
                                    z14 = false;
                                    if (!z13) {
                                    }
                                    z15 = true;
                                    boolean z19222 = false;
                                    if (z13) {
                                    }
                                    if (z13) {
                                    }
                                    LocalBrandProfileViewModel.FulfillmentOptionsMenuModel fulfillmentOptionsMenuModel2222 = new LocalBrandProfileViewModel.FulfillmentOptionsMenuModel(str422, z18, z14, z13, z19222, z20, str20);
                                    String str432222 = brand2.token;
                                    String str442222 = brand2.name;
                                    String str452222 = brand2.cashtag;
                                    LocalImage localImage42222 = brand2.artworkImage;
                                    if (localImage42222 == null) {
                                    }
                                    String str462222 = brand2.description;
                                    LocalColor localColor22222 = brand2.backgroundColor;
                                    if (z12) {
                                    }
                                    if (menu != null) {
                                    }
                                    toastData = null;
                                    return new LocalBrandProfileViewModel.Content(str432222, localImage5, str442222, str452222, str462222, fulfillment2, localBrandBannerModel2, status, filterNotNull2, localColor22222, mapDecisionSheetModel, list13, moreOptionsMenuModel2, fulfillmentOptionsMenuModel2222, toastData, booleanValue3, str25, (!z17 && z11 && z13) ? z15 : false, 786432);
                                }
                                List list21 = list17;
                                int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list21, 10));
                                if (mapCapacity < 16) {
                                    mapCapacity = 16;
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                                for (Object obj12 : list21) {
                                    linkedHashMap.put(new MenuCategoryToken(((Category) obj12).token), obj12);
                                }
                                List<LocationMenu.Menu> list22 = list18;
                                ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list22, 10));
                                for (LocationMenu.Menu menu3 : list22) {
                                    ArrayList arrayList13 = menu3.categoryTokens;
                                    ArrayList arrayList14 = new ArrayList();
                                    Iterator it18 = arrayList13.iterator();
                                    while (it18.hasNext()) {
                                        Category category = (Category) linkedHashMap.get(new MenuCategoryToken(((MenuCategoryToken) it18.next()).value));
                                        if (category != null) {
                                            arrayList14.add(category);
                                        }
                                    }
                                    arrayList12.add(ExpandableContentKt.toViewModelMenu(menu3, locationMenu10, CollectionsKt.take(arrayList14, 5)));
                                }
                                Iterator it19 = arrayList12.iterator();
                                while (true) {
                                    if (it19.hasNext()) {
                                        obj11 = it19.next();
                                        String str50 = ((LocalBrandLocationMenuContentModel.Menu) obj11).token;
                                        String str51 = menu != null ? menu.token : null;
                                        if (str50 == null) {
                                            if (str51 == null) {
                                                equals = true;
                                                if (!equals) {
                                                }
                                            }
                                            equals = false;
                                            if (!equals) {
                                            }
                                        } else {
                                            if (str51 != null) {
                                                equals = str50.equals(str51);
                                                if (!equals) {
                                                }
                                            }
                                            equals = false;
                                            if (!equals) {
                                            }
                                        }
                                    } else {
                                        obj11 = null;
                                    }
                                }
                                localBrandProfileSectionViewModel7 = new LocalBrandProfileSectionViewModel(null, new LocalBrandLocationMenuContentModel(arrayList12, true, (LocalBrandLocationMenuContentModel.Menu) obj11));
                            }
                            localBrandProfileSectionViewModel2 = localBrandProfileSectionViewModel7;
                            if (locationDetail != null) {
                            }
                            localBrandProfileSectionViewModel3 = null;
                            if (locationDetail != null) {
                            }
                            if (locationDetail != null) {
                            }
                            localBrandProfileSectionViewModel5 = null;
                            if (locationDetail != null) {
                            }
                            str15 = null;
                            localBrandProfileSectionViewModel6 = null;
                            if (str13 != null) {
                            }
                            String str4022 = androidStringManager2.get(R.string.local_presenters_cash_app_footer);
                            LocalBrandProfileContentFactory localBrandProfileContentFactory422 = localBrandProfileContentFactory;
                            Object[] objArr1422 = {localBrandProfileContentFactory422.versionName};
                            resources.getClass();
                            Resources resources322 = resources;
                            String format422 = new MessageFormat(resources322.getString(R.string.local_presenters_version_name)).format(objArr1422);
                            format422.getClass();
                            List filterNotNull22 = ArraysKt___ArraysKt.filterNotNull(new LocalBrandProfileSectionViewModel[]{r40, localBrandProfileSectionViewModel, localBrandProfileSectionViewModel2, localBrandProfileSectionViewModel3, localBrandProfileSectionViewModel4, localBrandProfileSectionViewModel5, localBrandProfileSectionViewModel6, localBrandProfileSectionViewModel8, new LocalBrandProfileSectionViewModel(null, new LocalBrandLocationFooterContentModel(str4022, format422))});
                            FulfillmentTimeUtils fulfillmentTimeUtils22 = localBrandProfileContentFactory422.fulfillmentTimeUtils;
                            if (locationDetail != null) {
                            }
                            fulfillmentConfiguration3 = fulfillmentConfiguration2;
                            if (fulfillmentConfiguration3 != null) {
                            }
                            if (str16 != null) {
                            }
                            str16 = null;
                            FulfillmentConfiguration.Unspecified unspecified22 = FulfillmentConfiguration.Unspecified.INSTANCE;
                            if (str16 == null) {
                            }
                            if (fulfillmentConfiguration3 instanceof FulfillmentConfiguration.Delivery) {
                            }
                            fulfillmentSelection2 = fulfillmentSelection;
                            if (fulfillment2 == null) {
                            }
                            brand2 = brand;
                            LocalBrandProfileViewModel.MoreOptionsMenuModel moreOptionsMenuModel22 = new LocalBrandProfileViewModel.MoreOptionsMenuModel(brandFollowViewModel7, brand2.shareLinkUrl == null);
                            String str4222 = androidStringManager2.get(!(fulfillment2 instanceof LocalBrandProfileViewModel.Fulfillment.Delivery) ? R.string.local_presenters_more_options_change_delivery_address : R.string.local_presenters_more_options_change_location);
                            if (brand2.selectedLocation == null) {
                            }
                            z13 = fulfillment2 instanceof LocalBrandProfileViewModel.Fulfillment.InStore;
                            if (!z13) {
                            }
                            z14 = false;
                            if (!z13) {
                            }
                            z15 = true;
                            boolean z192222 = false;
                            if (z13) {
                            }
                            if (z13) {
                            }
                            LocalBrandProfileViewModel.FulfillmentOptionsMenuModel fulfillmentOptionsMenuModel22222 = new LocalBrandProfileViewModel.FulfillmentOptionsMenuModel(str4222, z18, z14, z13, z192222, z20, str20);
                            String str4322222 = brand2.token;
                            String str4422222 = brand2.name;
                            String str4522222 = brand2.cashtag;
                            LocalImage localImage422222 = brand2.artworkImage;
                            if (localImage422222 == null) {
                            }
                            String str4622222 = brand2.description;
                            LocalColor localColor222222 = brand2.backgroundColor;
                            if (z12) {
                            }
                            if (menu != null) {
                            }
                            toastData = null;
                            return new LocalBrandProfileViewModel.Content(str4322222, localImage5, str4422222, str4522222, str4622222, fulfillment2, localBrandBannerModel2, status, filterNotNull22, localColor222222, mapDecisionSheetModel, list13, moreOptionsMenuModel22, fulfillmentOptionsMenuModel22222, toastData, booleanValue3, str25, (!z17 && z11 && z13) ? z15 : false, 786432);
                        }
                    }
                    localBrandProfileSectionViewModel2 = null;
                    if (locationDetail != null) {
                    }
                    localBrandProfileSectionViewModel3 = null;
                    if (locationDetail != null) {
                    }
                    if (locationDetail != null) {
                    }
                    localBrandProfileSectionViewModel5 = null;
                    if (locationDetail != null) {
                    }
                    str15 = null;
                    localBrandProfileSectionViewModel6 = null;
                    if (str13 != null) {
                    }
                    String str40222 = androidStringManager2.get(R.string.local_presenters_cash_app_footer);
                    LocalBrandProfileContentFactory localBrandProfileContentFactory4222 = localBrandProfileContentFactory;
                    Object[] objArr14222 = {localBrandProfileContentFactory4222.versionName};
                    resources.getClass();
                    Resources resources3222 = resources;
                    String format4222 = new MessageFormat(resources3222.getString(R.string.local_presenters_version_name)).format(objArr14222);
                    format4222.getClass();
                    List filterNotNull222 = ArraysKt___ArraysKt.filterNotNull(new LocalBrandProfileSectionViewModel[]{r40, localBrandProfileSectionViewModel, localBrandProfileSectionViewModel2, localBrandProfileSectionViewModel3, localBrandProfileSectionViewModel4, localBrandProfileSectionViewModel5, localBrandProfileSectionViewModel6, localBrandProfileSectionViewModel8, new LocalBrandProfileSectionViewModel(null, new LocalBrandLocationFooterContentModel(str40222, format4222))});
                    FulfillmentTimeUtils fulfillmentTimeUtils222 = localBrandProfileContentFactory4222.fulfillmentTimeUtils;
                    if (locationDetail != null) {
                    }
                    fulfillmentConfiguration3 = fulfillmentConfiguration2;
                    if (fulfillmentConfiguration3 != null) {
                    }
                    if (str16 != null) {
                    }
                    str16 = null;
                    FulfillmentConfiguration.Unspecified unspecified222 = FulfillmentConfiguration.Unspecified.INSTANCE;
                    if (str16 == null) {
                    }
                    if (fulfillmentConfiguration3 instanceof FulfillmentConfiguration.Delivery) {
                    }
                    fulfillmentSelection2 = fulfillmentSelection;
                    if (fulfillment2 == null) {
                    }
                    brand2 = brand;
                    LocalBrandProfileViewModel.MoreOptionsMenuModel moreOptionsMenuModel222 = new LocalBrandProfileViewModel.MoreOptionsMenuModel(brandFollowViewModel7, brand2.shareLinkUrl == null);
                    String str42222 = androidStringManager2.get(!(fulfillment2 instanceof LocalBrandProfileViewModel.Fulfillment.Delivery) ? R.string.local_presenters_more_options_change_delivery_address : R.string.local_presenters_more_options_change_location);
                    if (brand2.selectedLocation == null) {
                    }
                    z13 = fulfillment2 instanceof LocalBrandProfileViewModel.Fulfillment.InStore;
                    if (!z13) {
                    }
                    z14 = false;
                    if (!z13) {
                    }
                    z15 = true;
                    boolean z1922222 = false;
                    if (z13) {
                    }
                    if (z13) {
                    }
                    LocalBrandProfileViewModel.FulfillmentOptionsMenuModel fulfillmentOptionsMenuModel222222 = new LocalBrandProfileViewModel.FulfillmentOptionsMenuModel(str42222, z18, z14, z13, z1922222, z20, str20);
                    String str43222222 = brand2.token;
                    String str44222222 = brand2.name;
                    String str45222222 = brand2.cashtag;
                    LocalImage localImage4222222 = brand2.artworkImage;
                    if (localImage4222222 == null) {
                    }
                    String str46222222 = brand2.description;
                    LocalColor localColor2222222 = brand2.backgroundColor;
                    if (z12) {
                    }
                    if (menu != null) {
                    }
                    toastData = null;
                    return new LocalBrandProfileViewModel.Content(str43222222, localImage5, str44222222, str45222222, str46222222, fulfillment2, localBrandBannerModel2, status, filterNotNull222, localColor2222222, mapDecisionSheetModel, list13, moreOptionsMenuModel222, fulfillmentOptionsMenuModel222222, toastData, booleanValue3, str25, (!z17 && z11 && z13) ? z15 : false, 786432);
                }
            };
            localBrandProfilePresenter4 = this;
            mutableState40 = mutableState40;
            mutableState20 = mutableState38;
            state12 = state22;
            rememberedValue54 = Updater.derivedStateOf(function02);
            GapComposer gapComposer6 = gapComposer5;
            gapComposer6.updateRememberedValue(rememberedValue54);
            gapComposer3 = gapComposer6;
        } else {
            localBrandProfilePresenter4 = this;
            gapComposer3 = gapComposer5;
            list2 = list5;
            mutableState20 = mutableState38;
            obj2 = obj5;
            state12 = state22;
            mutableState19 = mutableState7;
            state11 = state8;
        }
        State state27 = (State) rememberedValue54;
        MutableState rememberUpdatedState = Updater.rememberUpdatedState((LocalBrand) mutableState14.getValue(), gapComposer3);
        Location.LocationDetail models$lambda$706 = models$lambda$70(state6);
        String mo1225getTokenQsI1X5w = models$lambda$706 != null ? models$lambda$706.mo1225getTokenQsI1X5w() : null;
        MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(mo1225getTokenQsI1X5w != null ? LocationToken.m1249boximpl(mo1225getTokenQsI1X5w) : null, gapComposer3);
        MutableState rememberUpdatedState3 = Updater.rememberUpdatedState((LocalBrandProfileViewModel) state27.getValue(), gapComposer3);
        MutableState rememberUpdatedState4 = Updater.rememberUpdatedState(models$lambda$28(mutableState19), gapComposer3);
        MutableState rememberUpdatedState5 = Updater.rememberUpdatedState(models$lambda$34(state11), gapComposer3);
        MutableState rememberUpdatedState6 = Updater.rememberUpdatedState(str12, gapComposer3);
        List list9 = list2;
        boolean changed26 = gapComposer3.changed(list9);
        Object rememberedValue55 = gapComposer3.rememberedValue();
        if (changed26) {
            obj3 = obj2;
        } else {
            obj3 = obj2;
            obj4 = rememberedValue55;
        }
        List list10 = list9;
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list10, 10));
        Iterator it7 = list10.iterator();
        while (it7.hasNext()) {
            arrayList4.add(((ProfileBottomModal) it7.next()).getAction());
        }
        gapComposer3.updateRememberedValue(arrayList4);
        obj4 = arrayList4;
        MutableState rememberUpdatedState7 = Updater.rememberUpdatedState((List) obj4, gapComposer3);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance8 = gapComposer3.changedInstance(localBrandProfilePresenter4);
        Object rememberedValue56 = gapComposer3.rememberedValue();
        if (changedInstance8 || rememberedValue56 == obj3) {
            rememberedValue56 = new ZiplineLoader$ModuleJob$run$3(localBrandProfilePresenter4, mutableState13, null, 9);
            gapComposer3.updateRememberedValue(rememberedValue56);
        }
        Updater.LaunchedEffect(gapComposer3, unit, (Function2) rememberedValue56);
        GapComposer gapComposer7 = gapComposer3;
        Updater.LaunchedEffect(gapComposer7, flow, new LocalBrandProfilePresenter$models$$inlined$CollectEffect$2(flow, null, localBrandProfilePresenter4, mutableSharedFlow, realCartBuilder, rememberUpdatedState7, state9, rememberUpdatedState5, state6, mutableState10, state20, mutableState15, mutableState16, rememberUpdatedState4, rememberUpdatedState6, mutableState40, state12, rememberUpdatedState2, rememberUpdatedState3, mutableState4, rememberUpdatedState, mutableState18, mutableState2, mutableState20, mutableState41, mutableState42));
        LocalBrandProfileViewModel localBrandProfileViewModel = (LocalBrandProfileViewModel) state27.getValue();
        gapComposer7.endReplaceGroup();
        return localBrandProfileViewModel;
    }
}
