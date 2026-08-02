package ru.yandex.taxi.utils;

import defpackage.bms;
import defpackage.jx81;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.exception.HttpRetryAfterException;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"T", "Lvpr;", "", "cause", "", "attempt", "", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;J)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.utils.FlowErrorsHandlingKt$retryOnNetworkOrServerErrors$1", f = "FlowErrorsHandling.kt", l = {31, 36}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class FlowErrorsHandlingKt$retryOnNetworkOrServerErrors$1 extends SuspendLambda implements bms {
    final /* synthetic */ long $delayMs;
    final /* synthetic */ int $maxRetry;
    /* synthetic */ long J$0;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowErrorsHandlingKt$retryOnNetworkOrServerErrors$1(int i, long j, Continuation continuation) {
        super(4, continuation);
        this.$maxRetry = i;
        this.$delayMs = j;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long longValue = ((Number) obj3).longValue();
        FlowErrorsHandlingKt$retryOnNetworkOrServerErrors$1 flowErrorsHandlingKt$retryOnNetworkOrServerErrors$1 = new FlowErrorsHandlingKt$retryOnNetworkOrServerErrors$1(this.$maxRetry, this.$delayMs, (Continuation) obj4);
        flowErrorsHandlingKt$retryOnNetworkOrServerErrors$1.L$0 = (Throwable) obj2;
        flowErrorsHandlingKt$retryOnNetworkOrServerErrors$1.J$0 = longValue;
        return flowErrorsHandlingKt$retryOnNetworkOrServerErrors$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (kotlinx.coroutines.a.i(r4, r10) == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        if (((r0 instanceof retrofit2.HttpException ? ((retrofit2.HttpException) r0).a() : 0) / 100) == 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        if (kotlinx.coroutines.a.i(r8, r10) == r3) goto L35;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th = (Throwable) this.L$0;
        long j = this.J$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            kotlin.b.b(obj);
            if (j < this.$maxRetry) {
                if (th instanceof HttpRetryAfterException) {
                    Long l = new Long(((HttpRetryAfterException) th).getDelayMs());
                    if (l.longValue() <= 0) {
                        l = null;
                    }
                    long longValue = l != null ? l.longValue() : this.$delayMs;
                    this.L$0 = null;
                    this.J$0 = j;
                    this.label = 1;
                } else {
                    if (!jx81.B(th)) {
                    }
                    long j2 = this.$delayMs;
                    this.L$0 = null;
                    this.J$0 = j;
                    this.label = 2;
                }
            }
            z = false;
        } else {
            if (i != 1 && i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return Boolean.valueOf(z);
    }
}
