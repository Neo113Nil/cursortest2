package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ru.yandex.taxi.altpins.confirmation_screen.modal.comparison_block.ComparisonView;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.widget.ButtonsView;

/* loaded from: classes5.dex */
public final class yw1 implements zo31 {
    public final LinearLayout a;
    public final ButtonsView b;
    public final ComparisonView c;
    public final ListHeaderComponent d;

    public yw1(LinearLayout linearLayout, ButtonsView buttonsView, ComparisonView comparisonView, ListHeaderComponent listHeaderComponent) {
        this.a = linearLayout;
        this.b = buttonsView;
        this.c = comparisonView;
        this.d = listHeaderComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
