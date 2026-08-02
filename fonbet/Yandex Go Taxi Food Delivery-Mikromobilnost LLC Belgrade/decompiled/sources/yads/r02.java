package yads;

import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.kgx;
import defpackage.o781;
import defpackage.qha1;
import defpackage.r581;

/* loaded from: classes7.dex */
public final class r02 implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final /* synthetic */ kgx[] d = {qha1.a(r02.class, "viewReference", "getViewReference()Landroid/view/View;")};
    public final o781 a;
    public final r581 b;
    public Integer c;

    public r02(View view, o781 o781Var) {
        this.a = o781Var;
        this.b = new r581(view);
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        r581 r581Var = this.b;
        kgx kgxVar = d[0];
        View view = (View) r581Var.a.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        r581 r581Var = this.b;
        kgx kgxVar = d[0];
        View view = (View) r581Var.a.get();
        if (view != null) {
            int visibility = view.getVisibility();
            Integer num = this.c;
            if (num != null && visibility == num.intValue()) {
                return;
            }
            this.c = Integer.valueOf(visibility);
            o781 o781Var = this.a;
            if (visibility == 0) {
                o781Var.a.m();
            } else {
                o781Var.a.n();
            }
        }
    }
}
