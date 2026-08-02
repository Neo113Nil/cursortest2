package com.airbnb.lottie.compose;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.airbnb.lottie.LottieComposition;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0086@¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"awaitOrNull", "Lcom/airbnb/lottie/LottieComposition;", "Lcom/airbnb/lottie/compose/LottieCompositionResult;", "(Lcom/airbnb/lottie/compose/LottieCompositionResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LottieCompositionResultKt {
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitOrNull(LottieCompositionResult lottieCompositionResult, Continuation<? super LottieComposition> continuation) {
        LottieCompositionResultKt$awaitOrNull$1 lottieCompositionResultKt$awaitOrNull$1;
        int i;
        try {
            if (continuation instanceof LottieCompositionResultKt$awaitOrNull$1) {
                lottieCompositionResultKt$awaitOrNull$1 = (LottieCompositionResultKt$awaitOrNull$1) continuation;
                int i2 = lottieCompositionResultKt$awaitOrNull$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    lottieCompositionResultKt$awaitOrNull$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = lottieCompositionResultKt$awaitOrNull$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = lottieCompositionResultKt$awaitOrNull$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        lottieCompositionResultKt$awaitOrNull$1.label = 1;
                        obj = lottieCompositionResult.await(lottieCompositionResultKt$awaitOrNull$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return (LottieComposition) obj;
                }
            }
            if (i != 0) {
            }
            return (LottieComposition) obj;
        } catch (Throwable unused) {
            return null;
        }
        lottieCompositionResultKt$awaitOrNull$1 = new LottieCompositionResultKt$awaitOrNull$1(continuation);
        Object obj3 = lottieCompositionResultKt$awaitOrNull$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lottieCompositionResultKt$awaitOrNull$1.label;
    }
}
