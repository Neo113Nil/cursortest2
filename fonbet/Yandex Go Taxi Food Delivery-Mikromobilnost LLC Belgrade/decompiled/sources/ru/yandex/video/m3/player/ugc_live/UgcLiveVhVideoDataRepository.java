package ru.yandex.video.m3.player.ugc_live;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0017¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/ugc_live/UgcLiveVhVideoDataRepository;", "", "loadVideoData", "Lru/yandex/video/m3/player/ugc_live/UgcLiveVideoData;", "contentId", "", "vpuid", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface UgcLiveVhVideoDataRepository {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static UgcLiveVideoData loadVideoData(UgcLiveVhVideoDataRepository ugcLiveVhVideoDataRepository, String str, String str2) {
            return UgcLiveVhVideoDataRepository.super.loadVideoData(str, str2);
        }
    }

    UgcLiveVideoData loadVideoData(String contentId);

    default UgcLiveVideoData loadVideoData(String contentId, String vpuid) {
        return loadVideoData(contentId);
    }
}
