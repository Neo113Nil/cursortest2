package com.yandex.music.skeleton.blocks.concerts.data;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import defpackage.awd;
import defpackage.b80;
import defpackage.c3s;
import defpackage.kpt;
import defpackage.lzc;
import defpackage.r6n;
import defpackage.v2j;
import defpackage.xtd;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JG\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/yandex/music/skeleton/blocks/concerts/data/ConcertsBlockApi;", "", "", "url", "Lb80;", "analyticsKey", "cacheControl", "locations", "Lretrofit2/Call;", "Lcom/yandex/music/shared/backend_utils/MusicBackendResponse;", "Lcom/yandex/music/skeleton/blocks/concerts/data/ConcertTopListDto;", "a", "(Ljava/lang/String;Lb80;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;", "skeleton-blocks"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public interface ConcertsBlockApi {
    @lzc
    @NotNull
    @v2j
    @awd({"X-Yandex-Music-Without-Invocation-Info: true"})
    Call<MusicBackendResponse<ConcertTopListDto>> a(@kpt @NotNull String url, @c3s @NotNull b80 analyticsKey, @xtd("Cache-Control") String cacheControl, @r6n("locations") String locations);
}
