package R0;

import J0.i;
import J0.r;
import K0.p;
import S0.j;
import T0.m;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import b3.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public final class a implements O0.b, K0.c {

    /* renamed from: C, reason: collision with root package name */
    public static final String f2725C = r.f("SystemFgDispatcher");

    /* renamed from: A, reason: collision with root package name */
    public final e f2726A;

    /* renamed from: B, reason: collision with root package name */
    public SystemForegroundService f2727B;

    /* renamed from: n, reason: collision with root package name */
    public final p f2728n;

    /* renamed from: u, reason: collision with root package name */
    public final e f2729u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f2730v = new Object();

    /* renamed from: w, reason: collision with root package name */
    public j f2731w;

    /* renamed from: x, reason: collision with root package name */
    public final LinkedHashMap f2732x;

    /* renamed from: y, reason: collision with root package name */
    public final HashMap f2733y;

    /* renamed from: z, reason: collision with root package name */
    public final HashSet f2734z;

    public a(Context context) {
        p b9 = p.b(context);
        this.f2728n = b9;
        this.f2729u = b9.f1644d;
        this.f2731w = null;
        this.f2732x = new LinkedHashMap();
        this.f2734z = new HashSet();
        this.f2733y = new HashMap();
        this.f2726A = new e(b9.f1649j, this);
        b9.f1646f.a(this);
    }

    public static Intent a(Context context, j jVar, i iVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", iVar.f1422a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", iVar.f1423b);
        intent.putExtra("KEY_NOTIFICATION", iVar.f1424c);
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f2921a);
        intent.putExtra("KEY_GENERATION", jVar.f2922b);
        return intent;
    }

    public static Intent c(Context context, j jVar, i iVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f2921a);
        intent.putExtra("KEY_GENERATION", jVar.f2922b);
        intent.putExtra("KEY_NOTIFICATION_ID", iVar.f1422a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", iVar.f1423b);
        intent.putExtra("KEY_NOTIFICATION", iVar.f1424c);
        return intent;
    }

    @Override // K0.c
    public final void b(j jVar, boolean z6) {
        Map.Entry entry;
        synchronized (this.f2730v) {
            try {
                S0.p pVar = (S0.p) this.f2733y.remove(jVar);
                if (pVar != null ? this.f2734z.remove(pVar) : false) {
                    this.f2726A.E(this.f2734z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        i iVar = (i) this.f2732x.remove(jVar);
        if (jVar.equals(this.f2731w) && this.f2732x.size() > 0) {
            Iterator it = this.f2732x.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f2731w = (j) entry.getKey();
            if (this.f2727B != null) {
                i iVar2 = (i) entry.getValue();
                SystemForegroundService systemForegroundService = this.f2727B;
                systemForegroundService.f5358u.post(new b(systemForegroundService, iVar2.f1422a, iVar2.f1424c, iVar2.f1423b));
                SystemForegroundService systemForegroundService2 = this.f2727B;
                systemForegroundService2.f5358u.post(new L.a(systemForegroundService2, iVar2.f1422a, 2));
            }
        }
        SystemForegroundService systemForegroundService3 = this.f2727B;
        if (iVar == null || systemForegroundService3 == null) {
            return;
        }
        r.d().a(f2725C, "Removing Notification (id: " + iVar.f1422a + ", workSpecId: " + jVar + ", notificationType: " + iVar.f1423b);
        systemForegroundService3.f5358u.post(new L.a(systemForegroundService3, iVar.f1422a, 2));
    }

    public final void d(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        j jVar = new j(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        r d9 = r.d();
        StringBuilder sb = new StringBuilder("Notifying with (id:");
        sb.append(intExtra);
        sb.append(", workSpecId: ");
        sb.append(stringExtra);
        sb.append(", notificationType :");
        d9.a(f2725C, AbstractC5128c.e(intExtra2, ")", sb));
        if (notification == null || this.f2727B == null) {
            return;
        }
        i iVar = new i(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f2732x;
        linkedHashMap.put(jVar, iVar);
        if (this.f2731w == null) {
            this.f2731w = jVar;
            SystemForegroundService systemForegroundService = this.f2727B;
            systemForegroundService.f5358u.post(new b(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.f2727B;
        systemForegroundService2.f5358u.post(new M0.i(systemForegroundService2, intExtra, notification, 1));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i |= ((i) ((Map.Entry) it.next()).getValue()).f1423b;
        }
        i iVar2 = (i) linkedHashMap.get(this.f2731w);
        if (iVar2 != null) {
            SystemForegroundService systemForegroundService3 = this.f2727B;
            systemForegroundService3.f5358u.post(new b(systemForegroundService3, iVar2.f1422a, iVar2.f1424c, i));
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
            String str = pVar.f2937a;
            r.d().a(f2725C, AbstractC5128c.f("Constraints unmet for WorkSpec ", str));
            j k9 = Z2.d.k(pVar);
            p pVar2 = this.f2728n;
            pVar2.f1644d.h(new m(pVar2, new K0.j(k9), true));
        }
    }

    public final void g() {
        this.f2727B = null;
        synchronized (this.f2730v) {
            this.f2726A.F();
        }
        this.f2728n.f1646f.e(this);
    }

    @Override // O0.b
    public final void f(List list) {
    }
}
