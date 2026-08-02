package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class lzr implements kto {
    public static final String f = jsg.n("SystemJobScheduler");
    public final Context a;
    public final JobScheduler b;
    public final kzr c;
    public final WorkDatabase d;
    public final r46 e;

    public lzr(Context context, WorkDatabase workDatabase, r46 r46Var) {
        JobScheduler b = z2f.b(context);
        kzr kzrVar = new kzr(context, r46Var.d, r46Var.l);
        this.a = context;
        this.b = b;
        this.c = kzrVar;
        this.d = workDatabase;
        this.e = r46Var;
    }

    public static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            jsg.j().h(f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList d(Context context, JobScheduler jobScheduler) {
        List<JobInfo> a = z2f.a(jobScheduler);
        if (a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(a.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : a) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static a4w f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new a4w(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.kto
    public final void b(String str) {
        ArrayList arrayList;
        Context context = this.a;
        JobScheduler jobScheduler = this.b;
        ArrayList d = d(context, jobScheduler);
        if (d == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            Iterator it = d.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                a4w f2 = f(jobInfo);
                if (f2 != null && str.equals(f2.a)) {
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
            a(jobScheduler, ((Integer) it2.next()).intValue());
        }
        jzr x = this.d.x();
        x.getClass();
        str.getClass();
        up6.F(x.a, false, true, new srp(str, 9));
    }

    @Override // defpackage.kto
    public final void c(t4w... t4wVarArr) {
        int intValue;
        r46 r46Var = this.e;
        WorkDatabase workDatabase = this.d;
        tae taeVar = new tae(workDatabase, 0);
        boolean z = false;
        for (t4w t4wVar : t4wVarArr) {
            workDatabase.b();
            try {
                x4w A = workDatabase.A();
                String str = t4wVar.a;
                t4w e = A.e(str);
                String str2 = f;
                if (e == null) {
                    jsg.j().o(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.t();
                } else if (e.b != c4w.a) {
                    jsg.j().o(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.t();
                } else {
                    a4w A2 = bzf.A(t4wVar);
                    int i = A2.b;
                    String str3 = A2.a;
                    jzr x = workDatabase.x();
                    x.getClass();
                    str3.getClass();
                    izr izrVar = (izr) up6.F(x.a, true, z, new x20(str3, i, 7));
                    if (izrVar != null) {
                        intValue = izrVar.c;
                    } else {
                        r46Var.getClass();
                        int i2 = r46Var.i;
                        WorkDatabase workDatabase2 = taeVar.a;
                        sae saeVar = new sae(taeVar, i2, 0);
                        workDatabase2.getClass();
                        Object s = workDatabase2.s(new b6n(24, saeVar));
                        s.getClass();
                        intValue = ((Number) s).intValue();
                    }
                    if (izrVar == null) {
                        izr izrVar2 = new izr(str3, i, intValue);
                        jzr x2 = workDatabase.x();
                        x2.getClass();
                        ueo ueoVar = x2.a;
                        xum xumVar = new xum(29, x2, izrVar2);
                        z = false;
                        up6.F(ueoVar, false, true, xumVar);
                    } else {
                        z = false;
                    }
                    g(t4wVar, intValue);
                    workDatabase.t();
                }
            } finally {
                workDatabase.g();
            }
        }
    }

    @Override // defpackage.kto
    public final boolean e() {
        return true;
    }

    public final void g(t4w t4wVar, int i) {
        String str;
        JobInfo a = this.c.a(t4wVar, i);
        jsg j = jsg.j();
        StringBuilder sb = new StringBuilder("Scheduling work ID ");
        String str2 = t4wVar.a;
        sb.append(str2);
        sb.append("Job ID ");
        sb.append(i);
        String sb2 = sb.toString();
        String str3 = f;
        j.e(str3, sb2);
        try {
            if (this.b.schedule(a) == 0) {
                jsg.j().o(str3, "Unable to schedule work ID " + str2);
                if (t4wVar.q && t4wVar.r == nxj.a) {
                    t4wVar.q = false;
                    jsg.j().e(str3, "Scheduling a non-expedited job (work ID " + str2 + ")");
                    g(t4wVar, i);
                }
            }
        } catch (IllegalStateException e) {
            String str4 = z2f.a;
            Context context = this.a;
            context.getClass();
            WorkDatabase workDatabase = this.d;
            workDatabase.getClass();
            r46 r46Var = this.e;
            r46Var.getClass();
            int i2 = Build.VERSION.SDK_INT;
            int i3 = i2 >= 31 ? 150 : 100;
            int size = ((List) up6.F(workDatabase.A().a, true, false, new jwv(21))).size();
            String str5 = "<faulty JobScheduler failed to getPendingJobs>";
            if (i2 >= 34) {
                JobScheduler b = z2f.b(context);
                List a2 = z2f.a(b);
                if (a2 != null) {
                    ArrayList d = d(context, b);
                    int size2 = d != null ? a2.size() - d.size() : 0;
                    String str6 = null;
                    if (size2 == 0) {
                        str = null;
                    } else {
                        str = size2 + " of which are not owned by WorkManager";
                    }
                    Object systemService = context.getSystemService("jobscheduler");
                    systemService.getClass();
                    ArrayList d2 = d(context, (JobScheduler) systemService);
                    int size3 = d2 != null ? d2.size() : 0;
                    if (size3 != 0) {
                        str6 = size3 + " from WorkManager in the default namespace";
                    }
                    str5 = CollectionsKt.X(xz0.w(new String[]{a2.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str, str6}), ",\n", null, null, null, 62);
                }
            } else {
                ArrayList d3 = d(context, z2f.b(context));
                if (d3 != null) {
                    str5 = d3.size() + " jobs from WorkManager";
                }
            }
            StringBuilder r = k5r.r(i3, "JobScheduler ", " job limit exceeded.\nIn JobScheduler there are ", str5, ".\nThere are ");
            r.append(size);
            r.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
            String r2 = vz1.r(r, r46Var.k, '.');
            jsg.j().g(str3, r2);
            b6e.o(r2, e);
        } catch (Throwable th) {
            jsg.j().h(str3, "Unable to schedule " + t4wVar, th);
        }
    }
}
