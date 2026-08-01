package M0;

import J0.s;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import g1.C4522b;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1779a = s.f("Alarms");

    public static void a(Context context, S0.j jVar, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = c.f1780x;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        c.d(intent, jVar);
        PendingIntent service = PendingIntent.getService(context, i, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        s.d().a(f1779a, "Cancelling existing alarm with (workSpecId, systemId) (" + jVar + ", " + i + ")");
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, S0.j jVar, long j6) {
        S0.i p9 = workDatabase.p();
        S0.g h9 = p9.h(jVar);
        if (h9 != null) {
            int i = h9.f2785c;
            a(context, jVar, i);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = c.f1780x;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            c.d(intent, jVar);
            PendingIntent service = PendingIntent.getService(context, i, intent, 201326592);
            if (alarmManager != null) {
                a.a(alarmManager, 0, j6, service);
                return;
            }
            return;
        }
        Object n9 = workDatabase.n(new I0.f(1, new C4522b(workDatabase)));
        kotlin.jvm.internal.h.d(n9, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        int intValue = ((Number) n9).intValue();
        p9.j(new S0.g(jVar.f2792a, jVar.f2793b, intValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = c.f1780x;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        c.d(intent2, jVar);
        PendingIntent service2 = PendingIntent.getService(context, intValue, intent2, 201326592);
        if (alarmManager2 != null) {
            a.a(alarmManager2, 0, j6, service2);
        }
    }
}
