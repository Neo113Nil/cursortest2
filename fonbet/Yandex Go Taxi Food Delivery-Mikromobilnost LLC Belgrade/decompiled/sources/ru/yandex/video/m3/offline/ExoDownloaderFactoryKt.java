package ru.yandex.video.m3.offline;

import defpackage.db7;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import ru.yandex.video.m3.preload.YandexDownloaderFactory;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldb7;", "cacheDataSourceFactory", "Ljava/util/concurrent/Executor;", "executor", "Lru/yandex/video/m3/preload/YandexDownloaderFactory;", "getExoDownloaderFactory", "(Ldb7;Ljava/util/concurrent/Executor;)Lru/yandex/video/m3/preload/YandexDownloaderFactory;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExoDownloaderFactoryKt {
    public static final YandexDownloaderFactory getExoDownloaderFactory(db7 db7Var, Executor executor) {
        return new ExoDownloaderFactory(db7Var, executor);
    }
}
