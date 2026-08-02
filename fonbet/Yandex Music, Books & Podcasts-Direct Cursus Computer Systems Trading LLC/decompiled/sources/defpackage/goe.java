package defpackage;

import android.view.View;

/* loaded from: classes4.dex */
public final class goe implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                view.getClass();
                view.removeOnAttachStateChangeListener(this);
                view.requestApplyInsets();
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                view.requestApplyInsets();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                view.getClass();
                break;
        }
    }

    private final void c(View view) {
    }
}
