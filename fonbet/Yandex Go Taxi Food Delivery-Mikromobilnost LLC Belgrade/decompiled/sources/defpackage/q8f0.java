package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class q8f0 extends RecyclerView.d {
    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        rect.left = recyclerView.getChildLayoutPosition(view) > 0 ? -bb1.q(qvg0.pay_sdk_product_logo_overlapping, view) : 0;
    }
}
