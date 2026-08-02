package ru.yandex.video.m3.list_player_manager.impl.data;

import java.util.concurrent.Future;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001c\n\u0000\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J&\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH&¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/data/BatchManifestApi;", "R", "", "loadManifests", "Ljava/util/concurrent/Future;", "vpuid", "", "contentIds", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface BatchManifestApi<R> {
    Future<R> loadManifests(String vpuid, Iterable<String> contentIds);
}
