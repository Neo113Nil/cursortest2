package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes12.dex */
public final class q69 extends RecyclerView.g {
    public final RecyclerView a;
    public final s1r b;
    public int c = -1;

    public q69(RecyclerView recyclerView, s1r s1rVar) {
        this.a = recyclerView;
        this.b = s1rVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int childAdapterPosition;
        RecyclerView recyclerView2 = this.a;
        View findChildViewUnder = recyclerView2.findChildViewUnder(recyclerView2.getWidth() / 2, recyclerView2.getHeight() / 2);
        if (findChildViewUnder == null || (childAdapterPosition = recyclerView2.getChildAdapterPosition(findChildViewUnder)) == -1 || childAdapterPosition == this.c) {
            return;
        }
        this.c = childAdapterPosition;
        this.b.invoke(Integer.valueOf(childAdapterPosition));
    }
}
