package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.sh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC3912sh implements View.OnAttachStateChangeListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4180xf f34257n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2588Hh f34258u;

    public ViewOnAttachStateChangeListenerC3912sh(C2588Hh c2588Hh, InterfaceC4180xf interfaceC4180xf) {
        this.f34257n = interfaceC4180xf;
        this.f34258u = c2588Hh;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f34258u.o(view, this.f34257n, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
