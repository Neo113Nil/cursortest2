package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ContentAlignmentDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/BoxViewModeDto;", "", "alignment", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ContentAlignmentDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ContentAlignmentDto;)V", "getAlignment", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ContentAlignmentDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BoxViewModeDto {
    private final ContentAlignmentDto alignment;

    public BoxViewModeDto(@Json(name = "alignment") ContentAlignmentDto contentAlignmentDto) {
        this.alignment = contentAlignmentDto;
    }

    public static /* synthetic */ BoxViewModeDto copy$default(BoxViewModeDto boxViewModeDto, ContentAlignmentDto contentAlignmentDto, int i, Object obj) {
        if ((i & 1) != 0) {
            contentAlignmentDto = boxViewModeDto.alignment;
        }
        return boxViewModeDto.copy(contentAlignmentDto);
    }

    /* renamed from: component1, reason: from getter */
    public final ContentAlignmentDto getAlignment() {
        return this.alignment;
    }

    public final BoxViewModeDto copy(@Json(name = "alignment") ContentAlignmentDto alignment) {
        return new BoxViewModeDto(alignment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BoxViewModeDto) && this.alignment == ((BoxViewModeDto) other).alignment;
    }

    public final ContentAlignmentDto getAlignment() {
        return this.alignment;
    }

    public int hashCode() {
        ContentAlignmentDto contentAlignmentDto = this.alignment;
        if (contentAlignmentDto == null) {
            return 0;
        }
        return contentAlignmentDto.hashCode();
    }

    public String toString() {
        return "BoxViewModeDto(alignment=" + this.alignment + Extension.C_BRAKE;
    }
}
