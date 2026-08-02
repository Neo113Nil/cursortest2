package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.design.AutoDividerComponentList;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.ListTitleComponent;

/* loaded from: classes13.dex */
public final class vud implements zo31 {
    public final ConstraintLayout a;
    public final ListTitleComponent b;

    public vud(ConstraintLayout constraintLayout, ButtonComponent buttonComponent, ListTextComponent listTextComponent, AutoDividerComponentList autoDividerComponentList, ListTitleComponent listTitleComponent) {
        this.a = constraintLayout;
        this.b = listTitleComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
