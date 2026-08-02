package ru.yandex.taxi.search.presenter;

import com.yandex.go.address.models.Address;
import defpackage.ftj0;
import defpackage.gtj0;
import defpackage.jtj0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
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
        BaseAddressSearchFieldPresenter$getAddressForSuggestMenu$$inlined$map$1$2$1 baseAddressSearchFieldPresenter$getAddressForSuggestMenu$$inlined$map$1$2$1;
        int i;
        Address address;
        if (continuation instanceof BaseAddressSearchFieldPresenter$getAddressForSuggestMenu$$inlined$map$1$2$1) {
            baseAddressSearchFieldPresenter$getAddressForSuggestMenu$$inlined$map$1$2$1 = (BaseAddressSearchFieldPresenter$getAddressForSuggestMenu$$inlined$map$1$2$1) continuation;
            int i2 = baseAddressSearchFieldPresenter$getAddressForSuggestMenu$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseAddressSearchFieldPresenter$getAddressForSuggestMenu$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = baseAddressSearchFieldPresenter$getAddressForSuggestMenu$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseAddressSearchFieldPresenter$getAddressForSuggestMenu$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    jtj0 jtj0Var = (jtj0) obj;
                    if (jtj0Var instanceof gtj0) {
                        address = ((gtj0) jtj0Var).a.a;
                    } else {
                        if (!(jtj0Var instanceof ftj0)) {
                            throw new RuntimeException();
                        }
                        address = ((ftj0) jtj0Var).a.a;
                    }
                    baseAddressSearchFieldPresenter$getAddressForSuggestMenu$$inlined$map$1$2$1.L$0 = null;
                    baseAddressSearchFieldPresenter$getAddressForSuggestMenu$$inlined$map$1$2$1.L$1 = null;
                    baseAddressSearchFieldPresenter$getAddressForSuggestMenu$$inlined$map$1$2$1.L$2 = null;
                    baseAddressSearchFieldPresenter$getAddressForSuggestMenu$$inlined$map$1$2$1.L$3 = null;
                    baseAddressSearchFieldPresenter$getAddressForSuggestMenu$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(address, baseAddressSearchFieldPresenter$getAddressForSuggestMenu$$inlined$map$1$2$1) == coroutineSingletons) {
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
        baseAddressSearchFieldPresenter$getAddressForSuggestMenu$$inlined$map$1$2$1 = new BaseAddressSearchFieldPresenter$getAddressForSuggestMenu$$inlined$map$1$2$1(this, continuation);
        Object obj22 = baseAddressSearchFieldPresenter$getAddressForSuggestMenu$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseAddressSearchFieldPresenter$getAddressForSuggestMenu$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
