package ru.yandex.taxi.masstransit.stop.interactor;

import com.yandex.go.zone.model.Zone;
import defpackage.b140;
import defpackage.bvf0;
import defpackage.c440;
import defpackage.dc4;
import defpackage.dz00;
import defpackage.e3n;
import defpackage.f140;
import defpackage.h440;
import defpackage.ha2;
import defpackage.i240;
import defpackage.igu0;
import defpackage.jbh;
import defpackage.jqr;
import defpackage.jt30;
import defpackage.jtq0;
import defpackage.kp50;
import defpackage.mdh;
import defpackage.mth;
import defpackage.ny61;
import defpackage.o430;
import defpackage.pwy0;
import defpackage.qqo;
import defpackage.rqo;
import defpackage.sjh;
import defpackage.tls;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v4r0;
import defpackage.wr30;
import defpackage.yy30;
import defpackage.zy11;
import defpackage.zy6;
import defpackage.zzs;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.experiment.MtMainRedirectExperiment;
import ru.yandex.taxi.masstransit.geopayment.purchase.MtPurchaseMapper;

/* loaded from: classes6.dex */
public final class g {
    public final b140 a;
    public final ru.yandex.taxi.masstransit.datasource.schedule.b b;
    public final yy30 c;
    public final dz00 d;
    public final jtq0 e;
    public final tt2 f;
    public final com.yandex.go.zone.interactors.b g;
    public final i240 h;
    public final c440 i;
    public final h j;
    public final dc4 k;
    public final h440 l;
    public final jt30 m;
    public final MtPurchaseMapper n;
    public final wr30 o;
    public final pwy0 p;
    public final r0 q = bvf0.c(EmptySet.a);
    public final qqo r;

    public g(rqo rqoVar, b140 b140Var, ru.yandex.taxi.masstransit.datasource.schedule.b bVar, yy30 yy30Var, dz00 dz00Var, jtq0 jtq0Var, tt2 tt2Var, com.yandex.go.zone.interactors.b bVar2, i240 i240Var, c440 c440Var, h hVar, dc4 dc4Var, h440 h440Var, jt30 jt30Var, MtPurchaseMapper mtPurchaseMapper, wr30 wr30Var, pwy0 pwy0Var) {
        this.a = b140Var;
        this.b = bVar;
        this.c = yy30Var;
        this.d = dz00Var;
        this.e = jtq0Var;
        this.f = tt2Var;
        this.g = bVar2;
        this.h = i240Var;
        this.i = c440Var;
        this.j = hVar;
        this.k = dc4Var;
        this.l = h440Var;
        this.m = jt30Var;
        this.n = mtPurchaseMapper;
        this.o = wr30Var;
        this.p = pwy0Var;
        MtMainRedirectExperiment.Companion.getClass();
        this.r = ((jbh) rqoVar).c(new MtMainRedirectExperiment(0));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(g gVar, zzs zzsVar, ContinuationImpl continuationImpl) {
        MtStopStateInteractor$zoneByGeo$1 mtStopStateInteractor$zoneByGeo$1;
        int i;
        gVar.getClass();
        try {
            if (continuationImpl instanceof MtStopStateInteractor$zoneByGeo$1) {
                mtStopStateInteractor$zoneByGeo$1 = (MtStopStateInteractor$zoneByGeo$1) continuationImpl;
                int i2 = mtStopStateInteractor$zoneByGeo$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    mtStopStateInteractor$zoneByGeo$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = mtStopStateInteractor$zoneByGeo$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = mtStopStateInteractor$zoneByGeo$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        o430 o430Var = e3n.b;
                        long e = e3n.e(kp50.U(5, DurationUnit.SECONDS));
                        MtStopStateInteractor$zoneByGeo$2$1 mtStopStateInteractor$zoneByGeo$2$1 = new MtStopStateInteractor$zoneByGeo$2$1(gVar, zzsVar, null);
                        mtStopStateInteractor$zoneByGeo$1.L$0 = null;
                        mtStopStateInteractor$zoneByGeo$1.label = 1;
                        obj = kotlinx.coroutines.a.w(e, mtStopStateInteractor$zoneByGeo$2$1, mtStopStateInteractor$zoneByGeo$1);
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
                    return (Zone) obj;
                }
            }
            if (i != 0) {
            }
            return (Zone) obj;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable unused) {
            return null;
        }
        mtStopStateInteractor$zoneByGeo$1 = new MtStopStateInteractor$zoneByGeo$1(gVar, continuationImpl);
        Object obj2 = mtStopStateInteractor$zoneByGeo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtStopStateInteractor$zoneByGeo$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(f140 f140Var, tls tlsVar, ContinuationImpl continuationImpl) {
        MtStopStateInteractor$runWithShimmerButton$1 mtStopStateInteractor$runWithShimmerButton$1;
        int i;
        r0 r0Var;
        Object value;
        Object obj;
        Object obj2;
        Object value2;
        if (continuationImpl instanceof MtStopStateInteractor$runWithShimmerButton$1) {
            mtStopStateInteractor$runWithShimmerButton$1 = (MtStopStateInteractor$runWithShimmerButton$1) continuationImpl;
            int i2 = mtStopStateInteractor$runWithShimmerButton$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtStopStateInteractor$runWithShimmerButton$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = mtStopStateInteractor$runWithShimmerButton$1.result;
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtStopStateInteractor$runWithShimmerButton$1.label;
                r0Var = this.q;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    do {
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, v4r0.i((Set) value, f140Var)));
                    mtStopStateInteractor$runWithShimmerButton$1.L$0 = f140Var;
                    mtStopStateInteractor$runWithShimmerButton$1.L$1 = null;
                    mtStopStateInteractor$runWithShimmerButton$1.label = 1;
                    obj = f140Var;
                    if (tlsVar.invoke(mtStopStateInteractor$runWithShimmerButton$1) == obj4) {
                        return obj4;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj5 = (zy6) mtStopStateInteractor$runWithShimmerButton$1.L$0;
                    kotlin.b.b(obj3);
                    obj = obj5;
                }
                obj2 = obj;
                do {
                    value2 = r0Var.getValue();
                } while (!r0Var.k(value2, v4r0.f((Set) value2, obj2)));
                return zy11.a;
            }
        }
        mtStopStateInteractor$runWithShimmerButton$1 = new MtStopStateInteractor$runWithShimmerButton$1(this, continuationImpl);
        Object obj32 = mtStopStateInteractor$runWithShimmerButton$1.result;
        Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtStopStateInteractor$runWithShimmerButton$1.label;
        r0Var = this.q;
        if (i != 0) {
        }
        obj2 = obj;
        do {
            value2 = r0Var.getValue();
        } while (!r0Var.k(value2, v4r0.f((Set) value2, obj2)));
        return zy11.a;
    }

    public final ha2 c(igu0 igu0Var) {
        c440 c440Var = this.i;
        int i = 3;
        jqr jqrVar = new jqr(new mth(new j0(null, kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.n(new jqr(new jqr(c440Var.b, new MtStopStateInteractor$stateFlow$contentFlow$1(igu0Var, null, this), i), new MtStopStateInteractor$stateFlow$contentFlow$2(null, this), i), kotlinx.coroutines.flow.e.d(this.j.d.a), this.p.a(), new MtStopStateInteractor$stateFlow$contentFlow$3(4, null)), new MtStopStateInteractor$stateFlow$$inlined$flatMapLatest$1(null, this)), new MtStopStateInteractor$stateFlow$$inlined$withPreviousEmit$1(3, null)), 6), new MtStopStateInteractor$stateFlow$contentFlow$5(null, this), i);
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        return kotlinx.coroutines.flow.e.n(new d(kotlinx.coroutines.flow.e.F(jqrVar, mdhVar)), this.k.a(), kotlinx.coroutines.flow.e.F(new m0(c440Var.b, com.yandex.go.coroutines.b.d(this.o.a(), new MtStopStateInteractor$purchaseFlow$$inlined$start$1(ru.yandex.taxi.masstransit.geopayment.tickets.model.a.b, null)), new MtStopStateInteractor$purchaseFlow$1(this, this.m.a(), null)), mdhVar), new MtStopStateInteractor$stateFlow$1(4, null));
    }

    public final Object d(igu0 igu0Var, Continuation continuation) {
        Object n = bvf0.n(new MtStopStateInteractor$updateStopState$2(igu0Var, null, this), continuation);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : zy11.a;
    }
}
