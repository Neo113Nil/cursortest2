package com.bumptech.glide.manager;

import S0.s;
import androidx.lifecycle.AbstractC0498p;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC0498p f23454n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ s f23455u;

    public i(s sVar, AbstractC0498p abstractC0498p) {
        this.f23455u = sVar;
        this.f23454n = abstractC0498p;
    }

    @Override // com.bumptech.glide.manager.h
    public final void onDestroy() {
        ((HashMap) this.f23455u.f2840u).remove(this.f23454n);
    }

    @Override // com.bumptech.glide.manager.h
    public final void onStart() {
    }

    @Override // com.bumptech.glide.manager.h
    public final void onStop() {
    }
}
