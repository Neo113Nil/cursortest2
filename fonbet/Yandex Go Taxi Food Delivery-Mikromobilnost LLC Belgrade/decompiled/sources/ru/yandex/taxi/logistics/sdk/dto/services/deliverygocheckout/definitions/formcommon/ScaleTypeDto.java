package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.Json;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ScaleTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", JCP.RAW_PREFIX, "ASPECT_FILL", "SCALE_TO_FILL", "ASPECT_FIT", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ScaleTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScaleTypeDto[] $VALUES;

    @Json(name = "none")
    public static final ScaleTypeDto NONE = new ScaleTypeDto(JCP.RAW_PREFIX, 0);

    @Json(name = "aspect_fill")
    public static final ScaleTypeDto ASPECT_FILL = new ScaleTypeDto("ASPECT_FILL", 1);

    @Json(name = "scale_to_fill")
    public static final ScaleTypeDto SCALE_TO_FILL = new ScaleTypeDto("SCALE_TO_FILL", 2);

    @Json(name = "aspect_fit")
    public static final ScaleTypeDto ASPECT_FIT = new ScaleTypeDto("ASPECT_FIT", 3);

    private static final /* synthetic */ ScaleTypeDto[] $values() {
        return new ScaleTypeDto[]{NONE, ASPECT_FILL, SCALE_TO_FILL, ASPECT_FIT};
    }

    static {
        ScaleTypeDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ScaleTypeDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ScaleTypeDto valueOf(String str) {
        return (ScaleTypeDto) Enum.valueOf(ScaleTypeDto.class, str);
    }

    public static ScaleTypeDto[] values() {
        return (ScaleTypeDto[]) $VALUES.clone();
    }
}
