package M0;

import D.y;
import J0.s;
import N2.A;
import S0.l;
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
import t0.AbstractC5051n;
import z0.C5266i;

/* loaded from: classes.dex */
public final class c implements K0.c {

    /* renamed from: x, reason: collision with root package name */
    public static final String f1834x = s.f("CommandHandler");

    /* renamed from: n, reason: collision with root package name */
    public final Context f1835n;

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f1836u = new HashMap();

    /* renamed from: v, reason: collision with root package name */
    public final Object f1837v = new Object();

    /* renamed from: w, reason: collision with root package name */
    public final l f1838w;

    public c(Context context, l lVar) {
        this.f1835n = context;
        this.f1838w = lVar;
    }

    public static S0.j c(Intent intent) {
        return new S0.j(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void d(Intent intent, S0.j jVar) {
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f2905a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", jVar.f2906b);
    }

    public final void a(Intent intent, int i, j jVar) {
        List<K0.j> list;
        String action = intent.getAction();
        int i4 = 0;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            s.d().a(f1834x, "Handling constraints changed " + intent);
            e eVar = new e(this.f1835n, i, jVar);
            ArrayList d2 = jVar.f1872x.f1532c.t().d();
            String str = d.f1839a;
            Iterator it = d2.iterator();
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            while (it.hasNext()) {
                J0.d dVar = ((p) it.next()).f2928j;
                z8 |= dVar.f1302d;
                z9 |= dVar.f1300b;
                z10 |= dVar.f1303e;
                z11 |= dVar.f1299a != 1;
                if (z8 && z9 && z10 && z11) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f5494a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = eVar.f1841a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z8).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z9).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z11);
            context.sendBroadcast(intent2);
            Y2.e eVar2 = eVar.f1843c;
            eVar2.H(d2);
            ArrayList arrayList = new ArrayList(d2.size());
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it2 = d2.iterator();
            while (it2.hasNext()) {
                p pVar = (p) it2.next();
                String str3 = pVar.f2920a;
                if (currentTimeMillis >= pVar.a() && (!pVar.b() || eVar2.m(str3))) {
                    arrayList.add(pVar);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                p pVar2 = (p) it3.next();
                String str4 = pVar2.f2920a;
                S0.j e6 = U2.a.e(pVar2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                d(intent3, e6);
                s.d().a(e.f1840d, y.k("Creating a delay_met command for workSpec with id (", str4, ")"));
                ((A) jVar.f1869u.f3965w).execute(new i(eVar.f1842b, i4, jVar, intent3));
            }
            eVar2.I();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            s.d().a(f1834x, "Handling reschedule " + intent + ", " + i);
            jVar.f1872x.e();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            s.d().b(f1834x, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            S0.j c4 = c(intent);
            String str5 = f1834x;
            s.d().a(str5, "Handling schedule work for " + c4);
            WorkDatabase workDatabase = jVar.f1872x.f1532c;
            workDatabase.c();
            try {
                p h9 = workDatabase.t().h(c4.f2905a);
                if (h9 == null) {
                    s.d().g(str5, "Skipping scheduling " + c4 + " because it's no longer in the DB");
                    return;
                }
                if (y.b(h9.f2921b)) {
                    s.d().g(str5, "Skipping scheduling " + c4 + "because it is finished.");
                    return;
                }
                long a9 = h9.a();
                boolean b9 = h9.b();
                Context context2 = this.f1835n;
                if (b9) {
                    s.d().a(str5, "Opportunistically setting an alarm for " + c4 + "at " + a9);
                    b.b(context2, workDatabase, c4, a9);
                    Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                    ((A) jVar.f1869u.f3965w).execute(new i(i, i4, jVar, intent4));
                } else {
                    s.d().a(str5, "Setting up Alarms for " + c4 + "at " + a9);
                    b.b(context2, workDatabase, c4, a9);
                }
                workDatabase.o();
                return;
            } finally {
                workDatabase.k();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.f1837v) {
                try {
                    S0.j c9 = c(intent);
                    s d3 = s.d();
                    String str6 = f1834x;
                    d3.a(str6, "Handing delay met for " + c9);
                    if (this.f1836u.containsKey(c9)) {
                        s.d().a(str6, "WorkSpec " + c9 + " is is already being handled for ACTION_DELAY_MET");
                    } else {
                        g gVar = new g(this.f1835n, i, jVar, this.f1838w.v(c9));
                        this.f1836u.put(c9, gVar);
                        gVar.c();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                s.d().g(f1834x, "Ignoring intent " + intent);
                return;
            }
            S0.j c10 = c(intent);
            boolean z12 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            s.d().a(f1834x, "Handling onExecutionCompleted " + intent + ", " + i);
            b(c10, z12);
            return;
        }
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        boolean containsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
        l lVar = this.f1838w;
        if (containsKey) {
            int i9 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList2 = new ArrayList(1);
            K0.j t9 = lVar.t(new S0.j(string, i9));
            list = arrayList2;
            if (t9 != null) {
                arrayList2.add(t9);
                list = arrayList2;
            }
        } else {
            list = lVar.u(string);
        }
        for (K0.j jVar2 : list) {
            s.d().a(f1834x, AbstractC5051n.f("Handing stopWork work for ", string));
            K0.p pVar3 = jVar.f1872x;
            pVar3.f1533d.i(new m(pVar3, jVar2, false));
            WorkDatabase workDatabase2 = jVar.f1872x.f1532c;
            S0.j jVar3 = jVar2.f1514a;
            String str7 = b.f1833a;
            S0.i p6 = workDatabase2.p();
            S0.g m8 = p6.m(jVar3);
            if (m8 != null) {
                b.a(this.f1835n, jVar3, m8.f2898c);
                s.d().a(b.f1833a, "Removing SystemIdInfo for workSpecId (" + jVar3 + ")");
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) p6.f2901u;
                workDatabase_Impl.b();
                S0.h hVar = (S0.h) p6.f2903w;
                C5266i a10 = hVar.a();
                String str8 = jVar3.f2905a;
                if (str8 == null) {
                    a10.o(1);
                } else {
                    a10.c(1, str8);
                }
                a10.h(2, jVar3.f2906b);
                workDatabase_Impl.c();
                try {
                    a10.b();
                    workDatabase_Impl.o();
                } finally {
                    workDatabase_Impl.k();
                    hVar.n(a10);
                }
            }
            jVar.b(jVar2.f1514a, false);
        }
    }

    @Override // K0.c
    public final void b(S0.j jVar, boolean z8) {
        synchronized (this.f1837v) {
            try {
                g gVar = (g) this.f1836u.remove(jVar);
                this.f1838w.t(jVar);
                if (gVar != null) {
                    gVar.d(z8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
