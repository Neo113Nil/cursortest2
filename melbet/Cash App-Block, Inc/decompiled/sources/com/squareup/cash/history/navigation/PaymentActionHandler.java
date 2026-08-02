package com.squareup.cash.history.navigation;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.text.TextUtilsCompat;
import androidx.room.RoomDatabase$closeBarrier$1;
import app.cash.api.ApiResult;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.screen.Screen;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.aiedge.MLKitTitleGenerator$MetroFactory;
import com.squareup.cash.attribution.ProductionAttributionEventEmitter;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.card.onboarding.CardPreviewPresenter$cashtag$$inlined$map$1;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.core.navigationcontainer.PaymentActionResult;
import com.squareup.cash.crypto.service.CryptoService;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter$$ExternalSyntheticLambda2;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.data.profile.RealProfileSyncer;
import com.squareup.cash.db.InstrumentLinkingConfig;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.gcl.RealGlobalConfigManager;
import com.squareup.cash.history.backend.real.RealLegacyActivityEntityManager;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.merchant.backend.real.RealMerchantProfileRepo$MetroFactory;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.payments.backend.api.PaymentAction;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.payments.backend.api.RenderedPayment;
import com.squareup.cash.payments.backend.real.RealPaymentActionCompletionDispatcher;
import com.squareup.cash.payments.backend.real.RealPaymentManager;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda6;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.ui.BroadwayModule$ProvideBroadwayMetroFactory;
import com.squareup.protos.cash.investcrypto.server.TradingService;
import com.squareup.protos.franklin.api.Blockers;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.protos.franklin.api.Role;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.CompleteScenarioRequest;
import com.squareup.protos.franklin.app.CompleteScenarioResponse;
import com.squareup.protos.franklin.app.ConfirmPaymentRequest;
import com.squareup.protos.franklin.app.ConfirmPaymentResponse;
import com.squareup.protos.franklin.app.RefundPaymentRequest;
import com.squareup.protos.franklin.app.RefundPaymentResponse;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.protos.franklin.investing.InvestingService;
import com.squareup.protos.franklin.lending.LendingAppService;
import com.squareup.protos.franklin.ui.PaymentState;
import com.squareup.protos.franklin.ui.ScenarioPlanEntry;
import com.squareup.protos.franklin.ui.ScenarioPlanMap;
import com.squareup.protos.franklin.ui.UiPayment;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
import com.squareup.util.android.RealIntentFactory;
import com.squareup.util.cash.ProtoDefaults;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class PaymentActionHandler {
    public final RoomDatabase$closeBarrier$1 activeArgs;
    public final RealLegacyActivityEntityManager activityEntityManager;
    public final Analytics analytics;
    public final AppConfigManager appConfig;
    public final AppService appService;
    public final ProductionAttributionEventEmitter attributionEventEmitter;
    public final RealBalanceSnapshotManager balanceSnapshotManager;
    public final CashAccountDatabaseImpl cashDatabase;
    public final RealClientRouteParser clientRouteParser;
    public final RealClientSyncer clientSyncer;
    public final CryptoService cryptoService;
    public final RealCustomerStore customerStore;
    public final FlowStarter flowStarter;
    public final RealInstrumentManager instrumentManager;
    public final RealIntentFactory intentFactory;
    public final InvestingService investingService;
    public final CoroutineContext ioDispatcher;
    public final LendingAppService lendingAppService;
    public final RealPaymentActionCompletionDispatcher paymentActionCompletionDispatcher;
    public final PaymentManager paymentManager;
    public final RealProfileSyncer profileSyncer;
    public final CoroutineScope scope;
    public final AndroidStringManager stringManager;
    public final RealSupportNavigator supportNavigator;
    public final TradingService tradingService;
    public final RealUuidGenerator uuidGenerator;

    /* loaded from: classes6.dex */
    public final class ConfirmPaymentData {
        public final BalanceSnapshot balanceSnapshot;
        public final InstrumentLinkingConfig config;
        public final List instruments;
        public final RenderedPayment payment;
        public final Recipient recipient;

        public ConfirmPaymentData(RenderedPayment renderedPayment, InstrumentLinkingConfig instrumentLinkingConfig, Recipient recipient, List list, BalanceSnapshot balanceSnapshot) {
            renderedPayment.getClass();
            instrumentLinkingConfig.getClass();
            recipient.getClass();
            list.getClass();
            this.payment = renderedPayment;
            this.config = instrumentLinkingConfig;
            this.recipient = recipient;
            this.instruments = list;
            this.balanceSnapshot = balanceSnapshot;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConfirmPaymentData)) {
                return false;
            }
            ConfirmPaymentData confirmPaymentData = (ConfirmPaymentData) obj;
            return Intrinsics.areEqual(this.payment, confirmPaymentData.payment) && Intrinsics.areEqual(this.config, confirmPaymentData.config) && Intrinsics.areEqual(this.recipient, confirmPaymentData.recipient) && Intrinsics.areEqual(this.instruments, confirmPaymentData.instruments) && Intrinsics.areEqual(this.balanceSnapshot, confirmPaymentData.balanceSnapshot);
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m((this.recipient.hashCode() + ((this.config.hashCode() + (this.payment.hashCode() * 31)) * 31)) * 31, 31, this.instruments);
            BalanceSnapshot balanceSnapshot = this.balanceSnapshot;
            return m + (balanceSnapshot == null ? 0 : balanceSnapshot.hashCode());
        }

        public final String toString() {
            return "ConfirmPaymentData(payment=" + this.payment + ", config=" + this.config + ", recipient=" + this.recipient + ", instruments=" + this.instruments + ", balanceSnapshot=" + this.balanceSnapshot + ")";
        }
    }

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[Role.values().length];
            try {
                iArr[Role.RECIPIENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Role.SENDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Orientation.values().length];
            try {
                iArr2[Orientation.BILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Orientation.CASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ConfirmPaymentResponse.Status.values().length];
            try {
                iArr3[1] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                UiAlias.Type.Companion companion = ConfirmPaymentResponse.Status.Companion;
                iArr3[2] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                UiAlias.Type.Companion companion2 = ConfirmPaymentResponse.Status.Companion;
                iArr3[3] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr4 = new int[ScheduledTransactionPreference.Type.values().length];
            try {
                iArr4[ScheduledTransactionPreference.Type.BTC_BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[ScheduledTransactionPreference.Type.EQUITY_BUY.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[ScheduledTransactionPreference.Type.CASH_IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public PaymentActionHandler(RealIntentFactory realIntentFactory, RealLegacyActivityEntityManager realLegacyActivityEntityManager, PaymentManager paymentManager, FlowStarter flowStarter, AndroidStringManager androidStringManager, RealBalanceSnapshotManager realBalanceSnapshotManager, RealInstrumentManager realInstrumentManager, AppConfigManager appConfigManager, RealClientSyncer realClientSyncer, RealProfileSyncer realProfileSyncer, AppService appService, CryptoService cryptoService, TradingService tradingService, InvestingService investingService, LendingAppService lendingAppService, CashAccountDatabaseImpl cashAccountDatabaseImpl, RealClientRouteParser realClientRouteParser, CoroutineContext coroutineContext, ProductionAttributionEventEmitter productionAttributionEventEmitter, RealSupportNavigator realSupportNavigator, RealCustomerStore realCustomerStore, Analytics analytics, RealUuidGenerator realUuidGenerator, RealPaymentActionCompletionDispatcher realPaymentActionCompletionDispatcher, CoroutineScope coroutineScope, RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$1) {
        this.intentFactory = realIntentFactory;
        this.activityEntityManager = realLegacyActivityEntityManager;
        this.paymentManager = paymentManager;
        this.flowStarter = flowStarter;
        this.stringManager = androidStringManager;
        this.balanceSnapshotManager = realBalanceSnapshotManager;
        this.instrumentManager = realInstrumentManager;
        this.appConfig = appConfigManager;
        this.clientSyncer = realClientSyncer;
        this.profileSyncer = realProfileSyncer;
        this.appService = appService;
        this.cryptoService = cryptoService;
        this.tradingService = tradingService;
        this.investingService = investingService;
        this.lendingAppService = lendingAppService;
        this.cashDatabase = cashAccountDatabaseImpl;
        this.clientRouteParser = realClientRouteParser;
        this.ioDispatcher = coroutineContext;
        this.attributionEventEmitter = productionAttributionEventEmitter;
        this.supportNavigator = realSupportNavigator;
        this.customerStore = realCustomerStore;
        this.analytics = analytics;
        this.uuidGenerator = realUuidGenerator;
        this.paymentActionCompletionDispatcher = realPaymentActionCompletionDispatcher;
        this.scope = coroutineScope;
        this.activeArgs = roomDatabase$closeBarrier$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$passcode(PaymentActionHandler paymentActionHandler, PaymentAction.PasscodeAction passcodeAction, ContinuationImpl continuationImpl) {
        PaymentActionHandler$passcode$1 paymentActionHandler$passcode$1;
        int i;
        paymentActionHandler.getClass();
        if (continuationImpl instanceof PaymentActionHandler$passcode$1) {
            paymentActionHandler$passcode$1 = (PaymentActionHandler$passcode$1) continuationImpl;
            int i2 = paymentActionHandler$passcode$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paymentActionHandler$passcode$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = paymentActionHandler$passcode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentActionHandler$passcode$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    paymentActionHandler.attributionEventEmitter.paymentConfirmationInitiated();
                    FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 take = FlowKt.take(paymentActionHandler.activityEntityManager.renderedPayment(passcodeAction.getPaymentToken()), 1);
                    paymentActionHandler$passcode$1.L$0 = passcodeAction;
                    paymentActionHandler$passcode$1.label = 1;
                    obj = FlowKt.first(take, paymentActionHandler$passcode$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    passcodeAction = paymentActionHandler$passcode$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                RenderedPayment renderedPayment = (RenderedPayment) obj;
                FinishSetupTileBadgeCounter instrumentLinkingConfig = ((RealAppConfigManager) paymentActionHandler.appConfig).instrumentLinkingConfig();
                RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(paymentActionHandler.customerStore.getCustomerForId(renderedPayment.theirId), 24);
                ChannelFlowTransformLatest select = paymentActionHandler.balanceSnapshotManager.select();
                RealInstrumentManager realInstrumentManager = paymentActionHandler.instrumentManager;
                EnumEntries entries = CashInstrumentType.getEntries();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : entries) {
                    if (((CashInstrumentType) obj2) != CashInstrumentType.CASH_BALANCE) {
                        arrayList.add(obj2);
                    }
                }
                CashInstrumentType[] cashInstrumentTypeArr = (CashInstrumentType[]) arrayList.toArray(new CashInstrumentType[0]);
                return new CardPreviewPresenter$cashtag$$inlined$map$1(FlowKt.take(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(FlowKt.flowOn(FlowKt.combine(instrumentLinkingConfig, realBadger2$setup$lambda$0$$inlined$mapNotNull$1, select, realInstrumentManager.forTypes((CashInstrumentType[]) Arrays.copyOf(cashInstrumentTypeArr, cashInstrumentTypeArr.length)), new PaymentActionHandler$passcode$3(paymentActionHandler, passcodeAction, renderedPayment, null)), paymentActionHandler.ioDispatcher), 24), 1), 2);
            }
        }
        paymentActionHandler$passcode$1 = new PaymentActionHandler$passcode$1(paymentActionHandler, continuationImpl);
        Object obj3 = paymentActionHandler$passcode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentActionHandler$passcode$1.label;
        if (i != 0) {
        }
        RenderedPayment renderedPayment2 = (RenderedPayment) obj3;
        FinishSetupTileBadgeCounter instrumentLinkingConfig2 = ((RealAppConfigManager) paymentActionHandler.appConfig).instrumentLinkingConfig();
        RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$12 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(paymentActionHandler.customerStore.getCustomerForId(renderedPayment2.theirId), 24);
        ChannelFlowTransformLatest select2 = paymentActionHandler.balanceSnapshotManager.select();
        RealInstrumentManager realInstrumentManager2 = paymentActionHandler.instrumentManager;
        EnumEntries entries2 = CashInstrumentType.getEntries();
        ArrayList arrayList2 = new ArrayList();
        while (r7.hasNext()) {
        }
        CashInstrumentType[] cashInstrumentTypeArr2 = (CashInstrumentType[]) arrayList2.toArray(new CashInstrumentType[0]);
        return new CardPreviewPresenter$cashtag$$inlined$map$1(FlowKt.take(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(FlowKt.flowOn(FlowKt.combine(instrumentLinkingConfig2, realBadger2$setup$lambda$0$$inlined$mapNotNull$12, select2, realInstrumentManager2.forTypes((CashInstrumentType[]) Arrays.copyOf(cashInstrumentTypeArr2, cashInstrumentTypeArr2.length)), new PaymentActionHandler$passcode$3(paymentActionHandler, passcodeAction, renderedPayment2, null)), paymentActionHandler.ioDispatcher), 24), 1), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$sendConfirm(PaymentActionHandler paymentActionHandler, PaymentAction.SendConfirmAction sendConfirmAction, Role role, ContinuationImpl continuationImpl) {
        PaymentActionHandler$sendConfirm$1 paymentActionHandler$sendConfirm$1;
        int i;
        paymentActionHandler.getClass();
        if (continuationImpl instanceof PaymentActionHandler$sendConfirm$1) {
            paymentActionHandler$sendConfirm$1 = (PaymentActionHandler$sendConfirm$1) continuationImpl;
            int i2 = paymentActionHandler$sendConfirm$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paymentActionHandler$sendConfirm$1.label = i2 - PKIFailureInfo.systemUnavail;
                PaymentActionHandler$sendConfirm$1 paymentActionHandler$sendConfirm$12 = paymentActionHandler$sendConfirm$1;
                Object obj = paymentActionHandler$sendConfirm$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentActionHandler$sendConfirm$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String flowToken = sendConfirmAction.getFlowToken();
                    String paymentToken = sendConfirmAction.getPaymentToken();
                    InstrumentSelection selection = sendConfirmAction.getSelection();
                    paymentActionHandler$sendConfirm$12.label = 1;
                    if (paymentActionHandler.sendConfirm(flowToken, paymentToken, selection, role, paymentActionHandler$sendConfirm$12) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return new AppLockMonitor$special$$inlined$map$2(null, 19);
            }
        }
        paymentActionHandler$sendConfirm$1 = new PaymentActionHandler$sendConfirm$1(paymentActionHandler, continuationImpl);
        PaymentActionHandler$sendConfirm$1 paymentActionHandler$sendConfirm$122 = paymentActionHandler$sendConfirm$1;
        Object obj3 = paymentActionHandler$sendConfirm$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentActionHandler$sendConfirm$122.label;
        if (i != 0) {
        }
        return new AppLockMonitor$special$$inlined$map$2(null, 19);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$sendRefund(PaymentActionHandler paymentActionHandler, PaymentAction.SendRefundAction sendRefundAction, ContinuationImpl continuationImpl) {
        PaymentActionHandler$sendRefund$1 paymentActionHandler$sendRefund$1;
        int i;
        PaymentAction.SendRefundAction sendRefundAction2;
        ApiResult apiResult;
        PaymentManager paymentManager = paymentActionHandler.paymentManager;
        if (continuationImpl instanceof PaymentActionHandler$sendRefund$1) {
            paymentActionHandler$sendRefund$1 = (PaymentActionHandler$sendRefund$1) continuationImpl;
            int i2 = paymentActionHandler$sendRefund$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paymentActionHandler$sendRefund$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = paymentActionHandler$sendRefund$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentActionHandler$sendRefund$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AppService appService = paymentActionHandler.appService;
                    ClientScenario clientScenario = sendRefundAction.getClientScenario();
                    String flowToken = sendRefundAction.getFlowToken();
                    RefundPaymentRequest refundPaymentRequest = new RefundPaymentRequest(new RequestContext(null, CollectionsKt__CollectionsJVMKt.listOf(sendRefundAction.getPaymentToken()), null, null, null, null, null, null, 8175), sendRefundAction.getPaymentToken(), ByteString.EMPTY);
                    paymentActionHandler$sendRefund$1.L$0 = sendRefundAction;
                    paymentActionHandler$sendRefund$1.label = 1;
                    obj = appService.refundPayment(clientScenario, flowToken, refundPaymentRequest, paymentActionHandler$sendRefund$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    sendRefundAction2 = sendRefundAction;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sendRefundAction2 = paymentActionHandler$sendRefund$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    RefundPaymentResponse refundPaymentResponse = (RefundPaymentResponse) ((ApiResult.Success) apiResult).response;
                    ResponseContext responseContext = refundPaymentResponse.response_context;
                    if ((responseContext != null ? responseContext.dialog_message : null) != null) {
                        String flowToken2 = sendRefundAction2.getFlowToken();
                        ResponseContext responseContext2 = refundPaymentResponse.response_context;
                        responseContext2.getClass();
                        ((RealPaymentManager) paymentManager).error(flowToken2, responseContext2.dialog_message);
                    }
                } else if (apiResult instanceof ApiResult.Failure) {
                    Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to refund payment (", sendRefundAction2.getPaymentToken(), ")"), new Object[0]);
                    ((RealPaymentManager) paymentManager).error(sendRefundAction2.getFlowToken(), TextUtilsCompat.errorMessaging(paymentActionHandler.stringManager, (ApiResult.Failure) apiResult, new Integer(R.string.history_refund_error_message)).getMessage());
                }
                return new AppLockMonitor$special$$inlined$map$2(null, 19);
            }
        }
        paymentActionHandler$sendRefund$1 = new PaymentActionHandler$sendRefund$1(paymentActionHandler, continuationImpl);
        Object obj2 = paymentActionHandler$sendRefund$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentActionHandler$sendRefund$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return new AppLockMonitor$special$$inlined$map$2(null, 19);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0062, code lost:
    
        if (r1 == r2) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object completeClientScenario(PaymentAction.CompleteClientScenarioAction completeClientScenarioAction, ContinuationImpl continuationImpl) {
        PaymentActionHandler$completeClientScenario$1 paymentActionHandler$completeClientScenario$1;
        int i;
        PaymentAction.CompleteClientScenarioAction completeClientScenarioAction2;
        ScenarioPlanMap scenarioPlanMap;
        ScenarioPlanEntry scenarioPlanEntry;
        PaymentAction.CompleteClientScenarioAction completeClientScenarioAction3;
        List<ScenarioPlanEntry> list;
        Object obj;
        ApiResult apiResult;
        if (continuationImpl instanceof PaymentActionHandler$completeClientScenario$1) {
            paymentActionHandler$completeClientScenario$1 = (PaymentActionHandler$completeClientScenario$1) continuationImpl;
            int i2 = paymentActionHandler$completeClientScenario$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paymentActionHandler$completeClientScenario$1.label = i2 - PKIFailureInfo.systemUnavail;
                PaymentActionHandler$completeClientScenario$1 paymentActionHandler$completeClientScenario$12 = paymentActionHandler$completeClientScenario$1;
                Object obj2 = paymentActionHandler$completeClientScenario$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentActionHandler$completeClientScenario$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    Flow flowOn = FlowKt.flowOn(this.activityEntityManager.renderedPayment(completeClientScenarioAction.getPaymentToken()), this.ioDispatcher);
                    completeClientScenarioAction2 = completeClientScenarioAction;
                    paymentActionHandler$completeClientScenario$12.L$0 = completeClientScenarioAction2;
                    paymentActionHandler$completeClientScenario$12.label = 1;
                    obj2 = FlowKt.first(flowOn, paymentActionHandler$completeClientScenario$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        completeClientScenarioAction3 = paymentActionHandler$completeClientScenario$12.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        apiResult = (ApiResult) obj2;
                        if (apiResult instanceof ApiResult.Success) {
                            if (!(apiResult instanceof ApiResult.Failure)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to confirm payment (", completeClientScenarioAction3.getPaymentToken(), ")"), new Object[0]);
                            ((RealPaymentManager) this.paymentManager).error(completeClientScenarioAction3.getFlowToken(), TextUtilsCompat.errorMessaging(this.stringManager, (ApiResult.Failure) apiResult, Integer.valueOf(R.string.history_confirm_error_message)).getMessage());
                            return null;
                        }
                        CompleteScenarioResponse completeScenarioResponse = (CompleteScenarioResponse) ((ApiResult.Success) apiResult).response;
                        CompleteScenarioResponse.Status status = completeScenarioResponse.status;
                        ResponseContext responseContext = completeScenarioResponse.response_context;
                        if (status != CompleteScenarioResponse.Status.SUCCESS) {
                            OptionalProvider$$ExternalSyntheticLambda0.m((Object) status, "Unknown status: ");
                            return null;
                        }
                        Timber.Forest.d(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Successfully completed scenario plan (", completeClientScenarioAction3.getPaymentToken(), ")"), new Object[0]);
                        ScenarioPlan scenarioPlan = responseContext != null ? responseContext.scenario_plan : null;
                        StatusResult statusResult = responseContext != null ? responseContext.status_result : null;
                        if (scenarioPlan == null && statusResult == null) {
                            return null;
                        }
                        String flowToken = completeClientScenarioAction3.getFlowToken();
                        responseContext.getClass();
                        String str = ((UiPayment) responseContext.payments.get(0)).token;
                        str.getClass();
                        return completeScenarioPlan(flowToken, str, scenarioPlan, statusResult, completeClientScenarioAction3.getClientScenario());
                    }
                    completeClientScenarioAction2 = paymentActionHandler$completeClientScenario$12.L$0;
                    SafeTrace.throwOnFailure(obj2);
                }
                PaymentAction.CompleteClientScenarioAction completeClientScenarioAction4 = completeClientScenarioAction2;
                RenderedPayment renderedPayment = (RenderedPayment) obj2;
                scenarioPlanMap = renderedPayment.historyData.scenario_plan_map;
                if (scenarioPlanMap != null || (list = scenarioPlanMap.scenario_plans) == null) {
                    scenarioPlanEntry = null;
                } else {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        ScenarioPlanEntry scenarioPlanEntry2 = (ScenarioPlanEntry) obj;
                        if (scenarioPlanEntry2.client_scenario == completeClientScenarioAction4.getClientScenario()) {
                            ScenarioPlan scenarioPlan2 = scenarioPlanEntry2.scenario_plan;
                            List<BlockerDescriptor> list2 = scenarioPlan2 != null ? scenarioPlan2.blocker_descriptors : null;
                            if (list2 != null && !list2.isEmpty()) {
                                break;
                            }
                        }
                    }
                    scenarioPlanEntry = (ScenarioPlanEntry) obj;
                }
                if (scenarioPlanEntry == null) {
                    return completeScenarioPlan(completeClientScenarioAction4.getFlowToken(), renderedPayment.token, scenarioPlanEntry.scenario_plan, null, completeClientScenarioAction4.getClientScenario());
                }
                ClientScenario clientScenario = completeClientScenarioAction4.getClientScenario();
                String flowToken2 = completeClientScenarioAction4.getFlowToken();
                CompleteScenarioRequest completeScenarioRequest = new CompleteScenarioRequest(28, new RequestContext(null, CollectionsKt__CollectionsJVMKt.listOf(completeClientScenarioAction4.getPaymentToken()), null, null, null, null, null, null, 8175), CollectionsKt__CollectionsJVMKt.listOf(completeClientScenarioAction4.getPaymentToken()));
                paymentActionHandler$completeClientScenario$12.L$0 = completeClientScenarioAction4;
                paymentActionHandler$completeClientScenario$12.label = 2;
                Object completeScenario = this.appService.completeScenario(clientScenario, flowToken2, null, null, completeScenarioRequest, paymentActionHandler$completeClientScenario$12);
                if (completeScenario != coroutineSingletons) {
                    completeClientScenarioAction3 = completeClientScenarioAction4;
                    obj2 = completeScenario;
                    apiResult = (ApiResult) obj2;
                    if (apiResult instanceof ApiResult.Success) {
                    }
                }
                return coroutineSingletons;
            }
        }
        paymentActionHandler$completeClientScenario$1 = new PaymentActionHandler$completeClientScenario$1(this, continuationImpl);
        PaymentActionHandler$completeClientScenario$1 paymentActionHandler$completeClientScenario$122 = paymentActionHandler$completeClientScenario$1;
        Object obj22 = paymentActionHandler$completeClientScenario$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentActionHandler$completeClientScenario$122.label;
        if (i != 0) {
        }
        PaymentAction.CompleteClientScenarioAction completeClientScenarioAction42 = completeClientScenarioAction2;
        RenderedPayment renderedPayment2 = (RenderedPayment) obj22;
        scenarioPlanMap = renderedPayment2.historyData.scenario_plan_map;
        if (scenarioPlanMap != null) {
        }
        scenarioPlanEntry = null;
        if (scenarioPlanEntry == null) {
        }
    }

    public final PaymentActionResult completeScenarioPlan(String str, String str2, ScenarioPlan scenarioPlan, StatusResult statusResult, ClientScenario clientScenario) {
        Screen startPaymentBlockersFlow;
        String str3;
        List<BlockerDescriptor> list;
        ClientScenario clientScenario2 = ClientScenario.RESOLVE_SUSPENSION;
        FlowStarter flowStarter = this.flowStarter;
        RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$1 = this.activeArgs;
        if (clientScenario == clientScenario2) {
            List listOf = CollectionsKt__CollectionsJVMKt.listOf(str2);
            Screen screen = (Screen) roomDatabase$closeBarrier$1.invoke();
            RealFlowStarter realFlowStarter = (RealFlowStarter) flowStarter;
            str.getClass();
            listOf.getClass();
            screen.getClass();
            startPaymentBlockersFlow = realFlowStarter.blockersDataNavigator.getNext(null, FlowStarter.startFlow$default(realFlowStarter, BlockersData.Flow.PAYMENT, screen, scenarioPlan, clientScenario2, str, null, null, null, new RealFlowStarter$$ExternalSyntheticLambda2(statusResult, listOf), 464));
        } else if (clientScenario == ClientScenario.REPORT_SCAM) {
            startPaymentBlockersFlow = ((RealFlowStarter) flowStarter).startPaymentBlockersFlow(str, scenarioPlan, statusResult, CollectionsKt__CollectionsJVMKt.listOf(str2), (Screen) roomDatabase$closeBarrier$1.invoke(), clientScenario);
        } else if (clientScenario == null || !CollectionsKt__CollectionsKt.listOf((Object[]) new ClientScenario[]{ClientScenario.INITIATE_REFUND_REQUEST, ClientScenario.REVIEW_REFUND_REQUEST}).contains(clientScenario)) {
            startPaymentBlockersFlow = ((RealFlowStarter) flowStarter).startPaymentBlockersFlow(str, scenarioPlan, statusResult, CollectionsKt__CollectionsJVMKt.listOf(str2), (Screen) roomDatabase$closeBarrier$1.invoke(), ClientScenario.ACTIVITY);
        } else {
            List listOf2 = CollectionsKt__CollectionsJVMKt.listOf(str2);
            Screen screen2 = (Screen) roomDatabase$closeBarrier$1.invoke();
            RealFlowStarter realFlowStarter2 = (RealFlowStarter) flowStarter;
            str.getClass();
            listOf2.getClass();
            screen2.getClass();
            startPaymentBlockersFlow = realFlowStarter2.blockersDataNavigator.getNext(null, FlowStarter.startFlow$default(realFlowStarter2, BlockersData.Flow.CLIENT_SCENARIO, screen2, scenarioPlan, clientScenario, str, null, null, null, new OpenSourceKt$$ExternalSyntheticLambda6(listOf2, 4), 464));
        }
        if (!Intrinsics.areEqual(startPaymentBlockersFlow, roomDatabase$closeBarrier$1.invoke())) {
            return new PaymentActionResult.GoToScreen(startPaymentBlockersFlow);
        }
        if (scenarioPlan != null && (list = scenarioPlan.blocker_descriptors) != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Blockers blockers = ((BlockerDescriptor) it.next()).blocker;
                str3 = blockers != null ? blockers.url : null;
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            return new PaymentActionResult.Route(new RoutingParams((Screen) roomDatabase$closeBarrier$1.invoke(), null, null, null, null, null, 510), str3);
        }
        Timber.Forest.e("scenarioPlan = " + scenarioPlan, new Object[0], new IllegalStateException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Don't know how to resolve blockers for payment ", str2, " and no URL was supplied.")));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendConfirm(String str, String str2, InstrumentSelection instrumentSelection, Role role, ContinuationImpl continuationImpl) {
        PaymentActionHandler$sendConfirm$2 paymentActionHandler$sendConfirm$2;
        int i;
        Role role2;
        String str3;
        boolean z;
        StatusResult statusResult;
        String str4 = str;
        if (continuationImpl instanceof PaymentActionHandler$sendConfirm$2) {
            paymentActionHandler$sendConfirm$2 = (PaymentActionHandler$sendConfirm$2) continuationImpl;
            int i2 = paymentActionHandler$sendConfirm$2.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paymentActionHandler$sendConfirm$2.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = paymentActionHandler$sendConfirm$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentActionHandler$sendConfirm$2.label;
                ProductionAttributionEventEmitter productionAttributionEventEmitter = this.attributionEventEmitter;
                r7 = null;
                String str5 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ConfirmPaymentRequest confirmPaymentRequest = new ConfirmPaymentRequest(new RequestContext(null, CollectionsKt__CollectionsJVMKt.listOf(str2), null, null, null, null, null, null, 8175), CollectionsKt__CollectionsJVMKt.listOf(str2), instrumentSelection, 18);
                    productionAttributionEventEmitter.paymentConfirmationInitiated();
                    ClientScenario clientScenario = ClientScenario.ACTIVITY;
                    paymentActionHandler$sendConfirm$2.L$0 = str4;
                    paymentActionHandler$sendConfirm$2.L$1 = str2;
                    role2 = role;
                    paymentActionHandler$sendConfirm$2.L$3 = role2;
                    paymentActionHandler$sendConfirm$2.label = 1;
                    obj = this.appService.confirmPayment(clientScenario, str4, confirmPaymentRequest, paymentActionHandler$sendConfirm$2);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str3 = str2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Role role3 = paymentActionHandler$sendConfirm$2.L$3;
                    str3 = paymentActionHandler$sendConfirm$2.L$1;
                    String str6 = paymentActionHandler$sendConfirm$2.L$0;
                    SafeTrace.throwOnFailure(obj);
                    role2 = role3;
                    str4 = str6;
                }
                ApiResult apiResult = (ApiResult) obj;
                z = apiResult instanceof ApiResult.Success;
                PaymentManager paymentManager = this.paymentManager;
                AndroidStringManager androidStringManager = this.stringManager;
                if (!z) {
                    ConfirmPaymentResponse confirmPaymentResponse = (ConfirmPaymentResponse) ((ApiResult.Success) apiResult).response;
                    ConfirmPaymentResponse.Status status = confirmPaymentResponse.status;
                    ResponseContext responseContext = confirmPaymentResponse.response_context;
                    if (status == null) {
                        status = ProtoDefaults.CONFIRM_PAYMENT_STATUS;
                    }
                    int ordinal = status.ordinal();
                    if (ordinal == 1) {
                        Timber.Forest.d(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Successfully confirmed payment (", str3, ")"), new Object[0]);
                        responseContext.getClass();
                        StatusResult statusResult2 = responseContext.status_result;
                        StatusResult.Icon icon = statusResult2 != null ? statusResult2.icon : null;
                        if (icon == StatusResult.Icon.BANK || icon == StatusResult.Icon.FAILURE) {
                            statusResult2.getClass();
                            String str7 = statusResult2.text;
                            str7.getClass();
                            ((RealPaymentManager) paymentManager).error(str4, str7);
                        } else if (((UiPayment) responseContext.payments.get(0)).state == PaymentState.FAILED) {
                            ((RealPaymentManager) paymentManager).error(str4, androidStringManager.get(R.string.history_confirm_error_message));
                        } else {
                            productionAttributionEventEmitter.paymentConfirmationSuccessful(role2);
                        }
                    } else if (ordinal == 2) {
                        Timber.Forest.d(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error when confirming payment with status CONCURRENT_MODIFICATION. (", str3, ")"), new Object[0]);
                        ((RealPaymentManager) paymentManager).error(str4, androidStringManager.get(R.string.history_confirm_error_message));
                    } else {
                        if (ordinal != 3) {
                            OptionalProvider$$ExternalSyntheticLambda0.m((Object) status, "Unknown status: ");
                            return null;
                        }
                        Timber.Forest.d(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error when confirming payment with status FAILED. (", str3, ")"), new Object[0]);
                        if (responseContext != null && (statusResult = responseContext.status_result) != null) {
                            str5 = statusResult.text;
                        }
                        str5.getClass();
                        ((RealPaymentManager) paymentManager).error(str4, str5);
                    }
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to confirm payment (", str3, ")"), new Object[0]);
                    ((RealPaymentManager) paymentManager).error(str4, TextUtilsCompat.errorMessaging(androidStringManager, (ApiResult.Failure) apiResult, Integer.valueOf(R.string.history_confirm_error_message)).getMessage());
                }
                return Unit.INSTANCE;
            }
        }
        paymentActionHandler$sendConfirm$2 = new PaymentActionHandler$sendConfirm$2(this, continuationImpl);
        Object obj2 = paymentActionHandler$sendConfirm$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentActionHandler$sendConfirm$2.label;
        ProductionAttributionEventEmitter productionAttributionEventEmitter2 = this.attributionEventEmitter;
        str5 = null;
        String str52 = null;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj2;
        z = apiResult2 instanceof ApiResult.Success;
        PaymentManager paymentManager2 = this.paymentManager;
        AndroidStringManager androidStringManager2 = this.stringManager;
        if (!z) {
        }
        return Unit.INSTANCE;
    }

    public final class MetroFactory {
        public final Provider activityEntityManager;
        public final Provider analytics;
        public final Provider appConfig;
        public final Provider appService;
        public final Provider attributionEventEmitter;
        public final Provider balanceSnapshotManager;
        public final Provider cashDatabase;
        public final Provider clientRouteParser;
        public final Provider clientSyncer;
        public final Provider cryptoService;
        public final Provider customerStore;
        public final Provider flowStarter;
        public final Provider instrumentManager;
        public final Provider intentFactory;
        public final Provider investingService;
        public final Provider ioDispatcher;
        public final Provider lendingAppService;
        public final Provider paymentActionCompletionDispatcher;
        public final Provider paymentManager;
        public final Provider profileSyncer;
        public final Factory scope;
        public final Provider stringManager;
        public final Provider supportNavigator;
        public final Provider tradingService;
        public final Provider uuidGenerator;

        public MetroFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, MLKitTitleGenerator$MetroFactory mLKitTitleGenerator$MetroFactory, Provider provider13, Provider provider14, Provider provider15, Provider provider16, RealMerchantProfileRepo$MetroFactory realMerchantProfileRepo$MetroFactory, Provider provider17, InstanceFactory instanceFactory, Provider provider18, Provider provider19, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, Provider provider20) {
            this.intentFactory = provider;
            this.activityEntityManager = provider2;
            this.paymentManager = provider3;
            this.flowStarter = provider4;
            this.stringManager = provider5;
            this.balanceSnapshotManager = provider6;
            this.instrumentManager = provider7;
            this.appConfig = provider8;
            this.clientSyncer = provider9;
            this.profileSyncer = provider10;
            this.appService = provider11;
            this.cryptoService = provider12;
            this.customerStore = mLKitTitleGenerator$MetroFactory;
            this.tradingService = provider13;
            this.investingService = provider14;
            this.lendingAppService = provider15;
            this.cashDatabase = provider16;
            this.analytics = realMerchantProfileRepo$MetroFactory;
            this.clientRouteParser = provider17;
            this.scope = instanceFactory;
            this.ioDispatcher = provider18;
            this.attributionEventEmitter = provider19;
            this.uuidGenerator = instanceFactory2;
            this.paymentActionCompletionDispatcher = instanceFactory3;
            this.supportNavigator = provider20;
        }

        public MetroFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, Provider provider15, Provider provider16, RealGlobalConfigManager.MetroFactory metroFactory, Provider provider17, Provider provider18, Provider provider19, Provider provider20, Provider provider21, Provider provider22, Provider provider23, Provider provider24) {
            this.intentFactory = provider;
            this.activityEntityManager = provider2;
            this.paymentManager = provider3;
            this.flowStarter = provider4;
            this.stringManager = provider5;
            this.balanceSnapshotManager = provider6;
            this.instrumentManager = provider7;
            this.appConfig = provider8;
            this.clientSyncer = provider9;
            this.profileSyncer = provider10;
            this.appService = provider11;
            this.cryptoService = provider12;
            this.tradingService = provider13;
            this.investingService = provider14;
            this.lendingAppService = provider15;
            this.cashDatabase = provider16;
            this.scope = metroFactory;
            this.clientRouteParser = provider17;
            this.ioDispatcher = provider18;
            this.attributionEventEmitter = provider19;
            this.supportNavigator = provider20;
            this.customerStore = provider21;
            this.analytics = provider22;
            this.uuidGenerator = provider23;
            this.paymentActionCompletionDispatcher = provider24;
        }

        public MetroFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, Provider provider15, Provider provider16, Provider provider17, BroadwayModule$ProvideBroadwayMetroFactory broadwayModule$ProvideBroadwayMetroFactory, Provider provider18, Provider provider19, Provider provider20, Provider provider21, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory, Provider provider22, Provider provider23) {
            this.intentFactory = provider;
            this.activityEntityManager = provider2;
            this.paymentManager = provider3;
            this.flowStarter = provider4;
            this.stringManager = provider5;
            this.balanceSnapshotManager = provider6;
            this.instrumentManager = provider7;
            this.appConfig = provider8;
            this.clientSyncer = provider9;
            this.profileSyncer = provider10;
            this.appService = provider11;
            this.cryptoService = provider12;
            this.tradingService = provider13;
            this.investingService = provider14;
            this.lendingAppService = provider15;
            this.cashDatabase = provider16;
            this.clientRouteParser = provider17;
            this.paymentActionCompletionDispatcher = broadwayModule$ProvideBroadwayMetroFactory;
            this.ioDispatcher = provider18;
            this.attributionEventEmitter = provider19;
            this.supportNavigator = provider20;
            this.customerStore = provider21;
            this.scope = musicViewFactory$MetroFactory;
            this.analytics = provider22;
            this.uuidGenerator = provider23;
        }

        public MetroFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, Provider provider20, Provider provider21, Provider provider22, Provider provider23) {
            this.intentFactory = provider;
            this.activityEntityManager = provider2;
            this.paymentManager = provider3;
            this.flowStarter = provider4;
            this.stringManager = provider5;
            this.balanceSnapshotManager = provider6;
            this.instrumentManager = provider7;
            this.appConfig = provider8;
            this.clientSyncer = provider9;
            this.profileSyncer = provider10;
            this.appService = provider11;
            this.cryptoService = provider12;
            this.tradingService = provider13;
            this.investingService = provider14;
            this.lendingAppService = provider15;
            this.cashDatabase = provider16;
            this.clientRouteParser = provider17;
            this.ioDispatcher = provider18;
            this.attributionEventEmitter = provider19;
            this.scope = instanceFactory;
            this.paymentActionCompletionDispatcher = instanceFactory2;
            this.supportNavigator = provider20;
            this.customerStore = provider21;
            this.analytics = provider22;
            this.uuidGenerator = provider23;
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, LambdaProvider lambdaProvider, Provider provider, Provider provider2, DoubleCheck doubleCheck5, Provider provider3, Provider provider4, DoubleCheck doubleCheck6, DoubleCheck doubleCheck7, DoubleCheck doubleCheck8, DoubleCheck doubleCheck9, DoubleCheck doubleCheck10, DoubleCheck doubleCheck11, DoubleCheck doubleCheck12, LambdaProvider lambdaProvider2, Provider provider5, Provider provider6, Provider provider7, DoubleCheck doubleCheck13, LambdaProvider lambdaProvider3, DoubleCheck doubleCheck14, InstanceFactory instanceFactory) {
            this.intentFactory = doubleCheck;
            this.activityEntityManager = doubleCheck2;
            this.paymentManager = doubleCheck3;
            this.flowStarter = doubleCheck4;
            this.stringManager = lambdaProvider;
            this.balanceSnapshotManager = provider;
            this.instrumentManager = provider2;
            this.appConfig = doubleCheck5;
            this.clientSyncer = provider3;
            this.profileSyncer = provider4;
            this.appService = doubleCheck6;
            this.cryptoService = doubleCheck7;
            this.tradingService = doubleCheck8;
            this.investingService = doubleCheck9;
            this.lendingAppService = doubleCheck10;
            this.cashDatabase = doubleCheck11;
            this.clientRouteParser = doubleCheck12;
            this.ioDispatcher = lambdaProvider2;
            this.attributionEventEmitter = provider5;
            this.supportNavigator = provider6;
            this.customerStore = provider7;
            this.analytics = doubleCheck13;
            this.uuidGenerator = lambdaProvider3;
            this.paymentActionCompletionDispatcher = doubleCheck14;
            this.scope = instanceFactory;
        }
    }
}
