package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ImageDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SliderHandlerDto;", "", "activeImage", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "completeImage", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;Ljava/lang/String;)V", "getActiveImage", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "getCompleteImage", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SliderHandlerDto {
    private final ImageDto activeImage;
    private final String backgroundColor;
    private final ImageDto completeImage;

    public SliderHandlerDto(@Json(name = "active_image") ImageDto imageDto, @Json(name = "complete_image") ImageDto imageDto2, @Json(name = "background_color") String str) {
        this.activeImage = imageDto;
        this.completeImage = imageDto2;
        this.backgroundColor = str;
    }

    public static /* synthetic */ SliderHandlerDto copy$default(SliderHandlerDto sliderHandlerDto, ImageDto imageDto, ImageDto imageDto2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            imageDto = sliderHandlerDto.activeImage;
        }
        if ((i & 2) != 0) {
            imageDto2 = sliderHandlerDto.completeImage;
        }
        if ((i & 4) != 0) {
            str = sliderHandlerDto.backgroundColor;
        }
        return sliderHandlerDto.copy(imageDto, imageDto2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final ImageDto getActiveImage() {
        return this.activeImage;
    }

    /* renamed from: component2, reason: from getter */
    public final ImageDto getCompleteImage() {
        return this.completeImage;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final SliderHandlerDto copy(@Json(name = "active_image") ImageDto activeImage, @Json(name = "complete_image") ImageDto completeImage, @Json(name = "background_color") String backgroundColor) {
        return new SliderHandlerDto(activeImage, completeImage, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SliderHandlerDto)) {
            return false;
        }
        SliderHandlerDto sliderHandlerDto = (SliderHandlerDto) other;
        return jl40.l(this.activeImage, sliderHandlerDto.activeImage) && jl40.l(this.completeImage, sliderHandlerDto.completeImage) && jl40.l(this.backgroundColor, sliderHandlerDto.backgroundColor);
    }

    public final ImageDto getActiveImage() {
        return this.activeImage;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ImageDto getCompleteImage() {
        return this.completeImage;
    }

    public int hashCode() {
        ImageDto imageDto = this.activeImage;
        int hashCode = (imageDto == null ? 0 : imageDto.hashCode()) * 31;
        ImageDto imageDto2 = this.completeImage;
        int hashCode2 = (hashCode + (imageDto2 == null ? 0 : imageDto2.hashCode())) * 31;
        String str = this.backgroundColor;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        ImageDto imageDto = this.activeImage;
        ImageDto imageDto2 = this.completeImage;
        String str = this.backgroundColor;
        StringBuilder sb = new StringBuilder("SliderHandlerDto(activeImage=");
        sb.append(imageDto);
        sb.append(", completeImage=");
        sb.append(imageDto2);
        sb.append(", backgroundColor=");
        return oyr.t(sb, str, Extension.C_BRAKE);
    }
}
