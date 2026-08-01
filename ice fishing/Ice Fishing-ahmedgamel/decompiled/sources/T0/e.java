package T0;

import O.D0;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import g1.C4523c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import u0.C5059i;
import z0.C5253i;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public static final String f3032x = J0.s.f("ForceStopRunnable");

    /* renamed from: y, reason: collision with root package name */
    public static final long f3033y = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: n, reason: collision with root package name */
    public final Context f3034n;

    /* renamed from: u, reason: collision with root package name */
    public final K0.p f3035u;

    /* renamed from: v, reason: collision with root package name */
    public final C4523c f3036v;

    /* renamed from: w, reason: collision with root package name */
    public int f3037w = 0;

    public e(Context context, K0.p pVar) {
        this.f3034n = context.getApplicationContext();
        this.f3035u = pVar;
        this.f3036v = pVar.f1538g;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long currentTimeMillis = System.currentTimeMillis() + f3033y;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z3;
        WorkDatabase workDatabase;
        int i;
        PendingIntent broadcast;
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        C4523c c4523c = this.f3036v;
        String str = N0.b.f1901x;
        Context context = this.f3034n;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList e9 = N0.b.e(context, jobScheduler);
        K0.p pVar = this.f3035u;
        S0.i p9 = pVar.f1534c.p();
        p9.getClass();
        C5059i a9 = C5059i.a(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) p9.f2788u;
        workDatabase_Impl.b();
        Cursor m4 = workDatabase_Impl.m(a9);
        try {
            ArrayList arrayList = new ArrayList(m4.getCount());
            while (m4.moveToNext()) {
                arrayList.add(m4.isNull(0) ? null : m4.getString(0));
            }
            HashSet hashSet = new HashSet(e9 != null ? e9.size() : 0);
            if (e9 != null && !e9.isEmpty()) {
                Iterator it = e9.iterator();
                while (it.hasNext()) {
                    JobInfo jobInfo = (JobInfo) it.next();
                    S0.j f3 = N0.b.f(jobInfo);
                    if (f3 != null) {
                        hashSet.add(f3.f2792a);
                    } else {
                        N0.b.b(jobScheduler, jobInfo.getId());
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!hashSet.contains((String) it2.next())) {
                        J0.s.d().a(N0.b.f1901x, "Reconciling jobs");
                        z3 = true;
                        break;
                    }
                } else {
                    z3 = false;
                    break;
                }
            }
            if (z3) {
                workDatabase = pVar.f1534c;
                workDatabase.c();
                try {
                    S0.q t6 = workDatabase.t();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        t6.i((String) it3.next(), -1L);
                    }
                    workDatabase.o();
                    workDatabase.k();
                } catch (Throwable th) {
                    throw th;
                }
            }
            workDatabase = pVar.f1534c;
            S0.q t9 = workDatabase.t();
            S0.n s9 = workDatabase.s();
            workDatabase.c();
            try {
                ArrayList c9 = t9.c();
                boolean isEmpty = c9.isEmpty();
                if (!isEmpty) {
                    Iterator it4 = c9.iterator();
                    while (it4.hasNext()) {
                        S0.p pVar2 = (S0.p) it4.next();
                        t9.m(1, pVar2.f2808a);
                        t9.i(pVar2.f2808a, -1L);
                    }
                }
                WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) s9.f2802u;
                workDatabase_Impl2.b();
                S0.h hVar = (S0.h) s9.f2805x;
                C5253i a10 = hVar.a();
                workDatabase_Impl2.c();
                try {
                    a10.b();
                    workDatabase_Impl2.o();
                    workDatabase_Impl2.k();
                    hVar.n(a10);
                    workDatabase.o();
                    workDatabase.k();
                    boolean z6 = !isEmpty || z3;
                    Long j6 = ((WorkDatabase) pVar.f1538g.f37627u).l().j("reschedule_needed");
                    String str2 = f3032x;
                    if (j6 != null && j6.longValue() == 1) {
                        J0.s.d().a(str2, "Rescheduling Workers.");
                        pVar.e();
                        C4523c c4523c2 = pVar.f1538g;
                        c4523c2.getClass();
                        ((WorkDatabase) c4523c2.f37627u).l().k(new S0.d("reschedule_needed", 0L));
                        return;
                    }
                    try {
                        i = Build.VERSION.SDK_INT;
                        int i6 = i >= 31 ? 570425344 : 536870912;
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                        broadcast = PendingIntent.getBroadcast(context, -1, intent, i6);
                    } catch (IllegalArgumentException e10) {
                        e = e10;
                        if (J0.s.d().f1405a <= 5) {
                            Log.w(str2, "Ignoring exception", e);
                        }
                        J0.s.d().a(str2, "Application was force-stopped, rescheduling.");
                        pVar.e();
                        long currentTimeMillis = System.currentTimeMillis();
                        c4523c.getClass();
                        ((WorkDatabase) c4523c.f37627u).l().k(new S0.d("last_force_stop_ms", Long.valueOf(currentTimeMillis)));
                        return;
                    } catch (SecurityException e11) {
                        e = e11;
                        if (J0.s.d().f1405a <= 5) {
                        }
                        J0.s.d().a(str2, "Application was force-stopped, rescheduling.");
                        pVar.e();
                        long currentTimeMillis2 = System.currentTimeMillis();
                        c4523c.getClass();
                        ((WorkDatabase) c4523c.f37627u).l().k(new S0.d("last_force_stop_ms", Long.valueOf(currentTimeMillis2)));
                        return;
                    }
                    if (i >= 30) {
                        if (broadcast != null) {
                            broadcast.cancel();
                        }
                        historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                        if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                            Long j9 = ((WorkDatabase) c4523c.f37627u).l().j("last_force_stop_ms");
                            long longValue = j9 != null ? j9.longValue() : 0L;
                            for (int i9 = 0; i9 < historicalProcessExitReasons.size(); i9++) {
                                ApplicationExitInfo e12 = D0.e(historicalProcessExitReasons.get(i9));
                                reason = e12.getReason();
                                if (reason == 10) {
                                    timestamp = e12.getTimestamp();
                                    if (timestamp >= longValue) {
                                        J0.s.d().a(str2, "Application was force-stopped, rescheduling.");
                                        pVar.e();
                                        long currentTimeMillis22 = System.currentTimeMillis();
                                        c4523c.getClass();
                                        ((WorkDatabase) c4523c.f37627u).l().k(new S0.d("last_force_stop_ms", Long.valueOf(currentTimeMillis22)));
                                        return;
                                    }
                                }
                            }
                        }
                        if (z6) {
                            return;
                        }
                        J0.s.d().a(str2, "Found unfinished work, scheduling it.");
                        K0.i.a(pVar.f1533b, pVar.f1534c, pVar.f1536e);
                        return;
                    }
                    if (broadcast == null) {
                        c(context);
                        J0.s.d().a(str2, "Application was force-stopped, rescheduling.");
                        pVar.e();
                        long currentTimeMillis222 = System.currentTimeMillis();
                        c4523c.getClass();
                        ((WorkDatabase) c4523c.f37627u).l().k(new S0.d("last_force_stop_ms", Long.valueOf(currentTimeMillis222)));
                        return;
                    }
                    if (z6) {
                    }
                } catch (Throwable th2) {
                    workDatabase_Impl2.k();
                    hVar.n(a10);
                    throw th2;
                }
            } finally {
                workDatabase.k();
            }
        } finally {
            m4.close();
            a9.j();
        }
    }

    public final boolean b() {
        J0.b bVar = this.f3035u.f1533b;
        bVar.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = f3032x;
        if (isEmpty) {
            J0.s.d().a(str, "The default process name was not specified.");
            return true;
        }
        boolean a9 = k.a(this.f3034n, bVar);
        J0.s.d().a(str, "Is default app process = " + a9);
        return a9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f3032x;
        K0.p pVar = this.f3035u;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                try {
                    com.bumptech.glide.g.h(this.f3034n);
                    J0.s.d().a(str, "Performing cleanup operations.");
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e9) {
                        int i = this.f3037w + 1;
                        this.f3037w = i;
                        if (i >= 3) {
                            J0.s.d().c(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e9);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e9);
                            pVar.f1533b.getClass();
                            throw illegalStateException;
                        }
                        long j6 = i * 300;
                        String str2 = "Retrying after " + j6;
                        if (J0.s.d().f1405a <= 3) {
                            Log.d(str, str2, e9);
                        }
                        try {
                            Thread.sleep(this.f3037w * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e10) {
                    J0.s.d().b(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e10);
                    pVar.f1533b.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            pVar.d();
        }
    }
}
