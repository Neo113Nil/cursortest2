package com.gamericefishpro.space.m6;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.l6.q;
import com.gamericefishpro.space.l6.z;
import com.gamericefishpro.space.s5.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends z {
    public static o k;
    public static o l;
    public static final Object m;
    public final Context a;
    public final com.gamericefishpro.space.l6.c b;
    public final WorkDatabase c;
    public final com.gamericefishpro.space.r5.b d;
    public final List e;
    public final f f;
    public final com.gamericefishpro.space.v6.f g;
    public boolean h;
    public BroadcastReceiver.PendingResult i;
    public final com.gamericefishpro.space.u6.i j;

    static {
        q.d("WorkManagerImpl");
        k = null;
        l = null;
        m = new Object();
    }

    public o(Context context, com.gamericefishpro.space.l6.c cVar, com.gamericefishpro.space.r5.b bVar) {
        com.gamericefishpro.space.s5.q qVarO;
        boolean z = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context context2 = context.getApplicationContext();
        y executor = (y) bVar.e;
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(executor, "queryExecutor");
        int i = 10;
        if (z) {
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(WorkDatabase.class, "klass");
            qVarO = new com.gamericefishpro.space.s5.q(context2, WorkDatabase.class, null);
            qVarO.i = true;
        } else {
            qVarO = com.gamericefishpro.space.b9.a.o(context2, WorkDatabase.class, "androidx.work.workdb");
            qVarO.h = new com.gamericefishpro.space.a8.b(i, context2);
        }
        Intrinsics.checkNotNullParameter(executor, "executor");
        qVarO.f = executor;
        b callback = b.a;
        Intrinsics.checkNotNullParameter(callback, "callback");
        qVarO.d.add(callback);
        qVarO.a(d.g);
        qVarO.a(new g(context2, 2, 3));
        qVarO.a(d.h);
        qVarO.a(d.i);
        qVarO.a(new g(context2, 5, 6));
        qVarO.a(d.j);
        qVarO.a(d.k);
        qVarO.a(d.l);
        qVarO.a(new g(context2));
        qVarO.a(new g(context2, 10, 11));
        qVarO.a(d.d);
        qVarO.a(d.e);
        qVarO.a(d.f);
        qVarO.p = false;
        qVarO.q = true;
        WorkDatabase workDatabase = (WorkDatabase) qVarO.b();
        Context applicationContext = context.getApplicationContext();
        q qVar = new q(cVar.f);
        synchronized (q.b) {
            q.c = qVar;
        }
        com.gamericefishpro.space.u6.i iVar = new com.gamericefishpro.space.u6.i(applicationContext, bVar);
        this.j = iVar;
        int i2 = i.a;
        com.gamericefishpro.space.p6.c cVar2 = new com.gamericefishpro.space.p6.c(applicationContext, this);
        com.gamericefishpro.space.v6.j.a(applicationContext, SystemJobService.class, true);
        q.c().getClass();
        List listAsList = Arrays.asList(cVar2, new com.gamericefishpro.space.n6.b(applicationContext, cVar, iVar, this));
        f fVar = new f(context, cVar, bVar, workDatabase, listAsList);
        Context applicationContext2 = context.getApplicationContext();
        this.a = applicationContext2;
        this.b = cVar;
        this.d = bVar;
        this.c = workDatabase;
        this.e = listAsList;
        this.f = fVar;
        this.g = new com.gamericefishpro.space.v6.f(workDatabase, 1);
        this.h = false;
        if (n.a(applicationContext2)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.d.a(new com.gamericefishpro.space.v6.d(applicationContext2, this));
    }

    public static o a(Context context) {
        o oVar;
        Object obj = m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    try {
                        oVar = k;
                        if (oVar == null) {
                            oVar = l;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return oVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (oVar != null) {
            return oVar;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    public static void b(Context context, com.gamericefishpro.space.l6.c cVar) {
        synchronized (m) {
            try {
                o oVar = k;
                if (oVar != null && l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (oVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (l == null) {
                        l = new o(applicationContext, cVar, new com.gamericefishpro.space.r5.b(cVar.b));
                    }
                    k = l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        ArrayList arrayListD;
        String str = com.gamericefishpro.space.p6.c.w;
        Context context = this.a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListD = com.gamericefishpro.space.p6.c.d(context, jobScheduler)) != null && !arrayListD.isEmpty()) {
            int size = arrayListD.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListD.get(i);
                i++;
                com.gamericefishpro.space.p6.c.c(jobScheduler, ((JobInfo) obj).getId());
            }
        }
        WorkDatabase workDatabase = this.c;
        com.gamericefishpro.space.u6.q qVarB = workDatabase.B();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) qVarB.a;
        workDatabase_Impl.b();
        com.gamericefishpro.space.u6.h hVar = (com.gamericefishpro.space.u6.h) qVarB.k;
        com.gamericefishpro.space.e6.j jVarA = hVar.a();
        workDatabase_Impl.c();
        try {
            jVarA.b();
            workDatabase_Impl.u();
            workDatabase_Impl.q();
            hVar.d(jVarA);
            i.a(this.b, workDatabase, this.e);
        } catch (Throwable th) {
            workDatabase_Impl.q();
            hVar.d(jVarA);
            throw th;
        }
    }

    public final void e(j jVar, com.gamericefishpro.space.a8.c cVar) {
        e eVar = new e(12);
        eVar.e = this;
        eVar.i = jVar;
        eVar.v = cVar;
        this.d.a(eVar);
    }
}
