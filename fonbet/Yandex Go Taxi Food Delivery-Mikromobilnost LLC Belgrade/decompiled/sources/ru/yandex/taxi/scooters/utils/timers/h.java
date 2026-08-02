package ru.yandex.taxi.scooters.utils.timers;

import defpackage.ea90;
import defpackage.f4b1;
import defpackage.fbn0;
import defpackage.g050;
import defpackage.gbn0;
import defpackage.gtq0;
import defpackage.lrj0;
import defpackage.nrk0;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.se90;
import defpackage.tje;
import defpackage.tse;
import defpackage.w511;
import defpackage.yuo0;
import defpackage.z5p0;
import defpackage.zuo0;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class h implements yuo0 {
    public final tse a;
    public final kotlinx.coroutines.sync.a b = gtq0.a();
    public final LinkedHashMap c = new LinkedHashMap();

    public h(tse tseVar) {
        this.a = tseVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:11:0x0052, B:13:0x005a, B:14:0x0078, B:18:0x005f, B:20:0x0063, B:22:0x0067, B:23:0x006c, B:25:0x0070, B:27:0x0074, B:28:0x0081, B:29:0x0086), top: B:10:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:11:0x0052, B:13:0x005a, B:14:0x0078, B:18:0x005f, B:20:0x0063, B:22:0x0067, B:23:0x006c, B:25:0x0070, B:27:0x0074, B:28:0x0081, B:29:0x0086), top: B:10:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v3, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(h hVar, String str, ScootersTimersRepository$TimerDirection scootersTimersRepository$TimerDirection, ContinuationImpl continuationImpl) {
        ScootersTimersRepository$registerTimer$1 scootersTimersRepository$registerTimer$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        z5p0 z5p0Var;
        LinkedHashMap linkedHashMap = hVar.c;
        try {
            if (continuationImpl instanceof ScootersTimersRepository$registerTimer$1) {
                scootersTimersRepository$registerTimer$1 = (ScootersTimersRepository$registerTimer$1) continuationImpl;
                int i2 = scootersTimersRepository$registerTimer$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersTimersRepository$registerTimer$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersTimersRepository$registerTimer$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersTimersRepository$registerTimer$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = hVar.b;
                        scootersTimersRepository$registerTimer$1.L$0 = str;
                        scootersTimersRepository$registerTimer$1.L$1 = scootersTimersRepository$TimerDirection;
                        scootersTimersRepository$registerTimer$1.L$2 = aVar;
                        scootersTimersRepository$registerTimer$1.label = 1;
                        if (aVar.a(scootersTimersRepository$registerTimer$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r7 = (g050) scootersTimersRepository$registerTimer$1.L$2;
                        scootersTimersRepository$TimerDirection = (ScootersTimersRepository$TimerDirection) scootersTimersRepository$registerTimer$1.L$1;
                        String str2 = (String) scootersTimersRepository$registerTimer$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r7;
                        str = str2;
                    }
                    z5p0Var = (z5p0) linkedHashMap.get(str);
                    if (z5p0Var != null) {
                        z5p0Var = hVar.c(scootersTimersRepository$TimerDirection);
                    } else if (z5p0Var instanceof gbn0) {
                        if (scootersTimersRepository$TimerDirection != ScootersTimersRepository$TimerDirection.UP) {
                            z5p0Var = hVar.c(scootersTimersRepository$TimerDirection);
                        }
                    } else {
                        if (!(z5p0Var instanceof fbn0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (scootersTimersRepository$TimerDirection != ScootersTimersRepository$TimerDirection.DOWN) {
                            z5p0Var = hVar.c(scootersTimersRepository$TimerDirection);
                        }
                    }
                    linkedHashMap.put(str, z5p0Var);
                    return z5p0Var;
                }
            }
            z5p0Var = (z5p0) linkedHashMap.get(str);
            if (z5p0Var != null) {
            }
            linkedHashMap.put(str, z5p0Var);
            return z5p0Var;
        } finally {
            aVar.d(null);
        }
        scootersTimersRepository$registerTimer$1 = new ScootersTimersRepository$registerTimer$1(hVar, continuationImpl);
        Object obj2 = scootersTimersRepository$registerTimer$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersTimersRepository$registerTimer$1.label;
        if (i != 0) {
        }
    }

    @Override // defpackage.yuo0
    public final void a(String str) {
        tje.N(this.a, null, null, new ScootersTimersRepository$clean$1(this, str, null), 3);
    }

    public final z5p0 c(ScootersTimersRepository$TimerDirection scootersTimersRepository$TimerDirection) {
        int i = g.a[scootersTimersRepository$TimerDirection.ordinal()];
        tse tseVar = this.a;
        if (i == 1) {
            return new fbn0(tseVar);
        }
        if (i == 2) {
            return new gbn0(tseVar);
        }
        w511.b();
        return null;
    }

    public final rol0 d(zuo0 zuo0Var) {
        long t;
        String sessionId = zuo0Var.getSessionId();
        String c = f4b1.c(zuo0Var);
        if (zuo0Var instanceof ea90) {
            t = ((ea90) zuo0Var).t();
        } else if (zuo0Var instanceof se90) {
            t = ((se90) zuo0Var).t();
        } else if (zuo0Var instanceof nrk0) {
            t = ((nrk0) zuo0Var).t();
        } else {
            if (!(zuo0Var instanceof lrj0)) {
                w511.b();
                return null;
            }
            t = ((lrj0) zuo0Var).t();
        }
        return new rol0(new ScootersTimersRepository$listenTime$1(this, sessionId, zuo0Var instanceof lrj0 ? ScootersTimersRepository$TimerDirection.DOWN : ScootersTimersRepository$TimerDirection.UP, c, t, null));
    }
}
