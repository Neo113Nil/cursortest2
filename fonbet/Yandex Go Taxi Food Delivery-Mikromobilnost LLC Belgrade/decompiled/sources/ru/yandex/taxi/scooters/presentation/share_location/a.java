package ru.yandex.taxi.scooters.presentation.share_location;

import defpackage.cjm0;
import defpackage.ehn0;
import defpackage.g6u;
import defpackage.hbp0;
import defpackage.ky2;
import defpackage.ny61;
import defpackage.o2o0;
import defpackage.o400;
import defpackage.pzt0;
import defpackage.qgn0;
import defpackage.sjh;
import defpackage.svo0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.data.g;
import ru.yandex.taxi.scooters.presentation.share_location.domain.d;

/* loaded from: classes6.dex */
public final class a {
    public final tt2 a;
    public final ky2 b;
    public final o2o0 c;
    public final d d;
    public final cjm0 e;
    public final g f;
    public final svo0 g;
    public final hbp0 h = new hbp0(new ehn0(23, this), null, 0 == true ? 1 : 0, 6);
    public pzt0 i;
    public qgn0 j;

    /* JADX WARN: Multi-variable type inference failed */
    public a(tt2 tt2Var, ky2 ky2Var, o2o0 o2o0Var, d dVar, cjm0 cjm0Var, g gVar, svo0 svo0Var) {
        this.a = tt2Var;
        this.b = ky2Var;
        this.c = o2o0Var;
        this.d = dVar;
        this.e = cjm0Var;
        this.f = gVar;
        this.g = svo0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ContinuationImpl continuationImpl) {
        ScootersShareLocationPresenter$stopSelf$1 scootersShareLocationPresenter$stopSelf$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof ScootersShareLocationPresenter$stopSelf$1) {
            scootersShareLocationPresenter$stopSelf$1 = (ScootersShareLocationPresenter$stopSelf$1) continuationImpl;
            int i2 = scootersShareLocationPresenter$stopSelf$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersShareLocationPresenter$stopSelf$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersShareLocationPresenter$stopSelf$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersShareLocationPresenter$stopSelf$1.label;
                if (i != 0) {
                    b.b(obj);
                    aVar.a.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    ScootersShareLocationPresenter$stopSelf$2 scootersShareLocationPresenter$stopSelf$2 = new ScootersShareLocationPresenter$stopSelf$2(aVar, null);
                    scootersShareLocationPresenter$stopSelf$1.label = 1;
                    if (tje.k0(g6uVar, scootersShareLocationPresenter$stopSelf$2, scootersShareLocationPresenter$stopSelf$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return zy11.a;
            }
        }
        scootersShareLocationPresenter$stopSelf$1 = new ScootersShareLocationPresenter$stopSelf$1(aVar, continuationImpl);
        Object obj2 = scootersShareLocationPresenter$stopSelf$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersShareLocationPresenter$stopSelf$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
