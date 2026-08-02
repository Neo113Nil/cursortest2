package ru.yandex.yx_platform_api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.Looper;
import defpackage.r7v;
import defpackage.usw;
import defpackage.vsw;
import defpackage.xeo;
import defpackage.zeo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001(B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0010\u001a\u00020\u000f2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lru/yandex/yx_platform_api/InternetConnectionStreamHandler;", "Landroid/content/BroadcastReceiver;", "Lzeo;", "Landroid/content/Context;", "context", "Lusw;", "internetConnectionManager", "Landroid/net/ConnectivityManager;", "connectivityManager", "<init>", "(Landroid/content/Context;Lusw;Landroid/net/ConnectivityManager;)V", "", "", "", PolicyMappingsExtension.MAP, "Lzy11;", "sendEvent", "(Ljava/util/Map;)V", "arguments", "Lxeo;", "events", "onListen", "(Ljava/lang/Object;Lxeo;)V", "onCancel", "(Ljava/lang/Object;)V", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Landroid/content/Context;", "Lusw;", "Landroid/net/ConnectivityManager;", "Lxeo;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "Landroid/net/ConnectivityManager$NetworkCallback;", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "Companion", "vsw", "yx_platform_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InternetConnectionStreamHandler extends BroadcastReceiver implements zeo {
    public static final String CONNECTIVITY_ACTION = "android.net.conn.CONNECTIVITY_CHANGE";
    public static final vsw Companion = new vsw();
    private final ConnectivityManager connectivityManager;
    private final Context context;
    private xeo events;
    private final usw internetConnectionManager;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private ConnectivityManager.NetworkCallback networkCallback;

    public InternetConnectionStreamHandler(Context context, usw uswVar, ConnectivityManager connectivityManager) {
        this.context = context;
        this.internetConnectionManager = uswVar;
        this.connectivityManager = connectivityManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendEvent(Map<String, ? extends Object> map) {
        xeo xeoVar = this.events;
        if (xeoVar != null) {
            this.mainHandler.post(new r7v(9, xeoVar, map));
        }
    }

    @Override // defpackage.zeo
    public void onCancel(Object arguments) {
        ConnectivityManager.NetworkCallback networkCallback = this.networkCallback;
        if (networkCallback != null) {
            this.connectivityManager.unregisterNetworkCallback(networkCallback);
            this.networkCallback = null;
        }
    }

    @Override // defpackage.zeo
    public void onListen(Object arguments, xeo events) {
        this.events = events;
        ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: ru.yandex.yx_platform_api.InternetConnectionStreamHandler$onListen$networkCallback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                usw uswVar;
                InternetConnectionStreamHandler internetConnectionStreamHandler = InternetConnectionStreamHandler.this;
                uswVar = internetConnectionStreamHandler.internetConnectionManager;
                internetConnectionStreamHandler.sendEvent(uswVar.a(null));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                usw uswVar;
                InternetConnectionStreamHandler internetConnectionStreamHandler = InternetConnectionStreamHandler.this;
                uswVar = internetConnectionStreamHandler.internetConnectionManager;
                internetConnectionStreamHandler.sendEvent(uswVar.a(networkCapabilities));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                InternetConnectionStreamHandler.this.sendEvent(kotlin.collections.b.i(new Pair("type", JCP.RAW_PREFIX), new Pair("network_reachable", "UNREACHABLE")));
            }
        };
        this.connectivityManager.registerDefaultNetworkCallback(networkCallback);
        this.networkCallback = networkCallback;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        xeo xeoVar = this.events;
        if (xeoVar != null) {
            xeoVar.success(this.internetConnectionManager.a(null));
        }
    }
}
