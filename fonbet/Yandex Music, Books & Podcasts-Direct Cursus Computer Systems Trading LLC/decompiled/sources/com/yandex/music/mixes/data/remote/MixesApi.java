package com.yandex.music.mixes.data.remote;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import defpackage.awd;
import defpackage.b80;
import defpackage.c3s;
import defpackage.kpt;
import defpackage.lzc;
import defpackage.v2j;
import defpackage.xtd;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J=\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H'¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/yandex/music/mixes/data/remote/MixesApi;", "", "", "url", "Lb80;", "analyticsKey", "cacheControl", "Lretrofit2/Call;", "Lcom/yandex/music/shared/backend_utils/MusicBackendResponse;", "Lcom/yandex/music/mixes/data/remote/MixesEntitiesDto;", "b", "(Ljava/lang/String;Lb80;Ljava/lang/String;)Lretrofit2/Call;", "a", "()Lretrofit2/Call;", "mixes-screens"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public interface MixesApi {
    @lzc("landing/block/mixes?fullList=true")
    @NotNull
    @v2j
    @awd({"X-Yandex-Music-Without-Invocation-Info: true"})
    Call<MusicBackendResponse<MixesEntitiesDto>> a();

    @lzc
    @NotNull
    @v2j
    @awd({"X-Yandex-Music-Without-Invocation-Info: true"})
    Call<MusicBackendResponse<MixesEntitiesDto>> b(@kpt @NotNull String url, @c3s b80 analyticsKey, @xtd("Cache-Control") String cacheControl);
}
