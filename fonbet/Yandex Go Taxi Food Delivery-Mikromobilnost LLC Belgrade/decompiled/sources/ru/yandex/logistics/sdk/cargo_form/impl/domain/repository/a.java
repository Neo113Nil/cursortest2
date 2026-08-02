package ru.yandex.logistics.sdk.cargo_form.impl.domain.repository;

import defpackage.bt0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.logistics.sdk.cargo_form.core.api.repository.FormLoadingStateRepository$State;
import ru.yandex.taxi.logistics.sdk.address_details.api.ui.AddressDetailsState;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ bt0 b;

    public a(vpr vprVar, bt0 bt0Var) {
        this.a = vprVar;
        this.b = bt0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AddressDetailsLoadingStateRepository$special$$inlined$map$1$2$1 addressDetailsLoadingStateRepository$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof AddressDetailsLoadingStateRepository$special$$inlined$map$1$2$1) {
            addressDetailsLoadingStateRepository$special$$inlined$map$1$2$1 = (AddressDetailsLoadingStateRepository$special$$inlined$map$1$2$1) continuation;
            int i2 = addressDetailsLoadingStateRepository$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressDetailsLoadingStateRepository$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = addressDetailsLoadingStateRepository$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressDetailsLoadingStateRepository$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    b.b(obj2);
                    FormLoadingStateRepository$State formLoadingStateRepository$State = (FormLoadingStateRepository$State) obj;
                    FormLoadingStateRepository$State formLoadingStateRepository$State2 = FormLoadingStateRepository$State.LOADING;
                    bt0 bt0Var = this.b;
                    if (formLoadingStateRepository$State != formLoadingStateRepository$State2) {
                        bt0Var.a = AddressDetailsState.READY;
                    }
                    AddressDetailsState addressDetailsState = bt0Var.a;
                    addressDetailsLoadingStateRepository$special$$inlined$map$1$2$1.L$0 = null;
                    addressDetailsLoadingStateRepository$special$$inlined$map$1$2$1.L$1 = null;
                    addressDetailsLoadingStateRepository$special$$inlined$map$1$2$1.L$2 = null;
                    addressDetailsLoadingStateRepository$special$$inlined$map$1$2$1.L$3 = null;
                    addressDetailsLoadingStateRepository$special$$inlined$map$1$2$1.I$0 = 0;
                    addressDetailsLoadingStateRepository$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(addressDetailsState, addressDetailsLoadingStateRepository$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                }
                return zy11.a;
            }
        }
        addressDetailsLoadingStateRepository$special$$inlined$map$1$2$1 = new AddressDetailsLoadingStateRepository$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = addressDetailsLoadingStateRepository$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressDetailsLoadingStateRepository$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
