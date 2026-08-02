package ru.yandex.taxi.masstransit.rotatemap;

import defpackage.dwc;
import defpackage.gwc;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ dwc b;

    public a(vpr vprVar, dwc dwcVar) {
        this.a = vprVar;
        this.b = dwcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CompassButtonPresenter$attachView$$inlined$map$1$2$1 compassButtonPresenter$attachView$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof CompassButtonPresenter$attachView$$inlined$map$1$2$1) {
            compassButtonPresenter$attachView$$inlined$map$1$2$1 = (CompassButtonPresenter$attachView$$inlined$map$1$2$1) continuation;
            int i2 = compassButtonPresenter$attachView$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                compassButtonPresenter$attachView$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = compassButtonPresenter$attachView$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = compassButtonPresenter$attachView$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    float floatValue = ((Number) obj).floatValue();
                    this.b.getClass();
                    gwc gwcVar = new gwc(!(floatValue == 0.0f), floatValue);
                    compassButtonPresenter$attachView$$inlined$map$1$2$1.L$0 = null;
                    compassButtonPresenter$attachView$$inlined$map$1$2$1.L$1 = null;
                    compassButtonPresenter$attachView$$inlined$map$1$2$1.L$2 = null;
                    compassButtonPresenter$attachView$$inlined$map$1$2$1.L$3 = null;
                    compassButtonPresenter$attachView$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(gwcVar, compassButtonPresenter$attachView$$inlined$map$1$2$1) == coroutineSingletons) {
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
        compassButtonPresenter$attachView$$inlined$map$1$2$1 = new CompassButtonPresenter$attachView$$inlined$map$1$2$1(this, continuation);
        Object obj22 = compassButtonPresenter$attachView$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = compassButtonPresenter$attachView$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
