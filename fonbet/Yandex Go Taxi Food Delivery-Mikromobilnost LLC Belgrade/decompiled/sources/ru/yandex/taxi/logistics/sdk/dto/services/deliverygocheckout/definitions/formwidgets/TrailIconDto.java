package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ImageDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TrailIconDto;", "", "icon", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "presentationId", "", "metricaLabel", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "getPresentationId", "()Ljava/lang/String;", "getMetricaLabel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TrailIconDto {
    private final ImageDto icon;
    private final String metricaLabel;
    private final String presentationId;

    public TrailIconDto(@Json(name = "icon") ImageDto imageDto, @Json(name = "presentation_id") String str, @Json(name = "metrica_label") String str2) {
        this.icon = imageDto;
        this.presentationId = str;
        this.metricaLabel = str2;
    }

    public static /* synthetic */ TrailIconDto copy$default(TrailIconDto trailIconDto, ImageDto imageDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            imageDto = trailIconDto.icon;
        }
        if ((i & 2) != 0) {
            str = trailIconDto.presentationId;
        }
        if ((i & 4) != 0) {
            str2 = trailIconDto.metricaLabel;
        }
        return trailIconDto.copy(imageDto, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final ImageDto getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPresentationId() {
        return this.presentationId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final TrailIconDto copy(@Json(name = "icon") ImageDto icon, @Json(name = "presentation_id") String presentationId, @Json(name = "metrica_label") String metricaLabel) {
        return new TrailIconDto(icon, presentationId, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrailIconDto)) {
            return false;
        }
        TrailIconDto trailIconDto = (TrailIconDto) other;
        return jl40.l(this.icon, trailIconDto.icon) && jl40.l(this.presentationId, trailIconDto.presentationId) && jl40.l(this.metricaLabel, trailIconDto.metricaLabel);
    }

    public final ImageDto getIcon() {
        return this.icon;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final String getPresentationId() {
        return this.presentationId;
    }

    public int hashCode() {
        int hashCode = this.icon.hashCode() * 31;
        String str = this.presentationId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.metricaLabel;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        ImageDto imageDto = this.icon;
        String str = this.presentationId;
        String str2 = this.metricaLabel;
        StringBuilder sb = new StringBuilder("TrailIconDto(icon=");
        sb.append(imageDto);
        sb.append(", presentationId=");
        sb.append(str);
        sb.append(", metricaLabel=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
