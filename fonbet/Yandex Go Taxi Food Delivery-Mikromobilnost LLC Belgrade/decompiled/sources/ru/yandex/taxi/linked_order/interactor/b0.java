package ru.yandex.taxi.linked_order.interactor;

import defpackage.hj00;
import defpackage.ij00;
import defpackage.ny61;
import defpackage.pc4;
import defpackage.vpr;
import defpackage.w511;
import defpackage.y77;
import defpackage.yq00;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.linked_order.models.data.IconType;

/* loaded from: classes5.dex */
public final class b0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ij00 b;

    public b0(vpr vprVar, ij00 ij00Var) {
        this.a = vprVar;
        this.b = ij00Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LinkedOrderMapOverlayDataInteractor$listenMapPointImages$$inlined$map$2$2$1 linkedOrderMapOverlayDataInteractor$listenMapPointImages$$inlined$map$2$2$1;
        int i;
        Object obj2;
        if (continuation instanceof LinkedOrderMapOverlayDataInteractor$listenMapPointImages$$inlined$map$2$2$1) {
            linkedOrderMapOverlayDataInteractor$listenMapPointImages$$inlined$map$2$2$1 = (LinkedOrderMapOverlayDataInteractor$listenMapPointImages$$inlined$map$2$2$1) continuation;
            int i2 = linkedOrderMapOverlayDataInteractor$listenMapPointImages$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkedOrderMapOverlayDataInteractor$listenMapPointImages$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = linkedOrderMapOverlayDataInteractor$listenMapPointImages$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = linkedOrderMapOverlayDataInteractor$listenMapPointImages$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    ij00 ij00Var = this.b;
                    ij00Var.getClass();
                    int i3 = hj00.a[((IconType) obj).ordinal()];
                    if (i3 == 1) {
                        obj2 = (y77) ij00Var.d.getValue();
                    } else if (i3 == 2) {
                        obj2 = (pc4) ij00Var.c.getValue();
                    } else {
                        if (i3 != 3) {
                            w511.b();
                            return null;
                        }
                        obj2 = (yq00) ij00Var.a.get();
                    }
                    linkedOrderMapOverlayDataInteractor$listenMapPointImages$$inlined$map$2$2$1.L$0 = null;
                    linkedOrderMapOverlayDataInteractor$listenMapPointImages$$inlined$map$2$2$1.L$1 = null;
                    linkedOrderMapOverlayDataInteractor$listenMapPointImages$$inlined$map$2$2$1.L$2 = null;
                    linkedOrderMapOverlayDataInteractor$listenMapPointImages$$inlined$map$2$2$1.L$3 = null;
                    linkedOrderMapOverlayDataInteractor$listenMapPointImages$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(obj2, linkedOrderMapOverlayDataInteractor$listenMapPointImages$$inlined$map$2$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        linkedOrderMapOverlayDataInteractor$listenMapPointImages$$inlined$map$2$2$1 = new LinkedOrderMapOverlayDataInteractor$listenMapPointImages$$inlined$map$2$2$1(this, continuation);
        Object obj32 = linkedOrderMapOverlayDataInteractor$listenMapPointImages$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkedOrderMapOverlayDataInteractor$listenMapPointImages$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
