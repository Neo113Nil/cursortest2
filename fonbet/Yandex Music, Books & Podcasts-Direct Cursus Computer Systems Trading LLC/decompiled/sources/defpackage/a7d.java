package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.dto.artist.ArtistBriefInfoDto;
import com.yandex.music.shared.network.api.retrofit.MusicBackendHttpException;
import com.yandex.music.shared.network.api.retrofit.MusicCommonHttpException;
import com.yandex.music.shared.network.repositories.retrofit.ArtistBriefInfoApi;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

@vx7
@hch(key = "GetArtistBriefInfoRequestApi")
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u000fJJ\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0097@¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"La7d;", "Luci;", "", "artistId", "", "extendedVideoClipFormat", "discographyBlockEnabled", "", "popularTracksCount", "force", "Lcom/yandex/music/shared/network/repositories/retrofit/ArtistBriefInfoApi;", "api", "Lcom/yandex/music/shared/dto/artist/ArtistBriefInfoDto;", "t", "(Ljava/lang/String;ZZIZLcom/yandex/music/shared/network/repositories/retrofit/ArtistBriefInfoApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "shared-network-repositories"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public interface a7d extends uci {
    public static final a i = a.p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La7d$a;", "La7d;", "<init>", "()V", "shared-network-repositories"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class a implements a7d {
        public static final /* synthetic */ a p = new a();

        private a() {
        }
    }

    @hbt(time = 1, unit = TimeUnit.DAYS)
    @vx7
    @hch(key = "getArtistBriefInfo")
    static /* synthetic */ Object D(a7d a7dVar, @eaf String str, @eaf boolean z, @eaf boolean z2, @eaf int i2, @arc boolean z3, ArtistBriefInfoApi artistBriefInfoApi, Continuation<? super ArtistBriefInfoDto> continuation) throws IOException, MusicCommonHttpException, MusicBackendHttpException {
        return a7dVar.B(artistBriefInfoApi.a(str, z, z2, i2), continuation);
    }

    @hbt(time = 1, unit = TimeUnit.DAYS)
    @vx7
    @hch(key = "getArtistBriefInfo")
    default Object t(@eaf @NotNull String str, @eaf boolean z, @eaf boolean z2, @eaf int i2, @arc boolean z3, @NotNull ArtistBriefInfoApi artistBriefInfoApi, @NotNull Continuation<? super ArtistBriefInfoDto> continuation) throws IOException, MusicCommonHttpException, MusicBackendHttpException {
        return D(this, str, z, z2, i2, z3, artistBriefInfoApi, continuation);
    }
}
