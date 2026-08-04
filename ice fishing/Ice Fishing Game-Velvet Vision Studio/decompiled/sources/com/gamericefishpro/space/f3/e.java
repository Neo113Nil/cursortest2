package com.gamericefishpro.space.f3;

import android.view.View;
import android.view.ViewGroup;
import com.gamericefishpro.space.f2.l0;
import com.gamericefishpro.space.f2.m0;
import com.gamericefishpro.space.f2.n0;
import com.gamericefishpro.space.h2.f0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements l0 {
    public final /* synthetic */ z a;
    public final /* synthetic */ f0 b;

    public e(z zVar, f0 f0Var) {
        this.a = zVar;
        this.b = f0Var;
    }

    @Override // com.gamericefishpro.space.f2.l0
    public final m0 a(n0 n0Var, List list, long j) {
        z zVar = this.a;
        if (zVar.getChildCount() == 0) {
            return n0Var.y(com.gamericefishpro.space.c3.a.j(j), com.gamericefishpro.space.c3.a.i(j), com.gamericefishpro.space.ph.m0.c(), c.i);
        }
        if (com.gamericefishpro.space.c3.a.j(j) != 0) {
            zVar.getChildAt(0).setMinimumWidth(com.gamericefishpro.space.c3.a.j(j));
        }
        if (com.gamericefishpro.space.c3.a.i(j) != 0) {
            zVar.getChildAt(0).setMinimumHeight(com.gamericefishpro.space.c3.a.i(j));
        }
        int iJ = com.gamericefishpro.space.c3.a.j(j);
        int iH = com.gamericefishpro.space.c3.a.h(j);
        ViewGroup.LayoutParams layoutParams = zVar.getLayoutParams();
        Intrinsics.b(layoutParams);
        int iJ2 = j.j(zVar, iJ, iH, layoutParams.width);
        int i = com.gamericefishpro.space.c3.a.i(j);
        int iG = com.gamericefishpro.space.c3.a.g(j);
        ViewGroup.LayoutParams layoutParams2 = zVar.getLayoutParams();
        Intrinsics.b(layoutParams2);
        zVar.measure(iJ2, j.j(zVar, i, iG, layoutParams2.height));
        return n0Var.y(zVar.getMeasuredWidth(), zVar.getMeasuredHeight(), com.gamericefishpro.space.ph.m0.c(), new d(zVar, this.b, 1));
    }

    @Override // com.gamericefishpro.space.f2.l0
    public final int c(com.gamericefishpro.space.f2.p pVar, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        z zVar = this.a;
        ViewGroup.LayoutParams layoutParams = zVar.getLayoutParams();
        Intrinsics.b(layoutParams);
        zVar.measure(iMakeMeasureSpec, j.j(zVar, 0, i, layoutParams.height));
        return zVar.getMeasuredWidth();
    }

    @Override // com.gamericefishpro.space.f2.l0
    public final int d(com.gamericefishpro.space.f2.p pVar, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        z zVar = this.a;
        ViewGroup.LayoutParams layoutParams = zVar.getLayoutParams();
        Intrinsics.b(layoutParams);
        zVar.measure(iMakeMeasureSpec, j.j(zVar, 0, i, layoutParams.height));
        return zVar.getMeasuredWidth();
    }

    @Override // com.gamericefishpro.space.f2.l0
    public final int e(com.gamericefishpro.space.f2.p pVar, List list, int i) {
        z zVar = this.a;
        ViewGroup.LayoutParams layoutParams = zVar.getLayoutParams();
        Intrinsics.b(layoutParams);
        zVar.measure(j.j(zVar, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return zVar.getMeasuredHeight();
    }

    @Override // com.gamericefishpro.space.f2.l0
    public final int i(com.gamericefishpro.space.f2.p pVar, List list, int i) {
        z zVar = this.a;
        ViewGroup.LayoutParams layoutParams = zVar.getLayoutParams();
        Intrinsics.b(layoutParams);
        zVar.measure(j.j(zVar, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return zVar.getMeasuredHeight();
    }
}
