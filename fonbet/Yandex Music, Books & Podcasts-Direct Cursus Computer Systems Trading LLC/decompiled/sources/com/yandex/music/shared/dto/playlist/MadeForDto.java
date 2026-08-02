package com.yandex.music.shared.dto.playlist;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import com.yandex.music.shared.dto.UserDto;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/music/shared/dto/playlist/MadeForDto;", "", "Lcom/yandex/music/shared/dto/UserDto;", "userInfo", "Lcom/yandex/music/shared/dto/playlist/UserCaseFormsDto;", "caseForms", "<init>", "(Lcom/yandex/music/shared/dto/UserDto;Lcom/yandex/music/shared/dto/playlist/UserCaseFormsDto;)V", "Lcom/yandex/music/shared/dto/UserDto;", "b", "()Lcom/yandex/music/shared/dto/UserDto;", "Lcom/yandex/music/shared/dto/playlist/UserCaseFormsDto;", "a", "()Lcom/yandex/music/shared/dto/playlist/UserCaseFormsDto;", "shared-model-parsers"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class MadeForDto {

    @SerializedName("caseForms")
    private final UserCaseFormsDto caseForms;

    @SerializedName("userInfo")
    private final UserDto userInfo;

    public MadeForDto(UserDto userDto, UserCaseFormsDto userCaseFormsDto) {
        this.userInfo = userDto;
        this.caseForms = userCaseFormsDto;
    }

    /* renamed from: a, reason: from getter */
    public final UserCaseFormsDto getCaseForms() {
        return this.caseForms;
    }

    /* renamed from: b, reason: from getter */
    public final UserDto getUserInfo() {
        return this.userInfo;
    }
}
