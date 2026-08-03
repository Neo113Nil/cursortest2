package y1;

import android.view.View;
import m0.d2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class u1 implements View.OnAttachStateChangeListener {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ View f8653g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d2 f8654h;

    public u1(View view, d2 d2Var) {
        this.f8653g = view;
        this.f8654h = d2Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f8653g.removeOnAttachStateChangeListener(this);
        this.f8654h.s();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
