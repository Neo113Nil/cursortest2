package ru.yandex.taxi.routeselector.presentation;

import com.yandex.go.pin.api.v1.Pin$State;
import defpackage.ny61;
import defpackage.ulq0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.address.repository.AddressResolveRepository;

/* loaded from: classes6.dex */
public final class v implements vpr {
    public final /* synthetic */ vpr a;

    public v(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SelectorPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1 selectorPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1;
        int i;
        Pin$State pin$State;
        if (continuation instanceof SelectorPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1) {
            selectorPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1 = (SelectorPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = selectorPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectorPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = selectorPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectorPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    int i3 = ulq0.a[((AddressResolveRepository.State) obj).ordinal()];
                    if (i3 == 1 || i3 == 2) {
                        pin$State = Pin$State.IN_PROGRESS;
                    } else if (i3 == 3 || i3 == 4) {
                        pin$State = Pin$State.ERROR;
                    } else {
                        if (i3 != 5) {
                            w511.b();
                            return null;
                        }
                        pin$State = Pin$State.IDLE;
                    }
                    selectorPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1.L$0 = null;
                    selectorPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1.L$1 = null;
                    selectorPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1.L$2 = null;
                    selectorPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1.L$3 = null;
                    selectorPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pin$State, selectorPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        selectorPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1 = new SelectorPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = selectorPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectorPinV1DataRepository$fixedStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
