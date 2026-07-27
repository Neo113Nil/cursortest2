package R0;

import J0.s;
import K0.p;
import M0.i;
import S0.j;
import T0.m;
import Y2.e;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class a implements O0.b, K0.c {

    /* renamed from: C, reason: collision with root package name */
    public static final String f2778C = s.f("SystemFgDispatcher");

    /* renamed from: A, reason: collision with root package name */
    public final e f2779A;

    /* renamed from: B, reason: collision with root package name */
    public SystemForegroundService f2780B;

    /* renamed from: n, reason: collision with root package name */
    public final p f2781n;

    /* renamed from: u, reason: collision with root package name */
    public final e f2782u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f2783v = new Object();

    /* renamed from: w, reason: collision with root package name */
    public j f2784w;

    /* renamed from: x, reason: collision with root package name */
    public final LinkedHashMap f2785x;

    /* renamed from: y, reason: collision with root package name */
    public final HashMap f2786y;

    /* renamed from: z, reason: collision with root package name */
    public final HashSet f2787z;

    public a(Context context) {
        p b9 = p.b(context);
        this.f2781n = b9;
        this.f2782u = b9.f1533d;
        this.f2784w = null;
        this.f2785x = new LinkedHashMap();
        this.f2787z = new HashSet();
        this.f2786y = new HashMap();
        this.f2779A = new e(b9.f1538j, this);
        b9.f1535f.a(this);
    }

    public static Intent a(Context context, j jVar, J0.j jVar2) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", jVar2.f1319a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", jVar2.f1320b);
        intent.putExtra("KEY_NOTIFICATION", jVar2.f1321c);
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f2905a);
        intent.putExtra("KEY_GENERATION", jVar.f2906b);
        return intent;
    }

    public static Intent c(Context context, j jVar, J0.j jVar2) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f2905a);
        intent.putExtra("KEY_GENERATION", jVar.f2906b);
        intent.putExtra("KEY_NOTIFICATION_ID", jVar2.f1319a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", jVar2.f1320b);
        intent.putExtra("KEY_NOTIFICATION", jVar2.f1321c);
        return intent;
    }

    @Override // K0.c
    public final void b(j jVar, boolean z8) {
        Map.Entry entry;
        synchronized (this.f2783v) {
            try {
                S0.p pVar = (S0.p) this.f2786y.remove(jVar);
                if (pVar != null ? this.f2787z.remove(pVar) : false) {
                    this.f2779A.H(this.f2787z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        J0.j jVar2 = (J0.j) this.f2785x.remove(jVar);
        if (jVar.equals(this.f2784w) && this.f2785x.size() > 0) {
            Iterator it = this.f2785x.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f2784w = (j) entry.getKey();
            if (this.f2780B != null) {
                J0.j jVar3 = (J0.j) entry.getValue();
                SystemForegroundService systemForegroundService = this.f2780B;
                systemForegroundService.f5505u.post(new b(systemForegroundService, jVar3.f1319a, jVar3.f1321c, jVar3.f1320b));
                SystemForegroundService systemForegroundService2 = this.f2780B;
                systemForegroundService2.f5505u.post(new L.a(systemForegroundService2, jVar3.f1319a, 2));
            }
        }
        SystemForegroundService systemForegroundService3 = this.f2780B;
        if (jVar2 == null || systemForegroundService3 == null) {
            return;
        }
        s.d().a(f2778C, "Removing Notification (id: " + jVar2.f1319a + ", workSpecId: " + jVar + ", notificationType: " + jVar2.f1320b);
        systemForegroundService3.f5505u.post(new L.a(systemForegroundService3, jVar2.f1319a, 2));
    }

    public final void d(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        j jVar = new j(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        s d2 = s.d();
        StringBuilder sb = new StringBuilder("Notifying with (id:");
        sb.append(intExtra);
        sb.append(", workSpecId: ");
        sb.append(stringExtra);
        sb.append(", notificationType :");
        d2.a(f2778C, AbstractC5051n.e(intExtra2, ")", sb));
        if (notification == null || this.f2780B == null) {
            return;
        }
        J0.j jVar2 = new J0.j(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f2785x;
        linkedHashMap.put(jVar, jVar2);
        if (this.f2784w == null) {
            this.f2784w = jVar;
            SystemForegroundService systemForegroundService = this.f2780B;
            systemForegroundService.f5505u.post(new b(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.f2780B;
        systemForegroundService2.f5505u.post(new i(systemForegroundService2, intExtra, notification, 1));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i |= ((J0.j) ((Map.Entry) it.next()).getValue()).f1320b;
        }
        J0.j jVar3 = (J0.j) linkedHashMap.get(this.f2784w);
        if (jVar3 != null) {
            SystemForegroundService systemForegroundService3 = this.f2780B;
            systemForegroundService3.f5505u.post(new b(systemForegroundService3, jVar3.f1319a, jVar3.f1321c, i));
        }
    }

    @Override // O0.b
    public final void e(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            S0.p pVar = (S0.p) it.next();
            String str = pVar.f2920a;
            s.d().a(f2778C, AbstractC5051n.f("Constraints unmet for WorkSpec ", str));
            j e6 = U2.a.e(pVar);
            p pVar2 = this.f2781n;
            pVar2.f1533d.i(new m(pVar2, new K0.j(e6), true));
        }
    }

    public final void g() {
        this.f2780B = null;
        synchronized (this.f2783v) {
            this.f2779A.I();
        }
        this.f2781n.f1535f.e(this);
    }

    @Override // O0.b
    public final void f(List list) {
    }
}
