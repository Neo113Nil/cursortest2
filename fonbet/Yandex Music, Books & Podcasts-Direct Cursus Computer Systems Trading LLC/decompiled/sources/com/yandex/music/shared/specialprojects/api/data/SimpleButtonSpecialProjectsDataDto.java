package com.yandex.music.shared.specialprojects.api.data;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import com.yandex.music.shared.dto.domainitem.BlockActionDto;
import defpackage.f1d;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/music/shared/specialprojects/api/data/SimpleButtonSpecialProjectsDataDto;", "", "", "title", "buttonColor", "textColor", "Lcom/yandex/music/shared/dto/domainitem/BlockActionDto;", Constants.KEY_ACTION, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/music/shared/dto/domainitem/BlockActionDto;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getButtonColor", "getTextColor", "Lcom/yandex/music/shared/dto/domainitem/BlockActionDto;", "getAction", "()Lcom/yandex/music/shared/dto/domainitem/BlockActionDto;", "shared-special-projects"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final /* data */ class SimpleButtonSpecialProjectsDataDto {

    @SerializedName(Constants.KEY_ACTION)
    private final BlockActionDto action;

    @SerializedName("buttonColor")
    private final String buttonColor;

    @SerializedName("textColor")
    private final String textColor;

    @SerializedName("title")
    private final String title;

    public SimpleButtonSpecialProjectsDataDto(String str, String str2, String str3, BlockActionDto blockActionDto) {
        this.title = str;
        this.buttonColor = str2;
        this.textColor = str3;
        this.action = blockActionDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleButtonSpecialProjectsDataDto)) {
            return false;
        }
        SimpleButtonSpecialProjectsDataDto simpleButtonSpecialProjectsDataDto = (SimpleButtonSpecialProjectsDataDto) obj;
        return Intrinsics.d(this.title, simpleButtonSpecialProjectsDataDto.title) && Intrinsics.d(this.buttonColor, simpleButtonSpecialProjectsDataDto.buttonColor) && Intrinsics.d(this.textColor, simpleButtonSpecialProjectsDataDto.textColor) && Intrinsics.d(this.action, simpleButtonSpecialProjectsDataDto.action);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.buttonColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.textColor;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BlockActionDto blockActionDto = this.action;
        return hashCode3 + (blockActionDto != null ? blockActionDto.hashCode() : 0);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.buttonColor;
        String str3 = this.textColor;
        BlockActionDto blockActionDto = this.action;
        StringBuilder m = f1d.m("SimpleButtonSpecialProjectsDataDto(title=", str, ", buttonColor=", str2, ", textColor=");
        m.append(str3);
        m.append(", action=");
        m.append(blockActionDto);
        m.append(")");
        return m.toString();
    }
}
