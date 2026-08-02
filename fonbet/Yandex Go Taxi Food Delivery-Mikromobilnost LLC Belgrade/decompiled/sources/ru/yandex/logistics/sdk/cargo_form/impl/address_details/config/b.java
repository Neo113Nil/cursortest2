package ru.yandex.logistics.sdk.cargo_form.impl.address_details.config;

import com.squareup.moshi.Moshi;
import defpackage.is0;
import defpackage.jg00;
import defpackage.ms0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_order_form_address_details.DeliveryOrderFormAddressDetailsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.TypedConfigsDto;

/* loaded from: classes5.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ is0 b;

    public b(vpr vprVar, is0 is0Var) {
        this.a = vprVar;
        this.b = is0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r8.a.contains(r9.c) != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AddressDetailsConfigInteractor$getMapConfigFlow$$inlined$map$1$2$1 addressDetailsConfigInteractor$getMapConfigFlow$$inlined$map$1$2$1;
        int i;
        jg00 jg00Var;
        Object obj2;
        if (continuation instanceof AddressDetailsConfigInteractor$getMapConfigFlow$$inlined$map$1$2$1) {
            addressDetailsConfigInteractor$getMapConfigFlow$$inlined$map$1$2$1 = (AddressDetailsConfigInteractor$getMapConfigFlow$$inlined$map$1$2$1) continuation;
            int i2 = addressDetailsConfigInteractor$getMapConfigFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressDetailsConfigInteractor$getMapConfigFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = addressDetailsConfigInteractor$getMapConfigFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressDetailsConfigInteractor$getMapConfigFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    TypedConfigsDto.ItemsDto itemsDto = (TypedConfigsDto.ItemsDto) obj;
                    if (itemsDto != null) {
                        is0 is0Var = this.b;
                        Moshi moshi = is0Var.d;
                        try {
                            obj2 = moshi.adapter(DeliveryOrderFormAddressDetailsDto.class).fromJson(moshi.adapter(Object.class).toJson(itemsDto.getValue()));
                        } catch (Exception unused) {
                            obj2 = null;
                        }
                        DeliveryOrderFormAddressDetailsDto deliveryOrderFormAddressDetailsDto = (DeliveryOrderFormAddressDetailsDto) obj2;
                        if (deliveryOrderFormAddressDetailsDto != null) {
                            is0Var.b.getClass();
                            jg00Var = ms0.a(deliveryOrderFormAddressDetailsDto).b;
                            if (jg00Var != null) {
                            }
                        }
                    }
                    jg00Var = null;
                    addressDetailsConfigInteractor$getMapConfigFlow$$inlined$map$1$2$1.L$0 = null;
                    addressDetailsConfigInteractor$getMapConfigFlow$$inlined$map$1$2$1.L$1 = null;
                    addressDetailsConfigInteractor$getMapConfigFlow$$inlined$map$1$2$1.L$2 = null;
                    addressDetailsConfigInteractor$getMapConfigFlow$$inlined$map$1$2$1.L$3 = null;
                    addressDetailsConfigInteractor$getMapConfigFlow$$inlined$map$1$2$1.I$0 = 0;
                    addressDetailsConfigInteractor$getMapConfigFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(jg00Var, addressDetailsConfigInteractor$getMapConfigFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        addressDetailsConfigInteractor$getMapConfigFlow$$inlined$map$1$2$1 = new AddressDetailsConfigInteractor$getMapConfigFlow$$inlined$map$1$2$1(this, continuation);
        Object obj32 = addressDetailsConfigInteractor$getMapConfigFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressDetailsConfigInteractor$getMapConfigFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
