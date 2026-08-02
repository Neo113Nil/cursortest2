package ru.yandex.taxi.scooters.utils.timers;

import defpackage.ny61;
import defpackage.t7s;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;

    public e(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersTimer$listenTimeFlow$$inlined$map$1$2$1 scootersTimer$listenTimeFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ScootersTimer$listenTimeFlow$$inlined$map$1$2$1) {
            scootersTimer$listenTimeFlow$$inlined$map$1$2$1 = (ScootersTimer$listenTimeFlow$$inlined$map$1$2$1) continuation;
            int i2 = scootersTimer$listenTimeFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersTimer$listenTimeFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersTimer$listenTimeFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersTimer$listenTimeFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String j = t7s.j(((Number) obj).longValue());
                    scootersTimer$listenTimeFlow$$inlined$map$1$2$1.L$0 = null;
                    scootersTimer$listenTimeFlow$$inlined$map$1$2$1.L$1 = null;
                    scootersTimer$listenTimeFlow$$inlined$map$1$2$1.L$2 = null;
                    scootersTimer$listenTimeFlow$$inlined$map$1$2$1.L$3 = null;
                    scootersTimer$listenTimeFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(j, scootersTimer$listenTimeFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        scootersTimer$listenTimeFlow$$inlined$map$1$2$1 = new ScootersTimer$listenTimeFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = scootersTimer$listenTimeFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersTimer$listenTimeFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
