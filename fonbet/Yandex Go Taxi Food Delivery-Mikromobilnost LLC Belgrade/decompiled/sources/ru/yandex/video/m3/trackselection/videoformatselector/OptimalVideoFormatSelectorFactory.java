package ru.yandex.video.m3.trackselection.videoformatselector;

import android.content.Context;
import defpackage.ip4;
import defpackage.jxi;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelectorFactory;", "", "Lip4;", "bandwidthMeter", "Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelector;", "create", "(Lip4;)Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelector;", "Landroid/content/Context;", "context", "", "from", "(Landroid/content/Context;Lip4;Ljava/lang/String;)Lru/yandex/video/m3/trackselection/videoformatselector/OptimalVideoFormatSelector;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface OptimalVideoFormatSelectorFactory {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static OptimalVideoFormatSelector create(OptimalVideoFormatSelectorFactory optimalVideoFormatSelectorFactory, Context context, ip4 ip4Var, String str) {
            return OptimalVideoFormatSelectorFactory.super.create(context, ip4Var, str);
        }
    }

    default OptimalVideoFormatSelector create(Context context, ip4 bandwidthMeter, String from) {
        return create(bandwidthMeter);
    }

    @jxi
    OptimalVideoFormatSelector create(ip4 bandwidthMeter);
}
