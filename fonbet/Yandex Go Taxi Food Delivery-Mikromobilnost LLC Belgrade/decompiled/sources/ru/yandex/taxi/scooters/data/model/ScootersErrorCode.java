package ru.yandex.taxi.scooters.data.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, d2 = {"Lru/yandex/taxi/scooters/data/model/ScootersErrorCode;", "", "FAILURE", "TIMEOUT", "CONNECTION_NOT_FOUND", "INTERNAL_ERROR", "SUCCESS", "OFFER_EXPIRED", "CARD_NOT_ALLOWED_BY_RESTRICTION", "PAYMENT_REQUIRED", "INCORRECT_CAR_POSITION", "INCORRECT_SCOOTER_POSITION", "SCOOTER_IS_NOT_IN_FIX_FINISH_AREA", "USER_HAVE_RENTED_CAR", "CAR_IS_BUSY", "DEPOSIT_FAILS", "REQUIRED_DEPOSIT_IS_NOT_HELD", "NOT_ENOUGH_CHARGE", "TOO_CLOSE_DESTINATION", "TOO_FAR_DESTINATION", "BIKE_WHEEL_IS_NOT_LOCKED", "INVALID_PAYMENT_METHOD", "PHOTO_VERIFICATION_REQUIRED", "PHOTO_VERIFICATION_WITH_PASSPORT_REQUIRED", "CHECK_VERIFICATION_STATUS", "PD_DATA_UNFILLED", "LOCKED_RESOURCES_LIMIT_ENRICHED", "MOS_RU_FAILED", "FRAUDER", "NO_FUNDS", "RESOURCE_LOCKED", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersErrorCode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersErrorCode[] $VALUES;
    public static final ScootersErrorCode BIKE_WHEEL_IS_NOT_LOCKED;
    public static final ScootersErrorCode CARD_NOT_ALLOWED_BY_RESTRICTION;
    public static final ScootersErrorCode CAR_IS_BUSY;
    public static final ScootersErrorCode CHECK_VERIFICATION_STATUS;
    public static final ScootersErrorCode CONNECTION_NOT_FOUND;
    public static final ScootersErrorCode DEPOSIT_FAILS;
    public static final ScootersErrorCode FAILURE;
    public static final ScootersErrorCode FRAUDER;
    public static final ScootersErrorCode INCORRECT_CAR_POSITION;
    public static final ScootersErrorCode INCORRECT_SCOOTER_POSITION;
    public static final ScootersErrorCode INTERNAL_ERROR;
    public static final ScootersErrorCode INVALID_PAYMENT_METHOD;
    public static final ScootersErrorCode LOCKED_RESOURCES_LIMIT_ENRICHED;
    public static final ScootersErrorCode MOS_RU_FAILED;
    public static final ScootersErrorCode NOT_ENOUGH_CHARGE;
    public static final ScootersErrorCode NO_FUNDS;
    public static final ScootersErrorCode OFFER_EXPIRED;
    public static final ScootersErrorCode PAYMENT_REQUIRED;
    public static final ScootersErrorCode PD_DATA_UNFILLED;
    public static final ScootersErrorCode PHOTO_VERIFICATION_REQUIRED;
    public static final ScootersErrorCode PHOTO_VERIFICATION_WITH_PASSPORT_REQUIRED;
    public static final ScootersErrorCode REQUIRED_DEPOSIT_IS_NOT_HELD;
    public static final ScootersErrorCode RESOURCE_LOCKED;
    public static final ScootersErrorCode SCOOTER_IS_NOT_IN_FIX_FINISH_AREA;
    public static final ScootersErrorCode SUCCESS;
    public static final ScootersErrorCode TIMEOUT;
    public static final ScootersErrorCode TOO_CLOSE_DESTINATION;
    public static final ScootersErrorCode TOO_FAR_DESTINATION;
    public static final ScootersErrorCode USER_HAVE_RENTED_CAR;

    static {
        ScootersErrorCode scootersErrorCode = new ScootersErrorCode("FAILURE", 0);
        FAILURE = scootersErrorCode;
        ScootersErrorCode scootersErrorCode2 = new ScootersErrorCode("TIMEOUT", 1);
        TIMEOUT = scootersErrorCode2;
        ScootersErrorCode scootersErrorCode3 = new ScootersErrorCode("CONNECTION_NOT_FOUND", 2);
        CONNECTION_NOT_FOUND = scootersErrorCode3;
        ScootersErrorCode scootersErrorCode4 = new ScootersErrorCode("INTERNAL_ERROR", 3);
        INTERNAL_ERROR = scootersErrorCode4;
        ScootersErrorCode scootersErrorCode5 = new ScootersErrorCode("SUCCESS", 4);
        SUCCESS = scootersErrorCode5;
        ScootersErrorCode scootersErrorCode6 = new ScootersErrorCode("OFFER_EXPIRED", 5);
        OFFER_EXPIRED = scootersErrorCode6;
        ScootersErrorCode scootersErrorCode7 = new ScootersErrorCode("CARD_NOT_ALLOWED_BY_RESTRICTION", 6);
        CARD_NOT_ALLOWED_BY_RESTRICTION = scootersErrorCode7;
        ScootersErrorCode scootersErrorCode8 = new ScootersErrorCode("PAYMENT_REQUIRED", 7);
        PAYMENT_REQUIRED = scootersErrorCode8;
        ScootersErrorCode scootersErrorCode9 = new ScootersErrorCode("INCORRECT_CAR_POSITION", 8);
        INCORRECT_CAR_POSITION = scootersErrorCode9;
        ScootersErrorCode scootersErrorCode10 = new ScootersErrorCode("INCORRECT_SCOOTER_POSITION", 9);
        INCORRECT_SCOOTER_POSITION = scootersErrorCode10;
        ScootersErrorCode scootersErrorCode11 = new ScootersErrorCode("SCOOTER_IS_NOT_IN_FIX_FINISH_AREA", 10);
        SCOOTER_IS_NOT_IN_FIX_FINISH_AREA = scootersErrorCode11;
        ScootersErrorCode scootersErrorCode12 = new ScootersErrorCode("USER_HAVE_RENTED_CAR", 11);
        USER_HAVE_RENTED_CAR = scootersErrorCode12;
        ScootersErrorCode scootersErrorCode13 = new ScootersErrorCode("CAR_IS_BUSY", 12);
        CAR_IS_BUSY = scootersErrorCode13;
        ScootersErrorCode scootersErrorCode14 = new ScootersErrorCode("DEPOSIT_FAILS", 13);
        DEPOSIT_FAILS = scootersErrorCode14;
        ScootersErrorCode scootersErrorCode15 = new ScootersErrorCode("REQUIRED_DEPOSIT_IS_NOT_HELD", 14);
        REQUIRED_DEPOSIT_IS_NOT_HELD = scootersErrorCode15;
        ScootersErrorCode scootersErrorCode16 = new ScootersErrorCode("NOT_ENOUGH_CHARGE", 15);
        NOT_ENOUGH_CHARGE = scootersErrorCode16;
        ScootersErrorCode scootersErrorCode17 = new ScootersErrorCode("TOO_CLOSE_DESTINATION", 16);
        TOO_CLOSE_DESTINATION = scootersErrorCode17;
        ScootersErrorCode scootersErrorCode18 = new ScootersErrorCode("TOO_FAR_DESTINATION", 17);
        TOO_FAR_DESTINATION = scootersErrorCode18;
        ScootersErrorCode scootersErrorCode19 = new ScootersErrorCode("BIKE_WHEEL_IS_NOT_LOCKED", 18);
        BIKE_WHEEL_IS_NOT_LOCKED = scootersErrorCode19;
        ScootersErrorCode scootersErrorCode20 = new ScootersErrorCode("INVALID_PAYMENT_METHOD", 19);
        INVALID_PAYMENT_METHOD = scootersErrorCode20;
        ScootersErrorCode scootersErrorCode21 = new ScootersErrorCode("PHOTO_VERIFICATION_REQUIRED", 20);
        PHOTO_VERIFICATION_REQUIRED = scootersErrorCode21;
        ScootersErrorCode scootersErrorCode22 = new ScootersErrorCode("PHOTO_VERIFICATION_WITH_PASSPORT_REQUIRED", 21);
        PHOTO_VERIFICATION_WITH_PASSPORT_REQUIRED = scootersErrorCode22;
        ScootersErrorCode scootersErrorCode23 = new ScootersErrorCode("CHECK_VERIFICATION_STATUS", 22);
        CHECK_VERIFICATION_STATUS = scootersErrorCode23;
        ScootersErrorCode scootersErrorCode24 = new ScootersErrorCode("PD_DATA_UNFILLED", 23);
        PD_DATA_UNFILLED = scootersErrorCode24;
        ScootersErrorCode scootersErrorCode25 = new ScootersErrorCode("LOCKED_RESOURCES_LIMIT_ENRICHED", 24);
        LOCKED_RESOURCES_LIMIT_ENRICHED = scootersErrorCode25;
        ScootersErrorCode scootersErrorCode26 = new ScootersErrorCode("MOS_RU_FAILED", 25);
        MOS_RU_FAILED = scootersErrorCode26;
        ScootersErrorCode scootersErrorCode27 = new ScootersErrorCode("FRAUDER", 26);
        FRAUDER = scootersErrorCode27;
        ScootersErrorCode scootersErrorCode28 = new ScootersErrorCode("NO_FUNDS", 27);
        NO_FUNDS = scootersErrorCode28;
        ScootersErrorCode scootersErrorCode29 = new ScootersErrorCode("RESOURCE_LOCKED", 28);
        RESOURCE_LOCKED = scootersErrorCode29;
        ScootersErrorCode[] scootersErrorCodeArr = {scootersErrorCode, scootersErrorCode2, scootersErrorCode3, scootersErrorCode4, scootersErrorCode5, scootersErrorCode6, scootersErrorCode7, scootersErrorCode8, scootersErrorCode9, scootersErrorCode10, scootersErrorCode11, scootersErrorCode12, scootersErrorCode13, scootersErrorCode14, scootersErrorCode15, scootersErrorCode16, scootersErrorCode17, scootersErrorCode18, scootersErrorCode19, scootersErrorCode20, scootersErrorCode21, scootersErrorCode22, scootersErrorCode23, scootersErrorCode24, scootersErrorCode25, scootersErrorCode26, scootersErrorCode27, scootersErrorCode28, scootersErrorCode29};
        $VALUES = scootersErrorCodeArr;
        $ENTRIES = a.a(scootersErrorCodeArr);
    }

    public static ScootersErrorCode valueOf(String str) {
        return (ScootersErrorCode) Enum.valueOf(ScootersErrorCode.class, str);
    }

    public static ScootersErrorCode[] values() {
        return (ScootersErrorCode[]) $VALUES.clone();
    }
}
