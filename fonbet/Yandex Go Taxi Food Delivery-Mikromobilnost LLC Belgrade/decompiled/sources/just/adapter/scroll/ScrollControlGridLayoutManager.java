package just.adapter.scroll;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r0;
import defpackage.a6q0;
import defpackage.c6w;
import defpackage.d6q0;
import defpackage.e6q0;
import defpackage.efx;
import defpackage.epo0;
import defpackage.gki0;
import defpackage.j73;
import defpackage.lhp0;
import defpackage.mhp0;
import defpackage.q0y;
import defpackage.r0y;
import defpackage.w511;
import defpackage.xm2;
import just.adapter.scroll.experimental.OptimizedPaginationTriggerFeatureConfig;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Ljust/adapter/scroll/ScrollControlGridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "Lmhp0;", "Lgki0;", "just-adapter-scroll-control_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public class ScrollControlGridLayoutManager extends GridLayoutManager implements mhp0, gki0 {
    public static final /* synthetic */ int z0 = 0;
    public final d6q0 n0;
    public final d6q0 o0;
    public final e6q0 p0;
    public final a6q0 q0;
    public final a6q0 r0;
    public final a6q0 s0;
    public final Handler t0;
    public boolean u0;
    public int v0;
    public final r0y w0;
    public boolean x0;
    public boolean y0;

    public ScrollControlGridLayoutManager(Context context, d6q0 d6q0Var, d6q0 d6q0Var2, e6q0 e6q0Var, a6q0 a6q0Var, a6q0 a6q0Var2, a6q0 a6q0Var3, efx efxVar) {
        super(context, 60);
        this.n0 = d6q0Var;
        this.o0 = d6q0Var2;
        this.p0 = e6q0Var;
        this.q0 = a6q0Var;
        this.r0 = a6q0Var2;
        this.s0 = a6q0Var3;
        this.t0 = new Handler(Looper.getMainLooper());
        r0y r0yVar = new r0y(this);
        this.w0 = r0yVar;
        this.x0 = true;
        this.y0 = true;
        if (efxVar != null) {
            efxVar.registerAdapterDataObserver(r0yVar);
        }
    }

    @Override // defpackage.mhp0
    public final void A(boolean z) {
        this.y0 = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void G0(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        r0y r0yVar = this.w0;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(r0yVar);
        }
        r0yVar.h();
        if (adapter2 != null) {
            adapter2.registerAdapterDataObserver(r0yVar);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final boolean I() {
        return this.y0 && super.I();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final boolean J() {
        return this.x0 && super.J();
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final void U0(r0 r0Var, RecyclerView.k kVar) {
        int b;
        d6q0 d6q0Var;
        int i;
        Handler handler;
        int i2;
        int[] iArr;
        SparseIntArray sparseIntArray;
        int i3;
        int i4;
        int min;
        int i5;
        GridLayoutManager.b bVar;
        Handler handler2;
        int i6;
        int measuredHeight;
        d6q0 d6q0Var2;
        int i7;
        int h0;
        long j;
        int viewLayoutPosition;
        super.U0(r0Var, kVar);
        OptimizedPaginationTriggerFeatureConfig optimizedPaginationTriggerFeatureConfig = this.r0.b.h0;
        if (optimizedPaginationTriggerFeatureConfig == OptimizedPaginationTriggerFeatureConfig.DISABLED || kVar.g) {
            return;
        }
        int b2 = kVar.b();
        if (b2 > this.v0) {
            this.u0 = false;
        }
        this.v0 = b2;
        if (this.u0 || ((Boolean) this.s0.invoke()).booleanValue()) {
            return;
        }
        int i8 = lhp0.a[optimizedPaginationTriggerFeatureConfig.ordinal()];
        Handler handler3 = this.t0;
        e6q0 e6q0Var = this.p0;
        d6q0 d6q0Var3 = this.o0;
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    return;
                }
                w511.b();
                return;
            }
            int intValue = ((Number) d6q0Var3.invoke()).intValue();
            int b3 = kVar.b();
            boolean z = (e6q0Var == null || this.u0) ? false : true;
            boolean z2 = b3 == 0 || d0() == 0;
            if (!z || z2) {
                return;
            }
            if (B1(kVar) + C1(kVar) > D1(kVar) - intValue) {
                this.u0 = true;
                handler3.post(new epo0(7, this, kVar));
                return;
            }
            return;
        }
        if (e6q0Var == null || (b = kVar.b()) == 0 || d0() == 0) {
            return;
        }
        int i9 = b - 1;
        r0y r0yVar = this.w0;
        ScrollControlGridLayoutManager scrollControlGridLayoutManager = r0yVar.a;
        ScrollControlGridLayoutManager scrollControlGridLayoutManager2 = r0yVar.a;
        int paddingLeft = (scrollControlGridLayoutManager.H - scrollControlGridLayoutManager.getPaddingLeft()) - scrollControlGridLayoutManager.getPaddingRight();
        if (paddingLeft < 0) {
            paddingLeft = 0;
        }
        if (paddingLeft <= 0 || b <= 0) {
            return;
        }
        if (r0yVar.c && r0yVar.d == paddingLeft) {
            i = i9;
            handler = handler3;
            i2 = 0;
            d6q0Var = d6q0Var3;
        } else {
            int i10 = scrollControlGridLayoutManager2.c0;
            GridLayoutManager.b bVar2 = scrollControlGridLayoutManager2.h0;
            int a = bVar2.a(i9, i10);
            int i11 = a + 1;
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            int d0 = scrollControlGridLayoutManager2.d0();
            int i12 = 0;
            while (i12 < d0) {
                int i13 = d0;
                View c0 = scrollControlGridLayoutManager2.c0(i12);
                if (c0 == null) {
                    d6q0Var2 = d6q0Var3;
                    i7 = i12;
                } else {
                    d6q0Var2 = d6q0Var3;
                    int viewLayoutPosition2 = ((RecyclerView.LayoutParams) c0.getLayoutParams()).getViewLayoutPosition();
                    i7 = i12;
                    if (viewLayoutPosition2 != -1 && (h0 = scrollControlGridLayoutManager2.h0(c0) - scrollControlGridLayoutManager2.n0(c0)) > 0) {
                        sparseIntArray2.put(viewLayoutPosition2, h0);
                    }
                }
                i12 = i7 + 1;
                d0 = i13;
                d6q0Var3 = d6q0Var2;
            }
            d6q0Var = d6q0Var3;
            int[] iArr2 = new int[i11];
            int i14 = 0;
            while (i14 < b) {
                int a2 = bVar2.a(i14, i10);
                int i15 = b;
                int i16 = sparseIntArray2.get(i14, -1);
                if (i16 >= 0) {
                    i6 = i9;
                    handler2 = handler3;
                    i4 = i14;
                    sparseIntArray = sparseIntArray2;
                    i3 = i10;
                    i5 = a2;
                    bVar = bVar2;
                    measuredHeight = i16;
                    iArr = iArr2;
                } else {
                    Rect rect = r0yVar.b;
                    iArr = iArr2;
                    View e = r0Var.e(i14);
                    try {
                        sparseIntArray = sparseIntArray2;
                        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) e.getLayoutParams();
                        super.m(e, rect);
                        i3 = i10;
                        int c = scrollControlGridLayoutManager2.h0.c(i14);
                        i4 = i14;
                        int paddingLeft2 = (scrollControlGridLayoutManager2.H - scrollControlGridLayoutManager2.getPaddingLeft()) - scrollControlGridLayoutManager2.getPaddingRight();
                        int i17 = paddingLeft2 < 0 ? 0 : paddingLeft2;
                        int i18 = scrollControlGridLayoutManager2.c0;
                        if (i18 <= 0) {
                            min = 0;
                        } else {
                            int i19 = i17 / i18;
                            min = Math.min(c, i17 - (i18 * i19)) + (i19 * c);
                        }
                        i5 = a2;
                        bVar = bVar2;
                        handler2 = handler3;
                        i6 = i9;
                        e.measure(RecyclerView.e.e0(min, 1073741824, rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width, false), RecyclerView.e.e0(scrollControlGridLayoutManager2.I, 0, scrollControlGridLayoutManager2.getPaddingTop() + scrollControlGridLayoutManager2.getPaddingBottom() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height, true));
                        measuredHeight = rect.bottom + e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect.top;
                    } finally {
                        r0Var.k(e);
                    }
                }
                if (measuredHeight > iArr[i5]) {
                    iArr[i5] = measuredHeight;
                }
                i14 = i4 + 1;
                i9 = i6;
                b = i15;
                iArr2 = iArr;
                i10 = i3;
                sparseIntArray2 = sparseIntArray;
                bVar2 = bVar;
                handler3 = handler2;
            }
            i = i9;
            handler = handler3;
            int[] iArr3 = iArr2;
            i2 = 0;
            long[] jArr = new long[a + 2];
            int i20 = 0;
            while (i20 < i11) {
                int i21 = i20 + 1;
                jArr[i21] = jArr[i20] + iArr3[i20];
                i20 = i21;
            }
            r0yVar.f = jArr;
            r0yVar.e = jArr[i11];
            r0yVar.d = paddingLeft;
            r0yVar.c = true;
        }
        long j2 = r0yVar.e;
        int d02 = scrollControlGridLayoutManager2.d0();
        int i22 = Integer.MAX_VALUE;
        int i23 = -1;
        for (int i24 = i2; i24 < d02; i24++) {
            View c02 = scrollControlGridLayoutManager2.c0(i24);
            if (c02 != null && (viewLayoutPosition = ((RecyclerView.LayoutParams) c02.getLayoutParams()).getViewLayoutPosition()) != -1) {
                int n0 = scrollControlGridLayoutManager2.n0(c02);
                if (i23 == -1 || viewLayoutPosition < i23 || (viewLayoutPosition == i23 && n0 < i22)) {
                    i22 = n0;
                    i23 = viewLayoutPosition;
                }
            }
        }
        q0y q0yVar = i23 == -1 ? null : new q0y(scrollControlGridLayoutManager2.h0.a(i23, scrollControlGridLayoutManager2.c0), i22);
        if (q0yVar == null) {
            return;
        }
        int a3 = q0yVar.a();
        if (a3 <= 0) {
            j = 0;
        } else {
            long[] jArr2 = r0yVar.f;
            j = a3 > jArr2.length + (-1) ? r0yVar.e : jArr2[a3];
        }
        long b4 = j - q0yVar.b();
        int paddingTop = (this.I - getPaddingTop()) - getPaddingBottom();
        if (paddingTop >= 0) {
            i2 = paddingTop;
        }
        if (b4 + i2 > j2 - ((Number) d6q0Var.invoke()).intValue()) {
            this.u0 = true;
            handler.post(new xm2(e6q0Var, i, 17));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void Y0(int i) {
        if (i == 0) {
            this.u0 = false;
        }
    }

    @Override // defpackage.mhp0
    public final void w(boolean z) {
        this.x0 = z;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final boolean y1() {
        Boolean bool = this.q0.b.T;
        return bool != null ? bool.booleanValue() : super.y1();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void z1(RecyclerView.k kVar, int[] iArr) {
        super.z1(kVar, iArr);
        if (this.r0.b.h0 != OptimizedPaginationTriggerFeatureConfig.DISABLED) {
            return;
        }
        int intValue = ((Number) this.n0.invoke()).intValue();
        c6w it = j73.E(iArr).iterator();
        while (it.c) {
            int nextInt = it.nextInt();
            iArr[nextInt] = iArr[nextInt] + intValue;
        }
    }
}
