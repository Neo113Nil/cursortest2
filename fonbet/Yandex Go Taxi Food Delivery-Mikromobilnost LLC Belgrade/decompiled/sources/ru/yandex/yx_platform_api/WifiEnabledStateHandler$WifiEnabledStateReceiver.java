package ru.yandex.yx_platform_api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.jl40;
import defpackage.luw;
import defpackage.s551;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0010"}, d2 = {"ru/yandex/yx_platform_api/WifiEnabledStateHandler$WifiEnabledStateReceiver", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lzy11;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Ls551;", "listener", "setWifiStateChangedListener", "(Ls551;)V", "Ls551;", "yx_platform_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
final class WifiEnabledStateHandler$WifiEnabledStateReceiver extends BroadcastReceiver {
    private s551 listener;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (jl40.l(intent.getAction(), "android.net.wifi.WIFI_STATE_CHANGED")) {
            int intExtra = intent.getIntExtra("wifi_state", 4);
            s551 s551Var = this.listener;
            if (s551Var != null) {
                ((luw) s551Var).a.success(Integer.valueOf(intExtra));
            }
        }
    }

    public final void setWifiStateChangedListener(s551 listener) {
        this.listener = listener;
    }
}
