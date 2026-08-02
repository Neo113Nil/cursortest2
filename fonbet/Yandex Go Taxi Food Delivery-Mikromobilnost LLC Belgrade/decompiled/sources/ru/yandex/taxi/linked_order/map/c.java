package ru.yandex.taxi.linked_order.map;

import defpackage.m201;
import defpackage.ny61;
import defpackage.t201;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LinkedOrderMapOverlayPresenter$registerForUpdatesInternal$$inlined$map$1$2$1 linkedOrderMapOverlayPresenter$registerForUpdatesInternal$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof LinkedOrderMapOverlayPresenter$registerForUpdatesInternal$$inlined$map$1$2$1) {
            linkedOrderMapOverlayPresenter$registerForUpdatesInternal$$inlined$map$1$2$1 = (LinkedOrderMapOverlayPresenter$registerForUpdatesInternal$$inlined$map$1$2$1) continuation;
            int i2 = linkedOrderMapOverlayPresenter$registerForUpdatesInternal$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkedOrderMapOverlayPresenter$registerForUpdatesInternal$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = linkedOrderMapOverlayPresenter$registerForUpdatesInternal$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = linkedOrderMapOverlayPresenter$registerForUpdatesInternal$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    t201 t201Var = ((m201) obj).a;
                    linkedOrderMapOverlayPresenter$registerForUpdatesInternal$$inlined$map$1$2$1.L$0 = null;
                    linkedOrderMapOverlayPresenter$registerForUpdatesInternal$$inlined$map$1$2$1.L$1 = null;
                    linkedOrderMapOverlayPresenter$registerForUpdatesInternal$$inlined$map$1$2$1.L$2 = null;
                    linkedOrderMapOverlayPresenter$registerForUpdatesInternal$$inlined$map$1$2$1.L$3 = null;
                    linkedOrderMapOverlayPresenter$registerForUpdatesInternal$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(t201Var, linkedOrderMapOverlayPresenter$registerForUpdatesInternal$$inlined$map$1$2$1) == coroutineSingletons) {
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
        linkedOrderMapOverlayPresenter$registerForUpdatesInternal$$inlined$map$1$2$1 = new LinkedOrderMapOverlayPresenter$registerForUpdatesInternal$$inlined$map$1$2$1(this, continuation);
        Object obj22 = linkedOrderMapOverlayPresenter$registerForUpdatesInternal$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkedOrderMapOverlayPresenter$registerForUpdatesInternal$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
