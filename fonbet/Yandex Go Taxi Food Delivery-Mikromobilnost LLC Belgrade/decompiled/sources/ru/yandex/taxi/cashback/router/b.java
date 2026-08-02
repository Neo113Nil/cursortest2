package ru.yandex.taxi.cashback.router;

import defpackage.e5c;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes5.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ e5c b;

    public b(n0 n0Var, e5c e5cVar) {
        this.a = n0Var;
        this.b = e5cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ClosePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$1 closePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$1;
        int i;
        if (continuation instanceof ClosePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$1) {
            closePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$1 = (ClosePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$1) continuation;
            int i2 = closePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                closePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = closePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = closePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    closePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$1.L$0 = null;
                    closePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$1.L$1 = null;
                    closePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$1.L$2 = null;
                    closePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(aVar, closePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$1) == coroutineSingletons) {
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
        closePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$1 = new ClosePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$1(this, continuation);
        Object obj2 = closePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = closePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
