package W1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class e extends y {

    /* renamed from: h, reason: collision with root package name */
    public static final ReentrantLock f1864h;

    /* renamed from: i, reason: collision with root package name */
    public static final Condition f1865i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f1866j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f1867k;

    /* renamed from: l, reason: collision with root package name */
    public static e f1868l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1869e;

    /* renamed from: f, reason: collision with root package name */
    public e f1870f;

    /* renamed from: g, reason: collision with root package name */
    public long f1871g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f1864h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.i.d(newCondition, "lock.newCondition()");
        f1865i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f1866j = millis;
        f1867k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        e eVar;
        long j2 = this.f1914c;
        boolean z2 = this.f1912a;
        if (j2 != 0 || z2) {
            ReentrantLock reentrantLock = f1864h;
            reentrantLock.lock();
            try {
                if (this.f1869e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f1869e = true;
                if (f1868l == null) {
                    f1868l = new e();
                    b bVar = new b("Okio Watchdog");
                    bVar.setDaemon(true);
                    bVar.start();
                }
                long nanoTime = System.nanoTime();
                if (j2 != 0 && z2) {
                    this.f1871g = Math.min(j2, c() - nanoTime) + nanoTime;
                } else if (j2 != 0) {
                    this.f1871g = j2 + nanoTime;
                } else {
                    if (!z2) {
                        throw new AssertionError();
                    }
                    this.f1871g = c();
                }
                long j3 = this.f1871g - nanoTime;
                e eVar2 = f1868l;
                kotlin.jvm.internal.i.b(eVar2);
                while (true) {
                    eVar = eVar2.f1870f;
                    if (eVar == null || j3 < eVar.f1871g - nanoTime) {
                        break;
                    } else {
                        eVar2 = eVar;
                    }
                }
                this.f1870f = eVar;
                eVar2.f1870f = this;
                if (eVar2 == f1868l) {
                    f1865i.signal();
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f1864h;
        reentrantLock.lock();
        try {
            if (!this.f1869e) {
                return false;
            }
            this.f1869e = false;
            e eVar = f1868l;
            while (eVar != null) {
                e eVar2 = eVar.f1870f;
                if (eVar2 == this) {
                    eVar.f1870f = this.f1870f;
                    this.f1870f = null;
                    return false;
                }
                eVar = eVar2;
            }
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j() {
    }
}
