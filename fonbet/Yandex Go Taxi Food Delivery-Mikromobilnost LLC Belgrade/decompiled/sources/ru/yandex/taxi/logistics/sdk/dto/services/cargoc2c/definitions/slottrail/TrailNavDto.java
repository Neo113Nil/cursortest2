package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.slottrail;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/slottrail/TrailNavDto;", "", "tintColor", "", "metricaLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTintColor", "()Ljava/lang/String;", "getMetricaLabel", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TrailNavDto {
    private final String metricaLabel;
    private final String tintColor;

    public TrailNavDto(@Json(name = "tint_color") String str, @Json(name = "metrica_label") String str2) {
        this.tintColor = str;
        this.metricaLabel = str2;
    }

    public static /* synthetic */ TrailNavDto copy$default(TrailNavDto trailNavDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trailNavDto.tintColor;
        }
        if ((i & 2) != 0) {
            str2 = trailNavDto.metricaLabel;
        }
        return trailNavDto.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTintColor() {
        return this.tintColor;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final TrailNavDto copy(@Json(name = "tint_color") String tintColor, @Json(name = "metrica_label") String metricaLabel) {
        return new TrailNavDto(tintColor, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrailNavDto)) {
            return false;
        }
        TrailNavDto trailNavDto = (TrailNavDto) other;
        return jl40.l(this.tintColor, trailNavDto.tintColor) && jl40.l(this.metricaLabel, trailNavDto.metricaLabel);
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final String getTintColor() {
        return this.tintColor;
    }

    public int hashCode() {
        String str = this.tintColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.metricaLabel;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return unr0.p("TrailNavDto(tintColor=", this.tintColor, ", metricaLabel=", this.metricaLabel, Extension.C_BRAKE);
    }
}
