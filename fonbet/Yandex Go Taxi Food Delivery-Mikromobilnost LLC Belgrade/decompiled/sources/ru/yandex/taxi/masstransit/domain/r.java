package ru.yandex.taxi.masstransit.domain;

import android.graphics.drawable.Drawable;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.Point;
import defpackage.by30;
import defpackage.ds30;
import defpackage.dy30;
import defpackage.fc30;
import defpackage.g6u;
import defpackage.ny61;
import defpackage.o400;
import defpackage.obm;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uu30;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class r implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ v b;
    public final /* synthetic */ fc30 c;

    public r(vpr vprVar, v vVar, fc30 fc30Var) {
        this.a = vprVar;
        this.b = vVar;
        this.c = fc30Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0147, code lost:
    
        if (r12.emit(r14, r6) == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00db, code lost:
    
        if (r14 != r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$1 mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$1;
        int i;
        vpr vprVar;
        ds30 ds30Var;
        Address address;
        zzs B;
        vpr vprVar2;
        vpr vprVar3;
        dy30 dy30Var;
        if (continuation instanceof MtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$1) {
            mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$1 = (MtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                MtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$1 mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12 = mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$1;
                Object obj2 = mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.label;
                v vVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    uu30 uu30Var = (uu30) obj;
                    int size = uu30Var.b().size();
                    vprVar = this.a;
                    if (size > 1) {
                        vVar.b.getClass();
                        sjh sjhVar = uyj.a;
                        g6u g6uVar = o400.a;
                        MtOverlayStateInteractor$drivingRoute$1$drivingRoute$1 mtOverlayStateInteractor$drivingRoute$1$drivingRoute$1 = new MtOverlayStateInteractor$drivingRoute$1$drivingRoute$1(vVar, uu30Var, null);
                        mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$0 = null;
                        mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$1 = null;
                        mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$2 = null;
                        mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$3 = vprVar;
                        mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$4 = null;
                        mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$5 = null;
                        mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.label = 1;
                        obj2 = tje.k0(g6uVar, mtOverlayStateInteractor$drivingRoute$1$drivingRoute$1, mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12);
                        if (obj2 != coroutineSingletons) {
                            vprVar3 = vprVar;
                            ru.yandex.taxi.masstransit.mapper.e eVar = vVar.d;
                            mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$0 = null;
                            mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$1 = null;
                            mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$2 = null;
                            mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$3 = vprVar3;
                            mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$4 = null;
                            mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$5 = null;
                            mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$6 = null;
                            mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.label = 2;
                            obj2 = eVar.g((DrivingRoute) obj2, mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12);
                        }
                    } else {
                        ZoneAddress zoneAddress = uu30Var.a;
                        if (zoneAddress == null || (address = zoneAddress.a) == null || (B = address.B()) == null) {
                            ds30Var = null;
                            dy30Var = new by30(ds30Var, 6);
                            vprVar3 = vprVar;
                        } else {
                            Point point = new Point(B.a, B.b);
                            ru.yandex.taxi.masstransit.mapper.e eVar2 = vVar.d;
                            obm obmVar = this.c.a;
                            Drawable drawable = obmVar != null ? obmVar.b : null;
                            mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$0 = null;
                            mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$1 = null;
                            mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$2 = null;
                            mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$3 = vprVar;
                            mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$4 = null;
                            mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$5 = null;
                            mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$6 = null;
                            mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.label = 3;
                            obj2 = eVar2.b.f(point, 20.0f, drawable, null, mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12);
                            if (obj2 != coroutineSingletons) {
                                vprVar2 = vprVar;
                                ds30Var = (ds30) obj2;
                                vprVar = vprVar2;
                                dy30Var = new by30(ds30Var, 6);
                                vprVar3 = vprVar;
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    vprVar3 = (vpr) mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$3;
                    kotlin.b.b(obj2);
                    ru.yandex.taxi.masstransit.mapper.e eVar3 = vVar.d;
                    mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$0 = null;
                    mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$1 = null;
                    mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$2 = null;
                    mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$3 = vprVar3;
                    mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$4 = null;
                    mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$5 = null;
                    mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$6 = null;
                    mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.label = 2;
                    obj2 = eVar3.g((DrivingRoute) obj2, mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12);
                } else if (i == 2) {
                    vprVar3 = (vpr) mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$3;
                    kotlin.b.b(obj2);
                    dy30Var = (dy30) obj2;
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar2 = (vpr) mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$3;
                    kotlin.b.b(obj2);
                    ds30Var = (ds30) obj2;
                    vprVar = vprVar2;
                    dy30Var = new by30(ds30Var, 6);
                    vprVar3 = vprVar;
                }
                if (dy30Var != null) {
                    mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$0 = null;
                    mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$1 = null;
                    mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$2 = null;
                    mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$3 = null;
                    mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$4 = null;
                    mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$5 = null;
                    mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.L$6 = null;
                    mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$12.label = 4;
                }
                return zy11.a;
            }
        }
        mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$1 = new MtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$1(this, continuation);
        MtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$1 mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$122 = mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$1;
        Object obj22 = mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtOverlayStateInteractor$drivingRoute$$inlined$mapNotNull$1$2$122.label;
        v vVar2 = this.b;
        if (i != 0) {
        }
        if (dy30Var != null) {
        }
        return zy11.a;
    }
}
