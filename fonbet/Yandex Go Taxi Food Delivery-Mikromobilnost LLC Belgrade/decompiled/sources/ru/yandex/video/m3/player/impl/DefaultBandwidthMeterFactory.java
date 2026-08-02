package ru.yandex.video.m3.player.impl;

import android.content.Context;
import defpackage.v6h;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.BandwidthMeterFactory;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/player/impl/DefaultBandwidthMeterFactory;", "Lru/yandex/video/m3/player/BandwidthMeterFactory;", "", "initialBitrateEstimate", "<init>", "(Ljava/lang/Long;)V", "Landroid/content/Context;", "context", "Lv6h;", "create", "(Landroid/content/Context;)Lv6h;", "Ljava/lang/Long;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultBandwidthMeterFactory implements BandwidthMeterFactory {
    public static final int $stable = 0;
    private final Long initialBitrateEstimate;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\r\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\fR\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/player/impl/DefaultBandwidthMeterFactory$Builder;", "", "()V", "initialBitrateEstimate", "", "getInitialBitrateEstimate", "()Ljava/lang/Long;", "setInitialBitrateEstimate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "build", "Lru/yandex/video/m3/player/impl/DefaultBandwidthMeterFactory;", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Long initialBitrateEstimate;

        public final DefaultBandwidthMeterFactory build$video_player_internalRelease() {
            return new DefaultBandwidthMeterFactory(this.initialBitrateEstimate, null);
        }

        public final Long getInitialBitrateEstimate() {
            return this.initialBitrateEstimate;
        }

        public final void setInitialBitrateEstimate(Long l) {
            this.initialBitrateEstimate = l;
        }
    }

    private DefaultBandwidthMeterFactory(Long l) {
        this.initialBitrateEstimate = l;
    }

    @Override // ru.yandex.video.m3.player.BandwidthMeterFactory
    public v6h create(Context context) {
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
        Long l = this.initialBitrateEstimate;
        if (l != null) {
            long longValue = l.longValue();
            for (Integer num : hashMap.keySet()) {
                num.getClass();
                hashMap.put(num, Long.valueOf(longValue));
            }
        }
        return new v6h(applicationContext, hashMap);
    }

    public /* synthetic */ DefaultBandwidthMeterFactory(Long l, DefaultConstructorMarker defaultConstructorMarker) {
        this(l);
    }
}
