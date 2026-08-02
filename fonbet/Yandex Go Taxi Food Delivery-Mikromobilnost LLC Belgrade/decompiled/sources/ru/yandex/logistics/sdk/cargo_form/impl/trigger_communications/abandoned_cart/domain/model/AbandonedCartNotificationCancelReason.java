package ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/logistics/sdk/cargo_form/impl/trigger_communications/abandoned_cart/domain/model/AbandonedCartNotificationCancelReason;", "", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ANOTHER_PUSH", "ORDER", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AbandonedCartNotificationCancelReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AbandonedCartNotificationCancelReason[] $VALUES;
    public static final AbandonedCartNotificationCancelReason ANOTHER_PUSH;
    public static final AbandonedCartNotificationCancelReason ORDER;
    private final String analyticsName;

    static {
        AbandonedCartNotificationCancelReason abandonedCartNotificationCancelReason = new AbandonedCartNotificationCancelReason("ANOTHER_PUSH", 0, "another_push");
        ANOTHER_PUSH = abandonedCartNotificationCancelReason;
        AbandonedCartNotificationCancelReason abandonedCartNotificationCancelReason2 = new AbandonedCartNotificationCancelReason("ORDER", 1, "order");
        ORDER = abandonedCartNotificationCancelReason2;
        AbandonedCartNotificationCancelReason[] abandonedCartNotificationCancelReasonArr = {abandonedCartNotificationCancelReason, abandonedCartNotificationCancelReason2};
        $VALUES = abandonedCartNotificationCancelReasonArr;
        $ENTRIES = a.a(abandonedCartNotificationCancelReasonArr);
    }

    public AbandonedCartNotificationCancelReason(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static AbandonedCartNotificationCancelReason valueOf(String str) {
        return (AbandonedCartNotificationCancelReason) Enum.valueOf(AbandonedCartNotificationCancelReason.class, str);
    }

    public static AbandonedCartNotificationCancelReason[] values() {
        return (AbandonedCartNotificationCancelReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
