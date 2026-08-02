package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.Json;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/OfferProviderIdDto;", "", "<init>", "(Ljava/lang/String;I)V", "CARGO_PRICING", "LOGISTIC_PLATFORM", "UNITED_DELIVERY_PLATFORM", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OfferProviderIdDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OfferProviderIdDto[] $VALUES;

    @Json(name = "cargo-pricing")
    public static final OfferProviderIdDto CARGO_PRICING = new OfferProviderIdDto("CARGO_PRICING", 0);

    @Json(name = "logistic-platform")
    public static final OfferProviderIdDto LOGISTIC_PLATFORM = new OfferProviderIdDto("LOGISTIC_PLATFORM", 1);

    @Json(name = "united-delivery-platform")
    public static final OfferProviderIdDto UNITED_DELIVERY_PLATFORM = new OfferProviderIdDto("UNITED_DELIVERY_PLATFORM", 2);

    private static final /* synthetic */ OfferProviderIdDto[] $values() {
        return new OfferProviderIdDto[]{CARGO_PRICING, LOGISTIC_PLATFORM, UNITED_DELIVERY_PLATFORM};
    }

    static {
        OfferProviderIdDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private OfferProviderIdDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static OfferProviderIdDto valueOf(String str) {
        return (OfferProviderIdDto) Enum.valueOf(OfferProviderIdDto.class, str);
    }

    public static OfferProviderIdDto[] values() {
        return (OfferProviderIdDto[]) $VALUES.clone();
    }
}
