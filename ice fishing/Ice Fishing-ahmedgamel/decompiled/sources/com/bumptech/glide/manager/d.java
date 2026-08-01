package com.bumptech.glide.manager;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.internal.ads.LD;

/* loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnDrawListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ View f23450n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f23451u;

    public d(e eVar, View view) {
        this.f23451u = eVar;
        this.f23450n = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        N1.p.f().post(new LD(this, this, 29, false));
    }
}
