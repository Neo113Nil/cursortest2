package t0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* renamed from: t0.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5035T {

    /* renamed from: a, reason: collision with root package name */
    public int f40636a;

    /* renamed from: b, reason: collision with root package name */
    public int f40637b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f40638c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f40639d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f40640e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f40641f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f40642g;

    public C5035T(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f40642g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f40636a = -1;
        this.f40637b = Integer.MIN_VALUE;
        this.f40638c = false;
        this.f40639d = false;
        this.f40640e = false;
        int[] iArr = this.f40641f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
