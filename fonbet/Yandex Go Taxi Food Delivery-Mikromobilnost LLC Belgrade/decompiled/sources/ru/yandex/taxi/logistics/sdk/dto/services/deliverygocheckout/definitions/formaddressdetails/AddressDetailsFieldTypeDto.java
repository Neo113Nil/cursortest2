package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formaddressdetails;

import com.squareup.moshi.Json;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formaddressdetails/AddressDetailsFieldTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "PORCH", "APARTMENT", "FLOOR", "DOORPHONE", "COMMENT", "CONTACT", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AddressDetailsFieldTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AddressDetailsFieldTypeDto[] $VALUES;

    @Json(name = "porch")
    public static final AddressDetailsFieldTypeDto PORCH = new AddressDetailsFieldTypeDto("PORCH", 0);

    @Json(name = "apartment")
    public static final AddressDetailsFieldTypeDto APARTMENT = new AddressDetailsFieldTypeDto("APARTMENT", 1);

    @Json(name = "floor")
    public static final AddressDetailsFieldTypeDto FLOOR = new AddressDetailsFieldTypeDto("FLOOR", 2);

    @Json(name = "doorphone")
    public static final AddressDetailsFieldTypeDto DOORPHONE = new AddressDetailsFieldTypeDto("DOORPHONE", 3);

    @Json(name = "comment")
    public static final AddressDetailsFieldTypeDto COMMENT = new AddressDetailsFieldTypeDto("COMMENT", 4);

    @Json(name = "contact")
    public static final AddressDetailsFieldTypeDto CONTACT = new AddressDetailsFieldTypeDto("CONTACT", 5);

    private static final /* synthetic */ AddressDetailsFieldTypeDto[] $values() {
        return new AddressDetailsFieldTypeDto[]{PORCH, APARTMENT, FLOOR, DOORPHONE, COMMENT, CONTACT};
    }

    static {
        AddressDetailsFieldTypeDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private AddressDetailsFieldTypeDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static AddressDetailsFieldTypeDto valueOf(String str) {
        return (AddressDetailsFieldTypeDto) Enum.valueOf(AddressDetailsFieldTypeDto.class, str);
    }

    public static AddressDetailsFieldTypeDto[] values() {
        return (AddressDetailsFieldTypeDto[]) $VALUES.clone();
    }
}
