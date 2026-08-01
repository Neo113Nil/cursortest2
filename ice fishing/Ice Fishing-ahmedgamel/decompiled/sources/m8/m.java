package m8;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class m implements j {

    /* renamed from: n, reason: collision with root package name */
    public final x f39367n;

    /* renamed from: u, reason: collision with root package name */
    public final l8.d f39368u;

    /* renamed from: v, reason: collision with root package name */
    public final long f39369v;

    /* renamed from: w, reason: collision with root package name */
    public long f39370w;

    /* renamed from: x, reason: collision with root package name */
    public final CopyOnWriteArrayList f39371x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedBlockingDeque f39372y;

    public m(x xVar, l8.d taskRunner) {
        kotlin.jvm.internal.h.e(taskRunner, "taskRunner");
        this.f39367n = xVar;
        this.f39368u = taskRunner;
        this.f39369v = TimeUnit.MILLISECONDS.toNanos(250L);
        this.f39370w = Long.MIN_VALUE;
        this.f39371x = new CopyOnWriteArrayList();
        this.f39372y = new LinkedBlockingDeque();
    }

    public final void a() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f39371x;
        Iterator it = copyOnWriteArrayList.iterator();
        kotlin.jvm.internal.h.d(it, "iterator(...)");
        while (it.hasNext()) {
            w wVar = (w) it.next();
            wVar.cancel();
            w a9 = wVar.a();
            if (a9 != null) {
                this.f39367n.v().addLast(a9);
            }
        }
        copyOnWriteArrayList.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:4:0x0004, B:7:0x000c, B:13:0x001a, B:15:0x0020, B:22:0x0045, B:66:0x004f, B:69:0x005a, B:27:0x0064, B:29:0x006c, B:33:0x0075, B:35:0x007e, B:36:0x0082, B:38:0x0086, B:43:0x008d, B:46:0x0097, B:48:0x009b, B:51:0x00a1, B:52:0x00a5, B:54:0x00a9, B:55:0x00aa, B:58:0x00ae, B:71:0x003a, B:73:0x00b7, B:74:0x00be), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:4:0x0004, B:7:0x000c, B:13:0x001a, B:15:0x0020, B:22:0x0045, B:66:0x004f, B:69:0x005a, B:27:0x0064, B:29:0x006c, B:33:0x0075, B:35:0x007e, B:36:0x0082, B:38:0x0086, B:43:0x008d, B:46:0x0097, B:48:0x009b, B:51:0x00a1, B:52:0x00a5, B:54:0x00a9, B:55:0x00aa, B:58:0x00ae, B:71:0x003a, B:73:0x00b7, B:74:0x00be), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:4:0x0004, B:7:0x000c, B:13:0x001a, B:15:0x0020, B:22:0x0045, B:66:0x004f, B:69:0x005a, B:27:0x0064, B:29:0x006c, B:33:0x0075, B:35:0x007e, B:36:0x0082, B:38:0x0086, B:43:0x008d, B:46:0x0097, B:48:0x009b, B:51:0x00a1, B:52:0x00a5, B:54:0x00a9, B:55:0x00aa, B:58:0x00ae, B:71:0x003a, B:73:0x00b7, B:74:0x00be), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0064 A[SYNTHETIC] */
    @Override // m8.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r b() {
        v d2;
        Throwable th;
        e eVar;
        IOException iOException = null;
        while (true) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f39371x;
            try {
                boolean isEmpty = copyOnWriteArrayList.isEmpty();
                x xVar = this.f39367n;
                if (isEmpty && !xVar.s(null)) {
                    a();
                    kotlin.jvm.internal.h.b(iOException);
                    throw iOException;
                }
                if (xVar.m()) {
                    throw new IOException("Canceled");
                }
                F1.a aVar = this.f39368u.f38948a;
                long nanoTime = System.nanoTime();
                long j6 = this.f39370w - nanoTime;
                if (!copyOnWriteArrayList.isEmpty() && j6 > 0) {
                    d2 = null;
                    if (d2 != null) {
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        if (!copyOnWriteArrayList.isEmpty() && (d2 = (v) this.f39372y.poll(j6, timeUnit)) != null) {
                            copyOnWriteArrayList.remove(d2.f39433a);
                            if (d2 != null) {
                            }
                        }
                        d2 = null;
                        if (d2 != null) {
                        }
                    }
                    w wVar = d2.f39433a;
                    boolean z3 = false;
                    if (d2.f39434b != null && d2.f39435c == null) {
                        a();
                        if (!wVar.isReady()) {
                            d2 = wVar.e();
                        }
                        if (d2.f39434b == null && d2.f39435c == null) {
                            z3 = true;
                        }
                        if (z3) {
                            r b9 = d2.f39433a.b();
                            a();
                            return b9;
                        }
                    }
                    th = d2.f39435c;
                    if (th != null) {
                        if (!(th instanceof IOException)) {
                            throw th;
                        }
                        if (iOException == null) {
                            iOException = (IOException) th;
                        } else {
                            X2.e.y(iOException, th);
                        }
                    }
                    eVar = d2.f39434b;
                    if (eVar == null) {
                        xVar.v().addFirst(eVar);
                    }
                }
                d2 = d();
                j6 = this.f39369v;
                this.f39370w = nanoTime + j6;
                if (d2 != null) {
                }
                w wVar2 = d2.f39433a;
                boolean z32 = false;
                if (d2.f39434b != null && d2.f39435c == null) {
                }
                th = d2.f39435c;
                if (th != null) {
                }
                eVar = d2.f39434b;
                if (eVar == null) {
                }
            } catch (Throwable th2) {
                a();
                throw th2;
            }
        }
    }

    @Override // m8.j
    public final x c() {
        return this.f39367n;
    }

    public final v d() {
        w kVar;
        x xVar = this.f39367n;
        if (xVar.s(null)) {
            try {
                kVar = xVar.w();
            } catch (Throwable th) {
                kVar = new k(th);
            }
            if (kVar.isReady()) {
                return new v(kVar, (Throwable) null, 6);
            }
            if (kVar instanceof k) {
                return ((k) kVar).f39364a;
            }
            this.f39371x.add(kVar);
            this.f39368u.d().d(new l(j8.d.f38484b + " connect " + xVar.l().f38074h.f(), kVar, this), 0L);
        }
        return null;
    }
}
