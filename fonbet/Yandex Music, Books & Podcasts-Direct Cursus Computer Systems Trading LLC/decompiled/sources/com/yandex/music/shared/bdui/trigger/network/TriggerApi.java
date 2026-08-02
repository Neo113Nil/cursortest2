package com.yandex.music.shared.bdui.trigger.network;

import com.connectsdk.service.command.ServiceCommand;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.bdui.trigger.network.dto.MediaCrmEventRequestDto;
import com.yandex.music.shared.bdui.trigger.network.dto.TriggerActionRequestDto;
import com.yandex.music.shared.bdui.trigger.network.dto.TriggerListsDto;
import com.yandex.music.shared.bdui.trigger.network.dto.TriggerPollingRequestDto;
import com.yandex.music.shared.bdui.trigger.network.dto.TriggerShownRequestDto;
import defpackage.a0k;
import defpackage.k83;
import defpackage.v2j;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH'¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lcom/yandex/music/shared/bdui/trigger/network/TriggerApi;", "", "Lcom/yandex/music/shared/bdui/trigger/network/dto/TriggerPollingRequestDto;", ServiceCommand.TYPE_REQ, "Lretrofit2/Call;", "Lcom/yandex/music/shared/backend_utils/MusicBackendResponse;", "Lcom/yandex/music/shared/bdui/trigger/network/dto/TriggerListsDto;", "a", "(Lcom/yandex/music/shared/bdui/trigger/network/dto/TriggerPollingRequestDto;)Lretrofit2/Call;", "Lcom/yandex/music/shared/bdui/trigger/network/dto/TriggerShownRequestDto;", "d", "(Lcom/yandex/music/shared/bdui/trigger/network/dto/TriggerShownRequestDto;)Lretrofit2/Call;", "Lcom/yandex/music/shared/bdui/trigger/network/dto/TriggerActionRequestDto;", "c", "(Lcom/yandex/music/shared/bdui/trigger/network/dto/TriggerActionRequestDto;)Lretrofit2/Call;", "Lcom/yandex/music/shared/bdui/trigger/network/dto/MediaCrmEventRequestDto;", "", "b", "(Lcom/yandex/music/shared/bdui/trigger/network/dto/MediaCrmEventRequestDto;)Lretrofit2/Call;", "shared-bdui-trigger"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public interface TriggerApi {
    @a0k("dynamic-pages/v2/trigger/polling")
    @v2j
    @NotNull
    Call<MusicBackendResponse<TriggerListsDto>> a(@k83 @NotNull TriggerPollingRequestDto request);

    @a0k("dynamic-pages/mediacrm/event")
    @NotNull
    Call<Unit> b(@k83 @NotNull MediaCrmEventRequestDto request);

    @a0k("dynamic-pages/v2/trigger/action")
    @v2j
    @NotNull
    Call<MusicBackendResponse<TriggerListsDto>> c(@k83 @NotNull TriggerActionRequestDto request);

    @a0k("dynamic-pages/v2/trigger/shown")
    @v2j
    @NotNull
    Call<MusicBackendResponse<TriggerListsDto>> d(@k83 @NotNull TriggerShownRequestDto request);
}
