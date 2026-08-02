package app.cash.local.presenters;

import android.app.Activity;
import androidx.compose.material3.SliderState$drag$2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.StateListIterator;
import androidx.emoji2.text.MetadataRepo;
import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import androidx.paging.CachedPageEventFlow$$ExternalSyntheticLambda0;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2$clear$2;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.broadway.screen.Screen;
import app.cash.local.backend.BuyerIntentScope;
import app.cash.local.backend.CartBuilder;
import app.cash.local.backend.CartBuilderManager;
import app.cash.local.backend.real.RealCartBuilder;
import app.cash.local.backend.real.RealCartBuilderManager;
import app.cash.local.backend.real.RealLocalBrandSyncer;
import app.cash.local.backend.real.RealMarketingMessageRepository;
import app.cash.local.navigation.LocalInstalledStore;
import app.cash.local.presenters.internal.ComputedRow;
import app.cash.local.presenters.internal.DynamicChargesBreakdownComputer;
import app.cash.local.presenters.internal.LocalResponseContextHandler$Factory$Impl;
import app.cash.local.presenters.internal.LocalsKt;
import app.cash.local.presenters.internal.OrderRow;
import app.cash.local.presenters.internal.OrderSummary;
import app.cash.local.primitives.AttributionKey;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.Cart;
import app.cash.local.primitives.ComputedOrderSummary;
import app.cash.local.primitives.ComputedOrderSummaryKt;
import app.cash.local.primitives.DiscountCode;
import app.cash.local.primitives.DiscountCodeKt;
import app.cash.local.primitives.Fulfillment;
import app.cash.local.primitives.FulfillmentKt;
import app.cash.local.primitives.GiftCardAccountNumber;
import app.cash.local.primitives.LocalCurrencyCode;
import app.cash.local.primitives.LocalErrorKt;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.LocalMoneyKt;
import app.cash.local.primitives.OfferToken;
import app.cash.local.primitives.PaymentMethod;
import app.cash.local.primitives.PaymentMethodToken;
import app.cash.local.primitives.RewardToken;
import app.cash.local.primitives.math.LocalMoneysKt;
import app.cash.local.primitives.order.RowIdentifier;
import app.cash.local.screens.app.LocalBrandLocationCheckoutScreen;
import app.cash.local.screens.app.LocalBrandLocationOpenTabCheckoutScreen;
import app.cash.local.screens.app.LocalExplanatoryDialog;
import app.cash.local.screens.app.LocalOrderStatusScreen;
import app.cash.local.service.LocalService;
import app.cash.local.store.real.RealLocalInstalledStore;
import app.cash.local.viewmodels.CurbsidePickupDetails;
import app.cash.local.viewmodels.OrderBuilderEvent;
import app.cash.local.viewmodels.OrderBuilderModel;
import app.cash.molecule.PlatformKt;
import app.cash.zipline.loader.ZiplineLoader$load$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.n$$ExternalSyntheticLambda1;
import coil3.intercept.EngineInterceptor$intercept$2;
import com.android.volley.toolbox.HurlStack;
import com.caverock.androidsvg.SVG;
import com.datadog.android.core.persistence.SerializerKt;
import com.datadog.android.rum.model.ActionEvent;
import com.google.android.gms.internal.mlkit_vision_common.zzho;
import com.squareup.cash.R;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.localclient.ErrorType;
import com.squareup.cash.cdf.localclient.LocalClientCheckoutFlowGCFailure;
import com.squareup.cash.cdf.localclient.LocalClientCheckoutFlowOrderFailed;
import com.squareup.cash.cdf.localclient.LocalClientCheckoutFlowPlaceOrder;
import com.squareup.cash.cdf.localclient.LocalClientCheckoutFlowRedeemGC;
import com.squareup.cash.cdf.localclient.LocalClientCheckoutFlowRemoveGC;
import com.squareup.cash.cdf.localclient.LocalClientCheckoutFlowToggleLocalCash;
import com.squareup.cash.cdf.localclient.PaymentType;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.protos.cash.local.client.app.v1.CreateAppOrderRequest;
import com.squareup.protos.cash.local.client.app.v1.CreateAppOrderResponse;
import com.squareup.protos.cash.local.client.v1.CreateCartRequest;
import com.squareup.protos.cash.local.client.v1.CreateCartResponse;
import com.squareup.protos.cash.local.client.v1.CreateCartResponse$Response$Cart;
import com.squareup.protos.cash.local.client.v1.CreateCartResponse$Response$ErrorResponse;
import com.squareup.protos.cash.local.client.v1.CreateOrderRequest;
import com.squareup.protos.cash.local.client.v1.CreateOrderRequest$Payment$InstrumentToken;
import com.squareup.protos.cash.local.client.v1.CreateOrderRequest$Payment$SquarePaymentToken;
import com.squareup.protos.cash.local.client.v1.CreateOrderRequest$Payment$UseCashBalance;
import com.squareup.protos.cash.local.client.v1.CreateOrderResponse;
import com.squareup.protos.cash.local.client.v1.CreateOrderResponse$Response$ErrorResponse;
import com.squareup.protos.cash.local.client.v1.CreateOrderResponse$Response$ErrorResponses;
import com.squareup.protos.cash.local.client.v1.CreateOrderResponse$Response$OpenTab;
import com.squareup.protos.cash.local.client.v1.CreateOrderResponse$Response$Success;
import com.squareup.protos.cash.local.client.v1.CreateOrderResponse$Response$UpdatedCartResponse;
import com.squareup.protos.cash.local.client.v1.GiftCard;
import com.squareup.protos.cash.local.client.v1.LegalConsent;
import com.squareup.protos.cash.local.client.v1.LocalAdditionalBuyerInfo;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.protos.cash.local.client.v1.LocalCashConfiguration;
import com.squareup.protos.cash.local.client.v1.LocalCashEarningsConfiguration;
import com.squareup.protos.cash.local.client.v1.LocalCheckoutLocationSummary;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalOrder;
import com.squareup.protos.cash.local.client.v1.LocalPaymentMethod;
import com.squareup.protos.cash.local.client.v1.LocalPaymentMethod$PaymentMethodData$StoredInstrument;
import com.squareup.protos.cash.local.client.v1.LocalPaymentOption;
import com.squareup.protos.cash.local.client.v1.LocalStoredInstrument;
import com.squareup.protos.cash.local.client.v1.LocalTippingConfiguration;
import com.squareup.protos.cash.local.client.v1.OrderWorkflow;
import com.squareup.protos.cash.local.client.v1.PreferredPaymentMethod;
import com.squareup.protos.cash.local.client.v1.RecipientIdentifier;
import com.squareup.protos.cash.local.client.v1.RecipientIdentifierType;
import com.squareup.protos.cash.local.client.v1.UpdateCartRequest;
import com.squareup.protos.cash.local.client.v1.UpdateCartResponse;
import com.squareup.protos.cash.local.client.v1.UpdateCartResponse$Response$Error;
import com.squareup.protos.cash.local.client.v1.UpdateCartResponse$Response$Success;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import sqip.CardDetails;
import sqip.CardEntry;
import sqip.CardEntryActivityCommand;
import sqip.CardNonceBackgroundHandler;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class RealOrderBuilder implements MoleculeCallbackPresenter, CardNonceBackgroundHandler {
    public final Analytics analytics;
    public final ParcelableSnapshotMutableState appliedGiftCardCodes$delegate;
    public final AttributionKey attributionKey;
    public final BrandSpot brandSpot;
    public final ParcelableSnapshotMutableState buyerInfo$delegate;
    public final CartBuilder cartBuilder;
    public final ParcelableSnapshotMutableState cartResponse$delegate;
    public final String checkoutFlowToken;
    public final ParcelableSnapshotMutableIntState createOrderTrigger$delegate;
    public final ParcelableSnapshotMutableState curbsidePickupDetails$delegate;
    public final ParcelableSnapshotMutableState dropoffNotes$delegate;
    public final boolean gmsWalletApiEnabled;
    public final MetadataRepo googlePayPaymentsClient;
    public final ParcelableSnapshotMutableState googlePayReadyToPay$delegate;
    public final ExoPlayerImplInternal$$ExternalSyntheticLambda2 inAppPaymentLauncher;
    public final boolean isProfileSheetInline;
    public final LocalInstalledStore localInstalledStore;
    public final RealMarketingMessageRepository marketingMessageRepository;
    public final Navigator navigator;
    public final ParcelableSnapshotMutableState noContactDelivery$delegate;
    public String nonce;
    public final ParcelableSnapshotMutableState orderNotes$delegate;
    public final OrderBuilder$Payload payload;
    public OrderWorkflow pendingCreateOrderWorkflow;
    public final ParcelableSnapshotMutableState redeemLocalCashBalance$delegate;
    public final SVG responseContextHandler;
    public final ParcelableSnapshotMutableState selectedPaymentMethodToken$delegate;
    public final LocalService service;
    public final SessionManager sessionManager;
    public final AndroidStringManager stringManager;
    public final BrandSpotSyncTokens syncTokens;
    public final RealLocalBrandSyncer syncer;
    public final ParcelableSnapshotMutableState tipAmount$delegate;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            int[] iArr2 = new int[LocalPaymentOption.values().length];
            try {
                iArr2[LocalPaymentOption.LOCAL_PAYMENT_OPTION_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[LocalPaymentOption.LOCAL_PAYMENT_OPTION_APPLE_PAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[LocalPaymentOption.LOCAL_PAYMENT_OPTION_NO_REQUIREMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[LocalPaymentOption.LOCAL_PAYMENT_OPTION_MANUAL_CARD_ENTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[LocalPaymentOption.LOCAL_PAYMENT_OPTION_GOOGLE_PAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[LocalPaymentOption.LOCAL_PAYMENT_OPTION_CASH_APP_PAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[LocalPaymentOption.LOCAL_PAYMENT_OPTION_STORED_INSTRUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[LocalPaymentOption.LOCAL_PAYMENT_OPTION_AFTERPAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0195, code lost:
    
        if (r8 != null) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RealOrderBuilder(ExoPlayerImplInternal$$ExternalSyntheticLambda2 exoPlayerImplInternal$$ExternalSyntheticLambda2, MetadataRepo metadataRepo, boolean z, HurlStack hurlStack, Analytics analytics, LocalService localService, CartBuilderManager cartBuilderManager, LocalInstalledStore localInstalledStore, AndroidStringManager androidStringManager, SessionManager sessionManager, LocalPresenterModule$Companion$$ExternalSyntheticLambda0 localPresenterModule$Companion$$ExternalSyntheticLambda0, RealMarketingMessageRepository realMarketingMessageRepository, RealLocalBrandSyncer realLocalBrandSyncer, LocalResponseContextHandler$Factory$Impl localResponseContextHandler$Factory$Impl, BrandSpot brandSpot, CreateCartResponse createCartResponse, AttributionKey attributionKey, Navigator navigator, String str, OrderBuilder$Payload orderBuilder$Payload, boolean z2, BrandSpotSyncTokens brandSpotSyncTokens, BuyerIntentScope buyerIntentScope) {
        Object obj;
        Object obj2;
        OrderBuilderModel.BuyerInfo unvalidated;
        boolean z3;
        OrderBuilder$Payload orderBuilder$Payload2;
        boolean booleanValue;
        LocalFulfillment.DeliveryDetails deliveryDetails;
        LocalFulfillment.DeliveryDetails deliveryDetails2;
        LocalTippingConfiguration localTippingConfiguration;
        LocalMoney localMoney;
        String str2;
        CurbsidePickupDetails curbsidePickupDetails;
        Object obj3;
        String str3;
        com.squareup.protos.cash.local.client.v1.LocalMoney localMoney2;
        brandSpot.getClass();
        createCartResponse.getClass();
        List list = createCartResponse.additional_buyer_info;
        attributionKey.getClass();
        navigator.getClass();
        str.getClass();
        brandSpotSyncTokens.getClass();
        this.inAppPaymentLauncher = exoPlayerImplInternal$$ExternalSyntheticLambda2;
        this.googlePayPaymentsClient = metadataRepo;
        this.gmsWalletApiEnabled = z;
        this.analytics = analytics;
        this.service = localService;
        this.localInstalledStore = localInstalledStore;
        this.stringManager = androidStringManager;
        this.sessionManager = sessionManager;
        this.marketingMessageRepository = realMarketingMessageRepository;
        this.syncer = realLocalBrandSyncer;
        this.brandSpot = brandSpot;
        this.attributionKey = attributionKey;
        this.navigator = navigator;
        this.checkoutFlowToken = str;
        this.payload = orderBuilder$Payload;
        this.isProfileSheetInline = z2;
        this.syncTokens = brandSpotSyncTokens;
        RealCartBuilderManager realCartBuilderManager = (RealCartBuilderManager) cartBuilderManager;
        this.cartBuilder = buyerIntentScope != null ? realCartBuilderManager.getBuilder(buyerIntentScope) : realCartBuilderManager.getBuilder(brandSpot);
        this.responseContextHandler = localResponseContextHandler$Factory$Impl.create(navigator);
        this.cartResponse$delegate = Updater.mutableStateOf$default(createCartResponse);
        if (orderBuilder$Payload == null || (unvalidated = orderBuilder$Payload.buyerInfo) == null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((LocalAdditionalBuyerInfo) obj).f1305type == LocalAdditionalBuyerInfo.Type.TYPE_BUYER_NAME) {
                        break;
                    }
                }
            }
            LocalAdditionalBuyerInfo localAdditionalBuyerInfo = (LocalAdditionalBuyerInfo) obj;
            String str4 = localAdditionalBuyerInfo != null ? localAdditionalBuyerInfo.value : null;
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it2.next();
                    if (((LocalAdditionalBuyerInfo) obj2).f1305type == LocalAdditionalBuyerInfo.Type.TYPE_BUYER_PHONE_NUMBER) {
                        break;
                    }
                }
            }
            LocalAdditionalBuyerInfo localAdditionalBuyerInfo2 = (LocalAdditionalBuyerInfo) obj2;
            unvalidated = new OrderBuilderModel.BuyerInfo.Unvalidated(str4, localAdditionalBuyerInfo2 != null ? localAdditionalBuyerInfo2.value : null, createCartResponse.legal_consent);
        }
        this.buyerInfo$delegate = Updater.mutableStateOf$default(unvalidated);
        LocalCashConfiguration localCashConfiguration = createCartResponse.redeemable_local_cash_configuration;
        LocalFulfillment localFulfillment = createCartResponse.fulfillment;
        LocalMoney money = (localCashConfiguration == null || (localMoney2 = localCashConfiguration.local_cash_monetary_value) == null) ? null : LocalMoneyKt.toMoney(localMoney2);
        if (money != null && LocalMoneysKt.isPositive(money)) {
            OrderBuilder$Payload orderBuilder$Payload3 = this.payload;
            if (orderBuilder$Payload3 != null) {
                z3 = orderBuilder$Payload3.redeemLocalCashBalance;
            } else {
                Boolean bool = localCashConfiguration.should_apply_by_default;
                if (bool != null) {
                    z3 = bool.booleanValue();
                }
            }
            this.redeemLocalCashBalance$delegate = Updater.mutableStateOf$default(Boolean.valueOf(z3));
            orderBuilder$Payload2 = this.payload;
            if (orderBuilder$Payload2 == null) {
                booleanValue = orderBuilder$Payload2.noContactDelivery;
            } else {
                Boolean bool2 = (localFulfillment == null || (deliveryDetails = localFulfillment.delivery_details) == null) ? null : deliveryDetails.is_no_contact_delivery;
                booleanValue = bool2 != null ? bool2.booleanValue() : false;
            }
            this.noContactDelivery$delegate = Updater.mutableStateOf$default(Boolean.valueOf(booleanValue));
            OrderBuilder$Payload orderBuilder$Payload4 = this.payload;
            this.dropoffNotes$delegate = Updater.mutableStateOf$default((orderBuilder$Payload4 != null || (str3 = orderBuilder$Payload4.dropoffNotes) == null) ? (localFulfillment != null || (deliveryDetails2 = localFulfillment.delivery_details) == null) ? null : deliveryDetails2.dropoff_notes : str3);
            OrderBuilder$Payload orderBuilder$Payload5 = this.payload;
            this.orderNotes$delegate = Updater.mutableStateOf$default(orderBuilder$Payload5 == null ? orderBuilder$Payload5.orderNotes : null);
            OrderBuilder$Payload orderBuilder$Payload6 = this.payload;
            this.appliedGiftCardCodes$delegate = Updater.mutableStateOf$default((orderBuilder$Payload6 != null || (obj3 = orderBuilder$Payload6.giftCardCodes) == null) ? EmptyList.INSTANCE : obj3);
            OrderBuilder$Payload orderBuilder$Payload7 = this.payload;
            this.curbsidePickupDetails$delegate = Updater.mutableStateOf$default((orderBuilder$Payload7 != null || (curbsidePickupDetails = orderBuilder$Payload7.curbsidePickupDetails) == null) ? new CurbsidePickupDetails(false, null, null, null) : curbsidePickupDetails);
            localTippingConfiguration = createCartResponse.tipping_configuration;
            if (localTippingConfiguration == null ? Intrinsics.areEqual(localTippingConfiguration.enabled, Boolean.FALSE) : false) {
                localMoney = null;
            } else {
                zzho zzhoVar = createCartResponse.response;
                if (zzhoVar != null) {
                    CreateCartResponse$Response$Cart createCartResponse$Response$Cart = zzhoVar instanceof CreateCartResponse$Response$Cart ? (CreateCartResponse$Response$Cart) zzhoVar : null;
                    LocalCart localCart = createCartResponse$Response$Cart != null ? createCartResponse$Response$Cart.value : null;
                    if (localCart != null) {
                        com.squareup.protos.cash.local.client.v1.LocalMoney localMoney3 = localCart.total;
                        if (localMoney3 != null) {
                            str2 = localMoney3.currency_code;
                        }
                    }
                }
                str2 = "USD";
                localMoney = new LocalMoney(0L, LocalCurrencyCode.valueOf(str2));
            }
            this.tipAmount$delegate = Updater.mutableStateOf$default(localMoney);
            this.selectedPaymentMethodToken$delegate = Updater.mutableStateOf$default(null);
            this.googlePayReadyToPay$delegate = Updater.mutableStateOf$default(null);
            this.createOrderTrigger$delegate = new ParcelableSnapshotMutableIntState(0);
        }
        z3 = false;
        this.redeemLocalCashBalance$delegate = Updater.mutableStateOf$default(Boolean.valueOf(z3));
        orderBuilder$Payload2 = this.payload;
        if (orderBuilder$Payload2 == null) {
        }
        this.noContactDelivery$delegate = Updater.mutableStateOf$default(Boolean.valueOf(booleanValue));
        OrderBuilder$Payload orderBuilder$Payload42 = this.payload;
        this.dropoffNotes$delegate = Updater.mutableStateOf$default((orderBuilder$Payload42 != null || (str3 = orderBuilder$Payload42.dropoffNotes) == null) ? (localFulfillment != null || (deliveryDetails2 = localFulfillment.delivery_details) == null) ? null : deliveryDetails2.dropoff_notes : str3);
        OrderBuilder$Payload orderBuilder$Payload52 = this.payload;
        this.orderNotes$delegate = Updater.mutableStateOf$default(orderBuilder$Payload52 == null ? orderBuilder$Payload52.orderNotes : null);
        OrderBuilder$Payload orderBuilder$Payload62 = this.payload;
        this.appliedGiftCardCodes$delegate = Updater.mutableStateOf$default((orderBuilder$Payload62 != null || (obj3 = orderBuilder$Payload62.giftCardCodes) == null) ? EmptyList.INSTANCE : obj3);
        OrderBuilder$Payload orderBuilder$Payload72 = this.payload;
        this.curbsidePickupDetails$delegate = Updater.mutableStateOf$default((orderBuilder$Payload72 != null || (curbsidePickupDetails = orderBuilder$Payload72.curbsidePickupDetails) == null) ? new CurbsidePickupDetails(false, null, null, null) : curbsidePickupDetails);
        localTippingConfiguration = createCartResponse.tipping_configuration;
        if (localTippingConfiguration == null ? Intrinsics.areEqual(localTippingConfiguration.enabled, Boolean.FALSE) : false) {
        }
        this.tipAmount$delegate = Updater.mutableStateOf$default(localMoney);
        this.selectedPaymentMethodToken$delegate = Updater.mutableStateOf$default(null);
        this.googlePayReadyToPay$delegate = Updater.mutableStateOf$default(null);
        this.createOrderTrigger$delegate = new ParcelableSnapshotMutableIntState(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x00d4 A[LOOP:5: B:243:0x00cb->B:245:0x00d4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x00e2 A[EDGE_INSN: B:246:0x00e2->B:247:0x00e2 BREAK  A[LOOP:5: B:243:0x00cb->B:245:0x00d4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x013a A[LOOP:6: B:259:0x0134->B:261:0x013a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x018f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$models$updateCart(RealOrderBuilder realOrderBuilder, MutableState mutableState, State state, MutableState mutableState2, State state2, MutableState mutableState3, MutableState mutableState4, ContinuationImpl continuationImpl) {
        RealOrderBuilder$models$updateCart$1 realOrderBuilder$models$updateCart$1;
        int i;
        ?? r8;
        zzho zzhoVar;
        com.squareup.protos.cash.local.client.v1.LocalMoney localMoney;
        ArrayList arrayList;
        ListIterator listIterator;
        StateListIterator stateListIterator;
        Iterator it;
        MutableState mutableState5;
        MutableState mutableState6;
        State state3;
        List<LocalCart.Line> list;
        ApiResult apiResult;
        UpdateCartResponse updateCartResponse;
        UpdateCartResponse.Success success;
        String str;
        UpdateCartResponse.Error error;
        LocalErrorResponse localErrorResponse;
        String str2;
        String str3;
        Object obj;
        String str4;
        String str5;
        RealOrderBuilder realOrderBuilder2 = realOrderBuilder;
        MutableState mutableState7 = mutableState;
        if (continuationImpl instanceof RealOrderBuilder$models$updateCart$1) {
            realOrderBuilder$models$updateCart$1 = (RealOrderBuilder$models$updateCart$1) continuationImpl;
            int i2 = realOrderBuilder$models$updateCart$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realOrderBuilder$models$updateCart$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realOrderBuilder$models$updateCart$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realOrderBuilder$models$updateCart$1.label;
                boolean z = true;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    mutableState7.setValue(Boolean.TRUE);
                    BrandSpot brandSpot = realOrderBuilder2.brandSpot;
                    CartBuilder cartBuilder = realOrderBuilder2.cartBuilder;
                    String str6 = brandSpot.brandToken;
                    String str7 = brandSpot.locationToken;
                    str7.getClass();
                    zzho zzhoVar2 = realOrderBuilder2.getCartResponse().response;
                    if (zzhoVar2 != null) {
                        CreateCartResponse$Response$Cart createCartResponse$Response$Cart = zzhoVar2 instanceof CreateCartResponse$Response$Cart ? (CreateCartResponse$Response$Cart) zzhoVar2 : null;
                        LocalCart localCart = createCartResponse$Response$Cart != null ? createCartResponse$Response$Cart.value : null;
                        if (localCart != null && (list = localCart.lines) != null) {
                            r8 = new ArrayList();
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                LocalCart.Line.Selection selection = ((LocalCart.Line) it2.next()).selection;
                                if (selection != null) {
                                    r8.add(selection);
                                }
                            }
                            List list2 = r8;
                            zzhoVar = realOrderBuilder2.getCartResponse().response;
                            if (zzhoVar != null) {
                                CreateCartResponse$Response$Cart createCartResponse$Response$Cart2 = zzhoVar instanceof CreateCartResponse$Response$Cart ? (CreateCartResponse$Response$Cart) zzhoVar : null;
                                LocalCart localCart2 = createCartResponse$Response$Cart2 != null ? createCartResponse$Response$Cart2.value : null;
                                if (localCart2 != null) {
                                    localMoney = localCart2.lines_subtotal;
                                    String str8 = realOrderBuilder2.attributionKey.value;
                                    SnapshotStateList snapshotStateList = ((RealCartBuilder) cartBuilder).discountCodes;
                                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(snapshotStateList, 10));
                                    listIterator = snapshotStateList.listIterator();
                                    while (true) {
                                        stateListIterator = (StateListIterator) listIterator;
                                        if (!stateListIterator.hasNext()) {
                                            break;
                                        }
                                        arrayList.add(((DiscountCode) stateListIterator.next()).getCode());
                                    }
                                    String offerToken = DiscountCodeKt.getOfferToken(((RealCartBuilder) cartBuilder).discountCodes);
                                    String str9 = offerToken == null ? null : offerToken;
                                    boolean redeemLocalCashBalance = realOrderBuilder2.getRedeemLocalCashBalance();
                                    LocalMoney tipAmount = realOrderBuilder2.getTipAmount();
                                    com.squareup.protos.cash.local.client.v1.LocalMoney localMoneyProto = tipAmount != null ? LocalMoneyKt.toLocalMoneyProto(tipAmount) : null;
                                    String str10 = realOrderBuilder2.checkoutFlowToken;
                                    LocalFulfillment localFulfillment = (LocalFulfillment) state.getValue();
                                    RewardToken rewardToken = (RewardToken) mutableState2.getValue();
                                    String str11 = rewardToken != null ? rewardToken.value : null;
                                    String str12 = str11 == null ? null : str11;
                                    List appliedGiftCardCodes = realOrderBuilder2.getAppliedGiftCardCodes();
                                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(appliedGiftCardCodes, 10));
                                    it = appliedGiftCardCodes.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(((GiftCardAccountNumber) it.next()).value);
                                    }
                                    UpdateCartRequest updateCartRequest = new UpdateCartRequest(((Cart) state2.getValue()).token, ((Cart) state2.getValue()).version, new CreateCartRequest(str6, str7, list2, localMoney, str8, str10, arrayList, localFulfillment, str12, str9, localMoneyProto, Boolean.valueOf(redeemLocalCashBalance), arrayList2, 49168), EmptyList.INSTANCE, ByteString.EMPTY);
                                    LocalService localService = realOrderBuilder2.service;
                                    realOrderBuilder$models$updateCart$1.L$0 = realOrderBuilder2;
                                    realOrderBuilder$models$updateCart$1.L$1 = mutableState7;
                                    realOrderBuilder$models$updateCart$1.L$4 = state2;
                                    mutableState5 = mutableState3;
                                    realOrderBuilder$models$updateCart$1.L$5 = mutableState5;
                                    mutableState6 = mutableState4;
                                    realOrderBuilder$models$updateCart$1.L$6 = mutableState6;
                                    realOrderBuilder$models$updateCart$1.label = 1;
                                    obj2 = localService.updateCart(updateCartRequest, realOrderBuilder$models$updateCart$1);
                                    if (obj2 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    state3 = state2;
                                }
                            }
                            localMoney = null;
                            String str82 = realOrderBuilder2.attributionKey.value;
                            SnapshotStateList snapshotStateList2 = ((RealCartBuilder) cartBuilder).discountCodes;
                            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(snapshotStateList2, 10));
                            listIterator = snapshotStateList2.listIterator();
                            while (true) {
                                stateListIterator = (StateListIterator) listIterator;
                                if (!stateListIterator.hasNext()) {
                                }
                                arrayList.add(((DiscountCode) stateListIterator.next()).getCode());
                            }
                            String offerToken2 = DiscountCodeKt.getOfferToken(((RealCartBuilder) cartBuilder).discountCodes);
                            if (offerToken2 == null) {
                            }
                            boolean redeemLocalCashBalance2 = realOrderBuilder2.getRedeemLocalCashBalance();
                            LocalMoney tipAmount2 = realOrderBuilder2.getTipAmount();
                            if (tipAmount2 != null) {
                            }
                            String str102 = realOrderBuilder2.checkoutFlowToken;
                            LocalFulfillment localFulfillment2 = (LocalFulfillment) state.getValue();
                            RewardToken rewardToken2 = (RewardToken) mutableState2.getValue();
                            if (rewardToken2 != null) {
                            }
                            if (str11 == null) {
                            }
                            List appliedGiftCardCodes2 = realOrderBuilder2.getAppliedGiftCardCodes();
                            ArrayList arrayList22 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(appliedGiftCardCodes2, 10));
                            it = appliedGiftCardCodes2.iterator();
                            while (it.hasNext()) {
                            }
                            UpdateCartRequest updateCartRequest2 = new UpdateCartRequest(((Cart) state2.getValue()).token, ((Cart) state2.getValue()).version, new CreateCartRequest(str6, str7, list2, localMoney, str82, str102, arrayList, localFulfillment2, str12, str9, localMoneyProto, Boolean.valueOf(redeemLocalCashBalance2), arrayList22, 49168), EmptyList.INSTANCE, ByteString.EMPTY);
                            LocalService localService2 = realOrderBuilder2.service;
                            realOrderBuilder$models$updateCart$1.L$0 = realOrderBuilder2;
                            realOrderBuilder$models$updateCart$1.L$1 = mutableState7;
                            realOrderBuilder$models$updateCart$1.L$4 = state2;
                            mutableState5 = mutableState3;
                            realOrderBuilder$models$updateCart$1.L$5 = mutableState5;
                            mutableState6 = mutableState4;
                            realOrderBuilder$models$updateCart$1.L$6 = mutableState6;
                            realOrderBuilder$models$updateCart$1.label = 1;
                            obj2 = localService2.updateCart(updateCartRequest2, realOrderBuilder$models$updateCart$1);
                            if (obj2 == coroutineSingletons) {
                            }
                        }
                    }
                    r8 = EmptyList.INSTANCE;
                    List list22 = r8;
                    zzhoVar = realOrderBuilder2.getCartResponse().response;
                    if (zzhoVar != null) {
                    }
                    localMoney = null;
                    String str822 = realOrderBuilder2.attributionKey.value;
                    SnapshotStateList snapshotStateList22 = ((RealCartBuilder) cartBuilder).discountCodes;
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(snapshotStateList22, 10));
                    listIterator = snapshotStateList22.listIterator();
                    while (true) {
                        stateListIterator = (StateListIterator) listIterator;
                        if (!stateListIterator.hasNext()) {
                        }
                        arrayList.add(((DiscountCode) stateListIterator.next()).getCode());
                    }
                    String offerToken22 = DiscountCodeKt.getOfferToken(((RealCartBuilder) cartBuilder).discountCodes);
                    if (offerToken22 == null) {
                    }
                    boolean redeemLocalCashBalance22 = realOrderBuilder2.getRedeemLocalCashBalance();
                    LocalMoney tipAmount22 = realOrderBuilder2.getTipAmount();
                    if (tipAmount22 != null) {
                    }
                    String str1022 = realOrderBuilder2.checkoutFlowToken;
                    LocalFulfillment localFulfillment22 = (LocalFulfillment) state.getValue();
                    RewardToken rewardToken22 = (RewardToken) mutableState2.getValue();
                    if (rewardToken22 != null) {
                    }
                    if (str11 == null) {
                    }
                    List appliedGiftCardCodes22 = realOrderBuilder2.getAppliedGiftCardCodes();
                    ArrayList arrayList222 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(appliedGiftCardCodes22, 10));
                    it = appliedGiftCardCodes22.iterator();
                    while (it.hasNext()) {
                    }
                    UpdateCartRequest updateCartRequest22 = new UpdateCartRequest(((Cart) state2.getValue()).token, ((Cart) state2.getValue()).version, new CreateCartRequest(str6, str7, list22, localMoney, str822, str1022, arrayList, localFulfillment22, str12, str9, localMoneyProto, Boolean.valueOf(redeemLocalCashBalance22), arrayList222, 49168), EmptyList.INSTANCE, ByteString.EMPTY);
                    LocalService localService22 = realOrderBuilder2.service;
                    realOrderBuilder$models$updateCart$1.L$0 = realOrderBuilder2;
                    realOrderBuilder$models$updateCart$1.L$1 = mutableState7;
                    realOrderBuilder$models$updateCart$1.L$4 = state2;
                    mutableState5 = mutableState3;
                    realOrderBuilder$models$updateCart$1.L$5 = mutableState5;
                    mutableState6 = mutableState4;
                    realOrderBuilder$models$updateCart$1.L$6 = mutableState6;
                    realOrderBuilder$models$updateCart$1.label = 1;
                    obj2 = localService22.updateCart(updateCartRequest22, realOrderBuilder$models$updateCart$1);
                    if (obj2 == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    MutableState mutableState8 = realOrderBuilder$models$updateCart$1.L$6;
                    MutableState mutableState9 = realOrderBuilder$models$updateCart$1.L$5;
                    state3 = realOrderBuilder$models$updateCart$1.L$4;
                    MutableState mutableState10 = realOrderBuilder$models$updateCart$1.L$1;
                    RealOrderBuilder realOrderBuilder3 = realOrderBuilder$models$updateCart$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    mutableState6 = mutableState8;
                    mutableState5 = mutableState9;
                    realOrderBuilder2 = realOrderBuilder3;
                    mutableState7 = mutableState10;
                }
                apiResult = (ApiResult) obj2;
                if (!(apiResult instanceof ApiResult.Success)) {
                    updateCartResponse = (UpdateCartResponse) ((ApiResult.Success) apiResult).response;
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ApiResult.Failure failure = (ApiResult.Failure) apiResult;
                    if (failure instanceof ApiResult.Failure.HttpFailure) {
                        Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((ApiResult.Failure.HttpFailure) apiResult).code, "HttpFailure updating cart [", "]"), new Object[0]);
                    } else {
                        if (!(failure instanceof ApiResult.Failure.NetworkFailure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Timber.Forest.e("NetworkFailure updating cart", new Object[0], ((ApiResult.Failure.NetworkFailure) apiResult).error);
                    }
                    updateCartResponse = null;
                }
                if (updateCartResponse != null) {
                    CreateCartResponse createCartResponse = updateCartResponse.create_cart_response;
                    ActionEvent.Dd.Companion companion = updateCartResponse.response;
                    if (companion != null) {
                        UpdateCartResponse$Response$Success updateCartResponse$Response$Success = companion instanceof UpdateCartResponse$Response$Success ? (UpdateCartResponse$Response$Success) companion : null;
                        if (updateCartResponse$Response$Success != null) {
                            success = updateCartResponse$Response$Success.value;
                            str = "";
                            if (success == null) {
                                companion.getClass();
                                UpdateCartResponse$Response$Success updateCartResponse$Response$Success2 = companion instanceof UpdateCartResponse$Response$Success ? (UpdateCartResponse$Response$Success) companion : null;
                                UpdateCartResponse.Success success2 = updateCartResponse$Response$Success2 != null ? updateCartResponse$Response$Success2.value : null;
                                success2.getClass();
                                CreateCartResponse createCartResponse2 = success2.updated_cart;
                                if (createCartResponse2 != null) {
                                    List list3 = createCartResponse2.gift_cards;
                                    CreateCartResponse cartResponse = realOrderBuilder2.getCartResponse();
                                    String str13 = ((Cart) state3.getValue()).token;
                                    SessionManager sessionManager = realOrderBuilder2.sessionManager;
                                    Analytics analytics = realOrderBuilder2.analytics;
                                    boolean isEmpty = cartResponse.gift_cards.isEmpty();
                                    boolean isEmpty2 = list3.isEmpty();
                                    if (!isEmpty2 && isEmpty) {
                                        String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull(sessionManager);
                                        GiftCard giftCard = (GiftCard) CollectionsKt.firstOrNull(list3);
                                        if (giftCard != null && (str5 = giftCard.last_4) != null) {
                                            str = str5;
                                        }
                                        analytics.track(new LocalClientCheckoutFlowRedeemGC(activeAccountTokenOrNull, str13, str), null);
                                        obj = null;
                                    } else if (!isEmpty2 || isEmpty) {
                                        obj = null;
                                    } else {
                                        String activeAccountTokenOrNull2 = PlatformKt.activeAccountTokenOrNull(sessionManager);
                                        GiftCard giftCard2 = (GiftCard) CollectionsKt.firstOrNull(cartResponse.gift_cards);
                                        if (giftCard2 != null && (str4 = giftCard2.last_4) != null) {
                                            str = str4;
                                        }
                                        LocalClientCheckoutFlowRemoveGC localClientCheckoutFlowRemoveGC = new LocalClientCheckoutFlowRemoveGC(activeAccountTokenOrNull2, str13, str);
                                        obj = null;
                                        analytics.track(localClientCheckoutFlowRemoveGC, null);
                                    }
                                    realOrderBuilder2.cartResponse$delegate.setValue(createCartResponse2);
                                    mutableState5.setValue(obj);
                                    mutableState6.setValue(obj);
                                }
                            } else {
                                if (companion != null) {
                                    UpdateCartResponse$Response$Error updateCartResponse$Response$Error = companion instanceof UpdateCartResponse$Response$Error ? (UpdateCartResponse$Response$Error) companion : null;
                                    if (updateCartResponse$Response$Error != null) {
                                        error = updateCartResponse$Response$Error.value;
                                        LocalExplanatoryDialog.PositiveAction.Ok ok = LocalExplanatoryDialog.PositiveAction.Ok.INSTANCE;
                                        String str14 = "unknown";
                                        if (error == null) {
                                            companion.getClass();
                                            boolean z2 = companion instanceof UpdateCartResponse$Response$Error;
                                            UpdateCartResponse$Response$Error updateCartResponse$Response$Error2 = z2 ? (UpdateCartResponse$Response$Error) companion : null;
                                            UpdateCartResponse.Error error2 = updateCartResponse$Response$Error2 != null ? updateCartResponse$Response$Error2.value : null;
                                            error2.getClass();
                                            CreateCartResponse createCartResponse3 = error2.current_cart;
                                            if (createCartResponse3 != null) {
                                                realOrderBuilder2.cartResponse$delegate.setValue(createCartResponse3);
                                            }
                                            UpdateCartResponse$Response$Error updateCartResponse$Response$Error3 = z2 ? (UpdateCartResponse$Response$Error) companion : null;
                                            UpdateCartResponse.Error error3 = updateCartResponse$Response$Error3 != null ? updateCartResponse$Response$Error3.value : null;
                                            error3.getClass();
                                            LocalErrorResponse localErrorResponse2 = error3.error_response;
                                            if (localErrorResponse2 != null) {
                                                List list4 = localErrorResponse2.errors;
                                                realOrderBuilder2.getClass();
                                                if (isGiftCardError(localErrorResponse2)) {
                                                    mutableState5.setValue(localErrorResponse2);
                                                }
                                                LocalErrorResponse.Error discountCodesError = getDiscountCodesError(localErrorResponse2);
                                                if (discountCodesError != null) {
                                                    mutableState6.setValue(discountCodesError);
                                                }
                                                List list5 = list4;
                                                if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                                                    Iterator it3 = list5.iterator();
                                                    while (it3.hasNext()) {
                                                        if (((LocalErrorResponse.Error) it3.next()).f1308type == LocalErrorResponse.Error.Type.TYPE_VALIDATION_ERROR) {
                                                            break;
                                                        }
                                                    }
                                                }
                                                z = false;
                                                if (z) {
                                                    Analytics analytics2 = realOrderBuilder2.analytics;
                                                    String activeAccountTokenOrNull3 = PlatformKt.activeAccountTokenOrNull(realOrderBuilder2.sessionManager);
                                                    String str15 = ((Cart) state3.getValue()).token;
                                                    GiftCardAccountNumber giftCardAccountNumber = (GiftCardAccountNumber) CollectionsKt.firstOrNull(realOrderBuilder2.getAppliedGiftCardCodes());
                                                    String str16 = giftCardAccountNumber != null ? giftCardAccountNumber.value : null;
                                                    str = str16 != null ? StringsKt___StringsKt.takeLast(4, str16) : "";
                                                    LocalErrorResponse.Error error4 = (LocalErrorResponse.Error) CollectionsKt.firstOrNull(list4);
                                                    if (error4 != null && (str3 = error4.message) != null) {
                                                        str14 = str3;
                                                    }
                                                    analytics2.track(new LocalClientCheckoutFlowGCFailure(activeAccountTokenOrNull3, str15, str, str14), null);
                                                }
                                                if (!z) {
                                                    Navigator navigator = realOrderBuilder2.navigator;
                                                    ArrayList arrayList3 = new ArrayList();
                                                    Iterator it4 = list5.iterator();
                                                    while (it4.hasNext()) {
                                                        String str17 = ((LocalErrorResponse.Error) it4.next()).message;
                                                        if (str17 != null) {
                                                            arrayList3.add(str17);
                                                        }
                                                    }
                                                    navigator.goTo(new LocalExplanatoryDialog(arrayList3, ok));
                                                }
                                            }
                                        } else if (createCartResponse != null) {
                                            zzho zzhoVar3 = createCartResponse.response;
                                            if (zzhoVar3 != null) {
                                                CreateCartResponse$Response$ErrorResponse createCartResponse$Response$ErrorResponse = zzhoVar3 instanceof CreateCartResponse$Response$ErrorResponse ? (CreateCartResponse$Response$ErrorResponse) zzhoVar3 : null;
                                                if (createCartResponse$Response$ErrorResponse != null) {
                                                    localErrorResponse = createCartResponse$Response$ErrorResponse.value;
                                                    if (localErrorResponse == null) {
                                                        realOrderBuilder2.cartResponse$delegate.setValue(createCartResponse);
                                                        mutableState5.setValue(null);
                                                        mutableState6.setValue(null);
                                                    }
                                                    if (zzhoVar3 != null) {
                                                        CreateCartResponse$Response$ErrorResponse createCartResponse$Response$ErrorResponse2 = zzhoVar3 instanceof CreateCartResponse$Response$ErrorResponse ? (CreateCartResponse$Response$ErrorResponse) zzhoVar3 : null;
                                                        LocalErrorResponse localErrorResponse3 = createCartResponse$Response$ErrorResponse2 != null ? createCartResponse$Response$ErrorResponse2.value : null;
                                                        if (localErrorResponse3 != null) {
                                                            List list6 = localErrorResponse3.errors;
                                                            realOrderBuilder2.getClass();
                                                            if (isGiftCardError(localErrorResponse3)) {
                                                                mutableState5.setValue(localErrorResponse3);
                                                            }
                                                            LocalErrorResponse.Error discountCodesError2 = getDiscountCodesError(localErrorResponse3);
                                                            if (discountCodesError2 != null) {
                                                                mutableState6.setValue(discountCodesError2);
                                                            }
                                                            List list7 = list6;
                                                            if (!(list7 instanceof Collection) || !list7.isEmpty()) {
                                                                Iterator it5 = list7.iterator();
                                                                while (it5.hasNext()) {
                                                                    if (((LocalErrorResponse.Error) it5.next()).f1308type == LocalErrorResponse.Error.Type.TYPE_VALIDATION_ERROR) {
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            z = false;
                                                            if (z) {
                                                                Analytics analytics3 = realOrderBuilder2.analytics;
                                                                String activeAccountTokenOrNull4 = PlatformKt.activeAccountTokenOrNull(realOrderBuilder2.sessionManager);
                                                                String str18 = ((Cart) state3.getValue()).token;
                                                                GiftCardAccountNumber giftCardAccountNumber2 = (GiftCardAccountNumber) CollectionsKt.firstOrNull(realOrderBuilder2.getAppliedGiftCardCodes());
                                                                String str19 = giftCardAccountNumber2 != null ? giftCardAccountNumber2.value : null;
                                                                str = str19 != null ? StringsKt___StringsKt.takeLast(4, str19) : "";
                                                                LocalErrorResponse.Error error5 = (LocalErrorResponse.Error) CollectionsKt.firstOrNull(list6);
                                                                if (error5 != null && (str2 = error5.message) != null) {
                                                                    str14 = str2;
                                                                }
                                                                analytics3.track(new LocalClientCheckoutFlowGCFailure(activeAccountTokenOrNull4, str18, str, str14), null);
                                                            }
                                                            if (!z) {
                                                                Navigator navigator2 = realOrderBuilder2.navigator;
                                                                ArrayList arrayList4 = new ArrayList();
                                                                Iterator it6 = list7.iterator();
                                                                while (it6.hasNext()) {
                                                                    String str20 = ((LocalErrorResponse.Error) it6.next()).message;
                                                                    if (str20 != null) {
                                                                        arrayList4.add(str20);
                                                                    }
                                                                }
                                                                navigator2.goTo(new LocalExplanatoryDialog(arrayList4, ok));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            localErrorResponse = null;
                                            if (localErrorResponse == null) {
                                            }
                                            if (zzhoVar3 != null) {
                                            }
                                        } else {
                                            realOrderBuilder2.navigator.goTo(new LocalExplanatoryDialog(EmptyList.INSTANCE));
                                        }
                                    }
                                }
                                error = null;
                                LocalExplanatoryDialog.PositiveAction.Ok ok2 = LocalExplanatoryDialog.PositiveAction.Ok.INSTANCE;
                                String str142 = "unknown";
                                if (error == null) {
                                }
                            }
                        }
                    }
                    success = null;
                    str = "";
                    if (success == null) {
                    }
                }
                mutableState7.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            }
        }
        realOrderBuilder$models$updateCart$1 = new RealOrderBuilder$models$updateCart$1(continuationImpl);
        Object obj22 = realOrderBuilder$models$updateCart$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realOrderBuilder$models$updateCart$1.label;
        boolean z3 = true;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj22;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        if (updateCartResponse != null) {
        }
        mutableState7.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public static LocalErrorResponse.Error getDiscountCodesError(LocalErrorResponse localErrorResponse) {
        Object obj;
        Iterator it = localErrorResponse.errors.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((LocalErrorResponse.Error) obj).reason == LocalErrorResponse.Error.Reason.REASON_DISCOUNT_CODE_INVALID) {
                break;
            }
        }
        return (LocalErrorResponse.Error) obj;
    }

    public static boolean isGiftCardError(LocalErrorResponse localErrorResponse) {
        List<LocalErrorResponse.Error> list = localErrorResponse.errors;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (LocalErrorResponse.Error error : list) {
            if (Intrinsics.areEqual(error.field, "gift_card_codes") || error.reason == LocalErrorResponse.Error.Reason.REASON_GIFT_CARD_NOT_APPLICABLE) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0463  */
    /* JADX WARN: Type inference failed for: r1v13, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v27, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r52v5 */
    /* JADX WARN: Type inference failed for: r52v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r52v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object models$createOrder(RealOrderBuilder realOrderBuilder, MutableState mutableState, State state, State state2, State state3, State state4, MutableState mutableState2, OrderWorkflow orderWorkflow, boolean z, ContinuationImpl continuationImpl) {
        RealOrderBuilder$models$createOrder$1 realOrderBuilder$models$createOrder$1;
        int i;
        LocalFulfillment.PickupDetails pickupDetails;
        ArrayList arrayList;
        Long l;
        com.squareup.protos.cash.local.client.v1.LocalMoney localMoneyProto;
        RealOrderBuilder realOrderBuilder2;
        MutableState mutableState3;
        boolean z2;
        OrderWorkflow orderWorkflow2;
        String str;
        State state5;
        CreateOrderRequest copy$default;
        ComputedOrderSummary.Row grandTotalRow;
        LocalMoney localMoney;
        ApiResult apiResult;
        boolean z3;
        OrderWorkflow orderWorkflow3;
        OrderWorkflow orderWorkflow4;
        BrandSpot brandSpot;
        Screen screen;
        OrderWorkflow orderWorkflow5;
        CreateOrderResponse createOrderResponse;
        CreateOrderResponse.ErrorResponse errorResponse;
        LocalErrorResponse localErrorResponse;
        CreateOrderResponse.ErrorResponse errorResponse2;
        app.cash.local.primitives.LocalErrorResponse errorResponse3;
        ?? r1;
        List list;
        List list2;
        LocalErrorResponse.Error error;
        LocalErrorResponse localErrorResponse2;
        CreateOrderResponse.UpdatedCartResponse updatedCartResponse;
        CreateOrderResponse.Success success;
        CreateOrderResponse.OpenTab openTab;
        boolean z4;
        String str2;
        RealOrderBuilder realOrderBuilder3;
        String str3;
        CreateOrderResponse createOrderResponse2;
        MutableState mutableState4;
        RealOrderBuilder realOrderBuilder4;
        ?? r12;
        List list3;
        ErrorType errorType;
        Object value;
        RealLocalBrandSyncer realLocalBrandSyncer;
        BrandSpot brandSpot2;
        MutableState mutableState5;
        Object value2;
        if (continuationImpl instanceof RealOrderBuilder$models$createOrder$1) {
            realOrderBuilder$models$createOrder$1 = (RealOrderBuilder$models$createOrder$1) continuationImpl;
            int i2 = realOrderBuilder$models$createOrder$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realOrderBuilder$models$createOrder$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realOrderBuilder$models$createOrder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realOrderBuilder$models$createOrder$1.label;
                Long l2 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    models$lambda$25(mutableState, true);
                    CurbsidePickupDetails curbsidePickupDetails = realOrderBuilder.getCurbsidePickupDetails();
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = realOrderBuilder.buyerInfo$delegate;
                    if (curbsidePickupDetails.isSelected) {
                        Boolean bool = Boolean.TRUE;
                        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                        String str4 = realOrderBuilder.getCurbsidePickupDetails().vehicleColorLabel;
                        if (str4 != null) {
                            createListBuilder.add(new RecipientIdentifier(RecipientIdentifierType.RECIPIENT_IDENTIFIER_TYPE_VEHICLE_COLOR, "Vehicle color", str4));
                        }
                        String str5 = realOrderBuilder.getCurbsidePickupDetails().vehicleTypeLabel;
                        if (str5 != null) {
                            createListBuilder.add(new RecipientIdentifier(RecipientIdentifierType.RECIPIENT_IDENTIFIER_TYPE_VEHICLE_TYPE, "Vehicle type", str5));
                        }
                        String str6 = realOrderBuilder.getCurbsidePickupDetails().vehicleNote;
                        if (str6 != null) {
                            if (StringsKt.isBlank(str6)) {
                                str6 = null;
                            }
                            if (str6 != null) {
                                createListBuilder.add(new RecipientIdentifier(RecipientIdentifierType.RECIPIENT_IDENTIFIER_TYPE_NOTE, "Note", str6));
                            }
                        }
                        pickupDetails = new LocalFulfillment.PickupDetails(bool, CollectionsKt__CollectionsJVMKt.build(createListBuilder), null, null, 12, null);
                    } else {
                        pickupDetails = null;
                    }
                    String str7 = ((Cart) state.getValue()).token;
                    String str8 = ((Cart) state.getValue()).version;
                    ComputedOrderSummary computedOrderSummary = (ComputedOrderSummary) state2.getValue();
                    if (computedOrderSummary != null) {
                        ArrayList<ComputedOrderSummary.Row> arrayList2 = computedOrderSummary.rows;
                        arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                        for (ComputedOrderSummary.Row row : arrayList2) {
                            arrayList.add(new CreateOrderRequest.CalculatedChargesBreakdownRow(row.identifier, LocalMoneyKt.toLocalMoneyProto(row.amount), ByteString.EMPTY));
                            l2 = l2;
                        }
                    } else {
                        arrayList = null;
                    }
                    l = l2;
                    List list4 = arrayList;
                    if (arrayList == null) {
                        list4 = EmptyList.INSTANCE;
                    }
                    List list5 = list4;
                    List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new LocalAdditionalBuyerInfo[]{new LocalAdditionalBuyerInfo(LocalAdditionalBuyerInfo.Type.TYPE_BUYER_NAME, ((OrderBuilderModel.BuyerInfo) parcelableSnapshotMutableState.getValue()).getName()), new LocalAdditionalBuyerInfo(LocalAdditionalBuyerInfo.Type.TYPE_BUYER_PHONE_NUMBER, ((OrderBuilderModel.BuyerInfo) parcelableSnapshotMutableState.getValue()).getPhone())});
                    LegalConsent legalConsent = ((OrderBuilderModel.BuyerInfo) parcelableSnapshotMutableState.getValue()).getLegalConsent();
                    String str9 = legalConsent != null ? legalConsent.token : null;
                    LocalMoney tipAmount = realOrderBuilder.getTipAmount();
                    com.squareup.protos.cash.local.client.v1.LocalMoney localMoneyProto2 = tipAmount != null ? LocalMoneyKt.toLocalMoneyProto(tipAmount) : null;
                    String str10 = realOrderBuilder.attributionKey.value;
                    boolean redeemLocalCashBalance = realOrderBuilder.getRedeemLocalCashBalance();
                    LocalMoney localMoney2 = (LocalMoney) state3.getValue();
                    if (localMoney2 == null) {
                        localMoney2 = LocalMoneysKt.zero(LocalCurrencyCode.USD);
                    }
                    com.squareup.protos.cash.local.client.v1.LocalMoney localMoneyProto3 = LocalMoneyKt.toLocalMoneyProto(localMoney2);
                    ComputedOrderSummary computedOrderSummary2 = (ComputedOrderSummary) state2.getValue();
                    if (computedOrderSummary2 == null || (grandTotalRow = ComputedOrderSummaryKt.getGrandTotalRow(computedOrderSummary2)) == null || (localMoney = grandTotalRow.amount) == null) {
                        LocalMoney localMoney3 = ((Cart) state.getValue()).total;
                        LocalMoney tipAmount2 = realOrderBuilder.getTipAmount();
                        if (tipAmount2 == null) {
                            tipAmount2 = LocalMoneysKt.zero(LocalCurrencyCode.USD);
                        }
                        localMoneyProto = LocalMoneyKt.toLocalMoneyProto(LocalMoneysKt.plus(localMoney3, tipAmount2));
                    } else {
                        localMoneyProto = LocalMoneyKt.toLocalMoneyProto(localMoney);
                    }
                    com.squareup.protos.cash.local.client.v1.LocalMoney localMoney4 = localMoneyProto;
                    LocalFulfillment localFulfillment = (LocalFulfillment) state4.getValue();
                    LocalFulfillment copy$default2 = localFulfillment != null ? LocalFulfillment.copy$default(localFulfillment, null, null, null, null, null, pickupDetails, null, null, 895) : null;
                    String str11 = (String) realOrderBuilder.orderNotes$delegate.getValue();
                    Boolean valueOf = Boolean.valueOf(redeemLocalCashBalance);
                    ByteString byteString = ByteString.EMPTY;
                    CreateOrderRequest createOrderRequest = new CreateOrderRequest(str7, str8, null, null, listOf, null, localMoneyProto2, null, str9, null, str10, valueOf, localMoney4, localMoneyProto3, copy$default2, null, str11, list5, orderWorkflow, byteString);
                    if (z) {
                        PaymentMethod paymentMethod = (PaymentMethod) mutableState2.getValue();
                        paymentMethod.getClass();
                        if (paymentMethod.getPaymentOption() == LocalPaymentOption.LOCAL_PAYMENT_OPTION_CASH_APP_PAY) {
                            copy$default = CreateOrderRequest.copy$default(createOrderRequest, new CreateOrderRequest$Payment$UseCashBalance(true), null, null, null, null, null, null, null, 1048571);
                        } else if (paymentMethod instanceof PaymentMethod.StoredInstrument) {
                            copy$default = CreateOrderRequest.copy$default(createOrderRequest, new CreateOrderRequest$Payment$InstrumentToken(((PaymentMethod.StoredInstrument) paymentMethod).token), null, null, null, null, null, null, null, 1048571);
                        } else {
                            String str12 = realOrderBuilder.nonce;
                            if (str12 == null) {
                                a$$ExternalSyntheticBUOutline0.m$1("Cannot place an order for ", paymentMethod, ". Nonce is null");
                                return l;
                            }
                            copy$default = CreateOrderRequest.copy$default(createOrderRequest, new CreateOrderRequest$Payment$SquarePaymentToken(str12), null, null, null, null, null, null, null, 1048571);
                        }
                        createOrderRequest = copy$default;
                    }
                    CreateOrderRequest createOrderRequest2 = createOrderRequest;
                    BlockersData.Flow.INSTANCE.getClass();
                    String generateToken = BlockersData.Flow.Companion.generateToken();
                    LocalService localService = realOrderBuilder.service;
                    CreateAppOrderRequest createAppOrderRequest = new CreateAppOrderRequest(null, createOrderRequest2, byteString);
                    realOrderBuilder$models$createOrder$1.L$0 = realOrderBuilder;
                    realOrderBuilder$models$createOrder$1.L$1 = mutableState;
                    realOrderBuilder$models$createOrder$1.L$2 = state;
                    realOrderBuilder$models$createOrder$1.L$7 = orderWorkflow;
                    realOrderBuilder$models$createOrder$1.L$10 = generateToken;
                    realOrderBuilder$models$createOrder$1.Z$0 = z;
                    realOrderBuilder$models$createOrder$1.label = 1;
                    Object createAppOrder = localService.createAppOrder(generateToken, createAppOrderRequest, realOrderBuilder$models$createOrder$1);
                    if (createAppOrder != coroutineSingletons) {
                        realOrderBuilder2 = realOrderBuilder;
                        mutableState3 = mutableState;
                        z2 = z;
                        orderWorkflow2 = orderWorkflow;
                        str = generateToken;
                        state5 = state;
                        obj = createAppOrder;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        str3 = realOrderBuilder$models$createOrder$1.L$13;
                        createOrderResponse2 = realOrderBuilder$models$createOrder$1.L$12;
                        orderWorkflow5 = realOrderBuilder$models$createOrder$1.L$7;
                        mutableState4 = realOrderBuilder$models$createOrder$1.L$1;
                        realOrderBuilder4 = realOrderBuilder$models$createOrder$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        z3 = true;
                        ((RealCartBuilder) realOrderBuilder4.cartBuilder).clearAll();
                        if (str3 != null) {
                            StateFlowImpl stateFlowImpl = realOrderBuilder4.marketingMessageRepository.redeemedOfferTokens;
                            do {
                                value = stateFlowImpl.getValue();
                            } while (!stateFlowImpl.compareAndSet(value, SetsKt___SetsKt.plus((Set) value, new OfferToken(str3))));
                        }
                        Navigator navigator = realOrderBuilder4.navigator;
                        SerializerKt serializerKt = createOrderResponse2.response;
                        serializerKt.getClass();
                        CreateOrderResponse$Response$Success createOrderResponse$Response$Success = !(serializerKt instanceof CreateOrderResponse$Response$Success) ? (CreateOrderResponse$Response$Success) serializerKt : null;
                        CreateOrderResponse.Success success2 = createOrderResponse$Response$Success == null ? createOrderResponse$Response$Success.value : null;
                        success2.getClass();
                        LocalOrder localOrder = success2.order;
                        localOrder.getClass();
                        navigator.goTo(new LocalOrderStatusScreen(new LocalOrderStatusScreen.Type.Preloaded(localOrder), orderWorkflow5 != OrderWorkflow.ORDER_WORKFLOW_FINALIZE_DELAYED_CAPTURE ? z3 : false, 2));
                        mutableState3 = mutableState4;
                        models$lambda$25(mutableState3, false);
                        return Unit.INSTANCE;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str2 = realOrderBuilder$models$createOrder$1.L$13;
                        mutableState5 = realOrderBuilder$models$createOrder$1.L$1;
                        realOrderBuilder3 = realOrderBuilder$models$createOrder$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        if (str2 != null) {
                            StateFlowImpl stateFlowImpl2 = realOrderBuilder3.marketingMessageRepository.redeemedOfferTokens;
                            do {
                                value2 = stateFlowImpl2.getValue();
                            } while (!stateFlowImpl2.compareAndSet(value2, SetsKt___SetsKt.plus((Set) value2, new OfferToken(str2))));
                        }
                        realOrderBuilder3.navigator.goTo(Back.INSTANCE);
                        mutableState3 = mutableState5;
                        models$lambda$25(mutableState3, false);
                        return Unit.INSTANCE;
                    }
                    boolean z5 = realOrderBuilder$models$createOrder$1.Z$0;
                    String str13 = realOrderBuilder$models$createOrder$1.L$13;
                    MutableState mutableState6 = realOrderBuilder$models$createOrder$1.L$1;
                    RealOrderBuilder realOrderBuilder5 = realOrderBuilder$models$createOrder$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    z4 = z5;
                    str2 = str13;
                    mutableState3 = mutableState6;
                    realOrderBuilder3 = realOrderBuilder5;
                    ((RealCartBuilder) realOrderBuilder3.cartBuilder).clearAll();
                    realLocalBrandSyncer = realOrderBuilder3.syncer;
                    brandSpot2 = realOrderBuilder3.brandSpot;
                    realOrderBuilder$models$createOrder$1.L$0 = realOrderBuilder3;
                    realOrderBuilder$models$createOrder$1.L$1 = mutableState3;
                    realOrderBuilder$models$createOrder$1.L$2 = null;
                    realOrderBuilder$models$createOrder$1.L$7 = null;
                    realOrderBuilder$models$createOrder$1.L$10 = null;
                    realOrderBuilder$models$createOrder$1.L$12 = null;
                    realOrderBuilder$models$createOrder$1.L$13 = str2;
                    realOrderBuilder$models$createOrder$1.Z$0 = z4;
                    realOrderBuilder$models$createOrder$1.label = 4;
                    if (realLocalBrandSyncer.syncBuyerInfo(brandSpot2, realOrderBuilder$models$createOrder$1) != coroutineSingletons) {
                        mutableState5 = mutableState3;
                        if (str2 != null) {
                        }
                        realOrderBuilder3.navigator.goTo(Back.INSTANCE);
                        mutableState3 = mutableState5;
                        models$lambda$25(mutableState3, false);
                        return Unit.INSTANCE;
                    }
                    return coroutineSingletons;
                }
                z2 = realOrderBuilder$models$createOrder$1.Z$0;
                str = realOrderBuilder$models$createOrder$1.L$10;
                orderWorkflow2 = realOrderBuilder$models$createOrder$1.L$7;
                state5 = realOrderBuilder$models$createOrder$1.L$2;
                mutableState3 = realOrderBuilder$models$createOrder$1.L$1;
                realOrderBuilder2 = realOrderBuilder$models$createOrder$1.L$0;
                SafeTrace.throwOnFailure(obj);
                l = null;
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Failure) {
                    z3 = true;
                } else {
                    ApiResult.Failure failure = (ApiResult.Failure) apiResult;
                    if (failure instanceof ApiResult.Failure.NetworkFailure) {
                        errorType = ErrorType.NETWORK_ERROR;
                    } else {
                        if (!(failure instanceof ApiResult.Failure.HttpFailure)) {
                            Long l3 = l;
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return l3;
                        }
                        errorType = ErrorType.SERVER_ERROR;
                    }
                    String str14 = ((Cart) state5.getValue()).token;
                    Analytics analytics = realOrderBuilder2.analytics;
                    String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull(realOrderBuilder2.sessionManager);
                    z3 = true;
                    BrandSpot brandSpot3 = realOrderBuilder2.brandSpot;
                    String str15 = brandSpot3.brandToken;
                    String str16 = brandSpot3.locationToken;
                    analytics.track(new LocalClientCheckoutFlowOrderFailed(activeAccountTokenOrNull, str15, str16 == null ? l : str16, str14, errorType, null), l);
                }
                SVG svg = realOrderBuilder2.responseContextHandler;
                CartBuilder cartBuilder = realOrderBuilder2.cartBuilder;
                BrandSpot brandSpot4 = realOrderBuilder2.brandSpot;
                LocalInstalledStore localInstalledStore = realOrderBuilder2.localInstalledStore;
                Navigator navigator2 = realOrderBuilder2.navigator;
                orderWorkflow3 = OrderWorkflow.ORDER_WORKFLOW_PREAUTHORIZED_DELAYED_CAPTURE;
                AttributionKey attributionKey = realOrderBuilder2.attributionKey;
                State state6 = state5;
                boolean z6 = realOrderBuilder2.isProfileSheetInline;
                if (orderWorkflow2 != orderWorkflow3) {
                    orderWorkflow4 = orderWorkflow2;
                    LocalFulfillment localFulfillment2 = realOrderBuilder2.getCartResponse().fulfillment;
                    screen = new LocalBrandLocationOpenTabCheckoutScreen(brandSpot4, attributionKey, z6, localFulfillment2 != null ? FulfillmentKt.toFulfillment(localFulfillment2) : null, null, realOrderBuilder2.syncTokens);
                    brandSpot = brandSpot4;
                } else {
                    orderWorkflow4 = orderWorkflow2;
                    LocalFulfillment localFulfillment3 = realOrderBuilder2.getCartResponse().fulfillment;
                    Fulfillment fulfillment = localFulfillment3 != null ? FulfillmentKt.toFulfillment(localFulfillment3) : null;
                    LocalTippingConfiguration localTippingConfiguration = realOrderBuilder2.getCartResponse().tipping_configuration;
                    boolean z7 = !(localTippingConfiguration != null ? Intrinsics.areEqual(localTippingConfiguration.enabled, Boolean.FALSE) : false);
                    LocalTippingConfiguration localTippingConfiguration2 = realOrderBuilder2.getCartResponse().tipping_configuration;
                    String str17 = localTippingConfiguration2 != null ? localTippingConfiguration2.title : null;
                    LocalTippingConfiguration localTippingConfiguration3 = realOrderBuilder2.getCartResponse().tipping_configuration;
                    List list6 = localTippingConfiguration3 != null ? localTippingConfiguration3.suggestions : null;
                    if (list6 == null) {
                        list6 = EmptyList.INSTANCE;
                    }
                    List list7 = list6;
                    LocalTippingConfiguration localTippingConfiguration4 = realOrderBuilder2.getCartResponse().tipping_configuration;
                    String str18 = localTippingConfiguration4 != null ? localTippingConfiguration4.subtitle : null;
                    LocalCashEarningsConfiguration localCashEarningsConfiguration = realOrderBuilder2.getCartResponse().local_cash_earnings_configuration;
                    String str19 = localCashEarningsConfiguration != null ? localCashEarningsConfiguration.fine_print_markdown : null;
                    LocalFulfillment localFulfillment4 = realOrderBuilder2.getCartResponse().fulfillment;
                    LocalBrandLocationCheckoutScreen localBrandLocationCheckoutScreen = new LocalBrandLocationCheckoutScreen(brandSpot4, attributionKey, z6, fulfillment, orderWorkflow4, z7, str17, list7, str18, str19, (localFulfillment4 != null ? localFulfillment4.type : null) == LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_IN_STORE ? LocalBrandLocationCheckoutScreen.ReviewMode.IN_STORE_OPEN_TAB : LocalBrandLocationCheckoutScreen.ReviewMode.STANDARD, realOrderBuilder2.syncTokens, 16);
                    brandSpot = brandSpot4;
                    screen = localBrandLocationCheckoutScreen;
                }
                orderWorkflow5 = orderWorkflow4;
                CreateAppOrderResponse createAppOrderResponse = (CreateAppOrderResponse) svg.handle(apiResult, str, screen);
                createOrderResponse = createAppOrderResponse == null ? createAppOrderResponse.response : null;
                if (createOrderResponse != null) {
                    SerializerKt serializerKt2 = createOrderResponse.response;
                    if (serializerKt2 != null) {
                        CreateOrderResponse$Response$ErrorResponse createOrderResponse$Response$ErrorResponse = serializerKt2 instanceof CreateOrderResponse$Response$ErrorResponse ? (CreateOrderResponse$Response$ErrorResponse) serializerKt2 : null;
                        if (createOrderResponse$Response$ErrorResponse != null) {
                            errorResponse = createOrderResponse$Response$ErrorResponse.value;
                            if (errorResponse == null) {
                                if (serializerKt2 != null) {
                                    CreateOrderResponse$Response$ErrorResponses createOrderResponse$Response$ErrorResponses = serializerKt2 instanceof CreateOrderResponse$Response$ErrorResponses ? (CreateOrderResponse$Response$ErrorResponses) serializerKt2 : null;
                                    if (createOrderResponse$Response$ErrorResponses != null) {
                                        localErrorResponse2 = createOrderResponse$Response$ErrorResponses.value;
                                        if (localErrorResponse2 == null) {
                                            if (serializerKt2 != null) {
                                                CreateOrderResponse$Response$UpdatedCartResponse createOrderResponse$Response$UpdatedCartResponse = serializerKt2 instanceof CreateOrderResponse$Response$UpdatedCartResponse ? (CreateOrderResponse$Response$UpdatedCartResponse) serializerKt2 : null;
                                                if (createOrderResponse$Response$UpdatedCartResponse != null) {
                                                    updatedCartResponse = createOrderResponse$Response$UpdatedCartResponse.value;
                                                    if (updatedCartResponse != null) {
                                                        if (serializerKt2 != null) {
                                                            CreateOrderResponse$Response$Success createOrderResponse$Response$Success2 = serializerKt2 instanceof CreateOrderResponse$Response$Success ? (CreateOrderResponse$Response$Success) serializerKt2 : null;
                                                            if (createOrderResponse$Response$Success2 != null) {
                                                                success = createOrderResponse$Response$Success2.value;
                                                                if (success == null) {
                                                                    String offerToken = DiscountCodeKt.getOfferToken(((RealCartBuilder) cartBuilder).discountCodes);
                                                                    String str20 = brandSpot.brandToken;
                                                                    realOrderBuilder$models$createOrder$1.L$0 = realOrderBuilder2;
                                                                    realOrderBuilder$models$createOrder$1.L$1 = mutableState3;
                                                                    realOrderBuilder$models$createOrder$1.L$2 = null;
                                                                    realOrderBuilder$models$createOrder$1.L$7 = orderWorkflow5;
                                                                    realOrderBuilder$models$createOrder$1.L$10 = null;
                                                                    realOrderBuilder$models$createOrder$1.L$12 = createOrderResponse;
                                                                    realOrderBuilder$models$createOrder$1.L$13 = offerToken;
                                                                    realOrderBuilder$models$createOrder$1.Z$0 = z2;
                                                                    realOrderBuilder$models$createOrder$1.label = 2;
                                                                    if (((RealLocalInstalledStore) localInstalledStore).m1287clearFulfillmentConfigurationNmdeRlM(str20, realOrderBuilder$models$createOrder$1) != coroutineSingletons) {
                                                                        str3 = offerToken;
                                                                        createOrderResponse2 = createOrderResponse;
                                                                        mutableState4 = mutableState3;
                                                                        realOrderBuilder4 = realOrderBuilder2;
                                                                        ((RealCartBuilder) realOrderBuilder4.cartBuilder).clearAll();
                                                                        if (str3 != null) {
                                                                        }
                                                                        Navigator navigator3 = realOrderBuilder4.navigator;
                                                                        SerializerKt serializerKt3 = createOrderResponse2.response;
                                                                        serializerKt3.getClass();
                                                                        if (!(serializerKt3 instanceof CreateOrderResponse$Response$Success)) {
                                                                        }
                                                                        if (createOrderResponse$Response$Success == null) {
                                                                        }
                                                                        success2.getClass();
                                                                        LocalOrder localOrder2 = success2.order;
                                                                        localOrder2.getClass();
                                                                        navigator3.goTo(new LocalOrderStatusScreen(new LocalOrderStatusScreen.Type.Preloaded(localOrder2), orderWorkflow5 != OrderWorkflow.ORDER_WORKFLOW_FINALIZE_DELAYED_CAPTURE ? z3 : false, 2));
                                                                        mutableState3 = mutableState4;
                                                                    }
                                                                } else {
                                                                    if (serializerKt2 != null) {
                                                                        CreateOrderResponse$Response$OpenTab createOrderResponse$Response$OpenTab = serializerKt2 instanceof CreateOrderResponse$Response$OpenTab ? (CreateOrderResponse$Response$OpenTab) serializerKt2 : null;
                                                                        if (createOrderResponse$Response$OpenTab != null) {
                                                                            openTab = createOrderResponse$Response$OpenTab.value;
                                                                            if (openTab != null) {
                                                                                String offerToken2 = DiscountCodeKt.getOfferToken(((RealCartBuilder) cartBuilder).discountCodes);
                                                                                String str21 = brandSpot.brandToken;
                                                                                realOrderBuilder$models$createOrder$1.L$0 = realOrderBuilder2;
                                                                                realOrderBuilder$models$createOrder$1.L$1 = mutableState3;
                                                                                realOrderBuilder$models$createOrder$1.L$2 = null;
                                                                                realOrderBuilder$models$createOrder$1.L$7 = null;
                                                                                realOrderBuilder$models$createOrder$1.L$10 = null;
                                                                                realOrderBuilder$models$createOrder$1.L$12 = null;
                                                                                realOrderBuilder$models$createOrder$1.L$13 = offerToken2;
                                                                                realOrderBuilder$models$createOrder$1.Z$0 = z2;
                                                                                realOrderBuilder$models$createOrder$1.label = 3;
                                                                                if (((RealLocalInstalledStore) localInstalledStore).m1287clearFulfillmentConfigurationNmdeRlM(str21, realOrderBuilder$models$createOrder$1) != coroutineSingletons) {
                                                                                    z4 = z2;
                                                                                    str2 = offerToken2;
                                                                                    realOrderBuilder3 = realOrderBuilder2;
                                                                                    ((RealCartBuilder) realOrderBuilder3.cartBuilder).clearAll();
                                                                                    realLocalBrandSyncer = realOrderBuilder3.syncer;
                                                                                    brandSpot2 = realOrderBuilder3.brandSpot;
                                                                                    realOrderBuilder$models$createOrder$1.L$0 = realOrderBuilder3;
                                                                                    realOrderBuilder$models$createOrder$1.L$1 = mutableState3;
                                                                                    realOrderBuilder$models$createOrder$1.L$2 = null;
                                                                                    realOrderBuilder$models$createOrder$1.L$7 = null;
                                                                                    realOrderBuilder$models$createOrder$1.L$10 = null;
                                                                                    realOrderBuilder$models$createOrder$1.L$12 = null;
                                                                                    realOrderBuilder$models$createOrder$1.L$13 = str2;
                                                                                    realOrderBuilder$models$createOrder$1.Z$0 = z4;
                                                                                    realOrderBuilder$models$createOrder$1.label = 4;
                                                                                    if (realLocalBrandSyncer.syncBuyerInfo(brandSpot2, realOrderBuilder$models$createOrder$1) != coroutineSingletons) {
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    openTab = null;
                                                                    if (openTab != null) {
                                                                    }
                                                                }
                                                                return coroutineSingletons;
                                                            }
                                                        }
                                                        success = null;
                                                        if (success == null) {
                                                        }
                                                        return coroutineSingletons;
                                                    }
                                                    serializerKt2.getClass();
                                                    CreateOrderResponse$Response$UpdatedCartResponse createOrderResponse$Response$UpdatedCartResponse2 = serializerKt2 instanceof CreateOrderResponse$Response$UpdatedCartResponse ? (CreateOrderResponse$Response$UpdatedCartResponse) serializerKt2 : null;
                                                    CreateOrderResponse.UpdatedCartResponse updatedCartResponse2 = createOrderResponse$Response$UpdatedCartResponse2 != null ? createOrderResponse$Response$UpdatedCartResponse2.value : null;
                                                    updatedCartResponse2.getClass();
                                                    CreateCartResponse createCartResponse = updatedCartResponse2.cart_response;
                                                    createCartResponse.getClass();
                                                    realOrderBuilder2.cartResponse$delegate.setValue(createCartResponse);
                                                    LocalErrorResponse localErrorResponse3 = updatedCartResponse2.error_responses;
                                                    if (localErrorResponse3 != null) {
                                                        app.cash.local.primitives.LocalErrorResponse errorResponse4 = LocalErrorKt.toErrorResponse(localErrorResponse3, null);
                                                        if (errorResponse4 == null || (list3 = errorResponse4.errors) == null) {
                                                            r12 = EmptyList.INSTANCE;
                                                        } else {
                                                            r12 = new ArrayList();
                                                            Iterator it = list3.iterator();
                                                            while (it.hasNext()) {
                                                                String str22 = ((LocalErrorResponse.Error) it.next()).message;
                                                                if (str22 != null) {
                                                                    r12.add(str22);
                                                                }
                                                            }
                                                        }
                                                        navigator2.goTo(new LocalExplanatoryDialog(r12));
                                                    }
                                                }
                                            }
                                            updatedCartResponse = null;
                                            if (updatedCartResponse != null) {
                                            }
                                        }
                                    }
                                }
                                localErrorResponse2 = null;
                                if (localErrorResponse2 == null) {
                                }
                            }
                            String str23 = null;
                            if (serializerKt2 != null) {
                                CreateOrderResponse$Response$ErrorResponses createOrderResponse$Response$ErrorResponses2 = serializerKt2 instanceof CreateOrderResponse$Response$ErrorResponses ? (CreateOrderResponse$Response$ErrorResponses) serializerKt2 : null;
                                if (createOrderResponse$Response$ErrorResponses2 != null) {
                                    localErrorResponse = createOrderResponse$Response$ErrorResponses2.value;
                                    if (serializerKt2 != null) {
                                        CreateOrderResponse$Response$ErrorResponse createOrderResponse$Response$ErrorResponse2 = serializerKt2 instanceof CreateOrderResponse$Response$ErrorResponse ? (CreateOrderResponse$Response$ErrorResponse) serializerKt2 : null;
                                        if (createOrderResponse$Response$ErrorResponse2 != null) {
                                            errorResponse2 = createOrderResponse$Response$ErrorResponse2.value;
                                            errorResponse3 = LocalErrorKt.toErrorResponse(localErrorResponse, errorResponse2);
                                            String str24 = ((Cart) state6.getValue()).token;
                                            if (errorResponse3 != null && (list2 = errorResponse3.errors) != null && (error = (LocalErrorResponse.Error) CollectionsKt.firstOrNull(list2)) != null) {
                                                str23 = error.message;
                                            }
                                            ErrorType errorType2 = ErrorType.SERVER_ERROR;
                                            Analytics analytics2 = realOrderBuilder2.analytics;
                                            String activeAccountTokenOrNull2 = PlatformKt.activeAccountTokenOrNull(realOrderBuilder2.sessionManager);
                                            BrandSpot brandSpot5 = realOrderBuilder2.brandSpot;
                                            String str25 = brandSpot5.brandToken;
                                            String str26 = brandSpot5.locationToken;
                                            analytics2.track(new LocalClientCheckoutFlowOrderFailed(activeAccountTokenOrNull2, str25, str26 != null ? null : str26, str24, errorType2, str23), null);
                                            if (errorResponse3 != null || (list = errorResponse3.errors) == null) {
                                                r1 = EmptyList.INSTANCE;
                                            } else {
                                                r1 = new ArrayList();
                                                Iterator it2 = list.iterator();
                                                while (it2.hasNext()) {
                                                    String str27 = ((LocalErrorResponse.Error) it2.next()).message;
                                                    if (str27 != null) {
                                                        r1.add(str27);
                                                    }
                                                }
                                            }
                                            navigator2.goTo(new LocalExplanatoryDialog(r1));
                                        }
                                    }
                                    errorResponse2 = null;
                                    errorResponse3 = LocalErrorKt.toErrorResponse(localErrorResponse, errorResponse2);
                                    String str242 = ((Cart) state6.getValue()).token;
                                    if (errorResponse3 != null) {
                                        str23 = error.message;
                                    }
                                    ErrorType errorType22 = ErrorType.SERVER_ERROR;
                                    Analytics analytics22 = realOrderBuilder2.analytics;
                                    String activeAccountTokenOrNull22 = PlatformKt.activeAccountTokenOrNull(realOrderBuilder2.sessionManager);
                                    BrandSpot brandSpot52 = realOrderBuilder2.brandSpot;
                                    String str252 = brandSpot52.brandToken;
                                    String str262 = brandSpot52.locationToken;
                                    analytics22.track(new LocalClientCheckoutFlowOrderFailed(activeAccountTokenOrNull22, str252, str262 != null ? null : str262, str242, errorType22, str23), null);
                                    if (errorResponse3 != null) {
                                    }
                                    r1 = EmptyList.INSTANCE;
                                    navigator2.goTo(new LocalExplanatoryDialog(r1));
                                }
                            }
                            localErrorResponse = null;
                            if (serializerKt2 != null) {
                            }
                            errorResponse2 = null;
                            errorResponse3 = LocalErrorKt.toErrorResponse(localErrorResponse, errorResponse2);
                            String str2422 = ((Cart) state6.getValue()).token;
                            if (errorResponse3 != null) {
                            }
                            ErrorType errorType222 = ErrorType.SERVER_ERROR;
                            Analytics analytics222 = realOrderBuilder2.analytics;
                            String activeAccountTokenOrNull222 = PlatformKt.activeAccountTokenOrNull(realOrderBuilder2.sessionManager);
                            BrandSpot brandSpot522 = realOrderBuilder2.brandSpot;
                            String str2522 = brandSpot522.brandToken;
                            String str2622 = brandSpot522.locationToken;
                            analytics222.track(new LocalClientCheckoutFlowOrderFailed(activeAccountTokenOrNull222, str2522, str2622 != null ? null : str2622, str2422, errorType222, str23), null);
                            if (errorResponse3 != null) {
                            }
                            r1 = EmptyList.INSTANCE;
                            navigator2.goTo(new LocalExplanatoryDialog(r1));
                        }
                    }
                    errorResponse = null;
                    if (errorResponse == null) {
                    }
                    String str232 = null;
                    if (serializerKt2 != null) {
                    }
                    localErrorResponse = null;
                    if (serializerKt2 != null) {
                    }
                    errorResponse2 = null;
                    errorResponse3 = LocalErrorKt.toErrorResponse(localErrorResponse, errorResponse2);
                    String str24222 = ((Cart) state6.getValue()).token;
                    if (errorResponse3 != null) {
                    }
                    ErrorType errorType2222 = ErrorType.SERVER_ERROR;
                    Analytics analytics2222 = realOrderBuilder2.analytics;
                    String activeAccountTokenOrNull2222 = PlatformKt.activeAccountTokenOrNull(realOrderBuilder2.sessionManager);
                    BrandSpot brandSpot5222 = realOrderBuilder2.brandSpot;
                    String str25222 = brandSpot5222.brandToken;
                    String str26222 = brandSpot5222.locationToken;
                    analytics2222.track(new LocalClientCheckoutFlowOrderFailed(activeAccountTokenOrNull2222, str25222, str26222 != null ? null : str26222, str24222, errorType2222, str232), null);
                    if (errorResponse3 != null) {
                    }
                    r1 = EmptyList.INSTANCE;
                    navigator2.goTo(new LocalExplanatoryDialog(r1));
                }
                models$lambda$25(mutableState3, false);
                return Unit.INSTANCE;
            }
        }
        realOrderBuilder$models$createOrder$1 = new RealOrderBuilder$models$createOrder$1(continuationImpl);
        Object obj2 = realOrderBuilder$models$createOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realOrderBuilder$models$createOrder$1.label;
        Long l22 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Failure) {
        }
        SVG svg2 = realOrderBuilder2.responseContextHandler;
        CartBuilder cartBuilder2 = realOrderBuilder2.cartBuilder;
        BrandSpot brandSpot42 = realOrderBuilder2.brandSpot;
        LocalInstalledStore localInstalledStore2 = realOrderBuilder2.localInstalledStore;
        Navigator navigator22 = realOrderBuilder2.navigator;
        orderWorkflow3 = OrderWorkflow.ORDER_WORKFLOW_PREAUTHORIZED_DELAYED_CAPTURE;
        AttributionKey attributionKey2 = realOrderBuilder2.attributionKey;
        State state62 = state5;
        boolean z62 = realOrderBuilder2.isProfileSheetInline;
        if (orderWorkflow2 != orderWorkflow3) {
        }
        orderWorkflow5 = orderWorkflow4;
        CreateAppOrderResponse createAppOrderResponse2 = (CreateAppOrderResponse) svg2.handle(apiResult, str, screen);
        if (createAppOrderResponse2 == null) {
        }
        if (createOrderResponse != null) {
        }
        models$lambda$25(mutableState3, false);
        return Unit.INSTANCE;
    }

    public static final void models$lambda$25(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void models$processPaymentAndCreateOrder(RealOrderBuilder realOrderBuilder, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, State state, State state2, State state3, State state4, OrderWorkflow orderWorkflow) {
        PaymentMethod paymentMethod = (PaymentMethod) mutableState.getValue();
        paymentMethod.getClass();
        LocalPaymentOption paymentOption = paymentMethod.getPaymentOption();
        switch (WhenMappings.$EnumSwitchMapping$1[paymentOption.ordinal()]) {
            case 1:
            case 2:
            case 3:
                Path$$ExternalSyntheticBUOutline0.m$1(paymentOption, "Unexpected payment option ");
                return;
            case 4:
                realOrderBuilder.pendingCreateOrderWorkflow = orderWorkflow;
                CardEntry.startCardEntryActivity$default((Activity) realOrderBuilder.inAppPaymentLauncher.f$0, false, 0, 6, null);
                return;
            case 5:
                models$lambda$25(mutableState2, true);
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                JobKt.launch$default(coroutineScope, DefaultIoScheduler.INSTANCE, null, new RealOrderBuilder$models$processPaymentAndCreateOrder$1(realOrderBuilder, orderWorkflow, state, state2, mutableState2, state3, state4, mutableState, null), 2);
                return;
            case 6:
            case 7:
                JobKt.launch$default(coroutineScope, null, null, new ZiplineLoader$load$2(orderWorkflow, realOrderBuilder, mutableState2, state2, state, state3, state4, mutableState, null, 5), 3);
                return;
            case 8:
                throw new NotImplementedError(null, 1, null);
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
        }
    }

    public static final void models$trackPlaceOrder(RealOrderBuilder realOrderBuilder, State state, MutableState mutableState) {
        PaymentType paymentType;
        Analytics analytics = realOrderBuilder.analytics;
        String str = ((Cart) state.getValue()).token;
        LocalMoney tipAmount = realOrderBuilder.getTipAmount();
        Long valueOf = tipAmount != null ? Long.valueOf(tipAmount.amount) : null;
        LocalTippingConfiguration localTippingConfiguration = realOrderBuilder.getCartResponse().tipping_configuration;
        List<LocalTippingConfiguration.Suggestion> list = localTippingConfiguration != null ? localTippingConfiguration.suggestions : null;
        if (list == null) {
            list = EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (LocalTippingConfiguration.Suggestion suggestion : list) {
            String str2 = suggestion.label;
            if (str2 == null) {
                com.squareup.protos.cash.local.client.v1.LocalMoney localMoney = suggestion.tip_amount;
                str2 = localMoney != null ? LocalsKt.prettyPrint$default(LocalMoneyKt.toMoney(localMoney), false, null, 7) : null;
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        Json.Default r7 = Json.Default;
        SerializersModule serializersModule = r7.serializersModule;
        KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
        KType typeOf = Reflection.typeOf(String.class);
        companion.getClass();
        String encodeToString = r7.encodeToString(SerializersKt.serializer(serializersModule, Reflection.typeOf(List.class, KTypeProjection.Companion.invariant(typeOf))), arrayList);
        PaymentMethod paymentMethod = (PaymentMethod) mutableState.getValue();
        LocalPaymentOption paymentOption = paymentMethod != null ? paymentMethod.getPaymentOption() : null;
        switch (paymentOption == null ? -1 : WhenMappings.$EnumSwitchMapping$1[paymentOption.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
                paymentType = null;
                break;
            case 0:
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            case 4:
                paymentType = PaymentType.KEYED_CARD;
                break;
            case 5:
                paymentType = PaymentType.GOOGLE_PAY;
                break;
            case 6:
                paymentType = PaymentType.CASH_APP;
                break;
            case 7:
                paymentType = PaymentType.CARD_ON_FILE;
                break;
            case 8:
                throw new NotImplementedError(null, 1, null);
        }
        analytics.track(new LocalClientCheckoutFlowPlaceOrder(str, valueOf, encodeToString, paymentType), null);
    }

    public final List getAppliedGiftCardCodes() {
        return (List) this.appliedGiftCardCodes$delegate.getValue();
    }

    public final CreateCartResponse getCartResponse() {
        return (CreateCartResponse) this.cartResponse$delegate.getValue();
    }

    public final CurbsidePickupDetails getCurbsidePickupDetails() {
        return (CurbsidePickupDetails) this.curbsidePickupDetails$delegate.getValue();
    }

    public final boolean getRedeemLocalCashBalance() {
        return ((Boolean) this.redeemLocalCashBalance$delegate.getValue()).booleanValue();
    }

    /* renamed from: getSelectedPaymentMethodToken-yJPV6_0, reason: not valid java name */
    public final String m1211getSelectedPaymentMethodTokenyJPV6_0() {
        PaymentMethodToken paymentMethodToken = (PaymentMethodToken) this.selectedPaymentMethodToken$delegate.getValue();
        if (paymentMethodToken != null) {
            return paymentMethodToken.value;
        }
        return null;
    }

    public final LocalMoney getTipAmount() {
        return (LocalMoney) this.tipAmount$delegate.getValue();
    }

    @Override // sqip.CardNonceBackgroundHandler
    public final CardEntryActivityCommand handleEnteredCardInBackground(CardDetails cardDetails) {
        cardDetails.getClass();
        this.nonce = cardDetails.getNonce();
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.createOrderTrigger$delegate;
        parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() + 1);
        return new CardEntryActivityCommand.Finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x047b  */
    @Override // app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final UiCallbackModel models(Composer composer) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        boolean z;
        Object obj;
        boolean z2;
        String str;
        ArrayList arrayList;
        OrderBuilderModel.OrderType orderType;
        String str2;
        State state;
        final State state2;
        State state3;
        MutableState mutableState;
        MutableState mutableState2;
        State state4;
        CoroutineScope coroutineScope;
        ArrayList arrayList2;
        Integer num;
        MutableState mutableState3;
        boolean z3;
        final RealOrderBuilder realOrderBuilder;
        final State state5;
        final MutableState mutableState4;
        final MutableState mutableState5;
        LocalMoney localMoney;
        Object obj2;
        LocalFulfillment.DeliveryDetails deliveryDetails;
        Boolean bool;
        Iterator it;
        PaymentMethod storedInstrument;
        com.squareup.protos.cash.local.client.v1.LocalMoney localMoney2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-476234172);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj3 = Composer.Companion.Empty;
        if (rememberedValue == obj3) {
            rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        CoroutineScope coroutineScope2 = (CoroutineScope) rememberedValue;
        LocalCashConfiguration localCashConfiguration = getCartResponse().redeemable_local_cash_configuration;
        LocalMoney money = (localCashConfiguration == null || (localMoney2 = localCashConfiguration.local_cash_monetary_value) == null) ? null : LocalMoneyKt.toMoney(localMoney2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj3) {
            rememberedValue2 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        final MutableState mutableState6 = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == obj3) {
            rememberedValue3 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState7 = (MutableState) rememberedValue3;
        boolean changed = gapComposer.changed((DynamicChargesBreakdownComputer) mutableState6.getValue()) | gapComposer.changed(getTipAmount()) | gapComposer.changed(getRedeemLocalCashBalance());
        Object rememberedValue4 = gapComposer.rememberedValue();
        final int i = 0;
        if (changed || rememberedValue4 == obj3) {
            rememberedValue4 = Updater.derivedStateOf(new Function0(this) { // from class: app.cash.local.presenters.RealOrderBuilder$$ExternalSyntheticLambda1
                public final /* synthetic */ RealOrderBuilder f$0;

                {
                    this.f$0 = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:110:0x0229  */
                /* JADX WARN: Removed duplicated region for block: B:113:0x0238  */
                /* JADX WARN: Removed duplicated region for block: B:127:0x024b  */
                /* JADX WARN: Removed duplicated region for block: B:128:0x022c  */
                @Override // kotlin.jvm.functions.Function0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke() {
                    Object obj4;
                    int i2;
                    Iterator it2;
                    String str3;
                    DynamicChargesBreakdownComputer dynamicChargesBreakdownComputer;
                    ComputedOrderSummary.DisplayRow displayRow;
                    boolean z4;
                    String prettyPrint$default;
                    String str4;
                    int ordinal;
                    ComputedOrderSummary.DisplayRow.Visibility visibility;
                    LocalFulfillment.DeliveryDetails deliveryDetails2;
                    LocalFulfillment.SchedulingDetails schedulingDetails;
                    LocalFulfillment.DeliveryDetails deliveryDetails3;
                    String str5;
                    int i3 = i;
                    MutableState mutableState8 = mutableState6;
                    RealOrderBuilder realOrderBuilder2 = this.f$0;
                    switch (i3) {
                        case 0:
                            DynamicChargesBreakdownComputer dynamicChargesBreakdownComputer2 = (DynamicChargesBreakdownComputer) mutableState8.getValue();
                            if (dynamicChargesBreakdownComputer2 != null) {
                                LocalMoney tipAmount = realOrderBuilder2.getTipAmount();
                                boolean redeemLocalCashBalance = realOrderBuilder2.getRedeemLocalCashBalance();
                                ArrayList arrayList3 = new ArrayList();
                                Pair pair = new Pair(arrayList3, new ArrayList());
                                OrderSummary orderSummary = dynamicChargesBreakdownComputer2.orderSummary;
                                ArrayList<OrderRow> arrayList4 = orderSummary.orderRows;
                                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
                                for (OrderRow orderRow : arrayList4) {
                                    if (tipAmount != null) {
                                        String str6 = orderRow.identifier;
                                        String str7 = orderSummary.customerTipIdentifier;
                                        if (str7 == null ? false : Intrinsics.areEqual(str6, str7)) {
                                            String str8 = orderRow.identifier;
                                            OrderRow.Visibility visibility2 = orderRow.visibility;
                                            String str9 = orderRow.displayName;
                                            String str10 = orderRow.displayValueIfZero;
                                            OrderRow.Orientation orientation = orderRow.orientation;
                                            List list = orderRow.dependencies;
                                            boolean z5 = orderRow.boldTreatment;
                                            str8.getClass();
                                            orderRow = new OrderRow(str8, visibility2, str9, str10, tipAmount, orientation, list, z5);
                                        }
                                    }
                                    arrayList5.add(orderRow);
                                }
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it3 = arrayList5.iterator();
                                while (it3.hasNext()) {
                                    Object next = it3.next();
                                    String str11 = ((OrderRow) next).identifier;
                                    String str12 = orderSummary.localCashIdentifier;
                                    if (!(str12 == null ? false : Intrinsics.areEqual(str11, str12)) || redeemLocalCashBalance) {
                                        arrayList6.add(next);
                                    }
                                }
                                Iterator it4 = arrayList6.iterator();
                                while (it4.hasNext()) {
                                    OrderRow orderRow2 = (OrderRow) it4.next();
                                    List list2 = (List) pair.first;
                                    List list3 = (List) pair.second;
                                    ArrayList arrayList7 = new ArrayList();
                                    for (Object obj5 : list3) {
                                        if (orderRow2.dependencies.contains(new RowIdentifier(((ComputedRow) obj5).identifier))) {
                                            arrayList7.add(obj5);
                                        }
                                    }
                                    List list4 = orderRow2.dependencies;
                                    String str13 = orderRow2.identifier;
                                    OrderRow.Orientation orientation2 = orderRow2.orientation;
                                    LocalMoney localMoney3 = orderRow2.amount;
                                    if (!list4.isEmpty()) {
                                        LocalMoney zero = LocalMoneysKt.zero(LocalCurrencyCode.USD);
                                        Iterator it5 = arrayList7.iterator();
                                        while (it5.hasNext()) {
                                            zero = LocalMoneysKt.plus(zero, ((ComputedRow) it5.next()).amount);
                                        }
                                        int ordinal2 = orientation2.ordinal();
                                        if (ordinal2 == 0) {
                                            localMoney3 = LocalMoneysKt.plus(localMoney3, zero);
                                        } else {
                                            if (ordinal2 != 1) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                            localMoney3 = LocalMoneysKt.minOf(localMoney3, zero);
                                        }
                                    }
                                    int ordinal3 = orientation2.ordinal();
                                    if (ordinal3 == 0) {
                                        i2 = 1;
                                    } else {
                                        if (ordinal3 != 1) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        i2 = -1;
                                    }
                                    LocalMoney times = LocalMoneysKt.times(localMoney3, i2);
                                    ComputedRow computedRow = new ComputedRow(times, str13);
                                    AndroidStringManager androidStringManager = dynamicChargesBreakdownComputer2.stringManager;
                                    String str14 = orderSummary.totalWithoutDiscountsIdentifier;
                                    if (str14 == null ? false : str13.equals(str14)) {
                                        str3 = androidStringManager.get(R.string.local_presenters_dynamic_charges_total_without_discount);
                                        it2 = it4;
                                    } else {
                                        String str15 = orderSummary.grandTotalIdentifier;
                                        if (str15 == null ? false : str13.equals(str15)) {
                                            if (tipAmount != null) {
                                                it2 = it4;
                                                if (LocalMoneysKt.isPositive(tipAmount)) {
                                                    str3 = androidStringManager.get(R.string.local_presenters_dynamic_charges_grand_total_with_tip);
                                                }
                                            } else {
                                                it2 = it4;
                                            }
                                            str3 = androidStringManager.get(R.string.local_presenters_dynamic_charges_grand_total);
                                        } else {
                                            it2 = it4;
                                            str3 = orderRow2.displayName;
                                            if (str3 == null) {
                                                dynamicChargesBreakdownComputer = dynamicChargesBreakdownComputer2;
                                                displayRow = null;
                                                list2.add(new ComputedOrderSummary.Row(str13, times, displayRow));
                                                list3.add(computedRow);
                                                dynamicChargesBreakdownComputer2 = dynamicChargesBreakdownComputer;
                                                it4 = it2;
                                            }
                                        }
                                    }
                                    String str16 = str3;
                                    dynamicChargesBreakdownComputer = dynamicChargesBreakdownComputer2;
                                    if (times.amount == 0) {
                                        String str17 = orderRow2.displayValueIfZero;
                                        if (str17 == null) {
                                            obj4 = null;
                                            z4 = false;
                                            prettyPrint$default = LocalsKt.prettyPrint$default(times, false, null, 7);
                                        } else {
                                            obj4 = null;
                                            z4 = false;
                                            str4 = str17;
                                            boolean z6 = orientation2 != OrderRow.Orientation.CREDIT ? true : z4;
                                            boolean z7 = orderRow2.boldTreatment;
                                            ordinal = orderRow2.visibility.ordinal();
                                            if (ordinal != 0) {
                                                visibility = ComputedOrderSummary.DisplayRow.Visibility.VISIBLE;
                                            } else if (ordinal == 1) {
                                                visibility = ComputedOrderSummary.DisplayRow.Visibility.HIDDEN_IF_ZERO;
                                            } else if (ordinal == 2) {
                                                visibility = ComputedOrderSummary.DisplayRow.Visibility.HIDDEN;
                                            } else {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                            }
                                            displayRow = new ComputedOrderSummary.DisplayRow(str16, str4, visibility, z6, z7);
                                            list2.add(new ComputedOrderSummary.Row(str13, times, displayRow));
                                            list3.add(computedRow);
                                            dynamicChargesBreakdownComputer2 = dynamicChargesBreakdownComputer;
                                            it4 = it2;
                                        }
                                    } else {
                                        obj4 = null;
                                        z4 = false;
                                        prettyPrint$default = LocalsKt.prettyPrint$default(times, false, null, 7);
                                    }
                                    str4 = prettyPrint$default;
                                    if (orientation2 != OrderRow.Orientation.CREDIT) {
                                    }
                                    boolean z72 = orderRow2.boldTreatment;
                                    ordinal = orderRow2.visibility.ordinal();
                                    if (ordinal != 0) {
                                    }
                                    displayRow = new ComputedOrderSummary.DisplayRow(str16, str4, visibility, z6, z72);
                                    list2.add(new ComputedOrderSummary.Row(str13, times, displayRow));
                                    list3.add(computedRow);
                                    dynamicChargesBreakdownComputer2 = dynamicChargesBreakdownComputer;
                                    it4 = it2;
                                }
                                return new ComputedOrderSummary(arrayList3, orderSummary.customerTipIdentifier, orderSummary.localCashIdentifier, orderSummary.subtotalIdentifier, orderSummary.totalBeforeTipIdentifier, orderSummary.totalWithoutDiscountsIdentifier, orderSummary.grandTotalIdentifier);
                            }
                            obj4 = null;
                            return obj4;
                        default:
                            LocalFulfillment localFulfillment = realOrderBuilder2.getCartResponse().fulfillment;
                            if (localFulfillment == null) {
                                return null;
                            }
                            LocalFulfillment localFulfillment2 = realOrderBuilder2.getCartResponse().fulfillment;
                            if (localFulfillment2 == null || (deliveryDetails3 = localFulfillment2.delivery_details) == null) {
                                deliveryDetails2 = null;
                            } else {
                                Boolean bool2 = (Boolean) realOrderBuilder2.noContactDelivery$delegate.getValue();
                                bool2.booleanValue();
                                String str18 = (String) realOrderBuilder2.dropoffNotes$delegate.getValue();
                                if (str18 != null) {
                                    if (StringsKt.isBlank(str18)) {
                                        str18 = null;
                                    }
                                    str5 = str18;
                                } else {
                                    str5 = null;
                                }
                                deliveryDetails2 = LocalFulfillment.DeliveryDetails.copy$default(deliveryDetails3, null, null, null, null, null, null, null, bool2, str5, null, null, null, 3711, null);
                            }
                            LocalFulfillment.SchedulingDetails schedulingDetails2 = (LocalFulfillment.SchedulingDetails) mutableState8.getValue();
                            if (schedulingDetails2 == null) {
                                LocalFulfillment localFulfillment3 = realOrderBuilder2.getCartResponse().fulfillment;
                                schedulingDetails = localFulfillment3 != null ? localFulfillment3.scheduling_details : null;
                            } else {
                                schedulingDetails = schedulingDetails2;
                            }
                            return LocalFulfillment.copy$default(localFulfillment, null, null, deliveryDetails2, schedulingDetails, null, null, null, null, 975);
                    }
                }
            });
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        State state6 = (State) rememberedValue4;
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == obj3) {
            rememberedValue5 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState8 = (MutableState) rememberedValue5;
        boolean changed2 = gapComposer.changed(getCartResponse()) | gapComposer.changed(getRedeemLocalCashBalance());
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue6 == obj3) {
            rememberedValue6 = Updater.derivedStateOf(new n$$ExternalSyntheticLambda1(11, this, money, mutableState6));
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        State state7 = (State) rememberedValue6;
        List list = getCartResponse().payment_methods;
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            parcelableSnapshotMutableState = this.googlePayReadyToPay$delegate;
            z = this.gmsWalletApiEnabled;
            if (!hasNext) {
                break;
            }
            Object next = it2.next();
            LocalPaymentMethod localPaymentMethod = (LocalPaymentMethod) next;
            if ((z && !Intrinsics.areEqual((Boolean) parcelableSnapshotMutableState.getValue(), Boolean.FALSE)) || localPaymentMethod.payment_option != LocalPaymentOption.LOCAL_PAYMENT_OPTION_GOOGLE_PAY) {
                arrayList3.add(next);
            }
        }
        boolean isEmpty = arrayList3.isEmpty();
        Collection collection = arrayList3;
        if (isEmpty) {
            collection = CollectionsKt__CollectionsKt.listOfNotNull(getCartResponse().payment_option != null ? new LocalPaymentMethod(getCartResponse().payment_option, null, ByteString.EMPTY) : null);
        }
        Collection collection2 = collection;
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection2, 10));
        Iterator it3 = collection2.iterator();
        while (it3.hasNext()) {
            LocalPaymentMethod localPaymentMethod2 = (LocalPaymentMethod) it3.next();
            localPaymentMethod2.getClass();
            LocalPaymentMethod$PaymentMethodData$StoredInstrument localPaymentMethod$PaymentMethodData$StoredInstrument = localPaymentMethod2.payment_method_data;
            LocalPaymentOption localPaymentOption = localPaymentMethod2.payment_option;
            if (localPaymentMethod$PaymentMethodData$StoredInstrument == null) {
                localPaymentOption.getClass();
                storedInstrument = new PaymentMethod.Standalone(localPaymentOption);
                it = it3;
            } else {
                LocalStoredInstrument localStoredInstrument = localPaymentMethod$PaymentMethodData$StoredInstrument.value;
                String str3 = localStoredInstrument.token;
                str3.getClass();
                localPaymentOption.getClass();
                String str4 = localStoredInstrument.display_brand;
                it = it3;
                String str5 = localStoredInstrument.display_name;
                LocalStoredInstrument.Type type2 = localStoredInstrument.f1314type;
                type2.getClass();
                storedInstrument = new PaymentMethod.StoredInstrument(str3, localPaymentOption, str4, str5, type2);
            }
            arrayList4.add(storedInstrument);
            it3 = it;
        }
        Iterator it4 = arrayList4.iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj = null;
                break;
            }
            obj = it4.next();
            String mo1281getToken3m_AGhc = ((PaymentMethod) obj).mo1281getToken3m_AGhc();
            String m1211getSelectedPaymentMethodTokenyJPV6_0 = m1211getSelectedPaymentMethodTokenyJPV6_0();
            if (m1211getSelectedPaymentMethodTokenyJPV6_0 == null ? false : Intrinsics.areEqual(mo1281getToken3m_AGhc, m1211getSelectedPaymentMethodTokenyJPV6_0)) {
                break;
            }
        }
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(obj, gapComposer);
        if (((Boolean) parcelableSnapshotMutableState.getValue()) == null) {
            gapComposer.startReplaceGroup(-1211769625);
            if (!z) {
                parcelableSnapshotMutableState.setValue(Boolean.FALSE);
            }
            boolean changedInstance = gapComposer.changedInstance(arrayList4) | gapComposer.changedInstance(this);
            Object rememberedValue7 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue7 == obj3) {
                rememberedValue7 = new SliderState$drag$2(arrayList4, this, (Continuation) null, 27);
                gapComposer.updateRememberedValue(rememberedValue7);
            }
            Updater.LaunchedEffect(gapComposer, arrayList4, (Function2) rememberedValue7);
            z2 = false;
            gapComposer.end(false);
        } else {
            z2 = false;
            gapComposer.startReplaceGroup(-1211409250);
            gapComposer.end(false);
        }
        boolean changedInstance2 = gapComposer.changedInstance(this) | gapComposer.changedInstance(arrayList4);
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue8 == obj3) {
            rememberedValue8 = new RealBadger2$clear$2(this, arrayList4, (Continuation) null, 28);
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        Updater.LaunchedEffect(gapComposer, arrayList4, (Function2) rememberedValue8);
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (rememberedValue9 == obj3) {
            rememberedValue9 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue9);
        }
        MutableState mutableState9 = (MutableState) rememberedValue9;
        Object rememberedValue10 = gapComposer.rememberedValue();
        if (rememberedValue10 == obj3) {
            rememberedValue10 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue10);
        }
        MutableState mutableState10 = (MutableState) rememberedValue10;
        boolean changed3 = gapComposer.changed(getCartResponse());
        Object rememberedValue11 = gapComposer.rememberedValue();
        if (changed3 || rememberedValue11 == obj3) {
            CreateCartResponse.CartLoyaltySummary cartLoyaltySummary = getCartResponse().cart_loyalty_summary;
            if (cartLoyaltySummary == null || (str = cartLoyaltySummary.selected_reward_token) == null) {
                str = null;
            }
            rememberedValue11 = Updater.mutableStateOf$default(str != null ? new RewardToken(str) : null);
            gapComposer.updateRememberedValue(rememberedValue11);
        }
        final MutableState mutableState11 = (MutableState) rememberedValue11;
        LocalFulfillment localFulfillment = getCartResponse().fulfillment;
        LocalFulfillmentType localFulfillmentType = localFulfillment != null ? localFulfillment.type : null;
        int i2 = localFulfillmentType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[localFulfillmentType.ordinal()];
        ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = this.dropoffNotes$delegate;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = this.noContactDelivery$delegate;
        switch (i2) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                arrayList = arrayList4;
                orderType = OrderBuilderModel.OrderType.Pickup.INSTANCE;
                break;
            case 0:
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 6:
                LocalFulfillment localFulfillment2 = getCartResponse().fulfillment;
                if (!((localFulfillment2 == null || (deliveryDetails = localFulfillment2.delivery_details) == null || (bool = deliveryDetails.requires_id_verification) == null) ? z2 : bool.booleanValue())) {
                    arrayList = arrayList4;
                    orderType = new OrderBuilderModel.OrderType.Regular(((Boolean) parcelableSnapshotMutableState3.getValue()).booleanValue(), (String) parcelableSnapshotMutableState2.getValue());
                    break;
                } else {
                    orderType = OrderBuilderModel.OrderType.IdVerificationRequired.INSTANCE;
                    arrayList = arrayList4;
                    break;
                }
                break;
        }
        OrderBuilderModel.OrderType orderType2 = orderType;
        Object rememberedValue12 = gapComposer.rememberedValue();
        if (rememberedValue12 == obj3) {
            str2 = null;
            rememberedValue12 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue12);
        } else {
            str2 = null;
        }
        final MutableState mutableState12 = (MutableState) rememberedValue12;
        boolean changed4 = gapComposer.changed(getCartResponse()) | gapComposer.changed(((Boolean) parcelableSnapshotMutableState3.getValue()).booleanValue()) | gapComposer.changed((String) parcelableSnapshotMutableState2.getValue()) | gapComposer.changed((LocalFulfillment.SchedulingDetails) mutableState12.getValue());
        Object rememberedValue13 = gapComposer.rememberedValue();
        if (changed4 || rememberedValue13 == obj3) {
            final int i3 = 1;
            rememberedValue13 = Updater.derivedStateOf(new Function0(this) { // from class: app.cash.local.presenters.RealOrderBuilder$$ExternalSyntheticLambda1
                public final /* synthetic */ RealOrderBuilder f$0;

                {
                    this.f$0 = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:110:0x0229  */
                /* JADX WARN: Removed duplicated region for block: B:113:0x0238  */
                /* JADX WARN: Removed duplicated region for block: B:127:0x024b  */
                /* JADX WARN: Removed duplicated region for block: B:128:0x022c  */
                @Override // kotlin.jvm.functions.Function0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke() {
                    Object obj4;
                    int i22;
                    Iterator it22;
                    String str32;
                    DynamicChargesBreakdownComputer dynamicChargesBreakdownComputer;
                    ComputedOrderSummary.DisplayRow displayRow;
                    boolean z4;
                    String prettyPrint$default;
                    String str42;
                    int ordinal;
                    ComputedOrderSummary.DisplayRow.Visibility visibility;
                    LocalFulfillment.DeliveryDetails deliveryDetails2;
                    LocalFulfillment.SchedulingDetails schedulingDetails;
                    LocalFulfillment.DeliveryDetails deliveryDetails3;
                    String str52;
                    int i32 = i3;
                    MutableState mutableState82 = mutableState12;
                    RealOrderBuilder realOrderBuilder2 = this.f$0;
                    switch (i32) {
                        case 0:
                            DynamicChargesBreakdownComputer dynamicChargesBreakdownComputer2 = (DynamicChargesBreakdownComputer) mutableState82.getValue();
                            if (dynamicChargesBreakdownComputer2 != null) {
                                LocalMoney tipAmount = realOrderBuilder2.getTipAmount();
                                boolean redeemLocalCashBalance = realOrderBuilder2.getRedeemLocalCashBalance();
                                ArrayList arrayList32 = new ArrayList();
                                Pair pair = new Pair(arrayList32, new ArrayList());
                                OrderSummary orderSummary = dynamicChargesBreakdownComputer2.orderSummary;
                                ArrayList<OrderRow> arrayList42 = orderSummary.orderRows;
                                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList42, 10));
                                for (OrderRow orderRow : arrayList42) {
                                    if (tipAmount != null) {
                                        String str6 = orderRow.identifier;
                                        String str7 = orderSummary.customerTipIdentifier;
                                        if (str7 == null ? false : Intrinsics.areEqual(str6, str7)) {
                                            String str8 = orderRow.identifier;
                                            OrderRow.Visibility visibility2 = orderRow.visibility;
                                            String str9 = orderRow.displayName;
                                            String str10 = orderRow.displayValueIfZero;
                                            OrderRow.Orientation orientation = orderRow.orientation;
                                            List list2 = orderRow.dependencies;
                                            boolean z5 = orderRow.boldTreatment;
                                            str8.getClass();
                                            orderRow = new OrderRow(str8, visibility2, str9, str10, tipAmount, orientation, list2, z5);
                                        }
                                    }
                                    arrayList5.add(orderRow);
                                }
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it32 = arrayList5.iterator();
                                while (it32.hasNext()) {
                                    Object next2 = it32.next();
                                    String str11 = ((OrderRow) next2).identifier;
                                    String str12 = orderSummary.localCashIdentifier;
                                    if (!(str12 == null ? false : Intrinsics.areEqual(str11, str12)) || redeemLocalCashBalance) {
                                        arrayList6.add(next2);
                                    }
                                }
                                Iterator it42 = arrayList6.iterator();
                                while (it42.hasNext()) {
                                    OrderRow orderRow2 = (OrderRow) it42.next();
                                    List list22 = (List) pair.first;
                                    List list3 = (List) pair.second;
                                    ArrayList arrayList7 = new ArrayList();
                                    for (Object obj5 : list3) {
                                        if (orderRow2.dependencies.contains(new RowIdentifier(((ComputedRow) obj5).identifier))) {
                                            arrayList7.add(obj5);
                                        }
                                    }
                                    List list4 = orderRow2.dependencies;
                                    String str13 = orderRow2.identifier;
                                    OrderRow.Orientation orientation2 = orderRow2.orientation;
                                    LocalMoney localMoney3 = orderRow2.amount;
                                    if (!list4.isEmpty()) {
                                        LocalMoney zero = LocalMoneysKt.zero(LocalCurrencyCode.USD);
                                        Iterator it5 = arrayList7.iterator();
                                        while (it5.hasNext()) {
                                            zero = LocalMoneysKt.plus(zero, ((ComputedRow) it5.next()).amount);
                                        }
                                        int ordinal2 = orientation2.ordinal();
                                        if (ordinal2 == 0) {
                                            localMoney3 = LocalMoneysKt.plus(localMoney3, zero);
                                        } else {
                                            if (ordinal2 != 1) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                            localMoney3 = LocalMoneysKt.minOf(localMoney3, zero);
                                        }
                                    }
                                    int ordinal3 = orientation2.ordinal();
                                    if (ordinal3 == 0) {
                                        i22 = 1;
                                    } else {
                                        if (ordinal3 != 1) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        i22 = -1;
                                    }
                                    LocalMoney times = LocalMoneysKt.times(localMoney3, i22);
                                    ComputedRow computedRow = new ComputedRow(times, str13);
                                    AndroidStringManager androidStringManager = dynamicChargesBreakdownComputer2.stringManager;
                                    String str14 = orderSummary.totalWithoutDiscountsIdentifier;
                                    if (str14 == null ? false : str13.equals(str14)) {
                                        str32 = androidStringManager.get(R.string.local_presenters_dynamic_charges_total_without_discount);
                                        it22 = it42;
                                    } else {
                                        String str15 = orderSummary.grandTotalIdentifier;
                                        if (str15 == null ? false : str13.equals(str15)) {
                                            if (tipAmount != null) {
                                                it22 = it42;
                                                if (LocalMoneysKt.isPositive(tipAmount)) {
                                                    str32 = androidStringManager.get(R.string.local_presenters_dynamic_charges_grand_total_with_tip);
                                                }
                                            } else {
                                                it22 = it42;
                                            }
                                            str32 = androidStringManager.get(R.string.local_presenters_dynamic_charges_grand_total);
                                        } else {
                                            it22 = it42;
                                            str32 = orderRow2.displayName;
                                            if (str32 == null) {
                                                dynamicChargesBreakdownComputer = dynamicChargesBreakdownComputer2;
                                                displayRow = null;
                                                list22.add(new ComputedOrderSummary.Row(str13, times, displayRow));
                                                list3.add(computedRow);
                                                dynamicChargesBreakdownComputer2 = dynamicChargesBreakdownComputer;
                                                it42 = it22;
                                            }
                                        }
                                    }
                                    String str16 = str32;
                                    dynamicChargesBreakdownComputer = dynamicChargesBreakdownComputer2;
                                    if (times.amount == 0) {
                                        String str17 = orderRow2.displayValueIfZero;
                                        if (str17 == null) {
                                            obj4 = null;
                                            z4 = false;
                                            prettyPrint$default = LocalsKt.prettyPrint$default(times, false, null, 7);
                                        } else {
                                            obj4 = null;
                                            z4 = false;
                                            str42 = str17;
                                            boolean z6 = orientation2 != OrderRow.Orientation.CREDIT ? true : z4;
                                            boolean z72 = orderRow2.boldTreatment;
                                            ordinal = orderRow2.visibility.ordinal();
                                            if (ordinal != 0) {
                                                visibility = ComputedOrderSummary.DisplayRow.Visibility.VISIBLE;
                                            } else if (ordinal == 1) {
                                                visibility = ComputedOrderSummary.DisplayRow.Visibility.HIDDEN_IF_ZERO;
                                            } else if (ordinal == 2) {
                                                visibility = ComputedOrderSummary.DisplayRow.Visibility.HIDDEN;
                                            } else {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                            }
                                            displayRow = new ComputedOrderSummary.DisplayRow(str16, str42, visibility, z6, z72);
                                            list22.add(new ComputedOrderSummary.Row(str13, times, displayRow));
                                            list3.add(computedRow);
                                            dynamicChargesBreakdownComputer2 = dynamicChargesBreakdownComputer;
                                            it42 = it22;
                                        }
                                    } else {
                                        obj4 = null;
                                        z4 = false;
                                        prettyPrint$default = LocalsKt.prettyPrint$default(times, false, null, 7);
                                    }
                                    str42 = prettyPrint$default;
                                    if (orientation2 != OrderRow.Orientation.CREDIT) {
                                    }
                                    boolean z722 = orderRow2.boldTreatment;
                                    ordinal = orderRow2.visibility.ordinal();
                                    if (ordinal != 0) {
                                    }
                                    displayRow = new ComputedOrderSummary.DisplayRow(str16, str42, visibility, z6, z722);
                                    list22.add(new ComputedOrderSummary.Row(str13, times, displayRow));
                                    list3.add(computedRow);
                                    dynamicChargesBreakdownComputer2 = dynamicChargesBreakdownComputer;
                                    it42 = it22;
                                }
                                return new ComputedOrderSummary(arrayList32, orderSummary.customerTipIdentifier, orderSummary.localCashIdentifier, orderSummary.subtotalIdentifier, orderSummary.totalBeforeTipIdentifier, orderSummary.totalWithoutDiscountsIdentifier, orderSummary.grandTotalIdentifier);
                            }
                            obj4 = null;
                            return obj4;
                        default:
                            LocalFulfillment localFulfillment3 = realOrderBuilder2.getCartResponse().fulfillment;
                            if (localFulfillment3 == null) {
                                return null;
                            }
                            LocalFulfillment localFulfillment22 = realOrderBuilder2.getCartResponse().fulfillment;
                            if (localFulfillment22 == null || (deliveryDetails3 = localFulfillment22.delivery_details) == null) {
                                deliveryDetails2 = null;
                            } else {
                                Boolean bool2 = (Boolean) realOrderBuilder2.noContactDelivery$delegate.getValue();
                                bool2.booleanValue();
                                String str18 = (String) realOrderBuilder2.dropoffNotes$delegate.getValue();
                                if (str18 != null) {
                                    if (StringsKt.isBlank(str18)) {
                                        str18 = null;
                                    }
                                    str52 = str18;
                                } else {
                                    str52 = null;
                                }
                                deliveryDetails2 = LocalFulfillment.DeliveryDetails.copy$default(deliveryDetails3, null, null, null, null, null, null, null, bool2, str52, null, null, null, 3711, null);
                            }
                            LocalFulfillment.SchedulingDetails schedulingDetails2 = (LocalFulfillment.SchedulingDetails) mutableState82.getValue();
                            if (schedulingDetails2 == null) {
                                LocalFulfillment localFulfillment32 = realOrderBuilder2.getCartResponse().fulfillment;
                                schedulingDetails = localFulfillment32 != null ? localFulfillment32.scheduling_details : null;
                            } else {
                                schedulingDetails = schedulingDetails2;
                            }
                            return LocalFulfillment.copy$default(localFulfillment3, null, null, deliveryDetails2, schedulingDetails, null, null, null, null, 975);
                    }
                }
            });
            gapComposer.updateRememberedValue(rememberedValue13);
        }
        State state8 = (State) rememberedValue13;
        boolean changed5 = gapComposer.changed(getTipAmount()) | gapComposer.changed(getCartResponse());
        Object rememberedValue14 = gapComposer.rememberedValue();
        if (changed5 || rememberedValue14 == obj3) {
            rememberedValue14 = Updater.derivedStateOf(new n$$ExternalSyntheticLambda1(12, this, state6, state7));
            gapComposer.updateRememberedValue(rememberedValue14);
        }
        State state9 = (State) rememberedValue14;
        Integer valueOf = Integer.valueOf(this.createOrderTrigger$delegate.getIntValue());
        boolean changedInstance3 = gapComposer.changedInstance(this) | gapComposer.changed(state7) | gapComposer.changed(state6) | gapComposer.changed(state9) | gapComposer.changed(state8) | gapComposer.changed(rememberUpdatedState);
        Object rememberedValue15 = gapComposer.rememberedValue();
        if (changedInstance3 || rememberedValue15 == obj3) {
            state = state6;
            state2 = state7;
            state3 = state9;
            mutableState = rememberUpdatedState;
            mutableState2 = mutableState10;
            state4 = state8;
            coroutineScope = coroutineScope2;
            arrayList2 = arrayList;
            num = valueOf;
            mutableState3 = mutableState9;
            z3 = false;
            rememberedValue15 = new EngineInterceptor$intercept$2(this, mutableState2, state2, state, state3, state4, mutableState, null, 5);
            gapComposer.updateRememberedValue(rememberedValue15);
        } else {
            coroutineScope = coroutineScope2;
            arrayList2 = arrayList;
            num = valueOf;
            mutableState3 = mutableState9;
            z3 = false;
            state = state6;
            state2 = state7;
            state3 = state9;
            mutableState = rememberUpdatedState;
            mutableState2 = mutableState10;
            state4 = state8;
        }
        Updater.LaunchedEffect(gapComposer, num, (Function2) rememberedValue15);
        Object rememberedValue16 = gapComposer.rememberedValue();
        if (rememberedValue16 == obj3) {
            realOrderBuilder = this;
            final MutableState mutableState13 = mutableState2;
            state5 = state4;
            final MutableState mutableState14 = mutableState;
            mutableState4 = mutableState7;
            mutableState5 = mutableState8;
            final MutableState mutableState15 = mutableState3;
            final CoroutineScope coroutineScope3 = coroutineScope;
            final State state10 = state3;
            localMoney = money;
            final State state11 = state;
            rememberedValue16 = new Function1() { // from class: app.cash.local.presenters.RealOrderBuilder$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    MutableState mutableState16;
                    MutableState mutableState17;
                    CoroutineScope coroutineScope4;
                    State state12;
                    RealOrderBuilder realOrderBuilder2;
                    MutableState mutableState18;
                    OrderBuilderEvent orderBuilderEvent;
                    RealOrderBuilder realOrderBuilder3;
                    CoroutineScope coroutineScope5;
                    CoroutineScope coroutineScope6;
                    RealOrderBuilder realOrderBuilder4 = RealOrderBuilder.this;
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState4 = realOrderBuilder4.appliedGiftCardCodes$delegate;
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState5 = realOrderBuilder4.tipAmount$delegate;
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState6 = realOrderBuilder4.redeemLocalCashBalance$delegate;
                    CartBuilder cartBuilder = realOrderBuilder4.cartBuilder;
                    OrderBuilderEvent orderBuilderEvent2 = (OrderBuilderEvent) obj4;
                    orderBuilderEvent2.getClass();
                    boolean z4 = orderBuilderEvent2 instanceof OrderBuilderEvent.ContinueToTip;
                    CoroutineScope coroutineScope7 = coroutineScope3;
                    State state13 = state2;
                    MutableState mutableState19 = mutableState11;
                    MutableState mutableState20 = mutableState4;
                    MutableState mutableState21 = mutableState5;
                    MutableState mutableState22 = mutableState15;
                    State state14 = state5;
                    boolean z5 = true;
                    if (z4) {
                        mutableState16 = mutableState21;
                        mutableState17 = mutableState19;
                        coroutineScope4 = coroutineScope7;
                        state12 = state14;
                        realOrderBuilder2 = realOrderBuilder4;
                        mutableState18 = mutableState20;
                        orderBuilderEvent = orderBuilderEvent2;
                        Navigator navigator = realOrderBuilder2.navigator;
                        BrandSpot brandSpot = realOrderBuilder2.brandSpot;
                        AttributionKey attributionKey = realOrderBuilder2.attributionKey;
                        LocalFulfillment localFulfillment3 = realOrderBuilder2.getCartResponse().fulfillment;
                        Fulfillment fulfillment = localFulfillment3 != null ? FulfillmentKt.toFulfillment(localFulfillment3) : null;
                        LocalTippingConfiguration localTippingConfiguration = realOrderBuilder2.getCartResponse().tipping_configuration;
                        boolean z6 = !(localTippingConfiguration != null ? Intrinsics.areEqual(localTippingConfiguration.enabled, Boolean.FALSE) : false);
                        LocalTippingConfiguration localTippingConfiguration2 = realOrderBuilder2.getCartResponse().tipping_configuration;
                        String str6 = localTippingConfiguration2 != null ? localTippingConfiguration2.title : null;
                        LocalTippingConfiguration localTippingConfiguration3 = realOrderBuilder2.getCartResponse().tipping_configuration;
                        List list2 = localTippingConfiguration3 != null ? localTippingConfiguration3.suggestions : null;
                        if (list2 == null) {
                            list2 = EmptyList.INSTANCE;
                        }
                        List list3 = list2;
                        LocalTippingConfiguration localTippingConfiguration4 = realOrderBuilder2.getCartResponse().tipping_configuration;
                        String str7 = localTippingConfiguration4 != null ? localTippingConfiguration4.subtitle : null;
                        LocalCashEarningsConfiguration localCashEarningsConfiguration = realOrderBuilder2.getCartResponse().local_cash_earnings_configuration;
                        String str8 = localCashEarningsConfiguration != null ? localCashEarningsConfiguration.fine_print_markdown : null;
                        LocalFulfillment localFulfillment4 = realOrderBuilder2.getCartResponse().fulfillment;
                        navigator.goTo(new LocalBrandLocationCheckoutScreen(brandSpot, attributionKey, false, fulfillment, (OrderWorkflow) null, z6, str6, list3, str7, str8, (localFulfillment4 != null ? localFulfillment4.type : null) == LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_IN_STORE ? LocalBrandLocationCheckoutScreen.ReviewMode.IN_STORE_OPEN_TAB : LocalBrandLocationCheckoutScreen.ReviewMode.STANDARD, realOrderBuilder2.syncTokens, 16));
                    } else {
                        if (orderBuilderEvent2 instanceof OrderBuilderEvent.UpdatePaymentMethod) {
                            String m1211getSelectedPaymentMethodTokenyJPV6_02 = realOrderBuilder4.m1211getSelectedPaymentMethodTokenyJPV6_0();
                            String str9 = ((OrderBuilderEvent.UpdatePaymentMethod) orderBuilderEvent2).token;
                            if (m1211getSelectedPaymentMethodTokenyJPV6_02 != null ? m1211getSelectedPaymentMethodTokenyJPV6_02.equals(str9) : false) {
                                return Unit.INSTANCE;
                            }
                            realOrderBuilder4.selectedPaymentMethodToken$delegate.setValue(str9 != null ? new PaymentMethodToken(str9) : null);
                        } else if (orderBuilderEvent2 instanceof OrderBuilderEvent.UpdateRedeemLocalCashBalance) {
                            boolean redeemLocalCashBalance = realOrderBuilder4.getRedeemLocalCashBalance();
                            boolean z7 = ((OrderBuilderEvent.UpdateRedeemLocalCashBalance) orderBuilderEvent2).redeem;
                            if (redeemLocalCashBalance == z7) {
                                return Unit.INSTANCE;
                            }
                            realOrderBuilder4.analytics.track(new LocalClientCheckoutFlowToggleLocalCash(((Cart) state13.getValue()).token, Boolean.valueOf(z7)), null);
                            parcelableSnapshotMutableState6.setValue(Boolean.valueOf(z7));
                        } else if (orderBuilderEvent2 instanceof OrderBuilderEvent.UpdateBuyerInfo) {
                            realOrderBuilder4.buyerInfo$delegate.setValue(((OrderBuilderEvent.UpdateBuyerInfo) orderBuilderEvent2).buyerInfo);
                        } else if (orderBuilderEvent2 instanceof OrderBuilderEvent.UpdateDropoffNotes) {
                            realOrderBuilder4.dropoffNotes$delegate.setValue(((OrderBuilderEvent.UpdateDropoffNotes) orderBuilderEvent2).dropoffNotes);
                        } else if (orderBuilderEvent2 instanceof OrderBuilderEvent.UpdateOrderNotes) {
                            realOrderBuilder4.orderNotes$delegate.setValue(((OrderBuilderEvent.UpdateOrderNotes) orderBuilderEvent2).notes);
                        } else if (orderBuilderEvent2 instanceof OrderBuilderEvent.UpdateCurbsideDetails) {
                            realOrderBuilder4.curbsidePickupDetails$delegate.setValue(((OrderBuilderEvent.UpdateCurbsideDetails) orderBuilderEvent2).details);
                        } else if (orderBuilderEvent2 instanceof OrderBuilderEvent.UpdateNoContactDelivery) {
                            realOrderBuilder4.noContactDelivery$delegate.setValue(Boolean.valueOf(((OrderBuilderEvent.UpdateNoContactDelivery) orderBuilderEvent2).noContactDelivery));
                        } else if (orderBuilderEvent2 instanceof OrderBuilderEvent.SelectRewardToken) {
                            String str10 = ((OrderBuilderEvent.SelectRewardToken) orderBuilderEvent2).token;
                            mutableState19.setValue(str10 != null ? new RewardToken(str10) : null);
                        } else if (orderBuilderEvent2 instanceof OrderBuilderEvent.UpdateTipAmount) {
                            LocalMoney tipAmount = realOrderBuilder4.getTipAmount();
                            LocalMoney localMoney3 = ((OrderBuilderEvent.UpdateTipAmount) orderBuilderEvent2).tipAmount;
                            if (Intrinsics.areEqual(tipAmount, localMoney3)) {
                                return Unit.INSTANCE;
                            }
                            parcelableSnapshotMutableState5.setValue(localMoney3);
                        } else if (orderBuilderEvent2 instanceof OrderBuilderEvent.UpdateGiftCards) {
                            parcelableSnapshotMutableState4.setValue(((OrderBuilderEvent.UpdateGiftCards) orderBuilderEvent2).codes);
                        } else if (orderBuilderEvent2 instanceof OrderBuilderEvent.UpdateFulfillmentScheduling) {
                            mutableState12.setValue(((OrderBuilderEvent.UpdateFulfillmentScheduling) orderBuilderEvent2).schedulingDetails);
                        } else if (orderBuilderEvent2 instanceof OrderBuilderEvent.ClearGiftCardError) {
                            mutableState20.setValue(null);
                        } else if (orderBuilderEvent2 instanceof OrderBuilderEvent.AddDiscountCode) {
                            DiscountCode.Entered entered = ((OrderBuilderEvent.AddDiscountCode) orderBuilderEvent2).discountCode;
                            RealCartBuilder realCartBuilder = (RealCartBuilder) cartBuilder;
                            realCartBuilder.getClass();
                            realCartBuilder.clearServerDerivedState();
                            realCartBuilder.discountCodes.add(entered);
                        } else {
                            int i4 = 16;
                            if (orderBuilderEvent2 instanceof OrderBuilderEvent.RemoveDiscountCode) {
                                DiscountCode.Entered entered2 = ((OrderBuilderEvent.RemoveDiscountCode) orderBuilderEvent2).discountCode;
                                RealCartBuilder realCartBuilder2 = (RealCartBuilder) cartBuilder;
                                realCartBuilder2.getClass();
                                realCartBuilder2.clearServerDerivedState();
                                CollectionsKt__MutableCollectionsKt.removeAll(realCartBuilder2.discountCodes, new CachedPageEventFlow$$ExternalSyntheticLambda0(entered2, i4));
                            } else if (orderBuilderEvent2 instanceof OrderBuilderEvent.PrepareForPayAtEnd) {
                                LocalMoney tipAmount2 = realOrderBuilder4.getTipAmount();
                                if ((tipAmount2 == null || tipAmount2.amount == 0) && !realOrderBuilder4.getRedeemLocalCashBalance() && realOrderBuilder4.getAppliedGiftCardCodes().isEmpty() && realOrderBuilder4.getCartResponse().gift_cards.isEmpty() && ((RealCartBuilder) cartBuilder).discountCodes.isEmpty()) {
                                    z5 = false;
                                }
                                parcelableSnapshotMutableState5.setValue(null);
                                parcelableSnapshotMutableState6.setValue(Boolean.FALSE);
                                parcelableSnapshotMutableState4.setValue(EmptyList.INSTANCE);
                                mutableState20.setValue(null);
                                mutableState21.setValue(null);
                                RealCartBuilder realCartBuilder3 = (RealCartBuilder) cartBuilder;
                                for (DiscountCode discountCode : CollectionsKt.toList(realCartBuilder3.discountCodes)) {
                                    discountCode.getClass();
                                    realCartBuilder3.clearServerDerivedState();
                                    CollectionsKt__MutableCollectionsKt.removeAll(realCartBuilder3.discountCodes, new CachedPageEventFlow$$ExternalSyntheticLambda0(discountCode, 16));
                                }
                                if (z5) {
                                    RealOrderBuilder$models$onEvent$1$1$2 realOrderBuilder$models$onEvent$1$1$2 = new RealOrderBuilder$models$onEvent$1$1$2(realOrderBuilder4, mutableState22, state14, mutableState19, state13, mutableState20, mutableState21, null, 0);
                                    mutableState18 = mutableState20;
                                    mutableState16 = mutableState21;
                                    state12 = state14;
                                    JobKt.launch$default(coroutineScope7, null, null, realOrderBuilder$models$onEvent$1$1$2, 3);
                                    realOrderBuilder2 = realOrderBuilder4;
                                    orderBuilderEvent = orderBuilderEvent2;
                                    mutableState17 = mutableState19;
                                    coroutineScope4 = coroutineScope7;
                                } else {
                                    mutableState18 = mutableState20;
                                    mutableState16 = mutableState21;
                                    mutableState17 = mutableState19;
                                    state12 = state14;
                                    coroutineScope4 = coroutineScope7;
                                    realOrderBuilder2 = realOrderBuilder4;
                                    orderBuilderEvent = orderBuilderEvent2;
                                }
                            } else {
                                mutableState16 = mutableState21;
                                state12 = state14;
                                mutableState18 = mutableState20;
                                boolean z8 = orderBuilderEvent2 instanceof OrderBuilderEvent.CreateOrder;
                                MutableState mutableState23 = mutableState13;
                                MutableState mutableState24 = mutableState14;
                                State state15 = state11;
                                State state16 = state10;
                                if (!z8) {
                                    realOrderBuilder3 = realOrderBuilder4;
                                    if (!(orderBuilderEvent2 instanceof OrderBuilderEvent.CreateOrderWithWorkflow)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    if (((Boolean) mutableState23.getValue()).booleanValue()) {
                                        return Unit.INSTANCE;
                                    }
                                    OrderBuilderEvent.CreateOrderWithWorkflow createOrderWithWorkflow = (OrderBuilderEvent.CreateOrderWithWorkflow) orderBuilderEvent2;
                                    boolean z9 = createOrderWithWorkflow.includePaymentData;
                                    if (z9) {
                                        coroutineScope5 = coroutineScope7;
                                    } else {
                                        OrderWorkflow orderWorkflow = createOrderWithWorkflow.orderWorkflow;
                                        coroutineScope5 = coroutineScope7;
                                        if (orderWorkflow != OrderWorkflow.ORDER_WORKFLOW_FINALIZE_DELAYED_CAPTURE) {
                                            Path$$ExternalSyntheticBUOutline0.m$3(orderWorkflow, "Cannot create order without payment data for workflow ");
                                            return null;
                                        }
                                    }
                                    RealOrderBuilder.models$trackPlaceOrder(realOrderBuilder3, state13, mutableState24);
                                    if (z9) {
                                        coroutineScope6 = coroutineScope5;
                                        RealOrderBuilder.models$processPaymentAndCreateOrder(realOrderBuilder3, coroutineScope6, mutableState24, mutableState23, state15, state13, state16, state12, createOrderWithWorkflow.orderWorkflow);
                                    } else {
                                        orderBuilderEvent = orderBuilderEvent2;
                                        mutableState17 = mutableState19;
                                        coroutineScope4 = coroutineScope5;
                                        ZiplineLoader$load$2 ziplineLoader$load$2 = new ZiplineLoader$load$2(orderBuilderEvent, realOrderBuilder3, mutableState23, state13, state15, state16, state12, mutableState24, null, 4);
                                        realOrderBuilder2 = realOrderBuilder3;
                                        state13 = state13;
                                        JobKt.launch$default(coroutineScope4, null, null, ziplineLoader$load$2, 3);
                                    }
                                } else {
                                    if (((Boolean) mutableState23.getValue()).booleanValue()) {
                                        return Unit.INSTANCE;
                                    }
                                    RealOrderBuilder.models$trackPlaceOrder(realOrderBuilder4, state13, mutableState24);
                                    realOrderBuilder3 = realOrderBuilder4;
                                    coroutineScope6 = coroutineScope7;
                                    RealOrderBuilder.models$processPaymentAndCreateOrder(realOrderBuilder3, coroutineScope6, mutableState24, mutableState23, state15, state13, state16, state12, null);
                                }
                                realOrderBuilder2 = realOrderBuilder3;
                                mutableState17 = mutableState19;
                                coroutineScope4 = coroutineScope6;
                                orderBuilderEvent = orderBuilderEvent2;
                            }
                        }
                        mutableState16 = mutableState21;
                        mutableState17 = mutableState19;
                        coroutineScope4 = coroutineScope7;
                        state12 = state14;
                        realOrderBuilder2 = realOrderBuilder4;
                        mutableState18 = mutableState20;
                        orderBuilderEvent = orderBuilderEvent2;
                    }
                    if (orderBuilderEvent instanceof OrderBuilderEvent.RequireServerUpdate) {
                        JobKt.launch$default(coroutineScope4, null, null, new RealOrderBuilder$models$onEvent$1$1$2(realOrderBuilder2, mutableState22, state12, mutableState17, state13, mutableState18, mutableState16, null, 1), 3);
                    }
                    return Unit.INSTANCE;
                }
            };
            mutableState2 = mutableState13;
            state = state11;
            state3 = state10;
            gapComposer.updateRememberedValue(rememberedValue16);
        } else {
            realOrderBuilder = this;
            state5 = state4;
            mutableState4 = mutableState7;
            mutableState5 = mutableState8;
            localMoney = money;
        }
        Function1 function1 = (Function1) rememberedValue16;
        Cart cart = (Cart) state2.getValue();
        ComputedOrderSummary computedOrderSummary = (ComputedOrderSummary) state.getValue();
        List list2 = realOrderBuilder.getCartResponse().available_order_workflows;
        boolean redeemLocalCashBalance = realOrderBuilder.getRedeemLocalCashBalance();
        OrderBuilderModel.BuyerInfo buyerInfo = (OrderBuilderModel.BuyerInfo) realOrderBuilder.buyerInfo$delegate.getValue();
        LocalFulfillment localFulfillment3 = (LocalFulfillment) state5.getValue();
        Fulfillment fulfillment = localFulfillment3 != null ? FulfillmentKt.toFulfillment(localFulfillment3) : str2;
        CreateCartResponse.CartLoyaltySummary cartLoyaltySummary2 = realOrderBuilder.getCartResponse().cart_loyalty_summary;
        LocalMoney localMoney3 = (LocalMoney) state3.getValue();
        LocalMoney tipAmount = realOrderBuilder.getTipAmount();
        String m1211getSelectedPaymentMethodTokenyJPV6_02 = realOrderBuilder.m1211getSelectedPaymentMethodTokenyJPV6_0();
        if (m1211getSelectedPaymentMethodTokenyJPV6_02 == null) {
            PreferredPaymentMethod preferredPaymentMethod = realOrderBuilder.getCartResponse().preferred_payment_method;
            if (preferredPaymentMethod != null) {
                String str6 = preferredPaymentMethod.instrument_token;
                if (str6 == null) {
                    LocalPaymentOption localPaymentOption2 = preferredPaymentMethod.preferred_payment_type;
                    localPaymentOption2.getClass();
                    str6 = localPaymentOption2.name();
                    str6.getClass();
                }
                Iterator it5 = arrayList2.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        obj2 = it5.next();
                        if (Intrinsics.areEqual(((PaymentMethod) obj2).mo1281getToken3m_AGhc(), str6)) {
                        }
                    } else {
                        obj2 = str2;
                    }
                }
                PaymentMethod paymentMethod = (PaymentMethod) obj2;
                String mo1281getToken3m_AGhc2 = paymentMethod != null ? paymentMethod.mo1281getToken3m_AGhc() : str2;
                PaymentMethodToken paymentMethodToken = mo1281getToken3m_AGhc2 != null ? new PaymentMethodToken(mo1281getToken3m_AGhc2) : str2;
                if (paymentMethodToken != 0) {
                    m1211getSelectedPaymentMethodTokenyJPV6_02 = paymentMethodToken.value;
                    if (m1211getSelectedPaymentMethodTokenyJPV6_02 == null) {
                        m1211getSelectedPaymentMethodTokenyJPV6_02 = ((PaymentMethod) CollectionsKt.first((List) arrayList2)).mo1281getToken3m_AGhc();
                    }
                }
            }
            m1211getSelectedPaymentMethodTokenyJPV6_02 = str2;
            if (m1211getSelectedPaymentMethodTokenyJPV6_02 == null) {
            }
        }
        OrderBuilderModel.PaymentMethodConfig paymentMethodConfig = new OrderBuilderModel.PaymentMethodConfig(m1211getSelectedPaymentMethodTokenyJPV6_02, arrayList2);
        boolean booleanValue = ((Boolean) mutableState3.getValue()).booleanValue();
        List list3 = realOrderBuilder.getCartResponse().gift_cards;
        if (list3 == null) {
            list3 = EmptyList.INSTANCE;
        }
        List list4 = list3;
        List appliedGiftCardCodes = realOrderBuilder.getAppliedGiftCardCodes();
        LocalErrorResponse localErrorResponse = (LocalErrorResponse) mutableState4.getValue();
        List list5 = CollectionsKt.toList(((RealCartBuilder) realOrderBuilder.cartBuilder).discountCodes);
        LocalErrorResponse.Error error = (LocalErrorResponse.Error) mutableState5.getValue();
        CurbsidePickupDetails curbsidePickupDetails = realOrderBuilder.getCurbsidePickupDetails();
        LocalCheckoutLocationSummary localCheckoutLocationSummary = realOrderBuilder.getCartResponse().local_checkout_location_summary;
        UiCallbackModel uiCallbackModel = new UiCallbackModel(function1, new OrderBuilderModel(cart, computedOrderSummary, list2, redeemLocalCashBalance, buyerInfo, localMoney, orderType2, fulfillment, cartLoyaltySummary2, paymentMethodConfig, localMoney3, tipAmount, booleanValue, list4, appliedGiftCardCodes, localErrorResponse, list5, error, curbsidePickupDetails, localCheckoutLocationSummary != null ? localCheckoutLocationSummary.curbside_pickup_settings : str2, ((Boolean) mutableState2.getValue()).booleanValue()));
        gapComposer.end(z3);
        return uiCallbackModel;
    }

    public final OrderBuilder$Payload payload() {
        return new OrderBuilder$Payload((OrderBuilderModel.BuyerInfo) this.buyerInfo$delegate.getValue(), getRedeemLocalCashBalance(), ((Boolean) this.noContactDelivery$delegate.getValue()).booleanValue(), (String) this.dropoffNotes$delegate.getValue(), (String) this.orderNotes$delegate.getValue(), getAppliedGiftCardCodes(), getCurbsidePickupDetails());
    }
}
