package ru.yandex.video.m3.player.impl.bandwidth;

import android.content.Context;
import android.os.Handler;
import defpackage.h5z0;
import defpackage.hp4;
import defpackage.ip4;
import defpackage.zy11;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.a;
import ru.yandex.video.m3.player.PlayerDelegate;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.impl.utils.network.NetworkTypeProviderImpl;
import ru.yandex.video.m3.player.utils.network.NetworkChangeListener;
import ru.yandex.video.m3.player.utils.network.NetworkType;
import ru.yandex.video.m3.player.utils.network.NetworkTypeProvider;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u000bJ\u001b\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001b\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010#\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00152\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\u0016\u0010+\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/yandex/video/m3/player/impl/bandwidth/BandwidthEstimateObserver;", "Lhp4;", "Lru/yandex/video/m3/player/utils/network/NetworkChangeListener;", "Landroid/content/Context;", "context", "Lru/yandex/video/m3/player/utils/network/NetworkTypeProvider;", "networkTypeProvider", "Lru/yandex/video/m3/player/impl/bandwidth/BandwidthEstimateStorage;", "bandwidthStorage", "<init>", "(Landroid/content/Context;Lru/yandex/video/m3/player/utils/network/NetworkTypeProvider;Lru/yandex/video/m3/player/impl/bandwidth/BandwidthEstimateStorage;)V", "(Landroid/content/Context;)V", "", "", "", "getInitialBandwidthEstimates", "()Ljava/util/Map;", "Landroid/os/Handler;", "handler", "Lip4;", "bandwidthMeter", "Lzy11;", "start", "(Landroid/os/Handler;Lip4;)V", "Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;", "Lru/yandex/video/m3/player/PlayerDelegate$Observer;", "observerDispatcher", "onPrepare", "(Lru/yandex/video/m3/player/impl/utils/ObserverDispatcher;)V", "stop", "(Lip4;)V", "", "elapsedMs", "bytesTransferred", "bitrateEstimate", "onBandwidthSample", "(IJJ)V", "Lru/yandex/video/m3/player/utils/network/NetworkType;", "networkType", "onNetworkChanged", "(Lru/yandex/video/m3/player/utils/network/NetworkType;)V", "Lru/yandex/video/m3/player/utils/network/NetworkTypeProvider;", "Lru/yandex/video/m3/player/impl/bandwidth/BandwidthEstimateStorage;", "currentNetworkTypeName", "Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BandwidthEstimateObserver implements hp4, NetworkChangeListener {
    public static final int $stable = 8;
    private final BandwidthEstimateStorage bandwidthStorage;
    private String currentNetworkTypeName;
    private final NetworkTypeProvider networkTypeProvider;

    public BandwidthEstimateObserver(Context context, NetworkTypeProvider networkTypeProvider, BandwidthEstimateStorage bandwidthEstimateStorage) {
        this.networkTypeProvider = networkTypeProvider;
        this.bandwidthStorage = bandwidthEstimateStorage;
        this.currentNetworkTypeName = networkTypeProvider.getForceNetworkType(context).getNetworkTypeName();
    }

    private final Map<String, Long> getInitialBandwidthEstimates() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (NetworkType networkType : NetworkType.values()) {
            String networkTypeName = networkType.getNetworkTypeName();
            Long bandwidthEstimate = this.bandwidthStorage.getBandwidthEstimate(networkTypeName);
            if (bandwidthEstimate != null) {
                linkedHashMap.put(networkTypeName, bandwidthEstimate);
            }
        }
        return linkedHashMap;
    }

    @Override // defpackage.hp4
    public void onBandwidthSample(int elapsedMs, long bytesTransferred, long bitrateEstimate) {
        this.bandwidthStorage.setBandwidthEstimate(this.currentNetworkTypeName, bitrateEstimate);
    }

    @Override // ru.yandex.video.m3.player.utils.network.NetworkChangeListener
    public void onNetworkChanged(NetworkType networkType) {
        this.currentNetworkTypeName = networkType.getNetworkTypeName();
    }

    public final void onPrepare(ObserverDispatcher<PlayerDelegate.Observer> observerDispatcher) {
        HashSet H0;
        Object failure;
        synchronized (observerDispatcher.getObservers()) {
            H0 = a.H0(observerDispatcher.getObservers());
        }
        Iterator it = H0.iterator();
        while (it.hasNext()) {
            try {
                ((PlayerDelegate.Observer) it.next()).onInitialBandwidthEstimatesAcquired(getInitialBandwidthEstimates());
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

    public final void start(Handler handler, ip4 bandwidthMeter) {
        this.networkTypeProvider.addListener(this);
        bandwidthMeter.addEventListener(handler, this);
    }

    public final void stop(ip4 bandwidthMeter) {
        bandwidthMeter.removeEventListener(this);
        this.networkTypeProvider.removeListener(this);
    }

    public BandwidthEstimateObserver(Context context) {
        this(context, NetworkTypeProviderImpl.INSTANCE.getInstance(context), BandwidthEstimateStorage.INSTANCE.get(context));
    }
}
