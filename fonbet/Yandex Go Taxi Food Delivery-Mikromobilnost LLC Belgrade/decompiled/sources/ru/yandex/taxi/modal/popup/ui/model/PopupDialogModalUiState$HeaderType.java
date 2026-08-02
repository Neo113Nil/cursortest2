package ru.yandex.taxi.modal.popup.ui.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"ru/yandex/taxi/modal/popup/ui/model/PopupDialogModalUiState$HeaderType", "", "Lru/yandex/taxi/modal/popup/ui/model/PopupDialogModalUiState$HeaderType;", "DEFAULT", "PROMINENT", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PopupDialogModalUiState$HeaderType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PopupDialogModalUiState$HeaderType[] $VALUES;
    public static final PopupDialogModalUiState$HeaderType DEFAULT;
    public static final PopupDialogModalUiState$HeaderType PROMINENT;

    static {
        PopupDialogModalUiState$HeaderType popupDialogModalUiState$HeaderType = new PopupDialogModalUiState$HeaderType("DEFAULT", 0);
        DEFAULT = popupDialogModalUiState$HeaderType;
        PopupDialogModalUiState$HeaderType popupDialogModalUiState$HeaderType2 = new PopupDialogModalUiState$HeaderType("PROMINENT", 1);
        PROMINENT = popupDialogModalUiState$HeaderType2;
        PopupDialogModalUiState$HeaderType[] popupDialogModalUiState$HeaderTypeArr = {popupDialogModalUiState$HeaderType, popupDialogModalUiState$HeaderType2};
        $VALUES = popupDialogModalUiState$HeaderTypeArr;
        $ENTRIES = kotlin.enums.a.a(popupDialogModalUiState$HeaderTypeArr);
    }

    public static PopupDialogModalUiState$HeaderType valueOf(String str) {
        return (PopupDialogModalUiState$HeaderType) Enum.valueOf(PopupDialogModalUiState$HeaderType.class, str);
    }

    public static PopupDialogModalUiState$HeaderType[] values() {
        return (PopupDialogModalUiState$HeaderType[]) $VALUES.clone();
    }
}
