package ru.yandex.taxi.cashback.interactors;

import defpackage.cda0;
import defpackage.ny61;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class i {
    public final cda0 a;

    public i(cda0 cda0Var) {
        this.a = cda0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        PreparePaymentMethodsInteractorImpl$preloadPaymentMethods$1 preparePaymentMethodsInteractorImpl$preloadPaymentMethods$1;
        int i;
        try {
            if (continuationImpl instanceof PreparePaymentMethodsInteractorImpl$preloadPaymentMethods$1) {
                preparePaymentMethodsInteractorImpl$preloadPaymentMethods$1 = (PreparePaymentMethodsInteractorImpl$preloadPaymentMethods$1) continuationImpl;
                int i2 = preparePaymentMethodsInteractorImpl$preloadPaymentMethods$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    preparePaymentMethodsInteractorImpl$preloadPaymentMethods$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = preparePaymentMethodsInteractorImpl$preloadPaymentMethods$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = preparePaymentMethodsInteractorImpl$preloadPaymentMethods$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        h hVar = new h(((com.yandex.go.payments.paymentlist.data.c) this.a).u);
                        preparePaymentMethodsInteractorImpl$preloadPaymentMethods$1.label = 1;
                        if (kotlinx.coroutines.flow.e.y(hVar, preparePaymentMethodsInteractorImpl$preloadPaymentMethods$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return Boolean.TRUE;
                }
            }
            if (i != 0) {
            }
            return Boolean.TRUE;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return Boolean.FALSE;
        }
        preparePaymentMethodsInteractorImpl$preloadPaymentMethods$1 = new PreparePaymentMethodsInteractorImpl$preloadPaymentMethods$1(this, continuationImpl);
        Object obj2 = preparePaymentMethodsInteractorImpl$preloadPaymentMethods$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = preparePaymentMethodsInteractorImpl$preloadPaymentMethods$1.label;
    }
}
