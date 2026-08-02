package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ColorDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/QuantityGraphColorsDto;", "", "quantityColor", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "captionColor", "graphColor", "graphColorAccent", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;)V", "getQuantityColor", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "getCaptionColor", "getGraphColor", "getGraphColorAccent", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class QuantityGraphColorsDto {
    private final ColorDto captionColor;
    private final ColorDto graphColor;
    private final ColorDto graphColorAccent;
    private final ColorDto quantityColor;

    public QuantityGraphColorsDto(@Json(name = "quantity_color") ColorDto colorDto, @Json(name = "caption_color") ColorDto colorDto2, @Json(name = "graph_color") ColorDto colorDto3, @Json(name = "graph_color_accent") ColorDto colorDto4) {
        this.quantityColor = colorDto;
        this.captionColor = colorDto2;
        this.graphColor = colorDto3;
        this.graphColorAccent = colorDto4;
    }

    public static /* synthetic */ QuantityGraphColorsDto copy$default(QuantityGraphColorsDto quantityGraphColorsDto, ColorDto colorDto, ColorDto colorDto2, ColorDto colorDto3, ColorDto colorDto4, int i, Object obj) {
        if ((i & 1) != 0) {
            colorDto = quantityGraphColorsDto.quantityColor;
        }
        if ((i & 2) != 0) {
            colorDto2 = quantityGraphColorsDto.captionColor;
        }
        if ((i & 4) != 0) {
            colorDto3 = quantityGraphColorsDto.graphColor;
        }
        if ((i & 8) != 0) {
            colorDto4 = quantityGraphColorsDto.graphColorAccent;
        }
        return quantityGraphColorsDto.copy(colorDto, colorDto2, colorDto3, colorDto4);
    }

    /* renamed from: component1, reason: from getter */
    public final ColorDto getQuantityColor() {
        return this.quantityColor;
    }

    /* renamed from: component2, reason: from getter */
    public final ColorDto getCaptionColor() {
        return this.captionColor;
    }

    /* renamed from: component3, reason: from getter */
    public final ColorDto getGraphColor() {
        return this.graphColor;
    }

    /* renamed from: component4, reason: from getter */
    public final ColorDto getGraphColorAccent() {
        return this.graphColorAccent;
    }

    public final QuantityGraphColorsDto copy(@Json(name = "quantity_color") ColorDto quantityColor, @Json(name = "caption_color") ColorDto captionColor, @Json(name = "graph_color") ColorDto graphColor, @Json(name = "graph_color_accent") ColorDto graphColorAccent) {
        return new QuantityGraphColorsDto(quantityColor, captionColor, graphColor, graphColorAccent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuantityGraphColorsDto)) {
            return false;
        }
        QuantityGraphColorsDto quantityGraphColorsDto = (QuantityGraphColorsDto) other;
        return jl40.l(this.quantityColor, quantityGraphColorsDto.quantityColor) && jl40.l(this.captionColor, quantityGraphColorsDto.captionColor) && jl40.l(this.graphColor, quantityGraphColorsDto.graphColor) && jl40.l(this.graphColorAccent, quantityGraphColorsDto.graphColorAccent);
    }

    public final ColorDto getCaptionColor() {
        return this.captionColor;
    }

    public final ColorDto getGraphColor() {
        return this.graphColor;
    }

    public final ColorDto getGraphColorAccent() {
        return this.graphColorAccent;
    }

    public final ColorDto getQuantityColor() {
        return this.quantityColor;
    }

    public int hashCode() {
        ColorDto colorDto = this.quantityColor;
        int hashCode = (colorDto == null ? 0 : colorDto.hashCode()) * 31;
        ColorDto colorDto2 = this.captionColor;
        int hashCode2 = (hashCode + (colorDto2 == null ? 0 : colorDto2.hashCode())) * 31;
        ColorDto colorDto3 = this.graphColor;
        int hashCode3 = (hashCode2 + (colorDto3 == null ? 0 : colorDto3.hashCode())) * 31;
        ColorDto colorDto4 = this.graphColorAccent;
        return hashCode3 + (colorDto4 != null ? colorDto4.hashCode() : 0);
    }

    public String toString() {
        return "QuantityGraphColorsDto(quantityColor=" + this.quantityColor + ", captionColor=" + this.captionColor + ", graphColor=" + this.graphColor + ", graphColorAccent=" + this.graphColorAccent + Extension.C_BRAKE;
    }
}
