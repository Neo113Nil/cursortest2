package com.gamericefishpro.space.u9;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.gamericefishpro.space.d4.l0;
import com.gamericefishpro.space.n3.g;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends com.gamericefishpro.space.p3.a {
    public g a;

    @Override // com.gamericefishpro.space.p3.a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new g(view);
        }
        g gVar = this.a;
        View view2 = (View) gVar.i;
        gVar.d = view2.getTop();
        gVar.e = view2.getLeft();
        g gVar2 = this.a;
        View view3 = (View) gVar2.i;
        int top = 0 - (view3.getTop() - gVar2.d);
        Field field = l0.a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - gVar2.e));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
