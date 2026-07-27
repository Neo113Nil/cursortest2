package L;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f506a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f507b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f508c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public final int f509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f510e;

    public O(StaggeredGridLayoutManager staggeredGridLayoutManager, int i2) {
        this.f510e = staggeredGridLayoutManager;
        this.f509d = i2;
    }

    public final int a(int i2) {
        int i3 = this.f508c;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (this.f506a.size() == 0) {
            return i2;
        }
        View view = (View) this.f506a.get(r3.size() - 1);
        L l2 = (L) view.getLayoutParams();
        this.f508c = this.f510e.f1620j.b(view);
        l2.getClass();
        return this.f508c;
    }
}
