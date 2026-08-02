package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formaddressdetails;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/AddressDetailsHeaderDto;", "", "title", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "subtitle", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Ljava/lang/String;)V", "getTitle", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getSubtitle", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AddressDetailsHeaderDto {
    private final String backgroundColor;
    private final AttributedTextDto subtitle;
    private final AttributedTextDto title;

    public AddressDetailsHeaderDto(@Json(name = "title") AttributedTextDto attributedTextDto, @Json(name = "subtitle") AttributedTextDto attributedTextDto2, @Json(name = "background_color") String str) {
        this.title = attributedTextDto;
        this.subtitle = attributedTextDto2;
        this.backgroundColor = str;
    }

    public static /* synthetic */ AddressDetailsHeaderDto copy$default(AddressDetailsHeaderDto addressDetailsHeaderDto, AttributedTextDto attributedTextDto, AttributedTextDto attributedTextDto2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            attributedTextDto = addressDetailsHeaderDto.title;
        }
        if ((i & 2) != 0) {
            attributedTextDto2 = addressDetailsHeaderDto.subtitle;
        }
        if ((i & 4) != 0) {
            str = addressDetailsHeaderDto.backgroundColor;
        }
        return addressDetailsHeaderDto.copy(attributedTextDto, attributedTextDto2, str);
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
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final AddressDetailsHeaderDto copy(@Json(name = "title") AttributedTextDto title, @Json(name = "subtitle") AttributedTextDto subtitle, @Json(name = "background_color") String backgroundColor) {
        return new AddressDetailsHeaderDto(title, subtitle, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressDetailsHeaderDto)) {
            return false;
        }
        AddressDetailsHeaderDto addressDetailsHeaderDto = (AddressDetailsHeaderDto) other;
        return jl40.l(this.title, addressDetailsHeaderDto.title) && jl40.l(this.subtitle, addressDetailsHeaderDto.subtitle) && jl40.l(this.backgroundColor, addressDetailsHeaderDto.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
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
        int hashCode2 = (hashCode + (attributedTextDto == null ? 0 : attributedTextDto.hashCode())) * 31;
        String str = this.backgroundColor;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        AttributedTextDto attributedTextDto = this.title;
        AttributedTextDto attributedTextDto2 = this.subtitle;
        String str = this.backgroundColor;
        StringBuilder sb = new StringBuilder("AddressDetailsHeaderDto(title=");
        sb.append(attributedTextDto);
        sb.append(", subtitle=");
        sb.append(attributedTextDto2);
        sb.append(", backgroundColor=");
        return oyr.t(sb, str, Extension.C_BRAKE);
    }
}
