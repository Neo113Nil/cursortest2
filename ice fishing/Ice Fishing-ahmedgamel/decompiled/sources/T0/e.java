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
import u0.C5060i;
import z0.C5220i;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public static final String f3115x = J0.r.f("ForceStopRunnable");

    /* renamed from: y, reason: collision with root package name */
    public static final long f3116y = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: n, reason: collision with root package name */
    public final Context f3117n;

    /* renamed from: u, reason: collision with root package name */
    public final K0.p f3118u;

    /* renamed from: v, reason: collision with root package name */
    public final n4.c f3119v;

    /* renamed from: w, reason: collision with root package name */
    public int f3120w = 0;

    public e(Context context, K0.p pVar) {
        this.f3117n = context.getApplicationContext();
        this.f3118u = pVar;
        this.f3119v = pVar.f1647g;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long currentTimeMillis = System.currentTimeMillis() + f3116y;
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
        boolean z6;
        WorkDatabase workDatabase;
        int i;
        PendingIntent broadcast;
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        n4.c cVar = this.f3119v;
        String str = N0.b.f1903x;
        Context context = this.f3117n;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList e9 = N0.b.e(context, jobScheduler);
        K0.p pVar = this.f3118u;
        S0.i p9 = pVar.f1643c.p();
        p9.getClass();
        C5060i a9 = C5060i.a(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) p9.f2917u;
        workDatabase_Impl.b();
        Cursor m9 = workDatabase_Impl.m(a9);
        try {
            ArrayList arrayList = new ArrayList(m9.getCount());
            while (m9.moveToNext()) {
                arrayList.add(m9.isNull(0) ? null : m9.getString(0));
            }
            HashSet hashSet = new HashSet(e9 != null ? e9.size() : 0);
            if (e9 != null && !e9.isEmpty()) {
                Iterator it = e9.iterator();
                while (it.hasNext()) {
                    JobInfo jobInfo = (JobInfo) it.next();
                    S0.j f2 = N0.b.f(jobInfo);
                    if (f2 != null) {
                        hashSet.add(f2.f2921a);
                    } else {
                        N0.b.b(jobScheduler, jobInfo.getId());
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!hashSet.contains((String) it2.next())) {
                        J0.r.d().a(N0.b.f1903x, "Reconciling jobs");
                        z6 = true;
                        break;
                    }
                } else {
                    z6 = false;
                    break;
                }
            }
            if (z6) {
                workDatabase = pVar.f1643c;
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
            workDatabase = pVar.f1643c;
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
                        t9.m(1, pVar2.f2937a);
                        t9.i(pVar2.f2937a, -1L);
                    }
                }
                WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) s9.f2931u;
                workDatabase_Impl2.b();
                S0.h hVar = (S0.h) s9.f2934x;
                C5220i a10 = hVar.a();
                workDatabase_Impl2.c();
                try {
                    a10.b();
                    workDatabase_Impl2.o();
                    workDatabase_Impl2.k();
                    hVar.n(a10);
                    workDatabase.o();
                    workDatabase.k();
                    boolean z9 = !isEmpty || z6;
                    Long y7 = ((WorkDatabase) pVar.f1647g.f39658u).l().y("reschedule_needed");
                    String str2 = f3115x;
                    if (y7 != null && y7.longValue() == 1) {
                        J0.r.d().a(str2, "Rescheduling Workers.");
                        pVar.e();
                        n4.c cVar2 = pVar.f1647g;
                        cVar2.getClass();
                        ((WorkDatabase) cVar2.f39658u).l().B(new S0.d("reschedule_needed", 0L));
                        return;
                    }
                    try {
                        i = Build.VERSION.SDK_INT;
                        int i4 = i >= 31 ? 570425344 : 536870912;
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                        broadcast = PendingIntent.getBroadcast(context, -1, intent, i4);
                    } catch (IllegalArgumentException e10) {
                        e = e10;
                        if (J0.r.d().f1433a <= 5) {
                            Log.w(str2, "Ignoring exception", e);
                        }
                        J0.r.d().a(str2, "Application was force-stopped, rescheduling.");
                        pVar.e();
                        long currentTimeMillis = System.currentTimeMillis();
                        cVar.getClass();
                        ((WorkDatabase) cVar.f39658u).l().B(new S0.d("last_force_stop_ms", Long.valueOf(currentTimeMillis)));
                        return;
                    } catch (SecurityException e11) {
                        e = e11;
                        if (J0.r.d().f1433a <= 5) {
                        }
                        J0.r.d().a(str2, "Application was force-stopped, rescheduling.");
                        pVar.e();
                        long currentTimeMillis2 = System.currentTimeMillis();
                        cVar.getClass();
                        ((WorkDatabase) cVar.f39658u).l().B(new S0.d("last_force_stop_ms", Long.valueOf(currentTimeMillis2)));
                        return;
                    }
                    if (i >= 30) {
                        if (broadcast != null) {
                            broadcast.cancel();
                        }
                        historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                        if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                            Long y9 = ((WorkDatabase) cVar.f39658u).l().y("last_force_stop_ms");
                            long longValue = y9 != null ? y9.longValue() : 0L;
                            for (int i6 = 0; i6 < historicalProcessExitReasons.size(); i6++) {
                                ApplicationExitInfo e12 = D0.e(historicalProcessExitReasons.get(i6));
                                reason = e12.getReason();
                                if (reason == 10) {
                                    timestamp = e12.getTimestamp();
                                    if (timestamp >= longValue) {
                                        J0.r.d().a(str2, "Application was force-stopped, rescheduling.");
                                        pVar.e();
                                        long currentTimeMillis22 = System.currentTimeMillis();
                                        cVar.getClass();
                                        ((WorkDatabase) cVar.f39658u).l().B(new S0.d("last_force_stop_ms", Long.valueOf(currentTimeMillis22)));
                                        return;
                                    }
                                }
                            }
                        }
                        if (z9) {
                            return;
                        }
                        J0.r.d().a(str2, "Found unfinished work, scheduling it.");
                        K0.i.a(pVar.f1642b, pVar.f1643c, pVar.f1645e);
                        return;
                    }
                    if (broadcast == null) {
                        c(context);
                        J0.r.d().a(str2, "Application was force-stopped, rescheduling.");
                        pVar.e();
                        long currentTimeMillis222 = System.currentTimeMillis();
                        cVar.getClass();
                        ((WorkDatabase) cVar.f39658u).l().B(new S0.d("last_force_stop_ms", Long.valueOf(currentTimeMillis222)));
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
            m9.close();
            a9.j();
        }
    }

    public final boolean b() {
        J0.b bVar = this.f3118u.f1642b;
        bVar.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = f3115x;
        if (isEmpty) {
            J0.r.d().a(str, "The default process name was not specified.");
            return true;
        }
        boolean a9 = k.a(this.f3117n, bVar);
        J0.r.d().a(str, "Is default app process = " + a9);
        return a9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f3115x;
        K0.p pVar = this.f3118u;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                try {
                    com.bumptech.glide.h.j(this.f3117n);
                    J0.r.d().a(str, "Performing cleanup operations.");
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e9) {
                        int i = this.f3120w + 1;
                        this.f3120w = i;
                        if (i >= 3) {
                            J0.r.d().c(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e9);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e9);
                            pVar.f1642b.getClass();
                            throw illegalStateException;
                        }
                        long j6 = i * 300;
                        String str2 = "Retrying after " + j6;
                        if (J0.r.d().f1433a <= 3) {
                            Log.d(str, str2, e9);
                        }
                        try {
                            Thread.sleep(this.f3120w * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e10) {
                    J0.r.d().b(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e10);
                    pVar.f1642b.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            pVar.d();
        }
    }
}
