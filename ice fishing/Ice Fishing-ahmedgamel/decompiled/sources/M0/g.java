package M0;

import O2.B;
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

/* loaded from: classes.dex */
public final class g implements O0.b, s {

    /* renamed from: F, reason: collision with root package name */
    public static final String f1792F = J0.s.f("DelayMetCommandHandler");

    /* renamed from: A, reason: collision with root package name */
    public final l f1793A;

    /* renamed from: B, reason: collision with root package name */
    public final B f1794B;

    /* renamed from: C, reason: collision with root package name */
    public PowerManager.WakeLock f1795C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1796D;

    /* renamed from: E, reason: collision with root package name */
    public final K0.j f1797E;

    /* renamed from: n, reason: collision with root package name */
    public final Context f1798n;

    /* renamed from: u, reason: collision with root package name */
    public final int f1799u;

    /* renamed from: v, reason: collision with root package name */
    public final S0.j f1800v;

    /* renamed from: w, reason: collision with root package name */
    public final j f1801w;

    /* renamed from: x, reason: collision with root package name */
    public final Z2.e f1802x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f1803y;

    /* renamed from: z, reason: collision with root package name */
    public int f1804z;

    public g(Context context, int i, j jVar, K0.j jVar2) {
        this.f1798n = context;
        this.f1799u = i;
        this.f1801w = jVar;
        this.f1800v = jVar2.f1517a;
        this.f1797E = jVar2;
        S0.i iVar = jVar.f1818x.f1540j;
        Z2.e eVar = jVar.f1815u;
        this.f1793A = (l) eVar.f4170u;
        this.f1794B = (B) eVar.f4172w;
        this.f1802x = new Z2.e(iVar, this);
        this.f1796D = false;
        this.f1804z = 0;
        this.f1803y = new Object();
    }

    public static void a(g gVar) {
        S0.j jVar = gVar.f1800v;
        int i = gVar.f1804z;
        String str = jVar.f2792a;
        String str2 = f1792F;
        if (i >= 2) {
            J0.s.d().a(str2, "Already stopped work for " + str);
            return;
        }
        gVar.f1804z = 2;
        J0.s.d().a(str2, "Stopping work for WorkSpec " + str);
        Context context = gVar.f1798n;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        c.d(intent, jVar);
        j jVar2 = gVar.f1801w;
        int i6 = gVar.f1799u;
        i iVar = new i(i6, 0, jVar2, intent);
        B b9 = gVar.f1794B;
        b9.execute(iVar);
        if (!jVar2.f1817w.d(str)) {
            J0.s.d().a(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        J0.s.d().a(str2, "WorkSpec " + str + " needs to be rescheduled");
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        c.d(intent2, jVar);
        b9.execute(new i(i6, 0, jVar2, intent2));
    }

    public final void b() {
        synchronized (this.f1803y) {
            try {
                this.f1802x.F();
                this.f1801w.f1816v.a(this.f1800v);
                PowerManager.WakeLock wakeLock = this.f1795C;
                if (wakeLock != null && wakeLock.isHeld()) {
                    J0.s.d().a(f1792F, "Releasing wakelock " + this.f1795C + "for WorkSpec " + this.f1800v);
                    this.f1795C.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        S0.j jVar = this.f1800v;
        StringBuilder sb = new StringBuilder();
        String str = jVar.f2792a;
        sb.append(str);
        sb.append(" (");
        this.f1795C = n.a(this.f1798n, u1.h.e(this.f1799u, ")", sb));
        J0.s d2 = J0.s.d();
        String str2 = "Acquiring wakelock " + this.f1795C + "for WorkSpec " + str;
        String str3 = f1792F;
        d2.a(str3, str2);
        this.f1795C.acquire();
        p h9 = this.f1801w.f1818x.f1534c.t().h(str);
        if (h9 == null) {
            this.f1793A.execute(new f(this, 0));
            return;
        }
        boolean b9 = h9.b();
        this.f1796D = b9;
        if (b9) {
            this.f1802x.E(Collections.singletonList(h9));
            return;
        }
        J0.s.d().a(str3, "No constraints for " + str);
        f(Collections.singletonList(h9));
    }

    public final void d(boolean z3) {
        J0.s d2 = J0.s.d();
        StringBuilder sb = new StringBuilder("onExecuted ");
        S0.j jVar = this.f1800v;
        sb.append(jVar);
        sb.append(", ");
        sb.append(z3);
        d2.a(f1792F, sb.toString());
        b();
        int i = this.f1799u;
        j jVar2 = this.f1801w;
        B b9 = this.f1794B;
        Context context = this.f1798n;
        if (z3) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            c.d(intent, jVar);
            b9.execute(new i(i, 0, jVar2, intent));
        }
        if (this.f1796D) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            b9.execute(new i(i, 0, jVar2, intent2));
        }
    }

    @Override // O0.b
    public final void e(ArrayList arrayList) {
        this.f1793A.execute(new f(this, 0));
    }

    @Override // O0.b
    public final void f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (com.bumptech.glide.e.c((p) it.next()).equals(this.f1800v)) {
                this.f1793A.execute(new f(this, 1));
                return;
            }
        }
    }
}
