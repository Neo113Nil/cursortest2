package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class i46 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View a;
    public final fp5 b;
    public ViewTreeObserver c;
    public final Boolean d;
    public final Function0 e;
    public final Function0 f;

    public i46(View view, Boolean bool, Function0 function0) {
        wg wgVar = wg.l;
        fp5 fp5Var = new fp5(5);
        view.getClass();
        this.a = view;
        this.b = fp5Var;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        viewTreeObserver.getClass();
        this.c = viewTreeObserver;
        this.d = bool;
        this.e = function0;
        this.f = wgVar;
    }

    public final void c() {
        boolean isAlive = this.c.isAlive();
        View view = this.a;
        fp5 fp5Var = this.b;
        if (isAlive) {
            fp5Var.invoke(this.c, this);
        } else {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            viewTreeObserver.getClass();
            fp5Var.invoke(viewTreeObserver, this);
        }
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        c();
        this.e.invoke();
        Boolean bool = this.d;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean bool2 = (Boolean) this.f.invoke();
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        viewTreeObserver.getClass();
        this.c = viewTreeObserver;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
        c();
    }
}
