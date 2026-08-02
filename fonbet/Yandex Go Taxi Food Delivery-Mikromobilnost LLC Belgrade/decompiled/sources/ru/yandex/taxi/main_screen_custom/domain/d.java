package ru.yandex.taxi.main_screen_custom.domain;

import defpackage.ny61;
import defpackage.s9f0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ f b;

    public d(vpr vprVar, f fVar) {
        this.a = vprVar;
        this.b = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        if (r7.emit(r9, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PromoUpdateInteractor$updatesPromo$$inlined$map$1$2$1 promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof PromoUpdateInteractor$updatesPromo$$inlined$map$1$2$1) {
            promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1 = (PromoUpdateInteractor$updatesPromo$$inlined$map$1$2$1) continuation;
            int i2 = promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1.L$0 = null;
                    promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1.L$1 = null;
                    promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1.L$2 = null;
                    promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1.L$4 = vprVar2;
                    promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1.L$5 = null;
                    promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1.L$6 = null;
                    promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1.label = 1;
                    Object a = f.a(this.b, (s9f0) obj, promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1);
                    if (a != coroutineSingletons) {
                        obj2 = a;
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                vprVar = (vpr) promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1.L$0 = null;
                promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1.L$1 = null;
                promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1.L$2 = null;
                promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1.L$3 = null;
                promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1.L$4 = null;
                promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1.L$5 = null;
                promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1.L$6 = null;
                promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1.label = 2;
            }
        }
        promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1 = new PromoUpdateInteractor$updatesPromo$$inlined$map$1$2$1(this, continuation);
        Object obj22 = promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1.L$0 = null;
        promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1.L$1 = null;
        promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1.L$2 = null;
        promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1.L$3 = null;
        promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1.L$4 = null;
        promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1.L$5 = null;
        promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1.L$6 = null;
        promoUpdateInteractor$updatesPromo$$inlined$map$1$2$1.label = 2;
    }
}
