package com.squareup.cash.deposits.physical.backend.real.barcode;

import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzke;
import com.squareup.cash.data.profile.RealProfileManager$setPhoto$2;
import com.squareup.cash.data.transfers.RealTransferManager$addCash$$inlined$map$1;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.recipients.RecipientQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.db2.security.PasswordInfoQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.deposits.physical.db.PhysicalDepositsBarcodeQueries$select$2;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.nearby.views.DotGridKt$DotGrid$3$1;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.papermate.app.GetPaperCashDepositBarcodeRequest;
import com.squareup.protos.cash.papermate.app.GetPaperCashDepositBarcodeResponse;
import com.squareup.protos.cash.papermate.app.GetPaperCashDepositBarcodeResponse$Result$Failure;
import com.squareup.protos.cash.papermate.app.GetPaperCashDepositBarcodeResponse$Result$Success;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.SafeFlow;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.papermate.app.PapermateClientService;

/* loaded from: classes6.dex */
public final class RealCashDepositBarcodeManager {
    public final AndroidClock clock;
    public final CoroutineContext ioDispatcher;
    public final GpsConfigQueries paperDepositBarcodeQuery;
    public final PapermateClientService service;

    public RealCashDepositBarcodeManager(PapermateClientService papermateClientService, CashAccountDatabaseImpl cashAccountDatabaseImpl, AndroidClock androidClock, CoroutineContext coroutineContext) {
        this.service = papermateClientService;
        this.clock = androidClock;
        this.ioDispatcher = coroutineContext;
        this.paperDepositBarcodeQuery = cashAccountDatabaseImpl.physicalDepositsBarcodeQueries;
    }

    public static final RealTransferManager$addCash$$inlined$map$1 access$barcodeInfoFlow(RealCashDepositBarcodeManager realCashDepositBarcodeManager) {
        GpsConfigQueries gpsConfigQueries = realCashDepositBarcodeManager.paperDepositBarcodeQuery;
        gpsConfigQueries.getClass();
        int i = PhysicalDepositsBarcodeQueries$select$2.$r8$clinit;
        SqlDriver sqlDriver = gpsConfigQueries.driver;
        RecipientQueries$$ExternalSyntheticLambda0 recipientQueries$$ExternalSyntheticLambda0 = new RecipientQueries$$ExternalSyntheticLambda0(gpsConfigQueries, (byte) 0);
        sqlDriver.getClass();
        return new RealTransferManager$addCash$$inlined$map$1(new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(new SimpleQuery(697867890, new String[]{"paperDepositBarcodeInfo"}, sqlDriver, "PhysicalDepositsBarcode.sq", "select", "SELECT paperDepositBarcodeInfo.updated_at, paperDepositBarcodeInfo.expires_at, paperDepositBarcodeInfo.success, paperDepositBarcodeInfo.failure FROM paperDepositBarcodeInfo LIMIT 1", recipientQueries$$ExternalSyntheticLambda0)), realCashDepositBarcodeManager.ioDispatcher), realCashDepositBarcodeManager, 28);
    }

    public final SafeFlow barcodeInfo() {
        Long valueOf = Long.valueOf(this.clock.millis());
        GpsConfigQueries gpsConfigQueries = this.paperDepositBarcodeQuery;
        gpsConfigQueries.getClass();
        return new SafeFlow(new RealProfileManager$setPhoto$2(new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(new OffersSheetQueries$ForSheetKeyQuery(gpsConfigQueries, valueOf, new PasswordInfoQueries$$ExternalSyntheticLambda0(25), 8)), this.ioDispatcher), (Continuation) null, this, 19));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r13.ioDispatcher, r6, r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00aa, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0048, code lost:
    
        if (r14 == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object prefetch(ContinuationImpl continuationImpl) {
        RealCashDepositBarcodeManager$prefetch$1 realCashDepositBarcodeManager$prefetch$1;
        int i;
        ApiResult apiResult;
        Long l;
        if (continuationImpl instanceof RealCashDepositBarcodeManager$prefetch$1) {
            realCashDepositBarcodeManager$prefetch$1 = (RealCashDepositBarcodeManager$prefetch$1) continuationImpl;
            int i2 = realCashDepositBarcodeManager$prefetch$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realCashDepositBarcodeManager$prefetch$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realCashDepositBarcodeManager$prefetch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realCashDepositBarcodeManager$prefetch$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetPaperCashDepositBarcodeRequest getPaperCashDepositBarcodeRequest = new GetPaperCashDepositBarcodeRequest(ByteString.EMPTY);
                    realCashDepositBarcodeManager$prefetch$1.label = 1;
                    obj = this.service.getCashDepositBarcode(getPaperCashDepositBarcodeRequest, realCashDepositBarcodeManager$prefetch$1);
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
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    return Unit.INSTANCE;
                }
                zzke zzkeVar = ((GetPaperCashDepositBarcodeResponse) ((ApiResult.Success) apiResult).response).result;
                GetPaperCashDepositBarcodeResponse$Result$Success getPaperCashDepositBarcodeResponse$Result$Success = zzkeVar instanceof GetPaperCashDepositBarcodeResponse$Result$Success ? (GetPaperCashDepositBarcodeResponse$Result$Success) zzkeVar : null;
                GetPaperCashDepositBarcodeResponse.Success success = getPaperCashDepositBarcodeResponse$Result$Success != null ? getPaperCashDepositBarcodeResponse$Result$Success.value : null;
                GetPaperCashDepositBarcodeResponse$Result$Failure getPaperCashDepositBarcodeResponse$Result$Failure = zzkeVar instanceof GetPaperCashDepositBarcodeResponse$Result$Failure ? (GetPaperCashDepositBarcodeResponse$Result$Failure) zzkeVar : null;
                DotGridKt$DotGrid$3$1 dotGridKt$DotGrid$3$1 = new DotGridKt$DotGrid$3$1(this, (success == null || (l = success.expiration_duration_seconds) == null) ? null : new Long(TimeUnit.SECONDS.toMillis(l.longValue()) + this.clock.millis()), success, getPaperCashDepositBarcodeResponse$Result$Failure != null ? getPaperCashDepositBarcodeResponse$Result$Failure.value : null, (Continuation) null, 4);
                realCashDepositBarcodeManager$prefetch$1.label = 2;
            }
        }
        realCashDepositBarcodeManager$prefetch$1 = new RealCashDepositBarcodeManager$prefetch$1(this, continuationImpl);
        Object obj2 = realCashDepositBarcodeManager$prefetch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realCashDepositBarcodeManager$prefetch$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }
}
