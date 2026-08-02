package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import defpackage.a8o;
import defpackage.b8o;
import defpackage.eww;
import defpackage.mo;
import defpackage.tmd;
import defpackage.ws2;
import defpackage.y1g;
import defpackage.yxw;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends a8o> {
    public static final mo n = new mo(16);
    public final ws2 b;
    public final WeakReference c;
    public b8o f;
    public a8o h;
    public Status i;
    public volatile boolean j;
    public boolean k;
    public boolean l;
    public final Object a = new Object();
    public final CountDownLatch d = new CountDownLatch(1);
    public final ArrayList e = new ArrayList();
    public final AtomicReference g = new AtomicReference();
    public boolean m = false;

    public BasePendingResult(tmd tmdVar) {
        this.b = new ws2(tmdVar != null ? tmdVar.c() : Looper.getMainLooper(), 1);
        this.c = new WeakReference(tmdVar);
    }

    public final void a(eww ewwVar) {
        synchronized (this.a) {
            try {
                if (e()) {
                    ewwVar.a(this.i);
                } else {
                    this.e.add(ewwVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.a) {
            try {
                if (!this.k && !this.j) {
                    this.k = true;
                    j(c(Status.i));
                }
            } finally {
            }
        }
    }

    public abstract a8o c(Status status);

    public final void d(Status status) {
        synchronized (this.a) {
            try {
                if (!e()) {
                    g(c(status));
                    this.l = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e() {
        return this.d.getCount() == 0;
    }

    public /* bridge */ void f(a8o a8oVar) {
        g(a8oVar);
    }

    public final void g(a8o a8oVar) {
        synchronized (this.a) {
            try {
                if (this.l || this.k) {
                    return;
                }
                e();
                y1g.I("Results have already been set", !e());
                y1g.I("Result has already been consumed", !this.j);
                j(a8oVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(b8o b8oVar) {
        boolean z;
        synchronized (this.a) {
            try {
                if (b8oVar == null) {
                    this.f = null;
                    return;
                }
                y1g.I("Result has already been consumed.", !this.j);
                synchronized (this.a) {
                    z = this.k;
                }
                if (z) {
                    return;
                }
                if (e()) {
                    ws2 ws2Var = this.b;
                    a8o i = i();
                    ws2Var.getClass();
                    ws2Var.sendMessage(ws2Var.obtainMessage(1, new Pair(b8oVar, i)));
                } else {
                    this.f = b8oVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final a8o i() {
        a8o a8oVar;
        synchronized (this.a) {
            y1g.I("Result has already been consumed.", !this.j);
            y1g.I("Result is not ready.", e());
            a8oVar = this.h;
            this.h = null;
            this.f = null;
            this.j = true;
        }
        yxw yxwVar = (yxw) this.g.getAndSet(null);
        if (yxwVar != null) {
            ((Set) yxwVar.a.a).remove(this);
        }
        y1g.G(a8oVar);
        return a8oVar;
    }

    public final void j(a8o a8oVar) {
        this.h = a8oVar;
        this.i = a8oVar.getStatus();
        this.d.countDown();
        if (this.k) {
            this.f = null;
        } else {
            b8o b8oVar = this.f;
            if (b8oVar != null) {
                ws2 ws2Var = this.b;
                ws2Var.removeMessages(2);
                ws2Var.sendMessage(ws2Var.obtainMessage(1, new Pair(b8oVar, i())));
            }
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((eww) arrayList.get(i)).a(this.i);
        }
        arrayList.clear();
    }

    public final void k() {
        boolean z = true;
        if (!this.m && !((Boolean) n.get()).booleanValue()) {
            z = false;
        }
        this.m = z;
    }
}
