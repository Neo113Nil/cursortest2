package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import ru.yandex.yx_platform_api.NetCapabilityValidatedHandler$onListen$1;

/* loaded from: classes7.dex */
public final class wn50 implements zeo {
    public final ConnectivityManager a;
    public NetCapabilityValidatedHandler$onListen$1 b;
    public final Handler c = new Handler(Looper.getMainLooper());

    public wn50(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    @Override // defpackage.zeo
    public final void onCancel(Object obj) {
        NetCapabilityValidatedHandler$onListen$1 netCapabilityValidatedHandler$onListen$1 = this.b;
        if (netCapabilityValidatedHandler$onListen$1 != null) {
            this.a.unregisterNetworkCallback(netCapabilityValidatedHandler$onListen$1);
        }
    }

    @Override // defpackage.zeo
    public final void onListen(Object obj, xeo xeoVar) {
        NetworkRequest build = new NetworkRequest.Builder().addCapability(16).build();
        NetCapabilityValidatedHandler$onListen$1 netCapabilityValidatedHandler$onListen$1 = new NetCapabilityValidatedHandler$onListen$1(this, xeoVar);
        this.b = netCapabilityValidatedHandler$onListen$1;
        this.a.registerNetworkCallback(build, netCapabilityValidatedHandler$onListen$1);
    }
}
