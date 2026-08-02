package com.yandex.music.shared.slides.ui.music.logic.impl.network.model;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.f1d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/LikeButtonStateDataDto;", "", "", "title", "buttonColor", "textColor", "", "enabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "a", "c", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "shared-slides-ui-music-logic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final /* data */ class LikeButtonStateDataDto {

    @SerializedName("buttonColor")
    private final String buttonColor;

    @SerializedName("enabled")
    private final Boolean enabled;

    @SerializedName("textColor")
    private final String textColor;

    @SerializedName("title")
    private final String title;

    public LikeButtonStateDataDto(String str, String str2, String str3, Boolean bool) {
        this.title = str;
        this.buttonColor = str2;
        this.textColor = str3;
        this.enabled = bool;
    }

    /* renamed from: a, reason: from getter */
    public final String getButtonColor() {
        return this.buttonColor;
    }

    /* renamed from: b, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: c, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LikeButtonStateDataDto)) {
            return false;
        }
        LikeButtonStateDataDto likeButtonStateDataDto = (LikeButtonStateDataDto) obj;
        return Intrinsics.d(this.title, likeButtonStateDataDto.title) && Intrinsics.d(this.buttonColor, likeButtonStateDataDto.buttonColor) && Intrinsics.d(this.textColor, likeButtonStateDataDto.textColor) && Intrinsics.d(this.enabled, likeButtonStateDataDto.enabled);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.buttonColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.textColor;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.enabled;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.buttonColor;
        String str3 = this.textColor;
        Boolean bool = this.enabled;
        StringBuilder m = f1d.m("LikeButtonStateDataDto(title=", str, ", buttonColor=", str2, ", textColor=");
        m.append(str3);
        m.append(", enabled=");
        m.append(bool);
        m.append(")");
        return m.toString();
    }
}
