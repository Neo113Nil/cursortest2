package ru.yandex.taxi.logistics.sdk.utils;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.utils.RequestUtilsKt$getResultCatchingWithRetry$2", f = "RequestUtils.kt", l = {18, 23}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class RequestUtilsKt$getResultCatchingWithRetry$2 extends SuspendLambda implements wls {
    final /* synthetic */ long $delayMs;
    final /* synthetic */ tls $resultFetcher;
    final /* synthetic */ int $retryAttempts;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestUtilsKt$getResultCatchingWithRetry$2(int i, long j, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$retryAttempts = i;
        this.$delayMs = j;
        this.$resultFetcher = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RequestUtilsKt$getResultCatchingWithRetry$2 requestUtilsKt$getResultCatchingWithRetry$2 = new RequestUtilsKt$getResultCatchingWithRetry$2(this.$retryAttempts, this.$delayMs, this.$resultFetcher, continuation);
        requestUtilsKt$getResultCatchingWithRetry$2.L$0 = obj;
        return requestUtilsKt$getResultCatchingWithRetry$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RequestUtilsKt$getResultCatchingWithRetry$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        if (r9 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (kotlinx.coroutines.a.i(r6, r8) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0055 -> B:6:0x0068). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0065 -> B:6:0x0068). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            b.b(obj);
            if (1 <= this.$retryAttempts) {
                i = 1;
                tls tlsVar = this.$resultFetcher;
                this.L$0 = tseVar;
                this.L$1 = null;
                this.I$0 = i;
                this.I$1 = 0;
                this.label = 1;
                obj = tlsVar.invoke(this);
            }
            return null;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            b.b(obj);
            if (i != this.$retryAttempts) {
                i++;
                tls tlsVar2 = this.$resultFetcher;
                this.L$0 = tseVar;
                this.L$1 = null;
                this.I$0 = i;
                this.I$1 = 0;
                this.label = 1;
                obj = tlsVar2.invoke(this);
            }
            return null;
        }
        i = this.I$0;
        try {
            b.b(obj);
        } catch (Throwable th) {
            obj = new Result.Failure(th);
        }
        if (obj instanceof Result.Failure) {
            obj = null;
        }
        if (obj != null) {
            return obj;
        }
        if (i != this.$retryAttempts) {
            long j = this.$delayMs;
            this.L$0 = tseVar;
            this.L$1 = null;
            this.I$0 = i;
            this.label = 2;
        }
        if (i != this.$retryAttempts) {
        }
        return null;
    }
}
