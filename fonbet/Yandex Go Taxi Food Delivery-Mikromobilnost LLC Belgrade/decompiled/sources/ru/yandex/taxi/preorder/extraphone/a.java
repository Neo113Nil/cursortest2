package ru.yandex.taxi.preorder.extraphone;

import com.yandex.go.taxi.order.models.api.preorder.extraphone.ExtraPhoneContact;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;
    public final /* synthetic */ String c;

    public a(vpr vprVar, e eVar, String str) {
        this.a = vprVar;
        this.b = eVar;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ExtraPhoneProvider$contactChangedForTariff$$inlined$map$1$2$1 extraPhoneProvider$contactChangedForTariff$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ExtraPhoneProvider$contactChangedForTariff$$inlined$map$1$2$1) {
            extraPhoneProvider$contactChangedForTariff$$inlined$map$1$2$1 = (ExtraPhoneProvider$contactChangedForTariff$$inlined$map$1$2$1) continuation;
            int i2 = extraPhoneProvider$contactChangedForTariff$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                extraPhoneProvider$contactChangedForTariff$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = extraPhoneProvider$contactChangedForTariff$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = extraPhoneProvider$contactChangedForTariff$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ExtraPhoneContact c = this.b.c(this.c);
                    extraPhoneProvider$contactChangedForTariff$$inlined$map$1$2$1.L$0 = null;
                    extraPhoneProvider$contactChangedForTariff$$inlined$map$1$2$1.L$1 = null;
                    extraPhoneProvider$contactChangedForTariff$$inlined$map$1$2$1.L$2 = null;
                    extraPhoneProvider$contactChangedForTariff$$inlined$map$1$2$1.L$3 = null;
                    extraPhoneProvider$contactChangedForTariff$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(c, extraPhoneProvider$contactChangedForTariff$$inlined$map$1$2$1) == coroutineSingletons) {
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
        extraPhoneProvider$contactChangedForTariff$$inlined$map$1$2$1 = new ExtraPhoneProvider$contactChangedForTariff$$inlined$map$1$2$1(this, continuation);
        Object obj22 = extraPhoneProvider$contactChangedForTariff$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = extraPhoneProvider$contactChangedForTariff$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
