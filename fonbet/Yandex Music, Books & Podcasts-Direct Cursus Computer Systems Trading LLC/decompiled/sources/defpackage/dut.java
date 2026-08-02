package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.dto.playlist.PlaylistHeaderDto;
import com.yandex.music.shared.network.api.retrofit.MusicBackendHttpException;
import com.yandex.music.shared.network.api.retrofit.MusicCommonHttpException;
import com.yandex.music.shared.network.repositories.retrofit.UsersPlaylistApi;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

@hch(key = "UsersPlaylistRequestApi")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\ba\u0018\u00002\u00020\u0001:\u0001\u0014J^\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\b2\b\b\u0003\u0010\u000b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0097@¢\u0006\u0004\b\u000f\u0010\u0010JJ\u0010\u0012\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\b2\b\b\u0003\u0010\u000b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0097@¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Ldut;", "Luci;", "", "ownerUid", "kind", "", "richTracks", "withSimilarPlaylists", "", Constants.KEY_PAGE, "pageSize", "force", "Lcom/yandex/music/shared/network/repositories/retrofit/UsersPlaylistApi;", "api", "Lcom/yandex/music/shared/dto/playlist/PlaylistHeaderDto;", "o", "(Ljava/lang/String;Ljava/lang/String;ZZIIZLcom/yandex/music/shared/network/repositories/retrofit/UsersPlaylistApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uuid", "d", "(Ljava/lang/String;ZIIZLcom/yandex/music/shared/network/repositories/retrofit/UsersPlaylistApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "shared-network-repositories"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public interface dut extends uci {
    public static final a n = a.p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldut$a;", "Ldut;", "<init>", "()V", "shared-network-repositories"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class a implements dut {
        public static final /* synthetic */ a p = new a();

        private a() {
        }
    }

    @hch(key = "getUserPlaylistUuid")
    @hbt(time = 1, unit = TimeUnit.HOURS)
    static /* synthetic */ Object F(dut dutVar, @eaf String str, @eaf boolean z, @eaf int i, @eaf int i2, @arc boolean z2, UsersPlaylistApi usersPlaylistApi, Continuation<? super PlaylistHeaderDto> continuation) throws IOException, MusicCommonHttpException, MusicBackendHttpException {
        return dutVar.B(usersPlaylistApi.k(str, z, i, i2), continuation);
    }

    static /* synthetic */ Object L(dut dutVar, String str, boolean z, int i, int i2, boolean z2, UsersPlaylistApi usersPlaylistApi, Continuation continuation, int i3, Object obj) throws IOException, MusicCommonHttpException, MusicBackendHttpException {
        if (obj != null) {
            qq6.d("Super calls with default arguments not supported in this target, function: getUserPlaylist");
            return null;
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return dutVar.d(str, z, i, i2, z2, usersPlaylistApi, continuation);
    }

    @hch(key = "getUserPlaylistByKind")
    @hbt(time = 1, unit = TimeUnit.HOURS)
    static /* synthetic */ Object f(dut dutVar, @eaf String str, @eaf String str2, @eaf boolean z, @eaf boolean z2, @eaf int i, @eaf int i2, @arc boolean z3, UsersPlaylistApi usersPlaylistApi, Continuation<? super PlaylistHeaderDto> continuation) throws IOException, MusicCommonHttpException, MusicBackendHttpException {
        return dutVar.B(usersPlaylistApi.g(str, str2, z, z2, i, i2), continuation);
    }

    @hch(key = "getUserPlaylistUuid")
    @hbt(time = 1, unit = TimeUnit.HOURS)
    default Object d(@eaf @NotNull String str, @eaf boolean z, @eaf int i, @eaf int i2, @arc boolean z2, @NotNull UsersPlaylistApi usersPlaylistApi, @NotNull Continuation<? super PlaylistHeaderDto> continuation) throws IOException, MusicCommonHttpException, MusicBackendHttpException {
        return F(this, str, z, i, i2, z2, usersPlaylistApi, continuation);
    }

    @hch(key = "getUserPlaylistByKind")
    @hbt(time = 1, unit = TimeUnit.HOURS)
    default Object o(@eaf @NotNull String str, @eaf @NotNull String str2, @eaf boolean z, @eaf boolean z2, @eaf int i, @eaf int i2, @arc boolean z3, @NotNull UsersPlaylistApi usersPlaylistApi, @NotNull Continuation<? super PlaylistHeaderDto> continuation) throws IOException, MusicCommonHttpException, MusicBackendHttpException {
        return f(this, str, str2, z, z2, i, i2, z3, usersPlaylistApi, continuation);
    }
}
