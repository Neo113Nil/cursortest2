package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ActionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TrailAddressButtonDto;", "", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/MetadataDto;", "metricaLabel", "", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;Ljava/lang/Object;Ljava/lang/String;)V", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "getMeta", "()Ljava/lang/Object;", "getMetricaLabel", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TrailAddressButtonDto {
    private final ActionDto action;
    private final Object meta;
    private final String metricaLabel;

    public TrailAddressButtonDto(@Json(name = "action") ActionDto actionDto, @Json(name = "meta") Object obj, @Json(name = "metrica_label") String str) {
        this.action = actionDto;
        this.meta = obj;
        this.metricaLabel = str;
    }

    public static /* synthetic */ TrailAddressButtonDto copy$default(TrailAddressButtonDto trailAddressButtonDto, ActionDto actionDto, Object obj, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            actionDto = trailAddressButtonDto.action;
        }
        if ((i & 2) != 0) {
            obj = trailAddressButtonDto.meta;
        }
        if ((i & 4) != 0) {
            str = trailAddressButtonDto.metricaLabel;
        }
        return trailAddressButtonDto.copy(actionDto, obj, str);
    }

    /* renamed from: component1, reason: from getter */
    public final ActionDto getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final TrailAddressButtonDto copy(@Json(name = "action") ActionDto action, @Json(name = "meta") Object meta, @Json(name = "metrica_label") String metricaLabel) {
        return new TrailAddressButtonDto(action, meta, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrailAddressButtonDto)) {
            return false;
        }
        TrailAddressButtonDto trailAddressButtonDto = (TrailAddressButtonDto) other;
        return jl40.l(this.action, trailAddressButtonDto.action) && jl40.l(this.meta, trailAddressButtonDto.meta) && jl40.l(this.metricaLabel, trailAddressButtonDto.metricaLabel);
    }

    public final ActionDto getAction() {
        return this.action;
    }

    public final Object getMeta() {
        return this.meta;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public int hashCode() {
        int hashCode = this.action.hashCode() * 31;
        Object obj = this.meta;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.metricaLabel;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        ActionDto actionDto = this.action;
        Object obj = this.meta;
        String str = this.metricaLabel;
        StringBuilder sb = new StringBuilder("TrailAddressButtonDto(action=");
        sb.append(actionDto);
        sb.append(", meta=");
        sb.append(obj);
        sb.append(", metricaLabel=");
        return oyr.t(sb, str, Extension.C_BRAKE);
    }
}
