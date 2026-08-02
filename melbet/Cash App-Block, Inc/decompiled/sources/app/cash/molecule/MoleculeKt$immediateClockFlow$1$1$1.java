package app.cash.molecule;

import android.net.Uri;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.pager.DefaultPagerState;
import androidx.compose.material3.DateInputKt;
import androidx.compose.material3.internal.CalendarModelImpl;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.material3.internal.Icons$Filled;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotMapKeySet;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import androidx.compose.runtime.snapshots.StateMapMutableKeysIterator;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.net.UriKt;
import androidx.core.os.BundleKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.local.backend.CartBuilder;
import app.cash.local.backend.real.RealCartBuilder;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.brand.checkout.LocalBrandLocationCheckoutPresenter;
import app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter;
import app.cash.local.presenters.brand.profile.LocalBrandProfilePresenterKt;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.primitives.BrandToken;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.LocationMenu$$ExternalSyntheticLambda6;
import app.cash.local.primitives.PaymentMethodToken;
import app.cash.local.screens.app.LocalBrandLocationCheckoutScreen;
import app.cash.local.viewmodels.LocalCheckoutPaymentTimingViewModel;
import app.cash.local.viewmodels.OrderBuilderEvent;
import app.cash.local.viewmodels.OrderBuilderModel;
import app.cash.redwood.CombinedModifier$$ExternalSyntheticLambda0;
import app.cash.versioned.Versioned;
import coil3.size.SizeKt;
import com.fillr.featuretoggle.UnleashContext;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cardcustomizations.signature.SignatureState;
import com.squareup.cardcustomizations.stampview.StampState;
import com.squareup.cash.account.screens.Account;
import com.squareup.cash.amountslider.viewmodels.AmountSelection;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.bitcoin.navigation.RealBitcoinRefreshInvoiceManager;
import com.squareup.cash.bitcoin.presenters.transfer.BitcoinTransferPresenter;
import com.squareup.cash.bitcoin.screens.BitcoinDepositsScreen;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.bitcoin.screens.BitcoinTransferScreen;
import com.squareup.cash.blockers.scenarioplan.models.ScenarioPlans;
import com.squareup.cash.blockers.scenarioplan.screens.ScenarioPlanScreens;
import com.squareup.cash.card.onboarding.CardStudioViewEventV2;
import com.squareup.cash.card.onboarding.CardStudioViewModelV2;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewEvent;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewKt;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewModel;
import com.squareup.cash.card.onboarding.PaymentDeviceItemViewModel;
import com.squareup.cash.card.onboarding.TouchdatasKt;
import com.squareup.cash.card.onboarding.ZoomLevel;
import com.squareup.cash.cdf.account.AccountReturningLoginAccountPickerShown;
import com.squareup.cash.cdf.crypto.CryptoDepositRefreshInvoice;
import com.squareup.cash.cdf.customersupport.CustomerSupportAccessViewNodes;
import com.squareup.cash.cdf.localclient.LocalClientBrandProfileView;
import com.squareup.cash.cdf.localclient.LocalClientCheckoutFlowConfirmOrder;
import com.squareup.cash.cdf.notificationssettings.NotificationsSettingsViewPushBanner;
import com.squareup.cash.cdf.stock.StockTradeStartSellSucceeded;
import com.squareup.cash.charting.components.EarningsBarChartKt$ChartBars$1$1$1$1;
import com.squareup.cash.charting.components.LineChartSelectionState;
import com.squareup.cash.charting.viewmodels.LineChartViewModel;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.balance.CryptoBalance$BitcoinBalance;
import com.squareup.cash.crypto.scenarioplans.models.RefreshLightningInvoiceScenarioPlanInput;
import com.squareup.cash.data.profile.CustomerLimitsManager;
import com.squareup.cash.favorites.viewmodels.FavoritePersonViewModel;
import com.squareup.cash.history.viewmodels.PasscodeDialogViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.components.ArcadeMigrationUtilsKt$investingCryptoExchangeView$1;
import com.squareup.cash.investing.presenters.TransferStockPresenter;
import com.squareup.cash.investing.viewmodels.exchange.InvestingExchangeViewEvent;
import com.squareup.cash.investing.viewmodels.exchange.InvestingExchangeViewModel;
import com.squareup.cash.moneybot.backend.RealMoneybotStreamingSubscriber$tokenizedMessagesDataFlow$1$1$1;
import com.squareup.cash.moneybot.backend.RealMoneybotStreamingSubscriber$tokenizedMessagesDataFlow$1$1$2;
import com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewModel;
import com.squareup.cash.moneybot.views.card.FocusedHeader;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.music.presenters.MusicPresenter$models$3$1;
import com.squareup.cash.nearby.backend.NearbyAdvertisement;
import com.squareup.cash.notifications.NotificationToggleState;
import com.squareup.cash.offers.presenters.RealOffersSearchPresenter;
import com.squareup.cash.onboarding.accountpicker.presenters.ValidatedAccountList;
import com.squareup.cash.payments.presenters.PaymentLoadingPresenter;
import com.squareup.cash.payments.presenters.PersonalizePaymentPresenter;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$PaymentPad;
import com.squareup.cash.payments.viewmodels.CanvasDetails;
import com.squareup.cash.payments.viewmodels.Element;
import com.squareup.cash.payments.viewmodels.NearbyPerson;
import com.squareup.cash.payments.viewmodels.Size;
import com.squareup.cash.payments.viewmodels.Text;
import com.squareup.cash.phoneplans.PhonePlansHomePresenter$models$1$1;
import com.squareup.cash.profile.presenters.ProfilePresenter;
import com.squareup.cash.profile.presenters.notifications.ChannelListPresenter;
import com.squareup.cash.profile.presenters.notifications.ProfileNotificationsHelperKt;
import com.squareup.cash.profile.presenters.notifications.ProfileNotificationsPresenter;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.Category;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.sharesheet.ShareSheetPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.sharesheet.ShareSheetViewModel;
import com.squareup.cash.support.backend.api.activities.SupportTransaction;
import com.squareup.cash.support.backend.api.articles.Article;
import com.squareup.cash.support.backend.api.articles.Link;
import com.squareup.cash.support.presenters.ArticlePresenter;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$11$1;
import com.squareup.moshi.JsonAdapter;
import com.squareup.protos.cash.kgoose.api.v3.cash.CashKgooseStreamingServiceClient;
import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.protos.cash.local.client.v1.LocalLocationDetail;
import com.squareup.protos.cash.local.client.v1.OrderWorkflow;
import com.squareup.protos.cash.notificationsettings.clientsync.v1.UiCategoryNotificationPreference;
import com.squareup.protos.cash.notificationsettings.clientsync.v1.UiNotificationSettings;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategory;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.Region;
import com.squareup.wire.internal.RealGrpcStreamingCall;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.Provider;
import java.math.BigDecimal;
import java.math.MathContext;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.StateFlow;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class MoleculeKt$immediateClockFlow$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $body;
    public final /* synthetic */ Object $clock;
    public final /* synthetic */ Object $outputBuffer;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $snapshotNotifier;
    public /* synthetic */ Object L$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoleculeKt$immediateClockFlow$1$1$1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.$snapshotNotifier = obj2;
        this.$body = obj3;
        this.$clock = obj4;
        this.$outputBuffer = obj5;
    }

    private final Object invokeSuspend$com$squareup$cash$profile$presenters$notifications$CategoryListPresenter$models$1$1(Object obj) {
        List list;
        Category buildActivityCategory;
        Iterable iterable;
        LinkedHashMap linkedHashMap;
        List list2;
        List list3;
        List list4;
        String str = (String) this.$snapshotNotifier;
        MutableState mutableState = (MutableState) this.$body;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        MutableState mutableState2 = (MutableState) this.$clock;
        PaymentLoadingPresenter paymentLoadingPresenter = (PaymentLoadingPresenter) this.L$0;
        AndroidStringManager androidStringManager = (AndroidStringManager) paymentLoadingPresenter.flowStarter;
        ProfileScreens.CategoryListScreen categoryListScreen = (ProfileScreens.CategoryListScreen) paymentLoadingPresenter.flowToken;
        int ordinal = categoryListScreen.categoryListType.ordinal();
        if (ordinal == 0) {
            UiNotificationSettings uiNotificationSettings = (UiNotificationSettings) mutableState.getValue();
            if (uiNotificationSettings != null && (list = uiNotificationSettings.category_preferences) != null) {
                buildActivityCategory = ProfileNotificationsHelperKt.buildActivityCategory(ProfileNotificationsHelperKt.filterAccountBasedCategories(str, list), androidStringManager);
            }
            buildActivityCategory = null;
        } else if (ordinal == 1) {
            UiNotificationSettings uiNotificationSettings2 = (UiNotificationSettings) mutableState.getValue();
            if (uiNotificationSettings2 != null && (list3 = uiNotificationSettings2.category_preferences) != null) {
                buildActivityCategory = ProfileNotificationsHelperKt.buildInvestingCategory(ProfileNotificationsHelperKt.filterAccountBasedCategories(str, list3), androidStringManager);
            }
            buildActivityCategory = null;
        } else {
            if (ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            UiNotificationSettings uiNotificationSettings3 = (UiNotificationSettings) mutableState.getValue();
            if (uiNotificationSettings3 != null && (list4 = uiNotificationSettings3.category_preferences) != null) {
                buildActivityCategory = ProfileNotificationsHelperKt.buildNewsCategory(list4, androidStringManager);
            }
            buildActivityCategory = null;
        }
        if (buildActivityCategory == null) {
            buildActivityCategory = (Category) mutableState2.getValue();
        }
        mutableState2.setValue(buildActivityCategory);
        int ordinal2 = categoryListScreen.categoryListType.ordinal();
        if (ordinal2 == 0) {
            iterable = ProfileNotificationsHelperKt.ACTIVITY_CATEGORIES;
        } else if (ordinal2 == 1) {
            iterable = ProfileNotificationsHelperKt.INVESTING_CATEGORIES;
        } else {
            if (ordinal2 != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            iterable = ProfileNotificationsHelperKt.NEWS_CATEGORIES;
        }
        MutableState mutableState3 = (MutableState) this.$outputBuffer;
        UiNotificationSettings uiNotificationSettings4 = (UiNotificationSettings) mutableState.getValue();
        if (uiNotificationSettings4 == null || (list2 = uiNotificationSettings4.category_preferences) == null) {
            Iterable iterable2 = iterable;
            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity >= 16 ? mapCapacity : 16);
            for (Object obj2 : iterable2) {
                linkedHashMap2.put(obj2, null);
            }
            linkedHashMap = linkedHashMap2;
        } else {
            ArrayList filterAccountBasedCategories = ProfileNotificationsHelperKt.filterAccountBasedCategories(str, list2);
            ArrayList arrayList = new ArrayList();
            Iterator it = filterAccountBasedCategories.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                NotificationCategory notificationCategory = ((UiCategoryNotificationPreference) next).category;
                if (notificationCategory != null && CollectionsKt.contains(iterable, notificationCategory)) {
                    arrayList.add(next);
                }
            }
            int mapCapacity2 = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            linkedHashMap = new LinkedHashMap(mapCapacity2 >= 16 ? mapCapacity2 : 16);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                UiCategoryNotificationPreference uiCategoryNotificationPreference = (UiCategoryNotificationPreference) it2.next();
                NotificationCategory notificationCategory2 = uiCategoryNotificationPreference.category;
                notificationCategory2.getClass();
                Long l = uiCategoryNotificationPreference.version;
                linkedHashMap.put(notificationCategory2, l != null ? new Integer((int) l.longValue()) : null);
            }
        }
        mutableState3.setValue(linkedHashMap);
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$profile$presenters$notifications$ProfileNotificationsPresenter$models$$inlined$LaunchedEffectNotNull$3(Object obj) {
        MutableState mutableState = (MutableState) this.$outputBuffer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        if (((NotificationToggleState) ((MutableState) this.$clock).getValue()) == NotificationToggleState.Disabled && !((Boolean) mutableState.getValue()).booleanValue()) {
            ((ProfileNotificationsPresenter) this.$body).analytics.track(new NotificationsSettingsViewPushBanner(), null);
            mutableState.setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$sharesheet$ShareSheetPresenter$models$$inlined$LaunchedEffectNotNull$1(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        ((MutableState) this.$outputBuffer).setValue((ShareSheetViewModel) ((ShareSheetPresenter$$ExternalSyntheticLambda0) ((ShareSheetPresenter) this.$clock).modelUpdates).invoke((ShareSheetViewModel) this.$snapshotNotifier, (ShareSheetPresenter.StateUpdate) this.$body));
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$body;
        Object obj3 = this.$snapshotNotifier;
        Object obj4 = this.$outputBuffer;
        Object obj5 = this.$clock;
        switch (i) {
            case 0:
                MoleculeKt$immediateClockFlow$1$1$1 moleculeKt$immediateClockFlow$1$1$1 = new MoleculeKt$immediateClockFlow$1$1$1((SnapshotNotifier) obj3, (Function2) obj2, (GatedFrameClock) obj5, (BufferedChannel) obj4, continuation, 0);
                moleculeKt$immediateClockFlow$1$1$1.L$0 = obj;
                return moleculeKt$immediateClockFlow$1$1$1;
            case 1:
                return new MoleculeKt$immediateClockFlow$1$1$1((Long) this.L$0, (CalendarModelImpl) obj3, (DateInputFormat) obj2, (Locale) obj5, (MutableState) obj4, continuation, 1);
            case 2:
                return new MoleculeKt$immediateClockFlow$1$1$1((Function1) this.L$0, (OrderBuilderModel.BuyerInfo.UiReady.Validated) obj3, (LocalBrandLocationCheckoutPresenter) obj2, (OrderBuilderModel) obj5, (JWECryptoParts) obj4, continuation, 2);
            case 3:
                return new MoleculeKt$immediateClockFlow$1$1$1((OrderBuilderModel.BuyerInfo.UiReady.Validated) this.L$0, (JWECryptoParts) obj3, (MutableState) obj2, (MutableState) obj5, (MutableState) obj4, continuation, 3);
            case 4:
                return new MoleculeKt$immediateClockFlow$1$1$1((State) this.L$0, (MutableState) obj3, (MutableState) obj2, (MutableState) obj5, (MutableState) obj4, continuation, 4);
            case 5:
                return new MoleculeKt$immediateClockFlow$1$1$1((LocalBrandProfilePresenter) this.L$0, (CartBuilder) obj3, (LocationMenu) obj2, (MutableState) obj5, (MutableState) obj4, continuation, 5);
            case 6:
                return new MoleculeKt$immediateClockFlow$1$1$1((DefaultPagerState) this.L$0, (ArrayList) obj3, (Function1) obj2, (Function1) obj5, (Function1) obj4, continuation, 6);
            case 7:
                MoleculeKt$immediateClockFlow$1$1$1 moleculeKt$immediateClockFlow$1$1$12 = new MoleculeKt$immediateClockFlow$1$1$1(this.$snapshotNotifier, this.$body, continuation, (String) obj5, (TapToPayPresenter) obj4, 7);
                moleculeKt$immediateClockFlow$1$1$12.L$0 = obj;
                return moleculeKt$immediateClockFlow$1$1$12;
            case 8:
                MoleculeKt$immediateClockFlow$1$1$1 moleculeKt$immediateClockFlow$1$1$13 = new MoleculeKt$immediateClockFlow$1$1$1((BitcoinTransferPresenter) obj3, (MutableState) obj2, (MutableState) obj5, (MutableState) obj4, continuation, 8);
                moleculeKt$immediateClockFlow$1$1$13.L$0 = obj;
                return moleculeKt$immediateClockFlow$1$1$13;
            case 9:
                MoleculeKt$immediateClockFlow$1$1$1 moleculeKt$immediateClockFlow$1$1$14 = new MoleculeKt$immediateClockFlow$1$1$1((Animatable) obj3, (Animatable) obj2, (Animatable) obj5, (MutableState) obj4, continuation, 9);
                moleculeKt$immediateClockFlow$1$1$14.L$0 = obj;
                return moleculeKt$immediateClockFlow$1$1$14;
            case 10:
                return new MoleculeKt$immediateClockFlow$1$1$1((CardStudioViewModelV2.Content) this.L$0, (SignatureState) obj3, (StampState) obj2, (SnapshotStateList) obj5, (Function1) obj4, continuation, 10);
            case 11:
                return new MoleculeKt$immediateClockFlow$1$1$1((PaymentDeviceCustomizationViewModel) this.L$0, (Function1) obj3, (MutableState) obj2, (MutableState) obj5, (MutableState) obj4, continuation, 11);
            case 12:
                return new MoleculeKt$immediateClockFlow$1$1$1((ParcelableSnapshotMutableIntState) this.L$0, (TransfersPresenter) obj3, (CoroutineScope) obj2, (MutableState) obj5, (MutableState) obj4, continuation, 12);
            case 13:
                return new MoleculeKt$immediateClockFlow$1$1$1((MutableState) this.L$0, (State) obj3, (LocalEditorialPresenter) obj2, (State) obj5, (MutableState) obj4, continuation, 13);
            case 14:
                return new MoleculeKt$immediateClockFlow$1$1$1((PasscodeDialogViewModel) this.L$0, (RealCashVibrator) obj3, (Shaker) obj2, (MutableState) obj5, (MutableState) obj4, continuation, 14);
            case 15:
                return new MoleculeKt$immediateClockFlow$1$1$1((ArcadeMigrationUtilsKt$investingCryptoExchangeView$1) this.L$0, (InvestingExchangeViewModel) obj3, (AmountDisplayState) obj2, (Function1) obj5, (MutableState) obj4, continuation, 15);
            case 16:
                MoleculeKt$immediateClockFlow$1$1$1 moleculeKt$immediateClockFlow$1$1$15 = new MoleculeKt$immediateClockFlow$1$1$1((Screen) obj3, continuation, (TransferStockPresenter) obj2, (Screen) obj5, (MutableState) obj4, 16);
                moleculeKt$immediateClockFlow$1$1$15.L$0 = obj;
                return moleculeKt$immediateClockFlow$1$1$15;
            case 17:
                MoleculeKt$immediateClockFlow$1$1$1 moleculeKt$immediateClockFlow$1$1$16 = new MoleculeKt$immediateClockFlow$1$1$1((UnleashContext) obj3, (Map) obj2, (String) obj5, (ProducerScope) obj4, continuation, 17);
                moleculeKt$immediateClockFlow$1$1$16.L$0 = obj;
                return moleculeKt$immediateClockFlow$1$1$16;
            case 18:
                return new MoleculeKt$immediateClockFlow$1$1$1((LineChartSelectionState) this.L$0, (Function1) obj3, (Function1) obj2, (ChatCardViewModel.InsightCard.Chart.Legend) obj5, (ChatCardViewModel.InsightCard.Chart.LineChart) obj4, continuation, 18);
            case 19:
                MoleculeKt$immediateClockFlow$1$1$1 moleculeKt$immediateClockFlow$1$1$17 = new MoleculeKt$immediateClockFlow$1$1$1((RealOffersSearchPresenter) obj3, (StateFlow) obj2, (MutableState) obj5, (MutableState) obj4, continuation, 19);
                moleculeKt$immediateClockFlow$1$1$17.L$0 = obj;
                return moleculeKt$immediateClockFlow$1$1$17;
            case 20:
                MoleculeKt$immediateClockFlow$1$1$1 moleculeKt$immediateClockFlow$1$1$18 = new MoleculeKt$immediateClockFlow$1$1$1((ValidatedAccountList) obj3, continuation, (TabToolbarPresenter) obj2, (MutableState) obj5, (MutableState) obj4, 20);
                moleculeKt$immediateClockFlow$1$1$18.L$0 = obj;
                return moleculeKt$immediateClockFlow$1$1$18;
            case 21:
                return new MoleculeKt$immediateClockFlow$1$1$1((SnapshotStateMap) this.L$0, (MutableState) obj3, (CardLockPresenter) obj2, (ParcelableSnapshotMutableLongState) obj5, (MutableState) obj4, continuation, 21);
            case 22:
                MoleculeKt$immediateClockFlow$1$1$1 moleculeKt$immediateClockFlow$1$1$19 = new MoleculeKt$immediateClockFlow$1$1$1((SnapshotStateSet) obj3, (SnapshotStateMap) obj2, (Map) obj5, (TaxReturnsPresenter) obj4, continuation, 22);
                moleculeKt$immediateClockFlow$1$1$19.L$0 = obj;
                return moleculeKt$immediateClockFlow$1$1$19;
            case 23:
                return new MoleculeKt$immediateClockFlow$1$1$1((PersonalizePaymentPresenter) this.L$0, (MutableState) obj3, (MutableState) obj2, (MutableState) obj5, (MutableState) obj4, continuation, 23);
            case 24:
                MoleculeKt$immediateClockFlow$1$1$1 moleculeKt$immediateClockFlow$1$1$110 = new MoleculeKt$immediateClockFlow$1$1$1((ProfilePresenter) obj3, (MutableState) obj2, (MutableState) obj5, (MutableState) obj4, continuation, 24);
                moleculeKt$immediateClockFlow$1$1$110.L$0 = obj;
                return moleculeKt$immediateClockFlow$1$1$110;
            case 25:
                return new MoleculeKt$immediateClockFlow$1$1$1((PaymentLoadingPresenter) this.L$0, (String) obj3, (MutableState) obj2, (MutableState) obj5, (MutableState) obj4, continuation, 25);
            case 26:
                return new MoleculeKt$immediateClockFlow$1$1$1((String) this.L$0, (ChannelListPresenter) obj3, (MutableState) obj2, (MutableState) obj5, (MutableState) obj4, continuation, 26);
            case 27:
                MoleculeKt$immediateClockFlow$1$1$1 moleculeKt$immediateClockFlow$1$1$111 = new MoleculeKt$immediateClockFlow$1$1$1((NotificationToggleState) obj3, continuation, (ProfileNotificationsPresenter) obj2, (MutableState) obj5, (MutableState) obj4, 27);
                moleculeKt$immediateClockFlow$1$1$111.L$0 = obj;
                return moleculeKt$immediateClockFlow$1$1$111;
            case 28:
                MoleculeKt$immediateClockFlow$1$1$1 moleculeKt$immediateClockFlow$1$1$112 = new MoleculeKt$immediateClockFlow$1$1$1((ShareSheetViewModel) obj3, (ShareSheetPresenter.StateUpdate) obj2, continuation, (ShareSheetPresenter) obj5, (MutableState) obj4, 28);
                moleculeKt$immediateClockFlow$1$1$112.L$0 = obj;
                return moleculeKt$immediateClockFlow$1$1$112;
            default:
                MoleculeKt$immediateClockFlow$1$1$1 moleculeKt$immediateClockFlow$1$1$113 = new MoleculeKt$immediateClockFlow$1$1$1((Article) obj3, (Boolean) obj2, continuation, (ArticlePresenter) obj5, (MutableState) obj4, 29);
                moleculeKt$immediateClockFlow$1$1$113.L$0 = obj;
                return moleculeKt$immediateClockFlow$1$1$113;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((MoleculeKt$immediateClockFlow$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:394:0x09dc, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual((r2 == null || (r2 = r2.summary) == null || (r2 = r2.in_store_ordering_configuration) == null || (r2 = r2.cart_fulfillment) == null || (r2 = r2.in_store_details) == null) ? null : r2.ordering_token, r0) == false) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0a73, code lost:
    
        if (r3 == false) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0b13, code lost:
    
        if (r3 == false) goto L411;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:203:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x049d  */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean areEqual;
        OrderBuilderEvent.CreateOrderWithWorkflow createOrderWithWorkflow;
        boolean areEqual2;
        String str;
        String str2;
        LineChartViewModel.Line.Point point;
        LineChartViewModel.Line.Point point2;
        UiCategoryNotificationPreference uiCategoryNotificationPreference;
        Category category;
        Long l;
        List list;
        Object obj2;
        CustomerSupportAccessViewNodes.LoadTransactionStatus loadTransactionStatus;
        int i = this.$r8$classId;
        int i2 = 4;
        int i3 = 10;
        boolean z = false;
        r6 = null;
        Object[] objArr = null;
        boolean z2 = false;
        int i4 = 3;
        String str3 = 0;
        r9 = null;
        Object obj3 = null;
        r9 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        r9 = null;
        r9 = null;
        Object obj7 = null;
        str3 = 0;
        Object obj8 = this.$outputBuffer;
        Object obj9 = this.$clock;
        Object obj10 = this.$snapshotNotifier;
        Object obj11 = this.$body;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                BundleKt.launchMolecule(coroutineScope, RecompositionMode.ContextClock, new CombinedModifier$$ExternalSyntheticLambda0(i4, (GatedFrameClock) obj9, (BufferedChannel) obj8), EmptyCoroutineContext.INSTANCE, (SnapshotNotifier) obj10, (Function2) obj11);
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Long l2 = (Long) this.L$0;
                if (l2 != null) {
                    MutableState mutableState = (MutableState) obj8;
                    long longValue = l2.longValue();
                    String str4 = ((DateInputFormat) obj11).patternWithoutDelimiters;
                    ZoneId zoneId = CalendarModelImpl.utcTimeZoneId;
                    String format2 = Instant.ofEpochMilli(longValue).atZone(CalendarModelImpl.utcTimeZoneId).toLocalDate().format(Icons$Filled.getCachedDateTimeFormatter(str4, (Locale) obj9, ((CalendarModelImpl) obj10).formatterCache));
                    TextFieldValue textFieldValue = new TextFieldValue(format2, format2.length() == 0 ? TextRange.Zero : SizeKt.TextRange(format2.length(), format2.length()), 4);
                    PaddingValuesImpl paddingValuesImpl = DateInputKt.InputTextFieldPadding;
                    mutableState.setValue(textFieldValue);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Function1 function1 = (Function1) this.L$0;
                function1.invoke(new OrderBuilderEvent.UpdateBuyerInfo((OrderBuilderModel.BuyerInfo.UiReady.Validated) obj10));
                LocalBrandLocationCheckoutPresenter localBrandLocationCheckoutPresenter = (LocalBrandLocationCheckoutPresenter) obj11;
                LocalBrandLocationCheckoutScreen localBrandLocationCheckoutScreen = localBrandLocationCheckoutPresenter.screen;
                OrderBuilderModel orderBuilderModel = (OrderBuilderModel) obj9;
                Analytics analytics = localBrandLocationCheckoutPresenter.analytics;
                String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull(localBrandLocationCheckoutPresenter.sessionManager);
                BrandSpot brandSpot = localBrandLocationCheckoutPresenter.brandSpot;
                String str5 = brandSpot.brandToken;
                String str6 = brandSpot.locationToken;
                String str7 = str6 == null ? null : str6;
                String str8 = orderBuilderModel.cart.token;
                LocalMoney localMoney = orderBuilderModel.localCashRedeemableValue;
                analytics.track(new LocalClientCheckoutFlowConfirmOrder(activeAccountTokenOrNull, str5, str7, str8, Boolean.valueOf(localMoney != null), Boolean.valueOf(orderBuilderModel.redeemLocalCash), localMoney != null ? Long.valueOf(localMoney.amount) : null, Boolean.valueOf(localBrandLocationCheckoutScreen.tippingEnabled)), null);
                OrderWorkflow orderWorkflow = localBrandLocationCheckoutScreen.orderWorkflow;
                if (orderWorkflow != null) {
                    JWECryptoParts jWECryptoParts = (JWECryptoParts) obj8;
                    if (orderWorkflow == OrderWorkflow.ORDER_WORKFLOW_FINALIZE_DELAYED_CAPTURE && jWECryptoParts.m2168getPreauthorizedPaymentMethodTokenForEventsyJPV6_0() != null) {
                        String str9 = ((PaymentMethodToken) ((MutableState) jWECryptoParts.iv).getValue()).value;
                        String m2168getPreauthorizedPaymentMethodTokenForEventsyJPV6_0 = jWECryptoParts.m2168getPreauthorizedPaymentMethodTokenForEventsyJPV6_0();
                        if (m2168getPreauthorizedPaymentMethodTokenForEventsyJPV6_0 == null) {
                            areEqual = false;
                            break;
                        } else {
                            areEqual = Intrinsics.areEqual(str9, m2168getPreauthorizedPaymentMethodTokenForEventsyJPV6_0);
                            break;
                        }
                    }
                    z = true;
                    function1.invoke(new OrderBuilderEvent.CreateOrderWithWorkflow(orderWorkflow, z));
                } else {
                    function1.invoke(OrderBuilderEvent.CreateOrder.INSTANCE);
                }
                return Unit.INSTANCE;
            case 3:
                JWECryptoParts jWECryptoParts2 = (JWECryptoParts) obj10;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState2 = (MutableState) obj11;
                ((Function1) mutableState2.getValue()).invoke(new OrderBuilderEvent.UpdateBuyerInfo((OrderBuilderModel.BuyerInfo.UiReady.Validated) this.L$0));
                int ordinal = ((LocalCheckoutPaymentTimingViewModel.Option) ((MutableState) obj9).getValue()).ordinal();
                if (ordinal == 0) {
                    Function1 function12 = (Function1) mutableState2.getValue();
                    if (((Boolean) ((MutableState) obj8).getValue()).booleanValue()) {
                        OrderWorkflow orderWorkflow2 = OrderWorkflow.ORDER_WORKFLOW_FINALIZE_DELAYED_CAPTURE;
                        if (jWECryptoParts2.m2168getPreauthorizedPaymentMethodTokenForEventsyJPV6_0() != null) {
                            String str10 = ((PaymentMethodToken) ((MutableState) jWECryptoParts2.iv).getValue()).value;
                            String m2168getPreauthorizedPaymentMethodTokenForEventsyJPV6_02 = jWECryptoParts2.m2168getPreauthorizedPaymentMethodTokenForEventsyJPV6_0();
                            if (m2168getPreauthorizedPaymentMethodTokenForEventsyJPV6_02 == null) {
                                areEqual2 = false;
                                break;
                            } else {
                                areEqual2 = Intrinsics.areEqual(str10, m2168getPreauthorizedPaymentMethodTokenForEventsyJPV6_02);
                                break;
                            }
                        }
                        z2 = true;
                        createOrderWithWorkflow = new OrderBuilderEvent.CreateOrderWithWorkflow(orderWorkflow2, z2);
                    } else {
                        createOrderWithWorkflow = new OrderBuilderEvent.CreateOrderWithWorkflow(OrderWorkflow.ORDER_WORKFLOW_PREAUTHORIZED_DELAYED_CAPTURE, true);
                    }
                    function12.invoke(createOrderWithWorkflow);
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((Function1) mutableState2.getValue()).invoke(OrderBuilderEvent.ContinueToTip.INSTANCE);
                }
                return Unit.INSTANCE;
            case 4:
                MutableState mutableState3 = (MutableState) obj9;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                String str11 = ((BrandSpotSyncTokens) ((State) this.L$0).getValue()).inStoreOrderingToken;
                if (((Boolean) ((MutableState) obj10).getValue()).booleanValue() && str11 != null) {
                    objArr = 1;
                }
                LocalBrand localBrand = (LocalBrand) ((MutableState) obj11).getValue();
                if (localBrand != null) {
                    if (objArr != null) {
                        BrandSpot brandSpot2 = LocalBrandProfilePresenterKt.EMPTY_BRAND_SPOT;
                        LocalLocationDetail localLocationDetail = localBrand.selected_location;
                        break;
                    }
                    if (localBrand != null && (str = localBrand.token) != null) {
                        str3 = str;
                    }
                    if (LocalBrandProfilePresenter.models$lambda$9(mutableState3) == null && str3 != 0) {
                        mutableState3.setValue(new BrandToken(str3));
                    }
                    if (localBrand == null || objArr != null) {
                        ((MutableState) obj8).setValue(localBrand);
                    }
                    return Unit.INSTANCE;
                }
                localBrand = null;
                if (localBrand != null) {
                    str3 = str;
                }
                if (LocalBrandProfilePresenter.models$lambda$9(mutableState3) == null) {
                    mutableState3.setValue(new BrandToken(str3));
                }
                if (localBrand == null) {
                }
                ((MutableState) obj8).setValue(localBrand);
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalBrandProfilePresenter localBrandProfilePresenter = (LocalBrandProfilePresenter) this.L$0;
                Analytics analytics2 = localBrandProfilePresenter.analytics;
                String models$lambda$9 = LocalBrandProfilePresenter.models$lambda$9((MutableState) obj9);
                models$lambda$9.getClass();
                String models$lambda$4 = LocalBrandProfilePresenter.models$lambda$4((MutableState) obj8);
                analytics2.track(new LocalClientBrandProfileView(models$lambda$9, models$lambda$4 == null ? null : models$lambda$4, localBrandProfilePresenter.screen.attributionKey.value, PlatformKt.activeAccountTokenOrNull(localBrandProfilePresenter.sessionManager), ((RealCartBuilder) ((CartBuilder) obj10)).checkoutFlowToken, CollectionsKt.joinToString$default(((LocationMenu) obj11).menus, null, "[", "]", 0, null, new LocationMenu$$ExternalSyntheticLambda6(z ? 1 : 0), 25)), null);
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                int intValue = ((ParcelableSnapshotMutableIntState) ((DefaultPagerState) this.L$0).scrollPosition.elementTypes).getIntValue();
                ArrayList arrayList = (ArrayList) obj10;
                List list2 = (List) CollectionsKt.getOrNull(intValue, arrayList);
                if (list2 != null) {
                    Function1 function13 = (Function1) obj9;
                    Function1 function14 = (Function1) obj8;
                    if (function13 != null) {
                        function13.invoke(list2);
                    }
                    if (function14 != null) {
                        function14.invoke(list2);
                    }
                }
                if (intValue >= arrayList.size() - 2) {
                    ((Function1) obj11).invoke(new Integer(intValue * 7));
                }
                return Unit.INSTANCE;
            case 7:
                TapToPayPresenter tapToPayPresenter = (TapToPayPresenter) obj8;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                String str12 = (String) obj11;
                String str13 = (String) obj10;
                if (!StringsKt.isBlank(str13)) {
                    boolean areEqual3 = Intrinsics.areEqual(Uri.parse(str12).getLastPathSegment(), (String) obj9);
                    if (areEqual3) {
                        int ordinal2 = ((BitcoinDepositsScreen) tapToPayPresenter.tapToPayErrorReporter).origin.ordinal();
                        ((BetterNavigator.ScreenNavigator) tapToPayPresenter.navigator).goTo(new ScenarioPlanScreens.ScenarioPlanLoadingScreen(ScenarioPlans.REFRESH_LIGHTNING_INVOICE, new RefreshLightningInvoiceScenarioPlanInput(str13), ordinal2 != 2 ? ordinal2 != 4 ? new BitcoinHome(null, null, null, null, 15) : Account.INSTANCE : PaymentScreens$HomeScreens$PaymentPad.INSTANCE, ColorModel.Bitcoin.INSTANCE));
                        ((RealBitcoinRefreshInvoiceManager) tapToPayPresenter.tapToPayAnalyticsHelper).refreshInvoiceIdPref.delete();
                    }
                    ((Analytics) tapToPayPresenter.deviceIntegrityAttester).track(new CryptoDepositRefreshInvoice(Boolean.valueOf(areEqual3)), null);
                }
                return Unit.INSTANCE;
            case 8:
                ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CustomerLimitsManager.TransactionLimit transactionLimit = (CustomerLimitsManager.TransactionLimit) ((MutableState) obj11).getValue();
                CryptoBalance$BitcoinBalance cryptoBalance$BitcoinBalance = (CryptoBalance$BitcoinBalance) ((MutableState) obj9).getValue();
                BitcoinTransferScreen bitcoinTransferScreen = ((BitcoinTransferPresenter) obj10).args;
                if (!bitcoinTransferScreen.isBuy) {
                    BitcoinTransferScreen.OrderType orderType = bitcoinTransferScreen.orderType;
                    if (orderType instanceof BitcoinTransferScreen.OrderType.CustomOrder) {
                        long j = ((BitcoinTransferScreen.OrderType.CustomOrder) orderType).targetUsdPerBtc;
                        if (cryptoBalance$BitcoinBalance != null) {
                            BigDecimal valueOf = BigDecimal.valueOf(cryptoBalance$BitcoinBalance.amount.satoshi);
                            valueOf.getClass();
                            BigDecimal valueOf2 = BigDecimal.valueOf(100000000L);
                            valueOf2.getClass();
                            String bigDecimal = valueOf.divide(valueOf2, MathContext.DECIMAL32).toString();
                            bigDecimal.getClass();
                            BigDecimal valueOf3 = BigDecimal.valueOf(j);
                            valueOf3.getClass();
                            BigDecimal multiply = valueOf3.multiply(new BigDecimal(bigDecimal));
                            multiply.getClass();
                            obj7 = new Money(Long.valueOf(multiply.longValue()), CurrencyCode.USD, 4);
                        }
                    } else {
                        if (!(orderType instanceof BitcoinTransferScreen.OrderType.Standard)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        if (transactionLimit != null) {
                            obj7 = transactionLimit.maxTransactionAmount;
                        }
                    }
                } else if (transactionLimit != null) {
                    obj7 = transactionLimit.maxTransactionAmount;
                }
                if (obj7 == null) {
                    CurrencyCode currencyCode = (CurrencyCode) ((MutableState) obj8).getValue();
                    currencyCode.getClass();
                    obj7 = Moneys.zero(currencyCode);
                }
                produceStateScope.setValue(obj7);
                return Unit.INSTANCE;
            case 9:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(coroutineScope2, null, null, new EarningsBarChartKt$ChartBars$1$1$1$1((Animatable) obj10, str3, 19), 3);
                JobKt.launch$default(coroutineScope2, null, null, new EarningsBarChartKt$ChartBars$1$1$1$1((Animatable) obj11, str3, 20), 3);
                JobKt.launch$default(coroutineScope2, null, null, new Hero3DCardViewKt$InteractiveCard$11$1((Animatable) obj9, (MutableState) obj8, str3, i2), 3);
                return Unit.INSTANCE;
            case 10:
                Function1 function15 = (Function1) obj8;
                StampState stampState = (StampState) obj11;
                SignatureState signatureState = (SignatureState) obj10;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((CardStudioViewModelV2.Content) this.L$0).pendingClearAll) {
                    signatureState.clear();
                    stampState.setStamps$customizations(EmptyList.INSTANCE);
                    stampState.customizationDeque.push(stampState.getStamps$customizations());
                    ((SnapshotStateList) obj9).clear();
                    function15.invoke(new CardStudioViewEventV2.DeleteAllCustomization(TouchdatasKt.createLandscapeTouchData$default(signatureState.getSavedState(), stampState.getSavedState().a)));
                    function15.invoke(CardStudioViewEventV2.ClearPendingClearAll.INSTANCE);
                }
                return Unit.INSTANCE;
            case 11:
                PaymentDeviceCustomizationViewModel paymentDeviceCustomizationViewModel = (PaymentDeviceCustomizationViewModel) this.L$0;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState4 = (MutableState) obj11;
                int i5 = PaymentDeviceCustomizationViewKt.$r8$clinit;
                if (((Boolean) mutableState4.getValue()).booleanValue()) {
                    return Unit.INSTANCE;
                }
                List list3 = paymentDeviceCustomizationViewModel.items;
                String str14 = paymentDeviceCustomizationViewModel.focusedDeviceId;
                if (list3.isEmpty()) {
                    return Unit.INSTANCE;
                }
                if (str14 != null) {
                    List list4 = paymentDeviceCustomizationViewModel.items;
                    if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                        Iterator it = list4.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.areEqual(((PaymentDeviceItemViewModel) it.next()).id, str14)) {
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                Boolean bool = Boolean.TRUE;
                mutableState4.setValue(bool);
                if (paymentDeviceCustomizationViewModel.initialZoomLevel == ZoomLevel.NEAR && str14 != null) {
                    ((MutableState) obj9).setValue(str14);
                    ((MutableState) obj8).setValue(bool);
                    ((Function1) obj10).invoke(new PaymentDeviceCustomizationViewEvent.DeviceOptionSelected(str14));
                }
                return Unit.INSTANCE;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((ParcelableSnapshotMutableIntState) this.L$0).getIntValue() > 0) {
                    TransfersPresenter.access$models$fetchEarnings((TransfersPresenter) obj10, (CoroutineScope) obj11, (MutableState) obj9, (MutableState) obj8, true);
                }
                return Unit.INSTANCE;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState5 = (MutableState) obj8;
                List<Recipient> list5 = (List) ((MutableState) this.L$0).getValue();
                State state = (State) obj10;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                for (Recipient recipient : list5) {
                    if (CollectionsKt.contains((Set) state.getValue(), recipient.customerId)) {
                        recipient = Recipient.copy$default(recipient, null, null, null, null, null, null, null, false, true, -1, 2);
                    }
                    arrayList2.add(recipient);
                }
                LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) obj11;
                State state2 = (State) obj9;
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Recipient recipient2 = (Recipient) it2.next();
                    Region region = (Region) state2.getValue();
                    String str15 = recipient2.customerId;
                    String str16 = recipient2.displayName;
                    String str17 = str15 == null ? "" : str15;
                    String str18 = str16 == null ? "" : str16;
                    String recipientSubtitle = UriKt.getRecipientSubtitle(recipient2, region, (AndroidStringManager) localEditorialPresenter.stringManager);
                    arrayList3.add(new FavoritePersonViewModel(recipient2, str17, str18, recipientSubtitle == null ? "" : recipientSubtitle, String.valueOf(str16 != null ? Character.valueOf(Character.toUpperCase(str16.charAt(0))) : null), false, recipient2.isFavorited, recipient2.isVerified, recipient2.isBusiness, recipient2.photo, recipient2.getAccentColor(), TypefaceCompatUtil.badgeIcon(recipient2, false)));
                }
                mutableState5.setValue(arrayList3);
                return Unit.INSTANCE;
            case 14:
                MutableState mutableState6 = (MutableState) obj9;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Versioned versioned = ((PasscodeDialogViewModel) this.L$0).resetInvalidInput;
                if (versioned != null && !versioned.equals((Versioned) mutableState6.getValue())) {
                    ((MutableState) obj8).setValue("");
                    RealCashVibrator realCashVibrator = (RealCashVibrator) obj10;
                    if (realCashVibrator != null) {
                        realCashVibrator.error();
                    }
                    ((Shaker) obj11).shake();
                    mutableState6.setValue(versioned);
                }
                return Unit.INSTANCE;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                InvestingExchangeViewModel investingExchangeViewModel = (InvestingExchangeViewModel) obj10;
                Function1 function16 = (Function1) obj9;
                AmountDisplayState amountDisplayState = (AmountDisplayState) obj11;
                int i6 = ArcadeMigrationUtilsKt$investingCryptoExchangeView$1.$r8$clinit;
                boolean booleanValue = ((Boolean) ((MutableState) obj8).getValue()).booleanValue();
                if (investingExchangeViewModel instanceof InvestingExchangeViewModel.Content.BottomSheetContent) {
                    if (!booleanValue) {
                        Iterator it3 = ((InvestingExchangeViewModel.Content.BottomSheetContent) investingExchangeViewModel).amountSelections.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                Object next = it3.next();
                                if (((AmountSelection) next).isSelected()) {
                                    obj6 = next;
                                }
                            }
                        }
                        AmountSelection amountSelection = (AmountSelection) obj6;
                        if (amountSelection != 0 && (amountSelection instanceof AmountSelection.HasAmount)) {
                            function16.invoke(new InvestingExchangeViewEvent.ItemSelected(amountSelection));
                            AmountSelection.HasAmount hasAmount = (AmountSelection.HasAmount) amountSelection;
                            function16.invoke(new InvestingExchangeViewEvent.AmountEntered(String.valueOf(hasAmount.getAmount()), hasAmount.getAmount()));
                            AmountDisplayState.reset$default(amountDisplayState, ArcadeMigrationUtilsKt$investingCryptoExchangeView$1.amountString(hasAmount), 2);
                        }
                    }
                } else if ((investingExchangeViewModel instanceof InvestingExchangeViewModel.Content.FullScreenContent) && (str2 = ((InvestingExchangeViewModel.Content.FullScreenContent) investingExchangeViewModel).restoreKeypadAmount) != null) {
                    AmountDisplayState.reset$default(amountDisplayState, str2, 2);
                }
                return Unit.INSTANCE;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((MutableState) obj8).setValue(Boolean.TRUE);
                TransferStockPresenter transferStockPresenter = (TransferStockPresenter) obj11;
                transferStockPresenter.attributionEventEmitter.trackEvent("Attempted Money Movement", MapsKt__MapsKt.mutableMapOf(new Pair("type", "equities")));
                transferStockPresenter.investingAnalytics.analytics.track(new StockTradeStartSellSucceeded(), null);
                transferStockPresenter.navigator.goTo((Screen) obj9);
                return Unit.INSTANCE;
            case 17:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealGrpcStreamingCall BidirectionalStreamMessagesV2 = ((CashKgooseStreamingServiceClient) ((Provider) ((UnleashContext) obj10).userId).invoke()).BidirectionalStreamMessagesV2();
                Map map = (Map) obj11;
                map.getClass();
                BidirectionalStreamMessagesV2.requestMetadata = map;
                Pair executeIn = BidirectionalStreamMessagesV2.executeIn(coroutineScope3);
                SendChannel sendChannel = (SendChannel) executeIn.first;
                ReceiveChannel receiveChannel = (ReceiveChannel) executeIn.second;
                JobKt.launch$default(coroutineScope3, null, null, new RealMoneybotStreamingSubscriber$tokenizedMessagesDataFlow$1$1$1(sendChannel, (String) obj9, null), 3);
                JobKt.launch$default(coroutineScope3, null, null, new RealMoneybotStreamingSubscriber$tokenizedMessagesDataFlow$1$1$2(receiveChannel, (ProducerScope) obj8, null), 3);
                return Unit.INSTANCE;
            case 18:
                Function1 function17 = (Function1) obj11;
                Function1 function18 = (Function1) obj10;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LineChartSelectionState lineChartSelectionState = (LineChartSelectionState) this.L$0;
                if (lineChartSelectionState.getSelectedPoints() == null) {
                    function18.invoke(null);
                    function17.invoke(null);
                } else {
                    List selectedPoints = lineChartSelectionState.getSelectedPoints();
                    selectedPoints.getClass();
                    if (selectedPoints.size() == 1) {
                        List selectedPoints2 = lineChartSelectionState.getSelectedPoints();
                        if (selectedPoints2 != null && (point2 = (LineChartViewModel.Line.Point) CollectionsKt.firstOrNull(selectedPoints2)) != null) {
                            String str19 = ((ChatCardViewModel.InsightCard.Chart.LineChart) obj8).title;
                            String str20 = point2.label;
                            if (str20 == null) {
                                str20 = str19;
                            }
                            String str21 = point2.description;
                            obj4 = new FocusedHeader(str19, str20, str21 != null ? new FocusedHeader.Description(str21, point2.icon, point2.iconTintColor) : null);
                        }
                        function17.invoke(obj4);
                    } else {
                        List selectedPoints3 = lineChartSelectionState.getSelectedPoints();
                        selectedPoints3.getClass();
                        if (selectedPoints3.size() > 1) {
                            ChatCardViewModel.InsightCard.Chart.Legend legend = (ChatCardViewModel.InsightCard.Chart.Legend) obj9;
                            if (legend != null) {
                                List<ChatCardViewModel.InsightCard.Chart.Legend.LegendItem> list6 = legend.items;
                                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                                for (ChatCardViewModel.InsightCard.Chart.Legend.LegendItem legendItem : list6) {
                                    Integer num = legendItem.lineIndex;
                                    if (num != null) {
                                        int intValue2 = num.intValue();
                                        List selectedPoints4 = lineChartSelectionState.getSelectedPoints();
                                        if (selectedPoints4 != null) {
                                            point = (LineChartViewModel.Line.Point) CollectionsKt.getOrNull(intValue2, selectedPoints4);
                                            arrayList4.add(new ChatCardViewModel.InsightCard.Chart.Legend.LegendItem(legendItem.label, point == null ? point.label : null, legendItem.color, legendItem.lineIndex));
                                        }
                                    }
                                    point = null;
                                    arrayList4.add(new ChatCardViewModel.InsightCard.Chart.Legend.LegendItem(legendItem.label, point == null ? point.label : null, legendItem.color, legendItem.lineIndex));
                                }
                                obj5 = new ChatCardViewModel.InsightCard.Chart.Legend(arrayList4);
                            }
                            function18.invoke(obj5);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 19:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Continuation continuation = null;
                JobKt.launch$default(coroutineScope4, null, null, new MusicPresenter$models$3$1((RealOffersSearchPresenter) obj10, continuation, i3), 3);
                JobKt.launch$default(coroutineScope4, null, null, new RealMRIFactory$sign$2((StateFlow) obj11, (MutableState) obj9, (MutableState) obj8, continuation, 17), 3);
                return Unit.INSTANCE;
            case 20:
                MutableState mutableState7 = (MutableState) obj8;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Analytics analytics3 = (Analytics) ((TabToolbarPresenter) obj11).familyProfileManager;
                List list7 = ((ValidatedAccountList) obj10).accounts;
                analytics3.track(new AccountReturningLoginAccountPickerShown(list7.size()), null);
                if (!((Boolean) ((MutableState) obj9).getValue()).booleanValue() && list7.isEmpty() && !((Boolean) mutableState7.getValue()).booleanValue()) {
                    mutableState7.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 21:
                MutableState mutableState8 = (MutableState) obj10;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SnapshotMapKeySet snapshotMapKeySet = ((SnapshotStateMap) this.L$0).values;
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                Iterator it4 = snapshotMapKeySet.iterator();
                while (((StateMapMutableKeysIterator) it4).hasNext()) {
                    Object next2 = ((StateMapMutableKeysIterator) it4).next();
                    if (hashSet.add(((NearbyPerson) next2).customerToken)) {
                        arrayList5.add(next2);
                    }
                }
                List list8 = CollectionsKt.toList(arrayList5);
                List list9 = (List) mutableState8.getValue();
                ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list9, 10));
                Iterator it5 = list9.iterator();
                while (it5.hasNext()) {
                    arrayList6.add(((NearbyPerson) it5.next()).customerToken);
                }
                Set set = CollectionsKt.toSet(arrayList6);
                List list10 = list8;
                ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list10, 10));
                Iterator it6 = list10.iterator();
                while (it6.hasNext()) {
                    arrayList7.add(((NearbyPerson) it6.next()).customerToken);
                }
                if (!SetsKt___SetsKt.minus(CollectionsKt.toSet(arrayList7), (Iterable) set).isEmpty()) {
                    CardLockPresenter.access$models$throttledVibrate((CardLockPresenter) obj11, (ParcelableSnapshotMutableLongState) obj9, (MutableState) obj8);
                }
                mutableState8.setValue(list8);
                return Unit.INSTANCE;
            case 22:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SnapshotStateSet snapshotStateSet = (SnapshotStateSet) obj10;
                SnapshotStateMap snapshotStateMap = (SnapshotStateMap) obj11;
                LinkedHashSet union = CollectionsKt.union(snapshotStateSet, snapshotStateMap.keys);
                Map map2 = (Map) obj9;
                ArrayList arrayList8 = new ArrayList();
                for (Object obj12 : union) {
                    if (!map2.containsKey((NearbyAdvertisement) obj12)) {
                        arrayList8.add(obj12);
                    }
                }
                Iterator it7 = arrayList8.iterator();
                while (it7.hasNext()) {
                    NearbyAdvertisement nearbyAdvertisement = (NearbyAdvertisement) it7.next();
                    snapshotStateMap.remove(nearbyAdvertisement);
                    snapshotStateSet.remove(nearbyAdvertisement);
                }
                Set keySet = map2.keySet();
                ArrayList arrayList9 = new ArrayList();
                for (Object obj13 : keySet) {
                    NearbyAdvertisement nearbyAdvertisement2 = (NearbyAdvertisement) obj13;
                    if (!snapshotStateMap.keys.map.containsKey(nearbyAdvertisement2) && !snapshotStateSet.contains(nearbyAdvertisement2)) {
                        arrayList9.add(obj13);
                    }
                }
                TaxReturnsPresenter taxReturnsPresenter = (TaxReturnsPresenter) obj8;
                SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) obj11;
                SnapshotStateSet snapshotStateSet2 = (SnapshotStateSet) obj10;
                Iterator it8 = arrayList9.iterator();
                while (it8.hasNext()) {
                    JobKt.launch$default(coroutineScope5, null, null, new PhonePlansHomePresenter$models$1$1(taxReturnsPresenter, (NearbyAdvertisement) it8.next(), snapshotStateMap2, snapshotStateSet2, null, 6), 3);
                }
                return Unit.INSTANCE;
            case 23:
                MutableState mutableState9 = (MutableState) obj8;
                MutableState mutableState10 = (MutableState) obj9;
                MutableState mutableState11 = (MutableState) obj11;
                PersonalizePaymentPresenter personalizePaymentPresenter = (PersonalizePaymentPresenter) this.L$0;
                PaymentScreens.PersonalizePayment personalizePayment = personalizePaymentPresenter.args;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((Boolean) ((MutableState) obj10).getValue()).booleanValue()) {
                    return Unit.INSTANCE;
                }
                if (((CharSequence) personalizePayment.note.getValue()).length() > 0) {
                    List<Element> list11 = (List) mutableState11.getValue();
                    if (!(list11 instanceof Collection) || !list11.isEmpty()) {
                        for (Element element : list11) {
                            if (!(element instanceof Text) || !((Text) element).isNote) {
                            }
                        }
                    }
                    if (!Intrinsics.areEqual(((CanvasDetails) mutableState10.getValue()).size, Size.Zero)) {
                        mutableState11.setValue(CollectionsKt.plus((Iterable) CollectionsKt__CollectionsJVMKt.listOf(personalizePaymentPresenter.createTextElement(((CanvasDetails) mutableState10.getValue()).size, ((CanvasDetails) mutableState9.getValue()).start.y + ((CanvasDetails) mutableState9.getValue()).size.height, (String) personalizePayment.note.getValue(), true, false)), (Collection) mutableState11.getValue()));
                    }
                }
                return Unit.INSTANCE;
            case 24:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(coroutineScope6, null, null, new PhonePlansHomePresenter$models$1$1((ProfilePresenter) obj10, (MutableState) obj11, (MutableState) obj9, (MutableState) obj8, null, 17), 3);
                return Unit.INSTANCE;
            case 25:
                return invokeSuspend$com$squareup$cash$profile$presenters$notifications$CategoryListPresenter$models$1$1(obj);
            case 26:
                MutableState mutableState12 = (MutableState) obj9;
                ChannelListPresenter channelListPresenter = (ChannelListPresenter) obj10;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                UiNotificationSettings uiNotificationSettings = (UiNotificationSettings) ((MutableState) obj11).getValue();
                if (uiNotificationSettings == null || (list = uiNotificationSettings.category_preferences) == null) {
                    uiCategoryNotificationPreference = null;
                } else {
                    Iterator it9 = ProfileNotificationsHelperKt.filterAccountBasedCategories((String) this.L$0, list).iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            obj2 = it9.next();
                            if (((UiCategoryNotificationPreference) obj2).category == channelListPresenter.args.categoryType) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    uiCategoryNotificationPreference = (UiCategoryNotificationPreference) obj2;
                }
                if (uiCategoryNotificationPreference == null || (category = ProfileNotificationsHelperKt.toChannelCategory(uiCategoryNotificationPreference, channelListPresenter.stringManager, true)) == null) {
                    category = (Category) mutableState12.getValue();
                }
                mutableState12.setValue(category);
                MutableState mutableState13 = (MutableState) obj8;
                if (uiCategoryNotificationPreference != null && (l = uiCategoryNotificationPreference.version) != null) {
                    obj3 = new Integer((int) l.longValue());
                }
                mutableState13.setValue(obj3);
                return Unit.INSTANCE;
            case 27:
                return invokeSuspend$com$squareup$cash$profile$presenters$notifications$ProfileNotificationsPresenter$models$$inlined$LaunchedEffectNotNull$3(obj);
            case 28:
                return invokeSuspend$com$squareup$cash$sharesheet$ShareSheetPresenter$models$$inlined$LaunchedEffectNotNull$1(obj);
            default:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Article article = (Article) obj10;
                if (!((Boolean) obj11).booleanValue()) {
                    ArticlePresenter articlePresenter = (ArticlePresenter) obj9;
                    List list12 = ArticlePresenter.ONGOING_INCIDENT_TYPES;
                    SupportTransaction supportTransaction = (SupportTransaction) ((MutableState) obj8).getValue();
                    SupportScreens.FlowScreens.ArticleScreen articleScreen = articlePresenter.args;
                    SupportScreens.FlowScreens.SupportArticleConfig supportArticleConfig = articleScreen.articleConfig;
                    SupportScreens.FlowScreens.Data data = articleScreen.data;
                    if ((supportArticleConfig instanceof SupportScreens.FlowScreens.SupportArticleConfig.ByArticleToken) || (supportArticleConfig instanceof SupportScreens.FlowScreens.SupportArticleConfig.ByTransaction) || (supportArticleConfig instanceof SupportScreens.FlowScreens.SupportArticleConfig.ByArticleTokenAndTransaction)) {
                        loadTransactionStatus = CustomerSupportAccessViewNodes.LoadTransactionStatus.NOT_APPLICABLE;
                    } else {
                        if (!(supportArticleConfig instanceof SupportScreens.FlowScreens.SupportArticleConfig.ByTransactionId) && !(supportArticleConfig instanceof SupportScreens.FlowScreens.SupportArticleConfig.ByArticleTokenAndTransactionId)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        loadTransactionStatus = supportTransaction != null ? CustomerSupportAccessViewNodes.LoadTransactionStatus.SUCCESS : CustomerSupportAccessViewNodes.LoadTransactionStatus.FAILURE;
                    }
                    CustomerSupportAccessViewNodes.LoadTransactionStatus loadTransactionStatus2 = loadTransactionStatus;
                    ArrayList arrayList10 = new ArrayList();
                    if (article.callToAction != null) {
                        arrayList10.add("call_to_action");
                    }
                    for (Link link : article.links) {
                        arrayList10.add("node_tree");
                    }
                    ListBuilder nodeTokens = ArticlePresenter.nodeTokens(article);
                    articlePresenter.analytics.track(new CustomerSupportAccessViewNodes(CollectionsKt.joinToString$default(arrayList10, ",", null, null, 0, null, null, 62), data.flowToken, ((JsonAdapter) articlePresenter.jsonListAdapter$delegate.getValue()).toJson(nodeTokens), article.token, null, null, Integer.valueOf(nodeTokens.getSize()), CustomerSupportAccessViewNodes.Trigger.NODE, articlePresenter.viewToken, data.paymentToken, loadTransactionStatus2, 4656), null);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoleculeKt$immediateClockFlow$1$1$1(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$snapshotNotifier = obj;
        this.$body = obj2;
        this.$clock = obj3;
        this.$outputBuffer = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoleculeKt$immediateClockFlow$1$1$1(Object obj, Object obj2, Continuation continuation, Object obj3, Object obj4, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$snapshotNotifier = obj;
        this.$body = obj2;
        this.$clock = obj3;
        this.$outputBuffer = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoleculeKt$immediateClockFlow$1$1$1(Object obj, Continuation continuation, MoleculePresenter moleculePresenter, Object obj2, MutableState mutableState, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$snapshotNotifier = obj;
        this.$body = moleculePresenter;
        this.$clock = obj2;
        this.$outputBuffer = mutableState;
    }
}
