package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.Json;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/FormEventTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "CLOSED", "APP_ENTERED_BACKGROUND", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FormEventTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FormEventTypeDto[] $VALUES;

    @Json(name = "closed")
    public static final FormEventTypeDto CLOSED = new FormEventTypeDto("CLOSED", 0);

    @Json(name = "app-entered-background")
    public static final FormEventTypeDto APP_ENTERED_BACKGROUND = new FormEventTypeDto("APP_ENTERED_BACKGROUND", 1);

    private static final /* synthetic */ FormEventTypeDto[] $values() {
        return new FormEventTypeDto[]{CLOSED, APP_ENTERED_BACKGROUND};
    }

    static {
        FormEventTypeDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private FormEventTypeDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static FormEventTypeDto valueOf(String str) {
        return (FormEventTypeDto) Enum.valueOf(FormEventTypeDto.class, str);
    }

    public static FormEventTypeDto[] values() {
        return (FormEventTypeDto[]) $VALUES.clone();
    }
}
