package com.squareup.cash.instruments.backend.real;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda10;
import com.squareup.cash.graphics.swampgl.components.Transform$special$$inlined$map$1;
import com.squareup.cash.instruments.backend.api.InstrumentManager$UnlinkResult;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.UnlinkInstrumentRequest;
import com.squareup.protos.franklin.common.UnlinkInstrumentResponse;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealInstrumentManager {
    public final AppService appService;
    public final InstrumentQueries profileQueries;
    public final Signal signOut;
    public final SyncValueReader syncValueReader;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/instruments/backend/real/RealInstrumentManager$CashBalanceQueriedFromInstrumentsError", "Lcom/squareup/cash/observability/types/ReportedError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public final class CashBalanceQueriedFromInstrumentsError extends ReportedError {
        public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Instruments.INSTANCE);

        @Override // com.squareup.cash.observability.types.FeatureError
        public final Set getFeatures() {
            return this.features;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return "Attempted to query CASH_BALANCE from Instruments. BalanceSnapshotManager should be used for balances.";
        }
    }

    public RealInstrumentManager(CashAccountDatabaseImpl cashAccountDatabaseImpl, AppService appService, SyncValueReader syncValueReader, Signal signal) {
        cashAccountDatabaseImpl.getClass();
        appService.getClass();
        syncValueReader.getClass();
        signal.getClass();
        this.appService = appService;
        this.syncValueReader = syncValueReader;
        this.signOut = signal;
        this.profileQueries = cashAccountDatabaseImpl.profileQueries;
    }

    public static RealInstrumentManager$syncValueBased$$inlined$map$1 syncValueBased$default(RealInstrumentManager realInstrumentManager) {
        return new RealInstrumentManager$syncValueBased$$inlined$map$1(realInstrumentManager.syncValueReader.getAllValues(AndroidSyncValueSpecs.Instrument), true);
    }

    public final Flow forType(CashInstrumentType cashInstrumentType) {
        cashInstrumentType.getClass();
        if (cashInstrumentType != CashInstrumentType.CASH_BALANCE) {
            return StateFlowKt.runUntil(new Transform$special$$inlined$map$1(syncValueBased$default(this), cashInstrumentType, 18), this.signOut);
        }
        throw new CashBalanceQueriedFromInstrumentsError();
    }

    public final Flow forTypes(CashInstrumentType... cashInstrumentTypeArr) {
        if (ArraysKt___ArraysKt.contains(cashInstrumentTypeArr, CashInstrumentType.CASH_BALANCE)) {
            throw new CashBalanceQueriedFromInstrumentsError();
        }
        return StateFlowKt.runUntil(new Transform$special$$inlined$map$1(syncValueBased$default(this), cashInstrumentTypeArr, 19), this.signOut);
    }

    public final Flow select() {
        return StateFlowKt.runUntil(new RealInstrumentManager$syncValueBased$$inlined$map$1(this.syncValueReader.getAllValues(AndroidSyncValueSpecs.Instrument), false), this.signOut);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object unlink(ClientScenario clientScenario, String str, ContinuationImpl continuationImpl) {
        RealInstrumentManager$unlink$1 realInstrumentManager$unlink$1;
        int i;
        ApiResult apiResult;
        StatusResult statusResult;
        if (continuationImpl instanceof RealInstrumentManager$unlink$1) {
            realInstrumentManager$unlink$1 = (RealInstrumentManager$unlink$1) continuationImpl;
            int i2 = realInstrumentManager$unlink$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realInstrumentManager$unlink$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realInstrumentManager$unlink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realInstrumentManager$unlink$1.label;
                String str2 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    UnlinkInstrumentRequest unlinkInstrumentRequest = new UnlinkInstrumentRequest(null, str, ByteString.EMPTY);
                    realInstrumentManager$unlink$1.label = 1;
                    obj = this.appService.unlinkInstrument(clientScenario, null, unlinkInstrumentRequest, realInstrumentManager$unlink$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    if (apiResult instanceof ApiResult.Failure) {
                        return InstrumentManager$UnlinkResult.Failure.INSTANCE;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ApiResult.Success success = (ApiResult.Success) apiResult;
                UnlinkInstrumentResponse unlinkInstrumentResponse = (UnlinkInstrumentResponse) success.response;
                if (unlinkInstrumentResponse.status != UnlinkInstrumentResponse.Status.INELIGIBLE) {
                    this.profileQueries.transactionWithWrapper(new GLSceneScope$$ExternalSyntheticLambda10(14, this, success));
                    return InstrumentManager$UnlinkResult.Success.INSTANCE;
                }
                ResponseContext responseContext = unlinkInstrumentResponse.response_context;
                if (responseContext != null && (statusResult = responseContext.status_result) != null) {
                    str2 = statusResult.text;
                }
                return new InstrumentManager$UnlinkResult.Ineligible(str2);
            }
        }
        realInstrumentManager$unlink$1 = new RealInstrumentManager$unlink$1(this, continuationImpl);
        Object obj2 = realInstrumentManager$unlink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realInstrumentManager$unlink$1.label;
        String str22 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }
}
