package ru.yandex.taxi.masstransit.address.interactor;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import defpackage.ny61;
import defpackage.uu30;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtRouteAddressesInteractorImpl$sourceFlow$$inlined$map$1$2$1 mtRouteAddressesInteractorImpl$sourceFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof MtRouteAddressesInteractorImpl$sourceFlow$$inlined$map$1$2$1) {
            mtRouteAddressesInteractorImpl$sourceFlow$$inlined$map$1$2$1 = (MtRouteAddressesInteractorImpl$sourceFlow$$inlined$map$1$2$1) continuation;
            int i2 = mtRouteAddressesInteractorImpl$sourceFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtRouteAddressesInteractorImpl$sourceFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mtRouteAddressesInteractorImpl$sourceFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtRouteAddressesInteractorImpl$sourceFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ZoneAddress zoneAddress = ((uu30) obj).a;
                    Address address = zoneAddress != null ? zoneAddress.a : null;
                    mtRouteAddressesInteractorImpl$sourceFlow$$inlined$map$1$2$1.L$0 = null;
                    mtRouteAddressesInteractorImpl$sourceFlow$$inlined$map$1$2$1.L$1 = null;
                    mtRouteAddressesInteractorImpl$sourceFlow$$inlined$map$1$2$1.L$2 = null;
                    mtRouteAddressesInteractorImpl$sourceFlow$$inlined$map$1$2$1.L$3 = null;
                    mtRouteAddressesInteractorImpl$sourceFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(address, mtRouteAddressesInteractorImpl$sourceFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        mtRouteAddressesInteractorImpl$sourceFlow$$inlined$map$1$2$1 = new MtRouteAddressesInteractorImpl$sourceFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mtRouteAddressesInteractorImpl$sourceFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtRouteAddressesInteractorImpl$sourceFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
