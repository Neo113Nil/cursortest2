package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonWidthPercentDto;", "", "percent", "", "<init>", "(D)V", "getPercent", "()D", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ButtonWidthPercentDto {
    private final double percent;

    public ButtonWidthPercentDto(@Json(name = "percent") double d) {
        this.percent = d;
    }

    public static /* synthetic */ ButtonWidthPercentDto copy$default(ButtonWidthPercentDto buttonWidthPercentDto, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            d = buttonWidthPercentDto.percent;
        }
        return buttonWidthPercentDto.copy(d);
    }

    /* renamed from: component1, reason: from getter */
    public final double getPercent() {
        return this.percent;
    }

    public final ButtonWidthPercentDto copy(@Json(name = "percent") double percent) {
        return new ButtonWidthPercentDto(percent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ButtonWidthPercentDto) && Double.compare(this.percent, ((ButtonWidthPercentDto) other).percent) == 0;
    }

    public final double getPercent() {
        return this.percent;
    }

    public int hashCode() {
        return Double.hashCode(this.percent);
    }

    public String toString() {
        return "ButtonWidthPercentDto(percent=" + this.percent + Extension.C_BRAKE;
    }
}
