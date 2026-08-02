package com.squareup.cash.payments.backend.real;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.os.BundleKt;
import app.cash.api.ApiResult;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.driver.android.AndroidStatement;
import com.google.android.gms.internal.measurement.zzlj;
import com.squareup.cash.cdf.offline.OfflineTransactionAdded;
import com.squareup.cash.cdf.offline.OfflineTransactionRescheduled;
import com.squareup.cash.cdf.offline.TransactionType;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.payment.OfflineQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.db2.payment.PendingPayment;
import com.squareup.cash.db2.payment.PendingPaymentQueries$$ExternalSyntheticLambda12;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.fiatly.api.v1.InitiatePersonalizedPaymentRequest;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.InitiatePaymentRequest;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.RetryContext;
import com.squareup.protos.franklin.investing.resources.InvestPaymentData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class RealOfflineManager$enqueuePayment$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ClientScenario $clientScenario;
    public final /* synthetic */ Long $createdAt;
    public final /* synthetic */ ApiResult.Failure $failureReason;
    public final /* synthetic */ InitiatePaymentRequest $request;
    public final /* synthetic */ RealOfflineManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealOfflineManager$enqueuePayment$3(Long l, RealOfflineManager realOfflineManager, InitiatePaymentRequest initiatePaymentRequest, ApiResult.Failure failure, ClientScenario clientScenario, Continuation continuation) {
        super(2, continuation);
        this.$createdAt = l;
        this.this$0 = realOfflineManager;
        this.$request = initiatePaymentRequest;
        this.$failureReason = failure;
        this.$clientScenario = clientScenario;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealOfflineManager$enqueuePayment$3(this.$createdAt, this.this$0, this.$request, this.$failureReason, this.$clientScenario, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealOfflineManager$enqueuePayment$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RealOfflineManager realOfflineManager = this.this$0;
        Analytics analytics = realOfflineManager.analytics;
        AndroidClock androidClock = realOfflineManager.clock;
        final InstrumentQueries instrumentQueries = realOfflineManager.paymentQueries;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        ApiResult.Failure failure = this.$failureReason;
        final InitiatePaymentRequest initiatePaymentRequest = this.$request;
        Long l = this.$createdAt;
        if (l != null) {
            final long millis = androidClock.millis() + realOfflineManager.getDelay(0L);
            Timber.Forest.d(Recorder$$ExternalSyntheticOutline2.m("Enqueueing payment: ", initiatePaymentRequest.external_id), new Object[0]);
            analytics.track(new OfflineTransactionAdded(TransactionType.FIAT_PAYMENT, initiatePaymentRequest.external_id, new Long(millis), BundleKt.httpStatusCode(failure), RealOfflineManager.errorDescription(failure), realOfflineManager.commonNetworkError(failure)), null);
            final String str = initiatePaymentRequest.external_id;
            str.getClass();
            final long longValue = l.longValue();
            final Money money = initiatePaymentRequest.amount;
            money.getClass();
            final Orientation orientation = initiatePaymentRequest.orientation;
            orientation.getClass();
            final long size = initiatePaymentRequest.payment_getters.size();
            InitiatePaymentRequest.PaymentData paymentData = initiatePaymentRequest.payment_data;
            final InitiatePersonalizedPaymentRequest initiatePersonalizedPaymentRequest = null;
            InitiatePaymentRequest.PaymentData.InvestPaymentData investPaymentData = paymentData instanceof InitiatePaymentRequest.PaymentData.InvestPaymentData ? (InitiatePaymentRequest.PaymentData.InvestPaymentData) paymentData : null;
            final InvestPaymentData value = investPaymentData != null ? investPaymentData.getValue() : null;
            instrumentQueries.getClass();
            SqlDriver sqlDriver = instrumentQueries.driver;
            final ClientScenario clientScenario = this.$clientScenario;
            QueryResult execute = sqlDriver.execute(1418263563, "INSERT INTO pendingPayment\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", new Function1() { // from class: com.squareup.cash.db2.payment.PendingPaymentQueries$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    AndroidStatement androidStatement = (AndroidStatement) obj2;
                    androidStatement.getClass();
                    androidStatement.bindString(0, str);
                    androidStatement.bindLong(1, Long.valueOf(longValue));
                    androidStatement.bindLong(2, Long.valueOf(millis));
                    androidStatement.bindLong(3, 0L);
                    InstrumentQueries instrumentQueries2 = instrumentQueries;
                    androidStatement.bindBytes(4, (byte[]) ((WireAdapter) ((zzlj) instrumentQueries2.instrumentAdapter).zza).encode(initiatePaymentRequest));
                    zzlj zzljVar = (zzlj) instrumentQueries2.instrumentAdapter;
                    androidStatement.bindBytes(5, (byte[]) ((WireAdapter) zzljVar.zzb).encode(money));
                    androidStatement.bindString(6, (String) ((EnumColumnAdapter) zzljVar.zzc).encode(orientation));
                    androidStatement.bindBoolean(7, Boolean.FALSE);
                    androidStatement.bindLong(8, Long.valueOf(size));
                    InvestPaymentData investPaymentData2 = value;
                    androidStatement.bindBytes(9, investPaymentData2 != null ? (byte[]) ((WireAdapter) zzljVar.zze).encode(investPaymentData2) : null);
                    ClientScenario clientScenario2 = clientScenario;
                    androidStatement.bindString(10, clientScenario2 != null ? (String) ((EnumColumnAdapter) zzljVar.zzd).encode(clientScenario2) : null);
                    InitiatePersonalizedPaymentRequest initiatePersonalizedPaymentRequest2 = initiatePersonalizedPaymentRequest;
                    androidStatement.bindBytes(11, initiatePersonalizedPaymentRequest2 != null ? (byte[]) ((WireAdapter) zzljVar.zzf).encode(initiatePersonalizedPaymentRequest2) : null);
                    return Unit.INSTANCE;
                }
            });
            instrumentQueries.notifyQueries(1418263563, new OfflineQueries$$ExternalSyntheticLambda1(6));
            return execute;
        }
        RequestContext requestContext = initiatePaymentRequest.request_context;
        requestContext.getClass();
        RetryContext retryContext = requestContext.retry_context;
        retryContext.getClass();
        Long l2 = retryContext.retry_attempt;
        l2.getClass();
        long longValue2 = l2.longValue();
        StringBuilder sb = new StringBuilder("Re-enqueueing ");
        sb.append("payment after attempt #" + longValue2 + ": " + initiatePaymentRequest.external_id);
        Timber.Forest.d(sb.toString(), new Object[0]);
        long delay = realOfflineManager.getDelay(longValue2) + androidClock.millis();
        String str2 = initiatePaymentRequest.external_id;
        str2.getClass();
        PendingPayment pendingPayment = (PendingPayment) instrumentQueries.pendingRequest(str2).executeAsOneOrNull();
        if (pendingPayment != null) {
            analytics.track(new OfflineTransactionRescheduled(TransactionType.FIAT_PAYMENT, initiatePaymentRequest.external_id, new Long(pendingPayment.retry_at), new Long(delay), BundleKt.httpStatusCode(failure), RealOfflineManager.errorDescription(failure), realOfflineManager.commonNetworkError(failure)), null);
        }
        String str3 = initiatePaymentRequest.external_id;
        str3.getClass();
        instrumentQueries.getClass();
        QueryResult execute2 = instrumentQueries.driver.execute(228163174, "UPDATE pendingPayment\nSET retry_at = ?,\n    retry_count = ?\nWHERE external_id = ?", new PendingPaymentQueries$$ExternalSyntheticLambda12(delay, longValue2, str3));
        instrumentQueries.notifyQueries(228163174, new OfflineQueries$$ExternalSyntheticLambda1(7));
        return execute2;
    }
}
