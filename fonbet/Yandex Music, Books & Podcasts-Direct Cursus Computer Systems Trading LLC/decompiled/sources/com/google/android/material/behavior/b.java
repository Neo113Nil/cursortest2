package com.google.android.material.behavior;

import android.view.View;
import defpackage.bnd;
import defpackage.ic;
import defpackage.wdu;
import defpackage.zur;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class b implements ic {
    public final /* synthetic */ SwipeDismissBehavior a;

    public b(SwipeDismissBehavior swipeDismissBehavior) {
        this.a = swipeDismissBehavior;
    }

    @Override // defpackage.ic
    public final boolean r(View view) {
        SwipeDismissBehavior swipeDismissBehavior = this.a;
        if (!swipeDismissBehavior.canSwipeDismissView(view)) {
            return false;
        }
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.swipeDirection;
        int width = (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = wdu.a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        zur zurVar = swipeDismissBehavior.listener;
        if (zurVar != null) {
            ((bnd) zurVar).r(view);
        }
        return true;
    }
}
