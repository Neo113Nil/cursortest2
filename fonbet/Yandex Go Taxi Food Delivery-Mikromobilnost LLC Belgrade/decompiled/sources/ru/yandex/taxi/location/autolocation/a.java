package ru.yandex.taxi.location.autolocation;

import com.yandex.go.clarify_address.AddressClarificationReason;
import defpackage.kr0;
import defpackage.ny61;
import defpackage.po21;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.systemrequeirements.location.l;

/* loaded from: classes5.dex */
public final class a {
    public final po21 a;
    public final kr0 b;
    public final l c;

    public a(po21 po21Var, kr0 kr0Var, l lVar) {
        this.a = po21Var;
        this.b = kr0Var;
        this.c = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        AutoLocationInteractor$clarifyAddressByLocationTap$1 autoLocationInteractor$clarifyAddressByLocationTap$1;
        int i;
        if (continuation instanceof AutoLocationInteractor$clarifyAddressByLocationTap$1) {
            autoLocationInteractor$clarifyAddressByLocationTap$1 = (AutoLocationInteractor$clarifyAddressByLocationTap$1) continuation;
            int i2 = autoLocationInteractor$clarifyAddressByLocationTap$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoLocationInteractor$clarifyAddressByLocationTap$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoLocationInteractor$clarifyAddressByLocationTap$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoLocationInteractor$clarifyAddressByLocationTap$1.label;
                kr0 kr0Var = this.b;
                if (i != 0) {
                    b.b(obj);
                    autoLocationInteractor$clarifyAddressByLocationTap$1.label = 1;
                    obj = ((com.yandex.go.clarify_address.a) kr0Var).b.a(autoLocationInteractor$clarifyAddressByLocationTap$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                ((com.yandex.go.clarify_address.a) kr0Var).c(((Boolean) obj).booleanValue(), AddressClarificationReason.LocationButtonTap);
                return zy11.a;
            }
        }
        autoLocationInteractor$clarifyAddressByLocationTap$1 = new AutoLocationInteractor$clarifyAddressByLocationTap$1(this, continuation);
        Object obj2 = autoLocationInteractor$clarifyAddressByLocationTap$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoLocationInteractor$clarifyAddressByLocationTap$1.label;
        kr0 kr0Var2 = this.b;
        if (i != 0) {
        }
        ((com.yandex.go.clarify_address.a) kr0Var2).c(((Boolean) obj2).booleanValue(), AddressClarificationReason.LocationButtonTap);
        return zy11.a;
    }
}
