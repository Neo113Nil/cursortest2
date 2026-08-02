package M0;

import D.x;
import J0.r;
import Q2.A;
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
import com.google.android.gms.internal.ads.C3067cm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import w.AbstractC5128c;
import z0.C5220i;

/* loaded from: classes.dex */
public final class c implements K0.c {

    /* renamed from: x, reason: collision with root package name */
    public static final String f1813x = r.f("CommandHandler");

    /* renamed from: n, reason: collision with root package name */
    public final Context f1814n;

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f1815u = new HashMap();

    /* renamed from: v, reason: collision with root package name */
    public final Object f1816v = new Object();

    /* renamed from: w, reason: collision with root package name */
    public final C3067cm f1817w;

    public c(Context context, C3067cm c3067cm) {
        this.f1814n = context;
        this.f1817w = c3067cm;
    }

    public static S0.j c(Intent intent) {
        return new S0.j(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void d(Intent intent, S0.j jVar) {
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f2921a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", jVar.f2922b);
    }

    public final void a(Intent intent, int i, j jVar) {
        List<K0.j> list;
        String action = intent.getAction();
        int i4 = 0;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            r.d().a(f1813x, "Handling constraints changed " + intent);
            e eVar = new e(this.f1814n, i, jVar);
            ArrayList d9 = jVar.f1851x.f1643c.t().d();
            String str = d.f1818a;
            Iterator it = d9.iterator();
            boolean z6 = false;
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            while (it.hasNext()) {
                J0.d dVar = ((p) it.next()).f2945j;
                z6 |= dVar.f1406d;
                z9 |= dVar.f1404b;
                z10 |= dVar.f1407e;
                z11 |= dVar.f1403a != 1;
                if (z6 && z9 && z10 && z11) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f5347a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = eVar.f1820a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z6).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z9).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z11);
            context.sendBroadcast(intent2);
            b3.e eVar2 = eVar.f1822c;
            eVar2.E(d9);
            ArrayList arrayList = new ArrayList(d9.size());
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it2 = d9.iterator();
            while (it2.hasNext()) {
                p pVar = (p) it2.next();
                String str3 = pVar.f2937a;
                if (currentTimeMillis >= pVar.a() && (!pVar.b() || eVar2.l(str3))) {
                    arrayList.add(pVar);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                p pVar2 = (p) it3.next();
                String str4 = pVar2.f2937a;
                S0.j k9 = Z2.d.k(pVar2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                d(intent3, k9);
                r.d().a(e.f1819d, x.l("Creating a delay_met command for workSpec with id (", str4, ")"));
                ((A) jVar.f1848u.f5559w).execute(new i(eVar.f1821b, i4, jVar, intent3));
            }
            eVar2.F();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            r.d().a(f1813x, "Handling reschedule " + intent + ", " + i);
            jVar.f1851x.e();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            r.d().b(f1813x, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            S0.j c9 = c(intent);
            String str5 = f1813x;
            r.d().a(str5, "Handling schedule work for " + c9);
            WorkDatabase workDatabase = jVar.f1851x.f1643c;
            workDatabase.c();
            try {
                p h3 = workDatabase.t().h(c9.f2921a);
                if (h3 == null) {
                    r.d().g(str5, "Skipping scheduling " + c9 + " because it's no longer in the DB");
                    return;
                }
                if (x.b(h3.f2938b)) {
                    r.d().g(str5, "Skipping scheduling " + c9 + "because it is finished.");
                    return;
                }
                long a9 = h3.a();
                boolean b9 = h3.b();
                Context context2 = this.f1814n;
                if (b9) {
                    r.d().a(str5, "Opportunistically setting an alarm for " + c9 + "at " + a9);
                    b.b(context2, workDatabase, c9, a9);
                    Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                    ((A) jVar.f1848u.f5559w).execute(new i(i, i4, jVar, intent4));
                } else {
                    r.d().a(str5, "Setting up Alarms for " + c9 + "at " + a9);
                    b.b(context2, workDatabase, c9, a9);
                }
                workDatabase.o();
                return;
            } finally {
                workDatabase.k();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.f1816v) {
                try {
                    S0.j c10 = c(intent);
                    r d10 = r.d();
                    String str6 = f1813x;
                    d10.a(str6, "Handing delay met for " + c10);
                    if (this.f1815u.containsKey(c10)) {
                        r.d().a(str6, "WorkSpec " + c10 + " is is already being handled for ACTION_DELAY_MET");
                    } else {
                        g gVar = new g(this.f1814n, i, jVar, this.f1817w.H(c10));
                        this.f1815u.put(c10, gVar);
                        gVar.c();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                r.d().g(f1813x, "Ignoring intent " + intent);
                return;
            }
            S0.j c11 = c(intent);
            boolean z12 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            r.d().a(f1813x, "Handling onExecutionCompleted " + intent + ", " + i);
            b(c11, z12);
            return;
        }
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        boolean containsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
        C3067cm c3067cm = this.f1817w;
        if (containsKey) {
            int i6 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList2 = new ArrayList(1);
            K0.j F8 = c3067cm.F(new S0.j(string, i6));
            list = arrayList2;
            if (F8 != null) {
                arrayList2.add(F8);
                list = arrayList2;
            }
        } else {
            list = c3067cm.G(string);
        }
        for (K0.j jVar2 : list) {
            r.d().a(f1813x, AbstractC5128c.f("Handing stopWork work for ", string));
            K0.p pVar3 = jVar.f1851x;
            pVar3.f1644d.h(new m(pVar3, jVar2, false));
            WorkDatabase workDatabase2 = jVar.f1851x.f1643c;
            S0.j jVar3 = jVar2.f1626a;
            String str7 = b.f1812a;
            S0.i p9 = workDatabase2.p();
            S0.g c12 = p9.c(jVar3);
            if (c12 != null) {
                b.a(this.f1814n, jVar3, c12.f2914c);
                r.d().a(b.f1812a, "Removing SystemIdInfo for workSpecId (" + jVar3 + ")");
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) p9.f2917u;
                workDatabase_Impl.b();
                S0.h hVar = (S0.h) p9.f2919w;
                C5220i a10 = hVar.a();
                String str8 = jVar3.f2921a;
                if (str8 == null) {
                    a10.o(1);
                } else {
                    a10.c(1, str8);
                }
                a10.g(2, jVar3.f2922b);
                workDatabase_Impl.c();
                try {
                    a10.b();
                    workDatabase_Impl.o();
                } finally {
                    workDatabase_Impl.k();
                    hVar.n(a10);
                }
            }
            jVar.b(jVar2.f1626a, false);
        }
    }

    @Override // K0.c
    public final void b(S0.j jVar, boolean z6) {
        synchronized (this.f1816v) {
            try {
                g gVar = (g) this.f1815u.remove(jVar);
                this.f1817w.F(jVar);
                if (gVar != null) {
                    gVar.d(z6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
