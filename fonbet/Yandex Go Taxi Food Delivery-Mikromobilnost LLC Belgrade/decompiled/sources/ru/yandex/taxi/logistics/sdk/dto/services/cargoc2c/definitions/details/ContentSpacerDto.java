package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentSpacerDto;", "", "height", "", "<init>", "(I)V", "getHeight", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ContentSpacerDto {
    private final int height;

    public ContentSpacerDto(@Json(name = "height") int i) {
        this.height = i;
    }

    public static /* synthetic */ ContentSpacerDto copy$default(ContentSpacerDto contentSpacerDto, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = contentSpacerDto.height;
        }
        return contentSpacerDto.copy(i);
    }

    /* renamed from: component1, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    public final ContentSpacerDto copy(@Json(name = "height") int height) {
        return new ContentSpacerDto(height);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ContentSpacerDto) && this.height == ((ContentSpacerDto) other).height;
    }

    public final int getHeight() {
        return this.height;
    }

    public int hashCode() {
        return Integer.hashCode(this.height);
    }

    public String toString() {
        return oyr.j(this.height, "ContentSpacerDto(height=", Extension.C_BRAKE);
    }
}
