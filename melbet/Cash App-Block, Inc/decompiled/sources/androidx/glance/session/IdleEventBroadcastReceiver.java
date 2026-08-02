package androidx.glance.session;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import com.squareup.workflow1.ui.ViewRegistryKt$buildView$1$2$1$1;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes3.dex */
public final class IdleEventBroadcastReceiver extends BroadcastReceiver {
    public static final List events;
    public static final IntentFilter filter;
    public final ViewRegistryKt$buildView$1$2$1$1 onIdle;

    static {
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED", "android.os.action.LOW_POWER_STANDBY_ENABLED_CHANGED"});
        events = listOf;
        IntentFilter intentFilter = new IntentFilter();
        Iterator it = listOf.iterator();
        while (it.hasNext()) {
            intentFilter.addAction((String) it.next());
        }
        filter = intentFilter;
    }

    public IdleEventBroadcastReceiver(ViewRegistryKt$buildView$1$2$1$1 viewRegistryKt$buildView$1$2$1$1) {
        this.onIdle = viewRegistryKt$buildView$1$2$1$1;
    }

    public final void checkIdleStatus$glance_release(Context context) {
        Object systemService = context.getSystemService("power");
        systemService.getClass();
        PowerManager powerManager = (PowerManager) systemService;
        boolean isIdle = Api23Impl.INSTANCE.isIdle(powerManager);
        if (Build.VERSION.SDK_INT >= 33) {
            isIdle = isIdle || Api33Impl.INSTANCE.isLightIdleOrLowPowerStandby(powerManager);
        }
        if (isIdle) {
            this.onIdle.invoke();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (CollectionsKt.contains(events, intent.getAction())) {
            checkIdleStatus$glance_release(context);
        }
    }
}
