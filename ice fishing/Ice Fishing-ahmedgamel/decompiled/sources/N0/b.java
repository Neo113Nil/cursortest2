package N0;

import D.y;
import J0.s;
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
import com.bumptech.glide.e;
import g1.C4522b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import u.AbstractC5049e;
import z0.C5253i;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: x, reason: collision with root package name */
    public static final String f1901x = s.f("SystemJobScheduler");

    /* renamed from: n, reason: collision with root package name */
    public final Context f1902n;

    /* renamed from: u, reason: collision with root package name */
    public final JobScheduler f1903u;

    /* renamed from: v, reason: collision with root package name */
    public final p f1904v;

    /* renamed from: w, reason: collision with root package name */
    public final a f1905w;

    public b(Context context, p pVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        a aVar = new a(context);
        this.f1902n = context;
        this.f1904v = pVar;
        this.f1903u = jobScheduler;
        this.f1905w = aVar;
    }

    public static void b(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            s.d().c(f1901x, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            s.d().c(f1901x, "getAllPendingJobs() is not reliable on this device.", th);
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
        p pVar = this.f1904v;
        WorkDatabase workDatabase = pVar.f1534c;
        C4522b c4522b = new C4522b(workDatabase);
        for (S0.p pVar2 : pVarArr) {
            workDatabase.c();
            try {
                S0.p h9 = workDatabase.t().h(pVar2.f2808a);
                String str = f1901x;
                String str2 = pVar2.f2808a;
                if (h9 == null) {
                    s.d().g(str, "Skipping scheduling " + str2 + " because it's no longer in the DB");
                    workDatabase.o();
                } else if (h9.f2809b != 1) {
                    s.d().g(str, "Skipping scheduling " + str2 + " because it is no longer enqueued");
                    workDatabase.o();
                } else {
                    j c9 = e.c(pVar2);
                    g h10 = workDatabase.p().h(c9);
                    if (h10 != null) {
                        intValue = h10.f2785c;
                    } else {
                        pVar.f1533b.getClass();
                        Object n9 = ((WorkDatabase) c4522b.f37625u).n(new f(c4522b, pVar.f1533b.f1365b, 0));
                        kotlin.jvm.internal.h.d(n9, "workDatabase.runInTransa…            id\n        })");
                        intValue = ((Number) n9).intValue();
                    }
                    if (h10 == null) {
                        pVar.f1534c.p().j(new g(c9.f2792a, c9.f2793b, intValue));
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
        Context context = this.f1902n;
        JobScheduler jobScheduler = this.f1903u;
        ArrayList e9 = e(context, jobScheduler);
        if (e9 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            Iterator it = e9.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                j f3 = f(jobInfo);
                if (f3 != null && str.equals(f3.f2792a)) {
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
        i p9 = this.f1904v.f1534c.p();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) p9.f2788u;
        workDatabase_Impl.b();
        S0.h hVar = (S0.h) p9.f2791x;
        C5253i a9 = hVar.a();
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
        int i6;
        int i9;
        JobScheduler jobScheduler = this.f1903u;
        a aVar = this.f1905w;
        aVar.getClass();
        J0.d dVar = pVar.f2816j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str = pVar.f2808a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", pVar.f2826t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.c());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i, aVar.f1900a).setRequiresCharging(dVar.f1375b);
        boolean z3 = dVar.f1376c;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z3).setExtras(persistableBundle);
        int i10 = Build.VERSION.SDK_INT;
        int i11 = dVar.f1374a;
        if (i10 < 30 || i11 != 6) {
            int d2 = AbstractC5049e.d(i11);
            if (d2 != 0) {
                if (d2 != 1) {
                    if (d2 != 2) {
                        i6 = 3;
                        if (d2 != 3) {
                            i6 = 4;
                            if (d2 != 4 || i10 < 26) {
                                s.d().a(a.f1899b, "API version too low. Cannot convert network type value ".concat(y.y(i11)));
                            }
                        }
                    } else {
                        i6 = 2;
                    }
                }
                i6 = 1;
            } else {
                i6 = 0;
            }
            extras.setRequiredNetworkType(i6);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!z3) {
            extras.setBackoffCriteria(pVar.f2819m, pVar.f2818l == 2 ? 0 : 1);
        }
        long max = Math.max(pVar.a() - System.currentTimeMillis(), 0L);
        if (i10 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!pVar.f2823q) {
            extras.setImportantWhileForeground(true);
        }
        Set<J0.c> set = dVar.f1381h;
        if (!set.isEmpty()) {
            for (J0.c cVar : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(cVar.f1372a, cVar.f1373b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(dVar.f1379f);
            extras.setTriggerContentMaxDelay(dVar.f1380g);
        }
        extras.setPersisted(false);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            extras.setRequiresBatteryNotLow(dVar.f1377d);
            extras.setRequiresStorageNotLow(dVar.f1378e);
        }
        boolean z6 = pVar.f2817k > 0;
        boolean z9 = max > 0;
        if (i12 >= 31 && pVar.f2823q && !z6 && !z9) {
            extras.setExpedited(true);
        }
        JobInfo build = extras.build();
        String str2 = f1901x;
        s.d().a(str2, "Scheduling work ID " + str + "Job ID " + i);
        try {
            try {
                if (jobScheduler.schedule(build) == 0) {
                    s.d().g(str2, "Unable to schedule work ID " + str);
                    if (pVar.f2823q) {
                        if (pVar.f2824r == 1) {
                            i9 = 0;
                            try {
                                pVar.f2823q = false;
                                s.d().a(str2, "Scheduling a non-expedited job (work ID " + str + ")");
                                g(pVar, i);
                            } catch (IllegalStateException e9) {
                                e = e9;
                                ArrayList e10 = e(this.f1902n, jobScheduler);
                                int size = e10 != null ? e10.size() : i9;
                                Locale locale = Locale.getDefault();
                                Integer valueOf = Integer.valueOf(size);
                                p pVar2 = this.f1904v;
                                String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", valueOf, Integer.valueOf(pVar2.f1534c.t().d().size()), Integer.valueOf(pVar2.f1533b.f1366c));
                                s.d().b(str2, format);
                                IllegalStateException illegalStateException = new IllegalStateException(format, e);
                                pVar2.f1533b.getClass();
                                throw illegalStateException;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                s.d().c(str2, "Unable to schedule " + pVar, th);
            }
        } catch (IllegalStateException e11) {
            e = e11;
            i9 = 0;
        }
    }
}
