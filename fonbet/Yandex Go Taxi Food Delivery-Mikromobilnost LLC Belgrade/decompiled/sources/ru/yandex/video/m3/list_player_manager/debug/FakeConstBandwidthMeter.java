package ru.yandex.video.m3.list_player_manager.debug;

import android.content.Context;
import defpackage.ip4;
import kotlin.Metadata;
import ru.yandex.video.m3.player.BandwidthMeterFactory;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/list_player_manager/debug/FakeConstBandwidthMeter;", "Lru/yandex/video/m3/player/BandwidthMeterFactory;", "", "initBitrateEstimate", "<init>", "(J)V", "Landroid/content/Context;", "context", "Lip4;", "create", "(Landroid/content/Context;)Lip4;", "J", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FakeConstBandwidthMeter implements BandwidthMeterFactory {
    public static final int $stable = 0;
    private final long initBitrateEstimate;

    public FakeConstBandwidthMeter(long j) {
        this.initBitrateEstimate = j;
    }

    @Override // ru.yandex.video.m3.player.BandwidthMeterFactory
    public ip4 create(Context context) {
        return new FakeConstBandwidthMeter$create$1(this);
    }
}
