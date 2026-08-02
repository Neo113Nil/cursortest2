package ru.yandex.taxi.network.api.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/network/api/models/GoApiName;", "", "TaxiV3", "TaxiV4", "Billing", "BillingInternational", "Plus", "Payments", "go-client-android.libs.network:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GoApiName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ GoApiName[] $VALUES;
    public static final GoApiName Billing;
    public static final GoApiName BillingInternational;
    public static final GoApiName Payments;
    public static final GoApiName Plus;
    public static final GoApiName TaxiV3;
    public static final GoApiName TaxiV4;

    static {
        GoApiName goApiName = new GoApiName("TaxiV3", 0);
        TaxiV3 = goApiName;
        GoApiName goApiName2 = new GoApiName("TaxiV4", 1);
        TaxiV4 = goApiName2;
        GoApiName goApiName3 = new GoApiName("Billing", 2);
        Billing = goApiName3;
        GoApiName goApiName4 = new GoApiName("BillingInternational", 3);
        BillingInternational = goApiName4;
        GoApiName goApiName5 = new GoApiName("Plus", 4);
        Plus = goApiName5;
        GoApiName goApiName6 = new GoApiName("Payments", 5);
        Payments = goApiName6;
        GoApiName[] goApiNameArr = {goApiName, goApiName2, goApiName3, goApiName4, goApiName5, goApiName6};
        $VALUES = goApiNameArr;
        $ENTRIES = a.a(goApiNameArr);
    }

    public static GoApiName valueOf(String str) {
        return (GoApiName) Enum.valueOf(GoApiName.class, str);
    }

    public static GoApiName[] values() {
        return (GoApiName[]) $VALUES.clone();
    }
}
