package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.ly3;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006 "}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/CityDiscoveryScreenDto;", "", "screenName", "", "headerTitle", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "headerLeadImage", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "searchButtonTitle", "searchButtonLeadImage", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;)V", "getScreenName", "()Ljava/lang/String;", "getHeaderTitle", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getHeaderLeadImage", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "getSearchButtonTitle", "getSearchButtonLeadImage", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CityDiscoveryScreenDto {
    private final ImageDto headerLeadImage;
    private final AttributedTextDto headerTitle;
    private final String screenName;
    private final ImageDto searchButtonLeadImage;
    private final AttributedTextDto searchButtonTitle;

    public CityDiscoveryScreenDto(@Json(name = "screen_name") String str, @Json(name = "header_title") AttributedTextDto attributedTextDto, @Json(name = "header_lead_image") ImageDto imageDto, @Json(name = "search_button_title") AttributedTextDto attributedTextDto2, @Json(name = "search_button_lead_image") ImageDto imageDto2) {
        this.screenName = str;
        this.headerTitle = attributedTextDto;
        this.headerLeadImage = imageDto;
        this.searchButtonTitle = attributedTextDto2;
        this.searchButtonLeadImage = imageDto2;
    }

    public static /* synthetic */ CityDiscoveryScreenDto copy$default(CityDiscoveryScreenDto cityDiscoveryScreenDto, String str, AttributedTextDto attributedTextDto, ImageDto imageDto, AttributedTextDto attributedTextDto2, ImageDto imageDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cityDiscoveryScreenDto.screenName;
        }
        if ((i & 2) != 0) {
            attributedTextDto = cityDiscoveryScreenDto.headerTitle;
        }
        if ((i & 4) != 0) {
            imageDto = cityDiscoveryScreenDto.headerLeadImage;
        }
        if ((i & 8) != 0) {
            attributedTextDto2 = cityDiscoveryScreenDto.searchButtonTitle;
        }
        if ((i & 16) != 0) {
            imageDto2 = cityDiscoveryScreenDto.searchButtonLeadImage;
        }
        ImageDto imageDto3 = imageDto2;
        ImageDto imageDto4 = imageDto;
        return cityDiscoveryScreenDto.copy(str, attributedTextDto, imageDto4, attributedTextDto2, imageDto3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getScreenName() {
        return this.screenName;
    }

    /* renamed from: component2, reason: from getter */
    public final AttributedTextDto getHeaderTitle() {
        return this.headerTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final ImageDto getHeaderLeadImage() {
        return this.headerLeadImage;
    }

    /* renamed from: component4, reason: from getter */
    public final AttributedTextDto getSearchButtonTitle() {
        return this.searchButtonTitle;
    }

    /* renamed from: component5, reason: from getter */
    public final ImageDto getSearchButtonLeadImage() {
        return this.searchButtonLeadImage;
    }

    public final CityDiscoveryScreenDto copy(@Json(name = "screen_name") String screenName, @Json(name = "header_title") AttributedTextDto headerTitle, @Json(name = "header_lead_image") ImageDto headerLeadImage, @Json(name = "search_button_title") AttributedTextDto searchButtonTitle, @Json(name = "search_button_lead_image") ImageDto searchButtonLeadImage) {
        return new CityDiscoveryScreenDto(screenName, headerTitle, headerLeadImage, searchButtonTitle, searchButtonLeadImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CityDiscoveryScreenDto)) {
            return false;
        }
        CityDiscoveryScreenDto cityDiscoveryScreenDto = (CityDiscoveryScreenDto) other;
        return jl40.l(this.screenName, cityDiscoveryScreenDto.screenName) && jl40.l(this.headerTitle, cityDiscoveryScreenDto.headerTitle) && jl40.l(this.headerLeadImage, cityDiscoveryScreenDto.headerLeadImage) && jl40.l(this.searchButtonTitle, cityDiscoveryScreenDto.searchButtonTitle) && jl40.l(this.searchButtonLeadImage, cityDiscoveryScreenDto.searchButtonLeadImage);
    }

    public final ImageDto getHeaderLeadImage() {
        return this.headerLeadImage;
    }

    public final AttributedTextDto getHeaderTitle() {
        return this.headerTitle;
    }

    public final String getScreenName() {
        return this.screenName;
    }

    public final ImageDto getSearchButtonLeadImage() {
        return this.searchButtonLeadImage;
    }

    public final AttributedTextDto getSearchButtonTitle() {
        return this.searchButtonTitle;
    }

    public int hashCode() {
        int e = ly3.e(this.headerTitle, this.screenName.hashCode() * 31, 31);
        ImageDto imageDto = this.headerLeadImage;
        int e2 = ly3.e(this.searchButtonTitle, (e + (imageDto == null ? 0 : imageDto.hashCode())) * 31, 31);
        ImageDto imageDto2 = this.searchButtonLeadImage;
        return e2 + (imageDto2 != null ? imageDto2.hashCode() : 0);
    }

    public String toString() {
        return "CityDiscoveryScreenDto(screenName=" + this.screenName + ", headerTitle=" + this.headerTitle + ", headerLeadImage=" + this.headerLeadImage + ", searchButtonTitle=" + this.searchButtonTitle + ", searchButtonLeadImage=" + this.searchButtonLeadImage + Extension.C_BRAKE;
    }
}
