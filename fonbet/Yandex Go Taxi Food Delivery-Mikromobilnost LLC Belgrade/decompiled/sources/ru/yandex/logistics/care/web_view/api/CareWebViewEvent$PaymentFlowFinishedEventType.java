package ru.yandex.logistics.care.web_view.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/logistics/care/web_view/api/CareWebViewEvent$PaymentFlowFinishedEventType", "", "Lru/yandex/logistics/care/web_view/api/CareWebViewEvent$PaymentFlowFinishedEventType;", "", "value", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "SUCCEEDED", "CANCELED", "sdk-care"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CareWebViewEvent$PaymentFlowFinishedEventType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CareWebViewEvent$PaymentFlowFinishedEventType[] $VALUES;
    public static final CareWebViewEvent$PaymentFlowFinishedEventType CANCELED;
    public static final CareWebViewEvent$PaymentFlowFinishedEventType SUCCEEDED;
    private final String value;

    static {
        CareWebViewEvent$PaymentFlowFinishedEventType careWebViewEvent$PaymentFlowFinishedEventType = new CareWebViewEvent$PaymentFlowFinishedEventType("SUCCEEDED", 0, "succeeded");
        SUCCEEDED = careWebViewEvent$PaymentFlowFinishedEventType;
        CareWebViewEvent$PaymentFlowFinishedEventType careWebViewEvent$PaymentFlowFinishedEventType2 = new CareWebViewEvent$PaymentFlowFinishedEventType("CANCELED", 1, "canceled");
        CANCELED = careWebViewEvent$PaymentFlowFinishedEventType2;
        CareWebViewEvent$PaymentFlowFinishedEventType[] careWebViewEvent$PaymentFlowFinishedEventTypeArr = {careWebViewEvent$PaymentFlowFinishedEventType, careWebViewEvent$PaymentFlowFinishedEventType2};
        $VALUES = careWebViewEvent$PaymentFlowFinishedEventTypeArr;
        $ENTRIES = a.a(careWebViewEvent$PaymentFlowFinishedEventTypeArr);
    }

    public CareWebViewEvent$PaymentFlowFinishedEventType(String str, int i, String str2) {
        this.value = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static CareWebViewEvent$PaymentFlowFinishedEventType valueOf(String str) {
        return (CareWebViewEvent$PaymentFlowFinishedEventType) Enum.valueOf(CareWebViewEvent$PaymentFlowFinishedEventType.class, str);
    }

    public static CareWebViewEvent$PaymentFlowFinishedEventType[] values() {
        return (CareWebViewEvent$PaymentFlowFinishedEventType[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
