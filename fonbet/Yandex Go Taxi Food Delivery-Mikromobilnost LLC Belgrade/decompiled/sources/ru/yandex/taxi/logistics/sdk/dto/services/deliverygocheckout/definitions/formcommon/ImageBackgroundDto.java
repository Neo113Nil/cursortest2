package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J0\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageBackgroundDto;", "", "image", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", CaretView.ALPHA_PROPERTY, "", "scaleType", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ScaleTypeDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;Ljava/lang/Double;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ScaleTypeDto;)V", "getImage", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "getAlpha", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getScaleType", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ScaleTypeDto;", "component1", "component2", "component3", "copy", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;Ljava/lang/Double;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ScaleTypeDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageBackgroundDto;", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ImageBackgroundDto {
    private final Double alpha;
    private final ImageDto image;
    private final ScaleTypeDto scaleType;

    public ImageBackgroundDto(@Json(name = "image") ImageDto imageDto, @Json(name = "alpha") Double d, @Json(name = "scale_type") ScaleTypeDto scaleTypeDto) {
        this.image = imageDto;
        this.alpha = d;
        this.scaleType = scaleTypeDto;
    }

    public static /* synthetic */ ImageBackgroundDto copy$default(ImageBackgroundDto imageBackgroundDto, ImageDto imageDto, Double d, ScaleTypeDto scaleTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            imageDto = imageBackgroundDto.image;
        }
        if ((i & 2) != 0) {
            d = imageBackgroundDto.alpha;
        }
        if ((i & 4) != 0) {
            scaleTypeDto = imageBackgroundDto.scaleType;
        }
        return imageBackgroundDto.copy(imageDto, d, scaleTypeDto);
    }

    /* renamed from: component1, reason: from getter */
    public final ImageDto getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getAlpha() {
        return this.alpha;
    }

    /* renamed from: component3, reason: from getter */
    public final ScaleTypeDto getScaleType() {
        return this.scaleType;
    }

    public final ImageBackgroundDto copy(@Json(name = "image") ImageDto image, @Json(name = "alpha") Double alpha, @Json(name = "scale_type") ScaleTypeDto scaleType) {
        return new ImageBackgroundDto(image, alpha, scaleType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageBackgroundDto)) {
            return false;
        }
        ImageBackgroundDto imageBackgroundDto = (ImageBackgroundDto) other;
        return jl40.l(this.image, imageBackgroundDto.image) && jl40.l(this.alpha, imageBackgroundDto.alpha) && this.scaleType == imageBackgroundDto.scaleType;
    }

    public final Double getAlpha() {
        return this.alpha;
    }

    public final ImageDto getImage() {
        return this.image;
    }

    public final ScaleTypeDto getScaleType() {
        return this.scaleType;
    }

    public int hashCode() {
        int hashCode = this.image.hashCode() * 31;
        Double d = this.alpha;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        ScaleTypeDto scaleTypeDto = this.scaleType;
        return hashCode2 + (scaleTypeDto != null ? scaleTypeDto.hashCode() : 0);
    }

    public String toString() {
        return "ImageBackgroundDto(image=" + this.image + ", alpha=" + this.alpha + ", scaleType=" + this.scaleType + Extension.C_BRAKE;
    }
}
