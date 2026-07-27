package t0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public int f40611a;

    /* renamed from: b, reason: collision with root package name */
    public int f40612b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f40613c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f40614d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f40615e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f40616f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f40617g;

    public V(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f40617g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f40611a = -1;
        this.f40612b = Integer.MIN_VALUE;
        this.f40613c = false;
        this.f40614d = false;
        this.f40615e = false;
        int[] iArr = this.f40616f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
