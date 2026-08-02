package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001-Be\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003Jl\u0010%\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0018\u0010\u0013R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001b¨\u0006."}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ImageBackgroundDto;", "", "imageTag", "", CaretView.ALPHA_PROPERTY, "", "scale", "scaleType", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ImageBackgroundDto$ScaleTypeDto;", "horizontalOffsetPt", "verticalOffsetPt", "baseColor", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "rippleColor", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ImageBackgroundDto$ScaleTypeDto;Ljava/lang/Double;Ljava/lang/Double;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;)V", "getImageTag", "()Ljava/lang/String;", "getAlpha", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getScale", "getScaleType", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ImageBackgroundDto$ScaleTypeDto;", "getHorizontalOffsetPt", "getVerticalOffsetPt", "getBaseColor", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "getRippleColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ImageBackgroundDto$ScaleTypeDto;Ljava/lang/Double;Ljava/lang/Double;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ImageBackgroundDto;", "equals", "", "other", "hashCode", "", "toString", "ScaleTypeDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ImageBackgroundDto {
    private final Double alpha;
    private final ColorDto baseColor;
    private final Double horizontalOffsetPt;
    private final String imageTag;
    private final ColorDto rippleColor;
    private final Double scale;
    private final ScaleTypeDto scaleType;
    private final Double verticalOffsetPt;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ImageBackgroundDto$ScaleTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "ASPECT_FILL", "SCALE_TO_FILL", "ASPECT_FIT", JCP.RAW_PREFIX, "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ScaleTypeDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ScaleTypeDto[] $VALUES;

        @Json(name = "aspect_fill")
        public static final ScaleTypeDto ASPECT_FILL = new ScaleTypeDto("ASPECT_FILL", 0);

        @Json(name = "scale_to_fill")
        public static final ScaleTypeDto SCALE_TO_FILL = new ScaleTypeDto("SCALE_TO_FILL", 1);

        @Json(name = "aspect_fit")
        public static final ScaleTypeDto ASPECT_FIT = new ScaleTypeDto("ASPECT_FIT", 2);

        @Json(name = "none")
        public static final ScaleTypeDto NONE = new ScaleTypeDto(JCP.RAW_PREFIX, 3);

        private static final /* synthetic */ ScaleTypeDto[] $values() {
            return new ScaleTypeDto[]{ASPECT_FILL, SCALE_TO_FILL, ASPECT_FIT, NONE};
        }

        static {
            ScaleTypeDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private ScaleTypeDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static ScaleTypeDto valueOf(String str) {
            return (ScaleTypeDto) Enum.valueOf(ScaleTypeDto.class, str);
        }

        public static ScaleTypeDto[] values() {
            return (ScaleTypeDto[]) $VALUES.clone();
        }
    }

    public ImageBackgroundDto(@Json(name = "image_tag") String str, @Json(name = "alpha") Double d, @Json(name = "scale") Double d2, @Json(name = "scale_type") ScaleTypeDto scaleTypeDto, @Json(name = "horizontal_offset_pt") Double d3, @Json(name = "vertical_offset_pt") Double d4, @Json(name = "base_color") ColorDto colorDto, @Json(name = "ripple_color") ColorDto colorDto2) {
        this.imageTag = str;
        this.alpha = d;
        this.scale = d2;
        this.scaleType = scaleTypeDto;
        this.horizontalOffsetPt = d3;
        this.verticalOffsetPt = d4;
        this.baseColor = colorDto;
        this.rippleColor = colorDto2;
    }

    public static /* synthetic */ ImageBackgroundDto copy$default(ImageBackgroundDto imageBackgroundDto, String str, Double d, Double d2, ScaleTypeDto scaleTypeDto, Double d3, Double d4, ColorDto colorDto, ColorDto colorDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageBackgroundDto.imageTag;
        }
        if ((i & 2) != 0) {
            d = imageBackgroundDto.alpha;
        }
        if ((i & 4) != 0) {
            d2 = imageBackgroundDto.scale;
        }
        if ((i & 8) != 0) {
            scaleTypeDto = imageBackgroundDto.scaleType;
        }
        if ((i & 16) != 0) {
            d3 = imageBackgroundDto.horizontalOffsetPt;
        }
        if ((i & 32) != 0) {
            d4 = imageBackgroundDto.verticalOffsetPt;
        }
        if ((i & 64) != 0) {
            colorDto = imageBackgroundDto.baseColor;
        }
        if ((i & 128) != 0) {
            colorDto2 = imageBackgroundDto.rippleColor;
        }
        ColorDto colorDto3 = colorDto;
        ColorDto colorDto4 = colorDto2;
        Double d5 = d3;
        Double d6 = d4;
        return imageBackgroundDto.copy(str, d, d2, scaleTypeDto, d5, d6, colorDto3, colorDto4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getImageTag() {
        return this.imageTag;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getAlpha() {
        return this.alpha;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getScale() {
        return this.scale;
    }

    /* renamed from: component4, reason: from getter */
    public final ScaleTypeDto getScaleType() {
        return this.scaleType;
    }

    /* renamed from: component5, reason: from getter */
    public final Double getHorizontalOffsetPt() {
        return this.horizontalOffsetPt;
    }

    /* renamed from: component6, reason: from getter */
    public final Double getVerticalOffsetPt() {
        return this.verticalOffsetPt;
    }

    /* renamed from: component7, reason: from getter */
    public final ColorDto getBaseColor() {
        return this.baseColor;
    }

    /* renamed from: component8, reason: from getter */
    public final ColorDto getRippleColor() {
        return this.rippleColor;
    }

    public final ImageBackgroundDto copy(@Json(name = "image_tag") String imageTag, @Json(name = "alpha") Double alpha, @Json(name = "scale") Double scale, @Json(name = "scale_type") ScaleTypeDto scaleType, @Json(name = "horizontal_offset_pt") Double horizontalOffsetPt, @Json(name = "vertical_offset_pt") Double verticalOffsetPt, @Json(name = "base_color") ColorDto baseColor, @Json(name = "ripple_color") ColorDto rippleColor) {
        return new ImageBackgroundDto(imageTag, alpha, scale, scaleType, horizontalOffsetPt, verticalOffsetPt, baseColor, rippleColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageBackgroundDto)) {
            return false;
        }
        ImageBackgroundDto imageBackgroundDto = (ImageBackgroundDto) other;
        return jl40.l(this.imageTag, imageBackgroundDto.imageTag) && jl40.l(this.alpha, imageBackgroundDto.alpha) && jl40.l(this.scale, imageBackgroundDto.scale) && this.scaleType == imageBackgroundDto.scaleType && jl40.l(this.horizontalOffsetPt, imageBackgroundDto.horizontalOffsetPt) && jl40.l(this.verticalOffsetPt, imageBackgroundDto.verticalOffsetPt) && jl40.l(this.baseColor, imageBackgroundDto.baseColor) && jl40.l(this.rippleColor, imageBackgroundDto.rippleColor);
    }

    public final Double getAlpha() {
        return this.alpha;
    }

    public final ColorDto getBaseColor() {
        return this.baseColor;
    }

    public final Double getHorizontalOffsetPt() {
        return this.horizontalOffsetPt;
    }

    public final String getImageTag() {
        return this.imageTag;
    }

    public final ColorDto getRippleColor() {
        return this.rippleColor;
    }

    public final Double getScale() {
        return this.scale;
    }

    public final ScaleTypeDto getScaleType() {
        return this.scaleType;
    }

    public final Double getVerticalOffsetPt() {
        return this.verticalOffsetPt;
    }

    public int hashCode() {
        int hashCode = this.imageTag.hashCode() * 31;
        Double d = this.alpha;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.scale;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        ScaleTypeDto scaleTypeDto = this.scaleType;
        int hashCode4 = (hashCode3 + (scaleTypeDto == null ? 0 : scaleTypeDto.hashCode())) * 31;
        Double d3 = this.horizontalOffsetPt;
        int hashCode5 = (hashCode4 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.verticalOffsetPt;
        int hashCode6 = (hashCode5 + (d4 == null ? 0 : d4.hashCode())) * 31;
        ColorDto colorDto = this.baseColor;
        int hashCode7 = (hashCode6 + (colorDto == null ? 0 : colorDto.hashCode())) * 31;
        ColorDto colorDto2 = this.rippleColor;
        return hashCode7 + (colorDto2 != null ? colorDto2.hashCode() : 0);
    }

    public String toString() {
        return "ImageBackgroundDto(imageTag=" + this.imageTag + ", alpha=" + this.alpha + ", scale=" + this.scale + ", scaleType=" + this.scaleType + ", horizontalOffsetPt=" + this.horizontalOffsetPt + ", verticalOffsetPt=" + this.verticalOffsetPt + ", baseColor=" + this.baseColor + ", rippleColor=" + this.rippleColor + Extension.C_BRAKE;
    }
}
