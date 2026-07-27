package K0;

import B2.z;
import J0.s;
import N2.A;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.gms.internal.consent_sdk.C4313b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class f implements c {

    /* renamed from: F, reason: collision with root package name */
    public static final String f1498F = s.f("Processor");

    /* renamed from: B, reason: collision with root package name */
    public final List f1500B;

    /* renamed from: u, reason: collision with root package name */
    public final Context f1505u;

    /* renamed from: v, reason: collision with root package name */
    public final J0.b f1506v;

    /* renamed from: w, reason: collision with root package name */
    public final Y2.e f1507w;

    /* renamed from: x, reason: collision with root package name */
    public final WorkDatabase f1508x;

    /* renamed from: z, reason: collision with root package name */
    public final HashMap f1510z = new HashMap();

    /* renamed from: y, reason: collision with root package name */
    public final HashMap f1509y = new HashMap();

    /* renamed from: C, reason: collision with root package name */
    public final HashSet f1501C = new HashSet();

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f1502D = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public PowerManager.WakeLock f1504n = null;

    /* renamed from: E, reason: collision with root package name */
    public final Object f1503E = new Object();

    /* renamed from: A, reason: collision with root package name */
    public final HashMap f1499A = new HashMap();

    public f(Context context, J0.b bVar, Y2.e eVar, WorkDatabase workDatabase, List list) {
        this.f1505u = context;
        this.f1506v = bVar;
        this.f1507w = eVar;
        this.f1508x = workDatabase;
        this.f1500B = list;
    }

    public static boolean c(String str, q qVar) {
        if (qVar == null) {
            s.d().a(f1498F, "WorkerWrapper could not be found for " + str);
            return false;
        }
        qVar.f1549K = true;
        qVar.h();
        qVar.J.cancel(true);
        if (qVar.f1555y == null || !(qVar.J.f3237n instanceof U0.a)) {
            s.d().a(q.f1539L, "WorkSpec " + qVar.f1554x + " is already done. Not interrupting.");
        } else {
            qVar.f1555y.stop();
        }
        s.d().a(f1498F, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(c cVar) {
        synchronized (this.f1503E) {
            this.f1502D.add(cVar);
        }
    }

    @Override // K0.c
    public final void b(S0.j jVar, boolean z8) {
        synchronized (this.f1503E) {
            try {
                q qVar = (q) this.f1510z.get(jVar.f2905a);
                if (qVar != null && jVar.equals(U2.a.e(qVar.f1554x))) {
                    this.f1510z.remove(jVar.f2905a);
                }
                s.d().a(f1498F, f.class.getSimpleName() + " " + jVar.f2905a + " executed; reschedule = " + z8);
                Iterator it = this.f1502D.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).b(jVar, z8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(String str) {
        boolean z8;
        synchronized (this.f1503E) {
            try {
                z8 = this.f1510z.containsKey(str) || this.f1509y.containsKey(str);
            } finally {
            }
        }
        return z8;
    }

    public final void e(c cVar) {
        synchronized (this.f1503E) {
            this.f1502D.remove(cVar);
        }
    }

    public final void f(S0.j jVar) {
        Y2.e eVar = this.f1507w;
        ((A) eVar.f3965w).execute(new D5.b(2, this, jVar));
    }

    public final void g(String str, J0.j jVar) {
        synchronized (this.f1503E) {
            try {
                s.d().e(f1498F, "Moving WorkSpec (" + str + ") to the foreground");
                q qVar = (q) this.f1510z.remove(str);
                if (qVar != null) {
                    if (this.f1504n == null) {
                        PowerManager.WakeLock a9 = T0.n.a(this.f1505u, "ProcessorForegroundLck");
                        this.f1504n = a9;
                        a9.acquire();
                    }
                    this.f1509y.put(str, qVar);
                    Intent c4 = R0.a.c(this.f1505u, U2.a.e(qVar.f1554x), jVar);
                    Context context = this.f1505u;
                    if (Build.VERSION.SDK_INT >= 26) {
                        E.d.b(context, c4);
                    } else {
                        context.startService(c4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h(j jVar, Y2.e eVar) {
        S0.j jVar2 = jVar.f1514a;
        String str = jVar2.f2905a;
        ArrayList arrayList = new ArrayList();
        S0.p pVar = (S0.p) this.f1508x.n(new e(this, arrayList, str, 0));
        if (pVar == null) {
            s.d().g(f1498F, "Didn't find WorkSpec for id " + jVar2);
            f(jVar2);
            return false;
        }
        synchronized (this.f1503E) {
            try {
                if (d(str)) {
                    Set set = (Set) this.f1499A.get(str);
                    if (((j) set.iterator().next()).f1514a.f2906b == jVar2.f2906b) {
                        set.add(jVar);
                        s.d().a(f1498F, "Work " + jVar2 + " is already enqueued for processing");
                    } else {
                        f(jVar2);
                    }
                    return false;
                }
                if (pVar.f2938t != jVar2.f2906b) {
                    f(jVar2);
                    return false;
                }
                Context context = this.f1505u;
                J0.b bVar = this.f1506v;
                Y2.e eVar2 = this.f1507w;
                WorkDatabase workDatabase = this.f1508x;
                C4313b c4313b = new C4313b();
                c4313b.i = new Y2.e(6);
                c4313b.f35811a = context.getApplicationContext();
                c4313b.f35813c = eVar2;
                c4313b.f35812b = this;
                c4313b.f35814d = bVar;
                c4313b.f35815e = workDatabase;
                c4313b.f35816f = pVar;
                c4313b.f35818h = arrayList;
                c4313b.f35817g = this.f1500B;
                if (eVar != null) {
                    c4313b.i = eVar;
                }
                q qVar = new q(c4313b);
                U0.k kVar = qVar.f1548I;
                kVar.c(new z(this, jVar.f1514a, kVar, 3), (A) this.f1507w.f3965w);
                this.f1510z.put(str, qVar);
                HashSet hashSet = new HashSet();
                hashSet.add(jVar);
                this.f1499A.put(str, hashSet);
                ((T0.l) this.f1507w.f3963u).execute(qVar);
                s.d().a(f1498F, f.class.getSimpleName() + ": processing " + jVar2);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.f1503E) {
            try {
                if (this.f1509y.isEmpty()) {
                    Context context = this.f1505u;
                    String str = R0.a.f2778C;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f1505u.startService(intent);
                    } catch (Throwable th) {
                        s.d().c(f1498F, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f1504n;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f1504n = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
