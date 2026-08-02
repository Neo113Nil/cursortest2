package ru.yandex.taxi.logistics.ndd_map.pin;

import defpackage.i1c0;
import defpackage.ny61;
import defpackage.r0c0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ r0c0 b;

    public c(vpr vprVar, r0c0 r0c0Var) {
        this.a = vprVar;
        this.b = r0c0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        NddAddressMapPickerPinV2DataRepository$styleFlow$$inlined$map$1$2$1 nddAddressMapPickerPinV2DataRepository$styleFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof NddAddressMapPickerPinV2DataRepository$styleFlow$$inlined$map$1$2$1) {
            nddAddressMapPickerPinV2DataRepository$styleFlow$$inlined$map$1$2$1 = (NddAddressMapPickerPinV2DataRepository$styleFlow$$inlined$map$1$2$1) continuation;
            int i2 = nddAddressMapPickerPinV2DataRepository$styleFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nddAddressMapPickerPinV2DataRepository$styleFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = nddAddressMapPickerPinV2DataRepository$styleFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nddAddressMapPickerPinV2DataRepository$styleFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    r0c0 r0c0Var = this.b;
                    i1c0 i3 = booleanValue ? r0c0Var.i() : r0c0Var.c();
                    nddAddressMapPickerPinV2DataRepository$styleFlow$$inlined$map$1$2$1.L$0 = null;
                    nddAddressMapPickerPinV2DataRepository$styleFlow$$inlined$map$1$2$1.L$1 = null;
                    nddAddressMapPickerPinV2DataRepository$styleFlow$$inlined$map$1$2$1.L$2 = null;
                    nddAddressMapPickerPinV2DataRepository$styleFlow$$inlined$map$1$2$1.L$3 = null;
                    nddAddressMapPickerPinV2DataRepository$styleFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(i3, nddAddressMapPickerPinV2DataRepository$styleFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        nddAddressMapPickerPinV2DataRepository$styleFlow$$inlined$map$1$2$1 = new NddAddressMapPickerPinV2DataRepository$styleFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = nddAddressMapPickerPinV2DataRepository$styleFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nddAddressMapPickerPinV2DataRepository$styleFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
