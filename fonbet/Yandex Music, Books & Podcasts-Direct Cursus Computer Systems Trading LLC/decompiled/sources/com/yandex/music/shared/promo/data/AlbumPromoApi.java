package com.yandex.music.shared.promo.data;

import com.connectsdk.service.command.ServiceCommand;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import defpackage.a0k;
import defpackage.awd;
import defpackage.b80;
import defpackage.c3s;
import defpackage.k83;
import defpackage.kpt;
import defpackage.lzc;
import defpackage.v2j;
import defpackage.xtd;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J;\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\b0\u00072\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lcom/yandex/music/shared/promo/data/AlbumPromoApi;", "", "", "url", "Lb80;", "analyticsKey", "cacheControl", "Lretrofit2/Call;", "Lcom/yandex/music/shared/backend_utils/MusicBackendResponse;", "Lcom/yandex/music/shared/promo/data/AlbumPromoListDto;", "b", "(Ljava/lang/String;Lb80;Ljava/lang/String;)Lretrofit2/Call;", "Lcom/yandex/music/shared/promo/data/AlbumPromoFeedbackRequest;", ServiceCommand.TYPE_REQ, "", "a", "(Lcom/yandex/music/shared/promo/data/AlbumPromoFeedbackRequest;)Lretrofit2/Call;", "shared-promo"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public interface AlbumPromoApi {
    @a0k("promo/feedback")
    @NotNull
    @v2j
    @awd({"X-Yandex-Music-Without-Invocation-Info: true"})
    Call<MusicBackendResponse<Unit>> a(@k83 @NotNull AlbumPromoFeedbackRequest request);

    @lzc
    @NotNull
    @v2j
    @awd({"X-Yandex-Music-Without-Invocation-Info: true"})
    Call<MusicBackendResponse<AlbumPromoListDto>> b(@kpt @NotNull String url, @c3s @NotNull b80 analyticsKey, @xtd("Cache-Control") String cacheControl);
}
