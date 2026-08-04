package com.gamericefishpro.space.o6;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import com.gamericefishpro.space.l6.q;
import com.gamericefishpro.space.u6.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final /* synthetic */ int a = 0;

    static {
        q.d("Alarms");
    }

    public static void a(Context context, j jVar, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = c.w;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        c.c(intent, jVar);
        PendingIntent service = PendingIntent.getService(context, i, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        q qVarC = q.c();
        jVar.toString();
        qVarC.getClass();
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, j generationalId, long j) {
        com.gamericefishpro.space.u6.i iVarY = workDatabase.y();
        com.gamericefishpro.space.u6.g gVarC = iVarY.c(generationalId);
        if (gVarC != null) {
            int i = gVarC.c;
            a(context, generationalId, i);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = c.w;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            c.c(intent, generationalId);
            PendingIntent service = PendingIntent.getService(context, i, intent, 201326592);
            if (alarmManager != null) {
                a.a(alarmManager, 0, j, service);
                return;
            }
            return;
        }
        Object objT = workDatabase.t(new com.gamericefishpro.space.lb.c(2, new com.gamericefishpro.space.v6.f(workDatabase, 0)));
        Intrinsics.checkNotNullExpressionValue(objT, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        int iIntValue = ((Number) objT).intValue();
        Intrinsics.checkNotNullParameter(generationalId, "generationalId");
        iVarY.e(new com.gamericefishpro.space.u6.g(generationalId.a, generationalId.b, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = c.w;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        c.c(intent2, generationalId);
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, intent2, 201326592);
        if (alarmManager2 != null) {
            a.a(alarmManager2, 0, j, service2);
        }
    }
}
