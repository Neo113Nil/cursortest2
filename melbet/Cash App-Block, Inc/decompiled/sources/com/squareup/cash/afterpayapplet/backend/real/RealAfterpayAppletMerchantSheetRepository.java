package com.squareup.cash.afterpayapplet.backend.real;

import androidx.compose.ui.draw.RotateKt;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.afterpayapplet.backend.AfterpayAppletMerchantSheetRepository$MerchantSheetResult;
import com.squareup.cash.afterpayapplet.backend.AfterpayAppletParsingErrorFactory;
import com.squareup.cash.afterpayapplet.backend.DatabaseError;
import com.squareup.cash.arcade.treehouse.SearchBarBinding$Content$1$1;
import com.squareup.cash.banking.observability.ProtoParsingError;
import com.squareup.cash.blockers.views.SetNameViewKt$SetName$2$1;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.cashsuggest.api.AfterpayMerchantSheet;
import com.squareup.protos.cash.cashsuggest.api.AfterpayMerchantSheetRequest;
import com.squareup.protos.cash.cashsuggest.api.AfterpayMerchantSheetResponse;
import com.squareup.protos.cash.cashsuggest.api.CashSuggestClientService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.JobKt;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealAfterpayAppletMerchantSheetRepository implements HasObservability {
    public final CashSuggestClientService appService;
    public final CashAccountDatabaseImpl cashDatabase;
    public final AndroidClock clock;
    public final ErrorReporter errorReporter;
    public final CoroutineContext ioContext;
    public final SampleStrategy oneErrorPerAppSessionStrategy;

    public RealAfterpayAppletMerchantSheetRepository(CashSuggestClientService cashSuggestClientService, CashAccountDatabaseImpl cashAccountDatabaseImpl, AndroidClock androidClock, ErrorReporter errorReporter, SampleStrategy sampleStrategy, CoroutineContext coroutineContext) {
        this.appService = cashSuggestClientService;
        this.cashDatabase = cashAccountDatabaseImpl;
        this.clock = androidClock;
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
        this.ioContext = coroutineContext;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0088, code lost:
    
        if (r2 == r7) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x006a, code lost:
    
        if (r2 == r7) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getSheet(String str, ContinuationImpl continuationImpl) {
        RealAfterpayAppletMerchantSheetRepository$getSheet$1 realAfterpayAppletMerchantSheetRepository$getSheet$1;
        int i;
        AfterpayMerchantSheet afterpayMerchantSheet;
        Ref$ObjectRef ref$ObjectRef;
        Object withContext;
        AfterpayMerchantSheet afterpayMerchantSheet2;
        String str2 = str;
        if (continuationImpl instanceof RealAfterpayAppletMerchantSheetRepository$getSheet$1) {
            realAfterpayAppletMerchantSheetRepository$getSheet$1 = (RealAfterpayAppletMerchantSheetRepository$getSheet$1) continuationImpl;
            int i2 = realAfterpayAppletMerchantSheetRepository$getSheet$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAfterpayAppletMerchantSheetRepository$getSheet$1.label = i2 - PKIFailureInfo.systemUnavail;
                RealAfterpayAppletMerchantSheetRepository$getSheet$1 realAfterpayAppletMerchantSheetRepository$getSheet$12 = realAfterpayAppletMerchantSheetRepository$getSheet$1;
                Object obj = realAfterpayAppletMerchantSheetRepository$getSheet$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAfterpayAppletMerchantSheetRepository$getSheet$12.label;
                SampleStrategy sampleStrategy = this.oneErrorPerAppSessionStrategy;
                ErrorReporter errorReporter = this.errorReporter;
                CoroutineContext coroutineContext = this.ioContext;
                AfterpayAppletMerchantSheetRepository$MerchantSheetResult.Failure failure = AfterpayAppletMerchantSheetRepository$MerchantSheetResult.Failure.INSTANCE;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realAfterpayAppletMerchantSheetRepository$getSheet$12.L$0 = str2;
                    realAfterpayAppletMerchantSheetRepository$getSheet$12.label = 1;
                    obj = JobKt.withContext(coroutineContext, new SearchBarBinding$Content$1$1(this, str2, continuation, 10), realAfterpayAppletMerchantSheetRepository$getSheet$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ref$ObjectRef = realAfterpayAppletMerchantSheetRepository$getSheet$12.L$4;
                            try {
                                SafeTrace.throwOnFailure(obj);
                            } catch (Exception e) {
                                e = e;
                                errorReporter.report(new DatabaseError(e, "Failed to save afterpay merchant sheet response"), sampleStrategy);
                                afterpayMerchantSheet2 = (AfterpayMerchantSheet) ref$ObjectRef.element;
                                if (afterpayMerchantSheet2 != null) {
                                }
                                return failure;
                            }
                            afterpayMerchantSheet2 = (AfterpayMerchantSheet) ref$ObjectRef.element;
                            if (afterpayMerchantSheet2 != null) {
                                return new AfterpayAppletMerchantSheetRepository$MerchantSheetResult.Success(afterpayMerchantSheet2);
                            }
                            return failure;
                        }
                        str2 = realAfterpayAppletMerchantSheetRepository$getSheet$12.L$0;
                        SafeTrace.throwOnFailure(obj);
                        Object obj2 = obj;
                        String str3 = str2;
                        ApiResult apiResult = (ApiResult) obj2;
                        if (apiResult instanceof ApiResult.Success) {
                            AfterpayMerchantSheetResponse afterpayMerchantSheetResponse = (AfterpayMerchantSheetResponse) ((ApiResult.Success) apiResult).response;
                            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                            try {
                                AfterpayAppletParsingErrorFactory afterpayAppletParsingErrorFactory = AfterpayAppletParsingErrorFactory.INSTANCE;
                                try {
                                    ref$ObjectRef2.element = afterpayMerchantSheetResponse.sheet;
                                } catch (Exception e2) {
                                    throw RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(afterpayMerchantSheetResponse.getClass()), afterpayAppletParsingErrorFactory, null);
                                }
                            } catch (ProtoParsingError e3) {
                                errorReporter.report(e3, sampleStrategy);
                            }
                            try {
                                realAfterpayAppletMerchantSheetRepository$getSheet$12.L$0 = null;
                                realAfterpayAppletMerchantSheetRepository$getSheet$12.L$4 = ref$ObjectRef2;
                                realAfterpayAppletMerchantSheetRepository$getSheet$12.label = 3;
                                withContext = JobKt.withContext(coroutineContext, new SetNameViewKt$SetName$2$1(this, str3, afterpayMerchantSheetResponse, continuation, 3), realAfterpayAppletMerchantSheetRepository$getSheet$12);
                                if (withContext != coroutineSingletons) {
                                    withContext = Unit.INSTANCE;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                ref$ObjectRef = ref$ObjectRef2;
                                errorReporter.report(new DatabaseError(e, "Failed to save afterpay merchant sheet response"), sampleStrategy);
                                afterpayMerchantSheet2 = (AfterpayMerchantSheet) ref$ObjectRef.element;
                                if (afterpayMerchantSheet2 != null) {
                                }
                                return failure;
                            }
                            if (withContext != coroutineSingletons) {
                                ref$ObjectRef = ref$ObjectRef2;
                                afterpayMerchantSheet2 = (AfterpayMerchantSheet) ref$ObjectRef.element;
                                if (afterpayMerchantSheet2 != null) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        return failure;
                    }
                    str2 = realAfterpayAppletMerchantSheetRepository$getSheet$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                afterpayMerchantSheet = (AfterpayMerchantSheet) obj;
                if (afterpayMerchantSheet == null) {
                    return new AfterpayAppletMerchantSheetRepository$MerchantSheetResult.Success(afterpayMerchantSheet);
                }
                AfterpayMerchantSheetRequest afterpayMerchantSheetRequest = new AfterpayMerchantSheetRequest(str2, ByteString.EMPTY);
                realAfterpayAppletMerchantSheetRepository$getSheet$12.L$0 = str2;
                realAfterpayAppletMerchantSheetRepository$getSheet$12.label = 2;
                obj = this.appService.afterpaySheet(afterpayMerchantSheetRequest, realAfterpayAppletMerchantSheetRepository$getSheet$12);
            }
        }
        realAfterpayAppletMerchantSheetRepository$getSheet$1 = new RealAfterpayAppletMerchantSheetRepository$getSheet$1(this, continuationImpl);
        RealAfterpayAppletMerchantSheetRepository$getSheet$1 realAfterpayAppletMerchantSheetRepository$getSheet$122 = realAfterpayAppletMerchantSheetRepository$getSheet$1;
        Object obj3 = realAfterpayAppletMerchantSheetRepository$getSheet$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAfterpayAppletMerchantSheetRepository$getSheet$122.label;
        SampleStrategy sampleStrategy2 = this.oneErrorPerAppSessionStrategy;
        ErrorReporter errorReporter2 = this.errorReporter;
        CoroutineContext coroutineContext2 = this.ioContext;
        AfterpayAppletMerchantSheetRepository$MerchantSheetResult.Failure failure2 = AfterpayAppletMerchantSheetRepository$MerchantSheetResult.Failure.INSTANCE;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        afterpayMerchantSheet = (AfterpayMerchantSheet) obj3;
        if (afterpayMerchantSheet == null) {
        }
    }
}
