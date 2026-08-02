package com.squareup.cash.payments.views.coreflowsheet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class CoreFlowSheetPosition {
    public static final /* synthetic */ CoreFlowSheetPosition[] $VALUES;
    public static final CoreFlowSheetPosition Expanded;
    public static final CoreFlowSheetPosition Hidden;
    public static final CoreFlowSheetPosition Peeking;

    static {
        CoreFlowSheetPosition coreFlowSheetPosition = new CoreFlowSheetPosition("Expanded", 0);
        Expanded = coreFlowSheetPosition;
        CoreFlowSheetPosition coreFlowSheetPosition2 = new CoreFlowSheetPosition("Peeking", 1);
        Peeking = coreFlowSheetPosition2;
        CoreFlowSheetPosition coreFlowSheetPosition3 = new CoreFlowSheetPosition("Hidden", 2);
        Hidden = coreFlowSheetPosition3;
        $VALUES = new CoreFlowSheetPosition[]{coreFlowSheetPosition, coreFlowSheetPosition2, coreFlowSheetPosition3};
    }

    public static CoreFlowSheetPosition valueOf(String str) {
        return (CoreFlowSheetPosition) Enum.valueOf(CoreFlowSheetPosition.class, str);
    }

    public static CoreFlowSheetPosition[] values() {
        return (CoreFlowSheetPosition[]) $VALUES.clone();
    }
}
