package com.gamericefishpro.space.v6;

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
import com.gamericefishpro.space.l6.y;
import com.gamericefishpro.space.s5.v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {
    public static final String w = com.gamericefishpro.space.l6.q.d("ForceStopRunnable");
    public static final long y = TimeUnit.DAYS.toMillis(3650);
    public final Context d;
    public final com.gamericefishpro.space.m6.o e;
    public final f i;
    public int v = 0;

    public d(Context context, com.gamericefishpro.space.m6.o oVar) {
        this.d = context.getApplicationContext();
        this.e = oVar;
        this.i = oVar.g;
    }

    public static void b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + y;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x020a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0224  */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    public final void a() {
        boolean z;
        f fVar = this.i;
        String str = com.gamericefishpro.space.p6.c.w;
        Context context = this.d;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList arrayListD = com.gamericefishpro.space.p6.c.d(context, jobScheduler);
        com.gamericefishpro.space.m6.o oVar = this.e;
        com.gamericefishpro.space.u6.i iVarY = oVar.c.y();
        iVarY.getClass();
        v vVarB = v.b(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) iVarY.a;
        workDatabase_Impl.b();
        Cursor cursorL = com.gamericefishpro.space.hj.c.L(workDatabase_Impl, vVarB);
        try {
            ArrayList arrayList = new ArrayList(cursorL.getCount());
            while (cursorL.moveToNext()) {
                arrayList.add(cursorL.isNull(0) ? null : cursorL.getString(0));
            }
            cursorL.close();
            vVarB.c();
            HashSet hashSet = new HashSet(arrayListD != null ? arrayListD.size() : 0);
            if (arrayListD != null && !arrayListD.isEmpty()) {
                int size = arrayListD.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListD.get(i);
                    i++;
                    JobInfo jobInfo = (JobInfo) obj;
                    com.gamericefishpro.space.u6.j jVarF = com.gamericefishpro.space.p6.c.f(jobInfo);
                    if (jVarF != null) {
                        hashSet.add(jVarF.a);
                    } else {
                        com.gamericefishpro.space.p6.c.c(jobScheduler, jobInfo.getId());
                    }
                }
            }
            int size2 = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    z = false;
                    break;
                }
                Object obj2 = arrayList.get(i2);
                i2++;
                if (!hashSet.contains((String) obj2)) {
                    com.gamericefishpro.space.l6.q.c().getClass();
                    z = true;
                    break;
                }
            }
            if (z) {
                WorkDatabase workDatabase = oVar.c;
                workDatabase.c();
                try {
                    com.gamericefishpro.space.u6.q qVarB = workDatabase.B();
                    int size3 = arrayList.size();
                    int i3 = 0;
                    while (i3 < size3) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        qVarB.n((String) obj3, -1L);
                    }
                    workDatabase.u();
                    workDatabase.q();
                } catch (Throwable th) {
                    workDatabase.q();
                    throw th;
                }
            }
            WorkDatabase workDatabase2 = oVar.c;
            com.gamericefishpro.space.u6.q qVarB2 = workDatabase2.B();
            com.gamericefishpro.space.u6.n nVarA = workDatabase2.A();
            workDatabase2.c();
            try {
                ArrayList arrayListI = qVarB2.i();
                boolean zIsEmpty = arrayListI.isEmpty();
                if (!zIsEmpty) {
                    int size4 = arrayListI.size();
                    int i4 = 0;
                    while (i4 < size4) {
                        Object obj4 = arrayListI.get(i4);
                        i4++;
                        com.gamericefishpro.space.u6.p pVar = (com.gamericefishpro.space.u6.p) obj4;
                        qVarB2.r(y.d, pVar.a);
                        qVarB2.n(pVar.a, -1L);
                    }
                }
                WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) nVarA.d;
                workDatabase_Impl2.b();
                com.gamericefishpro.space.u6.h hVar = (com.gamericefishpro.space.u6.h) nVarA.v;
                com.gamericefishpro.space.e6.j jVarA = hVar.a();
                workDatabase_Impl2.c();
                try {
                    jVarA.b();
                    workDatabase_Impl2.u();
                    workDatabase_Impl2.q();
                    hVar.d(jVarA);
                    workDatabase2.u();
                    workDatabase2.q();
                    boolean z2 = !zIsEmpty || z;
                    Long lF = oVar.g.a.x().f("reschedule_needed");
                    if (lF != null && lF.longValue() == 1) {
                        com.gamericefishpro.space.l6.q.c().getClass();
                        oVar.d();
                        f fVar2 = oVar.g;
                        fVar2.getClass();
                        Intrinsics.checkNotNullParameter("reschedule_needed", "key");
                        fVar2.a.x().g(new com.gamericefishpro.space.u6.d("reschedule_needed", 0L));
                        return;
                    }
                    try {
                        int i5 = Build.VERSION.SDK_INT;
                        int i6 = i5 >= 31 ? 570425344 : 536870912;
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i6);
                        if (i5 < 30) {
                            if (broadcast == null) {
                                b(context);
                                com.gamericefishpro.space.l6.q.c().getClass();
                                oVar.d();
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                fVar.getClass();
                                fVar.a.x().g(new com.gamericefishpro.space.u6.d("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis)));
                                return;
                            }
                            if (z2) {
                                com.gamericefishpro.space.l6.q.c().getClass();
                                com.gamericefishpro.space.m6.i.a(oVar.b, oVar.c, oVar.e);
                            }
                        }
                        if (broadcast != null) {
                            broadcast.cancel();
                        }
                        List historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                        if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                            Long lF2 = fVar.a.x().f("last_force_stop_ms");
                            long jLongValue = lF2 != null ? lF2.longValue() : 0L;
                            for (int i7 = 0; i7 < historicalProcessExitReasons.size(); i7++) {
                                ApplicationExitInfo applicationExitInfoD = com.gamericefishpro.space.e4.c.d(historicalProcessExitReasons.get(i7));
                                if (applicationExitInfoD.getReason() == 10 && applicationExitInfoD.getTimestamp() >= jLongValue) {
                                    com.gamericefishpro.space.l6.q.c().getClass();
                                    oVar.d();
                                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                                    fVar.getClass();
                                    fVar.a.x().g(new com.gamericefishpro.space.u6.d("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis2)));
                                    return;
                                }
                            }
                        }
                        if (z2) {
                            com.gamericefishpro.space.l6.q.c().getClass();
                            com.gamericefishpro.space.m6.i.a(oVar.b, oVar.c, oVar.e);
                        }
                    } catch (IllegalArgumentException e) {
                        e = e;
                        if (com.gamericefishpro.space.l6.q.c().a <= 5) {
                            Log.w(w, "Ignoring exception", e);
                        }
                    } catch (SecurityException e2) {
                        e = e2;
                        if (com.gamericefishpro.space.l6.q.c().a <= 5) {
                            Log.w(w, "Ignoring exception", e);
                        }
                    }
                } catch (Throwable th2) {
                    workDatabase_Impl2.q();
                    hVar.d(jVarA);
                    throw th2;
                }
            } catch (Throwable th3) {
                workDatabase2.q();
                throw th3;
            }
        } catch (Throwable th4) {
            cursorL.close();
            vVarB.c();
            throw th4;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zA;
        String str = w;
        com.gamericefishpro.space.m6.o oVar = this.e;
        try {
            com.gamericefishpro.space.l6.c cVar = oVar.b;
            cVar.getClass();
            boolean zIsEmpty = TextUtils.isEmpty(null);
            Context context = this.d;
            if (zIsEmpty) {
                com.gamericefishpro.space.l6.q.c().getClass();
                zA = true;
            } else {
                zA = k.a(context, cVar);
                com.gamericefishpro.space.l6.q.c().getClass();
            }
            if (!zA) {
                oVar.c();
                return;
            }
            while (true) {
                try {
                    com.gamericefishpro.space.a.a.x(context);
                    com.gamericefishpro.space.l6.q.c().getClass();
                    try {
                        a();
                        oVar.c();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e) {
                        int i = this.v + 1;
                        this.v = i;
                        if (i >= 3) {
                            com.gamericefishpro.space.l6.q.c().b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                            oVar.b.getClass();
                            throw illegalStateException;
                        }
                        com.gamericefishpro.space.l6.q.c().getClass();
                        try {
                            Thread.sleep(((long) this.v) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e2) {
                    com.gamericefishpro.space.l6.q.c().a(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                    oVar.b.getClass();
                    throw illegalStateException2;
                }
            }
        } catch (Throwable th) {
            oVar.c();
            throw th;
        }
    }
}
