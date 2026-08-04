package com.gamericefishpro.space.p6;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.l6.q;
import com.gamericefishpro.space.l6.r;
import com.gamericefishpro.space.l6.x;
import com.gamericefishpro.space.l6.y;
import com.gamericefishpro.space.m6.h;
import com.gamericefishpro.space.m6.o;
import com.gamericefishpro.space.u6.g;
import com.gamericefishpro.space.u6.i;
import com.gamericefishpro.space.u6.j;
import com.gamericefishpro.space.u6.p;
import com.gamericefishpro.space.v6.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements h {
    public static final String w = q.d("SystemJobScheduler");
    public final Context d;
    public final JobScheduler e;
    public final o i;
    public final b v;

    public c(Context context, o oVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        b bVar = new b(context);
        this.d = context;
        this.i = oVar;
        this.e = jobScheduler;
        this.v = bVar;
    }

    public static void c(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            q.c().b(w, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList d(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            q.c().b(w, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static j f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // com.gamericefishpro.space.m6.h
    public final void a(p... pVarArr) {
        int iIntValue;
        o oVar = this.i;
        WorkDatabase workDatabase = oVar.c;
        final f fVar = new f(workDatabase, 0);
        for (p pVar : pVarArr) {
            workDatabase.c();
            try {
                com.gamericefishpro.space.u6.q qVarB = workDatabase.B();
                String str = pVar.a;
                p pVarM = qVarB.m(str);
                String str2 = w;
                if (pVarM == null) {
                    q.c().e(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.u();
                } else if (pVarM.b != y.d) {
                    q.c().e(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.u();
                } else {
                    j generationalId = a4.y(pVar);
                    g gVarC = workDatabase.y().c(generationalId);
                    if (gVarC != null) {
                        iIntValue = gVarC.c;
                    } else {
                        oVar.b.getClass();
                        final int i = oVar.b.g;
                        Object objT = fVar.a.t(new Callable() { // from class: com.gamericefishpro.space.v6.e
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                f this$0 = fVar;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                WorkDatabase workDatabase2 = this$0.a;
                                Long lF = workDatabase2.x().f("next_job_scheduler_id");
                                int i2 = 0;
                                int iLongValue = lF != null ? (int) lF.longValue() : 0;
                                workDatabase2.x().g(new com.gamericefishpro.space.u6.d("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                                if (iLongValue < 0 || iLongValue > i) {
                                    workDatabase2.x().g(new com.gamericefishpro.space.u6.d("next_job_scheduler_id", Long.valueOf(1)));
                                } else {
                                    i2 = iLongValue;
                                }
                                return Integer.valueOf(i2);
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(objT, "workDatabase.runInTransa…            id\n        })");
                        iIntValue = ((Number) objT).intValue();
                    }
                    if (gVarC == null) {
                        Intrinsics.checkNotNullParameter(generationalId, "generationalId");
                        oVar.c.y().e(new g(generationalId.a, generationalId.b, iIntValue));
                    }
                    g(pVar, iIntValue);
                    workDatabase.u();
                }
                workDatabase.q();
            } catch (Throwable th) {
                workDatabase.q();
                throw th;
            }
        }
    }

    @Override // com.gamericefishpro.space.m6.h
    public final void b(String str) {
        ArrayList arrayList;
        Context context = this.d;
        JobScheduler jobScheduler = this.e;
        ArrayList arrayListD = d(context, jobScheduler);
        int i = 0;
        if (arrayListD == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            int size = arrayListD.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListD.get(i2);
                i2++;
                JobInfo jobInfo = (JobInfo) obj;
                j jVarF = f(jobInfo);
                if (jVarF != null && str.equals(jVarF.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            c(jobScheduler, ((Integer) obj2).intValue());
        }
        i iVarY = this.i.c.y();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) iVarY.a;
        workDatabase_Impl.b();
        com.gamericefishpro.space.u6.h hVar = (com.gamericefishpro.space.u6.h) iVarY.d;
        com.gamericefishpro.space.e6.j jVarA = hVar.a();
        if (str == null) {
            jVarA.p(1);
        } else {
            jVarA.i(1, str);
        }
        workDatabase_Impl.c();
        try {
            jVarA.b();
            workDatabase_Impl.u();
        } finally {
            workDatabase_Impl.q();
            hVar.d(jVarA);
        }
    }

    @Override // com.gamericefishpro.space.m6.h
    public final boolean e() {
        return true;
    }

    public final void g(p pVar, int i) {
        int i2;
        JobScheduler jobScheduler = this.e;
        String str = w;
        b bVar = this.v;
        bVar.getClass();
        com.gamericefishpro.space.l6.e eVar = pVar.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str2 = pVar.a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str2);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", pVar.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.c());
        JobInfo.Builder builder = new JobInfo.Builder(i, bVar.a);
        boolean z = eVar.b;
        Set<com.gamericefishpro.space.l6.d> set = eVar.h;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z);
        boolean z2 = eVar.c;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z2).setExtras(persistableBundle);
        r rVar = eVar.a;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30 || rVar != r.y) {
            int iOrdinal = rVar.ordinal();
            if (iOrdinal == 0) {
                i2 = 0;
            } else if (iOrdinal != 1) {
                i2 = 2;
                if (iOrdinal != 2) {
                    i2 = 3;
                    if (iOrdinal != 3) {
                        i2 = 4;
                        if (iOrdinal != 4) {
                            q qVarC = q.c();
                            rVar.toString();
                            qVarC.getClass();
                            i2 = 1;
                        }
                    }
                }
            } else {
                i2 = 1;
            }
            extras.setRequiredNetworkType(i2);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!z2) {
            extras.setBackoffCriteria(pVar.m, pVar.l == com.gamericefishpro.space.l6.a.e ? 0 : 1);
        }
        long jMax = Math.max(pVar.a() - System.currentTimeMillis(), 0L);
        if (i3 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!pVar.q) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (com.gamericefishpro.space.l6.d dVar : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(dVar.a, dVar.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(eVar.f);
            extras.setTriggerContentMaxDelay(eVar.g);
        }
        extras.setPersisted(false);
        int i4 = Build.VERSION.SDK_INT;
        extras.setRequiresBatteryNotLow(eVar.d);
        extras.setRequiresStorageNotLow(eVar.e);
        boolean z3 = pVar.k > 0;
        boolean z4 = jMax > 0;
        if (i4 >= 31 && pVar.q && !z3 && !z4) {
            extras.setExpedited(true);
        }
        JobInfo jobInfoBuild = extras.build();
        q.c().getClass();
        try {
            if (jobScheduler.schedule(jobInfoBuild) == 0) {
                q.c().e(str, "Unable to schedule work ID " + str2);
                if (pVar.q && pVar.r == x.d) {
                    pVar.q = false;
                    q.c().getClass();
                    g(pVar, i);
                }
            }
        } catch (IllegalStateException e) {
            ArrayList arrayListD = d(this.d, jobScheduler);
            int size = arrayListD != null ? arrayListD.size() : 0;
            Locale locale = Locale.getDefault();
            Integer numValueOf = Integer.valueOf(size);
            o oVar = this.i;
            String str3 = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", numValueOf, Integer.valueOf(oVar.c.B().j().size()), Integer.valueOf(oVar.b.h));
            q.c().a(str, str3);
            IllegalStateException illegalStateException = new IllegalStateException(str3, e);
            oVar.b.getClass();
            throw illegalStateException;
        } catch (Throwable th) {
            q.c().b(str, "Unable to schedule " + pVar, th);
        }
    }
}
