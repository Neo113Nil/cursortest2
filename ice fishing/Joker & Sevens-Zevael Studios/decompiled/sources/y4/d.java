package y4;

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
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public static final String f8740k = o4.o.f("ForceStopRunnable");

    /* renamed from: l, reason: collision with root package name */
    public static final long f8741l = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: g, reason: collision with root package name */
    public final Context f8742g;

    /* renamed from: h, reason: collision with root package name */
    public final p4.n f8743h;

    /* renamed from: i, reason: collision with root package name */
    public final f f8744i;

    /* renamed from: j, reason: collision with root package name */
    public int f8745j = 0;

    public d(Context context, p4.n nVar) {
        this.f8742g = context.getApplicationContext();
        this.f8743h = nVar;
        this.f8744i = nVar.f5499g;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i10 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i10);
        long currentTimeMillis = System.currentTimeMillis() + f8741l;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z10;
        boolean z11;
        WorkDatabase workDatabase;
        int i10;
        PendingIntent broadcast;
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        f fVar = this.f8744i;
        String str = s4.b.f6446k;
        Context context = this.f8742g;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList d10 = s4.b.d(context, jobScheduler);
        p4.n nVar = this.f8743h;
        x4.i p8 = nVar.f5495c.p();
        p8.getClass();
        int i11 = 0;
        b4.o a6 = b4.o.a("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) p8.f8303a;
        workDatabase_Impl.b();
        Cursor m10 = workDatabase_Impl.m(a6);
        try {
            ArrayList arrayList = new ArrayList(m10.getCount());
            while (m10.moveToNext()) {
                arrayList.add(m10.isNull(0) ? null : m10.getString(0));
            }
            HashSet hashSet = new HashSet(d10 != null ? d10.size() : 0);
            if (d10 != null && !d10.isEmpty()) {
                int size = d10.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = d10.get(i12);
                    i12++;
                    JobInfo jobInfo = (JobInfo) obj;
                    x4.j e10 = s4.b.e(jobInfo);
                    if (e10 != null) {
                        hashSet.add(e10.f8307a);
                    } else {
                        s4.b.b(jobScheduler, jobInfo.getId());
                    }
                }
            }
            int size2 = arrayList.size();
            int i13 = 0;
            while (true) {
                z10 = true;
                if (i13 >= size2) {
                    z11 = false;
                    break;
                }
                Object obj2 = arrayList.get(i13);
                i13++;
                if (!hashSet.contains((String) obj2)) {
                    o4.o.d().a(s4.b.f6446k, "Reconciling jobs");
                    z11 = true;
                    break;
                }
            }
            if (z11) {
                workDatabase = nVar.f5495c;
                workDatabase.c();
                try {
                    x4.q t3 = workDatabase.t();
                    int size3 = arrayList.size();
                    int i14 = 0;
                    while (i14 < size3) {
                        Object obj3 = arrayList.get(i14);
                        i14++;
                        t3.l(-1L, (String) obj3);
                    }
                    workDatabase.o();
                    workDatabase.k();
                } catch (Throwable th) {
                    throw th;
                }
            }
            workDatabase = nVar.f5495c;
            x4.q t10 = workDatabase.t();
            x4.n s10 = workDatabase.s();
            workDatabase.c();
            try {
                ArrayList g8 = t10.g();
                boolean isEmpty = g8.isEmpty();
                if (!isEmpty) {
                    int size4 = g8.size();
                    while (i11 < size4) {
                        Object obj4 = g8.get(i11);
                        i11++;
                        x4.p pVar = (x4.p) obj4;
                        t10.p(pVar.f8322a, 1);
                        t10.l(-1L, pVar.f8322a);
                        z11 = z11;
                    }
                }
                boolean z12 = z11;
                WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) s10.f8316a;
                workDatabase_Impl2.b();
                x4.h hVar = (x4.h) s10.f8319d;
                i4.i a8 = hVar.a();
                workDatabase_Impl2.c();
                try {
                    a8.a();
                    workDatabase_Impl2.o();
                    workDatabase_Impl2.k();
                    hVar.d(a8);
                    workDatabase.o();
                    workDatabase.k();
                    if (isEmpty && !z12) {
                        z10 = false;
                    }
                    Long d11 = nVar.f5499g.f8748a.l().d("reschedule_needed");
                    String str2 = f8740k;
                    if (d11 != null && d11.longValue() == 1) {
                        o4.o.d().a(str2, "Rescheduling Workers.");
                        nVar.d();
                        f fVar2 = nVar.f5499g;
                        fVar2.getClass();
                        fVar2.f8748a.l().e(new x4.d("reschedule_needed", 0L));
                        return;
                    }
                    try {
                        i10 = Build.VERSION.SDK_INT;
                        int i15 = i10 >= 31 ? 570425344 : 536870912;
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                        broadcast = PendingIntent.getBroadcast(context, -1, intent, i15);
                    } catch (IllegalArgumentException e11) {
                        e = e11;
                        if (o4.o.d().f5218a <= 5) {
                            Log.w(str2, "Ignoring exception", e);
                        }
                        o4.o.d().a(str2, "Application was force-stopped, rescheduling.");
                        nVar.d();
                        long currentTimeMillis = System.currentTimeMillis();
                        fVar.getClass();
                        fVar.f8748a.l().e(new x4.d("last_force_stop_ms", Long.valueOf(currentTimeMillis)));
                        return;
                    } catch (SecurityException e12) {
                        e = e12;
                        if (o4.o.d().f5218a <= 5) {
                        }
                        o4.o.d().a(str2, "Application was force-stopped, rescheduling.");
                        nVar.d();
                        long currentTimeMillis2 = System.currentTimeMillis();
                        fVar.getClass();
                        fVar.f8748a.l().e(new x4.d("last_force_stop_ms", Long.valueOf(currentTimeMillis2)));
                        return;
                    }
                    if (i10 >= 30) {
                        if (broadcast != null) {
                            broadcast.cancel();
                        }
                        historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                        if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                            Long d12 = fVar.f8748a.l().d("last_force_stop_ms");
                            long longValue = d12 != null ? d12.longValue() : 0L;
                            for (int i16 = 0; i16 < historicalProcessExitReasons.size(); i16++) {
                                ApplicationExitInfo c3 = i2.b.c(historicalProcessExitReasons.get(i16));
                                reason = c3.getReason();
                                if (reason == 10) {
                                    timestamp = c3.getTimestamp();
                                    if (timestamp >= longValue) {
                                        o4.o.d().a(str2, "Application was force-stopped, rescheduling.");
                                        nVar.d();
                                        long currentTimeMillis22 = System.currentTimeMillis();
                                        fVar.getClass();
                                        fVar.f8748a.l().e(new x4.d("last_force_stop_ms", Long.valueOf(currentTimeMillis22)));
                                        return;
                                    }
                                }
                            }
                        }
                        if (z10) {
                            return;
                        }
                        o4.o.d().a(str2, "Found unfinished work, scheduling it.");
                        p4.h.a(nVar.f5494b, nVar.f5495c, nVar.f5497e);
                        return;
                    }
                    if (broadcast == null) {
                        c(context);
                        o4.o.d().a(str2, "Application was force-stopped, rescheduling.");
                        nVar.d();
                        long currentTimeMillis222 = System.currentTimeMillis();
                        fVar.getClass();
                        fVar.f8748a.l().e(new x4.d("last_force_stop_ms", Long.valueOf(currentTimeMillis222)));
                        return;
                    }
                    if (z10) {
                    }
                } catch (Throwable th2) {
                    workDatabase_Impl2.k();
                    hVar.d(a8);
                    throw th2;
                }
            } finally {
                workDatabase.k();
            }
        } finally {
            m10.close();
            a6.f();
        }
    }

    public final boolean b() {
        o4.b bVar = this.f8743h.f5494b;
        bVar.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = f8740k;
        if (isEmpty) {
            o4.o.d().a(str, "The default process name was not specified.");
            return true;
        }
        boolean a6 = k.a(this.f8742g, bVar);
        o4.o.d().a(str, "Is default app process = " + a6);
        return a6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f8740k;
        p4.n nVar = this.f8743h;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                try {
                    a.a.D(this.f8742g);
                    o4.o.d().a(str, "Performing cleanup operations.");
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e10) {
                        int i10 = this.f8745j + 1;
                        this.f8745j = i10;
                        if (i10 >= 3) {
                            o4.o.d().c(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                            nVar.f5494b.getClass();
                            throw illegalStateException;
                        }
                        long j3 = i10 * 300;
                        String str2 = "Retrying after " + j3;
                        if (o4.o.d().f5218a <= 3) {
                            Log.d(str, str2, e10);
                        }
                        try {
                            Thread.sleep(this.f8745j * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e11) {
                    o4.o.d().b(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e11);
                    nVar.f5494b.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            nVar.c();
        }
    }
}
