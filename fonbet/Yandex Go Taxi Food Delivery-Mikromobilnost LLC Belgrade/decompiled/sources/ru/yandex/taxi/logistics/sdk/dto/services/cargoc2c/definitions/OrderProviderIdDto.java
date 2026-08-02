package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.Json;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/OrderProviderIdDto;", "", "<init>", "(Ljava/lang/String;I)V", "CARGO_CLAIMS", "CARGO_C2C", "LOGISTIC_PLATFORM", "LOGISTIC_PLATFORM_C2C", "MARKET_LAVKA_GATEWAY", "TAXI", "UNITED_DELIVERY_PLATFORM", "UNITED_DELIVERY_PLATFORM_C2C", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OrderProviderIdDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrderProviderIdDto[] $VALUES;

    @Json(name = "cargo-claims")
    public static final OrderProviderIdDto CARGO_CLAIMS = new OrderProviderIdDto("CARGO_CLAIMS", 0);

    @Json(name = "cargo-c2c")
    public static final OrderProviderIdDto CARGO_C2C = new OrderProviderIdDto("CARGO_C2C", 1);

    @Json(name = "logistic-platform")
    public static final OrderProviderIdDto LOGISTIC_PLATFORM = new OrderProviderIdDto("LOGISTIC_PLATFORM", 2);

    @Json(name = "logistic-platform-c2c")
    public static final OrderProviderIdDto LOGISTIC_PLATFORM_C2C = new OrderProviderIdDto("LOGISTIC_PLATFORM_C2C", 3);

    @Json(name = "market-lavka-gateway")
    public static final OrderProviderIdDto MARKET_LAVKA_GATEWAY = new OrderProviderIdDto("MARKET_LAVKA_GATEWAY", 4);

    @Json(name = TariffOrderFlow.ORDER_FLOW_TAXI_KEY)
    public static final OrderProviderIdDto TAXI = new OrderProviderIdDto("TAXI", 5);

    @Json(name = "united-delivery-platform")
    public static final OrderProviderIdDto UNITED_DELIVERY_PLATFORM = new OrderProviderIdDto("UNITED_DELIVERY_PLATFORM", 6);

    @Json(name = "united-delivery-platform-c2c")
    public static final OrderProviderIdDto UNITED_DELIVERY_PLATFORM_C2C = new OrderProviderIdDto("UNITED_DELIVERY_PLATFORM_C2C", 7);

    private static final /* synthetic */ OrderProviderIdDto[] $values() {
        return new OrderProviderIdDto[]{CARGO_CLAIMS, CARGO_C2C, LOGISTIC_PLATFORM, LOGISTIC_PLATFORM_C2C, MARKET_LAVKA_GATEWAY, TAXI, UNITED_DELIVERY_PLATFORM, UNITED_DELIVERY_PLATFORM_C2C};
    }

    static {
        OrderProviderIdDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private OrderProviderIdDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static OrderProviderIdDto valueOf(String str) {
        return (OrderProviderIdDto) Enum.valueOf(OrderProviderIdDto.class, str);
    }

    public static OrderProviderIdDto[] values() {
        return (OrderProviderIdDto[]) $VALUES.clone();
    }
}
