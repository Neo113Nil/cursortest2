package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.Json;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/RoleDto;", "", "<init>", "(Ljava/lang/String;I)V", "INITIATOR", "SENDER", "RECIPIENT", "EXTERNAL_B2B_CLIENT", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RoleDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RoleDto[] $VALUES;

    @Json(name = "initiator")
    public static final RoleDto INITIATOR = new RoleDto("INITIATOR", 0);

    @Json(name = "sender")
    public static final RoleDto SENDER = new RoleDto("SENDER", 1);

    @Json(name = "recipient")
    public static final RoleDto RECIPIENT = new RoleDto("RECIPIENT", 2);

    @Json(name = "external-b2b-client")
    public static final RoleDto EXTERNAL_B2B_CLIENT = new RoleDto("EXTERNAL_B2B_CLIENT", 3);

    private static final /* synthetic */ RoleDto[] $values() {
        return new RoleDto[]{INITIATOR, SENDER, RECIPIENT, EXTERNAL_B2B_CLIENT};
    }

    static {
        RoleDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private RoleDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static RoleDto valueOf(String str) {
        return (RoleDto) Enum.valueOf(RoleDto.class, str);
    }

    public static RoleDto[] values() {
        return (RoleDto[]) $VALUES.clone();
    }
}
