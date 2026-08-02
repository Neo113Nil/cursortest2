package com.squareup.cash.keystore;

import android.security.keystore.WrappedKeyEntry;
import androidx.camera.core.impl.QuirkSettingsLoader;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.material3.DatePickerStateImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.draw.ShadowKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.sqldelight.db.QueryResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.maps.android.compose.CameraMoveStartedReason;
import com.google.maps.android.compose.CameraPositionState;
import com.jakewharton.processphoenix.ProcessPhoenix;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.loader.PaycheckActivityData;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.account.AccountReturningLoginAliasPickerShown;
import com.squareup.cash.cdf.asset.AssetRequestStart;
import com.squareup.cash.cdf.asset.AssetSendStart;
import com.squareup.cash.cdf.asset.ExperienceType;
import com.squareup.cash.cdf.asset.Origin;
import com.squareup.cash.cdf.limits.LimitsBrowseLimitTypeScreen;
import com.squareup.cash.cdf.money.BalanceObfuscationState;
import com.squareup.cash.cdf.money.MoneyBrowseViewScreen;
import com.squareup.cash.cdf.money.MoneyItemId;
import com.squareup.cash.cdf.moneybot.TemplateCardFieldType;
import com.squareup.cash.cdf.moneybot.TemplateCardPickerKind;
import com.squareup.cash.cdf.moneybot.TemplateCardPickerPlacement;
import com.squareup.cash.cdf.nearbypayment.NearbyPaymentNuxBluetoothPermissionResult;
import com.squareup.cash.cdf.nearbypayment.NearbyPaymentNuxLocationPermissionResult;
import com.squareup.cash.cdf.paychecks.PaychecksShowPaycheckReceipt;
import com.squareup.cash.cdf.stock.Frequency;
import com.squareup.cash.cdf.stock.StockSelectSelectInvestSearchStock;
import com.squareup.cash.cdf.stock.StockTradeSetAutoInvest;
import com.squareup.cash.cdf.stock.StockViewViewKeyStatsDetails;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db2.BankingConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.api.StockDetails;
import com.squareup.cash.investing.backend.real.analytics.RealInvestingAnalytics;
import com.squareup.cash.investing.db.Investing_settings;
import com.squareup.cash.investing.presenters.autoinvest.InvestingRecurringFrequencyPickerFullPresenter;
import com.squareup.cash.investing.presenters.search.InvestingSearchPresenter;
import com.squareup.cash.investing.presenters.stockdetails.InvestingStockDetailsPresenter;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.InvestingDetailTileViewEvent$KeyStatsDetailsClicked;
import com.squareup.cash.investing.viewmodels.InvestingStockDetailsViewEvent;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchViewEvent;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.limits.backend.api.LimitsPageletStore$VersionedLimitsPagelet;
import com.squareup.cash.maps.viewmodels.BoundaryLatLng;
import com.squareup.cash.maps.viewmodels.MapBoundary;
import com.squareup.cash.maps.views.MapEngineEvent;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.analytics.MoneyAnalyticsService$Companion$Source;
import com.squareup.cash.money.analytics.RealMoneyAnalyticsService;
import com.squareup.cash.money.analytics.RealMoneyAnalyticsServiceKt;
import com.squareup.cash.money.presenters.MoneyTabPresenter;
import com.squareup.cash.money.viewmodels.api.Item;
import com.squareup.cash.money.viewmodels.api.MoneySectionSorter;
import com.squareup.cash.money.viewmodels.api.Section;
import com.squareup.cash.money.viewmodels.api.SectionProvider;
import com.squareup.cash.moneybot.analytics.TemplateCardInputFieldAnalyticsData;
import com.squareup.cash.moneybot.presenters.plugins.PendingInput;
import com.squareup.cash.moneybot.presenters.plugins.TemplateCardPresenter;
import com.squareup.cash.moneybot.screens.MoneybotPendingSheet$TransferOptionPicker;
import com.squareup.cash.moneybot.viewmodels.MoneybotChatHistoryViewModel;
import com.squareup.cash.moneybot.viewmodels.RecentChatHistoryViewModel$Loaded;
import com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel;
import com.squareup.cash.moneybot.views.card.InsightChartKt;
import com.squareup.cash.mosaic.resources.api.v2.ReleaseState;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.nearby.backend.NearbyPermissionState;
import com.squareup.cash.offers.backend.real.RealOffersSheetRepository;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository$saveHomeResponse$2$1;
import com.squareup.cash.offers.db.OffersHomeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.offers.presenters.RealOffersAnalytics;
import com.squareup.cash.overlays.OverlayKt$Overlay$1$1$1$1$1;
import com.squareup.cash.p2pblocking.presenters.SelectCustomerPresenter;
import com.squareup.cash.paychecks.presenters.PaychecksActivityItemHandler;
import com.squareup.cash.paychecks.screens.PaycheckReceiptScreen;
import com.squareup.cash.paymentpad.viewmodels.FiatResetAmount;
import com.squareup.cash.paymentpad.viewmodels.MainPaymentPadViewModel;
import com.squareup.cash.paymentpad.views.MainPaymentPadViewKt;
import com.squareup.cash.paymentpad.views.Vibrator;
import com.squareup.cash.payments.backend.real.RealPersonalizationRepository;
import com.squareup.cash.payments.backend.real.RealPersonalizationRepository$cacheTopResources$2$1;
import com.squareup.cash.payments.presenters.MainPaymentPresenter;
import com.squareup.cash.payments.presenters.MainPaymentPresenter$models$1$1$WhenMappings;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.screens.Back;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.ui.widget.amount.AmountChangedSource;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.internal.Util;
import com.squareup.preferences.LongPreference;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey;
import com.squareup.protos.cash.cashsuggest.api.OffersSheetResponse;
import com.squareup.protos.cash.cashsuggest.api.OffersTabCollectionResponse;
import com.squareup.protos.cash.cashsuggest.api.OffersTabHomeResponse;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.AccountListConfig;
import com.squareup.util.cash.Countries;
import com.squareup.util.coroutines.BufferCountKt$bufferSkip$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import okhttp3.ConnectionPool;
import okhttp3.MultipartBody;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.SafeTrace;
import xyz.block.genie.state.GenieStateBinding;

/* loaded from: classes6.dex */
public final class RealKeyStoreProvider$setEntry$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $alias;
    public final /* synthetic */ Object $entry;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealKeyStoreProvider$setEntry$2(int i, Object obj, Object obj2, String str, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$entry = obj2;
        this.$alias = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$entry;
        Object obj3 = this.$alias;
        switch (i) {
            case 0:
                return new RealKeyStoreProvider$setEntry$2((RealKeyStoreProvider) this.this$0, (String) obj3, (WrappedKeyEntry) obj2, continuation, 0);
            case 1:
                return new RealKeyStoreProvider$setEntry$2((InvestingRecurringFrequencyPickerFullPresenter) this.this$0, (InvestingScreens.OrderTypeSelectionScreen.Type) obj3, (Frequency) obj2, continuation, 1);
            case 2:
                return new RealKeyStoreProvider$setEntry$2(2, (InvestingSearchPresenter) this.this$0, (InvestingSearchViewEvent) obj2, (String) obj3, continuation);
            case 3:
                return new RealKeyStoreProvider$setEntry$2((InvestingStockDetailsPresenter) this.this$0, (Investing_settings) obj3, (InvestingStockDetailsViewEvent) obj2, continuation, 3);
            case 4:
                RealKeyStoreProvider$setEntry$2 realKeyStoreProvider$setEntry$2 = new RealKeyStoreProvider$setEntry$2((InvestingStockDetailsPresenter) obj3, (MutableState) obj2, continuation, 4);
                realKeyStoreProvider$setEntry$2.this$0 = obj;
                return realKeyStoreProvider$setEntry$2;
            case 5:
                RealKeyStoreProvider$setEntry$2 realKeyStoreProvider$setEntry$22 = new RealKeyStoreProvider$setEntry$2((LimitsPageletStore$VersionedLimitsPagelet) obj3, continuation, (MusicPresenter) obj2, 5);
                realKeyStoreProvider$setEntry$22.this$0 = obj;
                return realKeyStoreProvider$setEntry$22;
            case 6:
                RealKeyStoreProvider$setEntry$2 realKeyStoreProvider$setEntry$23 = new RealKeyStoreProvider$setEntry$2((LimitsBrowseLimitTypeScreen.LimitType) obj3, continuation, (InviteErrorPresenter) obj2, 6);
                realKeyStoreProvider$setEntry$23.this$0 = obj;
                return realKeyStoreProvider$setEntry$23;
            case 7:
                return new RealKeyStoreProvider$setEntry$2((CameraPositionState) this.this$0, (Function1) obj3, (MutableState) obj2, continuation, 7);
            case 8:
                return new RealKeyStoreProvider$setEntry$2((MoneyTabPresenter) this.this$0, (ArrayList) obj3, (MutableState) obj2, continuation, 8);
            case 9:
                return new RealKeyStoreProvider$setEntry$2((DatePickerStateImpl) this.this$0, (GenieStateBinding) obj3, (MutableState) obj2, continuation, 9);
            case 10:
                return new RealKeyStoreProvider$setEntry$2((MoneybotPendingSheet$TransferOptionPicker) this.this$0, (TemplateCardPresenter) obj3, (MutableState) obj2, continuation, 10);
            case 11:
                return new RealKeyStoreProvider$setEntry$2((Integer) this.this$0, (Function1) obj3, (ChatCardViewModel.InsightCard.Chart.BarChart) obj2, continuation, 11);
            case 12:
                return new RealKeyStoreProvider$setEntry$2((MoneybotChatViewModel.Content.Chat) this.this$0, (RealHapticVibrator) obj3, (Haptics) obj2, continuation, 12);
            case 13:
                return new RealKeyStoreProvider$setEntry$2((MoneybotChatHistoryViewModel.Content) this.this$0, (SnapshotStateMap) obj3, (MutableState) obj2, continuation, 13);
            case 14:
                return new RealKeyStoreProvider$setEntry$2((MoneybotChatHistoryViewModel.Content) this.this$0, (MutableState) obj3, (MutableState) obj2, continuation, 14);
            case 15:
                return new RealKeyStoreProvider$setEntry$2((RecentChatHistoryViewModel$Loaded) this.this$0, (SnapshotStateMap) obj3, (MutableState) obj2, continuation, 15);
            case 16:
                return new RealKeyStoreProvider$setEntry$2((OffersSheetResponse) this.this$0, (RealOffersSheetRepository) obj3, (OfferSheetKey) obj2, continuation, 16);
            case 17:
                return new RealKeyStoreProvider$setEntry$2(17, (OffersTabCollectionResponse) this.this$0, (RealOffersTabRepository) obj2, (String) obj3, continuation);
            case 18:
                RealKeyStoreProvider$setEntry$2 realKeyStoreProvider$setEntry$24 = new RealKeyStoreProvider$setEntry$2((OffersTabHomeResponse) obj3, (RealOffersTabRepository) obj2, continuation, 18);
                realKeyStoreProvider$setEntry$24.this$0 = obj;
                return realKeyStoreProvider$setEntry$24;
            case 19:
                return new RealKeyStoreProvider$setEntry$2((TaxReturnsPresenter) this.this$0, (MutableState) obj3, (MutableState) obj2, continuation, 19);
            case 20:
                return new RealKeyStoreProvider$setEntry$2((CardLockPresenter) this.this$0, (AccountListConfig.Account) obj3, (UiAlias) obj2, continuation, 20);
            case 21:
                RealKeyStoreProvider$setEntry$2 realKeyStoreProvider$setEntry$25 = new RealKeyStoreProvider$setEntry$2((SelectCustomerPresenter) obj3, (MutableState) obj2, continuation, 21);
                realKeyStoreProvider$setEntry$25.this$0 = obj;
                return realKeyStoreProvider$setEntry$25;
            case 22:
                RealKeyStoreProvider$setEntry$2 realKeyStoreProvider$setEntry$26 = new RealKeyStoreProvider$setEntry$2((MutableState) obj3, (PdfPreviewPresenter) obj2, continuation, 22);
                realKeyStoreProvider$setEntry$26.this$0 = obj;
                return realKeyStoreProvider$setEntry$26;
            case 23:
                return new RealKeyStoreProvider$setEntry$2((ActivityItem) this.this$0, (ActivityItemViewEvent) obj3, (PaychecksActivityItemHandler) obj2, continuation, 23);
            case 24:
                return new RealKeyStoreProvider$setEntry$2(24, (MainPaymentPadViewModel) this.this$0, (AmountDisplayState) obj2, (String) obj3, continuation);
            case 25:
                return new RealKeyStoreProvider$setEntry$2((Shaker) this.this$0, (Vibrator) obj3, (ParcelableSnapshotMutableIntState) obj2, continuation, 25);
            case 26:
                RealKeyStoreProvider$setEntry$2 realKeyStoreProvider$setEntry$27 = new RealKeyStoreProvider$setEntry$2((RealPersonalizationRepository) obj3, (ReleaseState) obj2, continuation, 26);
                realKeyStoreProvider$setEntry$27.this$0 = obj;
                return realKeyStoreProvider$setEntry$27;
            case 27:
                return new RealKeyStoreProvider$setEntry$2((MainPaymentPresenter) this.this$0, (MutableState) obj3, (State) obj2, continuation, 27);
            case 28:
                return new RealKeyStoreProvider$setEntry$2((NearbyPermissionState) this.this$0, (CardLockPresenter) obj3, (MutableState) obj2, continuation, 28);
            default:
                return new RealKeyStoreProvider$setEntry$2((SnapshotStateMap) this.this$0, (TaxReturnsPresenter) obj3, (MutableState) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 7:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                break;
        }
        return ((RealKeyStoreProvider$setEntry$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Event assetRequestStart;
        int i = this.$r8$classId;
        int i2 = 1;
        r5 = null;
        PendingInput.TransferOptionPicker transferOptionPicker = null;
        Object obj2 = this.$alias;
        Object obj3 = this.$entry;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ConnectionPool connectionPool = ((RealKeyStoreProvider) this.this$0).keyStore;
                String str = (String) obj2;
                str.getClass();
                ((KeyStore) connectionPool.delegate).setEntry(str, (WrappedKeyEntry) obj3, null);
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                InvestingRecurringFrequencyPickerFullPresenter investingRecurringFrequencyPickerFullPresenter = (InvestingRecurringFrequencyPickerFullPresenter) this.this$0;
                RealInvestingAnalytics realInvestingAnalytics = investingRecurringFrequencyPickerFullPresenter.investingAnalytics;
                InvestingScreens.OrderTypeSelectionScreen.Type.Equity equity = (InvestingScreens.OrderTypeSelectionScreen.Type.Equity) ((InvestingScreens.OrderTypeSelectionScreen.Type) obj2);
                InvestmentEntityToken investmentEntityToken = equity.entityToken;
                String str2 = equity.symbol;
                investmentEntityToken.getClass();
                str2.getClass();
                realInvestingAnalytics.analytics.track(new StockTradeSetAutoInvest(ProcessPhoenix.toCdf(investingRecurringFrequencyPickerFullPresenter.args.orderSide), str2, (Frequency) obj3), null);
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealInvestingAnalytics realInvestingAnalytics2 = ((InvestingSearchPresenter) this.this$0).investingAnalytics;
                InvestingSearchViewEvent.StockClicked stockClicked = (InvestingSearchViewEvent.StockClicked) ((InvestingSearchViewEvent) obj3);
                InvestmentEntityToken investmentEntityToken2 = stockClicked.token;
                String str3 = stockClicked.symbol;
                investmentEntityToken2.getClass();
                str3.getClass();
                realInvestingAnalytics2.analytics.track(new StockSelectSelectInvestSearchStock(str3, (String) obj2), null);
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                InvestingStockDetailsPresenter investingStockDetailsPresenter = (InvestingStockDetailsPresenter) this.this$0;
                Investing_settings investing_settings = (Investing_settings) obj2;
                String str4 = ((InvestingStockDetailsViewEvent.DisclosureLinkClick) ((InvestingStockDetailsViewEvent) obj3)).url;
                if (str4.length() <= 0) {
                    str4 = null;
                }
                if (str4 == null) {
                    r5 = investing_settings != null ? investing_settings.disclosures_web_url : 0;
                    if (r5 != 0) {
                        str4 = r5;
                    }
                    break;
                }
                investingStockDetailsPresenter.launcher.launchUrlInInternalBrowser(str4);
            case 4:
                MutableState mutableState = (MutableState) obj3;
                InvestingDetailTileViewEvent$KeyStatsDetailsClicked investingDetailTileViewEvent$KeyStatsDetailsClicked = (InvestingDetailTileViewEvent$KeyStatsDetailsClicked) this.this$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (investingDetailTileViewEvent$KeyStatsDetailsClicked instanceof InvestingDetailTileViewEvent$KeyStatsDetailsClicked) {
                    ((InvestingStockDetailsPresenter) obj2).analytics.track(new StockViewViewKeyStatsDetails(((StockDetails) mutableState.getValue()).symbol, MultipartBody.Part.Companion.toEquityType(((StockDetails) mutableState.getValue()).f1150type)), null);
                }
                break;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                long j = ((LimitsPageletStore$VersionedLimitsPagelet) obj2).version;
                LongPreference longPreference = (LongPreference) ((MusicPresenter) obj3).musicPlayer;
                longPreference.preferences.edit().putLong(longPreference.key, j).apply();
                break;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((Analytics) ((InviteErrorPresenter) obj3).analytics).track(new LimitsBrowseLimitTypeScreen((LimitsBrowseLimitTypeScreen.LimitType) obj2), null);
                break;
            case 7:
                CameraPositionState cameraPositionState = (CameraPositionState) this.this$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                GoogleMap googleMap = (GoogleMap) ((MutableState) obj3).getValue();
                if (googleMap == null) {
                    break;
                } else {
                    LatLng latLng = ((CameraPosition) cameraPositionState.rawPosition$delegate.getValue()).target;
                    latLng.getClass();
                    LatLngBounds latLngBounds = googleMap.getProjection().getVisibleRegion().latLngBounds;
                    latLngBounds.getClass();
                    LatLng latLng2 = latLngBounds.northeast;
                    latLng2.getClass();
                    double radians = Math.toRadians(latLng.latitude);
                    double radians2 = Math.toRadians(latLng.longitude);
                    double radians3 = Math.toRadians(latLng2.latitude);
                    double radians4 = radians2 - Math.toRadians(latLng2.longitude);
                    double sin = Math.sin((radians - radians3) * 0.5d);
                    double sin2 = Math.sin(radians4 * 0.5d);
                    double asin = Math.asin(Math.sqrt((Math.cos(radians3) * Math.cos(radians) * sin2 * sin2) + (sin * sin))) * 2.0d * 6371009.0d;
                    Function1 function1 = (Function1) obj2;
                    double d = latLng.latitude;
                    double d2 = latLng.longitude;
                    float f = ((CameraPosition) cameraPositionState.rawPosition$delegate.getValue()).zoom;
                    BoundaryLatLng boundaryLatLng = new BoundaryLatLng(latLng2.latitude, latLng2.longitude);
                    LatLng latLng3 = latLngBounds.southwest;
                    function1.invoke(new MapEngineEvent.MovementFinished(d, d2, f, asin, new MapBoundary(boundaryLatLng, new BoundaryLatLng(latLng3.latitude, latLng3.longitude)), ((CameraMoveStartedReason) cameraPositionState.cameraMoveStartedReason$delegate.getValue()) == CameraMoveStartedReason.GESTURE));
                    break;
                }
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MoneyTabPresenter moneyTabPresenter = (MoneyTabPresenter) this.this$0;
                MoneyAnalyticsService moneyAnalyticsService = moneyTabPresenter.moneyAnalyticsService;
                MoneyAnalyticsService$Companion$Source moneyAnalyticsService$Companion$Source = moneyTabPresenter.args.source;
                ArrayList arrayList = (ArrayList) obj2;
                RealMoneyAnalyticsService realMoneyAnalyticsService = (RealMoneyAnalyticsService) moneyAnalyticsService;
                BalanceObfuscationState balanceObfuscationState = ((Boolean) ((Function0) Countries.observeState(realMoneyAnalyticsService.balancePrivacy.obfuscationEnabled).getValue).invoke()).booleanValue() ? BalanceObfuscationState.OBFUSCATED : BalanceObfuscationState.VISIBLE;
                Analytics analytics = realMoneyAnalyticsService.analytics;
                String str5 = realMoneyAnalyticsService.flowToken;
                Integer valueOf = Integer.valueOf(realMoneyAnalyticsService.version);
                JsonAdapter jsonAdapter = realMoneyAnalyticsService.sectionJsonAdapter;
                Util.ParameterizedTypeImpl parameterizedTypeImpl = RealMoneyAnalyticsServiceKt.SECTION_JSON_TYPE;
                ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    CollectionsKt__MutableCollectionsKt.addAll(((SectionProvider.Content) it.next()).sections, arrayList2);
                }
                for (Section section : CollectionsKt.sortedWith(arrayList2, MoneySectionSorter.INSTANCE)) {
                    String name = RealMoneyAnalyticsServiceKt.toCDFSectionId(section.getId()).name();
                    List items = section.items();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = items.iterator();
                    while (it2.hasNext()) {
                        MoneyItemId cDFItemId = RealMoneyAnalyticsServiceKt.toCDFItemId(((Item) it2.next()).getId());
                        String name2 = cDFItemId != null ? cDFItemId.name() : null;
                        if (name2 != null) {
                            arrayList3.add(name2);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        createListBuilder.add(MapsKt__MapsJVMKt.mapOf(new Pair(name, arrayList3)));
                    }
                }
                String json = jsonAdapter.toJson(MapsKt__MapsJVMKt.mapOf(new Pair("sections", CollectionsKt__CollectionsJVMKt.build(createListBuilder))));
                json.getClass();
                analytics.track(new MoneyBrowseViewScreen(str5, valueOf, json, balanceObfuscationState, moneyAnalyticsService$Companion$Source != null ? RealMoneyAnalyticsServiceKt.access$toCdfSource(moneyAnalyticsService$Companion$Source) : null), null);
                ((MutableState) obj3).setValue(Boolean.TRUE);
                break;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((Boolean) ((MutableState) obj3).getValue()).booleanValue()) {
                    ((DatePickerStateImpl) this.this$0).setSelectedDateMillis(QuirkSettingsLoader.parseIso8601Millis((String) ((GenieStateBinding) obj2).getValue()));
                }
                break;
            case 10:
                TemplateCardPresenter templateCardPresenter = (TemplateCardPresenter) obj2;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState2 = (MutableState) obj3;
                if (((PendingInput) mutableState2.getValue()) != null) {
                    break;
                } else {
                    MoneybotPendingSheet$TransferOptionPicker moneybotPendingSheet$TransferOptionPicker = (MoneybotPendingSheet$TransferOptionPicker) this.this$0;
                    if (moneybotPendingSheet$TransferOptionPicker == null) {
                        moneybotPendingSheet$TransferOptionPicker = null;
                    }
                    if (moneybotPendingSheet$TransferOptionPicker != null) {
                        if (!Intrinsics.areEqual(moneybotPendingSheet$TransferOptionPicker.renderableKey, templateCardPresenter.pluginContext.renderableKey)) {
                            moneybotPendingSheet$TransferOptionPicker = null;
                        }
                        if (moneybotPendingSheet$TransferOptionPicker != null) {
                            String str6 = moneybotPendingSheet$TransferOptionPicker.placeholderKey;
                            transferOptionPicker = new PendingInput.TransferOptionPicker(str6, new TemplateCardInputFieldAnalyticsData(str6, TemplateCardFieldType.PICKER, TemplateCardPickerKind.SAVINGS, TemplateCardPickerPlacement.BOTTOM), moneybotPendingSheet$TransferOptionPicker.amount, moneybotPendingSheet$TransferOptionPicker.transferOptions, moneybotPendingSheet$TransferOptionPicker.title, moneybotPendingSheet$TransferOptionPicker.cta, moneybotPendingSheet$TransferOptionPicker.selectedOption, moneybotPendingSheet$TransferOptionPicker.hiddenOptionValues, moneybotPendingSheet$TransferOptionPicker.balanceGatingEnabled, moneybotPendingSheet$TransferOptionPicker.forceDarkMode);
                        }
                    }
                    if (transferOptionPicker != null) {
                        mutableState2.setValue(transferOptionPicker);
                        templateCardPresenter.askQuestion(transferOptionPicker);
                    }
                    break;
                }
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Integer num = (Integer) this.this$0;
                if (num != null) {
                    ((Function1) obj2).invoke(InsightChartKt.buildBarChartHeader((ChatCardViewModel.InsightCard.Chart.BarChart) obj3, num.intValue()));
                }
                break;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!((MoneybotChatViewModel.Content.Chat) this.this$0).messages.isEmpty()) {
                    ((RealHapticVibrator) obj2).vibrate(((Haptics) obj3).success);
                }
                break;
            case 13:
                MutableState mutableState3 = (MutableState) obj3;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MoneybotChatHistoryViewModel.Content content = (MoneybotChatHistoryViewModel.Content) this.this$0;
                if (content.deleteConfirmationSessionId == null && ((String) mutableState3.getValue()) != null) {
                    String str7 = (String) mutableState3.getValue();
                    str7.getClass();
                    SnapshotStateMap snapshotStateMap = (SnapshotStateMap) obj2;
                    Integer num2 = (Integer) snapshotStateMap.get(str7);
                    snapshotStateMap.put(str7, new Integer((num2 != null ? num2.intValue() : 0) + 1));
                }
                mutableState3.setValue(content.deleteConfirmationSessionId);
                break;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MoneybotChatHistoryViewModel.Content content2 = (MoneybotChatHistoryViewModel.Content) this.this$0;
                if (content2.loadingNextPage || !content2.hasMoreSessions) {
                    ((MutableState) obj2).setValue(Boolean.FALSE);
                }
                if (!content2.loadingNextPage) {
                    ((MutableState) obj3).setValue(Boolean.FALSE);
                }
                break;
            case 15:
                MutableState mutableState4 = (MutableState) obj3;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RecentChatHistoryViewModel$Loaded recentChatHistoryViewModel$Loaded = (RecentChatHistoryViewModel$Loaded) this.this$0;
                if (recentChatHistoryViewModel$Loaded.deleteConfirmationSessionId == null && ((String) mutableState4.getValue()) != null) {
                    String str8 = (String) mutableState4.getValue();
                    str8.getClass();
                    SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) obj2;
                    Integer num3 = (Integer) snapshotStateMap2.get(str8);
                    snapshotStateMap2.put(str8, new Integer((num3 != null ? num3.intValue() : 0) + 1));
                }
                mutableState4.setValue(recentChatHistoryViewModel$Loaded.deleteConfirmationSessionId);
                break;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                OffersSheetResponse offersSheetResponse = (OffersSheetResponse) this.this$0;
                Long l = offersSheetResponse.expire_at_ms;
                if (l != null) {
                    OfferSheetKey offerSheetKey = (OfferSheetKey) obj3;
                    break;
                }
                break;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                OffersTabCollectionResponse offersTabCollectionResponse = (OffersTabCollectionResponse) this.this$0;
                Long l2 = offersTabCollectionResponse.expire_at_ms;
                if (l2 != null) {
                    String str9 = (String) obj2;
                    long longValue = l2.longValue();
                    GpsConfigQueries gpsConfigQueries = ((RealOffersTabRepository) obj3).cashDatabase.offersCollectionDetailQueries;
                    Long l3 = new Long(longValue);
                    gpsConfigQueries.getClass();
                    str9.getClass();
                    QueryResult execute = gpsConfigQueries.driver.execute(-16529075, "INSERT OR REPLACE INTO offersCollectionDetail\nVALUES (?, ?, ?)", new BankingConfigQueries$$ExternalSyntheticLambda0(str9, l3, gpsConfigQueries, offersTabCollectionResponse, 26));
                    gpsConfigQueries.notifyQueries(-16529075, new OffersHomeQueries$$ExternalSyntheticLambda1(20));
                    break;
                }
                break;
            case 18:
                CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                OffersTabHomeResponse offersTabHomeResponse = (OffersTabHomeResponse) obj2;
                RealOffersTabRepository realOffersTabRepository = (RealOffersTabRepository) obj3;
                JobKt.launch$default(coroutineScope, null, null, new RealOffersTabRepository$saveHomeResponse$2$1(offersTabHomeResponse, realOffersTabRepository, (Continuation) null), 3);
                JobKt.launch$default(coroutineScope, null, null, new BufferCountKt$bufferSkip$1(offersTabHomeResponse, realOffersTabRepository, (Continuation) null), 3);
                break;
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FilterGroupSection.FilterGroupItem.Sheet sheet = (FilterGroupSection.FilterGroupItem.Sheet) ((MutableState) obj2).getValue();
                MutableState mutableState5 = (MutableState) obj3;
                if (!((Boolean) mutableState5.getValue()).booleanValue() && sheet != null) {
                    RealOffersAnalytics realOffersAnalytics = (RealOffersAnalytics) ((TaxReturnsPresenter) this.this$0).router;
                    AnalyticsEvent analyticsEvent = sheet.analytics_view_event;
                    if (analyticsEvent == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Data validation: Sheet.analytics_view_event == null");
                        break;
                    } else {
                        RealOffersAnalytics.trackGenericAnalyticsEvent$default(realOffersAnalytics, ShadowKt.toOffersAnalyticsEventSpec(analyticsEvent));
                        mutableState5.setValue(Boolean.TRUE);
                    }
                }
                break;
            case 20:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((Analytics) ((CardLockPresenter) this.this$0).analytics).track(new AccountReturningLoginAliasPickerShown(((AccountListConfig.Account) obj2).aliases.size(), ((UiAlias) obj3) != null), null);
                break;
            case 21:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(coroutineScope2, null, null, new OverlayKt$Overlay$1$1$1$1$1((SelectCustomerPresenter) obj2, (MutableState) obj3, r5, 9), 3);
                break;
            case 22:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState6 = (MutableState) obj2;
                PdfPreviewPresenter pdfPreviewPresenter = (PdfPreviewPresenter) obj3;
                if (!((Boolean) mutableState6.getValue()).booleanValue()) {
                    mutableState6.setValue(Boolean.TRUE);
                    JobKt.launch$default(coroutineScope3, null, null, new OverlayKt$Overlay$1$1$1$1$1(pdfPreviewPresenter, mutableState6, r5, 10), 3);
                }
                break;
            case 23:
                PaychecksActivityItemHandler paychecksActivityItemHandler = (PaychecksActivityItemHandler) obj3;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ActivityItem activityItem = (ActivityItem) this.this$0;
                if (activityItem instanceof PaycheckActivityData) {
                    if (Intrinsics.areEqual((ActivityItemViewEvent) obj2, ActivityItemViewEvent.ItemClicked.INSTANCE)) {
                        String str10 = ((PaycheckActivityData) activityItem).paycheck.paycheck_token;
                        str10.getClass();
                        paychecksActivityItemHandler.analytics.track(new PaychecksShowPaycheckReceipt(str10), null);
                        paychecksActivityItemHandler.navigator.goTo(new PaycheckReceiptScreen(((PaycheckActivityData) activityItem).paycheck));
                    }
                    break;
                } else {
                    Path$$ExternalSyntheticBUOutline0.m((Object) Recorder$$ExternalSyntheticOutline2.m("PaychecksActivityItemHandler only supports PaychecksActivityItem. Given item was ", Reflection.factory.getOrCreateKotlinClass(activityItem.getClass()).getSimpleName()));
                    break;
                }
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MainPaymentPadViewModel mainPaymentPadViewModel = (MainPaymentPadViewModel) this.this$0;
                FiatResetAmount fiatResetAmount = mainPaymentPadViewModel.resetAmount;
                AmountDisplayState amountDisplayState = (AmountDisplayState) obj3;
                CurrencyCode currencyCode = mainPaymentPadViewModel.currencyCode;
                if (fiatResetAmount != null) {
                    AmountConfig.MoneyConfig moneyConfig = new AmountConfig.MoneyConfig(currencyCode, null, false, 0, 14);
                    String str11 = (String) obj2;
                    str11.getClass();
                    AmountDisplayState.reset$default(amountDisplayState, null, 1);
                    amountDisplayState.applyConfig(moneyConfig);
                    amountDisplayState.reset(str11, AmountChangedSource.ConfigReset.INSTANCE);
                } else {
                    amountDisplayState.applyConfig(new AmountConfig.MoneyConfig(currencyCode, null, false, 0, 14));
                }
                break;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = MainPaymentPadViewKt.LocalElementBoundsRegistry;
                if (((ParcelableSnapshotMutableIntState) obj3).getIntValue() == 0) {
                    break;
                } else {
                    ((Shaker) this.this$0).shake();
                    ((Vibrator) obj2).vibrate();
                    break;
                }
            case 26:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealPersonalizationRepository realPersonalizationRepository = (RealPersonalizationRepository) obj2;
                ReleaseState releaseState = (ReleaseState) obj3;
                JobKt.launch$default(coroutineScope4, null, null, new RealPersonalizationRepository$cacheTopResources$2$1(realPersonalizationRepository, releaseState, r5, r3), 3);
                break;
            case 27:
                State state = (State) obj3;
                MainPaymentPresenter mainPaymentPresenter = (MainPaymentPresenter) this.this$0;
                PaymentScreens.MainPayment mainPayment = mainPaymentPresenter.args;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState7 = (MutableState) obj2;
                if (!((Boolean) mutableState7.getValue()).booleanValue()) {
                    Analytics analytics2 = mainPaymentPresenter.analytics;
                    int i3 = MainPaymentPresenter$models$1$1$WhenMappings.$EnumSwitchMapping$0[mainPayment.orientation.ordinal()];
                    if (i3 == 1) {
                        String uuid = mainPayment.paymentToken.toString();
                        Origin origin = Origin.AMOUNT_FIRST;
                        ExperienceType experienceType = ExperienceType.LEGACY;
                        Boolean bool = (Boolean) state.getValue();
                        bool.booleanValue();
                        assetRequestStart = new AssetRequestStart(null, null, uuid, null, origin, null, null, null, null, null, null, null, null, bool, experienceType, null, 163819);
                    } else if (i3 != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        String uuid2 = mainPayment.paymentToken.toString();
                        Origin origin2 = Origin.AMOUNT_FIRST;
                        ExperienceType experienceType2 = ExperienceType.LEGACY;
                        Boolean bool2 = (Boolean) state.getValue();
                        bool2.booleanValue();
                        assetRequestStart = new AssetSendStart(null, null, uuid2, null, origin2, null, null, null, null, null, null, null, null, bool2, experienceType2, null, 1310699);
                    }
                    analytics2.track(assetRequestStart, null);
                    mutableState7.setValue(Boolean.TRUE);
                }
                break;
            case 28:
                CardLockPresenter cardLockPresenter = (CardLockPresenter) obj2;
                String str12 = (String) cardLockPresenter.ioDispatcher;
                Analytics analytics3 = (Analytics) cardLockPresenter.analytics;
                NearbyPermissionState nearbyPermissionState = (NearbyPermissionState) this.this$0;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState8 = (MutableState) obj3;
                NearbyPermissionState nearbyPermissionState2 = (NearbyPermissionState) mutableState8.getValue();
                if (!nearbyPermissionState2.bluetoothPermission.granted && nearbyPermissionState.bluetoothPermission.granted) {
                    str12.getClass();
                    analytics3.track(new NearbyPaymentNuxBluetoothPermissionResult(Boolean.TRUE, str12), null);
                }
                if (!nearbyPermissionState2.locationPermission.granted && nearbyPermissionState.locationPermission.granted) {
                    str12.getClass();
                    analytics3.track(new NearbyPaymentNuxLocationPermissionResult(Boolean.TRUE, str12), null);
                }
                mutableState8.setValue(nearbyPermissionState);
                break;
            default:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState9 = (MutableState) obj3;
                if (!((SnapshotStateMap) this.this$0).isEmpty()) {
                    mutableState9.setValue(Boolean.TRUE);
                } else if (((Boolean) mutableState9.getValue()).booleanValue()) {
                    ((BetterNavigator.ScreenNavigator) ((TaxReturnsPresenter) obj2).navigator).goTo(Back.INSTANCE);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealKeyStoreProvider$setEntry$2(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$alias = obj2;
        this.$entry = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealKeyStoreProvider$setEntry$2(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$alias = obj;
        this.$entry = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealKeyStoreProvider$setEntry$2(Object obj, Continuation continuation, MoleculePresenter moleculePresenter, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$alias = obj;
        this.$entry = moleculePresenter;
    }
}
