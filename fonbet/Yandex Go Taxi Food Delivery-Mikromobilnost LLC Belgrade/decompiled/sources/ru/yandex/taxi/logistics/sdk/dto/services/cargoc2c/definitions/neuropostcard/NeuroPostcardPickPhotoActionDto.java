package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardPickPhotoActionDto;", "", "maxWidth", "", "maxHeight", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getMaxWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxHeight", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardPickPhotoActionDto;", "equals", "", "other", "hashCode", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NeuroPostcardPickPhotoActionDto {
    private final Integer maxHeight;
    private final Integer maxWidth;

    public NeuroPostcardPickPhotoActionDto(@Json(name = "max_width") Integer num, @Json(name = "max_height") Integer num2) {
        this.maxWidth = num;
        this.maxHeight = num2;
    }

    public static /* synthetic */ NeuroPostcardPickPhotoActionDto copy$default(NeuroPostcardPickPhotoActionDto neuroPostcardPickPhotoActionDto, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = neuroPostcardPickPhotoActionDto.maxWidth;
        }
        if ((i & 2) != 0) {
            num2 = neuroPostcardPickPhotoActionDto.maxHeight;
        }
        return neuroPostcardPickPhotoActionDto.copy(num, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getMaxWidth() {
        return this.maxWidth;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getMaxHeight() {
        return this.maxHeight;
    }

    public final NeuroPostcardPickPhotoActionDto copy(@Json(name = "max_width") Integer maxWidth, @Json(name = "max_height") Integer maxHeight) {
        return new NeuroPostcardPickPhotoActionDto(maxWidth, maxHeight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NeuroPostcardPickPhotoActionDto)) {
            return false;
        }
        NeuroPostcardPickPhotoActionDto neuroPostcardPickPhotoActionDto = (NeuroPostcardPickPhotoActionDto) other;
        return jl40.l(this.maxWidth, neuroPostcardPickPhotoActionDto.maxWidth) && jl40.l(this.maxHeight, neuroPostcardPickPhotoActionDto.maxHeight);
    }

    public final Integer getMaxHeight() {
        return this.maxHeight;
    }

    public final Integer getMaxWidth() {
        return this.maxWidth;
    }

    public int hashCode() {
        Integer num = this.maxWidth;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.maxHeight;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "NeuroPostcardPickPhotoActionDto(maxWidth=" + this.maxWidth + ", maxHeight=" + this.maxHeight + Extension.C_BRAKE;
    }
}
