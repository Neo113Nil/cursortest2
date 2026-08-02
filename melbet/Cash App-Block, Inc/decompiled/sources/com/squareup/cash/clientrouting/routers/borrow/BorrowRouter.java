package com.squareup.cash.clientrouting.routers.borrow;

import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzjg;
import com.google.android.gms.internal.mlkit_vision_face.zzjj;
import com.google.android.gms.internal.mlkit_vision_face.zzko;
import com.squareup.cash.appupdate.navigation.real.RealAppUpdateInboundNavigator$Factory$Impl;
import com.squareup.cash.banking.screens.BenefitsLeafletSheetScreen;
import com.squareup.cash.borrow.backend.RealBorrowDataManager;
import com.squareup.cash.borrow.screens.BorrowHome;
import com.squareup.cash.borrow.screens.BorrowHomeOverlay;
import com.squareup.cash.borrow.screens.BorrowLimitHub;
import com.squareup.cash.borrow.screens.BorrowScreen;
import com.squareup.cash.borrow.screens.LoanAmountPicker;
import com.squareup.cash.borrow.screens.RepayCustomAmountPicker;
import com.squareup.cash.card.onboarding.CardModelView$iconTexture$$inlined$map$1;
import com.squareup.cash.cdf.borrowapplet.BorrowAppletViewBenefitLeaflet;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.FeatureContextKt;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs$Favorite$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.navigation.real.RealMoneyInboundNavigator$Factory$Impl;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.Money;
import com.squareup.protos.lending.CustomAmountPickerData;
import com.squareup.protos.lending.CustomRepaymentAmountSelectionData;
import com.squareup.protos.lending.InitiateLoanData;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.protos.lending.sync_values.BorrowData$AppletData$EntryPointData$EntryPointV2$HiddenEntryPointV2;
import com.squareup.protos.lending.sync_values.BorrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV2;
import com.squareup.scannerview.SizeMap;
import com.squareup.wire.ProtoAdapter;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class BorrowRouter {
    public final Analytics analytics;
    public final RealBorrowDataManager borrowDataManager;
    public final SizeMap moneyInboundNavigator;
    public final Navigator navigator;
    public final RealRouter$Factory$Impl routerFactory;

    public BorrowRouter(RealBorrowDataManager realBorrowDataManager, RealRouter$Factory$Impl realRouter$Factory$Impl, RealMoneyNavigatorHelper realMoneyNavigatorHelper, Analytics analytics, RealMoneyInboundNavigator$Factory$Impl realMoneyInboundNavigator$Factory$Impl, RealAppUpdateInboundNavigator$Factory$Impl realAppUpdateInboundNavigator$Factory$Impl, Navigator navigator, CoroutineScope coroutineScope) {
        navigator.getClass();
        this.borrowDataManager = realBorrowDataManager;
        this.routerFactory = realRouter$Factory$Impl;
        this.analytics = analytics;
        this.navigator = navigator;
        this.moneyInboundNavigator = new SizeMap(navigator);
    }

    public final void maybeNavigateToMoneyTab(RoutingParams routingParams) {
        boolean isMoneybot = FeatureContextKt.isMoneybot(routingParams.featureContext);
        Screen screen = routingParams.origin;
        if ((screen != null ? screen instanceof MoneyTabScreen : false) || isMoneybot) {
            return;
        }
        ((Navigator) this.moneyInboundNavigator.mRatios).goTo(new MoneyTabScreen(null));
    }

    public final void navigateToBorrowAppletHome(RoutingParams routingParams, BorrowHome.InitialState initialState) {
        maybeNavigateToMoneyTab(routingParams);
        this.navigator.goTo(new BorrowHome(initialState));
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0062, code lost:
    
        if (r12 == r2) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.ViewBorrowLanding viewBorrowLanding, RoutingParams routingParams, ContinuationImpl continuationImpl) {
        BorrowRouter$route$1 borrowRouter$route$1;
        int i;
        zzjj zzjjVar;
        BorrowData.AppletData.EntryPointData.HiddenEntryPoint hiddenEntryPoint;
        BorrowData.AppletData.EntryPointData.TileEntryPoint tileEntryPoint;
        RoutingParams routingParams2;
        String str;
        AndroidSyncValueSpecs$Favorite$1 androidSyncValueSpecs$Favorite$1 = AndroidSyncValueSpecs.GlobalBorrowData;
        if (continuationImpl instanceof BorrowRouter$route$1) {
            borrowRouter$route$1 = (BorrowRouter$route$1) continuationImpl;
            int i2 = borrowRouter$route$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                borrowRouter$route$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = borrowRouter$route$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = borrowRouter$route$1.label;
                RealBorrowDataManager realBorrowDataManager = this.borrowDataManager;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Timber.Forest.v("route: %s", viewBorrowLanding);
                    FlowKt__MergeKt$flatMapConcat$$inlined$map$1 borrowHomeEntryPoint = realBorrowDataManager.borrowHomeEntryPoint(false);
                    borrowRouter$route$1.L$1 = routingParams;
                    borrowRouter$route$1.label = 1;
                    obj = FlowKt.first(borrowHomeEntryPoint, borrowRouter$route$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            routingParams2 = borrowRouter$route$1.L$1;
                            SafeTrace.throwOnFailure(obj);
                            str = (String) obj;
                            routingParams = routingParams2;
                            this.routerFactory.create$1(this.navigator).route(routingParams, str);
                            return Unit.INSTANCE;
                        }
                        if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        routingParams2 = borrowRouter$route$1.L$1;
                        SafeTrace.throwOnFailure(obj);
                        str = (String) obj;
                        routingParams = routingParams2;
                        this.routerFactory.create$1(this.navigator).route(routingParams, str);
                        return Unit.INSTANCE;
                    }
                    routingParams = borrowRouter$route$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                zzjjVar = ((BorrowData.AppletData.EntryPointData) obj).entry_point_v2;
                if (zzjjVar != null) {
                    BorrowData$AppletData$EntryPointData$EntryPointV2$HiddenEntryPointV2 borrowData$AppletData$EntryPointData$EntryPointV2$HiddenEntryPointV2 = zzjjVar instanceof BorrowData$AppletData$EntryPointData$EntryPointV2$HiddenEntryPointV2 ? (BorrowData$AppletData$EntryPointData$EntryPointV2$HiddenEntryPointV2) zzjjVar : null;
                    if (borrowData$AppletData$EntryPointData$EntryPointV2$HiddenEntryPointV2 != null) {
                        hiddenEntryPoint = borrowData$AppletData$EntryPointData$EntryPointV2$HiddenEntryPointV2.value;
                        int i3 = 20;
                        if (hiddenEntryPoint != null) {
                            CardModelView$iconTexture$$inlined$map$1 cardModelView$iconTexture$$inlined$map$1 = new CardModelView$iconTexture$$inlined$map$1(realBorrowDataManager.syncValueReader.getSingleValue(androidSyncValueSpecs$Favorite$1), i3);
                            borrowRouter$route$1.L$1 = routingParams;
                            borrowRouter$route$1.label = 2;
                            obj = FlowKt.first(cardModelView$iconTexture$$inlined$map$1, borrowRouter$route$1);
                            if (obj != coroutineSingletons) {
                                routingParams2 = routingParams;
                                str = (String) obj;
                                routingParams = routingParams2;
                                this.routerFactory.create$1(this.navigator).route(routingParams, str);
                                return Unit.INSTANCE;
                            }
                        } else {
                            if (zzjjVar != null) {
                                BorrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV2 borrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV2 = zzjjVar instanceof BorrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV2 ? (BorrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV2) zzjjVar : null;
                                if (borrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV2 != null) {
                                    tileEntryPoint = borrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV2.value;
                                    if (tileEntryPoint == null) {
                                        zzjjVar.getClass();
                                        BorrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV2 borrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV22 = zzjjVar instanceof BorrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV2 ? (BorrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV2) zzjjVar : null;
                                        BorrowData.AppletData.EntryPointData.TileEntryPoint tileEntryPoint2 = borrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV22 != null ? borrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV22.value : null;
                                        tileEntryPoint2.getClass();
                                        str = tileEntryPoint2.client_route;
                                        str.getClass();
                                        this.routerFactory.create$1(this.navigator).route(routingParams, str);
                                        return Unit.INSTANCE;
                                    }
                                    CardModelView$iconTexture$$inlined$map$1 cardModelView$iconTexture$$inlined$map$12 = new CardModelView$iconTexture$$inlined$map$1(realBorrowDataManager.syncValueReader.getSingleValue(androidSyncValueSpecs$Favorite$1), i3);
                                    borrowRouter$route$1.L$1 = routingParams;
                                    borrowRouter$route$1.label = 3;
                                    obj = FlowKt.first(cardModelView$iconTexture$$inlined$map$12, borrowRouter$route$1);
                                    if (obj != coroutineSingletons) {
                                        routingParams2 = routingParams;
                                        str = (String) obj;
                                        routingParams = routingParams2;
                                        this.routerFactory.create$1(this.navigator).route(routingParams, str);
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                            tileEntryPoint = null;
                            if (tileEntryPoint == null) {
                            }
                        }
                        return coroutineSingletons;
                    }
                }
                hiddenEntryPoint = null;
                int i32 = 20;
                if (hiddenEntryPoint != null) {
                }
                return coroutineSingletons;
            }
        }
        borrowRouter$route$1 = new BorrowRouter$route$1(this, continuationImpl);
        Object obj2 = borrowRouter$route$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = borrowRouter$route$1.label;
        RealBorrowDataManager realBorrowDataManager2 = this.borrowDataManager;
        if (i != 0) {
        }
        zzjjVar = ((BorrowData.AppletData.EntryPointData) obj2).entry_point_v2;
        if (zzjjVar != null) {
        }
        hiddenEntryPoint = null;
        int i322 = 20;
        if (hiddenEntryPoint != null) {
        }
        return coroutineSingletons2;
    }

    public final void route(ClientRoute.ViewBorrowAmountPicker viewBorrowAmountPicker, RoutingParams routingParams) {
        viewBorrowAmountPicker.getClass();
        routingParams.getClass();
        Timber.Forest.v("route: %s", viewBorrowAmountPicker);
        if (!(routingParams.origin instanceof BorrowScreen)) {
            maybeNavigateToMoneyTab(routingParams);
        }
        ProtoAdapter protoAdapter = CustomAmountPickerData.ADAPTER;
        ByteString.Companion companion = ByteString.Companion;
        ByteString decodeBase64 = ByteString.Companion.decodeBase64(viewBorrowAmountPicker.b64EncodedProto);
        decodeBase64.getClass();
        CustomAmountPickerData customAmountPickerData = (CustomAmountPickerData) protoAdapter.decode(decodeBase64);
        LocalizedString localizedString = customAmountPickerData.title;
        localizedString.getClass();
        LocalizedString localizedString2 = customAmountPickerData.subtitle;
        localizedString2.getClass();
        Money money = customAmountPickerData.minimum_amount;
        money.getClass();
        Money money2 = customAmountPickerData.maximum_amount;
        money2.getClass();
        LocalizedString localizedString3 = customAmountPickerData.button_title;
        localizedString3.getClass();
        this.navigator.goTo(new LoanAmountPicker.LoanAmountPickerFull(new InitiateLoanData(EmptyList.INSTANCE, null, localizedString, localizedString2, money, money2, localizedString3, null, ByteString.EMPTY), null));
    }

    public final void route(ClientRoute.ViewBorrowApplet viewBorrowApplet, RoutingParams routingParams) {
        viewBorrowApplet.getClass();
        routingParams.getClass();
        Timber.Forest.v("route: %s", viewBorrowApplet);
        navigateToBorrowAppletHome(routingParams, BorrowHome.InitialState.Standard.INSTANCE);
    }

    public final void route(ClientRoute.ViewLoan viewLoan, RoutingParams routingParams) {
        viewLoan.getClass();
        routingParams.getClass();
        Timber.Forest.v("route: %s", viewLoan);
        navigateToBorrowAppletHome(routingParams, new BorrowHome.InitialState.DisplayingLoanDetails(viewLoan.token));
    }

    public final void route(ClientRoute.ViewBorrowBulletin viewBorrowBulletin, RoutingParams routingParams) {
        viewBorrowBulletin.getClass();
        routingParams.getClass();
        Timber.Forest.v("route: %s", viewBorrowBulletin);
        if (!(routingParams.origin instanceof BorrowHome)) {
            navigateToBorrowAppletHome(routingParams, BorrowHome.InitialState.Standard.INSTANCE);
        }
        ProtoAdapter protoAdapter = BorrowAppletBulletinsTile.Data.Bulletin.ADAPTER;
        ByteString.Companion companion = ByteString.Companion;
        ByteString decodeBase64 = ByteString.Companion.decodeBase64(viewBorrowBulletin.b64EncodedProto);
        decodeBase64.getClass();
        zzjg zzjgVar = ((BorrowAppletBulletinsTile.Data.Bulletin) protoAdapter.decode(decodeBase64)).routing;
        BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet infoSheet = null;
        if (zzjgVar != null) {
            BorrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet borrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet = zzjgVar instanceof BorrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet ? (BorrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet) zzjgVar : null;
            if (borrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet != null) {
                infoSheet = borrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet.value;
            }
        }
        infoSheet.getClass();
        this.navigator.goTo(new BorrowHomeOverlay.BulletinInfo(infoSheet, new BorrowHome()));
    }

    public final void route(ClientRoute.ViewBorrowRepayCustomAmount viewBorrowRepayCustomAmount) {
        viewBorrowRepayCustomAmount.getClass();
        Timber.Forest.v("route: %s", viewBorrowRepayCustomAmount);
        ProtoAdapter protoAdapter = CustomRepaymentAmountSelectionData.ADAPTER;
        ByteString.Companion companion = ByteString.Companion;
        ByteString decodeBase64 = ByteString.Companion.decodeBase64(viewBorrowRepayCustomAmount.base64EncodedCustomRepaymentData);
        decodeBase64.getClass();
        this.navigator.goTo(new RepayCustomAmountPicker((CustomRepaymentAmountSelectionData) protoAdapter.decode(decodeBase64)));
    }

    public final void route(ClientRoute.ViewBorrowRepay viewBorrowRepay, RoutingParams routingParams) {
        viewBorrowRepay.getClass();
        routingParams.getClass();
        Timber.Forest.v("route: %s", viewBorrowRepay);
        navigateToBorrowAppletHome(routingParams, new BorrowHome.InitialState.DisplayingRepaymentOptions(viewBorrowRepay.identifier));
    }

    public final void route(ClientRoute.ViewBorrowBenefitsLeaflet viewBorrowBenefitsLeaflet, RoutingParams routingParams) {
        BorrowAppletViewBenefitLeaflet.BenefitType benefitType;
        viewBorrowBenefitsLeaflet.getClass();
        routingParams.getClass();
        Timber.Forest.v("route: %s", viewBorrowBenefitsLeaflet);
        navigateToBorrowAppletHome(routingParams, BorrowHome.InitialState.Standard.INSTANCE);
        String str = viewBorrowBenefitsLeaflet.benefit;
        this.navigator.goTo(new BenefitsLeafletSheetScreen(zzko.toPdsaBenefitType(str)));
        if (str.equals("INCREASED_BORROW_LIMIT")) {
            benefitType = BorrowAppletViewBenefitLeaflet.BenefitType.INCREASED_BORROW_LIMIT;
        } else {
            benefitType = BorrowAppletViewBenefitLeaflet.BenefitType.UNSPECIFIED;
        }
        this.analytics.track(new BorrowAppletViewBenefitLeaflet(benefitType), null);
    }

    public final void route(ClientRoute.ViewBorrowLimitHub viewBorrowLimitHub, RoutingParams routingParams) {
        viewBorrowLimitHub.getClass();
        routingParams.getClass();
        Timber.Forest.v("route: %s", viewBorrowLimitHub);
        if (!(routingParams.origin instanceof BorrowScreen)) {
            navigateToBorrowAppletHome(routingParams, BorrowHome.InitialState.Standard.INSTANCE);
        }
        this.navigator.goTo(BorrowLimitHub.INSTANCE);
    }

    public final void route(ClientRoute.ViewBorrowLimitHubBulletinInfo viewBorrowLimitHubBulletinInfo, RoutingParams routingParams) {
        viewBorrowLimitHubBulletinInfo.getClass();
        routingParams.getClass();
        Timber.Forest.v("route: %s", viewBorrowLimitHubBulletinInfo);
        Screen screen = routingParams.origin;
        if (!(screen instanceof BorrowScreen)) {
            navigateToBorrowAppletHome(routingParams, BorrowHome.InitialState.Standard.INSTANCE);
        }
        boolean z = screen instanceof BorrowLimitHub;
        BorrowLimitHub borrowLimitHub = BorrowLimitHub.INSTANCE;
        Navigator navigator = this.navigator;
        if (!z) {
            navigator.goTo(borrowLimitHub);
        }
        ProtoAdapter protoAdapter = BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.ADAPTER;
        ByteString.Companion companion = ByteString.Companion;
        ByteString decodeBase64 = ByteString.Companion.decodeBase64(viewBorrowLimitHubBulletinInfo.b64EncodedProto);
        decodeBase64.getClass();
        navigator.goTo(new BorrowHomeOverlay.BulletinInfo((BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet) protoAdapter.decode(decodeBase64), borrowLimitHub));
    }
}
