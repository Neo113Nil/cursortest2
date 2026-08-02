package ru.yandex.taxi.main_screen_custom.presentation;

import com.yandex.go.shortcuts.dto.response.ObjectOverMap;
import defpackage.mnf0;
import defpackage.ny61;
import defpackage.qdi;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class n implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ qdi b;

    public n(vpr vprVar, qdi qdiVar) {
        this.a = vprVar;
        this.b = qdiVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c3, code lost:
    
        if (r9.emit(r11, r0) != r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PromoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1 promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1;
        int i;
        Object obj2;
        Object obj3;
        vpr vprVar;
        if (continuation instanceof PromoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1) {
            promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1 = (PromoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1) continuation;
            int i2 = promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj4 = promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj4);
                    promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1.L$0 = null;
                    promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1.L$1 = null;
                    promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1.L$2 = null;
                    promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1.L$4 = vprVar2;
                    promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1.L$5 = null;
                    promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1.L$6 = null;
                    promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1.label = 1;
                    qdi qdiVar = this.b;
                    qdiVar.getClass();
                    Iterator it = ((List) obj).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        ObjectOverMap.ShowPolicy showPolicy = ((ObjectOverMap) obj2).b;
                        if (showPolicy != null && qdiVar.b.a(showPolicy.a) < showPolicy.b) {
                            break;
                        }
                    }
                    ObjectOverMap objectOverMap = (ObjectOverMap) obj2;
                    if (objectOverMap != null) {
                        obj3 = qdiVar.a.a(objectOverMap, "", promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1);
                        if (obj3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            obj3 = (mnf0) obj3;
                        }
                    } else {
                        obj3 = null;
                    }
                    if (obj3 != coroutineSingletons) {
                        obj4 = obj3;
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj4);
                    return zy11.a;
                }
                vprVar = (vpr) promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1.L$4;
                kotlin.b.b(obj4);
                promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1.L$0 = null;
                promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1.L$1 = null;
                promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1.L$2 = null;
                promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1.L$3 = null;
                promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1.L$4 = null;
                promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1.L$5 = null;
                promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1.L$6 = null;
                promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1.label = 2;
            }
        }
        promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1 = new PromoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1(this, continuation);
        Object obj42 = promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1.label;
        if (i != 0) {
        }
        promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1.L$0 = null;
        promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1.L$1 = null;
        promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1.L$2 = null;
        promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1.L$3 = null;
        promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1.L$4 = null;
        promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1.L$5 = null;
        promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1.L$6 = null;
        promoOverMapViewPresenter$listenToNewPromo$lambda$1$$inlined$map$5$2$1.label = 2;
    }
}
