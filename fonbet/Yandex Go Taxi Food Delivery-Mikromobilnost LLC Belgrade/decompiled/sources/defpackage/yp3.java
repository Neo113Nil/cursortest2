package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import ru.yandex.yx_platform_api.AutoConnectionDetector$CarConnectionBroadcastReceiver;

/* loaded from: classes7.dex */
public final class yp3 implements zeo, xp3 {
    public yeo a;
    public tp3 b;

    @Override // defpackage.zeo
    public final void onCancel(Object obj) {
        tp3 tp3Var = this.b;
        tp3Var.c.removeListener(this);
        tp3Var.a.unregisterReceiver(tp3Var.b);
        this.a = null;
    }

    @Override // defpackage.zeo
    public final void onListen(Object obj, xeo xeoVar) {
        tp3 tp3Var = this.b;
        AutoConnectionDetector$CarConnectionBroadcastReceiver autoConnectionDetector$CarConnectionBroadcastReceiver = tp3Var.b;
        tp3Var.c.addListener(this);
        int i = Build.VERSION.SDK_INT;
        Context context = tp3Var.a;
        if (i >= 33) {
            context.registerReceiver(autoConnectionDetector$CarConnectionBroadcastReceiver, new IntentFilter("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED"), 4);
        } else {
            context.registerReceiver(autoConnectionDetector$CarConnectionBroadcastReceiver, new IntentFilter("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED"));
        }
        tp3Var.c.startQuery(42, null, tp3.d, new String[]{"CarConnectionState"}, null, null, null);
        this.a = (yeo) xeoVar;
    }
}
