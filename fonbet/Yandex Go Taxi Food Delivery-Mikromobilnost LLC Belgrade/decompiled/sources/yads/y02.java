package yads;

import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.kgx;
import defpackage.o781;
import defpackage.qha1;
import defpackage.r581;

/* loaded from: classes7.dex */
public final class y02 implements View.OnAttachStateChangeListener {
    public static final /* synthetic */ kgx[] d = {qha1.a(y02.class, "viewReference", "getViewReference()Landroid/view/View;")};
    public final o781 a;
    public r02 b;
    public final r581 c;

    public y02(View view, o781 o781Var) {
        this.a = o781Var;
        this.c = new r581(view);
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        r581 r581Var = this.c;
        kgx[] kgxVarArr = d;
        kgx kgxVar = kgxVarArr[0];
        View view = (View) r581Var.a.get();
        if (view != null) {
            view.addOnAttachStateChangeListener(this);
        }
        r581 r581Var2 = this.c;
        kgx kgxVar2 = kgxVarArr[0];
        View view2 = (View) r581Var2.a.get();
        if (view2 != null && view2.isAttachedToWindow()) {
            r02 r02Var = new r02(view2, this.a);
            this.b = r02Var;
            r581 r581Var3 = r02Var.b;
            kgx kgxVar3 = r02.d[0];
            View view3 = (View) r581Var3.a.get();
            if (view3 == null || (viewTreeObserver = view3.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnGlobalLayoutListener(r02Var);
        }
    }

    public final void b() {
        r02 r02Var = this.b;
        if (r02Var != null) {
            r02Var.a();
        }
        this.b = null;
        r581 r581Var = this.c;
        kgx kgxVar = d[0];
        View view = (View) r581Var.a.get();
        if (view != null) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ViewTreeObserver viewTreeObserver;
        this.a.a.m();
        r581 r581Var = this.c;
        kgx kgxVar = d[0];
        View view2 = (View) r581Var.a.get();
        if (view2 != null && view2.isAttachedToWindow()) {
            r02 r02Var = new r02(view2, this.a);
            this.b = r02Var;
            r581 r581Var2 = r02Var.b;
            kgx kgxVar2 = r02.d[0];
            View view3 = (View) r581Var2.a.get();
            if (view3 == null || (viewTreeObserver = view3.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnGlobalLayoutListener(r02Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        r02 r02Var = this.b;
        if (r02Var != null) {
            r02Var.a();
        }
        this.b = null;
        this.a.a.n();
    }
}
