package ru.yandex.video.m3.player.impl.bandwidth;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.lowlatency.InitialBandwidthValueProvider;
import ru.yandex.video.m3.player.utils.network.NetworkType;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/player/impl/bandwidth/InitialBandwidthLastValueProvider;", "Lru/yandex/video/m3/player/lowlatency/InitialBandwidthValueProvider;", "fallback", "(Lru/yandex/video/m3/player/lowlatency/InitialBandwidthValueProvider;)V", "getInitialBitrateEstimate", "", "context", "Landroid/content/Context;", "networkType", "Lru/yandex/video/m3/player/utils/network/NetworkType;", "countryCode", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InitialBandwidthLastValueProvider implements InitialBandwidthValueProvider {
    public static final int $stable = 8;
    private final InitialBandwidthValueProvider fallback;

    public /* synthetic */ InitialBandwidthLastValueProvider(InitialBandwidthValueProvider initialBandwidthValueProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? InitialBandwidthValueProviderImpl.INSTANCE : initialBandwidthValueProvider);
    }

    @Override // ru.yandex.video.m3.player.lowlatency.InitialBandwidthValueProvider
    public long getInitialBitrateEstimate(Context context, NetworkType networkType, String countryCode) {
        Long bandwidthEstimate = BandwidthEstimateStorage.INSTANCE.get(context).getBandwidthEstimate(networkType.getNetworkTypeName());
        return bandwidthEstimate != null ? bandwidthEstimate.longValue() : this.fallback.getInitialBitrateEstimate(context, networkType, countryCode);
    }

    public InitialBandwidthLastValueProvider(InitialBandwidthValueProvider initialBandwidthValueProvider) {
        this.fallback = initialBandwidthValueProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InitialBandwidthLastValueProvider() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
