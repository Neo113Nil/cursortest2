package defpackage;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import defpackage.pdi0;
import defpackage.su31;
import defpackage.xis0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public interface su31 extends qjs0 {
    static okj f(int i, int i2, int i3) {
        if (i == -2) {
            return mkj.a;
        }
        int i4 = i - i3;
        if (i4 > 0) {
            cvw.a(i4);
            return new kkj(i4);
        }
        int i5 = i2 - i3;
        if (i5 <= 0) {
            return null;
        }
        cvw.a(i5);
        return new kkj(i5);
    }

    @Override // defpackage.qjs0
    default Object a(Continuation continuation) {
        xis0 size = getSize();
        if (size != null) {
            return size;
        }
        final j18 j18Var = new j18(1, dvw.b(continuation));
        j18Var.u();
        final ViewTreeObserver viewTreeObserver = ((pdi0) this).b().getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: coil3.size.ViewSizeResolver$size$3$preDrawListener$1
            private boolean isResumed;

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                xis0 size2 = su31.this.getSize();
                if (size2 != null) {
                    su31 su31Var = su31.this;
                    ViewTreeObserver viewTreeObserver2 = viewTreeObserver;
                    su31Var.getClass();
                    if (viewTreeObserver2.isAlive()) {
                        viewTreeObserver2.removeOnPreDrawListener(this);
                    } else {
                        ((pdi0) su31Var).b().getViewTreeObserver().removeOnPreDrawListener(this);
                    }
                    if (!this.isResumed) {
                        this.isResumed = true;
                        j18Var.resumeWith(size2);
                    }
                }
                return true;
            }
        };
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        j18Var.w(new ze5(2, this, viewTreeObserver, onPreDrawListener));
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }

    default xis0 getSize() {
        pdi0 pdi0Var = (pdi0) this;
        ViewGroup.LayoutParams layoutParams = pdi0Var.b().getLayoutParams();
        okj f = f(layoutParams != null ? layoutParams.width : -1, pdi0Var.b().getWidth(), pdi0Var.b().getPaddingRight() + pdi0Var.b().getPaddingLeft());
        if (f == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = pdi0Var.b().getLayoutParams();
        okj f2 = f(layoutParams2 != null ? layoutParams2.height : -1, pdi0Var.b().getHeight(), pdi0Var.b().getPaddingBottom() + pdi0Var.b().getPaddingTop());
        if (f2 == null) {
            return null;
        }
        return new xis0(f, f2);
    }
}
