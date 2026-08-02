package o3;

import B.b;
import O.X;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.k;
import java.util.WeakHashMap;

/* renamed from: o3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4803a extends b {

    /* renamed from: a, reason: collision with root package name */
    public k f39744a;

    @Override // B.b
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.f39744a == null) {
            this.f39744a = new k(view);
        }
        k kVar = this.f39744a;
        View view2 = kVar.f36736n;
        kVar.f36737u = view2.getTop();
        kVar.f36738v = view2.getLeft();
        k kVar2 = this.f39744a;
        View view3 = kVar2.f36736n;
        int top = 0 - (view3.getTop() - kVar2.f36737u);
        WeakHashMap weakHashMap = X.f2142a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - kVar2.f36738v));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(i, view);
    }
}
