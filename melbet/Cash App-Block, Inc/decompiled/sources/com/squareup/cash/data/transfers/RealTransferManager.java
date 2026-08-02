package com.squareup.cash.data.transfers;

import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.attribution.ProductionAttributionEventEmitter;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.RealIdvPresenter$models$1$1;
import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.cdf.cash.CashDepositReceiveError;
import com.squareup.cash.cdf.cash.CashDepositRequest;
import com.squareup.cash.cdf.cash.CashWithdrawComplete;
import com.squareup.cash.cdf.cash.CashWithdrawReceiveError;
import com.squareup.cash.cdf.cash.CashWithdrawRequest;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.transfers.TransferManager;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientTransfersV1addcashProto;
import com.squareup.cash.featureflags.AmplitudeExperiments$OutEnableInstantFeeIncrease_195Bps;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.moneta.api.v1_0.CashInRequest;
import com.squareup.cash.moneta.core.model.DigitalWalletType;
import com.squareup.cash.money.views.MoneyUiFactory;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.payments.backend.api.OfflineManager;
import com.squareup.cash.payments.backend.real.RealOfflineManager;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.transfers.backend.api.TransfersWithdrawManager;
import com.squareup.cash.transfers.backend.real.RealTransfersWithdrawManager;
import com.squareup.cash.transfers.data.TransferData;
import com.squareup.cash.transfers.data.TransferFee;
import com.squareup.cash.transfers.data.TransferType;
import com.squareup.cash.util.RealDrawerOpener$MetroFactory;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.network.impl.RealNetworkInfo;
import com.squareup.cash.wallet.views.WalletUiFactory$MetroFactory;
import com.squareup.cash.work.presenters.MerchantPickerPresenter$Factory$Impl;
import com.squareup.cash.work.presenters.WorkHomePresenter$Factory$Impl;
import com.squareup.cash.work.presenters.WorkPresenterFactory;
import com.squareup.cash.work.presenters.pay.PayHistoryListPresenter$Factory$Impl;
import com.squareup.cash.work.presenters.pay.PayHomePresenter$Factory$Impl;
import com.squareup.cash.work.presenters.pay.TaxFormDownloaderPresenter$Factory$Impl;
import com.squareup.cash.work.presenters.pay.TaxFormsListPresenter$Factory$Impl;
import com.squareup.cash.work.presenters.providers.RealPasscodeProvider$getPasscode$1;
import com.squareup.cash.work.presenters.shift.ClockInBottomSheetPresenter$Factory$Impl;
import com.squareup.cash.work.presenters.shift.ClockInOverlayPresenter$Factory$Impl;
import com.squareup.cash.work.presenters.shift.DeclareCashTipBottomSheetPresenter$Factory$Impl;
import com.squareup.cash.work.presenters.shift.ShiftDetailPresenter$Factory$Impl;
import com.squareup.cash.work.presenters.shift.ShiftListPresenter$Factory$Impl;
import com.squareup.cash.work.presenters.shift.ShiftNotStartedDialogPresenter$Factory$Impl;
import com.squareup.cash.work.presenters.shift.ShiftNotePresenter$Factory$Impl;
import com.squareup.cash.work.presenters.shift.TakeBreakBottomSheetPresenter$Factory$Impl;
import com.squareup.cash.work.presenters.shift.TimecardDetailPresenter$Factory$Impl;
import com.squareup.cash.work.webview.presenters.WorkWebPresenter$Factory$Impl;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.common.DepositPreferenceData;
import com.squareup.protos.franklin.common.FeeTier;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SignalsContext;
import com.squareup.protos.franklin.common.TransferFundsRequest;
import com.squareup.protos.franklin.common.TransferFundsResponse;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.protos.moneta.api.CashInResponse;
import com.squareup.wire.AndroidMessage;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.moneta.api.v1_0.MonetaService;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class RealTransferManager implements TransferManager {
    public final SharedFlowImpl actions = FlowKt.MutableSharedFlow(0, 1, BufferOverflow.DROP_OLDEST);
    public final Analytics analytics;
    public final AppConfigManager appConfig;
    public final AppService appService;
    public final ProductionAttributionEventEmitter attributionEventEmitter;
    public final RealBalanceSnapshotManager balanceSnapshotManager;
    public final AndroidClock clock;
    public final FeatureFlagManager featureFlagManager;
    public final CoroutineContext ioDispatcher;
    public final AtomicLong lastTransfer;
    public final MonetaService monetaService;
    public final LocalizedMoneyFormatter.Factory moneyFormatterFactory;
    public final RealNetworkInfo networkInfo;
    public final OfflineManager offlineManager;
    public final RealP2pSettingsManager p2pSettingsManager;
    public final AndroidStringManager stringManager;
    public final TransfersWithdrawManager transfersWithdrawManager;
    public final boolean useMonetaService;

    public abstract class InternalTransferFundsResult {

        public final class Failure extends InternalTransferFundsResult {
            public final ApiResult.Failure failure;

            public Failure(ApiResult.Failure failure) {
                this.failure = failure;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Failure) && this.failure.equals(((Failure) obj).failure);
            }

            public final int hashCode() {
                return this.failure.hashCode();
            }

            public final String toString() {
                return "Failure(failure=" + this.failure + ")";
            }
        }

        public final class Successful extends InternalTransferFundsResult {
            public final TransferManager.TransferFundsResult.Success result;

            public Successful(TransferManager.TransferFundsResult.Success success) {
                this.result = success;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Successful) && this.result.equals(((Successful) obj).result);
            }

            public final int hashCode() {
                return this.result.hashCode();
            }

            public final String toString() {
                return "Successful(result=" + this.result + ")";
            }
        }
    }

    public RealTransferManager(RealP2pSettingsManager realP2pSettingsManager, Analytics analytics, RealBalanceSnapshotManager realBalanceSnapshotManager, ProductionAttributionEventEmitter productionAttributionEventEmitter, AppService appService, MonetaService monetaService, OfflineManager offlineManager, AppConfigManager appConfigManager, AndroidClock androidClock, FeatureFlagManager featureFlagManager, AtomicLong atomicLong, AndroidStringManager androidStringManager, LocalizedMoneyFormatter.Factory factory, RealNetworkInfo realNetworkInfo, TransfersWithdrawManager transfersWithdrawManager, CoroutineContext coroutineContext) {
        this.p2pSettingsManager = realP2pSettingsManager;
        this.analytics = analytics;
        this.balanceSnapshotManager = realBalanceSnapshotManager;
        this.attributionEventEmitter = productionAttributionEventEmitter;
        this.appService = appService;
        this.monetaService = monetaService;
        this.offlineManager = offlineManager;
        this.appConfig = appConfigManager;
        this.clock = androidClock;
        this.featureFlagManager = featureFlagManager;
        this.lastTransfer = atomicLong;
        this.stringManager = androidStringManager;
        this.moneyFormatterFactory = factory;
        this.networkInfo = realNetworkInfo;
        this.transfersWithdrawManager = transfersWithdrawManager;
        this.ioDispatcher = coroutineContext;
        this.useMonetaService = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).currentValue(AmplitudeExperiments$ClientTransfersV1addcashProto.INSTANCE)).enabled();
    }

    public static String errorMessage(ApiResult.Failure failure) {
        if (failure instanceof ApiResult.Failure.HttpFailure) {
            return Boxes$$ExternalSyntheticOutline1.m(((ApiResult.Failure.HttpFailure) failure).code, " HTTP failure");
        }
        if (failure instanceof ApiResult.Failure.NetworkFailure) {
            return ((ApiResult.Failure.NetworkFailure) failure).error.getLocalizedMessage();
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doAddCash(TransferFundsRequest transferFundsRequest, String str, BlockersData.MoneybotContext moneybotContext, ContinuationImpl continuationImpl) {
        RealTransferManager$doAddCash$1 realTransferManager$doAddCash$1;
        int i;
        String str2;
        AndroidMessage cashInRequest;
        String str3;
        AndroidMessage androidMessage;
        ApiResult apiResult;
        if (continuationImpl instanceof RealTransferManager$doAddCash$1) {
            realTransferManager$doAddCash$1 = (RealTransferManager$doAddCash$1) continuationImpl;
            int i2 = realTransferManager$doAddCash$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realTransferManager$doAddCash$1.label = i2 - PKIFailureInfo.systemUnavail;
                RealTransferManager$doAddCash$1 realTransferManager$doAddCash$12 = realTransferManager$doAddCash$1;
                Object obj = realTransferManager$doAddCash$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realTransferManager$doAddCash$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    boolean z = this.useMonetaService;
                    if (z) {
                        Instrument instrument = transferFundsRequest.source;
                        RequestContext requestContext = transferFundsRequest.request_context;
                        String str4 = transferFundsRequest.external_id;
                        CashInstrumentType cashInstrumentType = instrument != null ? instrument.cash_instrument_type : null;
                        CashInstrumentType cashInstrumentType2 = CashInstrumentType.GOOGLE_PAY;
                        str2 = null;
                        cashInRequest = new CashInRequest(requestContext, str4, cashInstrumentType != cashInstrumentType2 ? instrument : null, transferFundsRequest.target, transferFundsRequest.amount, transferFundsRequest.passcode_token, null, null, (instrument != null ? instrument.cash_instrument_type : null) == cashInstrumentType2 ? DigitalWalletType.GOOGLE_PAY : null, null, ByteString.EMPTY);
                    } else {
                        str2 = null;
                        if (z) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        cashInRequest = new com.squareup.protos.moneta.api.CashInRequest(transferFundsRequest.request_context, transferFundsRequest.external_id, transferFundsRequest.source, transferFundsRequest.target, transferFundsRequest.amount, transferFundsRequest.passcode_token, null, ByteString.EMPTY);
                    }
                    if (cashInRequest instanceof CashInRequest) {
                        ClientScenario clientScenario = ClientScenario.TRANSFER_FUNDS;
                        String str5 = moneybotContext != null ? moneybotContext.sessionId : str2;
                        String str6 = moneybotContext != null ? moneybotContext.toolRequestId : str2;
                        realTransferManager$doAddCash$12.L$1 = str;
                        realTransferManager$doAddCash$12.L$3 = cashInRequest;
                        realTransferManager$doAddCash$12.label = 1;
                        obj = this.monetaService.addCash(clientScenario, str, str5, str6, (CashInRequest) cashInRequest, realTransferManager$doAddCash$12);
                        if (obj != coroutineSingletons) {
                            str3 = str;
                            androidMessage = cashInRequest;
                            apiResult = (ApiResult) obj;
                        }
                    } else {
                        if (!(cashInRequest instanceof com.squareup.protos.moneta.api.CashInRequest)) {
                            String str7 = str2;
                            a$$ExternalSyntheticBUOutline0.m$1("Not a valid request type for cash in");
                            return str7;
                        }
                        ClientScenario clientScenario2 = ClientScenario.TRANSFER_FUNDS;
                        String str8 = moneybotContext != null ? moneybotContext.sessionId : str2;
                        String str9 = moneybotContext != null ? moneybotContext.toolRequestId : str2;
                        com.squareup.protos.moneta.api.CashInRequest cashInRequest2 = new com.squareup.protos.moneta.api.CashInRequest(transferFundsRequest.request_context, transferFundsRequest.external_id, transferFundsRequest.source, transferFundsRequest.target, transferFundsRequest.amount, transferFundsRequest.passcode_token, null, ByteString.EMPTY);
                        realTransferManager$doAddCash$12.L$1 = str;
                        realTransferManager$doAddCash$12.L$3 = cashInRequest;
                        realTransferManager$doAddCash$12.label = 2;
                        obj = this.appService.cashIn(clientScenario2, str, str8, str9, cashInRequest2, realTransferManager$doAddCash$12);
                        if (obj != coroutineSingletons) {
                            str3 = str;
                            androidMessage = cashInRequest;
                            apiResult = (ApiResult) obj;
                        }
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    androidMessage = realTransferManager$doAddCash$12.L$3;
                    str3 = realTransferManager$doAddCash$12.L$1;
                    SafeTrace.throwOnFailure(obj);
                    str2 = null;
                    apiResult = (ApiResult) obj;
                } else {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    androidMessage = realTransferManager$doAddCash$12.L$3;
                    str3 = realTransferManager$doAddCash$12.L$1;
                    SafeTrace.throwOnFailure(obj);
                    str2 = null;
                    apiResult = (ApiResult) obj;
                }
                if (apiResult instanceof ApiResult.Success) {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        String str10 = str2;
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return str10;
                    }
                    Timber.Forest.e("Failed to add cash", new Object[0]);
                    ApiResult.Failure failure = (ApiResult.Failure) apiResult;
                    this.analytics.track(new CashDepositReceiveError(errorMessage(failure), str3), str2);
                    return new InternalTransferFundsResult.Failure(failure);
                }
                String str11 = androidMessage instanceof com.squareup.protos.moneta.api.CashInRequest ? ((com.squareup.protos.moneta.api.CashInRequest) androidMessage).external_id : androidMessage instanceof CashInRequest ? ((CashInRequest) androidMessage).external_id : str2;
                str11.getClass();
                OfflineManager.RemovalReason removalReason = OfflineManager.RemovalReason.RetrySuccessful;
                ((RealOfflineManager) this.offlineManager).removePendingTransfer(str11, OfflineManager.RemovalReason.RetrySuccessful, null);
                AndroidMessage androidMessage2 = (AndroidMessage) ((ApiResult.Success) apiResult).response;
                ResponseContext responseContext = androidMessage2 instanceof CashInResponse ? ((CashInResponse) androidMessage2).response_context : androidMessage2 instanceof com.squareup.cash.moneta.api.v1_0.CashInResponse ? ((com.squareup.cash.moneta.api.v1_0.CashInResponse) androidMessage2).response_context : str2;
                if (responseContext != 0) {
                    return new InternalTransferFundsResult.Successful(new TransferManager.TransferFundsResult.Success(str11, responseContext));
                }
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return str2;
            }
        }
        realTransferManager$doAddCash$1 = new RealTransferManager$doAddCash$1(this, continuationImpl);
        RealTransferManager$doAddCash$1 realTransferManager$doAddCash$122 = realTransferManager$doAddCash$1;
        Object obj2 = realTransferManager$doAddCash$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realTransferManager$doAddCash$122.label;
        if (i != 0) {
        }
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doCashOut(String str, TransferFundsRequest transferFundsRequest, ContinuationImpl continuationImpl) {
        RealTransferManager$doCashOut$1 realTransferManager$doCashOut$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealTransferManager$doCashOut$1) {
            realTransferManager$doCashOut$1 = (RealTransferManager$doCashOut$1) continuationImpl;
            int i2 = realTransferManager$doCashOut$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realTransferManager$doCashOut$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realTransferManager$doCashOut$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realTransferManager$doCashOut$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ClientScenario clientScenario = ClientScenario.TRANSFER_FUNDS;
                    realTransferManager$doCashOut$1.L$0 = str;
                    realTransferManager$doCashOut$1.L$1 = transferFundsRequest;
                    realTransferManager$doCashOut$1.label = 1;
                    obj = this.appService.transferFunds(clientScenario, str, transferFundsRequest, realTransferManager$doCashOut$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    transferFundsRequest = realTransferManager$doCashOut$1.L$1;
                    str = realTransferManager$doCashOut$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Timber.Forest.e("Failed to send transfer", new Object[0]);
                    ApiResult.Failure failure = (ApiResult.Failure) apiResult;
                    this.analytics.track(new CashWithdrawReceiveError(errorMessage(failure), str), null);
                    return new InternalTransferFundsResult.Failure(failure);
                }
                String str2 = transferFundsRequest.external_id;
                str2.getClass();
                OfflineManager.RemovalReason removalReason = OfflineManager.RemovalReason.RetrySuccessful;
                ((RealOfflineManager) this.offlineManager).removePendingTransfer(str2, OfflineManager.RemovalReason.RetrySuccessful, null);
                String str3 = transferFundsRequest.external_id;
                str3.getClass();
                ResponseContext responseContext = ((TransferFundsResponse) ((ApiResult.Success) apiResult).response).response_context;
                responseContext.getClass();
                return new InternalTransferFundsResult.Successful(new TransferManager.TransferFundsResult.Success(str3, responseContext));
            }
        }
        realTransferManager$doCashOut$1 = new RealTransferManager$doCashOut$1(this, continuationImpl);
        Object obj2 = realTransferManager$doCashOut$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realTransferManager$doCashOut$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    public final Object doTransferFunds(TransferFundsRequest transferFundsRequest, TransferType transferType, String str, boolean z, BlockersData.MoneybotContext moneybotContext, SuspendLambda suspendLambda) {
        String str2;
        String name;
        int ordinal = transferType.ordinal();
        Analytics analytics = this.analytics;
        if (ordinal == 0) {
            String str3 = transferFundsRequest.external_id;
            str3.getClass();
            analytics.track(new CashDepositRequest(Boolean.valueOf(z), str3, str), null);
            return doAddCash(transferFundsRequest, str, moneybotContext, suspendLambda);
        }
        if (ordinal != 1) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        String str4 = transferFundsRequest.external_id;
        str4.getClass();
        DepositPreference depositPreference = transferFundsRequest.deposit_preference;
        if (depositPreference == null || (name = depositPreference.name()) == null) {
            str2 = null;
        } else {
            str2 = name.toUpperCase(Locale.ROOT);
            str2.getClass();
        }
        analytics.track(new CashWithdrawRequest(Boolean.valueOf(z), str4, str, str2), null);
        return doCashOut(str, transferFundsRequest, suspendLambda);
    }

    public final Object processTransfer(BlockersData blockersData, ContinuationImpl continuationImpl) {
        List list;
        TransferData transferData = blockersData.transferData;
        transferData.getClass();
        TransferType transferType = transferData.f1215type;
        TransferType transferType2 = TransferType.CASH_OUT;
        SharedFlowImpl sharedFlowImpl = this.actions;
        if (transferType == transferType2 && transferData.depositPreference == null && !transferData.grandfathered) {
            DepositPreferenceData depositPreferenceData = transferData.depositPreferenceData;
            if (((depositPreferenceData == null || (list = depositPreferenceData.cash_out_options) == null) ? 0 : list.size()) > 1) {
                Object emit = sharedFlowImpl.emit(new TransferManager.TransferAction.HandleBlocker(blockersData), continuationImpl);
                return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : Unit.INSTANCE;
            }
        }
        Object emit2 = sharedFlowImpl.emit(new TransferManager.TransferAction.SendTransfer(blockersData), continuationImpl);
        return emit2 == CoroutineSingletons.COROUTINE_SUSPENDED ? emit2 : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x019b, code lost:
    
        if (r10.emit(r1, r8) == r9) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ee, code lost:
    
        if (r10.emit(r0, r8) == r9) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0207, code lost:
    
        if (r10.emit(r1, r8) == r9) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendTransfer(BlockersData blockersData, ContinuationImpl continuationImpl) {
        RealTransferManager$sendTransfer$1 realTransferManager$sendTransfer$1;
        int i;
        BlockersData blockersData2;
        Instrument instrument;
        Instrument instrument2;
        long j;
        FeeTier feeTier;
        BlockersData blockersData3;
        long j2;
        long j3;
        TransfersWithdrawManager.FeeData.FeeStepTier feeStepTier;
        boolean z;
        if (continuationImpl instanceof RealTransferManager$sendTransfer$1) {
            realTransferManager$sendTransfer$1 = (RealTransferManager$sendTransfer$1) continuationImpl;
            int i2 = realTransferManager$sendTransfer$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realTransferManager$sendTransfer$1.label = i2 - PKIFailureInfo.systemUnavail;
                RealTransferManager$sendTransfer$1 realTransferManager$sendTransfer$12 = realTransferManager$sendTransfer$1;
                Object obj = realTransferManager$sendTransfer$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realTransferManager$sendTransfer$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    long millis = this.clock.millis();
                    long andSet = this.lastTransfer.getAndSet(millis);
                    if (andSet != 0 && millis - andSet < 1000) {
                        Timber.Forest.w(new IllegalStateException("Possible duplicate transfer being sent: " + blockersData));
                        return Unit.INSTANCE;
                    }
                    TransferData transferData = blockersData.transferData;
                    transferData.getClass();
                    TransferType transferType = transferData.f1215type;
                    transferType.getClass();
                    if (transferType == TransferType.ADD_CASH) {
                        this.attributionEventEmitter.trackEvent("Attempted Money Movement", MapsKt__MapsKt.mutableMapOf(new Pair("type", "cash-in")));
                    }
                    TransferFee transferFee = transferData.acceptedFee;
                    Instrument instrument3 = transferData.transferInstrument;
                    Instrument instrument4 = transferData.balance;
                    Money money = transferData.amount;
                    blockersData2 = null;
                    int ordinal = transferType.ordinal();
                    if (ordinal == 0) {
                        instrument = instrument3;
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        instrument = instrument4;
                    }
                    int ordinal2 = transferType.ordinal();
                    if (ordinal2 == 0) {
                        instrument2 = instrument4;
                    } else {
                        if (ordinal2 != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        instrument2 = instrument3;
                    }
                    String uuid = UUID.randomUUID().toString();
                    DepositPreference depositPreference = transferData.depositPreference;
                    Money money2 = transferFee != null ? transferFee.fee : null;
                    if (transferFee == null || (feeStepTier = transferFee.feeTier) == null) {
                        j = andSet;
                        feeTier = null;
                    } else {
                        j = andSet;
                        feeTier = new FeeTier(Long.valueOf(feeStepTier.feeBps), Long.valueOf(feeStepTier.minimumFeeCents), ByteString.EMPTY);
                    }
                    SignalsContext signalsContext = transferData.signalsContext;
                    TransferFundsRequest transferFundsRequest = new TransferFundsRequest(signalsContext != null ? new RequestContext(null, null, null, signalsContext, null, null, null, null, 8063) : null, uuid, instrument, instrument2, money, null, null, depositPreference, money2, null, null, null, feeTier, ByteString.EMPTY);
                    TransferType transferType2 = transferData.f1215type;
                    String str = blockersData.flowToken;
                    BlockersData.MoneybotContext moneybotContext = blockersData.moneybotContext;
                    realTransferManager$sendTransfer$12.L$0 = blockersData;
                    realTransferManager$sendTransfer$12.J$0 = millis;
                    realTransferManager$sendTransfer$12.J$1 = j;
                    realTransferManager$sendTransfer$12.label = 1;
                    obj = JobKt.withContext(this.ioDispatcher, new RealIdvPresenter$models$1$1(this, transferFundsRequest, transferType2, str, moneybotContext, (Continuation) null), realTransferManager$sendTransfer$12);
                    if (obj != coroutineSingletons) {
                        blockersData3 = blockersData;
                        j2 = millis;
                        j3 = j;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i == 3) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i == 4) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j3 = realTransferManager$sendTransfer$12.J$1;
                j2 = realTransferManager$sendTransfer$12.J$0;
                blockersData3 = realTransferManager$sendTransfer$12.L$0;
                SafeTrace.throwOnFailure(obj);
                blockersData2 = null;
                TransferManager.TransferFundsResult transferFundsResult = (TransferManager.TransferFundsResult) obj;
                z = transferFundsResult instanceof TransferManager.TransferFundsResult.Error;
                SharedFlowImpl sharedFlowImpl = this.actions;
                if (!z) {
                    TransferManager.TransferFundsResult.Error.ErrorResult errorResult = ((TransferManager.TransferFundsResult.Error) transferFundsResult).errorResult;
                    if (errorResult.errorStatusResult != null || errorResult.errorScenarioPlan != null) {
                        TransferManager.TransferAction.HandleError handleError = new TransferManager.TransferAction.HandleError(blockersData3, errorResult);
                        realTransferManager$sendTransfer$12.L$0 = blockersData2;
                        realTransferManager$sendTransfer$12.J$0 = j2;
                        realTransferManager$sendTransfer$12.J$1 = j3;
                        realTransferManager$sendTransfer$12.label = 2;
                    }
                    return Unit.INSTANCE;
                }
                if (!(transferFundsResult instanceof TransferManager.TransferFundsResult.Success)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                TransferManager.TransferFundsResult.Success success = (TransferManager.TransferFundsResult.Success) transferFundsResult;
                ResponseContext responseContext = success.responseContext;
                Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                BlockersData updateFromResponseContext = blockersData3.updateFromResponseContext(responseContext, false);
                TransferData transferData2 = blockersData3.transferData;
                transferData2.getClass();
                if (transferData2.f1215type == TransferType.CASH_OUT) {
                    this.analytics.track(new CashWithdrawComplete(blockersData3.flowToken), null);
                }
                ScenarioPlan scenarioPlan = responseContext.scenario_plan;
                List<BlockerDescriptor> list = scenarioPlan != null ? scenarioPlan.blocker_descriptors : null;
                if (list == null || list.isEmpty()) {
                    TransferManager.TransferAction.HandleResult handleResult = new TransferManager.TransferAction.HandleResult(updateFromResponseContext, success);
                    realTransferManager$sendTransfer$12.L$0 = null;
                    realTransferManager$sendTransfer$12.J$0 = j2;
                    realTransferManager$sendTransfer$12.J$1 = j3;
                    realTransferManager$sendTransfer$12.label = 4;
                } else {
                    TransferManager.TransferAction.HandleBlocker handleBlocker = new TransferManager.TransferAction.HandleBlocker(updateFromResponseContext);
                    realTransferManager$sendTransfer$12.L$0 = null;
                    realTransferManager$sendTransfer$12.J$0 = j2;
                    realTransferManager$sendTransfer$12.J$1 = j3;
                    realTransferManager$sendTransfer$12.label = 3;
                }
                return coroutineSingletons;
            }
        }
        realTransferManager$sendTransfer$1 = new RealTransferManager$sendTransfer$1(this, continuationImpl);
        RealTransferManager$sendTransfer$1 realTransferManager$sendTransfer$122 = realTransferManager$sendTransfer$1;
        Object obj2 = realTransferManager$sendTransfer$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realTransferManager$sendTransfer$122.label;
        if (i != 0) {
        }
        TransferManager.TransferFundsResult transferFundsResult2 = (TransferManager.TransferFundsResult) obj2;
        z = transferFundsResult2 instanceof TransferManager.TransferFundsResult.Error;
        SharedFlowImpl sharedFlowImpl2 = this.actions;
        if (!z) {
        }
        return coroutineSingletons2;
    }

    public final RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 transferData(TransferType transferType, boolean z) {
        int i = 24;
        RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(this.balanceSnapshotManager.select(), i);
        RealGooglePayer$createWallet$$inlined$filter$1 realGooglePayer$createWallet$$inlined$filter$1 = new RealGooglePayer$createWallet$$inlined$filter$1(this.p2pSettingsManager.select(), 11);
        RealOfflineManager realOfflineManager = (RealOfflineManager) this.offlineManager;
        RewardSlotQueries rewardSlotQueries = realOfflineManager.offlineQueries;
        rewardSlotQueries.getClass();
        FinishSetupTileBadgeCounter finishSetupTileBadgeCounter = new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(new RewardQueries.ForIdsQuery(rewardSlotQueries, transferType, new OfflineQueries$$ExternalSyntheticLambda1(0), 25)), realOfflineManager.ioDispatcher);
        RealTransfersWithdrawManager realTransfersWithdrawManager = (RealTransfersWithdrawManager) this.transfersWithdrawManager;
        return new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(FlowKt.combine(realBadger2$setup$lambda$0$$inlined$mapNotNull$1, realGooglePayer$createWallet$$inlined$filter$1, finishSetupTileBadgeCounter, FlowKt.transformLatest(((RealFeatureFlagManager) realTransfersWithdrawManager.featureFlagManager).peekValues(AmplitudeExperiments$OutEnableInstantFeeIncrease_195Bps.INSTANCE), new RealPasscodeProvider$getPasscode$1((Continuation) null, realTransfersWithdrawManager, 12)), new RealTransferManager$transferData$2(this, transferType, z, null)), i);
    }

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId = 0;
        public final Provider analytics;
        public final Provider appConfig;
        public final Provider appService;
        public final Provider attributionEventEmitter;
        public final Provider balanceSnapshotManager;
        public final Provider clock;
        public final Provider featureFlagManager;
        public final Provider ioDispatcher;
        public final Provider lastTransfer;
        public final Provider monetaService;
        public final Provider moneyFormatterFactory;
        public final Provider networkInfo;
        public final Provider offlineManager;
        public final Provider p2pSettingsManager;
        public final Provider stringManager;
        public final Factory transfersWithdrawManager;

        public MetroFactory(MoneyUiFactory.MetroFactory metroFactory, DoubleCheck doubleCheck, RealSessionFlags.MetroFactory metroFactory2, TreehouseFlows.MetroFactory metroFactory3, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DelegateFactory delegateFactory, DoubleCheck doubleCheck4, LambdaProvider lambdaProvider, DoubleCheck doubleCheck5, DoubleCheck doubleCheck6, LambdaProvider lambdaProvider2, RealMessageSigner.MetroFactory metroFactory4, RealDrawerOpener$MetroFactory realDrawerOpener$MetroFactory, WalletUiFactory$MetroFactory walletUiFactory$MetroFactory, LambdaProvider lambdaProvider3) {
            this.p2pSettingsManager = metroFactory;
            this.analytics = doubleCheck;
            this.balanceSnapshotManager = metroFactory2;
            this.attributionEventEmitter = metroFactory3;
            this.appService = doubleCheck2;
            this.monetaService = doubleCheck3;
            this.offlineManager = delegateFactory;
            this.appConfig = doubleCheck4;
            this.clock = lambdaProvider;
            this.featureFlagManager = doubleCheck5;
            this.lastTransfer = doubleCheck6;
            this.stringManager = lambdaProvider2;
            this.moneyFormatterFactory = metroFactory4;
            this.networkInfo = realDrawerOpener$MetroFactory;
            this.transfersWithdrawManager = walletUiFactory$MetroFactory;
            this.ioDispatcher = lambdaProvider3;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Factory factory = this.transfersWithdrawManager;
            Provider provider = this.ioDispatcher;
            Provider provider2 = this.networkInfo;
            Provider provider3 = this.moneyFormatterFactory;
            Provider provider4 = this.stringManager;
            Provider provider5 = this.lastTransfer;
            Provider provider6 = this.featureFlagManager;
            Provider provider7 = this.clock;
            Provider provider8 = this.appConfig;
            Provider provider9 = this.offlineManager;
            Provider provider10 = this.monetaService;
            Provider provider11 = this.appService;
            Provider provider12 = this.attributionEventEmitter;
            Provider provider13 = this.balanceSnapshotManager;
            Provider provider14 = this.analytics;
            Provider provider15 = this.p2pSettingsManager;
            switch (i) {
                case 0:
                    RealP2pSettingsManager realP2pSettingsManager = (RealP2pSettingsManager) provider15.invoke();
                    Analytics analytics = (Analytics) provider14.invoke();
                    RealBalanceSnapshotManager realBalanceSnapshotManager = (RealBalanceSnapshotManager) provider13.invoke();
                    ProductionAttributionEventEmitter productionAttributionEventEmitter = (ProductionAttributionEventEmitter) provider12.invoke();
                    AppService appService = (AppService) provider11.invoke();
                    MonetaService monetaService = (MonetaService) provider10.invoke();
                    OfflineManager offlineManager = (OfflineManager) provider9.invoke();
                    AppConfigManager appConfigManager = (AppConfigManager) provider8.invoke();
                    AndroidClock androidClock = (AndroidClock) provider7.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider6.invoke();
                    AtomicLong atomicLong = (AtomicLong) provider5.invoke();
                    AndroidStringManager androidStringManager = (AndroidStringManager) provider4.invoke();
                    LocalizedMoneyFormatter.Factory factory2 = (LocalizedMoneyFormatter.Factory) provider3.invoke();
                    RealNetworkInfo realNetworkInfo = (RealNetworkInfo) provider2.invoke();
                    TransfersWithdrawManager transfersWithdrawManager = (TransfersWithdrawManager) ((WalletUiFactory$MetroFactory) factory).invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) provider.invoke();
                    realP2pSettingsManager.getClass();
                    analytics.getClass();
                    realBalanceSnapshotManager.getClass();
                    productionAttributionEventEmitter.getClass();
                    appService.getClass();
                    monetaService.getClass();
                    offlineManager.getClass();
                    appConfigManager.getClass();
                    androidClock.getClass();
                    featureFlagManager.getClass();
                    atomicLong.getClass();
                    androidStringManager.getClass();
                    factory2.getClass();
                    realNetworkInfo.getClass();
                    coroutineContext.getClass();
                    return new RealTransferManager(realP2pSettingsManager, analytics, realBalanceSnapshotManager, productionAttributionEventEmitter, appService, monetaService, offlineManager, appConfigManager, androidClock, featureFlagManager, atomicLong, androidStringManager, factory2, realNetworkInfo, transfersWithdrawManager, coroutineContext);
                default:
                    WorkHomePresenter$Factory$Impl workHomePresenter$Factory$Impl = (WorkHomePresenter$Factory$Impl) ((InstanceFactory) provider15).value;
                    WorkWebPresenter$Factory$Impl workWebPresenter$Factory$Impl = (WorkWebPresenter$Factory$Impl) ((InstanceFactory) provider14).value;
                    MerchantPickerPresenter$Factory$Impl merchantPickerPresenter$Factory$Impl = (MerchantPickerPresenter$Factory$Impl) ((InstanceFactory) provider13).value;
                    ClockInBottomSheetPresenter$Factory$Impl clockInBottomSheetPresenter$Factory$Impl = (ClockInBottomSheetPresenter$Factory$Impl) ((InstanceFactory) provider12).value;
                    ClockInOverlayPresenter$Factory$Impl clockInOverlayPresenter$Factory$Impl = (ClockInOverlayPresenter$Factory$Impl) ((InstanceFactory) provider11).value;
                    TakeBreakBottomSheetPresenter$Factory$Impl takeBreakBottomSheetPresenter$Factory$Impl = (TakeBreakBottomSheetPresenter$Factory$Impl) ((InstanceFactory) provider10).value;
                    DeclareCashTipBottomSheetPresenter$Factory$Impl declareCashTipBottomSheetPresenter$Factory$Impl = (DeclareCashTipBottomSheetPresenter$Factory$Impl) ((InstanceFactory) provider9).value;
                    ShiftNotStartedDialogPresenter$Factory$Impl shiftNotStartedDialogPresenter$Factory$Impl = (ShiftNotStartedDialogPresenter$Factory$Impl) ((InstanceFactory) provider8).value;
                    ShiftNotePresenter$Factory$Impl shiftNotePresenter$Factory$Impl = (ShiftNotePresenter$Factory$Impl) ((InstanceFactory) provider7).value;
                    PayHomePresenter$Factory$Impl payHomePresenter$Factory$Impl = (PayHomePresenter$Factory$Impl) ((InstanceFactory) provider6).value;
                    PayHistoryListPresenter$Factory$Impl payHistoryListPresenter$Factory$Impl = (PayHistoryListPresenter$Factory$Impl) ((InstanceFactory) provider5).value;
                    TaxFormsListPresenter$Factory$Impl taxFormsListPresenter$Factory$Impl = (TaxFormsListPresenter$Factory$Impl) ((InstanceFactory) provider4).value;
                    TaxFormDownloaderPresenter$Factory$Impl taxFormDownloaderPresenter$Factory$Impl = (TaxFormDownloaderPresenter$Factory$Impl) ((InstanceFactory) provider3).value;
                    TimecardDetailPresenter$Factory$Impl timecardDetailPresenter$Factory$Impl = (TimecardDetailPresenter$Factory$Impl) ((InstanceFactory) provider2).value;
                    ShiftDetailPresenter$Factory$Impl shiftDetailPresenter$Factory$Impl = (ShiftDetailPresenter$Factory$Impl) ((InstanceFactory) provider).value;
                    ShiftListPresenter$Factory$Impl shiftListPresenter$Factory$Impl = (ShiftListPresenter$Factory$Impl) ((InstanceFactory) factory).value;
                    workHomePresenter$Factory$Impl.getClass();
                    workWebPresenter$Factory$Impl.getClass();
                    merchantPickerPresenter$Factory$Impl.getClass();
                    clockInBottomSheetPresenter$Factory$Impl.getClass();
                    clockInOverlayPresenter$Factory$Impl.getClass();
                    takeBreakBottomSheetPresenter$Factory$Impl.getClass();
                    declareCashTipBottomSheetPresenter$Factory$Impl.getClass();
                    shiftNotStartedDialogPresenter$Factory$Impl.getClass();
                    shiftNotePresenter$Factory$Impl.getClass();
                    payHomePresenter$Factory$Impl.getClass();
                    payHistoryListPresenter$Factory$Impl.getClass();
                    taxFormsListPresenter$Factory$Impl.getClass();
                    taxFormDownloaderPresenter$Factory$Impl.getClass();
                    timecardDetailPresenter$Factory$Impl.getClass();
                    shiftDetailPresenter$Factory$Impl.getClass();
                    shiftListPresenter$Factory$Impl.getClass();
                    return new WorkPresenterFactory(workHomePresenter$Factory$Impl, workWebPresenter$Factory$Impl, merchantPickerPresenter$Factory$Impl, clockInBottomSheetPresenter$Factory$Impl, clockInOverlayPresenter$Factory$Impl, takeBreakBottomSheetPresenter$Factory$Impl, declareCashTipBottomSheetPresenter$Factory$Impl, shiftNotStartedDialogPresenter$Factory$Impl, shiftNotePresenter$Factory$Impl, payHomePresenter$Factory$Impl, payHistoryListPresenter$Factory$Impl, taxFormsListPresenter$Factory$Impl, taxFormDownloaderPresenter$Factory$Impl, timecardDetailPresenter$Factory$Impl, shiftDetailPresenter$Factory$Impl, shiftListPresenter$Factory$Impl);
            }
        }

        public MetroFactory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5, InstanceFactory instanceFactory6, InstanceFactory instanceFactory7, InstanceFactory instanceFactory8, InstanceFactory instanceFactory9, InstanceFactory instanceFactory10, InstanceFactory instanceFactory11, InstanceFactory instanceFactory12, InstanceFactory instanceFactory13, InstanceFactory instanceFactory14, InstanceFactory instanceFactory15, InstanceFactory instanceFactory16) {
            this.p2pSettingsManager = instanceFactory;
            this.analytics = instanceFactory2;
            this.balanceSnapshotManager = instanceFactory3;
            this.attributionEventEmitter = instanceFactory4;
            this.appService = instanceFactory5;
            this.monetaService = instanceFactory6;
            this.offlineManager = instanceFactory7;
            this.appConfig = instanceFactory8;
            this.clock = instanceFactory9;
            this.featureFlagManager = instanceFactory10;
            this.lastTransfer = instanceFactory11;
            this.stringManager = instanceFactory12;
            this.moneyFormatterFactory = instanceFactory13;
            this.networkInfo = instanceFactory14;
            this.ioDispatcher = instanceFactory15;
            this.transfersWithdrawManager = instanceFactory16;
        }
    }
}
