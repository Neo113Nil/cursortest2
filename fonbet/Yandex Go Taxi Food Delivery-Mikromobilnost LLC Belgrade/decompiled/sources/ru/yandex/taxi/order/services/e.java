package ru.yandex.taxi.order.services;

import defpackage.bvf0;
import defpackage.dxq0;
import defpackage.exq0;
import defpackage.fxq0;
import defpackage.gci0;
import defpackage.gxq0;
import defpackage.hst;
import defpackage.jl40;
import defpackage.jst;
import defpackage.ny61;
import defpackage.r041;
import defpackage.t041;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes9.dex */
public final class e {
    public final t041 a;
    public final AtomicReference b = new AtomicReference(null);
    public final ArrayBlockingQueue c = new ArrayBlockingQueue(16);
    public final r0 d;
    public final gci0 e;

    public e(t041 t041Var) {
        this.a = t041Var;
        r0 c = bvf0.c(fxq0.a);
        this.d = c;
        this.e = kotlinx.coroutines.flow.e.d(c);
    }

    public final void a() {
        r041 a = this.a.a(6000L, "KeepAliveServiceStateHolderWakeLock");
        unr0.C(new Object[]{"KeepAliveServiceStateHolderWakeLock"}, 1, "acquireWakeLock: %s", jst.e);
        tse0.B(this.b, a);
    }

    public final boolean b() {
        return !jl40.l(this.e.a.getValue(), fxq0.a);
    }

    public final boolean c(String str) {
        gxq0 gxq0Var = (gxq0) this.e.a.getValue();
        if (gxq0Var instanceof exq0) {
            return jl40.l(str, ((exq0) gxq0Var).a());
        }
        if (gxq0Var instanceof dxq0) {
            return jl40.l(str, ((dxq0) gxq0Var).a().d());
        }
        if (gxq0Var instanceof fxq0) {
            return false;
        }
        w511.b();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004d -> B:10:0x0050). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(wls wlsVar, ContinuationImpl continuationImpl) {
        ServiceStateHolder$pollForegroundStates$1 serviceStateHolder$pollForegroundStates$1;
        int i;
        dxq0 dxq0Var;
        if (continuationImpl instanceof ServiceStateHolder$pollForegroundStates$1) {
            serviceStateHolder$pollForegroundStates$1 = (ServiceStateHolder$pollForegroundStates$1) continuationImpl;
            int i2 = serviceStateHolder$pollForegroundStates$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                serviceStateHolder$pollForegroundStates$1.label = i2 - Integer.MIN_VALUE;
                Object obj = serviceStateHolder$pollForegroundStates$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = serviceStateHolder$pollForegroundStates$1.label;
                ArrayBlockingQueue arrayBlockingQueue = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    dxq0Var = (dxq0) arrayBlockingQueue.poll();
                    if (dxq0Var != null) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wlsVar = (wls) serviceStateHolder$pollForegroundStates$1.L$0;
                    kotlin.b.b(obj);
                    dxq0Var = (dxq0) arrayBlockingQueue.poll();
                    if (dxq0Var != null) {
                        serviceStateHolder$pollForegroundStates$1.L$0 = wlsVar;
                        serviceStateHolder$pollForegroundStates$1.L$1 = null;
                        serviceStateHolder$pollForegroundStates$1.label = 1;
                        if (wlsVar.invoke(dxq0Var, serviceStateHolder$pollForegroundStates$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        dxq0Var = (dxq0) arrayBlockingQueue.poll();
                        if (dxq0Var != null) {
                            return zy11.a;
                        }
                    }
                }
            }
        }
        serviceStateHolder$pollForegroundStates$1 = new ServiceStateHolder$pollForegroundStates$1(this, continuationImpl);
        Object obj2 = serviceStateHolder$pollForegroundStates$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = serviceStateHolder$pollForegroundStates$1.label;
        ArrayBlockingQueue arrayBlockingQueue2 = this.c;
        if (i != 0) {
        }
    }

    public final void e() {
        r041 r041Var = (r041) this.b.getAndSet(null);
        if (r041Var != null) {
            hst hstVar = jst.e;
            String.format("releaseWakelock: %s", Arrays.copyOf(new Object[]{"KeepAliveServiceStateHolderWakeLock"}, 1));
            hstVar.getClass();
            r041Var.close();
        }
    }

    public final synchronized void f() {
        a();
        jst.e.o("KeepAliveService", "KeepAliveServiceStateHolder::stopSelf");
        r0 r0Var = this.d;
        fxq0 fxq0Var = fxq0.a;
        r0Var.getClass();
        r0Var.m(null, fxq0Var);
    }
}
