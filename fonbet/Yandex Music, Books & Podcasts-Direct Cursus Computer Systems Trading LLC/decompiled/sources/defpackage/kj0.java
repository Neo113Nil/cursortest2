package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: classes.dex */
public final class kj0 implements kfh {
    public final /* synthetic */ oj0 a;
    public final /* synthetic */ mpf b;

    public kj0(oj0 oj0Var, mpf mpfVar) {
        this.a = oj0Var;
        this.b = mpfVar;
    }

    @Override // defpackage.kfh
    public final int a(fxe fxeVar, List list, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        oj0 oj0Var = this.a;
        ViewGroup.LayoutParams layoutParams = oj0Var.getLayoutParams();
        layoutParams.getClass();
        oj0Var.measure(makeMeasureSpec, oj0.i(oj0Var, 0, i, layoutParams.height));
        return oj0Var.getMeasuredWidth();
    }

    @Override // defpackage.kfh
    public final lfh b(mfh mfhVar, List list, long j) {
        oj0 oj0Var = this.a;
        if (oj0Var.getChildCount() == 0) {
            return mfh.m0(mfhVar, ga6.k(j), ga6.j(j), d5.J);
        }
        if (ga6.k(j) != 0) {
            oj0Var.getChildAt(0).setMinimumWidth(ga6.k(j));
        }
        if (ga6.j(j) != 0) {
            oj0Var.getChildAt(0).setMinimumHeight(ga6.j(j));
        }
        int k = ga6.k(j);
        int i = ga6.i(j);
        ViewGroup.LayoutParams layoutParams = oj0Var.getLayoutParams();
        layoutParams.getClass();
        int i2 = oj0.i(oj0Var, k, i, layoutParams.width);
        int j2 = ga6.j(j);
        int h = ga6.h(j);
        ViewGroup.LayoutParams layoutParams2 = oj0Var.getLayoutParams();
        layoutParams2.getClass();
        oj0Var.measure(i2, oj0.i(oj0Var, j2, h, layoutParams2.height));
        return mfh.m0(mfhVar, oj0Var.getMeasuredWidth(), oj0Var.getMeasuredHeight(), new ij0(oj0Var, this.b, 1));
    }

    @Override // defpackage.kfh
    public final int c(fxe fxeVar, List list, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        oj0 oj0Var = this.a;
        ViewGroup.LayoutParams layoutParams = oj0Var.getLayoutParams();
        layoutParams.getClass();
        oj0Var.measure(makeMeasureSpec, oj0.i(oj0Var, 0, i, layoutParams.height));
        return oj0Var.getMeasuredWidth();
    }

    @Override // defpackage.kfh
    public final int d(fxe fxeVar, List list, int i) {
        oj0 oj0Var = this.a;
        ViewGroup.LayoutParams layoutParams = oj0Var.getLayoutParams();
        layoutParams.getClass();
        oj0Var.measure(oj0.i(oj0Var, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return oj0Var.getMeasuredHeight();
    }

    @Override // defpackage.kfh
    public final int e(fxe fxeVar, List list, int i) {
        oj0 oj0Var = this.a;
        ViewGroup.LayoutParams layoutParams = oj0Var.getLayoutParams();
        layoutParams.getClass();
        oj0Var.measure(oj0.i(oj0Var, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return oj0Var.getMeasuredHeight();
    }
}
