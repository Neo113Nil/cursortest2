package defpackage;

import android.view.View;

/* loaded from: classes3.dex */
public final class u0a implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u0a(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                view.getClass();
                ((vd) this.b).invoke();
                break;
            default:
                ((gc8) this.b).removeOnAttachStateChangeListener(this);
                gc8 gc8Var = (gc8) this.c;
                dzf E = swf.E(gc8Var);
                if (E != null) {
                    ((stn) this.d).a(E, gc8Var);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                view.getClass();
                ((t0a) this.c).invoke();
                ((View) this.d).removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void c(View view) {
    }
}
