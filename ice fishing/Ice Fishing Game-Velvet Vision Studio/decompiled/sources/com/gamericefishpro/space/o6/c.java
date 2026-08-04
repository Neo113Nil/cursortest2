package com.gamericefishpro.space.o6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.l6.q;
import com.gamericefishpro.space.l6.r;
import com.gamericefishpro.space.m6.o;
import com.gamericefishpro.space.n.a0;
import com.gamericefishpro.space.u6.j;
import com.gamericefishpro.space.u6.p;
import com.gamericefishpro.space.v6.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements com.gamericefishpro.space.m6.c {
    public static final String w = q.d("CommandHandler");
    public final Context d;
    public final HashMap e = new HashMap();
    public final Object i = new Object();
    public final com.gamericefishpro.space.u6.e v;

    public c(Context context, com.gamericefishpro.space.u6.e eVar) {
        this.d = context;
        this.v = eVar;
    }

    public static j b(Intent intent) {
        return new j(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void c(Intent intent, j jVar) {
        intent.putExtra("KEY_WORKSPEC_ID", jVar.a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", jVar.b);
    }

    public final void a(Intent intent, int i, i iVar) {
        List<com.gamericefishpro.space.m6.j> listJ;
        ArrayList arrayList;
        String action = intent.getAction();
        int i2 = 1;
        int i3 = 0;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            q qVarC = q.c();
            Objects.toString(intent);
            qVarC.getClass();
            Context context = this.d;
            e eVar = new e(context, i, iVar);
            com.gamericefishpro.space.a8.c cVar = eVar.b;
            ArrayList arrayListJ = iVar.w.c.B().j();
            int i4 = d.a;
            int size = arrayListJ.size();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayListJ.get(i5);
                i5++;
                com.gamericefishpro.space.l6.e eVar2 = ((p) obj).j;
                z |= eVar2.d;
                z2 |= eVar2.b;
                z3 |= eVar2.e;
                z4 |= eVar2.a != r.d;
                if (z && z2 && z3 && z4) {
                    break;
                }
            }
            int i6 = ConstraintProxyUpdateReceiver.a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
            context.sendBroadcast(intent2);
            cVar.w(arrayListJ);
            ArrayList arrayList2 = new ArrayList(arrayListJ.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            int size2 = arrayListJ.size();
            int i7 = 0;
            while (i7 < size2) {
                Object obj2 = arrayListJ.get(i7);
                i7++;
                p pVar = (p) obj2;
                String str = pVar.a;
                if (jCurrentTimeMillis >= pVar.a() && (!pVar.b() || cVar.d(str))) {
                    arrayList2.add(pVar);
                }
            }
            int size3 = arrayList2.size();
            while (i3 < size3) {
                Object obj3 = arrayList2.get(i3);
                i3++;
                p pVar2 = (p) obj3;
                String str2 = pVar2.a;
                j jVarY = a4.y(pVar2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                c(intent3, jVarY);
                q.c().getClass();
                ((com.gamericefishpro.space.c8.p) ((com.gamericefishpro.space.r5.b) iVar.e).v).execute(new a0(eVar.a, i2, iVar, intent3));
            }
            cVar.x();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            q qVarC2 = q.c();
            Objects.toString(intent);
            qVarC2.getClass();
            iVar.w.d();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            q.c().a(w, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            Context context2 = this.d;
            j jVarB = b(intent);
            q qVarC3 = q.c();
            String str3 = w;
            jVarB.toString();
            qVarC3.getClass();
            WorkDatabase workDatabase = iVar.w.c;
            workDatabase.c();
            try {
                p pVarM = workDatabase.B().m(jVarB.a);
                if (pVarM == null) {
                    q.c().e(str3, "Skipping scheduling " + jVarB + " because it's no longer in the DB");
                    return;
                }
                if (pVarM.b.a()) {
                    q.c().e(str3, "Skipping scheduling " + jVarB + "because it is finished.");
                    return;
                }
                long jA = pVarM.a();
                if (pVarM.b()) {
                    q qVarC4 = q.c();
                    jVarB.toString();
                    qVarC4.getClass();
                    b.b(context2, workDatabase, jVarB, jA);
                    Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                    ((com.gamericefishpro.space.c8.p) ((com.gamericefishpro.space.r5.b) iVar.e).v).execute(new a0(i, i2, iVar, intent4));
                } else {
                    q qVarC5 = q.c();
                    jVarB.toString();
                    qVarC5.getClass();
                    b.b(context2, workDatabase, jVarB, jA);
                }
                workDatabase.u();
                return;
            } finally {
                workDatabase.q();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.i) {
                try {
                    j jVarB2 = b(intent);
                    q qVarC6 = q.c();
                    jVarB2.toString();
                    qVarC6.getClass();
                    if (this.e.containsKey(jVarB2)) {
                        q qVarC7 = q.c();
                        jVarB2.toString();
                        qVarC7.getClass();
                    } else {
                        g gVar = new g(this.d, i, iVar, this.v.l(jVarB2));
                        this.e.put(jVarB2, gVar);
                        gVar.e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                q.c().e(w, "Ignoring intent " + intent);
                return;
            }
            j jVarB3 = b(intent);
            boolean z5 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            q qVarC8 = q.c();
            intent.toString();
            qVarC8.getClass();
            f(jVarB3, z5);
            return;
        }
        com.gamericefishpro.space.u6.e eVar3 = this.v;
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i8 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            arrayList = new ArrayList(1);
            com.gamericefishpro.space.m6.j jVarI = eVar3.i(new j(string, i8));
            if (jVarI != null) {
                listJ = arrayList;
                arrayList.add(jVarI);
                listJ = arrayList;
            }
        } else {
            listJ = eVar3.j(string);
        }
        listJ = arrayList;
        for (com.gamericefishpro.space.m6.j jVar : listJ) {
            q.c().getClass();
            o oVar = iVar.w;
            oVar.d.a(new l(oVar, jVar, false));
            Context context3 = this.d;
            WorkDatabase workDatabase2 = iVar.w.c;
            j id = jVar.a;
            int i9 = b.a;
            com.gamericefishpro.space.u6.i iVarY = workDatabase2.y();
            com.gamericefishpro.space.u6.g gVarC = iVarY.c(id);
            if (gVarC != null) {
                b.a(context3, id, gVarC.c);
                q qVarC9 = q.c();
                id.toString();
                qVarC9.getClass();
                Intrinsics.checkNotNullParameter(id, "id");
                String str4 = id.a;
                int i10 = id.b;
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) iVarY.a;
                workDatabase_Impl.b();
                com.gamericefishpro.space.u6.h hVar = (com.gamericefishpro.space.u6.h) iVarY.c;
                com.gamericefishpro.space.e6.j jVarA = hVar.a();
                if (str4 == null) {
                    jVarA.p(1);
                } else {
                    jVarA.i(1, str4);
                }
                jVarA.a(2, i10);
                workDatabase_Impl.c();
                try {
                    jVarA.b();
                    workDatabase_Impl.u();
                    workDatabase_Impl.q();
                    hVar.d(jVarA);
                } catch (Throwable th2) {
                    workDatabase_Impl.q();
                    hVar.d(jVarA);
                    throw th2;
                }
            }
            iVar.f(jVar.a, false);
        }
    }

    @Override // com.gamericefishpro.space.m6.c
    public final void f(j jVar, boolean z) {
        synchronized (this.i) {
            try {
                g gVar = (g) this.e.remove(jVar);
                this.v.i(jVar);
                if (gVar != null) {
                    gVar.f(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
