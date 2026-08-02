package com.bumptech.glide.manager;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.internal.ads.LD;

/* loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnDrawListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ View f24237n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f24238u;

    public d(e eVar, View view) {
        this.f24238u = eVar;
        this.f24237n = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        P1.p.f().post(new LD(this, this, 29, false));
    }
}
