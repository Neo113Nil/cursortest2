package ru.yandex.taxi.main_screen_custom.presentation;

import android.graphics.Rect;
import defpackage.nof0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class t implements vpr {
    public final /* synthetic */ vpr a;

    public t(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PromoOverMapViewPresenter$listenToPinRectChanges$lambda$0$$inlined$map$2$2$1 promoOverMapViewPresenter$listenToPinRectChanges$lambda$0$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof PromoOverMapViewPresenter$listenToPinRectChanges$lambda$0$$inlined$map$2$2$1) {
            promoOverMapViewPresenter$listenToPinRectChanges$lambda$0$$inlined$map$2$2$1 = (PromoOverMapViewPresenter$listenToPinRectChanges$lambda$0$$inlined$map$2$2$1) continuation;
            int i2 = promoOverMapViewPresenter$listenToPinRectChanges$lambda$0$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoOverMapViewPresenter$listenToPinRectChanges$lambda$0$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = promoOverMapViewPresenter$listenToPinRectChanges$lambda$0$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoOverMapViewPresenter$listenToPinRectChanges$lambda$0$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Pair pair = (Pair) obj;
                    nof0 nof0Var = new nof0((Rect) pair.getFirst(), ((Boolean) pair.getSecond()).booleanValue());
                    promoOverMapViewPresenter$listenToPinRectChanges$lambda$0$$inlined$map$2$2$1.L$0 = null;
                    promoOverMapViewPresenter$listenToPinRectChanges$lambda$0$$inlined$map$2$2$1.L$1 = null;
                    promoOverMapViewPresenter$listenToPinRectChanges$lambda$0$$inlined$map$2$2$1.L$2 = null;
                    promoOverMapViewPresenter$listenToPinRectChanges$lambda$0$$inlined$map$2$2$1.L$3 = null;
                    promoOverMapViewPresenter$listenToPinRectChanges$lambda$0$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(nof0Var, promoOverMapViewPresenter$listenToPinRectChanges$lambda$0$$inlined$map$2$2$1) == coroutineSingletons) {
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
        promoOverMapViewPresenter$listenToPinRectChanges$lambda$0$$inlined$map$2$2$1 = new PromoOverMapViewPresenter$listenToPinRectChanges$lambda$0$$inlined$map$2$2$1(this, continuation);
        Object obj22 = promoOverMapViewPresenter$listenToPinRectChanges$lambda$0$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoOverMapViewPresenter$listenToPinRectChanges$lambda$0$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
