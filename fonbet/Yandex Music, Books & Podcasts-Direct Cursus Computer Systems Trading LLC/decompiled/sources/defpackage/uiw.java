package defpackage;

import android.os.SystemClock;
import com.yandex.media.ynison.service.a;
import com.yandex.media.ynison.service.a0;
import com.yandex.media.ynison.service.c0;
import com.yandex.media.ynison.service.d;
import com.yandex.media.ynison.service.e0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public final class uiw {
    public final ReentrantLock a = new ReentrantLock();
    public final HashMap b = new HashMap();
    public a0 c;
    public c0 d;
    public long e;
    public e0 f;
    public long g;

    public final e0 a() {
        a0 c;
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            e0 e0Var = this.f;
            e0 e0Var2 = null;
            if (e0Var != null && (c = c()) != null) {
                b5n s = e0.s(e0Var);
                s.i(c);
                long j = this.g;
                long k = c.j().E().k();
                if (j < k) {
                    j = k;
                }
                long k2 = c.k().p().k();
                if (j < k2) {
                    j = k2;
                }
                s.d();
                e0.i((e0) s.b, j);
                e0Var2 = (e0) s.b();
            }
            return e0Var2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final ArrayList b() {
        ArrayList arrayList;
        rse m;
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            e0 e0Var = this.f;
            if (e0Var == null || (m = e0Var.m()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(v75.o(m, 10));
                Iterator<E> it = m.iterator();
                while (it.hasNext()) {
                    rz7 p = a.p((a) it.next());
                    d dVar = (d) this.b.get(((a) p.b).k().m());
                    if (dVar == null) {
                        dVar = ((a) p.b).m();
                    }
                    p.d();
                    a.i((a) p.b, dVar);
                    arrayList.add((a) p.b());
                }
            }
            return arrayList;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final a0 c() {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            a0 a0Var = this.c;
            a0 a0Var2 = null;
            if (a0Var == null) {
                e0 e0Var = this.f;
                a0Var = e0Var != null ? e0Var.n() : null;
            }
            if (a0Var != null) {
                pnl o = a0.o(a0Var);
                c0 d = d();
                if (d != null) {
                    o.j(d);
                }
                o.d();
                a0.f((a0) o.b);
                a0Var2 = (a0) o.b();
            }
            reentrantLock.unlock();
            return a0Var2;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final c0 d() {
        a0 n;
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            c0 c0Var = this.d;
            c0 c0Var2 = null;
            if (c0Var == null) {
                e0 e0Var = this.f;
                c0Var = (e0Var == null || (n = e0Var.n()) == null) ? null : n.k();
            }
            if (c0Var != null) {
                long j = this.e;
                qrl r = c0.r(c0Var);
                long l = c0Var.l();
                long j2 = 0;
                long j3 = l < 0 ? 0L : l;
                if (c0Var.m()) {
                    j3 = yhn.f(c0Var.o(), 0L, j3);
                } else {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - Math.max(this.g, j);
                    if (elapsedRealtime >= 0) {
                        j2 = elapsedRealtime;
                    }
                    long f = yhn.f(c0Var.o(), 0L, j3);
                    if (j2 < j3 - f) {
                        j3 = f + j2;
                    }
                }
                r.j(j3);
                c0Var2 = (c0) r.b();
            }
            reentrantLock.unlock();
            return c0Var2;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
