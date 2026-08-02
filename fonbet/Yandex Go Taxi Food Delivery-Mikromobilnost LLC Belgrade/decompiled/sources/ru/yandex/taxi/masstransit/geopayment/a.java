package ru.yandex.taxi.masstransit.geopayment;

import defpackage.as30;
import defpackage.jl40;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.masstransit.experiment.e;

/* loaded from: classes6.dex */
public final class a {
    public final e a;

    public a(e eVar) {
        this.a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        BlePaymentFlowPresentationProviderImpl$useFullscreenPresentation$1 blePaymentFlowPresentationProviderImpl$useFullscreenPresentation$1;
        int i;
        if (continuationImpl instanceof BlePaymentFlowPresentationProviderImpl$useFullscreenPresentation$1) {
            blePaymentFlowPresentationProviderImpl$useFullscreenPresentation$1 = (BlePaymentFlowPresentationProviderImpl$useFullscreenPresentation$1) continuationImpl;
            int i2 = blePaymentFlowPresentationProviderImpl$useFullscreenPresentation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                blePaymentFlowPresentationProviderImpl$useFullscreenPresentation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = blePaymentFlowPresentationProviderImpl$useFullscreenPresentation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = blePaymentFlowPresentationProviderImpl$useFullscreenPresentation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    blePaymentFlowPresentationProviderImpl$useFullscreenPresentation$1.label = 1;
                    obj = this.a.a(blePaymentFlowPresentationProviderImpl$useFullscreenPresentation$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(jl40.l(((as30) obj).b, Boolean.TRUE));
            }
        }
        blePaymentFlowPresentationProviderImpl$useFullscreenPresentation$1 = new BlePaymentFlowPresentationProviderImpl$useFullscreenPresentation$1(this, continuationImpl);
        Object obj2 = blePaymentFlowPresentationProviderImpl$useFullscreenPresentation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = blePaymentFlowPresentationProviderImpl$useFullscreenPresentation$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(jl40.l(((as30) obj2).b, Boolean.TRUE));
    }
}
