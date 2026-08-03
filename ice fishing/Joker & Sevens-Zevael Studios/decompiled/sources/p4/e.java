package p4;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import x4.p;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e implements c, w4.a {

    /* renamed from: s, reason: collision with root package name */
    public static final String f5462s = o4.o.f("Processor");

    /* renamed from: h, reason: collision with root package name */
    public final Context f5464h;

    /* renamed from: i, reason: collision with root package name */
    public final o4.b f5465i;

    /* renamed from: j, reason: collision with root package name */
    public final a5.c f5466j;

    /* renamed from: k, reason: collision with root package name */
    public final WorkDatabase f5467k;

    /* renamed from: o, reason: collision with root package name */
    public final List f5471o;

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f5469m = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f5468l = new HashMap();

    /* renamed from: p, reason: collision with root package name */
    public final HashSet f5472p = new HashSet();

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f5473q = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public PowerManager.WakeLock f5463g = null;

    /* renamed from: r, reason: collision with root package name */
    public final Object f5474r = new Object();

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f5470n = new HashMap();

    public e(Context context, o4.b bVar, a5.c cVar, WorkDatabase workDatabase, List list) {
        this.f5464h = context;
        this.f5465i = bVar;
        this.f5466j = cVar;
        this.f5467k = workDatabase;
        this.f5471o = list;
    }

    public static boolean c(String str, o oVar) {
        if (oVar == null) {
            o4.o.d().a(f5462s, "WorkerWrapper could not be found for " + str);
            return false;
        }
        oVar.f5521x = true;
        oVar.h();
        oVar.f5520w.cancel(true);
        if (oVar.f5509l == null || !(oVar.f5520w.f9129g instanceof z4.a)) {
            o4.o.d().a(o.f5503y, "WorkSpec " + oVar.f5508k + " is already done. Not interrupting.");
        } else {
            oVar.f5509l.stop();
        }
        o4.o.d().a(f5462s, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(c cVar) {
        synchronized (this.f5474r) {
            this.f5473q.add(cVar);
        }
    }

    @Override // p4.c
    public final void b(x4.j jVar, boolean z10) {
        synchronized (this.f5474r) {
            try {
                o oVar = (o) this.f5469m.get(jVar.f8307a);
                if (oVar != null && jVar.equals(ud.g.h(oVar.f5508k))) {
                    this.f5469m.remove(jVar.f8307a);
                }
                o4.o.d().a(f5462s, e.class.getSimpleName() + " " + jVar.f8307a + " executed; reschedule = " + z10);
                ArrayList arrayList = this.f5473q;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((c) obj).b(jVar, z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(String str) {
        boolean z10;
        synchronized (this.f5474r) {
            try {
                z10 = this.f5469m.containsKey(str) || this.f5468l.containsKey(str);
            } finally {
            }
        }
        return z10;
    }

    public final void e(c cVar) {
        synchronized (this.f5474r) {
            this.f5473q.remove(cVar);
        }
    }

    public final void f(x4.j jVar) {
        ((a5.b) this.f5466j.f263i).execute(new a1.d(10, this, jVar));
    }

    public final void g(String str, o4.g gVar) {
        synchronized (this.f5474r) {
            try {
                o4.o.d().e(f5462s, "Moving WorkSpec (" + str + ") to the foreground");
                o oVar = (o) this.f5469m.remove(str);
                if (oVar != null) {
                    if (this.f5463g == null) {
                        PowerManager.WakeLock a6 = y4.n.a(this.f5464h, "ProcessorForegroundLck");
                        this.f5463g = a6;
                        a6.acquire();
                    }
                    this.f5468l.put(str, oVar);
                    this.f5464h.startForegroundService(w4.b.c(this.f5464h, ud.g.h(oVar.f5508k), gVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h(i iVar, a5.c cVar) {
        Throwable th;
        x4.j jVar = iVar.f5478a;
        String str = jVar.f8307a;
        ArrayList arrayList = new ArrayList();
        p pVar = (p) this.f5467k.n(new m7.e(this, arrayList, str, 1));
        if (pVar == null) {
            o4.o.d().g(f5462s, "Didn't find WorkSpec for id " + jVar);
            f(jVar);
            return false;
        }
        synchronized (this.f5474r) {
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                if (d(str)) {
                    Set set = (Set) this.f5470n.get(str);
                    if (((i) set.iterator().next()).f5478a.f8308b == jVar.f8308b) {
                        set.add(iVar);
                        o4.o.d().a(f5462s, "Work " + jVar + " is already enqueued for processing");
                    } else {
                        f(jVar);
                    }
                    return false;
                }
                if (pVar.f8341t != jVar.f8308b) {
                    f(jVar);
                    return false;
                }
                c6.l lVar = new c6.l(this.f5464h, this.f5465i, this.f5466j, this, this.f5467k, pVar, arrayList);
                lVar.f1274g = this.f5471o;
                if (cVar != null) {
                    lVar.f1276i = cVar;
                }
                o oVar = new o(lVar);
                z4.j jVar2 = oVar.f5519v;
                jVar2.a(new e3.n(this, iVar.f5478a, jVar2, 1), (a5.b) this.f5466j.f263i);
                this.f5469m.put(str, oVar);
                HashSet hashSet = new HashSet();
                hashSet.add(iVar);
                this.f5470n.put(str, hashSet);
                ((y4.l) this.f5466j.f262h).execute(oVar);
                o4.o.d().a(f5462s, e.class.getSimpleName() + ": processing " + jVar);
                return true;
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.f5474r) {
            try {
                if (this.f5468l.isEmpty()) {
                    Context context = this.f5464h;
                    String str = w4.b.f7647p;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f5464h.startService(intent);
                    } catch (Throwable th) {
                        o4.o.d().c(f5462s, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f5463g;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f5463g = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
