package com.squareup.cash.clientrouting.routers.transfers;

import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import app.cash.local.views.LocalViewFactory;
import app.cash.passcode.backend.RealAppLockState;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.NavigationSideEffects;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealClientRouteRouter$route$1;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.common.composeui.IconAnimationViewKt$IconAnimationView$1$1;
import com.squareup.cash.data.TemporaryStorage$getDir$2;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager;
import com.squareup.cash.data.transfers.RealTransferManager;
import com.squareup.cash.data.transfers.TransferManager;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda2;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.notifications.RealAndroidNotificationSettingsChecker;
import com.squareup.cash.transfers.data.TransferType;
import com.squareup.cash.transfers.navigation.real.RealTransfersInboundNavigator$Factory$Impl;
import com.squareup.cash.ui.gcm.RealGcmRegistrar;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.protos.cash.transfers.AddCashHalfSheetWithEntryParameters;
import com.squareup.protos.cash.transfers.AddMoneyParams;
import com.squareup.protos.cash.transfers.TransferClientRouteSource;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class AddCashRouter {
    public final Analytics analytics;
    public final RealBlockersHelper blockersHelper;
    public final CoroutineContext computationContext;
    public final FlowStarter flowStarter;
    public final RealJurisdictionConfigManager jurisdictionConfigManager;
    public final Navigator navigator;
    public final Lazy router$delegate;
    public final TransferManager transferManager;
    public final com.squareup.kotterknife.Lazy transfersInboundNavigator;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferClientRouteSource.values().length];
            try {
                TransactionType.Companion companion = TransferClientRouteSource.Companion;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AddCashRouter(FlowStarter flowStarter, TransferManager transferManager, RealJurisdictionConfigManager realJurisdictionConfigManager, RealTransfersInboundNavigator$Factory$Impl realTransfersInboundNavigator$Factory$Impl, Analytics analytics, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, RealRouter$Factory$Impl realRouter$Factory$Impl, CoroutineContext coroutineContext, Navigator navigator) {
        navigator.getClass();
        this.flowStarter = flowStarter;
        this.transferManager = transferManager;
        this.jurisdictionConfigManager = realJurisdictionConfigManager;
        this.analytics = analytics;
        this.computationContext = coroutineContext;
        this.navigator = navigator;
        this.transfersInboundNavigator = realTransfersInboundNavigator$Factory$Impl.create$1(navigator);
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(navigator);
        this.router$delegate = LazyKt.lazy(new ArcadeModal2Kt$$ExternalSyntheticLambda2(3, realRouter$Factory$Impl, this));
    }

    public static Object routeToAddMoney$default(AddCashRouter addCashRouter, Long l, String str, RoutingParams routingParams, boolean z, String str2, Money money, boolean z2, boolean z3, ContinuationImpl continuationImpl, int i) {
        Long l2 = (i & 1) != 0 ? null : l;
        String str3 = (i & 2) != 0 ? null : str;
        Object collectLatest = FlowKt.collectLatest(FlowKt.take(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(addCashRouter.jurisdictionConfigManager.select(), ((RealTransferManager) addCashRouter.transferManager).transferData(TransferType.ADD_CASH, true), AddCashRouter$routeToAddMoney$4.INSTANCE, 0), 1), new IconAnimationViewKt$IconAnimationView$1$1((i & 8) != 0 ? true : z, addCashRouter, l2, (i & 64) != 0 ? false : z2, routingParams, str3, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : money, (i & 128) != 0 ? false : z3, null), continuationImpl);
        return collectLatest == CoroutineSingletons.COROUTINE_SUSPENDED ? collectLatest : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e3, code lost:
    
        if (routeToAddMoney$default(r22, r1, null, r2, false, r5, r8, r3, false, r9, com.plaid.internal.EnumC0170g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE) == r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0067, code lost:
    
        if (r1 == r11) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.ViewAddCashHalfSheetWithEntry viewAddCashHalfSheetWithEntry, RoutingParams routingParams, ContinuationImpl continuationImpl) {
        AddCashRouter$route$7 addCashRouter$route$7;
        int i;
        RoutingParams routingParams2;
        Money money;
        int i2;
        int i3;
        String str;
        RoutingParams routingParams3;
        int i4;
        if (continuationImpl instanceof AddCashRouter$route$7) {
            addCashRouter$route$7 = (AddCashRouter$route$7) continuationImpl;
            int i5 = addCashRouter$route$7.label;
            if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                addCashRouter$route$7.label = i5 - PKIFailureInfo.systemUnavail;
                AddCashRouter$route$7 addCashRouter$route$72 = addCashRouter$route$7;
                Object obj = addCashRouter$route$72.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addCashRouter$route$72.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    TemporaryStorage$getDir$2 temporaryStorage$getDir$2 = new TemporaryStorage$getDir$2(viewAddCashHalfSheetWithEntry, continuation, 27);
                    routingParams2 = routingParams;
                    addCashRouter$route$72.L$1 = routingParams2;
                    addCashRouter$route$72.label = 1;
                    obj = JobKt.withContext(this.computationContext, temporaryStorage$getDir$2, addCashRouter$route$72);
                } else if (i == 1) {
                    routingParams2 = addCashRouter$route$72.L$1;
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i4 = addCashRouter$route$72.I$0;
                    str = addCashRouter$route$72.L$4;
                    money = addCashRouter$route$72.L$3;
                    routingParams3 = addCashRouter$route$72.L$1;
                    SafeTrace.throwOnFailure(obj);
                    i3 = i4;
                    routingParams2 = routingParams3;
                    Long l = money != null ? money.amount : null;
                    boolean z = i3 != 0;
                    addCashRouter$route$72.L$1 = null;
                    addCashRouter$route$72.L$3 = null;
                    addCashRouter$route$72.L$4 = null;
                    addCashRouter$route$72.I$0 = i3;
                    addCashRouter$route$72.label = 3;
                }
                AddCashHalfSheetWithEntryParameters addCashHalfSheetWithEntryParameters = (AddCashHalfSheetWithEntryParameters) obj;
                money = addCashHalfSheetWithEntryParameters.suggested_amount;
                LocalizedString localizedString = addCashHalfSheetWithEntryParameters.title;
                String str2 = localizedString == null ? localizedString.translated_value : null;
                String str3 = addCashHalfSheetWithEntryParameters.entry_client_route;
                i2 = (str3 != null || str3.length() == 0) ? 1 : 0;
                i3 = i2 ^ 1;
                if (i2 != 0) {
                    ((RealRouter) this.router$delegate.getValue()).route(routingParams2 == null ? new RoutingParams(null, null, null, null, null, null, 511) : routingParams2, str3);
                    addCashRouter$route$72.L$1 = routingParams2;
                    addCashRouter$route$72.L$3 = money;
                    addCashRouter$route$72.L$4 = str2;
                    addCashRouter$route$72.I$0 = i3;
                    addCashRouter$route$72.label = 2;
                    if (JobKt.delay(400L, addCashRouter$route$72) != coroutineSingletons) {
                        str = str2;
                        routingParams3 = routingParams2;
                        i4 = i3;
                        i3 = i4;
                        routingParams2 = routingParams3;
                        if (money != null) {
                        }
                        if (i3 != 0) {
                        }
                        addCashRouter$route$72.L$1 = null;
                        addCashRouter$route$72.L$3 = null;
                        addCashRouter$route$72.L$4 = null;
                        addCashRouter$route$72.I$0 = i3;
                        addCashRouter$route$72.label = 3;
                    }
                    return coroutineSingletons;
                }
                str = str2;
                if (money != null) {
                }
                if (i3 != 0) {
                }
                addCashRouter$route$72.L$1 = null;
                addCashRouter$route$72.L$3 = null;
                addCashRouter$route$72.L$4 = null;
                addCashRouter$route$72.I$0 = i3;
                addCashRouter$route$72.label = 3;
            }
        }
        addCashRouter$route$7 = new AddCashRouter$route$7(this, continuationImpl);
        AddCashRouter$route$7 addCashRouter$route$722 = addCashRouter$route$7;
        Object obj2 = addCashRouter$route$722.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addCashRouter$route$722.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        AddCashHalfSheetWithEntryParameters addCashHalfSheetWithEntryParameters2 = (AddCashHalfSheetWithEntryParameters) obj2;
        money = addCashHalfSheetWithEntryParameters2.suggested_amount;
        LocalizedString localizedString2 = addCashHalfSheetWithEntryParameters2.title;
        if (localizedString2 == null) {
        }
        String str32 = addCashHalfSheetWithEntryParameters2.entry_client_route;
        if (str32 != null) {
        }
        i3 = i2 ^ 1;
        if (i2 != 0) {
        }
    }

    public final Object route$1(RoutingParams routingParams, RealClientRouteRouter$route$1 realClientRouteRouter$route$1) {
        Object routeToAddMoney$default = routeToAddMoney$default(this, null, null, routingParams, false, null, null, false, true, realClientRouteRouter$route$1, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
        return routeToAddMoney$default == CoroutineSingletons.COROUTINE_SUSPENDED ? routeToAddMoney$default : Unit.INSTANCE;
    }

    public final Object route$2(RoutingParams routingParams, RealClientRouteRouter$route$1 realClientRouteRouter$route$1) {
        Object routeToAddMoney$default = routeToAddMoney$default(this, null, null, routingParams, false, null, null, false, false, realClientRouteRouter$route$1, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE);
        return routeToAddMoney$default == CoroutineSingletons.COROUTINE_SUSPENDED ? routeToAddMoney$default : Unit.INSTANCE;
    }

    public final Object route$3(RoutingParams routingParams, RealClientRouteRouter$route$1 realClientRouteRouter$route$1) {
        Object routeToAddMoney$default = routeToAddMoney$default(this, null, null, routingParams, false, null, null, false, false, realClientRouteRouter$route$1, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE);
        return routeToAddMoney$default == CoroutineSingletons.COROUTINE_SUSPENDED ? routeToAddMoney$default : Unit.INSTANCE;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final DoubleCheck analytics;
        public final Provider blockersHelperFactory;
        public final LambdaProvider computationContext;
        public final DoubleCheck flowStarter;
        public final Provider jurisdictionConfigManager;
        public final Provider routerFactory;
        public final Provider transferManager;
        public final Provider transfersInboundNavigatorFactory;

        public MetroFactory(RealAppLockState.MetroFactory metroFactory, NavigationSideEffects.MetroFactory metroFactory2, LambdaProvider lambdaProvider, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, IntentLauncher.MetroFactory metroFactory3, DoubleCheck doubleCheck3, RealAndroidNotificationSettingsChecker.MetroFactory metroFactory4) {
            this.transferManager = metroFactory;
            this.jurisdictionConfigManager = metroFactory2;
            this.computationContext = lambdaProvider;
            this.flowStarter = doubleCheck;
            this.transfersInboundNavigatorFactory = doubleCheck2;
            this.blockersHelperFactory = metroFactory3;
            this.analytics = doubleCheck3;
            this.routerFactory = metroFactory4;
        }

        public MetroFactory(DoubleCheck doubleCheck, RealTransferManager.MetroFactory metroFactory, LocalViewFactory.MetroFactory metroFactory2, InstanceFactory instanceFactory, DoubleCheck doubleCheck2, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, LambdaProvider lambdaProvider) {
            this.flowStarter = doubleCheck;
            this.transferManager = metroFactory;
            this.jurisdictionConfigManager = metroFactory2;
            this.transfersInboundNavigatorFactory = instanceFactory;
            this.analytics = doubleCheck2;
            this.blockersHelperFactory = instanceFactory2;
            this.routerFactory = instanceFactory3;
            this.computationContext = lambdaProvider;
        }

        public MetroFactory(DoubleCheck doubleCheck, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, RealMessageSigner.MetroFactory metroFactory, RealPasscodeFlowStarter.MetroFactory metroFactory2, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, RealGcmRegistrar.MetroFactory metroFactory3) {
            this.flowStarter = doubleCheck;
            this.transferManager = instanceFactory;
            this.jurisdictionConfigManager = instanceFactory2;
            this.transfersInboundNavigatorFactory = metroFactory;
            this.blockersHelperFactory = metroFactory2;
            this.analytics = doubleCheck2;
            this.computationContext = lambdaProvider;
            this.routerFactory = metroFactory3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
    
        if (routeToAddMoney$default(r12, r13, r3, r14, r5, null, null, false, r9, r10, 112) != r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
    
        if (r15 == r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.ViewAddMoneyWithParams viewAddMoneyWithParams, RoutingParams routingParams, ContinuationImpl continuationImpl) {
        AddCashRouter$route$1 addCashRouter$route$1;
        int i;
        TransferClientRouteSource transferClientRouteSource;
        if (continuationImpl instanceof AddCashRouter$route$1) {
            addCashRouter$route$1 = (AddCashRouter$route$1) continuationImpl;
            int i2 = addCashRouter$route$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                addCashRouter$route$1.label = i2 - PKIFailureInfo.systemUnavail;
                AddCashRouter$route$1 addCashRouter$route$12 = addCashRouter$route$1;
                Object obj = addCashRouter$route$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addCashRouter$route$12.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    TemporaryStorage$getDir$2 temporaryStorage$getDir$2 = new TemporaryStorage$getDir$2(viewAddMoneyWithParams, continuation, 26);
                    addCashRouter$route$12.L$1 = routingParams;
                    addCashRouter$route$12.label = 1;
                    obj = JobKt.withContext(this.computationContext, temporaryStorage$getDir$2, addCashRouter$route$12);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    routingParams = addCashRouter$route$12.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                AddMoneyParams addMoneyParams = (AddMoneyParams) obj;
                Money money = addMoneyParams.amount;
                Long l = money == null ? money.amount : null;
                boolean z = true;
                String str = addMoneyParams.instrument_token;
                transferClientRouteSource = addMoneyParams.source;
                if ((transferClientRouteSource != null ? -1 : WhenMappings.$EnumSwitchMapping$0[transferClientRouteSource.ordinal()]) == 1) {
                    z = false;
                }
                boolean z2 = z;
                boolean areEqual = Intrinsics.areEqual(addMoneyParams.start_in_keypad, Boolean.TRUE);
                addCashRouter$route$12.L$1 = null;
                addCashRouter$route$12.label = 2;
            }
        }
        addCashRouter$route$1 = new AddCashRouter$route$1(this, continuationImpl);
        AddCashRouter$route$1 addCashRouter$route$122 = addCashRouter$route$1;
        Object obj2 = addCashRouter$route$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addCashRouter$route$122.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        AddMoneyParams addMoneyParams2 = (AddMoneyParams) obj2;
        Money money2 = addMoneyParams2.amount;
        if (money2 == null) {
        }
        boolean z3 = true;
        String str2 = addMoneyParams2.instrument_token;
        transferClientRouteSource = addMoneyParams2.source;
        if ((transferClientRouteSource != null ? -1 : WhenMappings.$EnumSwitchMapping$0[transferClientRouteSource.ordinal()]) == 1) {
        }
        boolean z22 = z3;
        boolean areEqual2 = Intrinsics.areEqual(addMoneyParams2.start_in_keypad, Boolean.TRUE);
        addCashRouter$route$122.L$1 = null;
        addCashRouter$route$122.label = 2;
    }

    public final Object route(RoutingParams routingParams, RealClientRouteRouter$route$1 realClientRouteRouter$route$1) {
        Object routeToAddMoney$default = routeToAddMoney$default(this, null, null, routingParams, false, null, null, false, false, realClientRouteRouter$route$1, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE);
        return routeToAddMoney$default == CoroutineSingletons.COROUTINE_SUSPENDED ? routeToAddMoney$default : Unit.INSTANCE;
    }

    public final void route(ClientRoute.ViewAutoAddCash viewAutoAddCash, RoutingParams routingParams) {
        Screen screen;
        Screen screen2;
        viewAutoAddCash.getClass();
        BlockersData.Flow flow = BlockersData.Flow.PROFILE_BLOCKERS;
        ClientScenario clientScenario = ClientScenario.ENABLE_SCHEDULED_RELOAD;
        if (routingParams == null || (screen2 = routingParams.exitScreen) == null) {
            Screen screen3 = routingParams != null ? routingParams.origin : null;
            if (screen3 == null) {
                screen3 = new MoneyTabScreen(null);
            }
            screen = screen3;
        } else {
            screen = screen2;
        }
        BlockersHelper.launchClientScenario$default(this.blockersHelper, flow, clientScenario, screen, null, null, null, false, null, null, false, 4072);
    }

    public final Object route(ClientRoute.ViewAddCashAmount viewAddCashAmount, RoutingParams routingParams, RealClientRouteRouter$route$1 realClientRouteRouter$route$1) {
        Object routeToAddMoney$default = routeToAddMoney$default(this, StringsKt.toLongOrNull(10, viewAddCashAmount.centsAmount), null, routingParams, false, null, null, false, false, realClientRouteRouter$route$1, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE);
        return routeToAddMoney$default == CoroutineSingletons.COROUTINE_SUSPENDED ? routeToAddMoney$default : Unit.INSTANCE;
    }

    public final Object route(ClientRoute.ViewAddCashAmountWithInstrument viewAddCashAmountWithInstrument, RoutingParams routingParams, RealClientRouteRouter$route$1 realClientRouteRouter$route$1) {
        Object routeToAddMoney$default = routeToAddMoney$default(this, StringsKt.toLongOrNull(10, viewAddCashAmountWithInstrument.centsAmount), viewAddCashAmountWithInstrument.instrumentToken, routingParams, false, null, null, false, false, realClientRouteRouter$route$1, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
        return routeToAddMoney$default == CoroutineSingletons.COROUTINE_SUSPENDED ? routeToAddMoney$default : Unit.INSTANCE;
    }
}
