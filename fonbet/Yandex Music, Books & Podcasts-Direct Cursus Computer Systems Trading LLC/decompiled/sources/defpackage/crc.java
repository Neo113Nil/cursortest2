package defpackage;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class crc implements Runnable {
    public static final String e = jsg.n("ForceStopRunnable");
    public static final long f = 315360000000L;
    public final Context a;
    public final g4w b;
    public final tae c;
    public int d = 0;

    public crc(Context context, g4w g4wVar) {
        this.a = context.getApplicationContext();
        this.b = g4wVar;
        this.c = g4wVar.g;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long currentTimeMillis = System.currentTimeMillis() + f;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z;
        int i;
        PendingIntent broadcast;
        tae taeVar = this.c;
        g4w g4wVar = this.b;
        WorkDatabase workDatabase = g4wVar.c;
        r46 r46Var = g4wVar.b;
        tae taeVar2 = g4wVar.g;
        workDatabase = g4wVar.c;
        String str = lzr.f;
        Context context = this.a;
        JobScheduler b = z2f.b(context);
        ArrayList d = lzr.d(context, b);
        List list = (List) up6.F(workDatabase.x().a, true, false, new csr(12));
        HashSet hashSet = new HashSet(d != null ? d.size() : 0);
        if (d != null && !d.isEmpty()) {
            Iterator it = d.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                a4w f2 = lzr.f(jobInfo);
                if (f2 != null) {
                    hashSet.add(f2.a);
                } else {
                    lzr.a(b, jobInfo.getId());
                }
            }
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (!hashSet.contains((String) it2.next())) {
                    jsg.j().e(lzr.f, "Reconciling jobs");
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            workDatabase.b();
            try {
                x4w A = workDatabase.A();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    A.g(-1L, (String) it3.next());
                }
                workDatabase.t();
                workDatabase.g();
            } catch (Throwable th) {
                throw th;
            }
        }
        x4w A2 = workDatabase.A();
        m4w z2 = workDatabase.z();
        workDatabase.b();
        try {
            List<t4w> list2 = (List) up6.F(A2.a, true, false, new jwv(22));
            boolean z3 = (list2 == null || list2.isEmpty()) ? false : true;
            if (z3) {
                for (t4w t4wVar : list2) {
                    c4w c4wVar = c4w.a;
                    String str2 = t4wVar.a;
                    A2.j(c4wVar, str2);
                    A2.k(-512, str2);
                    A2.g(-1L, str2);
                }
            }
            up6.F(z2.a, false, true, new jwv(20));
            workDatabase.t();
            workDatabase.g();
            boolean z4 = z3 || z;
            Long a = taeVar2.a.w().a("reschedule_needed");
            int i2 = 29;
            String str3 = e;
            if (a != null && a.longValue() == 1) {
                jsg.j().e(str3, "Rescheduling Workers.");
                g4wVar.g();
                taeVar2.getClass();
                wlm wlmVar = new wlm("reschedule_needed", 0L);
                xlm w = taeVar2.a.w();
                up6.F(w.a, false, true, new avi(i2, w, wlmVar));
                return;
            }
            try {
                i = Build.VERSION.SDK_INT;
                int i3 = i >= 31 ? 570425344 : SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                broadcast = PendingIntent.getBroadcast(context, -1, intent, i3);
            } catch (IllegalArgumentException e2) {
                e = e2;
                if (jsg.j().b <= 5) {
                    Log.w(str3, "Ignoring exception", e);
                }
                jsg.j().e(str3, "Application was force-stopped, rescheduling.");
                g4wVar.g();
                r46Var.d.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                taeVar.getClass();
                wlm wlmVar2 = new wlm("last_force_stop_ms", Long.valueOf(currentTimeMillis));
                xlm w2 = taeVar.a.w();
                up6.F(w2.a, false, true, new avi(i2, w2, wlmVar2));
                return;
            } catch (SecurityException e3) {
                e = e3;
                if (jsg.j().b <= 5) {
                }
                jsg.j().e(str3, "Application was force-stopped, rescheduling.");
                g4wVar.g();
                r46Var.d.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                taeVar.getClass();
                wlm wlmVar22 = new wlm("last_force_stop_ms", Long.valueOf(currentTimeMillis2));
                xlm w22 = taeVar.a.w();
                up6.F(w22.a, false, true, new avi(i2, w22, wlmVar22));
                return;
            }
            if (i >= 30) {
                if (broadcast != null) {
                    broadcast.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    Long a2 = taeVar.a.w().a("last_force_stop_ms");
                    long longValue = a2 != null ? a2.longValue() : 0L;
                    for (int i4 = 0; i4 < historicalProcessExitReasons.size(); i4++) {
                        ApplicationExitInfo b2 = kac.b(historicalProcessExitReasons.get(i4));
                        if (b2.getReason() == 10 && b2.getTimestamp() >= longValue) {
                            jsg.j().e(str3, "Application was force-stopped, rescheduling.");
                            g4wVar.g();
                            r46Var.d.getClass();
                            long currentTimeMillis22 = System.currentTimeMillis();
                            taeVar.getClass();
                            wlm wlmVar222 = new wlm("last_force_stop_ms", Long.valueOf(currentTimeMillis22));
                            xlm w222 = taeVar.a.w();
                            up6.F(w222.a, false, true, new avi(i2, w222, wlmVar222));
                            return;
                        }
                    }
                }
                if (z4) {
                    return;
                }
                jsg.j().e(str3, "Found unfinished work, scheduling it.");
                tto.b(r46Var, workDatabase, g4wVar.e);
                return;
            }
            if (broadcast == null) {
                c(context);
                jsg.j().e(str3, "Application was force-stopped, rescheduling.");
                g4wVar.g();
                r46Var.d.getClass();
                long currentTimeMillis222 = System.currentTimeMillis();
                taeVar.getClass();
                wlm wlmVar2222 = new wlm("last_force_stop_ms", Long.valueOf(currentTimeMillis222));
                xlm w2222 = taeVar.a.w();
                up6.F(w2222.a, false, true, new avi(i2, w2222, wlmVar2222));
                return;
            }
            if (z4) {
            }
        } finally {
            workDatabase.g();
        }
    }

    public final boolean b() {
        r46 r46Var = this.b.b;
        r46Var.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = e;
        if (isEmpty) {
            jsg.j().e(str, "The default process name was not specified.");
            return true;
        }
        boolean a = ftm.a(this.a, r46Var);
        jsg.j().e(str, "Is default app process = " + a);
        return a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.a;
        String str = e;
        g4w g4wVar = this.b;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                try {
                    tyf.C(context);
                    jsg.j().e(str, "Performing cleanup operations.");
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e2) {
                        int i = this.d + 1;
                        this.d = i;
                        if (i >= 3) {
                            String str2 = a4g.I(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            jsg.j().h(str, str2, e2);
                            IllegalStateException illegalStateException = new IllegalStateException(str2, e2);
                            g4wVar.b.getClass();
                            throw illegalStateException;
                        }
                        jsg.j().f(str, "Retrying after " + (i * 300), e2);
                        try {
                            Thread.sleep(this.d * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e3) {
                    jsg.j().g(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e3);
                    g4wVar.b.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            g4wVar.f();
        }
    }
}
