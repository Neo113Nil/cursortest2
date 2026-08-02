package defpackage;

import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class f4e {
    public final gc8 a;
    public final ScheduledExecutorService b;
    public String c;
    public final int d;
    public final int e;
    public final ckj f;
    public int g;
    public boolean h;
    public final AtomicBoolean i;
    public final AtomicReference j;
    public ScheduledFuture k;
    public final d4e l;

    public f4e(gc8 gc8Var) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.a = gc8Var;
        this.b = newSingleThreadScheduledExecutor;
        this.c = "10.0.2.2";
        this.d = 7969;
        this.e = 7970;
        this.f = new ckj();
        this.i = new AtomicBoolean(false);
        this.j = new AtomicReference(null);
        this.l = new d4e(this, 1);
    }

    public final void a(Throwable th) {
        synchronized (d51.l) {
        }
        qht qhtVar = qht.a;
        if (qhtVar.a()) {
            this.a.I(th);
        } else {
            qhtVar.b(new pv7(this, th, false, 12));
        }
    }

    public final void b(i4e i4eVar) {
        Iterator it = this.f.iterator();
        while (true) {
            akj akjVar = (akj) it;
            if (!akjVar.hasNext()) {
                return;
            } else {
                ((Function1) akjVar.next()).invoke(i4eVar);
            }
        }
    }
}
