package ru.yandex.taxi.linked_order.interactor;

import defpackage.ny61;
import defpackage.scc;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class t implements vpr {
    public final /* synthetic */ vpr a;

    public t(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LinkedOrderMapOverlayDataInteractor$listenFocusDestination$$inlined$map$1$2$1 linkedOrderMapOverlayDataInteractor$listenFocusDestination$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof LinkedOrderMapOverlayDataInteractor$listenFocusDestination$$inlined$map$1$2$1) {
            linkedOrderMapOverlayDataInteractor$listenFocusDestination$$inlined$map$1$2$1 = (LinkedOrderMapOverlayDataInteractor$listenFocusDestination$$inlined$map$1$2$1) continuation;
            int i2 = linkedOrderMapOverlayDataInteractor$listenFocusDestination$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkedOrderMapOverlayDataInteractor$listenFocusDestination$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = linkedOrderMapOverlayDataInteractor$listenFocusDestination$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = linkedOrderMapOverlayDataInteractor$listenFocusDestination$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List h = scc.h(((Pair) obj).f());
                    linkedOrderMapOverlayDataInteractor$listenFocusDestination$$inlined$map$1$2$1.L$0 = null;
                    linkedOrderMapOverlayDataInteractor$listenFocusDestination$$inlined$map$1$2$1.L$1 = null;
                    linkedOrderMapOverlayDataInteractor$listenFocusDestination$$inlined$map$1$2$1.L$2 = null;
                    linkedOrderMapOverlayDataInteractor$listenFocusDestination$$inlined$map$1$2$1.L$3 = null;
                    linkedOrderMapOverlayDataInteractor$listenFocusDestination$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(h, linkedOrderMapOverlayDataInteractor$listenFocusDestination$$inlined$map$1$2$1) == coroutineSingletons) {
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
        linkedOrderMapOverlayDataInteractor$listenFocusDestination$$inlined$map$1$2$1 = new LinkedOrderMapOverlayDataInteractor$listenFocusDestination$$inlined$map$1$2$1(this, continuation);
        Object obj22 = linkedOrderMapOverlayDataInteractor$listenFocusDestination$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkedOrderMapOverlayDataInteractor$listenFocusDestination$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
