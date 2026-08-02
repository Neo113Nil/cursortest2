package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.tse0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerRouteDto;", "", "sortedRoutePoints", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PerformerRoutePointDto;", "<init>", "(Ljava/util/List;)V", "getSortedRoutePoints", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PerformerRouteDto {
    private final List<PerformerRoutePointDto> sortedRoutePoints;

    public PerformerRouteDto(@Json(name = "sorted_route_points") List<PerformerRoutePointDto> list) {
        this.sortedRoutePoints = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PerformerRouteDto copy$default(PerformerRouteDto performerRouteDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = performerRouteDto.sortedRoutePoints;
        }
        return performerRouteDto.copy(list);
    }

    public final List<PerformerRoutePointDto> component1() {
        return this.sortedRoutePoints;
    }

    public final PerformerRouteDto copy(@Json(name = "sorted_route_points") List<PerformerRoutePointDto> sortedRoutePoints) {
        return new PerformerRouteDto(sortedRoutePoints);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PerformerRouteDto) && jl40.l(this.sortedRoutePoints, ((PerformerRouteDto) other).sortedRoutePoints);
    }

    public final List<PerformerRoutePointDto> getSortedRoutePoints() {
        return this.sortedRoutePoints;
    }

    public int hashCode() {
        return this.sortedRoutePoints.hashCode();
    }

    public String toString() {
        return tse0.k("PerformerRouteDto(sortedRoutePoints=", Extension.C_BRAKE, this.sortedRoutePoints);
    }
}
