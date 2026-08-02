package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;

/* loaded from: classes.dex */
public final class p6r implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ q6r a;
    public final /* synthetic */ hn5 b;

    public p6r(q6r q6rVar, hn5 hn5Var) {
        this.a = q6rVar;
        this.b = hn5Var;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        if (view2 instanceof SplashScreenView) {
            WindowInsets build = new WindowInsets.Builder().build();
            build.getClass();
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            this.a.g = (build == ((SplashScreenView) view2).getRootView().computeSystemWindowInsets(build, rect) && rect.isEmpty()) ? false : true;
            View decorView = this.b.getWindow().getDecorView();
            decorView.getClass();
            ((ViewGroup) decorView).setOnHierarchyChangeListener(null);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
    }
}
