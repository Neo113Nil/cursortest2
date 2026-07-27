package androidx.fragment.app;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.AbstractC0498p;
import androidx.lifecycle.InterfaceC0503v;
import h.AbstractActivityC4551k;
import x0.C5181c;
import x0.InterfaceC5183e;

/* renamed from: androidx.fragment.app.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0479w extends S0.f implements androidx.lifecycle.Y, InterfaceC0503v, InterfaceC5183e, T {

    /* renamed from: n, reason: collision with root package name */
    public final AbstractActivityC0480x f5075n;

    /* renamed from: u, reason: collision with root package name */
    public final AbstractActivityC0480x f5076u;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f5077v;

    /* renamed from: w, reason: collision with root package name */
    public final O f5078w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4551k f5079x;

    public C0479w(AbstractActivityC4551k abstractActivityC4551k) {
        this.f5079x = abstractActivityC4551k;
        Handler handler = new Handler();
        this.f5078w = new O();
        this.f5075n = abstractActivityC4551k;
        this.f5076u = abstractActivityC4551k;
        this.f5077v = handler;
    }

    @Override // androidx.fragment.app.T
    public final void a(AbstractComponentCallbacksC0475s abstractComponentCallbacksC0475s) {
        this.f5079x.onAttachFragment(abstractComponentCallbacksC0475s);
    }

    @Override // androidx.lifecycle.InterfaceC0503v
    public final AbstractC0498p getLifecycle() {
        return this.f5079x.mFragmentLifecycleRegistry;
    }

    @Override // x0.InterfaceC5183e
    public final C5181c getSavedStateRegistry() {
        return this.f5079x.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.Y
    public final androidx.lifecycle.X getViewModelStore() {
        return this.f5079x.getViewModelStore();
    }

    @Override // S0.f
    public final View o(int i) {
        return this.f5079x.findViewById(i);
    }

    @Override // S0.f
    public final boolean r() {
        Window window = this.f5079x.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }
}
