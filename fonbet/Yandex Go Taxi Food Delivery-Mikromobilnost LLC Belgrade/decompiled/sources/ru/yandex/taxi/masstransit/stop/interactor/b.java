package ru.yandex.taxi.masstransit.stop.interactor;

import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import defpackage.a140;
import defpackage.atd0;
import defpackage.ny61;
import defpackage.po21;
import defpackage.pv0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.tu30;
import defpackage.wu30;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes6.dex */
public final class b {
    public final a140 a;
    public final atd0 b;
    public final com.yandex.go.zone.interactors.b c;
    public final wu30 d;
    public final tu30 e;
    public final po21 f;
    public final tt2 g;

    public b(a140 a140Var, atd0 atd0Var, com.yandex.go.zone.interactors.b bVar, wu30 wu30Var, tu30 tu30Var, po21 po21Var, tt2 tt2Var) {
        this.a = a140Var;
        this.b = atd0Var;
        this.c = bVar;
        this.d = wu30Var;
        this.e = tu30Var;
        this.f = po21Var;
        this.g = tt2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, zzs zzsVar, String str, ContinuationImpl continuationImpl) {
        MtStopAddressUpdateInteractor$requestSource$1 mtStopAddressUpdateInteractor$requestSource$1;
        int i;
        String str2;
        zzs zzsVar2;
        pv0 pv0Var;
        pv0 pv0Var2;
        bVar.getClass();
        if (continuationImpl instanceof MtStopAddressUpdateInteractor$requestSource$1) {
            mtStopAddressUpdateInteractor$requestSource$1 = (MtStopAddressUpdateInteractor$requestSource$1) continuationImpl;
            int i2 = mtStopAddressUpdateInteractor$requestSource$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtStopAddressUpdateInteractor$requestSource$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtStopAddressUpdateInteractor$requestSource$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtStopAddressUpdateInteractor$requestSource$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr c = atd0.c(bVar.b, zzsVar, RoutePointType.POINT_A, null, null, null, null, 56);
                    mtStopAddressUpdateInteractor$requestSource$1.L$0 = zzsVar;
                    str2 = str;
                    mtStopAddressUpdateInteractor$requestSource$1.L$1 = str2;
                    mtStopAddressUpdateInteractor$requestSource$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.A(c, mtStopAddressUpdateInteractor$requestSource$1);
                    if (obj != coroutineSingletons) {
                        zzsVar2 = zzsVar;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pv0Var2 = (pv0) mtStopAddressUpdateInteractor$requestSource$1.L$2;
                    kotlin.b.b(obj);
                    return new ZoneAddress(pv0Var2.a, (Zone) obj);
                }
                str2 = (String) mtStopAddressUpdateInteractor$requestSource$1.L$1;
                zzsVar2 = (zzs) mtStopAddressUpdateInteractor$requestSource$1.L$0;
                kotlin.b.b(obj);
                pv0Var = (pv0) obj;
                if (pv0Var != null) {
                    return null;
                }
                com.yandex.go.zone.interactors.b bVar2 = bVar.c;
                mtStopAddressUpdateInteractor$requestSource$1.L$0 = null;
                mtStopAddressUpdateInteractor$requestSource$1.L$1 = null;
                mtStopAddressUpdateInteractor$requestSource$1.L$2 = pv0Var;
                mtStopAddressUpdateInteractor$requestSource$1.label = 2;
                Object d = bVar2.d(str2, zzsVar2, mtStopAddressUpdateInteractor$requestSource$1);
                if (d != coroutineSingletons) {
                    obj = d;
                    pv0Var2 = pv0Var;
                    return new ZoneAddress(pv0Var2.a, (Zone) obj);
                }
                return coroutineSingletons;
            }
        }
        mtStopAddressUpdateInteractor$requestSource$1 = new MtStopAddressUpdateInteractor$requestSource$1(bVar, continuationImpl);
        Object obj2 = mtStopAddressUpdateInteractor$requestSource$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtStopAddressUpdateInteractor$requestSource$1.label;
        if (i != 0) {
        }
        pv0Var = (pv0) obj2;
        if (pv0Var != null) {
        }
    }
}
