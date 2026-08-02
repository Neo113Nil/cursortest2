package t0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* renamed from: t0.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5003T {

    /* renamed from: a, reason: collision with root package name */
    public int f40664a;

    /* renamed from: b, reason: collision with root package name */
    public int f40665b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f40666c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f40667d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f40668e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f40669f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f40670g;

    public C5003T(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f40670g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f40664a = -1;
        this.f40665b = Integer.MIN_VALUE;
        this.f40666c = false;
        this.f40667d = false;
        this.f40668e = false;
        int[] iArr = this.f40669f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
