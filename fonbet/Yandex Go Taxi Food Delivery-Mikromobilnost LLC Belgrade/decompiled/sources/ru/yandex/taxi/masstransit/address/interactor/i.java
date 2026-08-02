package ru.yandex.taxi.masstransit.address.interactor;

import com.yandex.go.address.models.Address;
import com.yandex.go.zone.model.Zone;
import com.yandex.go.zone.repository.o;
import defpackage.atd0;
import defpackage.b0x0;
import defpackage.gtq0;
import defpackage.hrv;
import defpackage.irv;
import defpackage.jl40;
import defpackage.jst;
import defpackage.mth;
import defpackage.ny61;
import defpackage.pjv0;
import defpackage.po21;
import defpackage.pv0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.tu30;
import defpackage.xby;
import defpackage.z81;
import defpackage.zy11;
import defpackage.zzs;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.api.finalsuggest.Action;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes6.dex */
public final class i {
    public final com.yandex.go.route.interactor.b a;
    public final tu30 b;
    public final tt2 c;
    public final atd0 d;
    public final b0x0 e;
    public final po21 f;
    public final o g;
    public final kotlinx.coroutines.sync.a h = gtq0.a();

    public i(com.yandex.go.route.interactor.b bVar, tu30 tu30Var, tt2 tt2Var, atd0 atd0Var, b0x0 b0x0Var, po21 po21Var, o oVar) {
        this.a = bVar;
        this.b = tu30Var;
        this.c = tt2Var;
        this.d = atd0Var;
        this.e = b0x0Var;
        this.f = po21Var;
        this.g = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(i iVar, Address address, Address address2) {
        boolean z;
        iVar.getClass();
        if (address.getOriginPoint() != null) {
            if (jl40.l(address.getOriginPoint(), address2 != null ? address2.getOriginPoint() : null)) {
                z = true;
                return !z || jl40.l(address.B(), address2 != null ? address2.B() : null);
            }
        }
        z = false;
        if (z) {
        }
    }

    public static final Serializable b(i iVar, Address address, RoutePointType routePointType, boolean z, SuspendLambda suspendLambda) {
        zzs B;
        iVar.getClass();
        if (z) {
            B = address.B();
        } else {
            zzs originPoint = address.getOriginPoint();
            B = originPoint == null ? address.B() : originPoint;
        }
        return iVar.c(B, routePointType, suspendLambda);
    }

    public static boolean d(Zone zone, List list, Zone zone2, List list2) {
        hrv hrvVar;
        int i;
        if (!jl40.l(zone, zone2) || list.size() != list2.size()) {
            return false;
        }
        Iterable O0 = kotlin.collections.a.O0(list2);
        if ((O0 instanceof Collection) && ((Collection) O0).isEmpty()) {
            return true;
        }
        Iterator it = O0.iterator();
        do {
            irv irvVar = (irv) it;
            if (!irvVar.c.hasNext()) {
                return true;
            }
            hrvVar = (hrv) irvVar.next();
            i = hrvVar.a;
        } while (z81.b((Address) kotlin.collections.a.S(i, list), (Address) hrvVar.b));
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060 A[Catch: all -> 0x0032, CancellationException -> 0x0071, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0071, all -> 0x0032, blocks: (B:11:0x002e, B:12:0x005c, B:14:0x0060, B:22:0x003f), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(zzs zzsVar, RoutePointType routePointType, ContinuationImpl continuationImpl) {
        SyncRouteInteractor$requestAddress$1 syncRouteInteractor$requestAddress$1;
        int i;
        try {
            if (continuationImpl instanceof SyncRouteInteractor$requestAddress$1) {
                syncRouteInteractor$requestAddress$1 = (SyncRouteInteractor$requestAddress$1) continuationImpl;
                int i2 = syncRouteInteractor$requestAddress$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    syncRouteInteractor$requestAddress$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = syncRouteInteractor$requestAddress$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = syncRouteInteractor$requestAddress$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        tpr c = atd0.c(this.d, zzsVar, routePointType, null, Action.PIN_DROP, null, null, 48);
                        syncRouteInteractor$requestAddress$1.L$0 = null;
                        syncRouteInteractor$requestAddress$1.L$1 = null;
                        syncRouteInteractor$requestAddress$1.label = 1;
                        obj = kotlinx.coroutines.flow.e.A(c, syncRouteInteractor$requestAddress$1);
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
                    pv0 pv0Var = (pv0) obj;
                    return pv0Var != null ? pv0Var.a : null;
                }
            }
            if (i != 0) {
            }
            pv0 pv0Var2 = (pv0) obj;
            return pv0Var2 != null ? pv0Var2.a : null;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            xby.l(jst.e, "TransportAddress", null, th, "Error when try to finalize address", 2);
            return null;
        }
        syncRouteInteractor$requestAddress$1 = new SyncRouteInteractor$requestAddress$1(this, continuationImpl);
        Object obj2 = syncRouteInteractor$requestAddress$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = syncRouteInteractor$requestAddress$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        SyncRouteInteractor$syncTaxiAddresses$1 syncRouteInteractor$syncTaxiAddresses$1;
        int i;
        if (continuationImpl instanceof SyncRouteInteractor$syncTaxiAddresses$1) {
            syncRouteInteractor$syncTaxiAddresses$1 = (SyncRouteInteractor$syncTaxiAddresses$1) continuationImpl;
            int i2 = syncRouteInteractor$syncTaxiAddresses$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                syncRouteInteractor$syncTaxiAddresses$1.label = i2 - Integer.MIN_VALUE;
                Object obj = syncRouteInteractor$syncTaxiAddresses$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = syncRouteInteractor$syncTaxiAddresses$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kotlinx.coroutines.flow.internal.g I = kotlinx.coroutines.flow.e.I(com.yandex.go.coroutines.b.d(new f(new mth(kotlinx.coroutines.flow.e.s(kotlinx.coroutines.flow.e.d(this.b.b), new pjv0(this, 4)), 4)), new SyncRouteInteractor$syncTaxiAddresses$$inlined$start$1(Boolean.TRUE, null)), new SyncRouteInteractor$syncTaxiAddresses$4(this, null));
                    syncRouteInteractor$syncTaxiAddresses$1.label = 1;
                    if (kotlinx.coroutines.flow.e.A(I, syncRouteInteractor$syncTaxiAddresses$1) == coroutineSingletons) {
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
        syncRouteInteractor$syncTaxiAddresses$1 = new SyncRouteInteractor$syncTaxiAddresses$1(this, continuationImpl);
        Object obj2 = syncRouteInteractor$syncTaxiAddresses$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = syncRouteInteractor$syncTaxiAddresses$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        SyncRouteInteractor$syncTransportAddresses$1 syncRouteInteractor$syncTransportAddresses$1;
        int i;
        if (continuationImpl instanceof SyncRouteInteractor$syncTransportAddresses$1) {
            syncRouteInteractor$syncTransportAddresses$1 = (SyncRouteInteractor$syncTransportAddresses$1) continuationImpl;
            int i2 = syncRouteInteractor$syncTransportAddresses$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                syncRouteInteractor$syncTransportAddresses$1.label = i2 - Integer.MIN_VALUE;
                Object obj = syncRouteInteractor$syncTransportAddresses$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = syncRouteInteractor$syncTransportAddresses$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kotlinx.coroutines.flow.internal.g I = kotlinx.coroutines.flow.e.I(com.yandex.go.coroutines.b.d(new h(new mth(kotlinx.coroutines.flow.e.s(this.a.k(), new pjv0(this, 5)), 4)), new SyncRouteInteractor$syncTransportAddresses$$inlined$start$1(Boolean.TRUE, null)), new SyncRouteInteractor$syncTransportAddresses$4(this, null));
                    syncRouteInteractor$syncTransportAddresses$1.label = 1;
                    if (kotlinx.coroutines.flow.e.A(I, syncRouteInteractor$syncTransportAddresses$1) == coroutineSingletons) {
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
        syncRouteInteractor$syncTransportAddresses$1 = new SyncRouteInteractor$syncTransportAddresses$1(this, continuationImpl);
        Object obj2 = syncRouteInteractor$syncTransportAddresses$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = syncRouteInteractor$syncTransportAddresses$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
