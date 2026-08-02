package com.yandex.music.shared.network.repositories.retrofit;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.track.TrackDto;
import com.yandex.music.shared.dto.universalentities.CarouselEntitiesDto;
import defpackage.a0k;
import defpackage.asc;
import defpackage.b9c;
import defpackage.dak;
import defpackage.lzc;
import defpackage.o3f;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\u00050\u00042\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\b\b\u0003\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u000f\u0010\u0010J=\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\u00050\u00042\u000e\b\u0001\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\t2\b\b\u0003\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u0013\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lcom/yandex/music/shared/network/repositories/retrofit/TracksApi;", "", "", "trackId", "Lretrofit2/Call;", "Lcom/yandex/music/shared/backend_utils/MusicBackendResponse;", "Lcom/yandex/music/shared/dto/universalentities/CarouselEntitiesDto;", "a", "(Ljava/lang/String;)Lretrofit2/Call;", "Lo3f;", "trackIds", "", "withMixData", "", "Lcom/yandex/music/shared/dto/track/TrackDto;", "b", "(Lo3f;Z)Lretrofit2/Call;", "Ljya;", "trackTuples", "c", "shared-network-repositories"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public interface TracksApi {
    @lzc("tracks/{trackId}/similar-entities")
    @NotNull
    Call<MusicBackendResponse<CarouselEntitiesDto>> a(@dak("trackId") @NotNull String trackId);

    @a0k("tracks?with-positions=true")
    @asc
    @NotNull
    Call<MusicBackendResponse<List<TrackDto>>> b(@b9c("trackIds") @NotNull o3f trackIds, @b9c("withMixData") boolean withMixData);

    @a0k("tracks?with-positions=true")
    @asc
    @NotNull
    Call<MusicBackendResponse<List<TrackDto>>> c(@b9c("trackIds") @NotNull o3f trackTuples, @b9c("withMixData") boolean withMixData);
}
