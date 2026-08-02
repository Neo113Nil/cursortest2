package com.yandex.music.shared.network.repositories.retrofit;

import com.connectsdk.service.DeviceService;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.metrica.push.common.CoreConstants;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.playlist.PlaylistHeaderDto;
import com.yandex.music.shared.dto.universalentities.CarouselEntitiesDto;
import defpackage.a0k;
import defpackage.ahi;
import defpackage.asc;
import defpackage.b9c;
import defpackage.dak;
import defpackage.i8k;
import defpackage.lzc;
import defpackage.o3f;
import defpackage.r6n;
import defpackage.zgi;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J[\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\bH'¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0010\u0010\u0011JC\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\b\b\u0001\u0010\u0012\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\bH'¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0015\u0010\u0016J?\u0010\u001a\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00190\f0\u000b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0001\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H'¢\u0006\u0004\b\u001a\u0010\u001bJ9\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\b\b\u0001\u0010\u001c\u001a\u00020\u00022\b\b\u0001\u0010\u001d\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\u001e\u0010\u001fJE\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\b\b\u0001\u0010 \u001a\u00020\u00022\b\b\u0001\u0010!\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u00022\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b$\u0010%J)\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u0002H'¢\u0006\u0004\b'\u0010\u0011J9\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u0010(\u001a\u00020\u0002H'¢\u0006\u0004\b)\u0010*J3\u0010,\u001a\b\u0012\u0004\u0012\u00020&0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u0010+\u001a\u00020\u0002H'¢\u0006\u0004\b,\u0010*J9\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u0010-\u001a\u00020\u0002H'¢\u0006\u0004\b.\u0010*JI\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010/\u001a\u00020\b2\n\b\u0001\u00100\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b1\u00102J9\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u00104\u001a\u000203H'¢\u0006\u0004\b5\u00106J/\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u0002H'¢\u0006\u0004\b7\u0010\u0011J%\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\f0\u000b2\b\b\u0001\u00108\u001a\u00020\u0002H'¢\u0006\u0004\b:\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006;À\u0006\u0001"}, d2 = {"Lcom/yandex/music/shared/network/repositories/retrofit/UsersPlaylistApi;", "", "", "ownerUid", "kind", "", "richTracks", "withSimilarPlaylists", "", Constants.KEY_PAGE, "pageSize", "Lretrofit2/Call;", "Lcom/yandex/music/shared/backend_utils/MusicBackendResponse;", "Lcom/yandex/music/shared/dto/playlist/PlaylistHeaderDto;", "g", "(Ljava/lang/String;Ljava/lang/String;ZZII)Lretrofit2/Call;", "d", "(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;", "uuid", "k", "(Ljava/lang/String;ZII)Lretrofit2/Call;", "b", "(Ljava/lang/String;)Lretrofit2/Call;", "Lo3f;", "kinds", "", "f", "(Ljava/lang/String;Lo3f;)Lretrofit2/Call;", "owner", "type", CoreConstants.PushMessage.SERVICE_TYPE, "(Ljava/lang/String;Ljava/lang/String;Z)Lretrofit2/Call;", "uid", "title", "visibility", DeviceService.KEY_DESC, "o", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;", "", "l", "newName", "n", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;", "newDescription", "h", "newVisibility", "m", "revision", "diff", "e", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lretrofit2/Call;", "Lahi;", "filePart", "j", "(Ljava/lang/String;Ljava/lang/String;Lahi;)Lretrofit2/Call;", "c", "playlistId", "Lcom/yandex/music/shared/dto/universalentities/CarouselEntitiesDto;", "a", "shared-network-repositories"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public interface UsersPlaylistApi {
    @lzc("playlists/{playlistId}/similar-entities")
    @NotNull
    Call<MusicBackendResponse<CarouselEntitiesDto>> a(@dak("playlistId") @NotNull String playlistId);

    @lzc("playlist/{uuid}?rich-tracks=true")
    @NotNull
    Call<MusicBackendResponse<PlaylistHeaderDto>> b(@dak("uuid") String uuid);

    @a0k("users/{owner-uid}/playlists/{kinds}/cover/clear")
    @NotNull
    Call<MusicBackendResponse<PlaylistHeaderDto>> c(@dak("owner-uid") @NotNull String ownerUid, @dak("kinds") @NotNull String kinds);

    @lzc("users/{owner-uid}/playlists/{kind}?rich-tracks=true")
    @NotNull
    Call<MusicBackendResponse<PlaylistHeaderDto>> d(@dak("owner-uid") String ownerUid, @dak("kind") String kind);

    @a0k("users/{owner-uid}/playlists/{kinds}/change-relative")
    @asc
    @NotNull
    Call<MusicBackendResponse<PlaylistHeaderDto>> e(@dak("owner-uid") String ownerUid, @dak("kinds") String kinds, @r6n("revision") int revision, @b9c("diff") String diff);

    @lzc("users/{owner-uid}/playlists?rich-tracks=false&withLikesCount=true")
    @NotNull
    Call<MusicBackendResponse<List<PlaylistHeaderDto>>> f(@dak("owner-uid") String ownerUid, @r6n("kinds") @NotNull o3f kinds);

    @lzc("users/{owner-uid}/playlists/{kind}")
    @NotNull
    Call<MusicBackendResponse<PlaylistHeaderDto>> g(@dak("owner-uid") String ownerUid, @dak("kind") String kind, @r6n("rich-tracks") boolean richTracks, @r6n("withSimilarPlaylists") boolean withSimilarPlaylists, @r6n("page") int page, @r6n("pageSize") int pageSize);

    @a0k("users/{owner-uid}/playlists/{kinds}/description")
    @NotNull
    Call<Unit> h(@dak("owner-uid") @NotNull String ownerUid, @dak("kinds") @NotNull String kinds, @r6n("value") @NotNull String newDescription);

    @lzc("users/{owner}/playlists/special/{type}")
    @NotNull
    Call<MusicBackendResponse<PlaylistHeaderDto>> i(@dak("owner") @NotNull String owner, @dak("type") @NotNull String type, @r6n("richTracks") boolean richTracks);

    @a0k("users/{owner-uid}/playlists/{kinds}/cover/upload")
    @zgi
    @NotNull
    Call<MusicBackendResponse<PlaylistHeaderDto>> j(@dak("owner-uid") @NotNull String ownerUid, @dak("kinds") @NotNull String kinds, @i8k @NotNull ahi filePart);

    @lzc("playlist/{uuid}")
    @NotNull
    Call<MusicBackendResponse<PlaylistHeaderDto>> k(@dak("uuid") @NotNull String uuid, @r6n("rich-tracks") boolean richTracks, @r6n("page") int page, @r6n("pageSize") int pageSize);

    @a0k("users/{owner-uid}/playlists/{kinds}/delete")
    @NotNull
    Call<Unit> l(@dak("owner-uid") @NotNull String ownerUid, @dak("kinds") @NotNull String kinds);

    @a0k("users/{owner-uid}/playlists/{kinds}/visibility")
    @NotNull
    Call<MusicBackendResponse<PlaylistHeaderDto>> m(@dak("owner-uid") @NotNull String ownerUid, @dak("kinds") @NotNull String kinds, @r6n("value") @NotNull String newVisibility);

    @a0k("users/{owner-uid}/playlists/{kinds}/name")
    @NotNull
    Call<MusicBackendResponse<PlaylistHeaderDto>> n(@dak("owner-uid") @NotNull String ownerUid, @dak("kinds") @NotNull String kinds, @r6n("value") @NotNull String newName);

    @a0k("users/{owner-uid}/playlists/create")
    @NotNull
    Call<MusicBackendResponse<PlaylistHeaderDto>> o(@dak("owner-uid") @NotNull String uid, @r6n("title") @NotNull String title, @r6n("visibility") @NotNull String visibility, @r6n("description") String description);
}
