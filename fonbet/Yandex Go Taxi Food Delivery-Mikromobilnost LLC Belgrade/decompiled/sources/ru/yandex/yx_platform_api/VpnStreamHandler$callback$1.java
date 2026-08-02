package ru.yandex.yx_platform_api;

import android.net.ConnectivityManager;
import android.net.Network;
import defpackage.e041;
import defpackage.f041;
import defpackage.gw00;
import defpackage.yeo;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"ru/yandex/yx_platform_api/VpnStreamHandler$callback$1", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "Lzy11;", "onAvailable", "(Landroid/net/Network;)V", "onLost", "yx_platform_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VpnStreamHandler$callback$1 extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ f041 this$0;

    public VpnStreamHandler$callback$1(f041 f041Var) {
        this.this$0 = f041Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAvailable$lambda$0(f041 f041Var) {
        yeo yeoVar = f041Var.b;
        if (yeoVar != null) {
            yeoVar.success(gw00.e(new Pair("isVpnEnabled", Boolean.TRUE)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLost$lambda$1(f041 f041Var) {
        yeo yeoVar = f041Var.b;
        if (yeoVar != null) {
            yeoVar.success(gw00.e(new Pair("isVpnEnabled", Boolean.FALSE)));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        f041 f041Var = this.this$0;
        f041Var.c.post(new e041(f041Var, 0));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        f041 f041Var = this.this$0;
        f041Var.c.post(new e041(f041Var, 1));
    }
}
