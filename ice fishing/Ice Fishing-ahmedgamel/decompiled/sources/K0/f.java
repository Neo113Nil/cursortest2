package K0;

import E2.x;
import J0.r;
import Q2.A;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.gms.internal.consent_sdk.C4323b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class f implements c {

    /* renamed from: F, reason: collision with root package name */
    public static final String f1610F = r.f("Processor");

    /* renamed from: B, reason: collision with root package name */
    public final List f1612B;

    /* renamed from: u, reason: collision with root package name */
    public final Context f1617u;

    /* renamed from: v, reason: collision with root package name */
    public final J0.b f1618v;

    /* renamed from: w, reason: collision with root package name */
    public final b3.e f1619w;

    /* renamed from: x, reason: collision with root package name */
    public final WorkDatabase f1620x;

    /* renamed from: z, reason: collision with root package name */
    public final HashMap f1622z = new HashMap();

    /* renamed from: y, reason: collision with root package name */
    public final HashMap f1621y = new HashMap();

    /* renamed from: C, reason: collision with root package name */
    public final HashSet f1613C = new HashSet();

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f1614D = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public PowerManager.WakeLock f1616n = null;

    /* renamed from: E, reason: collision with root package name */
    public final Object f1615E = new Object();

    /* renamed from: A, reason: collision with root package name */
    public final HashMap f1611A = new HashMap();

    public f(Context context, J0.b bVar, b3.e eVar, WorkDatabase workDatabase, List list) {
        this.f1617u = context;
        this.f1618v = bVar;
        this.f1619w = eVar;
        this.f1620x = workDatabase;
        this.f1612B = list;
    }

    public static boolean c(String str, q qVar) {
        if (qVar == null) {
            r.d().a(f1610F, "WorkerWrapper could not be found for " + str);
            return false;
        }
        qVar.f1660K = true;
        qVar.h();
        qVar.J.cancel(true);
        if (qVar.f1666y == null || !(qVar.J.f3276n instanceof U0.a)) {
            r.d().a(q.f1650L, "WorkSpec " + qVar.f1665x + " is already done. Not interrupting.");
        } else {
            qVar.f1666y.stop();
        }
        r.d().a(f1610F, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(c cVar) {
        synchronized (this.f1615E) {
            this.f1614D.add(cVar);
        }
    }

    @Override // K0.c
    public final void b(S0.j jVar, boolean z6) {
        synchronized (this.f1615E) {
            try {
                q qVar = (q) this.f1622z.get(jVar.f2921a);
                if (qVar != null && jVar.equals(Z2.d.k(qVar.f1665x))) {
                    this.f1622z.remove(jVar.f2921a);
                }
                r.d().a(f1610F, f.class.getSimpleName() + " " + jVar.f2921a + " executed; reschedule = " + z6);
                Iterator it = this.f1614D.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).b(jVar, z6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(String str) {
        boolean z6;
        synchronized (this.f1615E) {
            try {
                z6 = this.f1622z.containsKey(str) || this.f1621y.containsKey(str);
            } finally {
            }
        }
        return z6;
    }

    public final void e(c cVar) {
        synchronized (this.f1615E) {
            this.f1614D.remove(cVar);
        }
    }

    public final void f(S0.j jVar) {
        b3.e eVar = this.f1619w;
        ((A) eVar.f5559w).execute(new F.n(2, this, jVar));
    }

    public final void g(String str, J0.i iVar) {
        synchronized (this.f1615E) {
            try {
                r.d().e(f1610F, "Moving WorkSpec (" + str + ") to the foreground");
                q qVar = (q) this.f1622z.remove(str);
                if (qVar != null) {
                    if (this.f1616n == null) {
                        PowerManager.WakeLock a9 = T0.n.a(this.f1617u, "ProcessorForegroundLck");
                        this.f1616n = a9;
                        a9.acquire();
                    }
                    this.f1621y.put(str, qVar);
                    Intent c9 = R0.a.c(this.f1617u, Z2.d.k(qVar.f1665x), iVar);
                    Context context = this.f1617u;
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

    public final boolean h(j jVar, b3.e eVar) {
        S0.j jVar2 = jVar.f1626a;
        String str = jVar2.f2921a;
        ArrayList arrayList = new ArrayList();
        S0.p pVar = (S0.p) this.f1620x.n(new e(0, this, arrayList, str));
        if (pVar == null) {
            r.d().g(f1610F, "Didn't find WorkSpec for id " + jVar2);
            f(jVar2);
            return false;
        }
        synchronized (this.f1615E) {
            try {
                if (d(str)) {
                    Set set = (Set) this.f1611A.get(str);
                    if (((j) set.iterator().next()).f1626a.f2922b == jVar2.f2922b) {
                        set.add(jVar);
                        r.d().a(f1610F, "Work " + jVar2 + " is already enqueued for processing");
                    } else {
                        f(jVar2);
                    }
                    return false;
                }
                if (pVar.f2955t != jVar2.f2922b) {
                    f(jVar2);
                    return false;
                }
                Context context = this.f1617u;
                J0.b bVar = this.f1618v;
                b3.e eVar2 = this.f1619w;
                WorkDatabase workDatabase = this.f1620x;
                C4323b c4323b = new C4323b();
                c4323b.i = new b3.e(7);
                c4323b.f36417a = context.getApplicationContext();
                c4323b.f36419c = eVar2;
                c4323b.f36418b = this;
                c4323b.f36420d = bVar;
                c4323b.f36421e = workDatabase;
                c4323b.f36422f = pVar;
                c4323b.f36424h = arrayList;
                c4323b.f36423g = this.f1612B;
                if (eVar != null) {
                    c4323b.i = eVar;
                }
                q qVar = new q(c4323b);
                U0.k kVar = qVar.f1659I;
                kVar.a(new x(3, this, jVar.f1626a, kVar), (A) this.f1619w.f5559w);
                this.f1622z.put(str, qVar);
                HashSet hashSet = new HashSet();
                hashSet.add(jVar);
                this.f1611A.put(str, hashSet);
                ((T0.l) this.f1619w.f5557u).execute(qVar);
                r.d().a(f1610F, f.class.getSimpleName() + ": processing " + jVar2);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.f1615E) {
            try {
                if (this.f1621y.isEmpty()) {
                    Context context = this.f1617u;
                    String str = R0.a.f2725C;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f1617u.startService(intent);
                    } catch (Throwable th) {
                        r.d().c(f1610F, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f1616n;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f1616n = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
