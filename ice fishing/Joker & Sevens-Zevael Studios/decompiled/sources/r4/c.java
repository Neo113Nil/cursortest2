package r4;

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
import java.util.List;
import m.t;
import o4.o;
import p4.n;
import x4.j;
import x4.l;
import x4.p;
import y4.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements p4.c {

    /* renamed from: k, reason: collision with root package name */
    public static final String f6049k = o.f("CommandHandler");

    /* renamed from: g, reason: collision with root package name */
    public final Context f6050g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f6051h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final Object f6052i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final l f6053j;

    public c(Context context, l lVar) {
        this.f6050g = context;
        this.f6053j = lVar;
    }

    public static j c(Intent intent) {
        return new j(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void d(Intent intent, j jVar) {
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f8307a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", jVar.f8308b);
    }

    public final void a(Intent intent, int i10, i iVar) {
        List<p4.i> list;
        String action = intent.getAction();
        int i11 = 1;
        int i12 = 0;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            o.d().a(f6049k, "Handling constraints changed " + intent);
            Context context = this.f6050g;
            e eVar = new e(context, i10, iVar);
            a5.c cVar = eVar.f6057b;
            ArrayList h10 = iVar.f6080k.f5495c.t().h();
            String str = d.f6054a;
            int size = h10.size();
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            int i13 = 0;
            while (i13 < size) {
                Object obj = h10.get(i13);
                i13++;
                o4.d dVar = ((p) obj).f8331j;
                z10 |= dVar.f5199d;
                z11 |= dVar.f5197b;
                z12 |= dVar.f5200e;
                z13 |= dVar.f5196a != 1;
                if (z10 && z11 && z12 && z13) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f771a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z11).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z13);
            context.sendBroadcast(intent2);
            cVar.G(h10);
            ArrayList arrayList = new ArrayList(h10.size());
            long currentTimeMillis = System.currentTimeMillis();
            int size2 = h10.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = h10.get(i14);
                i14++;
                p pVar = (p) obj2;
                String str3 = pVar.f8322a;
                if (currentTimeMillis >= pVar.a() && (!pVar.b() || cVar.l(str3))) {
                    arrayList.add(pVar);
                }
            }
            int size3 = arrayList.size();
            while (i12 < size3) {
                Object obj3 = arrayList.get(i12);
                i12++;
                p pVar2 = (p) obj3;
                String str4 = pVar2.f8322a;
                j h11 = ud.g.h(pVar2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                d(intent3, h11);
                o.d().a(e.f6055c, "Creating a delay_met command for workSpec with id (" + str4 + ")");
                ((a5.b) ((a5.c) iVar.f6077h).f263i).execute(new t(eVar.f6056a, i11, iVar, intent3));
            }
            cVar.H();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            o.d().a(f6049k, "Handling reschedule " + intent + ", " + i10);
            iVar.f6080k.d();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            o.d().b(f6049k, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            Context context2 = this.f6050g;
            j c3 = c(intent);
            o d10 = o.d();
            String str5 = f6049k;
            d10.a(str5, "Handling schedule work for " + c3);
            WorkDatabase workDatabase = iVar.f6080k.f5495c;
            workDatabase.c();
            try {
                p k3 = workDatabase.t().k(c3.f8307a);
                if (k3 == null) {
                    o.d().g(str5, "Skipping scheduling " + c3 + " because it's no longer in the DB");
                    return;
                }
                if (a4.d.a(k3.f8323b)) {
                    o.d().g(str5, "Skipping scheduling " + c3 + "because it is finished.");
                    return;
                }
                long a6 = k3.a();
                if (k3.b()) {
                    o.d().a(str5, "Opportunistically setting an alarm for " + c3 + "at " + a6);
                    b.b(context2, workDatabase, c3, a6);
                    Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                    ((a5.b) ((a5.c) iVar.f6077h).f263i).execute(new t(i10, i11, iVar, intent4));
                } else {
                    o.d().a(str5, "Setting up Alarms for " + c3 + "at " + a6);
                    b.b(context2, workDatabase, c3, a6);
                }
                workDatabase.o();
                return;
            } finally {
                workDatabase.k();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.f6052i) {
                try {
                    j c7 = c(intent);
                    o d11 = o.d();
                    String str6 = f6049k;
                    d11.a(str6, "Handing delay met for " + c7);
                    if (this.f6051h.containsKey(c7)) {
                        o.d().a(str6, "WorkSpec " + c7 + " is is already being handled for ACTION_DELAY_MET");
                    } else {
                        g gVar = new g(this.f6050g, i10, iVar, this.f6053j.o(c7));
                        this.f6051h.put(c7, gVar);
                        gVar.c();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                o.d().g(f6049k, "Ignoring intent " + intent);
                return;
            }
            j c10 = c(intent);
            boolean z14 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            o.d().a(f6049k, "Handling onExecutionCompleted " + intent + ", " + i10);
            b(c10, z14);
            return;
        }
        l lVar = this.f6053j;
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i15 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList2 = new ArrayList(1);
            p4.i m10 = lVar.m(new j(string, i15));
            list = arrayList2;
            if (m10 != null) {
                arrayList2.add(m10);
                list = arrayList2;
            }
        } else {
            list = lVar.l(string);
        }
        for (p4.i iVar2 : list) {
            o.d().a(f6049k, "Handing stopWork work for " + string);
            n nVar = iVar.f6080k;
            nVar.f5496d.a(new m(nVar, iVar2, false));
            Context context3 = this.f6050g;
            WorkDatabase workDatabase2 = iVar.f6080k.f5495c;
            j jVar = iVar2.f5478a;
            String str7 = b.f6048a;
            x4.i p8 = workDatabase2.p();
            x4.g c11 = p8.c(jVar);
            if (c11 != null) {
                b.a(context3, jVar, c11.f8301c);
                o.d().a(b.f6048a, "Removing SystemIdInfo for workSpecId (" + jVar + ")");
                String str8 = jVar.f8307a;
                int i16 = jVar.f8308b;
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) p8.f8303a;
                workDatabase_Impl.b();
                x4.h hVar = (x4.h) p8.f8305c;
                i4.i a8 = hVar.a();
                if (str8 == null) {
                    a8.h(1);
                } else {
                    a8.c(str8, 1);
                }
                a8.n(2, i16);
                workDatabase_Impl.c();
                try {
                    a8.a();
                    workDatabase_Impl.o();
                } finally {
                    workDatabase_Impl.k();
                    hVar.d(a8);
                }
            }
            iVar.b(iVar2.f5478a, false);
        }
    }

    @Override // p4.c
    public final void b(j jVar, boolean z10) {
        synchronized (this.f6052i) {
            try {
                g gVar = (g) this.f6051h.remove(jVar);
                this.f6053j.m(jVar);
                if (gVar != null) {
                    gVar.f(z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
