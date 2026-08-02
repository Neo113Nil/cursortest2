package com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.f1d;
import defpackage.su4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/content/TextSlideDataDto;", "", "", "title", "subtitle", "align", "titleSize", "Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/content/SlideDisclaimerDto;", "disclaimer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/content/SlideDisclaimerDto;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "a", "e", "Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/content/SlideDisclaimerDto;", "b", "()Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/content/SlideDisclaimerDto;", "shared-slides-ui-music-logic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final /* data */ class TextSlideDataDto {

    @SerializedName("align")
    private final String align;

    @SerializedName("disclaimer")
    private final SlideDisclaimerDto disclaimer;

    @SerializedName("subtitle")
    private final String subtitle;

    @SerializedName("title")
    private final String title;

    @SerializedName("titleSize")
    private final String titleSize;

    public TextSlideDataDto(String str, String str2, String str3, String str4, SlideDisclaimerDto slideDisclaimerDto) {
        this.title = str;
        this.subtitle = str2;
        this.align = str3;
        this.titleSize = str4;
        this.disclaimer = slideDisclaimerDto;
    }

    /* renamed from: a, reason: from getter */
    public final String getAlign() {
        return this.align;
    }

    /* renamed from: b, reason: from getter */
    public final SlideDisclaimerDto getDisclaimer() {
        return this.disclaimer;
    }

    /* renamed from: c, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: e, reason: from getter */
    public final String getTitleSize() {
        return this.titleSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextSlideDataDto)) {
            return false;
        }
        TextSlideDataDto textSlideDataDto = (TextSlideDataDto) obj;
        return Intrinsics.d(this.title, textSlideDataDto.title) && Intrinsics.d(this.subtitle, textSlideDataDto.subtitle) && Intrinsics.d(this.align, textSlideDataDto.align) && Intrinsics.d(this.titleSize, textSlideDataDto.titleSize) && Intrinsics.d(this.disclaimer, textSlideDataDto.disclaimer);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.align;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.titleSize;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        SlideDisclaimerDto slideDisclaimerDto = this.disclaimer;
        return hashCode4 + (slideDisclaimerDto != null ? slideDisclaimerDto.hashCode() : 0);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.align;
        String str4 = this.titleSize;
        SlideDisclaimerDto slideDisclaimerDto = this.disclaimer;
        StringBuilder m = f1d.m("TextSlideDataDto(title=", str, ", subtitle=", str2, ", align=");
        su4.v(m, str3, ", titleSize=", str4, ", disclaimer=");
        m.append(slideDisclaimerDto);
        m.append(")");
        return m.toString();
    }
}
