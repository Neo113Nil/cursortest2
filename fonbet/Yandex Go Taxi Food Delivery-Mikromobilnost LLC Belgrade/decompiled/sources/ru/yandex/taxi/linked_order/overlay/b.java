package ru.yandex.taxi.linked_order.overlay;

import defpackage.mly;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.g;

/* loaded from: classes5.dex */
public final class b implements tpr {
    public final /* synthetic */ g a;
    public final /* synthetic */ mly b;

    public b(g gVar, mly mlyVar) {
        this.a = gVar;
        this.b = mlyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        LinkedMultiOrderOverlay$start$$inlined$map$1$1 linkedMultiOrderOverlay$start$$inlined$map$1$1;
        int i;
        if (continuation instanceof LinkedMultiOrderOverlay$start$$inlined$map$1$1) {
            linkedMultiOrderOverlay$start$$inlined$map$1$1 = (LinkedMultiOrderOverlay$start$$inlined$map$1$1) continuation;
            int i2 = linkedMultiOrderOverlay$start$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkedMultiOrderOverlay$start$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkedMultiOrderOverlay$start$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = linkedMultiOrderOverlay$start$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    linkedMultiOrderOverlay$start$$inlined$map$1$1.L$0 = null;
                    linkedMultiOrderOverlay$start$$inlined$map$1$1.L$1 = null;
                    linkedMultiOrderOverlay$start$$inlined$map$1$1.L$2 = null;
                    linkedMultiOrderOverlay$start$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, linkedMultiOrderOverlay$start$$inlined$map$1$1) == coroutineSingletons) {
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
        linkedMultiOrderOverlay$start$$inlined$map$1$1 = new LinkedMultiOrderOverlay$start$$inlined$map$1$1(this, continuation);
        Object obj2 = linkedMultiOrderOverlay$start$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkedMultiOrderOverlay$start$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
