package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes5.dex */
public final class qe6 extends we6 implements Closeable {
    public final ce7 f;
    public final we6 g;
    public ArrayList h;
    public rp7 i;
    public Throwable j;
    public ScheduledFuture k;
    public boolean l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qe6(we6 we6Var) {
        super(we6Var, r0);
        ulk ulkVar = we6Var.b;
        this.f = we6Var.H();
        this.g = new we6(this, ulkVar);
    }

    @Override // defpackage.we6
    public final void D(we6 we6Var) {
        this.g.D(we6Var);
    }

    @Override // defpackage.we6
    public final ce7 H() {
        return this.f;
    }

    @Override // defpackage.we6
    public final boolean I() {
        synchronized (this) {
            try {
                if (this.l) {
                    return true;
                }
                if (!super.I()) {
                    return false;
                }
                Q(super.g());
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.we6
    public final void N(re6 re6Var) {
        R(re6Var, this);
    }

    public final void P(te6 te6Var) {
        synchronized (this) {
            try {
                if (I()) {
                    te6Var.a();
                } else {
                    ArrayList arrayList = this.h;
                    if (arrayList == null) {
                        ArrayList arrayList2 = new ArrayList();
                        this.h = arrayList2;
                        arrayList2.add(te6Var);
                        qe6 qe6Var = this.a;
                        if (qe6Var != null) {
                            rp7 rp7Var = new rp7(this);
                            this.i = rp7Var;
                            qe6Var.P(new te6(se6.a, rp7Var, this));
                        }
                    } else {
                        arrayList.add(te6Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void Q(Throwable th) {
        boolean z;
        ScheduledFuture scheduledFuture;
        synchronized (this) {
            try {
                if (this.l) {
                    z = false;
                    scheduledFuture = null;
                } else {
                    z = true;
                    this.l = true;
                    scheduledFuture = this.k;
                    if (scheduledFuture != null) {
                        this.k = null;
                    } else {
                        scheduledFuture = null;
                    }
                    this.j = th;
                }
            } finally {
            }
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        if (z) {
            synchronized (this) {
                try {
                    ArrayList arrayList = this.h;
                    if (arrayList == null) {
                        return;
                    }
                    re6 re6Var = this.i;
                    this.i = null;
                    this.h = null;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        te6 te6Var = (te6) it.next();
                        if (te6Var.c == this) {
                            te6Var.a();
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        te6 te6Var2 = (te6) it2.next();
                        if (te6Var2.c != this) {
                            te6Var2.a();
                        }
                    }
                    qe6 qe6Var = this.a;
                    if (qe6Var != null) {
                        qe6Var.R(re6Var, qe6Var);
                    }
                } finally {
                }
            }
        }
    }

    public final void R(re6 re6Var, we6 we6Var) {
        synchronized (this) {
            try {
                ArrayList arrayList = this.h;
                if (arrayList != null) {
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        te6 te6Var = (te6) this.h.get(size);
                        if (te6Var.b == re6Var && te6Var.c == we6Var) {
                            this.h.remove(size);
                            break;
                        }
                        size--;
                    }
                    if (this.h.isEmpty()) {
                        qe6 qe6Var = this.a;
                        if (qe6Var != null) {
                            qe6Var.R(this.i, qe6Var);
                        }
                        this.i = null;
                        this.h = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.we6
    public final void a(re6 re6Var) {
        P(new te6(e48.a, re6Var, this));
    }

    @Override // defpackage.we6
    public final we6 b() {
        return this.g.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Q(null);
    }

    @Override // defpackage.we6
    public final Throwable g() {
        if (I()) {
            return this.j;
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qe6(we6 we6Var, ce7 ce7Var) {
        super(we6Var, r0);
        ulk ulkVar = we6Var.b;
        this.f = ce7Var;
        this.g = new we6(this, ulkVar);
    }
}
