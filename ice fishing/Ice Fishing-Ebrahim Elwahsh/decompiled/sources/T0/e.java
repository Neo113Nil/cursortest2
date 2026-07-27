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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import u0.C5098i;
import z0.C5266i;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public static final String f3042x = J0.s.f("ForceStopRunnable");

    /* renamed from: y, reason: collision with root package name */
    public static final long f3043y = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: n, reason: collision with root package name */
    public final Context f3044n;

    /* renamed from: u, reason: collision with root package name */
    public final K0.p f3045u;

    /* renamed from: v, reason: collision with root package name */
    public final I0.j f3046v;

    /* renamed from: w, reason: collision with root package name */
    public int f3047w = 0;

    public e(Context context, K0.p pVar) {
        this.f3044n = context.getApplicationContext();
        this.f3045u = pVar;
        this.f3046v = pVar.f1536g;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long currentTimeMillis = System.currentTimeMillis() + f3043y;
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
        boolean z8;
        WorkDatabase workDatabase;
        int i;
        PendingIntent broadcast;
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        I0.j jVar = this.f3046v;
        String str = N0.c.f1945x;
        Context context = this.f3044n;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList e6 = N0.c.e(context, jobScheduler);
        K0.p pVar = this.f3045u;
        S0.i p6 = pVar.f1532c.p();
        p6.getClass();
        C5098i a9 = C5098i.a(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) p6.f2901u;
        workDatabase_Impl.b();
        Cursor m8 = workDatabase_Impl.m(a9);
        try {
            ArrayList arrayList = new ArrayList(m8.getCount());
            while (m8.moveToNext()) {
                arrayList.add(m8.isNull(0) ? null : m8.getString(0));
            }
            HashSet hashSet = new HashSet(e6 != null ? e6.size() : 0);
            if (e6 != null && !e6.isEmpty()) {
                Iterator it = e6.iterator();
                while (it.hasNext()) {
                    JobInfo jobInfo = (JobInfo) it.next();
                    S0.j f6 = N0.c.f(jobInfo);
                    if (f6 != null) {
                        hashSet.add(f6.f2905a);
                    } else {
                        N0.c.b(jobScheduler, jobInfo.getId());
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!hashSet.contains((String) it2.next())) {
                        J0.s.d().a(N0.c.f1945x, "Reconciling jobs");
                        z8 = true;
                        break;
                    }
                } else {
                    z8 = false;
                    break;
                }
            }
            if (z8) {
                workDatabase = pVar.f1532c;
                workDatabase.c();
                try {
                    S0.q t9 = workDatabase.t();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        t9.i((String) it3.next(), -1L);
                    }
                    workDatabase.o();
                    workDatabase.k();
                } catch (Throwable th) {
                    throw th;
                }
            }
            workDatabase = pVar.f1532c;
            S0.q t10 = workDatabase.t();
            S0.n s3 = workDatabase.s();
            workDatabase.c();
            try {
                ArrayList c4 = t10.c();
                boolean isEmpty = c4.isEmpty();
                if (!isEmpty) {
                    Iterator it4 = c4.iterator();
                    while (it4.hasNext()) {
                        S0.p pVar2 = (S0.p) it4.next();
                        t10.m(1, pVar2.f2920a);
                        t10.i(pVar2.f2920a, -1L);
                    }
                }
                WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) s3.f2914n;
                workDatabase_Impl2.b();
                S0.h hVar = (S0.h) s3.f2917w;
                C5266i a10 = hVar.a();
                workDatabase_Impl2.c();
                try {
                    a10.b();
                    workDatabase_Impl2.o();
                    workDatabase_Impl2.k();
                    hVar.n(a10);
                    workDatabase.o();
                    workDatabase.k();
                    boolean z9 = !isEmpty || z8;
                    Long g9 = ((WorkDatabase) pVar.f1536g.f1233u).l().g("reschedule_needed");
                    String str2 = f3042x;
                    if (g9 != null && g9.longValue() == 1) {
                        J0.s.d().a(str2, "Rescheduling Workers.");
                        pVar.e();
                        I0.j jVar2 = pVar.f1536g;
                        jVar2.getClass();
                        ((WorkDatabase) jVar2.f1233u).l().i(new S0.d("reschedule_needed", 0L));
                        return;
                    }
                    try {
                        i = Build.VERSION.SDK_INT;
                        int i4 = i >= 31 ? 570425344 : 536870912;
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                        broadcast = PendingIntent.getBroadcast(context, -1, intent, i4);
                    } catch (IllegalArgumentException e9) {
                        e = e9;
                        if (J0.s.d().f1330a <= 5) {
                            Log.w(str2, "Ignoring exception", e);
                        }
                        J0.s.d().a(str2, "Application was force-stopped, rescheduling.");
                        pVar.e();
                        long currentTimeMillis = System.currentTimeMillis();
                        jVar.getClass();
                        ((WorkDatabase) jVar.f1233u).l().i(new S0.d("last_force_stop_ms", Long.valueOf(currentTimeMillis)));
                        return;
                    } catch (SecurityException e10) {
                        e = e10;
                        if (J0.s.d().f1330a <= 5) {
                        }
                        J0.s.d().a(str2, "Application was force-stopped, rescheduling.");
                        pVar.e();
                        long currentTimeMillis2 = System.currentTimeMillis();
                        jVar.getClass();
                        ((WorkDatabase) jVar.f1233u).l().i(new S0.d("last_force_stop_ms", Long.valueOf(currentTimeMillis2)));
                        return;
                    }
                    if (i >= 30) {
                        if (broadcast != null) {
                            broadcast.cancel();
                        }
                        historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                        if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                            Long g10 = ((WorkDatabase) jVar.f1233u).l().g("last_force_stop_ms");
                            long longValue = g10 != null ? g10.longValue() : 0L;
                            for (int i9 = 0; i9 < historicalProcessExitReasons.size(); i9++) {
                                ApplicationExitInfo e11 = D0.e(historicalProcessExitReasons.get(i9));
                                reason = e11.getReason();
                                if (reason == 10) {
                                    timestamp = e11.getTimestamp();
                                    if (timestamp >= longValue) {
                                        J0.s.d().a(str2, "Application was force-stopped, rescheduling.");
                                        pVar.e();
                                        long currentTimeMillis22 = System.currentTimeMillis();
                                        jVar.getClass();
                                        ((WorkDatabase) jVar.f1233u).l().i(new S0.d("last_force_stop_ms", Long.valueOf(currentTimeMillis22)));
                                        return;
                                    }
                                }
                            }
                        }
                        if (z9) {
                            return;
                        }
                        J0.s.d().a(str2, "Found unfinished work, scheduling it.");
                        K0.i.a(pVar.f1531b, pVar.f1532c, pVar.f1534e);
                        return;
                    }
                    if (broadcast == null) {
                        c(context);
                        J0.s.d().a(str2, "Application was force-stopped, rescheduling.");
                        pVar.e();
                        long currentTimeMillis222 = System.currentTimeMillis();
                        jVar.getClass();
                        ((WorkDatabase) jVar.f1233u).l().i(new S0.d("last_force_stop_ms", Long.valueOf(currentTimeMillis222)));
                        return;
                    }
                    if (z9) {
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
            m8.close();
            a9.j();
        }
    }

    public final boolean b() {
        J0.b bVar = this.f3045u.f1531b;
        bVar.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = f3042x;
        if (isEmpty) {
            J0.s.d().a(str, "The default process name was not specified.");
            return true;
        }
        boolean a9 = k.a(this.f3044n, bVar);
        J0.s.d().a(str, "Is default app process = " + a9);
        return a9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f3042x;
        K0.p pVar = this.f3045u;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                try {
                    com.bumptech.glide.e.r(this.f3044n);
                    J0.s.d().a(str, "Performing cleanup operations.");
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e6) {
                        int i = this.f3047w + 1;
                        this.f3047w = i;
                        if (i >= 3) {
                            J0.s.d().c(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e6);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e6);
                            pVar.f1531b.getClass();
                            throw illegalStateException;
                        }
                        long j9 = i * 300;
                        String str2 = "Retrying after " + j9;
                        if (J0.s.d().f1330a <= 3) {
                            Log.d(str, str2, e6);
                        }
                        try {
                            Thread.sleep(this.f3047w * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e9) {
                    J0.s.d().b(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e9);
                    pVar.f1531b.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            pVar.d();
        }
    }
}
