package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class byb {
    public final cyb a;
    public final gyb b;
    public final Function1 c;
    public final jyb d;
    public final tyb e;
    public final k5i f;
    public final CountDownLatch g;
    public final ReentrantLock h;
    public zxb i;
    public volatile String j;
    public final g06 k;
    public final x3n l;

    public byb(cyb cybVar, gyb gybVar, cyb cybVar2, jyb jybVar, tyb tybVar, k5i k5iVar, jyr jyrVar) {
        gybVar.getClass();
        cybVar2.getClass();
        jybVar.getClass();
        tybVar.getClass();
        k5iVar.getClass();
        jyrVar.getClass();
        this.a = cybVar;
        this.b = gybVar;
        this.c = cybVar2;
        this.d = jybVar;
        this.e = tybVar;
        this.f = k5iVar;
        this.g = new CountDownLatch(1);
        this.h = new ReentrantLock();
        this.k = new g06(this, jyrVar);
        this.l = new x3n(8);
    }

    public static String g(byb bybVar, String str) {
        bybVar.getClass();
        str.getClass();
        gyb gybVar = bybVar.b;
        gybVar.getClass();
        ReentrantLock reentrantLock = gybVar.c;
        reentrantLock.lock();
        try {
            Pair pair = (Pair) gybVar.d.get(str);
            String str2 = pair != null ? (String) pair.a : null;
            if (str2 != null) {
                return str2;
            }
            bybVar.a();
            String a = gybVar.a(str);
            if (a != null) {
                return a;
            }
            vx6 vx6Var = bybVar.e().b;
            ((ReentrantLock) vx6Var.d).lock();
            try {
                g06 g06Var = (g06) vx6Var.b;
                g06Var.getClass();
                String str3 = (String) g06Var.F().get(str);
                if (str3 != null) {
                    return str3;
                }
                x3n x3nVar = bybVar.l;
                x3nVar.getClass();
                ((ReentrantLock) x3nVar.a).lock();
                try {
                    gxb gxbVar = (gxb) ((HashMap) x3nVar.b).get(str);
                    if (gxbVar != null) {
                        return gxbVar.b;
                    }
                    xq0.x("Unknown experiment - ".concat(str));
                    return null;
                } finally {
                }
            } finally {
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a() {
        this.g.await();
        while (true) {
            CountDownLatch countDownLatch = e().c;
            if (countDownLatch.getCount() <= 0) {
                return;
            }
            boolean z = false;
            while (true) {
                try {
                    countDownLatch.await();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final gxb b(Class cls) {
        x3n x3nVar = this.l;
        x3nVar.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) x3nVar.a;
        reentrantLock.lock();
        try {
            gxb gxbVar = (gxb) ((HashMap) x3nVar.c).get(cls);
            if (gxbVar != null) {
                Object cast = cls.cast(gxbVar);
                cast.getClass();
                return (gxb) cast;
            }
            throw new IllegalStateException(("Unknown experiment class - " + cls).toString());
        } finally {
            reentrantLock.unlock();
        }
    }

    public gxb c(lm4 lm4Var) {
        Class b = lm4Var.b();
        b.getClass();
        return b(b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0014, code lost:
    
        r0 = kotlin.text.StringsKt__StringsKt.split$default(r0, new java.lang.String[]{";"}, false, 0, 6, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List d() {
        List split$default;
        String str = (String) e().b.C().get("ABTestIds");
        return (str == null || split$default == null) ? c5b.a : split$default;
    }

    public final zxb e() {
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            zxb zxbVar = this.i;
            if (zxbVar != null) {
                return zxbVar;
            }
            xq0.q("init() was not called");
            return null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void f(String str, boolean z) {
        str.getClass();
        g06 g06Var = this.k;
        g06Var.getClass();
        ((byb) g06Var.d).j = str;
        ReentrantLock reentrantLock = (ReentrantLock) g06Var.c;
        byb bybVar = (byb) g06Var.d;
        reentrantLock.lock();
        try {
            Future<?> submit = ((ExecutorService) g06Var.b).submit(new srb(g06Var, str, z, bybVar, 1));
            reentrantLock.unlock();
            submit.getClass();
            try {
                submit.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause != null) {
                    throw cause;
                }
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
