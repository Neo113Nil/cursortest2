package defpackage;

import android.view.View;
import ru.yandex.taxi.altpins.confirmation_screen.modal.comparison_block.ComparisonItemView;
import ru.yandex.taxi.altpins.confirmation_screen.modal.comparison_block.ComparisonView;

/* loaded from: classes5.dex */
public final class rvc implements zo31 {
    public final ComparisonView a;
    public final ComparisonItemView b;
    public final ComparisonItemView c;

    public rvc(ComparisonView comparisonView, ComparisonItemView comparisonItemView, ComparisonItemView comparisonItemView2) {
        this.a = comparisonView;
        this.b = comparisonItemView;
        this.c = comparisonItemView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
