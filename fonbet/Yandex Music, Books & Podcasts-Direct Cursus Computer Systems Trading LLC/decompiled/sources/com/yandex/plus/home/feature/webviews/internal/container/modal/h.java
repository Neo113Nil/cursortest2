package com.yandex.plus.home.feature.webviews.internal.container.modal;

import android.view.View;
import android.widget.OverScroller;
import defpackage.wdu;
import java.util.WeakHashMap;

/* loaded from: classes5.dex */
public final class h implements Runnable {
    public final View a;
    public boolean b;
    public int c;
    public final /* synthetic */ ModalViewBehavior d;

    public h(ModalViewBehavior modalViewBehavior, View view, int i) {
        this.d = modalViewBehavior;
        this.a = view;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ModalViewBehavior modalViewBehavior = this.d;
        k kVar = modalViewBehavior.viewDragHelper;
        if (kVar != null) {
            OverScroller overScroller = kVar.q;
            if (kVar.b == 2) {
                boolean computeScrollOffset = overScroller.computeScrollOffset();
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int left = currX - kVar.s.getLeft();
                int top = currY - kVar.s.getTop();
                if (left != 0) {
                    View view = kVar.s;
                    WeakHashMap weakHashMap = wdu.a;
                    view.offsetLeftAndRight(left);
                }
                if (top != 0) {
                    View view2 = kVar.s;
                    WeakHashMap weakHashMap2 = wdu.a;
                    view2.offsetTopAndBottom(top);
                }
                if (left != 0 || top != 0) {
                    ((c) kVar.r).a.dispatchOnSlide(currY);
                }
                if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                    overScroller.abortAnimation();
                    computeScrollOffset = false;
                }
                if (!computeScrollOffset) {
                    kVar.u.post(kVar.v);
                }
            }
            if (kVar.b == 2) {
                WeakHashMap weakHashMap3 = wdu.a;
                this.a.postOnAnimation(this);
                this.b = false;
            }
        }
        modalViewBehavior.setStateInternal(this.c);
        this.b = false;
    }
}
