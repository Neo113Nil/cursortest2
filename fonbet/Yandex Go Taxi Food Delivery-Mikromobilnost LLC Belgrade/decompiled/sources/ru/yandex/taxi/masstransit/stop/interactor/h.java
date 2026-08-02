package ru.yandex.taxi.masstransit.stop.interactor;

import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.dz00;
import defpackage.e3n;
import defpackage.i440;
import defpackage.j440;
import defpackage.jst;
import defpackage.k110;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.nzs;
import defpackage.o430;
import defpackage.po21;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.map.WalkingRouteUiState;
import ru.yandex.taxi.masstransit.StopModalDto;

/* loaded from: classes6.dex */
public final class h {
    public final ru.yandex.taxi.walkroute.a a;
    public final po21 b;
    public final dz00 c;
    public final j440 d;

    public h(ru.yandex.taxi.walkroute.a aVar, po21 po21Var, dz00 dz00Var, j440 j440Var) {
        this.a = aVar;
        this.b = po21Var;
        this.c = dz00Var;
        this.d = j440Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        if (r5 > defpackage.e3n.o(defpackage.kp50.U(r3.intValue(), kotlin.time.DurationUnit.MINUTES), kotlin.time.DurationUnit.SECONDS)) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Route route, ContinuationImpl continuationImpl) {
        MtStopWalkingRouteInteractor$isValid$1 mtStopWalkingRouteInteractor$isValid$1;
        int i;
        if (continuationImpl instanceof MtStopWalkingRouteInteractor$isValid$1) {
            mtStopWalkingRouteInteractor$isValid$1 = (MtStopWalkingRouteInteractor$isValid$1) continuationImpl;
            int i2 = mtStopWalkingRouteInteractor$isValid$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtStopWalkingRouteInteractor$isValid$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtStopWalkingRouteInteractor$isValid$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtStopWalkingRouteInteractor$isValid$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mtStopWalkingRouteInteractor$isValid$1.L$0 = route;
                    mtStopWalkingRouteInteractor$isValid$1.label = 1;
                    obj = this.c.a.b(mtStopWalkingRouteInteractor$isValid$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    route = (Route) mtStopWalkingRouteInteractor$isValid$1.L$0;
                    kotlin.b.b(obj);
                }
                StopModalDto stopModalDto = ((k110) obj).k;
                Integer num = stopModalDto != null ? stopModalDto.d : null;
                if (!route.getGeometry().getPoints().isEmpty() && num != null) {
                    double a = nzs.a(route);
                    o430 o430Var = e3n.b;
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }
        mtStopWalkingRouteInteractor$isValid$1 = new MtStopWalkingRouteInteractor$isValid$1(this, continuationImpl);
        Object obj2 = mtStopWalkingRouteInteractor$isValid$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtStopWalkingRouteInteractor$isValid$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        StopModalDto stopModalDto2 = ((k110) obj2).k;
        if (stopModalDto2 != null) {
        }
        if (!route.getGeometry().getPoints().isEmpty()) {
            double a2 = nzs.a(route);
            o430 o430Var2 = e3n.b;
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d1, code lost:
    
        if (r15 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d3, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0080, code lost:
    
        if (r15 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0066, code lost:
    
        if (r15 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(zzs zzsVar, ContinuationImpl continuationImpl) {
        MtStopWalkingRouteInteractor$updateWalkingRoute$1 mtStopWalkingRouteInteractor$updateWalkingRoute$1;
        int i;
        mo21 mo21Var;
        Object next;
        Route route;
        if (continuationImpl instanceof MtStopWalkingRouteInteractor$updateWalkingRoute$1) {
            mtStopWalkingRouteInteractor$updateWalkingRoute$1 = (MtStopWalkingRouteInteractor$updateWalkingRoute$1) continuationImpl;
            int i2 = mtStopWalkingRouteInteractor$updateWalkingRoute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtStopWalkingRouteInteractor$updateWalkingRoute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtStopWalkingRouteInteractor$updateWalkingRoute$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtStopWalkingRouteInteractor$updateWalkingRoute$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mtStopWalkingRouteInteractor$updateWalkingRoute$1.L$0 = zzsVar;
                    mtStopWalkingRouteInteractor$updateWalkingRoute$1.label = 1;
                    obj = c(mtStopWalkingRouteInteractor$updateWalkingRoute$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            route = (Route) mtStopWalkingRouteInteractor$updateWalkingRoute$1.L$3;
                            kotlin.b.b(obj);
                            if (((Boolean) obj).booleanValue()) {
                                this.d.a.l(new i440(new WalkingRouteUiState(route.getGeometry().getPoints(), null, 0.0f, null, null, null, null, HProv.PP_DELETE_SAVED_PASSWD), route.getMetadata().getWeight().getTime().getText()));
                            }
                            return zy11Var;
                        }
                        kotlin.b.b(obj);
                        Iterator it = ((List) obj).iterator();
                        if (it.hasNext()) {
                            next = it.next();
                            if (it.hasNext()) {
                                double a = nzs.a((Route) next);
                                do {
                                    Object next2 = it.next();
                                    double a2 = nzs.a((Route) next2);
                                    if (Double.compare(a, a2) > 0) {
                                        next = next2;
                                        a = a2;
                                    }
                                } while (it.hasNext());
                            }
                        } else {
                            next = null;
                        }
                        route = (Route) next;
                        if (route != null) {
                            mtStopWalkingRouteInteractor$updateWalkingRoute$1.L$0 = null;
                            mtStopWalkingRouteInteractor$updateWalkingRoute$1.L$1 = null;
                            mtStopWalkingRouteInteractor$updateWalkingRoute$1.L$2 = null;
                            mtStopWalkingRouteInteractor$updateWalkingRoute$1.L$3 = route;
                            mtStopWalkingRouteInteractor$updateWalkingRoute$1.label = 3;
                            obj = a(route, mtStopWalkingRouteInteractor$updateWalkingRoute$1);
                        }
                        return zy11Var;
                    }
                    zzsVar = (zzs) mtStopWalkingRouteInteractor$updateWalkingRoute$1.L$0;
                    kotlin.b.b(obj);
                }
                mo21Var = (mo21) obj;
                if (mo21Var != null) {
                    zzs a3 = mo21Var.a();
                    mtStopWalkingRouteInteractor$updateWalkingRoute$1.L$0 = null;
                    mtStopWalkingRouteInteractor$updateWalkingRoute$1.L$1 = null;
                    mtStopWalkingRouteInteractor$updateWalkingRoute$1.label = 2;
                    obj = this.a.b(a3, zzsVar, mtStopWalkingRouteInteractor$updateWalkingRoute$1);
                }
                return zy11Var;
            }
        }
        mtStopWalkingRouteInteractor$updateWalkingRoute$1 = new MtStopWalkingRouteInteractor$updateWalkingRoute$1(this, continuationImpl);
        Object obj3 = mtStopWalkingRouteInteractor$updateWalkingRoute$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtStopWalkingRouteInteractor$updateWalkingRoute$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        mo21Var = (mo21) obj3;
        if (mo21Var != null) {
        }
        return zy11Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        MtStopWalkingRouteInteractor$userLocation$1 mtStopWalkingRouteInteractor$userLocation$1;
        int i;
        try {
            if (continuationImpl instanceof MtStopWalkingRouteInteractor$userLocation$1) {
                mtStopWalkingRouteInteractor$userLocation$1 = (MtStopWalkingRouteInteractor$userLocation$1) continuationImpl;
                int i2 = mtStopWalkingRouteInteractor$userLocation$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    mtStopWalkingRouteInteractor$userLocation$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = mtStopWalkingRouteInteractor$userLocation$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = mtStopWalkingRouteInteractor$userLocation$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        po21 po21Var = this.b;
                        mtStopWalkingRouteInteractor$userLocation$1.label = 1;
                        obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).f(mtStopWalkingRouteInteractor$userLocation$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return (mo21) obj;
                }
            }
            if (i != 0) {
            }
            return (mo21) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "Error during an attempt to get location");
            return null;
        }
        mtStopWalkingRouteInteractor$userLocation$1 = new MtStopWalkingRouteInteractor$userLocation$1(this, continuationImpl);
        Object obj2 = mtStopWalkingRouteInteractor$userLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtStopWalkingRouteInteractor$userLocation$1.label;
    }
}
