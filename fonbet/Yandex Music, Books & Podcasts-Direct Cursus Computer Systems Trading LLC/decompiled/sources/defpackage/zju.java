package defpackage;

import android.content.IntentFilter;
import android.os.Build;
import ru.yandex.music.YMApplication;

/* loaded from: classes4.dex */
public final class zju {
    public final kz3 a;
    public final xdr b;
    public final xdr c;

    public zju(kz3 kz3Var) {
        this.a = kz3Var;
        xdr a = ydr.a(Boolean.FALSE);
        this.b = a;
        this.c = a;
    }

    public final void a(YMApplication yMApplication) {
        l83 l83Var = new l83(22, this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ru.yandex.music.VPN_CHALLENGE_SHOWN");
        intentFilter.addAction("ru.yandex.music.VPN_CHALLENGE_HIDDEN");
        intentFilter.addAction("ru.yandex.music.VPN_CHALLENGE_OFFLINE_MODE");
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                yMApplication.registerReceiver(l83Var, intentFilter, 2);
            } else {
                yMApplication.registerReceiver(l83Var, intentFilter);
            }
        } catch (IllegalStateException e) {
            ssg.a(4, "VpnGateStateListener", "Failed to register VpnGateStateListener: " + e, null);
        } catch (SecurityException e2) {
            ssg.a(4, "VpnGateStateListener", "Failed to register VpnGateStateListener: " + e2, null);
        }
    }
}
