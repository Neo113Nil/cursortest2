package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.ly3;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JM\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006 "}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/BaseWindowSettingsV2Dto;", "", "attributedTitle", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "attributedSubtitle", "doneButtonAttributedTitle", "doneButtonAttributedSubtitle", "cancelButtonAttributedTitle", "cancelButtonAttributedSubtitle", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;)V", "getAttributedTitle", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getAttributedSubtitle", "getDoneButtonAttributedTitle", "getDoneButtonAttributedSubtitle", "getCancelButtonAttributedTitle", "getCancelButtonAttributedSubtitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BaseWindowSettingsV2Dto {
    private final AttributedTextDto attributedSubtitle;
    private final AttributedTextDto attributedTitle;
    private final AttributedTextDto cancelButtonAttributedSubtitle;
    private final AttributedTextDto cancelButtonAttributedTitle;
    private final AttributedTextDto doneButtonAttributedSubtitle;
    private final AttributedTextDto doneButtonAttributedTitle;

    public BaseWindowSettingsV2Dto(@Json(name = "attributed_title") AttributedTextDto attributedTextDto, @Json(name = "attributed_subtitle") AttributedTextDto attributedTextDto2, @Json(name = "done_button_attributed_title") AttributedTextDto attributedTextDto3, @Json(name = "done_button_attributed_subtitle") AttributedTextDto attributedTextDto4, @Json(name = "cancel_button_attributed_title") AttributedTextDto attributedTextDto5, @Json(name = "cancel_button_attributed_subtitle") AttributedTextDto attributedTextDto6) {
        this.attributedTitle = attributedTextDto;
        this.attributedSubtitle = attributedTextDto2;
        this.doneButtonAttributedTitle = attributedTextDto3;
        this.doneButtonAttributedSubtitle = attributedTextDto4;
        this.cancelButtonAttributedTitle = attributedTextDto5;
        this.cancelButtonAttributedSubtitle = attributedTextDto6;
    }

    public static /* synthetic */ BaseWindowSettingsV2Dto copy$default(BaseWindowSettingsV2Dto baseWindowSettingsV2Dto, AttributedTextDto attributedTextDto, AttributedTextDto attributedTextDto2, AttributedTextDto attributedTextDto3, AttributedTextDto attributedTextDto4, AttributedTextDto attributedTextDto5, AttributedTextDto attributedTextDto6, int i, Object obj) {
        if ((i & 1) != 0) {
            attributedTextDto = baseWindowSettingsV2Dto.attributedTitle;
        }
        if ((i & 2) != 0) {
            attributedTextDto2 = baseWindowSettingsV2Dto.attributedSubtitle;
        }
        if ((i & 4) != 0) {
            attributedTextDto3 = baseWindowSettingsV2Dto.doneButtonAttributedTitle;
        }
        if ((i & 8) != 0) {
            attributedTextDto4 = baseWindowSettingsV2Dto.doneButtonAttributedSubtitle;
        }
        if ((i & 16) != 0) {
            attributedTextDto5 = baseWindowSettingsV2Dto.cancelButtonAttributedTitle;
        }
        if ((i & 32) != 0) {
            attributedTextDto6 = baseWindowSettingsV2Dto.cancelButtonAttributedSubtitle;
        }
        AttributedTextDto attributedTextDto7 = attributedTextDto5;
        AttributedTextDto attributedTextDto8 = attributedTextDto6;
        return baseWindowSettingsV2Dto.copy(attributedTextDto, attributedTextDto2, attributedTextDto3, attributedTextDto4, attributedTextDto7, attributedTextDto8);
    }

    /* renamed from: component1, reason: from getter */
    public final AttributedTextDto getAttributedTitle() {
        return this.attributedTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final AttributedTextDto getAttributedSubtitle() {
        return this.attributedSubtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final AttributedTextDto getDoneButtonAttributedTitle() {
        return this.doneButtonAttributedTitle;
    }

    /* renamed from: component4, reason: from getter */
    public final AttributedTextDto getDoneButtonAttributedSubtitle() {
        return this.doneButtonAttributedSubtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final AttributedTextDto getCancelButtonAttributedTitle() {
        return this.cancelButtonAttributedTitle;
    }

    /* renamed from: component6, reason: from getter */
    public final AttributedTextDto getCancelButtonAttributedSubtitle() {
        return this.cancelButtonAttributedSubtitle;
    }

    public final BaseWindowSettingsV2Dto copy(@Json(name = "attributed_title") AttributedTextDto attributedTitle, @Json(name = "attributed_subtitle") AttributedTextDto attributedSubtitle, @Json(name = "done_button_attributed_title") AttributedTextDto doneButtonAttributedTitle, @Json(name = "done_button_attributed_subtitle") AttributedTextDto doneButtonAttributedSubtitle, @Json(name = "cancel_button_attributed_title") AttributedTextDto cancelButtonAttributedTitle, @Json(name = "cancel_button_attributed_subtitle") AttributedTextDto cancelButtonAttributedSubtitle) {
        return new BaseWindowSettingsV2Dto(attributedTitle, attributedSubtitle, doneButtonAttributedTitle, doneButtonAttributedSubtitle, cancelButtonAttributedTitle, cancelButtonAttributedSubtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseWindowSettingsV2Dto)) {
            return false;
        }
        BaseWindowSettingsV2Dto baseWindowSettingsV2Dto = (BaseWindowSettingsV2Dto) other;
        return jl40.l(this.attributedTitle, baseWindowSettingsV2Dto.attributedTitle) && jl40.l(this.attributedSubtitle, baseWindowSettingsV2Dto.attributedSubtitle) && jl40.l(this.doneButtonAttributedTitle, baseWindowSettingsV2Dto.doneButtonAttributedTitle) && jl40.l(this.doneButtonAttributedSubtitle, baseWindowSettingsV2Dto.doneButtonAttributedSubtitle) && jl40.l(this.cancelButtonAttributedTitle, baseWindowSettingsV2Dto.cancelButtonAttributedTitle) && jl40.l(this.cancelButtonAttributedSubtitle, baseWindowSettingsV2Dto.cancelButtonAttributedSubtitle);
    }

    public final AttributedTextDto getAttributedSubtitle() {
        return this.attributedSubtitle;
    }

    public final AttributedTextDto getAttributedTitle() {
        return this.attributedTitle;
    }

    public final AttributedTextDto getCancelButtonAttributedSubtitle() {
        return this.cancelButtonAttributedSubtitle;
    }

    public final AttributedTextDto getCancelButtonAttributedTitle() {
        return this.cancelButtonAttributedTitle;
    }

    public final AttributedTextDto getDoneButtonAttributedSubtitle() {
        return this.doneButtonAttributedSubtitle;
    }

    public final AttributedTextDto getDoneButtonAttributedTitle() {
        return this.doneButtonAttributedTitle;
    }

    public int hashCode() {
        int hashCode = this.attributedTitle.hashCode() * 31;
        AttributedTextDto attributedTextDto = this.attributedSubtitle;
        int e = ly3.e(this.doneButtonAttributedTitle, (hashCode + (attributedTextDto == null ? 0 : attributedTextDto.hashCode())) * 31, 31);
        AttributedTextDto attributedTextDto2 = this.doneButtonAttributedSubtitle;
        int hashCode2 = (e + (attributedTextDto2 == null ? 0 : attributedTextDto2.hashCode())) * 31;
        AttributedTextDto attributedTextDto3 = this.cancelButtonAttributedTitle;
        int hashCode3 = (hashCode2 + (attributedTextDto3 == null ? 0 : attributedTextDto3.hashCode())) * 31;
        AttributedTextDto attributedTextDto4 = this.cancelButtonAttributedSubtitle;
        return hashCode3 + (attributedTextDto4 != null ? attributedTextDto4.hashCode() : 0);
    }

    public String toString() {
        return "BaseWindowSettingsV2Dto(attributedTitle=" + this.attributedTitle + ", attributedSubtitle=" + this.attributedSubtitle + ", doneButtonAttributedTitle=" + this.doneButtonAttributedTitle + ", doneButtonAttributedSubtitle=" + this.doneButtonAttributedSubtitle + ", cancelButtonAttributedTitle=" + this.cancelButtonAttributedTitle + ", cancelButtonAttributedSubtitle=" + this.cancelButtonAttributedSubtitle + Extension.C_BRAKE;
    }
}
