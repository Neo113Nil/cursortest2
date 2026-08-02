package ru.yandex.taxi.widget.modalview;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/widget/modalview/ModalViewCoordinatorImpl$OnAppearingListener$Step", "", "Lru/yandex/taxi/widget/modalview/ModalViewCoordinatorImpl$OnAppearingListener$Step;", "INITIAL", "APPEARED", "DISAPPEARED", "modals"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
final class ModalViewCoordinatorImpl$OnAppearingListener$Step {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ModalViewCoordinatorImpl$OnAppearingListener$Step[] $VALUES;
    public static final ModalViewCoordinatorImpl$OnAppearingListener$Step APPEARED;
    public static final ModalViewCoordinatorImpl$OnAppearingListener$Step DISAPPEARED;
    public static final ModalViewCoordinatorImpl$OnAppearingListener$Step INITIAL;

    static {
        ModalViewCoordinatorImpl$OnAppearingListener$Step modalViewCoordinatorImpl$OnAppearingListener$Step = new ModalViewCoordinatorImpl$OnAppearingListener$Step("INITIAL", 0);
        INITIAL = modalViewCoordinatorImpl$OnAppearingListener$Step;
        ModalViewCoordinatorImpl$OnAppearingListener$Step modalViewCoordinatorImpl$OnAppearingListener$Step2 = new ModalViewCoordinatorImpl$OnAppearingListener$Step("APPEARED", 1);
        APPEARED = modalViewCoordinatorImpl$OnAppearingListener$Step2;
        ModalViewCoordinatorImpl$OnAppearingListener$Step modalViewCoordinatorImpl$OnAppearingListener$Step3 = new ModalViewCoordinatorImpl$OnAppearingListener$Step("DISAPPEARED", 2);
        DISAPPEARED = modalViewCoordinatorImpl$OnAppearingListener$Step3;
        ModalViewCoordinatorImpl$OnAppearingListener$Step[] modalViewCoordinatorImpl$OnAppearingListener$StepArr = {modalViewCoordinatorImpl$OnAppearingListener$Step, modalViewCoordinatorImpl$OnAppearingListener$Step2, modalViewCoordinatorImpl$OnAppearingListener$Step3};
        $VALUES = modalViewCoordinatorImpl$OnAppearingListener$StepArr;
        $ENTRIES = kotlin.enums.a.a(modalViewCoordinatorImpl$OnAppearingListener$StepArr);
    }

    public static ModalViewCoordinatorImpl$OnAppearingListener$Step valueOf(String str) {
        return (ModalViewCoordinatorImpl$OnAppearingListener$Step) Enum.valueOf(ModalViewCoordinatorImpl$OnAppearingListener$Step.class, str);
    }

    public static ModalViewCoordinatorImpl$OnAppearingListener$Step[] values() {
        return (ModalViewCoordinatorImpl$OnAppearingListener$Step[]) $VALUES.clone();
    }
}
