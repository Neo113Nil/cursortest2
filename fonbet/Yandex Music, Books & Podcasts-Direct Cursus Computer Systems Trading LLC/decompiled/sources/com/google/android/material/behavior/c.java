package com.google.android.material.behavior;

import android.view.View;
import defpackage.bnd;
import defpackage.heu;
import defpackage.zur;

/* loaded from: classes3.dex */
public final class c implements Runnable {
    public final View a;
    public final boolean b;
    public final /* synthetic */ SwipeDismissBehavior c;

    public c(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.c = swipeDismissBehavior;
        this.a = view;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zur zurVar;
        SwipeDismissBehavior swipeDismissBehavior = this.c;
        heu heuVar = swipeDismissBehavior.viewDragHelper;
        View view = this.a;
        if (heuVar != null && heuVar.g()) {
            view.postOnAnimation(this);
        } else {
            if (!this.b || (zurVar = swipeDismissBehavior.listener) == null) {
                return;
            }
            ((bnd) zurVar).r(view);
        }
    }
}
