package ru.yandex.taxi.main_screen_custom.presentation;

import com.yandex.go.shortcuts.dto.response.LocalAnimation;
import com.yandex.go.shortcuts.dto.response.LottieAnimation;
import com.yandex.go.shortcuts.dto.response.ObjectOverMap;
import com.yandex.go.shortcuts.dto.response.PositionOverMap;
import com.yandex.go.shortcuts.dto.response.RemoteAnimation;
import com.yandex.go.shortcuts.dto.response.StaticImage;
import com.yandex.go.shortcuts.dto.response.b3;
import com.yandex.go.shortcuts.dto.response.d3;
import defpackage.ar30;
import defpackage.h040;
import defpackage.jl40;
import defpackage.kq30;
import defpackage.mnf0;
import defpackage.ny61;
import defpackage.qu30;
import defpackage.tc30;
import defpackage.tn30;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wc30;
import defpackage.wn30;
import defpackage.zq30;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.masstransit.model.MtAnimationSourceType;
import ru.yandex.taxi.masstransit.model.MtPositionOverMap;

/* loaded from: classes5.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ar30 b;

    public f(vpr vprVar, ar30 ar30Var) {
        this.a = vprVar;
        this.b = ar30Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0186, code lost:
    
        if (r0.emit(r1, r2) != r3) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PromoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1 promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1;
        int i;
        Object obj2;
        vpr vprVar;
        com.yandex.go.shortcuts.dto.response.d dVar;
        PositionOverMap positionOverMap;
        PositionOverMap positionOverMap2;
        if (continuation instanceof PromoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1) {
            promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1 = (PromoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1) continuation;
            int i2 = promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1.L$0 = null;
                    promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1.L$1 = null;
                    promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1.L$2 = null;
                    promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1.L$4 = vprVar2;
                    promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1.L$5 = null;
                    promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1.L$6 = null;
                    promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1.label = 1;
                    ar30 ar30Var = this.b;
                    ar30Var.getClass();
                    Iterator it = ((List) obj).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        kq30 kq30Var = (kq30) obj2;
                        String str = kq30Var.a;
                        kq30.a aVar = kq30Var.b;
                        MtPositionOverMap mtPositionOverMap = kq30Var.f;
                        wc30 wc30Var = kq30Var.c;
                        if (!jl40.l(str, "") && wc30Var != null && mtPositionOverMap != null && aVar != null) {
                            if ((wc30Var != null ? wc30Var.a() : null) != MtAnimationSourceType.LOTTIE_ANIMATION || ((wn30) wc30Var).d != null) {
                                if (aVar != null && ar30Var.b.a(aVar.a) < aVar.b && mtPositionOverMap != MtPositionOverMap.CENTER_START) {
                                    break;
                                }
                            }
                        }
                    }
                    kq30 kq30Var2 = (kq30) obj2;
                    if (kq30Var2 != null) {
                        String str2 = kq30Var2.a;
                        wc30 wc30Var2 = kq30Var2.c;
                        if (wc30Var2 instanceof wn30) {
                            wn30 wn30Var = (wn30) wc30Var2;
                            int i3 = wn30Var.a;
                            int i4 = wn30Var.b;
                            double d = wn30Var.c;
                            tc30 tc30Var = wn30Var.d;
                            dVar = new LottieAnimation(i3, i4, d, tc30Var instanceof qu30 ? new RemoteAnimation(((qu30) tc30Var).a) : tc30Var instanceof tn30 ? new LocalAnimation(((tn30) tc30Var).a) : b3.INSTANCE);
                        } else if (wc30Var2 instanceof h040) {
                            h040 h040Var = (h040) wc30Var2;
                            dVar = new StaticImage(h040Var.a, h040Var.b);
                        } else {
                            dVar = d3.INSTANCE;
                        }
                        com.yandex.go.shortcuts.dto.response.d dVar2 = dVar;
                        MtPositionOverMap mtPositionOverMap2 = kq30Var2.f;
                        int i5 = mtPositionOverMap2 == null ? -1 : zq30.a[mtPositionOverMap2.ordinal()];
                        if (i5 != -1) {
                            if (i5 == 1) {
                                positionOverMap2 = PositionOverMap.CENTER_START;
                            } else {
                                if (i5 != 2) {
                                    w511.b();
                                    return null;
                                }
                                positionOverMap2 = PositionOverMap.CENTER_END;
                            }
                            positionOverMap = positionOverMap2;
                        } else {
                            positionOverMap = null;
                        }
                        kq30.a aVar2 = kq30Var2.b;
                        Object a = ar30Var.a.a(new ObjectOverMap(str2, aVar2 != null ? new ObjectOverMap.ShowPolicy(aVar2.a, aVar2.b) : null, dVar2, kq30Var2.d, kq30Var2.e, positionOverMap, kq30Var2.g, kq30Var2.h), "", promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1);
                        if (a != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            a = (mnf0) a;
                        }
                        obj3 = a;
                    } else {
                        obj3 = null;
                    }
                    if (obj3 != coroutineSingletons) {
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                    return zy11.a;
                }
                vprVar = (vpr) promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj3);
                promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1.L$0 = null;
                promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1.L$1 = null;
                promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1.L$2 = null;
                promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1.L$3 = null;
                promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1.L$4 = null;
                promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1.L$5 = null;
                promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1.L$6 = null;
                promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1.label = 2;
            }
        }
        promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1 = new PromoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1(this, continuation);
        Object obj32 = promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1.L$0 = null;
        promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1.L$1 = null;
        promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1.L$2 = null;
        promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1.L$3 = null;
        promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1.L$4 = null;
        promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1.L$5 = null;
        promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1.L$6 = null;
        promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$1$2$1.label = 2;
    }
}
