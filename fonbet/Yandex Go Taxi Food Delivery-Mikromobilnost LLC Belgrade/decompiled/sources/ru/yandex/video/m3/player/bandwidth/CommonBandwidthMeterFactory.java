package ru.yandex.video.m3.player.bandwidth;

import android.content.Context;
import defpackage.f050;
import defpackage.ip4;
import defpackage.tw21;
import kotlin.Metadata;
import ru.yandex.video.m3.player.BandwidthMeterFactory;
import ru.yandex.video.m3.player.bandwidth.CommonBandwidthMeter;
import ru.yandex.video.m3.player.impl.bandwidth.InitialBandwidthValueProviderImpl;
import ru.yandex.video.m3.player.impl.utils.network.NetworkTypeProviderImpl;
import ru.yandex.video.m3.player.lowlatency.InitialBandwidthValueProvider;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u0011J\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/player/bandwidth/CommonBandwidthMeterFactory;", "Lru/yandex/video/m3/player/BandwidthMeterFactory;", "", "platformSync", "<init>", "(Z)V", "Landroid/content/Context;", "context", "Lru/yandex/video/m3/player/lowlatency/InitialBandwidthValueProvider;", "provider", "", "getInitialBandwidth", "(Landroid/content/Context;Lru/yandex/video/m3/player/lowlatency/InitialBandwidthValueProvider;)D", "Lip4;", "create", "(Landroid/content/Context;)Lip4;", "initialBandwidthValueProvider", "(Landroid/content/Context;Lru/yandex/video/m3/player/lowlatency/InitialBandwidthValueProvider;)Lip4;", "()Lip4;", "Z", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CommonBandwidthMeterFactory implements BandwidthMeterFactory {
    public static final int $stable = 0;
    private final boolean platformSync;

    public CommonBandwidthMeterFactory(boolean z) {
        this.platformSync = z;
    }

    private final double getInitialBandwidth(Context context, InitialBandwidthValueProvider provider) {
        if (provider == null) {
            provider = InitialBandwidthValueProviderImpl.INSTANCE;
        }
        return provider.getInitialBitrateEstimate(context, NetworkTypeProviderImpl.INSTANCE.getInstance(context).getForceNetworkType(context), tw21.y(context));
    }

    public static /* synthetic */ double getInitialBandwidth$default(CommonBandwidthMeterFactory commonBandwidthMeterFactory, Context context, InitialBandwidthValueProvider initialBandwidthValueProvider, int i, Object obj) {
        if ((i & 2) != 0) {
            initialBandwidthValueProvider = null;
        }
        return commonBandwidthMeterFactory.getInitialBandwidth(context, initialBandwidthValueProvider);
    }

    @Override // ru.yandex.video.m3.player.BandwidthMeterFactory
    public ip4 create(Context context) {
        CommonBandwidthMeter instance$video_player_internalRelease$default = CommonBandwidthMeter.Companion.getInstance$video_player_internalRelease$default(CommonBandwidthMeter.INSTANCE, getInitialBandwidth$default(this, context, null, 2, null), null, null, null, this.platformSync, 14, null);
        f050.b = this.platformSync;
        return instance$video_player_internalRelease$default;
    }

    @Override // ru.yandex.video.m3.player.BandwidthMeterFactory
    public ip4 create(Context context, InitialBandwidthValueProvider initialBandwidthValueProvider) {
        f050.b = this.platformSync;
        return CommonBandwidthMeter.Companion.getInstance$video_player_internalRelease$default(CommonBandwidthMeter.INSTANCE, getInitialBandwidth(context, initialBandwidthValueProvider), null, null, null, this.platformSync, 14, null);
    }

    public final ip4 create() {
        CommonBandwidthMeter instance$video_player_internalRelease$default = CommonBandwidthMeter.Companion.getInstance$video_player_internalRelease$default(CommonBandwidthMeter.INSTANCE, 0.0d, null, null, null, this.platformSync, 15, null);
        f050.b = this.platformSync;
        return instance$video_player_internalRelease$default;
    }
}
