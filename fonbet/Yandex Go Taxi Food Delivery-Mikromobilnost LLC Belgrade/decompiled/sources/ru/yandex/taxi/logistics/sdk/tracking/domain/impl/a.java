package ru.yandex.taxi.logistics.sdk.tracking.domain.impl;

import defpackage.aki;
import defpackage.axa0;
import defpackage.bki;
import defpackage.gri;
import defpackage.hh00;
import defpackage.ixa0;
import defpackage.jqi;
import defpackage.kqi;
import defpackage.lxa0;
import defpackage.mxa0;
import defpackage.ny61;
import defpackage.t701;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.vqi;
import defpackage.w511;
import defpackage.wqi;
import defpackage.xqi;
import defpackage.zji;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ hh00 b;
    public final /* synthetic */ t701 c;

    public a(vpr vprVar, hh00 hh00Var, t701 t701Var) {
        this.a = vprVar;
        this.b = hh00Var;
        this.c = t701Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MapDataRepositoryImpl$getPerformerRouteFlow$$inlined$map$1$2$1 mapDataRepositoryImpl$getPerformerRouteFlow$$inlined$map$1$2$1;
        int i;
        ArrayList arrayList;
        bki zjiVar;
        if (continuation instanceof MapDataRepositoryImpl$getPerformerRouteFlow$$inlined$map$1$2$1) {
            mapDataRepositoryImpl$getPerformerRouteFlow$$inlined$map$1$2$1 = (MapDataRepositoryImpl$getPerformerRouteFlow$$inlined$map$1$2$1) continuation;
            int i2 = mapDataRepositoryImpl$getPerformerRouteFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapDataRepositoryImpl$getPerformerRouteFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mapDataRepositoryImpl$getPerformerRouteFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapDataRepositoryImpl$getPerformerRouteFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ixa0 ixa0Var = (ixa0) obj;
                    mxa0 mxa0Var = this.b.a;
                    gri griVar = this.c.a;
                    String str = griVar.a;
                    List<xqi> list = griVar.c;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
                    for (xqi xqiVar : list) {
                        if (xqiVar instanceof wqi) {
                            wqi wqiVar = (wqi) xqiVar;
                            zjiVar = new aki(wqiVar.d, wqiVar.f, wqiVar.b, wqiVar.p);
                        } else {
                            if (!(xqiVar instanceof vqi)) {
                                w511.b();
                                return null;
                            }
                            vqi vqiVar = (vqi) xqiVar;
                            zjiVar = new zji(vqiVar.a, vqiVar.b);
                        }
                        arrayList2.add(zjiVar);
                    }
                    kqi kqiVar = griVar.l;
                    if (kqiVar != null) {
                        ArrayList arrayList3 = kqiVar.a;
                        arrayList = new ArrayList(tcc.n(arrayList3, 10));
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new axa0(((jqi) it.next()).a));
                        }
                    } else {
                        arrayList = null;
                    }
                    lxa0 lxa0Var = new lxa0(str, arrayList2, arrayList, ixa0Var);
                    mapDataRepositoryImpl$getPerformerRouteFlow$$inlined$map$1$2$1.L$0 = null;
                    mapDataRepositoryImpl$getPerformerRouteFlow$$inlined$map$1$2$1.L$1 = null;
                    mapDataRepositoryImpl$getPerformerRouteFlow$$inlined$map$1$2$1.L$2 = null;
                    mapDataRepositoryImpl$getPerformerRouteFlow$$inlined$map$1$2$1.L$3 = null;
                    mapDataRepositoryImpl$getPerformerRouteFlow$$inlined$map$1$2$1.I$0 = 0;
                    mapDataRepositoryImpl$getPerformerRouteFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(lxa0Var, mapDataRepositoryImpl$getPerformerRouteFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        mapDataRepositoryImpl$getPerformerRouteFlow$$inlined$map$1$2$1 = new MapDataRepositoryImpl$getPerformerRouteFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mapDataRepositoryImpl$getPerformerRouteFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapDataRepositoryImpl$getPerformerRouteFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
