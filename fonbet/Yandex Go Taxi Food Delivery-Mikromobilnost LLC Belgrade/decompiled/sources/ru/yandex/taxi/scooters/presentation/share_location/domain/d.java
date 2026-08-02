package ru.yandex.taxi.scooters.presentation.share_location.domain;

import android.location.LocationManager;
import defpackage.f8y;
import defpackage.fvo0;
import defpackage.g6u;
import defpackage.hvo0;
import defpackage.ny61;
import defpackage.o400;
import defpackage.po21;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.k;
import ru.yandex.taxi.location.g;

/* loaded from: classes6.dex */
public final class d {
    public final f8y a;
    public final tt2 b;
    public final LocationManager c;
    public final po21 d;
    public final ru.yandex.taxi.scooters.presentation.share_location.data.b e;
    public final hvo0 f;

    public d(f8y f8yVar, tt2 tt2Var, LocationManager locationManager, po21 po21Var, ru.yandex.taxi.scooters.presentation.share_location.data.b bVar, hvo0 hvo0Var) {
        this.a = f8yVar;
        this.b = tt2Var;
        this.c = locationManager;
        this.d = po21Var;
        this.e = bVar;
        this.f = hvo0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        if (r14 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ScootersShareLocationInteractor$sendLocationPeriodically$1 scootersShareLocationInteractor$sendLocationPeriodically$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        TimeUnit timeUnit;
        long j;
        if (continuationImpl instanceof ScootersShareLocationInteractor$sendLocationPeriodically$1) {
            scootersShareLocationInteractor$sendLocationPeriodically$1 = (ScootersShareLocationInteractor$sendLocationPeriodically$1) continuationImpl;
            int i2 = scootersShareLocationInteractor$sendLocationPeriodically$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersShareLocationInteractor$sendLocationPeriodically$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersShareLocationInteractor$sendLocationPeriodically$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersShareLocationInteractor$sendLocationPeriodically$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    timeUnit = TimeUnit.SECONDS;
                    scootersShareLocationInteractor$sendLocationPeriodically$1.L$0 = timeUnit;
                    scootersShareLocationInteractor$sendLocationPeriodically$1.label = 1;
                    obj = this.f.a.b(scootersShareLocationInteractor$sendLocationPeriodically$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                kotlin.b.b(obj);
                                return obj;
                            }
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        long j2 = scootersShareLocationInteractor$sendLocationPeriodically$1.J$0;
                        kotlin.b.b(obj);
                        j = j2;
                        tpr d = com.yandex.go.coroutines.b.d((tpr) obj, new ScootersShareLocationInteractor$sendLocationPeriodically$$inlined$start$1(null, null));
                        kotlinx.coroutines.flow.b g = e.g(new ScootersShareLocationInteractor$locationUpdatesFromProviders$1(this, "gps", j, null));
                        tt2 tt2Var = this.b;
                        tt2Var.getClass();
                        sjh sjhVar = uyj.a;
                        g6u g6uVar = o400.a;
                        tpr d2 = com.yandex.go.coroutines.b.d(e.F(g, g6uVar), new ScootersShareLocationInteractor$sendLocationPeriodically$$inlined$start$2(null, null));
                        kotlinx.coroutines.flow.b g2 = e.g(new ScootersShareLocationInteractor$locationUpdatesFromProviders$1(this, "network", j, null));
                        tt2Var.getClass();
                        k N = e.N(new b(e.n(d, d2, com.yandex.go.coroutines.b.d(e.F(g2, g6uVar), new ScootersShareLocationInteractor$sendLocationPeriodically$$inlined$start$3(null, null)), new ScootersShareLocationInteractor$sendLocationPeriodically$2(4, null))), j);
                        c cVar = new c(this);
                        scootersShareLocationInteractor$sendLocationPeriodically$1.J$0 = j;
                        scootersShareLocationInteractor$sendLocationPeriodically$1.label = 3;
                        Object collect = N.collect(cVar, scootersShareLocationInteractor$sendLocationPeriodically$1);
                        return collect != coroutineSingletons ? coroutineSingletons : collect;
                    }
                    timeUnit = (TimeUnit) scootersShareLocationInteractor$sendLocationPeriodically$1.L$0;
                    kotlin.b.b(obj);
                }
                long millis = timeUnit.toMillis(((fvo0) obj).d);
                scootersShareLocationInteractor$sendLocationPeriodically$1.L$0 = null;
                scootersShareLocationInteractor$sendLocationPeriodically$1.J$0 = millis;
                scootersShareLocationInteractor$sendLocationPeriodically$1.label = 2;
                g gVar = (g) this.a;
                gVar.getClass();
                obj = g.b(gVar, "ScootersShareLocationInteractor", scootersShareLocationInteractor$sendLocationPeriodically$1);
                if (obj != coroutineSingletons) {
                    j = millis;
                    tpr d3 = com.yandex.go.coroutines.b.d((tpr) obj, new ScootersShareLocationInteractor$sendLocationPeriodically$$inlined$start$1(null, null));
                    kotlinx.coroutines.flow.b g3 = e.g(new ScootersShareLocationInteractor$locationUpdatesFromProviders$1(this, "gps", j, null));
                    tt2 tt2Var2 = this.b;
                    tt2Var2.getClass();
                    sjh sjhVar2 = uyj.a;
                    g6u g6uVar2 = o400.a;
                    tpr d22 = com.yandex.go.coroutines.b.d(e.F(g3, g6uVar2), new ScootersShareLocationInteractor$sendLocationPeriodically$$inlined$start$2(null, null));
                    kotlinx.coroutines.flow.b g22 = e.g(new ScootersShareLocationInteractor$locationUpdatesFromProviders$1(this, "network", j, null));
                    tt2Var2.getClass();
                    k N2 = e.N(new b(e.n(d3, d22, com.yandex.go.coroutines.b.d(e.F(g22, g6uVar2), new ScootersShareLocationInteractor$sendLocationPeriodically$$inlined$start$3(null, null)), new ScootersShareLocationInteractor$sendLocationPeriodically$2(4, null))), j);
                    c cVar2 = new c(this);
                    scootersShareLocationInteractor$sendLocationPeriodically$1.J$0 = j;
                    scootersShareLocationInteractor$sendLocationPeriodically$1.label = 3;
                    Object collect2 = N2.collect(cVar2, scootersShareLocationInteractor$sendLocationPeriodically$1);
                    if (collect2 != coroutineSingletons) {
                    }
                }
            }
        }
        scootersShareLocationInteractor$sendLocationPeriodically$1 = new ScootersShareLocationInteractor$sendLocationPeriodically$1(this, continuationImpl);
        obj = scootersShareLocationInteractor$sendLocationPeriodically$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersShareLocationInteractor$sendLocationPeriodically$1.label;
        if (i != 0) {
        }
        long millis2 = timeUnit.toMillis(((fvo0) obj).d);
        scootersShareLocationInteractor$sendLocationPeriodically$1.L$0 = null;
        scootersShareLocationInteractor$sendLocationPeriodically$1.J$0 = millis2;
        scootersShareLocationInteractor$sendLocationPeriodically$1.label = 2;
        g gVar2 = (g) this.a;
        gVar2.getClass();
        obj = g.b(gVar2, "ScootersShareLocationInteractor", scootersShareLocationInteractor$sendLocationPeriodically$1);
        if (obj != coroutineSingletons) {
        }
    }
}
