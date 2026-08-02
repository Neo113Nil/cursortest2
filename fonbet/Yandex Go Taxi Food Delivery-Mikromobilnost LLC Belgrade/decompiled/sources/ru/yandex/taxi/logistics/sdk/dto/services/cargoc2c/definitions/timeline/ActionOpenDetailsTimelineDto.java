package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.timeline;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0003\u0010\t\u001a\u00020\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/ActionOpenDetailsTimelineDto;", "", "title", "", "bubble", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/BubbleDto;", "vertical", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/VerticalTimelineItemDto;", "doneButton", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineDetailsDoneButtonDto;", "shareButton", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineDetailsShareButtonDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/BubbleDto;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineDetailsDoneButtonDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineDetailsShareButtonDto;)V", "getTitle", "()Ljava/lang/String;", "getBubble", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/BubbleDto;", "getVertical", "()Ljava/util/List;", "getDoneButton", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineDetailsDoneButtonDto;", "getShareButton", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineDetailsShareButtonDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ActionOpenDetailsTimelineDto {
    private final BubbleDto bubble;
    private final TimelineDetailsDoneButtonDto doneButton;
    private final TimelineDetailsShareButtonDto shareButton;
    private final String title;
    private final List<VerticalTimelineItemDto> vertical;

    public ActionOpenDetailsTimelineDto(@Json(name = "title") String str, @Json(name = "bubble") BubbleDto bubbleDto, @Json(name = "vertical") List<VerticalTimelineItemDto> list, @Json(name = "done_button") TimelineDetailsDoneButtonDto timelineDetailsDoneButtonDto, @Json(name = "share_button") TimelineDetailsShareButtonDto timelineDetailsShareButtonDto) {
        this.title = str;
        this.bubble = bubbleDto;
        this.vertical = list;
        this.doneButton = timelineDetailsDoneButtonDto;
        this.shareButton = timelineDetailsShareButtonDto;
    }

    public static /* synthetic */ ActionOpenDetailsTimelineDto copy$default(ActionOpenDetailsTimelineDto actionOpenDetailsTimelineDto, String str, BubbleDto bubbleDto, List list, TimelineDetailsDoneButtonDto timelineDetailsDoneButtonDto, TimelineDetailsShareButtonDto timelineDetailsShareButtonDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = actionOpenDetailsTimelineDto.title;
        }
        if ((i & 2) != 0) {
            bubbleDto = actionOpenDetailsTimelineDto.bubble;
        }
        if ((i & 4) != 0) {
            list = actionOpenDetailsTimelineDto.vertical;
        }
        if ((i & 8) != 0) {
            timelineDetailsDoneButtonDto = actionOpenDetailsTimelineDto.doneButton;
        }
        if ((i & 16) != 0) {
            timelineDetailsShareButtonDto = actionOpenDetailsTimelineDto.shareButton;
        }
        TimelineDetailsShareButtonDto timelineDetailsShareButtonDto2 = timelineDetailsShareButtonDto;
        List list2 = list;
        return actionOpenDetailsTimelineDto.copy(str, bubbleDto, list2, timelineDetailsDoneButtonDto, timelineDetailsShareButtonDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final BubbleDto getBubble() {
        return this.bubble;
    }

    public final List<VerticalTimelineItemDto> component3() {
        return this.vertical;
    }

    /* renamed from: component4, reason: from getter */
    public final TimelineDetailsDoneButtonDto getDoneButton() {
        return this.doneButton;
    }

    /* renamed from: component5, reason: from getter */
    public final TimelineDetailsShareButtonDto getShareButton() {
        return this.shareButton;
    }

    public final ActionOpenDetailsTimelineDto copy(@Json(name = "title") String title, @Json(name = "bubble") BubbleDto bubble, @Json(name = "vertical") List<VerticalTimelineItemDto> vertical, @Json(name = "done_button") TimelineDetailsDoneButtonDto doneButton, @Json(name = "share_button") TimelineDetailsShareButtonDto shareButton) {
        return new ActionOpenDetailsTimelineDto(title, bubble, vertical, doneButton, shareButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionOpenDetailsTimelineDto)) {
            return false;
        }
        ActionOpenDetailsTimelineDto actionOpenDetailsTimelineDto = (ActionOpenDetailsTimelineDto) other;
        return jl40.l(this.title, actionOpenDetailsTimelineDto.title) && jl40.l(this.bubble, actionOpenDetailsTimelineDto.bubble) && jl40.l(this.vertical, actionOpenDetailsTimelineDto.vertical) && jl40.l(this.doneButton, actionOpenDetailsTimelineDto.doneButton) && jl40.l(this.shareButton, actionOpenDetailsTimelineDto.shareButton);
    }

    public final BubbleDto getBubble() {
        return this.bubble;
    }

    public final TimelineDetailsDoneButtonDto getDoneButton() {
        return this.doneButton;
    }

    public final TimelineDetailsShareButtonDto getShareButton() {
        return this.shareButton;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<VerticalTimelineItemDto> getVertical() {
        return this.vertical;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        BubbleDto bubbleDto = this.bubble;
        int hashCode2 = (this.doneButton.hashCode() + unr0.c((hashCode + (bubbleDto == null ? 0 : bubbleDto.hashCode())) * 31, 31, this.vertical)) * 31;
        TimelineDetailsShareButtonDto timelineDetailsShareButtonDto = this.shareButton;
        return hashCode2 + (timelineDetailsShareButtonDto != null ? timelineDetailsShareButtonDto.hashCode() : 0);
    }

    public String toString() {
        return "ActionOpenDetailsTimelineDto(title=" + this.title + ", bubble=" + this.bubble + ", vertical=" + this.vertical + ", doneButton=" + this.doneButton + ", shareButton=" + this.shareButton + Extension.C_BRAKE;
    }
}
