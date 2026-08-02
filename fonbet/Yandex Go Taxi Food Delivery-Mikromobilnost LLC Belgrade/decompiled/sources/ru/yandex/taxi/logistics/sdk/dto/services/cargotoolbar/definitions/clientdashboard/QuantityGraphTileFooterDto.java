package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/QuantityGraphTileFooterDto;", "", "total", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/QuantityGraphLabelDto;", "part", "ratio", "", "colors", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/QuantityGraphColorsDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/QuantityGraphLabelDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/QuantityGraphLabelDto;DLru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/QuantityGraphColorsDto;)V", "getTotal", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/QuantityGraphLabelDto;", "getPart", "getRatio", "()D", "getColors", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/QuantityGraphColorsDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class QuantityGraphTileFooterDto {
    private final QuantityGraphColorsDto colors;
    private final QuantityGraphLabelDto part;
    private final double ratio;
    private final QuantityGraphLabelDto total;

    public QuantityGraphTileFooterDto(@Json(name = "total") QuantityGraphLabelDto quantityGraphLabelDto, @Json(name = "part") QuantityGraphLabelDto quantityGraphLabelDto2, @Json(name = "ratio") double d, @Json(name = "colors") QuantityGraphColorsDto quantityGraphColorsDto) {
        this.total = quantityGraphLabelDto;
        this.part = quantityGraphLabelDto2;
        this.ratio = d;
        this.colors = quantityGraphColorsDto;
    }

    public static /* synthetic */ QuantityGraphTileFooterDto copy$default(QuantityGraphTileFooterDto quantityGraphTileFooterDto, QuantityGraphLabelDto quantityGraphLabelDto, QuantityGraphLabelDto quantityGraphLabelDto2, double d, QuantityGraphColorsDto quantityGraphColorsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            quantityGraphLabelDto = quantityGraphTileFooterDto.total;
        }
        if ((i & 2) != 0) {
            quantityGraphLabelDto2 = quantityGraphTileFooterDto.part;
        }
        if ((i & 4) != 0) {
            d = quantityGraphTileFooterDto.ratio;
        }
        if ((i & 8) != 0) {
            quantityGraphColorsDto = quantityGraphTileFooterDto.colors;
        }
        QuantityGraphColorsDto quantityGraphColorsDto2 = quantityGraphColorsDto;
        return quantityGraphTileFooterDto.copy(quantityGraphLabelDto, quantityGraphLabelDto2, d, quantityGraphColorsDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final QuantityGraphLabelDto getTotal() {
        return this.total;
    }

    /* renamed from: component2, reason: from getter */
    public final QuantityGraphLabelDto getPart() {
        return this.part;
    }

    /* renamed from: component3, reason: from getter */
    public final double getRatio() {
        return this.ratio;
    }

    /* renamed from: component4, reason: from getter */
    public final QuantityGraphColorsDto getColors() {
        return this.colors;
    }

    public final QuantityGraphTileFooterDto copy(@Json(name = "total") QuantityGraphLabelDto total, @Json(name = "part") QuantityGraphLabelDto part, @Json(name = "ratio") double ratio, @Json(name = "colors") QuantityGraphColorsDto colors) {
        return new QuantityGraphTileFooterDto(total, part, ratio, colors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuantityGraphTileFooterDto)) {
            return false;
        }
        QuantityGraphTileFooterDto quantityGraphTileFooterDto = (QuantityGraphTileFooterDto) other;
        return jl40.l(this.total, quantityGraphTileFooterDto.total) && jl40.l(this.part, quantityGraphTileFooterDto.part) && Double.compare(this.ratio, quantityGraphTileFooterDto.ratio) == 0 && jl40.l(this.colors, quantityGraphTileFooterDto.colors);
    }

    public final QuantityGraphColorsDto getColors() {
        return this.colors;
    }

    public final QuantityGraphLabelDto getPart() {
        return this.part;
    }

    public final double getRatio() {
        return this.ratio;
    }

    public final QuantityGraphLabelDto getTotal() {
        return this.total;
    }

    public int hashCode() {
        int a = unr0.a((this.part.hashCode() + (this.total.hashCode() * 31)) * 31, 31, this.ratio);
        QuantityGraphColorsDto quantityGraphColorsDto = this.colors;
        return a + (quantityGraphColorsDto == null ? 0 : quantityGraphColorsDto.hashCode());
    }

    public String toString() {
        return "QuantityGraphTileFooterDto(total=" + this.total + ", part=" + this.part + ", ratio=" + this.ratio + ", colors=" + this.colors + Extension.C_BRAKE;
    }
}
