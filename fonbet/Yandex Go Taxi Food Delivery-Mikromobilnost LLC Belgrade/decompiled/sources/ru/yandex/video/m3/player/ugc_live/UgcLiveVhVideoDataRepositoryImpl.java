package ru.yandex.video.m3.player.ugc_live;

import defpackage.h5z0;
import defpackage.jl40;
import java.io.IOException;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.dto.Vh;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import ru.yandex.video.m3.ott.data.net.ManifestApi;
import ru.yandex.video.m3.ott.data.repository.impl.VhManifestRepository;
import ru.yandex.video.m3.player.ugc_live.UgcLiveException;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/player/ugc_live/UgcLiveVhVideoDataRepositoryImpl;", "Lru/yandex/video/m3/player/ugc_live/UgcLiveVhVideoDataRepository;", "vhManifestApi", "Lru/yandex/video/m3/ott/data/net/ManifestApi;", "Lru/yandex/video/m3/ott/data/dto/Vh$VhResponse;", "(Lru/yandex/video/m3/ott/data/net/ManifestApi;)V", "loadVideoData", "Lru/yandex/video/m3/player/ugc_live/UgcLiveVideoData;", "contentId", "", "vpuid", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UgcLiveVhVideoDataRepositoryImpl implements UgcLiveVhVideoDataRepository {
    public static final int $stable = 8;
    private final ManifestApi<Vh.VhResponse> vhManifestApi;

    public UgcLiveVhVideoDataRepositoryImpl(ManifestApi<Vh.VhResponse> manifestApi) {
        this.vhManifestApi = manifestApi;
    }

    @Override // ru.yandex.video.m3.player.ugc_live.UgcLiveVhVideoDataRepository
    public UgcLiveVideoData loadVideoData(String contentId, String vpuid) {
        VhVideoData vhVideoData;
        try {
            Vh.VhResponse vhResponse = this.vhManifestApi.getManifest(contentId, vpuid).get();
            h5z0.a.a("vhResponse=" + vhResponse, new Object[0]);
            if (!jl40.l(vhResponse.getContent().isUgcLive(), Boolean.TRUE)) {
                return new UgcLiveVideoData(VhManifestRepository.INSTANCE.responseToVideoData(vhResponse), null, null, null, vhResponse.getContent().getViewers());
            }
            try {
                vhVideoData = VhManifestRepository.INSTANCE.responseToVideoData(vhResponse);
            } catch (Exception e) {
                h5z0.a.e(e);
                vhVideoData = null;
            }
            return new UgcLiveVideoData(vhVideoData, vhResponse.getContent().getXivaSubscriptionId(), Boolean.TRUE, vhResponse.getContent().isUgcLiveStatus(), vhResponse.getContent().getViewers());
        } catch (IOException e2) {
            throw new UgcLiveException.ConnectionError(e2);
        }
    }

    @Override // ru.yandex.video.m3.player.ugc_live.UgcLiveVhVideoDataRepository
    public UgcLiveVideoData loadVideoData(String contentId) {
        return loadVideoData(contentId, null);
    }
}
