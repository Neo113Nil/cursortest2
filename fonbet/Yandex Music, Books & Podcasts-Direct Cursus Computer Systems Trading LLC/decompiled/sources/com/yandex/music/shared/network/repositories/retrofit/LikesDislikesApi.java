package com.yandex.music.shared.network.repositories.retrofit;

import com.connectsdk.service.command.ServiceCommand;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.metrica.push.common.CoreConstants;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.likes.UserLibraryModifyDto;
import com.yandex.music.shared.network.repositories.dto.likes.TrackLikeRequest;
import com.yandex.music.shared.network.repositories.dto.likes.VideoClipLikeRequest;
import defpackage.a0k;
import defpackage.asc;
import defpackage.b9c;
import defpackage.dak;
import defpackage.k83;
import defpackage.o3f;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u000b\u0010\nJ/\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\f\u0010\nJ/\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\b\u0013\u0010\u0011J/\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\b\u0015\u0010\u0011J/\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\b\u0016\u0010\u0011J/\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\b\u0018\u0010\u0011J/\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\b\u0019\u0010\u0011J/\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\rH'¢\u0006\u0004\b\u001a\u0010\u0011J)\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u001bH'¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u001bH'¢\u0006\u0004\b\u001e\u0010\u001dJ)\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u001bH'¢\u0006\u0004\b\u001f\u0010\u001dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006 À\u0006\u0001"}, d2 = {"Lcom/yandex/music/shared/network/repositories/retrofit/LikesDislikesApi;", "", "", "userId", "Lcom/yandex/music/shared/network/repositories/dto/likes/TrackLikeRequest;", ServiceCommand.TYPE_REQ, "Lretrofit2/Call;", "Lcom/yandex/music/shared/backend_utils/MusicBackendResponse;", "Lcom/yandex/music/shared/dto/likes/UserLibraryModifyDto;", "m", "(Ljava/lang/String;Lcom/yandex/music/shared/network/repositories/dto/likes/TrackLikeRequest;)Lretrofit2/Call;", "l", "k", "Lo3f;", "albumIds", "", "g", "(Ljava/lang/String;Lo3f;)Lretrofit2/Call;", "albumId", "f", "artistIds", CoreConstants.PushMessage.SERVICE_TYPE, "d", "artistsIdsParam", "j", "a", "h", "Lcom/yandex/music/shared/network/repositories/dto/likes/VideoClipLikeRequest;", "b", "(Ljava/lang/String;Lcom/yandex/music/shared/network/repositories/dto/likes/VideoClipLikeRequest;)Lretrofit2/Call;", "c", "e", "shared-network-repositories"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public interface LikesDislikesApi {
    @a0k("users/{id}/likes/playlists/add-multiple")
    @asc
    @NotNull
    Call<Unit> a(@dak("id") @NotNull String userId, @b9c("playlistIds") @NotNull o3f artistsIdsParam);

    @a0k("/users/{userId}/likes/clips/actions/add")
    @NotNull
    Call<Unit> b(@dak("userId") @NotNull String userId, @k83 @NotNull VideoClipLikeRequest request);

    @a0k("/users/{userId}/likes/clips/actions/remove")
    @NotNull
    Call<Unit> c(@dak("userId") @NotNull String userId, @k83 @NotNull VideoClipLikeRequest request);

    @a0k("users/{id}/likes/artists/remove")
    @asc
    @NotNull
    Call<Unit> d(@dak("id") @NotNull String userId, @b9c("artistIds") @NotNull o3f artistIds);

    @a0k("/users/{userId}/dislikes/clips/actions/add")
    @NotNull
    Call<Unit> e(@dak("userId") @NotNull String userId, @k83 @NotNull VideoClipLikeRequest request);

    @a0k("users/{id}/likes/albums/remove")
    @asc
    @NotNull
    Call<Unit> f(@dak("id") @NotNull String userId, @b9c("albumIds") @NotNull o3f albumId);

    @a0k("users/{id}/likes/albums/add-multiple")
    @asc
    @NotNull
    Call<Unit> g(@dak("id") @NotNull String userId, @b9c("albumIds") @NotNull o3f albumIds);

    @a0k("users/{id}/likes/playlists/remove")
    @asc
    @NotNull
    Call<Unit> h(@dak("id") @NotNull String userId, @b9c("playlistIds") @NotNull o3f artistsIdsParam);

    @a0k("users/{id}/likes/artists/add-multiple")
    @asc
    @NotNull
    Call<Unit> i(@dak("id") @NotNull String userId, @b9c("artistIds") @NotNull o3f artistIds);

    @a0k("users/{id}/dislikes/artists/add-multiple")
    @asc
    @NotNull
    Call<Unit> j(@dak("id") @NotNull String userId, @b9c("artist-ids") @NotNull o3f artistsIdsParam);

    @a0k("users/{currentUserId}/dislikes/tracks/actions/add")
    @NotNull
    Call<MusicBackendResponse<UserLibraryModifyDto>> k(@dak("currentUserId") @NotNull String userId, @k83 @NotNull TrackLikeRequest request);

    @a0k("users/{currentUserId}/likes/tracks/actions/remove")
    @NotNull
    Call<MusicBackendResponse<UserLibraryModifyDto>> l(@dak("currentUserId") @NotNull String userId, @k83 @NotNull TrackLikeRequest request);

    @a0k("users/{currentUserId}/likes/tracks/actions/add")
    @NotNull
    Call<MusicBackendResponse<UserLibraryModifyDto>> m(@dak("currentUserId") @NotNull String userId, @k83 @NotNull TrackLikeRequest request);
}
