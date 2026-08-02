package defpackage;

import android.view.View;
import android.view.ViewGroup;
import defpackage.xg;
import defpackage.yu31;
import ru.yandex.taxi.widget.InsetsAwareFrameLayout;

/* loaded from: classes6.dex */
public final class yu31 {
    public final xg a;
    public final InsetsAwareFrameLayout b;
    public final ViewGroup c;
    public int d;

    public yu31(xg xgVar, InsetsAwareFrameLayout insetsAwareFrameLayout, ViewGroup viewGroup) {
        this.a = xgVar;
        this.b = insetsAwareFrameLayout;
        this.c = viewGroup;
    }

    public final void a() {
        InsetsAwareFrameLayout insetsAwareFrameLayout = this.b;
        if (!insetsAwareFrameLayout.isAttachedToWindow()) {
            insetsAwareFrameLayout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.transition.ViewStackController$AccessibilityBlocker$createOnAttachBlockingListener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View v) {
                    yu31 yu31Var = yu31.this;
                    xg.b(yu31Var.a, yu31Var.b, yu31Var.c, 4);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View v) {
                }
            });
        } else {
            xg.b(this.a, insetsAwareFrameLayout, this.c, 4);
        }
    }
}
