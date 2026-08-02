package com.squareup.cash.arcade.treehouse;

import android.net.Uri;
import androidx.camera.core.impl.QuirkSettingsLoader;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.text.TextRange;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda4;
import com.google.android.gms.internal.mlkit_vision_common.zzjr;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.VariantSandboxedComponent;
import com.squareup.cash.account.navigation.RealAccountOutboundNavigator;
import com.squareup.cash.activity.analytics.ActivityAnalyticsService;
import com.squareup.cash.activity.backend.RealActivityAnalyticsService;
import com.squareup.cash.activity.presenters.ActivityTabPresenter;
import com.squareup.cash.activity.viewmodels.ActivityTabViewModel;
import com.squareup.cash.activity.viewmodels.PulledToRefresh;
import com.squareup.cash.activity.viewmodels.ViewLoaded;
import com.squareup.cash.activity.views.ActivityTabViewKt$$ExternalSyntheticLambda17;
import com.squareup.cash.afterpayapplet.applets.presenters.AfterpayAppletTilePresenter;
import com.squareup.cash.afterpayapplet.applets.viewmodels.AfterpayAppletTileViewModel;
import com.squareup.cash.afterpayapplet.backend.HomeResult;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletAnalytics;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletMerchantSheetRepository;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayMerchantRepo;
import com.squareup.cash.afterpayapplet.db.AfterpayAppletMerchantSheet;
import com.squareup.cash.afterpayapplet.db.AfterpayAppletMerchantSheetQueries$getForToken$2;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletPurchasesEmbeddedPresenter;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletHomeScreen;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletRetroOrderSelectionViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletItemViewed;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletRetroOrderSelectionViewEvent;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.ItemViewed;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.cash.app.api.ContextKt$$ExternalSyntheticLambda1;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.InlineAppMessageViewModel;
import com.squareup.cash.appmessages.RealAppMessageManager;
import com.squareup.cash.appmessages.RealAppMessageRepositoryWriter;
import com.squareup.cash.appmessages.SheetAppMessage;
import com.squareup.cash.appmessages.db.CardMessageQueries$$ExternalSyntheticLambda7;
import com.squareup.cash.appmessages.db.SheetMessage;
import com.squareup.cash.appmessages.presenters.RealInAppNotificationPresenter;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.bitcoin.presenters.BitcoinQrCodeScannerPresenter$State;
import com.squareup.cash.bitcoin.presenters.RealBitcoinAmountPickerPresenter;
import com.squareup.cash.bitcoin.screens.BitcoinAmountPickerScreen;
import com.squareup.cash.bitcoin.viewmodels.keypad.BitcoinKeypadEvent;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cdf.AppMessageFormat;
import com.squareup.cash.cdf.afterpayapplet.AfterpayAppletScreen;
import com.squareup.cash.cdf.app.AppNavigateOpenSpace;
import com.squareup.cash.cdf.appmessage.AppMessageInteractClick;
import com.squareup.cash.cdf.detailspage.DetailsPageInteractDismissPage;
import com.squareup.cash.cdf.overdraftcoverage.OverdraftCoverageViewViewStatus;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.cash.permissions.AndroidPermissionManager$create$1;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.profile.presenters.ProfilePresenter;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.screens.Back;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.cashsuggest.api.AfterpayMerchantSheetResponse;
import com.squareup.protos.cash.cashsuggest.api.CreditLineSnapshot;
import com.squareup.protos.cash.discover.api.app.v1.model.DetailsPage;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.HalfSheetMessage;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.wire.GrpcMethod;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.SafeTrace;
import squareup.cash.earnings.EarningTool;
import squareup.cash.overdraft.OverdraftStatus;

/* loaded from: classes5.dex */
public final class SearchBarBinding$Content$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $textFieldState;
    public /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchBarBinding$Content$1$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$textFieldState = obj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$textFieldState;
        switch (i) {
            case 0:
                return new SearchBarBinding$Content$1$1((SearchBarBinding) this.this$0, (TextFieldState) obj2, continuation, 0);
            case 1:
                return new SearchBarBinding$Content$1$1((MutableState) this.this$0, (TapToPayPresenter) obj2, continuation, 1);
            case 2:
                SearchBarBinding$Content$1$1 searchBarBinding$Content$1$1 = new SearchBarBinding$Content$1$1((TapToPayPresenter) obj2, continuation, 2);
                searchBarBinding$Content$1$1.this$0 = obj;
                return searchBarBinding$Content$1$1;
            case 3:
                return new SearchBarBinding$Content$1$1((ActivityTabPresenter) this.this$0, (MutableState) obj2, continuation, 3);
            case 4:
                return new SearchBarBinding$Content$1$1((ActivityTabViewModel) this.this$0, (Function1) obj2, continuation, 4);
            case 5:
                return new SearchBarBinding$Content$1$1((ActivityTabViewModel) this.this$0, (SearchBarKeyboardState) obj2, continuation, 5);
            case 6:
                return new SearchBarBinding$Content$1$1((LazyListState) this.this$0, (Function1) obj2, continuation, 6);
            case 7:
                return new SearchBarBinding$Content$1$1((AfterpayAppletTilePresenter) this.this$0, (AfterpayAppletScreen$AfterpayAppletHomeScreen) obj2, continuation, 7);
            case 8:
                return new SearchBarBinding$Content$1$1((PromotedAppletTileViewModel) this.this$0, (MutableState) obj2, continuation, 8);
            case 9:
                return new SearchBarBinding$Content$1$1((AfterpayAppletTileViewModel) this.this$0, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj2, continuation, 9);
            case 10:
                return new SearchBarBinding$Content$1$1((RealAfterpayAppletMerchantSheetRepository) this.this$0, (String) obj2, continuation, 10);
            case 11:
                return new SearchBarBinding$Content$1$1((List) this.this$0, (RealAfterpayMerchantRepo) obj2, continuation, 11);
            case 12:
                return new SearchBarBinding$Content$1$1((AfterpayAppletPurchasesEmbeddedPresenter) this.this$0, (MutableState) obj2, continuation, 12);
            case 13:
                return new SearchBarBinding$Content$1$1((PoolsListPresenter) this.this$0, (MutableState) obj2, continuation, 13);
            case 14:
                return new SearchBarBinding$Content$1$1((Function1) this.this$0, (List) obj2, continuation, 14);
            case 15:
                return new SearchBarBinding$Content$1$1((AfterpayAppletRetroOrderSelectionViewModel.Loaded) this.this$0, (Function1) obj2, continuation, 15);
            case 16:
                return new SearchBarBinding$Content$1$1((List) this.this$0, (ParcelableSnapshotMutableIntState) obj2, continuation, 16);
            case 17:
                return new SearchBarBinding$Content$1$1((AmountDisplayState) this.this$0, (AmountConfig) obj2, continuation, 17);
            case 18:
                SearchBarBinding$Content$1$1 searchBarBinding$Content$1$12 = new SearchBarBinding$Content$1$1((VariantSandboxedComponent) obj2, continuation, 18);
                searchBarBinding$Content$1$12.this$0 = obj;
                return searchBarBinding$Content$1$12;
            case 19:
                return new SearchBarBinding$Content$1$1((RealAppMessageManager) this.this$0, (LinkedHashSet) obj2, continuation, 19);
            case 20:
                return new SearchBarBinding$Content$1$1((RealAppMessageRepositoryWriter) this.this$0, (AppMessage) obj2, continuation, 20);
            case 21:
                return new SearchBarBinding$Content$1$1((RealAppMessageRepositoryWriter) this.this$0, (List) obj2, continuation, 21);
            case 22:
                return new SearchBarBinding$Content$1$1((DisclosurePresenter) this.this$0, (MutableState) obj2, continuation, 22);
            case 23:
                return new SearchBarBinding$Content$1$1((AppMessageViewEvent) this.this$0, (CardStudioPresenter) obj2, continuation, 23);
            case 24:
                return new SearchBarBinding$Content$1$1((RealInAppNotificationPresenter) this.this$0, (AppMessageViewEvent) obj2, continuation, 24);
            case 25:
                return new SearchBarBinding$Content$1$1((LocalCashBalancePresenter) this.this$0, (MutableState) obj2, continuation, 25);
            case 26:
                return new SearchBarBinding$Content$1$1((LocalHomePresenter) this.this$0, (OverdraftStatus) obj2, continuation, 26);
            case 27:
                return new SearchBarBinding$Content$1$1((LocalHomePresenter) this.this$0, (OverdraftStatus) obj2, continuation, 27);
            case 28:
                return new SearchBarBinding$Content$1$1((ProfilePresenter) this.this$0, (MutableState) obj2, continuation, 28);
            default:
                return new SearchBarBinding$Content$1$1((RealBitcoinAmountPickerPresenter) this.this$0, (MutableState) obj2, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((SearchBarBinding$Content$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0149  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AfterpayMerchantSheetResponse afterpayMerchantSheetResponse;
        Long l;
        CreditLineSnapshot creditLineSnapshot;
        Unit unit;
        HalfSheetMessage halfSheetMessage;
        zzjr zzjrVar;
        DetailsPage access$getDetailsPage;
        OverdraftCoverageViewViewStatus.OverdraftStatus overdraftStatus;
        OverdraftCoverageViewViewStatus.OverdraftStatus overdraftStatus2;
        OverdraftCoverageViewViewStatus.OverdraftStatus overdraftStatus3;
        OverdraftCoverageViewViewStatus.OverdraftStatus overdraftStatus4;
        int i = this.$r8$classId;
        int i2 = 17;
        int i3 = 21;
        int i4 = 0;
        int i5 = 1;
        Unit unit2 = null;
        r6 = null;
        r6 = null;
        r6 = null;
        Long l2 = null;
        Object obj2 = this.$textFieldState;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SearchBarBinding searchBarBinding = (SearchBarBinding) this.this$0;
                int i6 = SearchBarBinding.$r8$clinit;
                app.cash.arcade.values.TextFieldState query = searchBarBinding.getQuery();
                TextFieldState textFieldState = (TextFieldState) obj2;
                String obj3 = textFieldState.getValue$foundation().text.toString();
                long j = textFieldState.getValue$foundation().selection;
                int i7 = TextRange.$r8$clinit;
                searchBarBinding.query$delegate.setValue(query.userEdit((int) (j >> 32), (int) (textFieldState.getValue$foundation().selection & BodyPartID.bodyIdMax), obj3));
                Function1 function1 = (Function1) searchBarBinding.onQueryChange$delegate.getValue();
                if (function1 != null) {
                    function1.invoke(searchBarBinding.getQuery());
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Uri uri = (Uri) ((MutableState) this.this$0).getValue();
                if (uri != null) {
                    BetterNavigator.ScreenNavigator screenNavigator = ((RealAccountOutboundNavigator) ((TapToPayPresenter) obj2).mriFactory).navigator;
                    String uri2 = uri.toString();
                    uri2.getClass();
                    screenNavigator.goTo(new ProfileScreens.CropScreen(uri2));
                }
                break;
            case 2:
                PublicProfile publicProfile = (PublicProfile) this.this$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((ParcelableSnapshotMutableState) ((TapToPayPresenter) obj2).ttpSessionManager).setValue(publicProfile.photoUrl);
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ActivityAnalyticsService activityAnalyticsService = ((ActivityTabPresenter) this.this$0).activityAnalyticsService;
                MutableState mutableState = (MutableState) obj2;
                boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                Analytics analytics = ((RealActivityAnalyticsService) activityAnalyticsService).analyticsService;
                AppNavigateOpenSpace.Space space = AppNavigateOpenSpace.Space.ACTIVITY;
                AppNavigateOpenSpace.Source source = booleanValue ? AppNavigateOpenSpace.Source.SWIPE : null;
                Boolean bool = Boolean.FALSE;
                analytics.track(new AppNavigateOpenSpace(source, null, space, null, EnumC0170g.SDK_ASSET_ICON_PAUSE_VALUE), null);
                mutableState.setValue(bool);
                break;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!((ActivityTabViewModel) this.this$0).isRefreshing) {
                    ((Function1) obj2).invoke(ViewLoaded.INSTANCE);
                }
                break;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (StringsKt.isBlank(((ActivityTabViewModel) this.this$0).searchQuery.getValue())) {
                    ((SearchBarKeyboardState) obj2).setOpen(false);
                }
                break;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((LazyListState) this.this$0).scrollPosition.index$delegate.getIntValue() <= 25) {
                    ((Function1) obj2).invoke(new PulledToRefresh(false));
                }
                break;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((AfterpayAppletTilePresenter) this.this$0).navigator.goTo((AfterpayAppletScreen$AfterpayAppletHomeScreen) obj2);
                break;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                MutableState mutableState2 = (MutableState) obj2;
                AfterpayAppletTileViewModel afterpayAppletTileViewModel = (AfterpayAppletTileViewModel) mutableState2.getValue();
                PromotedAppletTileViewModel promotedAppletTileViewModel = (PromotedAppletTileViewModel) this.this$0;
                PromotedAppletTileViewModel.Loaded loaded = promotedAppletTileViewModel instanceof PromotedAppletTileViewModel.Loaded ? (PromotedAppletTileViewModel.Loaded) promotedAppletTileViewModel : null;
                if (afterpayAppletTileViewModel instanceof AfterpayAppletTileViewModel.Uninstalled) {
                    AfterpayAppletTileViewModel.Uninstalled uninstalled = (AfterpayAppletTileViewModel.Uninstalled) afterpayAppletTileViewModel;
                    if (!Intrinsics.areEqual(uninstalled.promotedModel, loaded)) {
                        mutableState2.setValue(new AfterpayAppletTileViewModel.Uninstalled(uninstalled.title, uninstalled.subtitle, uninstalled.avatar, uninstalled.analyticsTapEvents, uninstalled.impressionEvent, loaded));
                    }
                }
                break;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((AfterpayAppletTileViewModel) this.this$0) instanceof AfterpayAppletItemViewed) {
                    ((TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj2).invoke();
                }
                break;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealAfterpayAppletMerchantSheetRepository realAfterpayAppletMerchantSheetRepository = (RealAfterpayAppletMerchantSheetRepository) this.this$0;
                CashAccountDatabaseImpl cashAccountDatabaseImpl = realAfterpayAppletMerchantSheetRepository.cashDatabase;
                LocalTabContentQueries localTabContentQueries = cashAccountDatabaseImpl.afterpayAppletMerchantSheetQueries;
                String str = (String) obj2;
                localTabContentQueries.getClass();
                str.getClass();
                AfterpayAppletMerchantSheetQueries$getForToken$2 afterpayAppletMerchantSheetQueries$getForToken$2 = AfterpayAppletMerchantSheetQueries$getForToken$2.INSTANCE;
                AfterpayAppletMerchantSheet afterpayAppletMerchantSheet = (AfterpayAppletMerchantSheet) new RewardQueries.ForIdsQuery(localTabContentQueries, str, new ContextKt$$ExternalSyntheticLambda1(localTabContentQueries)).executeAsOneOrNull();
                if (afterpayAppletMerchantSheet != null && (afterpayMerchantSheetResponse = afterpayAppletMerchantSheet.sheet_response) != null && (l = afterpayMerchantSheetResponse.expire_at_ms) != null) {
                    if (l.longValue() <= realAfterpayAppletMerchantSheetRepository.clock.millis()) {
                        LocalTabContentQueries localTabContentQueries2 = cashAccountDatabaseImpl.afterpayAppletMerchantSheetQueries;
                        localTabContentQueries2.getClass();
                        localTabContentQueries2.driver.execute(-1599268812, "DELETE FROM afterpayAppletMerchantSheet WHERE token = ?", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(str, 14));
                        localTabContentQueries2.notifyQueries(-1599268812, new ActivityTabViewKt$$ExternalSyntheticLambda17(i2));
                        break;
                    } else {
                        break;
                    }
                }
                break;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealAfterpayMerchantRepo realAfterpayMerchantRepo = (RealAfterpayMerchantRepo) obj2;
                for (String str2 : (List) this.this$0) {
                    SessionQueries sessionQueries = realAfterpayMerchantRepo.queries;
                    sessionQueries.getClass();
                    str2.getClass();
                    sessionQueries.driver.execute(-1366763978, "DELETE FROM afterpayRecentlyViewedMerchant WHERE token = ?", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(str2, 15));
                    sessionQueries.notifyQueries(-1366763978, new ActivityTabViewKt$$ExternalSyntheticLambda17(i3));
                }
                break;
            case 12:
                RealAfterpayAppletAnalytics realAfterpayAppletAnalytics = ((AfterpayAppletPurchasesEmbeddedPresenter) this.this$0).afterpayAppletAnalytics;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Map map = AfterpayAppletPurchasesEmbeddedPresenter.refreshAttributePurchase;
                HomeResult homeResult = (HomeResult) ((MutableState) obj2).getValue();
                if (homeResult instanceof HomeResult.HomeData) {
                    if (!(homeResult instanceof HomeResult.HomeLoading) && !(homeResult instanceof HomeResult.HomeError) && !(homeResult instanceof HomeResult.Empty) && (creditLineSnapshot = ((HomeResult.HomeData) homeResult).data.credit_line_snapshot) != null) {
                        l2 = EarningTool.Tool.totalBalanceMoney(creditLineSnapshot).amount;
                    }
                    realAfterpayAppletAnalytics.trackPurchasesScreenViewed(l2);
                } else if (Intrinsics.areEqual(homeResult, HomeResult.HomeError.INSTANCE)) {
                    realAfterpayAppletAnalytics.trackPurchasesScreenViewed(null);
                } else if (Intrinsics.areEqual(homeResult, HomeResult.Empty.INSTANCE)) {
                    realAfterpayAppletAnalytics.trackPurchasesScreenViewed(null);
                } else if (!Intrinsics.areEqual(homeResult, HomeResult.HomeLoading.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                }
                break;
            case 13:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((AfterpayAppletRetroOrderSelectionViewModel) ((MutableState) obj2).getValue()) instanceof AfterpayAppletRetroOrderSelectionViewModel.Error) {
                    ((RealAfterpayAppletAnalytics) ((PoolsListPresenter) this.this$0).analytics).trackErrorAnalyticEvent(AfterpayAppletScreen.RETRO_ORDER_SELECTION);
                }
                break;
            case 14:
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((Function1) this.this$0).invoke(new ItemViewed((List) obj2, null));
                break;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                List list = ((AfterpayAppletRetroOrderSelectionViewModel.Loaded) this.this$0).impressionEvent;
                if (list != null) {
                    ((Function1) obj2).invoke(new AfterpayAppletRetroOrderSelectionViewEvent.RetroOrderSelectionScreenScreenViewed(list));
                }
                break;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj2;
                int i8 = -1;
                if (parcelableSnapshotMutableIntState.getIntValue() == -1) {
                    Iterator it = ((List) this.this$0).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((AmountSelectorWidgetModel.Item) it.next()).isSelected()) {
                                i8 = i4;
                            } else {
                                i4++;
                            }
                        }
                    }
                    parcelableSnapshotMutableIntState.setIntValue(i8);
                }
                break;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((AmountDisplayState) this.this$0).applyConfig((AmountConfig) obj2);
                break;
            case 18:
                VariantSandboxedComponent variantSandboxedComponent = (VariantSandboxedComponent) this.this$0;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                break;
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SessionQueries sessionQueries2 = ((RealAppMessageManager) this.this$0).messageDeliveredQueries;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj2;
                sessionQueries2.getClass();
                String createArguments = TransacterImpl.createArguments(linkedHashSet.size());
                SqlDriver sqlDriver = sessionQueries2.driver;
                String concat = "DELETE FROM messageDelivered WHERE token NOT IN ".concat(createArguments);
                linkedHashSet.size();
                QueryResult execute = sqlDriver.execute(null, concat, new ContextKt$$ExternalSyntheticLambda1(linkedHashSet, i3));
                sessionQueries2.notifyQueries(-1689618143, new CardMessageQueries$$ExternalSyntheticLambda7(17));
                break;
            case 20:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealAppMessageRepositoryWriter realAppMessageRepositoryWriter = (RealAppMessageRepositoryWriter) this.this$0;
                LocalTabContentQueries localTabContentQueries3 = realAppMessageRepositoryWriter.popupMessageQueries;
                AppMessage appMessage = (AppMessage) obj2;
                AndroidSqliteDriver.Transaction transaction = (AndroidSqliteDriver.Transaction) localTabContentQueries3.driver.newTransaction().getValue();
                transaction.getClass();
                AndroidSqliteDriver.Transaction transaction2 = transaction.enclosingTransaction;
                try {
                    RealAppMessageRepositoryWriter.access$insertWithoutTransaction(realAppMessageRepositoryWriter, appMessage);
                    unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    transaction.successful = true;
                    transaction.endTransaction$runtime();
                    localTabContentQueries3.postTransactionCleanup(transaction, transaction2, null, unit);
                } catch (Throwable th2) {
                    th = th2;
                    unit2 = unit;
                    transaction.endTransaction$runtime();
                    localTabContentQueries3.postTransactionCleanup(transaction, transaction2, th, unit2);
                    return Unit.INSTANCE;
                }
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealAppMessageRepositoryWriter realAppMessageRepositoryWriter2 = (RealAppMessageRepositoryWriter) this.this$0;
                realAppMessageRepositoryWriter2.popupMessageQueries.transactionWithWrapper(new BadgeQueries$$ExternalSyntheticLambda0(i5, realAppMessageRepositoryWriter2, (List) obj2));
                break;
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                DisclosurePresenter disclosurePresenter = (DisclosurePresenter) this.this$0;
                InlineAppMessageViewModel inlineAppMessageViewModel = (InlineAppMessageViewModel) ((MutableState) obj2).getValue();
                InlineAppMessageViewModel.Ready ready = inlineAppMessageViewModel instanceof InlineAppMessageViewModel.Ready ? (InlineAppMessageViewModel.Ready) inlineAppMessageViewModel : null;
                disclosurePresenter.navigator = ready != null ? ready.messageToken : null;
                break;
            case 23:
                CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) obj2;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                AppMessageViewEvent.AppMessageActionTaken appMessageActionTaken = (AppMessageViewEvent.AppMessageActionTaken) ((AppMessageViewEvent) this.this$0);
                if (appMessageActionTaken.shouldDismissMessage) {
                    ((LocalTabContentQueries) cardStudioPresenter.cardStudioQueries).deleteByMessageToken(appMessageActionTaken.messageToken);
                }
                ((GrpcMethod) cardStudioPresenter.appConfig).perform(appMessageActionTaken);
                break;
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealInAppNotificationPresenter realInAppNotificationPresenter = (RealInAppNotificationPresenter) this.this$0;
                AppMessageViewEvent.AppMessageActionTaken appMessageActionTaken2 = (AppMessageViewEvent.AppMessageActionTaken) ((AppMessageViewEvent) obj2);
                realInAppNotificationPresenter.inAppNotificationMessageQueries.deleteMessage(appMessageActionTaken2.messageToken);
                realInAppNotificationPresenter.actionPerformer.perform(appMessageActionTaken2);
                break;
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                LocalCashBalancePresenter localCashBalancePresenter = (LocalCashBalancePresenter) this.this$0;
                SheetAppMessage sheetAppMessage = (SheetAppMessage) localCashBalancePresenter.syncer;
                Analytics analytics2 = (Analytics) localCashBalancePresenter.analytics;
                MutableState mutableState3 = (MutableState) obj2;
                SheetMessage sheetMessage = (SheetMessage) mutableState3.getValue();
                String str3 = (sheetMessage == null || (halfSheetMessage = sheetMessage.message_format) == null || (zzjrVar = halfSheetMessage.secondaryNavigationAction) == null || (access$getDetailsPage = QuirkSettingsLoader.access$getDetailsPage(zzjrVar)) == null) ? null : access$getDetailsPage.token;
                String str4 = (String) localCashBalancePresenter.screen;
                String str5 = sheetAppMessage.messageToken;
                Long l3 = new Long(((AndroidClock) localCashBalancePresenter.clock).millis());
                SheetMessage sheetMessage2 = (SheetMessage) mutableState3.getValue();
                analytics2.track(str3 != null ? new DetailsPageInteractDismissPage(19, null, null, str3, str4, null) : new AppMessageInteractClick(l3, sheetMessage2 != null ? sheetMessage2.metadata_id : null, AppMessageFormat.HALF_SHEET, str5, null, 34), null);
                ((GrpcMethod) localCashBalancePresenter.timestampFormatter).perform(new AppMessageViewEvent.AppMessageActionTaken(sheetAppMessage.messageToken, null, false, null, 12));
                ((CashAccountDatabaseImpl) localCashBalancePresenter.sessionManager).sheetMessageQueries.deleteByMessageToken(sheetAppMessage.messageToken);
                ((BetterNavigator.ScreenNavigator) localCashBalancePresenter.navigator).goTo(Back.INSTANCE);
                break;
            case 26:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Analytics analytics3 = (Analytics) ((LocalHomePresenter) this.this$0).localHomeGeoPresenterFactory;
                OverdraftStatus.State_ state_ = ((OverdraftStatus) obj2).State;
                if (state_ != null) {
                    OverdraftStatus.State_.Eligible eligible = state_ instanceof OverdraftStatus.State_.Eligible ? (OverdraftStatus.State_.Eligible) state_ : null;
                    if ((eligible != null ? eligible.value : null) != null) {
                        overdraftStatus2 = OverdraftCoverageViewViewStatus.OverdraftStatus.ELIGIBLE;
                        analytics3.track(new OverdraftCoverageViewViewStatus(overdraftStatus2), null);
                        break;
                    }
                }
                if (state_ != null) {
                    OverdraftStatus.State_.Activated activated = state_ instanceof OverdraftStatus.State_.Activated ? (OverdraftStatus.State_.Activated) state_ : null;
                    if ((activated != null ? activated.value : null) != null) {
                        overdraftStatus2 = OverdraftCoverageViewViewStatus.OverdraftStatus.ACTIVATED;
                        analytics3.track(new OverdraftCoverageViewViewStatus(overdraftStatus2), null);
                    }
                }
                if (state_ != null) {
                    OverdraftStatus.State_.Disabled disabled = state_ instanceof OverdraftStatus.State_.Disabled ? (OverdraftStatus.State_.Disabled) state_ : null;
                    if ((disabled != null ? disabled.value : null) != null) {
                        overdraftStatus = OverdraftCoverageViewViewStatus.OverdraftStatus.DISABLED;
                        if (overdraftStatus != null) {
                            if (state_ != null) {
                                OverdraftStatus.State_.Upsell upsell = state_ instanceof OverdraftStatus.State_.Upsell ? (OverdraftStatus.State_.Upsell) state_ : null;
                                if ((upsell != null ? upsell.value : null) != null) {
                                    overdraftStatus2 = OverdraftCoverageViewViewStatus.OverdraftStatus.UPSELL;
                                    if (overdraftStatus2 == null) {
                                        overdraftStatus2 = OverdraftCoverageViewViewStatus.OverdraftStatus.INELIGIBLE;
                                    }
                                }
                            }
                            overdraftStatus2 = null;
                            if (overdraftStatus2 == null) {
                            }
                        } else {
                            overdraftStatus2 = overdraftStatus;
                        }
                        analytics3.track(new OverdraftCoverageViewViewStatus(overdraftStatus2), null);
                    }
                }
                overdraftStatus = null;
                if (overdraftStatus != null) {
                }
                analytics3.track(new OverdraftCoverageViewViewStatus(overdraftStatus2), null);
            case 27:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Analytics analytics4 = (Analytics) ((LocalHomePresenter) this.this$0).clearMarketingBadgesIfNeeded;
                OverdraftStatus.State_ state_2 = ((OverdraftStatus) obj2).State;
                if (state_2 != null) {
                    OverdraftStatus.State_.Eligible eligible2 = state_2 instanceof OverdraftStatus.State_.Eligible ? (OverdraftStatus.State_.Eligible) state_2 : null;
                    if ((eligible2 != null ? eligible2.value : null) != null) {
                        overdraftStatus4 = OverdraftCoverageViewViewStatus.OverdraftStatus.ELIGIBLE;
                        analytics4.track(new OverdraftCoverageViewViewStatus(overdraftStatus4), null);
                        break;
                    }
                }
                if (state_2 != null) {
                    OverdraftStatus.State_.Activated activated2 = state_2 instanceof OverdraftStatus.State_.Activated ? (OverdraftStatus.State_.Activated) state_2 : null;
                    if ((activated2 != null ? activated2.value : null) != null) {
                        overdraftStatus4 = OverdraftCoverageViewViewStatus.OverdraftStatus.ACTIVATED;
                        analytics4.track(new OverdraftCoverageViewViewStatus(overdraftStatus4), null);
                    }
                }
                if (state_2 != null) {
                    OverdraftStatus.State_.Disabled disabled2 = state_2 instanceof OverdraftStatus.State_.Disabled ? (OverdraftStatus.State_.Disabled) state_2 : null;
                    if ((disabled2 != null ? disabled2.value : null) != null) {
                        overdraftStatus3 = OverdraftCoverageViewViewStatus.OverdraftStatus.DISABLED;
                        if (overdraftStatus3 != null) {
                            if (state_2 != null) {
                                OverdraftStatus.State_.Upsell upsell2 = state_2 instanceof OverdraftStatus.State_.Upsell ? (OverdraftStatus.State_.Upsell) state_2 : null;
                                if ((upsell2 != null ? upsell2.value : null) != null) {
                                    overdraftStatus4 = OverdraftCoverageViewViewStatus.OverdraftStatus.UPSELL;
                                    if (overdraftStatus4 == null) {
                                        overdraftStatus4 = OverdraftCoverageViewViewStatus.OverdraftStatus.INELIGIBLE;
                                    }
                                }
                            }
                            overdraftStatus4 = null;
                            if (overdraftStatus4 == null) {
                            }
                        } else {
                            overdraftStatus4 = overdraftStatus3;
                        }
                        analytics4.track(new OverdraftCoverageViewViewStatus(overdraftStatus4), null);
                    }
                }
                overdraftStatus3 = null;
                if (overdraftStatus3 != null) {
                }
                analytics4.track(new OverdraftCoverageViewViewStatus(overdraftStatus4), null);
            case 28:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                AndroidPermissionManager$create$1 androidPermissionManager$create$1 = (AndroidPermissionManager$create$1) ((ProfilePresenter) this.this$0).screen;
                if (!androidPermissionManager$create$1.$readonly.check()) {
                    androidPermissionManager$create$1.request();
                }
                MutableState mutableState4 = (MutableState) obj2;
                mutableState4.setValue(BitcoinQrCodeScannerPresenter$State.copy$default((BitcoinQrCodeScannerPresenter$State) mutableState4.getValue(), false, null, null, false, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE));
                break;
            default:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                RealBitcoinAmountPickerPresenter realBitcoinAmountPickerPresenter = (RealBitcoinAmountPickerPresenter) this.this$0;
                if (((BitcoinAmountPickerScreen.AmountPickerPurpose) realBitcoinAmountPickerPresenter.purpose) == BitcoinAmountPickerScreen.AmountPickerPurpose.DEPOSIT) {
                    SharedFlowImpl sharedFlowImpl = (SharedFlowImpl) realBitcoinAmountPickerPresenter.keypadEvents;
                    if (((RealBitcoinAmountPickerPresenter.State) ((MutableState) obj2).getValue()).bitcoinKeypadState.rateStrategy != BitcoinKeypadEvent.UpdateRateStrategy.RateStrategy.MOST_RECENT_VALUE) {
                        StateFlowKt.emitOrThrow(sharedFlowImpl, new BitcoinKeypadEvent.UpdateRateStrategy());
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchBarBinding$Content$1$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$textFieldState = obj;
    }
}
