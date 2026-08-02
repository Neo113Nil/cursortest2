package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.timeline;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/HorizontalTimelineItemDto;", "", "id", "", ACSPConstants.STATUS, "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineItemStatusDto;", "imageTag", "imageTagDark", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineItemStatusDto;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getStatus", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineItemStatusDto;", "getImageTag", "getImageTagDark", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class HorizontalTimelineItemDto {
    private final String id;
    private final String imageTag;
    private final String imageTagDark;
    private final TimelineItemStatusDto status;

    public HorizontalTimelineItemDto(@Json(name = "id") String str, @Json(name = "status") TimelineItemStatusDto timelineItemStatusDto, @Json(name = "image_tag") String str2, @Json(name = "image_tag_dark") String str3) {
        this.id = str;
        this.status = timelineItemStatusDto;
        this.imageTag = str2;
        this.imageTagDark = str3;
    }

    public static /* synthetic */ HorizontalTimelineItemDto copy$default(HorizontalTimelineItemDto horizontalTimelineItemDto, String str, TimelineItemStatusDto timelineItemStatusDto, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = horizontalTimelineItemDto.id;
        }
        if ((i & 2) != 0) {
            timelineItemStatusDto = horizontalTimelineItemDto.status;
        }
        if ((i & 4) != 0) {
            str2 = horizontalTimelineItemDto.imageTag;
        }
        if ((i & 8) != 0) {
            str3 = horizontalTimelineItemDto.imageTagDark;
        }
        return horizontalTimelineItemDto.copy(str, timelineItemStatusDto, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final TimelineItemStatusDto getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImageTag() {
        return this.imageTag;
    }

    /* renamed from: component4, reason: from getter */
    public final String getImageTagDark() {
        return this.imageTagDark;
    }

    public final HorizontalTimelineItemDto copy(@Json(name = "id") String id, @Json(name = "status") TimelineItemStatusDto status, @Json(name = "image_tag") String imageTag, @Json(name = "image_tag_dark") String imageTagDark) {
        return new HorizontalTimelineItemDto(id, status, imageTag, imageTagDark);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HorizontalTimelineItemDto)) {
            return false;
        }
        HorizontalTimelineItemDto horizontalTimelineItemDto = (HorizontalTimelineItemDto) other;
        return jl40.l(this.id, horizontalTimelineItemDto.id) && this.status == horizontalTimelineItemDto.status && jl40.l(this.imageTag, horizontalTimelineItemDto.imageTag) && jl40.l(this.imageTagDark, horizontalTimelineItemDto.imageTagDark);
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageTag() {
        return this.imageTag;
    }

    public final String getImageTagDark() {
        return this.imageTagDark;
    }

    public final TimelineItemStatusDto getStatus() {
        return this.status;
    }

    public int hashCode() {
        int b = unr0.b((this.status.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.imageTag);
        String str = this.imageTagDark;
        return b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.id;
        TimelineItemStatusDto timelineItemStatusDto = this.status;
        String str2 = this.imageTag;
        String str3 = this.imageTagDark;
        StringBuilder sb = new StringBuilder("HorizontalTimelineItemDto(id=");
        sb.append(str);
        sb.append(", status=");
        sb.append(timelineItemStatusDto);
        sb.append(", imageTag=");
        return g8e.r(sb, str2, ", imageTagDark=", str3, Extension.C_BRAKE);
    }
}
