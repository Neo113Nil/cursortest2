package ru.yandex.video.m3.player.impl.load_control.provider;

import kotlin.Metadata;
import ru.yandex.video.m3.player.impl.load_control.MaxBufferByNetworkType;
import ru.yandex.video.m3.player.utils.network.NetworkType;
import ru.yandex.video.m3.player.utils.network.NetworkTypeProvider;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/player/impl/load_control/provider/BufferDurationByNetworkTypeProvider;", "Lru/yandex/video/m3/player/impl/load_control/provider/BufferDurationProvider;", "defaultMaxBufferMs", "", "maxBufferByNetworkType", "Lru/yandex/video/m3/player/impl/load_control/MaxBufferByNetworkType;", "networkTypeProvider", "Lru/yandex/video/m3/player/utils/network/NetworkTypeProvider;", "(JLru/yandex/video/m3/player/impl/load_control/MaxBufferByNetworkType;Lru/yandex/video/m3/player/utils/network/NetworkTypeProvider;)V", "getMaxBufferMs", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public class BufferDurationByNetworkTypeProvider implements BufferDurationProvider {
    public static final int $stable = 8;
    private final long defaultMaxBufferMs;
    private final MaxBufferByNetworkType maxBufferByNetworkType;
    private final NetworkTypeProvider networkTypeProvider;

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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BufferDurationByNetworkTypeProvider(long j, MaxBufferByNetworkType maxBufferByNetworkType, NetworkTypeProvider networkTypeProvider) {
        this.defaultMaxBufferMs = j;
        this.maxBufferByNetworkType = maxBufferByNetworkType;
        this.networkTypeProvider = networkTypeProvider;
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.provider.BufferDurationProvider
    /* renamed from: getMaxBufferMs */
    public long getBufferDuration() {
        switch (WhenMappings.$EnumSwitchMapping$0[this.networkTypeProvider.getNetworkType().ordinal()]) {
            case 1:
                return this.maxBufferByNetworkType.getMaxBufferWifiMs();
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return this.maxBufferByNetworkType.getMaxBufferCellularMs();
            default:
                return this.defaultMaxBufferMs;
        }
    }
}
