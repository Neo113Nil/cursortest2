package ru.yandex.taxi.costcenters.ride;

import defpackage.jve;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OpenCostCenterRideViewModelRepository$observeViewModel$$inlined$map$1$2$1 openCostCenterRideViewModelRepository$observeViewModel$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof OpenCostCenterRideViewModelRepository$observeViewModel$$inlined$map$1$2$1) {
            openCostCenterRideViewModelRepository$observeViewModel$$inlined$map$1$2$1 = (OpenCostCenterRideViewModelRepository$observeViewModel$$inlined$map$1$2$1) continuation;
            int i2 = openCostCenterRideViewModelRepository$observeViewModel$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                openCostCenterRideViewModelRepository$observeViewModel$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = openCostCenterRideViewModelRepository$observeViewModel$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = openCostCenterRideViewModelRepository$observeViewModel$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : (List) obj) {
                        if (obj3 instanceof jve) {
                            arrayList.add(obj3);
                        }
                    }
                    openCostCenterRideViewModelRepository$observeViewModel$$inlined$map$1$2$1.L$0 = null;
                    openCostCenterRideViewModelRepository$observeViewModel$$inlined$map$1$2$1.L$1 = null;
                    openCostCenterRideViewModelRepository$observeViewModel$$inlined$map$1$2$1.L$2 = null;
                    openCostCenterRideViewModelRepository$observeViewModel$$inlined$map$1$2$1.L$3 = null;
                    openCostCenterRideViewModelRepository$observeViewModel$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList, openCostCenterRideViewModelRepository$observeViewModel$$inlined$map$1$2$1) == coroutineSingletons) {
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
        openCostCenterRideViewModelRepository$observeViewModel$$inlined$map$1$2$1 = new OpenCostCenterRideViewModelRepository$observeViewModel$$inlined$map$1$2$1(this, continuation);
        Object obj22 = openCostCenterRideViewModelRepository$observeViewModel$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = openCostCenterRideViewModelRepository$observeViewModel$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
