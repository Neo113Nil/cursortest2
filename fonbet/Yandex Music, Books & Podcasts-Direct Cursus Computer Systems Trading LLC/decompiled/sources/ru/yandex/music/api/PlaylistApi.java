package ru.yandex.music.api;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.playlist.PlaylistHeaderDto;
import com.yandex.music.shared.dto.playlist.personal.PersonalPlaylistHeaderMetaDto;
import defpackage.a0k;
import defpackage.asc;
import defpackage.b9c;
import defpackage.dak;
import defpackage.lzc;
import defpackage.r6n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J1\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00020\u00060\u00052\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\u00052\b\b\u0001\u0010\n\u001a\u00020\u0003H'¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\b\b\u0001\u0010\u000e\u001a\u00020\u0003H'¢\u0006\u0004\b\u0010\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lru/yandex/music/api/PlaylistApi;", "", "", "", "playlistsIds", "Lretrofit2/Call;", "Lcom/yandex/music/shared/backend_utils/MusicBackendResponse;", "Lcom/yandex/music/shared/dto/playlist/PlaylistHeaderDto;", "a", "(Ljava/util/List;)Lretrofit2/Call;", "playlistName", "Lcom/yandex/music/shared/dto/playlist/personal/PersonalPlaylistHeaderMetaDto;", "c", "(Ljava/lang/String;)Lretrofit2/Call;", "playlistId", "", "b", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public interface PlaylistApi {
    @a0k("playlists/list")
    @asc
    @NotNull
    Call<MusicBackendResponse<List<PlaylistHeaderDto>>> a(@b9c("playlistIds") @NotNull List<String> playlistsIds);

    @lzc("feed/playlists/seen")
    @NotNull
    Call<Unit> b(@r6n("playlistId") @NotNull String playlistId);

    @lzc("playlists/personal/{playlistName}")
    @NotNull
    Call<MusicBackendResponse<PersonalPlaylistHeaderMetaDto>> c(@dak("playlistName") @NotNull String playlistName);
}
