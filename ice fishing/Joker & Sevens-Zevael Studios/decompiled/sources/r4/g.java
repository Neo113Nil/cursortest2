package r4;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o4.o;
import x4.j;
import x4.n;
import x4.p;
import y4.l;
import y4.t;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g implements t4.b, t {

    /* renamed from: s, reason: collision with root package name */
    public static final String f6060s = o.f("DelayMetCommandHandler");

    /* renamed from: g, reason: collision with root package name */
    public final Context f6061g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6062h;

    /* renamed from: i, reason: collision with root package name */
    public final j f6063i;

    /* renamed from: j, reason: collision with root package name */
    public final i f6064j;

    /* renamed from: k, reason: collision with root package name */
    public final a5.c f6065k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f6066l;

    /* renamed from: m, reason: collision with root package name */
    public int f6067m;

    /* renamed from: n, reason: collision with root package name */
    public final l f6068n;

    /* renamed from: o, reason: collision with root package name */
    public final a5.b f6069o;

    /* renamed from: p, reason: collision with root package name */
    public PowerManager.WakeLock f6070p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6071q;

    /* renamed from: r, reason: collision with root package name */
    public final p4.i f6072r;

    public g(Context context, int i10, i iVar, p4.i iVar2) {
        this.f6061g = context;
        this.f6062h = i10;
        this.f6064j = iVar;
        this.f6063i = iVar2.f5478a;
        this.f6072r = iVar2;
        n nVar = iVar.f6080k.f5502j;
        a5.c cVar = (a5.c) iVar.f6077h;
        this.f6068n = (l) cVar.f262h;
        this.f6069o = (a5.b) cVar.f263i;
        this.f6065k = new a5.c(nVar, this);
        this.f6071q = false;
        this.f6067m = 0;
        this.f6066l = new Object();
    }

    public static void a(g gVar) {
        int i10 = gVar.f6062h;
        a5.b bVar = gVar.f6069o;
        Context context = gVar.f6061g;
        i iVar = gVar.f6064j;
        j jVar = gVar.f6063i;
        String str = jVar.f8307a;
        int i11 = gVar.f6067m;
        String str2 = f6060s;
        if (i11 >= 2) {
            o.d().a(str2, "Already stopped work for " + str);
            return;
        }
        gVar.f6067m = 2;
        o.d().a(str2, "Stopping work for WorkSpec " + str);
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        c.d(intent, jVar);
        bVar.execute(new m.t(i10, 1, iVar, intent));
        if (!iVar.f6079j.d(str)) {
            o.d().a(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        o.d().a(str2, "WorkSpec " + str + " needs to be rescheduled");
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        c.d(intent2, jVar);
        bVar.execute(new m.t(i10, 1, iVar, intent2));
    }

    public final void b() {
        synchronized (this.f6066l) {
            try {
                this.f6065k.H();
                this.f6064j.f6078i.a(this.f6063i);
                PowerManager.WakeLock wakeLock = this.f6070p;
                if (wakeLock != null && wakeLock.isHeld()) {
                    o.d().a(f6060s, "Releasing wakelock " + this.f6070p + "for WorkSpec " + this.f6063i);
                    this.f6070p.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        String str = this.f6063i.f8307a;
        this.f6070p = y4.n.a(this.f6061g, str + " (" + this.f6062h + ")");
        o d10 = o.d();
        String str2 = "Acquiring wakelock " + this.f6070p + "for WorkSpec " + str;
        String str3 = f6060s;
        d10.a(str3, str2);
        this.f6070p.acquire();
        p k3 = this.f6064j.f6080k.f5495c.t().k(str);
        if (k3 == null) {
            this.f6068n.execute(new f(this, 0));
            return;
        }
        boolean b2 = k3.b();
        this.f6071q = b2;
        if (b2) {
            this.f6065k.G(Collections.singletonList(k3));
            return;
        }
        o.d().a(str3, "No constraints for " + str);
        e(Collections.singletonList(k3));
    }

    @Override // t4.b
    public final void d(ArrayList arrayList) {
        this.f6068n.execute(new f(this, 0));
    }

    @Override // t4.b
    public final void e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (ud.g.h((p) it.next()).equals(this.f6063i)) {
                this.f6068n.execute(new f(this, 1));
                return;
            }
        }
    }

    public final void f(boolean z10) {
        o d10 = o.d();
        StringBuilder sb = new StringBuilder("onExecuted ");
        j jVar = this.f6063i;
        sb.append(jVar);
        sb.append(", ");
        sb.append(z10);
        d10.a(f6060s, sb.toString());
        b();
        int i10 = this.f6062h;
        i iVar = this.f6064j;
        a5.b bVar = this.f6069o;
        Context context = this.f6061g;
        if (z10) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            c.d(intent, jVar);
            bVar.execute(new m.t(i10, 1, iVar, intent));
        }
        if (this.f6071q) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            bVar.execute(new m.t(i10, 1, iVar, intent2));
        }
    }
}
