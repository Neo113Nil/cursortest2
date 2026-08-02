package com.squareup.cash.card.onboarding;

import androidx.compose.runtime.MutableState;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import app.cash.local.presenters.cart.LocalBrandLocationCartPresenter;
import app.cash.local.presenters.cart.LocalBrandLocationCartPresenter$models$8$4;
import app.cash.local.primitives.LocationToken;
import app.cash.local.viewmodels.CreateCartErrorViewModel;
import app.cash.local.viewmodels.LocalBrandLocationOpenTabViewEvent;
import app.cash.local.viewmodels.LocalBrandLocationsBottomSheetModel$Location;
import app.cash.local.viewmodels.fulfillment.SchedulingDayTimePickerViewEvent;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.filament.Material;
import com.google.android.filament.MaterialInstance;
import com.squareup.cash.R;
import com.squareup.cash.RealBugReportSenderFactory;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpaySearchViewEvent;
import com.squareup.cash.arcade.components.avatar.AvatarCarouselEntry;
import com.squareup.cash.autofillweb.api.AutofillWebInfo;
import com.squareup.cash.billssubscriptions.viewmodels.BillsSubscriptionsMerchantListViewEvent;
import com.squareup.cash.billssubscriptions.viewmodels.model.Merchant;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.EarnerEnrollmentBlockerViewModel;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayEvent;
import com.squareup.cash.cdf.BrowserOrigin;
import com.squareup.cash.cdf.browser.AutofillPillType;
import com.squareup.cash.cdf.browser.BrowserCheckoutTapAutofillPill;
import com.squareup.cash.cdf.browser.InfoContext;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.viewmodels.ordertype.InvestingOrderTypeRowViewModel;
import com.squareup.cash.investing.viewmodels.ordertype.InvestingOrderTypeSelectionViewEvent;
import com.squareup.cash.moneybot.viewmodels.MoneybotChatHistoryViewModel;
import com.squareup.cash.moneybot.viewmodels.RecentChatHistoryViewModel$Loaded;
import com.squareup.cash.offers.viewmodels.itemviewmodels.CategoryOffersTileViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersCommonOfferRowViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersSearchListItemViewModel;
import com.squareup.cash.offers.viewmodels.viewevents.OfferItemClicked;
import com.squareup.cash.offers.viewmodels.viewevents.OffersHomeViewEvent;
import com.squareup.cash.phoneplans.WirelessProviderListViewEvent;
import com.squareup.cash.phoneplans.WirelessProviderListViewModel;
import com.squareup.cash.profile.viewmodels.Alias;
import com.squareup.cash.profile.viewmodels.ContactMethodDetailsViewEvent;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter$Companion$FillType;
import com.squareup.cash.shopping.screens.ShoppingScreenContext;
import com.squareup.cash.shopping.screens.ShoppingWebScreen;
import com.squareup.cash.shopping.viewmodels.SearchResultsViewEvent;
import com.squareup.cash.support.viewmodels.SupportSearchViewModel;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.work.viewmodels.PayHistoryListViewEvent;
import com.squareup.cash.work.viewmodels.PayHistoryStubViewModel;
import com.squareup.cash.work.viewmodels.ToastState;
import com.squareup.cash.work.viewmodels.ToastType;
import com.squareup.protos.cash.local.client.v1.SchedulingDay;
import com.squareup.protos.cash.local.client.v1.SchedulingTime;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.postcard.CardModule$HeroNullStateModule$Nux$UhchNux;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.cards.CardThemeDefinition;
import com.squareup.protos.franklin.cards.CardThemeDefinitions;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes6.dex */
public final class CardModelView$1$3$4$2 implements Function0 {
    public final /* synthetic */ Object $modelData;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ CardModelView$1$3$4$2(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.$modelData = obj;
        this.this$0 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        InvestingOrderTypeSelectionViewEvent.OrderTypeClick orderTypeClick;
        ShoppingWebScreen.AffiliateShoppingScreen affiliateShoppingScreen;
        String str;
        String str2;
        String str3;
        String str4;
        CardThemeDefinition cardThemeDefinition;
        CardTheme cardTheme;
        List listOfNotNull;
        Map map;
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX unifiedCardHomeNUX;
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.UpsellCard upsellCard;
        int i = this.$r8$classId;
        int i2 = 1;
        Object[] objArr = 0;
        Object obj = this.this$0;
        Object obj2 = this.$modelData;
        switch (i) {
            case 0:
                InputStream inputStream = (InputStream) obj2;
                inputStream.reset();
                CardModelView cardModelView = (CardModelView) obj;
                Material material = cardModelView.copyMaterial;
                material.getClass();
                MaterialInstance createInstance = material.createInstance();
                break;
            case 1:
                JobKt.launch$default((CoroutineScope) obj2, null, null, new LocalBrandLocationCartPresenter$models$8$4((LocalBrandLocationCartPresenter) obj, objArr == true ? 1 : 0, i2), 3);
                break;
            case 2:
                ((Function1) obj2).invoke(new LocalBrandLocationOpenTabViewEvent.ErrorDismissed(((CreateCartErrorViewModel) obj).id));
                break;
            case 3:
                MutableState mutableState = (MutableState) obj;
                String str5 = ((LocalBrandLocationsBottomSheetModel$Location) obj2).token;
                mutableState.setValue(str5 != null ? new LocationToken(str5) : null);
                break;
            case 4:
                ((Function1) obj2).invoke(new SchedulingDayTimePickerViewEvent.DaySelected((SchedulingDay) obj));
                break;
            case 5:
                ((Function1) obj2).invoke(new SchedulingDayTimePickerViewEvent.TimeSelected((SchedulingTime) obj));
                break;
            case 6:
                AfterpaySearchViewModel.CategoryTileViewModel categoryTileViewModel = (AfterpaySearchViewModel.CategoryTileViewModel) obj;
                ((Function1) obj2).invoke(new AfterpaySearchViewEvent.CategoryTileClicked(categoryTileViewModel.getTapActionUrl(), CollectionsKt.filterNotNull(CollectionsKt__CollectionsJVMKt.listOf(categoryTileViewModel.getImpressionEventSpec()))));
                break;
            case 7:
                ((Function1) obj2).invoke((AvatarCarouselEntry) obj);
                break;
            case 8:
                ((Function1) obj2).invoke(new BillsSubscriptionsMerchantListViewEvent.MerchantTapped(((Merchant) obj).name));
                break;
            case 9:
                ((Function1) obj2).invoke(((EarnerEnrollmentBlockerViewModel.CategorySelection.Category) obj).category);
                break;
            case 10:
                ((Function1) obj).invoke((BorrowHomeOverlayEvent) obj2);
                break;
            case 11:
                ((Function1) obj2).invoke(((PaymentDeviceItemViewModel) obj).id);
                break;
            case 12:
                int ordinal = ((InvestingOrderTypeRowViewModel) obj2).icon.ordinal();
                if (ordinal == 0) {
                    orderTypeClick = new InvestingOrderTypeSelectionViewEvent.OrderTypeClick(InvestingOrderTypeSelectionViewEvent.OrderTypeClick.Type.AUTO_INVEST);
                } else if (ordinal != 1 && ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    orderTypeClick = new InvestingOrderTypeSelectionViewEvent.OrderTypeClick(InvestingOrderTypeSelectionViewEvent.OrderTypeClick.Type.CUSTOM_ORDER);
                }
                ((Function1) obj).invoke(orderTypeClick);
                break;
            case 13:
                ((Function1) obj2).invoke(((MoneybotChatHistoryViewModel.Content.Session) obj).action);
                break;
            case 14:
                ((Function1) obj2).invoke(((RecentChatHistoryViewModel$Loaded.Session) obj).action);
                break;
            case 15:
                OffersCommonOfferRowViewModel offersCommonOfferRowViewModel = (OffersCommonOfferRowViewModel) obj;
                ((Function1) obj2).invoke(new OfferItemClicked(offersCommonOfferRowViewModel.tapActionUrl, offersCommonOfferRowViewModel.itemToken, offersCommonOfferRowViewModel.rowViewModel.tapEventSpecs));
                break;
            case 16:
                CategoryOffersTileViewModel categoryOffersTileViewModel = (CategoryOffersTileViewModel) obj;
                ((Function1) obj2).invoke(new OffersHomeViewEvent.OffersCategoryTileClicked(categoryOffersTileViewModel.getTapActionUrl(), categoryOffersTileViewModel.getTapEventSpecs()));
                break;
            case 17:
                ((Function0) obj2).invoke();
                ((Function0) obj).invoke();
                break;
            case 18:
                OffersSearchListItemViewModel.OffersSearchFilterRowViewModel offersSearchFilterRowViewModel = (OffersSearchListItemViewModel.OffersSearchFilterRowViewModel) obj;
                ((Function2) obj2).invoke(offersSearchFilterRowViewModel.filterToken, offersSearchFilterRowViewModel.rowViewModel.tapEventSpecs);
                break;
            case 19:
                ((Function1) obj2).invoke(new WirelessProviderListViewEvent.ProviderSelected(((WirelessProviderListViewModel.ProviderItem) obj).id));
                break;
            case 20:
                Alias alias = (Alias) obj;
                ((Function1) obj2).invoke(new ContactMethodDetailsViewEvent.NotificationToggled(alias, true ^ alias.isChecked));
                break;
            case 21:
                ShoppingWebPresenter shoppingWebPresenter = (ShoppingWebPresenter) obj2;
                MutableState mutableState2 = (MutableState) obj;
                Set set = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                String str6 = ((ShoppingWebPresenter.State) mutableState2.getValue()).cardState.fullNumber;
                if (str6 == null || StringsKt.isBlank(str6) || (str = ((ShoppingWebPresenter.State) mutableState2.getValue()).cardState.expiryMonth) == null || StringsKt.isBlank(str) || (str2 = ((ShoppingWebPresenter.State) mutableState2.getValue()).cardState.expiryYear) == null || StringsKt.isBlank(str2) || (str3 = ((ShoppingWebPresenter.State) mutableState2.getValue()).cardState.cvv) == null || StringsKt.isBlank(str3) || !((ShoppingWebPresenter.State) mutableState2.getValue()).cardState.enabled) {
                    ShoppingWebPresenter.State state = (ShoppingWebPresenter.State) mutableState2.getValue();
                    ShoppingWebScreen shoppingWebScreen = shoppingWebPresenter.args;
                    if (shoppingWebScreen instanceof ShoppingWebScreen.AffiliateShoppingScreen) {
                        ShoppingWebScreen.AffiliateShoppingScreen affiliateShoppingScreen2 = (ShoppingWebScreen.AffiliateShoppingScreen) shoppingWebScreen;
                        String str7 = state.headerViewModel.urlText;
                        ShoppingScreenContext shoppingScreenContext = affiliateShoppingScreen2.screenContext;
                        String str8 = affiliateShoppingScreen2.discountText;
                        String str9 = affiliateShoppingScreen2.rewardToken;
                        String str10 = affiliateShoppingScreen2.merchantToken;
                        String str11 = affiliateShoppingScreen2.userAgent;
                        str8.getClass();
                        str9.getClass();
                        affiliateShoppingScreen = new ShoppingWebScreen.AffiliateShoppingScreen(str7, shoppingScreenContext, str8, str9, str10, str11);
                    } else {
                        affiliateShoppingScreen = null;
                    }
                    if (!state.cardState.enabled) {
                        BetterNavigator.ScreenNavigator screenNavigator = shoppingWebPresenter.navigator;
                        FlowStarter flowStarter = shoppingWebPresenter.flowStarter;
                        ShoppingWebScreen shoppingWebScreen2 = affiliateShoppingScreen != null ? affiliateShoppingScreen : shoppingWebScreen;
                        BlockersData.AnalyticsData.Source source = BlockersData.AnalyticsData.Source.SHOPPING;
                        shoppingWebScreen2.getClass();
                        source.getClass();
                        screenNavigator.goTo(new BlockersScreens.StartFlowEntryPointScreen(BlockersData.copy$default(FlowStarter.startFlow$default((RealFlowStarter) flowStarter, BlockersData.Flow.SERVER_FLOW, shoppingWebScreen2, null, null, null, null, new BlockersData.AnalyticsData(source, (String) null, 6), null, null, 892), null, null, null, Flow$Type.ENABLE_ISSUED_CARD, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -9, 65535), (String) null, shoppingWebScreen2, (BlockersScreens.StartFlowEntryPointScreen.Origin) null, 26));
                    }
                }
                AutofillWebInfo autofillWebInfo = new AutofillWebInfo(((ShoppingWebPresenter.State) mutableState2.getValue()).cardState.fullNumber, ((ShoppingWebPresenter.State) mutableState2.getValue()).cardState.expiryMonth, ((ShoppingWebPresenter.State) mutableState2.getValue()).cardState.expiryYear, ((ShoppingWebPresenter.State) mutableState2.getValue()).cardState.cvv, null, null, null, null, null, null, null, null, null, null, null, 32752);
                Analytics analytics = shoppingWebPresenter.analytics;
                RealBugReportSenderFactory realBugReportSenderFactory = shoppingWebPresenter.shoppingWebAnalytics;
                analytics.track(new BrowserCheckoutTapAutofillPill((InfoContext) realBugReportSenderFactory.featureEligibilityDumper, (BrowserOrigin) realBugReportSenderFactory.sessionManager, (String) realBugReportSenderFactory.tempStorage, (String) realBugReportSenderFactory.recentMoneybotSession, (String) realBugReportSenderFactory.bugsnagClient, AutofillPillType.Payment), null);
                shoppingWebPresenter.performAutofill(autofillWebInfo, ShoppingWebPresenter$Companion$FillType.CARD);
                mutableState2.setValue(ShoppingWebPresenter.State.copy$default((ShoppingWebPresenter.State) mutableState2.getValue(), false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, true, null, 503316479));
                break;
            case 22:
                Function1 function1 = (Function1) obj2;
                DirectoryListItem.ItemViewModel itemViewModel = (DirectoryListItem.ItemViewModel) obj;
                String str12 = itemViewModel.itemActionUrl;
                if (str12 == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("itemActionUrl cannot be null");
                    break;
                } else {
                    function1.invoke(new SearchResultsViewEvent.ItemClick(str12, itemViewModel.analyticsData, null));
                    break;
                }
            case 23:
                ((Function1) obj2).invoke((SupportSearchViewModel.SearchResultViewModel.Item) obj);
                break;
            case 24:
                ((Function1) obj2).invoke(((SupportSearchViewModel.SearchResultViewModel.ContactOption) obj).f1212type);
                break;
            case 25:
                ((Function1) obj2).invoke((String) obj);
                break;
            case 26:
                CardModule.HeroNullStateModule.UnifiedCardHomeNUX.UpsellCard upsellCard2 = ((CardModule.HeroNullStateModule.UnifiedCardHomeNUX) obj2).upsell_card;
                List listOfNotNull2 = CollectionsKt__CollectionsKt.listOfNotNull((upsellCard2 == null || (str4 = upsellCard2.card_theme_token) == null || (cardThemeDefinition = (CardThemeDefinition) ((Map) obj).get(str4)) == null) ? null : cardThemeDefinition.card_theme);
                if (!listOfNotNull2.isEmpty()) {
                    break;
                }
                break;
            case 27:
                CardThemeDefinitions cardThemeDefinitions = (CardThemeDefinitions) obj2;
                if (cardThemeDefinitions != null && (map = cardThemeDefinitions.card_theme_definitions) != null) {
                    CardModule$HeroNullStateModule$Nux$UhchNux cardModule$HeroNullStateModule$Nux$UhchNux = ((CardModule.HeroNullStateModule) obj).nux;
                    CardThemeDefinition cardThemeDefinition2 = (CardThemeDefinition) map.get((cardModule$HeroNullStateModule$Nux$UhchNux == null || (unifiedCardHomeNUX = cardModule$HeroNullStateModule$Nux$UhchNux.value) == null || (upsellCard = unifiedCardHomeNUX.upsell_card) == null) ? null : upsellCard.card_theme_token);
                    if (cardThemeDefinition2 != null) {
                        cardTheme = cardThemeDefinition2.card_theme;
                        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(cardTheme);
                        if (listOfNotNull.isEmpty()) {
                            break;
                        }
                    }
                }
                cardTheme = null;
                listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(cardTheme);
                if (listOfNotNull.isEmpty()) {
                }
                break;
            case 28:
                ((MutableState) obj).setValue(new ToastState(((AndroidStringManager) ((CardLockPresenter) obj2).stringManager).get(R.string.work_shift_break_started), Long.valueOf(System.currentTimeMillis()), ToastType.Success));
                break;
            default:
                ((Function1) obj2).invoke(new PayHistoryListViewEvent.StubClicked(((PayHistoryStubViewModel) obj).id));
                break;
        }
        return Unit.INSTANCE;
    }
}
