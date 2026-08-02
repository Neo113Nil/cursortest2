package m8;

import h.C4543G;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class l implements i {

    /* renamed from: n, reason: collision with root package name */
    public final w f39524n;

    /* renamed from: u, reason: collision with root package name */
    public final l8.d f39525u;

    /* renamed from: v, reason: collision with root package name */
    public final long f39526v;

    /* renamed from: w, reason: collision with root package name */
    public long f39527w;

    /* renamed from: x, reason: collision with root package name */
    public final CopyOnWriteArrayList f39528x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedBlockingDeque f39529y;

    public l(w wVar, l8.d taskRunner) {
        kotlin.jvm.internal.h.e(taskRunner, "taskRunner");
        this.f39524n = wVar;
        this.f39525u = taskRunner;
        this.f39526v = TimeUnit.MILLISECONDS.toNanos(250L);
        this.f39527w = Long.MIN_VALUE;
        this.f39528x = new CopyOnWriteArrayList();
        this.f39529y = new LinkedBlockingDeque();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:4:0x0004, B:7:0x000c, B:13:0x001a, B:15:0x0020, B:22:0x0045, B:66:0x004f, B:69:0x005a, B:27:0x0064, B:29:0x006c, B:33:0x0075, B:35:0x007e, B:36:0x0082, B:38:0x0086, B:43:0x008d, B:46:0x0097, B:48:0x009b, B:51:0x00a1, B:52:0x00a5, B:54:0x00a9, B:55:0x00aa, B:58:0x00ae, B:71:0x003a, B:73:0x00b7, B:74:0x00be), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:4:0x0004, B:7:0x000c, B:13:0x001a, B:15:0x0020, B:22:0x0045, B:66:0x004f, B:69:0x005a, B:27:0x0064, B:29:0x006c, B:33:0x0075, B:35:0x007e, B:36:0x0082, B:38:0x0086, B:43:0x008d, B:46:0x0097, B:48:0x009b, B:51:0x00a1, B:52:0x00a5, B:54:0x00a9, B:55:0x00aa, B:58:0x00ae, B:71:0x003a, B:73:0x00b7, B:74:0x00be), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:4:0x0004, B:7:0x000c, B:13:0x001a, B:15:0x0020, B:22:0x0045, B:66:0x004f, B:69:0x005a, B:27:0x0064, B:29:0x006c, B:33:0x0075, B:35:0x007e, B:36:0x0082, B:38:0x0086, B:43:0x008d, B:46:0x0097, B:48:0x009b, B:51:0x00a1, B:52:0x00a5, B:54:0x00a9, B:55:0x00aa, B:58:0x00ae, B:71:0x003a, B:73:0x00b7, B:74:0x00be), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0064 A[SYNTHETIC] */
    @Override // m8.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q a() {
        u d9;
        Throwable th;
        e eVar;
        IOException iOException = null;
        while (true) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f39528x;
            try {
                boolean isEmpty = copyOnWriteArrayList.isEmpty();
                w wVar = this.f39524n;
                if (isEmpty && !wVar.k(null)) {
                    c();
                    kotlin.jvm.internal.h.b(iOException);
                    throw iOException;
                }
                if (wVar.i()) {
                    throw new IOException("Canceled");
                }
                C4543G c4543g = this.f39525u.f39016a;
                long nanoTime = System.nanoTime();
                long j6 = this.f39527w - nanoTime;
                if (!copyOnWriteArrayList.isEmpty() && j6 > 0) {
                    d9 = null;
                    if (d9 != null) {
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        if (!copyOnWriteArrayList.isEmpty() && (d9 = (u) this.f39529y.poll(j6, timeUnit)) != null) {
                            copyOnWriteArrayList.remove(d9.f39590a);
                            if (d9 != null) {
                            }
                        }
                        d9 = null;
                        if (d9 != null) {
                        }
                    }
                    v vVar = d9.f39590a;
                    boolean z6 = false;
                    if (d9.f39591b != null && d9.f39592c == null) {
                        c();
                        if (!vVar.isReady()) {
                            d9 = vVar.e();
                        }
                        if (d9.f39591b == null && d9.f39592c == null) {
                            z6 = true;
                        }
                        if (z6) {
                            q b9 = d9.f39590a.b();
                            c();
                            return b9;
                        }
                    }
                    th = d9.f39592c;
                    if (th != null) {
                        if (!(th instanceof IOException)) {
                            throw th;
                        }
                        if (iOException == null) {
                            iOException = (IOException) th;
                        } else {
                            A8.b.a(iOException, th);
                        }
                    }
                    eVar = d9.f39591b;
                    if (eVar == null) {
                        wVar.o().addFirst(eVar);
                    }
                }
                d9 = d();
                j6 = this.f39526v;
                this.f39527w = nanoTime + j6;
                if (d9 != null) {
                }
                v vVar2 = d9.f39590a;
                boolean z62 = false;
                if (d9.f39591b != null && d9.f39592c == null) {
                }
                th = d9.f39592c;
                if (th != null) {
                }
                eVar = d9.f39591b;
                if (eVar == null) {
                }
            } catch (Throwable th2) {
                c();
                throw th2;
            }
        }
    }

    @Override // m8.i
    public final w b() {
        return this.f39524n;
    }

    public final void c() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f39528x;
        Iterator it = copyOnWriteArrayList.iterator();
        kotlin.jvm.internal.h.d(it, "iterator(...)");
        while (it.hasNext()) {
            v vVar = (v) it.next();
            vVar.cancel();
            v a9 = vVar.a();
            if (a9 != null) {
                this.f39524n.o().addLast(a9);
            }
        }
        copyOnWriteArrayList.clear();
    }

    public final u d() {
        v jVar;
        w wVar = this.f39524n;
        if (wVar.k(null)) {
            try {
                jVar = wVar.q();
            } catch (Throwable th) {
                jVar = new j(th);
            }
            if (jVar.isReady()) {
                return new u(jVar, (Throwable) null, 6);
            }
            if (jVar instanceof j) {
                return ((j) jVar).f39521a;
            }
            this.f39528x.add(jVar);
            this.f39525u.d().d(new k(j8.d.f38496b + " connect " + wVar.f().f38193h.f(), jVar, this), 0L);
        }
        return null;
    }
}
