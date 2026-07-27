package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class A implements View.OnAttachStateChangeListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V f4926n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ B f4927u;

    public A(B b9, V v6) {
        this.f4927u = b9;
        this.f4926n = v6;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        V v6 = this.f4926n;
        v6.k();
        C0477j.f((ViewGroup) v6.f5019c.f5162X.getParent(), this.f4927u.f4928n).e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
