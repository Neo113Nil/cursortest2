package com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content;

import com.connectsdk.service.DeviceService;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.ouj;
import defpackage.su4;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/content/QuizEntitySlideDataDto;", "", "", DeviceService.KEY_DESC, "", "Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/content/SlideListItemDto;", "items", "align", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "a", "shared-slides-ui-music-logic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final /* data */ class QuizEntitySlideDataDto {

    @SerializedName("align")
    private final String align;

    @SerializedName(DeviceService.KEY_DESC)
    private final String description;

    @SerializedName("items")
    private final List<SlideListItemDto> items;

    public QuizEntitySlideDataDto(String str, List<SlideListItemDto> list, String str2) {
        this.description = str;
        this.items = list;
        this.align = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getAlign() {
        return this.align;
    }

    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: c, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuizEntitySlideDataDto)) {
            return false;
        }
        QuizEntitySlideDataDto quizEntitySlideDataDto = (QuizEntitySlideDataDto) obj;
        return Intrinsics.d(this.description, quizEntitySlideDataDto.description) && Intrinsics.d(this.items, quizEntitySlideDataDto.items) && Intrinsics.d(this.align, quizEntitySlideDataDto.align);
    }

    public final int hashCode() {
        String str = this.description;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<SlideListItemDto> list = this.items;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.align;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.description;
        List<SlideListItemDto> list = this.items;
        return su4.o(ouj.v("QuizEntitySlideDataDto(description=", str, ", items=", ", align=", list), this.align, ")");
    }
}
