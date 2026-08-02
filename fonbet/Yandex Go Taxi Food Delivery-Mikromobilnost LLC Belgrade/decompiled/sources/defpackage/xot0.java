package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;

/* loaded from: classes6.dex */
public final class xot0 implements zo31 {
    public final ConstraintLayout a;
    public final LinearLayout b;
    public final ButtonComponent c;
    public final RecyclerView d;
    public final ImageView e;
    public final ShimmeringFrameLayout f;
    public final RobotoTextView g;
    public final ListHeaderComponent h;
    public final ConstraintLayout i;
    public final ListItemComponent j;

    public xot0(ConstraintLayout constraintLayout, LinearLayout linearLayout, ButtonComponent buttonComponent, RecyclerView recyclerView, ImageView imageView, ShimmeringFrameLayout shimmeringFrameLayout, RobotoTextView robotoTextView, ListHeaderComponent listHeaderComponent, ConstraintLayout constraintLayout2, ListItemComponent listItemComponent) {
        this.a = constraintLayout;
        this.b = linearLayout;
        this.c = buttonComponent;
        this.d = recyclerView;
        this.e = imageView;
        this.f = shimmeringFrameLayout;
        this.g = robotoTextView;
        this.h = listHeaderComponent;
        this.i = constraintLayout2;
        this.j = listItemComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
