package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public abstract class wvr {
    public static we6 a(RecyclerView recyclerView) {
        boolean n = xw31.n(recyclerView.getContext());
        int width = recyclerView.getWidth();
        RecyclerView.e layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return new we6((Object) null, -1, 4);
        }
        int d0 = layoutManager.d0();
        if (d0 == 1) {
            View c0 = layoutManager.c0(0);
            return c0 == null ? new we6((Object) null, -1, 4) : new we6(c0, ((RecyclerView.LayoutParams) c0.getLayoutParams()).getViewLayoutPosition(), 4);
        }
        for (int i = 0; i < d0; i++) {
            View c02 = layoutManager.c0(i);
            if (c02 != null) {
                if (n) {
                    if (c02.getLeft() <= width && c02.getRight() >= width) {
                        return new we6(c02, ((RecyclerView.LayoutParams) c02.getLayoutParams()).getViewLayoutPosition(), 4);
                    }
                } else if (c02.getLeft() <= 0 && c02.getRight() >= 0) {
                    return new we6(c02, ((RecyclerView.LayoutParams) c02.getLayoutParams()).getViewLayoutPosition(), 4);
                }
            }
        }
        return new we6((Object) null, -1, 4);
    }
}
