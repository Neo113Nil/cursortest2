package s4;

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
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import o4.o;
import p4.g;
import p4.n;
import x4.h;
import x4.i;
import x4.j;
import x4.p;
import x4.q;
import y4.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements g {

    /* renamed from: k, reason: collision with root package name */
    public static final String f6446k = o.f("SystemJobScheduler");

    /* renamed from: g, reason: collision with root package name */
    public final Context f6447g;

    /* renamed from: h, reason: collision with root package name */
    public final JobScheduler f6448h;

    /* renamed from: i, reason: collision with root package name */
    public final n f6449i;

    /* renamed from: j, reason: collision with root package name */
    public final a f6450j;

    public b(Context context, n nVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        a aVar = new a(context);
        this.f6447g = context;
        this.f6449i = nVar;
        this.f6448h = jobScheduler;
        this.f6450j = aVar;
    }

    public static void b(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th) {
            o.d().c(f6446k, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th);
        }
    }

    public static ArrayList d(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            o.d().c(f6446k, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static j e(JobInfo jobInfo) {
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

    @Override // p4.g
    public final void a(p... pVarArr) {
        int intValue;
        n nVar = this.f6449i;
        WorkDatabase workDatabase = nVar.f5495c;
        final f fVar = new f(workDatabase, 0);
        for (p pVar : pVarArr) {
            workDatabase.c();
            try {
                q t3 = workDatabase.t();
                String str = pVar.f8322a;
                p k3 = t3.k(str);
                String str2 = f6446k;
                if (k3 == null) {
                    o.d().g(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.o();
                } else if (k3.f8323b != 1) {
                    o.d().g(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.o();
                } else {
                    j h10 = ud.g.h(pVar);
                    x4.g c3 = workDatabase.p().c(h10);
                    if (c3 != null) {
                        intValue = c3.f8301c;
                    } else {
                        nVar.f5494b.getClass();
                        final int i10 = nVar.f5494b.f5191g;
                        Object n7 = fVar.f8748a.n(new Callable() { // from class: y4.e
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                WorkDatabase workDatabase2 = f.this.f8748a;
                                Long d10 = workDatabase2.l().d("next_job_scheduler_id");
                                int i11 = 0;
                                int longValue = d10 != null ? (int) d10.longValue() : 0;
                                workDatabase2.l().e(new x4.d("next_job_scheduler_id", Long.valueOf(longValue == Integer.MAX_VALUE ? 0 : longValue + 1)));
                                if (longValue < 0 || longValue > i10) {
                                    workDatabase2.l().e(new x4.d("next_job_scheduler_id", Long.valueOf(1)));
                                } else {
                                    i11 = longValue;
                                }
                                return Integer.valueOf(i11);
                            }
                        });
                        pc.j.d(n7, "workDatabase.runInTransa…            id\n        })");
                        intValue = ((Number) n7).intValue();
                    }
                    if (c3 == null) {
                        nVar.f5495c.p().f(new x4.g(h10.f8307a, h10.f8308b, intValue));
                    }
                    g(pVar, intValue);
                    workDatabase.o();
                }
            } finally {
                workDatabase.k();
            }
        }
    }

    @Override // p4.g
    public final void c(String str) {
        ArrayList arrayList;
        Context context = this.f6447g;
        JobScheduler jobScheduler = this.f6448h;
        ArrayList d10 = d(context, jobScheduler);
        int i10 = 0;
        if (d10 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            int size = d10.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = d10.get(i11);
                i11++;
                JobInfo jobInfo = (JobInfo) obj;
                j e10 = e(jobInfo);
                if (e10 != null && str.equals(e10.f8307a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            b(jobScheduler, ((Integer) obj2).intValue());
        }
        i p8 = this.f6449i.f5495c.p();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) p8.f8303a;
        workDatabase_Impl.b();
        h hVar = (h) p8.f8306d;
        i4.i a6 = hVar.a();
        if (str == null) {
            a6.h(1);
        } else {
            a6.c(str, 1);
        }
        workDatabase_Impl.c();
        try {
            a6.a();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.d(a6);
        }
    }

    @Override // p4.g
    public final boolean f() {
        return true;
    }

    public final void g(p pVar, int i10) {
        int i11;
        JobScheduler jobScheduler = this.f6448h;
        a aVar = this.f6450j;
        aVar.getClass();
        o4.d dVar = pVar.f8331j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str = pVar.f8322a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", pVar.f8341t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.c());
        JobInfo.Builder builder = new JobInfo.Builder(i10, aVar.f6445a);
        boolean z10 = dVar.f5197b;
        Set<o4.c> set = dVar.f5203h;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z10);
        boolean z11 = dVar.f5198c;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z11).setExtras(persistableBundle);
        int i12 = dVar.f5196a;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 30 || i12 != 6) {
            int d10 = v.f.d(i12);
            if (d10 != 0) {
                if (d10 != 1) {
                    if (d10 != 2) {
                        i11 = 3;
                        if (d10 != 3) {
                            i11 = 4;
                            if (d10 != 4) {
                                o.d().a(a.f6444b, "API version too low. Cannot convert network type value ".concat(a4.d.v(i12)));
                            }
                        }
                    } else {
                        i11 = 2;
                    }
                }
                i11 = 1;
            } else {
                i11 = 0;
            }
            extras.setRequiredNetworkType(i11);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!z11) {
            extras.setBackoffCriteria(pVar.f8334m, pVar.f8333l == 2 ? 0 : 1);
        }
        long max = Math.max(pVar.a() - System.currentTimeMillis(), 0L);
        if (i13 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!pVar.f8338q) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (o4.c cVar : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(cVar.f5193a, cVar.f5194b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(dVar.f5201f);
            extras.setTriggerContentMaxDelay(dVar.f5202g);
        }
        extras.setPersisted(false);
        int i14 = Build.VERSION.SDK_INT;
        extras.setRequiresBatteryNotLow(dVar.f5199d);
        extras.setRequiresStorageNotLow(dVar.f5200e);
        boolean z12 = pVar.f8332k > 0;
        boolean z13 = max > 0;
        if (i14 >= 31 && pVar.f8338q && !z12 && !z13) {
            extras.setExpedited(true);
        }
        JobInfo build = extras.build();
        String str2 = f6446k;
        o.d().a(str2, "Scheduling work ID " + str + "Job ID " + i10);
        try {
            if (jobScheduler.schedule(build) == 0) {
                o.d().g(str2, "Unable to schedule work ID " + str);
                if (pVar.f8338q && pVar.f8339r == 1) {
                    pVar.f8338q = false;
                    o.d().a(str2, "Scheduling a non-expedited job (work ID " + str + ")");
                    g(pVar, i10);
                }
            }
        } catch (IllegalStateException e10) {
            ArrayList d11 = d(this.f6447g, jobScheduler);
            int size = d11 != null ? d11.size() : 0;
            Locale locale = Locale.getDefault();
            Integer valueOf = Integer.valueOf(size);
            n nVar = this.f6449i;
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", valueOf, Integer.valueOf(nVar.f5495c.t().h().size()), Integer.valueOf(nVar.f5494b.f5192h));
            o.d().b(str2, format);
            IllegalStateException illegalStateException = new IllegalStateException(format, e10);
            nVar.f5494b.getClass();
            throw illegalStateException;
        } catch (Throwable th) {
            o.d().c(str2, "Unable to schedule " + pVar, th);
        }
    }
}
