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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import u.AbstractC5088e;
import z0.C5266i;

/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: x, reason: collision with root package name */
    public static final String f1945x = s.f("SystemJobScheduler");

    /* renamed from: n, reason: collision with root package name */
    public final Context f1946n;

    /* renamed from: u, reason: collision with root package name */
    public final JobScheduler f1947u;

    /* renamed from: v, reason: collision with root package name */
    public final p f1948v;

    /* renamed from: w, reason: collision with root package name */
    public final b f1949w;

    public c(Context context, p pVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        b bVar = new b(context);
        this.f1946n = context;
        this.f1948v = pVar;
        this.f1947u = jobScheduler;
        this.f1949w = bVar;
    }

    public static void b(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            s.d().c(f1945x, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            s.d().c(f1945x, "getAllPendingJobs() is not reliable on this device.", th);
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
        p pVar = this.f1948v;
        WorkDatabase workDatabase = pVar.f1532c;
        h4.c cVar = new h4.c(workDatabase);
        for (S0.p pVar2 : pVarArr) {
            workDatabase.c();
            try {
                S0.p h9 = workDatabase.t().h(pVar2.f2920a);
                String str = f1945x;
                String str2 = pVar2.f2920a;
                if (h9 == null) {
                    s.d().g(str, "Skipping scheduling " + str2 + " because it's no longer in the DB");
                    workDatabase.o();
                } else if (h9.f2921b != 1) {
                    s.d().g(str, "Skipping scheduling " + str2 + " because it is no longer enqueued");
                    workDatabase.o();
                } else {
                    j e6 = U2.a.e(pVar2);
                    g m8 = workDatabase.p().m(e6);
                    if (m8 != null) {
                        intValue = m8.f2898c;
                    } else {
                        pVar.f1531b.getClass();
                        Object n9 = ((WorkDatabase) cVar.f38233u).n(new f(cVar, pVar.f1531b.f1290b, 0));
                        kotlin.jvm.internal.h.d(n9, "workDatabase.runInTransa…            id\n        })");
                        intValue = ((Number) n9).intValue();
                    }
                    if (m8 == null) {
                        pVar.f1532c.p().n(new g(e6.f2905a, e6.f2906b, intValue));
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
        Context context = this.f1946n;
        JobScheduler jobScheduler = this.f1947u;
        ArrayList e6 = e(context, jobScheduler);
        if (e6 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            Iterator it = e6.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                j f6 = f(jobInfo);
                if (f6 != null && str.equals(f6.f2905a)) {
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
        i p6 = this.f1948v.f1532c.p();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) p6.f2901u;
        workDatabase_Impl.b();
        S0.h hVar = (S0.h) p6.f2904x;
        C5266i a9 = hVar.a();
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
        int i9;
        JobScheduler jobScheduler = this.f1947u;
        b bVar = this.f1949w;
        bVar.getClass();
        J0.d dVar = pVar.f2928j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str = pVar.f2920a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", pVar.f2938t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.c());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i, bVar.f1944a).setRequiresCharging(dVar.f1300b);
        boolean z8 = dVar.f1301c;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z8).setExtras(persistableBundle);
        int i10 = Build.VERSION.SDK_INT;
        int i11 = dVar.f1299a;
        if (i10 < 30 || i11 != 6) {
            int d2 = AbstractC5088e.d(i11);
            if (d2 != 0) {
                if (d2 != 1) {
                    if (d2 != 2) {
                        i4 = 3;
                        if (d2 != 3) {
                            i4 = 4;
                            if (d2 != 4 || i10 < 26) {
                                s.d().a(b.f1943b, "API version too low. Cannot convert network type value ".concat(y.s(i11)));
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
        if (!z8) {
            extras.setBackoffCriteria(pVar.f2931m, pVar.f2930l == 2 ? 0 : 1);
        }
        long max = Math.max(pVar.a() - System.currentTimeMillis(), 0L);
        if (i10 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!pVar.f2935q) {
            extras.setImportantWhileForeground(true);
        }
        Set<J0.c> set = dVar.f1306h;
        if (!set.isEmpty()) {
            for (J0.c cVar : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(cVar.f1297a, cVar.f1298b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(dVar.f1304f);
            extras.setTriggerContentMaxDelay(dVar.f1305g);
        }
        extras.setPersisted(false);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            extras.setRequiresBatteryNotLow(dVar.f1302d);
            extras.setRequiresStorageNotLow(dVar.f1303e);
        }
        boolean z9 = pVar.f2929k > 0;
        boolean z10 = max > 0;
        if (i12 >= 31 && pVar.f2935q && !z9 && !z10) {
            extras.setExpedited(true);
        }
        JobInfo build = extras.build();
        String str2 = f1945x;
        s.d().a(str2, "Scheduling work ID " + str + "Job ID " + i);
        try {
            try {
                if (jobScheduler.schedule(build) == 0) {
                    s.d().g(str2, "Unable to schedule work ID " + str);
                    if (pVar.f2935q) {
                        if (pVar.f2936r == 1) {
                            i9 = 0;
                            try {
                                pVar.f2935q = false;
                                s.d().a(str2, "Scheduling a non-expedited job (work ID " + str + ")");
                                g(pVar, i);
                            } catch (IllegalStateException e6) {
                                e = e6;
                                ArrayList e9 = e(this.f1946n, jobScheduler);
                                int size = e9 != null ? e9.size() : i9;
                                Locale locale = Locale.getDefault();
                                Integer valueOf = Integer.valueOf(size);
                                p pVar2 = this.f1948v;
                                String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", valueOf, Integer.valueOf(pVar2.f1532c.t().d().size()), Integer.valueOf(pVar2.f1531b.f1291c));
                                s.d().b(str2, format);
                                IllegalStateException illegalStateException = new IllegalStateException(format, e);
                                pVar2.f1531b.getClass();
                                throw illegalStateException;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                s.d().c(str2, "Unable to schedule " + pVar, th);
            }
        } catch (IllegalStateException e10) {
            e = e10;
            i9 = 0;
        }
    }
}
