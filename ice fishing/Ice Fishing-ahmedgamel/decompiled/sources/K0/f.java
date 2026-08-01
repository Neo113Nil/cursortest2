package K0;

import C2.y;
import J0.s;
import O2.B;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.gms.internal.consent_sdk.C4300b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class f implements c {

    /* renamed from: F, reason: collision with root package name */
    public static final String f1501F = s.f("Processor");

    /* renamed from: B, reason: collision with root package name */
    public final List f1503B;

    /* renamed from: u, reason: collision with root package name */
    public final Context f1508u;

    /* renamed from: v, reason: collision with root package name */
    public final J0.b f1509v;

    /* renamed from: w, reason: collision with root package name */
    public final Z2.e f1510w;

    /* renamed from: x, reason: collision with root package name */
    public final WorkDatabase f1511x;

    /* renamed from: z, reason: collision with root package name */
    public final HashMap f1513z = new HashMap();

    /* renamed from: y, reason: collision with root package name */
    public final HashMap f1512y = new HashMap();

    /* renamed from: C, reason: collision with root package name */
    public final HashSet f1504C = new HashSet();

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f1505D = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public PowerManager.WakeLock f1507n = null;

    /* renamed from: E, reason: collision with root package name */
    public final Object f1506E = new Object();

    /* renamed from: A, reason: collision with root package name */
    public final HashMap f1502A = new HashMap();

    public f(Context context, J0.b bVar, Z2.e eVar, WorkDatabase workDatabase, List list) {
        this.f1508u = context;
        this.f1509v = bVar;
        this.f1510w = eVar;
        this.f1511x = workDatabase;
        this.f1503B = list;
    }

    public static boolean c(String str, q qVar) {
        if (qVar == null) {
            s.d().a(f1501F, "WorkerWrapper could not be found for " + str);
            return false;
        }
        qVar.f1551K = true;
        qVar.h();
        qVar.J.cancel(true);
        if (qVar.f1557y == null || !(qVar.J.f3159n instanceof U0.a)) {
            s.d().a(q.f1541L, "WorkSpec " + qVar.f1556x + " is already done. Not interrupting.");
        } else {
            qVar.f1557y.stop();
        }
        s.d().a(f1501F, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(c cVar) {
        synchronized (this.f1506E) {
            this.f1505D.add(cVar);
        }
    }

    @Override // K0.c
    public final void b(S0.j jVar, boolean z3) {
        synchronized (this.f1506E) {
            try {
                q qVar = (q) this.f1513z.get(jVar.f2792a);
                if (qVar != null && jVar.equals(com.bumptech.glide.e.c(qVar.f1556x))) {
                    this.f1513z.remove(jVar.f2792a);
                }
                s.d().a(f1501F, f.class.getSimpleName() + " " + jVar.f2792a + " executed; reschedule = " + z3);
                Iterator it = this.f1505D.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).b(jVar, z3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(String str) {
        boolean z3;
        synchronized (this.f1506E) {
            try {
                z3 = this.f1513z.containsKey(str) || this.f1512y.containsKey(str);
            } finally {
            }
        }
        return z3;
    }

    public final void e(c cVar) {
        synchronized (this.f1506E) {
            this.f1505D.remove(cVar);
        }
    }

    public final void f(S0.j jVar) {
        Z2.e eVar = this.f1510w;
        ((B) eVar.f4172w).execute(new F.n(2, this, jVar));
    }

    public final void g(String str, J0.j jVar) {
        synchronized (this.f1506E) {
            try {
                s.d().e(f1501F, "Moving WorkSpec (" + str + ") to the foreground");
                q qVar = (q) this.f1513z.remove(str);
                if (qVar != null) {
                    if (this.f1507n == null) {
                        PowerManager.WakeLock a9 = T0.n.a(this.f1508u, "ProcessorForegroundLck");
                        this.f1507n = a9;
                        a9.acquire();
                    }
                    this.f1512y.put(str, qVar);
                    Intent c9 = R0.a.c(this.f1508u, com.bumptech.glide.e.c(qVar.f1556x), jVar);
                    Context context = this.f1508u;
                    if (Build.VERSION.SDK_INT >= 26) {
                        E.d.b(context, c9);
                    } else {
                        context.startService(c9);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h(j jVar, Z2.e eVar) {
        S0.j jVar2 = jVar.f1517a;
        String str = jVar2.f2792a;
        ArrayList arrayList = new ArrayList();
        S0.p pVar = (S0.p) this.f1511x.n(new e(0, this, arrayList, str));
        if (pVar == null) {
            s.d().g(f1501F, "Didn't find WorkSpec for id " + jVar2);
            f(jVar2);
            return false;
        }
        synchronized (this.f1506E) {
            try {
                if (d(str)) {
                    Set set = (Set) this.f1502A.get(str);
                    if (((j) set.iterator().next()).f1517a.f2793b == jVar2.f2793b) {
                        set.add(jVar);
                        s.d().a(f1501F, "Work " + jVar2 + " is already enqueued for processing");
                    } else {
                        f(jVar2);
                    }
                    return false;
                }
                if (pVar.f2826t != jVar2.f2793b) {
                    f(jVar2);
                    return false;
                }
                Context context = this.f1508u;
                J0.b bVar = this.f1509v;
                Z2.e eVar2 = this.f1510w;
                WorkDatabase workDatabase = this.f1511x;
                C4300b c4300b = new C4300b();
                c4300b.i = new Z2.e(7);
                c4300b.f35648a = context.getApplicationContext();
                c4300b.f35650c = eVar2;
                c4300b.f35649b = this;
                c4300b.f35651d = bVar;
                c4300b.f35652e = workDatabase;
                c4300b.f35653f = pVar;
                c4300b.f35655h = arrayList;
                c4300b.f35654g = this.f1503B;
                if (eVar != null) {
                    c4300b.i = eVar;
                }
                q qVar = new q(c4300b);
                U0.k kVar = qVar.f1550I;
                kVar.a(new y(3, this, jVar.f1517a, kVar), (B) this.f1510w.f4172w);
                this.f1513z.put(str, qVar);
                HashSet hashSet = new HashSet();
                hashSet.add(jVar);
                this.f1502A.put(str, hashSet);
                ((T0.l) this.f1510w.f4170u).execute(qVar);
                s.d().a(f1501F, f.class.getSimpleName() + ": processing " + jVar2);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.f1506E) {
            try {
                if (this.f1512y.isEmpty()) {
                    Context context = this.f1508u;
                    String str = R0.a.f2688C;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f1508u.startService(intent);
                    } catch (Throwable th) {
                        s.d().c(f1501F, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f1507n;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f1507n = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
