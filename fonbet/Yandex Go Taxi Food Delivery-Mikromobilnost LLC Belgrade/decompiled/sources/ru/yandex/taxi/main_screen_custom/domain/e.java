package ru.yandex.taxi.main_screen_custom.domain;

import defpackage.b2k;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class e implements tpr {
    public final /* synthetic */ b2k a;
    public final /* synthetic */ f b;

    public e(b2k b2kVar, f fVar) {
        this.a = b2kVar;
        this.b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        PromoUpdateInteractor$updatesPromo$$inlined$map$1$1 promoUpdateInteractor$updatesPromo$$inlined$map$1$1;
        int i;
        if (continuation instanceof PromoUpdateInteractor$updatesPromo$$inlined$map$1$1) {
            promoUpdateInteractor$updatesPromo$$inlined$map$1$1 = (PromoUpdateInteractor$updatesPromo$$inlined$map$1$1) continuation;
            int i2 = promoUpdateInteractor$updatesPromo$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoUpdateInteractor$updatesPromo$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = promoUpdateInteractor$updatesPromo$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoUpdateInteractor$updatesPromo$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar, this.b);
                    promoUpdateInteractor$updatesPromo$$inlined$map$1$1.L$0 = null;
                    promoUpdateInteractor$updatesPromo$$inlined$map$1$1.L$1 = null;
                    promoUpdateInteractor$updatesPromo$$inlined$map$1$1.L$2 = null;
                    promoUpdateInteractor$updatesPromo$$inlined$map$1$1.label = 1;
                    if (this.a.collect(dVar, promoUpdateInteractor$updatesPromo$$inlined$map$1$1) == coroutineSingletons) {
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
        promoUpdateInteractor$updatesPromo$$inlined$map$1$1 = new PromoUpdateInteractor$updatesPromo$$inlined$map$1$1(this, continuation);
        Object obj2 = promoUpdateInteractor$updatesPromo$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoUpdateInteractor$updatesPromo$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
