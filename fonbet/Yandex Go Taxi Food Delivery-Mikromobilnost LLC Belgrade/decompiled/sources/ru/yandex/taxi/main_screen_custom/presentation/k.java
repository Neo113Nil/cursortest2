package ru.yandex.taxi.main_screen_custom.presentation;

import defpackage.e3a;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class k implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ e3a b;

    public k(r0 r0Var, e3a e3aVar) {
        this.a = r0Var;
        this.b = e3aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        PromoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$3$1 promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$3$1;
        int i;
        if (continuation instanceof PromoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$3$1) {
            promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$3$1 = (PromoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$3$1) continuation;
            int i2 = promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$3$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$3$1.label = i2 - Integer.MIN_VALUE;
                Object obj = promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$3$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$3$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j jVar = new j(vprVar, this.b);
                    promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$3$1.L$0 = null;
                    promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$3$1.L$1 = null;
                    promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$3$1.L$2 = null;
                    promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$3$1.label = 1;
                    if (this.a.collect(jVar, promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$3$1) == coroutineSingletons) {
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
        promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$3$1 = new PromoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$3$1(this, continuation);
        Object obj2 = promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$3$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$3$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
