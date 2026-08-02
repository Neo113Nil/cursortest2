package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.Calendar;
import ru.yandex.music.push.LocalPushReceiver;

/* loaded from: classes6.dex */
public final class fmg {
    public static final aaw e = new aaw(26);
    public final Context a;
    public final frt b;
    public final pfj c;
    public final jyr d = btf.b(new dmg(0, this));

    public fmg(Context context, frt frtVar, pfj pfjVar) {
        this.a = context;
        this.b = frtVar;
        this.c = pfjVar;
    }

    public final synchronized void a() {
        try {
            xxq c = this.b.c();
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("prefs.pushService", 0);
            sharedPreferences.getClass();
            Object systemService = this.a.getSystemService("alarm");
            systemService.getClass();
            AlarmManager alarmManager = (AlarmManager) systemService;
            long j = sharedPreferences.getLong("key.auth_push_time", 0L);
            if (c.a()) {
                Context context = this.a;
                Intent intent = new Intent(context, (Class<?>) LocalPushReceiver.class);
                intent.setAction("action.auth.push.alarm");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, 10001, intent, 603979776);
                if (broadcast != null) {
                    alarmManager.cancel(broadcast);
                }
                sharedPreferences.edit().remove("key.auth_push_time").apply();
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (j == 0 || j < currentTimeMillis) {
                    Context context2 = this.a;
                    Intent intent2 = new Intent(context2, (Class<?>) LocalPushReceiver.class);
                    intent2.setAction("action.auth.push.alarm");
                    PendingIntent broadcast2 = PendingIntent.getBroadcast(context2, 10001, intent2, 603979776);
                    if (broadcast2 != null) {
                        alarmManager.cancel(broadcast2);
                    }
                    int i = y4n.a;
                    Calendar calendar = Calendar.getInstance();
                    calendar.add(13, y4n.a);
                    int i2 = calendar.get(11);
                    if (i2 < 9) {
                        calendar.set(11, 9);
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                    } else if (i2 >= 21) {
                        calendar.set(11, 21);
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                    }
                    long timeInMillis = calendar.getTimeInMillis();
                    Intent intent3 = new Intent(this.a, (Class<?>) LocalPushReceiver.class);
                    intent3.setAction("action.auth.push.alarm");
                    PendingIntent broadcast3 = PendingIntent.getBroadcast(this.a, 10001, intent3, 335544320);
                    broadcast3.getClass();
                    alarmManager.set(0, timeInMillis, broadcast3);
                    sharedPreferences.edit().putLong("key.auth_push_time", timeInMillis).apply();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
