package ru.yandex.yx_platform_api;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import defpackage.dm2;
import defpackage.sd30;
import defpackage.wn50;
import defpackage.xeo;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"ru/yandex/yx_platform_api/NetCapabilityValidatedHandler$onListen$1", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "Lzy11;", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "onLost", "(Landroid/net/Network;)V", "onUnavailable", "()V", "yx_platform_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NetCapabilityValidatedHandler$onListen$1 extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ xeo $events;
    final /* synthetic */ wn50 this$0;

    public NetCapabilityValidatedHandler$onListen$1(wn50 wn50Var, xeo xeoVar) {
        this.this$0 = wn50Var;
        this.$events = xeoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCapabilitiesChanged$lambda$0(NetworkCapabilities networkCapabilities, xeo xeoVar) {
        xeoVar.success(Boolean.valueOf(networkCapabilities.hasCapability(16)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLost$lambda$1(xeo xeoVar) {
        xeoVar.success(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onUnavailable$lambda$2(xeo xeoVar) {
        xeoVar.success(Boolean.FALSE);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        this.this$0.c.post(new sd30(5, networkCapabilities, this.$events));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        this.this$0.c.post(new dm2(this.$events, 2));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        this.this$0.c.post(new dm2(this.$events, 1));
    }
}
