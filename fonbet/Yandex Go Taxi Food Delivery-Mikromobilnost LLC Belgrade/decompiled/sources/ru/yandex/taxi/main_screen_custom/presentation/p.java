package ru.yandex.taxi.main_screen_custom.presentation;

import defpackage.mnf0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Optional;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class p implements vpr {
    public final /* synthetic */ vpr a;

    public p(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PromoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$6$2$1 promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$6$2$1;
        int i;
        if (continuation instanceof PromoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$6$2$1) {
            promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$6$2$1 = (PromoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$6$2$1) continuation;
            int i2 = promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$6$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$6$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$6$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$6$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Optional ofNullable = Optional.ofNullable((mnf0) obj);
                    promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$6$2$1.L$0 = null;
                    promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$6$2$1.L$1 = null;
                    promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$6$2$1.L$2 = null;
                    promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$6$2$1.L$3 = null;
                    promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$6$2$1.label = 1;
                    if (this.a.emit(ofNullable, promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$6$2$1) == coroutineSingletons) {
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
        promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$6$2$1 = new PromoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$6$2$1(this, continuation);
        Object obj22 = promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$6$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$6$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
