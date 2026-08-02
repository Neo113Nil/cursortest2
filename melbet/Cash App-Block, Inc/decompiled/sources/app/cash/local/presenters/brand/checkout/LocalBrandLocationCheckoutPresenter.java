package app.cash.local.presenters.brand.checkout;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.lifecycle.BlockRunner$cancel$1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import androidx.work.Data$$ExternalSyntheticLambda0;
import androidx.work.impl.WorkLauncherImpl;
import androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda1;
import app.cash.arcade.viewmodels.AvatarViewModel$$ExternalSyntheticLambda0;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.local.backend.real.RealLocalBrandRepository;
import app.cash.local.navigation.LocalInstalledStore;
import app.cash.local.navigation.LocalInstalledStoreKt;
import app.cash.local.navigation.launcher.RealLocalLauncher;
import app.cash.local.presenters.RealOrderBuilderStore;
import app.cash.local.presenters.internal.DateTimesKt;
import app.cash.local.presenters.internal.FulfillmentTimeUtils;
import app.cash.local.presenters.internal.LocalsKt;
import app.cash.local.presenters.internal.LocationsKt;
import app.cash.local.presenters.internal.LoyaltyKt;
import app.cash.local.primitives.Brand;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.Cart;
import app.cash.local.primitives.ComputedOrderSummary;
import app.cash.local.primitives.ComputedOrderSummaryKt;
import app.cash.local.primitives.DiscountCode;
import app.cash.local.primitives.Fulfillment;
import app.cash.local.primitives.FulfillmentConfiguration;
import app.cash.local.primitives.FulfillmentConfigurationKt;
import app.cash.local.primitives.FulfillmentConfigurations;
import app.cash.local.primitives.FulfillmentConfigurationsKt;
import app.cash.local.primitives.GpsCoordinates;
import app.cash.local.primitives.Line;
import app.cash.local.primitives.LocalBrandBanner;
import app.cash.local.primitives.LocalCurrencyCode;
import app.cash.local.primitives.LocalMoneyKt;
import app.cash.local.primitives.Location;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.MarketingMessageOfferDetails;
import app.cash.local.primitives.RewardToken;
import app.cash.local.primitives.SummaryLine;
import app.cash.local.primitives.math.LocalMoneysKt;
import app.cash.local.screens.app.LocalBrandLocationCheckoutScreen;
import app.cash.local.screens.app.LocalBrandProfileScreen;
import app.cash.local.screens.app.VehicleDescription;
import app.cash.local.store.real.RealLocalInstalledStore;
import app.cash.local.store.real.RealLocalInstalledStore$hideBrands$$inlined$map$1;
import app.cash.local.store.real.RealLocalInstalledStore$selectFulfillmentConfigurationNmdeRlM$$inlined$map$1;
import app.cash.local.viewmodels.AppliedCoupon;
import app.cash.local.viewmodels.AppliedGiftCard;
import app.cash.local.viewmodels.CouponSection;
import app.cash.local.viewmodels.CurbsidePickupDetails;
import app.cash.local.viewmodels.GiftCardInputState;
import app.cash.local.viewmodels.KeyValue;
import app.cash.local.viewmodels.LocalBottomModalViewModel;
import app.cash.local.viewmodels.LocalBrandBannerModel;
import app.cash.local.viewmodels.LocalBrandLocationCartViewModel;
import app.cash.local.viewmodels.LocalBrandLocationCheckoutViewModel;
import app.cash.local.viewmodels.LocalCheckoutGiftCardSectionViewModel;
import app.cash.local.viewmodels.LocalCheckoutOrderSummaryViewModel;
import app.cash.local.viewmodels.LocalCheckoutPaymentSectionViewModel;
import app.cash.local.viewmodels.LocalCheckoutSpecialInstructionsViewModel;
import app.cash.local.viewmodels.LocalCheckoutTipSectionViewModel;
import app.cash.local.viewmodels.OrderBuilderModel;
import app.cash.local.viewmodels.TipOption;
import app.cash.paraphrase.FormattedResource;
import bo.app.l2$$ExternalSyntheticLambda7;
import coil3.gif.AnimatedImageDecoder$wrapDrawable$2;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsr;
import com.nimbusds.jose.JWECryptoParts;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlag$Option;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$CashAppLocalGiftCardRedemptionMobile;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$EnableLocalCurbsidePickupOption;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.paymentpad.views.MainPaymentPadViewKt$MainPaymentPadView$1$2$10$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.support.chat.presenters.ChatPresenter$models$$inlined$CollectEffect$1;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.work.service.real.CashAppServiceModule;
import com.squareup.protos.cash.local.client.app.v1.cashbalance.LocalCashBalance;
import com.squareup.protos.cash.local.client.v1.CreateCartResponse;
import com.squareup.protos.cash.local.client.v1.CurbsidePickupSettings;
import com.squareup.protos.cash.local.client.v1.GiftCard;
import com.squareup.protos.cash.local.client.v1.LocalAddress;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.local.client.v1.LocalCashMarketingContent;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalFulfillmentType;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalLoyaltyAccount;
import com.squareup.protos.cash.local.client.v1.LocalLoyaltyProgram;
import com.squareup.protos.cash.local.client.v1.LocalLoyaltyReward;
import com.squareup.protos.cash.local.client.v1.LocalMoney;
import com.squareup.protos.cash.local.client.v1.LocalText;
import com.squareup.protos.cash.local.client.v1.LocalTippingConfiguration;
import com.squareup.util.cash.Countries;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class LocalBrandLocationCheckoutPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final BrandSpot brandSpot;
    public final AndroidClock clock;
    public final FeatureFlagManager featureFlagManager;
    public final FulfillmentTimeUtils fulfillmentTimeUtils;
    public final RealLocalLauncher launcher;
    public final RealLocalBrandRepository localBrandRepository;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealOrderBuilderStore orderStore;
    public final LocalBrandLocationCheckoutScreen screen;
    public final SessionManager sessionManager;
    public final LocalInstalledStore store;
    public final AndroidStringManager stringManager;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LocalBrandLocationCheckoutScreen.ReviewMode.values().length];
            try {
                LocalBrandLocationCheckoutScreen.ReviewMode reviewMode = LocalBrandLocationCheckoutScreen.ReviewMode.STANDARD;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LocalFulfillmentType.values().length];
            try {
                iArr2[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_PICKUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_IN_STORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DINE_IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_SHIPPING.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_DELIVERY.ordinal()] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public LocalBrandLocationCheckoutPresenter(AndroidStringManager androidStringManager, RealLocalBrandRepository realLocalBrandRepository, RealOrderBuilderStore realOrderBuilderStore, AndroidClock androidClock, RealLocalLauncher realLocalLauncher, LocalInstalledStore localInstalledStore, FeatureFlagManager featureFlagManager, Analytics analytics, SessionManager sessionManager, FulfillmentTimeUtils fulfillmentTimeUtils, LocalBrandLocationCheckoutScreen localBrandLocationCheckoutScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        localBrandLocationCheckoutScreen.getClass();
        this.stringManager = androidStringManager;
        this.localBrandRepository = realLocalBrandRepository;
        this.orderStore = realOrderBuilderStore;
        this.clock = androidClock;
        this.launcher = realLocalLauncher;
        this.store = localInstalledStore;
        this.featureFlagManager = featureFlagManager;
        this.analytics = analytics;
        this.sessionManager = sessionManager;
        this.fulfillmentTimeUtils = fulfillmentTimeUtils;
        this.screen = localBrandLocationCheckoutScreen;
        this.navigator = screenNavigator;
        this.brandSpot = localBrandLocationCheckoutScreen.brandSpot;
    }

    public static ArrayList appliedGiftCards(List list, LocalCurrencyCode localCurrencyCode) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GiftCard giftCard = (GiftCard) it.next();
            String str = giftCard.id;
            String str2 = giftCard.last_4;
            AppliedGiftCard appliedGiftCard = null;
            if (str == null) {
                Timber.Forest.e(Recorder$$ExternalSyntheticOutline2.m("Gift card with null ID received from backend: last4=", str2), new Object[0]);
            } else {
                LocalMoney localMoney = giftCard.gift_card_amount;
                app.cash.local.primitives.LocalMoney money = localMoney != null ? LocalMoneyKt.toMoney(localMoney) : null;
                if (str2 == null) {
                    str2 = "";
                }
                if (money == null) {
                    money = new app.cash.local.primitives.LocalMoney(0L, localCurrencyCode);
                }
                appliedGiftCard = new AppliedGiftCard(str, str2, LocalsKt.prettyPrint$default(money, false, null, 7));
            }
            if (appliedGiftCard != null) {
                arrayList.add(appliedGiftCard);
            }
        }
        return arrayList;
    }

    public static final Location.LocationDetail models$lambda$29(State state) {
        return (Location.LocationDetail) state.getValue();
    }

    public final LocalText estimatedCompletion(FulfillmentConfigurations fulfillmentConfigurations, FulfillmentConfiguration fulfillmentConfiguration, boolean z) {
        FulfillmentConfiguration fulfillmentConfiguration2;
        LocalText estimatedCompletionTime;
        if (z) {
            if (fulfillmentConfigurations != null) {
                fulfillmentConfiguration2 = fulfillmentConfigurations.scheduled;
            }
            fulfillmentConfiguration2 = null;
        } else {
            if (fulfillmentConfigurations != null) {
                fulfillmentConfiguration2 = fulfillmentConfigurations.asap;
            }
            fulfillmentConfiguration2 = null;
        }
        FulfillmentTimeUtils fulfillmentTimeUtils = this.fulfillmentTimeUtils;
        if (fulfillmentConfiguration2 != null) {
            if (fulfillmentConfiguration2 instanceof FulfillmentConfiguration.Unspecified) {
                fulfillmentConfiguration2 = null;
            }
            if (fulfillmentConfiguration2 != null) {
                if (FulfillmentConfigurationKt.getType(fulfillmentConfiguration2) != FulfillmentConfigurationKt.getType(fulfillmentConfiguration)) {
                    fulfillmentConfiguration2 = null;
                }
                if (fulfillmentConfiguration2 != null && (estimatedCompletionTime = fulfillmentTimeUtils.getEstimatedCompletionTime(fulfillmentConfiguration2)) != null) {
                    return estimatedCompletionTime;
                }
            }
        }
        if (!z ? FulfillmentConfigurationKt.getSchedulingMode(fulfillmentConfiguration) == LocalFulfillment.SchedulingDetails.SchedulingMode.SCHEDULING_MODE_SCHEDULED : FulfillmentConfigurationKt.getSchedulingMode(fulfillmentConfiguration) != LocalFulfillment.SchedulingDetails.SchedulingMode.SCHEDULING_MODE_SCHEDULED) {
            fulfillmentConfiguration = null;
        }
        if (fulfillmentConfiguration != null) {
            return fulfillmentTimeUtils.getEstimatedCompletionTime(fulfillmentConfiguration);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LocalCheckoutGiftCardSectionViewModel giftCardSection(CheckoutGiftCardState checkoutGiftCardState, ArrayList arrayList, OrderBuilderModel orderBuilderModel, GapComposer gapComposer) {
        String str;
        GiftCardInputState giftCardInputState;
        String str2;
        LocalErrorResponse localErrorResponse;
        List list;
        Object obj;
        gapComposer.startReplaceGroup(871099875);
        LaunchDarklyFeatureFlags$CashAppLocalGiftCardRedemptionMobile launchDarklyFeatureFlags$CashAppLocalGiftCardRedemptionMobile = LaunchDarklyFeatureFlags$CashAppLocalGiftCardRedemptionMobile.INSTANCE;
        if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) Updater.collectAsState(Trace.valuesState(this.featureFlagManager, launchDarklyFeatureFlags$CashAppLocalGiftCardRedemptionMobile), (FeatureFlag$Option) launchDarklyFeatureFlags$CashAppLocalGiftCardRedemptionMobile.current, null, gapComposer, 0, 2).getValue()).enabled()) {
            if (((String) checkoutGiftCardState.error$delegate.getValue()) == null && (localErrorResponse = orderBuilderModel.giftCardError) != null && (list = localErrorResponse.errors) != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((LocalErrorResponse.Error) obj).f1308type == LocalErrorResponse.Error.Type.TYPE_VALIDATION_ERROR) {
                        break;
                    }
                }
                LocalErrorResponse.Error error = (LocalErrorResponse.Error) obj;
                if (error != null) {
                    str = error.message;
                    String code = checkoutGiftCardState.getCode();
                    boolean z = orderBuilderModel.updatingCart;
                    str2 = (String) checkoutGiftCardState.error$delegate.getValue();
                    if (str2 != null) {
                        str = str2;
                    }
                    giftCardInputState = new GiftCardInputState(code, z, str);
                }
            }
            str = null;
            String code2 = checkoutGiftCardState.getCode();
            boolean z2 = orderBuilderModel.updatingCart;
            str2 = (String) checkoutGiftCardState.error$delegate.getValue();
            if (str2 != null) {
            }
            giftCardInputState = new GiftCardInputState(code2, z2, str);
        } else {
            giftCardInputState = null;
        }
        if (giftCardInputState == null && arrayList.isEmpty()) {
            gapComposer.end(false);
            return null;
        }
        LocalCheckoutGiftCardSectionViewModel localCheckoutGiftCardSectionViewModel = new LocalCheckoutGiftCardSectionViewModel(giftCardInputState, arrayList, ((Boolean) checkoutGiftCardState.isExpanded$delegate.getValue()).booleanValue());
        gapComposer.end(false);
        return localCheckoutGiftCardSectionViewModel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0425, code lost:
    
        if (r12 > ((r7 == null || (r7 = r7.amount) == null) ? 0 : r7.amount)) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0427, code lost:
    
        r44 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x045f, code lost:
    
        if (r7 != null) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0988, code lost:
    
        if (r9 != null) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x042a, code lost:
    
        r44 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x0431, code lost:
    
        if (app.cash.local.primitives.math.LocalMoneysKt.compareTo(r3, r8) > 0) goto L155;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0942 A[LOOP:4: B:224:0x093c->B:226:0x0942, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0962  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0979  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x09fa  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0a8a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0aad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0ad3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0b36  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0b62 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0b83 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0ba6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0bc6 A[LOOP:5: B:268:0x0bc0->B:270:0x0bc6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0be7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0c08 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0c10  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0c20  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0c4b  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0cc1  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0cce  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0cf9  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0d32  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0d38  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0d40  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0d47  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0d54  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0d59  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0d7b  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0ddd  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0e0a  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0e1b  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0e51  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0e5d  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0e6a  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0e7f  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0e60  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0e5a  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0e25  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0e11  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0de1  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0d86  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0d65  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0d43  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0d35  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0d0d  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0ce9  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0cc4  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0c34  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0b3d  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x09fd  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x099e  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x09d4  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0965  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x03a0 A[LOOP:9: B:521:0x039a->B:523:0x03a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:528:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x03eb A[LOOP:11: B:536:0x03e5->B:538:0x03eb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0405  */
    /* JADX WARN: Type inference failed for: r15v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r45v2 */
    /* JADX WARN: Type inference failed for: r45v3, types: [app.cash.local.viewmodels.LocalCheckoutSpecialInstructionsViewModel] */
    /* JADX WARN: Type inference failed for: r45v4 */
    /* JADX WARN: Type inference failed for: r57v1 */
    /* JADX WARN: Type inference failed for: r57v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r57v3 */
    /* JADX WARN: Type inference failed for: r5v2, types: [app.cash.local.presenters.RealOrderBuilder] */
    /* JADX WARN: Type inference failed for: r72v0, types: [app.cash.broadway.presenter.molecule.MoleculePresenter, app.cash.local.presenters.brand.checkout.LocalBrandLocationCheckoutPresenter, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r8v46, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v65 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        String str;
        boolean z;
        ComputedOrderSummary.Row customerTipRow;
        app.cash.local.primitives.LocalMoney localMoney;
        boolean isPositive;
        boolean changed;
        MutableState mutableState;
        Object obj;
        List list;
        List list2;
        app.cash.local.primitives.LocalMoney localMoney2;
        boolean changedInstance;
        Object rememberedValue;
        CheckoutTipState checkoutTipState;
        Function1 function1;
        boolean changed2;
        Object rememberedValue2;
        CheckoutTipState checkoutTipState2;
        Object rememberedValue3;
        CheckoutGiftCardState checkoutGiftCardState;
        boolean changed3;
        Object rememberedValue4;
        Object rememberedValue5;
        CheckoutGiftCardState checkoutGiftCardState2;
        Cart cart;
        GapComposer gapComposer;
        boolean z2;
        ComputedOrderSummary computedOrderSummary;
        JWECryptoParts rememberCheckoutPaymentState;
        JWECryptoParts jWECryptoParts;
        MutableState mutableState2;
        Iterator it;
        Iterator it2;
        LocalBrandLocationCheckoutScreen localBrandLocationCheckoutScreen;
        Function1 function12;
        Iterator it3;
        app.cash.local.primitives.LocalMoney minus;
        boolean z3;
        app.cash.local.primitives.LocalMoney minus2;
        ComputedOrderSummary computedOrderSummary2;
        app.cash.local.primitives.LocalMoney localMoney3;
        int i2;
        ?? r15;
        ArrayList arrayList;
        MutableState mutableState3;
        Function1 function13;
        LocalBrandLocationCheckoutViewModel.CurbsidePickupSection curbsidePickupSection;
        boolean currentlyOpen;
        Object rememberedValue6;
        boolean changed4;
        Object rememberedValue7;
        CreateCartResponse.CartLoyaltySummary cartLoyaltySummary;
        State state;
        String str2;
        Cart cart2;
        MutableState mutableState4;
        Function1 function14;
        LocalBrandBannerModel localBrandBannerModel;
        Iterator it4;
        FulfillmentConfigurations fulfillmentConfigurations;
        Fulfillment fulfillment;
        FulfillmentConfiguration fulfillmentConfiguration;
        LocalBrandLocationCartViewModel.Fulfillment fulfillment2;
        FulfillmentConfiguration fulfillmentConfiguration2;
        LocalBrandLocationCheckoutScreen.ReviewMode reviewMode;
        LocalBrandLocationCartViewModel.Fulfillment pickup;
        ?? r8;
        String str3;
        LocalAddress localAddress;
        Object rememberedValue8;
        boolean changed5;
        Object rememberedValue9;
        boolean changed6;
        Object rememberedValue10;
        LocalBrandBannerModel localBrandBannerModel2;
        String str4;
        boolean changed7;
        Object obj2;
        boolean changed8;
        Object rememberedValue11;
        boolean changed9;
        Object rememberedValue12;
        boolean changed10;
        Object rememberedValue13;
        Iterator it5;
        boolean changed11;
        Object rememberedValue14;
        app.cash.local.primitives.LocalMoney currentTipAsMoney;
        app.cash.local.primitives.LocalMoney localMoney4;
        State state2;
        Pair pair;
        LocalBrandBannerModel localBrandBannerModel3;
        LocalBrandLocationCheckoutViewModel.ReviewMode reviewMode2;
        Continuation continuation;
        int i3;
        boolean z4;
        List list3;
        LocalFulfillmentType localFulfillmentType;
        AndroidStringManager androidStringManager;
        String str5;
        String str6;
        LocalBottomModalViewModel.Title title;
        String str7;
        LocalCashMarketingContent localCashMarketingContent;
        LocalCashMarketingContent.Template template;
        ComputedOrderSummary.Row grandTotalRow;
        LocalLoyaltyProgram localLoyaltyProgram;
        Object obj3;
        LocalImage localImage;
        String format2;
        String str8;
        LocalBrandBannerModel localBrandBannerModel4;
        String str9;
        app.cash.local.primitives.LocalMoney localMoney5;
        ComputedOrderSummary computedOrderSummary3;
        ComputedOrderSummary.DisplayRow displayRow;
        Object obj4;
        app.cash.local.primitives.LocalMoney localMoney6;
        ComputedOrderSummary.Row totalWithoutDiscountsRow;
        ComputedOrderSummary.Row grandTotalRow2;
        VehicleDescription vehicleDescription;
        flow.getClass();
        ?? r82 = (GapComposer) composer;
        r82.startReplaceGroup(159855048);
        Object rememberedValue15 = r82.rememberedValue();
        Object obj5 = Composer.Companion.Empty;
        if (rememberedValue15 == obj5) {
            rememberedValue15 = StateFlowKt.mapState(Trace.valuesState(this.featureFlagManager, LaunchDarklyFeatureFlags$EnableLocalCurbsidePickupOption.INSTANCE), new Data$$ExternalSyntheticLambda0(21));
            r82.updateRememberedValue(rememberedValue15);
        }
        Continuation continuation2 = null;
        MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue15, null, r82, 1);
        LocalBrandLocationCheckoutScreen localBrandLocationCheckoutScreen2 = this.screen;
        app.cash.local.primitives.LocalErrorResponse localErrorResponse = localBrandLocationCheckoutScreen2.errors;
        Fulfillment fulfillment3 = localBrandLocationCheckoutScreen2.fulfillment;
        LocalBrandLocationCheckoutScreen.ReviewMode reviewMode3 = localBrandLocationCheckoutScreen2.reviewMode;
        List list4 = localBrandLocationCheckoutScreen2.tippingSuggestions;
        int i4 = 10;
        if (localErrorResponse != null) {
            r82.startReplaceGroup(-1106477359);
            Updater.LaunchedEffect((Composer) r82, localErrorResponse, new AnimatedImageDecoder$wrapDrawable$2(localErrorResponse, continuation2, (MoleculePresenter) this, i4));
            r82.end(false);
        } else {
            r82.startReplaceGroup(-1106436997);
            r82.end(false);
        }
        RealOrderBuilderStore realOrderBuilderStore = this.orderStore;
        r82.startMovableGroup(-998104120, realOrderBuilderStore.active);
        ?? r5 = realOrderBuilderStore.active;
        if (r5 == 0) {
            r82.startReplaceGroup(-876369815);
            this.navigator.goTo(new LocalBrandProfileScreen(localBrandLocationCheckoutScreen2.brandSpot, localBrandLocationCheckoutScreen2.attributionKey, (MarketingMessageOfferDetails) null, (String) null, (String) null, localBrandLocationCheckoutScreen2.syncTokens, (String) null, EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE));
            LocalBrandLocationCheckoutViewModel localBrandLocationCheckoutViewModel = LocalBrandLocationCheckoutPresenterKt.EMPTY_MODEL;
            Boxes$$ExternalSyntheticOutline1.m((GapComposer) r82, false, false, false);
            return localBrandLocationCheckoutViewModel;
        }
        r82.startReplaceGroup(-875823595);
        UiCallbackModel models = r5.models(r82);
        r82.end(false);
        r82.end(false);
        OrderBuilderModel orderBuilderModel = (OrderBuilderModel) models.model;
        Function1 function15 = models.onEvent;
        CreateCartResponse.CartLoyaltySummary cartLoyaltySummary2 = orderBuilderModel.loyaltySummary;
        List list5 = orderBuilderModel.giftCards;
        CurbsidePickupDetails curbsidePickupDetails = orderBuilderModel.curbsidePickupDetails;
        app.cash.local.primitives.LocalMoney localMoney7 = orderBuilderModel.tipAmount;
        OrderBuilderModel.OrderType orderType = orderBuilderModel.orderType;
        if (cartLoyaltySummary2 == null || (str = cartLoyaltySummary2.selected_reward_token) == null) {
            str = null;
        }
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(str != null ? new RewardToken(str) : null, r82);
        Object rememberedValue16 = r82.rememberedValue();
        BrandSpot brandSpot = this.brandSpot;
        if (rememberedValue16 == obj5) {
            rememberedValue16 = this.localBrandRepository.brand(brandSpot);
            r82.updateRememberedValue(rememberedValue16);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue16, null, null, r82, 48, 2);
        Object rememberedValue17 = r82.rememberedValue();
        LocalInstalledStore localInstalledStore = this.store;
        if (rememberedValue17 == obj5) {
            RealLocalInstalledStore$hideBrands$$inlined$map$1 realLocalInstalledStore$hideBrands$$inlined$map$1 = new RealLocalInstalledStore$hideBrands$$inlined$map$1(LocalInstalledStoreKt.localCashBalanceOrNothing(localInstalledStore), 7);
            r82.updateRememberedValue(realLocalInstalledStore$hideBrands$$inlined$map$1);
            rememberedValue17 = realLocalInstalledStore$hideBrands$$inlined$map$1;
        }
        MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue17, null, null, r82, 48, 2);
        Object rememberedValue18 = r82.rememberedValue();
        if (rememberedValue18 == obj5) {
            CardModelView$cardHeat$$inlined$map$1 cardModelView$cardHeat$$inlined$map$1 = new CardModelView$cardHeat$$inlined$map$1(((RealLocalInstalledStore) localInstalledStore).profileManager.publicProfile(), 3);
            r82.updateRememberedValue(cardModelView$cardHeat$$inlined$map$1);
            rememberedValue18 = cardModelView$cardHeat$$inlined$map$1;
        }
        MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue18, null, null, r82, 48, 2);
        Object rememberedValue19 = r82.rememberedValue();
        if (rememberedValue19 == obj5) {
            String str10 = brandSpot.brandToken;
            RealLocalInstalledStore realLocalInstalledStore = (RealLocalInstalledStore) localInstalledStore;
            str10.getClass();
            rememberedValue19 = new RealLocalInstalledStore$selectFulfillmentConfigurationNmdeRlM$$inlined$map$1(DBUtil.mapToOneOrNull(DBUtil.toFlow(realLocalInstalledStore.fulfillmentConfigurationQueries.select(str10)), realLocalInstalledStore.ioDispatcher), realLocalInstalledStore, 1);
            r82.updateRememberedValue(rememberedValue19);
        }
        MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue19, null, null, r82, 48, 2);
        OrderBuilderModel.BuyerInfo buyerInfo = orderBuilderModel.buyerInfo;
        boolean z5 = buyerInfo instanceof OrderBuilderModel.BuyerInfo.UiReady;
        AndroidStringManager androidStringManager2 = this.stringManager;
        OrderBuilderModel.BuyerInfo.UiReady validateForCheckout = z5 ? (OrderBuilderModel.BuyerInfo.UiReady) buyerInfo : CashAppServiceModule.validateForCheckout(buyerInfo, androidStringManager2, false);
        MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(curbsidePickupDetails, r82);
        Object rememberedValue20 = r82.rememberedValue();
        if (rememberedValue20 == obj5) {
            String str11 = curbsidePickupDetails.vehicleColorLabel;
            String str12 = curbsidePickupDetails.vehicleTypeLabel;
            if (str11 == null || str12 == null) {
                vehicleDescription = null;
            } else {
                String str13 = curbsidePickupDetails.vehicleNote;
                if (str13 == null) {
                    str13 = "";
                }
                vehicleDescription = new VehicleDescription(str11, str12, str13);
            }
            rememberedValue20 = Updater.mutableStateOf$default(vehicleDescription);
            r82.updateRememberedValue(rememberedValue20);
        }
        MutableState mutableState5 = (MutableState) rememberedValue20;
        ComputedOrderSummary computedOrderSummary4 = orderBuilderModel.computedOrderSummary;
        if (localMoney7 != null) {
            isPositive = LocalMoneysKt.isPositive(localMoney7);
        } else {
            if (computedOrderSummary4 == null || (customerTipRow = ComputedOrderSummaryKt.getCustomerTipRow(computedOrderSummary4)) == null || (localMoney = customerTipRow.amount) == null) {
                z = false;
                Cart cart3 = orderBuilderModel.cart;
                changed = r82.changed(list4);
                Object rememberedValue21 = r82.rememberedValue();
                if (!changed || rememberedValue21 == obj5) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj6 : list4) {
                        MutableState mutableState6 = collectAsState5;
                        if (((LocalTippingConfiguration.Suggestion) obj6).tip_amount != null) {
                            arrayList2.add(obj6);
                        }
                        collectAsState5 = mutableState6;
                    }
                    mutableState = collectAsState5;
                    r82.updateRememberedValue(arrayList2);
                    obj = arrayList2;
                } else {
                    mutableState = collectAsState5;
                    obj = rememberedValue21;
                }
                list = (List) obj;
                boolean z6 = (localBrandLocationCheckoutScreen2.tippingEnabled || list.isEmpty()) ? false : true;
                WorkLauncherImpl workLauncherImpl = CheckoutTipStateKt.CheckoutTipStateSaver;
                list.getClass();
                cart3.getClass();
                List list6 = cart3.lines;
                list2 = cart3.summaryLines;
                localMoney2 = cart3.total;
                function15.getClass();
                Object[] objArr = new Object[0];
                WorkLauncherImpl workLauncherImpl2 = CheckoutTipStateKt.CheckoutTipStateSaver;
                changedInstance = r82.changedInstance(localMoney7) | r82.changedInstance(list);
                rememberedValue = r82.rememberedValue();
                int i5 = 8;
                if (!changedInstance || rememberedValue == obj5) {
                    rememberedValue = new StatusRunnable$$ExternalSyntheticLambda1(i5, localMoney7, list);
                    r82.updateRememberedValue(rememberedValue);
                }
                checkoutTipState = (CheckoutTipState) SaverKt.m581rememberSaveable(objArr, (Saver) workLauncherImpl2, (Function0) rememberedValue, (Composer) r82, 0);
                MutableState rememberUpdatedState3 = Updater.rememberUpdatedState(cart3, r82);
                function1 = function15;
                MutableState rememberUpdatedState4 = Updater.rememberUpdatedState(function1, r82);
                String str14 = (String) checkoutTipState.currentTip$delegate.getValue();
                changed2 = r82.changed(z6) | r82.changed(rememberUpdatedState4) | r82.changedInstance(checkoutTipState) | r82.changed(rememberUpdatedState3);
                boolean z7 = z6;
                rememberedValue2 = r82.rememberedValue();
                if (!changed2 || rememberedValue2 == obj5) {
                    checkoutTipState2 = checkoutTipState;
                    rememberedValue2 = new CheckoutTipStateKt$rememberCheckoutTipState$1$1(z7, checkoutTipState2, rememberUpdatedState4, rememberUpdatedState3, (Continuation) null, 0);
                    r82.updateRememberedValue(rememberedValue2);
                } else {
                    checkoutTipState2 = checkoutTipState;
                }
                Updater.LaunchedEffect((Composer) r82, str14, (Function2) rememberedValue2);
                int size = list5.size();
                Object[] objArr2 = new Object[0];
                WorkLauncherImpl workLauncherImpl3 = CheckoutGiftCardStateKt.CheckoutGiftCardStateSaver;
                rememberedValue3 = r82.rememberedValue();
                if (rememberedValue3 == obj5) {
                    rememberedValue3 = new AvatarViewModel$$ExternalSyntheticLambda0(12);
                    r82.updateRememberedValue(rememberedValue3);
                }
                checkoutGiftCardState = (CheckoutGiftCardState) SaverKt.m581rememberSaveable(objArr2, (Saver) workLauncherImpl3, (Function0) rememberedValue3, (Composer) r82, MLKEMEngine.KyberPolyBytes);
                Integer valueOf = Integer.valueOf(size);
                changed3 = r82.changed(checkoutGiftCardState) | r82.changed(size);
                rememberedValue4 = r82.rememberedValue();
                if (!changed3 || rememberedValue4 == obj5) {
                    rememberedValue4 = new BlockRunner$cancel$1(checkoutGiftCardState, size, (Continuation) null);
                    r82.updateRememberedValue(rememberedValue4);
                }
                Updater.LaunchedEffect((Composer) r82, valueOf, (Function2) rememberedValue4);
                Object[] objArr3 = new Object[0];
                rememberedValue5 = r82.rememberedValue();
                if (rememberedValue5 == obj5) {
                    rememberedValue5 = new AvatarViewModel$$ExternalSyntheticLambda0(14);
                    r82.updateRememberedValue(rememberedValue5);
                }
                MutableState mutableState7 = (MutableState) SaverKt.rememberSaveable(objArr3, (Function0) rememberedValue5, r82, 48);
                OrderBuilderModel.PaymentMethodConfig paymentMethodConfig = orderBuilderModel.paymentMethodConfig;
                String str15 = (String) collectAsState4.getValue();
                if (reviewMode3 != LocalBrandLocationCheckoutScreen.ReviewMode.IN_STORE_OPEN_TAB) {
                    checkoutGiftCardState2 = checkoutGiftCardState;
                    cart = cart3;
                    gapComposer = r82;
                    z2 = true;
                } else {
                    checkoutGiftCardState2 = checkoutGiftCardState;
                    cart = cart3;
                    gapComposer = r82;
                    z2 = false;
                }
                CheckoutGiftCardState checkoutGiftCardState3 = checkoutGiftCardState2;
                computedOrderSummary = computedOrderSummary4;
                rememberCheckoutPaymentState = zzsr.rememberCheckoutPaymentState(cart, paymentMethodConfig, str15, z2, androidStringManager2, gapComposer, 0);
                GapComposer gapComposer2 = gapComposer;
                Cart cart4 = cart;
                if (computedOrderSummary != null || (grandTotalRow2 = ComputedOrderSummaryKt.getGrandTotalRow(computedOrderSummary)) == null || (r11 = grandTotalRow2.amount) == null) {
                    app.cash.local.primitives.LocalMoney localMoney8 = localMoney2;
                }
                app.cash.local.primitives.LocalMoney displayTotal = CashAppServiceModule.getDisplayTotal(orderBuilderModel);
                if (computedOrderSummary != null || (totalWithoutDiscountsRow = ComputedOrderSummaryKt.getTotalWithoutDiscountsRow(computedOrderSummary)) == null || (minus = totalWithoutDiscountsRow.amount) == null) {
                    List list7 = list2;
                    jWECryptoParts = rememberCheckoutPaymentState;
                    mutableState2 = mutableState5;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
                    it = list7.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((SummaryLine) it.next()).amount);
                    }
                    ArrayList arrayList4 = new ArrayList();
                    it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        app.cash.local.primitives.LocalMoney localMoney9 = (app.cash.local.primitives.LocalMoney) next;
                        localMoney9.getClass();
                        LocalBrandLocationCheckoutScreen localBrandLocationCheckoutScreen3 = localBrandLocationCheckoutScreen2;
                        Function1 function16 = function1;
                        if (localMoney9.amount < 0) {
                            arrayList4.add(next);
                        }
                        localBrandLocationCheckoutScreen2 = localBrandLocationCheckoutScreen3;
                        function1 = function16;
                    }
                    localBrandLocationCheckoutScreen = localBrandLocationCheckoutScreen2;
                    function12 = function1;
                    app.cash.local.primitives.LocalMoney zero = LocalMoneysKt.zero(LocalCurrencyCode.USD);
                    it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        zero = LocalMoneysKt.plus(zero, (app.cash.local.primitives.LocalMoney) it3.next());
                    }
                    minus = LocalMoneysKt.minus(localMoney8, zero);
                } else {
                    jWECryptoParts = rememberCheckoutPaymentState;
                    localBrandLocationCheckoutScreen = localBrandLocationCheckoutScreen2;
                    function12 = function1;
                    mutableState2 = mutableState5;
                }
                if (computedOrderSummary == null && localMoney7 != null) {
                    minus = LocalMoneysKt.plus(minus, localMoney7);
                }
                app.cash.local.primitives.LocalMoney localMoney10 = minus;
                if (computedOrderSummary == null) {
                    ComputedOrderSummary.Row totalWithoutDiscountsRow2 = ComputedOrderSummaryKt.getTotalWithoutDiscountsRow(computedOrderSummary);
                    long j = (totalWithoutDiscountsRow2 == null || (localMoney6 = totalWithoutDiscountsRow2.amount) == null) ? 0L : localMoney6.amount;
                    ComputedOrderSummary.Row grandTotalRow3 = ComputedOrderSummaryKt.getGrandTotalRow(computedOrderSummary);
                }
                if (computedOrderSummary != null) {
                    Iterator it6 = computedOrderSummary.rows.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj4 = null;
                            break;
                        }
                        obj4 = it6.next();
                        String str16 = ((ComputedOrderSummary.Row) obj4).identifier;
                        String str17 = computedOrderSummary.localCashIdentifier;
                        if (str17 == null ? false : Intrinsics.areEqual(str16, str17)) {
                            break;
                        }
                    }
                    ComputedOrderSummary.Row row = (ComputedOrderSummary.Row) obj4;
                    if (row != null) {
                        minus2 = row.amount;
                    }
                }
                minus2 = LocalMoneysKt.minus(cart4.serverCalculatedTotal, localMoney8);
                if (computedOrderSummary == null) {
                    ArrayList<ComputedOrderSummary.Row> arrayList5 = computedOrderSummary.rows;
                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
                    for (ComputedOrderSummary.Row row2 : arrayList5) {
                        String str18 = row2.identifier;
                        String str19 = computedOrderSummary.customerTipIdentifier;
                        if (str19 == null ? false : Intrinsics.areEqual(str18, str19)) {
                            ComputedOrderSummary.DisplayRow displayRow2 = row2.displayRow;
                            if (displayRow2 != null) {
                                ComputedOrderSummary.DisplayRow.Visibility visibility = ComputedOrderSummary.DisplayRow.Visibility.HIDDEN_IF_ZERO;
                                String str20 = displayRow2.label;
                                String str21 = displayRow2.value;
                                computedOrderSummary3 = computedOrderSummary;
                                boolean z8 = displayRow2.isHighlighted;
                                boolean z9 = displayRow2.isBold;
                                str20.getClass();
                                str21.getClass();
                                displayRow = new ComputedOrderSummary.DisplayRow(str20, str21, visibility, z8, z9);
                            } else {
                                computedOrderSummary3 = computedOrderSummary;
                                displayRow = null;
                            }
                            String str22 = row2.identifier;
                            app.cash.local.primitives.LocalMoney localMoney11 = row2.amount;
                            str22.getClass();
                            localMoney11.getClass();
                            row2 = new ComputedOrderSummary.Row(str22, localMoney11, displayRow);
                        } else {
                            computedOrderSummary3 = computedOrderSummary;
                        }
                        arrayList6.add(row2);
                        computedOrderSummary = computedOrderSummary3;
                    }
                    computedOrderSummary2 = computedOrderSummary;
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it7 = arrayList6.iterator();
                    while (it7.hasNext()) {
                        Object next2 = it7.next();
                        ComputedOrderSummary.Row row3 = (ComputedOrderSummary.Row) next2;
                        row3.getClass();
                        ComputedOrderSummary.DisplayRow displayRow3 = row3.displayRow;
                        ComputedOrderSummary.DisplayRow.Visibility visibility2 = displayRow3 != null ? displayRow3.visibility : null;
                        int i6 = visibility2 == null ? -1 : LocalsKt.WhenMappings.$EnumSwitchMapping$0[visibility2.ordinal()];
                        if (i6 == -1 || i6 == 1) {
                            localMoney5 = localMoney10;
                        } else {
                            localMoney5 = localMoney10;
                            if (i6 != 2) {
                                if (i6 != 3) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                app.cash.local.primitives.LocalMoney localMoney12 = row3.amount;
                                localMoney12.getClass();
                                if (localMoney12.amount == 0) {
                                }
                            }
                            arrayList7.add(next2);
                        }
                        localMoney10 = localMoney5;
                    }
                    localMoney3 = localMoney10;
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it8 = arrayList7.iterator();
                    while (it8.hasNext()) {
                        ComputedOrderSummary.DisplayRow displayRow4 = ((ComputedOrderSummary.Row) it8.next()).displayRow;
                        KeyValue keyValue = displayRow4 != null ? new KeyValue(displayRow4.label, displayRow4.value, displayRow4.isHighlighted, displayRow4.isBold) : null;
                        if (keyValue != null) {
                            arrayList8.add(keyValue);
                        }
                    }
                    arrayList = arrayList8;
                    i2 = 7;
                    r15 = 0;
                } else {
                    computedOrderSummary2 = computedOrderSummary;
                    localMoney3 = localMoney10;
                    ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    for (Iterator it9 = r11.iterator(); it9.hasNext(); it9 = it9) {
                        SummaryLine summaryLine = (SummaryLine) it9.next();
                        arrayList9.add(new KeyValue(summaryLine.description, LocalsKt.prettyPrint$default(summaryLine.amount, false, null, 7), 8, summaryLine.isHighlighted));
                    }
                    i2 = 7;
                    r15 = 0;
                    arrayList = arrayList9;
                }
                if (((LocalBrand) collectAsState2.getValue()) != null) {
                    String orderSummarySubtitle = orderSummarySubtitle(r15, r15, displayTotal);
                    EmptyList emptyList = EmptyList.INSTANCE;
                    ArrayMap m = NavAction$$ExternalSyntheticOutline0.m(1, Integer.valueOf((int) r15), "count");
                    Resources resources = androidStringManager2.resources;
                    resources.getClass();
                    String format3 = new MessageFormat(resources.getString(R.string.local_presenters_items_total)).format(m);
                    format3.getClass();
                    LocalBrandLocationCheckoutViewModel localBrandLocationCheckoutViewModel2 = new LocalBrandLocationCheckoutViewModel(emptyList, null, null, null, null, validateForCheckout, null, null, null, null, orderSummarySubtitle, emptyList, emptyList, null, null, null, null, orderType, null, null, new LocalBottomModalViewModel(true, null, new LocalBottomModalViewModel.Payload.ItemInfo(format3, LocalsKt.prettyPrint$default(displayTotal, r15, null, i2), null, Long.valueOf(displayTotal.amount)), androidStringManager2.get(R.string.local_presenters_next), false, 18), null, null, null, false, 63299608);
                    gapComposer2.end(false);
                    return localBrandLocationCheckoutViewModel2;
                }
                Object rememberedValue22 = gapComposer2.rememberedValue();
                if (rememberedValue22 == obj5) {
                    mutableState3 = collectAsState2;
                    rememberedValue22 = Updater.derivedStateOf(new TooltipKt$$ExternalSyntheticLambda1(11, mutableState3));
                    gapComposer2.updateRememberedValue(rememberedValue22);
                } else {
                    mutableState3 = collectAsState2;
                }
                State state3 = (State) rememberedValue22;
                Object rememberedValue23 = gapComposer2.rememberedValue();
                if (rememberedValue23 == obj5) {
                    rememberedValue23 = Updater.derivedStateOf(new TooltipKt$$ExternalSyntheticLambda1(12, mutableState3));
                    gapComposer2.updateRememberedValue(rememberedValue23);
                }
                State state4 = (State) rememberedValue23;
                if (((Boolean) collectAsState.getValue()).booleanValue()) {
                    CurbsidePickupSettings curbsidePickupSettings = orderBuilderModel.curbsidePickupSettings;
                    if ((curbsidePickupSettings != null ? Intrinsics.areEqual(curbsidePickupSettings.enabled, Boolean.TRUE) : false) && (orderType instanceof OrderBuilderModel.OrderType.Pickup)) {
                        boolean z10 = ((CurbsidePickupDetails) rememberUpdatedState2.getValue()).isSelected;
                        VehicleDescription vehicleDescription2 = (VehicleDescription) mutableState2.getValue();
                        if (vehicleDescription2 != null) {
                            String str23 = vehicleDescription2.note;
                            StringBuilder sb = new StringBuilder();
                            sb.append(vehicleDescription2.colorLabel);
                            sb.append(" ");
                            sb.append(vehicleDescription2.typeLabel);
                            if (!StringsKt.isBlank(str23)) {
                                sb.append(", ");
                                sb.append(str23);
                            }
                            str9 = sb.toString();
                        } else {
                            str9 = null;
                        }
                        LocalBrandLocationCheckoutViewModel.CurbsidePickupSection curbsidePickupSection2 = new LocalBrandLocationCheckoutViewModel.CurbsidePickupSection(z10, str9);
                        function13 = function12;
                        curbsidePickupSection = curbsidePickupSection2;
                        Location.LocationDetail locationDetail = (Location.LocationDetail) state4.getValue();
                        LocalFulfillmentType localFulfillmentType2 = LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_UNSPECIFIED;
                        locationDetail.getClass();
                        localFulfillmentType2.getClass();
                        currentlyOpen = LocationsKt.currentlyOpen(this.clock, locationDetail.openState(localFulfillmentType2));
                        rememberedValue6 = gapComposer2.rememberedValue();
                        if (rememberedValue6 == obj5) {
                            rememberedValue6 = Updater.derivedStateOf(new TooltipKt$$ExternalSyntheticLambda1(13, mutableState3));
                            gapComposer2.updateRememberedValue(rememberedValue6);
                        }
                        State state5 = (State) rememberedValue6;
                        changed4 = gapComposer2.changed((LocalCashBalance) collectAsState3.getValue()) | gapComposer2.changed(minus2) | gapComposer2.changed(orderBuilderModel.redeemLocalCash);
                        rememberedValue7 = gapComposer2.rememberedValue();
                        if (!changed4 || rememberedValue7 == obj5) {
                            rememberedValue7 = Updater.derivedStateOf(new l2$$ExternalSyntheticLambda7(orderBuilderModel, minus2, state3, collectAsState3, 5));
                            gapComposer2.updateRememberedValue(rememberedValue7);
                        }
                        State state6 = (State) rememberedValue7;
                        cartLoyaltySummary = orderBuilderModel.loyaltySummary;
                        if (cartLoyaltySummary == null) {
                            LocalLoyaltyAccount localLoyaltyAccount = cartLoyaltySummary.loyalty_account;
                            if (localLoyaltyAccount == null || (localLoyaltyProgram = cartLoyaltySummary.loyalty_program) == null) {
                                state = state4;
                                str2 = "count";
                            } else {
                                Brand brand = (Brand) state3.getValue();
                                String str24 = cartLoyaltySummary.selected_reward_token;
                                AndroidStringManager androidStringManager3 = this.stringManager;
                                state = state4;
                                Resources resources2 = androidStringManager3.resources;
                                str2 = "count";
                                if (!localLoyaltyProgram.reward_tiers.isEmpty()) {
                                    List<LocalLoyaltyReward> list8 = localLoyaltyProgram.reward_tiers;
                                    ArrayList arrayList10 = new ArrayList();
                                    for (Object obj7 : list8) {
                                        Cart cart5 = cart4;
                                        MutableState mutableState8 = mutableState3;
                                        Integer num = ((LocalLoyaltyReward) obj7).points;
                                        num.getClass();
                                        int intValue = num.intValue();
                                        Function1 function17 = function13;
                                        Integer num2 = localLoyaltyAccount.balance;
                                        num2.getClass();
                                        if (intValue <= num2.intValue()) {
                                            arrayList10.add(obj7);
                                        }
                                        cart4 = cart5;
                                        mutableState3 = mutableState8;
                                        function13 = function17;
                                    }
                                    cart2 = cart4;
                                    mutableState4 = mutableState3;
                                    function14 = function13;
                                    Iterator it10 = arrayList10.iterator();
                                    while (true) {
                                        if (!it10.hasNext()) {
                                            obj3 = null;
                                            break;
                                        }
                                        obj3 = it10.next();
                                        if (Intrinsics.areEqual(((LocalLoyaltyReward) obj3).token, str24)) {
                                            break;
                                        }
                                    }
                                    LocalLoyaltyReward localLoyaltyReward = (LocalLoyaltyReward) obj3;
                                    LocalImage localImage2 = brand.artworkImage;
                                    String str25 = brand.name;
                                    if (localImage2 != null) {
                                        LocalColor localColor = localImage2.placeholder_color;
                                        if (localColor == null) {
                                            localColor = brand.backgroundColor;
                                        }
                                        localImage = LocalImage.copy$default(localImage2, localColor, null, 47);
                                    } else {
                                        localImage = null;
                                    }
                                    if (localLoyaltyReward != null) {
                                        String str26 = localLoyaltyReward.name;
                                        str26.getClass();
                                        resources2.getClass();
                                        format2 = new MessageFormat(resources2.getString(R.string.local_presenters_checkout_loyalty_banner_applied_title)).format(new Object[]{str26});
                                        format2.getClass();
                                    } else if (arrayList10.isEmpty()) {
                                        str25.getClass();
                                        resources2.getClass();
                                        format2 = new MessageFormat(resources2.getString(R.string.local_presenters_checkout_loyalty_banner_none_title)).format(new Object[]{str25});
                                        format2.getClass();
                                    } else if (arrayList10.size() == 1) {
                                        String str27 = ((LocalLoyaltyReward) CollectionsKt.first((List) arrayList10)).name;
                                        str27.getClass();
                                        resources2.getClass();
                                        format2 = new MessageFormat(resources2.getString(R.string.local_presenters_checkout_loyalty_banner_single_title)).format(new Object[]{str27});
                                        format2.getClass();
                                    } else {
                                        Object[] objArr4 = {Integer.valueOf(arrayList10.size())};
                                        resources2.getClass();
                                        format2 = new MessageFormat(resources2.getString(R.string.local_presenters_checkout_loyalty_banner_multiple_title)).format(objArr4);
                                        format2.getClass();
                                    }
                                    String str28 = format2;
                                    if (localLoyaltyReward != null) {
                                        Integer num3 = localLoyaltyReward.points;
                                        num3.getClass();
                                        Object[] objArr5 = {LoyaltyKt.pointsText(localLoyaltyProgram, num3.intValue())};
                                        resources2.getClass();
                                        str8 = new MessageFormat(resources2.getString(R.string.local_presenters_checkout_loyalty_banner_applied_body)).format(objArr5);
                                        str8.getClass();
                                    } else if (arrayList10.isEmpty()) {
                                        str25.getClass();
                                        resources2.getClass();
                                        str8 = new MessageFormat(resources2.getString(R.string.local_presenters_checkout_loyalty_banner_none_body)).format(new Object[]{str25});
                                        str8.getClass();
                                    } else if (arrayList10.size() == 1) {
                                        String str29 = ((LocalLoyaltyReward) CollectionsKt.first((List) arrayList10)).name;
                                        str29.getClass();
                                        resources2.getClass();
                                        str8 = new MessageFormat(resources2.getString(R.string.local_presenters_checkout_loyalty_banner_single_body)).format(new Object[]{str29});
                                        str8.getClass();
                                    } else {
                                        str8 = androidStringManager3.get(R.string.local_presenters_checkout_loyalty_banner_multiple_body);
                                    }
                                    localBrandBannerModel4 = new LocalBrandBannerModel(localImage, false, str28, str8, new LocalBrandBannerModel.Mode.Clickable(LocalBrandBanner.Action.ShowLoyaltyRewards.INSTANCE), LocalBrandBannerModel.Type.LOYALTY);
                                    localBrandBannerModel = localBrandBannerModel4;
                                }
                            }
                            cart2 = cart4;
                            mutableState4 = mutableState3;
                            function14 = function13;
                            localBrandBannerModel4 = null;
                            localBrandBannerModel = localBrandBannerModel4;
                        } else {
                            state = state4;
                            str2 = "count";
                            cart2 = cart4;
                            mutableState4 = mutableState3;
                            function14 = function13;
                            localBrandBannerModel = null;
                        }
                        List list9 = orderBuilderModel.discountCodes;
                        ArrayList arrayList11 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list9, 10));
                        it4 = list9.iterator();
                        while (it4.hasNext()) {
                            arrayList11.add(new AppliedCoupon(((DiscountCode) it4.next()).getCode()));
                        }
                        String str30 = androidStringManager2.get(R.string.local_presenters_coupon_enter_code);
                        LocalErrorResponse.Error error = orderBuilderModel.discountCodesError;
                        CouponSection couponSection = new CouponSection(arrayList11, str30, error == null ? error.message : null);
                        fulfillmentConfigurations = (FulfillmentConfigurations) mutableState.getValue();
                        fulfillment = orderBuilderModel.fulfillment;
                        Location.LocationDetail locationDetail2 = (Location.LocationDetail) state.getValue();
                        if (fulfillment != null) {
                            fulfillmentConfiguration2 = FulfillmentConfigurationKt.m1240toFulfillmentConfiguration6UYloQk(fulfillment, locationDetail2.summary.token, null);
                            if (fulfillmentConfiguration2 instanceof FulfillmentConfiguration.Unspecified) {
                                fulfillmentConfiguration2 = null;
                            }
                        }
                        if (fulfillmentConfigurations != null || (fulfillmentConfiguration = FulfillmentConfigurationsKt.getCurrentConfiguration(fulfillmentConfigurations)) == null || (fulfillmentConfiguration instanceof FulfillmentConfiguration.Unspecified)) {
                            fulfillmentConfiguration = null;
                        }
                        if (fulfillmentConfiguration == null) {
                            fulfillment2 = null;
                            fulfillmentConfiguration2 = fulfillmentConfiguration;
                        } else if (orderType instanceof OrderBuilderModel.OrderType.Delivery) {
                            fulfillmentConfiguration2 = new FulfillmentConfiguration.Delivery(locationDetail2.summary.token, null, null, null, null, null);
                            fulfillment2 = null;
                        } else {
                            if (!Intrinsics.areEqual(orderType, OrderBuilderModel.OrderType.Pickup.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            fulfillment2 = null;
                            fulfillmentConfiguration2 = new FulfillmentConfiguration.Pickup(locationDetail2.summary.token, null, 14);
                        }
                        MutableState rememberUpdatedState5 = Updater.rememberUpdatedState(fulfillmentConfiguration2, gapComposer2);
                        reviewMode = localBrandLocationCheckoutScreen.reviewMode;
                        FulfillmentConfigurations fulfillmentConfigurations2 = (FulfillmentConfigurations) mutableState.getValue();
                        Location.LocationDetail locationDetail3 = (Location.LocationDetail) state.getValue();
                        boolean booleanValue = ((Boolean) mutableState7.getValue()).booleanValue();
                        if (reviewMode != LocalBrandLocationCheckoutScreen.ReviewMode.IN_STORE_OPEN_TAB) {
                            if (fulfillmentConfiguration2 instanceof FulfillmentConfiguration.Delivery) {
                                LocalFulfillment.DeliveryDetails deliveryDetails = ((FulfillmentConfiguration.Delivery) fulfillmentConfiguration2).deliveryDetails;
                                if (deliveryDetails == null || (localAddress = deliveryDetails.delivery_address) == null || (r8 = localAddress.address_single_line) == 0) {
                                    LocalAddress localAddress2 = locationDetail3.summary.address;
                                    r8 = localAddress2 != null ? localAddress2.address_single_line : fulfillment2;
                                    if (r8 == 0) {
                                        str3 = "";
                                        pickup = new LocalBrandLocationCartViewModel.Fulfillment.Delivery(str3, estimatedCompletion(fulfillmentConfigurations2, fulfillmentConfiguration2, false), estimatedCompletion(fulfillmentConfigurations2, fulfillmentConfiguration2, true), true, FulfillmentConfigurationKt.getSchedulingMode(fulfillmentConfiguration2), booleanValue);
                                        rememberedValue8 = gapComposer2.rememberedValue();
                                        if (rememberedValue8 == obj5) {
                                            rememberedValue8 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
                                            gapComposer2.updateRememberedValue(rememberedValue8);
                                        }
                                        CoroutineScope coroutineScope = (CoroutineScope) rememberedValue8;
                                        Function1 function18 = function14;
                                        changed5 = gapComposer2.changed(function18) | gapComposer2.changedInstance(coroutineScope) | gapComposer2.changedInstance(this);
                                        rememberedValue9 = gapComposer2.rememberedValue();
                                        if (!changed5 || rememberedValue9 == obj5) {
                                            rememberedValue9 = new MenuKt$$ExternalSyntheticLambda1(10, coroutineScope, function18, (Object) this);
                                            gapComposer2.updateRememberedValue(rememberedValue9);
                                        }
                                        Function2 function2 = (Function2) rememberedValue9;
                                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = AnswersKt.LocalAnswerDispatcher;
                                        AnswerDispatcher answerDispatcher = (AnswerDispatcher) gapComposer2.consume(staticProvidableCompositionLocal);
                                        changed6 = gapComposer2.changed(function2) | gapComposer2.changedInstance(answerDispatcher);
                                        rememberedValue10 = gapComposer2.rememberedValue();
                                        if (!changed6 || rememberedValue10 == obj5) {
                                            rememberedValue10 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, 1);
                                            gapComposer2.updateRememberedValue(rememberedValue10);
                                        }
                                        Updater.DisposableEffect(answerDispatcher, (Function1) rememberedValue10, gapComposer2);
                                        localBrandBannerModel2 = localBrandBannerModel;
                                        State state7 = state;
                                        str4 = str2;
                                        Cart cart6 = cart2;
                                        JWECryptoParts jWECryptoParts2 = jWECryptoParts;
                                        MutableState mutableState9 = mutableState2;
                                        app.cash.local.primitives.LocalMoney localMoney13 = localMoney3;
                                        MutableState mutableState10 = mutableState4;
                                        CheckoutTipState checkoutTipState3 = checkoutTipState2;
                                        Updater.LaunchedEffect(gapComposer2, flow, new ChatPresenter$models$$inlined$CollectEffect$1(flow, (Continuation) null, orderBuilderModel, (LocalBrandLocationCheckoutPresenter) this, function18, validateForCheckout, jWECryptoParts2, checkoutTipState3, checkoutGiftCardState3, cart6, rememberUpdatedState5, state7, mutableState7, rememberUpdatedState, mutableState9));
                                        changed7 = gapComposer2.changed(function18);
                                        Object rememberedValue24 = gapComposer2.rememberedValue();
                                        if (changed7) {
                                            obj2 = obj5;
                                        } else {
                                            obj2 = obj5;
                                            if (rememberedValue24 != obj2) {
                                                Function2 function22 = (Function2) rememberedValue24;
                                                AnswerDispatcher answerDispatcher2 = (AnswerDispatcher) gapComposer2.consume(staticProvidableCompositionLocal);
                                                changed8 = gapComposer2.changed(function22) | gapComposer2.changedInstance(answerDispatcher2);
                                                rememberedValue11 = gapComposer2.rememberedValue();
                                                if (!changed8 || rememberedValue11 == obj2) {
                                                    rememberedValue11 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function22, answerDispatcher2, 2);
                                                    gapComposer2.updateRememberedValue(rememberedValue11);
                                                }
                                                Updater.DisposableEffect(answerDispatcher2, (Function1) rememberedValue11, gapComposer2);
                                                changed9 = gapComposer2.changed(function18) | gapComposer2.changed(rememberUpdatedState2);
                                                rememberedValue12 = gapComposer2.rememberedValue();
                                                if (!changed9 || rememberedValue12 == obj2) {
                                                    rememberedValue12 = new MenuKt$$ExternalSyntheticLambda1(11, function18, mutableState9, rememberUpdatedState2);
                                                    gapComposer2.updateRememberedValue(rememberedValue12);
                                                }
                                                Function2 function23 = (Function2) rememberedValue12;
                                                AnswerDispatcher answerDispatcher3 = (AnswerDispatcher) gapComposer2.consume(staticProvidableCompositionLocal);
                                                changed10 = gapComposer2.changed(function23) | gapComposer2.changedInstance(answerDispatcher3);
                                                rememberedValue13 = gapComposer2.rememberedValue();
                                                if (!changed10 || rememberedValue13 == obj2) {
                                                    rememberedValue13 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function23, answerDispatcher3, 3);
                                                    gapComposer2.updateRememberedValue(rememberedValue13);
                                                }
                                                Updater.DisposableEffect(answerDispatcher3, (Function1) rememberedValue13, gapComposer2);
                                                it5 = list6.iterator();
                                                int i7 = 0;
                                                while (it5.hasNext()) {
                                                    i7 += ((Line) it5.next()).selection.quantity;
                                                }
                                                changed11 = gapComposer2.changed(list6) | gapComposer2.changed((LocationMenu) state5.getValue());
                                                rememberedValue14 = gapComposer2.rememberedValue();
                                                if (!changed11 || rememberedValue14 == obj2) {
                                                    rememberedValue14 = zzsq.toCheckoutSummaryLines(cart6, (LocationMenu) state5.getValue());
                                                    gapComposer2.updateRememberedValue(rememberedValue14);
                                                }
                                                List list10 = (List) rememberedValue14;
                                                currentTipAsMoney = checkoutTipState3.currentTipAsMoney(localMoney2.currencyCode);
                                                boolean z11 = !LocalMoneysKt.isPositive(currentTipAsMoney) || z;
                                                if (computedOrderSummary2 != null || (grandTotalRow = ComputedOrderSummaryKt.getGrandTotalRow(computedOrderSummary2)) == null || (r9 = grandTotalRow.amount) == null) {
                                                    app.cash.local.primitives.LocalMoney plus = LocalMoneysKt.plus(localMoney2, currentTipAsMoney);
                                                }
                                                FormattedResource formattedResource = !z11 ? new FormattedResource(R.string.local_presenters_items_with_tip, NavAction$$ExternalSyntheticOutline0.m(1, Integer.valueOf(i7), str4)) : new FormattedResource(R.string.local_presenters_items_total, NavAction$$ExternalSyntheticOutline0.m(1, Integer.valueOf(i7), str4));
                                                localMoney4 = orderBuilderModel.estimatedEarnings;
                                                if (localMoney4 == null && (localCashMarketingContent = ((Brand) state3.getValue()).marketingContent) != null && (template = localCashMarketingContent.checkout) != null) {
                                                    template.getClass();
                                                    long j2 = localMoney4.amount;
                                                    state2 = state7;
                                                    String prettyPrint$default = LocalsKt.prettyPrint$default(localMoney4, false, null, 7);
                                                    LocalMoney localMoney14 = template.threshold;
                                                    Long l = localMoney14 != null ? localMoney14.amount : null;
                                                    String str31 = template.over_threshold_title;
                                                    String str32 = template.over_threshold_subtitle;
                                                    Long l2 = l;
                                                    String str33 = template.under_threshold_title;
                                                    String str34 = template.under_threshold_subtitle;
                                                    if (l2 == null || l2.longValue() >= j2) {
                                                        if (str33 != null) {
                                                            String injectThreshold = LocalsKt.injectThreshold(str33, prettyPrint$default);
                                                            if (str34 != null) {
                                                                pair = new Pair(injectThreshold, LocalsKt.injectThreshold(str34, prettyPrint$default));
                                                            }
                                                        }
                                                    } else if (str31 != null) {
                                                        String injectThreshold2 = LocalsKt.injectThreshold(str31, prettyPrint$default);
                                                        if (str32 != null) {
                                                            pair = new Pair(injectThreshold2, LocalsKt.injectThreshold(str32, prettyPrint$default));
                                                        }
                                                    }
                                                    ArrayList appliedGiftCards = appliedGiftCards(list5, localMoney2.currencyCode);
                                                    LocalBrandLocationCheckoutViewModel.ReviewMode reviewMode4 = WhenMappings.$EnumSwitchMapping$0[reviewMode3.ordinal()] == 1 ? LocalBrandLocationCheckoutViewModel.ReviewMode.IN_STORE_OPEN_TAB : LocalBrandLocationCheckoutViewModel.ReviewMode.STANDARD;
                                                    localBrandBannerModel3 = (LocalBrandBannerModel) state6.getValue();
                                                    if (localBrandBannerModel3 != null) {
                                                        gapComposer2.startReplaceGroup(-1106477359);
                                                        reviewMode2 = reviewMode4;
                                                        continuation = null;
                                                        z4 = false;
                                                        Updater.LaunchedEffect(gapComposer2, localBrandBannerModel3, new LocalBrandLocationCheckoutPresenter$models$$inlined$LaunchedEffectNotNull$2(localBrandBannerModel3, null, this, 0));
                                                        gapComposer2.end(false);
                                                        i3 = -1106436997;
                                                    } else {
                                                        reviewMode2 = reviewMode4;
                                                        continuation = null;
                                                        i3 = -1106436997;
                                                        z4 = false;
                                                        gapComposer2.startReplaceGroup(-1106436997);
                                                        gapComposer2.end(false);
                                                    }
                                                    if (localBrandBannerModel2 != null) {
                                                        gapComposer2.startReplaceGroup(-1106477359);
                                                        Updater.LaunchedEffect(gapComposer2, localBrandBannerModel2, new LocalBrandLocationCheckoutPresenter$models$$inlined$LaunchedEffectNotNull$2(localBrandBannerModel2, continuation, this, 1));
                                                        gapComposer2.end(false);
                                                    } else {
                                                        gapComposer2.startReplaceGroup(i3);
                                                        gapComposer2.end(z4);
                                                    }
                                                    String orderSummarySubtitle2 = orderSummarySubtitle(i7, z11, plus);
                                                    List filterNotNull = ArraysKt___ArraysKt.filterNotNull(new LocalBrandBannerModel[]{(LocalBrandBannerModel) state6.getValue(), localBrandBannerModel2});
                                                    LocalBrand.FulfillmentSelection fulfillmentSelection = ((Brand) state3.getValue()).fulfillmentSelection;
                                                    list3 = fulfillmentSelection != null ? fulfillmentSelection.available_fulfillment_types : null;
                                                    if (list3 == null) {
                                                        list3 = EmptyList.INSTANCE;
                                                    }
                                                    List list11 = list3;
                                                    localFulfillmentType = fulfillment3 != null ? fulfillment3.f911type : null;
                                                    switch (localFulfillmentType != null ? WhenMappings.$EnumSwitchMapping$1[localFulfillmentType.ordinal()] : -1) {
                                                        case -1:
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                            androidStringManager = androidStringManager2;
                                                            str5 = androidStringManager.get(R.string.local_presenters_estimated_pickup_time);
                                                            break;
                                                        case 0:
                                                        default:
                                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                                            return null;
                                                        case 6:
                                                            androidStringManager = androidStringManager2;
                                                            str5 = androidStringManager.get(R.string.local_presenters_estimated_delivery_time);
                                                            break;
                                                    }
                                                    String str35 = str5;
                                                    ZoneId zoneId = ((Location.LocationDetail) state2.getValue()).summary.zoneId;
                                                    LocalText estimatedTime = zoneId != null ? fulfillment3 != null ? DateTimesKt.estimatedTime(fulfillment3, androidStringManager, zoneId) : null : null;
                                                    String str36 = ((Brand) state3.getValue()).name;
                                                    LocalImage localImage3 = ((Brand) state3.getValue()).artworkImage;
                                                    LocalAddress address = models$lambda$29(state2).getAddress();
                                                    address.getClass();
                                                    String str37 = address.address_single_line;
                                                    str37.getClass();
                                                    LocalAddress address2 = models$lambda$29(state2).getAddress();
                                                    address2.getClass();
                                                    GpsCoordinates gpsCoordinates = LocalsKt.toGpsCoordinates(address2);
                                                    LocalCheckoutOrderSummaryViewModel localCheckoutOrderSummaryViewModel = new LocalCheckoutOrderSummaryViewModel(i7, list10, arrayList, true, 24);
                                                    LocalCheckoutPaymentSectionViewModel localCheckoutPaymentSectionViewModel = new LocalCheckoutPaymentSectionViewModel((String) jWECryptoParts2.header, (List) jWECryptoParts2.encryptedKey);
                                                    LocalCheckoutGiftCardSectionViewModel giftCardSection = giftCardSection(checkoutGiftCardState3, appliedGiftCards, orderBuilderModel, gapComposer2);
                                                    LocalCheckoutTipSectionViewModel tipSection = tipSection(pair, checkoutTipState3);
                                                    if (currentlyOpen) {
                                                        str6 = null;
                                                        title = null;
                                                    } else {
                                                        str6 = null;
                                                        title = new LocalBottomModalViewModel.Title(androidStringManager.get(R.string.local_presenters_location_closed), null, LocalBottomModalViewModel.Title.TitleTextStyle.Warning, 14);
                                                    }
                                                    LocalBrandLocationCheckoutViewModel.ReviewMode reviewMode5 = reviewMode2;
                                                    LocalBottomModalViewModel localBottomModalViewModel = new LocalBottomModalViewModel(currentlyOpen, title, new LocalBottomModalViewModel.Payload.ItemInfo(androidStringManager.getString(formattedResource), LocalsKt.prettyPrint$default(plus, false, str6, 7), z3 ? LocalsKt.prettyPrint$default(localMoney13, false, str6, 7) : str6, Long.valueOf(plus.getAmount())), reviewMode5 == LocalBrandLocationCheckoutViewModel.ReviewMode.IN_STORE_OPEN_TAB ? androidStringManager.get(R.string.local_presenters_pay) : androidStringManager.get(R.string.local_presenters_variations_place_order), orderBuilderModel.isWorkingAsync(), 16);
                                                    LocalCheckoutSpecialInstructionsViewModel localCheckoutSpecialInstructionsViewModel = new LocalCheckoutSpecialInstructionsViewModel(((Brand) state3.getValue()).name);
                                                    LocalBrand localBrand = (LocalBrand) mutableState10.getValue();
                                                    ?? r45 = localBrand != null ? Intrinsics.areEqual(localBrand.allow_checkout_notes, Boolean.TRUE) : false ? localCheckoutSpecialInstructionsViewModel : str6;
                                                    LocalBrand localBrand2 = (LocalBrand) mutableState10.getValue();
                                                    LocalBrandLocationCheckoutViewModel localBrandLocationCheckoutViewModel3 = new LocalBrandLocationCheckoutViewModel(filterNotNull, str35, estimatedTime, pickup, list11, validateForCheckout, str36, localImage3, str37, gpsCoordinates, orderSummarySubtitle2, list10, arrayList, localCheckoutOrderSummaryViewModel, localCheckoutPaymentSectionViewModel, giftCardSection, tipSection, orderType, reviewMode5, curbsidePickupSection, localBottomModalViewModel, r45, (localBrand2 != null || (str7 = localBrand2.policies) == null || StringsKt.isBlank(str7)) ? str6 : str7, couponSection, !orderBuilderModel.isWorkingAsync() || orderBuilderModel.updatingCart, 50331648);
                                                    gapComposer2.endReplaceGroup();
                                                    return localBrandLocationCheckoutViewModel3;
                                                }
                                                state2 = state7;
                                                pair = null;
                                                ArrayList appliedGiftCards2 = appliedGiftCards(list5, localMoney2.currencyCode);
                                                if (WhenMappings.$EnumSwitchMapping$0[reviewMode3.ordinal()] == 1) {
                                                }
                                                localBrandBannerModel3 = (LocalBrandBannerModel) state6.getValue();
                                                if (localBrandBannerModel3 != null) {
                                                }
                                                if (localBrandBannerModel2 != null) {
                                                }
                                                String orderSummarySubtitle22 = orderSummarySubtitle(i7, z11, plus);
                                                List filterNotNull2 = ArraysKt___ArraysKt.filterNotNull(new LocalBrandBannerModel[]{(LocalBrandBannerModel) state6.getValue(), localBrandBannerModel2});
                                                LocalBrand.FulfillmentSelection fulfillmentSelection2 = ((Brand) state3.getValue()).fulfillmentSelection;
                                                if (fulfillmentSelection2 != null) {
                                                }
                                                if (list3 == null) {
                                                }
                                                List list112 = list3;
                                                if (fulfillment3 != null) {
                                                }
                                                switch (localFulfillmentType != null ? WhenMappings.$EnumSwitchMapping$1[localFulfillmentType.ordinal()] : -1) {
                                                }
                                                String str352 = str5;
                                                ZoneId zoneId2 = ((Location.LocationDetail) state2.getValue()).summary.zoneId;
                                                if (zoneId2 != null) {
                                                }
                                                String str362 = ((Brand) state3.getValue()).name;
                                                LocalImage localImage32 = ((Brand) state3.getValue()).artworkImage;
                                                LocalAddress address3 = models$lambda$29(state2).getAddress();
                                                address3.getClass();
                                                String str372 = address3.address_single_line;
                                                str372.getClass();
                                                LocalAddress address22 = models$lambda$29(state2).getAddress();
                                                address22.getClass();
                                                GpsCoordinates gpsCoordinates2 = LocalsKt.toGpsCoordinates(address22);
                                                LocalCheckoutOrderSummaryViewModel localCheckoutOrderSummaryViewModel2 = new LocalCheckoutOrderSummaryViewModel(i7, list10, arrayList, true, 24);
                                                LocalCheckoutPaymentSectionViewModel localCheckoutPaymentSectionViewModel2 = new LocalCheckoutPaymentSectionViewModel((String) jWECryptoParts2.header, (List) jWECryptoParts2.encryptedKey);
                                                LocalCheckoutGiftCardSectionViewModel giftCardSection2 = giftCardSection(checkoutGiftCardState3, appliedGiftCards2, orderBuilderModel, gapComposer2);
                                                LocalCheckoutTipSectionViewModel tipSection2 = tipSection(pair, checkoutTipState3);
                                                if (currentlyOpen) {
                                                }
                                                LocalBrandLocationCheckoutViewModel.ReviewMode reviewMode52 = reviewMode2;
                                                LocalBottomModalViewModel localBottomModalViewModel2 = new LocalBottomModalViewModel(currentlyOpen, title, new LocalBottomModalViewModel.Payload.ItemInfo(androidStringManager.getString(formattedResource), LocalsKt.prettyPrint$default(plus, false, str6, 7), z3 ? LocalsKt.prettyPrint$default(localMoney13, false, str6, 7) : str6, Long.valueOf(plus.getAmount())), reviewMode52 == LocalBrandLocationCheckoutViewModel.ReviewMode.IN_STORE_OPEN_TAB ? androidStringManager.get(R.string.local_presenters_pay) : androidStringManager.get(R.string.local_presenters_variations_place_order), orderBuilderModel.isWorkingAsync(), 16);
                                                LocalCheckoutSpecialInstructionsViewModel localCheckoutSpecialInstructionsViewModel2 = new LocalCheckoutSpecialInstructionsViewModel(((Brand) state3.getValue()).name);
                                                LocalBrand localBrand3 = (LocalBrand) mutableState10.getValue();
                                                if (localBrand3 != null ? Intrinsics.areEqual(localBrand3.allow_checkout_notes, Boolean.TRUE) : false) {
                                                }
                                                LocalBrand localBrand22 = (LocalBrand) mutableState10.getValue();
                                                LocalBrandLocationCheckoutViewModel localBrandLocationCheckoutViewModel32 = new LocalBrandLocationCheckoutViewModel(filterNotNull2, str352, estimatedTime, pickup, list112, validateForCheckout, str362, localImage32, str372, gpsCoordinates2, orderSummarySubtitle22, list10, arrayList, localCheckoutOrderSummaryViewModel2, localCheckoutPaymentSectionViewModel2, giftCardSection2, tipSection2, orderType, reviewMode52, curbsidePickupSection, localBottomModalViewModel2, r45, (localBrand22 != null || (str7 = localBrand22.policies) == null || StringsKt.isBlank(str7)) ? str6 : str7, couponSection, !orderBuilderModel.isWorkingAsync() || orderBuilderModel.updatingCart, 50331648);
                                                gapComposer2.endReplaceGroup();
                                                return localBrandLocationCheckoutViewModel32;
                                            }
                                        }
                                        rememberedValue24 = new MainPaymentPadViewKt$MainPaymentPadView$1$2$10$1(1, function18);
                                        gapComposer2.updateRememberedValue(rememberedValue24);
                                        Function2 function222 = (Function2) rememberedValue24;
                                        AnswerDispatcher answerDispatcher22 = (AnswerDispatcher) gapComposer2.consume(staticProvidableCompositionLocal);
                                        changed8 = gapComposer2.changed(function222) | gapComposer2.changedInstance(answerDispatcher22);
                                        rememberedValue11 = gapComposer2.rememberedValue();
                                        if (!changed8) {
                                        }
                                        rememberedValue11 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function222, answerDispatcher22, 2);
                                        gapComposer2.updateRememberedValue(rememberedValue11);
                                        Updater.DisposableEffect(answerDispatcher22, (Function1) rememberedValue11, gapComposer2);
                                        changed9 = gapComposer2.changed(function18) | gapComposer2.changed(rememberUpdatedState2);
                                        rememberedValue12 = gapComposer2.rememberedValue();
                                        if (!changed9) {
                                        }
                                        rememberedValue12 = new MenuKt$$ExternalSyntheticLambda1(11, function18, mutableState9, rememberUpdatedState2);
                                        gapComposer2.updateRememberedValue(rememberedValue12);
                                        Function2 function232 = (Function2) rememberedValue12;
                                        AnswerDispatcher answerDispatcher32 = (AnswerDispatcher) gapComposer2.consume(staticProvidableCompositionLocal);
                                        changed10 = gapComposer2.changed(function232) | gapComposer2.changedInstance(answerDispatcher32);
                                        rememberedValue13 = gapComposer2.rememberedValue();
                                        if (!changed10) {
                                        }
                                        rememberedValue13 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function232, answerDispatcher32, 3);
                                        gapComposer2.updateRememberedValue(rememberedValue13);
                                        Updater.DisposableEffect(answerDispatcher32, (Function1) rememberedValue13, gapComposer2);
                                        it5 = list6.iterator();
                                        int i72 = 0;
                                        while (it5.hasNext()) {
                                        }
                                        changed11 = gapComposer2.changed(list6) | gapComposer2.changed((LocationMenu) state5.getValue());
                                        rememberedValue14 = gapComposer2.rememberedValue();
                                        if (!changed11) {
                                        }
                                        rememberedValue14 = zzsq.toCheckoutSummaryLines(cart6, (LocationMenu) state5.getValue());
                                        gapComposer2.updateRememberedValue(rememberedValue14);
                                        List list102 = (List) rememberedValue14;
                                        currentTipAsMoney = checkoutTipState3.currentTipAsMoney(localMoney2.currencyCode);
                                        if (LocalMoneysKt.isPositive(currentTipAsMoney)) {
                                        }
                                        if (computedOrderSummary2 != null) {
                                        }
                                        app.cash.local.primitives.LocalMoney plus2 = LocalMoneysKt.plus(localMoney2, currentTipAsMoney);
                                        if (!z11) {
                                        }
                                        localMoney4 = orderBuilderModel.estimatedEarnings;
                                        if (localMoney4 == null) {
                                        }
                                        state2 = state7;
                                        pair = null;
                                        ArrayList appliedGiftCards22 = appliedGiftCards(list5, localMoney2.currencyCode);
                                        if (WhenMappings.$EnumSwitchMapping$0[reviewMode3.ordinal()] == 1) {
                                        }
                                        localBrandBannerModel3 = (LocalBrandBannerModel) state6.getValue();
                                        if (localBrandBannerModel3 != null) {
                                        }
                                        if (localBrandBannerModel2 != null) {
                                        }
                                        String orderSummarySubtitle222 = orderSummarySubtitle(i72, z11, plus2);
                                        List filterNotNull22 = ArraysKt___ArraysKt.filterNotNull(new LocalBrandBannerModel[]{(LocalBrandBannerModel) state6.getValue(), localBrandBannerModel2});
                                        LocalBrand.FulfillmentSelection fulfillmentSelection22 = ((Brand) state3.getValue()).fulfillmentSelection;
                                        if (fulfillmentSelection22 != null) {
                                        }
                                        if (list3 == null) {
                                        }
                                        List list1122 = list3;
                                        if (fulfillment3 != null) {
                                        }
                                        switch (localFulfillmentType != null ? WhenMappings.$EnumSwitchMapping$1[localFulfillmentType.ordinal()] : -1) {
                                        }
                                        String str3522 = str5;
                                        ZoneId zoneId22 = ((Location.LocationDetail) state2.getValue()).summary.zoneId;
                                        if (zoneId22 != null) {
                                        }
                                        String str3622 = ((Brand) state3.getValue()).name;
                                        LocalImage localImage322 = ((Brand) state3.getValue()).artworkImage;
                                        LocalAddress address32 = models$lambda$29(state2).getAddress();
                                        address32.getClass();
                                        String str3722 = address32.address_single_line;
                                        str3722.getClass();
                                        LocalAddress address222 = models$lambda$29(state2).getAddress();
                                        address222.getClass();
                                        GpsCoordinates gpsCoordinates22 = LocalsKt.toGpsCoordinates(address222);
                                        LocalCheckoutOrderSummaryViewModel localCheckoutOrderSummaryViewModel22 = new LocalCheckoutOrderSummaryViewModel(i72, list102, arrayList, true, 24);
                                        LocalCheckoutPaymentSectionViewModel localCheckoutPaymentSectionViewModel22 = new LocalCheckoutPaymentSectionViewModel((String) jWECryptoParts2.header, (List) jWECryptoParts2.encryptedKey);
                                        LocalCheckoutGiftCardSectionViewModel giftCardSection22 = giftCardSection(checkoutGiftCardState3, appliedGiftCards22, orderBuilderModel, gapComposer2);
                                        LocalCheckoutTipSectionViewModel tipSection22 = tipSection(pair, checkoutTipState3);
                                        if (currentlyOpen) {
                                        }
                                        LocalBrandLocationCheckoutViewModel.ReviewMode reviewMode522 = reviewMode2;
                                        LocalBottomModalViewModel localBottomModalViewModel22 = new LocalBottomModalViewModel(currentlyOpen, title, new LocalBottomModalViewModel.Payload.ItemInfo(androidStringManager.getString(formattedResource), LocalsKt.prettyPrint$default(plus2, false, str6, 7), z3 ? LocalsKt.prettyPrint$default(localMoney13, false, str6, 7) : str6, Long.valueOf(plus2.getAmount())), reviewMode522 == LocalBrandLocationCheckoutViewModel.ReviewMode.IN_STORE_OPEN_TAB ? androidStringManager.get(R.string.local_presenters_pay) : androidStringManager.get(R.string.local_presenters_variations_place_order), orderBuilderModel.isWorkingAsync(), 16);
                                        LocalCheckoutSpecialInstructionsViewModel localCheckoutSpecialInstructionsViewModel22 = new LocalCheckoutSpecialInstructionsViewModel(((Brand) state3.getValue()).name);
                                        LocalBrand localBrand32 = (LocalBrand) mutableState10.getValue();
                                        if (localBrand32 != null ? Intrinsics.areEqual(localBrand32.allow_checkout_notes, Boolean.TRUE) : false) {
                                        }
                                        LocalBrand localBrand222 = (LocalBrand) mutableState10.getValue();
                                        LocalBrandLocationCheckoutViewModel localBrandLocationCheckoutViewModel322 = new LocalBrandLocationCheckoutViewModel(filterNotNull22, str3522, estimatedTime, pickup, list1122, validateForCheckout, str3622, localImage322, str3722, gpsCoordinates22, orderSummarySubtitle222, list102, arrayList, localCheckoutOrderSummaryViewModel22, localCheckoutPaymentSectionViewModel22, giftCardSection22, tipSection22, orderType, reviewMode522, curbsidePickupSection, localBottomModalViewModel22, r45, (localBrand222 != null || (str7 = localBrand222.policies) == null || StringsKt.isBlank(str7)) ? str6 : str7, couponSection, !orderBuilderModel.isWorkingAsync() || orderBuilderModel.updatingCart, 50331648);
                                        gapComposer2.endReplaceGroup();
                                        return localBrandLocationCheckoutViewModel322;
                                    }
                                }
                                str3 = r8;
                                pickup = new LocalBrandLocationCartViewModel.Fulfillment.Delivery(str3, estimatedCompletion(fulfillmentConfigurations2, fulfillmentConfiguration2, false), estimatedCompletion(fulfillmentConfigurations2, fulfillmentConfiguration2, true), true, FulfillmentConfigurationKt.getSchedulingMode(fulfillmentConfiguration2), booleanValue);
                                rememberedValue8 = gapComposer2.rememberedValue();
                                if (rememberedValue8 == obj5) {
                                }
                                CoroutineScope coroutineScope2 = (CoroutineScope) rememberedValue8;
                                Function1 function182 = function14;
                                changed5 = gapComposer2.changed(function182) | gapComposer2.changedInstance(coroutineScope2) | gapComposer2.changedInstance(this);
                                rememberedValue9 = gapComposer2.rememberedValue();
                                if (!changed5) {
                                }
                                rememberedValue9 = new MenuKt$$ExternalSyntheticLambda1(10, coroutineScope2, function182, (Object) this);
                                gapComposer2.updateRememberedValue(rememberedValue9);
                                Function2 function24 = (Function2) rememberedValue9;
                                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = AnswersKt.LocalAnswerDispatcher;
                                AnswerDispatcher answerDispatcher4 = (AnswerDispatcher) gapComposer2.consume(staticProvidableCompositionLocal2);
                                changed6 = gapComposer2.changed(function24) | gapComposer2.changedInstance(answerDispatcher4);
                                rememberedValue10 = gapComposer2.rememberedValue();
                                if (!changed6) {
                                }
                                rememberedValue10 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function24, answerDispatcher4, 1);
                                gapComposer2.updateRememberedValue(rememberedValue10);
                                Updater.DisposableEffect(answerDispatcher4, (Function1) rememberedValue10, gapComposer2);
                                localBrandBannerModel2 = localBrandBannerModel;
                                State state72 = state;
                                str4 = str2;
                                Cart cart62 = cart2;
                                JWECryptoParts jWECryptoParts22 = jWECryptoParts;
                                MutableState mutableState92 = mutableState2;
                                app.cash.local.primitives.LocalMoney localMoney132 = localMoney3;
                                MutableState mutableState102 = mutableState4;
                                CheckoutTipState checkoutTipState32 = checkoutTipState2;
                                Updater.LaunchedEffect(gapComposer2, flow, new ChatPresenter$models$$inlined$CollectEffect$1(flow, (Continuation) null, orderBuilderModel, (LocalBrandLocationCheckoutPresenter) this, function182, validateForCheckout, jWECryptoParts22, checkoutTipState32, checkoutGiftCardState3, cart62, rememberUpdatedState5, state72, mutableState7, rememberUpdatedState, mutableState92));
                                changed7 = gapComposer2.changed(function182);
                                Object rememberedValue242 = gapComposer2.rememberedValue();
                                if (changed7) {
                                }
                                rememberedValue242 = new MainPaymentPadViewKt$MainPaymentPadView$1$2$10$1(1, function182);
                                gapComposer2.updateRememberedValue(rememberedValue242);
                                Function2 function2222 = (Function2) rememberedValue242;
                                AnswerDispatcher answerDispatcher222 = (AnswerDispatcher) gapComposer2.consume(staticProvidableCompositionLocal2);
                                changed8 = gapComposer2.changed(function2222) | gapComposer2.changedInstance(answerDispatcher222);
                                rememberedValue11 = gapComposer2.rememberedValue();
                                if (!changed8) {
                                }
                                rememberedValue11 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function2222, answerDispatcher222, 2);
                                gapComposer2.updateRememberedValue(rememberedValue11);
                                Updater.DisposableEffect(answerDispatcher222, (Function1) rememberedValue11, gapComposer2);
                                changed9 = gapComposer2.changed(function182) | gapComposer2.changed(rememberUpdatedState2);
                                rememberedValue12 = gapComposer2.rememberedValue();
                                if (!changed9) {
                                }
                                rememberedValue12 = new MenuKt$$ExternalSyntheticLambda1(11, function182, mutableState92, rememberUpdatedState2);
                                gapComposer2.updateRememberedValue(rememberedValue12);
                                Function2 function2322 = (Function2) rememberedValue12;
                                AnswerDispatcher answerDispatcher322 = (AnswerDispatcher) gapComposer2.consume(staticProvidableCompositionLocal2);
                                changed10 = gapComposer2.changed(function2322) | gapComposer2.changedInstance(answerDispatcher322);
                                rememberedValue13 = gapComposer2.rememberedValue();
                                if (!changed10) {
                                }
                                rememberedValue13 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function2322, answerDispatcher322, 3);
                                gapComposer2.updateRememberedValue(rememberedValue13);
                                Updater.DisposableEffect(answerDispatcher322, (Function1) rememberedValue13, gapComposer2);
                                it5 = list6.iterator();
                                int i722 = 0;
                                while (it5.hasNext()) {
                                }
                                changed11 = gapComposer2.changed(list6) | gapComposer2.changed((LocationMenu) state5.getValue());
                                rememberedValue14 = gapComposer2.rememberedValue();
                                if (!changed11) {
                                }
                                rememberedValue14 = zzsq.toCheckoutSummaryLines(cart62, (LocationMenu) state5.getValue());
                                gapComposer2.updateRememberedValue(rememberedValue14);
                                List list1022 = (List) rememberedValue14;
                                currentTipAsMoney = checkoutTipState32.currentTipAsMoney(localMoney2.currencyCode);
                                if (LocalMoneysKt.isPositive(currentTipAsMoney)) {
                                }
                                if (computedOrderSummary2 != null) {
                                }
                                app.cash.local.primitives.LocalMoney plus22 = LocalMoneysKt.plus(localMoney2, currentTipAsMoney);
                                if (!z11) {
                                }
                                localMoney4 = orderBuilderModel.estimatedEarnings;
                                if (localMoney4 == null) {
                                }
                                state2 = state72;
                                pair = null;
                                ArrayList appliedGiftCards222 = appliedGiftCards(list5, localMoney2.currencyCode);
                                if (WhenMappings.$EnumSwitchMapping$0[reviewMode3.ordinal()] == 1) {
                                }
                                localBrandBannerModel3 = (LocalBrandBannerModel) state6.getValue();
                                if (localBrandBannerModel3 != null) {
                                }
                                if (localBrandBannerModel2 != null) {
                                }
                                String orderSummarySubtitle2222 = orderSummarySubtitle(i722, z11, plus22);
                                List filterNotNull222 = ArraysKt___ArraysKt.filterNotNull(new LocalBrandBannerModel[]{(LocalBrandBannerModel) state6.getValue(), localBrandBannerModel2});
                                LocalBrand.FulfillmentSelection fulfillmentSelection222 = ((Brand) state3.getValue()).fulfillmentSelection;
                                if (fulfillmentSelection222 != null) {
                                }
                                if (list3 == null) {
                                }
                                List list11222 = list3;
                                if (fulfillment3 != null) {
                                }
                                switch (localFulfillmentType != null ? WhenMappings.$EnumSwitchMapping$1[localFulfillmentType.ordinal()] : -1) {
                                }
                                String str35222 = str5;
                                ZoneId zoneId222 = ((Location.LocationDetail) state2.getValue()).summary.zoneId;
                                if (zoneId222 != null) {
                                }
                                String str36222 = ((Brand) state3.getValue()).name;
                                LocalImage localImage3222 = ((Brand) state3.getValue()).artworkImage;
                                LocalAddress address322 = models$lambda$29(state2).getAddress();
                                address322.getClass();
                                String str37222 = address322.address_single_line;
                                str37222.getClass();
                                LocalAddress address2222 = models$lambda$29(state2).getAddress();
                                address2222.getClass();
                                GpsCoordinates gpsCoordinates222 = LocalsKt.toGpsCoordinates(address2222);
                                LocalCheckoutOrderSummaryViewModel localCheckoutOrderSummaryViewModel222 = new LocalCheckoutOrderSummaryViewModel(i722, list1022, arrayList, true, 24);
                                LocalCheckoutPaymentSectionViewModel localCheckoutPaymentSectionViewModel222 = new LocalCheckoutPaymentSectionViewModel((String) jWECryptoParts22.header, (List) jWECryptoParts22.encryptedKey);
                                LocalCheckoutGiftCardSectionViewModel giftCardSection222 = giftCardSection(checkoutGiftCardState3, appliedGiftCards222, orderBuilderModel, gapComposer2);
                                LocalCheckoutTipSectionViewModel tipSection222 = tipSection(pair, checkoutTipState32);
                                if (currentlyOpen) {
                                }
                                LocalBrandLocationCheckoutViewModel.ReviewMode reviewMode5222 = reviewMode2;
                                LocalBottomModalViewModel localBottomModalViewModel222 = new LocalBottomModalViewModel(currentlyOpen, title, new LocalBottomModalViewModel.Payload.ItemInfo(androidStringManager.getString(formattedResource), LocalsKt.prettyPrint$default(plus22, false, str6, 7), z3 ? LocalsKt.prettyPrint$default(localMoney132, false, str6, 7) : str6, Long.valueOf(plus22.getAmount())), reviewMode5222 == LocalBrandLocationCheckoutViewModel.ReviewMode.IN_STORE_OPEN_TAB ? androidStringManager.get(R.string.local_presenters_pay) : androidStringManager.get(R.string.local_presenters_variations_place_order), orderBuilderModel.isWorkingAsync(), 16);
                                LocalCheckoutSpecialInstructionsViewModel localCheckoutSpecialInstructionsViewModel222 = new LocalCheckoutSpecialInstructionsViewModel(((Brand) state3.getValue()).name);
                                LocalBrand localBrand322 = (LocalBrand) mutableState102.getValue();
                                if (localBrand322 != null ? Intrinsics.areEqual(localBrand322.allow_checkout_notes, Boolean.TRUE) : false) {
                                }
                                LocalBrand localBrand2222 = (LocalBrand) mutableState102.getValue();
                                LocalBrandLocationCheckoutViewModel localBrandLocationCheckoutViewModel3222 = new LocalBrandLocationCheckoutViewModel(filterNotNull222, str35222, estimatedTime, pickup, list11222, validateForCheckout, str36222, localImage3222, str37222, gpsCoordinates222, orderSummarySubtitle2222, list1022, arrayList, localCheckoutOrderSummaryViewModel222, localCheckoutPaymentSectionViewModel222, giftCardSection222, tipSection222, orderType, reviewMode5222, curbsidePickupSection, localBottomModalViewModel222, r45, (localBrand2222 != null || (str7 = localBrand2222.policies) == null || StringsKt.isBlank(str7)) ? str6 : str7, couponSection, !orderBuilderModel.isWorkingAsync() || orderBuilderModel.updatingCart, 50331648);
                                gapComposer2.endReplaceGroup();
                                return localBrandLocationCheckoutViewModel3222;
                            }
                            if (fulfillmentConfiguration2 instanceof FulfillmentConfiguration.Pickup) {
                                LocalAddress localAddress3 = locationDetail3.summary.address;
                                Object obj8 = localAddress3 != null ? localAddress3.address_single_line : fulfillment2;
                                pickup = new LocalBrandLocationCartViewModel.Fulfillment.Pickup(obj8 == null ? "" : obj8, estimatedCompletion(fulfillmentConfigurations2, fulfillmentConfiguration2, false), estimatedCompletion(fulfillmentConfigurations2, fulfillmentConfiguration2, true), true, FulfillmentConfigurationKt.getSchedulingMode(fulfillmentConfiguration2), booleanValue);
                                rememberedValue8 = gapComposer2.rememberedValue();
                                if (rememberedValue8 == obj5) {
                                }
                                CoroutineScope coroutineScope22 = (CoroutineScope) rememberedValue8;
                                Function1 function1822 = function14;
                                changed5 = gapComposer2.changed(function1822) | gapComposer2.changedInstance(coroutineScope22) | gapComposer2.changedInstance(this);
                                rememberedValue9 = gapComposer2.rememberedValue();
                                if (!changed5) {
                                }
                                rememberedValue9 = new MenuKt$$ExternalSyntheticLambda1(10, coroutineScope22, function1822, (Object) this);
                                gapComposer2.updateRememberedValue(rememberedValue9);
                                Function2 function242 = (Function2) rememberedValue9;
                                StaticProvidableCompositionLocal staticProvidableCompositionLocal22 = AnswersKt.LocalAnswerDispatcher;
                                AnswerDispatcher answerDispatcher42 = (AnswerDispatcher) gapComposer2.consume(staticProvidableCompositionLocal22);
                                changed6 = gapComposer2.changed(function242) | gapComposer2.changedInstance(answerDispatcher42);
                                rememberedValue10 = gapComposer2.rememberedValue();
                                if (!changed6) {
                                }
                                rememberedValue10 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function242, answerDispatcher42, 1);
                                gapComposer2.updateRememberedValue(rememberedValue10);
                                Updater.DisposableEffect(answerDispatcher42, (Function1) rememberedValue10, gapComposer2);
                                localBrandBannerModel2 = localBrandBannerModel;
                                State state722 = state;
                                str4 = str2;
                                Cart cart622 = cart2;
                                JWECryptoParts jWECryptoParts222 = jWECryptoParts;
                                MutableState mutableState922 = mutableState2;
                                app.cash.local.primitives.LocalMoney localMoney1322 = localMoney3;
                                MutableState mutableState1022 = mutableState4;
                                CheckoutTipState checkoutTipState322 = checkoutTipState2;
                                Updater.LaunchedEffect(gapComposer2, flow, new ChatPresenter$models$$inlined$CollectEffect$1(flow, (Continuation) null, orderBuilderModel, (LocalBrandLocationCheckoutPresenter) this, function1822, validateForCheckout, jWECryptoParts222, checkoutTipState322, checkoutGiftCardState3, cart622, rememberUpdatedState5, state722, mutableState7, rememberUpdatedState, mutableState922));
                                changed7 = gapComposer2.changed(function1822);
                                Object rememberedValue2422 = gapComposer2.rememberedValue();
                                if (changed7) {
                                }
                                rememberedValue2422 = new MainPaymentPadViewKt$MainPaymentPadView$1$2$10$1(1, function1822);
                                gapComposer2.updateRememberedValue(rememberedValue2422);
                                Function2 function22222 = (Function2) rememberedValue2422;
                                AnswerDispatcher answerDispatcher2222 = (AnswerDispatcher) gapComposer2.consume(staticProvidableCompositionLocal22);
                                changed8 = gapComposer2.changed(function22222) | gapComposer2.changedInstance(answerDispatcher2222);
                                rememberedValue11 = gapComposer2.rememberedValue();
                                if (!changed8) {
                                }
                                rememberedValue11 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function22222, answerDispatcher2222, 2);
                                gapComposer2.updateRememberedValue(rememberedValue11);
                                Updater.DisposableEffect(answerDispatcher2222, (Function1) rememberedValue11, gapComposer2);
                                changed9 = gapComposer2.changed(function1822) | gapComposer2.changed(rememberUpdatedState2);
                                rememberedValue12 = gapComposer2.rememberedValue();
                                if (!changed9) {
                                }
                                rememberedValue12 = new MenuKt$$ExternalSyntheticLambda1(11, function1822, mutableState922, rememberUpdatedState2);
                                gapComposer2.updateRememberedValue(rememberedValue12);
                                Function2 function23222 = (Function2) rememberedValue12;
                                AnswerDispatcher answerDispatcher3222 = (AnswerDispatcher) gapComposer2.consume(staticProvidableCompositionLocal22);
                                changed10 = gapComposer2.changed(function23222) | gapComposer2.changedInstance(answerDispatcher3222);
                                rememberedValue13 = gapComposer2.rememberedValue();
                                if (!changed10) {
                                }
                                rememberedValue13 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function23222, answerDispatcher3222, 3);
                                gapComposer2.updateRememberedValue(rememberedValue13);
                                Updater.DisposableEffect(answerDispatcher3222, (Function1) rememberedValue13, gapComposer2);
                                it5 = list6.iterator();
                                int i7222 = 0;
                                while (it5.hasNext()) {
                                }
                                changed11 = gapComposer2.changed(list6) | gapComposer2.changed((LocationMenu) state5.getValue());
                                rememberedValue14 = gapComposer2.rememberedValue();
                                if (!changed11) {
                                }
                                rememberedValue14 = zzsq.toCheckoutSummaryLines(cart622, (LocationMenu) state5.getValue());
                                gapComposer2.updateRememberedValue(rememberedValue14);
                                List list10222 = (List) rememberedValue14;
                                currentTipAsMoney = checkoutTipState322.currentTipAsMoney(localMoney2.currencyCode);
                                if (LocalMoneysKt.isPositive(currentTipAsMoney)) {
                                }
                                if (computedOrderSummary2 != null) {
                                }
                                app.cash.local.primitives.LocalMoney plus222 = LocalMoneysKt.plus(localMoney2, currentTipAsMoney);
                                if (!z11) {
                                }
                                localMoney4 = orderBuilderModel.estimatedEarnings;
                                if (localMoney4 == null) {
                                }
                                state2 = state722;
                                pair = null;
                                ArrayList appliedGiftCards2222 = appliedGiftCards(list5, localMoney2.currencyCode);
                                if (WhenMappings.$EnumSwitchMapping$0[reviewMode3.ordinal()] == 1) {
                                }
                                localBrandBannerModel3 = (LocalBrandBannerModel) state6.getValue();
                                if (localBrandBannerModel3 != null) {
                                }
                                if (localBrandBannerModel2 != null) {
                                }
                                String orderSummarySubtitle22222 = orderSummarySubtitle(i7222, z11, plus222);
                                List filterNotNull2222 = ArraysKt___ArraysKt.filterNotNull(new LocalBrandBannerModel[]{(LocalBrandBannerModel) state6.getValue(), localBrandBannerModel2});
                                LocalBrand.FulfillmentSelection fulfillmentSelection2222 = ((Brand) state3.getValue()).fulfillmentSelection;
                                if (fulfillmentSelection2222 != null) {
                                }
                                if (list3 == null) {
                                }
                                List list112222 = list3;
                                if (fulfillment3 != null) {
                                }
                                switch (localFulfillmentType != null ? WhenMappings.$EnumSwitchMapping$1[localFulfillmentType.ordinal()] : -1) {
                                }
                                String str352222 = str5;
                                ZoneId zoneId2222 = ((Location.LocationDetail) state2.getValue()).summary.zoneId;
                                if (zoneId2222 != null) {
                                }
                                String str362222 = ((Brand) state3.getValue()).name;
                                LocalImage localImage32222 = ((Brand) state3.getValue()).artworkImage;
                                LocalAddress address3222 = models$lambda$29(state2).getAddress();
                                address3222.getClass();
                                String str372222 = address3222.address_single_line;
                                str372222.getClass();
                                LocalAddress address22222 = models$lambda$29(state2).getAddress();
                                address22222.getClass();
                                GpsCoordinates gpsCoordinates2222 = LocalsKt.toGpsCoordinates(address22222);
                                LocalCheckoutOrderSummaryViewModel localCheckoutOrderSummaryViewModel2222 = new LocalCheckoutOrderSummaryViewModel(i7222, list10222, arrayList, true, 24);
                                LocalCheckoutPaymentSectionViewModel localCheckoutPaymentSectionViewModel2222 = new LocalCheckoutPaymentSectionViewModel((String) jWECryptoParts222.header, (List) jWECryptoParts222.encryptedKey);
                                LocalCheckoutGiftCardSectionViewModel giftCardSection2222 = giftCardSection(checkoutGiftCardState3, appliedGiftCards2222, orderBuilderModel, gapComposer2);
                                LocalCheckoutTipSectionViewModel tipSection2222 = tipSection(pair, checkoutTipState322);
                                if (currentlyOpen) {
                                }
                                LocalBrandLocationCheckoutViewModel.ReviewMode reviewMode52222 = reviewMode2;
                                LocalBottomModalViewModel localBottomModalViewModel2222 = new LocalBottomModalViewModel(currentlyOpen, title, new LocalBottomModalViewModel.Payload.ItemInfo(androidStringManager.getString(formattedResource), LocalsKt.prettyPrint$default(plus222, false, str6, 7), z3 ? LocalsKt.prettyPrint$default(localMoney1322, false, str6, 7) : str6, Long.valueOf(plus222.getAmount())), reviewMode52222 == LocalBrandLocationCheckoutViewModel.ReviewMode.IN_STORE_OPEN_TAB ? androidStringManager.get(R.string.local_presenters_pay) : androidStringManager.get(R.string.local_presenters_variations_place_order), orderBuilderModel.isWorkingAsync(), 16);
                                LocalCheckoutSpecialInstructionsViewModel localCheckoutSpecialInstructionsViewModel2222 = new LocalCheckoutSpecialInstructionsViewModel(((Brand) state3.getValue()).name);
                                LocalBrand localBrand3222 = (LocalBrand) mutableState1022.getValue();
                                if (localBrand3222 != null ? Intrinsics.areEqual(localBrand3222.allow_checkout_notes, Boolean.TRUE) : false) {
                                }
                                LocalBrand localBrand22222 = (LocalBrand) mutableState1022.getValue();
                                LocalBrandLocationCheckoutViewModel localBrandLocationCheckoutViewModel32222 = new LocalBrandLocationCheckoutViewModel(filterNotNull2222, str352222, estimatedTime, pickup, list112222, validateForCheckout, str362222, localImage32222, str372222, gpsCoordinates2222, orderSummarySubtitle22222, list10222, arrayList, localCheckoutOrderSummaryViewModel2222, localCheckoutPaymentSectionViewModel2222, giftCardSection2222, tipSection2222, orderType, reviewMode52222, curbsidePickupSection, localBottomModalViewModel2222, r45, (localBrand22222 != null || (str7 = localBrand22222.policies) == null || StringsKt.isBlank(str7)) ? str6 : str7, couponSection, !orderBuilderModel.isWorkingAsync() || orderBuilderModel.updatingCart, 50331648);
                                gapComposer2.endReplaceGroup();
                                return localBrandLocationCheckoutViewModel32222;
                            }
                            if (!(fulfillmentConfiguration2 instanceof FulfillmentConfiguration.InStore) && !fulfillmentConfiguration2.equals(FulfillmentConfiguration.Unspecified.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                            }
                        }
                        pickup = fulfillment2;
                        rememberedValue8 = gapComposer2.rememberedValue();
                        if (rememberedValue8 == obj5) {
                        }
                        CoroutineScope coroutineScope222 = (CoroutineScope) rememberedValue8;
                        Function1 function18222 = function14;
                        changed5 = gapComposer2.changed(function18222) | gapComposer2.changedInstance(coroutineScope222) | gapComposer2.changedInstance(this);
                        rememberedValue9 = gapComposer2.rememberedValue();
                        if (!changed5) {
                        }
                        rememberedValue9 = new MenuKt$$ExternalSyntheticLambda1(10, coroutineScope222, function18222, (Object) this);
                        gapComposer2.updateRememberedValue(rememberedValue9);
                        Function2 function2422 = (Function2) rememberedValue9;
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal222 = AnswersKt.LocalAnswerDispatcher;
                        AnswerDispatcher answerDispatcher422 = (AnswerDispatcher) gapComposer2.consume(staticProvidableCompositionLocal222);
                        changed6 = gapComposer2.changed(function2422) | gapComposer2.changedInstance(answerDispatcher422);
                        rememberedValue10 = gapComposer2.rememberedValue();
                        if (!changed6) {
                        }
                        rememberedValue10 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function2422, answerDispatcher422, 1);
                        gapComposer2.updateRememberedValue(rememberedValue10);
                        Updater.DisposableEffect(answerDispatcher422, (Function1) rememberedValue10, gapComposer2);
                        localBrandBannerModel2 = localBrandBannerModel;
                        State state7222 = state;
                        str4 = str2;
                        Cart cart6222 = cart2;
                        JWECryptoParts jWECryptoParts2222 = jWECryptoParts;
                        MutableState mutableState9222 = mutableState2;
                        app.cash.local.primitives.LocalMoney localMoney13222 = localMoney3;
                        MutableState mutableState10222 = mutableState4;
                        CheckoutTipState checkoutTipState3222 = checkoutTipState2;
                        Updater.LaunchedEffect(gapComposer2, flow, new ChatPresenter$models$$inlined$CollectEffect$1(flow, (Continuation) null, orderBuilderModel, (LocalBrandLocationCheckoutPresenter) this, function18222, validateForCheckout, jWECryptoParts2222, checkoutTipState3222, checkoutGiftCardState3, cart6222, rememberUpdatedState5, state7222, mutableState7, rememberUpdatedState, mutableState9222));
                        changed7 = gapComposer2.changed(function18222);
                        Object rememberedValue24222 = gapComposer2.rememberedValue();
                        if (changed7) {
                        }
                        rememberedValue24222 = new MainPaymentPadViewKt$MainPaymentPadView$1$2$10$1(1, function18222);
                        gapComposer2.updateRememberedValue(rememberedValue24222);
                        Function2 function222222 = (Function2) rememberedValue24222;
                        AnswerDispatcher answerDispatcher22222 = (AnswerDispatcher) gapComposer2.consume(staticProvidableCompositionLocal222);
                        changed8 = gapComposer2.changed(function222222) | gapComposer2.changedInstance(answerDispatcher22222);
                        rememberedValue11 = gapComposer2.rememberedValue();
                        if (!changed8) {
                        }
                        rememberedValue11 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function222222, answerDispatcher22222, 2);
                        gapComposer2.updateRememberedValue(rememberedValue11);
                        Updater.DisposableEffect(answerDispatcher22222, (Function1) rememberedValue11, gapComposer2);
                        changed9 = gapComposer2.changed(function18222) | gapComposer2.changed(rememberUpdatedState2);
                        rememberedValue12 = gapComposer2.rememberedValue();
                        if (!changed9) {
                        }
                        rememberedValue12 = new MenuKt$$ExternalSyntheticLambda1(11, function18222, mutableState9222, rememberUpdatedState2);
                        gapComposer2.updateRememberedValue(rememberedValue12);
                        Function2 function232222 = (Function2) rememberedValue12;
                        AnswerDispatcher answerDispatcher32222 = (AnswerDispatcher) gapComposer2.consume(staticProvidableCompositionLocal222);
                        changed10 = gapComposer2.changed(function232222) | gapComposer2.changedInstance(answerDispatcher32222);
                        rememberedValue13 = gapComposer2.rememberedValue();
                        if (!changed10) {
                        }
                        rememberedValue13 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function232222, answerDispatcher32222, 3);
                        gapComposer2.updateRememberedValue(rememberedValue13);
                        Updater.DisposableEffect(answerDispatcher32222, (Function1) rememberedValue13, gapComposer2);
                        it5 = list6.iterator();
                        int i72222 = 0;
                        while (it5.hasNext()) {
                        }
                        changed11 = gapComposer2.changed(list6) | gapComposer2.changed((LocationMenu) state5.getValue());
                        rememberedValue14 = gapComposer2.rememberedValue();
                        if (!changed11) {
                        }
                        rememberedValue14 = zzsq.toCheckoutSummaryLines(cart6222, (LocationMenu) state5.getValue());
                        gapComposer2.updateRememberedValue(rememberedValue14);
                        List list102222 = (List) rememberedValue14;
                        currentTipAsMoney = checkoutTipState3222.currentTipAsMoney(localMoney2.currencyCode);
                        if (LocalMoneysKt.isPositive(currentTipAsMoney)) {
                        }
                        if (computedOrderSummary2 != null) {
                        }
                        app.cash.local.primitives.LocalMoney plus2222 = LocalMoneysKt.plus(localMoney2, currentTipAsMoney);
                        if (!z11) {
                        }
                        localMoney4 = orderBuilderModel.estimatedEarnings;
                        if (localMoney4 == null) {
                        }
                        state2 = state7222;
                        pair = null;
                        ArrayList appliedGiftCards22222 = appliedGiftCards(list5, localMoney2.currencyCode);
                        if (WhenMappings.$EnumSwitchMapping$0[reviewMode3.ordinal()] == 1) {
                        }
                        localBrandBannerModel3 = (LocalBrandBannerModel) state6.getValue();
                        if (localBrandBannerModel3 != null) {
                        }
                        if (localBrandBannerModel2 != null) {
                        }
                        String orderSummarySubtitle222222 = orderSummarySubtitle(i72222, z11, plus2222);
                        List filterNotNull22222 = ArraysKt___ArraysKt.filterNotNull(new LocalBrandBannerModel[]{(LocalBrandBannerModel) state6.getValue(), localBrandBannerModel2});
                        LocalBrand.FulfillmentSelection fulfillmentSelection22222 = ((Brand) state3.getValue()).fulfillmentSelection;
                        if (fulfillmentSelection22222 != null) {
                        }
                        if (list3 == null) {
                        }
                        List list1122222 = list3;
                        if (fulfillment3 != null) {
                        }
                        switch (localFulfillmentType != null ? WhenMappings.$EnumSwitchMapping$1[localFulfillmentType.ordinal()] : -1) {
                        }
                        String str3522222 = str5;
                        ZoneId zoneId22222 = ((Location.LocationDetail) state2.getValue()).summary.zoneId;
                        if (zoneId22222 != null) {
                        }
                        String str3622222 = ((Brand) state3.getValue()).name;
                        LocalImage localImage322222 = ((Brand) state3.getValue()).artworkImage;
                        LocalAddress address32222 = models$lambda$29(state2).getAddress();
                        address32222.getClass();
                        String str3722222 = address32222.address_single_line;
                        str3722222.getClass();
                        LocalAddress address222222 = models$lambda$29(state2).getAddress();
                        address222222.getClass();
                        GpsCoordinates gpsCoordinates22222 = LocalsKt.toGpsCoordinates(address222222);
                        LocalCheckoutOrderSummaryViewModel localCheckoutOrderSummaryViewModel22222 = new LocalCheckoutOrderSummaryViewModel(i72222, list102222, arrayList, true, 24);
                        LocalCheckoutPaymentSectionViewModel localCheckoutPaymentSectionViewModel22222 = new LocalCheckoutPaymentSectionViewModel((String) jWECryptoParts2222.header, (List) jWECryptoParts2222.encryptedKey);
                        LocalCheckoutGiftCardSectionViewModel giftCardSection22222 = giftCardSection(checkoutGiftCardState3, appliedGiftCards22222, orderBuilderModel, gapComposer2);
                        LocalCheckoutTipSectionViewModel tipSection22222 = tipSection(pair, checkoutTipState3222);
                        if (currentlyOpen) {
                        }
                        LocalBrandLocationCheckoutViewModel.ReviewMode reviewMode522222 = reviewMode2;
                        LocalBottomModalViewModel localBottomModalViewModel22222 = new LocalBottomModalViewModel(currentlyOpen, title, new LocalBottomModalViewModel.Payload.ItemInfo(androidStringManager.getString(formattedResource), LocalsKt.prettyPrint$default(plus2222, false, str6, 7), z3 ? LocalsKt.prettyPrint$default(localMoney13222, false, str6, 7) : str6, Long.valueOf(plus2222.getAmount())), reviewMode522222 == LocalBrandLocationCheckoutViewModel.ReviewMode.IN_STORE_OPEN_TAB ? androidStringManager.get(R.string.local_presenters_pay) : androidStringManager.get(R.string.local_presenters_variations_place_order), orderBuilderModel.isWorkingAsync(), 16);
                        LocalCheckoutSpecialInstructionsViewModel localCheckoutSpecialInstructionsViewModel22222 = new LocalCheckoutSpecialInstructionsViewModel(((Brand) state3.getValue()).name);
                        LocalBrand localBrand32222 = (LocalBrand) mutableState10222.getValue();
                        if (localBrand32222 != null ? Intrinsics.areEqual(localBrand32222.allow_checkout_notes, Boolean.TRUE) : false) {
                        }
                        LocalBrand localBrand222222 = (LocalBrand) mutableState10222.getValue();
                        LocalBrandLocationCheckoutViewModel localBrandLocationCheckoutViewModel322222 = new LocalBrandLocationCheckoutViewModel(filterNotNull22222, str3522222, estimatedTime, pickup, list1122222, validateForCheckout, str3622222, localImage322222, str3722222, gpsCoordinates22222, orderSummarySubtitle222222, list102222, arrayList, localCheckoutOrderSummaryViewModel22222, localCheckoutPaymentSectionViewModel22222, giftCardSection22222, tipSection22222, orderType, reviewMode522222, curbsidePickupSection, localBottomModalViewModel22222, r45, (localBrand222222 != null || (str7 = localBrand222222.policies) == null || StringsKt.isBlank(str7)) ? str6 : str7, couponSection, !orderBuilderModel.isWorkingAsync() || orderBuilderModel.updatingCart, 50331648);
                        gapComposer2.endReplaceGroup();
                        return localBrandLocationCheckoutViewModel322222;
                    }
                }
                function13 = function12;
                curbsidePickupSection = null;
                Location.LocationDetail locationDetail4 = (Location.LocationDetail) state4.getValue();
                LocalFulfillmentType localFulfillmentType22 = LocalFulfillmentType.LOCAL_FULFILLMENT_TYPE_UNSPECIFIED;
                locationDetail4.getClass();
                localFulfillmentType22.getClass();
                currentlyOpen = LocationsKt.currentlyOpen(this.clock, locationDetail4.openState(localFulfillmentType22));
                rememberedValue6 = gapComposer2.rememberedValue();
                if (rememberedValue6 == obj5) {
                }
                State state52 = (State) rememberedValue6;
                changed4 = gapComposer2.changed((LocalCashBalance) collectAsState3.getValue()) | gapComposer2.changed(minus2) | gapComposer2.changed(orderBuilderModel.redeemLocalCash);
                rememberedValue7 = gapComposer2.rememberedValue();
                if (!changed4) {
                }
                rememberedValue7 = Updater.derivedStateOf(new l2$$ExternalSyntheticLambda7(orderBuilderModel, minus2, state3, collectAsState3, 5));
                gapComposer2.updateRememberedValue(rememberedValue7);
                State state62 = (State) rememberedValue7;
                cartLoyaltySummary = orderBuilderModel.loyaltySummary;
                if (cartLoyaltySummary == null) {
                }
                List list92 = orderBuilderModel.discountCodes;
                ArrayList arrayList112 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list92, 10));
                it4 = list92.iterator();
                while (it4.hasNext()) {
                }
                String str302 = androidStringManager2.get(R.string.local_presenters_coupon_enter_code);
                LocalErrorResponse.Error error2 = orderBuilderModel.discountCodesError;
                CouponSection couponSection2 = new CouponSection(arrayList112, str302, error2 == null ? error2.message : null);
                fulfillmentConfigurations = (FulfillmentConfigurations) mutableState.getValue();
                fulfillment = orderBuilderModel.fulfillment;
                Location.LocationDetail locationDetail22 = (Location.LocationDetail) state.getValue();
                if (fulfillment != null) {
                }
                if (fulfillmentConfigurations != null) {
                }
                fulfillmentConfiguration = null;
                if (fulfillmentConfiguration == null) {
                }
                MutableState rememberUpdatedState52 = Updater.rememberUpdatedState(fulfillmentConfiguration2, gapComposer2);
                reviewMode = localBrandLocationCheckoutScreen.reviewMode;
                FulfillmentConfigurations fulfillmentConfigurations22 = (FulfillmentConfigurations) mutableState.getValue();
                Location.LocationDetail locationDetail32 = (Location.LocationDetail) state.getValue();
                boolean booleanValue2 = ((Boolean) mutableState7.getValue()).booleanValue();
                if (reviewMode != LocalBrandLocationCheckoutScreen.ReviewMode.IN_STORE_OPEN_TAB) {
                }
                pickup = fulfillment2;
                rememberedValue8 = gapComposer2.rememberedValue();
                if (rememberedValue8 == obj5) {
                }
                CoroutineScope coroutineScope2222 = (CoroutineScope) rememberedValue8;
                Function1 function182222 = function14;
                changed5 = gapComposer2.changed(function182222) | gapComposer2.changedInstance(coroutineScope2222) | gapComposer2.changedInstance(this);
                rememberedValue9 = gapComposer2.rememberedValue();
                if (!changed5) {
                }
                rememberedValue9 = new MenuKt$$ExternalSyntheticLambda1(10, coroutineScope2222, function182222, (Object) this);
                gapComposer2.updateRememberedValue(rememberedValue9);
                Function2 function24222 = (Function2) rememberedValue9;
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2222 = AnswersKt.LocalAnswerDispatcher;
                AnswerDispatcher answerDispatcher4222 = (AnswerDispatcher) gapComposer2.consume(staticProvidableCompositionLocal2222);
                changed6 = gapComposer2.changed(function24222) | gapComposer2.changedInstance(answerDispatcher4222);
                rememberedValue10 = gapComposer2.rememberedValue();
                if (!changed6) {
                }
                rememberedValue10 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function24222, answerDispatcher4222, 1);
                gapComposer2.updateRememberedValue(rememberedValue10);
                Updater.DisposableEffect(answerDispatcher4222, (Function1) rememberedValue10, gapComposer2);
                localBrandBannerModel2 = localBrandBannerModel;
                State state72222 = state;
                str4 = str2;
                Cart cart62222 = cart2;
                JWECryptoParts jWECryptoParts22222 = jWECryptoParts;
                MutableState mutableState92222 = mutableState2;
                app.cash.local.primitives.LocalMoney localMoney132222 = localMoney3;
                MutableState mutableState102222 = mutableState4;
                CheckoutTipState checkoutTipState32222 = checkoutTipState2;
                Updater.LaunchedEffect(gapComposer2, flow, new ChatPresenter$models$$inlined$CollectEffect$1(flow, (Continuation) null, orderBuilderModel, (LocalBrandLocationCheckoutPresenter) this, function182222, validateForCheckout, jWECryptoParts22222, checkoutTipState32222, checkoutGiftCardState3, cart62222, rememberUpdatedState52, state72222, mutableState7, rememberUpdatedState, mutableState92222));
                changed7 = gapComposer2.changed(function182222);
                Object rememberedValue242222 = gapComposer2.rememberedValue();
                if (changed7) {
                }
                rememberedValue242222 = new MainPaymentPadViewKt$MainPaymentPadView$1$2$10$1(1, function182222);
                gapComposer2.updateRememberedValue(rememberedValue242222);
                Function2 function2222222 = (Function2) rememberedValue242222;
                AnswerDispatcher answerDispatcher222222 = (AnswerDispatcher) gapComposer2.consume(staticProvidableCompositionLocal2222);
                changed8 = gapComposer2.changed(function2222222) | gapComposer2.changedInstance(answerDispatcher222222);
                rememberedValue11 = gapComposer2.rememberedValue();
                if (!changed8) {
                }
                rememberedValue11 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function2222222, answerDispatcher222222, 2);
                gapComposer2.updateRememberedValue(rememberedValue11);
                Updater.DisposableEffect(answerDispatcher222222, (Function1) rememberedValue11, gapComposer2);
                changed9 = gapComposer2.changed(function182222) | gapComposer2.changed(rememberUpdatedState2);
                rememberedValue12 = gapComposer2.rememberedValue();
                if (!changed9) {
                }
                rememberedValue12 = new MenuKt$$ExternalSyntheticLambda1(11, function182222, mutableState92222, rememberUpdatedState2);
                gapComposer2.updateRememberedValue(rememberedValue12);
                Function2 function2322222 = (Function2) rememberedValue12;
                AnswerDispatcher answerDispatcher322222 = (AnswerDispatcher) gapComposer2.consume(staticProvidableCompositionLocal2222);
                changed10 = gapComposer2.changed(function2322222) | gapComposer2.changedInstance(answerDispatcher322222);
                rememberedValue13 = gapComposer2.rememberedValue();
                if (!changed10) {
                }
                rememberedValue13 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function2322222, answerDispatcher322222, 3);
                gapComposer2.updateRememberedValue(rememberedValue13);
                Updater.DisposableEffect(answerDispatcher322222, (Function1) rememberedValue13, gapComposer2);
                it5 = list6.iterator();
                int i722222 = 0;
                while (it5.hasNext()) {
                }
                changed11 = gapComposer2.changed(list6) | gapComposer2.changed((LocationMenu) state52.getValue());
                rememberedValue14 = gapComposer2.rememberedValue();
                if (!changed11) {
                }
                rememberedValue14 = zzsq.toCheckoutSummaryLines(cart62222, (LocationMenu) state52.getValue());
                gapComposer2.updateRememberedValue(rememberedValue14);
                List list1022222 = (List) rememberedValue14;
                currentTipAsMoney = checkoutTipState32222.currentTipAsMoney(localMoney2.currencyCode);
                if (LocalMoneysKt.isPositive(currentTipAsMoney)) {
                }
                if (computedOrderSummary2 != null) {
                }
                app.cash.local.primitives.LocalMoney plus22222 = LocalMoneysKt.plus(localMoney2, currentTipAsMoney);
                if (!z11) {
                }
                localMoney4 = orderBuilderModel.estimatedEarnings;
                if (localMoney4 == null) {
                }
                state2 = state72222;
                pair = null;
                ArrayList appliedGiftCards222222 = appliedGiftCards(list5, localMoney2.currencyCode);
                if (WhenMappings.$EnumSwitchMapping$0[reviewMode3.ordinal()] == 1) {
                }
                localBrandBannerModel3 = (LocalBrandBannerModel) state62.getValue();
                if (localBrandBannerModel3 != null) {
                }
                if (localBrandBannerModel2 != null) {
                }
                String orderSummarySubtitle2222222 = orderSummarySubtitle(i722222, z11, plus22222);
                List filterNotNull222222 = ArraysKt___ArraysKt.filterNotNull(new LocalBrandBannerModel[]{(LocalBrandBannerModel) state62.getValue(), localBrandBannerModel2});
                LocalBrand.FulfillmentSelection fulfillmentSelection222222 = ((Brand) state3.getValue()).fulfillmentSelection;
                if (fulfillmentSelection222222 != null) {
                }
                if (list3 == null) {
                }
                List list11222222 = list3;
                if (fulfillment3 != null) {
                }
                switch (localFulfillmentType != null ? WhenMappings.$EnumSwitchMapping$1[localFulfillmentType.ordinal()] : -1) {
                }
                String str35222222 = str5;
                ZoneId zoneId222222 = ((Location.LocationDetail) state2.getValue()).summary.zoneId;
                if (zoneId222222 != null) {
                }
                String str36222222 = ((Brand) state3.getValue()).name;
                LocalImage localImage3222222 = ((Brand) state3.getValue()).artworkImage;
                LocalAddress address322222 = models$lambda$29(state2).getAddress();
                address322222.getClass();
                String str37222222 = address322222.address_single_line;
                str37222222.getClass();
                LocalAddress address2222222 = models$lambda$29(state2).getAddress();
                address2222222.getClass();
                GpsCoordinates gpsCoordinates222222 = LocalsKt.toGpsCoordinates(address2222222);
                LocalCheckoutOrderSummaryViewModel localCheckoutOrderSummaryViewModel222222 = new LocalCheckoutOrderSummaryViewModel(i722222, list1022222, arrayList, true, 24);
                LocalCheckoutPaymentSectionViewModel localCheckoutPaymentSectionViewModel222222 = new LocalCheckoutPaymentSectionViewModel((String) jWECryptoParts22222.header, (List) jWECryptoParts22222.encryptedKey);
                LocalCheckoutGiftCardSectionViewModel giftCardSection222222 = giftCardSection(checkoutGiftCardState3, appliedGiftCards222222, orderBuilderModel, gapComposer2);
                LocalCheckoutTipSectionViewModel tipSection222222 = tipSection(pair, checkoutTipState32222);
                if (currentlyOpen) {
                }
                LocalBrandLocationCheckoutViewModel.ReviewMode reviewMode5222222 = reviewMode2;
                LocalBottomModalViewModel localBottomModalViewModel222222 = new LocalBottomModalViewModel(currentlyOpen, title, new LocalBottomModalViewModel.Payload.ItemInfo(androidStringManager.getString(formattedResource), LocalsKt.prettyPrint$default(plus22222, false, str6, 7), z3 ? LocalsKt.prettyPrint$default(localMoney132222, false, str6, 7) : str6, Long.valueOf(plus22222.getAmount())), reviewMode5222222 == LocalBrandLocationCheckoutViewModel.ReviewMode.IN_STORE_OPEN_TAB ? androidStringManager.get(R.string.local_presenters_pay) : androidStringManager.get(R.string.local_presenters_variations_place_order), orderBuilderModel.isWorkingAsync(), 16);
                LocalCheckoutSpecialInstructionsViewModel localCheckoutSpecialInstructionsViewModel222222 = new LocalCheckoutSpecialInstructionsViewModel(((Brand) state3.getValue()).name);
                LocalBrand localBrand322222 = (LocalBrand) mutableState102222.getValue();
                if (localBrand322222 != null ? Intrinsics.areEqual(localBrand322222.allow_checkout_notes, Boolean.TRUE) : false) {
                }
                LocalBrand localBrand2222222 = (LocalBrand) mutableState102222.getValue();
                LocalBrandLocationCheckoutViewModel localBrandLocationCheckoutViewModel3222222 = new LocalBrandLocationCheckoutViewModel(filterNotNull222222, str35222222, estimatedTime, pickup, list11222222, validateForCheckout, str36222222, localImage3222222, str37222222, gpsCoordinates222222, orderSummarySubtitle2222222, list1022222, arrayList, localCheckoutOrderSummaryViewModel222222, localCheckoutPaymentSectionViewModel222222, giftCardSection222222, tipSection222222, orderType, reviewMode5222222, curbsidePickupSection, localBottomModalViewModel222222, r45, (localBrand2222222 != null || (str7 = localBrand2222222.policies) == null || StringsKt.isBlank(str7)) ? str6 : str7, couponSection2, !orderBuilderModel.isWorkingAsync() || orderBuilderModel.updatingCart, 50331648);
                gapComposer2.endReplaceGroup();
                return localBrandLocationCheckoutViewModel3222222;
            }
            isPositive = LocalMoneysKt.isPositive(localMoney);
        }
        z = isPositive;
        Cart cart32 = orderBuilderModel.cart;
        changed = r82.changed(list4);
        Object rememberedValue212 = r82.rememberedValue();
        if (changed) {
        }
        ArrayList arrayList22 = new ArrayList();
        while (r7.hasNext()) {
        }
        mutableState = collectAsState5;
        r82.updateRememberedValue(arrayList22);
        obj = arrayList22;
        list = (List) obj;
        if (localBrandLocationCheckoutScreen2.tippingEnabled) {
        }
        WorkLauncherImpl workLauncherImpl4 = CheckoutTipStateKt.CheckoutTipStateSaver;
        list.getClass();
        cart32.getClass();
        List list62 = cart32.lines;
        list2 = cart32.summaryLines;
        localMoney2 = cart32.total;
        function15.getClass();
        Object[] objArr6 = new Object[0];
        WorkLauncherImpl workLauncherImpl22 = CheckoutTipStateKt.CheckoutTipStateSaver;
        changedInstance = r82.changedInstance(localMoney7) | r82.changedInstance(list);
        rememberedValue = r82.rememberedValue();
        int i52 = 8;
        if (!changedInstance) {
        }
        rememberedValue = new StatusRunnable$$ExternalSyntheticLambda1(i52, localMoney7, list);
        r82.updateRememberedValue(rememberedValue);
        checkoutTipState = (CheckoutTipState) SaverKt.m581rememberSaveable(objArr6, (Saver) workLauncherImpl22, (Function0) rememberedValue, (Composer) r82, 0);
        MutableState rememberUpdatedState32 = Updater.rememberUpdatedState(cart32, r82);
        function1 = function15;
        MutableState rememberUpdatedState42 = Updater.rememberUpdatedState(function1, r82);
        String str142 = (String) checkoutTipState.currentTip$delegate.getValue();
        changed2 = r82.changed(z6) | r82.changed(rememberUpdatedState42) | r82.changedInstance(checkoutTipState) | r82.changed(rememberUpdatedState32);
        boolean z72 = z6;
        rememberedValue2 = r82.rememberedValue();
        if (changed2) {
        }
        checkoutTipState2 = checkoutTipState;
        rememberedValue2 = new CheckoutTipStateKt$rememberCheckoutTipState$1$1(z72, checkoutTipState2, rememberUpdatedState42, rememberUpdatedState32, (Continuation) null, 0);
        r82.updateRememberedValue(rememberedValue2);
        Updater.LaunchedEffect((Composer) r82, str142, (Function2) rememberedValue2);
        int size2 = list5.size();
        Object[] objArr22 = new Object[0];
        WorkLauncherImpl workLauncherImpl32 = CheckoutGiftCardStateKt.CheckoutGiftCardStateSaver;
        rememberedValue3 = r82.rememberedValue();
        if (rememberedValue3 == obj5) {
        }
        checkoutGiftCardState = (CheckoutGiftCardState) SaverKt.m581rememberSaveable(objArr22, (Saver) workLauncherImpl32, (Function0) rememberedValue3, (Composer) r82, MLKEMEngine.KyberPolyBytes);
        Integer valueOf2 = Integer.valueOf(size2);
        changed3 = r82.changed(checkoutGiftCardState) | r82.changed(size2);
        rememberedValue4 = r82.rememberedValue();
        if (!changed3) {
        }
        rememberedValue4 = new BlockRunner$cancel$1(checkoutGiftCardState, size2, (Continuation) null);
        r82.updateRememberedValue(rememberedValue4);
        Updater.LaunchedEffect((Composer) r82, valueOf2, (Function2) rememberedValue4);
        Object[] objArr32 = new Object[0];
        rememberedValue5 = r82.rememberedValue();
        if (rememberedValue5 == obj5) {
        }
        MutableState mutableState72 = (MutableState) SaverKt.rememberSaveable(objArr32, (Function0) rememberedValue5, r82, 48);
        OrderBuilderModel.PaymentMethodConfig paymentMethodConfig2 = orderBuilderModel.paymentMethodConfig;
        String str152 = (String) collectAsState4.getValue();
        if (reviewMode3 != LocalBrandLocationCheckoutScreen.ReviewMode.IN_STORE_OPEN_TAB) {
        }
        CheckoutGiftCardState checkoutGiftCardState32 = checkoutGiftCardState2;
        computedOrderSummary = computedOrderSummary4;
        rememberCheckoutPaymentState = zzsr.rememberCheckoutPaymentState(cart, paymentMethodConfig2, str152, z2, androidStringManager2, gapComposer, 0);
        GapComposer gapComposer22 = gapComposer;
        Cart cart42 = cart;
        if (computedOrderSummary != null) {
        }
        app.cash.local.primitives.LocalMoney localMoney82 = localMoney2;
        app.cash.local.primitives.LocalMoney displayTotal2 = CashAppServiceModule.getDisplayTotal(orderBuilderModel);
        if (computedOrderSummary != null) {
        }
        List list72 = list2;
        jWECryptoParts = rememberCheckoutPaymentState;
        mutableState2 = mutableState5;
        ArrayList arrayList32 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list72, 10));
        it = list72.iterator();
        while (it.hasNext()) {
        }
        ArrayList arrayList42 = new ArrayList();
        it2 = arrayList32.iterator();
        while (it2.hasNext()) {
        }
        localBrandLocationCheckoutScreen = localBrandLocationCheckoutScreen2;
        function12 = function1;
        app.cash.local.primitives.LocalMoney zero2 = LocalMoneysKt.zero(LocalCurrencyCode.USD);
        it3 = arrayList42.iterator();
        while (it3.hasNext()) {
        }
        minus = LocalMoneysKt.minus(localMoney82, zero2);
        if (computedOrderSummary == null) {
            minus = LocalMoneysKt.plus(minus, localMoney7);
        }
        app.cash.local.primitives.LocalMoney localMoney102 = minus;
        if (computedOrderSummary == null) {
        }
        if (computedOrderSummary != null) {
        }
        minus2 = LocalMoneysKt.minus(cart42.serverCalculatedTotal, localMoney82);
        if (computedOrderSummary == null) {
        }
        if (((LocalBrand) collectAsState2.getValue()) != null) {
        }
    }

    public final String orderSummarySubtitle(int i, boolean z, app.cash.local.primitives.LocalMoney localMoney) {
        FormattedResource formattedResource = z ? new FormattedResource(R.string.local_presenters_items_count_with_tip, NavAction$$ExternalSyntheticOutline0.m(1, Integer.valueOf(i), "count")) : new FormattedResource(R.string.local_presenters_items_count, NavAction$$ExternalSyntheticOutline0.m(1, Integer.valueOf(i), "count"));
        AndroidStringManager androidStringManager = this.stringManager;
        return String.format(androidStringManager.get(R.string.local_presenters_order_summary_subtitle), Arrays.copyOf(new Object[]{Countries.getString(androidStringManager.resources, formattedResource), LocalsKt.prettyPrint$default(localMoney, false, null, 7)}, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LocalCheckoutTipSectionViewModel tipSection(Pair pair, CheckoutTipState checkoutTipState) {
        String str;
        String str2;
        String str3;
        List list = checkoutTipState.suggestions;
        LocalBrandLocationCheckoutScreen localBrandLocationCheckoutScreen = this.screen;
        if (!localBrandLocationCheckoutScreen.tippingEnabled || list.isEmpty()) {
            return null;
        }
        String str4 = (String) checkoutTipState.currentTipLocalCashEarningsLabel$delegate.getValue();
        Integer num = (Integer) checkoutTipState.selectedTipIndex$delegate.getValue();
        AndroidStringManager androidStringManager = this.stringManager;
        if ((pair == null || (str = (String) pair.first) == null) && (str = localBrandLocationCheckoutScreen.tippingTitle) == null) {
            str = androidStringManager.get(R.string.local_presenters_tip_title);
        }
        String str5 = str;
        if (pair == null || (str3 = (String) pair.second) == null) {
            if (str4 != null) {
                str2 = str4;
                boolean z = (pair == null ? (String) pair.second : null) == null || str4 != null;
                String str6 = (String) checkoutTipState.overrideTip$delegate.getValue();
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    LocalTippingConfiguration.Suggestion suggestion = (LocalTippingConfiguration.Suggestion) obj;
                    LocalMoney localMoney = suggestion.tip_amount;
                    TipOption tipOption = localMoney != null ? new TipOption(LocalsKt.prettyPrint$default(LocalMoneyKt.toMoney(localMoney), false, null, 7), num == null ? Intrinsics.areEqual(suggestion.selected_by_default, Boolean.TRUE) : num.intValue() >= 0 && i == num.intValue()) : null;
                    if (tipOption != null) {
                        arrayList.add(tipOption);
                    }
                    i = i2;
                }
                return new LocalCheckoutTipSectionViewModel(str5, str2, str6, localBrandLocationCheckoutScreen.earningsConfigurationFinePrint, arrayList, z);
            }
            str3 = localBrandLocationCheckoutScreen.tippingSubtitle;
            if (str3 == null) {
                str3 = androidStringManager.get(R.string.local_presenters_tip_subtitle_staff);
            }
        }
        str2 = str3;
        if ((pair == null ? (String) pair.second : null) == null) {
        }
        String str62 = (String) checkoutTipState.overrideTip$delegate.getValue();
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        while (r0.hasNext()) {
        }
        return new LocalCheckoutTipSectionViewModel(str5, str2, str62, localBrandLocationCheckoutScreen.earningsConfigurationFinePrint, arrayList2, z);
    }
}
