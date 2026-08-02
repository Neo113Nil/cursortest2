package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details;

import com.squareup.moshi.Json;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/BarcodeTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "LINEAR", "QR", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class BarcodeTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BarcodeTypeDto[] $VALUES;

    @Json(name = "linear")
    public static final BarcodeTypeDto LINEAR = new BarcodeTypeDto("LINEAR", 0);

    @Json(name = "qr")
    public static final BarcodeTypeDto QR = new BarcodeTypeDto("QR", 1);

    private static final /* synthetic */ BarcodeTypeDto[] $values() {
        return new BarcodeTypeDto[]{LINEAR, QR};
    }

    static {
        BarcodeTypeDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private BarcodeTypeDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static BarcodeTypeDto valueOf(String str) {
        return (BarcodeTypeDto) Enum.valueOf(BarcodeTypeDto.class, str);
    }

    public static BarcodeTypeDto[] values() {
        return (BarcodeTypeDto[]) $VALUES.clone();
    }
}
