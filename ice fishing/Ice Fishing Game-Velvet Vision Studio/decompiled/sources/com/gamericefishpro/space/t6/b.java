package com.gamericefishpro.space.t6;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.l6.i;
import com.gamericefishpro.space.l6.q;
import com.gamericefishpro.space.m6.o;
import com.gamericefishpro.space.n.a0;
import com.gamericefishpro.space.u6.j;
import com.gamericefishpro.space.u6.p;
import com.gamericefishpro.space.v6.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements com.gamericefishpro.space.q6.b, com.gamericefishpro.space.m6.c {
    public static final String C = q.d("SystemFgDispatcher");
    public final com.gamericefishpro.space.a8.c A;
    public SystemForegroundService B;
    public final o d;
    public final com.gamericefishpro.space.x6.a e;
    public final Object i = new Object();
    public j v;
    public final LinkedHashMap w;
    public final HashMap y;
    public final HashSet z;

    public b(Context context) {
        o oVarA = o.a(context);
        this.d = oVarA;
        this.e = oVarA.d;
        this.v = null;
        this.w = new LinkedHashMap();
        this.z = new HashSet();
        this.y = new HashMap();
        this.A = new com.gamericefishpro.space.a8.c(oVarA.j, this);
        oVarA.f.a(this);
    }

    public static Intent a(Context context, j jVar, i iVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", iVar.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", iVar.b);
        intent.putExtra("KEY_NOTIFICATION", iVar.c);
        intent.putExtra("KEY_WORKSPEC_ID", jVar.a);
        intent.putExtra("KEY_GENERATION", jVar.b);
        return intent;
    }

    public static Intent b(Context context, j jVar, i iVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", jVar.a);
        intent.putExtra("KEY_GENERATION", jVar.b);
        intent.putExtra("KEY_NOTIFICATION_ID", iVar.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", iVar.b);
        intent.putExtra("KEY_NOTIFICATION", iVar.c);
        return intent;
    }

    @Override // com.gamericefishpro.space.q6.b
    public final void c(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            p pVar = (p) obj;
            String str = pVar.a;
            q.c().getClass();
            j jVarY = a4.y(pVar);
            o oVar = this.d;
            oVar.d.a(new l(oVar, new com.gamericefishpro.space.m6.j(jVarY), true));
        }
    }

    public final void e(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        j jVar = new j(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        q.c().getClass();
        if (notification == null || this.B == null) {
            return;
        }
        i iVar = new i(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.w;
        linkedHashMap.put(jVar, iVar);
        if (this.v == null) {
            this.v = jVar;
            SystemForegroundService systemForegroundService = this.B;
            systemForegroundService.e.post(new c(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.B;
        systemForegroundService2.e.post(new a0(systemForegroundService2, intExtra, notification));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i |= ((i) ((Map.Entry) it.next()).getValue()).b;
        }
        i iVar2 = (i) linkedHashMap.get(this.v);
        if (iVar2 != null) {
            SystemForegroundService systemForegroundService3 = this.B;
            systemForegroundService3.e.post(new c(systemForegroundService3, iVar2.a, iVar2.c, i));
        }
    }

    @Override // com.gamericefishpro.space.m6.c
    public final void f(j jVar, boolean z) {
        Map.Entry entry;
        synchronized (this.i) {
            try {
                p pVar = (p) this.y.remove(jVar);
                if (pVar != null ? this.z.remove(pVar) : false) {
                    this.A.w(this.z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        i iVar = (i) this.w.remove(jVar);
        if (jVar.equals(this.v) && this.w.size() > 0) {
            Iterator it = this.w.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.v = (j) entry.getKey();
            if (this.B != null) {
                i iVar2 = (i) entry.getValue();
                SystemForegroundService systemForegroundService = this.B;
                systemForegroundService.e.post(new c(systemForegroundService, iVar2.a, iVar2.c, iVar2.b));
                SystemForegroundService systemForegroundService2 = this.B;
                systemForegroundService2.e.post(new com.gamericefishpro.space.s4.i(iVar2.a, 1, systemForegroundService2));
            }
        }
        SystemForegroundService systemForegroundService3 = this.B;
        if (iVar == null || systemForegroundService3 == null) {
            return;
        }
        q qVarC = q.c();
        jVar.toString();
        qVarC.getClass();
        systemForegroundService3.e.post(new com.gamericefishpro.space.s4.i(iVar.a, 1, systemForegroundService3));
    }

    public final void g() {
        this.B = null;
        synchronized (this.i) {
            this.A.x();
        }
        this.d.f.d(this);
    }

    @Override // com.gamericefishpro.space.q6.b
    public final void d(List list) {
    }
}
