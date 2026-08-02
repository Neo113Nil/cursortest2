package ru.yandex.taxi.masstransit.geopayment.repository;

import defpackage.bm30;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tj40;
import defpackage.u26;
import defpackage.v16;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.geopayment.network.MtVehiclesResponse;
import ru.yandex.taxi.masstransit.geopayment.network.g;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ d a;
    public final /* synthetic */ u26 b;

    public a(d dVar, u26 u26Var) {
        this.a = dVar;
        this.b = u26Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(List list, Continuation continuation) {
        MtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1 mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1;
        int i;
        d dVar;
        List list2;
        boolean z;
        List list3;
        Object value;
        tj40 tj40Var;
        List list4;
        Object value2;
        Object value3;
        if (continuation instanceof MtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1) {
            mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1 = (MtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1) continuation;
            int i2 = mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.label;
                dVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (list != null) {
                        List<v16> list5 = list;
                        ArrayList arrayList = new ArrayList(tcc.n(list5, 10));
                        for (v16 v16Var : list5) {
                            arrayList.add(new g.a(v16Var.a, v16Var.b, v16Var.c));
                        }
                        list2 = arrayList;
                    } else {
                        list2 = null;
                    }
                    z = false;
                    if (list2 == null) {
                        r0 r0Var = dVar.p;
                        do {
                            value3 = r0Var.getValue();
                        } while (!r0Var.k(value3, dVar.m));
                    } else {
                        if (!list2.isEmpty()) {
                            boolean isEmpty = dVar.j.isEmpty();
                            u26 u26Var = this.b;
                            if (isEmpty) {
                                dVar.j = new ArrayList(list2);
                                mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.L$0 = null;
                                mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.L$1 = list2;
                                mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.I$0 = 0;
                                mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.label = 1;
                                obj = d.a(dVar, u26Var, list2, mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1);
                                if (obj != coroutineSingletons) {
                                    list4 = list2;
                                    bm30 bm30Var = (bm30) obj;
                                    boolean z2 = bm30Var.c;
                                    d.d(dVar, list4.size(), bm30Var);
                                    z = z2;
                                    list2 = list4;
                                }
                            } else {
                                List k0 = kotlin.collections.a.k0(list2, kotlin.collections.a.N0(dVar.j));
                                List k02 = kotlin.collections.a.k0(dVar.j, kotlin.collections.a.N0(list2));
                                dVar.j = new ArrayList(list2);
                                if (!k02.isEmpty()) {
                                    r0 r0Var2 = dVar.p;
                                    List list6 = ((tj40) r0Var2.getValue()).a.a;
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj2 : list6) {
                                        if (!kotlin.collections.a.G(k02, ((MtVehiclesResponse.BLEItem) obj2).e)) {
                                            arrayList2.add(obj2);
                                        }
                                    }
                                    do {
                                        value = r0Var2.getValue();
                                        tj40Var = (tj40) value;
                                        tj40Var.a.getClass();
                                    } while (!r0Var2.k(value, new tj40(new MtVehiclesResponse(arrayList2), tj40Var.b, tj40Var.c)));
                                }
                                if (!k0.isEmpty()) {
                                    mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.L$0 = null;
                                    mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.L$1 = list2;
                                    mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.L$2 = k0;
                                    mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.L$3 = null;
                                    mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.I$0 = 0;
                                    mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.label = 2;
                                    obj = d.a(dVar, u26Var, k0, mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1);
                                    if (obj != coroutineSingletons) {
                                        list3 = k0;
                                        bm30 bm30Var2 = (bm30) obj;
                                        boolean z3 = bm30Var2.c;
                                        d.d(dVar, list3.size(), bm30Var2);
                                        z = z3;
                                    }
                                }
                            }
                            return coroutineSingletons;
                        }
                        r0 r0Var3 = dVar.p;
                        do {
                            value2 = r0Var3.getValue();
                        } while (!r0Var3.k(value2, dVar.l));
                    }
                } else if (i == 1) {
                    list4 = (List) mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.L$1;
                    kotlin.b.b(obj);
                    bm30 bm30Var3 = (bm30) obj;
                    boolean z22 = bm30Var3.c;
                    d.d(dVar, list4.size(), bm30Var3);
                    z = z22;
                    list2 = list4;
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list3 = (List) mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.L$2;
                    list2 = (List) mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.L$1;
                    kotlin.b.b(obj);
                    bm30 bm30Var22 = (bm30) obj;
                    boolean z32 = bm30Var22.c;
                    d.d(dVar, list3.size(), bm30Var22);
                    z = z32;
                }
                if (list2 != null && !list2.isEmpty() && !z) {
                    dVar.c.c();
                }
                return zy11.a;
            }
        }
        mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1 = new MtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1(this, continuation);
        Object obj3 = mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.label;
        dVar = this.a;
        if (i != 0) {
        }
        if (list2 != null) {
            dVar.c.c();
        }
        return zy11.a;
    }
}
