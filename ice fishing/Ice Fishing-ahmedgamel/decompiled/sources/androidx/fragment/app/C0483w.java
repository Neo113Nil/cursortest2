package androidx.fragment.app;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.AbstractC0502p;
import androidx.lifecycle.InterfaceC0507v;
import h.AbstractActivityC4555k;
import x0.C5180c;
import x0.InterfaceC5182e;

/* renamed from: androidx.fragment.app.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0483w extends X2.a implements androidx.lifecycle.Y, InterfaceC0507v, InterfaceC5182e, T {

    /* renamed from: A, reason: collision with root package name */
    public final AbstractActivityC0484x f5042A;

    /* renamed from: B, reason: collision with root package name */
    public final Handler f5043B;

    /* renamed from: C, reason: collision with root package name */
    public final O f5044C;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4555k f5045D;

    /* renamed from: z, reason: collision with root package name */
    public final AbstractActivityC0484x f5046z;

    public C0483w(AbstractActivityC4555k abstractActivityC4555k) {
        this.f5045D = abstractActivityC4555k;
        Handler handler = new Handler();
        this.f5044C = new O();
        this.f5046z = abstractActivityC4555k;
        this.f5042A = abstractActivityC4555k;
        this.f5043B = handler;
    }

    @Override // androidx.fragment.app.T
    public final void a(AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s) {
        this.f5045D.onAttachFragment(abstractComponentCallbacksC0479s);
    }

    @Override // androidx.lifecycle.InterfaceC0507v
    public final AbstractC0502p getLifecycle() {
        return this.f5045D.mFragmentLifecycleRegistry;
    }

    @Override // x0.InterfaceC5182e
    public final C5180c getSavedStateRegistry() {
        return this.f5045D.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.Y
    public final androidx.lifecycle.X getViewModelStore() {
        return this.f5045D.getViewModelStore();
    }

    @Override // X2.a
    public final View n(int i) {
        return this.f5045D.findViewById(i);
    }

    @Override // X2.a
    public final boolean o() {
        Window window = this.f5045D.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }
}
