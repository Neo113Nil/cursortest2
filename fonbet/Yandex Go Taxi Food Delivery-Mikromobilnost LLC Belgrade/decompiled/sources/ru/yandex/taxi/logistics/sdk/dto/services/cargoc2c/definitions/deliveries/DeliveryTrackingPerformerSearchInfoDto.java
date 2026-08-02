package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliveries;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.DynamicSearchStatusDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J,\u0010\u0010\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveries/DeliveryTrackingPerformerSearchInfoDto;", "", "estimate", "", "dynamicSearchStatuses", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/DynamicSearchStatusDto;", "<init>", "(Ljava/lang/Long;Ljava/util/List;)V", "getEstimate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDynamicSearchStatuses", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/util/List;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveries/DeliveryTrackingPerformerSearchInfoDto;", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DeliveryTrackingPerformerSearchInfoDto {
    private final List<DynamicSearchStatusDto> dynamicSearchStatuses;
    private final Long estimate;

    public DeliveryTrackingPerformerSearchInfoDto(@Json(name = "estimate") Long l, @Json(name = "dynamic_search_statuses") List<DynamicSearchStatusDto> list) {
        this.estimate = l;
        this.dynamicSearchStatuses = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeliveryTrackingPerformerSearchInfoDto copy$default(DeliveryTrackingPerformerSearchInfoDto deliveryTrackingPerformerSearchInfoDto, Long l, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            l = deliveryTrackingPerformerSearchInfoDto.estimate;
        }
        if ((i & 2) != 0) {
            list = deliveryTrackingPerformerSearchInfoDto.dynamicSearchStatuses;
        }
        return deliveryTrackingPerformerSearchInfoDto.copy(l, list);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getEstimate() {
        return this.estimate;
    }

    public final List<DynamicSearchStatusDto> component2() {
        return this.dynamicSearchStatuses;
    }

    public final DeliveryTrackingPerformerSearchInfoDto copy(@Json(name = "estimate") Long estimate, @Json(name = "dynamic_search_statuses") List<DynamicSearchStatusDto> dynamicSearchStatuses) {
        return new DeliveryTrackingPerformerSearchInfoDto(estimate, dynamicSearchStatuses);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryTrackingPerformerSearchInfoDto)) {
            return false;
        }
        DeliveryTrackingPerformerSearchInfoDto deliveryTrackingPerformerSearchInfoDto = (DeliveryTrackingPerformerSearchInfoDto) other;
        return jl40.l(this.estimate, deliveryTrackingPerformerSearchInfoDto.estimate) && jl40.l(this.dynamicSearchStatuses, deliveryTrackingPerformerSearchInfoDto.dynamicSearchStatuses);
    }

    public final List<DynamicSearchStatusDto> getDynamicSearchStatuses() {
        return this.dynamicSearchStatuses;
    }

    public final Long getEstimate() {
        return this.estimate;
    }

    public int hashCode() {
        Long l = this.estimate;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        List<DynamicSearchStatusDto> list = this.dynamicSearchStatuses;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "DeliveryTrackingPerformerSearchInfoDto(estimate=" + this.estimate + ", dynamicSearchStatuses=" + this.dynamicSearchStatuses + Extension.C_BRAKE;
    }
}
