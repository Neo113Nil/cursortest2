package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonSizeDto;", "", "<init>", "(Ljava/lang/String;I)V", "XS", "S", "M", "L", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ButtonSizeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ButtonSizeDto[] $VALUES;

    @Json(name = "xs")
    public static final ButtonSizeDto XS = new ButtonSizeDto("XS", 0);

    @Json(name = "s")
    public static final ButtonSizeDto S = new ButtonSizeDto("S", 1);

    @Json(name = "m")
    public static final ButtonSizeDto M = new ButtonSizeDto("M", 2);

    @Json(name = "l")
    public static final ButtonSizeDto L = new ButtonSizeDto("L", 3);

    private static final /* synthetic */ ButtonSizeDto[] $values() {
        return new ButtonSizeDto[]{XS, S, M, L};
    }

    static {
        ButtonSizeDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ButtonSizeDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ButtonSizeDto valueOf(String str) {
        return (ButtonSizeDto) Enum.valueOf(ButtonSizeDto.class, str);
    }

    public static ButtonSizeDto[] values() {
        return (ButtonSizeDto[]) $VALUES.clone();
    }
}
