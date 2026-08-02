package ru.yandex.taxi.altpins.source.modal;

import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.p2y0;
import defpackage.v4r0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class e {
    public final p2y0 a;

    public e(p2y0 p2y0Var) {
        this.a = p2y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        HideMapObjectInteractor$hideMapObject$1 hideMapObjectInteractor$hideMapObject$1;
        int i;
        String str3;
        o2y0 o2y0Var;
        TaxiOrder b;
        if (continuationImpl instanceof HideMapObjectInteractor$hideMapObject$1) {
            hideMapObjectInteractor$hideMapObject$1 = (HideMapObjectInteractor$hideMapObject$1) continuationImpl;
            int i2 = hideMapObjectInteractor$hideMapObject$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hideMapObjectInteractor$hideMapObject$1.label = i2 - Integer.MIN_VALUE;
                Object obj = hideMapObjectInteractor$hideMapObject$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hideMapObjectInteractor$hideMapObject$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p2y0 p2y0Var = this.a;
                    hideMapObjectInteractor$hideMapObject$1.L$0 = null;
                    hideMapObjectInteractor$hideMapObject$1.L$1 = str2;
                    hideMapObjectInteractor$hideMapObject$1.label = 1;
                    Object p = ((e0) p2y0Var).p(str, hideMapObjectInteractor$hideMapObject$1);
                    if (p == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = p;
                    str3 = str2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = (String) hideMapObjectInteractor$hideMapObject$1.L$1;
                    kotlin.b.b(obj);
                }
                o2y0Var = (o2y0) obj;
                if (o2y0Var != null && (b = o2y0Var.b()) != null) {
                    synchronized (b) {
                        TaxiOrderLocalData taxiOrderLocalData = b.l;
                        b.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, v4r0.i(taxiOrderLocalData.b0, str3), null, null, -1, 14680063);
                    }
                }
                return zy11.a;
            }
        }
        hideMapObjectInteractor$hideMapObject$1 = new HideMapObjectInteractor$hideMapObject$1(this, continuationImpl);
        Object obj2 = hideMapObjectInteractor$hideMapObject$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hideMapObjectInteractor$hideMapObject$1.label;
        if (i != 0) {
        }
        o2y0Var = (o2y0) obj2;
        if (o2y0Var != null) {
            synchronized (b) {
            }
        }
        return zy11.a;
    }
}
