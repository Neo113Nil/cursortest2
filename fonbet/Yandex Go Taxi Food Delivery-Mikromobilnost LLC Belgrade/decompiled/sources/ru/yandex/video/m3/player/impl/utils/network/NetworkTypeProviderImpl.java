package ru.yandex.video.m3.player.impl.utils.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import defpackage.bvf0;
import defpackage.cvw;
import defpackage.h5z0;
import defpackage.jl40;
import defpackage.ljo;
import defpackage.lse;
import defpackage.mdh;
import defpackage.mse;
import defpackage.qhw0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.zy11;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.a;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.utils.network.NetworkChangeListener;
import ru.yandex.video.m3.player.utils.network.NetworkType;
import ru.yandex.video.m3.player.utils.network.NetworkTypeProvider;
import ru.yandex.yx_platform_api.InternetConnectionStreamHandler;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 %2\u00020\u0001:\u0002%&B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0018\u0010\u0010J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u001bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u00060 R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/network/NetworkTypeProviderImpl;", "Lru/yandex/video/m3/player/utils/network/NetworkTypeProvider;", "Landroid/content/Context;", "context", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/utils/network/NetworkChangeListener;", "observerDispatcher", "Ltse;", "networkInfoScope", "<init>", "(Landroid/content/Context;Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;Ltse;)V", "Lzy11;", "handleOnReceive", "(Landroid/content/Context;)V", "Lru/yandex/video/m3/player/utils/network/NetworkType;", "getCurrentNetworkType", "(Landroid/content/Context;)Lru/yandex/video/m3/player/utils/network/NetworkType;", "getNetworkTypeFromConnectivityManager", "Landroid/net/NetworkInfo;", "networkInfo", "getMobileNetworkType", "(Landroid/net/NetworkInfo;)Lru/yandex/video/m3/player/utils/network/NetworkType;", "getNetworkType", "()Lru/yandex/video/m3/player/utils/network/NetworkType;", "getForceNetworkType", "networkChangeListener", "addListener", "(Lru/yandex/video/m3/player/utils/network/NetworkChangeListener;)V", "removeListener", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "networkInfoScope$1", "Ltse;", "Lru/yandex/video/m3/player/impl/utils/network/NetworkTypeProviderImpl$Receiver;", "broadcastReceiver", "Lru/yandex/video/m3/player/impl/utils/network/NetworkTypeProviderImpl$Receiver;", "internalNetworkType", "Lru/yandex/video/m3/player/utils/network/NetworkType;", "Companion", "Receiver", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NetworkTypeProviderImpl implements NetworkTypeProvider {
    private static final long MS_WAIT_NETWORK_INFO = 50;
    private static final String TAG = "YP:NetworkTypeProvider";
    private static final mse coroutineExceptionHandler;
    private static final tse networkInfoScope;
    private static volatile NetworkTypeProviderImpl staticInstance;
    private final Receiver broadcastReceiver;
    private volatile NetworkType internalNetworkType;

    /* renamed from: networkInfoScope$1, reason: from kotlin metadata */
    private final tse networkInfoScope;
    private final ObserverDispatcher<NetworkChangeListener> observerDispatcher;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/network/NetworkTypeProviderImpl$Receiver;", "Landroid/content/BroadcastReceiver;", "<init>", "(Lru/yandex/video/m3/player/impl/utils/network/NetworkTypeProviderImpl;)V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lzy11;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Receiver extends BroadcastReceiver {
        public Receiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast() || NetworkTypeProviderImpl.this.internalNetworkType == null) {
                tje.N(NetworkTypeProviderImpl.this.networkInfoScope, null, null, new NetworkTypeProviderImpl$Receiver$onReceive$1(NetworkTypeProviderImpl.this, context, null), 3);
            }
        }
    }

    static {
        NetworkTypeProviderImpl$special$$inlined$CoroutineExceptionHandler$1 networkTypeProviderImpl$special$$inlined$CoroutineExceptionHandler$1 = new NetworkTypeProviderImpl$special$$inlined$CoroutineExceptionHandler$1(lse.a);
        coroutineExceptionHandler = networkTypeProviderImpl$special$$inlined$CoroutineExceptionHandler$1;
        qhw0 a = jl40.a();
        sjh sjhVar = uyj.a;
        networkInfoScope = bvf0.a(cvw.U(a, mdh.b).plus(networkTypeProviderImpl$special$$inlined$CoroutineExceptionHandler$1));
    }

    private NetworkTypeProviderImpl(Context context, ObserverDispatcher<NetworkChangeListener> observerDispatcher, tse tseVar) {
        this.observerDispatcher = observerDispatcher;
        this.networkInfoScope = tseVar;
        Receiver receiver = new Receiver();
        this.broadcastReceiver = receiver;
        context.registerReceiver(receiver, new IntentFilter(InternetConnectionStreamHandler.CONNECTIVITY_ACTION));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NetworkType getCurrentNetworkType(Context context) {
        Object failure;
        try {
            failure = getNetworkTypeFromConnectivityManager(context);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            ljo.b(a);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        NetworkType networkType = (NetworkType) failure;
        return networkType == null ? NetworkType.NETWORK_TYPE_UNKNOWN : networkType;
    }

    private final NetworkType getMobileNetworkType(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 0:
            case 16:
                return NetworkType.NETWORK_TYPE_CELLULAR_UNKNOWN;
            case 1:
            case 2:
                return NetworkType.NETWORK_TYPE_2G;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return NetworkType.NETWORK_TYPE_3G;
            case 13:
                return NetworkType.NETWORK_TYPE_4G;
            case 18:
                return NetworkType.NETWORK_TYPE_WIFI;
            case 19:
            default:
                return NetworkType.NETWORK_TYPE_CELLULAR_UNKNOWN;
            case 20:
                return NetworkType.NETWORK_TYPE_5G_SA;
        }
    }

    private final NetworkType getNetworkTypeFromConnectivityManager(Context context) {
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            return NetworkType.NETWORK_TYPE_UNKNOWN;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return NetworkType.NETWORK_TYPE_UNKNOWN;
            }
            if (!activeNetworkInfo.isConnected()) {
                return NetworkType.NETWORK_TYPE_OFFLINE;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    return NetworkType.NETWORK_TYPE_WIFI;
                }
                if (type != 4 && type != 5) {
                    return type != 6 ? type != 9 ? NetworkType.NETWORK_TYPE_OTHER : NetworkType.NETWORK_TYPE_ETHERNET : NetworkType.NETWORK_TYPE_4G;
                }
            }
            return getMobileNetworkType(activeNetworkInfo);
        } catch (SecurityException unused) {
            return NetworkType.NETWORK_TYPE_UNKNOWN;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleOnReceive(Context context) {
        this.internalNetworkType = getCurrentNetworkType(context);
    }

    @Override // ru.yandex.video.m3.player.utils.network.NetworkTypeProvider
    public void addListener(NetworkChangeListener networkChangeListener) {
        HashSet H0;
        Object failure;
        this.observerDispatcher.add((ObserverDispatcher<NetworkChangeListener>) networkChangeListener);
        ObserverDispatcher<NetworkChangeListener> observerDispatcher = this.observerDispatcher;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((NetworkChangeListener) it.next()).onNetworkChanged(getNetworkType());
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.f(a, "notifyObservers", new Object[0]);
            }
        }
    }

    @Override // ru.yandex.video.m3.player.utils.network.NetworkTypeProvider
    public NetworkType getForceNetworkType(Context context) {
        NetworkType networkType = this.internalNetworkType;
        if (networkType != null) {
            return networkType;
        }
        return (NetworkType) tje.Y(EmptyCoroutineContext.a, new NetworkTypeProviderImpl$getForceNetworkType$1(this, context, null));
    }

    @Override // ru.yandex.video.m3.player.utils.network.NetworkTypeProvider
    public NetworkType getNetworkType() {
        NetworkType networkType = this.internalNetworkType;
        return networkType == null ? NetworkType.NETWORK_TYPE_UNKNOWN : networkType;
    }

    @Override // ru.yandex.video.m3.player.utils.network.NetworkTypeProvider
    public void removeListener(NetworkChangeListener networkChangeListener) {
        this.observerDispatcher.remove(networkChangeListener);
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/network/NetworkTypeProviderImpl$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lru/yandex/video/m3/player/utils/network/NetworkTypeProvider;", "getInstance", "(Landroid/content/Context;)Lru/yandex/video/m3/player/utils/network/NetworkTypeProvider;", "", "MS_WAIT_NETWORK_INFO", "J", "", "TAG", "Ljava/lang/String;", "Lmse;", "coroutineExceptionHandler", "Lmse;", "Ltse;", "networkInfoScope", "Ltse;", "Lru/yandex/video/m3/player/impl/utils/network/NetworkTypeProviderImpl;", "staticInstance", "Lru/yandex/video/m3/player/impl/utils/network/NetworkTypeProviderImpl;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NetworkTypeProvider getInstance(Context context) {
            NetworkTypeProviderImpl networkTypeProviderImpl;
            NetworkTypeProviderImpl networkTypeProviderImpl2 = NetworkTypeProviderImpl.staticInstance;
            if (networkTypeProviderImpl2 != null) {
                return networkTypeProviderImpl2;
            }
            synchronized (this) {
                networkTypeProviderImpl = NetworkTypeProviderImpl.staticInstance;
                if (networkTypeProviderImpl == null) {
                    NetworkTypeProviderImpl networkTypeProviderImpl3 = new NetworkTypeProviderImpl(context.getApplicationContext(), null, NetworkTypeProviderImpl.networkInfoScope, 2, null);
                    NetworkTypeProviderImpl.staticInstance = networkTypeProviderImpl3;
                    networkTypeProviderImpl = networkTypeProviderImpl3;
                }
            }
            return networkTypeProviderImpl;
        }

        private Companion() {
        }
    }

    public /* synthetic */ NetworkTypeProviderImpl(Context context, ObserverDispatcher observerDispatcher, tse tseVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ObserverDispatcher() : observerDispatcher, tseVar);
    }
}
