package k0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public int f3483a;

    /* renamed from: b, reason: collision with root package name */
    public int f3484b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3485c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3486d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f3487f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f3488g;

    public f0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f3488g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f3483a = -1;
        this.f3484b = Integer.MIN_VALUE;
        this.f3485c = false;
        this.f3486d = false;
        this.e = false;
        int[] iArr = this.f3487f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
