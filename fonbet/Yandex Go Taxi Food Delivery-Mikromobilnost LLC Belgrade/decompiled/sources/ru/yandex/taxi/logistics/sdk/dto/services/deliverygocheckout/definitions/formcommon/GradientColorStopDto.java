package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/GradientColorStopDto;", "", "position", "", "color", "", CaretView.ALPHA_PROPERTY, "<init>", "(DLjava/lang/String;Ljava/lang/Double;)V", "getPosition", "()D", "getColor", "()Ljava/lang/String;", "getAlpha", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "copy", "(DLjava/lang/String;Ljava/lang/Double;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/GradientColorStopDto;", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GradientColorStopDto {
    private final Double alpha;
    private final String color;
    private final double position;

    public GradientColorStopDto(@Json(name = "position") double d, @Json(name = "color") String str, @Json(name = "alpha") Double d2) {
        this.position = d;
        this.color = str;
        this.alpha = d2;
    }

    public static /* synthetic */ GradientColorStopDto copy$default(GradientColorStopDto gradientColorStopDto, double d, String str, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = gradientColorStopDto.position;
        }
        if ((i & 2) != 0) {
            str = gradientColorStopDto.color;
        }
        if ((i & 4) != 0) {
            d2 = gradientColorStopDto.alpha;
        }
        return gradientColorStopDto.copy(d, str, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final double getPosition() {
        return this.position;
    }

    /* renamed from: component2, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getAlpha() {
        return this.alpha;
    }

    public final GradientColorStopDto copy(@Json(name = "position") double position, @Json(name = "color") String color, @Json(name = "alpha") Double alpha) {
        return new GradientColorStopDto(position, color, alpha);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GradientColorStopDto)) {
            return false;
        }
        GradientColorStopDto gradientColorStopDto = (GradientColorStopDto) other;
        return Double.compare(this.position, gradientColorStopDto.position) == 0 && jl40.l(this.color, gradientColorStopDto.color) && jl40.l(this.alpha, gradientColorStopDto.alpha);
    }

    public final Double getAlpha() {
        return this.alpha;
    }

    public final String getColor() {
        return this.color;
    }

    public final double getPosition() {
        return this.position;
    }

    public int hashCode() {
        int b = unr0.b(Double.hashCode(this.position) * 31, 31, this.color);
        Double d = this.alpha;
        return b + (d == null ? 0 : d.hashCode());
    }

    public String toString() {
        return "GradientColorStopDto(position=" + this.position + ", color=" + this.color + ", alpha=" + this.alpha + Extension.C_BRAKE;
    }
}
