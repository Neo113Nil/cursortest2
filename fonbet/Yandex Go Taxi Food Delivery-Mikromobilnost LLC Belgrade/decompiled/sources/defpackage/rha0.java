package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class rha0 extends RecyclerView.d {
    public final boolean a;

    public rha0(boolean z) {
        this.a = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        if (!this.a) {
            rect.bottom = childLayoutPosition > 0 ? -bb1.q(pvg0.pay_sdk_promo_card_overlapping, view) : 0;
        } else if (childLayoutPosition != 0) {
            rect.top = bb1.q(pvg0.pay_sdk_promo_card_space_tablet, view);
        }
    }
}
