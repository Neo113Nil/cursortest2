package ru.yandex.video.m3.list_player_manager.impl.data;

import java.util.Map;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Result;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.data.exception.ManifestLoadingException;
import ru.yandex.video.m3.ott.data.repository.ManifestRepository;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u001c\n\u0000\b`\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fH'\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/data/VideoDataRepository;", "T", "Lru/yandex/video/m3/data/dto/VideoData;", "Lru/yandex/video/m3/ott/data/repository/ManifestRepository;", "getVideoData", "Lkotlin/Result;", "contentId", "", "getVideoData-IoAF18A", "(Ljava/lang/String;)Ljava/lang/Object;", "", "contentIds", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface VideoDataRepository<T extends VideoData> extends ManifestRepository<T> {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static <T extends VideoData> Future<T> loadVideoData(VideoDataRepository<T> videoDataRepository, String str, String str2) throws ManifestLoadingException {
            return VideoDataRepository.super.loadVideoData(str, str2);
        }
    }

    Map<String, Result<T>> getVideoData(Iterable<String> contentIds);

    /* renamed from: getVideoData-IoAF18A */
    Object mo741getVideoDataIoAF18A(String contentId);
}
