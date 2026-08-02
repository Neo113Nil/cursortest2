package ru.yandex.taxi.search.panorama;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.y8y0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class d implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ y8y0 b;

    public d(tpr tprVar, y8y0 y8y0Var) {
        this.a = tprVar;
        this.b = y8y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TaxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$1 taxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof TaxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$1) {
            taxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$1 = (TaxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = taxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b);
                    taxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    taxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    taxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    taxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, taxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        taxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$1 = new TaxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = taxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
