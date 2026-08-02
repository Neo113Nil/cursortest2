package androidx.recyclerview.widget;

import android.view.View;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.amh;
import defpackage.e23;
import defpackage.hh9;
import defpackage.k79;
import defpackage.kpn;
import defpackage.qon;
import defpackage.s09;
import defpackage.u09;
import defpackage.y09;
import defpackage.yon;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/recyclerview/widget/DivLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Ly09;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final class DivLinearLayoutManager extends LinearLayoutManager implements y09 {
    public final e23 E;
    public final RecyclerView F;
    public final s09 G;
    public final HashSet H;

    public DivLinearLayoutManager(e23 e23Var, hh9 hh9Var, s09 s09Var, int i) {
        super(hh9Var.getContext(), i, false);
        this.E = e23Var;
        this.F = hh9Var;
        this.G = s09Var;
        this.H = new HashSet();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.yon
    public final void F0(kpn kpnVar) {
        m();
        super.F0(kpnVar);
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
        return this.H;
    }

    @Override // defpackage.y09
    public final void e(View view, int i, int i2, int i3, int i4) {
        super.n0(view, i, i2, i3, i4);
    }

    @Override // defpackage.y09
    public final void g(int i, int i2, int i3) {
        r(i, i3, i2);
    }

    @Override // defpackage.y09
    /* renamed from: getBindingContext, reason: from getter */
    public final e23 getE() {
        return this.E;
    }

    @Override // defpackage.y09
    /* renamed from: getDiv, reason: from getter */
    public final s09 getG() {
        return this.G;
    }

    @Override // defpackage.y09
    /* renamed from: getView, reason: from getter */
    public final RecyclerView getF() {
        return this.F;
    }

    @Override // defpackage.y09
    public final k79 j(int i) {
        qon adapter = this.F.getAdapter();
        adapter.getClass();
        return (k79) CollectionsKt.S(((u09) adapter).u(), i);
    }

    @Override // defpackage.y09
    public final void k(int i, int i2) {
        r(i, i2, 0);
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
    public final int q() {
        return this.n;
    }

    @Override // defpackage.y09
    public final int s() {
        return this.p;
    }

    @Override // defpackage.yon
    public final void s0(RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            h(recyclerView.getChildAt(i), false);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.yon
    public final void t0(RecyclerView recyclerView, amh amhVar) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            h(recyclerView.getChildAt(i), true);
        }
    }

    @Override // defpackage.y09
    public final yon i() {
        return this;
    }
}
