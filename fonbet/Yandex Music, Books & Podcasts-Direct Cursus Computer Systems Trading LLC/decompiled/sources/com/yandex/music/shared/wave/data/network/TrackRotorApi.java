package com.yandex.music.shared.wave.data.network;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.wave.data.network.request.SessionCloneRequestDto;
import com.yandex.music.shared.wave.data.network.request.SessionFeedbacksRequestDto;
import com.yandex.music.shared.wave.data.network.request.SessionNewRequestDto;
import com.yandex.music.shared.wave.data.network.request.SessionTracksRequestDto;
import com.yandex.music.shared.wave.data.network.response.SessionNewResponseDto;
import com.yandex.music.shared.wave.data.network.response.SessionTracksResponseDto;
import defpackage.a0k;
import defpackage.dak;
import defpackage.k83;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\nJ%\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u0014H'¢\u0006\u0004\b\u0017\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Lcom/yandex/music/shared/wave/data/network/TrackRotorApi;", "", "", "radioSessionId", "Lcom/yandex/music/shared/wave/data/network/request/SessionCloneRequestDto;", "sessionCloneRequest", "Lretrofit2/Call;", "Lcom/yandex/music/shared/backend_utils/MusicBackendResponse;", "Lcom/yandex/music/shared/wave/data/network/response/SessionNewResponseDto;", "d", "(Ljava/lang/String;Lcom/yandex/music/shared/wave/data/network/request/SessionCloneRequestDto;)Lretrofit2/Call;", "Lcom/yandex/music/shared/wave/data/network/request/SessionNewRequestDto;", "sessionNewRequest", "b", "(Lcom/yandex/music/shared/wave/data/network/request/SessionNewRequestDto;)Lretrofit2/Call;", "Lcom/yandex/music/shared/wave/data/network/request/SessionTracksRequestDto;", "sessionTracksRequest", "Lcom/yandex/music/shared/wave/data/network/response/SessionTracksResponseDto;", "c", "(Ljava/lang/String;Lcom/yandex/music/shared/wave/data/network/request/SessionTracksRequestDto;)Lretrofit2/Call;", "Lcom/yandex/music/shared/wave/data/network/request/SessionFeedbacksRequestDto;", "feedbacksRequest", "", "a", "(Lcom/yandex/music/shared/wave/data/network/request/SessionFeedbacksRequestDto;)Lretrofit2/Call;", "shared-wave"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public interface TrackRotorApi {
    @a0k("rotor/sessions/feedbacks")
    @NotNull
    Call<Unit> a(@k83 @NotNull SessionFeedbacksRequestDto feedbacksRequest);

    @a0k("rotor/session/new")
    @NotNull
    Call<MusicBackendResponse<SessionNewResponseDto>> b(@k83 @NotNull SessionNewRequestDto sessionNewRequest);

    @a0k("rotor/session/{radioSessionId}/tracks")
    @NotNull
    Call<MusicBackendResponse<SessionTracksResponseDto>> c(@dak("radioSessionId") @NotNull String radioSessionId, @k83 @NotNull SessionTracksRequestDto sessionTracksRequest);

    @a0k("rotor/session/{sessionId}/clone")
    @NotNull
    Call<MusicBackendResponse<SessionNewResponseDto>> d(@dak("sessionId") @NotNull String radioSessionId, @k83 @NotNull SessionCloneRequestDto sessionCloneRequest);
}
