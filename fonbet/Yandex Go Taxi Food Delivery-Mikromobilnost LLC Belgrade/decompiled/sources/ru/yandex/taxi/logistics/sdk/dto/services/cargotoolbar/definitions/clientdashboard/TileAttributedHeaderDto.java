package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileAttributedHeaderDto;", "", "title", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "subtitle", "trailTitle", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;)V", "getTitle", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getSubtitle", "getTrailTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TileAttributedHeaderDto {
    private final AttributedTextDto subtitle;
    private final AttributedTextDto title;
    private final AttributedTextDto trailTitle;

    public TileAttributedHeaderDto(@Json(name = "title") AttributedTextDto attributedTextDto, @Json(name = "subtitle") AttributedTextDto attributedTextDto2, @Json(name = "trail_title") AttributedTextDto attributedTextDto3) {
        this.title = attributedTextDto;
        this.subtitle = attributedTextDto2;
        this.trailTitle = attributedTextDto3;
    }

    public static /* synthetic */ TileAttributedHeaderDto copy$default(TileAttributedHeaderDto tileAttributedHeaderDto, AttributedTextDto attributedTextDto, AttributedTextDto attributedTextDto2, AttributedTextDto attributedTextDto3, int i, Object obj) {
        if ((i & 1) != 0) {
            attributedTextDto = tileAttributedHeaderDto.title;
        }
        if ((i & 2) != 0) {
            attributedTextDto2 = tileAttributedHeaderDto.subtitle;
        }
        if ((i & 4) != 0) {
            attributedTextDto3 = tileAttributedHeaderDto.trailTitle;
        }
        return tileAttributedHeaderDto.copy(attributedTextDto, attributedTextDto2, attributedTextDto3);
    }

    /* renamed from: component1, reason: from getter */
    public final AttributedTextDto getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final AttributedTextDto getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final AttributedTextDto getTrailTitle() {
        return this.trailTitle;
    }

    public final TileAttributedHeaderDto copy(@Json(name = "title") AttributedTextDto title, @Json(name = "subtitle") AttributedTextDto subtitle, @Json(name = "trail_title") AttributedTextDto trailTitle) {
        return new TileAttributedHeaderDto(title, subtitle, trailTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TileAttributedHeaderDto)) {
            return false;
        }
        TileAttributedHeaderDto tileAttributedHeaderDto = (TileAttributedHeaderDto) other;
        return jl40.l(this.title, tileAttributedHeaderDto.title) && jl40.l(this.subtitle, tileAttributedHeaderDto.subtitle) && jl40.l(this.trailTitle, tileAttributedHeaderDto.trailTitle);
    }

    public final AttributedTextDto getSubtitle() {
        return this.subtitle;
    }

    public final AttributedTextDto getTitle() {
        return this.title;
    }

    public final AttributedTextDto getTrailTitle() {
        return this.trailTitle;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        AttributedTextDto attributedTextDto = this.subtitle;
        int hashCode2 = (hashCode + (attributedTextDto == null ? 0 : attributedTextDto.hashCode())) * 31;
        AttributedTextDto attributedTextDto2 = this.trailTitle;
        return hashCode2 + (attributedTextDto2 != null ? attributedTextDto2.hashCode() : 0);
    }

    public String toString() {
        return "TileAttributedHeaderDto(title=" + this.title + ", subtitle=" + this.subtitle + ", trailTitle=" + this.trailTitle + Extension.C_BRAKE;
    }
}
