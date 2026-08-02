package ru.yandex.taxi.hints.interactors;

import defpackage.fnx0;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Optional;
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
        AddressHintsInteractor$addressHintsFlow$$inlined$map$1$2$1 addressHintsInteractor$addressHintsFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof AddressHintsInteractor$addressHintsFlow$$inlined$map$1$2$1) {
            addressHintsInteractor$addressHintsFlow$$inlined$map$1$2$1 = (AddressHintsInteractor$addressHintsFlow$$inlined$map$1$2$1) continuation;
            int i2 = addressHintsInteractor$addressHintsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressHintsInteractor$addressHintsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = addressHintsInteractor$addressHintsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressHintsInteractor$addressHintsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    fnx0 fnx0Var = (fnx0) ((Optional) obj).orElse(null);
                    pex0 pex0Var = fnx0Var != null ? fnx0Var.c : null;
                    addressHintsInteractor$addressHintsFlow$$inlined$map$1$2$1.L$0 = null;
                    addressHintsInteractor$addressHintsFlow$$inlined$map$1$2$1.L$1 = null;
                    addressHintsInteractor$addressHintsFlow$$inlined$map$1$2$1.L$2 = null;
                    addressHintsInteractor$addressHintsFlow$$inlined$map$1$2$1.L$3 = null;
                    addressHintsInteractor$addressHintsFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pex0Var, addressHintsInteractor$addressHintsFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        addressHintsInteractor$addressHintsFlow$$inlined$map$1$2$1 = new AddressHintsInteractor$addressHintsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = addressHintsInteractor$addressHintsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressHintsInteractor$addressHintsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
