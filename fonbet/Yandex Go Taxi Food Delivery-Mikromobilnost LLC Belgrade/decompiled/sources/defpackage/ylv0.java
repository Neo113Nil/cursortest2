package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.widget.BottomEdgeButtonLayout;
import ru.yandex.taxi.widget.RoundedCornersImageView;

/* loaded from: classes6.dex */
public final class ylv0 implements zo31 {
    public final LinearLayout a;
    public final GoLinearLayout b;
    public final GoFrameLayout c;
    public final ListTextComponent d;
    public final ListHeaderComponent e;
    public final AppCompatImageView f;
    public final RoundedCornersImageView g;
    public final ListTextComponent h;
    public final BottomEdgeButtonLayout i;

    public ylv0(LinearLayout linearLayout, GoLinearLayout goLinearLayout, GoFrameLayout goFrameLayout, ListTextComponent listTextComponent, ListHeaderComponent listHeaderComponent, AppCompatImageView appCompatImageView, RoundedCornersImageView roundedCornersImageView, ListTextComponent listTextComponent2, BottomEdgeButtonLayout bottomEdgeButtonLayout) {
        this.a = linearLayout;
        this.b = goLinearLayout;
        this.c = goFrameLayout;
        this.d = listTextComponent;
        this.e = listHeaderComponent;
        this.f = appCompatImageView;
        this.g = roundedCornersImageView;
        this.h = listTextComponent2;
        this.i = bottomEdgeButtonLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
