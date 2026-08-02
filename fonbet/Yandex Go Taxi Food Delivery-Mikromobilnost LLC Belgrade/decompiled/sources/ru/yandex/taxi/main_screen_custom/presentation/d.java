package ru.yandex.taxi.main_screen_custom.presentation;

import com.yandex.go.navigation.screen.api.Screen;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wbp0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;

    public d(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PromoOverMapViewPresenter$listenToNewPromo$$inlined$filter$1$2$1 promoOverMapViewPresenter$listenToNewPromo$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof PromoOverMapViewPresenter$listenToNewPromo$$inlined$filter$1$2$1) {
            promoOverMapViewPresenter$listenToNewPromo$$inlined$filter$1$2$1 = (PromoOverMapViewPresenter$listenToNewPromo$$inlined$filter$1$2$1) continuation;
            int i2 = promoOverMapViewPresenter$listenToNewPromo$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoOverMapViewPresenter$listenToNewPromo$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = promoOverMapViewPresenter$listenToNewPromo$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoOverMapViewPresenter$listenToNewPromo$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Screen screen = (Screen) obj;
                    screen.getClass();
                    switch (wbp0.a[screen.ordinal()]) {
                        case 1:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                            promoOverMapViewPresenter$listenToNewPromo$$inlined$filter$1$2$1.L$0 = null;
                            promoOverMapViewPresenter$listenToNewPromo$$inlined$filter$1$2$1.L$1 = null;
                            promoOverMapViewPresenter$listenToNewPromo$$inlined$filter$1$2$1.L$2 = null;
                            promoOverMapViewPresenter$listenToNewPromo$$inlined$filter$1$2$1.L$3 = null;
                            promoOverMapViewPresenter$listenToNewPromo$$inlined$filter$1$2$1.label = 1;
                            if (this.a.emit(obj, promoOverMapViewPresenter$listenToNewPromo$$inlined$filter$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            break;
                        case 2:
                        case 3:
                            break;
                        default:
                            w511.b();
                            return null;
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
        promoOverMapViewPresenter$listenToNewPromo$$inlined$filter$1$2$1 = new PromoOverMapViewPresenter$listenToNewPromo$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = promoOverMapViewPresenter$listenToNewPromo$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoOverMapViewPresenter$listenToNewPromo$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
