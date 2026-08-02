package ru.yandex.taxi.search.panorama;

import android.graphics.drawable.Drawable;
import defpackage.avj0;
import defpackage.f1h0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.vng;
import defpackage.vpr;
import defpackage.y8y0;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ y8y0 b;

    public c(vpr vprVar, y8y0 y8y0Var) {
        this.a = vprVar;
        this.b = y8y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TaxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$2$1 taxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TaxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$2$1) {
            taxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$2$1 = (TaxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = taxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = taxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    y8y0 y8y0Var = this.b;
                    boolean l = jl40.l(y8y0Var.y.c, "a");
                    zuj0 zuj0Var = y8y0Var.D;
                    Drawable t = l ? vng.t(f1h0.ic_source_pin_24, ((avj0) zuj0Var).a) : vng.t(f1h0.ic_destination_pin_two_flag_24, ((avj0) zuj0Var).a);
                    taxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    taxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    taxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    taxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    taxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(t, taxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        taxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$2$1 = new TaxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = taxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiPanoramaPresenter$attachView$4$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
