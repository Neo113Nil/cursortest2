package ru.yandex.video.m3.player.skips;

import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.player.skips.data.PlayerSkip;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/skips/YandexPlayerSkipsManager;", "", "Lru/yandex/video/m3/player/skips/data/PlayerSkip$Type;", "type", "", "isEnabled", "Lzy11;", "updateAutoSkipsByType", "(Lru/yandex/video/m3/player/skips/data/PlayerSkip$Type;Z)V", "", "Lru/yandex/video/m3/player/skips/data/PlayerSkip;", "skips", "start", "(Ljava/util/List;)V", "stop", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface YandexPlayerSkipsManager {
    void start(List<PlayerSkip> skips);

    void stop();

    void updateAutoSkipsByType(PlayerSkip.Type type, boolean isEnabled);
}
