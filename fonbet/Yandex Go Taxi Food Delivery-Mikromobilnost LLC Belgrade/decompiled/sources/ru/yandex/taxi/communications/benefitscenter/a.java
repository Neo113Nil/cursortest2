package ru.yandex.taxi.communications.benefitscenter;

import defpackage.g16;
import defpackage.kbv;
import defpackage.ny61;
import defpackage.pav;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class a {
    public final pav a;

    public a(pav pavVar) {
        this.a = pavVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(kbv kbvVar, ContinuationImpl continuationImpl) {
        BenefitsCenterImageLoader$requestLoadImage$1 benefitsCenterImageLoader$requestLoadImage$1;
        int i;
        try {
            if (continuationImpl instanceof BenefitsCenterImageLoader$requestLoadImage$1) {
                benefitsCenterImageLoader$requestLoadImage$1 = (BenefitsCenterImageLoader$requestLoadImage$1) continuationImpl;
                int i2 = benefitsCenterImageLoader$requestLoadImage$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    benefitsCenterImageLoader$requestLoadImage$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = benefitsCenterImageLoader$requestLoadImage$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = benefitsCenterImageLoader$requestLoadImage$1.label;
                    if (i == 0) {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                    g16 i3 = this.a.b().i(kbvVar);
                    benefitsCenterImageLoader$requestLoadImage$1.L$0 = null;
                    benefitsCenterImageLoader$requestLoadImage$1.label = 1;
                    Object b = ru.yandex.taxi.utils.a.b(i3, benefitsCenterImageLoader$requestLoadImage$1);
                    return b == coroutineSingletons ? coroutineSingletons : b;
                }
            }
            if (i == 0) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
        benefitsCenterImageLoader$requestLoadImage$1 = new BenefitsCenterImageLoader$requestLoadImage$1(this, continuationImpl);
        Object obj2 = benefitsCenterImageLoader$requestLoadImage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = benefitsCenterImageLoader$requestLoadImage$1.label;
    }
}
