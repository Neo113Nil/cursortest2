package defpackage;

import android.view.ContextThemeWrapper;
import ru.yandex.taxi.due_selector.impl.time.TimePickerModalView;

/* loaded from: classes5.dex */
public final class t6z0 implements r6z0 {
    public final /* synthetic */ TimePickerModalView a;

    public t6z0(TimePickerModalView timePickerModalView) {
        this.a = timePickerModalView;
    }

    @Override // defpackage.r6z0
    public final void Ca(int i) {
        ContextThemeWrapper contextThemeWrapper;
        TimePickerModalView timePickerModalView = this.a;
        contextThemeWrapper = timePickerModalView.contextWrapper;
        y5e.Q(contextThemeWrapper, i);
        timePickerModalView.dispatchThemeToCardContent();
    }
}
