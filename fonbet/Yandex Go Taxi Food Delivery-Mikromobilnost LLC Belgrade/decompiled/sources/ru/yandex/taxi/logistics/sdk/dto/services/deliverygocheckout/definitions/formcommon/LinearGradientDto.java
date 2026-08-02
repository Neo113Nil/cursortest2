package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LinearGradientDto;", "", "colorStops", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/GradientColorStopDto;", "angle", "", "<init>", "(Ljava/util/List;D)V", "getColorStops", "()Ljava/util/List;", "getAngle", "()D", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LinearGradientDto {
    private final double angle;
    private final List<GradientColorStopDto> colorStops;

    public LinearGradientDto(@Json(name = "color_stops") List<GradientColorStopDto> list, @Json(name = "angle") double d) {
        this.colorStops = list;
        this.angle = d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinearGradientDto copy$default(LinearGradientDto linearGradientDto, List list, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            list = linearGradientDto.colorStops;
        }
        if ((i & 2) != 0) {
            d = linearGradientDto.angle;
        }
        return linearGradientDto.copy(list, d);
    }

    public final List<GradientColorStopDto> component1() {
        return this.colorStops;
    }

    /* renamed from: component2, reason: from getter */
    public final double getAngle() {
        return this.angle;
    }

    public final LinearGradientDto copy(@Json(name = "color_stops") List<GradientColorStopDto> colorStops, @Json(name = "angle") double angle) {
        return new LinearGradientDto(colorStops, angle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinearGradientDto)) {
            return false;
        }
        LinearGradientDto linearGradientDto = (LinearGradientDto) other;
        return jl40.l(this.colorStops, linearGradientDto.colorStops) && Double.compare(this.angle, linearGradientDto.angle) == 0;
    }

    public final double getAngle() {
        return this.angle;
    }

    public final List<GradientColorStopDto> getColorStops() {
        return this.colorStops;
    }

    public int hashCode() {
        return Double.hashCode(this.angle) + (this.colorStops.hashCode() * 31);
    }

    public String toString() {
        return "LinearGradientDto(colorStops=" + this.colorStops + ", angle=" + this.angle + Extension.C_BRAKE;
    }
}
