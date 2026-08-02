package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.dto.playlist.PlaylistHeaderDto;
import com.yandex.music.shared.network.api.retrofit.MusicBackendHttpException;
import com.yandex.music.shared.network.api.retrofit.MusicCommonHttpException;
import com.yandex.music.shared.network.repositories.retrofit.UsersPlaylistApi;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

@hch(key = "UsersPlaylistWithRichTracksApi")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\ba\u0018\u00002\u00020\u0001:\u0001\u000fJ6\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0097@¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\r\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0097@¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Leut;", "Luci;", "", "ownerId", "kind", "", "force", "Lcom/yandex/music/shared/network/repositories/retrofit/UsersPlaylistApi;", "api", "Lcom/yandex/music/shared/dto/playlist/PlaylistHeaderDto;", "n", "(Ljava/lang/String;Ljava/lang/String;ZLcom/yandex/music/shared/network/repositories/retrofit/UsersPlaylistApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uuid", "e", "(Ljava/lang/String;ZLcom/yandex/music/shared/network/repositories/retrofit/UsersPlaylistApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "shared-network-repositories"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public interface eut extends uci {
    public static final a o = a.p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Leut$a;", "Leut;", "<init>", "()V", "shared-network-repositories"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class a implements eut {
        public static final /* synthetic */ a p = new a();

        private a() {
        }
    }

    @hch(key = "getUserPlaylistWithRichTracksUuid")
    @hbt(time = 1, unit = TimeUnit.HOURS)
    static /* synthetic */ Object K(eut eutVar, @eaf String str, @arc boolean z, UsersPlaylistApi usersPlaylistApi, Continuation<? super PlaylistHeaderDto> continuation) throws IOException, MusicCommonHttpException, MusicBackendHttpException {
        return eutVar.B(usersPlaylistApi.b(str), continuation);
    }

    @hch(key = "getUserPlaylistWithRichTracks")
    @hbt(time = 1, unit = TimeUnit.HOURS)
    static /* synthetic */ Object s(eut eutVar, @eaf String str, @eaf String str2, @arc boolean z, UsersPlaylistApi usersPlaylistApi, Continuation<? super PlaylistHeaderDto> continuation) throws IOException, MusicCommonHttpException, MusicBackendHttpException {
        return eutVar.B(usersPlaylistApi.d(str, str2), continuation);
    }

    @hch(key = "getUserPlaylistWithRichTracksUuid")
    @hbt(time = 1, unit = TimeUnit.HOURS)
    default Object e(@eaf @NotNull String str, @arc boolean z, @NotNull UsersPlaylistApi usersPlaylistApi, @NotNull Continuation<? super PlaylistHeaderDto> continuation) throws IOException, MusicCommonHttpException, MusicBackendHttpException {
        return K(this, str, z, usersPlaylistApi, continuation);
    }

    @hch(key = "getUserPlaylistWithRichTracks")
    @hbt(time = 1, unit = TimeUnit.HOURS)
    default Object n(@eaf @NotNull String str, @eaf @NotNull String str2, @arc boolean z, @NotNull UsersPlaylistApi usersPlaylistApi, @NotNull Continuation<? super PlaylistHeaderDto> continuation) throws IOException, MusicCommonHttpException, MusicBackendHttpException {
        return s(this, str, str2, z, usersPlaylistApi, continuation);
    }
}
