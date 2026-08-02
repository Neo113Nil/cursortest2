package ru.yandex.taxi.battery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.jl40;
import defpackage.quz;
import defpackage.zf5;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/battery/BatteryReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Lzf5;", "batteryReceiverListener", "Lzy11;", "setBatteryReceiverListener", "(Lzf5;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lzf5;", "utils"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BatteryReceiver extends BroadcastReceiver {
    private zf5 batteryReceiverListener = new quz(19);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void batteryReceiverListener$lambda$0(int i) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (jl40.l(intent.getAction(), "android.intent.action.BATTERY_CHANGED")) {
            int intExtra = intent.getIntExtra("level", 0);
            int intExtra2 = intent.getIntExtra("scale", 0);
            zf5 zf5Var = this.batteryReceiverListener;
            if (intExtra2 != 0) {
                intExtra = (intExtra * 100) / intExtra2;
            }
            zf5Var.a(intExtra);
        }
    }

    public final void setBatteryReceiverListener(zf5 batteryReceiverListener) {
        this.batteryReceiverListener = batteryReceiverListener;
    }
}
