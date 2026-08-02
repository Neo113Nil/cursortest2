package com.yandex.music.shared.slides.ui.music.logic.impl.network.model;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import com.yandex.metrica.push.common.CoreConstants;
import defpackage.f1d;
import defpackage.su4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/SlideBackgroundDto;", "", "", "bgImageUrl", "videoUrl", "videoId", "firstFrameHash", "firstFrameVideoUrl", "lastFrameVideoUrl", "", "withSound", "withPersonalColor", "videoLoopEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "g", "e", "b", "c", "d", "Ljava/lang/Boolean;", CoreConstants.PushMessage.SERVICE_TYPE, "()Ljava/lang/Boolean;", "h", "f", "shared-slides-ui-music-logic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final /* data */ class SlideBackgroundDto {

    @SerializedName("bgImageUrl")
    private final String bgImageUrl;

    @SerializedName("firstFrameThumbHash")
    private final String firstFrameHash;

    @SerializedName("firstFrameVideoUrl")
    private final String firstFrameVideoUrl;

    @SerializedName("lastFrameVideoUrl")
    private final String lastFrameVideoUrl;

    @SerializedName("videoId")
    private final String videoId;

    @SerializedName("videoLoopEnabled")
    private final Boolean videoLoopEnabled;

    @SerializedName("videoUrl")
    private final String videoUrl;

    @SerializedName("withPersonalColor")
    private final Boolean withPersonalColor;

    @SerializedName("withSound")
    private final Boolean withSound;

    public SlideBackgroundDto(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, Boolean bool3) {
        this.bgImageUrl = str;
        this.videoUrl = str2;
        this.videoId = str3;
        this.firstFrameHash = str4;
        this.firstFrameVideoUrl = str5;
        this.lastFrameVideoUrl = str6;
        this.withSound = bool;
        this.withPersonalColor = bool2;
        this.videoLoopEnabled = bool3;
    }

    /* renamed from: a, reason: from getter */
    public final String getBgImageUrl() {
        return this.bgImageUrl;
    }

    /* renamed from: b, reason: from getter */
    public final String getFirstFrameHash() {
        return this.firstFrameHash;
    }

    /* renamed from: c, reason: from getter */
    public final String getFirstFrameVideoUrl() {
        return this.firstFrameVideoUrl;
    }

    /* renamed from: d, reason: from getter */
    public final String getLastFrameVideoUrl() {
        return this.lastFrameVideoUrl;
    }

    /* renamed from: e, reason: from getter */
    public final String getVideoId() {
        return this.videoId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlideBackgroundDto)) {
            return false;
        }
        SlideBackgroundDto slideBackgroundDto = (SlideBackgroundDto) obj;
        return Intrinsics.d(this.bgImageUrl, slideBackgroundDto.bgImageUrl) && Intrinsics.d(this.videoUrl, slideBackgroundDto.videoUrl) && Intrinsics.d(this.videoId, slideBackgroundDto.videoId) && Intrinsics.d(this.firstFrameHash, slideBackgroundDto.firstFrameHash) && Intrinsics.d(this.firstFrameVideoUrl, slideBackgroundDto.firstFrameVideoUrl) && Intrinsics.d(this.lastFrameVideoUrl, slideBackgroundDto.lastFrameVideoUrl) && Intrinsics.d(this.withSound, slideBackgroundDto.withSound) && Intrinsics.d(this.withPersonalColor, slideBackgroundDto.withPersonalColor) && Intrinsics.d(this.videoLoopEnabled, slideBackgroundDto.videoLoopEnabled);
    }

    /* renamed from: f, reason: from getter */
    public final Boolean getVideoLoopEnabled() {
        return this.videoLoopEnabled;
    }

    /* renamed from: g, reason: from getter */
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    /* renamed from: h, reason: from getter */
    public final Boolean getWithPersonalColor() {
        return this.withPersonalColor;
    }

    public final int hashCode() {
        String str = this.bgImageUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.videoUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.videoId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.firstFrameHash;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.firstFrameVideoUrl;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.lastFrameVideoUrl;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.withSound;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.withPersonalColor;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.videoLoopEnabled;
        return hashCode8 + (bool3 != null ? bool3.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final Boolean getWithSound() {
        return this.withSound;
    }

    public final String toString() {
        String str = this.bgImageUrl;
        String str2 = this.videoUrl;
        String str3 = this.videoId;
        String str4 = this.firstFrameHash;
        String str5 = this.firstFrameVideoUrl;
        String str6 = this.lastFrameVideoUrl;
        Boolean bool = this.withSound;
        Boolean bool2 = this.withPersonalColor;
        Boolean bool3 = this.videoLoopEnabled;
        StringBuilder m = f1d.m("SlideBackgroundDto(bgImageUrl=", str, ", videoUrl=", str2, ", videoId=");
        su4.v(m, str3, ", firstFrameHash=", str4, ", firstFrameVideoUrl=");
        su4.v(m, str5, ", lastFrameVideoUrl=", str6, ", withSound=");
        m.append(bool);
        m.append(", withPersonalColor=");
        m.append(bool2);
        m.append(", videoLoopEnabled=");
        m.append(bool3);
        m.append(")");
        return m.toString();
    }
}
