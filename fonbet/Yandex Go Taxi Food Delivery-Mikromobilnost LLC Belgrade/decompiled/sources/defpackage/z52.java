package defpackage;

import android.view.View;
import android.widget.OverScroller;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.b;
import androidx.work.impl.d;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.yandex.plus.home.feature.webviews.internal.container.modal.ModalViewBehavior;
import com.yandex.plus.home.feature.webviews.internal.container.modal.a;
import com.ybsdk.core.design.coordinator.AnchorBottomSheetBehavior;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes11.dex */
public final class z52 implements Runnable {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public final Object w;
    public final Object x;

    public z52(r6f0 r6f0Var, h2u0 h2u0Var, boolean z, int i) {
        this.a = 3;
        this.w = r6f0Var;
        this.x = h2u0Var;
        this.c = z;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d b;
        switch (this.a) {
            case 0:
                int i = this.b;
                AnchorBottomSheetBehavior anchorBottomSheetBehavior = (AnchorBottomSheetBehavior) this.x;
                anchorBottomSheetBehavior.I(i, (View) this.w, this.c);
                if (anchorBottomSheetBehavior.Q == this) {
                    anchorBottomSheetBehavior.Q = null;
                    return;
                }
                return;
            case 1:
                ((ActionMenuView) this.w).setTranslationX(((BottomAppBar) this.x).getActionMenuViewTranslationX(r0, this.b, this.c));
                return;
            case 2:
                ModalViewBehavior modalViewBehavior = (ModalViewBehavior) this.x;
                a aVar = modalViewBehavior.Z;
                if (aVar != null) {
                    OverScroller overScroller = aVar.q;
                    if (aVar.b == 2) {
                        boolean computeScrollOffset = overScroller.computeScrollOffset();
                        int currX = overScroller.getCurrX();
                        int currY = overScroller.getCurrY();
                        int left = currX - aVar.s.getLeft();
                        int top = currY - aVar.s.getTop();
                        if (left != 0) {
                            View view = aVar.s;
                            WeakHashMap weakHashMap = b.a;
                            view.offsetLeftAndRight(left);
                        }
                        if (top != 0) {
                            View view2 = aVar.s;
                            WeakHashMap weakHashMap2 = b.a;
                            view2.offsetTopAndBottom(top);
                        }
                        if (left != 0 || top != 0) {
                            aVar.r.e(currY);
                        }
                        if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                            overScroller.abortAnimation();
                            computeScrollOffset = false;
                        }
                        if (!computeScrollOffset) {
                            aVar.u.post(aVar.v);
                        }
                    }
                    if (aVar.b == 2) {
                        View view3 = (View) this.w;
                        WeakHashMap weakHashMap3 = b.a;
                        view3.postOnAnimation(this);
                        this.c = false;
                        return;
                    }
                }
                modalViewBehavior.D(this.b);
                this.c = false;
                return;
            default:
                boolean z = this.c;
                r6f0 r6f0Var = (r6f0) this.w;
                h2u0 h2u0Var = (h2u0) this.x;
                if (z) {
                    int i2 = this.b;
                    r6f0Var.getClass();
                    String str = h2u0Var.a.a;
                    synchronized (r6f0Var.k) {
                        b = r6f0Var.b(str);
                    }
                    r6f0.d(b, i2);
                } else {
                    int i3 = this.b;
                    r6f0Var.getClass();
                    String str2 = h2u0Var.a.a;
                    synchronized (r6f0Var.k) {
                        try {
                            if (r6f0Var.f.get(str2) != null) {
                                hgz.g().getClass();
                            } else {
                                Set set = (Set) r6f0Var.h.get(str2);
                                if (set != null && set.contains(h2u0Var)) {
                                    r6f0.d(r6f0Var.b(str2), i3);
                                }
                            }
                        } finally {
                        }
                    }
                }
                hgz g = hgz.g();
                hgz.o("StopWorkRunnable");
                String str3 = ((h2u0) this.x).a.a;
                g.getClass();
                return;
        }
    }

    public /* synthetic */ z52(Object obj, View view, int i, boolean z, int i2) {
        this.a = i2;
        this.x = obj;
        this.w = view;
        this.b = i;
        this.c = z;
    }

    public z52(ModalViewBehavior modalViewBehavior, View view, int i) {
        this.a = 2;
        this.x = modalViewBehavior;
        this.w = view;
        this.b = i;
    }
}
