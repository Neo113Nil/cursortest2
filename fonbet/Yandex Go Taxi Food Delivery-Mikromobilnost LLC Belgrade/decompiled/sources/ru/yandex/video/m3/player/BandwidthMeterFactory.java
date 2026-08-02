package ru.yandex.video.m3.player;

import android.content.Context;
import defpackage.ip4;
import defpackage.tw21;
import defpackage.v6h;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import ru.yandex.video.m3.player.lowlatency.InitialBandwidthValueProvider;
import ru.yandex.video.m3.player.utils.network.NetworkType;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\t\u0010\r¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/BandwidthMeterFactory;", "", "Lru/yandex/video/m3/player/utils/network/NetworkType;", "", "toExoNetworkType", "(Lru/yandex/video/m3/player/utils/network/NetworkType;)I", "Landroid/content/Context;", "context", "Lip4;", "create", "(Landroid/content/Context;)Lip4;", "Lru/yandex/video/m3/player/lowlatency/InitialBandwidthValueProvider;", "initialBandwidthValueProvider", "(Landroid/content/Context;Lru/yandex/video/m3/player/lowlatency/InitialBandwidthValueProvider;)Lip4;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface BandwidthMeterFactory {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/BandwidthMeterFactory$Companion;", "", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NetworkType.values().length];
            try {
                iArr[NetworkType.NETWORK_TYPE_WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkType.NETWORK_TYPE_2G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NetworkType.NETWORK_TYPE_3G.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NetworkType.NETWORK_TYPE_4G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NetworkType.NETWORK_TYPE_5G_SA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[NetworkType.NETWORK_TYPE_5G_NSA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[NetworkType.NETWORK_TYPE_CELLULAR_UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[NetworkType.NETWORK_TYPE_ETHERNET.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[NetworkType.NETWORK_TYPE_OTHER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[NetworkType.NETWORK_TYPE_OFFLINE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private default int toExoNetworkType(NetworkType networkType) {
        switch (WhenMappings.$EnumSwitchMapping$0[networkType.ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 9;
            case 6:
                return 10;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 0;
            case 10:
                return 1;
            default:
                return 8;
        }
    }

    default ip4 create(Context context, InitialBandwidthValueProvider initialBandwidthValueProvider) {
        Map<NetworkType, Long> initialBitrateEstimates;
        Context applicationContext = context.getApplicationContext();
        HashMap hashMap = new HashMap(8);
        hashMap.put(0, 1000000L);
        hashMap.put(2, -9223372036854775807L);
        hashMap.put(3, -9223372036854775807L);
        hashMap.put(4, -9223372036854775807L);
        hashMap.put(5, -9223372036854775807L);
        hashMap.put(10, -9223372036854775807L);
        hashMap.put(9, -9223372036854775807L);
        hashMap.put(7, -9223372036854775807L);
        if (initialBandwidthValueProvider != null && (initialBitrateEstimates = initialBandwidthValueProvider.getInitialBitrateEstimates(context, tw21.y(context))) != null) {
            for (Map.Entry<NetworkType, Long> entry : initialBitrateEstimates.entrySet()) {
                hashMap.put(Integer.valueOf(toExoNetworkType(entry.getKey())), Long.valueOf(entry.getValue().longValue()));
            }
        }
        return new v6h(applicationContext, hashMap);
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static ip4 create(BandwidthMeterFactory bandwidthMeterFactory, Context context) {
            return BandwidthMeterFactory.super.create(context);
        }

        @Deprecated
        public static ip4 create(BandwidthMeterFactory bandwidthMeterFactory, Context context, InitialBandwidthValueProvider initialBandwidthValueProvider) {
            return BandwidthMeterFactory.super.create(context, initialBandwidthValueProvider);
        }
    }

    default ip4 create(Context context) {
        Context applicationContext = context.getApplicationContext();
        HashMap hashMap = new HashMap(8);
        hashMap.put(0, 1000000L);
        hashMap.put(2, -9223372036854775807L);
        hashMap.put(3, -9223372036854775807L);
        hashMap.put(4, -9223372036854775807L);
        hashMap.put(5, -9223372036854775807L);
        hashMap.put(10, -9223372036854775807L);
        hashMap.put(9, -9223372036854775807L);
        hashMap.put(7, -9223372036854775807L);
        return new v6h(applicationContext, hashMap);
    }
}
