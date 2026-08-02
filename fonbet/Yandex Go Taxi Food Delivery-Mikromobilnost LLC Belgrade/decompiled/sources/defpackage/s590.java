package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes.dex */
public final class s590 extends RecyclerView.d {
    public final int a;
    public final int b;
    public final int c;

    public s590(int i, int i2, int i3, int i4) {
        i = (i4 & 2) != 0 ? 0 : i;
        i2 = (i4 & 4) != 0 ? 0 : i2;
        i3 = (i4 & 64) != 0 ? 0 : i3;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        RecyclerView.e layoutManager = recyclerView.getLayoutManager();
        int i = layoutManager instanceof StaggeredGridLayoutManager ? ((StaggeredGridLayoutManager) layoutManager).J : 1;
        int i2 = this.c;
        int i3 = this.a;
        if (i != 1) {
            int i4 = i3 / 2;
            int i5 = this.b / 2;
            if (i2 == 0) {
                rect.set(i4, i5, i4, i5);
                return;
            } else {
                if (i2 != 1) {
                    return;
                }
                rect.set(i5, i4, i5, i4);
                return;
            }
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == -1) {
                return;
            }
            boolean z = childAdapterPosition == itemCount - 1;
            if (i2 != 0) {
                if (i2 != 1) {
                    return;
                }
                if (z) {
                    i3 = 0;
                }
                rect.set(0, 0, 0, i3);
                return;
            }
            if (ffx.W(recyclerView)) {
                z = childAdapterPosition == 0;
            }
            if (z) {
                i3 = 0;
            }
            rect.set(0, 0, i3, 0);
        }
    }

    public s590() {
        this(0, 0, 0, HProv.PP_VERSION_TIMESTAMP);
    }
}
