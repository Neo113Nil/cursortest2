package ru.yandex.video.m3.player.skips.data;

import defpackage.tls;
import kotlin.Metadata;
import ru.yandex.video.m3.player.skips.data.PlayerSkip;

@Metadata(d1 = {"\u00000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "contentId", "Lru/yandex/video/m3/player/skips/data/PlayerSkip$Type;", "type", "", "autoSkip", "", "startTimeMs", "endTimeMs", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/skips/data/PlayerSkip$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/player/skips/data/PlayerSkip;", "PlayerSkip", "(Ljava/lang/String;Lru/yandex/video/m3/player/skips/data/PlayerSkip$Type;ZJJLtls;)Lru/yandex/video/m3/player/skips/data/PlayerSkip;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlayerSkipKt {
    public static final /* synthetic */ PlayerSkip PlayerSkip(String str, PlayerSkip.Type type, boolean z, long j, long j2, tls tlsVar) {
        PlayerSkip.Builder builder = new PlayerSkip.Builder(str, type, z, j, j2);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }
}
