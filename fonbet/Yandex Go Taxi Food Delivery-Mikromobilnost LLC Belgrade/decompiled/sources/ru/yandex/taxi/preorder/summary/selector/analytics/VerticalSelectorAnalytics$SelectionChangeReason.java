package ru.yandex.taxi.preorder.summary.selector.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/taxi/preorder/summary/selector/analytics/VerticalSelectorAnalytics$SelectionChangeReason", "", "Lru/yandex/taxi/preorder/summary/selector/analytics/VerticalSelectorAnalytics$SelectionChangeReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Tap", "Swipe", "selector"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VerticalSelectorAnalytics$SelectionChangeReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ VerticalSelectorAnalytics$SelectionChangeReason[] $VALUES;
    public static final VerticalSelectorAnalytics$SelectionChangeReason Swipe;
    public static final VerticalSelectorAnalytics$SelectionChangeReason Tap;
    private final String eventValue;

    static {
        VerticalSelectorAnalytics$SelectionChangeReason verticalSelectorAnalytics$SelectionChangeReason = new VerticalSelectorAnalytics$SelectionChangeReason("Tap", 0, "tap");
        Tap = verticalSelectorAnalytics$SelectionChangeReason;
        VerticalSelectorAnalytics$SelectionChangeReason verticalSelectorAnalytics$SelectionChangeReason2 = new VerticalSelectorAnalytics$SelectionChangeReason("Swipe", 1, "swipe");
        Swipe = verticalSelectorAnalytics$SelectionChangeReason2;
        VerticalSelectorAnalytics$SelectionChangeReason[] verticalSelectorAnalytics$SelectionChangeReasonArr = {verticalSelectorAnalytics$SelectionChangeReason, verticalSelectorAnalytics$SelectionChangeReason2};
        $VALUES = verticalSelectorAnalytics$SelectionChangeReasonArr;
        $ENTRIES = kotlin.enums.a.a(verticalSelectorAnalytics$SelectionChangeReasonArr);
    }

    public VerticalSelectorAnalytics$SelectionChangeReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static VerticalSelectorAnalytics$SelectionChangeReason valueOf(String str) {
        return (VerticalSelectorAnalytics$SelectionChangeReason) Enum.valueOf(VerticalSelectorAnalytics$SelectionChangeReason.class, str);
    }

    public static VerticalSelectorAnalytics$SelectionChangeReason[] values() {
        return (VerticalSelectorAnalytics$SelectionChangeReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
