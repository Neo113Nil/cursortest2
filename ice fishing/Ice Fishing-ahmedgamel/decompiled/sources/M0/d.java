package M0;

import J0.r;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* loaded from: classes.dex */
public abstract class d extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1818a = r.f("ConstraintProxy");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        r.d().a(f1818a, "onReceive : " + intent);
        String str = c.f1813x;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
