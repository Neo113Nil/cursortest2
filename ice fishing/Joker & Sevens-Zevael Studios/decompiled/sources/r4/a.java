package r4;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class a {
    public static void a(AlarmManager alarmManager, int i10, long j3, PendingIntent pendingIntent) {
        alarmManager.setExact(i10, j3, pendingIntent);
    }
}
