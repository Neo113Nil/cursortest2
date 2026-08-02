package ru.yandex.taxi.masstransit.domain;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import defpackage.b64;
import defpackage.cl7;
import defpackage.cv00;
import defpackage.dvw;
import defpackage.fr30;
import defpackage.ii30;
import defpackage.j18;
import defpackage.jst;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.pwy0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.tu30;
import defpackage.uyj;
import defpackage.vj;
import defpackage.wj;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes6.dex */
public final class v {
    public static final /* synthetic */ int i = 0;
    public final ru.yandex.taxi.masstransit.datasource.routing.f a;
    public final tt2 b;
    public final tu30 c;
    public final ru.yandex.taxi.masstransit.mapper.e d;
    public final cv00 e;
    public final f f;
    public final pwy0 g;
    public final ru.yandex.taxi.masstransit.experiment.d0 h;

    static {
        int i2 = ru.yandex.taxi.masstransit.experiment.d0.d;
    }

    public v(ru.yandex.taxi.masstransit.datasource.routing.f fVar, tt2 tt2Var, tu30 tu30Var, ru.yandex.taxi.masstransit.mapper.e eVar, cv00 cv00Var, f fVar2, pwy0 pwy0Var, ru.yandex.taxi.masstransit.experiment.d0 d0Var) {
        this.a = fVar;
        this.b = tt2Var;
        this.c = tu30Var;
        this.d = eVar;
        this.e = cv00Var;
        this.f = fVar2;
        this.g = pwy0Var;
        this.h = d0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(v vVar, ArrayList arrayList, ContinuationImpl continuationImpl) {
        MtOverlayStateInteractor$requestDrivingRoute$1 mtOverlayStateInteractor$requestDrivingRoute$1;
        int i2;
        vVar.getClass();
        try {
            if (continuationImpl instanceof MtOverlayStateInteractor$requestDrivingRoute$1) {
                mtOverlayStateInteractor$requestDrivingRoute$1 = (MtOverlayStateInteractor$requestDrivingRoute$1) continuationImpl;
                int i3 = mtOverlayStateInteractor$requestDrivingRoute$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    mtOverlayStateInteractor$requestDrivingRoute$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = mtOverlayStateInteractor$requestDrivingRoute$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = mtOverlayStateInteractor$requestDrivingRoute$1.label;
                    if (i2 != 0) {
                        kotlin.b.b(obj);
                        ((ru.yandex.taxi.map_common.map.o) vVar.e).d();
                        mtOverlayStateInteractor$requestDrivingRoute$1.L$0 = null;
                        mtOverlayStateInteractor$requestDrivingRoute$1.label = 1;
                        obj = vVar.b(arrayList, mtOverlayStateInteractor$requestDrivingRoute$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i2 != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return (DrivingRoute) obj;
                }
            }
            if (i2 != 0) {
            }
            return (DrivingRoute) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "Error while request a driving route");
            return null;
        }
        mtOverlayStateInteractor$requestDrivingRoute$1 = new MtOverlayStateInteractor$requestDrivingRoute$1(vVar, continuationImpl);
        Object obj3 = mtOverlayStateInteractor$requestDrivingRoute$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = mtOverlayStateInteractor$requestDrivingRoute$1.label;
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [T, ii30] */
    public final Object b(List list, Continuation continuation) {
        j18 j18Var = new j18(1, dvw.b(continuation));
        Ref$ObjectRef y = b64.y(j18Var);
        vj vjVar = new vj(22, y);
        cl7 cl7Var = new cl7(j18Var, vjVar);
        ((ru.yandex.taxi.map_common.map.o) this.e).g(list, null, new fr30(new MtOverlayStateInteractor$requestRoute$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0), new MtOverlayStateInteractor$requestRoute$$inlined$suspendCallbackApi$3(1, cl7Var, cl7.class, "error", "error(Ljava/lang/Throwable;)V", 0), 0), null);
        y.element = new ii30(2, this);
        if (cl7Var.c()) {
            vjVar.invoke();
        } else {
            j18Var.w(new wj(cl7Var, 22));
        }
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }

    public final tpr c() {
        kotlinx.coroutines.flow.internal.g I = kotlinx.coroutines.flow.e.I(kotlinx.coroutines.flow.e.t(this.h.b()), new MtOverlayStateInteractor$userGeoStateFlow$1(2, null));
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(I, mdh.b);
    }
}
