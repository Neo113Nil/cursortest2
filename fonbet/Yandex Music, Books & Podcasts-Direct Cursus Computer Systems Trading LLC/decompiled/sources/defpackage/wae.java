package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class wae extends BroadcastReceiver {
    public static final List b;
    public static final IntentFilter c;
    public final ssb a;

    static {
        List h = u75.h("android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED", "android.os.action.LOW_POWER_STANDBY_ENABLED_CHANGED");
        b = h;
        IntentFilter intentFilter = new IntentFilter();
        Iterator it = h.iterator();
        while (it.hasNext()) {
            intentFilter.addAction((String) it.next());
        }
        c = intentFilter;
    }

    public wae(ssb ssbVar) {
        this.a = ssbVar;
    }

    public final void a(Context context) {
        Object systemService = context.getSystemService("power");
        systemService.getClass();
        PowerManager powerManager = (PowerManager) systemService;
        boolean a = ho0.a.a(powerManager);
        if (Build.VERSION.SDK_INT >= 33) {
            a = a || mo0.a.a(powerManager);
        }
        if (a) {
            this.a.invoke();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (CollectionsKt.I(b, intent.getAction())) {
            a(context);
        }
    }
}
