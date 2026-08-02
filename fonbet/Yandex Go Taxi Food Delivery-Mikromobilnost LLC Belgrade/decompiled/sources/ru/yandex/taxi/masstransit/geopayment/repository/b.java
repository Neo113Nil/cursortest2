package ru.yandex.taxi.masstransit.geopayment.repository;

import defpackage.ny61;
import defpackage.tcc;
import defpackage.v16;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.masstransit.geopayment.network.g;

/* loaded from: classes6.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ d b;

    public b(vpr vprVar, d dVar) {
        this.a = vprVar;
        this.b = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e4, code lost:
    
        if (r13.emit(r11, r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1 mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        Set set;
        vpr vprVar2;
        Object obj2;
        if (continuation instanceof MtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1) {
            mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1 = (MtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1) continuation;
            int i2 = mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    vprVar = this.a;
                    Set set2 = (Set) obj;
                    if (set2 != null) {
                        Set<v16> set3 = set2;
                        ArrayList arrayList = new ArrayList(tcc.n(set3, 10));
                        for (v16 v16Var : set3) {
                            arrayList.add(new g.a(v16Var.a, v16Var.b, v16Var.c));
                        }
                        set = kotlin.collections.a.N0(arrayList);
                    } else {
                        set = null;
                    }
                    if (this.b.k) {
                        obj2 = this.b.l;
                    } else if (set == null) {
                        obj2 = this.b.m;
                    } else {
                        boolean isEmpty = set.isEmpty();
                        d dVar = this.b;
                        if (!isEmpty) {
                            mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$0 = null;
                            mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$1 = null;
                            mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$2 = null;
                            mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$3 = null;
                            mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$4 = vprVar;
                            mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$5 = null;
                            mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$6 = null;
                            mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$7 = null;
                            mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.label = 1;
                            Object c = d.c(dVar, set, mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1);
                            if (c != coroutineSingletons) {
                                obj3 = c;
                                vprVar2 = vprVar;
                            }
                            return coroutineSingletons;
                        }
                        obj2 = dVar.l;
                    }
                    mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$0 = null;
                    mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$1 = null;
                    mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$2 = null;
                    mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$3 = null;
                    mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$4 = null;
                    mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$5 = null;
                    mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$6 = null;
                    mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$7 = null;
                    mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.label = 2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj3);
                        return zy11.a;
                    }
                    vprVar2 = (vpr) mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj3);
                }
                Object obj4 = obj3;
                vprVar = vprVar2;
                obj2 = obj4;
                mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$0 = null;
                mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$1 = null;
                mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$2 = null;
                mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$3 = null;
                mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$4 = null;
                mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$5 = null;
                mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$6 = null;
                mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$7 = null;
                mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.label = 2;
            }
        }
        mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1 = new MtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1(this, continuation);
        Object obj32 = mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        Object obj42 = obj32;
        vprVar = vprVar2;
        obj2 = obj42;
        mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$0 = null;
        mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$1 = null;
        mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$2 = null;
        mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$3 = null;
        mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$4 = null;
        mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$5 = null;
        mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$6 = null;
        mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.L$7 = null;
        mtGeoVehiclesRepository$listenVehicles$$inlined$map$1$2$1.label = 2;
    }
}
