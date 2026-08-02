package ru.yandex.taxi.plus.purchase.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/plus/purchase/domain/PurchaseStatus;", "", "IN_PROGRESS", "SUCCESS", "NETWORK_OR_SERVER_ERROR", "SUBSCRIPTION_EXISTS", "PURCHASE_AVAILABLE", "PURCHASE_UNAVAILABLE", "PURCHASED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PurchaseStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PurchaseStatus[] $VALUES;
    public static final PurchaseStatus IN_PROGRESS;
    public static final PurchaseStatus NETWORK_OR_SERVER_ERROR;
    public static final PurchaseStatus PURCHASED;
    public static final PurchaseStatus PURCHASE_AVAILABLE;
    public static final PurchaseStatus PURCHASE_UNAVAILABLE;
    public static final PurchaseStatus SUBSCRIPTION_EXISTS;
    public static final PurchaseStatus SUCCESS;

    static {
        PurchaseStatus purchaseStatus = new PurchaseStatus("IN_PROGRESS", 0);
        IN_PROGRESS = purchaseStatus;
        PurchaseStatus purchaseStatus2 = new PurchaseStatus("SUCCESS", 1);
        SUCCESS = purchaseStatus2;
        PurchaseStatus purchaseStatus3 = new PurchaseStatus("NETWORK_OR_SERVER_ERROR", 2);
        NETWORK_OR_SERVER_ERROR = purchaseStatus3;
        PurchaseStatus purchaseStatus4 = new PurchaseStatus("SUBSCRIPTION_EXISTS", 3);
        SUBSCRIPTION_EXISTS = purchaseStatus4;
        PurchaseStatus purchaseStatus5 = new PurchaseStatus("PURCHASE_AVAILABLE", 4);
        PURCHASE_AVAILABLE = purchaseStatus5;
        PurchaseStatus purchaseStatus6 = new PurchaseStatus("PURCHASE_UNAVAILABLE", 5);
        PURCHASE_UNAVAILABLE = purchaseStatus6;
        PurchaseStatus purchaseStatus7 = new PurchaseStatus("PURCHASED", 6);
        PURCHASED = purchaseStatus7;
        PurchaseStatus[] purchaseStatusArr = {purchaseStatus, purchaseStatus2, purchaseStatus3, purchaseStatus4, purchaseStatus5, purchaseStatus6, purchaseStatus7};
        $VALUES = purchaseStatusArr;
        $ENTRIES = kotlin.enums.a.a(purchaseStatusArr);
    }

    public static PurchaseStatus valueOf(String str) {
        return (PurchaseStatus) Enum.valueOf(PurchaseStatus.class, str);
    }

    public static PurchaseStatus[] values() {
        return (PurchaseStatus[]) $VALUES.clone();
    }
}
