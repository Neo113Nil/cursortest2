package ru.yandex.video.m3.list_player_manager.impl.pool;

import defpackage.zxc0;
import kotlin.Metadata;
import ru.yandex.video.m3.debug.DecoderUsageListener;
import ru.yandex.video.m3.player.YandexPlayer;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/pool/YandexPlayerFactory;", "", "Lru/yandex/video/m3/debug/DecoderUsageListener;", "decoderUsageListener", "Lru/yandex/video/m3/player/YandexPlayer;", "Lzxc0;", "create", "(Lru/yandex/video/m3/debug/DecoderUsageListener;)Lru/yandex/video/m3/player/YandexPlayer;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface YandexPlayerFactory {
    YandexPlayer<zxc0> create(DecoderUsageListener decoderUsageListener);
}
