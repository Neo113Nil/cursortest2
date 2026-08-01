package m3;

import B.b;
import O.X;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.k;
import java.util.WeakHashMap;

/* renamed from: m3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4732a extends b {

    /* renamed from: a, reason: collision with root package name */
    public k f39303a;

    @Override // B.b
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.f39303a == null) {
            this.f39303a = new k(view);
        }
        k kVar = this.f39303a;
        View view2 = kVar.f35968n;
        kVar.f35969u = view2.getTop();
        kVar.f35970v = view2.getLeft();
        k kVar2 = this.f39303a;
        View view3 = kVar2.f35968n;
        int top = 0 - (view3.getTop() - kVar2.f35969u);
        WeakHashMap weakHashMap = X.f2054a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - kVar2.f35970v));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(i, view);
    }
}
