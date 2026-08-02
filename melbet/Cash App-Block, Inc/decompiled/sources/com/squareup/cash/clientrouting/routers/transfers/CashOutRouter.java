package com.squareup.cash.clientrouting.routers.transfers;

import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.cash.CashWithdrawStart;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealClientRouteRouter$route$1;
import com.squareup.cash.clientrouting.data.FeatureContextKt;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.data.TemporaryStorage$getDir$2;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.transfers.RealTransferManager;
import com.squareup.cash.data.transfers.TransferManager;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.transfers.data.TransferData;
import com.squareup.cash.transfers.data.TransferType;
import com.squareup.cash.transfers.navigation.real.RealTransfersInboundNavigator$Factory$Impl;
import com.squareup.cash.transfers.screens.PendingTransfersConfirmationDialog;
import com.squareup.kotterknife.Lazy;
import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.protos.cash.transfers.TransferClientRouteSource;
import com.squareup.protos.cash.transfers.WithdrawParams;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.DepositPreference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CashOutRouter {
    public final Analytics analytics;
    public final RealBalanceSnapshotManager balanceSnapshotManager;
    public final CoroutineContext computationContext;
    public final FlowStarter flowStarter;
    public final Navigator navigator;
    public final TransferManager transferManager;
    public final Lazy transfersInboundNavigator;

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

    public CashOutRouter(FlowStarter flowStarter, TransferManager transferManager, RealBalanceSnapshotManager realBalanceSnapshotManager, RealTransfersInboundNavigator$Factory$Impl realTransfersInboundNavigator$Factory$Impl, Analytics analytics, CoroutineContext coroutineContext, Navigator navigator) {
        navigator.getClass();
        this.flowStarter = flowStarter;
        this.transferManager = transferManager;
        this.balanceSnapshotManager = realBalanceSnapshotManager;
        this.analytics = analytics;
        this.computationContext = coroutineContext;
        this.navigator = navigator;
        this.transfersInboundNavigator = realTransfersInboundNavigator$Factory$Impl.create$1(navigator);
    }

    public static /* synthetic */ Object routeToCashOut$default(CashOutRouter cashOutRouter, Long l, String str, DepositPreference depositPreference, RoutingParams routingParams, boolean z, ContinuationImpl continuationImpl, int i) {
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            depositPreference = null;
        }
        if ((i & 8) != 0) {
            routingParams = null;
        }
        if ((i & 16) != 0) {
            z = true;
        }
        return cashOutRouter.routeToCashOut(l, str, depositPreference, routingParams, z, continuationImpl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        if (routeToCashOut$default(r9, r2, r3, r4, null, r10, r7, 8) != r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r11 == r0) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.ViewWithdrawWithParams viewWithdrawWithParams, ContinuationImpl continuationImpl) {
        CashOutRouter$route$1 cashOutRouter$route$1;
        int i;
        TransferClientRouteSource transferClientRouteSource;
        if (continuationImpl instanceof CashOutRouter$route$1) {
            cashOutRouter$route$1 = (CashOutRouter$route$1) continuationImpl;
            int i2 = cashOutRouter$route$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cashOutRouter$route$1.label = i2 - PKIFailureInfo.systemUnavail;
                CashOutRouter$route$1 cashOutRouter$route$12 = cashOutRouter$route$1;
                Object obj = cashOutRouter$route$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashOutRouter$route$12.label;
                Object[] objArr = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    TemporaryStorage$getDir$2 temporaryStorage$getDir$2 = new TemporaryStorage$getDir$2(viewWithdrawWithParams, objArr == true ? 1 : 0, 28);
                    cashOutRouter$route$12.label = 1;
                    obj = JobKt.withContext(this.computationContext, temporaryStorage$getDir$2, cashOutRouter$route$12);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                WithdrawParams withdrawParams = (WithdrawParams) obj;
                Money money = withdrawParams.amount;
                Long l = money != null ? money.amount : null;
                boolean z = true;
                String str = withdrawParams.instrument_token;
                Long l2 = l;
                DepositPreference depositPreference = withdrawParams.deposit_preference;
                transferClientRouteSource = withdrawParams.source;
                if ((transferClientRouteSource != null ? -1 : WhenMappings.$EnumSwitchMapping$0[transferClientRouteSource.ordinal()]) == 1) {
                    z = false;
                }
                cashOutRouter$route$12.label = 2;
            }
        }
        cashOutRouter$route$1 = new CashOutRouter$route$1(this, continuationImpl);
        CashOutRouter$route$1 cashOutRouter$route$122 = cashOutRouter$route$1;
        Object obj2 = cashOutRouter$route$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cashOutRouter$route$122.label;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        WithdrawParams withdrawParams2 = (WithdrawParams) obj2;
        Money money2 = withdrawParams2.amount;
        if (money2 != null) {
        }
        boolean z2 = true;
        String str2 = withdrawParams2.instrument_token;
        Long l22 = l;
        DepositPreference depositPreference2 = withdrawParams2.deposit_preference;
        transferClientRouteSource = withdrawParams2.source;
        if ((transferClientRouteSource != null ? -1 : WhenMappings.$EnumSwitchMapping$0[transferClientRouteSource.ordinal()]) == 1) {
        }
        cashOutRouter$route$122.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x011a, code lost:
    
        if (r7 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01a6, code lost:
    
        if (r1 != r3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object routeToCashOut(Long l, String str, DepositPreference depositPreference, RoutingParams routingParams, boolean z, ContinuationImpl continuationImpl) {
        CashOutRouter$routeToCashOut$1 cashOutRouter$routeToCashOut$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str2;
        DepositPreference depositPreference2;
        RoutingParams routingParams2;
        Long l2;
        boolean z2;
        Object first;
        BalanceSnapshot balanceSnapshot;
        DepositPreference depositPreference3;
        RoutingParams routingParams3;
        Long l3;
        String str3;
        Money money;
        boolean isMoneybot;
        Screen moneyTabScreen;
        Navigator navigator;
        if (continuationImpl instanceof CashOutRouter$routeToCashOut$1) {
            cashOutRouter$routeToCashOut$1 = (CashOutRouter$routeToCashOut$1) continuationImpl;
            int i2 = cashOutRouter$routeToCashOut$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cashOutRouter$routeToCashOut$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = cashOutRouter$routeToCashOut$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashOutRouter$routeToCashOut$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChannelFlowTransformLatest select = this.balanceSnapshotManager.select();
                    cashOutRouter$routeToCashOut$1.L$0 = l;
                    str2 = str;
                    cashOutRouter$routeToCashOut$1.L$1 = str2;
                    depositPreference2 = depositPreference;
                    cashOutRouter$routeToCashOut$1.L$2 = depositPreference2;
                    routingParams2 = routingParams;
                    cashOutRouter$routeToCashOut$1.L$3 = routingParams2;
                    cashOutRouter$routeToCashOut$1.Z$0 = z;
                    cashOutRouter$routeToCashOut$1.label = 1;
                    obj = FlowKt.firstOrNull(select, cashOutRouter$routeToCashOut$1);
                    if (obj != coroutineSingletons) {
                        l2 = l;
                        z2 = z;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    z2 = cashOutRouter$routeToCashOut$1.Z$0;
                    RoutingParams routingParams4 = cashOutRouter$routeToCashOut$1.L$3;
                    depositPreference2 = cashOutRouter$routeToCashOut$1.L$2;
                    String str4 = cashOutRouter$routeToCashOut$1.L$1;
                    l2 = cashOutRouter$routeToCashOut$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    routingParams2 = routingParams4;
                    str2 = str4;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        navigator = cashOutRouter$routeToCashOut$1.L$10;
                        SafeTrace.throwOnFailure(obj);
                        navigator.goTo((Screen) obj);
                        return Unit.INSTANCE;
                    }
                    z2 = cashOutRouter$routeToCashOut$1.Z$0;
                    balanceSnapshot = cashOutRouter$routeToCashOut$1.L$4;
                    routingParams3 = cashOutRouter$routeToCashOut$1.L$3;
                    DepositPreference depositPreference4 = cashOutRouter$routeToCashOut$1.L$2;
                    String str5 = cashOutRouter$routeToCashOut$1.L$1;
                    l3 = cashOutRouter$routeToCashOut$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    depositPreference3 = depositPreference4;
                    str3 = str5;
                    TransferData transferData = (TransferData) obj;
                    Money money2 = balanceSnapshot == null ? balanceSnapshot.balance : null;
                    if (l3 != null) {
                        money = money2;
                    } else {
                        if (money2 != null) {
                            long longValue = l3.longValue();
                            Long l4 = money2.amount;
                            l4.getClass();
                            if (longValue <= l4.longValue()) {
                                CurrencyCode currencyCode = money2.currency_code;
                                currencyCode.getClass();
                                money = new Money(l3, currencyCode, 4);
                            }
                        }
                        money = null;
                    }
                    BlockersData.Flow.INSTANCE.getClass();
                    String generateToken = BlockersData.Flow.Companion.generateToken();
                    if (z2) {
                        this.analytics.track(new CashWithdrawStart(generateToken), null);
                    }
                    isMoneybot = FeatureContextKt.isMoneybot(routingParams3 == null ? routingParams3.featureContext : null);
                    Navigator navigator2 = this.navigator;
                    if (!isMoneybot) {
                        navigator2.goTo(new MoneyTabScreen(null));
                    }
                    if (routingParams3 != null && (moneyTabScreen = routingParams3.exitScreen) != null) {
                        if (!isMoneybot) {
                            moneyTabScreen = null;
                        }
                    }
                    moneyTabScreen = new MoneyTabScreen(null);
                    BlockersData copy$default = BlockersData.copy$default(FlowStarter.startTransferFlow$default(this.flowStarter, moneyTabScreen, generateToken, 4), null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, transferData, null, null, null, null, null, null, null, null, null, false, null, null, null, -1, 65531);
                    cashOutRouter$routeToCashOut$1.L$0 = null;
                    cashOutRouter$routeToCashOut$1.L$1 = null;
                    cashOutRouter$routeToCashOut$1.L$2 = null;
                    cashOutRouter$routeToCashOut$1.L$3 = null;
                    cashOutRouter$routeToCashOut$1.L$4 = null;
                    cashOutRouter$routeToCashOut$1.L$10 = navigator2;
                    cashOutRouter$routeToCashOut$1.Z$0 = z2;
                    cashOutRouter$routeToCashOut$1.label = 3;
                    Lazy lazy = this.transfersInboundNavigator;
                    lazy.getClass();
                    navigator = navigator2;
                    obj = Lazy.checkPendingBeforeStartFlow$default(lazy, copy$default, money, str3, PendingTransfersConfirmationDialog.Destination.WITHDRAW, depositPreference3, null, null, false, 224);
                }
                BalanceSnapshot balanceSnapshot2 = (BalanceSnapshot) obj;
                RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 transferData2 = ((RealTransferManager) this.transferManager).transferData(TransferType.CASH_OUT, true);
                cashOutRouter$routeToCashOut$1.L$0 = l2;
                cashOutRouter$routeToCashOut$1.L$1 = str2;
                cashOutRouter$routeToCashOut$1.L$2 = depositPreference2;
                cashOutRouter$routeToCashOut$1.L$3 = routingParams2;
                cashOutRouter$routeToCashOut$1.L$4 = balanceSnapshot2;
                cashOutRouter$routeToCashOut$1.Z$0 = z2;
                cashOutRouter$routeToCashOut$1.label = 2;
                first = FlowKt.first(transferData2, cashOutRouter$routeToCashOut$1);
                if (first != coroutineSingletons) {
                    balanceSnapshot = balanceSnapshot2;
                    obj = first;
                    depositPreference3 = depositPreference2;
                    routingParams3 = routingParams2;
                    l3 = l2;
                    str3 = str2;
                    TransferData transferData3 = (TransferData) obj;
                    if (balanceSnapshot == null) {
                    }
                    if (l3 != null) {
                    }
                    BlockersData.Flow.INSTANCE.getClass();
                    String generateToken2 = BlockersData.Flow.Companion.generateToken();
                    if (z2) {
                    }
                    isMoneybot = FeatureContextKt.isMoneybot(routingParams3 == null ? routingParams3.featureContext : null);
                    Navigator navigator22 = this.navigator;
                    if (!isMoneybot) {
                    }
                    if (routingParams3 != null) {
                        if (!isMoneybot) {
                        }
                    }
                    moneyTabScreen = new MoneyTabScreen(null);
                    BlockersData copy$default2 = BlockersData.copy$default(FlowStarter.startTransferFlow$default(this.flowStarter, moneyTabScreen, generateToken2, 4), null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, transferData3, null, null, null, null, null, null, null, null, null, false, null, null, null, -1, 65531);
                    cashOutRouter$routeToCashOut$1.L$0 = null;
                    cashOutRouter$routeToCashOut$1.L$1 = null;
                    cashOutRouter$routeToCashOut$1.L$2 = null;
                    cashOutRouter$routeToCashOut$1.L$3 = null;
                    cashOutRouter$routeToCashOut$1.L$4 = null;
                    cashOutRouter$routeToCashOut$1.L$10 = navigator22;
                    cashOutRouter$routeToCashOut$1.Z$0 = z2;
                    cashOutRouter$routeToCashOut$1.label = 3;
                    Lazy lazy2 = this.transfersInboundNavigator;
                    lazy2.getClass();
                    navigator = navigator22;
                    obj = Lazy.checkPendingBeforeStartFlow$default(lazy2, copy$default2, money, str3, PendingTransfersConfirmationDialog.Destination.WITHDRAW, depositPreference3, null, null, false, 224);
                }
                return coroutineSingletons;
            }
        }
        cashOutRouter$routeToCashOut$1 = new CashOutRouter$routeToCashOut$1(this, continuationImpl);
        Object obj2 = cashOutRouter$routeToCashOut$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cashOutRouter$routeToCashOut$1.label;
        if (i != 0) {
        }
        BalanceSnapshot balanceSnapshot22 = (BalanceSnapshot) obj2;
        RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 transferData22 = ((RealTransferManager) this.transferManager).transferData(TransferType.CASH_OUT, true);
        cashOutRouter$routeToCashOut$1.L$0 = l2;
        cashOutRouter$routeToCashOut$1.L$1 = str2;
        cashOutRouter$routeToCashOut$1.L$2 = depositPreference2;
        cashOutRouter$routeToCashOut$1.L$3 = routingParams2;
        cashOutRouter$routeToCashOut$1.L$4 = balanceSnapshot22;
        cashOutRouter$routeToCashOut$1.Z$0 = z2;
        cashOutRouter$routeToCashOut$1.label = 2;
        first = FlowKt.first(transferData22, cashOutRouter$routeToCashOut$1);
        if (first != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public final Object route(RoutingParams routingParams, RealClientRouteRouter$route$1 realClientRouteRouter$route$1) {
        Object routeToCashOut$default = routeToCashOut$default(this, null, null, null, routingParams, false, realClientRouteRouter$route$1, 23);
        return routeToCashOut$default == CoroutineSingletons.COROUTINE_SUSPENDED ? routeToCashOut$default : Unit.INSTANCE;
    }

    public final Object route(ClientRoute.ViewCashOutAmount viewCashOutAmount, RealClientRouteRouter$route$1 realClientRouteRouter$route$1) {
        Long longOrNull = StringsKt.toLongOrNull(10, viewCashOutAmount.centsAmount);
        if (longOrNull != null) {
            Object routeToCashOut$default = routeToCashOut$default(this, new Long(longOrNull.longValue()), null, null, null, false, realClientRouteRouter$route$1, 30);
            return routeToCashOut$default == CoroutineSingletons.COROUTINE_SUSPENDED ? routeToCashOut$default : Unit.INSTANCE;
        }
        a$$ExternalSyntheticBUOutline0.m$1("ViewCashOutAmount centsAmount must be a number");
        return null;
    }

    public final Object route(ClientRoute.ViewCashOutAmountWithInstrument viewCashOutAmountWithInstrument, RealClientRouteRouter$route$1 realClientRouteRouter$route$1) {
        Object routeToCashOut$default = routeToCashOut$default(this, StringsKt.toLongOrNull(10, viewCashOutAmountWithInstrument.centsAmount), viewCashOutAmountWithInstrument.instrumentToken, null, null, false, realClientRouteRouter$route$1, 28);
        return routeToCashOut$default == CoroutineSingletons.COROUTINE_SUSPENDED ? routeToCashOut$default : Unit.INSTANCE;
    }
}
