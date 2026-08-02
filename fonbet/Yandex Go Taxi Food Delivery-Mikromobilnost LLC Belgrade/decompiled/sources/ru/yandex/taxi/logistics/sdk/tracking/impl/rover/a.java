package ru.yandex.taxi.logistics.sdk.tracking.impl.rover;

import defpackage.bhl0;
import defpackage.cc7;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.ugl0;
import defpackage.zgl0;
import java.util.UUID;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class a {
    public final bhl0 a;
    public final ugl0 b;

    public a(bhl0 bhl0Var, ugl0 ugl0Var) {
        this.a = bhl0Var;
        this.b = ugl0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, String str, String str2, ContinuationImpl continuationImpl) {
        RoverInteractorImpl$submitAction$1 roverInteractorImpl$submitAction$1;
        int i;
        Object value;
        r0 r0Var;
        Object value2;
        if (continuationImpl instanceof RoverInteractorImpl$submitAction$1) {
            roverInteractorImpl$submitAction$1 = (RoverInteractorImpl$submitAction$1) continuationImpl;
            int i2 = roverInteractorImpl$submitAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                roverInteractorImpl$submitAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = roverInteractorImpl$submitAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = roverInteractorImpl$submitAction$1.label;
                ugl0 ugl0Var = this.b;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    r0 r0Var2 = ugl0Var.a;
                    do {
                        value = r0Var2.getValue();
                        ((Boolean) value).getClass();
                    } while (!r0Var2.k(value, Boolean.TRUE));
                    roverInteractorImpl$submitAction$1.L$0 = null;
                    roverInteractorImpl$submitAction$1.L$1 = null;
                    roverInteractorImpl$submitAction$1.L$2 = null;
                    roverInteractorImpl$submitAction$1.label = 1;
                    bhl0 bhl0Var = this.a;
                    bhl0Var.getClass();
                    String uuid = UUID.randomUUID().toString();
                    obj2 = e.y(e.F(e.K(new rol0(new RoverTask$getRoverPollingFlow$1(str, uuid, str2, obj, bhl0Var, null)), new cc7(bhl0Var.b.a(), uuid, 12)), bhl0Var.d.b), roverInteractorImpl$submitAction$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                zgl0 zgl0Var = (zgl0) obj2;
                r0Var = ugl0Var.a;
                do {
                    value2 = r0Var.getValue();
                    ((Boolean) value2).getClass();
                } while (!r0Var.k(value2, Boolean.FALSE));
                return zgl0Var;
            }
        }
        roverInteractorImpl$submitAction$1 = new RoverInteractorImpl$submitAction$1(this, continuationImpl);
        Object obj22 = roverInteractorImpl$submitAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = roverInteractorImpl$submitAction$1.label;
        ugl0 ugl0Var2 = this.b;
        if (i != 0) {
        }
        zgl0 zgl0Var2 = (zgl0) obj22;
        r0Var = ugl0Var2.a;
        do {
            value2 = r0Var.getValue();
            ((Boolean) value2).getClass();
        } while (!r0Var.k(value2, Boolean.FALSE));
        return zgl0Var2;
    }
}
