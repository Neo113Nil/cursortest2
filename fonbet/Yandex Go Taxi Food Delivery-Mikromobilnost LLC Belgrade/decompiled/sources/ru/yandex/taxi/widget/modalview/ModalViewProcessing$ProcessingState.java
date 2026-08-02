package ru.yandex.taxi.widget.modalview;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/taxi/widget/modalview/ModalViewProcessing$ProcessingState", "", "Lru/yandex/taxi/widget/modalview/ModalViewProcessing$ProcessingState;", "MINIMIZED", "STICK_OUT", "LOADING", "DONE", "modals"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ModalViewProcessing$ProcessingState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ModalViewProcessing$ProcessingState[] $VALUES;
    public static final ModalViewProcessing$ProcessingState DONE;
    public static final ModalViewProcessing$ProcessingState LOADING;
    public static final ModalViewProcessing$ProcessingState MINIMIZED;
    public static final ModalViewProcessing$ProcessingState STICK_OUT;

    static {
        ModalViewProcessing$ProcessingState modalViewProcessing$ProcessingState = new ModalViewProcessing$ProcessingState("MINIMIZED", 0);
        MINIMIZED = modalViewProcessing$ProcessingState;
        ModalViewProcessing$ProcessingState modalViewProcessing$ProcessingState2 = new ModalViewProcessing$ProcessingState("STICK_OUT", 1);
        STICK_OUT = modalViewProcessing$ProcessingState2;
        ModalViewProcessing$ProcessingState modalViewProcessing$ProcessingState3 = new ModalViewProcessing$ProcessingState("LOADING", 2);
        LOADING = modalViewProcessing$ProcessingState3;
        ModalViewProcessing$ProcessingState modalViewProcessing$ProcessingState4 = new ModalViewProcessing$ProcessingState("DONE", 3);
        DONE = modalViewProcessing$ProcessingState4;
        ModalViewProcessing$ProcessingState[] modalViewProcessing$ProcessingStateArr = {modalViewProcessing$ProcessingState, modalViewProcessing$ProcessingState2, modalViewProcessing$ProcessingState3, modalViewProcessing$ProcessingState4};
        $VALUES = modalViewProcessing$ProcessingStateArr;
        $ENTRIES = kotlin.enums.a.a(modalViewProcessing$ProcessingStateArr);
    }

    public static ModalViewProcessing$ProcessingState valueOf(String str) {
        return (ModalViewProcessing$ProcessingState) Enum.valueOf(ModalViewProcessing$ProcessingState.class, str);
    }

    public static ModalViewProcessing$ProcessingState[] values() {
        return (ModalViewProcessing$ProcessingState[]) $VALUES.clone();
    }
}
