package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class b20 {
    public final /* synthetic */ RecyclerView qoPGr6Ce;

    public b20(RecyclerView recyclerView) {
        this.qoPGr6Ce = recyclerView;
    }

    public final void qoPGr6Ce() {
        int[] iArr = RecyclerView.yzvmSy3z;
        RecyclerView recyclerView = this.qoPGr6Ce;
        if (!recyclerView.Ey6iv0m0 || !recyclerView.KlHjfFWx) {
            recyclerView.lwWCatUu = true;
            recyclerView.requestLayout();
        } else {
            j10 j10Var = recyclerView.jb9XjC4I;
            WeakHashMap weakHashMap = hg0.qoPGr6Ce;
            recyclerView.postOnAnimation(j10Var);
        }
    }
}
