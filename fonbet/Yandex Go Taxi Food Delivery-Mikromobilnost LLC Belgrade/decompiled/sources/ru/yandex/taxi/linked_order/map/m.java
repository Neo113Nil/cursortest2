package ru.yandex.taxi.linked_order.map;

import defpackage.ny61;
import defpackage.t201;
import defpackage.vpr;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class m implements vpr {
    public final /* synthetic */ vpr a;

    public m(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LinkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$mapNotNull$1$2$1 linkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof LinkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$mapNotNull$1$2$1) {
            linkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$mapNotNull$1$2$1 = (LinkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = linkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = linkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = linkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    zzs zzsVar = ((t201) obj).a;
                    if (zzsVar != null) {
                        linkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$mapNotNull$1$2$1.L$0 = null;
                        linkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$mapNotNull$1$2$1.L$1 = null;
                        linkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$mapNotNull$1$2$1.L$2 = null;
                        linkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$mapNotNull$1$2$1.L$3 = null;
                        linkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$mapNotNull$1$2$1.L$4 = null;
                        linkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(zzsVar, linkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        linkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$mapNotNull$1$2$1 = new LinkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = linkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkedOrderRouteProgressTracker$listenRouteParams$lambda$1$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
