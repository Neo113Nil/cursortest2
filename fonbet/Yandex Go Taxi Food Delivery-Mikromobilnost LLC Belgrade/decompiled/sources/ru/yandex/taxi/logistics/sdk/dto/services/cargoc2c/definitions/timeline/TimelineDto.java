package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.timeline;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineDto;", "", "horizontal", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/HorizontalTimelineItemDto;", "currentItemId", "", "bubble", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/BubbleDto;", "<init>", "(Ljava/util/List;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/BubbleDto;)V", "getHorizontal", "()Ljava/util/List;", "getCurrentItemId", "()Ljava/lang/String;", "getBubble", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/BubbleDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TimelineDto {
    private final BubbleDto bubble;
    private final String currentItemId;
    private final List<HorizontalTimelineItemDto> horizontal;

    public TimelineDto(@Json(name = "horizontal") List<HorizontalTimelineItemDto> list, @Json(name = "current_item_id") String str, @Json(name = "bubble") BubbleDto bubbleDto) {
        this.horizontal = list;
        this.currentItemId = str;
        this.bubble = bubbleDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TimelineDto copy$default(TimelineDto timelineDto, List list, String str, BubbleDto bubbleDto, int i, Object obj) {
        if ((i & 1) != 0) {
            list = timelineDto.horizontal;
        }
        if ((i & 2) != 0) {
            str = timelineDto.currentItemId;
        }
        if ((i & 4) != 0) {
            bubbleDto = timelineDto.bubble;
        }
        return timelineDto.copy(list, str, bubbleDto);
    }

    public final List<HorizontalTimelineItemDto> component1() {
        return this.horizontal;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCurrentItemId() {
        return this.currentItemId;
    }

    /* renamed from: component3, reason: from getter */
    public final BubbleDto getBubble() {
        return this.bubble;
    }

    public final TimelineDto copy(@Json(name = "horizontal") List<HorizontalTimelineItemDto> horizontal, @Json(name = "current_item_id") String currentItemId, @Json(name = "bubble") BubbleDto bubble) {
        return new TimelineDto(horizontal, currentItemId, bubble);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimelineDto)) {
            return false;
        }
        TimelineDto timelineDto = (TimelineDto) other;
        return jl40.l(this.horizontal, timelineDto.horizontal) && jl40.l(this.currentItemId, timelineDto.currentItemId) && jl40.l(this.bubble, timelineDto.bubble);
    }

    public final BubbleDto getBubble() {
        return this.bubble;
    }

    public final String getCurrentItemId() {
        return this.currentItemId;
    }

    public final List<HorizontalTimelineItemDto> getHorizontal() {
        return this.horizontal;
    }

    public int hashCode() {
        int hashCode = this.horizontal.hashCode() * 31;
        String str = this.currentItemId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BubbleDto bubbleDto = this.bubble;
        return hashCode2 + (bubbleDto != null ? bubbleDto.hashCode() : 0);
    }

    public String toString() {
        List<HorizontalTimelineItemDto> list = this.horizontal;
        String str = this.currentItemId;
        BubbleDto bubbleDto = this.bubble;
        StringBuilder s = xvz.s("TimelineDto(horizontal=", list, ", currentItemId=", str, ", bubble=");
        s.append(bubbleDto);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }
}
