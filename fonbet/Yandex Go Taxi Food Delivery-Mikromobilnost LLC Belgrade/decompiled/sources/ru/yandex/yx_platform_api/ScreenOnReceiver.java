package ru.yandex.yx_platform_api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.jl40;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\"\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/yx_platform_api/ScreenOnReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lzy11;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "", ClidProvider.STATE, "onStateChanged", "(Z)V", "Ljava/lang/Boolean;", "yx_platform_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
abstract class ScreenOnReceiver extends BroadcastReceiver {
    private Boolean state;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        boolean z;
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -2128145023) {
                if (hashCode != -1454123155 || !action.equals("android.intent.action.SCREEN_ON")) {
                    return;
                } else {
                    z = true;
                }
            } else if (!action.equals("android.intent.action.SCREEN_OFF")) {
                return;
            } else {
                z = false;
            }
            if (jl40.l(this.state, Boolean.valueOf(z))) {
                return;
            }
            this.state = Boolean.valueOf(z);
            onStateChanged(z);
        }
    }

    public abstract void onStateChanged(boolean state);
}
