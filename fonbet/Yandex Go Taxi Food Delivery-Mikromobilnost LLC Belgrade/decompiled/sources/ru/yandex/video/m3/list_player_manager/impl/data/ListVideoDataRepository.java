package ru.yandex.video.m3.list_player_manager.impl.data;

import defpackage.gw00;
import defpackage.tcc;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Result;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.ott.data.repository.ManifestRepository;
import ru.yandex.video.m3.player.impl.utils.InfoProvider;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ#\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/data/ListVideoDataRepository;", "T", "Lru/yandex/video/m3/data/dto/VideoData;", "Lru/yandex/video/m3/list_player_manager/impl/data/VideoDataRepository;", "manifestRepository", "Lru/yandex/video/m3/ott/data/repository/ManifestRepository;", "infoProvider", "Lru/yandex/video/m3/player/impl/utils/InfoProvider;", "(Lru/yandex/video/m3/ott/data/repository/ManifestRepository;Lru/yandex/video/m3/player/impl/utils/InfoProvider;)V", "getVideoData", "Lkotlin/Result;", "contentId", "", "getVideoData-IoAF18A", "(Ljava/lang/String;)Ljava/lang/Object;", "", "contentIds", "", "loadVideoData", "Ljava/util/concurrent/Future;", "vpuid", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ListVideoDataRepository<T extends VideoData> implements VideoDataRepository<T> {
    public static final int $stable = 0;
    private final InfoProvider infoProvider;
    private final ManifestRepository<T> manifestRepository;

    public ListVideoDataRepository(ManifestRepository<T> manifestRepository, InfoProvider infoProvider) {
        this.manifestRepository = manifestRepository;
        this.infoProvider = infoProvider;
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.data.VideoDataRepository
    public Map<String, Result<T>> getVideoData(Iterable<String> contentIds) {
        int d = gw00.d(tcc.n(contentIds, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (String str : contentIds) {
            linkedHashMap.put(str, new Result(mo741getVideoDataIoAF18A(str)));
        }
        return linkedHashMap;
    }

    @Override // ru.yandex.video.m3.list_player_manager.impl.data.VideoDataRepository
    /* renamed from: getVideoData-IoAF18A */
    public Object mo741getVideoDataIoAF18A(String contentId) {
        try {
            return loadVideoData(contentId).get();
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }

    @Override // ru.yandex.video.m3.ott.data.repository.ManifestRepository
    public Future<T> loadVideoData(String contentId, String vpuid) {
        ManifestRepository<T> manifestRepository = this.manifestRepository;
        if (vpuid == null) {
            vpuid = this.infoProvider.getVpuid();
        }
        return manifestRepository.loadVideoData(contentId, vpuid);
    }

    @Override // ru.yandex.video.m3.ott.data.repository.ManifestRepository
    public Future<T> loadVideoData(String contentId) {
        return this.manifestRepository.loadVideoData(contentId, this.infoProvider.getVpuid());
    }
}
