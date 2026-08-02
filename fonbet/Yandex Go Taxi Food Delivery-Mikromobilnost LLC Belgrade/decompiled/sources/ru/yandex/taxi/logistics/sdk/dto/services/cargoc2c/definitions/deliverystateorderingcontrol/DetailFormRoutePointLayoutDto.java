package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateorderingcontrol;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointLayoutDto;", "", "icon", "", "fields", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormRoutePointFieldLayoutDto;", "metricaLabel", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getIcon", "()Ljava/lang/String;", "getFields", "()Ljava/util/List;", "getMetricaLabel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DetailFormRoutePointLayoutDto {
    private final List<DetailFormRoutePointFieldLayoutDto> fields;
    private final String icon;
    private final String metricaLabel;

    /* JADX WARN: Multi-variable type inference failed */
    public DetailFormRoutePointLayoutDto(@Json(name = "icon") String str, @Json(name = "fields") List<? extends DetailFormRoutePointFieldLayoutDto> list, @Json(name = "metrica_label") String str2) {
        this.icon = str;
        this.fields = list;
        this.metricaLabel = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DetailFormRoutePointLayoutDto copy$default(DetailFormRoutePointLayoutDto detailFormRoutePointLayoutDto, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = detailFormRoutePointLayoutDto.icon;
        }
        if ((i & 2) != 0) {
            list = detailFormRoutePointLayoutDto.fields;
        }
        if ((i & 4) != 0) {
            str2 = detailFormRoutePointLayoutDto.metricaLabel;
        }
        return detailFormRoutePointLayoutDto.copy(str, list, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    public final List<DetailFormRoutePointFieldLayoutDto> component2() {
        return this.fields;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final DetailFormRoutePointLayoutDto copy(@Json(name = "icon") String icon, @Json(name = "fields") List<? extends DetailFormRoutePointFieldLayoutDto> fields, @Json(name = "metrica_label") String metricaLabel) {
        return new DetailFormRoutePointLayoutDto(icon, fields, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailFormRoutePointLayoutDto)) {
            return false;
        }
        DetailFormRoutePointLayoutDto detailFormRoutePointLayoutDto = (DetailFormRoutePointLayoutDto) other;
        return jl40.l(this.icon, detailFormRoutePointLayoutDto.icon) && jl40.l(this.fields, detailFormRoutePointLayoutDto.fields) && jl40.l(this.metricaLabel, detailFormRoutePointLayoutDto.metricaLabel);
    }

    public final List<DetailFormRoutePointFieldLayoutDto> getFields() {
        return this.fields;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public int hashCode() {
        int c = unr0.c(this.icon.hashCode() * 31, 31, this.fields);
        String str = this.metricaLabel;
        return c + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.icon;
        List<DetailFormRoutePointFieldLayoutDto> list = this.fields;
        return oyr.t(xvz.r("DetailFormRoutePointLayoutDto(icon=", str, ", fields=", list, ", metricaLabel="), this.metricaLabel, Extension.C_BRAKE);
    }
}
