package ru.yandex.taxi.utils;

import defpackage.jx81;
import defpackage.ny61;
import defpackage.tls;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public abstract class g {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        if (kotlinx.coroutines.a.i(r7, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0075 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(int i, long j, tls tlsVar, ContinuationImpl continuationImpl) {
        RetryErrorHandlingKt$retryOnNetworkErrors$1 retryErrorHandlingKt$retryOnNetworkErrors$1;
        int i2;
        Exception e;
        int i3;
        long j2;
        if (continuationImpl instanceof RetryErrorHandlingKt$retryOnNetworkErrors$1) {
            retryErrorHandlingKt$retryOnNetworkErrors$1 = (RetryErrorHandlingKt$retryOnNetworkErrors$1) continuationImpl;
            int i4 = retryErrorHandlingKt$retryOnNetworkErrors$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                retryErrorHandlingKt$retryOnNetworkErrors$1.label = i4 - Integer.MIN_VALUE;
                Object obj = retryErrorHandlingKt$retryOnNetworkErrors$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = retryErrorHandlingKt$retryOnNetworkErrors$1.label;
                if (i2 == 0) {
                    if (i2 == 1) {
                        j2 = retryErrorHandlingKt$retryOnNetworkErrors$1.J$0;
                        i3 = retryErrorHandlingKt$retryOnNetworkErrors$1.I$0;
                        tlsVar = (tls) retryErrorHandlingKt$retryOnNetworkErrors$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            return obj;
                        } catch (Exception e2) {
                            e = e2;
                            if (i3 > 0) {
                            }
                            throw e;
                        }
                    }
                    if (i2 != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = retryErrorHandlingKt$retryOnNetworkErrors$1.J$0;
                    i3 = retryErrorHandlingKt$retryOnNetworkErrors$1.I$0;
                    tlsVar = (tls) retryErrorHandlingKt$retryOnNetworkErrors$1.L$0;
                    kotlin.b.b(obj);
                    j = j2;
                    i = i3 - 1;
                    try {
                    } catch (Exception e3) {
                        e = e3;
                        i3 = i;
                        j2 = j;
                        if (i3 > 0 || !jx81.B(e)) {
                            throw e;
                        }
                        retryErrorHandlingKt$retryOnNetworkErrors$1.L$0 = tlsVar;
                        retryErrorHandlingKt$retryOnNetworkErrors$1.I$0 = i3;
                        retryErrorHandlingKt$retryOnNetworkErrors$1.J$0 = j2;
                        retryErrorHandlingKt$retryOnNetworkErrors$1.label = 2;
                    }
                    retryErrorHandlingKt$retryOnNetworkErrors$1.L$0 = tlsVar;
                    retryErrorHandlingKt$retryOnNetworkErrors$1.I$0 = i;
                    retryErrorHandlingKt$retryOnNetworkErrors$1.J$0 = j;
                    retryErrorHandlingKt$retryOnNetworkErrors$1.label = 1;
                    Object invoke = tlsVar.invoke(retryErrorHandlingKt$retryOnNetworkErrors$1);
                    return invoke != coroutineSingletons ? coroutineSingletons : invoke;
                }
                kotlin.b.b(obj);
                retryErrorHandlingKt$retryOnNetworkErrors$1.L$0 = tlsVar;
                retryErrorHandlingKt$retryOnNetworkErrors$1.I$0 = i;
                retryErrorHandlingKt$retryOnNetworkErrors$1.J$0 = j;
                retryErrorHandlingKt$retryOnNetworkErrors$1.label = 1;
                Object invoke2 = tlsVar.invoke(retryErrorHandlingKt$retryOnNetworkErrors$1);
                if (invoke2 != coroutineSingletons) {
                }
            }
        }
        retryErrorHandlingKt$retryOnNetworkErrors$1 = new RetryErrorHandlingKt$retryOnNetworkErrors$1(continuationImpl);
        Object obj2 = retryErrorHandlingKt$retryOnNetworkErrors$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = retryErrorHandlingKt$retryOnNetworkErrors$1.label;
        if (i2 == 0) {
        }
    }
}
