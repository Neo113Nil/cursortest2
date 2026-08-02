package com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.f1d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/content/ThenNowComparisonSlideDataDto;", "", "", "title", "subtitle", "Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/content/ThenNowComparisonSlideItemDto;", "firstItem", "secondItem", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/content/ThenNowComparisonSlideItemDto;Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/content/ThenNowComparisonSlideItemDto;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/content/ThenNowComparisonSlideItemDto;", "a", "()Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/content/ThenNowComparisonSlideItemDto;", "b", "shared-slides-ui-music-logic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final /* data */ class ThenNowComparisonSlideDataDto {

    @SerializedName("firstItem")
    private final ThenNowComparisonSlideItemDto firstItem;

    @SerializedName("secondItem")
    private final ThenNowComparisonSlideItemDto secondItem;

    @SerializedName("subtitle")
    private final String subtitle;

    @SerializedName("title")
    private final String title;

    public ThenNowComparisonSlideDataDto(String str, String str2, ThenNowComparisonSlideItemDto thenNowComparisonSlideItemDto, ThenNowComparisonSlideItemDto thenNowComparisonSlideItemDto2) {
        this.title = str;
        this.subtitle = str2;
        this.firstItem = thenNowComparisonSlideItemDto;
        this.secondItem = thenNowComparisonSlideItemDto2;
    }

    /* renamed from: a, reason: from getter */
    public final ThenNowComparisonSlideItemDto getFirstItem() {
        return this.firstItem;
    }

    /* renamed from: b, reason: from getter */
    public final ThenNowComparisonSlideItemDto getSecondItem() {
        return this.secondItem;
    }

    /* renamed from: c, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThenNowComparisonSlideDataDto)) {
            return false;
        }
        ThenNowComparisonSlideDataDto thenNowComparisonSlideDataDto = (ThenNowComparisonSlideDataDto) obj;
        return Intrinsics.d(this.title, thenNowComparisonSlideDataDto.title) && Intrinsics.d(this.subtitle, thenNowComparisonSlideDataDto.subtitle) && Intrinsics.d(this.firstItem, thenNowComparisonSlideDataDto.firstItem) && Intrinsics.d(this.secondItem, thenNowComparisonSlideDataDto.secondItem);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ThenNowComparisonSlideItemDto thenNowComparisonSlideItemDto = this.firstItem;
        int hashCode3 = (hashCode2 + (thenNowComparisonSlideItemDto == null ? 0 : thenNowComparisonSlideItemDto.hashCode())) * 31;
        ThenNowComparisonSlideItemDto thenNowComparisonSlideItemDto2 = this.secondItem;
        return hashCode3 + (thenNowComparisonSlideItemDto2 != null ? thenNowComparisonSlideItemDto2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        ThenNowComparisonSlideItemDto thenNowComparisonSlideItemDto = this.firstItem;
        ThenNowComparisonSlideItemDto thenNowComparisonSlideItemDto2 = this.secondItem;
        StringBuilder m = f1d.m("ThenNowComparisonSlideDataDto(title=", str, ", subtitle=", str2, ", firstItem=");
        m.append(thenNowComparisonSlideItemDto);
        m.append(", secondItem=");
        m.append(thenNowComparisonSlideItemDto2);
        m.append(")");
        return m.toString();
    }
}
