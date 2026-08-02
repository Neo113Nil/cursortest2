package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorStopDto;", "", "position", "", "color", "", "<init>", "(DLjava/lang/String;)V", "getPosition", "()D", "getColor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ColorStopDto {
    private final String color;
    private final double position;

    public ColorStopDto(@Json(name = "position") double d, @Json(name = "color") String str) {
        this.position = d;
        this.color = str;
    }

    public static /* synthetic */ ColorStopDto copy$default(ColorStopDto colorStopDto, double d, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = colorStopDto.position;
        }
        if ((i & 2) != 0) {
            str = colorStopDto.color;
        }
        return colorStopDto.copy(d, str);
    }

    /* renamed from: component1, reason: from getter */
    public final double getPosition() {
        return this.position;
    }

    /* renamed from: component2, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    public final ColorStopDto copy(@Json(name = "position") double position, @Json(name = "color") String color) {
        return new ColorStopDto(position, color);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColorStopDto)) {
            return false;
        }
        ColorStopDto colorStopDto = (ColorStopDto) other;
        return Double.compare(this.position, colorStopDto.position) == 0 && jl40.l(this.color, colorStopDto.color);
    }

    public final String getColor() {
        return this.color;
    }

    public final double getPosition() {
        return this.position;
    }

    public int hashCode() {
        return this.color.hashCode() + (Double.hashCode(this.position) * 31);
    }

    public String toString() {
        return "ColorStopDto(position=" + this.position + ", color=" + this.color + Extension.C_BRAKE;
    }
}
