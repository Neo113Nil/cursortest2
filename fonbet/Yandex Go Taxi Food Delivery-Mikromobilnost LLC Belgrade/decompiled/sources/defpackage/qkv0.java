package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;

/* loaded from: classes14.dex */
public final /* synthetic */ class qkv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ int c;

    public /* synthetic */ qkv0(RecyclerView recyclerView, int i, int i2) {
        this.a = i2;
        this.b = recyclerView;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x0 findViewHolderForAdapterPosition;
        View view;
        int i = this.a;
        int i2 = this.c;
        RecyclerView recyclerView = this.b;
        switch (i) {
            case 0:
                if (recyclerView.getLayoutManager() != null && (findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i2)) != null && (view = findViewHolderForAdapterPosition.a) != null) {
                    view.performClick();
                    break;
                }
                break;
            default:
                recyclerView.scrollBy(0, i2);
                break;
        }
    }
}
