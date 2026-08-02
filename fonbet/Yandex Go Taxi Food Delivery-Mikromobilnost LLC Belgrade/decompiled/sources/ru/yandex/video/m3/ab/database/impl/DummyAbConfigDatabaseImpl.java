package ru.yandex.video.m3.ab.database.impl;

import kotlin.Metadata;
import ru.yandex.video.m3.ab.config.AbConfigWithMeta;
import ru.yandex.video.m3.ab.database.AbConfigDatabase;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0003¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/ab/database/impl/DummyAbConfigDatabaseImpl;", "Lru/yandex/video/m3/ab/database/AbConfigDatabase;", "<init>", "()V", "Lru/yandex/video/m3/ab/config/AbConfigWithMeta;", "getConfig", "()Lru/yandex/video/m3/ab/config/AbConfigWithMeta;", "abConfigWithMeta", "Lzy11;", "updateConfig", "(Lru/yandex/video/m3/ab/config/AbConfigWithMeta;)V", "invalidate", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DummyAbConfigDatabaseImpl implements AbConfigDatabase {
    public static final int $stable = 0;

    @Override // ru.yandex.video.m3.ab.database.AbConfigDatabase
    public AbConfigWithMeta getConfig() {
        return AbConfigWithMeta.INSTANCE.getDEFAULT();
    }

    @Override // ru.yandex.video.m3.ab.database.AbConfigDatabase
    public void invalidate() {
    }

    @Override // ru.yandex.video.m3.ab.database.AbConfigDatabase
    public void updateConfig(AbConfigWithMeta abConfigWithMeta) {
    }
}
