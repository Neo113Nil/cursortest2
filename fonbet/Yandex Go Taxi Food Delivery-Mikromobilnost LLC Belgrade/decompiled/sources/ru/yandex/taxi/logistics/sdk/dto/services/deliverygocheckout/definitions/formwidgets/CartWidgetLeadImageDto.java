package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.jl40;
import defpackage.n;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.FormBadgeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ImageDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J<\u0010\u0019\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CartWidgetLeadImageDto;", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "", "image", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "badge", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/FormBadgeDto;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/FormBadgeDto;)V", "getBackgroundColor", "()Ljava/lang/String;", "getCornerRadius", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getImage", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "getBadge", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/FormBadgeDto;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/FormBadgeDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CartWidgetLeadImageDto;", "equals", "", "other", "hashCode", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CartWidgetLeadImageDto {
    private final String backgroundColor;
    private final FormBadgeDto badge;
    private final Integer cornerRadius;
    private final ImageDto image;

    public CartWidgetLeadImageDto(@Json(name = "background_color") String str, @Json(name = "corner_radius") Integer num, @Json(name = "image") ImageDto imageDto, @Json(name = "badge") FormBadgeDto formBadgeDto) {
        this.backgroundColor = str;
        this.cornerRadius = num;
        this.image = imageDto;
        this.badge = formBadgeDto;
    }

    public static /* synthetic */ CartWidgetLeadImageDto copy$default(CartWidgetLeadImageDto cartWidgetLeadImageDto, String str, Integer num, ImageDto imageDto, FormBadgeDto formBadgeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cartWidgetLeadImageDto.backgroundColor;
        }
        if ((i & 2) != 0) {
            num = cartWidgetLeadImageDto.cornerRadius;
        }
        if ((i & 4) != 0) {
            imageDto = cartWidgetLeadImageDto.image;
        }
        if ((i & 8) != 0) {
            formBadgeDto = cartWidgetLeadImageDto.badge;
        }
        return cartWidgetLeadImageDto.copy(str, num, imageDto, formBadgeDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: component3, reason: from getter */
    public final ImageDto getImage() {
        return this.image;
    }

    /* renamed from: component4, reason: from getter */
    public final FormBadgeDto getBadge() {
        return this.badge;
    }

    public final CartWidgetLeadImageDto copy(@Json(name = "background_color") String backgroundColor, @Json(name = "corner_radius") Integer cornerRadius, @Json(name = "image") ImageDto image, @Json(name = "badge") FormBadgeDto badge) {
        return new CartWidgetLeadImageDto(backgroundColor, cornerRadius, image, badge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartWidgetLeadImageDto)) {
            return false;
        }
        CartWidgetLeadImageDto cartWidgetLeadImageDto = (CartWidgetLeadImageDto) other;
        return jl40.l(this.backgroundColor, cartWidgetLeadImageDto.backgroundColor) && jl40.l(this.cornerRadius, cartWidgetLeadImageDto.cornerRadius) && jl40.l(this.image, cartWidgetLeadImageDto.image) && jl40.l(this.badge, cartWidgetLeadImageDto.badge);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final FormBadgeDto getBadge() {
        return this.badge;
    }

    public final Integer getCornerRadius() {
        return this.cornerRadius;
    }

    public final ImageDto getImage() {
        return this.image;
    }

    public int hashCode() {
        String str = this.backgroundColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.cornerRadius;
        int hashCode2 = (this.image.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        FormBadgeDto formBadgeDto = this.badge;
        return hashCode2 + (formBadgeDto != null ? formBadgeDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.backgroundColor;
        Integer num = this.cornerRadius;
        ImageDto imageDto = this.image;
        FormBadgeDto formBadgeDto = this.badge;
        StringBuilder q = n.q("CartWidgetLeadImageDto(backgroundColor=", num, str, ", cornerRadius=", ", image=");
        q.append(imageDto);
        q.append(", badge=");
        q.append(formBadgeDto);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }
}
