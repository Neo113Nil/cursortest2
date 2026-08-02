package ru.yandex.video.m3.player.impl.utils.battery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import defpackage.h5z0;
import defpackage.sls;
import defpackage.zy11;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.a;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.video.m3.player.impl.utils.WeakObserverDispatcher;
import ru.yandex.video.m3.player.utils.battery.BatteryState;
import ru.yandex.video.m3.player.utils.battery.BatteryStateListener;
import ru.yandex.video.m3.player.utils.battery.BatteryStateObserver;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 .2\u00020\u0001:\u0003/.0B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001aR\u001c\u0010\u001d\u001a\n \u001c*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010#R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u00060(R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u00060+R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00061"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/battery/BatteryStateObserverImpl;", "Lru/yandex/video/m3/player/utils/battery/BatteryStateObserver;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lzy11;", "checkIsNeedUnregisterBroadcastReceiver", "()V", "checkIsNeedRegisterBroadcastReceiver", "registerBroadcastReceiver", "unregisterBroadcastReceiver", "Landroid/content/Intent;", "intent", "", "getBatteryPercentage", "(Landroid/content/Intent;)I", "", "isCharging", "(Landroid/content/Intent;)Z", "isPowerSaveMode", "()Z", "updateListeners", "Lru/yandex/video/m3/player/utils/battery/BatteryStateListener;", "listener", "addListener", "(Lru/yandex/video/m3/player/utils/battery/BatteryStateListener;)V", "removeListener", "kotlin.jvm.PlatformType", "applicationContext", "Landroid/content/Context;", "Lru/yandex/video/m3/player/impl/utils/WeakObserverDispatcher;", "observerDispatcher", "Lru/yandex/video/m3/player/impl/utils/WeakObserverDispatcher;", "isBroadcastRegistered", "Z", "isPowerSaverChangeReceiverRegistered", "Lru/yandex/video/m3/player/utils/battery/BatteryState;", "batteryState", "Lru/yandex/video/m3/player/utils/battery/BatteryState;", "Lru/yandex/video/m3/player/impl/utils/battery/BatteryStateObserverImpl$PowerSaverChangeReceiver;", "powerSaverChangeReceiver", "Lru/yandex/video/m3/player/impl/utils/battery/BatteryStateObserverImpl$PowerSaverChangeReceiver;", "Lru/yandex/video/m3/player/impl/utils/battery/BatteryStateObserverImpl$BatteryStateReceiver;", "batteryStateReceiver", "Lru/yandex/video/m3/player/impl/utils/battery/BatteryStateObserverImpl$BatteryStateReceiver;", "Companion", "BatteryStateReceiver", "PowerSaverChangeReceiver", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BatteryStateObserverImpl implements BatteryStateObserver {
    private static final String TAG = "BatteryStateObserver";
    private final Context applicationContext;
    private boolean isBroadcastRegistered;
    private boolean isPowerSaverChangeReceiverRegistered;
    public static final int $stable = 8;
    private final WeakObserverDispatcher<BatteryStateListener> observerDispatcher = new WeakObserverDispatcher<>();
    private BatteryState batteryState = new BatteryState(0, false, false);
    private final PowerSaverChangeReceiver powerSaverChangeReceiver = new PowerSaverChangeReceiver();
    private final BatteryStateReceiver batteryStateReceiver = new BatteryStateReceiver();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/battery/BatteryStateObserverImpl$BatteryStateReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lru/yandex/video/m3/player/impl/utils/battery/BatteryStateObserverImpl;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lzy11;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class BatteryStateReceiver extends BroadcastReceiver {
        public BatteryStateReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            BatteryStateObserverImpl batteryStateObserverImpl = BatteryStateObserverImpl.this;
            batteryStateObserverImpl.batteryState = BatteryState.copy$default(batteryStateObserverImpl.batteryState, BatteryStateObserverImpl.this.getBatteryPercentage(intent), BatteryStateObserverImpl.this.isCharging(intent), false, 4, null);
            BatteryStateObserverImpl.this.updateListeners();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/battery/BatteryStateObserverImpl$PowerSaverChangeReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lru/yandex/video/m3/player/impl/utils/battery/BatteryStateObserverImpl;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lzy11;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class PowerSaverChangeReceiver extends BroadcastReceiver {
        public PowerSaverChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BatteryStateObserverImpl batteryStateObserverImpl = BatteryStateObserverImpl.this;
            batteryStateObserverImpl.batteryState = BatteryState.copy$default(batteryStateObserverImpl.batteryState, 0, false, BatteryStateObserverImpl.this.isPowerSaveMode(), 3, null);
            BatteryStateObserverImpl.this.updateListeners();
        }
    }

    public BatteryStateObserverImpl(Context context) {
        this.applicationContext = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkIsNeedRegisterBroadcastReceiver() {
        if (this.isBroadcastRegistered) {
            return;
        }
        registerBroadcastReceiver();
        this.isBroadcastRegistered = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkIsNeedUnregisterBroadcastReceiver() {
        if (this.observerDispatcher.getObservers().isEmpty() && this.isBroadcastRegistered) {
            unregisterBroadcastReceiver();
            this.isBroadcastRegistered = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getBatteryPercentage(Intent intent) {
        return (int) ((intent.getIntExtra("level", 0) / intent.getIntExtra("scale", 0)) * 100.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCharging(Intent intent) {
        return intent.getIntExtra(ACSPConstants.STATUS, -1) == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPowerSaveMode() {
        return ((PowerManager) this.applicationContext.getSystemService("power")).isPowerSaveMode();
    }

    private final void registerBroadcastReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        this.applicationContext.registerReceiver(this.powerSaverChangeReceiver, intentFilter);
        this.isPowerSaverChangeReceiverRegistered = true;
        Intent registerReceiver = this.applicationContext.registerReceiver(this.batteryStateReceiver, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            this.batteryState = this.batteryState.copy(getBatteryPercentage(registerReceiver), isCharging(registerReceiver), isPowerSaveMode());
            updateListeners();
        }
    }

    private final void unregisterBroadcastReceiver() {
        try {
            if (this.isPowerSaverChangeReceiverRegistered) {
                this.applicationContext.unregisterReceiver(this.powerSaverChangeReceiver);
                this.isPowerSaverChangeReceiverRegistered = false;
            }
        } catch (Exception unused) {
        }
        try {
            this.applicationContext.unregisterReceiver(this.batteryStateReceiver);
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateListeners() {
        HashSet H0;
        Object failure;
        checkIsNeedUnregisterBroadcastReceiver();
        WeakObserverDispatcher<BatteryStateListener> weakObserverDispatcher = this.observerDispatcher;
        synchronized (weakObserverDispatcher.getObservers()) {
            H0 = a.H0(weakObserverDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((BatteryStateListener) it.next()).onBatteryStateChanged(this.batteryState);
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
    }

    @Override // ru.yandex.video.m3.player.utils.battery.BatteryStateObserver
    public void addListener(BatteryStateListener listener) {
        this.observerDispatcher.add(listener, new sls() { // from class: ru.yandex.video.m3.player.impl.utils.battery.BatteryStateObserverImpl$addListener$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m800invoke();
                return zy11.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m800invoke() {
                BatteryStateObserverImpl.this.checkIsNeedRegisterBroadcastReceiver();
            }
        });
    }

    @Override // ru.yandex.video.m3.player.utils.battery.BatteryStateObserver
    public void removeListener(BatteryStateListener listener) {
        this.observerDispatcher.remove(listener, new sls() { // from class: ru.yandex.video.m3.player.impl.utils.battery.BatteryStateObserverImpl$removeListener$1
            {
                super(0);
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m801invoke();
                return zy11.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m801invoke() {
                BatteryStateObserverImpl.this.checkIsNeedUnregisterBroadcastReceiver();
            }
        });
    }
}
