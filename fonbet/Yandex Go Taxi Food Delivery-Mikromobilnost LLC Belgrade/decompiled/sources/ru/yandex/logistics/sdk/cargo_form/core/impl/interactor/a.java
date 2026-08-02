package ru.yandex.logistics.sdk.cargo_form.core.impl.interactor;

import com.google.ar.core.ArCoreApk;
import defpackage.j0g;
import defpackage.l9i;
import defpackage.ny61;
import defpackage.p33;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ j0g b;

    public a(vpr vprVar, j0g j0gVar) {
        this.a = vprVar;
        this.b = j0gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliveryExtraInteractor$deliveryExtraFlow$$inlined$map$1$2$1 deliveryExtraInteractor$deliveryExtraFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof DeliveryExtraInteractor$deliveryExtraFlow$$inlined$map$1$2$1) {
            deliveryExtraInteractor$deliveryExtraFlow$$inlined$map$1$2$1 = (DeliveryExtraInteractor$deliveryExtraFlow$$inlined$map$1$2$1) continuation;
            int i2 = deliveryExtraInteractor$deliveryExtraFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryExtraInteractor$deliveryExtraFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deliveryExtraInteractor$deliveryExtraFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryExtraInteractor$deliveryExtraFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    boolean z = ((String) obj) != null;
                    p33 p33Var = (p33) this.b.b;
                    p33Var.getClass();
                    l9i l9iVar = new l9i(z, ArCoreApk.getInstance().checkAvailability(p33Var.a) == ArCoreApk.Availability.SUPPORTED_INSTALLED);
                    deliveryExtraInteractor$deliveryExtraFlow$$inlined$map$1$2$1.L$0 = null;
                    deliveryExtraInteractor$deliveryExtraFlow$$inlined$map$1$2$1.L$1 = null;
                    deliveryExtraInteractor$deliveryExtraFlow$$inlined$map$1$2$1.L$2 = null;
                    deliveryExtraInteractor$deliveryExtraFlow$$inlined$map$1$2$1.L$3 = null;
                    deliveryExtraInteractor$deliveryExtraFlow$$inlined$map$1$2$1.I$0 = 0;
                    deliveryExtraInteractor$deliveryExtraFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(l9iVar, deliveryExtraInteractor$deliveryExtraFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        deliveryExtraInteractor$deliveryExtraFlow$$inlined$map$1$2$1 = new DeliveryExtraInteractor$deliveryExtraFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = deliveryExtraInteractor$deliveryExtraFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryExtraInteractor$deliveryExtraFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
