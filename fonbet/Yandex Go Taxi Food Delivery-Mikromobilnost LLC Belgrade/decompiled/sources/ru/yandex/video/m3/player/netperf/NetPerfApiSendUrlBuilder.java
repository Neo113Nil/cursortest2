package ru.yandex.video.m3.player.netperf;

import defpackage.kwu;
import kotlin.Metadata;
import ru.yandex.video.m3.player.impl.utils.TimeProvider;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/netperf/NetPerfApiSendUrlBuilder;", "", "", "navStart", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "timeProvider", "Lkwu;", "buildUrl", "(JLru/yandex/video/m3/player/impl/utils/TimeProvider;)Lkwu;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface NetPerfApiSendUrlBuilder {
    kwu buildUrl(long navStart, TimeProvider timeProvider);
}
