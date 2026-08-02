package ru.yandex.video.m3.ott.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import defpackage.i3y;
import defpackage.sls;
import defpackage.th91;
import kotlin.Metadata;
import kotlin.a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/ott/impl/ConnectionChecker;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "isConnected", "()Z", "Landroid/content/Context;", "Landroid/net/ConnectivityManager;", "connectivityManager$delegate", "Li3y;", "getConnectivityManager", "()Landroid/net/ConnectivityManager;", "connectivityManager", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ConnectionChecker {
    public static final int $stable = 8;

    /* renamed from: connectivityManager$delegate, reason: from kotlin metadata */
    private final i3y connectivityManager = a.a(new sls() { // from class: ru.yandex.video.m3.ott.impl.ConnectionChecker$connectivityManager$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final ConnectivityManager invoke() {
            Context context;
            context = ConnectionChecker.this.context;
            return (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        }
    });
    private final Context context;

    public ConnectionChecker(Context context) {
        this.context = context;
    }

    private final ConnectivityManager getConnectivityManager() {
        return (ConnectivityManager) this.connectivityManager.getValue();
    }

    public final boolean isConnected() {
        NetworkInfo activeNetworkInfo;
        Integer valueOf = Integer.valueOf(th91.e(this.context, "android.permission.ACCESS_NETWORK_STATE"));
        if (valueOf.intValue() != 0) {
            valueOf = null;
        }
        if (valueOf == null || (activeNetworkInfo = getConnectivityManager().getActiveNetworkInfo()) == null) {
            return false;
        }
        return activeNetworkInfo.isConnected();
    }
}
