package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;

/* loaded from: classes6.dex */
public final class qcj0 implements zo31 {
    public final ConstraintLayout a;
    public final LinearLayout b;
    public final RecyclerView c;
    public final ListItemComponent d;
    public final ImageView e;
    public final ShimmeringFrameLayout f;
    public final LinearLayout g;
    public final RobotoTextView h;

    public qcj0(ConstraintLayout constraintLayout, LinearLayout linearLayout, RecyclerView recyclerView, ListItemComponent listItemComponent, ImageView imageView, ShimmeringFrameLayout shimmeringFrameLayout, LinearLayout linearLayout2, RobotoTextView robotoTextView) {
        this.a = constraintLayout;
        this.b = linearLayout;
        this.c = recyclerView;
        this.d = listItemComponent;
        this.e = imageView;
        this.f = shimmeringFrameLayout;
        this.g = linearLayout2;
        this.h = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
