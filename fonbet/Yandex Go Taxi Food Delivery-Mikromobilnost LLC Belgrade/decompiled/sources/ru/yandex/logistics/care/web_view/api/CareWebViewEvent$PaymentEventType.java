package ru.yandex.logistics.care.web_view.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"ru/yandex/logistics/care/web_view/api/CareWebViewEvent$PaymentEventType", "", "Lru/yandex/logistics/care/web_view/api/CareWebViewEvent$PaymentEventType;", "", "value", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "STARTED", "SUCCEEDED", "FAILED", "CANCELED", "sdk-care"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CareWebViewEvent$PaymentEventType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CareWebViewEvent$PaymentEventType[] $VALUES;
    public static final CareWebViewEvent$PaymentEventType CANCELED;
    public static final CareWebViewEvent$PaymentEventType FAILED;
    public static final CareWebViewEvent$PaymentEventType STARTED;
    public static final CareWebViewEvent$PaymentEventType SUCCEEDED;
    private final String value;

    static {
        CareWebViewEvent$PaymentEventType careWebViewEvent$PaymentEventType = new CareWebViewEvent$PaymentEventType("STARTED", 0, "started");
        STARTED = careWebViewEvent$PaymentEventType;
        CareWebViewEvent$PaymentEventType careWebViewEvent$PaymentEventType2 = new CareWebViewEvent$PaymentEventType("SUCCEEDED", 1, "succeeded");
        SUCCEEDED = careWebViewEvent$PaymentEventType2;
        CareWebViewEvent$PaymentEventType careWebViewEvent$PaymentEventType3 = new CareWebViewEvent$PaymentEventType("FAILED", 2, "failed");
        FAILED = careWebViewEvent$PaymentEventType3;
        CareWebViewEvent$PaymentEventType careWebViewEvent$PaymentEventType4 = new CareWebViewEvent$PaymentEventType("CANCELED", 3, "canceled");
        CANCELED = careWebViewEvent$PaymentEventType4;
        CareWebViewEvent$PaymentEventType[] careWebViewEvent$PaymentEventTypeArr = {careWebViewEvent$PaymentEventType, careWebViewEvent$PaymentEventType2, careWebViewEvent$PaymentEventType3, careWebViewEvent$PaymentEventType4};
        $VALUES = careWebViewEvent$PaymentEventTypeArr;
        $ENTRIES = a.a(careWebViewEvent$PaymentEventTypeArr);
    }

    public CareWebViewEvent$PaymentEventType(String str, int i, String str2) {
        this.value = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static CareWebViewEvent$PaymentEventType valueOf(String str) {
        return (CareWebViewEvent$PaymentEventType) Enum.valueOf(CareWebViewEvent$PaymentEventType.class, str);
    }

    public static CareWebViewEvent$PaymentEventType[] values() {
        return (CareWebViewEvent$PaymentEventType[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
