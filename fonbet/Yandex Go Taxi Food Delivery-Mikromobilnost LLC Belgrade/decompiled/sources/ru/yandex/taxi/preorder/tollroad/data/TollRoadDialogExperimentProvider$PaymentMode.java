package ru.yandex.taxi.preorder.tollroad.data;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"ru/yandex/taxi/preorder/tollroad/data/TollRoadDialogExperimentProvider$PaymentMode", "", "Lru/yandex/taxi/preorder/tollroad/data/TollRoadDialogExperimentProvider$PaymentMode;", "MANUAL", "MANUAL_WITH_FEE", "AUTO", "AUTO_WITH_FEE", "AUTO_WITH_FEE_DISCOUNT", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TollRoadDialogExperimentProvider$PaymentMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TollRoadDialogExperimentProvider$PaymentMode[] $VALUES;
    public static final TollRoadDialogExperimentProvider$PaymentMode AUTO;
    public static final TollRoadDialogExperimentProvider$PaymentMode AUTO_WITH_FEE;
    public static final TollRoadDialogExperimentProvider$PaymentMode AUTO_WITH_FEE_DISCOUNT;
    public static final TollRoadDialogExperimentProvider$PaymentMode MANUAL;
    public static final TollRoadDialogExperimentProvider$PaymentMode MANUAL_WITH_FEE;
    public static final TollRoadDialogExperimentProvider$PaymentMode UNKNOWN;

    static {
        TollRoadDialogExperimentProvider$PaymentMode tollRoadDialogExperimentProvider$PaymentMode = new TollRoadDialogExperimentProvider$PaymentMode("MANUAL", 0);
        MANUAL = tollRoadDialogExperimentProvider$PaymentMode;
        TollRoadDialogExperimentProvider$PaymentMode tollRoadDialogExperimentProvider$PaymentMode2 = new TollRoadDialogExperimentProvider$PaymentMode("MANUAL_WITH_FEE", 1);
        MANUAL_WITH_FEE = tollRoadDialogExperimentProvider$PaymentMode2;
        TollRoadDialogExperimentProvider$PaymentMode tollRoadDialogExperimentProvider$PaymentMode3 = new TollRoadDialogExperimentProvider$PaymentMode("AUTO", 2);
        AUTO = tollRoadDialogExperimentProvider$PaymentMode3;
        TollRoadDialogExperimentProvider$PaymentMode tollRoadDialogExperimentProvider$PaymentMode4 = new TollRoadDialogExperimentProvider$PaymentMode("AUTO_WITH_FEE", 3);
        AUTO_WITH_FEE = tollRoadDialogExperimentProvider$PaymentMode4;
        TollRoadDialogExperimentProvider$PaymentMode tollRoadDialogExperimentProvider$PaymentMode5 = new TollRoadDialogExperimentProvider$PaymentMode("AUTO_WITH_FEE_DISCOUNT", 4);
        AUTO_WITH_FEE_DISCOUNT = tollRoadDialogExperimentProvider$PaymentMode5;
        TollRoadDialogExperimentProvider$PaymentMode tollRoadDialogExperimentProvider$PaymentMode6 = new TollRoadDialogExperimentProvider$PaymentMode("UNKNOWN", 5);
        UNKNOWN = tollRoadDialogExperimentProvider$PaymentMode6;
        TollRoadDialogExperimentProvider$PaymentMode[] tollRoadDialogExperimentProvider$PaymentModeArr = {tollRoadDialogExperimentProvider$PaymentMode, tollRoadDialogExperimentProvider$PaymentMode2, tollRoadDialogExperimentProvider$PaymentMode3, tollRoadDialogExperimentProvider$PaymentMode4, tollRoadDialogExperimentProvider$PaymentMode5, tollRoadDialogExperimentProvider$PaymentMode6};
        $VALUES = tollRoadDialogExperimentProvider$PaymentModeArr;
        $ENTRIES = kotlin.enums.a.a(tollRoadDialogExperimentProvider$PaymentModeArr);
    }

    public static TollRoadDialogExperimentProvider$PaymentMode valueOf(String str) {
        return (TollRoadDialogExperimentProvider$PaymentMode) Enum.valueOf(TollRoadDialogExperimentProvider$PaymentMode.class, str);
    }

    public static TollRoadDialogExperimentProvider$PaymentMode[] values() {
        return (TollRoadDialogExperimentProvider$PaymentMode[]) $VALUES.clone();
    }
}
