package ru.yandex.taxi.linked_order.interactor;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes5.dex */
public final class s implements tpr {
    public final /* synthetic */ m0 a;
    public final /* synthetic */ f0 b;

    public s(m0 m0Var, f0 f0Var) {
        this.a = m0Var;
        this.b = f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        LinkedOrderMapOverlayDataInteractor$listenCarImage$$inlined$map$4$1 linkedOrderMapOverlayDataInteractor$listenCarImage$$inlined$map$4$1;
        int i;
        if (continuation instanceof LinkedOrderMapOverlayDataInteractor$listenCarImage$$inlined$map$4$1) {
            linkedOrderMapOverlayDataInteractor$listenCarImage$$inlined$map$4$1 = (LinkedOrderMapOverlayDataInteractor$listenCarImage$$inlined$map$4$1) continuation;
            int i2 = linkedOrderMapOverlayDataInteractor$listenCarImage$$inlined$map$4$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkedOrderMapOverlayDataInteractor$listenCarImage$$inlined$map$4$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkedOrderMapOverlayDataInteractor$listenCarImage$$inlined$map$4$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = linkedOrderMapOverlayDataInteractor$listenCarImage$$inlined$map$4$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r rVar = new r(vprVar, this.b);
                    linkedOrderMapOverlayDataInteractor$listenCarImage$$inlined$map$4$1.L$0 = null;
                    linkedOrderMapOverlayDataInteractor$listenCarImage$$inlined$map$4$1.L$1 = null;
                    linkedOrderMapOverlayDataInteractor$listenCarImage$$inlined$map$4$1.L$2 = null;
                    linkedOrderMapOverlayDataInteractor$listenCarImage$$inlined$map$4$1.label = 1;
                    if (this.a.collect(rVar, linkedOrderMapOverlayDataInteractor$listenCarImage$$inlined$map$4$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        linkedOrderMapOverlayDataInteractor$listenCarImage$$inlined$map$4$1 = new LinkedOrderMapOverlayDataInteractor$listenCarImage$$inlined$map$4$1(this, continuation);
        Object obj2 = linkedOrderMapOverlayDataInteractor$listenCarImage$$inlined$map$4$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkedOrderMapOverlayDataInteractor$listenCarImage$$inlined$map$4$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
