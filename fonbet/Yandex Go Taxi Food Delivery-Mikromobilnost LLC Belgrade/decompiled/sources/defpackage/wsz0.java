package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class wsz0 extends RecyclerView.d {
    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!(i2 < recyclerView.getChildCount())) {
                i = -1;
                break;
            }
            int i3 = i2 + 1;
            View childAt = recyclerView.getChildAt(i2);
            if (childAt == null) {
                ny61.s();
                return;
            } else {
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                if (view.equals(childAt)) {
                    break;
                }
                i++;
                i2 = i3;
            }
        }
        if (i > 0) {
            rect.left = kp50.r(12);
        }
    }
}
