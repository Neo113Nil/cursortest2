package defpackage;

import ru.yandex.taxi.due_selector.impl.domain.entity.ControlButtonState;
import ru.yandex.taxi.due_selector.impl.domain.entity.DuePickerButtonType;

/* loaded from: classes5.dex */
public final class svm {
    public static final svm f = new svm(DuePickerButtonType.UNKNOWN, ControlButtonState.ACTIVE_MAIN, "", "", false);
    public final DuePickerButtonType a;
    public final ControlButtonState b;
    public final String c;
    public final String d;
    public final boolean e;

    public svm(DuePickerButtonType duePickerButtonType, ControlButtonState controlButtonState, String str, String str2, boolean z) {
        this.a = duePickerButtonType;
        this.b = controlButtonState;
        this.c = str;
        this.d = str2;
        this.e = z;
    }
}
