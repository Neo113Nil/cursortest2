package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

import com.squareup.moshi.Json;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/SelectDestinationPolicyDto;", "", "<init>", "(Ljava/lang/String;I)V", "REQUIRED", "SKIP_IF_PRESELECTED", "SKIP", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SelectDestinationPolicyDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SelectDestinationPolicyDto[] $VALUES;

    @Json(name = "required")
    public static final SelectDestinationPolicyDto REQUIRED = new SelectDestinationPolicyDto("REQUIRED", 0);

    @Json(name = "skip_if_preselected")
    public static final SelectDestinationPolicyDto SKIP_IF_PRESELECTED = new SelectDestinationPolicyDto("SKIP_IF_PRESELECTED", 1);

    @Json(name = "skip")
    public static final SelectDestinationPolicyDto SKIP = new SelectDestinationPolicyDto("SKIP", 2);

    private static final /* synthetic */ SelectDestinationPolicyDto[] $values() {
        return new SelectDestinationPolicyDto[]{REQUIRED, SKIP_IF_PRESELECTED, SKIP};
    }

    static {
        SelectDestinationPolicyDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private SelectDestinationPolicyDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SelectDestinationPolicyDto valueOf(String str) {
        return (SelectDestinationPolicyDto) Enum.valueOf(SelectDestinationPolicyDto.class, str);
    }

    public static SelectDestinationPolicyDto[] values() {
        return (SelectDestinationPolicyDto[]) $VALUES.clone();
    }
}
