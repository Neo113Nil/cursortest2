package ru.yandex.video.m3.player.lowlatency;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import ru.yandex.video.m3.player.utils.network.NetworkType;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/lowlatency/InitialBandwidthValueProvider;", "", "getInitialBitrateEstimate", "", "context", "Landroid/content/Context;", "networkType", "Lru/yandex/video/m3/player/utils/network/NetworkType;", "countryCode", "", "getInitialBitrateEstimates", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface InitialBandwidthValueProvider {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static Map<NetworkType, Long> getInitialBitrateEstimates(InitialBandwidthValueProvider initialBandwidthValueProvider, Context context, String str) {
            return InitialBandwidthValueProvider.super.getInitialBitrateEstimates(context, str);
        }
    }

    long getInitialBitrateEstimate(Context context, NetworkType networkType, String countryCode);

    default Map<NetworkType, Long> getInitialBitrateEstimates(Context context, String countryCode) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (NetworkType networkType : NetworkType.values()) {
            linkedHashMap.put(networkType, Long.valueOf(getInitialBitrateEstimate(context, networkType, countryCode)));
        }
        return linkedHashMap;
    }
}
