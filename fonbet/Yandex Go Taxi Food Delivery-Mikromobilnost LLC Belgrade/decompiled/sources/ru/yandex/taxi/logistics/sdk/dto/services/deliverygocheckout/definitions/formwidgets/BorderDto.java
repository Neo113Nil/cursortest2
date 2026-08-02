package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/BorderDto;", "", "color", "", "width", "", "<init>", "(Ljava/lang/String;D)V", "getColor", "()Ljava/lang/String;", "getWidth", "()D", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BorderDto {
    private final String color;
    private final double width;

    public BorderDto(@Json(name = "color") String str, @Json(name = "width") double d) {
        this.color = str;
        this.width = d;
    }

    public static /* synthetic */ BorderDto copy$default(BorderDto borderDto, String str, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = borderDto.color;
        }
        if ((i & 2) != 0) {
            d = borderDto.width;
        }
        return borderDto.copy(str, d);
    }

    /* renamed from: component1, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* renamed from: component2, reason: from getter */
    public final double getWidth() {
        return this.width;
    }

    public final BorderDto copy(@Json(name = "color") String color, @Json(name = "width") double width) {
        return new BorderDto(color, width);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorderDto)) {
            return false;
        }
        BorderDto borderDto = (BorderDto) other;
        return jl40.l(this.color, borderDto.color) && Double.compare(this.width, borderDto.width) == 0;
    }

    public final String getColor() {
        return this.color;
    }

    public final double getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Double.hashCode(this.width) + (this.color.hashCode() * 31);
    }

    public String toString() {
        return "BorderDto(color=" + this.color + ", width=" + this.width + Extension.C_BRAKE;
    }
}
