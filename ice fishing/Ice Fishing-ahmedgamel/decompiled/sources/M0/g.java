package M0;

import J0.r;
import Q2.A;
import S0.p;
import T0.l;
import T0.n;
import T0.s;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public final class g implements O0.b, s {

    /* renamed from: F, reason: collision with root package name */
    public static final String f1825F = r.f("DelayMetCommandHandler");

    /* renamed from: A, reason: collision with root package name */
    public final l f1826A;

    /* renamed from: B, reason: collision with root package name */
    public final A f1827B;

    /* renamed from: C, reason: collision with root package name */
    public PowerManager.WakeLock f1828C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1829D;

    /* renamed from: E, reason: collision with root package name */
    public final K0.j f1830E;

    /* renamed from: n, reason: collision with root package name */
    public final Context f1831n;

    /* renamed from: u, reason: collision with root package name */
    public final int f1832u;

    /* renamed from: v, reason: collision with root package name */
    public final S0.j f1833v;

    /* renamed from: w, reason: collision with root package name */
    public final j f1834w;

    /* renamed from: x, reason: collision with root package name */
    public final b3.e f1835x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f1836y;

    /* renamed from: z, reason: collision with root package name */
    public int f1837z;

    public g(Context context, int i, j jVar, K0.j jVar2) {
        this.f1831n = context;
        this.f1832u = i;
        this.f1834w = jVar;
        this.f1833v = jVar2.f1626a;
        this.f1830E = jVar2;
        S0.i iVar = jVar.f1851x.f1649j;
        b3.e eVar = jVar.f1848u;
        this.f1826A = (l) eVar.f5557u;
        this.f1827B = (A) eVar.f5559w;
        this.f1835x = new b3.e(iVar, this);
        this.f1829D = false;
        this.f1837z = 0;
        this.f1836y = new Object();
    }

    public static void a(g gVar) {
        S0.j jVar = gVar.f1833v;
        int i = gVar.f1837z;
        String str = jVar.f2921a;
        String str2 = f1825F;
        if (i >= 2) {
            r.d().a(str2, "Already stopped work for " + str);
            return;
        }
        gVar.f1837z = 2;
        r.d().a(str2, "Stopping work for WorkSpec " + str);
        Context context = gVar.f1831n;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        c.d(intent, jVar);
        j jVar2 = gVar.f1834w;
        int i4 = gVar.f1832u;
        i iVar = new i(i4, 0, jVar2, intent);
        A a9 = gVar.f1827B;
        a9.execute(iVar);
        if (!jVar2.f1850w.d(str)) {
            r.d().a(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        r.d().a(str2, "WorkSpec " + str + " needs to be rescheduled");
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        c.d(intent2, jVar);
        a9.execute(new i(i4, 0, jVar2, intent2));
    }

    public final void b() {
        synchronized (this.f1836y) {
            try {
                this.f1835x.F();
                this.f1834w.f1849v.a(this.f1833v);
                PowerManager.WakeLock wakeLock = this.f1828C;
                if (wakeLock != null && wakeLock.isHeld()) {
                    r.d().a(f1825F, "Releasing wakelock " + this.f1828C + "for WorkSpec " + this.f1833v);
                    this.f1828C.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        S0.j jVar = this.f1833v;
        StringBuilder sb = new StringBuilder();
        String str = jVar.f2921a;
        sb.append(str);
        sb.append(" (");
        this.f1828C = n.a(this.f1831n, AbstractC5128c.e(this.f1832u, ")", sb));
        r d9 = r.d();
        String str2 = "Acquiring wakelock " + this.f1828C + "for WorkSpec " + str;
        String str3 = f1825F;
        d9.a(str3, str2);
        this.f1828C.acquire();
        p h3 = this.f1834w.f1851x.f1643c.t().h(str);
        if (h3 == null) {
            this.f1826A.execute(new f(this, 0));
            return;
        }
        boolean b9 = h3.b();
        this.f1829D = b9;
        if (b9) {
            this.f1835x.E(Collections.singletonList(h3));
            return;
        }
        r.d().a(str3, "No constraints for " + str);
        f(Collections.singletonList(h3));
    }

    public final void d(boolean z6) {
        r d9 = r.d();
        StringBuilder sb = new StringBuilder("onExecuted ");
        S0.j jVar = this.f1833v;
        sb.append(jVar);
        sb.append(", ");
        sb.append(z6);
        d9.a(f1825F, sb.toString());
        b();
        int i = this.f1832u;
        j jVar2 = this.f1834w;
        A a9 = this.f1827B;
        Context context = this.f1831n;
        if (z6) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            c.d(intent, jVar);
            a9.execute(new i(i, 0, jVar2, intent));
        }
        if (this.f1829D) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            a9.execute(new i(i, 0, jVar2, intent2));
        }
    }

    @Override // O0.b
    public final void e(ArrayList arrayList) {
        this.f1826A.execute(new f(this, 0));
    }

    @Override // O0.b
    public final void f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Z2.d.k((p) it.next()).equals(this.f1833v)) {
                this.f1826A.execute(new f(this, 1));
                return;
            }
        }
    }
}
