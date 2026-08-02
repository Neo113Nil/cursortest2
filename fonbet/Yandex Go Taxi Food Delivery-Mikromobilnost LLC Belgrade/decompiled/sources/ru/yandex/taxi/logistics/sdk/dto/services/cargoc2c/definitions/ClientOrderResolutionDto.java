package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.Json;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/ClientOrderResolutionDto;", "", "<init>", "(Ljava/lang/String;I)V", "FAILED", "SUCCEED", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ClientOrderResolutionDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ClientOrderResolutionDto[] $VALUES;

    @Json(name = "failed")
    public static final ClientOrderResolutionDto FAILED = new ClientOrderResolutionDto("FAILED", 0);

    @Json(name = "succeed")
    public static final ClientOrderResolutionDto SUCCEED = new ClientOrderResolutionDto("SUCCEED", 1);

    private static final /* synthetic */ ClientOrderResolutionDto[] $values() {
        return new ClientOrderResolutionDto[]{FAILED, SUCCEED};
    }

    static {
        ClientOrderResolutionDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ClientOrderResolutionDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ClientOrderResolutionDto valueOf(String str) {
        return (ClientOrderResolutionDto) Enum.valueOf(ClientOrderResolutionDto.class, str);
    }

    public static ClientOrderResolutionDto[] values() {
        return (ClientOrderResolutionDto[]) $VALUES.clone();
    }
}
