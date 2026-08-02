package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.SizedImageDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/MainHeaderV3Dto;", "", "title", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "subtitle", "titleLeadingIcon", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/SizedImageDto;", "metricaLabel", "", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/SizedImageDto;Ljava/lang/String;)V", "getTitle", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getSubtitle", "getTitleLeadingIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/SizedImageDto;", "getMetricaLabel", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MainHeaderV3Dto {
    private final String metricaLabel;
    private final AttributedTextDto subtitle;
    private final AttributedTextDto title;
    private final SizedImageDto titleLeadingIcon;

    public MainHeaderV3Dto(@Json(name = "title") AttributedTextDto attributedTextDto, @Json(name = "subtitle") AttributedTextDto attributedTextDto2, @Json(name = "title_leading_icon") SizedImageDto sizedImageDto, @Json(name = "metrica_label") String str) {
        this.title = attributedTextDto;
        this.subtitle = attributedTextDto2;
        this.titleLeadingIcon = sizedImageDto;
        this.metricaLabel = str;
    }

    public static /* synthetic */ MainHeaderV3Dto copy$default(MainHeaderV3Dto mainHeaderV3Dto, AttributedTextDto attributedTextDto, AttributedTextDto attributedTextDto2, SizedImageDto sizedImageDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            attributedTextDto = mainHeaderV3Dto.title;
        }
        if ((i & 2) != 0) {
            attributedTextDto2 = mainHeaderV3Dto.subtitle;
        }
        if ((i & 4) != 0) {
            sizedImageDto = mainHeaderV3Dto.titleLeadingIcon;
        }
        if ((i & 8) != 0) {
            str = mainHeaderV3Dto.metricaLabel;
        }
        return mainHeaderV3Dto.copy(attributedTextDto, attributedTextDto2, sizedImageDto, str);
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
    public final SizedImageDto getTitleLeadingIcon() {
        return this.titleLeadingIcon;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final MainHeaderV3Dto copy(@Json(name = "title") AttributedTextDto title, @Json(name = "subtitle") AttributedTextDto subtitle, @Json(name = "title_leading_icon") SizedImageDto titleLeadingIcon, @Json(name = "metrica_label") String metricaLabel) {
        return new MainHeaderV3Dto(title, subtitle, titleLeadingIcon, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MainHeaderV3Dto)) {
            return false;
        }
        MainHeaderV3Dto mainHeaderV3Dto = (MainHeaderV3Dto) other;
        return jl40.l(this.title, mainHeaderV3Dto.title) && jl40.l(this.subtitle, mainHeaderV3Dto.subtitle) && jl40.l(this.titleLeadingIcon, mainHeaderV3Dto.titleLeadingIcon) && jl40.l(this.metricaLabel, mainHeaderV3Dto.metricaLabel);
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final AttributedTextDto getSubtitle() {
        return this.subtitle;
    }

    public final AttributedTextDto getTitle() {
        return this.title;
    }

    public final SizedImageDto getTitleLeadingIcon() {
        return this.titleLeadingIcon;
    }

    public int hashCode() {
        AttributedTextDto attributedTextDto = this.title;
        int hashCode = (attributedTextDto == null ? 0 : attributedTextDto.hashCode()) * 31;
        AttributedTextDto attributedTextDto2 = this.subtitle;
        int hashCode2 = (hashCode + (attributedTextDto2 == null ? 0 : attributedTextDto2.hashCode())) * 31;
        SizedImageDto sizedImageDto = this.titleLeadingIcon;
        int hashCode3 = (hashCode2 + (sizedImageDto == null ? 0 : sizedImageDto.hashCode())) * 31;
        String str = this.metricaLabel;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "MainHeaderV3Dto(title=" + this.title + ", subtitle=" + this.subtitle + ", titleLeadingIcon=" + this.titleLeadingIcon + ", metricaLabel=" + this.metricaLabel + Extension.C_BRAKE;
    }
}
