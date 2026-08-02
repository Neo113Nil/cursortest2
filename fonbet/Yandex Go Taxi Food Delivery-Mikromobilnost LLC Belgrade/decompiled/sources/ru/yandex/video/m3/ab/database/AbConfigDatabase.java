package ru.yandex.video.m3.ab.database;

import kotlin.Metadata;
import ru.yandex.video.m3.ab.config.AbConfigWithMeta;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/ab/database/AbConfigDatabase;", "", "Lru/yandex/video/m3/ab/config/AbConfigWithMeta;", "getConfig", "()Lru/yandex/video/m3/ab/config/AbConfigWithMeta;", "abConfigWithMeta", "Lzy11;", "updateConfig", "(Lru/yandex/video/m3/ab/config/AbConfigWithMeta;)V", "invalidate", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface AbConfigDatabase {
    AbConfigWithMeta getConfig();

    void invalidate();

    void updateConfig(AbConfigWithMeta abConfigWithMeta);
}
