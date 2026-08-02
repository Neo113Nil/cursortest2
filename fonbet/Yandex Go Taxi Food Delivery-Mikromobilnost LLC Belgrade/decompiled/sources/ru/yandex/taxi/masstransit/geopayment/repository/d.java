package ru.yandex.taxi.masstransit.geopayment.repository;

import com.yandex.go.masstransit.sdk.ble.impl.ble.f;
import defpackage.b64;
import defpackage.bm30;
import defpackage.bvf0;
import defpackage.cmt;
import defpackage.d411;
import defpackage.dm30;
import defpackage.fm30;
import defpackage.fmt;
import defpackage.gtq0;
import defpackage.i3y;
import defpackage.j26;
import defpackage.jl40;
import defpackage.jse;
import defpackage.mr30;
import defpackage.ny61;
import defpackage.on2;
import defpackage.pr30;
import defpackage.pzt0;
import defpackage.rj40;
import defpackage.s8o;
import defpackage.sls;
import defpackage.tj40;
import defpackage.tje;
import defpackage.tse;
import defpackage.u26;
import defpackage.vk30;
import defpackage.x4e;
import defpackage.xby;
import defpackage.xk30;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.geopayment.domain.ResponseLoadingState;
import ru.yandex.taxi.masstransit.geopayment.network.MtVehiclesResponse;
import ru.yandex.taxi.masstransit.geopayment.network.PaymentBleApi;
import ru.yandex.taxi.masstransit.geopayment.network.VehiclesApi;
import ru.yandex.taxi.masstransit.geopayment.network.g;
import ru.yandex.taxi.masstransit.geopayment.repository.d;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes6.dex */
public final class d {
    public final on2 a;
    public final com.yandex.go.masstransit.sdk.ble.impl.ble.c b;
    public final f c;
    public final jse d;
    public final j26 e;
    public final xk30 f;
    public final d411 g;
    public final i3y h;
    public final i3y i;
    public ArrayList j = new ArrayList();
    public volatile boolean k;
    public final tj40 l;
    public final tj40 m;
    public final r0 n;
    public pzt0 o;
    public final r0 p;

    public d(on2 on2Var, com.yandex.go.masstransit.sdk.ble.impl.ble.c cVar, f fVar, jse jseVar, j26 j26Var, xk30 xk30Var, d411 d411Var) {
        this.a = on2Var;
        this.b = cVar;
        this.c = fVar;
        this.d = jseVar;
        this.e = j26Var;
        this.f = xk30Var;
        this.g = d411Var;
        final int i = 0;
        this.h = kotlin.a.a(new sls(this) { // from class: am30
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                d dVar = this.b;
                switch (i2) {
                    case 0:
                        on2 on2Var2 = dVar.a;
                        on2Var2.getClass();
                        return (VehiclesApi) on2Var2.a(GoApiName.TaxiV4, VehiclesApi.class);
                    default:
                        on2 on2Var3 = dVar.a;
                        on2Var3.getClass();
                        return (PaymentBleApi) on2Var3.a(GoApiName.TaxiV4, PaymentBleApi.class);
                }
            }
        });
        final int i2 = 1;
        this.i = kotlin.a.a(new sls(this) { // from class: am30
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        on2 on2Var2 = dVar.a;
                        on2Var2.getClass();
                        return (VehiclesApi) on2Var2.a(GoApiName.TaxiV4, VehiclesApi.class);
                    default:
                        on2 on2Var3 = dVar.a;
                        on2Var3.getClass();
                        return (PaymentBleApi) on2Var3.a(GoApiName.TaxiV4, PaymentBleApi.class);
                }
            }
        });
        MtVehiclesResponse mtVehiclesResponse = MtVehiclesResponse.c;
        this.l = new tj40(mtVehiclesResponse, ResponseLoadingState.ERROR, null);
        tj40 tj40Var = new tj40(mtVehiclesResponse, ResponseLoadingState.LOADING, null);
        this.m = tj40Var;
        this.n = bvf0.c(Boolean.FALSE);
        this.p = bvf0.c(tj40Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d9 A[LOOP:0: B:13:0x00d9->B:15:0x00ed, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x00c5 -> B:10:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, u26 u26Var, List list, ContinuationImpl continuationImpl) {
        MtGeoVehiclesRepository$requestBatches$1 mtGeoVehiclesRepository$requestBatches$1;
        int i;
        List list2;
        Iterator it;
        String str;
        int i2;
        int i3;
        Object value;
        tj40 tj40Var;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        d dVar2 = dVar;
        f fVar = dVar2.c;
        j26 j26Var = dVar2.e;
        r0 r0Var = dVar2.n;
        r0 r0Var2 = dVar2.p;
        if (continuationImpl instanceof MtGeoVehiclesRepository$requestBatches$1) {
            mtGeoVehiclesRepository$requestBatches$1 = (MtGeoVehiclesRepository$requestBatches$1) continuationImpl;
            int i4 = mtGeoVehiclesRepository$requestBatches$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                mtGeoVehiclesRepository$requestBatches$1.label = i4 - Integer.MIN_VALUE;
                Object obj = mtGeoVehiclesRepository$requestBatches$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtGeoVehiclesRepository$requestBatches$1.label;
                Object obj2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (list.isEmpty()) {
                        return new bm30(0, null, false);
                    }
                    while (true) {
                        Object value6 = r0Var.getValue();
                        ((Boolean) value6).getClass();
                        if (r0Var.k(value6, Boolean.TRUE)) {
                            break;
                        }
                        dVar2 = dVar;
                    }
                    ArrayList F = kotlin.collections.a.F(list, u26Var.c);
                    list2 = F;
                    it = F.iterator();
                    str = null;
                    i2 = 0;
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                    return new bm30(i3, str, i2 != 0);
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = mtGeoVehiclesRepository$requestBatches$1.I$1;
                i3 = mtGeoVehiclesRepository$requestBatches$1.I$0;
                List list3 = (List) mtGeoVehiclesRepository$requestBatches$1.L$5;
                it = (Iterator) mtGeoVehiclesRepository$requestBatches$1.L$4;
                list2 = (List) mtGeoVehiclesRepository$requestBatches$1.L$3;
                str = (String) mtGeoVehiclesRepository$requestBatches$1.L$2;
                kotlin.b.b(obj);
                f fVar2 = fVar;
                int i5 = 1;
                int i6 = i2;
                tj40 tj40Var2 = (tj40) obj;
                if (jl40.l(list3, list2.get(list2.size() - i5))) {
                    do {
                        value5 = r0Var.getValue();
                        ((Boolean) value5).getClass();
                    } while (!r0Var.k(value5, Boolean.FALSE));
                }
                ResponseLoadingState responseLoadingState = tj40Var2.b;
                rj40 rj40Var = tj40Var2.c;
                MtVehiclesResponse mtVehiclesResponse = tj40Var2.a;
                j26 j26Var2 = j26Var;
                if (responseLoadingState != ResponseLoadingState.ERROR) {
                    Integer M = s8o.M(rj40Var != null ? rj40Var.a : null);
                    if ((M != null && M.intValue() == 500) || (M != null && M.intValue() == 504)) {
                        dVar2.j.removeAll(list3);
                        if (!dVar2.j.isEmpty()) {
                            return new bm30(i3, str, false);
                        }
                        fVar2.a();
                        do {
                            value4 = r0Var2.getValue();
                        } while (!r0Var2.k(value4, tj40Var2));
                    } else {
                        dVar2.j.clear();
                        fVar2.a();
                        do {
                            value3 = r0Var2.getValue();
                        } while (!r0Var2.k(value3, tj40Var2));
                    }
                    i2 = 1;
                    return new bm30(i3, str, i2 != 0);
                }
                int size = mtVehiclesResponse.a.size() + i3;
                String str2 = dVar2.f.a.a;
                ArrayList m0 = kotlin.collections.a.m0(mtVehiclesResponse.a, ((tj40) r0Var2.getValue()).a.a);
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                Iterator it2 = m0.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    MtVehiclesResponse.BLEItem bLEItem = (MtVehiclesResponse.BLEItem) next;
                    int i7 = size;
                    String str3 = bLEItem.d;
                    if (str3.length() <= 0) {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str3 = bLEItem.a;
                    }
                    if (hashSet.add(str3)) {
                        arrayList.add(next);
                    }
                    size = i7;
                }
                int i8 = size;
                if (((tj40) r0Var2.getValue()).b != ResponseLoadingState.LOADED) {
                    do {
                        value2 = r0Var2.getValue();
                    } while (!r0Var2.k(value2, new tj40(new MtVehiclesResponse(arrayList), tj40Var2.b, rj40Var)));
                } else {
                    do {
                        value = r0Var2.getValue();
                        tj40Var = (tj40) value;
                        tj40Var.a.getClass();
                    } while (!r0Var2.k(value, new tj40(new MtVehiclesResponse(arrayList), tj40Var.b, tj40Var.c)));
                }
                dVar2 = dVar;
                i3 = i8;
                i2 = i6;
                str = str2;
                fVar = fVar2;
                j26Var = j26Var2;
                obj2 = null;
                if (it.hasNext()) {
                    list3 = (List) it.next();
                    fVar2 = fVar;
                    g gVar = new g(list3, j26Var.b(), j26Var.a());
                    mtGeoVehiclesRepository$requestBatches$1.L$0 = obj2;
                    mtGeoVehiclesRepository$requestBatches$1.L$1 = obj2;
                    mtGeoVehiclesRepository$requestBatches$1.L$2 = str;
                    mtGeoVehiclesRepository$requestBatches$1.L$3 = list2;
                    mtGeoVehiclesRepository$requestBatches$1.L$4 = it;
                    mtGeoVehiclesRepository$requestBatches$1.L$5 = list3;
                    mtGeoVehiclesRepository$requestBatches$1.I$0 = i3;
                    mtGeoVehiclesRepository$requestBatches$1.I$1 = i2;
                    i5 = 1;
                    mtGeoVehiclesRepository$requestBatches$1.label = 1;
                    obj = dVar2.g(gVar, mtGeoVehiclesRepository$requestBatches$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    int i62 = i2;
                    tj40 tj40Var22 = (tj40) obj;
                    if (jl40.l(list3, list2.get(list2.size() - i5))) {
                    }
                    ResponseLoadingState responseLoadingState2 = tj40Var22.b;
                    rj40 rj40Var2 = tj40Var22.c;
                    MtVehiclesResponse mtVehiclesResponse2 = tj40Var22.a;
                    j26 j26Var22 = j26Var;
                    if (responseLoadingState2 != ResponseLoadingState.ERROR) {
                    }
                }
                return new bm30(i3, str, i2 != 0);
            }
        }
        mtGeoVehiclesRepository$requestBatches$1 = new MtGeoVehiclesRepository$requestBatches$1(dVar2, continuationImpl);
        Object obj3 = mtGeoVehiclesRepository$requestBatches$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtGeoVehiclesRepository$requestBatches$1.label;
        Object obj22 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0062 A[Catch: all -> 0x0032, CancellationException -> 0x008d, TryCatch #2 {CancellationException -> 0x008d, all -> 0x0032, blocks: (B:11:0x002e, B:12:0x0054, B:14:0x0062, B:16:0x0074, B:17:0x0077, B:18:0x0081, B:25:0x003d), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(d dVar, mr30 mr30Var, ContinuationImpl continuationImpl) {
        MtGeoVehiclesRepository$requestPaymentBleUUIDsFromNet$1 mtGeoVehiclesRepository$requestPaymentBleUUIDsFromNet$1;
        int i;
        fmt fmtVar;
        d411 d411Var = dVar.g;
        try {
            if (continuationImpl instanceof MtGeoVehiclesRepository$requestPaymentBleUUIDsFromNet$1) {
                mtGeoVehiclesRepository$requestPaymentBleUUIDsFromNet$1 = (MtGeoVehiclesRepository$requestPaymentBleUUIDsFromNet$1) continuationImpl;
                int i2 = mtGeoVehiclesRepository$requestPaymentBleUUIDsFromNet$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    mtGeoVehiclesRepository$requestPaymentBleUUIDsFromNet$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = mtGeoVehiclesRepository$requestPaymentBleUUIDsFromNet$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = mtGeoVehiclesRepository$requestPaymentBleUUIDsFromNet$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        cmt<pr30> a = ((PaymentBleApi) dVar.i.getValue()).a(mr30Var);
                        mtGeoVehiclesRepository$requestPaymentBleUUIDsFromNet$1.L$0 = null;
                        mtGeoVehiclesRepository$requestPaymentBleUUIDsFromNet$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.b(a, null, mtGeoVehiclesRepository$requestPaymentBleUUIDsFromNet$1);
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
                    fmtVar = (fmt) obj;
                    if (((pr30) fmtVar.a).a.isEmpty()) {
                        String a2 = fmtVar.e.a("X-YaMasstransitRequestId");
                        d411Var.getClass();
                        HashMap hashMap = new HashMap();
                        if (a2 != null) {
                            hashMap.put("request_id", a2);
                        }
                        d411Var.a.a("TransportPayment.BleVehicles.UUIDsRequestFailed", hashMap, 1, new HashMap());
                    }
                    return new fm30(((pr30) fmtVar.a).a);
                }
            }
            if (i != 0) {
            }
            fmtVar = (fmt) obj;
            if (((pr30) fmtVar.a).a.isEmpty()) {
            }
            return new fm30(((pr30) fmtVar.a).a);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            xby.d.k(th, "Error getting payment ble uuids");
            String y = gtq0.y(s8o.O(th));
            d411Var.getClass();
            HashMap hashMap2 = new HashMap();
            if (y != null) {
                hashMap2.put("request_id", y);
            }
            d411Var.a.a("TransportPayment.BleVehicles.UUIDsRequestFailed", hashMap2, 1, new HashMap());
            return new dm30(th);
        }
        mtGeoVehiclesRepository$requestPaymentBleUUIDsFromNet$1 = new MtGeoVehiclesRepository$requestPaymentBleUUIDsFromNet$1(dVar, continuationImpl);
        Object obj2 = mtGeoVehiclesRepository$requestPaymentBleUUIDsFromNet$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtGeoVehiclesRepository$requestPaymentBleUUIDsFromNet$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(d dVar, Set set, ContinuationImpl continuationImpl) {
        MtGeoVehiclesRepository$requestVehicles$1 mtGeoVehiclesRepository$requestVehicles$1;
        int i;
        tj40 tj40Var;
        dVar.getClass();
        if (continuationImpl instanceof MtGeoVehiclesRepository$requestVehicles$1) {
            mtGeoVehiclesRepository$requestVehicles$1 = (MtGeoVehiclesRepository$requestVehicles$1) continuationImpl;
            int i2 = mtGeoVehiclesRepository$requestVehicles$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtGeoVehiclesRepository$requestVehicles$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtGeoVehiclesRepository$requestVehicles$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtGeoVehiclesRepository$requestVehicles$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g gVar = new g(kotlin.collections.a.J0(set), dVar.e.b(), dVar.e.a());
                    mtGeoVehiclesRepository$requestVehicles$1.L$0 = null;
                    mtGeoVehiclesRepository$requestVehicles$1.label = 1;
                    obj = dVar.g(gVar, mtGeoVehiclesRepository$requestVehicles$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                tj40Var = (tj40) obj;
                if (tj40Var.b == ResponseLoadingState.ERROR) {
                    dVar.k = true;
                    dVar.b.a();
                }
                return tj40Var;
            }
        }
        mtGeoVehiclesRepository$requestVehicles$1 = new MtGeoVehiclesRepository$requestVehicles$1(dVar, continuationImpl);
        Object obj3 = mtGeoVehiclesRepository$requestVehicles$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtGeoVehiclesRepository$requestVehicles$1.label;
        if (i != 0) {
        }
        tj40Var = (tj40) obj3;
        if (tj40Var.b == ResponseLoadingState.ERROR) {
        }
        return tj40Var;
    }

    public static final void d(d dVar, int i, bm30 bm30Var) {
        dVar.getClass();
        String str = bm30Var.b;
        if (str == null) {
            return;
        }
        d411 d411Var = dVar.g;
        int i2 = bm30Var.a;
        int size = ((tj40) dVar.p.getValue()).a.a.size();
        d411Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("request_id", str);
        b64.B(i, hashMap, "beacons_scanned_count", i2, "items_received_count");
        d411Var.a.a("TransportPayment.BleVehicles.BleAlgorithmFinished", hashMap, 1, x4e.n(size, hashMap, "vehicles_displayed_count"));
    }

    public final void e(u26 u26Var, tse tseVar) {
        tje.N(tseVar, null, null, new MtGeoVehiclesRepository$listenBleScanResults$1(this, u26Var, null), 3);
    }

    public final void f(u26 u26Var, tse tseVar) {
        pzt0 pzt0Var = this.o;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.o = tje.N(tseVar, null, null, new MtGeoVehiclesRepository$refreshScan$1(this, u26Var, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(g gVar, ContinuationImpl continuationImpl) {
        MtGeoVehiclesRepository$requestVehiclesFromNet$1 mtGeoVehiclesRepository$requestVehiclesFromNet$1;
        int i;
        try {
            if (continuationImpl instanceof MtGeoVehiclesRepository$requestVehiclesFromNet$1) {
                mtGeoVehiclesRepository$requestVehiclesFromNet$1 = (MtGeoVehiclesRepository$requestVehiclesFromNet$1) continuationImpl;
                int i2 = mtGeoVehiclesRepository$requestVehiclesFromNet$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    mtGeoVehiclesRepository$requestVehiclesFromNet$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = mtGeoVehiclesRepository$requestVehiclesFromNet$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = mtGeoVehiclesRepository$requestVehiclesFromNet$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        cmt<MtVehiclesResponse> a = ((VehiclesApi) this.h.getValue()).a(gVar);
                        mtGeoVehiclesRepository$requestVehiclesFromNet$1.L$0 = null;
                        mtGeoVehiclesRepository$requestVehiclesFromNet$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.b(a, null, mtGeoVehiclesRepository$requestVehiclesFromNet$1);
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
                    fmt fmtVar = (fmt) obj;
                    xk30 xk30Var = this.f;
                    xk30Var.a = new vk30(fmtVar.e.a("X-YaMasstransitRequestId"), xk30Var.a.b);
                    return new tj40((MtVehiclesResponse) fmtVar.a, ResponseLoadingState.LOADED, null);
                }
            }
            if (i != 0) {
            }
            fmt fmtVar2 = (fmt) obj;
            xk30 xk30Var2 = this.f;
            xk30Var2.a = new vk30(fmtVar2.e.a("X-YaMasstransitRequestId"), xk30Var2.a.b);
            return new tj40((MtVehiclesResponse) fmtVar2.a, ResponseLoadingState.LOADED, null);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            xby.d.k(th, "Error getting vehicles info");
            return new tj40(MtVehiclesResponse.c, ResponseLoadingState.ERROR, new rj40(th));
        }
        mtGeoVehiclesRepository$requestVehiclesFromNet$1 = new MtGeoVehiclesRepository$requestVehiclesFromNet$1(this, continuationImpl);
        Object obj2 = mtGeoVehiclesRepository$requestVehiclesFromNet$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtGeoVehiclesRepository$requestVehiclesFromNet$1.label;
    }
}
