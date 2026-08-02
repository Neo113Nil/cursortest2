package ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_ai_tools;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/GradientStopDto;", "", "color", "", "location", "", "<init>", "(Ljava/lang/String;D)V", "getColor", "()Ljava/lang/String;", "getLocation", "()D", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GradientStopDto {
    private final String color;
    private final double location;

    public GradientStopDto(@Json(name = "color") String str, @Json(name = "location") double d) {
        this.color = str;
        this.location = d;
    }

    public static /* synthetic */ GradientStopDto copy$default(GradientStopDto gradientStopDto, String str, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gradientStopDto.color;
        }
        if ((i & 2) != 0) {
            d = gradientStopDto.location;
        }
        return gradientStopDto.copy(str, d);
    }

    /* renamed from: component1, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* renamed from: component2, reason: from getter */
    public final double getLocation() {
        return this.location;
    }

    public final GradientStopDto copy(@Json(name = "color") String color, @Json(name = "location") double location) {
        return new GradientStopDto(color, location);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GradientStopDto)) {
            return false;
        }
        GradientStopDto gradientStopDto = (GradientStopDto) other;
        return jl40.l(this.color, gradientStopDto.color) && Double.compare(this.location, gradientStopDto.location) == 0;
    }

    public final String getColor() {
        return this.color;
    }

    public final double getLocation() {
        return this.location;
    }

    public int hashCode() {
        return Double.hashCode(this.location) + (this.color.hashCode() * 31);
    }

    public String toString() {
        return "GradientStopDto(color=" + this.color + ", location=" + this.location + Extension.C_BRAKE;
    }
}
