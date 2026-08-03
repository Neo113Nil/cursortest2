package w4;

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
import m.t;
import o4.g;
import o4.o;
import p4.i;
import p4.n;
import x4.j;
import x4.p;
import y4.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements t4.b, p4.c {

    /* renamed from: p, reason: collision with root package name */
    public static final String f7647p = o.f("SystemFgDispatcher");

    /* renamed from: g, reason: collision with root package name */
    public final n f7648g;

    /* renamed from: h, reason: collision with root package name */
    public final a5.a f7649h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f7650i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public j f7651j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f7652k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f7653l;

    /* renamed from: m, reason: collision with root package name */
    public final HashSet f7654m;

    /* renamed from: n, reason: collision with root package name */
    public final a5.c f7655n;

    /* renamed from: o, reason: collision with root package name */
    public SystemForegroundService f7656o;

    public b(Context context) {
        n a6 = n.a(context);
        this.f7648g = a6;
        this.f7649h = a6.f5496d;
        this.f7651j = null;
        this.f7652k = new LinkedHashMap();
        this.f7654m = new HashSet();
        this.f7653l = new HashMap();
        this.f7655n = new a5.c(a6.f5502j, this);
        a6.f5498f.a(this);
    }

    public static Intent a(Context context, j jVar, g gVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.f5209a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.f5210b);
        intent.putExtra("KEY_NOTIFICATION", gVar.f5211c);
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f8307a);
        intent.putExtra("KEY_GENERATION", jVar.f8308b);
        return intent;
    }

    public static Intent c(Context context, j jVar, g gVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f8307a);
        intent.putExtra("KEY_GENERATION", jVar.f8308b);
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.f5209a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.f5210b);
        intent.putExtra("KEY_NOTIFICATION", gVar.f5211c);
        return intent;
    }

    @Override // p4.c
    public final void b(j jVar, boolean z10) {
        Map.Entry entry;
        synchronized (this.f7650i) {
            try {
                p pVar = (p) this.f7653l.remove(jVar);
                if (pVar != null ? this.f7654m.remove(pVar) : false) {
                    this.f7655n.G(this.f7654m);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g gVar = (g) this.f7652k.remove(jVar);
        if (jVar.equals(this.f7651j) && this.f7652k.size() > 0) {
            Iterator it = this.f7652k.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f7651j = (j) entry.getKey();
            if (this.f7656o != null) {
                g gVar2 = (g) entry.getValue();
                SystemForegroundService systemForegroundService = this.f7656o;
                systemForegroundService.f782h.post(new c(systemForegroundService, gVar2.f5209a, gVar2.f5211c, gVar2.f5210b));
                SystemForegroundService systemForegroundService2 = this.f7656o;
                systemForegroundService2.f782h.post(new e3.a(gVar2.f5209a, 3, systemForegroundService2));
            }
        }
        SystemForegroundService systemForegroundService3 = this.f7656o;
        if (gVar == null || systemForegroundService3 == null) {
            return;
        }
        o.d().a(f7647p, "Removing Notification (id: " + gVar.f5209a + ", workSpecId: " + jVar + ", notificationType: " + gVar.f5210b);
        systemForegroundService3.f782h.post(new e3.a(gVar.f5209a, 3, systemForegroundService3));
    }

    @Override // t4.b
    public final void d(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            p pVar = (p) obj;
            String str = pVar.f8322a;
            o.d().a(f7647p, "Constraints unmet for WorkSpec " + str);
            j h10 = ud.g.h(pVar);
            n nVar = this.f7648g;
            nVar.f5496d.a(new m(nVar, new i(h10), true));
        }
    }

    public final void f(Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        j jVar = new j(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        o.d().a(f7647p, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null || this.f7656o == null) {
            return;
        }
        g gVar = new g(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f7652k;
        linkedHashMap.put(jVar, gVar);
        if (this.f7651j == null) {
            this.f7651j = jVar;
            SystemForegroundService systemForegroundService = this.f7656o;
            systemForegroundService.f782h.post(new c(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.f7656o;
        systemForegroundService2.f782h.post(new t(systemForegroundService2, intExtra, notification));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i10 |= ((g) ((Map.Entry) it.next()).getValue()).f5210b;
        }
        g gVar2 = (g) linkedHashMap.get(this.f7651j);
        if (gVar2 != null) {
            SystemForegroundService systemForegroundService3 = this.f7656o;
            systemForegroundService3.f782h.post(new c(systemForegroundService3, gVar2.f5209a, gVar2.f5211c, i10));
        }
    }

    public final void g() {
        this.f7656o = null;
        synchronized (this.f7650i) {
            this.f7655n.H();
        }
        this.f7648g.f5498f.e(this);
    }

    @Override // t4.b
    public final void e(List list) {
    }
}
