package ru.yandex.taxi.logistics.sdk.tracking.impl.manual_tips.ui;

import defpackage.k4o;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/logistics/sdk/tracking/impl/manual_tips/ui/ErrorType;", "", "INCORRECT_VALUE", "MORE_TIP_EXPECTED", "LESS_TIP_EXPECTED", MetaDataField.SCREEN_FIELD}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ErrorType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ErrorType[] $VALUES;
    public static final ErrorType INCORRECT_VALUE;
    public static final ErrorType LESS_TIP_EXPECTED;
    public static final ErrorType MORE_TIP_EXPECTED;

    static {
        ErrorType errorType = new ErrorType("INCORRECT_VALUE", 0);
        INCORRECT_VALUE = errorType;
        ErrorType errorType2 = new ErrorType("MORE_TIP_EXPECTED", 1);
        MORE_TIP_EXPECTED = errorType2;
        ErrorType errorType3 = new ErrorType("LESS_TIP_EXPECTED", 2);
        LESS_TIP_EXPECTED = errorType3;
        ErrorType[] errorTypeArr = {errorType, errorType2, errorType3};
        $VALUES = errorTypeArr;
        $ENTRIES = kotlin.enums.a.a(errorTypeArr);
    }

    public static ErrorType valueOf(String str) {
        return (ErrorType) Enum.valueOf(ErrorType.class, str);
    }

    public static ErrorType[] values() {
        return (ErrorType[]) $VALUES.clone();
    }
}
