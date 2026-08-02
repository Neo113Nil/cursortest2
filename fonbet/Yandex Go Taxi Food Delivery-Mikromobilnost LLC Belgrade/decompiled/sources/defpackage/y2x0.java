package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.b;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class y2x0 implements zx60, uko {
    public static final String C = hgz.o("SystemFgDispatcher");
    public final y851 A;
    public SystemForegroundService B;
    public final b a;
    public final btx0 b;
    public final Object c = new Object();
    public n951 w;
    public final LinkedHashMap x;
    public final HashMap y;
    public final HashMap z;

    public y2x0(Context context) {
        b i = b.i(context);
        this.a = i;
        this.b = i.d;
        this.w = null;
        this.x = new LinkedHashMap();
        this.z = new HashMap();
        this.y = new HashMap();
        this.A = new y851(i.j);
        i.f.a(this);
    }

    public static Intent a(Context context, n951 n951Var, s2s s2sVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", n951Var.a);
        intent.putExtra("KEY_GENERATION", n951Var.b);
        intent.putExtra("KEY_NOTIFICATION_ID", s2sVar.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", s2sVar.b);
        intent.putExtra("KEY_NOTIFICATION", s2sVar.c);
        return intent;
    }

    public static Intent b(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    public final void c(Intent intent) {
        if (this.B == null) {
            ny61.r("handleNotify was called on the destroyed dispatcher");
            return;
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        n951 n951Var = new n951(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        hgz.g().getClass();
        if (notification == null) {
            ny61.g("Notification passed in the intent was null.");
            return;
        }
        s2s s2sVar = new s2s(intExtra, intExtra2, notification);
        LinkedHashMap linkedHashMap = this.x;
        linkedHashMap.put(n951Var, s2sVar);
        s2s s2sVar2 = (s2s) linkedHashMap.get(this.w);
        if (s2sVar2 == null) {
            this.w = n951Var;
        } else {
            this.B.notify(intExtra, notification);
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                i |= ((s2s) ((Map.Entry) it.next()).getValue()).b;
            }
            s2sVar = new s2s(s2sVar2.a, i, s2sVar2.c);
        }
        this.B.startForeground(s2sVar.a, s2sVar.b, s2sVar.c);
    }

    @Override // defpackage.zx60
    public final void d(fa51 fa51Var, s8e s8eVar) {
        if (s8eVar instanceof r8e) {
            String str = fa51Var.a;
            hgz.g().getClass();
            n951 q = udq0.q(fa51Var);
            int i = ((r8e) s8eVar).a;
            b bVar = this.a;
            btx0 btx0Var = bVar.d;
            z52 z52Var = new z52(bVar.f, new h2u0(q), true, i);
            btx0Var.getClass();
            ((t951) btx0Var).a.execute(z52Var);
        }
    }

    public final void e() {
        this.B = null;
        synchronized (this.c) {
            try {
                Iterator it = this.z.values().iterator();
                while (it.hasNext()) {
                    ((l8x) it.next()).a(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        r6f0 r6f0Var = this.a.f;
        synchronized (r6f0Var.k) {
            r6f0Var.j.remove(this);
        }
    }

    public final void f(int i, int i2) {
        hgz.g().h(C, "Foreground service timed out, FGS type: " + i2);
        for (Map.Entry entry : this.x.entrySet()) {
            if (((s2s) entry.getValue()).b == i2) {
                n951 n951Var = (n951) entry.getKey();
                b bVar = this.a;
                btx0 btx0Var = bVar.d;
                z52 z52Var = new z52(bVar.f, new h2u0(n951Var), true, -128);
                btx0Var.getClass();
                ((t951) btx0Var).a.execute(z52Var);
            }
        }
        SystemForegroundService systemForegroundService = this.B;
        if (systemForegroundService != null) {
            systemForegroundService.stop(i);
        }
    }

    @Override // defpackage.uko
    public final void onExecuted(n951 n951Var, boolean z) {
        Map.Entry entry;
        synchronized (this.c) {
            try {
                l8x l8xVar = ((fa51) this.y.remove(n951Var)) != null ? (l8x) this.z.remove(n951Var) : null;
                if (l8xVar != null) {
                    l8xVar.a(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        s2s s2sVar = (s2s) this.x.remove(n951Var);
        if (n951Var.equals(this.w)) {
            if (this.x.size() > 0) {
                Iterator it = this.x.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.w = (n951) entry.getKey();
                if (this.B != null) {
                    s2s s2sVar2 = (s2s) entry.getValue();
                    this.B.startForeground(s2sVar2.a, s2sVar2.b, s2sVar2.c);
                    this.B.cancelNotification(s2sVar2.a);
                }
            } else {
                this.w = null;
            }
        }
        SystemForegroundService systemForegroundService = this.B;
        if (s2sVar == null || systemForegroundService == null) {
            return;
        }
        hgz g = hgz.g();
        n951Var.toString();
        g.getClass();
        systemForegroundService.cancelNotification(s2sVar.a);
    }
}
