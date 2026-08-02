package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateorderingcontrol;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/PhotocommentsConfigDto;", "", "maxPhotoWidth", "", "maxPhotoHeight", "maxPointPhotocomments", "<init>", "(III)V", "getMaxPhotoWidth", "()I", "getMaxPhotoHeight", "getMaxPointPhotocomments", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PhotocommentsConfigDto {
    private final int maxPhotoHeight;
    private final int maxPhotoWidth;
    private final int maxPointPhotocomments;

    public PhotocommentsConfigDto(@Json(name = "max_photo_width") int i, @Json(name = "max_photo_height") int i2, @Json(name = "max_point_photocomments") int i3) {
        this.maxPhotoWidth = i;
        this.maxPhotoHeight = i2;
        this.maxPointPhotocomments = i3;
    }

    public static /* synthetic */ PhotocommentsConfigDto copy$default(PhotocommentsConfigDto photocommentsConfigDto, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = photocommentsConfigDto.maxPhotoWidth;
        }
        if ((i4 & 2) != 0) {
            i2 = photocommentsConfigDto.maxPhotoHeight;
        }
        if ((i4 & 4) != 0) {
            i3 = photocommentsConfigDto.maxPointPhotocomments;
        }
        return photocommentsConfigDto.copy(i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMaxPhotoWidth() {
        return this.maxPhotoWidth;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMaxPhotoHeight() {
        return this.maxPhotoHeight;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMaxPointPhotocomments() {
        return this.maxPointPhotocomments;
    }

    public final PhotocommentsConfigDto copy(@Json(name = "max_photo_width") int maxPhotoWidth, @Json(name = "max_photo_height") int maxPhotoHeight, @Json(name = "max_point_photocomments") int maxPointPhotocomments) {
        return new PhotocommentsConfigDto(maxPhotoWidth, maxPhotoHeight, maxPointPhotocomments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhotocommentsConfigDto)) {
            return false;
        }
        PhotocommentsConfigDto photocommentsConfigDto = (PhotocommentsConfigDto) other;
        return this.maxPhotoWidth == photocommentsConfigDto.maxPhotoWidth && this.maxPhotoHeight == photocommentsConfigDto.maxPhotoHeight && this.maxPointPhotocomments == photocommentsConfigDto.maxPointPhotocomments;
    }

    public final int getMaxPhotoHeight() {
        return this.maxPhotoHeight;
    }

    public final int getMaxPhotoWidth() {
        return this.maxPhotoWidth;
    }

    public final int getMaxPointPhotocomments() {
        return this.maxPointPhotocomments;
    }

    public int hashCode() {
        return Integer.hashCode(this.maxPointPhotocomments) + oyr.b(this.maxPhotoHeight, Integer.hashCode(this.maxPhotoWidth) * 31, 31);
    }

    public String toString() {
        return oyr.m(this.maxPointPhotocomments, Extension.C_BRAKE, b64.s(this.maxPhotoWidth, this.maxPhotoHeight, "PhotocommentsConfigDto(maxPhotoWidth=", ", maxPhotoHeight=", ", maxPointPhotocomments="));
    }
}
