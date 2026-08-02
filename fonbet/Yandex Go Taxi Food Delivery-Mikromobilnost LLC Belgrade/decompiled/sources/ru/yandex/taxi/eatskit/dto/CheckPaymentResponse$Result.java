package ru.yandex.taxi.eatskit.dto;

import defpackage.ahb;
import defpackage.eua;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/taxi/eatskit/dto/CheckPaymentResponse$Result", "", "Lru/yandex/taxi/eatskit/dto/CheckPaymentResponse$Result;", "Companion", "ahb", "ALLOWED", "DENIED", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckPaymentResponse$Result {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CheckPaymentResponse$Result[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final CheckPaymentResponse$Result ALLOWED;
    public static final ahb Companion;
    public static final CheckPaymentResponse$Result DENIED;

    static {
        CheckPaymentResponse$Result checkPaymentResponse$Result = new CheckPaymentResponse$Result("ALLOWED", 0);
        ALLOWED = checkPaymentResponse$Result;
        CheckPaymentResponse$Result checkPaymentResponse$Result2 = new CheckPaymentResponse$Result("DENIED", 1);
        DENIED = checkPaymentResponse$Result2;
        CheckPaymentResponse$Result[] checkPaymentResponse$ResultArr = {checkPaymentResponse$Result, checkPaymentResponse$Result2};
        $VALUES = checkPaymentResponse$ResultArr;
        $ENTRIES = kotlin.enums.a.a(checkPaymentResponse$ResultArr);
        Companion = new ahb();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new eua(27));
    }

    public static CheckPaymentResponse$Result valueOf(String str) {
        return (CheckPaymentResponse$Result) Enum.valueOf(CheckPaymentResponse$Result.class, str);
    }

    public static CheckPaymentResponse$Result[] values() {
        return (CheckPaymentResponse$Result[]) $VALUES.clone();
    }
}
