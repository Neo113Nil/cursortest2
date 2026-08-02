package ru.yandex.taxi.eatskit.dto;

import defpackage.eua;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.zgb;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"ru/yandex/taxi/eatskit/dto/CheckPaymentResponse$Condition", "", "Lru/yandex/taxi/eatskit/dto/CheckPaymentResponse$Condition;", "Companion", "zgb", "TOPUP", "IDENTIFICATION", "KYC", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckPaymentResponse$Condition {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CheckPaymentResponse$Condition[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final zgb Companion;
    public static final CheckPaymentResponse$Condition IDENTIFICATION;
    public static final CheckPaymentResponse$Condition KYC;
    public static final CheckPaymentResponse$Condition TOPUP;

    static {
        CheckPaymentResponse$Condition checkPaymentResponse$Condition = new CheckPaymentResponse$Condition("TOPUP", 0);
        TOPUP = checkPaymentResponse$Condition;
        CheckPaymentResponse$Condition checkPaymentResponse$Condition2 = new CheckPaymentResponse$Condition("IDENTIFICATION", 1);
        IDENTIFICATION = checkPaymentResponse$Condition2;
        CheckPaymentResponse$Condition checkPaymentResponse$Condition3 = new CheckPaymentResponse$Condition("KYC", 2);
        KYC = checkPaymentResponse$Condition3;
        CheckPaymentResponse$Condition[] checkPaymentResponse$ConditionArr = {checkPaymentResponse$Condition, checkPaymentResponse$Condition2, checkPaymentResponse$Condition3};
        $VALUES = checkPaymentResponse$ConditionArr;
        $ENTRIES = kotlin.enums.a.a(checkPaymentResponse$ConditionArr);
        Companion = new zgb();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new eua(26));
    }

    public static CheckPaymentResponse$Condition valueOf(String str) {
        return (CheckPaymentResponse$Condition) Enum.valueOf(CheckPaymentResponse$Condition.class, str);
    }

    public static CheckPaymentResponse$Condition[] values() {
        return (CheckPaymentResponse$Condition[]) $VALUES.clone();
    }
}
