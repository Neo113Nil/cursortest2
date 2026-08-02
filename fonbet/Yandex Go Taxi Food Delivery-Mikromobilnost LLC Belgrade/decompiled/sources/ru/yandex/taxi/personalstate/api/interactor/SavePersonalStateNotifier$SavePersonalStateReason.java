package ru.yandex.taxi.personalstate.api.interactor;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/taxi/personalstate/api/interactor/SavePersonalStateNotifier$SavePersonalStateReason", "", "Lru/yandex/taxi/personalstate/api/interactor/SavePersonalStateNotifier$SavePersonalStateReason;", "MULTICLASS_CLASSES", "SELECTED_TARIFF", "COMMENT", "REQUIREMENTS", "ORDER_COMPOSITE", "PAYMENT_METHOD", "SUMMARY_BUTTON_EXPAND_CARD", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SavePersonalStateNotifier$SavePersonalStateReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SavePersonalStateNotifier$SavePersonalStateReason[] $VALUES;
    public static final SavePersonalStateNotifier$SavePersonalStateReason COMMENT;
    public static final SavePersonalStateNotifier$SavePersonalStateReason MULTICLASS_CLASSES;
    public static final SavePersonalStateNotifier$SavePersonalStateReason ORDER_COMPOSITE;
    public static final SavePersonalStateNotifier$SavePersonalStateReason PAYMENT_METHOD;
    public static final SavePersonalStateNotifier$SavePersonalStateReason REQUIREMENTS;
    public static final SavePersonalStateNotifier$SavePersonalStateReason SELECTED_TARIFF;
    public static final SavePersonalStateNotifier$SavePersonalStateReason SUMMARY_BUTTON_EXPAND_CARD;

    static {
        SavePersonalStateNotifier$SavePersonalStateReason savePersonalStateNotifier$SavePersonalStateReason = new SavePersonalStateNotifier$SavePersonalStateReason("MULTICLASS_CLASSES", 0);
        MULTICLASS_CLASSES = savePersonalStateNotifier$SavePersonalStateReason;
        SavePersonalStateNotifier$SavePersonalStateReason savePersonalStateNotifier$SavePersonalStateReason2 = new SavePersonalStateNotifier$SavePersonalStateReason("SELECTED_TARIFF", 1);
        SELECTED_TARIFF = savePersonalStateNotifier$SavePersonalStateReason2;
        SavePersonalStateNotifier$SavePersonalStateReason savePersonalStateNotifier$SavePersonalStateReason3 = new SavePersonalStateNotifier$SavePersonalStateReason("COMMENT", 2);
        COMMENT = savePersonalStateNotifier$SavePersonalStateReason3;
        SavePersonalStateNotifier$SavePersonalStateReason savePersonalStateNotifier$SavePersonalStateReason4 = new SavePersonalStateNotifier$SavePersonalStateReason("REQUIREMENTS", 3);
        REQUIREMENTS = savePersonalStateNotifier$SavePersonalStateReason4;
        SavePersonalStateNotifier$SavePersonalStateReason savePersonalStateNotifier$SavePersonalStateReason5 = new SavePersonalStateNotifier$SavePersonalStateReason("ORDER_COMPOSITE", 4);
        ORDER_COMPOSITE = savePersonalStateNotifier$SavePersonalStateReason5;
        SavePersonalStateNotifier$SavePersonalStateReason savePersonalStateNotifier$SavePersonalStateReason6 = new SavePersonalStateNotifier$SavePersonalStateReason("PAYMENT_METHOD", 5);
        PAYMENT_METHOD = savePersonalStateNotifier$SavePersonalStateReason6;
        SavePersonalStateNotifier$SavePersonalStateReason savePersonalStateNotifier$SavePersonalStateReason7 = new SavePersonalStateNotifier$SavePersonalStateReason("SUMMARY_BUTTON_EXPAND_CARD", 6);
        SUMMARY_BUTTON_EXPAND_CARD = savePersonalStateNotifier$SavePersonalStateReason7;
        SavePersonalStateNotifier$SavePersonalStateReason[] savePersonalStateNotifier$SavePersonalStateReasonArr = {savePersonalStateNotifier$SavePersonalStateReason, savePersonalStateNotifier$SavePersonalStateReason2, savePersonalStateNotifier$SavePersonalStateReason3, savePersonalStateNotifier$SavePersonalStateReason4, savePersonalStateNotifier$SavePersonalStateReason5, savePersonalStateNotifier$SavePersonalStateReason6, savePersonalStateNotifier$SavePersonalStateReason7};
        $VALUES = savePersonalStateNotifier$SavePersonalStateReasonArr;
        $ENTRIES = a.a(savePersonalStateNotifier$SavePersonalStateReasonArr);
    }

    public static SavePersonalStateNotifier$SavePersonalStateReason valueOf(String str) {
        return (SavePersonalStateNotifier$SavePersonalStateReason) Enum.valueOf(SavePersonalStateNotifier$SavePersonalStateReason.class, str);
    }

    public static SavePersonalStateNotifier$SavePersonalStateReason[] values() {
        return (SavePersonalStateNotifier$SavePersonalStateReason[]) $VALUES.clone();
    }
}
