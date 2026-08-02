package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.promocodes.base.impl.discounts.presentation.ui.dotted_line.DiscountsDottedLineView;
import ru.yandex.taxi.design.ListHeaderComponent;

/* loaded from: classes13.dex */
public final class xqj implements zo31 {
    public final ConstraintLayout a;
    public final RecyclerView b;
    public final DiscountsDottedLineView c;
    public final RecyclerView d;
    public final LinearLayout e;
    public final ListHeaderComponent f;

    public xqj(ConstraintLayout constraintLayout, RecyclerView recyclerView, DiscountsDottedLineView discountsDottedLineView, RecyclerView recyclerView2, LinearLayout linearLayout, ListHeaderComponent listHeaderComponent) {
        this.a = constraintLayout;
        this.b = recyclerView;
        this.c = discountsDottedLineView;
        this.d = recyclerView2;
        this.e = linearLayout;
        this.f = listHeaderComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
