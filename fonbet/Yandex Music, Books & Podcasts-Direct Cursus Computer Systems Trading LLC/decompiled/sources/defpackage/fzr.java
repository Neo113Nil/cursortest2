package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class fzr implements upj, rob {
    public static final String j = jsg.n("SystemFgDispatcher");
    public final g4w a;
    public final j4w b;
    public final Object c = new Object();
    public a4w d;
    public final LinkedHashMap e;
    public final HashMap f;
    public final HashMap g;
    public final kpm h;
    public SystemForegroundService i;

    public fzr(Context context) {
        g4w d = g4w.d(context);
        this.a = d;
        this.b = d.d;
        this.d = null;
        this.e = new LinkedHashMap();
        this.g = new HashMap();
        this.f = new HashMap();
        this.h = new kpm(d.j);
        d.f.a(this);
    }

    public static Intent b(Context context, a4w a4wVar, hrc hrcVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", a4wVar.a);
        intent.putExtra("KEY_GENERATION", a4wVar.b);
        intent.putExtra("KEY_NOTIFICATION_ID", hrcVar.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hrcVar.b);
        intent.putExtra("KEY_NOTIFICATION", hrcVar.c);
        return intent;
    }

    @Override // defpackage.rob
    public final void a(a4w a4wVar, boolean z) {
        Map.Entry entry;
        synchronized (this.c) {
            try {
                r2f r2fVar = ((t4w) this.f.remove(a4wVar)) != null ? (r2f) this.g.remove(a4wVar) : null;
                if (r2fVar != null) {
                    r2fVar.g(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        hrc hrcVar = (hrc) this.e.remove(a4wVar);
        if (a4wVar.equals(this.d)) {
            if (this.e.size() > 0) {
                Iterator it = this.e.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.d = (a4w) entry.getKey();
                if (this.i != null) {
                    hrc hrcVar2 = (hrc) entry.getValue();
                    SystemForegroundService systemForegroundService = this.i;
                    int i = hrcVar2.a;
                    int i2 = hrcVar2.b;
                    Notification notification = hrcVar2.c;
                    systemForegroundService.getClass();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        mi.K(systemForegroundService, i, notification, i2);
                    } else if (i3 >= 29) {
                        mi.J(systemForegroundService, i, notification, i2);
                    } else {
                        systemForegroundService.startForeground(i, notification);
                    }
                    this.i.d.cancel(hrcVar2.a);
                }
            } else {
                this.d = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.i;
        if (hrcVar == null || systemForegroundService2 == null) {
            return;
        }
        jsg.j().e(j, "Removing Notification (id: " + hrcVar.a + ", workSpecId: " + a4wVar + ", notificationType: " + hrcVar.b);
        systemForegroundService2.d.cancel(hrcVar.a);
    }

    public final void c(Intent intent) {
        if (this.i == null) {
            xq0.q("handleNotify was called on the destroyed dispatcher");
            return;
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        a4w a4wVar = new a4w(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        jsg j2 = jsg.j();
        StringBuilder r = k5r.r(intExtra, "Notifying with (id:", ", workSpecId: ", stringExtra, ", notificationType :");
        r.append(intExtra2);
        r.append(")");
        j2.e(j, r.toString());
        if (notification == null) {
            xq0.x("Notification passed in the intent was null.");
            return;
        }
        hrc hrcVar = new hrc(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.e;
        linkedHashMap.put(a4wVar, hrcVar);
        hrc hrcVar2 = (hrc) linkedHashMap.get(this.d);
        if (hrcVar2 == null) {
            this.d = a4wVar;
        } else {
            this.i.d.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i |= ((hrc) ((Map.Entry) it.next()).getValue()).b;
                }
                hrcVar = new hrc(hrcVar2.a, hrcVar2.c, i);
            } else {
                hrcVar = hrcVar2;
            }
        }
        SystemForegroundService systemForegroundService = this.i;
        int i2 = hrcVar.a;
        int i3 = hrcVar.b;
        Notification notification2 = hrcVar.c;
        systemForegroundService.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            mi.K(systemForegroundService, i2, notification2, i3);
        } else if (i4 >= 29) {
            mi.J(systemForegroundService, i2, notification2, i3);
        } else {
            systemForegroundService.startForeground(i2, notification2);
        }
    }

    @Override // defpackage.upj
    public final void d(t4w t4wVar, na6 na6Var) {
        if (na6Var instanceof ma6) {
            String str = t4wVar.a;
            jsg.j().e(j, "Constraints unmet for WorkSpec " + str);
            a4w A = bzf.A(t4wVar);
            int i = ((ma6) na6Var).a;
            g4w g4wVar = this.a;
            g4wVar.d.a.execute(new md3(g4wVar.f, new ucr(A), true, i));
        }
    }

    public final void e() {
        this.i = null;
        synchronized (this.c) {
            try {
                Iterator it = this.g.values().iterator();
                while (it.hasNext()) {
                    ((r2f) it.next()).g(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        htm htmVar = this.a.f;
        synchronized (htmVar.k) {
            htmVar.j.remove(this);
        }
    }

    public final void f(int i, int i2) {
        jsg.j().k(j, "Foreground service timed out, FGS type: " + i2);
        for (Map.Entry entry : this.e.entrySet()) {
            if (((hrc) entry.getValue()).b == i2) {
                a4w a4wVar = (a4w) entry.getKey();
                g4w g4wVar = this.a;
                g4wVar.d.a.execute(new md3(g4wVar.f, new ucr(a4wVar), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.i;
        if (systemForegroundService != null) {
            systemForegroundService.b = true;
            jsg.j().e(SystemForegroundService.e, "Shutting down.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf(i);
        }
    }
}
