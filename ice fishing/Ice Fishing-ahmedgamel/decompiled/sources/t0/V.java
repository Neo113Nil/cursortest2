package t0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public int f40614a;

    /* renamed from: b, reason: collision with root package name */
    public int f40615b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f40616c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f40617d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f40618e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f40619f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f40620g;

    public V(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f40620g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f40614a = -1;
        this.f40615b = Integer.MIN_VALUE;
        this.f40616c = false;
        this.f40617d = false;
        this.f40618e = false;
        int[] iArr = this.f40619f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
