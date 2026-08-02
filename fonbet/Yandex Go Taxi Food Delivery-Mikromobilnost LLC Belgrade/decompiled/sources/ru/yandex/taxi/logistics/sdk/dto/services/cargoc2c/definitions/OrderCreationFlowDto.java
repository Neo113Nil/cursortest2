package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/OrderCreationFlowDto;", "", "flowType", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/OrderCreationFlowDto$FlowTypeDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/OrderCreationFlowDto$FlowTypeDto;)V", "getFlowType", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/OrderCreationFlowDto$FlowTypeDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "FlowTypeDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class OrderCreationFlowDto {
    private final FlowTypeDto flowType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/OrderCreationFlowDto$FlowTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "CARGO_API", "UDP_INTEGRATION_API", "UDP_INTEGRATION_API_ON_DEMAND", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FlowTypeDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ FlowTypeDto[] $VALUES;

        @Json(name = "cargo-api")
        public static final FlowTypeDto CARGO_API = new FlowTypeDto("CARGO_API", 0);

        @Json(name = "udp-integration-api")
        public static final FlowTypeDto UDP_INTEGRATION_API = new FlowTypeDto("UDP_INTEGRATION_API", 1);

        @Json(name = "udp-integration-api-on-demand")
        public static final FlowTypeDto UDP_INTEGRATION_API_ON_DEMAND = new FlowTypeDto("UDP_INTEGRATION_API_ON_DEMAND", 2);

        private static final /* synthetic */ FlowTypeDto[] $values() {
            return new FlowTypeDto[]{CARGO_API, UDP_INTEGRATION_API, UDP_INTEGRATION_API_ON_DEMAND};
        }

        static {
            FlowTypeDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private FlowTypeDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static FlowTypeDto valueOf(String str) {
            return (FlowTypeDto) Enum.valueOf(FlowTypeDto.class, str);
        }

        public static FlowTypeDto[] values() {
            return (FlowTypeDto[]) $VALUES.clone();
        }
    }

    public OrderCreationFlowDto(@Json(name = "flow_type") FlowTypeDto flowTypeDto) {
        this.flowType = flowTypeDto;
    }

    public static /* synthetic */ OrderCreationFlowDto copy$default(OrderCreationFlowDto orderCreationFlowDto, FlowTypeDto flowTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            flowTypeDto = orderCreationFlowDto.flowType;
        }
        return orderCreationFlowDto.copy(flowTypeDto);
    }

    /* renamed from: component1, reason: from getter */
    public final FlowTypeDto getFlowType() {
        return this.flowType;
    }

    public final OrderCreationFlowDto copy(@Json(name = "flow_type") FlowTypeDto flowType) {
        return new OrderCreationFlowDto(flowType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OrderCreationFlowDto) && this.flowType == ((OrderCreationFlowDto) other).flowType;
    }

    public final FlowTypeDto getFlowType() {
        return this.flowType;
    }

    public int hashCode() {
        return this.flowType.hashCode();
    }

    public String toString() {
        return "OrderCreationFlowDto(flowType=" + this.flowType + Extension.C_BRAKE;
    }
}
