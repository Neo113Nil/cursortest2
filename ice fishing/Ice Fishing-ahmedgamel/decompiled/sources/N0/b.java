package N0;

import D.x;
import J0.r;
import K0.h;
import K0.p;
import S0.g;
import S0.i;
import S0.j;
import T0.f;
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
import i1.C4586c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import u.AbstractC5050e;
import z0.C5220i;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: x, reason: collision with root package name */
    public static final String f1903x = r.f("SystemJobScheduler");

    /* renamed from: n, reason: collision with root package name */
    public final Context f1904n;

    /* renamed from: u, reason: collision with root package name */
    public final JobScheduler f1905u;

    /* renamed from: v, reason: collision with root package name */
    public final p f1906v;

    /* renamed from: w, reason: collision with root package name */
    public final a f1907w;

    public b(Context context, p pVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        a aVar = new a(context);
        this.f1904n = context;
        this.f1906v = pVar;
        this.f1905u = jobScheduler;
        this.f1907w = aVar;
    }

    public static void b(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            r.d().c(f1903x, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            r.d().c(f1903x, "getAllPendingJobs() is not reliable on this device.", th);
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

    @Override // K0.h
    public final void a(S0.p... pVarArr) {
        int intValue;
        p pVar = this.f1906v;
        WorkDatabase workDatabase = pVar.f1643c;
        C4586c c4586c = new C4586c(workDatabase);
        for (S0.p pVar2 : pVarArr) {
            workDatabase.c();
            try {
                S0.p h3 = workDatabase.t().h(pVar2.f2937a);
                String str = f1903x;
                String str2 = pVar2.f2937a;
                if (h3 == null) {
                    r.d().g(str, "Skipping scheduling " + str2 + " because it's no longer in the DB");
                    workDatabase.o();
                } else if (h3.f2938b != 1) {
                    r.d().g(str, "Skipping scheduling " + str2 + " because it is no longer enqueued");
                    workDatabase.o();
                } else {
                    j k9 = Z2.d.k(pVar2);
                    g c9 = workDatabase.p().c(k9);
                    if (c9 != null) {
                        intValue = c9.f2914c;
                    } else {
                        pVar.f1642b.getClass();
                        Object n9 = ((WorkDatabase) c4586c.f38154u).n(new f(c4586c, pVar.f1642b.f1394b, 0));
                        kotlin.jvm.internal.h.d(n9, "workDatabase.runInTransa…            id\n        })");
                        intValue = ((Number) n9).intValue();
                    }
                    if (c9 == null) {
                        pVar.f1643c.p().d(new g(k9.f2921a, k9.f2922b, intValue));
                    }
                    g(pVar2, intValue);
                    workDatabase.o();
                }
            } finally {
                workDatabase.k();
            }
        }
    }

    @Override // K0.h
    public final boolean c() {
        return true;
    }

    @Override // K0.h
    public final void d(String str) {
        ArrayList arrayList;
        Context context = this.f1904n;
        JobScheduler jobScheduler = this.f1905u;
        ArrayList e9 = e(context, jobScheduler);
        if (e9 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            Iterator it = e9.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                j f2 = f(jobInfo);
                if (f2 != null && str.equals(f2.f2921a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            b(jobScheduler, ((Integer) it2.next()).intValue());
        }
        i p9 = this.f1906v.f1643c.p();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) p9.f2917u;
        workDatabase_Impl.b();
        S0.h hVar = (S0.h) p9.f2920x;
        C5220i a9 = hVar.a();
        if (str == null) {
            a9.o(1);
        } else {
            a9.c(1, str);
        }
        workDatabase_Impl.c();
        try {
            a9.b();
            workDatabase_Impl.o();
        } finally {
            workDatabase_Impl.k();
            hVar.n(a9);
        }
    }

    public final void g(S0.p pVar, int i) {
        int i4;
        int i6;
        JobScheduler jobScheduler = this.f1905u;
        a aVar = this.f1907w;
        aVar.getClass();
        J0.d dVar = pVar.f2945j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str = pVar.f2937a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", pVar.f2955t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.c());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i, aVar.f1902a).setRequiresCharging(dVar.f1404b);
        boolean z6 = dVar.f1405c;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z6).setExtras(persistableBundle);
        int i9 = Build.VERSION.SDK_INT;
        int i10 = dVar.f1403a;
        if (i9 < 30 || i10 != 6) {
            int d9 = AbstractC5050e.d(i10);
            if (d9 != 0) {
                if (d9 != 1) {
                    if (d9 != 2) {
                        i4 = 3;
                        if (d9 != 3) {
                            i4 = 4;
                            if (d9 != 4 || i9 < 26) {
                                r.d().a(a.f1901b, "API version too low. Cannot convert network type value ".concat(x.y(i10)));
                            }
                        }
                    } else {
                        i4 = 2;
                    }
                }
                i4 = 1;
            } else {
                i4 = 0;
            }
            extras.setRequiredNetworkType(i4);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!z6) {
            extras.setBackoffCriteria(pVar.f2948m, pVar.f2947l == 2 ? 0 : 1);
        }
        long max = Math.max(pVar.a() - System.currentTimeMillis(), 0L);
        if (i9 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!pVar.f2952q) {
            extras.setImportantWhileForeground(true);
        }
        Set<J0.c> set = dVar.f1410h;
        if (!set.isEmpty()) {
            for (J0.c cVar : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(cVar.f1401a, cVar.f1402b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(dVar.f1408f);
            extras.setTriggerContentMaxDelay(dVar.f1409g);
        }
        extras.setPersisted(false);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            extras.setRequiresBatteryNotLow(dVar.f1406d);
            extras.setRequiresStorageNotLow(dVar.f1407e);
        }
        boolean z9 = pVar.f2946k > 0;
        boolean z10 = max > 0;
        if (i11 >= 31 && pVar.f2952q && !z9 && !z10) {
            extras.setExpedited(true);
        }
        JobInfo build = extras.build();
        String str2 = f1903x;
        r.d().a(str2, "Scheduling work ID " + str + "Job ID " + i);
        try {
            try {
                if (jobScheduler.schedule(build) == 0) {
                    r.d().g(str2, "Unable to schedule work ID " + str);
                    if (pVar.f2952q) {
                        if (pVar.f2953r == 1) {
                            i6 = 0;
                            try {
                                pVar.f2952q = false;
                                r.d().a(str2, "Scheduling a non-expedited job (work ID " + str + ")");
                                g(pVar, i);
                            } catch (IllegalStateException e9) {
                                e = e9;
                                ArrayList e10 = e(this.f1904n, jobScheduler);
                                int size = e10 != null ? e10.size() : i6;
                                Locale locale = Locale.getDefault();
                                Integer valueOf = Integer.valueOf(size);
                                p pVar2 = this.f1906v;
                                String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", valueOf, Integer.valueOf(pVar2.f1643c.t().d().size()), Integer.valueOf(pVar2.f1642b.f1395c));
                                r.d().b(str2, format);
                                IllegalStateException illegalStateException = new IllegalStateException(format, e);
                                pVar2.f1642b.getClass();
                                throw illegalStateException;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                r.d().c(str2, "Unable to schedule " + pVar, th);
            }
        } catch (IllegalStateException e11) {
            e = e11;
            i6 = 0;
        }
    }
}
