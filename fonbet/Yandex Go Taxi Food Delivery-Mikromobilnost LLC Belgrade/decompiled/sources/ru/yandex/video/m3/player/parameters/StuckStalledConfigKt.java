package ru.yandex.video.m3.player.parameters;

import defpackage.tls;
import kotlin.Metadata;
import ru.yandex.video.m3.player.parameters.StuckStalledConfig;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "minimumBufferForAlertMs", "alarmPeriodMs", "", "fatalOnlyIfShouldContinueLoadingIsFalse", "produceJustNonFatalErrors", "watchOnlySeekStalled", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/parameters/StuckStalledConfig$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/player/parameters/StuckStalledConfig;", "StuckStalledConfig", "(JJZZZLtls;)Lru/yandex/video/m3/player/parameters/StuckStalledConfig;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StuckStalledConfigKt {
    public static final /* synthetic */ StuckStalledConfig StuckStalledConfig(long j, long j2, boolean z, boolean z2, boolean z3, tls tlsVar) {
        StuckStalledConfig.Builder builder = new StuckStalledConfig.Builder(j, j2, z, z2, z3);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }
}
