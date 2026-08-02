package com.squareup.cash.shopping.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.net.Uri;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.platform.DerivedSize;
import androidx.emoji2.text.EmojiExclusions;
import androidx.exifinterface.media.ExifInterfaceUtils;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.room.RoomDatabase$performClear$1;
import app.cash.api.ApiResult;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.fillr.browsersdk.model.FillrCartInformationExtraction$FillrCartInformation;
import com.fillr.browsersdk.model.FillrCartInformationExtraction$FillrCartProduct;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuk;
import com.google.mlkit.vision.text.internal.zzr;
import com.squareup.cash.R;
import com.squareup.cash.RealBugReportSender$submitBugReport$2;
import com.squareup.cash.RealBugReportSenderFactory;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletAnalytics;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletSelectAfterpayPromptSheet;
import com.squareup.cash.arcade.components.ToastKt$Toast$7$1;
import com.squareup.cash.autofillweb.api.AutofillWebInfo;
import com.squareup.cash.autofillweb.real.AggregateAutofillWebManager;
import com.squareup.cash.autofillweb.real.RealAutofillWebManagerProvider;
import com.squareup.cash.autofillweb.real.RealCashFillJsStore;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.views.FileBlockerView$6$2$1;
import com.squareup.cash.boost.backend.BoostAction;
import com.squareup.cash.boost.backend.RealBoostAnalyticsHelper;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.boost.backend.analytics.BoostAppLocation$CardTab;
import com.squareup.cash.boost.backend.analytics.BoostAppLocation$MerchantProfile;
import com.squareup.cash.boost.backend.analytics.BoostAppLocation$OffersDetail;
import com.squareup.cash.boost.backend.analytics.BoostAppLocation$ProfileDirectory;
import com.squareup.cash.boost.db.Slots;
import com.squareup.cash.cashcommercebrowser.api.v1.AnalyzeCartService;
import com.squareup.cash.cashcommercebrowser.api.v1.BlockedItem;
import com.squareup.cash.cashcommercebrowser.api.v1.RestrictedItemCheckRequest;
import com.squareup.cash.cashcommercebrowser.api.v1.RestrictedItemCheckResponse;
import com.squareup.cash.cashcommercebrowser.api.v1.ShoppingCartProduct;
import com.squareup.cash.cdf.BrowserOrigin;
import com.squareup.cash.cdf.SearchOrigin;
import com.squareup.cash.cdf.browser.BrowserCheckoutFillVirtualCard;
import com.squareup.cash.cdf.browser.BrowserCheckoutRestrictedItemFailApiCall;
import com.squareup.cash.cdf.browser.BrowserCheckoutSingleUsePaymentStart;
import com.squareup.cash.cdf.browser.BrowserCheckoutViewPaymentPlanDetails;
import com.squareup.cash.cdf.browser.InfoContext;
import com.squareup.cash.cdf.offers.AppLocation;
import com.squareup.cash.clientsync.models.SyncTrigger;
import com.squareup.cash.clientsync.pipeline.SyncScope;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.contacts.RealContactSync$syncRequest$2;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlag$StringFeatureFlag$Value;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.JsonFeatureFlags$CashWebMonitoringScript;
import com.squareup.cash.featureflags.JsonFeatureFlags$MobileDependenciesConfig;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$CashFillWalmartShoppingAutofillDisabled;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.fillr.api.FillrWebManager$FillrVersions;
import com.squareup.cash.fillr.real.RealFillrWebManager;
import com.squareup.cash.globalsearch.screens.GlobalSearchScreen;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$map$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.maps.views.CashMapViewKt$CashMapView$3$1;
import com.squareup.cash.merchant.screens.BackNavigationAction;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantProfileScreen;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$17$$inlined$map$1;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.nearby.views.DotGridKt$DotGrid$3$1;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsHelper;
import com.squareup.cash.offers.presenters.OffersHomePresenter$models$2$1;
import com.squareup.cash.offers.screens.OffersScreen$OffersDetailsScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersTimelineScreen;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda1;
import com.squareup.cash.pools.presenters.PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1;
import com.squareup.cash.pools.presenters.PoolsListPresenter$models$2$2;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter$models$1$1;
import com.squareup.cash.recipients.data.RealRecipientRepository$suggestions$$inlined$map$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.sheet.BasicShieetKt$BasicShieet$4$1;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda2;
import com.squareup.cash.shopping.autofill.screens.AutofillAnalyticsParam;
import com.squareup.cash.shopping.backend.analytics.ShopHubAnalyticsHelper$Flow;
import com.squareup.cash.shopping.backend.real.RealShopHubAnalyticsHelper;
import com.squareup.cash.shopping.presenters.RealShoppingJavascriptPresenter;
import com.squareup.cash.shopping.screens.AutofillQuestion;
import com.squareup.cash.shopping.screens.EntityInformation;
import com.squareup.cash.shopping.screens.IabMetadata;
import com.squareup.cash.shopping.screens.ShoppingScreenContext;
import com.squareup.cash.shopping.screens.ShoppingWebScreen;
import com.squareup.cash.shopping.sup.screens.CheckoutScreenType;
import com.squareup.cash.shopping.sup.screens.SingleUsePaymentAnalyticsParam;
import com.squareup.cash.shopping.sup.screens.SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen;
import com.squareup.cash.shopping.sup.screens.SingleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen;
import com.squareup.cash.shopping.viewmodels.AutofillFooterViewModel;
import com.squareup.cash.shopping.viewmodels.CashFillStatus;
import com.squareup.cash.shopping.viewmodels.ErrorUrlAction;
import com.squareup.cash.shopping.viewmodels.FillrStatus;
import com.squareup.cash.shopping.viewmodels.FooterButtonStyle;
import com.squareup.cash.shopping.viewmodels.InjectJavascriptViewModel$Empty;
import com.squareup.cash.shopping.viewmodels.PaykitInfoToastState;
import com.squareup.cash.shopping.viewmodels.PaykitInfoToastViewModel;
import com.squareup.cash.shopping.viewmodels.PillStage;
import com.squareup.cash.shopping.viewmodels.RestrictedProduct;
import com.squareup.cash.shopping.viewmodels.ShoppingJavascriptViewModel;
import com.squareup.cash.shopping.viewmodels.ShoppingViewModel;
import com.squareup.cash.shopping.viewmodels.WebNavigationFooterViewModel;
import com.squareup.cash.shopping.viewmodels.WebNavigationHeaderModel;
import com.squareup.cash.storage.AndroidFileSaver$save$2;
import com.squareup.cash.storage.FileDownloader$Category;
import com.squareup.cash.storage.FileDownloader$DownloadStatus;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.support.chat.views.ChatInputView$Content$1$1$1;
import com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1;
import com.squareup.cash.ui.gcm.NotificationActionService$onHandleIntent$1;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.wallet.data.RealIssuedCardManager;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$4$1;
import com.squareup.cash.webview.android.WebViewUseCase;
import com.squareup.preferences.BooleanPreference;
import com.squareup.preferences.KeyValue;
import com.squareup.preferences.PreferenceFlow;
import com.squareup.protos.cash.cashapproxy.api.CashApProxyClientService;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import com.squareup.protos.cash.cashstorefronts.api.RewardAmount;
import com.squareup.protos.cash.cashstorefronts.api.RewardAmount$Data$RewardConstantAmount;
import com.squareup.protos.cash.cashstorefronts.api.RewardAmount$Data$RewardRelativeAmount;
import com.squareup.protos.cash.cashstorefronts.api.RewardConstantAmount;
import com.squareup.protos.cash.cashstorefronts.api.RewardRelativeAmount;
import com.squareup.protos.cash.cashsuggest.api.InAppBrowserMetadata;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey$IdentifierToken$MerchantToken;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey$IdentifierToken$OfferToken;
import com.squareup.protos.cash.cashsuggest.api.SheetType;
import com.squareup.protos.cash.commercebrowser.CommerceBrowserAutofillPreferences;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.grantly.api.ShippingAddress;
import com.squareup.protos.cash.grantly.app.RetrieveDefaultShippingAddressResponse;
import com.squareup.protos.cash.grantly.app.ShippingAddressService;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.cash.shop.rendering.api.OfferType;
import com.squareup.protos.cash.sup.api.v1.AvailableCreditLimit;
import com.squareup.protos.cash.sup.api.v1.CheckoutService;
import com.squareup.protos.cash.sup.api.v1.GetMerchantConfigRequest;
import com.squareup.protos.cash.sup.api.v1.GetMerchantConfigResponse;
import com.squareup.protos.cash.sup.api.v1.MerchantConfigService;
import com.squareup.protos.cash.sup.api.v1.RetrievePlanDetailsRequest;
import com.squareup.protos.cash.sup.api.v1.RetrievePlanDetailsResponse;
import com.squareup.protos.cash.sup.plasma.SupCreateCardFlowEndResult;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.GetFlowRequest;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.scannerview.ScannerView;
import com.withpersona.sdk2.camera.GovernmentIdFeed$analyze$5;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.StateFlow;
import okhttp3.HttpUrl;
import okio.ByteString;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class ShoppingWebPresenter implements MoleculePresenter {
    public final zzr affiliateBrowserPlasmaFlowRepository;
    public final RealAfterpayAppletAnalytics afterpayAppletAnalytics;
    public final BooleanPreference afterpayInfoSheetViewed;
    public final Analytics analytics;
    public final AnalyzeCartService analyzeCartService;
    public final ShoppingWebScreen args;
    public final AutofillAnalyticsParam autofillAnalyticsParam;
    public final AggregateAutofillWebManager autofillManager;
    public final RealBoostAnalyticsHelper boostAnalyticsHelper;
    public final RealBoostRepository boostRepository;
    public final String businessName;
    public final boolean cashFillEnabled;
    public final RealCashFillJsStore cashFillJsStore;
    public final Lazy cashWebMonitoringScript$delegate;
    public final CheckoutService checkoutService;
    public final RealClientSyncer clientSyncer;
    public final AndroidClock clock;
    public final String entityToken;
    public final FeatureFlagManager featureFlagManager;
    public final RealFileDownloader fileDownloader;
    public final boolean fillrEnabled;
    public final RealFillrWebManager fillrManager;
    public final FlowStarter flowStarter;
    public final String flowToken;
    public final BooleanPreference infoSheet;
    public String initialActiveBoostToken;
    public final MoneyFormatter initialMoneyFormatter;
    public final CoroutineContext ioDispatcher;
    public final IssuedCardManager issuedCardManager;
    public final MerchantConfigService merchantConfigService;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealOffersAnalyticsHelper offersAnalyticsHelper;
    public final RealProfileManager profileManager;
    public final CoroutineScope scope;
    public final KeyValue seenDetailSheetForINN;
    public final KeyValue seenOfferAutofillSheet;
    public final RealSettingsEligibilityManager settingsManager;
    public final ShippingAddressService shippingAddressService;
    public final RealShopHubAnalyticsHelper shopHubAnalyticsHelper;
    public final RealShoppingJavascriptPresenter shoppingJsPresenter;
    public final RealBugReportSenderFactory shoppingWebAnalytics;
    public final com.squareup.kotterknife.Lazy singleUsePaymentManager;
    public final AndroidStringManager stringManager;
    public final SyncValueReader syncValueReader;
    public static final Set RESTRICTED_KEYWORDS = ArraysKt___ArraysKt.toSet(new String[]{"egift card", "gift card", "cashstar", "blackhawknetwork", "giftcard"});
    public static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("0.##");

    public final class CardState {
        public final boolean cancelled;
        public final String cvv;
        public final boolean enabled;
        public final String expiryMonth;
        public final String expiryYear;
        public final String fullNumber;
        public final boolean isSup;
        public final String lastFourDigits;
        public final String nameOnCard;

        public CardState(String str, String str2, String str3, String str4, String str5, boolean z, String str6, boolean z2, boolean z3) {
            this.fullNumber = str;
            this.lastFourDigits = str2;
            this.expiryMonth = str3;
            this.expiryYear = str4;
            this.cvv = str5;
            this.enabled = z;
            this.nameOnCard = str6;
            this.cancelled = z2;
            this.isSup = z3;
        }

        public static CardState copy$default(CardState cardState, String str, String str2, String str3, String str4, String str5, boolean z, int i) {
            if ((i & 1) != 0) {
                str = cardState.fullNumber;
            }
            String str6 = str;
            if ((i & 2) != 0) {
                str2 = cardState.lastFourDigits;
            }
            String str7 = str2;
            if ((i & 4) != 0) {
                str3 = cardState.expiryMonth;
            }
            String str8 = str3;
            String str9 = (i & 8) != 0 ? cardState.expiryYear : str4;
            String str10 = (i & 16) != 0 ? cardState.cvv : str5;
            boolean z2 = (i & 32) != 0 ? cardState.enabled : z;
            String str11 = cardState.nameOnCard;
            boolean z3 = (i & 128) != 0 ? cardState.cancelled : true;
            boolean z4 = cardState.isSup;
            cardState.getClass();
            return new CardState(str6, str7, str8, str9, str10, z2, str11, z3, z4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardState)) {
                return false;
            }
            CardState cardState = (CardState) obj;
            return Intrinsics.areEqual(this.fullNumber, cardState.fullNumber) && Intrinsics.areEqual(this.lastFourDigits, cardState.lastFourDigits) && Intrinsics.areEqual(this.expiryMonth, cardState.expiryMonth) && Intrinsics.areEqual(this.expiryYear, cardState.expiryYear) && Intrinsics.areEqual(this.cvv, cardState.cvv) && this.enabled == cardState.enabled && Intrinsics.areEqual(this.nameOnCard, cardState.nameOnCard) && this.cancelled == cardState.cancelled && this.isSup == cardState.isSup;
        }

        public final int hashCode() {
            String str = this.fullNumber;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.lastFourDigits;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.expiryMonth;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.expiryYear;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.cvv;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.enabled);
            String str6 = this.nameOnCard;
            return Boolean.hashCode(this.isSup) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str6 != null ? str6.hashCode() : 0)) * 31, 31, this.cancelled);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CardState(fullNumber=", this.fullNumber, ", lastFourDigits=", this.lastFourDigits, ", expiryMonth=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.expiryMonth, ", expiryYear=", this.expiryYear, ", cvv=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.cvv, ", enabled=", this.enabled, ", nameOnCard=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.nameOnCard, ", cancelled=", this.cancelled, ", isSup=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.isSup, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class CartError {
        public static final /* synthetic */ CartError[] $VALUES;
        public static final CartError ABOVE_CREDIT_LIMIT;
        public static final CartError BELOW_CART_MINIMUM;
        public static final CartError CART_NOT_DETECTED;
        public static final CartError CONNECTION_FAILED;
        public static final CartError EMPTY_CART;
        public static final CartError LOAN_LIMIT_REACHED;
        public static final CartError RESTRICTED_ITEMS;
        public static final CartError SPENDING_LIMIT_REACHED;

        static {
            CartError cartError = new CartError("ABOVE_CREDIT_LIMIT", 0);
            ABOVE_CREDIT_LIMIT = cartError;
            CartError cartError2 = new CartError("BELOW_CART_MINIMUM", 1);
            BELOW_CART_MINIMUM = cartError2;
            CartError cartError3 = new CartError("EMPTY_CART", 2);
            EMPTY_CART = cartError3;
            CartError cartError4 = new CartError("CART_NOT_DETECTED", 3);
            CART_NOT_DETECTED = cartError4;
            CartError cartError5 = new CartError("RESTRICTED_ITEMS", 4);
            RESTRICTED_ITEMS = cartError5;
            CartError cartError6 = new CartError("CONNECTION_FAILED", 5);
            CONNECTION_FAILED = cartError6;
            CartError cartError7 = new CartError("LOAN_LIMIT_REACHED", 6);
            LOAN_LIMIT_REACHED = cartError7;
            CartError cartError8 = new CartError("SPENDING_LIMIT_REACHED", 7);
            SPENDING_LIMIT_REACHED = cartError8;
            $VALUES = new CartError[]{cartError, cartError2, cartError3, cartError4, cartError5, cartError6, cartError7, cartError8};
        }

        public static CartError valueOf(String str) {
            return (CartError) Enum.valueOf(CartError.class, str);
        }

        public static CartError[] values() {
            return (CartError[]) $VALUES.clone();
        }
    }

    public final class PlanDetailsState {
        public final String downPayment;
        public final String estimatedTotal;

        public PlanDetailsState(String str, String str2) {
            this.downPayment = str;
            this.estimatedTotal = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlanDetailsState)) {
                return false;
            }
            PlanDetailsState planDetailsState = (PlanDetailsState) obj;
            return Intrinsics.areEqual(this.downPayment, planDetailsState.downPayment) && Intrinsics.areEqual(this.estimatedTotal, planDetailsState.estimatedTotal);
        }

        public final int hashCode() {
            String str = this.downPayment;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.estimatedTotal;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("PlanDetailsState(downPayment=", this.downPayment, ", estimatedTotal=", this.estimatedTotal, ")");
        }
    }

    public final class RestrictedItemState {
        public final FillrCartInformationExtraction$FillrCartProduct firstRestrictedItemFromBackend;
        public final Boolean querySuccess;

        public RestrictedItemState(Boolean bool, FillrCartInformationExtraction$FillrCartProduct fillrCartInformationExtraction$FillrCartProduct) {
            this.querySuccess = bool;
            this.firstRestrictedItemFromBackend = fillrCartInformationExtraction$FillrCartProduct;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RestrictedItemState)) {
                return false;
            }
            RestrictedItemState restrictedItemState = (RestrictedItemState) obj;
            return Intrinsics.areEqual(this.querySuccess, restrictedItemState.querySuccess) && Intrinsics.areEqual(this.firstRestrictedItemFromBackend, restrictedItemState.firstRestrictedItemFromBackend);
        }

        public final int hashCode() {
            Boolean bool = this.querySuccess;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            FillrCartInformationExtraction$FillrCartProduct fillrCartInformationExtraction$FillrCartProduct = this.firstRestrictedItemFromBackend;
            return hashCode + (fillrCartInformationExtraction$FillrCartProduct != null ? fillrCartInformationExtraction$FillrCartProduct.hashCode() : 0);
        }

        public final String toString() {
            return "RestrictedItemState(querySuccess=" + this.querySuccess + ", firstRestrictedItemFromBackend=" + this.firstRestrictedItemFromBackend + ")";
        }
    }

    public final class State {
        public final boolean addressAutofillEnabled;
        public final AutofillFooterViewModel autofillFooterViewModel;
        public final CardState cardState;
        public final CartError cartError;
        public final boolean cashFillEnabled;
        public final String cashFillVersion;
        public final String currUrl;
        public final String customUserAgent;
        public final boolean fillrEnabled;
        public final FillrWebManager$FillrVersions fillrVersions;
        public final WebNavigationFooterViewModel footerViewModel;
        public final WebNavigationHeaderModel headerViewModel;
        public final MerchantConfig merchantConfig;
        public final Uri monitoringScriptUrl;
        public final String monitoringScriptVersion;
        public final boolean onCheckout;
        public final PlanDetailsState planDetails;
        public final String prevUrl;
        public final RestrictedItemState restrictedItemState;
        public final boolean shouldMonitorWeb;
        public final boolean showAutofillSuccessToast;
        public final boolean showedAddCardSheet;
        public final SupCreateCardFlowEndResult supCheckoutEndResult;
        public final Money supCreditLimit;
        public final boolean trackedBrowserCheckoutLoad;
        public final WebViewUseCase webViewUseCase;

        public State(boolean z, CardState cardState, WebNavigationHeaderModel webNavigationHeaderModel, WebNavigationFooterViewModel webNavigationFooterViewModel, boolean z2, String str, String str2, SupCreateCardFlowEndResult supCreateCardFlowEndResult, String str3, Uri uri, boolean z3, FillrWebManager$FillrVersions fillrWebManager$FillrVersions, RestrictedItemState restrictedItemState, String str4, WebViewUseCase webViewUseCase, boolean z4, PlanDetailsState planDetailsState, boolean z5, MerchantConfig merchantConfig, CartError cartError, boolean z6, AutofillFooterViewModel autofillFooterViewModel, boolean z7, boolean z8, String str5, Money money) {
            str5.getClass();
            this.onCheckout = z;
            this.cardState = cardState;
            this.headerViewModel = webNavigationHeaderModel;
            this.footerViewModel = webNavigationFooterViewModel;
            this.fillrEnabled = z2;
            this.currUrl = str;
            this.prevUrl = str2;
            this.supCheckoutEndResult = supCreateCardFlowEndResult;
            this.customUserAgent = str3;
            this.monitoringScriptUrl = uri;
            this.shouldMonitorWeb = z3;
            this.fillrVersions = fillrWebManager$FillrVersions;
            this.restrictedItemState = restrictedItemState;
            this.monitoringScriptVersion = str4;
            this.webViewUseCase = webViewUseCase;
            this.addressAutofillEnabled = z4;
            this.planDetails = planDetailsState;
            this.showedAddCardSheet = z5;
            this.merchantConfig = merchantConfig;
            this.cartError = cartError;
            this.trackedBrowserCheckoutLoad = z6;
            this.autofillFooterViewModel = autofillFooterViewModel;
            this.showAutofillSuccessToast = z7;
            this.cashFillEnabled = z8;
            this.cashFillVersion = str5;
            this.supCreditLimit = money;
        }

        public static State copy$default(State state, boolean z, CardState cardState, WebNavigationHeaderModel webNavigationHeaderModel, WebNavigationFooterViewModel webNavigationFooterViewModel, String str, String str2, SupCreateCardFlowEndResult supCreateCardFlowEndResult, String str3, Uri uri, FillrWebManager$FillrVersions fillrWebManager$FillrVersions, RestrictedItemState restrictedItemState, String str4, boolean z2, PlanDetailsState planDetailsState, MerchantConfig merchantConfig, CartError cartError, AutofillFooterViewModel autofillFooterViewModel, boolean z3, Money money, int i) {
            boolean z4 = (i & 1) != 0 ? state.onCheckout : z;
            CardState cardState2 = (i & 2) != 0 ? state.cardState : cardState;
            WebNavigationHeaderModel webNavigationHeaderModel2 = (i & 4) != 0 ? state.headerViewModel : webNavigationHeaderModel;
            WebNavigationFooterViewModel webNavigationFooterViewModel2 = (i & 8) != 0 ? state.footerViewModel : webNavigationFooterViewModel;
            boolean z5 = state.fillrEnabled;
            String str5 = (i & 32) != 0 ? state.currUrl : str;
            String str6 = (i & 64) != 0 ? state.prevUrl : str2;
            SupCreateCardFlowEndResult supCreateCardFlowEndResult2 = (i & 128) != 0 ? state.supCheckoutEndResult : supCreateCardFlowEndResult;
            String str7 = (i & 256) != 0 ? state.customUserAgent : str3;
            state.getClass();
            state.getClass();
            Uri uri2 = (i & 2048) != 0 ? state.monitoringScriptUrl : uri;
            boolean z6 = (i & 4096) != 0 ? state.shouldMonitorWeb : true;
            FillrWebManager$FillrVersions fillrWebManager$FillrVersions2 = (i & PKIFailureInfo.certRevoked) != 0 ? state.fillrVersions : fillrWebManager$FillrVersions;
            RestrictedItemState restrictedItemState2 = (i & 16384) != 0 ? state.restrictedItemState : restrictedItemState;
            String str8 = (32768 & i) != 0 ? state.monitoringScriptVersion : str4;
            WebViewUseCase webViewUseCase = state.webViewUseCase;
            boolean z7 = (i & PKIFailureInfo.unsupportedVersion) != 0 ? state.addressAutofillEnabled : z2;
            PlanDetailsState planDetailsState2 = (262144 & i) != 0 ? state.planDetails : planDetailsState;
            boolean z8 = (524288 & i) != 0 ? state.showedAddCardSheet : true;
            MerchantConfig merchantConfig2 = (1048576 & i) != 0 ? state.merchantConfig : merchantConfig;
            CartError cartError2 = (2097152 & i) != 0 ? state.cartError : cartError;
            state.getClass();
            boolean z9 = (8388608 & i) != 0 ? state.trackedBrowserCheckoutLoad : true;
            AutofillFooterViewModel autofillFooterViewModel2 = (16777216 & i) != 0 ? state.autofillFooterViewModel : autofillFooterViewModel;
            boolean z10 = (33554432 & i) != 0 ? state.showAutofillSuccessToast : z3;
            boolean z11 = state.cashFillEnabled;
            String str9 = state.cashFillVersion;
            Money money2 = (i & 268435456) != 0 ? state.supCreditLimit : money;
            state.getClass();
            cardState2.getClass();
            webNavigationHeaderModel2.getClass();
            webNavigationFooterViewModel2.getClass();
            fillrWebManager$FillrVersions2.getClass();
            restrictedItemState2.getClass();
            str8.getClass();
            webViewUseCase.getClass();
            planDetailsState2.getClass();
            merchantConfig2.getClass();
            str9.getClass();
            return new State(z4, cardState2, webNavigationHeaderModel2, webNavigationFooterViewModel2, z5, str5, str6, supCreateCardFlowEndResult2, str7, uri2, z6, fillrWebManager$FillrVersions2, restrictedItemState2, str8, webViewUseCase, z7, planDetailsState2, z8, merchantConfig2, cartError2, z9, autofillFooterViewModel2, z10, z11, str9, money2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return this.onCheckout == state.onCheckout && Intrinsics.areEqual(this.cardState, state.cardState) && Intrinsics.areEqual(this.headerViewModel, state.headerViewModel) && Intrinsics.areEqual(this.footerViewModel, state.footerViewModel) && this.fillrEnabled == state.fillrEnabled && Intrinsics.areEqual(this.currUrl, state.currUrl) && Intrinsics.areEqual(this.prevUrl, state.prevUrl) && Intrinsics.areEqual(this.supCheckoutEndResult, state.supCheckoutEndResult) && Intrinsics.areEqual(this.customUserAgent, state.customUserAgent) && Intrinsics.areEqual(this.monitoringScriptUrl, state.monitoringScriptUrl) && this.shouldMonitorWeb == state.shouldMonitorWeb && Intrinsics.areEqual(this.fillrVersions, state.fillrVersions) && Intrinsics.areEqual(this.restrictedItemState, state.restrictedItemState) && Intrinsics.areEqual(this.monitoringScriptVersion, state.monitoringScriptVersion) && this.webViewUseCase == state.webViewUseCase && this.addressAutofillEnabled == state.addressAutofillEnabled && Intrinsics.areEqual(this.planDetails, state.planDetails) && this.showedAddCardSheet == state.showedAddCardSheet && Intrinsics.areEqual(this.merchantConfig, state.merchantConfig) && this.cartError == state.cartError && this.trackedBrowserCheckoutLoad == state.trackedBrowserCheckoutLoad && Intrinsics.areEqual(this.autofillFooterViewModel, state.autofillFooterViewModel) && this.showAutofillSuccessToast == state.showAutofillSuccessToast && this.cashFillEnabled == state.cashFillEnabled && Intrinsics.areEqual(this.cashFillVersion, state.cashFillVersion) && Intrinsics.areEqual(this.supCreditLimit, state.supCreditLimit);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.footerViewModel.hashCode() + ((this.headerViewModel.hashCode() + ((this.cardState.hashCode() + (Boolean.hashCode(this.onCheckout) * 31)) * 31)) * 31)) * 31, 31, this.fillrEnabled);
            String str = this.currUrl;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.prevUrl;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            SupCreateCardFlowEndResult supCreateCardFlowEndResult = this.supCheckoutEndResult;
            int hashCode3 = (hashCode2 + (supCreateCardFlowEndResult == null ? 0 : supCreateCardFlowEndResult.hashCode())) * 31;
            String str3 = this.customUserAgent;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 961, false);
            Uri uri = this.monitoringScriptUrl;
            int hashCode4 = (this.merchantConfig.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.planDetails.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.webViewUseCase.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.restrictedItemState.hashCode() + ((this.fillrVersions.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m2 + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.shouldMonitorWeb)) * 31)) * 31, 31, this.monitoringScriptVersion)) * 31, 31, this.addressAutofillEnabled)) * 31, 31, this.showedAddCardSheet)) * 31;
            CartError cartError = this.cartError;
            int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (cartError == null ? 0 : cartError.hashCode())) * 31, 31, false), 31, this.trackedBrowserCheckoutLoad);
            AutofillFooterViewModel autofillFooterViewModel = this.autofillFooterViewModel;
            int m4 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m3 + (autofillFooterViewModel == null ? 0 : autofillFooterViewModel.hashCode())) * 31, 31, this.showAutofillSuccessToast), 31, this.cashFillEnabled), 31, this.cashFillVersion);
            Money money = this.supCreditLimit;
            return m4 + (money != null ? money.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("State(onCheckout=");
            sb.append(this.onCheckout);
            sb.append(", cardState=");
            sb.append(this.cardState);
            sb.append(", headerViewModel=");
            sb.append(this.headerViewModel);
            sb.append(", footerViewModel=");
            sb.append(this.footerViewModel);
            sb.append(", fillrEnabled=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.fillrEnabled, ", currUrl=", this.currUrl, ", prevUrl=");
            sb.append(this.prevUrl);
            sb.append(", supCheckoutEndResult=");
            sb.append(this.supCheckoutEndResult);
            sb.append(", customUserAgent=");
            sb.append(this.customUserAgent);
            sb.append(", pageLoadingFailed=false, errorCode=null, monitoringScriptUrl=");
            sb.append(this.monitoringScriptUrl);
            sb.append(", shouldMonitorWeb=");
            sb.append(this.shouldMonitorWeb);
            sb.append(", fillrVersions=");
            sb.append(this.fillrVersions);
            sb.append(", restrictedItemState=");
            sb.append(this.restrictedItemState);
            sb.append(", monitoringScriptVersion=");
            sb.append(this.monitoringScriptVersion);
            sb.append(", webViewUseCase=");
            sb.append(this.webViewUseCase);
            sb.append(", addressAutofillEnabled=");
            sb.append(this.addressAutofillEnabled);
            sb.append(", planDetails=");
            sb.append(this.planDetails);
            sb.append(", showedAddCardSheet=");
            sb.append(this.showedAddCardSheet);
            sb.append(", merchantConfig=");
            sb.append(this.merchantConfig);
            sb.append(", cartError=");
            sb.append(this.cartError);
            sb.append(", showedCheckoutSuccessDialog=false, trackedBrowserCheckoutLoad=");
            sb.append(this.trackedBrowserCheckoutLoad);
            sb.append(", autofillFooterViewModel=");
            sb.append(this.autofillFooterViewModel);
            sb.append(", showAutofillSuccessToast=");
            re$$ExternalSyntheticOutline0.m(sb, this.showAutofillSuccessToast, ", cashFillEnabled=", this.cashFillEnabled, ", cashFillVersion=");
            sb.append(this.cashFillVersion);
            sb.append(", supCreditLimit=");
            sb.append(this.supCreditLimit);
            sb.append(")");
            return sb.toString();
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AutofillQuestion.AutofillType.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AutofillQuestion.AutofillType autofillType = AutofillQuestion.AutofillType.SAVE;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AutofillQuestion.AutofillType autofillType2 = AutofillQuestion.AutofillType.SAVE;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AutofillQuestion.AutofillType autofillType3 = AutofillQuestion.AutofillType.SAVE;
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[CartError.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                CartError cartError = CartError.ABOVE_CREDIT_LIMIT;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                CartError cartError2 = CartError.ABOVE_CREDIT_LIMIT;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                CartError cartError3 = CartError.ABOVE_CREDIT_LIMIT;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                CartError cartError4 = CartError.ABOVE_CREDIT_LIMIT;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                CartError cartError5 = CartError.ABOVE_CREDIT_LIMIT;
                iArr2[5] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                CartError cartError6 = CartError.ABOVE_CREDIT_LIMIT;
                iArr2[6] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                CartError cartError7 = CartError.ABOVE_CREDIT_LIMIT;
                iArr2[7] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShoppingWebPresenter(BetterNavigator.ScreenNavigator screenNavigator, ShoppingWebScreen shoppingWebScreen, RealProfileManager realProfileManager, MerchantConfigService merchantConfigService, CheckoutService checkoutService, AnalyzeCartService analyzeCartService, ShippingAddressService shippingAddressService, IssuedCardManager issuedCardManager, AndroidStringManager androidStringManager, RealSettingsEligibilityManager realSettingsEligibilityManager, FeatureFlagManager featureFlagManager, SyncValueReader syncValueReader, Analytics analytics, ShoppingWebAnalytics$Factory$Impl shoppingWebAnalytics$Factory$Impl, RealBoostAnalyticsHelper realBoostAnalyticsHelper, RealShopHubAnalyticsHelper realShopHubAnalyticsHelper, RealOffersAnalyticsHelper realOffersAnalyticsHelper, RealAfterpayAppletAnalytics realAfterpayAppletAnalytics, RealBoostRepository realBoostRepository, FlowStarter flowStarter, CoroutineContext coroutineContext, AndroidClock androidClock, zzr zzrVar, CoroutineScope coroutineScope, BooleanPreference booleanPreference, BooleanPreference booleanPreference2, LocalizedMoneyFormatter.Factory factory, RealShoppingJavascriptPresenter$Factory$Impl realShoppingJavascriptPresenter$Factory$Impl, RealAutofillWebManagerProvider realAutofillWebManagerProvider, RealFillrWebManager realFillrWebManager, RealCashFillJsStore realCashFillJsStore, RealFileDownloader realFileDownloader, KeyValue keyValue, KeyValue keyValue2, RealUuidGenerator realUuidGenerator, RealClientSyncer realClientSyncer, com.squareup.kotterknife.Lazy lazy) {
        String entityToken;
        String str;
        EntityInformation entityInformation;
        String str2;
        EntityInformation entityInformation2;
        String entityToken2;
        String str3;
        EntityInformation entityInformation3;
        String str4;
        EntityInformation entityInformation4;
        String str5;
        EntityInformation entityInformation5;
        EntityInformation entityInformation6;
        String flowToken;
        InAppBrowserMetadata.EntityInformation entityInformation7;
        InAppBrowserMetadata.EntityInformation entityInformation8;
        InAppBrowserMetadata.EntityInformation entityInformation9;
        shoppingWebScreen.getClass();
        this.navigator = screenNavigator;
        this.args = shoppingWebScreen;
        this.profileManager = realProfileManager;
        this.merchantConfigService = merchantConfigService;
        this.checkoutService = checkoutService;
        this.analyzeCartService = analyzeCartService;
        this.shippingAddressService = shippingAddressService;
        this.issuedCardManager = issuedCardManager;
        this.stringManager = androidStringManager;
        this.settingsManager = realSettingsEligibilityManager;
        this.featureFlagManager = featureFlagManager;
        this.syncValueReader = syncValueReader;
        this.analytics = analytics;
        this.boostAnalyticsHelper = realBoostAnalyticsHelper;
        this.shopHubAnalyticsHelper = realShopHubAnalyticsHelper;
        this.offersAnalyticsHelper = realOffersAnalyticsHelper;
        this.afterpayAppletAnalytics = realAfterpayAppletAnalytics;
        this.boostRepository = realBoostRepository;
        this.flowStarter = flowStarter;
        this.ioDispatcher = coroutineContext;
        this.clock = androidClock;
        this.affiliateBrowserPlasmaFlowRepository = zzrVar;
        this.scope = coroutineScope;
        this.infoSheet = booleanPreference;
        this.afterpayInfoSheetViewed = booleanPreference2;
        this.fillrManager = realFillrWebManager;
        this.cashFillJsStore = realCashFillJsStore;
        this.fileDownloader = realFileDownloader;
        this.seenOfferAutofillSheet = keyValue;
        this.seenDetailSheetForINN = keyValue2;
        this.clientSyncer = realClientSyncer;
        this.singleUsePaymentManager = lazy;
        boolean z = false;
        z = false;
        JobKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(this, 0 == true ? 1 : 0, z ? 1 : 0), 1);
        this.initialMoneyFormatter = factory.create(MoneyFormatterConfig.STANDARD);
        JsonFeatureFlags$MobileDependenciesConfig.FillrConfig fillrConfig = ((JsonFeatureFlags$MobileDependenciesConfig.Config) ((FeatureFlag$JsonFeatureFlag.Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(JsonFeatureFlags$MobileDependenciesConfig.INSTANCE)).value).fillr;
        if (EmojiExclusions.getInfoContext(shoppingWebScreen) == InfoContext.SingleUseCardPayinFour || (fillrConfig.enabled && !CollectionsKt.contains(fillrConfig.merchantDenyList, EmojiExclusions.getMerchantToken(shoppingWebScreen)))) {
            z = true;
        }
        this.fillrEnabled = z;
        this.cashFillEnabled = !Intrinsics.areEqual(((FeatureFlag$StringFeatureFlag$Value) r12.peekCurrentValue(LaunchDarklyFeatureFlags$CashFillWalmartShoppingAutofillDisabled.INSTANCE)).value, "DISABLED");
        boolean z2 = shoppingWebScreen instanceof ShoppingWebScreen.ShoppingWebScreenV2;
        ShoppingWebScreen.ShoppingWebScreenV2 shoppingWebScreenV2 = z2 ? (ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen : null;
        if (shoppingWebScreenV2 == null || (entityInformation9 = shoppingWebScreenV2.entityInformation) == null || (entityToken = entityInformation9.entity_token) == null) {
            ShoppingScreenContext screenContext = shoppingWebScreen.getScreenContext();
            entityToken = screenContext != null ? EmojiExclusions.getEntityToken(screenContext) : null;
        }
        this.entityToken = entityToken;
        ShoppingWebScreen.ShoppingWebScreenV2 shoppingWebScreenV22 = z2 ? (ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen : null;
        if (shoppingWebScreenV22 == null || (entityInformation8 = shoppingWebScreenV22.entityInformation) == null || (str = entityInformation8.business_name) == null) {
            ShoppingScreenContext screenContext2 = shoppingWebScreen.getScreenContext();
            str = (screenContext2 == null || (entityInformation = EmojiExclusions.getEntityInformation(screenContext2)) == null) ? null : entityInformation.businessName;
        }
        this.businessName = str;
        ShoppingWebScreen.ShoppingWebScreenV2 shoppingWebScreenV23 = z2 ? (ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen : null;
        if (shoppingWebScreenV23 == null || (entityInformation7 = shoppingWebScreenV23.entityInformation) == null || (str2 = entityInformation7.business_token) == null) {
            ShoppingScreenContext screenContext3 = shoppingWebScreen.getScreenContext();
            str2 = (screenContext3 == null || (entityInformation2 = EmojiExclusions.getEntityInformation(screenContext3)) == null) ? null : entityInformation2.businessToken;
        }
        ShoppingScreenContext screenContext4 = shoppingWebScreen.getScreenContext();
        String flowToken2 = (screenContext4 == null || (flowToken2 = EmojiExclusions.getFlowToken(screenContext4)) == null) ? realShopHubAnalyticsHelper.getFlowToken(ShopHubAnalyticsHelper$Flow.SHOP) : flowToken2;
        this.flowToken = flowToken2;
        this.autofillManager = realAutofillWebManagerProvider.get(str2);
        this.cashWebMonitoringScript$delegate = LazyKt.lazy(new BottomSheet$$ExternalSyntheticLambda2(this, 19));
        RealShopHubAnalyticsHelper realShopHubAnalyticsHelper2 = (RealShopHubAnalyticsHelper) shoppingWebAnalytics$Factory$Impl.delegateFactory.analytics.getValue();
        realShopHubAnalyticsHelper2.getClass();
        shoppingWebScreen.getClass();
        RealBugReportSenderFactory realBugReportSenderFactory = new RealBugReportSenderFactory();
        realBugReportSenderFactory.bugReportService = shoppingWebScreen;
        realBugReportSenderFactory.endpoint = null;
        ShoppingScreenContext screenContext5 = shoppingWebScreen.getScreenContext();
        realBugReportSenderFactory.sessionManager = screenContext5 != null ? EmojiExclusions.toOrigin(screenContext5) : null;
        ShoppingScreenContext screenContext6 = shoppingWebScreen.getScreenContext();
        realBugReportSenderFactory.tempStorage = (screenContext6 == null || (flowToken = EmojiExclusions.getFlowToken(screenContext6)) == null) ? realShopHubAnalyticsHelper2.getFlowToken(ShopHubAnalyticsHelper$Flow.SHOP) : flowToken;
        realBugReportSenderFactory.preferences = shoppingWebScreen.getUrl();
        realBugReportSenderFactory.backStackDumper = shoppingWebScreen.getUrl();
        realBugReportSenderFactory.featureEligibilityDumper = EmojiExclusions.getInfoContext(shoppingWebScreen);
        boolean z3 = shoppingWebScreen instanceof ShoppingWebScreen.ShoppingWebScreenV2;
        if (z3) {
            entityToken2 = ((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen).entityInformation.entity_token;
        } else {
            ShoppingScreenContext screenContext7 = shoppingWebScreen.getScreenContext();
            entityToken2 = screenContext7 != null ? EmojiExclusions.getEntityToken(screenContext7) : null;
        }
        realBugReportSenderFactory.cashDatabase = entityToken2;
        if (z3) {
            str3 = ((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen).entityInformation.entity_name;
        } else {
            ShoppingScreenContext screenContext8 = shoppingWebScreen.getScreenContext();
            str3 = (screenContext8 == null || (entityInformation3 = EmojiExclusions.getEntityInformation(screenContext8)) == null) ? null : entityInformation3.entityName;
        }
        realBugReportSenderFactory.endpointContext = str3;
        ShoppingScreenContext screenContext9 = shoppingWebScreen.getScreenContext();
        realBugReportSenderFactory.scope = (screenContext9 == null || (entityInformation6 = EmojiExclusions.getEntityInformation(screenContext9)) == null) ? null : entityInformation6.entityType;
        if (z3) {
            str4 = ((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen).entityInformation.business_name;
        } else {
            ShoppingScreenContext screenContext10 = shoppingWebScreen.getScreenContext();
            str4 = (screenContext10 == null || (entityInformation4 = EmojiExclusions.getEntityInformation(screenContext10)) == null) ? null : entityInformation4.businessName;
        }
        realBugReportSenderFactory.bugsnagClient = str4;
        if (z3) {
            str5 = ((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen).entityInformation.business_token;
        } else {
            ShoppingScreenContext screenContext11 = shoppingWebScreen.getScreenContext();
            str5 = (screenContext11 == null || (entityInformation5 = EmojiExclusions.getEntityInformation(screenContext11)) == null) ? null : entityInformation5.businessToken;
        }
        realBugReportSenderFactory.recentMoneybotSession = str5;
        this.shoppingWebAnalytics = realBugReportSenderFactory;
        ShoppingScreenContext screenContext12 = shoppingWebScreen.getScreenContext();
        this.autofillAnalyticsParam = new AutofillAnalyticsParam(screenContext12 != null ? EmojiExclusions.toOrigin(screenContext12) : null, EmojiExclusions.getInfoContext(shoppingWebScreen), flowToken2, str2, str);
        RealShoppingJavascriptPresenter.MetroFactory metroFactory = realShoppingJavascriptPresenter$Factory$Impl.delegateFactory;
        CoroutineContext coroutineContext2 = (CoroutineContext) metroFactory.ioDispatcher.lambda.invoke();
        Analytics analytics2 = (Analytics) metroFactory.analytics.getValue();
        AndroidStringManager androidStringManager2 = (AndroidStringManager) metroFactory.stringManager.lambda.invoke();
        RealAutofillWebManagerProvider realAutofillWebManagerProvider2 = (RealAutofillWebManagerProvider) metroFactory.autofillManagerProvider.invoke();
        CashApProxyClientService cashApProxyClientService = (CashApProxyClientService) metroFactory.cashApProxyService.getValue();
        AppService appService = (AppService) metroFactory.franklinAppService.getValue();
        RealShopHubAnalyticsHelper realShopHubAnalyticsHelper3 = (RealShopHubAnalyticsHelper) metroFactory.shopHubAnalyticsHelper.getValue();
        FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) metroFactory.featureFlagManager.getValue();
        coroutineContext2.getClass();
        analytics2.getClass();
        androidStringManager2.getClass();
        realAutofillWebManagerProvider2.getClass();
        cashApProxyClientService.getClass();
        appService.getClass();
        realShopHubAnalyticsHelper3.getClass();
        featureFlagManager2.getClass();
        this.shoppingJsPresenter = new RealShoppingJavascriptPresenter(shoppingWebScreen, screenNavigator, realBugReportSenderFactory, coroutineContext2, analytics2, androidStringManager2, realAutofillWebManagerProvider2, cashApProxyClientService, appService, realShopHubAnalyticsHelper3, featureFlagManager2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Comparable access$downloadMonitoringScript(ShoppingWebPresenter shoppingWebPresenter, ContinuationImpl continuationImpl) {
        ShoppingWebPresenter$downloadMonitoringScript$1 shoppingWebPresenter$downloadMonitoringScript$1;
        Object obj;
        int i;
        Uri uri;
        String str;
        Lazy lazy = shoppingWebPresenter.cashWebMonitoringScript$delegate;
        RealFileDownloader realFileDownloader = shoppingWebPresenter.fileDownloader;
        if (continuationImpl instanceof ShoppingWebPresenter$downloadMonitoringScript$1) {
            shoppingWebPresenter$downloadMonitoringScript$1 = (ShoppingWebPresenter$downloadMonitoringScript$1) continuationImpl;
            int i2 = shoppingWebPresenter$downloadMonitoringScript$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                shoppingWebPresenter$downloadMonitoringScript$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = shoppingWebPresenter$downloadMonitoringScript$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shoppingWebPresenter$downloadMonitoringScript$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str2 = ((JsonFeatureFlags$CashWebMonitoringScript.WebMonitoringOptions) lazy.getValue()).scriptRootFolderPath;
                    String str3 = ((JsonFeatureFlags$CashWebMonitoringScript.WebMonitoringOptions) lazy.getValue()).scriptVersion;
                    HttpUrl.Builder builder = new HttpUrl.Builder();
                    builder.scheme("https");
                    builder.host("franklin-assets.s3.amazonaws.com");
                    str2.getClass();
                    builder.addPathSegments(str2, true);
                    builder.addPathSegment(str3);
                    builder.addPathSegment("android");
                    builder.addPathSegment("main.js");
                    String str4 = builder.build().url;
                    String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("monitoringscript-", str3, ".js");
                    FileDownloader$Category fileDownloader$Category = FileDownloader$Category.SCRIPT;
                    Uri localUri = realFileDownloader.localUri(fileDownloader$Category, m);
                    if (realFileDownloader.ready(fileDownloader$Category, m)) {
                        return localUri;
                    }
                    CoroutineContext coroutineContext = shoppingWebPresenter.ioDispatcher;
                    AndroidFileSaver$save$2 androidFileSaver$save$2 = new AndroidFileSaver$save$2(shoppingWebPresenter, m, str4, continuation, 28);
                    shoppingWebPresenter$downloadMonitoringScript$1.L$3 = str4;
                    shoppingWebPresenter$downloadMonitoringScript$1.L$5 = localUri;
                    shoppingWebPresenter$downloadMonitoringScript$1.label = 1;
                    obj = JobKt.withContext(coroutineContext, androidFileSaver$save$2, shoppingWebPresenter$downloadMonitoringScript$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    uri = localUri;
                    str = str4;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uri = shoppingWebPresenter$downloadMonitoringScript$1.L$5;
                    str = shoppingWebPresenter$downloadMonitoringScript$1.L$3;
                    SafeTrace.throwOnFailure(obj);
                }
                if (((FileDownloader$DownloadStatus) obj) != FileDownloader$DownloadStatus.SUCCESS) {
                    return uri;
                }
                Timber.Forest forest = Timber.Forest;
                forest.e(Recorder$$ExternalSyntheticOutline2.m("Error downloading Shop Web Monitoring script at url ", str), new Object[0]);
                forest.e(new IOException("Failure at downloading Shop Web Monitoring script"));
                return null;
            }
        }
        shoppingWebPresenter$downloadMonitoringScript$1 = new ShoppingWebPresenter$downloadMonitoringScript$1(shoppingWebPresenter, continuationImpl);
        obj = shoppingWebPresenter$downloadMonitoringScript$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shoppingWebPresenter$downloadMonitoringScript$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        if (((FileDownloader$DownloadStatus) obj) != FileDownloader$DownloadStatus.SUCCESS) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CartError access$getCartError(ShoppingWebPresenter shoppingWebPresenter, FillrCartInformationExtraction$FillrCartInformation fillrCartInformationExtraction$FillrCartInformation, MerchantConfig merchantConfig, RestrictedItemState restrictedItemState) {
        boolean z;
        Integer num;
        Long l;
        Boolean bool;
        Long l2;
        Boolean bool2;
        if (spendingLimitReached(merchantConfig)) {
            return CartError.SPENDING_LIMIT_REACHED;
        }
        if (loanLimitReached(merchantConfig)) {
            return CartError.LOAN_LIMIT_REACHED;
        }
        Integer num2 = fillrCartInformationExtraction$FillrCartInformation != null ? fillrCartInformationExtraction$FillrCartInformation.total : null;
        Money money = merchantConfig.availableLimit;
        boolean z2 = false;
        if (money != null && (l2 = money.amount) != null) {
            long longValue = l2.longValue();
            if (num2 != null) {
                bool2 = Boolean.valueOf(((long) num2.intValue()) > longValue);
            } else {
                bool2 = null;
            }
            if (bool2 != null) {
                z = bool2.booleanValue();
                if (!z) {
                    return CartError.ABOVE_CREDIT_LIMIT;
                }
                if (getFirstRestrictedItemOrNull(fillrCartInformationExtraction$FillrCartInformation, restrictedItemState) != null) {
                    return CartError.RESTRICTED_ITEMS;
                }
                Integer num3 = fillrCartInformationExtraction$FillrCartInformation != null ? fillrCartInformationExtraction$FillrCartInformation.total : null;
                Money money2 = merchantConfig.cartMinimum;
                if (money2 != null && (l = money2.amount) != null) {
                    long longValue2 = l.longValue();
                    if (num3 != null) {
                        bool = Boolean.valueOf(((long) num3.intValue()) < longValue2);
                    } else {
                        bool = null;
                    }
                    if (bool != null) {
                        z2 = bool.booleanValue();
                    }
                }
                if (z2) {
                    return CartError.BELOW_CART_MINIMUM;
                }
                if (fillrCartInformationExtraction$FillrCartInformation != null && (num = fillrCartInformationExtraction$FillrCartInformation.cart_total_qty) != null && num.intValue() == 0) {
                    return CartError.EMPTY_CART;
                }
                if (fillrCartInformationExtraction$FillrCartInformation == null) {
                    return CartError.CART_NOT_DETECTED;
                }
                Boolean bool3 = restrictedItemState.querySuccess;
                Boolean bool4 = Boolean.FALSE;
                if (Intrinsics.areEqual(bool3, bool4) || Intrinsics.areEqual(merchantConfig.querySuccess, bool4)) {
                    return CartError.CONNECTION_FAILED;
                }
                return null;
            }
        }
        z = false;
        if (!z) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$getMerchantConfig(ShoppingWebPresenter shoppingWebPresenter, String str, ContinuationImpl continuationImpl) {
        ShoppingWebPresenter$getMerchantConfig$1 shoppingWebPresenter$getMerchantConfig$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof ShoppingWebPresenter$getMerchantConfig$1) {
            shoppingWebPresenter$getMerchantConfig$1 = (ShoppingWebPresenter$getMerchantConfig$1) continuationImpl;
            int i2 = shoppingWebPresenter$getMerchantConfig$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                shoppingWebPresenter$getMerchantConfig$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = shoppingWebPresenter$getMerchantConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shoppingWebPresenter$getMerchantConfig$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    MerchantConfigService merchantConfigService = shoppingWebPresenter.merchantConfigService;
                    GetMerchantConfigRequest getMerchantConfigRequest = new GetMerchantConfigRequest(null, null, str, ByteString.EMPTY);
                    shoppingWebPresenter$getMerchantConfig$1.label = 1;
                    obj = merchantConfigService.getMerchantConfig(getMerchantConfigRequest, shoppingWebPresenter$getMerchantConfig$1);
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
                if (!(apiResult instanceof ApiResult.Failure)) {
                    return new MerchantConfig(31);
                }
                if (!(apiResult instanceof ApiResult.Success)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                GetMerchantConfigResponse getMerchantConfigResponse = (GetMerchantConfigResponse) ((ApiResult.Success) apiResult).response;
                Boolean bool = getMerchantConfigResponse.card_on_file;
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                AvailableCreditLimit availableCreditLimit = getMerchantConfigResponse.available_credit_limit;
                return new MerchantConfig(booleanValue, availableCreditLimit != null ? availableCreditLimit.cart_minimum : null, availableCreditLimit != null ? availableCreditLimit.available_limit : null, getMerchantConfigResponse.loan_limit, getMerchantConfigResponse.active_loans, Boolean.TRUE);
            }
        }
        shoppingWebPresenter$getMerchantConfig$1 = new ShoppingWebPresenter$getMerchantConfig$1(shoppingWebPresenter, continuationImpl);
        Object obj2 = shoppingWebPresenter$getMerchantConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shoppingWebPresenter$getMerchantConfig$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$getRestrictedItemsFromBackend(ShoppingWebPresenter shoppingWebPresenter, FillrCartInformationExtraction$FillrCartInformation fillrCartInformationExtraction$FillrCartInformation, RestrictedItemCheckRequest.PaymentMethod paymentMethod, String str, String str2, ContinuationImpl continuationImpl) {
        ShoppingWebPresenter$getRestrictedItemsFromBackend$1 shoppingWebPresenter$getRestrictedItemsFromBackend$1;
        int i;
        ArrayList<FillrCartInformationExtraction$FillrCartProduct> arrayList;
        ApiResult apiResult;
        if (continuationImpl instanceof ShoppingWebPresenter$getRestrictedItemsFromBackend$1) {
            shoppingWebPresenter$getRestrictedItemsFromBackend$1 = (ShoppingWebPresenter$getRestrictedItemsFromBackend$1) continuationImpl;
            int i2 = shoppingWebPresenter$getRestrictedItemsFromBackend$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                shoppingWebPresenter$getRestrictedItemsFromBackend$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = shoppingWebPresenter$getRestrictedItemsFromBackend$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shoppingWebPresenter$getRestrictedItemsFromBackend$1.label;
                FillrCartInformationExtraction$FillrCartProduct fillrCartInformationExtraction$FillrCartProduct = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (fillrCartInformationExtraction$FillrCartInformation != null) {
                        arrayList = fillrCartInformationExtraction$FillrCartInformation.products;
                        if (arrayList.isEmpty()) {
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            AnalyzeCartService analyzeCartService = shoppingWebPresenter.analyzeCartService;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                            for (FillrCartInformationExtraction$FillrCartProduct fillrCartInformationExtraction$FillrCartProduct2 : arrayList) {
                                arrayList2.add(new ShoppingCartProduct(fillrCartInformationExtraction$FillrCartProduct2.name, fillrCartInformationExtraction$FillrCartProduct2.url, fillrCartInformationExtraction$FillrCartProduct2.imageUrl, ByteString.EMPTY));
                            }
                            ShoppingWebScreen shoppingWebScreen = shoppingWebPresenter.args;
                            ShoppingWebScreen.ShoppingWebScreenV2 shoppingWebScreenV2 = shoppingWebScreen instanceof ShoppingWebScreen.ShoppingWebScreenV2 ? (ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen : null;
                            IabMetadata iabMetadata = shoppingWebScreenV2 != null ? shoppingWebScreenV2.metadata : null;
                            IabMetadata.SUPMetadata sUPMetadata = iabMetadata instanceof IabMetadata.SUPMetadata ? (IabMetadata.SUPMetadata) iabMetadata : null;
                            RestrictedItemCheckRequest restrictedItemCheckRequest = new RestrictedItemCheckRequest(arrayList2, paymentMethod, str, null, str2, sUPMetadata != null ? sUPMetadata.supToken : null, ByteString.EMPTY);
                            shoppingWebPresenter$getRestrictedItemsFromBackend$1.L$4 = arrayList;
                            shoppingWebPresenter$getRestrictedItemsFromBackend$1.label = 1;
                            obj = analyzeCartService.restrictedItemCheck(restrictedItemCheckRequest, shoppingWebPresenter$getRestrictedItemsFromBackend$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    return new RestrictedItemState(null, null);
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                arrayList = shoppingWebPresenter$getRestrictedItemsFromBackend$1.L$4;
                SafeTrace.throwOnFailure(obj);
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    ApiResult.Failure.HttpFailure httpFailure = apiResult instanceof ApiResult.Failure.HttpFailure ? (ApiResult.Failure.HttpFailure) apiResult : null;
                    Integer num = httpFailure != null ? new Integer(httpFailure.code) : null;
                    Analytics analytics = shoppingWebPresenter.analytics;
                    RealBugReportSenderFactory realBugReportSenderFactory = shoppingWebPresenter.shoppingWebAnalytics;
                    realBugReportSenderFactory.getClass();
                    analytics.track(new BrowserCheckoutRestrictedItemFailApiCall((InfoContext) realBugReportSenderFactory.featureEligibilityDumper, num, (String) realBugReportSenderFactory.cashDatabase, (String) realBugReportSenderFactory.tempStorage), null);
                    return new RestrictedItemState(Boolean.FALSE, null);
                }
                if (!(apiResult instanceof ApiResult.Success)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                BlockedItem blockedItem = (BlockedItem) CollectionsKt.firstOrNull(((RestrictedItemCheckResponse) ((ApiResult.Success) apiResult).response).blocked_items);
                if (blockedItem != null) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (Intrinsics.areEqual(((FillrCartInformationExtraction$FillrCartProduct) next).name, blockedItem.name)) {
                            fillrCartInformationExtraction$FillrCartProduct = next;
                            break;
                        }
                    }
                    fillrCartInformationExtraction$FillrCartProduct = fillrCartInformationExtraction$FillrCartProduct;
                }
                return new RestrictedItemState(Boolean.TRUE, fillrCartInformationExtraction$FillrCartProduct);
            }
        }
        shoppingWebPresenter$getRestrictedItemsFromBackend$1 = new ShoppingWebPresenter$getRestrictedItemsFromBackend$1(shoppingWebPresenter, continuationImpl);
        Object obj2 = shoppingWebPresenter$getRestrictedItemsFromBackend$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shoppingWebPresenter$getRestrictedItemsFromBackend$1.label;
        FillrCartInformationExtraction$FillrCartProduct fillrCartInformationExtraction$FillrCartProduct3 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
    }

    public static final boolean access$isComplete(ShoppingWebPresenter shoppingWebPresenter, ShippingAddress shippingAddress) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        GlobalAddress globalAddress = shippingAddress.global_address;
        FullName fullName = shippingAddress.full_name;
        return (globalAddress == null || (str = globalAddress.address_line_1) == null || !(StringsKt.isBlank(str) ^ true) || (str2 = globalAddress.locality) == null || !(StringsKt.isBlank(str2) ^ true) || (str3 = globalAddress.administrative_district_level_1) == null || !(StringsKt.isBlank(str3) ^ true) || (str4 = globalAddress.postal_code) == null || !(StringsKt.isBlank(str4) ^ true) || (str5 = shippingAddress.email) == null || !(StringsKt.isBlank(str5) ^ true) || fullName == null || (str6 = fullName.given_name) == null || !(StringsKt.isBlank(str6) ^ true) || (str7 = fullName.family_name) == null || !(StringsKt.isBlank(str7) ^ true)) ? false : true;
    }

    public static final State access$models$lambda$13(MutableState mutableState) {
        return (State) mutableState.getValue();
    }

    public static final void access$openSupHalfSheet(ShoppingWebPresenter shoppingWebPresenter, String str, State state, ShoppingWebScreen.ShoppingWebScreenV2 shoppingWebScreenV2) {
        BetterNavigator.ScreenNavigator screenNavigator = shoppingWebPresenter.navigator;
        RealBugReportSenderFactory realBugReportSenderFactory = shoppingWebPresenter.shoppingWebAnalytics;
        Analytics analytics = shoppingWebPresenter.analytics;
        ShoppingWebScreen shoppingWebScreen = shoppingWebPresenter.args;
        if (state.planDetails.downPayment != null) {
            analytics.track(new BrowserCheckoutViewPaymentPlanDetails((BrowserOrigin) realBugReportSenderFactory.sessionManager, (InfoContext) realBugReportSenderFactory.featureEligibilityDumper, (String) realBugReportSenderFactory.tempStorage, (String) realBugReportSenderFactory.backStackDumper, (String) realBugReportSenderFactory.cashDatabase), null);
            PlanDetailsState planDetailsState = state.planDetails;
            String str2 = planDetailsState.downPayment;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = planDetailsState.estimatedTotal;
            String str4 = str3 != null ? str3 : "";
            String str5 = shoppingWebPresenter.flowToken;
            InfoContext infoContext = EmojiExclusions.getInfoContext(shoppingWebScreen);
            ShoppingScreenContext screenContext = shoppingWebScreen.getScreenContext();
            screenNavigator.goTo(new SingleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen(str2, str4, new SingleUsePaymentAnalyticsParam(screenContext != null ? EmojiExclusions.toOrigin(screenContext) : null, infoContext, str5, shoppingWebScreen.getUrl(), shoppingWebPresenter.entityToken)));
            return;
        }
        if (str != null) {
            analytics.track(new BrowserCheckoutSingleUsePaymentStart((BrowserOrigin) realBugReportSenderFactory.sessionManager, (InfoContext) realBugReportSenderFactory.featureEligibilityDumper, (String) realBugReportSenderFactory.tempStorage, (String) realBugReportSenderFactory.backStackDumper, (String) realBugReportSenderFactory.cashDatabase), null);
            MoneyFormatter moneyFormatter = shoppingWebPresenter.initialMoneyFormatter;
            Money money = state.merchantConfig.availableLimit;
            money.getClass();
            String format2 = moneyFormatter.format(money);
            String str6 = shoppingWebPresenter.businessName;
            str6.getClass();
            CheckoutScreenType.ReviewPlan reviewPlan = new CheckoutScreenType.ReviewPlan(format2, str6);
            String str7 = shoppingWebPresenter.flowToken;
            InfoContext infoContext2 = EmojiExclusions.getInfoContext(shoppingWebScreen);
            ShoppingScreenContext screenContext2 = shoppingWebScreen.getScreenContext();
            screenNavigator.goTo(new SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen(reviewPlan, str, shoppingWebScreenV2, new SingleUsePaymentAnalyticsParam(screenContext2 != null ? EmojiExclusions.toOrigin(screenContext2) : null, infoContext2, str7, shoppingWebScreen.getUrl(), shoppingWebPresenter.entityToken)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$retrievePlanDetails(ShoppingWebPresenter shoppingWebPresenter, String str, ContinuationImpl continuationImpl) {
        ShoppingWebPresenter$retrievePlanDetails$1 shoppingWebPresenter$retrievePlanDetails$1;
        int i;
        ApiResult apiResult;
        MoneyFormatter moneyFormatter = shoppingWebPresenter.initialMoneyFormatter;
        if (continuationImpl instanceof ShoppingWebPresenter$retrievePlanDetails$1) {
            shoppingWebPresenter$retrievePlanDetails$1 = (ShoppingWebPresenter$retrievePlanDetails$1) continuationImpl;
            int i2 = shoppingWebPresenter$retrievePlanDetails$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                shoppingWebPresenter$retrievePlanDetails$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = shoppingWebPresenter$retrievePlanDetails$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shoppingWebPresenter$retrievePlanDetails$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CheckoutService checkoutService = shoppingWebPresenter.checkoutService;
                    RetrievePlanDetailsRequest retrievePlanDetailsRequest = new RetrievePlanDetailsRequest(str, ByteString.EMPTY);
                    shoppingWebPresenter$retrievePlanDetails$1.label = 1;
                    obj = checkoutService.retrievePlanDetails(retrievePlanDetailsRequest, shoppingWebPresenter$retrievePlanDetails$1);
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
                if (!(apiResult instanceof ApiResult.Failure)) {
                    return new PlanDetailsState(null, null);
                }
                if (!(apiResult instanceof ApiResult.Success)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                RetrievePlanDetailsResponse retrievePlanDetailsResponse = (RetrievePlanDetailsResponse) ((ApiResult.Success) apiResult).response;
                Money money = retrievePlanDetailsResponse.down_payment;
                String format2 = money != null ? moneyFormatter.format(money) : null;
                Money money2 = retrievePlanDetailsResponse.estimated_total;
                return new PlanDetailsState(format2, money2 != null ? moneyFormatter.format(money2) : null);
            }
        }
        shoppingWebPresenter$retrievePlanDetails$1 = new ShoppingWebPresenter$retrievePlanDetails$1(shoppingWebPresenter, continuationImpl);
        Object obj2 = shoppingWebPresenter$retrievePlanDetails$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shoppingWebPresenter$retrievePlanDetails$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$setInitialActiveBoost(ShoppingWebPresenter shoppingWebPresenter, ContinuationImpl continuationImpl) {
        ShoppingWebPresenter$setInitialActiveBoost$1 shoppingWebPresenter$setInitialActiveBoost$1;
        int i;
        String str;
        List list;
        if (continuationImpl instanceof ShoppingWebPresenter$setInitialActiveBoost$1) {
            shoppingWebPresenter$setInitialActiveBoost$1 = (ShoppingWebPresenter$setInitialActiveBoost$1) continuationImpl;
            int i2 = shoppingWebPresenter$setInitialActiveBoost$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                shoppingWebPresenter$setInitialActiveBoost$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = shoppingWebPresenter$setInitialActiveBoost$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shoppingWebPresenter$setInitialActiveBoost$1.label;
                String str2 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ShoppingWebScreen shoppingWebScreen = shoppingWebPresenter.args;
                    if (!(shoppingWebScreen instanceof ShoppingWebScreen.AffiliateShoppingScreen) && !ExifInterfaceUtils.isVersion2WithCorrectMetadata(shoppingWebScreen, WebViewUseCase.AFFILIATE)) {
                        shoppingWebScreen = null;
                    }
                    if (shoppingWebScreen != null) {
                        if (shoppingWebScreen instanceof ShoppingWebScreen.AffiliateShoppingScreen) {
                            str2 = ((ShoppingWebScreen.AffiliateShoppingScreen) shoppingWebScreen).rewardToken;
                        } else if (shoppingWebScreen instanceof ShoppingWebScreen.ShoppingWebScreenV2) {
                            IabMetadata iabMetadata = ((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen).metadata;
                            iabMetadata.getClass();
                            str2 = ((IabMetadata.AffiliateBoostMetadata) iabMetadata).boostToken;
                        }
                        Flow boostSlots = shoppingWebPresenter.boostRepository.boostProvider.getBoostSlots(false);
                        shoppingWebPresenter$setInitialActiveBoost$1.L$1 = str2;
                        shoppingWebPresenter$setInitialActiveBoost$1.label = 1;
                        obj = FlowKt.firstOrNull(boostSlots, shoppingWebPresenter$setInitialActiveBoost$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str = str2;
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = shoppingWebPresenter$setInitialActiveBoost$1.L$1;
                SafeTrace.throwOnFailure(obj);
                list = (List) obj;
                if (list != null) {
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Slots) it.next()).token);
                    }
                    String str3 = (String) CollectionsKt.first((List) arrayList);
                    if (str3 != null) {
                        if (str3.equals(str)) {
                            return Unit.INSTANCE;
                        }
                        shoppingWebPresenter.initialActiveBoostToken = str3;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        shoppingWebPresenter$setInitialActiveBoost$1 = new ShoppingWebPresenter$setInitialActiveBoost$1(shoppingWebPresenter, continuationImpl);
        Object obj2 = shoppingWebPresenter$setInitialActiveBoost$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shoppingWebPresenter$setInitialActiveBoost$1.label;
        String str22 = null;
        if (i != 0) {
        }
        list = (List) obj2;
        if (list != null) {
        }
        return Unit.INSTANCE;
    }

    public static final void access$showAfterpayDetailsSheet(ShoppingWebPresenter shoppingWebPresenter) {
        String str;
        EntityInformation entityInformation;
        SheetType sheetType = SheetType.DETAIL_SHEET;
        OfferType offerType = OfferType.PAY_LATER_INN;
        ShoppingWebScreen shoppingWebScreen = shoppingWebPresenter.args;
        shoppingWebScreen.getClass();
        BlockersData.MoneybotContext moneybotContext = null;
        if (shoppingWebScreen instanceof ShoppingWebScreen.ShoppingWebScreenV2) {
            str = ((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen).entityInformation.business_token;
        } else {
            ShoppingScreenContext screenContext = shoppingWebScreen.getScreenContext();
            str = (screenContext == null || (entityInformation = EmojiExclusions.getEntityInformation(screenContext)) == null) ? null : entityInformation.businessToken;
        }
        OfferSheetKey$IdentifierToken$MerchantToken offerSheetKey$IdentifierToken$MerchantToken = str != null ? new OfferSheetKey$IdentifierToken$MerchantToken(str) : null;
        Alignment.Companion companion = OfferSheetKey.PresentingContext.Companion;
        shoppingWebPresenter.navigator.goTo(new OffersScreen$OffersDetailsScreen(new OfferSheetKey(sheetType, offerType, offerSheetKey$IdentifierToken$MerchantToken, 48), shoppingWebScreen, moneybotContext, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG1));
    }

    public static final void access$showSupInitialHalfSheet(ShoppingWebPresenter shoppingWebPresenter, MerchantConfig merchantConfig, boolean z, Money money) {
        BetterNavigator.ScreenNavigator screenNavigator = shoppingWebPresenter.navigator;
        if (loanLimitReached(merchantConfig)) {
            screenNavigator.goTo(new SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen(new CheckoutScreenType.LoanLimitReached(money), null, null, null));
            return;
        }
        if (spendingLimitReached(merchantConfig)) {
            screenNavigator.goTo(new SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen(CheckoutScreenType.SpendingLimitReached.INSTANCE, null, null, null));
            return;
        }
        ShoppingWebScreen shoppingWebScreen = shoppingWebPresenter.args;
        if (shoppingWebScreen instanceof ShoppingWebScreen.ShoppingWebScreenV2) {
            if (z && (((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen).screenContext instanceof ShoppingScreenContext.OffersTimelineSheet)) {
                return;
            }
            screenNavigator.goTo(shoppingWebPresenter.getTimelineSheetScreenForArgs((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen));
        }
    }

    public static String formattedCardTotal(Integer num) {
        return String.format("$%.2f", Arrays.copyOf(new Object[]{num != null ? Double.valueOf(num.intValue() * 0.01d) : 0}, 1));
    }

    public static FillrCartInformationExtraction$FillrCartProduct getFirstRestrictedItemOrNull(FillrCartInformationExtraction$FillrCartInformation fillrCartInformationExtraction$FillrCartInformation, RestrictedItemState restrictedItemState) {
        if (Intrinsics.areEqual(restrictedItemState.querySuccess, Boolean.TRUE)) {
            return restrictedItemState.firstRestrictedItemFromBackend;
        }
        if (fillrCartInformationExtraction$FillrCartInformation != null) {
            return restrictedItemOrNull(fillrCartInformationExtraction$FillrCartInformation);
        }
        return null;
    }

    public static boolean loanLimitReached(MerchantConfig merchantConfig) {
        Long l = merchantConfig.loanLimit;
        if (l == null) {
            return false;
        }
        long longValue = l.longValue();
        Long l2 = merchantConfig.activeLoans;
        return l2 != null && longValue == l2.longValue();
    }

    public static final void models$composeAffiliateScreen(ShoppingWebPresenter shoppingWebPresenter, MutableState mutableState, GapComposer gapComposer) {
        FinishSetupTileBadgeCounter issuedCardOrNull = ((RealIssuedCardManager) shoppingWebPresenter.issuedCardManager).getIssuedCardOrNull();
        Continuation continuation = null;
        Updater.LaunchedEffect(gapComposer, issuedCardOrNull, new BasicShieetKt$BasicShieet$4$1(issuedCardOrNull, continuation, mutableState, 21));
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(shoppingWebPresenter);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new AnonymousClass1(shoppingWebPresenter, continuation, 4);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
    }

    public static final void models$composeIncentiveScreen(ShoppingWebPresenter shoppingWebPresenter, MutableState mutableState) {
        String userAgent = shoppingWebPresenter.args.getUserAgent();
        if (userAgent != null) {
            mutableState.setValue(State.copy$default((State) mutableState.getValue(), false, null, null, null, null, null, null, userAgent, null, null, null, null, false, null, null, null, null, false, null, 536870655));
        }
    }

    public static FillrCartInformationExtraction$FillrCartProduct restrictedItemOrNull(FillrCartInformationExtraction$FillrCartInformation fillrCartInformationExtraction$FillrCartInformation) {
        String str;
        String str2;
        Object obj = null;
        if (fillrCartInformationExtraction$FillrCartInformation == null) {
            return null;
        }
        Iterator it = fillrCartInformationExtraction$FillrCartInformation.products.iterator();
        loop0: while (it.hasNext()) {
            Object next = it.next();
            FillrCartInformationExtraction$FillrCartProduct fillrCartInformationExtraction$FillrCartProduct = (FillrCartInformationExtraction$FillrCartProduct) next;
            fillrCartInformationExtraction$FillrCartProduct.getClass();
            Set<String> set = RESTRICTED_KEYWORDS;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                for (String str3 : set) {
                    String str4 = fillrCartInformationExtraction$FillrCartProduct.name;
                    if ((str4 != null && StringsKt.contains((CharSequence) str4, (CharSequence) str3, true)) || (((str = fillrCartInformationExtraction$FillrCartProduct.imageUrl) != null && StringsKt.contains((CharSequence) str, (CharSequence) str3, true)) || ((str2 = fillrCartInformationExtraction$FillrCartProduct.url) != null && StringsKt.contains((CharSequence) str2, (CharSequence) str3, true)))) {
                        obj = next;
                        break loop0;
                    }
                }
            }
        }
        return (FillrCartInformationExtraction$FillrCartProduct) obj;
    }

    public static boolean spendingLimitReached(MerchantConfig merchantConfig) {
        Long l;
        Boolean bool;
        Long l2;
        Money money = merchantConfig.availableLimit;
        if (money != null && (l = money.amount) != null) {
            long longValue = l.longValue();
            Money money2 = merchantConfig.cartMinimum;
            if (money2 == null || (l2 = money2.amount) == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(l2.longValue() > longValue);
            }
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }

    public static DerivedSize.Companion toBoostAppLocation(ShoppingScreenContext shoppingScreenContext) {
        if (shoppingScreenContext instanceof ShoppingScreenContext.CardTab) {
            return BoostAppLocation$CardTab.INSTANCE;
        }
        if (shoppingScreenContext instanceof ShoppingScreenContext.MerchantProfile) {
            return new BoostAppLocation$MerchantProfile(((ShoppingScreenContext.MerchantProfile) shoppingScreenContext).discoverFlowToken);
        }
        if (shoppingScreenContext instanceof ShoppingScreenContext.Directory) {
            return new BoostAppLocation$ProfileDirectory(((ShoppingScreenContext.Directory) shoppingScreenContext).discoverFlowToken);
        }
        if (shoppingScreenContext instanceof ShoppingScreenContext.DirectorySearch) {
            return new BoostAppLocation$ProfileDirectory(((ShoppingScreenContext.DirectorySearch) shoppingScreenContext).discoverFlowToken);
        }
        if (shoppingScreenContext instanceof ShoppingScreenContext.OffersTab) {
            return new BoostAppLocation$OffersDetail(AppLocation.Browser);
        }
        return null;
    }

    public final String formatMoney(RewardAmount rewardAmount) {
        zzuk zzukVar = rewardAmount.data;
        if (zzukVar != null) {
            RewardAmount$Data$RewardRelativeAmount rewardAmount$Data$RewardRelativeAmount = zzukVar instanceof RewardAmount$Data$RewardRelativeAmount ? (RewardAmount$Data$RewardRelativeAmount) zzukVar : null;
            RewardRelativeAmount rewardRelativeAmount = rewardAmount$Data$RewardRelativeAmount != null ? rewardAmount$Data$RewardRelativeAmount.value : null;
            if (rewardRelativeAmount != null) {
                return Boxes$$ExternalSyntheticOutline1.m(rewardRelativeAmount.basis_points != null ? (int) (r2.intValue() * 0.01d) : 0, "%");
            }
        }
        if (zzukVar == null) {
            return "";
        }
        RewardAmount$Data$RewardConstantAmount rewardAmount$Data$RewardConstantAmount = zzukVar instanceof RewardAmount$Data$RewardConstantAmount ? (RewardAmount$Data$RewardConstantAmount) zzukVar : null;
        RewardConstantAmount rewardConstantAmount = rewardAmount$Data$RewardConstantAmount != null ? rewardAmount$Data$RewardConstantAmount.value : null;
        if (rewardConstantAmount == null) {
            return "";
        }
        Money money = rewardConstantAmount.amount;
        money.getClass();
        return this.initialMoneyFormatter.format(money);
    }

    public final OffersScreen$OffersTimelineScreen getTimelineSheetScreenForArgs(ShoppingWebScreen.ShoppingWebScreenV2 shoppingWebScreenV2) {
        OfferSheetKey$IdentifierToken$OfferToken offerSheetKey$IdentifierToken$OfferToken;
        IabMetadata iabMetadata = shoppingWebScreenV2.metadata;
        boolean z = iabMetadata instanceof IabMetadata.CashPayMetadata;
        int i = 48;
        String str = this.entityToken;
        if (z) {
            SheetType sheetType = SheetType.TIMELINE_SHEET;
            OfferType offerType = OfferType.PAY_LESS_CAP;
            offerSheetKey$IdentifierToken$OfferToken = str != null ? new OfferSheetKey$IdentifierToken$OfferToken(str) : null;
            Alignment.Companion companion = OfferSheetKey.PresentingContext.Companion;
            return new OffersScreen$OffersTimelineScreen(new OfferSheetKey(sheetType, offerType, offerSheetKey$IdentifierToken$OfferToken, i), shoppingWebScreenV2, false, null, null, null);
        }
        if (iabMetadata instanceof IabMetadata.AffiliateBoostMetadata) {
            SheetType sheetType2 = SheetType.TIMELINE_SHEET;
            OfferType offerType2 = OfferType.PAY_LESS_AFFILIATE;
            offerSheetKey$IdentifierToken$OfferToken = str != null ? new OfferSheetKey$IdentifierToken$OfferToken(str) : null;
            Alignment.Companion companion2 = OfferSheetKey.PresentingContext.Companion;
            return new OffersScreen$OffersTimelineScreen(new OfferSheetKey(sheetType2, offerType2, offerSheetKey$IdentifierToken$OfferToken, i), shoppingWebScreenV2, false, null, null, null);
        }
        if (iabMetadata instanceof IabMetadata.AfterpayMetadata) {
            SheetType sheetType3 = SheetType.TIMELINE_SHEET;
            OfferType offerType3 = OfferType.PAY_LATER_AFTERPAY;
            offerSheetKey$IdentifierToken$OfferToken = str != null ? new OfferSheetKey$IdentifierToken$OfferToken(str) : null;
            Alignment.Companion companion3 = OfferSheetKey.PresentingContext.Companion;
            return new OffersScreen$OffersTimelineScreen(new OfferSheetKey(sheetType3, offerType3, offerSheetKey$IdentifierToken$OfferToken, i), shoppingWebScreenV2, false, null, null, null);
        }
        if (!(iabMetadata instanceof IabMetadata.SUPMetadata)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        SheetType sheetType4 = SheetType.TIMELINE_SHEET;
        OfferType offerType4 = OfferType.PAY_LATER_SUP;
        offerSheetKey$IdentifierToken$OfferToken = str != null ? new OfferSheetKey$IdentifierToken$OfferToken(str) : null;
        Alignment.Companion companion4 = OfferSheetKey.PresentingContext.Companion;
        return new OffersScreen$OffersTimelineScreen(new OfferSheetKey(sheetType4, offerType4, offerSheetKey$IdentifierToken$OfferToken, i), shoppingWebScreenV2, false, null, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:326:0x00af, code lost:
    
        if ((r0 != null ? kotlin.jvm.internal.Intrinsics.areEqual(r0.opt_out, r11) : false) != false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x08ae  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0917  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0930  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x095f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0a38  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0a4c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0a71  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0b25  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0b88  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x08c5  */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.lang.Object, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        boolean z;
        int i2;
        boolean z2;
        Boolean bool;
        MutableState mutableState;
        Object anonymousClass1;
        MutableState mutableState2;
        boolean z3;
        Boolean bool2;
        MutableState mutableState3;
        Profile profile;
        ShoppingWebPresenter shoppingWebPresenter;
        MutableState mutableState4;
        Continuation continuation;
        final ShoppingWebPresenter shoppingWebPresenter2;
        GapComposer gapComposer;
        MutableState mutableState5;
        MutableState mutableState6;
        MutableState mutableState7;
        final int i3;
        String str;
        MutableState mutableState8;
        GapComposer gapComposer2;
        Unit unit;
        Continuation continuation2;
        ShoppingWebPresenter shoppingWebPresenter3;
        Object obj;
        CoroutineScope coroutineScope;
        MutableState mutableState9;
        ShoppingWebPresenter shoppingWebPresenter4;
        MutableState mutableState10;
        Object anonymousClass12;
        Object[] objArr;
        MutableState mutableState11;
        MutableState mutableState12;
        int i4;
        ShoppingWebPresenter shoppingWebPresenter5;
        MutableState mutableState13;
        boolean z4;
        FillrCartInformationExtraction$FillrCartProduct restrictedItemOrNull;
        RestrictedProduct restrictedProduct;
        RestrictedProduct restrictedProduct2;
        RealShoppingJavascriptPresenter realShoppingJavascriptPresenter;
        Object rememberedValue;
        MutableState mutableState14;
        Object rememberedValue2;
        MutableState rememberUpdatedState;
        Object rememberedValue3;
        Object rememberedValue4;
        Object rememberedValue5;
        CoroutineScope coroutineScope2;
        boolean changedInstance;
        Object rememberedValue6;
        CoroutineScope coroutineScope3;
        boolean changedInstance2;
        Object rememberedValue7;
        MutableState mutableState15;
        Continuation continuation3;
        Object rememberedValue8;
        Object rememberedValue9;
        Object rememberedValue10;
        Object rememberedValue11;
        Flow flow2;
        boolean changedInstance3;
        Object rememberedValue12;
        RestrictedProduct restrictedProduct3;
        Flow flow3;
        boolean changedInstance4;
        Object rememberedValue13;
        MutableState mutableState16;
        ShoppingWebPresenter shoppingWebPresenter6;
        boolean changed;
        Object rememberedValue14;
        ShoppingWebScreen shoppingWebScreen;
        PaykitInfoToastViewModel paykitInfoToastViewModel;
        String str2;
        FooterButtonStyle singleUsePaymentButton;
        FooterButtonStyle afterPayButton;
        flow.getClass();
        ?? r5 = (GapComposer) composer;
        r5.startReplaceGroup(-1661129413);
        Unit unit2 = Unit.INSTANCE;
        boolean changedInstance5 = r5.changedInstance(this);
        Object rememberedValue15 = r5.rememberedValue();
        Object obj2 = Composer.Companion.Empty;
        final int i5 = 0;
        if (changedInstance5 || rememberedValue15 == obj2) {
            rememberedValue15 = new Function1(this) { // from class: com.squareup.cash.shopping.presenters.ShoppingWebPresenter$$ExternalSyntheticLambda0
                public final /* synthetic */ ShoppingWebPresenter f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    int i6 = i5;
                    final ShoppingWebPresenter shoppingWebPresenter7 = this.f$0;
                    DisposableEffectScope disposableEffectScope = (DisposableEffectScope) obj3;
                    switch (i6) {
                        case 0:
                            disposableEffectScope.getClass();
                            final int i7 = 0;
                            return new DisposableEffectResult() { // from class: com.squareup.cash.shopping.presenters.ShoppingWebPresenter$models$lambda$0$0$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public final void dispose() {
                                    int i8 = i7;
                                    ShoppingWebPresenter shoppingWebPresenter8 = shoppingWebPresenter7;
                                    switch (i8) {
                                        case 0:
                                            ShoppingWebScreen shoppingWebScreen2 = shoppingWebPresenter8.args;
                                            if ((shoppingWebScreen2 instanceof ShoppingWebScreen.ShoppingWebScreenV2) && (((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen2).metadata instanceof IabMetadata.SUPMetadata)) {
                                                shoppingWebPresenter8.clientSyncer.sync(SyncTrigger.BLOCKING_USER_ACTION, SyncScope.Global.INSTANCE);
                                                break;
                                            }
                                            break;
                                        default:
                                            if (ExifInterfaceUtils.isVersion2WithCorrectMetadata(shoppingWebPresenter8.args, WebViewUseCase.AFTERPAY)) {
                                                shoppingWebPresenter8.afterpayAppletAnalytics.shopFlowToken = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                        default:
                            disposableEffectScope.getClass();
                            if (ExifInterfaceUtils.isVersion2WithCorrectMetadata(shoppingWebPresenter7.args, WebViewUseCase.AFTERPAY)) {
                                shoppingWebPresenter7.afterpayAppletAnalytics.shopFlowToken = Boxes$$ExternalSyntheticOutline1.m();
                            }
                            final int i8 = 1;
                            return new DisposableEffectResult() { // from class: com.squareup.cash.shopping.presenters.ShoppingWebPresenter$models$lambda$0$0$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public final void dispose() {
                                    int i82 = i8;
                                    ShoppingWebPresenter shoppingWebPresenter8 = shoppingWebPresenter7;
                                    switch (i82) {
                                        case 0:
                                            ShoppingWebScreen shoppingWebScreen2 = shoppingWebPresenter8.args;
                                            if ((shoppingWebScreen2 instanceof ShoppingWebScreen.ShoppingWebScreenV2) && (((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen2).metadata instanceof IabMetadata.SUPMetadata)) {
                                                shoppingWebPresenter8.clientSyncer.sync(SyncTrigger.BLOCKING_USER_ACTION, SyncScope.Global.INSTANCE);
                                                break;
                                            }
                                            break;
                                        default:
                                            if (ExifInterfaceUtils.isVersion2WithCorrectMetadata(shoppingWebPresenter8.args, WebViewUseCase.AFTERPAY)) {
                                                shoppingWebPresenter8.afterpayAppletAnalytics.shopFlowToken = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                    }
                }
            };
            r5.updateRememberedValue(rememberedValue15);
        }
        Updater.DisposableEffect(unit2, (Function1) rememberedValue15, (Composer) r5);
        Object rememberedValue16 = r5.rememberedValue();
        if (rememberedValue16 == obj2) {
            rememberedValue16 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, r5);
            r5.updateRememberedValue(rememberedValue16);
        }
        CoroutineScope coroutineScope4 = (CoroutineScope) rememberedValue16;
        Object rememberedValue17 = r5.rememberedValue();
        if (rememberedValue17 == obj2) {
            rememberedValue17 = this.syncValueReader.getSingleValue(AndroidSyncValueSpecs.CommerceBrowserAutofillPreferences);
            r5.updateRememberedValue(rememberedValue17);
        }
        Continuation continuation4 = null;
        MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue17, null, r5, 1);
        Boolean bool3 = Boolean.FALSE;
        boolean changedInstance6 = r5.changedInstance(this);
        Object rememberedValue18 = r5.rememberedValue();
        int i6 = 22;
        if (changedInstance6 || rememberedValue18 == obj2) {
            rememberedValue18 = new BasicShieetKt$BasicShieet$4$1(this, continuation4, i6);
            r5.updateRememberedValue(rememberedValue18);
        }
        MutableState produceState = Updater.produceState(r5, bool3, (Function2) rememberedValue18);
        boolean changed2 = r5.changed((CommerceBrowserAutofillPreferences) collectAsState.getValue()) | r5.changed(((Boolean) produceState.getValue()).booleanValue());
        Object rememberedValue19 = r5.rememberedValue();
        if (changed2 || rememberedValue19 == obj2) {
            if (((CommerceBrowserAutofillPreferences) collectAsState.getValue()) != null) {
                CommerceBrowserAutofillPreferences commerceBrowserAutofillPreferences = (CommerceBrowserAutofillPreferences) collectAsState.getValue();
            }
            if (((Boolean) produceState.getValue()).booleanValue()) {
                z = true;
                rememberedValue19 = Boolean.valueOf(z);
                r5.updateRememberedValue(rememberedValue19);
            }
            z = false;
            rememberedValue19 = Boolean.valueOf(z);
            r5.updateRememberedValue(rememberedValue19);
        }
        Boolean bool4 = (Boolean) rememberedValue19;
        boolean booleanValue = bool4.booleanValue();
        Object rememberedValue20 = r5.rememberedValue();
        if (rememberedValue20 == obj2) {
            rememberedValue20 = Boxes$$ExternalSyntheticOutline1.m(0, (GapComposer) r5);
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue20;
        Object rememberedValue21 = r5.rememberedValue();
        if (rememberedValue21 == obj2) {
            rememberedValue21 = Updater.mutableStateOf$default(null);
            r5.updateRememberedValue(rememberedValue21);
        }
        MutableState mutableState17 = (MutableState) rememberedValue21;
        Object rememberedValue22 = r5.rememberedValue();
        RealCashFillJsStore realCashFillJsStore = this.cashFillJsStore;
        RealFillrWebManager realFillrWebManager = this.fillrManager;
        ShoppingWebScreen shoppingWebScreen2 = this.args;
        if (rememberedValue22 == obj2) {
            CardState cardState = new CardState(null, null, null, null, null, false, null, false, false);
            boolean z5 = shoppingWebScreen2 instanceof ShoppingWebScreen.AffiliateShoppingScreen;
            i2 = 1;
            WebNavigationHeaderModel webNavigationHeaderModel = new WebNavigationHeaderModel(null, shoppingWebScreen2.getUrl(), false, z5 || (shoppingWebScreen2 instanceof ShoppingWebScreen.IncentiveShoppingScreen));
            if (z5) {
                singleUsePaymentButton = FooterButtonStyle.AffiliateButton.INSTANCE;
            } else if (shoppingWebScreen2 instanceof ShoppingWebScreen.AfterPayShoppingScreen) {
                singleUsePaymentButton = new FooterButtonStyle.AfterPayButton(!this.afterpayInfoSheetViewed.get());
            } else if (shoppingWebScreen2 instanceof ShoppingWebScreen.IncentiveShoppingScreen) {
                singleUsePaymentButton = FooterButtonStyle.InfoButton.INSTANCE;
            } else if (shoppingWebScreen2 instanceof ShoppingWebScreen.SingleUsePaymentShoppingScreen) {
                singleUsePaymentButton = new FooterButtonStyle.SingleUsePaymentButton();
            } else {
                if (!(shoppingWebScreen2 instanceof ShoppingWebScreen.ShoppingWebScreenV2)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                IabMetadata iabMetadata = ((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen2).metadata;
                if (iabMetadata instanceof IabMetadata.CashPayMetadata) {
                    iabMetadata.getClass();
                    afterPayButton = new FooterButtonStyle.FooterButtonStyleV2.IncentiveButton(formatMoney(((IabMetadata.CashPayMetadata) iabMetadata).rewardAmount));
                } else if (iabMetadata instanceof IabMetadata.AffiliateBoostMetadata) {
                    iabMetadata.getClass();
                    afterPayButton = new FooterButtonStyle.FooterButtonStyleV2.AffiliateButton(formatMoney(((IabMetadata.AffiliateBoostMetadata) iabMetadata).rewardAmount));
                } else if (iabMetadata instanceof IabMetadata.AfterpayMetadata) {
                    iabMetadata.getClass();
                    afterPayButton = new FooterButtonStyle.FooterButtonStyleV2.AfterPayButton(((IabMetadata.AfterpayMetadata) iabMetadata).installmentsNumber);
                } else {
                    if (!(iabMetadata instanceof IabMetadata.SUPMetadata)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    singleUsePaymentButton = new FooterButtonStyle.FooterButtonStyleV2.SingleUsePaymentButton(PillStage.Initial.INSTANCE);
                }
                singleUsePaymentButton = afterPayButton;
            }
            z2 = booleanValue;
            rememberedValue22 = Updater.mutableStateOf$default(new State(false, cardState, webNavigationHeaderModel, new WebNavigationFooterViewModel(false, false, singleUsePaymentButton), this.fillrEnabled, shoppingWebScreen2.getUrl(), "", null, null, null, false, realFillrWebManager.getFillrVersions(), new RestrictedItemState(null, null), "0.0.1", ExifInterfaceUtils.toUseCase(shoppingWebScreen2), booleanValue, new PlanDetailsState(null, null), false, new MerchantConfig(63), null, false, null, false, this.cashFillEnabled, realCashFillJsStore.version, (Money) mutableState17.getValue()));
            r5.updateRememberedValue(rememberedValue22);
        } else {
            i2 = 1;
            z2 = booleanValue;
        }
        MutableState mutableState18 = (MutableState) rememberedValue22;
        boolean changed3 = r5.changed(z2);
        Object rememberedValue23 = r5.rememberedValue();
        int i7 = 12;
        if (changed3 || rememberedValue23 == obj2) {
            rememberedValue23 = new CashMapViewKt$CashMapView$3$1(z2, mutableState18, null, i7);
            r5.updateRememberedValue(rememberedValue23);
        }
        Updater.LaunchedEffect((Composer) r5, bool4, (Function2) rememberedValue23);
        Object rememberedValue24 = r5.rememberedValue();
        if (rememberedValue24 == obj2) {
            rememberedValue24 = Updater.mutableStateOf$default(Boolean.TRUE);
            r5.updateRememberedValue(rememberedValue24);
        }
        MutableState mutableState19 = (MutableState) rememberedValue24;
        Object rememberedValue25 = r5.rememberedValue();
        if (rememberedValue25 == obj2) {
            rememberedValue25 = Updater.mutableStateOf$default(null);
            r5.updateRememberedValue(rememberedValue25);
        }
        MutableState mutableState20 = (MutableState) rememberedValue25;
        Object rememberedValue26 = r5.rememberedValue();
        if (rememberedValue26 == obj2) {
            rememberedValue26 = Updater.mutableStateOf$default(bool3);
            r5.updateRememberedValue(rememberedValue26);
        }
        MutableState mutableState21 = (MutableState) rememberedValue26;
        Object rememberedValue27 = r5.rememberedValue();
        if (rememberedValue27 == obj2) {
            rememberedValue27 = Updater.mutableStateOf$default(bool3);
            r5.updateRememberedValue(rememberedValue27);
        }
        MutableState mutableState22 = (MutableState) rememberedValue27;
        Object rememberedValue28 = r5.rememberedValue();
        if (rememberedValue28 == obj2) {
            rememberedValue28 = new RealGooglePayer$createWallet$$inlined$map$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(realFillrWebManager.lastDetectCartInfoFlow, new ProfileCropView.AnonymousClass3(this, null, 24), 3), 8);
            r5.updateRememberedValue(rememberedValue28);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue28, null, null, r5, 48, 2);
        Object rememberedValue29 = r5.rememberedValue();
        AggregateAutofillWebManager aggregateAutofillWebManager = this.autofillManager;
        if (rememberedValue29 == obj2) {
            int i8 = 4;
            bool = bool4;
            mutableState = collectAsState2;
            FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(aggregateAutofillWebManager.cardFieldDetected, new MoneyTabPresenter$models$lambda$17$$inlined$map$1(((RealIssuedCardManager) this.issuedCardManager).getIssuedCardOrNull(), i8), new FileBlockerView$6$2$1(3, null, i8), 0);
            r5.updateRememberedValue(flowKt__ZipKt$combine$$inlined$unsafeFlow$1);
            rememberedValue29 = flowKt__ZipKt$combine$$inlined$unsafeFlow$1;
        } else {
            bool = bool4;
            mutableState = collectAsState2;
        }
        MutableState mutableState23 = mutableState;
        MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue29, bool3, null, r5, 48, 2);
        Object rememberedValue30 = r5.rememberedValue();
        if (rememberedValue30 == obj2) {
            rememberedValue30 = aggregateAutofillWebManager.address1FieldDetected;
            r5.updateRememberedValue(rememberedValue30);
        }
        MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue30, bool3, null, r5, 48, 2);
        Object rememberedValue31 = r5.rememberedValue();
        if (rememberedValue31 == obj2) {
            rememberedValue31 = aggregateAutofillWebManager.loggingFieldsDetected;
            r5.updateRememberedValue(rememberedValue31);
        }
        MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue31, EmptySet.INSTANCE, null, r5, 48, 2);
        Object rememberedValue32 = r5.rememberedValue();
        if (rememberedValue32 == obj2) {
            rememberedValue32 = this.profileManager.profile();
            r5.updateRememberedValue(rememberedValue32);
        }
        MutableState collectAsState6 = Updater.collectAsState((Flow) rememberedValue32, null, null, r5, 48, 2);
        Object rememberedValue33 = r5.rememberedValue();
        if (rememberedValue33 == obj2) {
            rememberedValue33 = Updater.mutableStateOf$default(null);
            r5.updateRememberedValue(rememberedValue33);
        }
        MutableState mutableState24 = (MutableState) rememberedValue33;
        Profile profile2 = (Profile) collectAsState6.getValue();
        boolean changed4 = r5.changed(z2) | r5.changed(collectAsState6) | r5.changedInstance(this);
        Object rememberedValue34 = r5.rememberedValue();
        if (changed4 || rememberedValue34 == obj2) {
            mutableState2 = collectAsState3;
            z3 = z2;
            bool2 = bool;
            mutableState3 = mutableState19;
            profile = profile2;
            anonymousClass1 = new RoomDatabase$performClear$1.AnonymousClass1(z3, this, collectAsState6, mutableState24, (Continuation) null, 18);
            shoppingWebPresenter = this;
            mutableState4 = mutableState24;
            r5.updateRememberedValue(anonymousClass1);
        } else {
            mutableState2 = collectAsState3;
            mutableState4 = mutableState24;
            anonymousClass1 = rememberedValue34;
            shoppingWebPresenter = this;
            z3 = z2;
            bool2 = bool;
            mutableState3 = mutableState19;
            profile = profile2;
        }
        Updater.LaunchedEffect(bool2, profile, (Function2) anonymousClass1, r5);
        Object rememberedValue35 = r5.rememberedValue();
        if (rememberedValue35 == obj2) {
            rememberedValue35 = aggregateAutofillWebManager.lastCapturedValueInfo;
            r5.updateRememberedValue(rememberedValue35);
        }
        boolean z6 = z3;
        MutableState collectAsState7 = Updater.collectAsState((Flow) rememberedValue35, null, null, r5, 48, 2);
        Object rememberedValue36 = r5.rememberedValue();
        if (rememberedValue36 == obj2) {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            rememberedValue36 = Updater.mutableStateOf$default(emptyMap);
            r5.updateRememberedValue(rememberedValue36);
        }
        MutableState mutableState25 = (MutableState) rememberedValue36;
        HashMap hashMap = (HashMap) collectAsState7.getValue();
        boolean changed5 = r5.changed(collectAsState7);
        Object rememberedValue37 = r5.rememberedValue();
        if (changed5 || rememberedValue37 == obj2) {
            continuation = null;
            rememberedValue37 = new OffersHomePresenter$models$2$1(mutableState25, collectAsState7, continuation, 14);
            r5.updateRememberedValue(rememberedValue37);
        } else {
            continuation = null;
        }
        Updater.LaunchedEffect((Composer) r5, hashMap, (Function2) rememberedValue37);
        Object rememberedValue38 = r5.rememberedValue();
        if (rememberedValue38 == obj2) {
            rememberedValue38 = aggregateAutofillWebManager.currentFocusedField;
            r5.updateRememberedValue(rememberedValue38);
        }
        Continuation continuation5 = continuation;
        MutableState collectAsState8 = Updater.collectAsState((Flow) rememberedValue38, null, null, r5, 48, 2);
        boolean changedInstance7 = r5.changedInstance(shoppingWebPresenter);
        Object rememberedValue39 = r5.rememberedValue();
        if (changedInstance7 || rememberedValue39 == obj2) {
            shoppingWebPresenter2 = shoppingWebPresenter;
            gapComposer = r5;
            mutableState5 = collectAsState8;
            ShoppingWebPresenter$models$5$1 shoppingWebPresenter$models$5$1 = new ShoppingWebPresenter$models$5$1(shoppingWebPresenter2, mutableState17, mutableState18, continuation5, 0);
            mutableState6 = mutableState17;
            mutableState7 = mutableState18;
            gapComposer.updateRememberedValue(shoppingWebPresenter$models$5$1);
            rememberedValue39 = shoppingWebPresenter$models$5$1;
        } else {
            shoppingWebPresenter2 = shoppingWebPresenter;
            mutableState7 = mutableState18;
            mutableState6 = mutableState17;
            gapComposer = r5;
            mutableState5 = collectAsState8;
        }
        Updater.LaunchedEffect(gapComposer, unit2, (Function2) rememberedValue39);
        boolean changedInstance8 = gapComposer.changedInstance(shoppingWebPresenter2);
        Object rememberedValue40 = gapComposer.rememberedValue();
        if (changedInstance8 || rememberedValue40 == obj2) {
            i3 = i2;
            rememberedValue40 = new Function1(shoppingWebPresenter2) { // from class: com.squareup.cash.shopping.presenters.ShoppingWebPresenter$$ExternalSyntheticLambda0
                public final /* synthetic */ ShoppingWebPresenter f$0;

                {
                    this.f$0 = shoppingWebPresenter2;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    int i62 = i3;
                    final ShoppingWebPresenter shoppingWebPresenter7 = this.f$0;
                    DisposableEffectScope disposableEffectScope = (DisposableEffectScope) obj3;
                    switch (i62) {
                        case 0:
                            disposableEffectScope.getClass();
                            final int i72 = 0;
                            return new DisposableEffectResult() { // from class: com.squareup.cash.shopping.presenters.ShoppingWebPresenter$models$lambda$0$0$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public final void dispose() {
                                    int i82 = i72;
                                    ShoppingWebPresenter shoppingWebPresenter8 = shoppingWebPresenter7;
                                    switch (i82) {
                                        case 0:
                                            ShoppingWebScreen shoppingWebScreen22 = shoppingWebPresenter8.args;
                                            if ((shoppingWebScreen22 instanceof ShoppingWebScreen.ShoppingWebScreenV2) && (((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen22).metadata instanceof IabMetadata.SUPMetadata)) {
                                                shoppingWebPresenter8.clientSyncer.sync(SyncTrigger.BLOCKING_USER_ACTION, SyncScope.Global.INSTANCE);
                                                break;
                                            }
                                            break;
                                        default:
                                            if (ExifInterfaceUtils.isVersion2WithCorrectMetadata(shoppingWebPresenter8.args, WebViewUseCase.AFTERPAY)) {
                                                shoppingWebPresenter8.afterpayAppletAnalytics.shopFlowToken = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                        default:
                            disposableEffectScope.getClass();
                            if (ExifInterfaceUtils.isVersion2WithCorrectMetadata(shoppingWebPresenter7.args, WebViewUseCase.AFTERPAY)) {
                                shoppingWebPresenter7.afterpayAppletAnalytics.shopFlowToken = Boxes$$ExternalSyntheticOutline1.m();
                            }
                            final int i82 = 1;
                            return new DisposableEffectResult() { // from class: com.squareup.cash.shopping.presenters.ShoppingWebPresenter$models$lambda$0$0$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public final void dispose() {
                                    int i822 = i82;
                                    ShoppingWebPresenter shoppingWebPresenter8 = shoppingWebPresenter7;
                                    switch (i822) {
                                        case 0:
                                            ShoppingWebScreen shoppingWebScreen22 = shoppingWebPresenter8.args;
                                            if ((shoppingWebScreen22 instanceof ShoppingWebScreen.ShoppingWebScreenV2) && (((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen22).metadata instanceof IabMetadata.SUPMetadata)) {
                                                shoppingWebPresenter8.clientSyncer.sync(SyncTrigger.BLOCKING_USER_ACTION, SyncScope.Global.INSTANCE);
                                                break;
                                            }
                                            break;
                                        default:
                                            if (ExifInterfaceUtils.isVersion2WithCorrectMetadata(shoppingWebPresenter8.args, WebViewUseCase.AFTERPAY)) {
                                                shoppingWebPresenter8.afterpayAppletAnalytics.shopFlowToken = null;
                                                break;
                                            }
                                            break;
                                    }
                                }
                            };
                    }
                }
            };
            gapComposer.updateRememberedValue(rememberedValue40);
        } else {
            i3 = i2;
        }
        Updater.DisposableEffect(unit2, (Function1) rememberedValue40, gapComposer);
        String str3 = (String) mutableState5.getValue();
        MutableState mutableState26 = mutableState5;
        boolean changed6 = gapComposer.changed(mutableState26) | gapComposer.changedInstance(shoppingWebPresenter2) | gapComposer.changed(collectAsState7) | gapComposer.changed(collectAsState5);
        Object rememberedValue41 = gapComposer.rememberedValue();
        if (changed6 || rememberedValue41 == obj2) {
            str = str3;
            mutableState8 = collectAsState5;
            gapComposer2 = gapComposer;
            unit = unit2;
            continuation2 = continuation5;
            DotGridKt$DotGrid$3$1 dotGridKt$DotGrid$3$1 = new DotGridKt$DotGrid$3$1((Object) shoppingWebPresenter2, (Object) mutableState26, (Object) collectAsState7, (Object) mutableState8, (Continuation) null, 29);
            shoppingWebPresenter3 = shoppingWebPresenter2;
            gapComposer2.updateRememberedValue(dotGridKt$DotGrid$3$1);
            rememberedValue41 = dotGridKt$DotGrid$3$1;
        } else {
            str = str3;
            mutableState8 = collectAsState5;
            unit = unit2;
            continuation2 = continuation5;
            gapComposer2 = gapComposer;
            shoppingWebPresenter3 = shoppingWebPresenter2;
        }
        Updater.LaunchedEffect(gapComposer2, str, (Function2) rememberedValue41);
        BooleanPreference booleanPreference = shoppingWebPresenter3.infoSheet;
        PreferenceFlow preferenceFlow = new PreferenceFlow(booleanPreference.key, booleanPreference.preferences, new ScannerView.AnonymousClass1(booleanPreference));
        MutableState mutableState27 = mutableState8;
        GapComposer gapComposer3 = gapComposer2;
        Boolean bool5 = (Boolean) Updater.collectAsState(preferenceFlow, null, null, gapComposer3, 48, 2).getValue();
        boolean changed7 = gapComposer3.changed(bool5) | gapComposer3.changedInstance(shoppingWebPresenter3);
        Object rememberedValue42 = gapComposer3.rememberedValue();
        if (changed7 || rememberedValue42 == obj2) {
            rememberedValue42 = new ProfileCropView.AnonymousClass3(bool5, shoppingWebPresenter3, continuation2, 23);
            gapComposer3.updateRememberedValue(rememberedValue42);
        }
        Updater.LaunchedEffect(gapComposer3, bool5, (Function2) rememberedValue42);
        FillrCartInformationExtraction$FillrCartInformation fillrCartInformationExtraction$FillrCartInformation = (FillrCartInformationExtraction$FillrCartInformation) mutableState23.getValue();
        Object obj3 = fillrCartInformationExtraction$FillrCartInformation != null ? fillrCartInformationExtraction$FillrCartInformation.cart_total_qty : continuation2;
        boolean changed8 = gapComposer3.changed(mutableState23) | gapComposer3.changedInstance(coroutineScope4) | gapComposer3.changedInstance(shoppingWebPresenter3);
        Object rememberedValue43 = gapComposer3.rememberedValue();
        if (changed8 || rememberedValue43 == obj2) {
            ShoppingWebPresenter shoppingWebPresenter7 = shoppingWebPresenter3;
            MutableState mutableState28 = mutableState7;
            obj = obj3;
            HeroCardViewKt$Render$1$4$1.AnonymousClass2 anonymousClass2 = new HeroCardViewKt$Render$1$4$1.AnonymousClass2(coroutineScope4, mutableState23, mutableState28, shoppingWebPresenter7, null);
            coroutineScope = coroutineScope4;
            mutableState9 = mutableState23;
            shoppingWebPresenter4 = shoppingWebPresenter7;
            mutableState10 = mutableState28;
            gapComposer3.updateRememberedValue(anonymousClass2);
            rememberedValue43 = anonymousClass2;
        } else {
            coroutineScope = coroutineScope4;
            mutableState9 = mutableState23;
            shoppingWebPresenter4 = shoppingWebPresenter3;
            mutableState10 = mutableState7;
            obj = obj3;
        }
        Updater.LaunchedEffect(gapComposer3, obj, (Function2) rememberedValue43);
        Boolean bool6 = (Boolean) mutableState22.getValue();
        bool6.getClass();
        boolean changedInstance9 = gapComposer3.changedInstance(shoppingWebPresenter4);
        Object rememberedValue44 = gapComposer3.rememberedValue();
        if (changedInstance9 || rememberedValue44 == obj2) {
            MutableState mutableState29 = mutableState10;
            ShoppingWebPresenter$models$10$1 shoppingWebPresenter$models$10$1 = new ShoppingWebPresenter$models$10$1(shoppingWebPresenter4, mutableState22, mutableState29, continuation2, 0);
            mutableState10 = mutableState29;
            gapComposer3.updateRememberedValue(shoppingWebPresenter$models$10$1);
            rememberedValue44 = shoppingWebPresenter$models$10$1;
        }
        Updater.LaunchedEffect(gapComposer3, bool6, (Function2) rememberedValue44);
        SupCreateCardFlowEndResult supCreateCardFlowEndResult = ((State) mutableState10.getValue()).supCheckoutEndResult;
        Object obj4 = supCreateCardFlowEndResult != null ? supCreateCardFlowEndResult.sup_checkout_id : continuation2;
        boolean changedInstance10 = gapComposer3.changedInstance(shoppingWebPresenter4);
        Object rememberedValue45 = gapComposer3.rememberedValue();
        if (changedInstance10 || rememberedValue45 == obj2) {
            rememberedValue45 = new ShoppingWebPresenter$models$10$1(shoppingWebPresenter4, mutableState10, continuation2);
            gapComposer3.updateRememberedValue(rememberedValue45);
        }
        Updater.LaunchedEffect(gapComposer3, obj4, (Function2) rememberedValue45);
        Boolean valueOf = Boolean.valueOf(((State) mutableState10.getValue()).showedAddCardSheet);
        FillrCartInformationExtraction$FillrCartInformation fillrCartInformationExtraction$FillrCartInformation2 = (FillrCartInformationExtraction$FillrCartInformation) mutableState9.getValue();
        boolean changedInstance11 = gapComposer3.changedInstance(shoppingWebPresenter4) | gapComposer3.changed(mutableState9);
        Object rememberedValue46 = gapComposer3.rememberedValue();
        if (changedInstance11 || rememberedValue46 == obj2) {
            rememberedValue46 = new ShoppingWebPresenter$models$12$1(shoppingWebPresenter4, mutableState9, mutableState10, continuation2);
            gapComposer3.updateRememberedValue(rememberedValue46);
        }
        Updater.LaunchedEffect(valueOf, fillrCartInformationExtraction$FillrCartInformation2, (Function2) rememberedValue46, gapComposer3);
        FillrCartInformationExtraction$FillrCartInformation fillrCartInformationExtraction$FillrCartInformation3 = (FillrCartInformationExtraction$FillrCartInformation) mutableState9.getValue();
        boolean changedInstance12 = gapComposer3.changedInstance(shoppingWebPresenter4) | gapComposer3.changed(mutableState9);
        Object rememberedValue47 = gapComposer3.rememberedValue();
        if (changedInstance12 || rememberedValue47 == obj2) {
            rememberedValue47 = new ShoppingWebPresenter$models$12$1(mutableState10, shoppingWebPresenter4, mutableState9, continuation2);
            gapComposer3.updateRememberedValue(rememberedValue47);
        }
        Updater.LaunchedEffect(gapComposer3, fillrCartInformationExtraction$FillrCartInformation3, (Function2) rememberedValue47);
        Boolean valueOf2 = Boolean.valueOf(((State) mutableState10.getValue()).onCheckout);
        Object rememberedValue48 = gapComposer3.rememberedValue();
        if (rememberedValue48 == obj2) {
            rememberedValue48 = new ToastKt$Toast$7$1(mutableState10, continuation2, 16);
            gapComposer3.updateRememberedValue(rememberedValue48);
        }
        Updater.LaunchedEffect(gapComposer3, valueOf2, (Function2) rememberedValue48);
        Boolean valueOf3 = Boolean.valueOf(((State) mutableState10.getValue()).showAutofillSuccessToast);
        boolean changedInstance13 = gapComposer3.changedInstance(coroutineScope);
        Object rememberedValue49 = gapComposer3.rememberedValue();
        if (changedInstance13 || rememberedValue49 == obj2) {
            rememberedValue49 = new ShoppingWebPresenter$models$15$1(coroutineScope, mutableState10, continuation2, 0);
            gapComposer3.updateRememberedValue(rememberedValue49);
        }
        Updater.LaunchedEffect(gapComposer3, valueOf3, (Function2) rememberedValue49);
        Object[] objArr2 = {Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue()), bool2, Boolean.valueOf(((Boolean) collectAsState4.getValue()).booleanValue()), Boolean.valueOf(((Boolean) mutableState2.getValue()).booleanValue()), (RetrieveDefaultShippingAddressResponse) mutableState4.getValue()};
        MutableState mutableState30 = collectAsState4;
        MutableState mutableState31 = mutableState2;
        boolean changed9 = gapComposer3.changed(z6) | gapComposer3.changedInstance(shoppingWebPresenter4) | gapComposer3.changed(mutableState30) | gapComposer3.changed(mutableState31);
        Object rememberedValue50 = gapComposer3.rememberedValue();
        if (changed9 || rememberedValue50 == obj2) {
            MutableState mutableState32 = mutableState10;
            objArr = objArr2;
            mutableState11 = mutableState9;
            mutableState12 = mutableState4;
            anonymousClass12 = new RealContactSync$syncRequest$2.AnonymousClass1(10, this, mutableState12, mutableState30, mutableState31, mutableState32, (Continuation) null, z6);
            mutableState30 = mutableState30;
            mutableState10 = mutableState32;
            mutableState31 = mutableState31;
            shoppingWebPresenter4 = this;
            z6 = z6;
            gapComposer3.updateRememberedValue(anonymousClass12);
        } else {
            objArr = objArr2;
            anonymousClass12 = rememberedValue50;
            mutableState11 = mutableState9;
            mutableState12 = mutableState4;
        }
        Updater.LaunchedEffect(objArr, (Function2) anonymousClass12, gapComposer3);
        Boolean valueOf4 = Boolean.valueOf(((State) mutableState10.getValue()).onCheckout);
        Boolean bool7 = (Boolean) mutableState30.getValue();
        bool7.getClass();
        Boolean bool8 = (Boolean) mutableState31.getValue();
        bool8.getClass();
        Object[] objArr3 = {bool2, valueOf4, bool7, bool8, (RetrieveDefaultShippingAddressResponse) mutableState12.getValue()};
        boolean changed10 = gapComposer3.changed(z6) | gapComposer3.changed(mutableState30) | gapComposer3.changedInstance(shoppingWebPresenter4) | gapComposer3.changed(mutableState31);
        Object rememberedValue51 = gapComposer3.rememberedValue();
        if (changed10 || rememberedValue51 == obj2) {
            MutableState mutableState33 = mutableState10;
            ShoppingWebPresenter shoppingWebPresenter8 = shoppingWebPresenter4;
            ShoppingWebPresenter$models$17$1 shoppingWebPresenter$models$17$1 = new ShoppingWebPresenter$models$17$1(z6, mutableState33, mutableState12, shoppingWebPresenter8, mutableState30, mutableState31, (Continuation) null);
            shoppingWebPresenter4 = shoppingWebPresenter8;
            mutableState10 = mutableState33;
            gapComposer3.updateRememberedValue(shoppingWebPresenter$models$17$1);
            rememberedValue51 = shoppingWebPresenter$models$17$1;
        }
        Updater.LaunchedEffect(objArr3, (Function2) rememberedValue51, gapComposer3);
        Set set = (Set) mutableState27.getValue();
        boolean changed11 = gapComposer3.changed(mutableState27) | gapComposer3.changedInstance(shoppingWebPresenter4);
        Object rememberedValue52 = gapComposer3.rememberedValue();
        if (changed11 || rememberedValue52 == obj2) {
            i4 = 22;
            rememberedValue52 = new ProfileCropView.AnonymousClass3(shoppingWebPresenter4, mutableState27, null, i4);
            gapComposer3.updateRememberedValue(rememberedValue52);
        } else {
            i4 = 22;
        }
        Updater.LaunchedEffect(gapComposer3, set, (Function2) rememberedValue52);
        MutableState mutableState34 = mutableState12;
        CoroutineScope coroutineScope5 = coroutineScope;
        MutableState mutableState35 = mutableState11;
        ShoppingWebPresenter shoppingWebPresenter9 = shoppingWebPresenter4;
        ShoppingWebPresenter shoppingWebPresenter10 = shoppingWebPresenter9;
        Updater.LaunchedEffect(gapComposer3, flow, new RealBugReportSender$submitBugReport$2(flow, null, shoppingWebPresenter9, mutableState10, mutableState34, mutableState35, mutableState6, mutableState20, mutableState3, mutableState21, mutableState22, 5));
        int i9 = 20;
        int i10 = 10;
        if (shoppingWebScreen2 instanceof ShoppingWebScreen.AffiliateShoppingScreen) {
            gapComposer3.startReplaceGroup(1383625971);
            models$composeAffiliateScreen(shoppingWebPresenter10, mutableState10, gapComposer3);
            gapComposer3.end(false);
        } else if (shoppingWebScreen2 instanceof ShoppingWebScreen.SingleUsePaymentShoppingScreen) {
            gapComposer3.startReplaceGroup(1383628141);
            Flow flow4 = aggregateAutofillWebManager.cardFieldDetected;
            PoolsListPresenter$models$2$2 poolsListPresenter$models$2$2 = new PoolsListPresenter$models$2$2(flow4, (Continuation) null, (Object) this, mutableState10, mutableState35, 24);
            shoppingWebPresenter10 = this;
            Updater.LaunchedEffect(gapComposer3, flow4, poolsListPresenter$models$2$2);
            gapComposer3.end(false);
        } else if (shoppingWebScreen2 instanceof ShoppingWebScreen.IncentiveShoppingScreen) {
            gapComposer3.startReplaceGroup(1383629907);
            models$composeIncentiveScreen(shoppingWebPresenter10, mutableState10);
            gapComposer3.end(false);
        } else {
            if (!(shoppingWebScreen2 instanceof ShoppingWebScreen.AfterPayShoppingScreen)) {
                if (shoppingWebScreen2 instanceof ShoppingWebScreen.ShoppingWebScreenV2) {
                    gapComposer3.startReplaceGroup(-56855123);
                    IabMetadata iabMetadata2 = ((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen2).metadata;
                    if (iabMetadata2 instanceof IabMetadata.AffiliateBoostMetadata) {
                        gapComposer3.startReplaceGroup(1383641043);
                        models$composeAffiliateScreen(shoppingWebPresenter10, mutableState10, gapComposer3);
                        z4 = false;
                        gapComposer3.end(false);
                    } else {
                        z4 = false;
                        if (iabMetadata2 instanceof IabMetadata.CashPayMetadata) {
                            gapComposer3.startReplaceGroup(1383642867);
                            models$composeIncentiveScreen(shoppingWebPresenter10, mutableState10);
                            gapComposer3.end(false);
                        } else if (iabMetadata2 instanceof IabMetadata.AfterpayMetadata) {
                            gapComposer3.startReplaceGroup(1383644715);
                            String userAgent = shoppingWebScreen2.getUserAgent();
                            if (userAgent != null) {
                                mutableState10.setValue(State.copy$default((State) mutableState10.getValue(), false, null, null, null, null, null, null, userAgent, null, null, null, null, false, null, null, null, null, false, null, 536870655));
                            }
                            Flow flow5 = aggregateAutofillWebManager.cardFieldDetected;
                            Updater.LaunchedEffect(gapComposer3, flow5, new BasicShieetKt$BasicShieet$4$1(flow5, null, shoppingWebPresenter10, i9));
                            z4 = false;
                            gapComposer3.end(false);
                        } else {
                            if (!(iabMetadata2 instanceof IabMetadata.SUPMetadata)) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, 1383639285, false);
                            }
                            gapComposer3.startReplaceGroup(1383646157);
                            Flow flow6 = aggregateAutofillWebManager.cardFieldDetected;
                            shoppingWebPresenter5 = this;
                            mutableState13 = mutableState10;
                            Updater.LaunchedEffect(gapComposer3, flow6, new PoolsListPresenter$models$2$2(flow6, (Continuation) null, (Object) this, mutableState10, mutableState35, 24));
                            z4 = false;
                            gapComposer3.end(false);
                            gapComposer3.end(z4);
                        }
                    }
                    shoppingWebPresenter5 = shoppingWebPresenter10;
                    mutableState13 = mutableState10;
                    gapComposer3.end(z4);
                } else {
                    shoppingWebPresenter5 = shoppingWebPresenter10;
                    mutableState13 = mutableState10;
                    gapComposer3.startReplaceGroup(1383647807);
                    gapComposer3.end(false);
                }
                if (Intrinsics.areEqual(((State) mutableState13.getValue()).restrictedItemState.querySuccess, Boolean.TRUE)) {
                    FillrCartInformationExtraction$FillrCartInformation fillrCartInformationExtraction$FillrCartInformation4 = (FillrCartInformationExtraction$FillrCartInformation) mutableState35.getValue();
                    if (fillrCartInformationExtraction$FillrCartInformation4 != null && (restrictedItemOrNull = restrictedItemOrNull(fillrCartInformationExtraction$FillrCartInformation4)) != null) {
                        restrictedProduct = new RestrictedProduct(restrictedItemOrNull.name);
                        restrictedProduct2 = restrictedProduct;
                    }
                    restrictedProduct2 = null;
                } else {
                    FillrCartInformationExtraction$FillrCartProduct fillrCartInformationExtraction$FillrCartProduct = ((State) mutableState13.getValue()).restrictedItemState.firstRestrictedItemFromBackend;
                    if (fillrCartInformationExtraction$FillrCartProduct != null) {
                        restrictedProduct = new RestrictedProduct(fillrCartInformationExtraction$FillrCartProduct.name);
                        restrictedProduct2 = restrictedProduct;
                    }
                    restrictedProduct2 = null;
                }
                FillrStatus fillrStatus = new FillrStatus(((State) mutableState13.getValue()).fillrEnabled, ((State) mutableState13.getValue()).fillrVersions);
                CashFillStatus cashFillStatus = new CashFillStatus(shoppingWebPresenter5.cashFillEnabled, realCashFillJsStore.version);
                String str4 = ((State) mutableState13.getValue()).monitoringScriptVersion;
                realShoppingJavascriptPresenter = shoppingWebPresenter5.shoppingJsPresenter;
                realShoppingJavascriptPresenter.getClass();
                str4.getClass();
                gapComposer3.startReplaceGroup(-562187491);
                rememberedValue = gapComposer3.rememberedValue();
                if (rememberedValue == obj2) {
                    rememberedValue = Updater.mutableStateOf$default(new ShoppingJavascriptViewModel(InjectJavascriptViewModel$Empty.INSTANCE, PaykitInfoToastState.PAYKIT_LOADING));
                    gapComposer3.updateRememberedValue(rememberedValue);
                }
                mutableState14 = (MutableState) rememberedValue;
                rememberedValue2 = gapComposer3.rememberedValue();
                if (rememberedValue2 == obj2) {
                    rememberedValue2 = new RealRecipientRepository$suggestions$$inlined$map$1(flow, 13);
                    gapComposer3.updateRememberedValue(rememberedValue2);
                }
                Flow flow7 = (Flow) rememberedValue2;
                rememberUpdatedState = Updater.rememberUpdatedState(str4, gapComposer3);
                MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(fillrStatus, gapComposer3);
                MutableState rememberUpdatedState3 = Updater.rememberUpdatedState(cashFillStatus, gapComposer3);
                rememberedValue3 = gapComposer3.rememberedValue();
                if (rememberedValue3 == obj2) {
                    rememberedValue3 = Updater.mutableStateOf$default(bool3);
                    gapComposer3.updateRememberedValue(rememberedValue3);
                }
                MutableState mutableState36 = (MutableState) rememberedValue3;
                rememberedValue4 = gapComposer3.rememberedValue();
                if (rememberedValue4 == obj2) {
                    rememberedValue4 = Updater.derivedStateOf(new OverlayKt$$ExternalSyntheticLambda1(17, mutableState14));
                    gapComposer3.updateRememberedValue(rememberedValue4);
                }
                androidx.compose.runtime.State state = (androidx.compose.runtime.State) rememberedValue4;
                rememberedValue5 = gapComposer3.rememberedValue();
                if (rememberedValue5 == obj2) {
                    rememberedValue5 = Updater.createCompositionCoroutineScope(realShoppingJavascriptPresenter.ioDispatcher, gapComposer3);
                    gapComposer3.updateRememberedValue(rememberedValue5);
                }
                coroutineScope2 = (CoroutineScope) rememberedValue5;
                Boolean bool9 = (Boolean) mutableState36.getValue();
                bool9.getClass();
                changedInstance = gapComposer3.changedInstance(realShoppingJavascriptPresenter);
                rememberedValue6 = gapComposer3.rememberedValue();
                if (!changedInstance || rememberedValue6 == obj2) {
                    coroutineScope3 = coroutineScope2;
                    rememberedValue6 = new GovernmentIdFeed$analyze$5(realShoppingJavascriptPresenter, mutableState36, mutableState14, (Continuation) null);
                    gapComposer3.updateRememberedValue(rememberedValue6);
                } else {
                    coroutineScope3 = coroutineScope2;
                }
                Updater.LaunchedEffect(gapComposer3, bool9, (Function2) rememberedValue6);
                PaykitInfoToastState paykitInfoToastState = (PaykitInfoToastState) state.getValue();
                changedInstance2 = gapComposer3.changedInstance(realShoppingJavascriptPresenter);
                rememberedValue7 = gapComposer3.rememberedValue();
                if (!changedInstance2 || rememberedValue7 == obj2) {
                    mutableState15 = rememberUpdatedState;
                    continuation3 = null;
                    rememberedValue7 = new ProfileCropView.AnonymousClass3(realShoppingJavascriptPresenter, state, continuation3, 20);
                    gapComposer3.updateRememberedValue(rememberedValue7);
                } else {
                    mutableState15 = rememberUpdatedState;
                    continuation3 = null;
                }
                Updater.LaunchedEffect(gapComposer3, paykitInfoToastState, (Function2) rememberedValue7);
                Flow flow8 = realShoppingJavascriptPresenter.autofillManager.cardFieldDetected;
                Updater.LaunchedEffect(gapComposer3, flow8, new PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1(7, mutableState36, continuation3, flow8));
                ?? r18 = continuation3;
                Updater.LaunchedEffect(gapComposer3, flow7, new RealQrCodesPresenter$models$1$1(flow7, (Continuation) r18, realShoppingJavascriptPresenter, mutableState36, 28));
                rememberedValue8 = gapComposer3.rememberedValue();
                if (rememberedValue8 == obj2) {
                    rememberedValue8 = new RealRecipientRepository$suggestions$$inlined$map$1(flow, 10);
                    gapComposer3.updateRememberedValue(rememberedValue8);
                }
                Flow flow9 = (Flow) rememberedValue8;
                Updater.LaunchedEffect(gapComposer3, flow9, new RealQrCodesPresenter$models$1$1(flow9, (Continuation) r18, coroutineScope3, realShoppingJavascriptPresenter, 29));
                Updater.LaunchedEffect(gapComposer3, flow, new NotificationActionService$onHandleIntent$1(flow, (Continuation) null, realShoppingJavascriptPresenter, mutableState15, rememberUpdatedState2, rememberUpdatedState3, 10));
                rememberedValue9 = gapComposer3.rememberedValue();
                if (rememberedValue9 == obj2) {
                    rememberedValue9 = new RealRecipientRepository$suggestions$$inlined$map$1(flow, 11);
                    gapComposer3.updateRememberedValue(rememberedValue9);
                }
                Flow flow10 = (Flow) rememberedValue9;
                rememberedValue10 = gapComposer3.rememberedValue();
                if (rememberedValue10 == obj2) {
                    rememberedValue10 = Updater.mutableStateOf$default(r18);
                    gapComposer3.updateRememberedValue(rememberedValue10);
                }
                Updater.LaunchedEffect(gapComposer3, flow10, new PoolsListPresenter$models$2$2(flow10, (Continuation) null, realShoppingJavascriptPresenter, (MutableState) rememberedValue10, mutableState14, 21));
                rememberedValue11 = gapComposer3.rememberedValue();
                if (rememberedValue11 == obj2) {
                    rememberedValue11 = new RealRecipientRepository$suggestions$$inlined$map$1(flow, 12);
                    gapComposer3.updateRememberedValue(rememberedValue11);
                }
                flow2 = (Flow) rememberedValue11;
                changedInstance3 = gapComposer3.changedInstance(flow2) | gapComposer3.changedInstance(restrictedProduct2) | gapComposer3.changedInstance(realShoppingJavascriptPresenter);
                rememberedValue12 = gapComposer3.rememberedValue();
                if (!changedInstance3 || rememberedValue12 == obj2) {
                    restrictedProduct3 = restrictedProduct2;
                    flow3 = flow2;
                    rememberedValue12 = new PoolsListPresenter$models$2$2(flow3, restrictedProduct3, realShoppingJavascriptPresenter, mutableState14, (Continuation) null);
                    gapComposer3.updateRememberedValue(rememberedValue12);
                } else {
                    flow3 = flow2;
                    restrictedProduct3 = restrictedProduct2;
                }
                Updater.LaunchedEffect(flow3, restrictedProduct3, (Function2) rememberedValue12, gapComposer3);
                ShoppingJavascriptViewModel shoppingJavascriptViewModel = (ShoppingJavascriptViewModel) mutableState14.getValue();
                gapComposer3.end(false);
                changedInstance4 = gapComposer3.changedInstance(coroutineScope5) | gapComposer3.changedInstance(shoppingWebPresenter5);
                rememberedValue13 = gapComposer3.rememberedValue();
                if (!changedInstance4 || rememberedValue13 == obj2) {
                    ShoppingWebPresenter shoppingWebPresenter11 = shoppingWebPresenter5;
                    mutableState16 = mutableState13;
                    CashMapViewKt$$ExternalSyntheticLambda15 cashMapViewKt$$ExternalSyntheticLambda15 = new CashMapViewKt$$ExternalSyntheticLambda15(coroutineScope5, shoppingWebPresenter11, mutableState34, mutableState16, parcelableSnapshotMutableIntState, 21);
                    shoppingWebPresenter6 = shoppingWebPresenter11;
                    gapComposer3.updateRememberedValue(cashMapViewKt$$ExternalSyntheticLambda15);
                    rememberedValue13 = cashMapViewKt$$ExternalSyntheticLambda15;
                } else {
                    shoppingWebPresenter6 = shoppingWebPresenter5;
                    mutableState16 = mutableState13;
                }
                Function2 function2 = (Function2) rememberedValue13;
                AnswerDispatcher answerDispatcher = (AnswerDispatcher) gapComposer3.consume(AnswersKt.LocalAnswerDispatcher);
                changed = gapComposer3.changed(function2) | gapComposer3.changedInstance(answerDispatcher);
                rememberedValue14 = gapComposer3.rememberedValue();
                if (!changed || rememberedValue14 == obj2) {
                    rememberedValue14 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, 22);
                    gapComposer3.updateRememberedValue(rememberedValue14);
                }
                Updater.DisposableEffect(answerDispatcher, (Function1) rememberedValue14, gapComposer3);
                State state2 = (State) mutableState16.getValue();
                shoppingWebScreen = (!(shoppingWebScreen2 instanceof ShoppingWebScreen.IncentiveShoppingScreen) || ExifInterfaceUtils.isVersion2WithCorrectMetadata(shoppingWebScreen2, WebViewUseCase.INCENTIVES)) ? shoppingWebScreen2 : r18;
                AndroidStringManager androidStringManager = shoppingWebPresenter6.stringManager;
                if (shoppingWebScreen == null) {
                    if (shoppingWebScreen instanceof ShoppingWebScreen.IncentiveShoppingScreen) {
                        str2 = DECIMAL_FORMAT.format(((ShoppingWebScreen.IncentiveShoppingScreen) shoppingWebScreen).discountAmount * 0.01d);
                    } else if (shoppingWebScreen instanceof ShoppingWebScreen.ShoppingWebScreenV2) {
                        IabMetadata iabMetadata3 = ((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen).metadata;
                        iabMetadata3.getClass();
                        str2 = StringsKt.removeSuffix(shoppingWebPresenter6.formatMoney(((IabMetadata.CashPayMetadata) iabMetadata3).rewardAmount), "%");
                    } else {
                        str2 = "";
                    }
                    str2.getClass();
                    Resources resources = androidStringManager.resources;
                    resources.getClass();
                    String format2 = new MessageFormat(resources.getString(R.string.shop_incentive_prompt_title)).format(new Object[]{str2});
                    format2.getClass();
                    paykitInfoToastViewModel = new PaykitInfoToastViewModel(R.drawable.ic_pwc_icon, format2, androidStringManager.get(R.string.shop_incentive_prompt_info_toast_description));
                } else {
                    paykitInfoToastViewModel = r18;
                }
                String str5 = state2.headerViewModel.urlText;
                Object errorUrl = (str5 != null || str5.length() == 0) ? new ShoppingViewModel.ErrorUrl(state2.headerViewModel, state2.footerViewModel, state2.fillrEnabled, androidStringManager.get(R.string.shop_web_page_error_card_description_generic_error), ErrorUrlAction.RETRY) : new ShoppingViewModel.ValidUrl(state2.headerViewModel, state2.footerViewModel, shoppingJavascriptViewModel.injectJavascriptViewModel, paykitInfoToastViewModel, shoppingJavascriptViewModel.paykitInfoToastState, state2.fillrEnabled, !ExifInterfaceUtils.isVersion2WithCorrectMetadata(shoppingWebScreen2, WebViewUseCase.SUP), state2.monitoringScriptUrl, state2.shouldMonitorWeb, state2.webViewUseCase, state2.autofillFooterViewModel, state2.showAutofillSuccessToast);
                gapComposer3.end(false);
                return errorUrl;
            }
            gapComposer3.startReplaceGroup(-57081423);
            boolean changedInstance14 = gapComposer3.changedInstance(shoppingWebPresenter10);
            Object rememberedValue53 = gapComposer3.rememberedValue();
            if (changedInstance14 || rememberedValue53 == obj2) {
                rememberedValue53 = new ChatInputView$Content$1$1$1(shoppingWebPresenter10, null, i10);
                gapComposer3.updateRememberedValue(rememberedValue53);
            }
            Updater.LaunchedEffect(gapComposer3, unit, (Function2) rememberedValue53);
            gapComposer3.end(false);
        }
        shoppingWebPresenter5 = shoppingWebPresenter10;
        mutableState13 = mutableState10;
        if (Intrinsics.areEqual(((State) mutableState13.getValue()).restrictedItemState.querySuccess, Boolean.TRUE)) {
        }
        FillrStatus fillrStatus2 = new FillrStatus(((State) mutableState13.getValue()).fillrEnabled, ((State) mutableState13.getValue()).fillrVersions);
        CashFillStatus cashFillStatus2 = new CashFillStatus(shoppingWebPresenter5.cashFillEnabled, realCashFillJsStore.version);
        String str42 = ((State) mutableState13.getValue()).monitoringScriptVersion;
        realShoppingJavascriptPresenter = shoppingWebPresenter5.shoppingJsPresenter;
        realShoppingJavascriptPresenter.getClass();
        str42.getClass();
        gapComposer3.startReplaceGroup(-562187491);
        rememberedValue = gapComposer3.rememberedValue();
        if (rememberedValue == obj2) {
        }
        mutableState14 = (MutableState) rememberedValue;
        rememberedValue2 = gapComposer3.rememberedValue();
        if (rememberedValue2 == obj2) {
        }
        Flow flow72 = (Flow) rememberedValue2;
        rememberUpdatedState = Updater.rememberUpdatedState(str42, gapComposer3);
        MutableState rememberUpdatedState22 = Updater.rememberUpdatedState(fillrStatus2, gapComposer3);
        MutableState rememberUpdatedState32 = Updater.rememberUpdatedState(cashFillStatus2, gapComposer3);
        rememberedValue3 = gapComposer3.rememberedValue();
        if (rememberedValue3 == obj2) {
        }
        MutableState mutableState362 = (MutableState) rememberedValue3;
        rememberedValue4 = gapComposer3.rememberedValue();
        if (rememberedValue4 == obj2) {
        }
        androidx.compose.runtime.State state3 = (androidx.compose.runtime.State) rememberedValue4;
        rememberedValue5 = gapComposer3.rememberedValue();
        if (rememberedValue5 == obj2) {
        }
        coroutineScope2 = (CoroutineScope) rememberedValue5;
        Boolean bool92 = (Boolean) mutableState362.getValue();
        bool92.getClass();
        changedInstance = gapComposer3.changedInstance(realShoppingJavascriptPresenter);
        rememberedValue6 = gapComposer3.rememberedValue();
        if (changedInstance) {
        }
        coroutineScope3 = coroutineScope2;
        rememberedValue6 = new GovernmentIdFeed$analyze$5(realShoppingJavascriptPresenter, mutableState362, mutableState14, (Continuation) null);
        gapComposer3.updateRememberedValue(rememberedValue6);
        Updater.LaunchedEffect(gapComposer3, bool92, (Function2) rememberedValue6);
        PaykitInfoToastState paykitInfoToastState2 = (PaykitInfoToastState) state3.getValue();
        changedInstance2 = gapComposer3.changedInstance(realShoppingJavascriptPresenter);
        rememberedValue7 = gapComposer3.rememberedValue();
        if (changedInstance2) {
        }
        mutableState15 = rememberUpdatedState;
        continuation3 = null;
        rememberedValue7 = new ProfileCropView.AnonymousClass3(realShoppingJavascriptPresenter, state3, continuation3, 20);
        gapComposer3.updateRememberedValue(rememberedValue7);
        Updater.LaunchedEffect(gapComposer3, paykitInfoToastState2, (Function2) rememberedValue7);
        Flow flow82 = realShoppingJavascriptPresenter.autofillManager.cardFieldDetected;
        Updater.LaunchedEffect(gapComposer3, flow82, new PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1(7, mutableState362, continuation3, flow82));
        ?? r182 = continuation3;
        Updater.LaunchedEffect(gapComposer3, flow72, new RealQrCodesPresenter$models$1$1(flow72, (Continuation) r182, realShoppingJavascriptPresenter, mutableState362, 28));
        rememberedValue8 = gapComposer3.rememberedValue();
        if (rememberedValue8 == obj2) {
        }
        Flow flow92 = (Flow) rememberedValue8;
        Updater.LaunchedEffect(gapComposer3, flow92, new RealQrCodesPresenter$models$1$1(flow92, (Continuation) r182, coroutineScope3, realShoppingJavascriptPresenter, 29));
        Updater.LaunchedEffect(gapComposer3, flow, new NotificationActionService$onHandleIntent$1(flow, (Continuation) null, realShoppingJavascriptPresenter, mutableState15, rememberUpdatedState22, rememberUpdatedState32, 10));
        rememberedValue9 = gapComposer3.rememberedValue();
        if (rememberedValue9 == obj2) {
        }
        Flow flow102 = (Flow) rememberedValue9;
        rememberedValue10 = gapComposer3.rememberedValue();
        if (rememberedValue10 == obj2) {
        }
        Updater.LaunchedEffect(gapComposer3, flow102, new PoolsListPresenter$models$2$2(flow102, (Continuation) null, realShoppingJavascriptPresenter, (MutableState) rememberedValue10, mutableState14, 21));
        rememberedValue11 = gapComposer3.rememberedValue();
        if (rememberedValue11 == obj2) {
        }
        flow2 = (Flow) rememberedValue11;
        changedInstance3 = gapComposer3.changedInstance(flow2) | gapComposer3.changedInstance(restrictedProduct2) | gapComposer3.changedInstance(realShoppingJavascriptPresenter);
        rememberedValue12 = gapComposer3.rememberedValue();
        if (changedInstance3) {
        }
        restrictedProduct3 = restrictedProduct2;
        flow3 = flow2;
        rememberedValue12 = new PoolsListPresenter$models$2$2(flow3, restrictedProduct3, realShoppingJavascriptPresenter, mutableState14, (Continuation) null);
        gapComposer3.updateRememberedValue(rememberedValue12);
        Updater.LaunchedEffect(flow3, restrictedProduct3, (Function2) rememberedValue12, gapComposer3);
        ShoppingJavascriptViewModel shoppingJavascriptViewModel2 = (ShoppingJavascriptViewModel) mutableState14.getValue();
        gapComposer3.end(false);
        changedInstance4 = gapComposer3.changedInstance(coroutineScope5) | gapComposer3.changedInstance(shoppingWebPresenter5);
        rememberedValue13 = gapComposer3.rememberedValue();
        if (changedInstance4) {
        }
        ShoppingWebPresenter shoppingWebPresenter112 = shoppingWebPresenter5;
        mutableState16 = mutableState13;
        CashMapViewKt$$ExternalSyntheticLambda15 cashMapViewKt$$ExternalSyntheticLambda152 = new CashMapViewKt$$ExternalSyntheticLambda15(coroutineScope5, shoppingWebPresenter112, mutableState34, mutableState16, parcelableSnapshotMutableIntState, 21);
        shoppingWebPresenter6 = shoppingWebPresenter112;
        gapComposer3.updateRememberedValue(cashMapViewKt$$ExternalSyntheticLambda152);
        rememberedValue13 = cashMapViewKt$$ExternalSyntheticLambda152;
        Function2 function22 = (Function2) rememberedValue13;
        AnswerDispatcher answerDispatcher2 = (AnswerDispatcher) gapComposer3.consume(AnswersKt.LocalAnswerDispatcher);
        changed = gapComposer3.changed(function22) | gapComposer3.changedInstance(answerDispatcher2);
        rememberedValue14 = gapComposer3.rememberedValue();
        if (!changed) {
        }
        rememberedValue14 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function22, answerDispatcher2, 22);
        gapComposer3.updateRememberedValue(rememberedValue14);
        Updater.DisposableEffect(answerDispatcher2, (Function1) rememberedValue14, gapComposer3);
        State state22 = (State) mutableState16.getValue();
        if (shoppingWebScreen2 instanceof ShoppingWebScreen.IncentiveShoppingScreen) {
        }
        AndroidStringManager androidStringManager2 = shoppingWebPresenter6.stringManager;
        if (shoppingWebScreen == null) {
        }
        String str52 = state22.headerViewModel.urlText;
        if (str52 != null) {
        }
        gapComposer3.end(false);
        return errorUrl;
    }

    public final void performAutofill(AutofillWebInfo autofillWebInfo, ShoppingWebPresenter$Companion$FillType shoppingWebPresenter$Companion$FillType) {
        if (shoppingWebPresenter$Companion$FillType == ShoppingWebPresenter$Companion$FillType.CARD) {
            RealBugReportSenderFactory realBugReportSenderFactory = this.shoppingWebAnalytics;
            String str = (String) realBugReportSenderFactory.tempStorage;
            InfoContext infoContext = (InfoContext) realBugReportSenderFactory.featureEligibilityDumper;
            this.analytics.track(new BrowserCheckoutFillVirtualCard((BrowserOrigin) realBugReportSenderFactory.sessionManager, infoContext, str, (String) realBugReportSenderFactory.cashDatabase, (String) realBugReportSenderFactory.recentMoneybotSession, (String) realBugReportSenderFactory.backStackDumper), null);
        }
        AggregateAutofillWebManager aggregateAutofillWebManager = this.autofillManager;
        aggregateAutofillWebManager.setAutofillInfo(autofillWebInfo);
        aggregateAutofillWebManager.triggerAutofill();
    }

    /* renamed from: com.squareup.cash.shopping.presenters.ShoppingWebPresenter$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ ShoppingWebPresenter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(ShoppingWebPresenter shoppingWebPresenter, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = shoppingWebPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            ShoppingWebPresenter shoppingWebPresenter = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass1(shoppingWebPresenter, continuation, 0);
                case 1:
                    return new AnonymousClass1(shoppingWebPresenter, continuation, 1);
                case 2:
                    return new AnonymousClass1(shoppingWebPresenter, continuation, 2);
                case 3:
                    return new AnonymousClass1(shoppingWebPresenter, continuation, 3);
                default:
                    return new AnonymousClass1(shoppingWebPresenter, continuation, 4);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            ShoppingWebPresenter shoppingWebPresenter = this.this$0;
            RequestContext requestContext = null;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 take = FlowKt.take(new RealRecipientRepository$suggestions$$inlined$map$1(shoppingWebPresenter.boostRepository.boostSelector.actions, 14), 1);
                        C00661 c00661 = new C00661(shoppingWebPresenter);
                        this.label = 1;
                        if (take.collect(c00661, this) == coroutineSingletons) {
                            break;
                        }
                    } else if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        KeyValue keyValue = shoppingWebPresenter.seenOfferAutofillSheet;
                        Boolean bool = Boolean.TRUE;
                        this.label = 1;
                        if (keyValue.set(bool, this) == coroutineSingletons2) {
                            break;
                        }
                    } else if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 2:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = this.label;
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        KeyValue keyValue2 = shoppingWebPresenter.seenOfferAutofillSheet;
                        Boolean bool2 = Boolean.TRUE;
                        this.label = 1;
                        if (keyValue2.set(bool2, this) == coroutineSingletons3) {
                            break;
                        }
                    } else if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 3:
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i5 = this.label;
                    if (i5 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        KeyValue keyValue3 = shoppingWebPresenter.seenOfferAutofillSheet;
                        Boolean bool3 = Boolean.TRUE;
                        this.label = 1;
                        if (keyValue3.set(bool3, this) == coroutineSingletons4) {
                            break;
                        }
                    } else if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                default:
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i6 = this.label;
                    if (i6 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        zzr zzrVar = shoppingWebPresenter.affiliateBrowserPlasmaFlowRepository;
                        this.label = 1;
                        if (((AppService) zzrVar.zza).getFlow("/2.0/cash/get-flow", null, null, new GetFlowRequest(requestContext, new GetFlowRequest.Input.FlowType(Flow$Type.INITIATE_IN_APP_BROWSER_FOR_OFFER), 5), this) == coroutineSingletons5) {
                            break;
                        }
                    } else if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
            }
            return Unit.INSTANCE;
        }

        /* renamed from: com.squareup.cash.shopping.presenters.ShoppingWebPresenter$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00661 implements FlowCollector {
            public final /* synthetic */ int $r8$classId = 0;
            public final /* synthetic */ ShoppingWebPresenter this$0;

            public C00661(ShoppingWebPresenter shoppingWebPresenter) {
                this.this$0 = shoppingWebPresenter;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r13v2, types: [com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator$ScreenNavigator] */
            /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
            /* JADX WARN: Type inference failed for: r4v1, types: [app.cash.broadway.screen.Screen] */
            /* JADX WARN: Type inference failed for: r4v2 */
            /* JADX WARN: Type inference failed for: r4v3 */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                String str;
                String str2;
                String str3;
                EntityInformation entityInformation;
                switch (this.$r8$classId) {
                    case 0:
                        BoostAction.Blockers blockers = (BoostAction.Blockers) obj;
                        ShoppingWebPresenter shoppingWebPresenter = this.this$0;
                        ShoppingWebScreen shoppingWebScreen = shoppingWebPresenter.args;
                        ?? r13 = shoppingWebPresenter.navigator;
                        ?? r4 = 0;
                        r4 = 0;
                        ShoppingWebScreen shoppingWebScreen2 = ((shoppingWebScreen instanceof ShoppingWebScreen.AffiliateShoppingScreen) || ExifInterfaceUtils.isVersion2WithCorrectMetadata(shoppingWebScreen, WebViewUseCase.AFFILIATE)) ? shoppingWebScreen : null;
                        if (shoppingWebScreen2 != null) {
                            if (shoppingWebScreen2 instanceof ShoppingWebScreen.AffiliateShoppingScreen) {
                                str2 = ((ShoppingWebScreen.AffiliateShoppingScreen) shoppingWebScreen2).rewardToken;
                            } else if (shoppingWebScreen2 instanceof ShoppingWebScreen.ShoppingWebScreenV2) {
                                IabMetadata iabMetadata = ((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen2).metadata;
                                iabMetadata.getClass();
                                str2 = ((IabMetadata.AffiliateBoostMetadata) iabMetadata).boostToken;
                            } else {
                                str = null;
                                JobKt.launch(shoppingWebPresenter.scope, shoppingWebPresenter.ioDispatcher, CoroutineStart.UNDISPATCHED, new BasicShieetKt$BasicShieet$4$1(shoppingWebPresenter, str, shoppingWebScreen2, r4, 19));
                            }
                            str = str2;
                            JobKt.launch(shoppingWebPresenter.scope, shoppingWebPresenter.ioDispatcher, CoroutineStart.UNDISPATCHED, new BasicShieetKt$BasicShieet$4$1(shoppingWebPresenter, str, shoppingWebScreen2, r4, 19));
                        }
                        ShoppingScreenContext screenContext = shoppingWebScreen.getScreenContext();
                        if (screenContext instanceof ShoppingScreenContext.Directory) {
                            r13.goTo(new GlobalSearchScreen(SearchOrigin.DISCOVER_TAB, false));
                        } else {
                            boolean z = screenContext instanceof ShoppingScreenContext.MerchantProfile;
                            Back back = Back.INSTANCE;
                            if (z) {
                                String merchantToken = EmojiExclusions.getMerchantToken(shoppingWebScreen);
                                GetProfileDetailsContext getProfileDetailsContext = GetProfileDetailsContext.UNKNOWN;
                                if (merchantToken != null && (StringsKt__StringsJVMKt.startsWith(merchantToken, "M_", false) || StringsKt__StringsJVMKt.startsWith(merchantToken, "BRAND_", false))) {
                                    r4 = new MerchantScreen$MerchantProfileScreen(new RedactedString(merchantToken), getProfileDetailsContext, null, BackNavigationAction.CLOSE, null);
                                }
                                if (r4 != 0) {
                                    r13.goTo(r4);
                                } else {
                                    r13.goTo(back);
                                }
                            } else {
                                r13.goTo(back);
                            }
                        }
                        r13.goTo(blockers.screen);
                        break;
                    default:
                        ShoppingWebPresenter shoppingWebPresenter2 = this.this$0;
                        ShoppingWebScreen shoppingWebScreen3 = shoppingWebPresenter2.args;
                        if (((Boolean) obj).booleanValue()) {
                            BetterNavigator.ScreenNavigator screenNavigator = shoppingWebPresenter2.navigator;
                            String merchantToken2 = EmojiExclusions.getMerchantToken(shoppingWebScreen3);
                            shoppingWebScreen3.getClass();
                            if (shoppingWebScreen3 instanceof ShoppingWebScreen.ShoppingWebScreenV2) {
                                str3 = ((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen3).entityInformation.business_name;
                            } else {
                                ShoppingScreenContext screenContext2 = shoppingWebScreen3.getScreenContext();
                                str3 = (screenContext2 == null || (entityInformation = EmojiExclusions.getEntityInformation(screenContext2)) == null) ? null : entityInformation.businessName;
                            }
                            screenNavigator.goTo(new AfterpayAppletScreen$AfterpayAppletSelectAfterpayPromptSheet(merchantToken2, str3, ""));
                        }
                        break;
                }
                return Unit.INSTANCE;
            }

            public C00661(CoroutineScope coroutineScope, ShoppingWebPresenter shoppingWebPresenter) {
                this.this$0 = shoppingWebPresenter;
            }
        }
    }

    public final class MerchantConfig {
        public final Long activeLoans;
        public final Money availableLimit;
        public final boolean cardOnFile;
        public final Money cartMinimum;
        public final Long loanLimit;
        public final Boolean querySuccess;

        public /* synthetic */ MerchantConfig(int i) {
            this(false, null, null, null, null, (i & 32) != 0 ? null : Boolean.FALSE);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MerchantConfig)) {
                return false;
            }
            MerchantConfig merchantConfig = (MerchantConfig) obj;
            return this.cardOnFile == merchantConfig.cardOnFile && Intrinsics.areEqual(this.cartMinimum, merchantConfig.cartMinimum) && Intrinsics.areEqual(this.availableLimit, merchantConfig.availableLimit) && Intrinsics.areEqual(this.loanLimit, merchantConfig.loanLimit) && Intrinsics.areEqual(this.activeLoans, merchantConfig.activeLoans) && Intrinsics.areEqual(this.querySuccess, merchantConfig.querySuccess);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.cardOnFile) * 31;
            Money money = this.cartMinimum;
            int hashCode2 = (hashCode + (money == null ? 0 : money.hashCode())) * 31;
            Money money2 = this.availableLimit;
            int hashCode3 = (hashCode2 + (money2 == null ? 0 : money2.hashCode())) * 31;
            Long l = this.loanLimit;
            int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.activeLoans;
            int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
            Boolean bool = this.querySuccess;
            return hashCode5 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            return "MerchantConfig(cardOnFile=" + this.cardOnFile + ", cartMinimum=" + this.cartMinimum + ", availableLimit=" + this.availableLimit + ", loanLimit=" + this.loanLimit + ", activeLoans=" + this.activeLoans + ", querySuccess=" + this.querySuccess + ")";
        }

        public MerchantConfig(boolean z, Money money, Money money2, Long l, Long l2, Boolean bool) {
            this.cardOnFile = z;
            this.cartMinimum = money;
            this.availableLimit = money2;
            this.loanLimit = l;
            this.activeLoans = l2;
            this.querySuccess = bool;
        }
    }
}
