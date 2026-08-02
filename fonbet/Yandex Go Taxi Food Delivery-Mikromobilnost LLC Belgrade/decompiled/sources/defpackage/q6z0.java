package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.due_selector.impl.presentation.ui.picker.dayspicker.DaysTimePicker;

/* loaded from: classes5.dex */
public final class q6z0 implements zo31 {
    public final GoLinearLayout a;
    public final ButtonComponent b;
    public final DaysTimePicker c;

    public q6z0(GoLinearLayout goLinearLayout, ButtonComponent buttonComponent, DaysTimePicker daysTimePicker) {
        this.a = goLinearLayout;
        this.b = buttonComponent;
        this.c = daysTimePicker;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
