package ru.yandex.taxi.cashback.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/taxi/cashback/analytics/CashbackAnalyticsImpl$CashbackNotificationContext", "", "Lru/yandex/taxi/cashback/analytics/CashbackAnalyticsImpl$CashbackNotificationContext;", "", "context", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "PAYMENT_METHOD_CHANGE", "COMPOSITE_PAYMENT_SUGGEST", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CashbackAnalyticsImpl$CashbackNotificationContext {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CashbackAnalyticsImpl$CashbackNotificationContext[] $VALUES;
    public static final CashbackAnalyticsImpl$CashbackNotificationContext COMPOSITE_PAYMENT_SUGGEST;
    public static final CashbackAnalyticsImpl$CashbackNotificationContext PAYMENT_METHOD_CHANGE;
    private final String context;

    static {
        CashbackAnalyticsImpl$CashbackNotificationContext cashbackAnalyticsImpl$CashbackNotificationContext = new CashbackAnalyticsImpl$CashbackNotificationContext("PAYMENT_METHOD_CHANGE", 0, "paymentMethodChange");
        PAYMENT_METHOD_CHANGE = cashbackAnalyticsImpl$CashbackNotificationContext;
        CashbackAnalyticsImpl$CashbackNotificationContext cashbackAnalyticsImpl$CashbackNotificationContext2 = new CashbackAnalyticsImpl$CashbackNotificationContext("COMPOSITE_PAYMENT_SUGGEST", 1, "compositePaymentSuggest");
        COMPOSITE_PAYMENT_SUGGEST = cashbackAnalyticsImpl$CashbackNotificationContext2;
        CashbackAnalyticsImpl$CashbackNotificationContext[] cashbackAnalyticsImpl$CashbackNotificationContextArr = {cashbackAnalyticsImpl$CashbackNotificationContext, cashbackAnalyticsImpl$CashbackNotificationContext2};
        $VALUES = cashbackAnalyticsImpl$CashbackNotificationContextArr;
        $ENTRIES = a.a(cashbackAnalyticsImpl$CashbackNotificationContextArr);
    }

    public CashbackAnalyticsImpl$CashbackNotificationContext(String str, int i, String str2) {
        this.context = str2;
    }

    public static CashbackAnalyticsImpl$CashbackNotificationContext valueOf(String str) {
        return (CashbackAnalyticsImpl$CashbackNotificationContext) Enum.valueOf(CashbackAnalyticsImpl$CashbackNotificationContext.class, str);
    }

    public static CashbackAnalyticsImpl$CashbackNotificationContext[] values() {
        return (CashbackAnalyticsImpl$CashbackNotificationContext[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getContext() {
        return this.context;
    }
}
