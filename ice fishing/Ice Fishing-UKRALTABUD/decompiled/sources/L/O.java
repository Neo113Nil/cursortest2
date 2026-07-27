package L;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f584a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f585b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f586c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public final int f587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f588e;

    public O(StaggeredGridLayoutManager staggeredGridLayoutManager, int i2) {
        this.f588e = staggeredGridLayoutManager;
        this.f587d = i2;
    }

    public final int a(int i2) {
        int i3 = this.f586c;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (this.f584a.size() == 0) {
            return i2;
        }
        View view = (View) this.f584a.get(r3.size() - 1);
        L l2 = (L) view.getLayoutParams();
        this.f586c = this.f588e.f1612j.b(view);
        l2.getClass();
        return this.f586c;
    }
}
