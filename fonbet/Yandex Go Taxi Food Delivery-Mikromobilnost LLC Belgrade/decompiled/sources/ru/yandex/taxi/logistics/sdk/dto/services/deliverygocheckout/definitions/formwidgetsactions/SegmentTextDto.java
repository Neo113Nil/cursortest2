package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SegmentTextDto;", "", "title", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "subtitle", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;)V", "getTitle", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getSubtitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SegmentTextDto {
    private final AttributedTextDto subtitle;
    private final AttributedTextDto title;

    public SegmentTextDto(@Json(name = "title") AttributedTextDto attributedTextDto, @Json(name = "subtitle") AttributedTextDto attributedTextDto2) {
        this.title = attributedTextDto;
        this.subtitle = attributedTextDto2;
    }

    public static /* synthetic */ SegmentTextDto copy$default(SegmentTextDto segmentTextDto, AttributedTextDto attributedTextDto, AttributedTextDto attributedTextDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            attributedTextDto = segmentTextDto.title;
        }
        if ((i & 2) != 0) {
            attributedTextDto2 = segmentTextDto.subtitle;
        }
        return segmentTextDto.copy(attributedTextDto, attributedTextDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final AttributedTextDto getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final AttributedTextDto getSubtitle() {
        return this.subtitle;
    }

    public final SegmentTextDto copy(@Json(name = "title") AttributedTextDto title, @Json(name = "subtitle") AttributedTextDto subtitle) {
        return new SegmentTextDto(title, subtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentTextDto)) {
            return false;
        }
        SegmentTextDto segmentTextDto = (SegmentTextDto) other;
        return jl40.l(this.title, segmentTextDto.title) && jl40.l(this.subtitle, segmentTextDto.subtitle);
    }

    public final AttributedTextDto getSubtitle() {
        return this.subtitle;
    }

    public final AttributedTextDto getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        AttributedTextDto attributedTextDto = this.subtitle;
        return hashCode + (attributedTextDto == null ? 0 : attributedTextDto.hashCode());
    }

    public String toString() {
        return "SegmentTextDto(title=" + this.title + ", subtitle=" + this.subtitle + Extension.C_BRAKE;
    }
}
