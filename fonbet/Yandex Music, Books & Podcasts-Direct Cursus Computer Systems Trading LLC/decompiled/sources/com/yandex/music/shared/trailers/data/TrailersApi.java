package com.yandex.music.shared.trailers.data;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.trailers.data.network.dto.AlbumTrailerDto;
import com.yandex.music.shared.trailers.data.network.dto.ArtistTrailerDto;
import com.yandex.music.shared.trailers.data.network.dto.PlaylistTrailerDto;
import com.yandex.music.shared.trailers.data.network.dto.TrackTrailerDto;
import defpackage.dak;
import defpackage.lzc;
import defpackage.r6n;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\nJ%\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u0002H'¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00070\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u0002H'¢\u0006\u0004\b\u0016\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Lcom/yandex/music/shared/trailers/data/TrailersApi;", "", "", "artistId", "", "rankByVideoAvailability", "Lretrofit2/Call;", "Lcom/yandex/music/shared/backend_utils/MusicBackendResponse;", "Lcom/yandex/music/shared/trailers/data/network/dto/ArtistTrailerDto;", "b", "(Ljava/lang/String;Z)Lretrofit2/Call;", "albumId", "Lcom/yandex/music/shared/trailers/data/network/dto/AlbumTrailerDto;", "d", "(Ljava/lang/String;)Lretrofit2/Call;", "userId", "playlistKind", "Lcom/yandex/music/shared/trailers/data/network/dto/PlaylistTrailerDto;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;", "trackId", "Lcom/yandex/music/shared/trailers/data/network/dto/TrackTrailerDto;", "c", "shared-trailers"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public interface TrailersApi {
    @lzc("users/{userId}/playlists/{playlistKind}/trailer")
    @NotNull
    Call<MusicBackendResponse<PlaylistTrailerDto>> a(@dak("userId") @NotNull String userId, @dak("playlistKind") @NotNull String playlistKind);

    @lzc("artists/{artistId}/trailer")
    @NotNull
    Call<MusicBackendResponse<ArtistTrailerDto>> b(@dak("artistId") @NotNull String artistId, @r6n("rankedByBackgroundVideo") boolean rankByVideoAvailability);

    @lzc("tracks/{trackId}/trailer")
    @NotNull
    Call<MusicBackendResponse<TrackTrailerDto>> c(@dak("trackId") @NotNull String trackId);

    @lzc("albums/{albumId}/trailer")
    @NotNull
    Call<MusicBackendResponse<AlbumTrailerDto>> d(@dak("albumId") @NotNull String albumId);
}
