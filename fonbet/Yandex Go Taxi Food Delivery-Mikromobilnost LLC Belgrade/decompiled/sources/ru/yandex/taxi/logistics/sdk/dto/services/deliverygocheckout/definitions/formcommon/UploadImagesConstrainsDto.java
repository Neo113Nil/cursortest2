package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/UploadImagesConstrainsDto;", "", "maxWidth", "", "maxHeight", "maxCount", "<init>", "(III)V", "getMaxWidth", "()I", "getMaxHeight", "getMaxCount", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UploadImagesConstrainsDto {
    private final int maxCount;
    private final int maxHeight;
    private final int maxWidth;

    public UploadImagesConstrainsDto(@Json(name = "max_width") int i, @Json(name = "max_height") int i2, @Json(name = "max_count") int i3) {
        this.maxWidth = i;
        this.maxHeight = i2;
        this.maxCount = i3;
    }

    public static /* synthetic */ UploadImagesConstrainsDto copy$default(UploadImagesConstrainsDto uploadImagesConstrainsDto, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = uploadImagesConstrainsDto.maxWidth;
        }
        if ((i4 & 2) != 0) {
            i2 = uploadImagesConstrainsDto.maxHeight;
        }
        if ((i4 & 4) != 0) {
            i3 = uploadImagesConstrainsDto.maxCount;
        }
        return uploadImagesConstrainsDto.copy(i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMaxWidth() {
        return this.maxWidth;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMaxHeight() {
        return this.maxHeight;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMaxCount() {
        return this.maxCount;
    }

    public final UploadImagesConstrainsDto copy(@Json(name = "max_width") int maxWidth, @Json(name = "max_height") int maxHeight, @Json(name = "max_count") int maxCount) {
        return new UploadImagesConstrainsDto(maxWidth, maxHeight, maxCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadImagesConstrainsDto)) {
            return false;
        }
        UploadImagesConstrainsDto uploadImagesConstrainsDto = (UploadImagesConstrainsDto) other;
        return this.maxWidth == uploadImagesConstrainsDto.maxWidth && this.maxHeight == uploadImagesConstrainsDto.maxHeight && this.maxCount == uploadImagesConstrainsDto.maxCount;
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    public final int getMaxHeight() {
        return this.maxHeight;
    }

    public final int getMaxWidth() {
        return this.maxWidth;
    }

    public int hashCode() {
        return Integer.hashCode(this.maxCount) + oyr.b(this.maxHeight, Integer.hashCode(this.maxWidth) * 31, 31);
    }

    public String toString() {
        return oyr.m(this.maxCount, Extension.C_BRAKE, b64.s(this.maxWidth, this.maxHeight, "UploadImagesConstrainsDto(maxWidth=", ", maxHeight=", ", maxCount="));
    }
}
