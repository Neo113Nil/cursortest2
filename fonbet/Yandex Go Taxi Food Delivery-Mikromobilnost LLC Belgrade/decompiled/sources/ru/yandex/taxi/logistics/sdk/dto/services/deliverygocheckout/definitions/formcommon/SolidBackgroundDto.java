package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/SolidBackgroundDto;", "", "color", "", CaretView.ALPHA_PROPERTY, "", "<init>", "(Ljava/lang/String;Ljava/lang/Double;)V", "getColor", "()Ljava/lang/String;", "getAlpha", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Double;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/SolidBackgroundDto;", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SolidBackgroundDto {
    private final Double alpha;
    private final String color;

    public SolidBackgroundDto(@Json(name = "color") String str, @Json(name = "alpha") Double d) {
        this.color = str;
        this.alpha = d;
    }

    public static /* synthetic */ SolidBackgroundDto copy$default(SolidBackgroundDto solidBackgroundDto, String str, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = solidBackgroundDto.color;
        }
        if ((i & 2) != 0) {
            d = solidBackgroundDto.alpha;
        }
        return solidBackgroundDto.copy(str, d);
    }

    /* renamed from: component1, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getAlpha() {
        return this.alpha;
    }

    public final SolidBackgroundDto copy(@Json(name = "color") String color, @Json(name = "alpha") Double alpha) {
        return new SolidBackgroundDto(color, alpha);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SolidBackgroundDto)) {
            return false;
        }
        SolidBackgroundDto solidBackgroundDto = (SolidBackgroundDto) other;
        return jl40.l(this.color, solidBackgroundDto.color) && jl40.l(this.alpha, solidBackgroundDto.alpha);
    }

    public final Double getAlpha() {
        return this.alpha;
    }

    public final String getColor() {
        return this.color;
    }

    public int hashCode() {
        int hashCode = this.color.hashCode() * 31;
        Double d = this.alpha;
        return hashCode + (d == null ? 0 : d.hashCode());
    }

    public String toString() {
        return "SolidBackgroundDto(color=" + this.color + ", alpha=" + this.alpha + Extension.C_BRAKE;
    }
}
