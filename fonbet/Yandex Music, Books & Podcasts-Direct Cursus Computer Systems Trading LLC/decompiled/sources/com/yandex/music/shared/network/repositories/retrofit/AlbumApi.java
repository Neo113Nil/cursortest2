package com.yandex.music.shared.network.repositories.retrofit;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.album.AlbumDto;
import com.yandex.music.shared.dto.universalentities.CarouselEntitiesDto;
import defpackage.dak;
import defpackage.lzc;
import defpackage.o3f;
import defpackage.r6n;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\bJ3\u0010\r\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\f0\u00050\u00042\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH'¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0010\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lcom/yandex/music/shared/network/repositories/retrofit/AlbumApi;", "", "", "albumId", "Lretrofit2/Call;", "Lcom/yandex/music/shared/backend_utils/MusicBackendResponse;", "Lcom/yandex/music/shared/dto/album/AlbumDto;", "b", "(Ljava/lang/String;)Lretrofit2/Call;", "d", "Lo3f;", "albumIds", "", "c", "(Lo3f;)Lretrofit2/Call;", "Lcom/yandex/music/shared/dto/universalentities/CarouselEntitiesDto;", "a", "shared-network-repositories"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public interface AlbumApi {
    @lzc("albums/{albumId}/similar-entities")
    @NotNull
    Call<MusicBackendResponse<CarouselEntitiesDto>> a(@dak("albumId") @NotNull String albumId);

    @lzc("albums/{albumId}")
    @NotNull
    Call<MusicBackendResponse<AlbumDto>> b(@dak("albumId") @NotNull String albumId);

    @lzc("albums")
    @NotNull
    Call<MusicBackendResponse<List<AlbumDto>>> c(@r6n("album-ids") @NotNull o3f albumIds);

    @lzc("albums/{albumId}/with-tracks")
    @NotNull
    Call<MusicBackendResponse<AlbumDto>> d(@dak("albumId") @NotNull String albumId);
}
