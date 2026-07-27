package com.bumptech.glide.manager;

import B2.RunnableC0272f;
import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnDrawListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ View f23606n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f23607u;

    public d(e eVar, View view) {
        this.f23607u = eVar;
        this.f23606n = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        N1.p.f().post(new RunnableC0272f(this, this, 24, false));
    }
}
