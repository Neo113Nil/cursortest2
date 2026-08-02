package ru.yandex.taxi.fragment.preorder;

import com.yandex.go.parks.nearest.data.models.NotSupportedAddressException;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;

    public a(vpr vprVar, e eVar) {
        this.a = vprVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AddressMapFragmentAddressController$requestPositionChangedPinDrop$$inlined$map$1$2$1 addressMapFragmentAddressController$requestPositionChangedPinDrop$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof AddressMapFragmentAddressController$requestPositionChangedPinDrop$$inlined$map$1$2$1) {
            addressMapFragmentAddressController$requestPositionChangedPinDrop$$inlined$map$1$2$1 = (AddressMapFragmentAddressController$requestPositionChangedPinDrop$$inlined$map$1$2$1) continuation;
            int i2 = addressMapFragmentAddressController$requestPositionChangedPinDrop$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressMapFragmentAddressController$requestPositionChangedPinDrop$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = addressMapFragmentAddressController$requestPositionChangedPinDrop$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressMapFragmentAddressController$requestPositionChangedPinDrop$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pv0 pv0Var = (pv0) obj;
                    if (this.b.e.i && !pv0Var.b()) {
                        throw new NotSupportedAddressException(pv0Var.a, pv0Var.d);
                    }
                    addressMapFragmentAddressController$requestPositionChangedPinDrop$$inlined$map$1$2$1.L$0 = null;
                    addressMapFragmentAddressController$requestPositionChangedPinDrop$$inlined$map$1$2$1.L$1 = null;
                    addressMapFragmentAddressController$requestPositionChangedPinDrop$$inlined$map$1$2$1.L$2 = null;
                    addressMapFragmentAddressController$requestPositionChangedPinDrop$$inlined$map$1$2$1.L$3 = null;
                    addressMapFragmentAddressController$requestPositionChangedPinDrop$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pv0Var, addressMapFragmentAddressController$requestPositionChangedPinDrop$$inlined$map$1$2$1) == coroutineSingletons) {
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
        addressMapFragmentAddressController$requestPositionChangedPinDrop$$inlined$map$1$2$1 = new AddressMapFragmentAddressController$requestPositionChangedPinDrop$$inlined$map$1$2$1(this, continuation);
        Object obj22 = addressMapFragmentAddressController$requestPositionChangedPinDrop$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressMapFragmentAddressController$requestPositionChangedPinDrop$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
