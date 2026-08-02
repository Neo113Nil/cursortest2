package ru.yandex.yx_platform_api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import defpackage.e2a1;
import defpackage.i3y;
import defpackage.jl40;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/yandex/yx_platform_api/PowerSaveModeChangesReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "context", "Landroid/content/Intent;", "intent", "Lzy11;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "", "isPowerSaveMode", "onPowerSaveModeChanged", "(Z)V", "Landroid/os/PowerManager;", "powerManager$delegate", "Li3y;", "getPowerManager", "()Landroid/os/PowerManager;", "powerManager", "wasPowerSaveMode", "Ljava/lang/Boolean;", "yx_platform_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
abstract class PowerSaveModeChangesReceiver extends BroadcastReceiver {

    /* renamed from: powerManager$delegate, reason: from kotlin metadata */
    private final i3y powerManager;
    private Boolean wasPowerSaveMode;

    public PowerSaveModeChangesReceiver(Context context) {
        this.powerManager = kotlin.a.b(LazyThreadSafetyMode.NONE, new b(context, 1));
    }

    private final PowerManager getPowerManager() {
        return (PowerManager) this.powerManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PowerManager powerManager_delegate$lambda$0(Context context) {
        return (PowerManager) context.getSystemService("power");
    }

    public abstract void onPowerSaveModeChanged(boolean isPowerSaveMode);

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            boolean z = false;
            if (hashCode != -753900996) {
                if (hashCode != 305385558) {
                    if (hashCode != 1779291251 || !action.equals("android.os.action.POWER_SAVE_MODE_CHANGED")) {
                        return;
                    } else {
                        z = getPowerManager().isPowerSaveMode();
                    }
                } else {
                    if (!action.equals("huawei.intent.action.POWER_MODE_CHANGED_ACTION")) {
                        return;
                    }
                    if (!intent.hasExtra(ClidProvider.STATE)) {
                        z = e2a1.d(context, getPowerManager());
                    } else if (intent.getIntExtra(ClidProvider.STATE, 0) == 1) {
                        z = true;
                    }
                }
            } else if (!action.equals("miui.intent.action.POWER_SAVE_MODE_CHANGED")) {
                return;
            } else {
                z = intent.hasExtra("POWER_SAVE_MODE_OPEN") ? intent.getBooleanExtra("POWER_SAVE_MODE_OPEN", false) : e2a1.d(context, getPowerManager());
            }
            if (jl40.l(this.wasPowerSaveMode, Boolean.valueOf(z))) {
                return;
            }
            this.wasPowerSaveMode = Boolean.valueOf(z);
            onPowerSaveModeChanged(z);
        }
    }
}
