package com.yandex.div.core.view2.divs.gallery;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.amh;
import defpackage.bg3;
import defpackage.dp8;
import defpackage.e23;
import defpackage.hh9;
import defpackage.k79;
import defpackage.kpn;
import defpackage.qon;
import defpackage.s09;
import defpackage.szb;
import defpackage.u09;
import defpackage.wvs;
import defpackage.xq0;
import defpackage.xz0;
import defpackage.y09;
import defpackage.yj9;
import defpackage.yon;
import defpackage.ywq;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/view2/divs/gallery/DivGridLayoutManager;", "Landroidx/recyclerview/widget/StaggeredGridLayoutManager;", "Ly09;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class DivGridLayoutManager extends StaggeredGridLayoutManager implements y09 {
    public final e23 L;
    public final RecyclerView M;
    public final s09 N;
    public final HashSet O;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivGridLayoutManager(e23 e23Var, hh9 hh9Var, s09 s09Var, int i) {
        super(r0, i);
        int i2;
        szb szbVar = s09Var.h;
        if (szbVar != null) {
            long longValue = ((Number) szbVar.a(e23Var.b)).longValue();
            long j = longValue >> 31;
            i2 = (j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i2 = 1;
        }
        this.L = e23Var;
        this.M = hh9Var;
        this.N = s09Var;
        this.O = new HashSet();
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, defpackage.yon
    public final void F0(kpn kpnVar) {
        m();
        super.F0(kpnVar);
    }

    public final int I1() {
        s09 s09Var = this.N;
        szb szbVar = s09Var.k;
        RecyclerView recyclerView = this.M;
        e23 e23Var = this.L;
        return szbVar != null ? bg3.w(Long.valueOf(((Number) szbVar.a(e23Var.b)).longValue()), recyclerView.getResources().getDisplayMetrics()) : bg3.w((Long) s09Var.t.a(e23Var.b), recyclerView.getResources().getDisplayMetrics());
    }

    public final int J1(int i) {
        return i == this.t ? bg3.w((Long) this.N.t.a(this.L.b), this.M.getResources().getDisplayMetrics()) : I1();
    }

    @Override // defpackage.yon
    public final void K(int i) {
        super.K(i);
        View t = t(i);
        if (t == null) {
            return;
        }
        h(t, true);
    }

    @Override // defpackage.yon
    public final void M0(amh amhVar) {
        RecyclerView f = getF();
        int childCount = f.getChildCount();
        for (int i = 0; i < childCount; i++) {
            h(f.getChildAt(i), true);
        }
        super.M0(amhVar);
    }

    @Override // defpackage.yon
    public final void O0(View view) {
        super.O0(view);
        h(view, true);
    }

    @Override // defpackage.yon
    public final void P0(int i) {
        super.P0(i);
        View t = t(i);
        if (t == null) {
            return;
        }
        h(t, true);
    }

    @Override // defpackage.y09
    /* renamed from: a, reason: from getter */
    public final HashSet getH() {
        return this.O;
    }

    @Override // defpackage.yon
    public final int b0() {
        return super.b0() - (J1(1) / 2);
    }

    @Override // defpackage.yon
    public final int c0() {
        return super.c0() - (J1(0) / 2);
    }

    @Override // defpackage.yon
    public final int d0() {
        return super.d0() - (J1(0) / 2);
    }

    @Override // defpackage.y09
    public final void e(View view, int i, int i2, int i3, int i4) {
        super.n0(view, i, i2, i3, i4);
    }

    @Override // defpackage.yon
    public final int e0() {
        return super.e0() - (J1(1) / 2);
    }

    @Override // defpackage.y09
    public final int f() {
        int a0 = a0();
        int i = this.p;
        if (a0 < i) {
            a0 = i;
        }
        int[] iArr = new int[a0];
        if (a0 < i) {
            xq0.j(this.p, a0, ", array size:", "Provided int[]'s size must be more than or equal to span count. Expected:");
            return 0;
        }
        for (int i2 = 0; i2 < this.p; i2++) {
            ywq ywqVar = this.q[i2];
            iArr[i2] = ((StaggeredGridLayoutManager) ywqVar.f).w ? ywqVar.f(r4.size() - 1, -1, true, true, false) : ywqVar.f(0, ywqVar.a.size(), true, true, false);
        }
        return xz0.x(iArr);
    }

    @Override // defpackage.y09
    public final void g(int i, int i2, int i3) {
        r(i, i3, i2);
    }

    @Override // defpackage.y09
    /* renamed from: getBindingContext, reason: from getter */
    public final e23 getE() {
        return this.L;
    }

    @Override // defpackage.y09
    /* renamed from: getDiv, reason: from getter */
    public final s09 getG() {
        return this.N;
    }

    @Override // defpackage.y09
    /* renamed from: getView, reason: from getter */
    public final RecyclerView getF() {
        return this.M;
    }

    @Override // defpackage.y09
    public final k79 j(int i) {
        qon adapter = this.M.getAdapter();
        adapter.getClass();
        return (k79) CollectionsKt.S(((u09) adapter).u(), i);
    }

    @Override // defpackage.y09
    public final void k(int i, int i2) {
        r(i, i2, 0);
    }

    @Override // defpackage.y09
    public final int l() {
        int a0 = a0();
        int i = this.p;
        if (a0 < i) {
            a0 = i;
        }
        int[] iArr = new int[a0];
        if (a0 < i) {
            xq0.j(this.p, a0, ", array size:", "Provided int[]'s size must be more than or equal to span count. Expected:");
            return 0;
        }
        for (int i2 = 0; i2 < this.p; i2++) {
            ywq ywqVar = this.q[i2];
            iArr[i2] = ((StaggeredGridLayoutManager) ywqVar.f).w ? ywqVar.f(0, ywqVar.a.size(), false, true, false) : ywqVar.f(r5.size() - 1, -1, false, true, false);
        }
        if (a0 != 0) {
            return iArr[a0 - 1];
        }
        wvs.h("Array is empty.");
        return 0;
    }

    @Override // defpackage.y09
    public final int n(View view) {
        return yon.f0(view);
    }

    @Override // defpackage.yon
    public final void n0(View view, int i, int i2, int i3, int i4) {
        b(view, i, i2, i3, i4, false);
    }

    @Override // defpackage.y09
    public final int o() {
        int a0 = a0();
        int i = this.p;
        if (a0 < i) {
            a0 = i;
        }
        int[] iArr = new int[a0];
        if (a0 < i) {
            xq0.j(this.p, a0, ", array size:", "Provided int[]'s size must be more than or equal to span count. Expected:");
            return 0;
        }
        for (int i2 = 0; i2 < this.p; i2++) {
            ywq ywqVar = this.q[i2];
            iArr[i2] = ((StaggeredGridLayoutManager) ywqVar.f).w ? ywqVar.f(r4.size() - 1, -1, false, true, false) : ywqVar.f(0, ywqVar.a.size(), false, true, false);
        }
        return xz0.x(iArr);
    }

    @Override // defpackage.y09
    public final int p() {
        int a0 = a0();
        int i = this.p;
        if (a0 < i) {
            a0 = i;
        }
        int[] iArr = new int[a0];
        if (a0 < i) {
            xq0.j(this.p, a0, ", array size:", "Provided int[]'s size must be more than or equal to span count. Expected:");
            return 0;
        }
        for (int i2 = 0; i2 < this.p; i2++) {
            ywq ywqVar = this.q[i2];
            iArr[i2] = ((StaggeredGridLayoutManager) ywqVar.f).w ? ywqVar.f(0, ywqVar.a.size(), true, true, false) : ywqVar.f(r5.size() - 1, -1, true, true, false);
        }
        if (a0 != 0) {
            return iArr[a0 - 1];
        }
        wvs.h("Array is empty.");
        return 0;
    }

    @Override // defpackage.y09
    public final int q() {
        return this.n;
    }

    @Override // defpackage.y09
    public final int s() {
        return this.t;
    }

    @Override // defpackage.yon
    public final void s0(RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            h(recyclerView.getChildAt(i), false);
        }
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, defpackage.yon
    public final void t0(RecyclerView recyclerView, amh amhVar) {
        super.t0(recyclerView, amhVar);
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            h(recyclerView.getChildAt(i), true);
        }
    }

    @Override // defpackage.yon
    public final void w(Rect rect, View view) {
        k79 j;
        super.w(rect, view);
        int f0 = yon.f0(view);
        if (f0 == -1 || (j = j(f0)) == null) {
            return;
        }
        dp8 d = j.a.d();
        boolean z = d.a() instanceof yj9;
        boolean z2 = d.c() instanceof yj9;
        int i = 0;
        boolean z3 = this.p > 1;
        int J1 = (z && z3) ? J1(1) / 2 : 0;
        if (z2 && z3) {
            i = J1(0) / 2;
        }
        rect.set(rect.left - i, rect.top - J1, rect.right - i, rect.bottom - J1);
    }

    @Override // defpackage.y09
    public final yon i() {
        return this;
    }
}
