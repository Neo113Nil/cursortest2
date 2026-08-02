package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ:\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/ColorDto;", "", "colorDay", "", "colorNight", "alphaDay", "", "alphaNight", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "getColorDay", "()Ljava/lang/String;", "getColorNight", "getAlphaDay", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAlphaNight", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/ColorDto;", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ColorDto {
    private final Double alphaDay;
    private final Double alphaNight;
    private final String colorDay;
    private final String colorNight;

    public ColorDto(@Json(name = "color_day") String str, @Json(name = "color_night") String str2, @Json(name = "alpha_day") Double d, @Json(name = "alpha_night") Double d2) {
        this.colorDay = str;
        this.colorNight = str2;
        this.alphaDay = d;
        this.alphaNight = d2;
    }

    public static /* synthetic */ ColorDto copy$default(ColorDto colorDto, String str, String str2, Double d, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = colorDto.colorDay;
        }
        if ((i & 2) != 0) {
            str2 = colorDto.colorNight;
        }
        if ((i & 4) != 0) {
            d = colorDto.alphaDay;
        }
        if ((i & 8) != 0) {
            d2 = colorDto.alphaNight;
        }
        return colorDto.copy(str, str2, d, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getColorDay() {
        return this.colorDay;
    }

    /* renamed from: component2, reason: from getter */
    public final String getColorNight() {
        return this.colorNight;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getAlphaDay() {
        return this.alphaDay;
    }

    /* renamed from: component4, reason: from getter */
    public final Double getAlphaNight() {
        return this.alphaNight;
    }

    public final ColorDto copy(@Json(name = "color_day") String colorDay, @Json(name = "color_night") String colorNight, @Json(name = "alpha_day") Double alphaDay, @Json(name = "alpha_night") Double alphaNight) {
        return new ColorDto(colorDay, colorNight, alphaDay, alphaNight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColorDto)) {
            return false;
        }
        ColorDto colorDto = (ColorDto) other;
        return jl40.l(this.colorDay, colorDto.colorDay) && jl40.l(this.colorNight, colorDto.colorNight) && jl40.l(this.alphaDay, colorDto.alphaDay) && jl40.l(this.alphaNight, colorDto.alphaNight);
    }

    public final Double getAlphaDay() {
        return this.alphaDay;
    }

    public final Double getAlphaNight() {
        return this.alphaNight;
    }

    public final String getColorDay() {
        return this.colorDay;
    }

    public final String getColorNight() {
        return this.colorNight;
    }

    public int hashCode() {
        int b = unr0.b(this.colorDay.hashCode() * 31, 31, this.colorNight);
        Double d = this.alphaDay;
        int hashCode = (b + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.alphaNight;
        return hashCode + (d2 != null ? d2.hashCode() : 0);
    }

    public String toString() {
        String str = this.colorDay;
        String str2 = this.colorNight;
        Double d = this.alphaDay;
        Double d2 = this.alphaNight;
        StringBuilder v = b64.v("ColorDto(colorDay=", str, ", colorNight=", str2, ", alphaDay=");
        v.append(d);
        v.append(", alphaNight=");
        v.append(d2);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
