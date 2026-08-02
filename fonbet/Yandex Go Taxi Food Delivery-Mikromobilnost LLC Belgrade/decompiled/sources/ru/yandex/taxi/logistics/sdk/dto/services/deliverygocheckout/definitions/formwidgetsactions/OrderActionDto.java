package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/OrderActionDto;", "", "flow", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/OrderActionDto$FlowDto;", "formValidation", "", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/OrderActionDto$FlowDto;Ljava/lang/Boolean;)V", "getFlow", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/OrderActionDto$FlowDto;", "getFormValidation", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/OrderActionDto$FlowDto;Ljava/lang/Boolean;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/OrderActionDto;", "equals", "other", "hashCode", "", "toString", "", "FlowDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class OrderActionDto {
    private final FlowDto flow;
    private final Boolean formValidation;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/OrderActionDto$FlowDto;", "", "<init>", "(Ljava/lang/String;I)V", "ROUTE_POINTS", "PICKUP_POINTS", "STATE", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FlowDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ FlowDto[] $VALUES;

        @Json(name = "route_points")
        public static final FlowDto ROUTE_POINTS = new FlowDto("ROUTE_POINTS", 0);

        @Json(name = "pickup_points")
        public static final FlowDto PICKUP_POINTS = new FlowDto("PICKUP_POINTS", 1);

        @Json(name = ClidProvider.STATE)
        public static final FlowDto STATE = new FlowDto("STATE", 2);

        private static final /* synthetic */ FlowDto[] $values() {
            return new FlowDto[]{ROUTE_POINTS, PICKUP_POINTS, STATE};
        }

        static {
            FlowDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private FlowDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static FlowDto valueOf(String str) {
            return (FlowDto) Enum.valueOf(FlowDto.class, str);
        }

        public static FlowDto[] values() {
            return (FlowDto[]) $VALUES.clone();
        }
    }

    public /* synthetic */ OrderActionDto(FlowDto flowDto, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? FlowDto.ROUTE_POINTS : flowDto, bool);
    }

    public static /* synthetic */ OrderActionDto copy$default(OrderActionDto orderActionDto, FlowDto flowDto, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            flowDto = orderActionDto.flow;
        }
        if ((i & 2) != 0) {
            bool = orderActionDto.formValidation;
        }
        return orderActionDto.copy(flowDto, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final FlowDto getFlow() {
        return this.flow;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getFormValidation() {
        return this.formValidation;
    }

    public final OrderActionDto copy(@Json(name = "flow") FlowDto flow, @Json(name = "form_validation") Boolean formValidation) {
        return new OrderActionDto(flow, formValidation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderActionDto)) {
            return false;
        }
        OrderActionDto orderActionDto = (OrderActionDto) other;
        return this.flow == orderActionDto.flow && jl40.l(this.formValidation, orderActionDto.formValidation);
    }

    public final FlowDto getFlow() {
        return this.flow;
    }

    public final Boolean getFormValidation() {
        return this.formValidation;
    }

    public int hashCode() {
        int hashCode = this.flow.hashCode() * 31;
        Boolean bool = this.formValidation;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "OrderActionDto(flow=" + this.flow + ", formValidation=" + this.formValidation + Extension.C_BRAKE;
    }

    public OrderActionDto(@Json(name = "flow") FlowDto flowDto, @Json(name = "form_validation") Boolean bool) {
        this.flow = flowDto;
        this.formValidation = bool;
    }
}
