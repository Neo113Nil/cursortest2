package M0;

import D.y;
import J0.s;
import O2.B;
import S0.p;
import T0.m;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import z0.C5253i;

/* loaded from: classes.dex */
public final class c implements K0.c {

    /* renamed from: x, reason: collision with root package name */
    public static final String f1780x = s.f("CommandHandler");

    /* renamed from: n, reason: collision with root package name */
    public final Context f1781n;

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f1782u = new HashMap();

    /* renamed from: v, reason: collision with root package name */
    public final Object f1783v = new Object();

    /* renamed from: w, reason: collision with root package name */
    public final S0.c f1784w;

    public c(Context context, S0.c cVar) {
        this.f1781n = context;
        this.f1784w = cVar;
    }

    public static S0.j c(Intent intent) {
        return new S0.j(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void d(Intent intent, S0.j jVar) {
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f2792a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", jVar.f2793b);
    }

    public final void a(Intent intent, int i, j jVar) {
        List<K0.j> list;
        String action = intent.getAction();
        int i6 = 0;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            s.d().a(f1780x, "Handling constraints changed " + intent);
            e eVar = new e(this.f1781n, i, jVar);
            ArrayList d2 = jVar.f1818x.f1534c.t().d();
            String str = d.f1785a;
            Iterator it = d2.iterator();
            boolean z3 = false;
            boolean z6 = false;
            boolean z9 = false;
            boolean z10 = false;
            while (it.hasNext()) {
                J0.d dVar = ((p) it.next()).f2816j;
                z3 |= dVar.f1377d;
                z6 |= dVar.f1375b;
                z9 |= dVar.f1378e;
                z10 |= dVar.f1374a != 1;
                if (z3 && z6 && z9 && z10) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f5382a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = eVar.f1787a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z6).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z9).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z10);
            context.sendBroadcast(intent2);
            Z2.e eVar2 = eVar.f1789c;
            eVar2.E(d2);
            ArrayList arrayList = new ArrayList(d2.size());
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it2 = d2.iterator();
            while (it2.hasNext()) {
                p pVar = (p) it2.next();
                String str3 = pVar.f2808a;
                if (currentTimeMillis >= pVar.a() && (!pVar.b() || eVar2.l(str3))) {
                    arrayList.add(pVar);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                p pVar2 = (p) it3.next();
                String str4 = pVar2.f2808a;
                S0.j c9 = com.bumptech.glide.e.c(pVar2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                d(intent3, c9);
                s.d().a(e.f1786d, y.o("Creating a delay_met command for workSpec with id (", str4, ")"));
                ((B) jVar.f1815u.f4172w).execute(new i(eVar.f1788b, i6, jVar, intent3));
            }
            eVar2.F();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            s.d().a(f1780x, "Handling reschedule " + intent + ", " + i);
            jVar.f1818x.e();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            s.d().b(f1780x, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            S0.j c10 = c(intent);
            String str5 = f1780x;
            s.d().a(str5, "Handling schedule work for " + c10);
            WorkDatabase workDatabase = jVar.f1818x.f1534c;
            workDatabase.c();
            try {
                p h9 = workDatabase.t().h(c10.f2792a);
                if (h9 == null) {
                    s.d().g(str5, "Skipping scheduling " + c10 + " because it's no longer in the DB");
                    return;
                }
                if (y.b(h9.f2809b)) {
                    s.d().g(str5, "Skipping scheduling " + c10 + "because it is finished.");
                    return;
                }
                long a9 = h9.a();
                boolean b9 = h9.b();
                Context context2 = this.f1781n;
                if (b9) {
                    s.d().a(str5, "Opportunistically setting an alarm for " + c10 + "at " + a9);
                    b.b(context2, workDatabase, c10, a9);
                    Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                    ((B) jVar.f1815u.f4172w).execute(new i(i, i6, jVar, intent4));
                } else {
                    s.d().a(str5, "Setting up Alarms for " + c10 + "at " + a9);
                    b.b(context2, workDatabase, c10, a9);
                }
                workDatabase.o();
                return;
            } finally {
                workDatabase.k();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.f1783v) {
                try {
                    S0.j c11 = c(intent);
                    s d9 = s.d();
                    String str6 = f1780x;
                    d9.a(str6, "Handing delay met for " + c11);
                    if (this.f1782u.containsKey(c11)) {
                        s.d().a(str6, "WorkSpec " + c11 + " is is already being handled for ACTION_DELAY_MET");
                    } else {
                        g gVar = new g(this.f1781n, i, jVar, this.f1784w.m(c11));
                        this.f1782u.put(c11, gVar);
                        gVar.c();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                s.d().g(f1780x, "Ignoring intent " + intent);
                return;
            }
            S0.j c12 = c(intent);
            boolean z11 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            s.d().a(f1780x, "Handling onExecutionCompleted " + intent + ", " + i);
            b(c12, z11);
            return;
        }
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        boolean containsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
        S0.c cVar = this.f1784w;
        if (containsKey) {
            int i9 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList2 = new ArrayList(1);
            K0.j k9 = cVar.k(new S0.j(string, i9));
            list = arrayList2;
            if (k9 != null) {
                arrayList2.add(k9);
                list = arrayList2;
            }
        } else {
            list = cVar.l(string);
        }
        for (K0.j jVar2 : list) {
            s.d().a(f1780x, u1.h.f("Handing stopWork work for ", string));
            K0.p pVar3 = jVar.f1818x;
            pVar3.f1535d.i(new m(pVar3, jVar2, false));
            WorkDatabase workDatabase2 = jVar.f1818x.f1534c;
            S0.j jVar3 = jVar2.f1517a;
            String str7 = b.f1779a;
            S0.i p9 = workDatabase2.p();
            S0.g h10 = p9.h(jVar3);
            if (h10 != null) {
                b.a(this.f1781n, jVar3, h10.f2785c);
                s.d().a(b.f1779a, "Removing SystemIdInfo for workSpecId (" + jVar3 + ")");
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) p9.f2788u;
                workDatabase_Impl.b();
                S0.h hVar = (S0.h) p9.f2790w;
                C5253i a10 = hVar.a();
                String str8 = jVar3.f2792a;
                if (str8 == null) {
                    a10.o(1);
                } else {
                    a10.c(1, str8);
                }
                a10.g(2, jVar3.f2793b);
                workDatabase_Impl.c();
                try {
                    a10.b();
                    workDatabase_Impl.o();
                } finally {
                    workDatabase_Impl.k();
                    hVar.n(a10);
                }
            }
            jVar.b(jVar2.f1517a, false);
        }
    }

    @Override // K0.c
    public final void b(S0.j jVar, boolean z3) {
        synchronized (this.f1783v) {
            try {
                g gVar = (g) this.f1782u.remove(jVar);
                this.f1784w.k(jVar);
                if (gVar != null) {
                    gVar.d(z3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
