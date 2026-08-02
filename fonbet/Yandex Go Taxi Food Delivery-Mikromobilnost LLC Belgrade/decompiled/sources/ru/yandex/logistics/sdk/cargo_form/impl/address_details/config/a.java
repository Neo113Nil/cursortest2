package ru.yandex.logistics.sdk.cargo_form.impl.address_details.config;

import defpackage.gs0;
import defpackage.is0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.TypedConfigsDto;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ is0 b;

    public a(vpr vprVar, is0 is0Var) {
        this.a = vprVar;
        this.b = is0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AddressDetailsConfigInteractor$configFlow$$inlined$map$1$2$1 addressDetailsConfigInteractor$configFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof AddressDetailsConfigInteractor$configFlow$$inlined$map$1$2$1) {
            addressDetailsConfigInteractor$configFlow$$inlined$map$1$2$1 = (AddressDetailsConfigInteractor$configFlow$$inlined$map$1$2$1) continuation;
            int i2 = addressDetailsConfigInteractor$configFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressDetailsConfigInteractor$configFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = addressDetailsConfigInteractor$configFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressDetailsConfigInteractor$configFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    gs0 b = this.b.b((TypedConfigsDto.ItemsDto) obj);
                    addressDetailsConfigInteractor$configFlow$$inlined$map$1$2$1.L$0 = null;
                    addressDetailsConfigInteractor$configFlow$$inlined$map$1$2$1.L$1 = null;
                    addressDetailsConfigInteractor$configFlow$$inlined$map$1$2$1.L$2 = null;
                    addressDetailsConfigInteractor$configFlow$$inlined$map$1$2$1.L$3 = null;
                    addressDetailsConfigInteractor$configFlow$$inlined$map$1$2$1.I$0 = 0;
                    addressDetailsConfigInteractor$configFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(b, addressDetailsConfigInteractor$configFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        addressDetailsConfigInteractor$configFlow$$inlined$map$1$2$1 = new AddressDetailsConfigInteractor$configFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = addressDetailsConfigInteractor$configFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressDetailsConfigInteractor$configFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
