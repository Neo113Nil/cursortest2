package defpackage;

import android.os.SystemClock;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a42 {
    public boolean a;
    public final Object b;
    public long c;
    public Object d;
    public Object e;
    public Object f;
    public final Serializable g;
    public final Object h;
    public Object i;
    public Object j;

    /* JADX WARN: Multi-variable type inference failed */
    public a42(Function1 function1) {
        this.d = (uif) function1;
        this.e = new AtomicReference(null);
        this.f = new q2r(1, this);
        this.g = new hxo(11, this);
        this.h = new eqi(new v2r[16]);
        this.b = new Object();
        this.c = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean a(a42 a42Var) {
        boolean z;
        Set set;
        Set set2;
        synchronized (a42Var.b) {
            z = a42Var.a;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = (AtomicReference) a42Var.e;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                List list = null;
                List list2 = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        pq5.d("Unexpected notification");
                        rj7.f();
                        return false;
                    }
                    List list3 = (List) obj;
                    Set set3 = (Set) list3.get(0);
                    if (list3.size() == 2) {
                        list2 = list3.get(1);
                    } else if (list3.size() > 2) {
                        list2 = list3.subList(1, list3.size());
                    }
                    set2 = set3;
                    list = list2;
                }
                while (!atomicReference.compareAndSet(obj, list)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z2;
            }
            synchronized (a42Var.b) {
                eqi eqiVar = (eqi) a42Var.h;
                Object[] objArr = eqiVar.a;
                int i = eqiVar.c;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((v2r) objArr[i2]).b(set) || z2;
                }
            }
        }
    }

    public void b() {
        synchronized (this.b) {
            eqi eqiVar = (eqi) this.h;
            Object[] objArr = eqiVar.a;
            int i = eqiVar.c;
            for (int i2 = 0; i2 < i; i2++) {
                v2r v2rVar = (v2r) objArr[i2];
                v2rVar.e.a();
                v2rVar.f.a();
                v2rVar.k.a();
                v2rVar.l.clear();
            }
        }
    }

    public void c() {
        int decrementAndGet = ((AtomicInteger) this.g).decrementAndGet();
        if (decrementAndGet < 0) {
            xq0.q("Unbalanced reference count.");
            return;
        }
        ((AtomicLong) this.h).set(SystemClock.uptimeMillis());
        if (decrementAndGet == 0) {
            mm6 mm6Var = (mm6) this.e;
            Continuation continuation = null;
            if (mm6Var != null) {
                this.j = x97.y(mm6Var, null, null, new hl(this, continuation, 17), 3);
            } else {
                Intrinsics.j("coroutineScope");
                throw null;
            }
        }
    }

    public Object d(Function1 function1) {
        try {
            return function1.invoke(e());
        } finally {
            c();
        }
    }

    public rsr e() {
        rar rarVar = (rar) this.j;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.j = null;
        ((AtomicInteger) this.g).incrementAndGet();
        if (this.a) {
            xq0.q("Attempting to open already closed database.");
            return null;
        }
        synchronized (this.b) {
            rsr rsrVar = (rsr) this.i;
            if (rsrVar != null && rsrVar.isOpen()) {
                return rsrVar;
            }
            vsr vsrVar = (vsr) this.d;
            if (vsrVar == null) {
                Intrinsics.j("delegateOpenHelper");
                throw null;
            }
            rsr writableDatabase = vsrVar.getWritableDatabase();
            this.i = writableDatabase;
            return writableDatabase;
        }
    }

    public void f(Object obj, Function1 function1, Function0 function0) {
        Object obj2;
        v2r v2rVar;
        synchronized (this.b) {
            eqi eqiVar = (eqi) this.h;
            Object[] objArr = eqiVar.a;
            int i = eqiVar.c;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i2];
                if (((v2r) obj2).a == function1) {
                    break;
                } else {
                    i2++;
                }
            }
            v2rVar = (v2r) obj2;
            if (v2rVar == null) {
                function1.getClass();
                wct.o(1, function1);
                v2rVar = new v2r(function1);
                eqiVar.d(v2rVar);
            }
        }
        v2r v2rVar2 = (v2r) this.j;
        long j = this.c;
        if (j != -1 && j != ldg.r()) {
            StringBuilder l = tlm.l(j, "Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=");
            l.append(ldg.r());
            l.append(", name=");
            l.append(Thread.currentThread().getName());
            l.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            llm.a(l.toString());
        }
        try {
            this.j = v2rVar;
            this.c = ldg.r();
            v2rVar.a(obj, (hxo) this.g, function0);
        } finally {
            this.j = v2rVar2;
            this.c = j;
        }
    }

    public void g() {
        q2r q2rVar = (q2r) this.f;
        sfm sfmVar = g2r.a;
        g2r.f(dpo.X);
        synchronized (g2r.b) {
            g2r.g = CollectionsKt.h0((Collection) g2r.g, q2rVar);
        }
        this.i = new h5n(11, q2rVar);
    }

    public a42(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.b = new Object();
        this.c = timeUnit.toMillis(j);
        this.g = new AtomicInteger(0);
        this.h = new AtomicLong(SystemClock.uptimeMillis());
    }
}
