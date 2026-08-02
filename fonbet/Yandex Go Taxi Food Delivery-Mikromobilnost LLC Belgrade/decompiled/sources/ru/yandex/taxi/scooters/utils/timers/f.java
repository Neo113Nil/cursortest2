package ru.yandex.taxi.scooters.utils.timers;

import defpackage.ny61;
import defpackage.t7s;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes6.dex */
public final class f implements tpr {
    public final /* synthetic */ tpr a;

    public f(n0 n0Var) {
        Pattern pattern = t7s.a;
        this.a = n0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ScootersTimer$listenTimeFlow$$inlined$map$1$1 scootersTimer$listenTimeFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof ScootersTimer$listenTimeFlow$$inlined$map$1$1) {
            scootersTimer$listenTimeFlow$$inlined$map$1$1 = (ScootersTimer$listenTimeFlow$$inlined$map$1$1) continuation;
            int i2 = scootersTimer$listenTimeFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersTimer$listenTimeFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersTimer$listenTimeFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersTimer$listenTimeFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Pattern pattern = t7s.a;
                    e eVar = new e(vprVar);
                    scootersTimer$listenTimeFlow$$inlined$map$1$1.L$0 = null;
                    scootersTimer$listenTimeFlow$$inlined$map$1$1.L$1 = null;
                    scootersTimer$listenTimeFlow$$inlined$map$1$1.L$2 = null;
                    scootersTimer$listenTimeFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(eVar, scootersTimer$listenTimeFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        scootersTimer$listenTimeFlow$$inlined$map$1$1 = new ScootersTimer$listenTimeFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = scootersTimer$listenTimeFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersTimer$listenTimeFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
