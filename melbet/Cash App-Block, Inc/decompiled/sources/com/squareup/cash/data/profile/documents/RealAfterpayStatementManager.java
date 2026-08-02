package com.squareup.cash.data.profile.documents;

import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.banking.real.RealDisclosureProvider$special$$inlined$map$1;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.orderly.app.afterpaystatements.AfterpayStatementsClientService;
import com.squareup.protos.cash.orderly.app.afterpaystatements.ListStatementsAppApiRequest;
import com.squareup.protos.cash.orderly.app.afterpaystatements.ListStatementsAppApiResponse;
import com.squareup.protos.document.Document;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import okhttp3.HttpUrl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import retrofit2.Retrofit;

/* loaded from: classes6.dex */
public final class RealAfterpayStatementManager {
    public final AfterpayStatementsClientService appService;
    public final CoroutineContext ioDispatcher;
    public final InstrumentQueries profileQueries;
    public final Retrofit retrofit;
    public final AndroidStringManager stringManager;

    public RealAfterpayStatementManager(CashAccountDatabaseImpl cashAccountDatabaseImpl, AfterpayStatementsClientService afterpayStatementsClientService, AndroidStringManager androidStringManager, Retrofit retrofit, CoroutineContext coroutineContext) {
        this.appService = afterpayStatementsClientService;
        this.stringManager = androidStringManager;
        this.retrofit = retrofit;
        this.ioDispatcher = coroutineContext;
        this.profileQueries = cashAccountDatabaseImpl.profileQueries;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAfterpayStatementDownloadData(String str, ContinuationImpl continuationImpl) {
        RealAfterpayStatementManager$getAfterpayStatementDownloadData$1 realAfterpayStatementManager$getAfterpayStatementDownloadData$1;
        int i;
        Iterator it;
        Object obj;
        Document document;
        if (continuationImpl instanceof RealAfterpayStatementManager$getAfterpayStatementDownloadData$1) {
            realAfterpayStatementManager$getAfterpayStatementDownloadData$1 = (RealAfterpayStatementManager$getAfterpayStatementDownloadData$1) continuationImpl;
            int i2 = realAfterpayStatementManager$getAfterpayStatementDownloadData$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAfterpayStatementManager$getAfterpayStatementDownloadData$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = realAfterpayStatementManager$getAfterpayStatementDownloadData$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAfterpayStatementManager$getAfterpayStatementDownloadData$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    realAfterpayStatementManager$getAfterpayStatementDownloadData$1.L$0 = str;
                    realAfterpayStatementManager$getAfterpayStatementDownloadData$1.label = 1;
                    obj2 = getAfterpayStatements(realAfterpayStatementManager$getAfterpayStatementDownloadData$1);
                    if (obj2 == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = realAfterpayStatementManager$getAfterpayStatementDownloadData$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                }
                it = ((Iterable) obj2).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual(((Document) obj).token, str)) {
                        break;
                    }
                }
                document = (Document) obj;
                if (document != null) {
                    return null;
                }
                AndroidStringManager androidStringManager = this.stringManager;
                String str2 = androidStringManager.get(R.string.profile_documents_downloader_statements_title);
                String str3 = document.title;
                str3.getClass();
                String str4 = androidStringManager.get(R.string.profile_documents_downloader_statements_file_name) + "_" + str;
                str.getClass();
                HttpUrl.Builder newBuilder = this.retrofit.baseUrl.newBuilder();
                newBuilder.addPathSegments("cash-app/afterpay-statements/monthly-statement", false);
                newBuilder.addQueryParameter("token", str);
                return new AfterpayStatementDownloadData(str2, str3, str4, newBuilder.build().url);
            }
        }
        realAfterpayStatementManager$getAfterpayStatementDownloadData$1 = new RealAfterpayStatementManager$getAfterpayStatementDownloadData$1(this, continuationImpl);
        Object obj22 = realAfterpayStatementManager$getAfterpayStatementDownloadData$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAfterpayStatementManager$getAfterpayStatementDownloadData$1.label;
        if (i != 0) {
        }
        it = ((Iterable) obj22).iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        document = (Document) obj;
        if (document != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        if (r8 != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAfterpayStatements(ContinuationImpl continuationImpl) {
        RealAfterpayStatementManager$getAfterpayStatements$1 realAfterpayStatementManager$getAfterpayStatements$1;
        int i;
        AfterpayStatementsClientService afterpayStatementsClientService;
        if (continuationImpl instanceof RealAfterpayStatementManager$getAfterpayStatements$1) {
            realAfterpayStatementManager$getAfterpayStatements$1 = (RealAfterpayStatementManager$getAfterpayStatements$1) continuationImpl;
            int i2 = realAfterpayStatementManager$getAfterpayStatements$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAfterpayStatementManager$getAfterpayStatements$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realAfterpayStatementManager$getAfterpayStatements$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAfterpayStatementManager$getAfterpayStatements$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AfterpayStatementsClientService afterpayStatementsClientService2 = this.appService;
                    realAfterpayStatementManager$getAfterpayStatements$1.L$0 = afterpayStatementsClientService2;
                    realAfterpayStatementManager$getAfterpayStatements$1.label = 1;
                    Object first = FlowKt.first(new RealDisclosureProvider$special$$inlined$map$1(DBUtil.mapToOneNotNull(DBUtil.toFlow(this.profileQueries.select$2()), this.ioDispatcher), 8), realAfterpayStatementManager$getAfterpayStatements$1);
                    if (first != coroutineSingletons) {
                        obj = first;
                        afterpayStatementsClientService = afterpayStatementsClientService2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    ApiResult apiResult = (ApiResult) obj;
                    return apiResult instanceof ApiResult.Success ? ((ListStatementsAppApiResponse) ((ApiResult.Success) apiResult).response).statements : EmptyList.INSTANCE;
                }
                afterpayStatementsClientService = realAfterpayStatementManager$getAfterpayStatements$1.L$0;
                SafeTrace.throwOnFailure(obj);
                ListStatementsAppApiRequest listStatementsAppApiRequest = new ListStatementsAppApiRequest((String) obj, ByteString.EMPTY);
                realAfterpayStatementManager$getAfterpayStatements$1.L$0 = null;
                realAfterpayStatementManager$getAfterpayStatements$1.label = 2;
                obj = afterpayStatementsClientService.getAfterpayStatements(listStatementsAppApiRequest, realAfterpayStatementManager$getAfterpayStatements$1);
            }
        }
        realAfterpayStatementManager$getAfterpayStatements$1 = new RealAfterpayStatementManager$getAfterpayStatements$1(this, continuationImpl);
        Object obj2 = realAfterpayStatementManager$getAfterpayStatements$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAfterpayStatementManager$getAfterpayStatements$1.label;
        if (i != 0) {
        }
        ListStatementsAppApiRequest listStatementsAppApiRequest2 = new ListStatementsAppApiRequest((String) obj2, ByteString.EMPTY);
        realAfterpayStatementManager$getAfterpayStatements$1.L$0 = null;
        realAfterpayStatementManager$getAfterpayStatements$1.label = 2;
        obj2 = afterpayStatementsClientService.getAfterpayStatements(listStatementsAppApiRequest2, realAfterpayStatementManager$getAfterpayStatements$1);
    }
}
