package com.yandex.music.shared.network.repositories.retrofit;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.account.AccountAboutDto;
import defpackage.a0k;
import defpackage.ahi;
import defpackage.c3s;
import defpackage.i8k;
import defpackage.lzc;
import defpackage.yqq;
import defpackage.zgi;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0007\u0010\bJA\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\t2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\rH'¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lcom/yandex/music/shared/network/repositories/retrofit/AccountApi;", "", "Lyqq;", "skipAuthHandling", "Lretrofit2/Call;", "Lcom/yandex/music/shared/backend_utils/MusicBackendResponse;", "Lcom/yandex/music/shared/dto/account/AccountAboutDto;", "a", "(Lyqq;)Lretrofit2/Call;", "", "feedbackType", Constants.KEY_MESSAGE, "email", "Lahi;", "filePart", "", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lahi;)Lretrofit2/Call;", "shared-network-repositories"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public interface AccountApi {
    @lzc("account/about")
    @NotNull
    Call<MusicBackendResponse<AccountAboutDto>> a(@c3s yqq skipAuthHandling);

    @a0k("account/feedback")
    @zgi
    @NotNull
    Call<Unit> b(@i8k("feedbackType") @NotNull String feedbackType, @i8k("message") @NotNull String message, @i8k("email") String email, @i8k ahi filePart);
}
