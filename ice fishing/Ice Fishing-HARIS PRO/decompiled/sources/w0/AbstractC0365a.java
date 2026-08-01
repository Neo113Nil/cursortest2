package w0;

import B.c;
import O.K;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.j;
import java.util.WeakHashMap;

/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0365a extends c {

    /* renamed from: a, reason: collision with root package name */
    public j f4661a;

    @Override // B.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        v(coordinatorLayout, view, i);
        if (this.f4661a == null) {
            this.f4661a = new j(view);
        }
        j jVar = this.f4661a;
        View view2 = (View) jVar.f2525a;
        jVar.f2526b = view2.getTop();
        jVar.f2527c = view2.getLeft();
        j jVar2 = this.f4661a;
        View view3 = (View) jVar2.f2525a;
        int top = 0 - (view3.getTop() - jVar2.f2526b);
        WeakHashMap weakHashMap = K.f747a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - jVar2.f2527c));
        return true;
    }

    public void v(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
